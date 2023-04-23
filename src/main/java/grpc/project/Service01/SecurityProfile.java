// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service01.proto

package grpc.project.Service01;

/**
 * <pre>
 * Response for Security Profile
 * </pre>
 *
 * Protobuf type {@code Service01.SecurityProfile}
 */
public  final class SecurityProfile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Service01.SecurityProfile)
    SecurityProfileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityProfile.newBuilder() to construct.
  private SecurityProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityProfile() {
    securityLevel_ = "";
    secureFlag_ = false;
    twoFactorAuth_ = false;
    employmentType_ = "";
    accessDate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityProfile(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            securityLevel_ = s;
            break;
          }
          case 16: {

            secureFlag_ = input.readBool();
            break;
          }
          case 24: {

            twoFactorAuth_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            employmentType_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            accessDate_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.project.Service01.Service01Impl.internal_static_Service01_SecurityProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.project.Service01.Service01Impl.internal_static_Service01_SecurityProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.project.Service01.SecurityProfile.class, grpc.project.Service01.SecurityProfile.Builder.class);
  }

  public static final int SECURITY_LEVEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object securityLevel_;
  /**
   * <code>string security_level = 1;</code>
   */
  public java.lang.String getSecurityLevel() {
    java.lang.Object ref = securityLevel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityLevel_ = s;
      return s;
    }
  }
  /**
   * <code>string security_level = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSecurityLevelBytes() {
    java.lang.Object ref = securityLevel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityLevel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURE_FLAG_FIELD_NUMBER = 2;
  private boolean secureFlag_;
  /**
   * <code>bool secure_flag = 2;</code>
   */
  public boolean getSecureFlag() {
    return secureFlag_;
  }

  public static final int TWO_FACTOR_AUTH_FIELD_NUMBER = 3;
  private boolean twoFactorAuth_;
  /**
   * <code>bool two_factor_auth = 3;</code>
   */
  public boolean getTwoFactorAuth() {
    return twoFactorAuth_;
  }

  public static final int EMPLOYMENT_TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object employmentType_;
  /**
   * <code>string employment_type = 4;</code>
   */
  public java.lang.String getEmploymentType() {
    java.lang.Object ref = employmentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      employmentType_ = s;
      return s;
    }
  }
  /**
   * <code>string employment_type = 4;</code>
   */
  public com.google.protobuf.ByteString
      getEmploymentTypeBytes() {
    java.lang.Object ref = employmentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      employmentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_DATE_FIELD_NUMBER = 5;
  private volatile java.lang.Object accessDate_;
  /**
   * <code>string access_date = 5;</code>
   */
  public java.lang.String getAccessDate() {
    java.lang.Object ref = accessDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessDate_ = s;
      return s;
    }
  }
  /**
   * <code>string access_date = 5;</code>
   */
  public com.google.protobuf.ByteString
      getAccessDateBytes() {
    java.lang.Object ref = accessDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSecurityLevelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, securityLevel_);
    }
    if (secureFlag_ != false) {
      output.writeBool(2, secureFlag_);
    }
    if (twoFactorAuth_ != false) {
      output.writeBool(3, twoFactorAuth_);
    }
    if (!getEmploymentTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, employmentType_);
    }
    if (!getAccessDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, accessDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSecurityLevelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, securityLevel_);
    }
    if (secureFlag_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, secureFlag_);
    }
    if (twoFactorAuth_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, twoFactorAuth_);
    }
    if (!getEmploymentTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, employmentType_);
    }
    if (!getAccessDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, accessDate_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.project.Service01.SecurityProfile)) {
      return super.equals(obj);
    }
    grpc.project.Service01.SecurityProfile other = (grpc.project.Service01.SecurityProfile) obj;

    boolean result = true;
    result = result && getSecurityLevel()
        .equals(other.getSecurityLevel());
    result = result && (getSecureFlag()
        == other.getSecureFlag());
    result = result && (getTwoFactorAuth()
        == other.getTwoFactorAuth());
    result = result && getEmploymentType()
        .equals(other.getEmploymentType());
    result = result && getAccessDate()
        .equals(other.getAccessDate());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SECURITY_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityLevel().hashCode();
    hash = (37 * hash) + SECURE_FLAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSecureFlag());
    hash = (37 * hash) + TWO_FACTOR_AUTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTwoFactorAuth());
    hash = (37 * hash) + EMPLOYMENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEmploymentType().hashCode();
    hash = (37 * hash) + ACCESS_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getAccessDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.project.Service01.SecurityProfile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.Service01.SecurityProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.project.Service01.SecurityProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.Service01.SecurityProfile parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.project.Service01.SecurityProfile prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response for Security Profile
   * </pre>
   *
   * Protobuf type {@code Service01.SecurityProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Service01.SecurityProfile)
      grpc.project.Service01.SecurityProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.project.Service01.Service01Impl.internal_static_Service01_SecurityProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.project.Service01.Service01Impl.internal_static_Service01_SecurityProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.project.Service01.SecurityProfile.class, grpc.project.Service01.SecurityProfile.Builder.class);
    }

    // Construct using grpc.project.Service01.SecurityProfile.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      securityLevel_ = "";

      secureFlag_ = false;

      twoFactorAuth_ = false;

      employmentType_ = "";

      accessDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.project.Service01.Service01Impl.internal_static_Service01_SecurityProfile_descriptor;
    }

    @java.lang.Override
    public grpc.project.Service01.SecurityProfile getDefaultInstanceForType() {
      return grpc.project.Service01.SecurityProfile.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.project.Service01.SecurityProfile build() {
      grpc.project.Service01.SecurityProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.project.Service01.SecurityProfile buildPartial() {
      grpc.project.Service01.SecurityProfile result = new grpc.project.Service01.SecurityProfile(this);
      result.securityLevel_ = securityLevel_;
      result.secureFlag_ = secureFlag_;
      result.twoFactorAuth_ = twoFactorAuth_;
      result.employmentType_ = employmentType_;
      result.accessDate_ = accessDate_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.project.Service01.SecurityProfile) {
        return mergeFrom((grpc.project.Service01.SecurityProfile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.project.Service01.SecurityProfile other) {
      if (other == grpc.project.Service01.SecurityProfile.getDefaultInstance()) return this;
      if (!other.getSecurityLevel().isEmpty()) {
        securityLevel_ = other.securityLevel_;
        onChanged();
      }
      if (other.getSecureFlag() != false) {
        setSecureFlag(other.getSecureFlag());
      }
      if (other.getTwoFactorAuth() != false) {
        setTwoFactorAuth(other.getTwoFactorAuth());
      }
      if (!other.getEmploymentType().isEmpty()) {
        employmentType_ = other.employmentType_;
        onChanged();
      }
      if (!other.getAccessDate().isEmpty()) {
        accessDate_ = other.accessDate_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.project.Service01.SecurityProfile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.project.Service01.SecurityProfile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object securityLevel_ = "";
    /**
     * <code>string security_level = 1;</code>
     */
    public java.lang.String getSecurityLevel() {
      java.lang.Object ref = securityLevel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityLevel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string security_level = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSecurityLevelBytes() {
      java.lang.Object ref = securityLevel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityLevel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string security_level = 1;</code>
     */
    public Builder setSecurityLevel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string security_level = 1;</code>
     */
    public Builder clearSecurityLevel() {
      
      securityLevel_ = getDefaultInstance().getSecurityLevel();
      onChanged();
      return this;
    }
    /**
     * <code>string security_level = 1;</code>
     */
    public Builder setSecurityLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityLevel_ = value;
      onChanged();
      return this;
    }

    private boolean secureFlag_ ;
    /**
     * <code>bool secure_flag = 2;</code>
     */
    public boolean getSecureFlag() {
      return secureFlag_;
    }
    /**
     * <code>bool secure_flag = 2;</code>
     */
    public Builder setSecureFlag(boolean value) {
      
      secureFlag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool secure_flag = 2;</code>
     */
    public Builder clearSecureFlag() {
      
      secureFlag_ = false;
      onChanged();
      return this;
    }

    private boolean twoFactorAuth_ ;
    /**
     * <code>bool two_factor_auth = 3;</code>
     */
    public boolean getTwoFactorAuth() {
      return twoFactorAuth_;
    }
    /**
     * <code>bool two_factor_auth = 3;</code>
     */
    public Builder setTwoFactorAuth(boolean value) {
      
      twoFactorAuth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool two_factor_auth = 3;</code>
     */
    public Builder clearTwoFactorAuth() {
      
      twoFactorAuth_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object employmentType_ = "";
    /**
     * <code>string employment_type = 4;</code>
     */
    public java.lang.String getEmploymentType() {
      java.lang.Object ref = employmentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        employmentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string employment_type = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEmploymentTypeBytes() {
      java.lang.Object ref = employmentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        employmentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string employment_type = 4;</code>
     */
    public Builder setEmploymentType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      employmentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string employment_type = 4;</code>
     */
    public Builder clearEmploymentType() {
      
      employmentType_ = getDefaultInstance().getEmploymentType();
      onChanged();
      return this;
    }
    /**
     * <code>string employment_type = 4;</code>
     */
    public Builder setEmploymentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      employmentType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object accessDate_ = "";
    /**
     * <code>string access_date = 5;</code>
     */
    public java.lang.String getAccessDate() {
      java.lang.Object ref = accessDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string access_date = 5;</code>
     */
    public com.google.protobuf.ByteString
        getAccessDateBytes() {
      java.lang.Object ref = accessDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string access_date = 5;</code>
     */
    public Builder setAccessDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accessDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string access_date = 5;</code>
     */
    public Builder clearAccessDate() {
      
      accessDate_ = getDefaultInstance().getAccessDate();
      onChanged();
      return this;
    }
    /**
     * <code>string access_date = 5;</code>
     */
    public Builder setAccessDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accessDate_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Service01.SecurityProfile)
  }

  // @@protoc_insertion_point(class_scope:Service01.SecurityProfile)
  private static final grpc.project.Service01.SecurityProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.project.Service01.SecurityProfile();
  }

  public static grpc.project.Service01.SecurityProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityProfile>
      PARSER = new com.google.protobuf.AbstractParser<SecurityProfile>() {
    @java.lang.Override
    public SecurityProfile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityProfile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.project.Service01.SecurityProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

