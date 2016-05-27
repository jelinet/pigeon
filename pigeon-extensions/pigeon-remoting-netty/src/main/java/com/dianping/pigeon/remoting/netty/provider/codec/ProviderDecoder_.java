package com.dianping.pigeon.remoting.netty.provider.codec;

import com.dianping.pigeon.remoting.common.codec.SerializerFactory;
import com.dianping.pigeon.remoting.common.domain.InvocationRequest;
import com.dianping.pigeon.remoting.common.domain.InvocationResponse;
import com.dianping.pigeon.remoting.netty.codec.AbstractDecoder_;
import com.dianping.pigeon.remoting.netty.provider.NettyChannel;
import org.jboss.netty.channel.Channel;

import java.io.InputStream;

/**
 * @author qi.yin
 *         2016/05/10  下午7:25.
 */
public class ProviderDecoder_ extends AbstractDecoder_ {

    @Override
    public Object doInitMsg(Object message, Channel channel, long receiveTime) {
        if (message == null) {
            return null;
        }
        InvocationRequest request = (InvocationRequest) message;
        request.setCreateMillisTime(receiveTime);
        return request;
    }

    @Override
    public void doFailResponse(Channel channel, InvocationResponse response) {
        NettyChannel nettyChannel = new NettyChannel(channel);
        nettyChannel.write(response);
    }

    @Override
    public Object deserialize(byte serializerType, InputStream is) {
        Object decoded = SerializerFactory.getSerializer(serializerType).deserializeRequest(is);
        return decoded;
    }
}
