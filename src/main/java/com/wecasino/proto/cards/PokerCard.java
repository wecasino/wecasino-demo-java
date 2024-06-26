// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cards/poker.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.cards;

/**
 * <pre>
 * 撲克牌代碼
 * </pre>
 *
 * Protobuf enum {@code cards.PokerCard}
 */
public enum PokerCard
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>POKER_CARD_UNSPECIFIED = 0;</code>
   */
  POKER_CARD_UNSPECIFIED(0),
  /**
   * <pre>
   * 未指定花色
   * </pre>
   *
   * <code>ANY_A = 1;</code>
   */
  ANY_A(1),
  /**
   * <code>ANY_2 = 2;</code>
   */
  ANY_2(2),
  /**
   * <code>ANY_3 = 3;</code>
   */
  ANY_3(3),
  /**
   * <code>ANY_4 = 4;</code>
   */
  ANY_4(4),
  /**
   * <code>ANY_5 = 5;</code>
   */
  ANY_5(5),
  /**
   * <code>ANY_6 = 6;</code>
   */
  ANY_6(6),
  /**
   * <code>ANY_7 = 7;</code>
   */
  ANY_7(7),
  /**
   * <code>ANY_8 = 8;</code>
   */
  ANY_8(8),
  /**
   * <code>ANY_9 = 9;</code>
   */
  ANY_9(9),
  /**
   * <code>ANY_10 = 10;</code>
   */
  ANY_10(10),
  /**
   * <code>ANY_J = 11;</code>
   */
  ANY_J(11),
  /**
   * <code>ANY_Q = 12;</code>
   */
  ANY_Q(12),
  /**
   * <code>ANY_K = 13;</code>
   */
  ANY_K(13),
  /**
   * <code>MASK = 15;</code>
   */
  MASK(15),
  /**
   * <pre>
   * 黑桃
   * </pre>
   *
   * <code>SPADE_ANY = 16;</code>
   */
  SPADE_ANY(16),
  /**
   * <code>SPADE_A = 17;</code>
   */
  SPADE_A(17),
  /**
   * <code>SPADE_2 = 18;</code>
   */
  SPADE_2(18),
  /**
   * <code>SPADE_3 = 19;</code>
   */
  SPADE_3(19),
  /**
   * <code>SPADE_4 = 20;</code>
   */
  SPADE_4(20),
  /**
   * <code>SPADE_5 = 21;</code>
   */
  SPADE_5(21),
  /**
   * <code>SPADE_6 = 22;</code>
   */
  SPADE_6(22),
  /**
   * <code>SPADE_7 = 23;</code>
   */
  SPADE_7(23),
  /**
   * <code>SPADE_8 = 24;</code>
   */
  SPADE_8(24),
  /**
   * <code>SPADE_9 = 25;</code>
   */
  SPADE_9(25),
  /**
   * <code>SPADE_10 = 26;</code>
   */
  SPADE_10(26),
  /**
   * <code>SPADE_J = 27;</code>
   */
  SPADE_J(27),
  /**
   * <code>SPADE_Q = 28;</code>
   */
  SPADE_Q(28),
  /**
   * <code>SPADE_K = 29;</code>
   */
  SPADE_K(29),
  /**
   * <pre>
   * 愛心
   * </pre>
   *
   * <code>HEART_ANY = 32;</code>
   */
  HEART_ANY(32),
  /**
   * <code>HEART_A = 33;</code>
   */
  HEART_A(33),
  /**
   * <code>HEART_2 = 34;</code>
   */
  HEART_2(34),
  /**
   * <code>HEART_3 = 35;</code>
   */
  HEART_3(35),
  /**
   * <code>HEART_4 = 36;</code>
   */
  HEART_4(36),
  /**
   * <code>HEART_5 = 37;</code>
   */
  HEART_5(37),
  /**
   * <code>HEART_6 = 38;</code>
   */
  HEART_6(38),
  /**
   * <code>HEART_7 = 39;</code>
   */
  HEART_7(39),
  /**
   * <code>HEART_8 = 40;</code>
   */
  HEART_8(40),
  /**
   * <code>HEART_9 = 41;</code>
   */
  HEART_9(41),
  /**
   * <code>HEART_10 = 42;</code>
   */
  HEART_10(42),
  /**
   * <code>HEART_J = 43;</code>
   */
  HEART_J(43),
  /**
   * <code>HEART_Q = 44;</code>
   */
  HEART_Q(44),
  /**
   * <code>HEART_K = 45;</code>
   */
  HEART_K(45),
  /**
   * <pre>
   * 梅花
   * </pre>
   *
   * <code>CLUB_ANY = 48;</code>
   */
  CLUB_ANY(48),
  /**
   * <code>CLUB_A = 49;</code>
   */
  CLUB_A(49),
  /**
   * <code>CLUB_2 = 50;</code>
   */
  CLUB_2(50),
  /**
   * <code>CLUB_3 = 51;</code>
   */
  CLUB_3(51),
  /**
   * <code>CLUB_4 = 52;</code>
   */
  CLUB_4(52),
  /**
   * <code>CLUB_5 = 53;</code>
   */
  CLUB_5(53),
  /**
   * <code>CLUB_6 = 54;</code>
   */
  CLUB_6(54),
  /**
   * <code>CLUB_7 = 55;</code>
   */
  CLUB_7(55),
  /**
   * <code>CLUB_8 = 56;</code>
   */
  CLUB_8(56),
  /**
   * <code>CLUB_9 = 57;</code>
   */
  CLUB_9(57),
  /**
   * <code>CLUB_10 = 58;</code>
   */
  CLUB_10(58),
  /**
   * <code>CLUB_J = 59;</code>
   */
  CLUB_J(59),
  /**
   * <code>CLUB_Q = 60;</code>
   */
  CLUB_Q(60),
  /**
   * <code>CLUB_K = 61;</code>
   */
  CLUB_K(61),
  /**
   * <pre>
   * 鑽石
   * </pre>
   *
   * <code>DIAMOND_ANY = 64;</code>
   */
  DIAMOND_ANY(64),
  /**
   * <code>DIAMOND_A = 65;</code>
   */
  DIAMOND_A(65),
  /**
   * <code>DIAMOND_2 = 66;</code>
   */
  DIAMOND_2(66),
  /**
   * <code>DIAMOND_3 = 67;</code>
   */
  DIAMOND_3(67),
  /**
   * <code>DIAMOND_4 = 68;</code>
   */
  DIAMOND_4(68),
  /**
   * <code>DIAMOND_5 = 69;</code>
   */
  DIAMOND_5(69),
  /**
   * <code>DIAMOND_6 = 70;</code>
   */
  DIAMOND_6(70),
  /**
   * <code>DIAMOND_7 = 71;</code>
   */
  DIAMOND_7(71),
  /**
   * <code>DIAMOND_8 = 72;</code>
   */
  DIAMOND_8(72),
  /**
   * <code>DIAMOND_9 = 73;</code>
   */
  DIAMOND_9(73),
  /**
   * <code>DIAMOND_10 = 74;</code>
   */
  DIAMOND_10(74),
  /**
   * <code>DIAMOND_J = 75;</code>
   */
  DIAMOND_J(75),
  /**
   * <code>DIAMOND_Q = 76;</code>
   */
  DIAMOND_Q(76),
  /**
   * <code>DIAMOND_K = 77;</code>
   */
  DIAMOND_K(77),
  /**
   * <pre>
   * 鬼牌
   * </pre>
   *
   * <code>JOKER_COLOR = 94;</code>
   */
  JOKER_COLOR(94),
  /**
   * <code>JOKER_BLACK = 95;</code>
   */
  JOKER_BLACK(95),
  /**
   * <pre>
   * 花色遮罩
   * </pre>
   *
   * <code>SUIT_MASK = 112;</code>
   */
  SUIT_MASK(112),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>POKER_CARD_UNSPECIFIED = 0;</code>
   */
  public static final int POKER_CARD_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 未指定花色
   * </pre>
   *
   * <code>ANY_A = 1;</code>
   */
  public static final int ANY_A_VALUE = 1;
  /**
   * <code>ANY_2 = 2;</code>
   */
  public static final int ANY_2_VALUE = 2;
  /**
   * <code>ANY_3 = 3;</code>
   */
  public static final int ANY_3_VALUE = 3;
  /**
   * <code>ANY_4 = 4;</code>
   */
  public static final int ANY_4_VALUE = 4;
  /**
   * <code>ANY_5 = 5;</code>
   */
  public static final int ANY_5_VALUE = 5;
  /**
   * <code>ANY_6 = 6;</code>
   */
  public static final int ANY_6_VALUE = 6;
  /**
   * <code>ANY_7 = 7;</code>
   */
  public static final int ANY_7_VALUE = 7;
  /**
   * <code>ANY_8 = 8;</code>
   */
  public static final int ANY_8_VALUE = 8;
  /**
   * <code>ANY_9 = 9;</code>
   */
  public static final int ANY_9_VALUE = 9;
  /**
   * <code>ANY_10 = 10;</code>
   */
  public static final int ANY_10_VALUE = 10;
  /**
   * <code>ANY_J = 11;</code>
   */
  public static final int ANY_J_VALUE = 11;
  /**
   * <code>ANY_Q = 12;</code>
   */
  public static final int ANY_Q_VALUE = 12;
  /**
   * <code>ANY_K = 13;</code>
   */
  public static final int ANY_K_VALUE = 13;
  /**
   * <code>MASK = 15;</code>
   */
  public static final int MASK_VALUE = 15;
  /**
   * <pre>
   * 黑桃
   * </pre>
   *
   * <code>SPADE_ANY = 16;</code>
   */
  public static final int SPADE_ANY_VALUE = 16;
  /**
   * <code>SPADE_A = 17;</code>
   */
  public static final int SPADE_A_VALUE = 17;
  /**
   * <code>SPADE_2 = 18;</code>
   */
  public static final int SPADE_2_VALUE = 18;
  /**
   * <code>SPADE_3 = 19;</code>
   */
  public static final int SPADE_3_VALUE = 19;
  /**
   * <code>SPADE_4 = 20;</code>
   */
  public static final int SPADE_4_VALUE = 20;
  /**
   * <code>SPADE_5 = 21;</code>
   */
  public static final int SPADE_5_VALUE = 21;
  /**
   * <code>SPADE_6 = 22;</code>
   */
  public static final int SPADE_6_VALUE = 22;
  /**
   * <code>SPADE_7 = 23;</code>
   */
  public static final int SPADE_7_VALUE = 23;
  /**
   * <code>SPADE_8 = 24;</code>
   */
  public static final int SPADE_8_VALUE = 24;
  /**
   * <code>SPADE_9 = 25;</code>
   */
  public static final int SPADE_9_VALUE = 25;
  /**
   * <code>SPADE_10 = 26;</code>
   */
  public static final int SPADE_10_VALUE = 26;
  /**
   * <code>SPADE_J = 27;</code>
   */
  public static final int SPADE_J_VALUE = 27;
  /**
   * <code>SPADE_Q = 28;</code>
   */
  public static final int SPADE_Q_VALUE = 28;
  /**
   * <code>SPADE_K = 29;</code>
   */
  public static final int SPADE_K_VALUE = 29;
  /**
   * <pre>
   * 愛心
   * </pre>
   *
   * <code>HEART_ANY = 32;</code>
   */
  public static final int HEART_ANY_VALUE = 32;
  /**
   * <code>HEART_A = 33;</code>
   */
  public static final int HEART_A_VALUE = 33;
  /**
   * <code>HEART_2 = 34;</code>
   */
  public static final int HEART_2_VALUE = 34;
  /**
   * <code>HEART_3 = 35;</code>
   */
  public static final int HEART_3_VALUE = 35;
  /**
   * <code>HEART_4 = 36;</code>
   */
  public static final int HEART_4_VALUE = 36;
  /**
   * <code>HEART_5 = 37;</code>
   */
  public static final int HEART_5_VALUE = 37;
  /**
   * <code>HEART_6 = 38;</code>
   */
  public static final int HEART_6_VALUE = 38;
  /**
   * <code>HEART_7 = 39;</code>
   */
  public static final int HEART_7_VALUE = 39;
  /**
   * <code>HEART_8 = 40;</code>
   */
  public static final int HEART_8_VALUE = 40;
  /**
   * <code>HEART_9 = 41;</code>
   */
  public static final int HEART_9_VALUE = 41;
  /**
   * <code>HEART_10 = 42;</code>
   */
  public static final int HEART_10_VALUE = 42;
  /**
   * <code>HEART_J = 43;</code>
   */
  public static final int HEART_J_VALUE = 43;
  /**
   * <code>HEART_Q = 44;</code>
   */
  public static final int HEART_Q_VALUE = 44;
  /**
   * <code>HEART_K = 45;</code>
   */
  public static final int HEART_K_VALUE = 45;
  /**
   * <pre>
   * 梅花
   * </pre>
   *
   * <code>CLUB_ANY = 48;</code>
   */
  public static final int CLUB_ANY_VALUE = 48;
  /**
   * <code>CLUB_A = 49;</code>
   */
  public static final int CLUB_A_VALUE = 49;
  /**
   * <code>CLUB_2 = 50;</code>
   */
  public static final int CLUB_2_VALUE = 50;
  /**
   * <code>CLUB_3 = 51;</code>
   */
  public static final int CLUB_3_VALUE = 51;
  /**
   * <code>CLUB_4 = 52;</code>
   */
  public static final int CLUB_4_VALUE = 52;
  /**
   * <code>CLUB_5 = 53;</code>
   */
  public static final int CLUB_5_VALUE = 53;
  /**
   * <code>CLUB_6 = 54;</code>
   */
  public static final int CLUB_6_VALUE = 54;
  /**
   * <code>CLUB_7 = 55;</code>
   */
  public static final int CLUB_7_VALUE = 55;
  /**
   * <code>CLUB_8 = 56;</code>
   */
  public static final int CLUB_8_VALUE = 56;
  /**
   * <code>CLUB_9 = 57;</code>
   */
  public static final int CLUB_9_VALUE = 57;
  /**
   * <code>CLUB_10 = 58;</code>
   */
  public static final int CLUB_10_VALUE = 58;
  /**
   * <code>CLUB_J = 59;</code>
   */
  public static final int CLUB_J_VALUE = 59;
  /**
   * <code>CLUB_Q = 60;</code>
   */
  public static final int CLUB_Q_VALUE = 60;
  /**
   * <code>CLUB_K = 61;</code>
   */
  public static final int CLUB_K_VALUE = 61;
  /**
   * <pre>
   * 鑽石
   * </pre>
   *
   * <code>DIAMOND_ANY = 64;</code>
   */
  public static final int DIAMOND_ANY_VALUE = 64;
  /**
   * <code>DIAMOND_A = 65;</code>
   */
  public static final int DIAMOND_A_VALUE = 65;
  /**
   * <code>DIAMOND_2 = 66;</code>
   */
  public static final int DIAMOND_2_VALUE = 66;
  /**
   * <code>DIAMOND_3 = 67;</code>
   */
  public static final int DIAMOND_3_VALUE = 67;
  /**
   * <code>DIAMOND_4 = 68;</code>
   */
  public static final int DIAMOND_4_VALUE = 68;
  /**
   * <code>DIAMOND_5 = 69;</code>
   */
  public static final int DIAMOND_5_VALUE = 69;
  /**
   * <code>DIAMOND_6 = 70;</code>
   */
  public static final int DIAMOND_6_VALUE = 70;
  /**
   * <code>DIAMOND_7 = 71;</code>
   */
  public static final int DIAMOND_7_VALUE = 71;
  /**
   * <code>DIAMOND_8 = 72;</code>
   */
  public static final int DIAMOND_8_VALUE = 72;
  /**
   * <code>DIAMOND_9 = 73;</code>
   */
  public static final int DIAMOND_9_VALUE = 73;
  /**
   * <code>DIAMOND_10 = 74;</code>
   */
  public static final int DIAMOND_10_VALUE = 74;
  /**
   * <code>DIAMOND_J = 75;</code>
   */
  public static final int DIAMOND_J_VALUE = 75;
  /**
   * <code>DIAMOND_Q = 76;</code>
   */
  public static final int DIAMOND_Q_VALUE = 76;
  /**
   * <code>DIAMOND_K = 77;</code>
   */
  public static final int DIAMOND_K_VALUE = 77;
  /**
   * <pre>
   * 鬼牌
   * </pre>
   *
   * <code>JOKER_COLOR = 94;</code>
   */
  public static final int JOKER_COLOR_VALUE = 94;
  /**
   * <code>JOKER_BLACK = 95;</code>
   */
  public static final int JOKER_BLACK_VALUE = 95;
  /**
   * <pre>
   * 花色遮罩
   * </pre>
   *
   * <code>SUIT_MASK = 112;</code>
   */
  public static final int SUIT_MASK_VALUE = 112;


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
  public static PokerCard valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PokerCard forNumber(int value) {
    switch (value) {
      case 0: return POKER_CARD_UNSPECIFIED;
      case 1: return ANY_A;
      case 2: return ANY_2;
      case 3: return ANY_3;
      case 4: return ANY_4;
      case 5: return ANY_5;
      case 6: return ANY_6;
      case 7: return ANY_7;
      case 8: return ANY_8;
      case 9: return ANY_9;
      case 10: return ANY_10;
      case 11: return ANY_J;
      case 12: return ANY_Q;
      case 13: return ANY_K;
      case 15: return MASK;
      case 16: return SPADE_ANY;
      case 17: return SPADE_A;
      case 18: return SPADE_2;
      case 19: return SPADE_3;
      case 20: return SPADE_4;
      case 21: return SPADE_5;
      case 22: return SPADE_6;
      case 23: return SPADE_7;
      case 24: return SPADE_8;
      case 25: return SPADE_9;
      case 26: return SPADE_10;
      case 27: return SPADE_J;
      case 28: return SPADE_Q;
      case 29: return SPADE_K;
      case 32: return HEART_ANY;
      case 33: return HEART_A;
      case 34: return HEART_2;
      case 35: return HEART_3;
      case 36: return HEART_4;
      case 37: return HEART_5;
      case 38: return HEART_6;
      case 39: return HEART_7;
      case 40: return HEART_8;
      case 41: return HEART_9;
      case 42: return HEART_10;
      case 43: return HEART_J;
      case 44: return HEART_Q;
      case 45: return HEART_K;
      case 48: return CLUB_ANY;
      case 49: return CLUB_A;
      case 50: return CLUB_2;
      case 51: return CLUB_3;
      case 52: return CLUB_4;
      case 53: return CLUB_5;
      case 54: return CLUB_6;
      case 55: return CLUB_7;
      case 56: return CLUB_8;
      case 57: return CLUB_9;
      case 58: return CLUB_10;
      case 59: return CLUB_J;
      case 60: return CLUB_Q;
      case 61: return CLUB_K;
      case 64: return DIAMOND_ANY;
      case 65: return DIAMOND_A;
      case 66: return DIAMOND_2;
      case 67: return DIAMOND_3;
      case 68: return DIAMOND_4;
      case 69: return DIAMOND_5;
      case 70: return DIAMOND_6;
      case 71: return DIAMOND_7;
      case 72: return DIAMOND_8;
      case 73: return DIAMOND_9;
      case 74: return DIAMOND_10;
      case 75: return DIAMOND_J;
      case 76: return DIAMOND_Q;
      case 77: return DIAMOND_K;
      case 94: return JOKER_COLOR;
      case 95: return JOKER_BLACK;
      case 112: return SUIT_MASK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PokerCard>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PokerCard> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PokerCard>() {
          public PokerCard findValueByNumber(int number) {
            return PokerCard.forNumber(number);
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
    return com.wecasino.proto.cards.PokerProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PokerCard[] VALUES = values();

  public static PokerCard valueOf(
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

  private PokerCard(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cards.PokerCard)
}

