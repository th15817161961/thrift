/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.com.howell.api.req;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-07-12")
public class UserReq implements org.apache.thrift.TBase<UserReq, UserReq._Fields>, java.io.Serializable, Cloneable, Comparable<UserReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserReq");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_PASSWD_FIELD_DESC = new org.apache.thrift.protocol.TField("userPasswd", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("userIp", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_MAC_FIELD_DESC = new org.apache.thrift.protocol.TField("userMac", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField BASE_REQ_FIELD_DESC = new org.apache.thrift.protocol.TField("baseReq", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserReqTupleSchemeFactory();

  public java.lang.String userId; // required
  public java.lang.String userPasswd; // required
  public java.lang.String userIp; // required
  public java.lang.String userMac; // required
  public cn.com.howell.api.req.base.BaseReq baseReq; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    USER_PASSWD((short)2, "userPasswd"),
    USER_IP((short)3, "userIp"),
    USER_MAC((short)4, "userMac"),
    BASE_REQ((short)5, "baseReq");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_ID
          return USER_ID;
        case 2: // USER_PASSWD
          return USER_PASSWD;
        case 3: // USER_IP
          return USER_IP;
        case 4: // USER_MAC
          return USER_MAC;
        case 5: // BASE_REQ
          return BASE_REQ;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_PASSWD, new org.apache.thrift.meta_data.FieldMetaData("userPasswd", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_IP, new org.apache.thrift.meta_data.FieldMetaData("userIp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_MAC, new org.apache.thrift.meta_data.FieldMetaData("userMac", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BASE_REQ, new org.apache.thrift.meta_data.FieldMetaData("baseReq", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, cn.com.howell.api.req.base.BaseReq.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserReq.class, metaDataMap);
  }

  public UserReq() {
  }

  public UserReq(
    java.lang.String userId,
    java.lang.String userPasswd,
    java.lang.String userIp,
    java.lang.String userMac,
    cn.com.howell.api.req.base.BaseReq baseReq)
  {
    this();
    this.userId = userId;
    this.userPasswd = userPasswd;
    this.userIp = userIp;
    this.userMac = userMac;
    this.baseReq = baseReq;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserReq(UserReq other) {
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetUserPasswd()) {
      this.userPasswd = other.userPasswd;
    }
    if (other.isSetUserIp()) {
      this.userIp = other.userIp;
    }
    if (other.isSetUserMac()) {
      this.userMac = other.userMac;
    }
    if (other.isSetBaseReq()) {
      this.baseReq = new cn.com.howell.api.req.base.BaseReq(other.baseReq);
    }
  }

  public UserReq deepCopy() {
    return new UserReq(this);
  }

  @Override
  public void clear() {
    this.userId = null;
    this.userPasswd = null;
    this.userIp = null;
    this.userMac = null;
    this.baseReq = null;
  }

  public java.lang.String getUserId() {
    return this.userId;
  }

  public UserReq setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public java.lang.String getUserPasswd() {
    return this.userPasswd;
  }

  public UserReq setUserPasswd(java.lang.String userPasswd) {
    this.userPasswd = userPasswd;
    return this;
  }

  public void unsetUserPasswd() {
    this.userPasswd = null;
  }

  /** Returns true if field userPasswd is set (has been assigned a value) and false otherwise */
  public boolean isSetUserPasswd() {
    return this.userPasswd != null;
  }

  public void setUserPasswdIsSet(boolean value) {
    if (!value) {
      this.userPasswd = null;
    }
  }

  public java.lang.String getUserIp() {
    return this.userIp;
  }

  public UserReq setUserIp(java.lang.String userIp) {
    this.userIp = userIp;
    return this;
  }

  public void unsetUserIp() {
    this.userIp = null;
  }

  /** Returns true if field userIp is set (has been assigned a value) and false otherwise */
  public boolean isSetUserIp() {
    return this.userIp != null;
  }

  public void setUserIpIsSet(boolean value) {
    if (!value) {
      this.userIp = null;
    }
  }

  public java.lang.String getUserMac() {
    return this.userMac;
  }

  public UserReq setUserMac(java.lang.String userMac) {
    this.userMac = userMac;
    return this;
  }

  public void unsetUserMac() {
    this.userMac = null;
  }

  /** Returns true if field userMac is set (has been assigned a value) and false otherwise */
  public boolean isSetUserMac() {
    return this.userMac != null;
  }

  public void setUserMacIsSet(boolean value) {
    if (!value) {
      this.userMac = null;
    }
  }

  public cn.com.howell.api.req.base.BaseReq getBaseReq() {
    return this.baseReq;
  }

  public UserReq setBaseReq(cn.com.howell.api.req.base.BaseReq baseReq) {
    this.baseReq = baseReq;
    return this;
  }

  public void unsetBaseReq() {
    this.baseReq = null;
  }

  /** Returns true if field baseReq is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseReq() {
    return this.baseReq != null;
  }

  public void setBaseReqIsSet(boolean value) {
    if (!value) {
      this.baseReq = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.String)value);
      }
      break;

    case USER_PASSWD:
      if (value == null) {
        unsetUserPasswd();
      } else {
        setUserPasswd((java.lang.String)value);
      }
      break;

    case USER_IP:
      if (value == null) {
        unsetUserIp();
      } else {
        setUserIp((java.lang.String)value);
      }
      break;

    case USER_MAC:
      if (value == null) {
        unsetUserMac();
      } else {
        setUserMac((java.lang.String)value);
      }
      break;

    case BASE_REQ:
      if (value == null) {
        unsetBaseReq();
      } else {
        setBaseReq((cn.com.howell.api.req.base.BaseReq)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case USER_PASSWD:
      return getUserPasswd();

    case USER_IP:
      return getUserIp();

    case USER_MAC:
      return getUserMac();

    case BASE_REQ:
      return getBaseReq();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case USER_PASSWD:
      return isSetUserPasswd();
    case USER_IP:
      return isSetUserIp();
    case USER_MAC:
      return isSetUserMac();
    case BASE_REQ:
      return isSetBaseReq();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserReq)
      return this.equals((UserReq)that);
    return false;
  }

  public boolean equals(UserReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_userPasswd = true && this.isSetUserPasswd();
    boolean that_present_userPasswd = true && that.isSetUserPasswd();
    if (this_present_userPasswd || that_present_userPasswd) {
      if (!(this_present_userPasswd && that_present_userPasswd))
        return false;
      if (!this.userPasswd.equals(that.userPasswd))
        return false;
    }

    boolean this_present_userIp = true && this.isSetUserIp();
    boolean that_present_userIp = true && that.isSetUserIp();
    if (this_present_userIp || that_present_userIp) {
      if (!(this_present_userIp && that_present_userIp))
        return false;
      if (!this.userIp.equals(that.userIp))
        return false;
    }

    boolean this_present_userMac = true && this.isSetUserMac();
    boolean that_present_userMac = true && that.isSetUserMac();
    if (this_present_userMac || that_present_userMac) {
      if (!(this_present_userMac && that_present_userMac))
        return false;
      if (!this.userMac.equals(that.userMac))
        return false;
    }

    boolean this_present_baseReq = true && this.isSetBaseReq();
    boolean that_present_baseReq = true && that.isSetBaseReq();
    if (this_present_baseReq || that_present_baseReq) {
      if (!(this_present_baseReq && that_present_baseReq))
        return false;
      if (!this.baseReq.equals(that.baseReq))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserId()) ? 131071 : 524287);
    if (isSetUserId())
      hashCode = hashCode * 8191 + userId.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserPasswd()) ? 131071 : 524287);
    if (isSetUserPasswd())
      hashCode = hashCode * 8191 + userPasswd.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserIp()) ? 131071 : 524287);
    if (isSetUserIp())
      hashCode = hashCode * 8191 + userIp.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserMac()) ? 131071 : 524287);
    if (isSetUserMac())
      hashCode = hashCode * 8191 + userMac.hashCode();

    hashCode = hashCode * 8191 + ((isSetBaseReq()) ? 131071 : 524287);
    if (isSetBaseReq())
      hashCode = hashCode * 8191 + baseReq.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserPasswd()).compareTo(other.isSetUserPasswd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserPasswd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userPasswd, other.userPasswd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserIp()).compareTo(other.isSetUserIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userIp, other.userIp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserMac()).compareTo(other.isSetUserMac());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserMac()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userMac, other.userMac);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBaseReq()).compareTo(other.isSetBaseReq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseReq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.baseReq, other.baseReq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserReq(");
    boolean first = true;

    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userPasswd:");
    if (this.userPasswd == null) {
      sb.append("null");
    } else {
      sb.append(this.userPasswd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userIp:");
    if (this.userIp == null) {
      sb.append("null");
    } else {
      sb.append(this.userIp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userMac:");
    if (this.userMac == null) {
      sb.append("null");
    } else {
      sb.append(this.userMac);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("baseReq:");
    if (this.baseReq == null) {
      sb.append("null");
    } else {
      sb.append(this.baseReq);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (userId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not present! Struct: " + toString());
    }
    if (userPasswd == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userPasswd' was not present! Struct: " + toString());
    }
    if (userIp == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userIp' was not present! Struct: " + toString());
    }
    if (userMac == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userMac' was not present! Struct: " + toString());
    }
    if (baseReq == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'baseReq' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (baseReq != null) {
      baseReq.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserReqStandardScheme getScheme() {
      return new UserReqStandardScheme();
    }
  }

  private static class UserReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_PASSWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userPasswd = iprot.readString();
              struct.setUserPasswdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userIp = iprot.readString();
              struct.setUserIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_MAC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userMac = iprot.readString();
              struct.setUserMacIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BASE_REQ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.baseReq = new cn.com.howell.api.req.base.BaseReq();
              struct.baseReq.read(iprot);
              struct.setBaseReqIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.userPasswd != null) {
        oprot.writeFieldBegin(USER_PASSWD_FIELD_DESC);
        oprot.writeString(struct.userPasswd);
        oprot.writeFieldEnd();
      }
      if (struct.userIp != null) {
        oprot.writeFieldBegin(USER_IP_FIELD_DESC);
        oprot.writeString(struct.userIp);
        oprot.writeFieldEnd();
      }
      if (struct.userMac != null) {
        oprot.writeFieldBegin(USER_MAC_FIELD_DESC);
        oprot.writeString(struct.userMac);
        oprot.writeFieldEnd();
      }
      if (struct.baseReq != null) {
        oprot.writeFieldBegin(BASE_REQ_FIELD_DESC);
        struct.baseReq.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserReqTupleScheme getScheme() {
      return new UserReqTupleScheme();
    }
  }

  private static class UserReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.userId);
      oprot.writeString(struct.userPasswd);
      oprot.writeString(struct.userIp);
      oprot.writeString(struct.userMac);
      struct.baseReq.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.userId = iprot.readString();
      struct.setUserIdIsSet(true);
      struct.userPasswd = iprot.readString();
      struct.setUserPasswdIsSet(true);
      struct.userIp = iprot.readString();
      struct.setUserIpIsSet(true);
      struct.userMac = iprot.readString();
      struct.setUserMacIsSet(true);
      struct.baseReq = new cn.com.howell.api.req.base.BaseReq();
      struct.baseReq.read(iprot);
      struct.setBaseReqIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

