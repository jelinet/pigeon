/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.remoting.netty.invoker;

import static org.jboss.netty.channel.Channels.pipeline;

import com.dianping.pigeon.remoting.netty.invoker.codec.InvokerDecoder_;
import com.dianping.pigeon.remoting.netty.invoker.codec.InvokerEncoder_;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;


public class NettyClientPipelineFactory implements ChannelPipelineFactory {

	private NettyClient client;
	private ChannelHandler decoder;
	private ChannelHandler encoder;
	private ChannelHandler handler;

	public NettyClientPipelineFactory(NettyClient client) {
		this.client = client;
		this.decoder = new InvokerDecoder_();
		this.encoder = new InvokerEncoder_();
		this.handler = new NettyClientHandler(this.client);
	}

	public ChannelPipeline getPipeline() throws Exception {
		ChannelPipeline pipeline = pipeline();
		pipeline.addLast("decoder", decoder);
		pipeline.addLast("encoder", encoder);
		pipeline.addLast("handler", handler);
		return pipeline;
	}

}
