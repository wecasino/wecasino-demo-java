// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/thebigbattle/record.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.games.thebigbattle;

/**
 * Protobuf enum {@code games.thebigbattle.GameSubtype}
 */
public enum GameSubtype
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>THEBIGBATTLE_TYPE_UNSPECIFIED = 0;</code>
   */
  THEBIGBATTLE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * 經典
   * </pre>
   *
   * <code>THEBIGBATTLE_CLASSIC = 1;</code>
   */
  THEBIGBATTLE_CLASSIC(1),
  /**
   * <pre>
   * 極速龍虎
   * </pre>
   *
   * <code>THEBIGBATTLE_SPEED = 3;</code>
   */
  THEBIGBATTLE_SPEED(3),
  /**
   * <pre>
   * 區塊鏈龍虎
   * </pre>
   *
   * <code>THEBIGBATTLE_BLOCKCHAIN = 16;</code>
   */
  THEBIGBATTLE_BLOCKCHAIN(16),
  /**
   * <pre>
   * 區塊鏈極速龍虎
   * </pre>
   *
   * <code>THEBIGBATTLE_SPEED_BLOCKCHAIN = 18;</code>
   */
  THEBIGBATTLE_SPEED_BLOCKCHAIN(18),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GameSubtype.class.getName());
  }
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>THEBIGBATTLE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int THEBIGBATTLE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 經典
   * </pre>
   *
   * <code>THEBIGBATTLE_CLASSIC = 1;</code>
   */
  public static final int THEBIGBATTLE_CLASSIC_VALUE = 1;
  /**
   * <pre>
   * 極速龍虎
   * </pre>
   *
   * <code>THEBIGBATTLE_SPEED = 3;</code>
   */
  public static final int THEBIGBATTLE_SPEED_VALUE = 3;
  /**
   * <pre>
   * 區塊鏈龍虎
   * </pre>
   *
   * <code>THEBIGBATTLE_BLOCKCHAIN = 16;</code>
   */
  public static final int THEBIGBATTLE_BLOCKCHAIN_VALUE = 16;
  /**
   * <pre>
   * 區塊鏈極速龍虎
   * </pre>
   *
   * <code>THEBIGBATTLE_SPEED_BLOCKCHAIN = 18;</code>
   */
  public static final int THEBIGBATTLE_SPEED_BLOCKCHAIN_VALUE = 18;


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
  public static GameSubtype valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameSubtype forNumber(int value) {
    switch (value) {
      case 0: return THEBIGBATTLE_TYPE_UNSPECIFIED;
      case 1: return THEBIGBATTLE_CLASSIC;
      case 3: return THEBIGBATTLE_SPEED;
      case 16: return THEBIGBATTLE_BLOCKCHAIN;
      case 18: return THEBIGBATTLE_SPEED_BLOCKCHAIN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameSubtype>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameSubtype> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameSubtype>() {
          public GameSubtype findValueByNumber(int number) {
            return GameSubtype.forNumber(number);
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
    return com.wecasino.proto.games.thebigbattle.RecordProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final GameSubtype[] VALUES = values();

  public static GameSubtype valueOf(
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

  private GameSubtype(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.thebigbattle.GameSubtype)
}

