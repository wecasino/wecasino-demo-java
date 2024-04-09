// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/luckywheel/record.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.games.luckywheel;

/**
 * <pre>
 * 結果紀錄類型代碼
 * </pre>
 *
 * Protobuf enum {@code games.luckywheel.ResultRecordType}
 */
public enum ResultRecordType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>RESULT_RECORD_TYPE_UNSPECIFIED = 0;</code>
   */
  RESULT_RECORD_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * 遊戲局結束
   * </pre>
   *
   * <code>ROUND_FINISH = 1;</code>
   */
  ROUND_FINISH(1),
  /**
   * <pre>
   * Pitboss 修正
   * </pre>
   *
   * <code>PITBOSS_MODIFY_RESULT = 2;</code>
   */
  PITBOSS_MODIFY_RESULT(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ResultRecordType.class.getName());
  }
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>RESULT_RECORD_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RESULT_RECORD_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 遊戲局結束
   * </pre>
   *
   * <code>ROUND_FINISH = 1;</code>
   */
  public static final int ROUND_FINISH_VALUE = 1;
  /**
   * <pre>
   * Pitboss 修正
   * </pre>
   *
   * <code>PITBOSS_MODIFY_RESULT = 2;</code>
   */
  public static final int PITBOSS_MODIFY_RESULT_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResultRecordType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResultRecordType forNumber(int value) {
    switch (value) {
      case 0: return RESULT_RECORD_TYPE_UNSPECIFIED;
      case 1: return ROUND_FINISH;
      case 2: return PITBOSS_MODIFY_RESULT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResultRecordType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResultRecordType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResultRecordType>() {
          public ResultRecordType findValueByNumber(int number) {
            return ResultRecordType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.wecasino.proto.games.luckywheel.RecordProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final ResultRecordType[] VALUES = values();

  public static ResultRecordType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResultRecordType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.luckywheel.ResultRecordType)
}

