// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/recorder.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

/**
 * Protobuf type {@code recorder.RecordRoundStepsRequest}
 */
public final class RecordRoundStepsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:recorder.RecordRoundStepsRequest)
    RecordRoundStepsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordRoundStepsRequest.newBuilder() to construct.
  private RecordRoundStepsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordRoundStepsRequest() {
    recordId_ = com.google.protobuf.ByteString.EMPTY;
    steps_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordRoundStepsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordRoundStepsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordRoundStepsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wecasino.proto.recorder.RecordRoundStepsRequest.class, com.wecasino.proto.recorder.RecordRoundStepsRequest.Builder.class);
  }

  public static final int RECORD_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString recordId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 紀錄ID
   * </pre>
   *
   * <code>bytes record_id = 1 [json_name = "recordId"];</code>
   * @return The recordId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordId() {
    return recordId_;
  }

  public static final int STEPS_FIELD_NUMBER = 26;
  @SuppressWarnings("serial")
  private java.util.List<com.wecasino.proto.recorder.Step> steps_;
  /**
   * <pre>
   * 步驟
   * </pre>
   *
   * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
   */
  @java.lang.Override
  public java.util.List<com.wecasino.proto.recorder.Step> getStepsList() {
    return steps_;
  }
  /**
   * <pre>
   * 步驟
   * </pre>
   *
   * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wecasino.proto.recorder.StepOrBuilder> 
      getStepsOrBuilderList() {
    return steps_;
  }
  /**
   * <pre>
   * 步驟
   * </pre>
   *
   * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
   */
  @java.lang.Override
  public int getStepsCount() {
    return steps_.size();
  }
  /**
   * <pre>
   * 步驟
   * </pre>
   *
   * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.Step getSteps(int index) {
    return steps_.get(index);
  }
  /**
   * <pre>
   * 步驟
   * </pre>
   *
   * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.StepOrBuilder getStepsOrBuilder(
      int index) {
    return steps_.get(index);
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
    if (!recordId_.isEmpty()) {
      output.writeBytes(1, recordId_);
    }
    for (int i = 0; i < steps_.size(); i++) {
      output.writeMessage(26, steps_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!recordId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, recordId_);
    }
    for (int i = 0; i < steps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(26, steps_.get(i));
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
    if (!(obj instanceof com.wecasino.proto.recorder.RecordRoundStepsRequest)) {
      return super.equals(obj);
    }
    com.wecasino.proto.recorder.RecordRoundStepsRequest other = (com.wecasino.proto.recorder.RecordRoundStepsRequest) obj;

    if (!getRecordId()
        .equals(other.getRecordId())) return false;
    if (!getStepsList()
        .equals(other.getStepsList())) return false;
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
    hash = (37 * hash) + RECORD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordId().hashCode();
    if (getStepsCount() > 0) {
      hash = (37 * hash) + STEPS_FIELD_NUMBER;
      hash = (53 * hash) + getStepsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.RecordRoundStepsRequest parseFrom(
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
  public static Builder newBuilder(com.wecasino.proto.recorder.RecordRoundStepsRequest prototype) {
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
   * Protobuf type {@code recorder.RecordRoundStepsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:recorder.RecordRoundStepsRequest)
      com.wecasino.proto.recorder.RecordRoundStepsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordRoundStepsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordRoundStepsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wecasino.proto.recorder.RecordRoundStepsRequest.class, com.wecasino.proto.recorder.RecordRoundStepsRequest.Builder.class);
    }

    // Construct using com.wecasino.proto.recorder.RecordRoundStepsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      recordId_ = com.google.protobuf.ByteString.EMPTY;
      if (stepsBuilder_ == null) {
        steps_ = java.util.Collections.emptyList();
      } else {
        steps_ = null;
        stepsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordRoundStepsRequest_descriptor;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.RecordRoundStepsRequest getDefaultInstanceForType() {
      return com.wecasino.proto.recorder.RecordRoundStepsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.RecordRoundStepsRequest build() {
      com.wecasino.proto.recorder.RecordRoundStepsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.RecordRoundStepsRequest buildPartial() {
      com.wecasino.proto.recorder.RecordRoundStepsRequest result = new com.wecasino.proto.recorder.RecordRoundStepsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.wecasino.proto.recorder.RecordRoundStepsRequest result) {
      if (stepsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          steps_ = java.util.Collections.unmodifiableList(steps_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.steps_ = steps_;
      } else {
        result.steps_ = stepsBuilder_.build();
      }
    }

    private void buildPartial0(com.wecasino.proto.recorder.RecordRoundStepsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recordId_ = recordId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wecasino.proto.recorder.RecordRoundStepsRequest) {
        return mergeFrom((com.wecasino.proto.recorder.RecordRoundStepsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wecasino.proto.recorder.RecordRoundStepsRequest other) {
      if (other == com.wecasino.proto.recorder.RecordRoundStepsRequest.getDefaultInstance()) return this;
      if (other.getRecordId() != com.google.protobuf.ByteString.EMPTY) {
        setRecordId(other.getRecordId());
      }
      if (stepsBuilder_ == null) {
        if (!other.steps_.isEmpty()) {
          if (steps_.isEmpty()) {
            steps_ = other.steps_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStepsIsMutable();
            steps_.addAll(other.steps_);
          }
          onChanged();
        }
      } else {
        if (!other.steps_.isEmpty()) {
          if (stepsBuilder_.isEmpty()) {
            stepsBuilder_.dispose();
            stepsBuilder_ = null;
            steps_ = other.steps_;
            bitField0_ = (bitField0_ & ~0x00000002);
            stepsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStepsFieldBuilder() : null;
          } else {
            stepsBuilder_.addAllMessages(other.steps_);
          }
        }
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
            case 10: {
              recordId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 210: {
              com.wecasino.proto.recorder.Step m =
                  input.readMessage(
                      com.wecasino.proto.recorder.Step.parser(),
                      extensionRegistry);
              if (stepsBuilder_ == null) {
                ensureStepsIsMutable();
                steps_.add(m);
              } else {
                stepsBuilder_.addMessage(m);
              }
              break;
            } // case 210
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

    private com.google.protobuf.ByteString recordId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 紀錄ID
     * </pre>
     *
     * <code>bytes record_id = 1 [json_name = "recordId"];</code>
     * @return The recordId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRecordId() {
      return recordId_;
    }
    /**
     * <pre>
     * 紀錄ID
     * </pre>
     *
     * <code>bytes record_id = 1 [json_name = "recordId"];</code>
     * @param value The recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      recordId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 紀錄ID
     * </pre>
     *
     * <code>bytes record_id = 1 [json_name = "recordId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recordId_ = getDefaultInstance().getRecordId();
      onChanged();
      return this;
    }

    private java.util.List<com.wecasino.proto.recorder.Step> steps_ =
      java.util.Collections.emptyList();
    private void ensureStepsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        steps_ = new java.util.ArrayList<com.wecasino.proto.recorder.Step>(steps_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wecasino.proto.recorder.Step, com.wecasino.proto.recorder.Step.Builder, com.wecasino.proto.recorder.StepOrBuilder> stepsBuilder_;

    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.Step> getStepsList() {
      if (stepsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(steps_);
      } else {
        return stepsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public int getStepsCount() {
      if (stepsBuilder_ == null) {
        return steps_.size();
      } else {
        return stepsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public com.wecasino.proto.recorder.Step getSteps(int index) {
      if (stepsBuilder_ == null) {
        return steps_.get(index);
      } else {
        return stepsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder setSteps(
        int index, com.wecasino.proto.recorder.Step value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.set(index, value);
        onChanged();
      } else {
        stepsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder setSteps(
        int index, com.wecasino.proto.recorder.Step.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.set(index, builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder addSteps(com.wecasino.proto.recorder.Step value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.add(value);
        onChanged();
      } else {
        stepsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder addSteps(
        int index, com.wecasino.proto.recorder.Step value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.add(index, value);
        onChanged();
      } else {
        stepsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder addSteps(
        com.wecasino.proto.recorder.Step.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.add(builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder addSteps(
        int index, com.wecasino.proto.recorder.Step.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.add(index, builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder addAllSteps(
        java.lang.Iterable<? extends com.wecasino.proto.recorder.Step> values) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, steps_);
        onChanged();
      } else {
        stepsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder clearSteps() {
      if (stepsBuilder_ == null) {
        steps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        stepsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public Builder removeSteps(int index) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.remove(index);
        onChanged();
      } else {
        stepsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public com.wecasino.proto.recorder.Step.Builder getStepsBuilder(
        int index) {
      return getStepsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public com.wecasino.proto.recorder.StepOrBuilder getStepsOrBuilder(
        int index) {
      if (stepsBuilder_ == null) {
        return steps_.get(index);  } else {
        return stepsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public java.util.List<? extends com.wecasino.proto.recorder.StepOrBuilder> 
         getStepsOrBuilderList() {
      if (stepsBuilder_ != null) {
        return stepsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(steps_);
      }
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public com.wecasino.proto.recorder.Step.Builder addStepsBuilder() {
      return getStepsFieldBuilder().addBuilder(
          com.wecasino.proto.recorder.Step.getDefaultInstance());
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public com.wecasino.proto.recorder.Step.Builder addStepsBuilder(
        int index) {
      return getStepsFieldBuilder().addBuilder(
          index, com.wecasino.proto.recorder.Step.getDefaultInstance());
    }
    /**
     * <pre>
     * 步驟
     * </pre>
     *
     * <code>repeated .recorder.Step steps = 26 [json_name = "steps"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.Step.Builder> 
         getStepsBuilderList() {
      return getStepsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wecasino.proto.recorder.Step, com.wecasino.proto.recorder.Step.Builder, com.wecasino.proto.recorder.StepOrBuilder> 
        getStepsFieldBuilder() {
      if (stepsBuilder_ == null) {
        stepsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wecasino.proto.recorder.Step, com.wecasino.proto.recorder.Step.Builder, com.wecasino.proto.recorder.StepOrBuilder>(
                steps_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        steps_ = null;
      }
      return stepsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:recorder.RecordRoundStepsRequest)
  }

  // @@protoc_insertion_point(class_scope:recorder.RecordRoundStepsRequest)
  private static final com.wecasino.proto.recorder.RecordRoundStepsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wecasino.proto.recorder.RecordRoundStepsRequest();
  }

  public static com.wecasino.proto.recorder.RecordRoundStepsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordRoundStepsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RecordRoundStepsRequest>() {
    @java.lang.Override
    public RecordRoundStepsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordRoundStepsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordRoundStepsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wecasino.proto.recorder.RecordRoundStepsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

