// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service02.proto

package grpc.project.Service02;

/**
 * Protobuf type {@code Service02.SetSecurityProfileRequest}
 */
public  final class SetSecurityProfileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Service02.SetSecurityProfileRequest)
    SetSecurityProfileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetSecurityProfileRequest.newBuilder() to construct.
  private SetSecurityProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetSecurityProfileRequest() {
    userId_ = "";
    securityLevel_ = "";
    secureFlag_ = false;
    employmentType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetSecurityProfileRequest(
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

            userId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            securityLevel_ = s;
            break;
          }
          case 24: {

            secureFlag_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            employmentType_ = s;
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
    return grpc.project.Service02.Service02Impl.internal_static_Service02_SetSecurityProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.project.Service02.Service02Impl.internal_static_Service02_SetSecurityProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.project.Service02.SetSecurityProfileRequest.class, grpc.project.Service02.SetSecurityProfileRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 1;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITY_LEVEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object securityLevel_;
  /**
   * <code>string security_level = 2;</code>
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
   * <code>string security_level = 2;</code>
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

  public static final int SECURE_FLAG_FIELD_NUMBER = 3;
  private boolean secureFlag_;
  /**
   * <code>bool secure_flag = 3;</code>
   */
  public boolean getSecureFlag() {
    return secureFlag_;
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
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!getSecurityLevelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, securityLevel_);
    }
    if (secureFlag_ != false) {
      output.writeBool(3, secureFlag_);
    }
    if (!getEmploymentTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, employmentType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!getSecurityLevelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, securityLevel_);
    }
    if (secureFlag_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, secureFlag_);
    }
    if (!getEmploymentTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, employmentType_);
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
    if (!(obj instanceof grpc.project.Service02.SetSecurityProfileRequest)) {
      return super.equals(obj);
    }
    grpc.project.Service02.SetSecurityProfileRequest other = (grpc.project.Service02.SetSecurityProfileRequest) obj;

    boolean result = true;
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && getSecurityLevel()
        .equals(other.getSecurityLevel());
    result = result && (getSecureFlag()
        == other.getSecureFlag());
    result = result && getEmploymentType()
        .equals(other.getEmploymentType());
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + SECURITY_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityLevel().hashCode();
    hash = (37 * hash) + SECURE_FLAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSecureFlag());
    hash = (37 * hash) + EMPLOYMENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEmploymentType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.Service02.SetSecurityProfileRequest parseFrom(
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
  public static Builder newBuilder(grpc.project.Service02.SetSecurityProfileRequest prototype) {
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
   * Protobuf type {@code Service02.SetSecurityProfileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Service02.SetSecurityProfileRequest)
      grpc.project.Service02.SetSecurityProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.project.Service02.Service02Impl.internal_static_Service02_SetSecurityProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.project.Service02.Service02Impl.internal_static_Service02_SetSecurityProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.project.Service02.SetSecurityProfileRequest.class, grpc.project.Service02.SetSecurityProfileRequest.Builder.class);
    }

    // Construct using grpc.project.Service02.SetSecurityProfileRequest.newBuilder()
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
      userId_ = "";

      securityLevel_ = "";

      secureFlag_ = false;

      employmentType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.project.Service02.Service02Impl.internal_static_Service02_SetSecurityProfileRequest_descriptor;
    }

    @java.lang.Override
    public grpc.project.Service02.SetSecurityProfileRequest getDefaultInstanceForType() {
      return grpc.project.Service02.SetSecurityProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.project.Service02.SetSecurityProfileRequest build() {
      grpc.project.Service02.SetSecurityProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.project.Service02.SetSecurityProfileRequest buildPartial() {
      grpc.project.Service02.SetSecurityProfileRequest result = new grpc.project.Service02.SetSecurityProfileRequest(this);
      result.userId_ = userId_;
      result.securityLevel_ = securityLevel_;
      result.secureFlag_ = secureFlag_;
      result.employmentType_ = employmentType_;
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
      if (other instanceof grpc.project.Service02.SetSecurityProfileRequest) {
        return mergeFrom((grpc.project.Service02.SetSecurityProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.project.Service02.SetSecurityProfileRequest other) {
      if (other == grpc.project.Service02.SetSecurityProfileRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getSecurityLevel().isEmpty()) {
        securityLevel_ = other.securityLevel_;
        onChanged();
      }
      if (other.getSecureFlag() != false) {
        setSecureFlag(other.getSecureFlag());
      }
      if (!other.getEmploymentType().isEmpty()) {
        employmentType_ = other.employmentType_;
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
      grpc.project.Service02.SetSecurityProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.project.Service02.SetSecurityProfileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object securityLevel_ = "";
    /**
     * <code>string security_level = 2;</code>
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
     * <code>string security_level = 2;</code>
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
     * <code>string security_level = 2;</code>
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
     * <code>string security_level = 2;</code>
     */
    public Builder clearSecurityLevel() {
      
      securityLevel_ = getDefaultInstance().getSecurityLevel();
      onChanged();
      return this;
    }
    /**
     * <code>string security_level = 2;</code>
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
     * <code>bool secure_flag = 3;</code>
     */
    public boolean getSecureFlag() {
      return secureFlag_;
    }
    /**
     * <code>bool secure_flag = 3;</code>
     */
    public Builder setSecureFlag(boolean value) {
      
      secureFlag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool secure_flag = 3;</code>
     */
    public Builder clearSecureFlag() {
      
      secureFlag_ = false;
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


    // @@protoc_insertion_point(builder_scope:Service02.SetSecurityProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:Service02.SetSecurityProfileRequest)
  private static final grpc.project.Service02.SetSecurityProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.project.Service02.SetSecurityProfileRequest();
  }

  public static grpc.project.Service02.SetSecurityProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetSecurityProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetSecurityProfileRequest>() {
    @java.lang.Override
    public SetSecurityProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetSecurityProfileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetSecurityProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetSecurityProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.project.Service02.SetSecurityProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
