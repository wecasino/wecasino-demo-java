// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface GetCurrentRecordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.GetCurrentRecordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 1 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The gameCode.
   */
  java.lang.String getGameCode();
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 1 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for gameCode.
   */
  com.google.protobuf.ByteString
      getGameCodeBytes();
}