// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service01.proto

package grpc.project.Service01;

/**
 * <pre>
 * Request for DoorID and PIN
 * </pre>
 *
 * Protobuf type {@code Service01.RequestDoorAccessMsg}
 */
public  final class RequestDoorAccessMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Service01.RequestDoorAccessMsg)
    RequestDoorAccessMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestDoorAccessMsg.newBuilder() to construct.
  private RequestDoorAccessMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestDoorAccessMsg() {
    doorId_ = "";
    pin_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestDoorAccessMsg(
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

            doorId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            pin_ = s;
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
    return grpc.project.Service01.Service01Impl.internal_static_Service01_RequestDoorAccessMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.project.Service01.Service01Impl.internal_static_Service01_RequestDoorAccessMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.project.Service01.RequestDoorAccessMsg.class, grpc.project.Service01.RequestDoorAccessMsg.Builder.class);
  }

  public static final int DOOR_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object doorId_;
  /**
   * <code>string door_id = 1;</code>
   */
  public java.lang.String getDoorId() {
    java.lang.Object ref = doorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      doorId_ = s;
      return s;
    }
  }
  /**
   * <code>string door_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDoorIdBytes() {
    java.lang.Object ref = doorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      doorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object pin_;
  /**
   * <code>string pin = 2;</code>
   */
  public java.lang.String getPin() {
    java.lang.Object ref = pin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pin_ = s;
      return s;
    }
  }
  /**
   * <code>string pin = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPinBytes() {
    java.lang.Object ref = pin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pin_ = b;
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
    if (!getDoorIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, doorId_);
    }
    if (!getPinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pin_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDoorIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, doorId_);
    }
    if (!getPinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pin_);
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
    if (!(obj instanceof grpc.project.Service01.RequestDoorAccessMsg)) {
      return super.equals(obj);
    }
    grpc.project.Service01.RequestDoorAccessMsg other = (grpc.project.Service01.RequestDoorAccessMsg) obj;

    boolean result = true;
    result = result && getDoorId()
        .equals(other.getDoorId());
    result = result && getPin()
        .equals(other.getPin());
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
    hash = (37 * hash) + DOOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDoorId().hashCode();
    hash = (37 * hash) + PIN_FIELD_NUMBER;
    hash = (53 * hash) + getPin().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.Service01.RequestDoorAccessMsg parseFrom(
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
  public static Builder newBuilder(grpc.project.Service01.RequestDoorAccessMsg prototype) {
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
   * Request for DoorID and PIN
   * </pre>
   *
   * Protobuf type {@code Service01.RequestDoorAccessMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Service01.RequestDoorAccessMsg)
      grpc.project.Service01.RequestDoorAccessMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.project.Service01.Service01Impl.internal_static_Service01_RequestDoorAccessMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.project.Service01.Service01Impl.internal_static_Service01_RequestDoorAccessMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.project.Service01.RequestDoorAccessMsg.class, grpc.project.Service01.RequestDoorAccessMsg.Builder.class);
    }

    // Construct using grpc.project.Service01.RequestDoorAccessMsg.newBuilder()
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
      doorId_ = "";

      pin_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.project.Service01.Service01Impl.internal_static_Service01_RequestDoorAccessMsg_descriptor;
    }

    @java.lang.Override
    public grpc.project.Service01.RequestDoorAccessMsg getDefaultInstanceForType() {
      return grpc.project.Service01.RequestDoorAccessMsg.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.project.Service01.RequestDoorAccessMsg build() {
      grpc.project.Service01.RequestDoorAccessMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.project.Service01.RequestDoorAccessMsg buildPartial() {
      grpc.project.Service01.RequestDoorAccessMsg result = new grpc.project.Service01.RequestDoorAccessMsg(this);
      result.doorId_ = doorId_;
      result.pin_ = pin_;
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
      if (other instanceof grpc.project.Service01.RequestDoorAccessMsg) {
        return mergeFrom((grpc.project.Service01.RequestDoorAccessMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.project.Service01.RequestDoorAccessMsg other) {
      if (other == grpc.project.Service01.RequestDoorAccessMsg.getDefaultInstance()) return this;
      if (!other.getDoorId().isEmpty()) {
        doorId_ = other.doorId_;
        onChanged();
      }
      if (!other.getPin().isEmpty()) {
        pin_ = other.pin_;
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
      grpc.project.Service01.RequestDoorAccessMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.project.Service01.RequestDoorAccessMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object doorId_ = "";
    /**
     * <code>string door_id = 1;</code>
     */
    public java.lang.String getDoorId() {
      java.lang.Object ref = doorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        doorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string door_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDoorIdBytes() {
      java.lang.Object ref = doorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        doorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string door_id = 1;</code>
     */
    public Builder setDoorId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      doorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string door_id = 1;</code>
     */
    public Builder clearDoorId() {
      
      doorId_ = getDefaultInstance().getDoorId();
      onChanged();
      return this;
    }
    /**
     * <code>string door_id = 1;</code>
     */
    public Builder setDoorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      doorId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pin_ = "";
    /**
     * <code>string pin = 2;</code>
     */
    public java.lang.String getPin() {
      java.lang.Object ref = pin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pin = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPinBytes() {
      java.lang.Object ref = pin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pin = 2;</code>
     */
    public Builder setPin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pin = 2;</code>
     */
    public Builder clearPin() {
      
      pin_ = getDefaultInstance().getPin();
      onChanged();
      return this;
    }
    /**
     * <code>string pin = 2;</code>
     */
    public Builder setPinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pin_ = value;
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


    // @@protoc_insertion_point(builder_scope:Service01.RequestDoorAccessMsg)
  }

  // @@protoc_insertion_point(class_scope:Service01.RequestDoorAccessMsg)
  private static final grpc.project.Service01.RequestDoorAccessMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.project.Service01.RequestDoorAccessMsg();
  }

  public static grpc.project.Service01.RequestDoorAccessMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestDoorAccessMsg>
      PARSER = new com.google.protobuf.AbstractParser<RequestDoorAccessMsg>() {
    @java.lang.Override
    public RequestDoorAccessMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestDoorAccessMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestDoorAccessMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestDoorAccessMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.project.Service01.RequestDoorAccessMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

