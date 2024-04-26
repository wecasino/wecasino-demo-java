// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cards/cards.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.cards;

/**
 * Protobuf enum {@code cards.CardType}
 */
public enum CardType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>CARD_TYPE_UNSPECIFIED = 0;</code>
   */
  CARD_TYPE_UNSPECIFIED(0),
  /**
   * <code>INT = 1;</code>
   */
  INT(1),
  /**
   * <code>POKER = 2;</code>
   */
  POKER(2),
  /**
   * <code>DICE = 3;</code>
   */
  DICE(3),
  /**
   * <code>ROULETTE = 4;</code>
   */
  ROULETTE(4),
  /**
   * <code>WHEEL = 5;</code>
   */
  WHEEL(5),
  /**
   * <code>FLOW = 6;</code>
   */
  FLOW(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>CARD_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CARD_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>INT = 1;</code>
   */
  public static final int INT_VALUE = 1;
  /**
   * <code>POKER = 2;</code>
   */
  public static final int POKER_VALUE = 2;
  /**
   * <code>DICE = 3;</code>
   */
  public static final int DICE_VALUE = 3;
  /**
   * <code>ROULETTE = 4;</code>
   */
  public static final int ROULETTE_VALUE = 4;
  /**
   * <code>WHEEL = 5;</code>
   */
  public static final int WHEEL_VALUE = 5;
  /**
   * <code>FLOW = 6;</code>
   */
  public static final int FLOW_VALUE = 6;


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
  public static CardType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CardType forNumber(int value) {
    switch (value) {
      case 0: return CARD_TYPE_UNSPECIFIED;
      case 1: return INT;
      case 2: return POKER;
      case 3: return DICE;
      case 4: return ROULETTE;
      case 5: return WHEEL;
      case 6: return FLOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CardType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CardType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CardType>() {
          public CardType findValueByNumber(int number) {
            return CardType.forNumber(number);
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
    return com.wecasino.proto.cards.CardsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CardType[] VALUES = values();

  public static CardType valueOf(
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

  private CardType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cards.CardType)
}

