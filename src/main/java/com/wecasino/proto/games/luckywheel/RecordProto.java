// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/luckywheel/record.proto
// Protobuf Java Version: 4.26.1

package com.wecasino.proto.games.luckywheel;

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
      "\n\035games/luckywheel/record.proto\022\020games.l" +
      "uckywheel*^\n\013GameSubtype\022\037\n\033LUCKYWHEEL_T" +
      "YPE_UNSPECIFIED\020\000\022\026\n\022LUCKYWHEEL_MAHJONG\020" +
      "\001\022\026\n\022LUCKYWHEEL_RAINBOW\020\002*\236\001\n\004Step\022\024\n\020ST" +
      "EP_UNSPECIFIED\020\000\022\017\n\013ROUND_START\020\001\022\022\n\016ROU" +
      "ND_FINISHED\020\002\022\022\n\016ROUND_CANCELED\020\003\022\r\n\tROU" +
      "ND_BET\020\004\022\017\n\013NO_MORE_BET\020\005\022\016\n\nSPIN_WHEEL\020" +
      "\010\022\027\n\023PITBOSS_MODIFY_BOWL\020\020*c\n\020ResultReco" +
      "rdType\022\"\n\036RESULT_RECORD_TYPE_UNSPECIFIED" +
      "\020\000\022\020\n\014ROUND_FINISH\020\001\022\031\n\025PITBOSS_MODIFY_R" +
      "ESULT\020\002B\315\001\n#com.wecasino.proto.games.luc" +
      "kywheelB\013RecordProtoP\001Z8github.com/wecas" +
      "ino/wecasino-proto/pbgo/games/luckywheel" +
      "\242\002\003GLX\252\002\020Games.Luckywheel\312\002\020Games\\Luckyw" +
      "heel\342\002\034Games\\Luckywheel\\GPBMetadata\352\002\021Ga" +
      "mes::Luckywheelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
