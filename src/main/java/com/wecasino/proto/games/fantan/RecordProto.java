// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/fantan/record.proto
// Protobuf Java Version: 4.26.1

package com.wecasino.proto.games.fantan;

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
      "\n\031games/fantan/record.proto\022\014games.fanta" +
      "n*U\n\013GameSubtype\022\033\n\027FANTAN_TYPE_UNSPECIF" +
      "IED\020\000\022\022\n\016FANTAN_CLASSIC\020\001\022\025\n\021FANTAN_BLOC" +
      "KCHAIN\020\020*\244\001\n\004Step\022\024\n\020STEP_UNSPECIFIED\020\000\022" +
      "\017\n\013ROUND_START\020\001\022\022\n\016ROUND_FINISHED\020\002\022\022\n\016" +
      "ROUND_CANCELED\020\003\022\r\n\tROUND_BET\020\004\022\017\n\013NO_MO" +
      "RE_BET\020\005\022\024\n\020GRAB_DICE_AMOUNT\020\010\022\027\n\023PITBOS" +
      "S_MODIFY_BOWL\020\020*c\n\020ResultRecordType\022\"\n\036R" +
      "ESULT_RECORD_TYPE_UNSPECIFIED\020\000\022\020\n\014ROUND" +
      "_FINISH\020\001\022\031\n\025PITBOSS_MODIFY_RESULT\020\002B\265\001\n" +
      "\037com.wecasino.proto.games.fantanB\013Record" +
      "ProtoP\001Z4github.com/wecasino/wecasino-pr" +
      "oto/pbgo/games/fantan\242\002\003GFX\252\002\014Games.Fant" +
      "an\312\002\014Games\\Fantan\342\002\030Games\\Fantan\\GPBMeta" +
      "data\352\002\rGames::Fantanb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}