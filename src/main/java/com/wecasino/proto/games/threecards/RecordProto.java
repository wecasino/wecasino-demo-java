// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/threecards/record.proto
// Protobuf Java Version: 4.26.1

package com.wecasino.proto.games.threecards;

public final class RecordProto {
  private RecordProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      RecordProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035games/threecards/record.proto\022\020games.t" +
      "hreecards*a\n\013GameSubtype\022\037\n\033THREECARDS_T" +
      "YPE_UNSPECIFIED\020\000\022\026\n\022THREECARDS_CLASSIC\020" +
      "\001\022\031\n\025THREECARDS_BLOCKCHAIN\020\020*\325\002\n\004Step\022\024\n" +
      "\020STEP_UNSPECIFIED\020\000\022\017\n\013ROUND_START\020\001\022\022\n\016" +
      "ROUND_FINISHED\020\002\022\022\n\016ROUND_CANCELED\020\003\022\017\n\013" +
      "DEAL_LEFT_1\020\004\022\020\n\014DEAL_RIGHT_1\020\005\022\017\n\013DEAL_" +
      "LEFT_2\020\006\022\020\n\014DEAL_RIGHT_2\020\007\022\017\n\013DEAL_LEFT_" +
      "3\020\010\022\020\n\014DEAL_RIGHT_3\020\t\022\r\n\tROUND_BET\020\014\022\017\n\013" +
      "NO_MORE_BET\020\r\022\020\n\014SHOW_LEFT_12\020\020\022\021\n\rSHOW_" +
      "RIGHT_12\020\021\022\017\n\013SHOW_LEFT_3\020\022\022\020\n\014SHOW_RIGH" +
      "T_3\020\023\022\022\n\016DEALER_CONFIRM\020\024\022\031\n\025PITBOSS_MOD" +
      "IFY_NORMAL\020\030*\215\001\n\013CardPattern\022\034\n\030CARD_PAT" +
      "TERN_UNSPECIFIED\020\000\022\010\n\004HIGH\020\001\022\010\n\004PAIR\020\002\022\014" +
      "\n\010STRAIGHT\020\003\022\t\n\005FLUSH\020\004\022\022\n\016STRAIGHT_FLUS" +
      "H\020\005\022\013\n\007LEOPARD\020\006\022\022\n\016LEOPARD_KILLER\020\007B\223\001\n" +
      "#com.wecasino.proto.games.threecardsB\013Re" +
      "cordProtoP\001\242\002\003GTX\252\002\020Games.Threecards\312\002\020G" +
      "ames\\Threecards\342\002\034Games\\Threecards\\GPBMe" +
      "tadata\352\002\021Games::Threecardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
