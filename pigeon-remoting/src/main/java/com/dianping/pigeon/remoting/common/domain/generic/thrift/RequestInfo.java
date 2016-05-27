/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dianping.pigeon.remoting.common.domain.generic.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-26")
public class RequestInfo implements org.apache.thrift.TBase<RequestInfo, RequestInfo._Fields>, java.io.Serializable, Cloneable, Comparable<RequestInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RequestInfo");

  private static final org.apache.thrift.protocol.TField SEQUENCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sequenceId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SERVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CALL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("callType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TIMEOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("timeout", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestInfoTupleSchemeFactory());
  }

  public long sequenceId; // required
  public String serviceName; // required
  public CallType callType; // required
  public int timeout; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEQUENCE_ID((short)1, "sequenceId"),
    SERVICE_NAME((short)2, "serviceName"),
    CALL_TYPE((short)3, "callType"),
    TIMEOUT((short)4, "timeout");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SEQUENCE_ID
          return SEQUENCE_ID;
        case 2: // SERVICE_NAME
          return SERVICE_NAME;
        case 3: // CALL_TYPE
          return CALL_TYPE;
        case 4: // TIMEOUT
          return TIMEOUT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SEQUENCEID_ISSET_ID = 0;
  private static final int __TIMEOUT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEQUENCE_ID, new org.apache.thrift.meta_data.FieldMetaData("sequenceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SERVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("serviceName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CALL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("callType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "CallType")));
    tmpMap.put(_Fields.TIMEOUT, new org.apache.thrift.meta_data.FieldMetaData("timeout", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RequestInfo.class, metaDataMap);
  }

  public RequestInfo() {
  }

  public RequestInfo(
    long sequenceId,
    String serviceName,
    CallType callType,
    int timeout)
  {
    this();
    this.sequenceId = sequenceId;
    setSequenceIdIsSet(true);
    this.serviceName = serviceName;
    this.callType = callType;
    this.timeout = timeout;
    setTimeoutIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RequestInfo(RequestInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sequenceId = other.sequenceId;
    if (other.isSetServiceName()) {
      this.serviceName = other.serviceName;
    }
    if (other.isSetCallType()) {
      this.callType = other.callType;
    }
    this.timeout = other.timeout;
  }

  public RequestInfo deepCopy() {
    return new RequestInfo(this);
  }

  @Override
  public void clear() {
    setSequenceIdIsSet(false);
    this.sequenceId = 0;
    this.serviceName = null;
    this.callType = null;
    setTimeoutIsSet(false);
    this.timeout = 0;
  }

  public long getSequenceId() {
    return this.sequenceId;
  }

  public RequestInfo setSequenceId(long sequenceId) {
    this.sequenceId = sequenceId;
    setSequenceIdIsSet(true);
    return this;
  }

  public void unsetSequenceId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQUENCEID_ISSET_ID);
  }

  /** Returns true if field sequenceId is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceId() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQUENCEID_ISSET_ID);
  }

  public void setSequenceIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQUENCEID_ISSET_ID, value);
  }

  public String getServiceName() {
    return this.serviceName;
  }

  public RequestInfo setServiceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  public void unsetServiceName() {
    this.serviceName = null;
  }

  /** Returns true if field serviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceName() {
    return this.serviceName != null;
  }

  public void setServiceNameIsSet(boolean value) {
    if (!value) {
      this.serviceName = null;
    }
  }

  public CallType getCallType() {
    return this.callType;
  }

  public RequestInfo setCallType(CallType callType) {
    this.callType = callType;
    return this;
  }

  public void unsetCallType() {
    this.callType = null;
  }

  /** Returns true if field callType is set (has been assigned a value) and false otherwise */
  public boolean isSetCallType() {
    return this.callType != null;
  }

  public void setCallTypeIsSet(boolean value) {
    if (!value) {
      this.callType = null;
    }
  }

  public int getTimeout() {
    return this.timeout;
  }

  public RequestInfo setTimeout(int timeout) {
    this.timeout = timeout;
    setTimeoutIsSet(true);
    return this;
  }

  public void unsetTimeout() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  /** Returns true if field timeout is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeout() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  public void setTimeoutIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMEOUT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SEQUENCE_ID:
      if (value == null) {
        unsetSequenceId();
      } else {
        setSequenceId((Long)value);
      }
      break;

    case SERVICE_NAME:
      if (value == null) {
        unsetServiceName();
      } else {
        setServiceName((String)value);
      }
      break;

    case CALL_TYPE:
      if (value == null) {
        unsetCallType();
      } else {
        setCallType((CallType)value);
      }
      break;

    case TIMEOUT:
      if (value == null) {
        unsetTimeout();
      } else {
        setTimeout((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SEQUENCE_ID:
      return getSequenceId();

    case SERVICE_NAME:
      return getServiceName();

    case CALL_TYPE:
      return getCallType();

    case TIMEOUT:
      return getTimeout();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SEQUENCE_ID:
      return isSetSequenceId();
    case SERVICE_NAME:
      return isSetServiceName();
    case CALL_TYPE:
      return isSetCallType();
    case TIMEOUT:
      return isSetTimeout();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RequestInfo)
      return this.equals((RequestInfo)that);
    return false;
  }

  public boolean equals(RequestInfo that) {
    if (that == null)
      return false;

    boolean this_present_sequenceId = true;
    boolean that_present_sequenceId = true;
    if (this_present_sequenceId || that_present_sequenceId) {
      if (!(this_present_sequenceId && that_present_sequenceId))
        return false;
      if (this.sequenceId != that.sequenceId)
        return false;
    }

    boolean this_present_serviceName = true && this.isSetServiceName();
    boolean that_present_serviceName = true && that.isSetServiceName();
    if (this_present_serviceName || that_present_serviceName) {
      if (!(this_present_serviceName && that_present_serviceName))
        return false;
      if (!this.serviceName.equals(that.serviceName))
        return false;
    }

    boolean this_present_callType = true && this.isSetCallType();
    boolean that_present_callType = true && that.isSetCallType();
    if (this_present_callType || that_present_callType) {
      if (!(this_present_callType && that_present_callType))
        return false;
      if (!this.callType.equals(that.callType))
        return false;
    }

    boolean this_present_timeout = true;
    boolean that_present_timeout = true;
    if (this_present_timeout || that_present_timeout) {
      if (!(this_present_timeout && that_present_timeout))
        return false;
      if (this.timeout != that.timeout)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_sequenceId = true;
    list.add(present_sequenceId);
    if (present_sequenceId)
      list.add(sequenceId);

    boolean present_serviceName = true && (isSetServiceName());
    list.add(present_serviceName);
    if (present_serviceName)
      list.add(serviceName);

    boolean present_callType = true && (isSetCallType());
    list.add(present_callType);
    if (present_callType)
      list.add(callType.getValue());

    boolean present_timeout = true;
    list.add(present_timeout);
    if (present_timeout)
      list.add(timeout);

    return list.hashCode();
  }

  @Override
  public int compareTo(RequestInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSequenceId()).compareTo(other.isSetSequenceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sequenceId, other.sequenceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServiceName()).compareTo(other.isSetServiceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceName, other.serviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCallType()).compareTo(other.isSetCallType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCallType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.callType, other.callType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeout()).compareTo(other.isSetTimeout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeout, other.timeout);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RequestInfo(");
    boolean first = true;

    sb.append("sequenceId:");
    sb.append(this.sequenceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("serviceName:");
    if (this.serviceName == null) {
      sb.append("null");
    } else {
      sb.append(this.serviceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("callType:");
    if (this.callType == null) {
      sb.append("null");
    } else {
      sb.append(this.callType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeout:");
    sb.append(this.timeout);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'sequenceId' because it's a primitive and you chose the non-beans generator.
    if (serviceName == null) {
      throw new TProtocolException("Required field 'serviceName' was not present! Struct: " + toString());
    }
    if (callType == null) {
      throw new TProtocolException("Required field 'callType' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'timeout' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RequestInfoStandardSchemeFactory implements SchemeFactory {
    public RequestInfoStandardScheme getScheme() {
      return new RequestInfoStandardScheme();
    }
  }

  private static class RequestInfoStandardScheme extends StandardScheme<RequestInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RequestInfo struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEQUENCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sequenceId = iprot.readI64();
              struct.setSequenceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serviceName = iprot.readString();
              struct.setServiceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CALL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.callType = CallType.findByValue(iprot.readI32());
              struct.setCallTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIMEOUT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timeout = iprot.readI32();
              struct.setTimeoutIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSequenceId()) {
        throw new TProtocolException("Required field 'sequenceId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTimeout()) {
        throw new TProtocolException("Required field 'timeout' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RequestInfo struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SEQUENCE_ID_FIELD_DESC);
      oprot.writeI64(struct.sequenceId);
      oprot.writeFieldEnd();
      if (struct.serviceName != null) {
        oprot.writeFieldBegin(SERVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.serviceName);
        oprot.writeFieldEnd();
      }
      if (struct.callType != null) {
        oprot.writeFieldBegin(CALL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.callType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMEOUT_FIELD_DESC);
      oprot.writeI32(struct.timeout);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestInfoTupleSchemeFactory implements SchemeFactory {
    public RequestInfoTupleScheme getScheme() {
      return new RequestInfoTupleScheme();
    }
  }

  private static class RequestInfoTupleScheme extends TupleScheme<RequestInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RequestInfo struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.sequenceId);
      oprot.writeString(struct.serviceName);
      oprot.writeI32(struct.callType.getValue());
      oprot.writeI32(struct.timeout);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RequestInfo struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.sequenceId = iprot.readI64();
      struct.setSequenceIdIsSet(true);
      struct.serviceName = iprot.readString();
      struct.setServiceNameIsSet(true);
      struct.callType = CallType.findByValue(iprot.readI32());
      struct.setCallTypeIsSet(true);
      struct.timeout = iprot.readI32();
      struct.setTimeoutIsSet(true);
    }
  }

}

