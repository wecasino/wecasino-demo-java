// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

/**
 * Protobuf type {@code recorder.FetchRoundRecordRequest}
 */
public final class FetchRoundRecordRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:recorder.FetchRoundRecordRequest)
    FetchRoundRecordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      FetchRoundRecordRequest.class.getName());
  }
  // Use FetchRoundRecordRequest.newBuilder() to construct.
  private FetchRoundRecordRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FetchRoundRecordRequest() {
    gameCode_ = "";
    roundCode_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_FetchRoundRecordRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_FetchRoundRecordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wecasino.proto.recorder.FetchRoundRecordRequest.class, com.wecasino.proto.recorder.FetchRoundRecordRequest.Builder.class);
  }

  private int bitField0_;
  public static final int GAME_CODE_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gameCode_ = "";
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 6 [json_name = "gameCode"];</code>
   * @return The gameCode.
   */
  @java.lang.Override
  public java.lang.String getGameCode() {
    java.lang.Object ref = gameCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gameCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 6 [json_name = "gameCode"];</code>
   * @return The bytes for gameCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGameCodeBytes() {
    java.lang.Object ref = gameCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gameCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUND_CODE_FIELD_NUMBER = 12;
  @SuppressWarnings("serial")
  private volatile java.lang.Object roundCode_ = "";
  /**
   * <pre>
   * 局代碼
   * </pre>
   *
   * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
   * @return Whether the roundCode field is set.
   */
  @java.lang.Override
  public boolean hasRoundCode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * 局代碼
   * </pre>
   *
   * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
   * @return The roundCode.
   */
  @java.lang.Override
  public java.lang.String getRoundCode() {
    java.lang.Object ref = roundCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roundCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 局代碼
   * </pre>
   *
   * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
   * @return The bytes for roundCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoundCodeBytes() {
    java.lang.Object ref = roundCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roundCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 36;
  private com.wecasino.proto.recorder.RecordQuery query_;
  /**
   * <pre>
   * 查詢限制
   * </pre>
   *
   * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * 查詢限制
   * </pre>
   *
   * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
   * @return The query.
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.RecordQuery getQuery() {
    return query_ == null ? com.wecasino.proto.recorder.RecordQuery.getDefaultInstance() : query_;
  }
  /**
   * <pre>
   * 查詢限制
   * </pre>
   *
   * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.RecordQueryOrBuilder getQueryOrBuilder() {
    return query_ == null ? com.wecasino.proto.recorder.RecordQuery.getDefaultInstance() : query_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(gameCode_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 6, gameCode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 12, roundCode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(36, getQuery());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(gameCode_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(6, gameCode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(12, roundCode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(36, getQuery());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wecasino.proto.recorder.FetchRoundRecordRequest)) {
      return super.equals(obj);
    }
    com.wecasino.proto.recorder.FetchRoundRecordRequest other = (com.wecasino.proto.recorder.FetchRoundRecordRequest) obj;

    if (!getGameCode()
        .equals(other.getGameCode())) return false;
    if (hasRoundCode() != other.hasRoundCode()) return false;
    if (hasRoundCode()) {
      if (!getRoundCode()
          .equals(other.getRoundCode())) return false;
    }
    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (!getQuery()
          .equals(other.getQuery())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GAME_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getGameCode().hashCode();
    if (hasRoundCode()) {
      hash = (37 * hash) + ROUND_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getRoundCode().hashCode();
    }
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.FetchRoundRecordRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wecasino.proto.recorder.FetchRoundRecordRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code recorder.FetchRoundRecordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:recorder.FetchRoundRecordRequest)
      com.wecasino.proto.recorder.FetchRoundRecordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_FetchRoundRecordRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_FetchRoundRecordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wecasino.proto.recorder.FetchRoundRecordRequest.class, com.wecasino.proto.recorder.FetchRoundRecordRequest.Builder.class);
    }

    // Construct using com.wecasino.proto.recorder.FetchRoundRecordRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getQueryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gameCode_ = "";
      roundCode_ = "";
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_FetchRoundRecordRequest_descriptor;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.FetchRoundRecordRequest getDefaultInstanceForType() {
      return com.wecasino.proto.recorder.FetchRoundRecordRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.FetchRoundRecordRequest build() {
      com.wecasino.proto.recorder.FetchRoundRecordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.FetchRoundRecordRequest buildPartial() {
      com.wecasino.proto.recorder.FetchRoundRecordRequest result = new com.wecasino.proto.recorder.FetchRoundRecordRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.wecasino.proto.recorder.FetchRoundRecordRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gameCode_ = gameCode_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.roundCode_ = roundCode_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.query_ = queryBuilder_ == null
            ? query_
            : queryBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wecasino.proto.recorder.FetchRoundRecordRequest) {
        return mergeFrom((com.wecasino.proto.recorder.FetchRoundRecordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wecasino.proto.recorder.FetchRoundRecordRequest other) {
      if (other == com.wecasino.proto.recorder.FetchRoundRecordRequest.getDefaultInstance()) return this;
      if (!other.getGameCode().isEmpty()) {
        gameCode_ = other.gameCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRoundCode()) {
        roundCode_ = other.roundCode_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasQuery()) {
        mergeQuery(other.getQuery());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 50: {
              gameCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 50
            case 98: {
              roundCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 98
            case 290: {
              input.readMessage(
                  getQueryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 290
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object gameCode_ = "";
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 6 [json_name = "gameCode"];</code>
     * @return The gameCode.
     */
    public java.lang.String getGameCode() {
      java.lang.Object ref = gameCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 6 [json_name = "gameCode"];</code>
     * @return The bytes for gameCode.
     */
    public com.google.protobuf.ByteString
        getGameCodeBytes() {
      java.lang.Object ref = gameCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 6 [json_name = "gameCode"];</code>
     * @param value The gameCode to set.
     * @return This builder for chaining.
     */
    public Builder setGameCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gameCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 6 [json_name = "gameCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGameCode() {
      gameCode_ = getDefaultInstance().getGameCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 6 [json_name = "gameCode"];</code>
     * @param value The bytes for gameCode to set.
     * @return This builder for chaining.
     */
    public Builder setGameCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gameCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object roundCode_ = "";
    /**
     * <pre>
     * 局代碼
     * </pre>
     *
     * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
     * @return Whether the roundCode field is set.
     */
    public boolean hasRoundCode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 局代碼
     * </pre>
     *
     * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
     * @return The roundCode.
     */
    public java.lang.String getRoundCode() {
      java.lang.Object ref = roundCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roundCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 局代碼
     * </pre>
     *
     * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
     * @return The bytes for roundCode.
     */
    public com.google.protobuf.ByteString
        getRoundCodeBytes() {
      java.lang.Object ref = roundCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roundCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 局代碼
     * </pre>
     *
     * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
     * @param value The roundCode to set.
     * @return This builder for chaining.
     */
    public Builder setRoundCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      roundCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 局代碼
     * </pre>
     *
     * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRoundCode() {
      roundCode_ = getDefaultInstance().getRoundCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 局代碼
     * </pre>
     *
     * <code>optional string round_code = 12 [json_name = "roundCode"];</code>
     * @param value The bytes for roundCode to set.
     * @return This builder for chaining.
     */
    public Builder setRoundCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      roundCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.wecasino.proto.recorder.RecordQuery query_;
    private com.google.protobuf.SingleFieldBuilder<
        com.wecasino.proto.recorder.RecordQuery, com.wecasino.proto.recorder.RecordQuery.Builder, com.wecasino.proto.recorder.RecordQueryOrBuilder> queryBuilder_;
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     * @return Whether the query field is set.
     */
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     * @return The query.
     */
    public com.wecasino.proto.recorder.RecordQuery getQuery() {
      if (queryBuilder_ == null) {
        return query_ == null ? com.wecasino.proto.recorder.RecordQuery.getDefaultInstance() : query_;
      } else {
        return queryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     */
    public Builder setQuery(com.wecasino.proto.recorder.RecordQuery value) {
      if (queryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
      } else {
        queryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     */
    public Builder setQuery(
        com.wecasino.proto.recorder.RecordQuery.Builder builderForValue) {
      if (queryBuilder_ == null) {
        query_ = builderForValue.build();
      } else {
        queryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     */
    public Builder mergeQuery(com.wecasino.proto.recorder.RecordQuery value) {
      if (queryBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          query_ != null &&
          query_ != com.wecasino.proto.recorder.RecordQuery.getDefaultInstance()) {
          getQueryBuilder().mergeFrom(value);
        } else {
          query_ = value;
        }
      } else {
        queryBuilder_.mergeFrom(value);
      }
      if (query_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     */
    public Builder clearQuery() {
      bitField0_ = (bitField0_ & ~0x00000004);
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     */
    public com.wecasino.proto.recorder.RecordQuery.Builder getQueryBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getQueryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     */
    public com.wecasino.proto.recorder.RecordQueryOrBuilder getQueryOrBuilder() {
      if (queryBuilder_ != null) {
        return queryBuilder_.getMessageOrBuilder();
      } else {
        return query_ == null ?
            com.wecasino.proto.recorder.RecordQuery.getDefaultInstance() : query_;
      }
    }
    /**
     * <pre>
     * 查詢限制
     * </pre>
     *
     * <code>.recorder.RecordQuery query = 36 [json_name = "query"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.wecasino.proto.recorder.RecordQuery, com.wecasino.proto.recorder.RecordQuery.Builder, com.wecasino.proto.recorder.RecordQueryOrBuilder> 
        getQueryFieldBuilder() {
      if (queryBuilder_ == null) {
        queryBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.wecasino.proto.recorder.RecordQuery, com.wecasino.proto.recorder.RecordQuery.Builder, com.wecasino.proto.recorder.RecordQueryOrBuilder>(
                getQuery(),
                getParentForChildren(),
                isClean());
        query_ = null;
      }
      return queryBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:recorder.FetchRoundRecordRequest)
  }

  // @@protoc_insertion_point(class_scope:recorder.FetchRoundRecordRequest)
  private static final com.wecasino.proto.recorder.FetchRoundRecordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wecasino.proto.recorder.FetchRoundRecordRequest();
  }

  public static com.wecasino.proto.recorder.FetchRoundRecordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchRoundRecordRequest>
      PARSER = new com.google.protobuf.AbstractParser<FetchRoundRecordRequest>() {
    @java.lang.Override
    public FetchRoundRecordRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FetchRoundRecordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchRoundRecordRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wecasino.proto.recorder.FetchRoundRecordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

