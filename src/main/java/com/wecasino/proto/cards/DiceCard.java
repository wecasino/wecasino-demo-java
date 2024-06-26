// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cards/dice.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.cards;

/**
 * Protobuf enum {@code cards.DiceCard}
 */
public enum DiceCard
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>DICE_CARD_UNSPECIFIED = 0;</code>
   */
  DICE_CARD_UNSPECIFIED(0),
  /**
   * <code>DICE_1 = 1;</code>
   */
  DICE_1(1),
  /**
   * <code>DICE_2 = 2;</code>
   */
  DICE_2(2),
  /**
   * <code>DICE_3 = 3;</code>
   */
  DICE_3(3),
  /**
   * <code>DICE_4 = 4;</code>
   */
  DICE_4(4),
  /**
   * <code>DICE_5 = 5;</code>
   */
  DICE_5(5),
  /**
   * <code>DICE_6 = 6;</code>
   */
  DICE_6(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>DICE_CARD_UNSPECIFIED = 0;</code>
   */
  public static final int DICE_CARD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DICE_1 = 1;</code>
   */
  public static final int DICE_1_VALUE = 1;
  /**
   * <code>DICE_2 = 2;</code>
   */
  public static final int DICE_2_VALUE = 2;
  /**
   * <code>DICE_3 = 3;</code>
   */
  public static final int DICE_3_VALUE = 3;
  /**
   * <code>DICE_4 = 4;</code>
   */
  public static final int DICE_4_VALUE = 4;
  /**
   * <code>DICE_5 = 5;</code>
   */
  public static final int DICE_5_VALUE = 5;
  /**
   * <code>DICE_6 = 6;</code>
   */
  public static final int DICE_6_VALUE = 6;


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
  public static DiceCard valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DiceCard forNumber(int value) {
    switch (value) {
      case 0: return DICE_CARD_UNSPECIFIED;
      case 1: return DICE_1;
      case 2: return DICE_2;
      case 3: return DICE_3;
      case 4: return DICE_4;
      case 5: return DICE_5;
      case 6: return DICE_6;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiceCard>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiceCard> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiceCard>() {
          public DiceCard findValueByNumber(int number) {
            return DiceCard.forNumber(number);
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
    return com.wecasino.proto.cards.DiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DiceCard[] VALUES = values();

  public static DiceCard valueOf(
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

  private DiceCard(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cards.DiceCard)
}

