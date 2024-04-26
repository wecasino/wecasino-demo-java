// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/recorder.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface RecordShiftStartedRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.RecordShiftStartedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 遊戲供應
   * </pre>
   *
   * <code>string supplier = 2 [json_name = "supplier"];</code>
   * @return The supplier.
   */
  java.lang.String getSupplier();
  /**
   * <pre>
   * 遊戲供應
   * </pre>
   *
   * <code>string supplier = 2 [json_name = "supplier"];</code>
   * @return The bytes for supplier.
   */
  com.google.protobuf.ByteString
      getSupplierBytes();

  /**
   * <pre>
   * 遊戲類型
   * </pre>
   *
   * <code>string game_type = 3 [json_name = "gameType"];</code>
   * @return The gameType.
   */
  java.lang.String getGameType();
  /**
   * <pre>
   * 遊戲類型
   * </pre>
   *
   * <code>string game_type = 3 [json_name = "gameType"];</code>
   * @return The bytes for gameType.
   */
  com.google.protobuf.ByteString
      getGameTypeBytes();

  /**
   * <pre>
   * 遊戲子類型
   * </pre>
   *
   * <code>string game_subtype = 4 [json_name = "gameSubtype"];</code>
   * @return The gameSubtype.
   */
  java.lang.String getGameSubtype();
  /**
   * <pre>
   * 遊戲子類型
   * </pre>
   *
   * <code>string game_subtype = 4 [json_name = "gameSubtype"];</code>
   * @return The bytes for gameSubtype.
   */
  com.google.protobuf.ByteString
      getGameSubtypeBytes();

  /**
   * <pre>
   * 遊戲版本
   * </pre>
   *
   * <code>string game_version = 5 [json_name = "gameVersion"];</code>
   * @return The gameVersion.
   */
  java.lang.String getGameVersion();
  /**
   * <pre>
   * 遊戲版本
   * </pre>
   *
   * <code>string game_version = 5 [json_name = "gameVersion"];</code>
   * @return The bytes for gameVersion.
   */
  com.google.protobuf.ByteString
      getGameVersionBytes();

  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 6 [json_name = "gameCode"];</code>
   * @return The gameCode.
   */
  java.lang.String getGameCode();
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 6 [json_name = "gameCode"];</code>
   * @return The bytes for gameCode.
   */
  com.google.protobuf.ByteString
      getGameCodeBytes();

  /**
   * <pre>
   * 桌代碼
   * </pre>
   *
   * <code>string table_code = 7 [json_name = "tableCode"];</code>
   * @return The tableCode.
   */
  java.lang.String getTableCode();
  /**
   * <pre>
   * 桌代碼
   * </pre>
   *
   * <code>string table_code = 7 [json_name = "tableCode"];</code>
   * @return The bytes for tableCode.
   */
  com.google.protobuf.ByteString
      getTableCodeBytes();

  /**
   * <pre>
   * 班代碼
   * </pre>
   *
   * <code>string shift_code = 8 [json_name = "shiftCode"];</code>
   * @return The shiftCode.
   */
  java.lang.String getShiftCode();
  /**
   * <pre>
   * 班代碼
   * </pre>
   *
   * <code>string shift_code = 8 [json_name = "shiftCode"];</code>
   * @return The bytes for shiftCode.
   */
  com.google.protobuf.ByteString
      getShiftCodeBytes();

  /**
   * <pre>
   * 開始時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_start = 16 [json_name = "tsStart"];</code>
   * @return Whether the tsStart field is set.
   */
  boolean hasTsStart();
  /**
   * <pre>
   * 開始時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_start = 16 [json_name = "tsStart"];</code>
   * @return The tsStart.
   */
  com.google.protobuf.Timestamp getTsStart();
  /**
   * <pre>
   * 開始時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_start = 16 [json_name = "tsStart"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTsStartOrBuilder();

  /**
   * <pre>
   * 標籤
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * 標籤
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * 標籤
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * 標籤
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  /* nullable */
java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * 標籤
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  java.lang.String getTagsOrThrow(
      java.lang.String key);
}
