// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/roulette/record.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.games.roulette;

/**
 * <pre>
 * 取消原因
 * </pre>
 *
 * Protobuf enum {@code games.roulette.CancelReason}
 */
public enum CancelReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定，沒有取消
   * </pre>
   *
   * <code>CANCEL_REASON_UNSPECIFIED = 0;</code>
   */
  CANCEL_REASON_UNSPECIFIED(0),
  /**
   * <pre>
   * 取消說明原因
   * </pre>
   *
   * <code>NO_REASON = 1;</code>
   */
  NO_REASON(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      CancelReason.class.getName());
  }
  /**
   * <pre>
   * 未指定，沒有取消
   * </pre>
   *
   * <code>CANCEL_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int CANCEL_REASON_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 取消說明原因
   * </pre>
   *
   * <code>NO_REASON = 1;</code>
   */
  public static final int NO_REASON_VALUE = 1;


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
  public static CancelReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CancelReason forNumber(int value) {
    switch (value) {
      case 0: return CANCEL_REASON_UNSPECIFIED;
      case 1: return NO_REASON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CancelReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CancelReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CancelReason>() {
          public CancelReason findValueByNumber(int number) {
            return CancelReason.forNumber(number);
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
    return com.wecasino.proto.games.roulette.RecordProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final CancelReason[] VALUES = values();

  public static CancelReason valueOf(
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

  private CancelReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.roulette.CancelReason)
}
