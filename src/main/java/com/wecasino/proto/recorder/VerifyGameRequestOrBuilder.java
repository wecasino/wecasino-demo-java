// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface VerifyGameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.VerifyGameRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 1 [json_name = "gameCode"];</code>
   * @return The gameCode.
   */
  java.lang.String getGameCode();
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 1 [json_name = "gameCode"];</code>
   * @return The bytes for gameCode.
   */
  com.google.protobuf.ByteString
      getGameCodeBytes();

  /**
   * <pre>
   * 驗證傳送接收的代碼
   * </pre>
   *
   * <code>repeated string pattern = 2 [json_name = "pattern"];</code>
   * @return A list containing the pattern.
   */
  java.util.List<java.lang.String>
      getPatternList();
  /**
   * <pre>
   * 驗證傳送接收的代碼
   * </pre>
   *
   * <code>repeated string pattern = 2 [json_name = "pattern"];</code>
   * @return The count of pattern.
   */
  int getPatternCount();
  /**
   * <pre>
   * 驗證傳送接收的代碼
   * </pre>
   *
   * <code>repeated string pattern = 2 [json_name = "pattern"];</code>
   * @param index The index of the element to return.
   * @return The pattern at the given index.
   */
  java.lang.String getPattern(int index);
  /**
   * <pre>
   * 驗證傳送接收的代碼
   * </pre>
   *
   * <code>repeated string pattern = 2 [json_name = "pattern"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the pattern at the given index.
   */
  com.google.protobuf.ByteString
      getPatternBytes(int index);

  /**
   * <pre>
   * 顯示名稱
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 顯示名稱
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
