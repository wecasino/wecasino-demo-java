// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface ListRecordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.ListRecordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 查詢起時
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_from = 1 [json_name = "tsFrom"];</code>
   * @return Whether the tsFrom field is set.
   */
  boolean hasTsFrom();
  /**
   * <pre>
   * 查詢起時
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_from = 1 [json_name = "tsFrom"];</code>
   * @return The tsFrom.
   */
  com.google.protobuf.Timestamp getTsFrom();
  /**
   * <pre>
   * 查詢起時
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_from = 1 [json_name = "tsFrom"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTsFromOrBuilder();

  /**
   * <pre>
   * 查詢終時
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_to = 2 [json_name = "tsTo"];</code>
   * @return Whether the tsTo field is set.
   */
  boolean hasTsTo();
  /**
   * <pre>
   * 查詢終時
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_to = 2 [json_name = "tsTo"];</code>
   * @return The tsTo.
   */
  com.google.protobuf.Timestamp getTsTo();
  /**
   * <pre>
   * 查詢終時
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_to = 2 [json_name = "tsTo"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTsToOrBuilder();

  /**
   * <pre>
   * 遊戲類型
   * </pre>
   *
   * <code>optional .games.GameType game_type = 3 [json_name = "gameType"];</code>
   * @return Whether the gameType field is set.
   */
  boolean hasGameType();
  /**
   * <pre>
   * 遊戲類型
   * </pre>
   *
   * <code>optional .games.GameType game_type = 3 [json_name = "gameType"];</code>
   * @return The enum numeric value on the wire for gameType.
   */
  int getGameTypeValue();
  /**
   * <pre>
   * 遊戲類型
   * </pre>
   *
   * <code>optional .games.GameType game_type = 3 [json_name = "gameType"];</code>
   * @return The gameType.
   */
  com.wecasino.proto.games.GameType getGameType();

  /**
   * <pre>
   * 遊戲子類型
   * </pre>
   *
   * <code>optional int32 game_subtype = 4 [json_name = "gameSubtype"];</code>
   * @return Whether the gameSubtype field is set.
   */
  boolean hasGameSubtype();
  /**
   * <pre>
   * 遊戲子類型
   * </pre>
   *
   * <code>optional int32 game_subtype = 4 [json_name = "gameSubtype"];</code>
   * @return The gameSubtype.
   */
  int getGameSubtype();

  /**
   * <pre>
   * 遊戲供應
   * </pre>
   *
   * <code>optional string supplier = 5 [json_name = "supplier"];</code>
   * @return Whether the supplier field is set.
   */
  boolean hasSupplier();
  /**
   * <pre>
   * 遊戲供應
   * </pre>
   *
   * <code>optional string supplier = 5 [json_name = "supplier"];</code>
   * @return The supplier.
   */
  java.lang.String getSupplier();
  /**
   * <pre>
   * 遊戲供應
   * </pre>
   *
   * <code>optional string supplier = 5 [json_name = "supplier"];</code>
   * @return The bytes for supplier.
   */
  com.google.protobuf.ByteString
      getSupplierBytes();

  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>optional string game_code = 6 [json_name = "gameCode"];</code>
   * @return Whether the gameCode field is set.
   */
  boolean hasGameCode();
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>optional string game_code = 6 [json_name = "gameCode"];</code>
   * @return The gameCode.
   */
  java.lang.String getGameCode();
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>optional string game_code = 6 [json_name = "gameCode"];</code>
   * @return The bytes for gameCode.
   */
  com.google.protobuf.ByteString
      getGameCodeBytes();

  /**
   * <pre>
   * pagination next page
   * </pre>
   *
   * <code>optional string search_after = 8 [json_name = "searchAfter"];</code>
   * @return Whether the searchAfter field is set.
   */
  boolean hasSearchAfter();
  /**
   * <pre>
   * pagination next page
   * </pre>
   *
   * <code>optional string search_after = 8 [json_name = "searchAfter"];</code>
   * @return The searchAfter.
   */
  java.lang.String getSearchAfter();
  /**
   * <pre>
   * pagination next page
   * </pre>
   *
   * <code>optional string search_after = 8 [json_name = "searchAfter"];</code>
   * @return The bytes for searchAfter.
   */
  com.google.protobuf.ByteString
      getSearchAfterBytes();

  /**
   * <pre>
   * pagination previous page
   * </pre>
   *
   * <code>optional string search_before = 9 [json_name = "searchBefore"];</code>
   * @return Whether the searchBefore field is set.
   */
  boolean hasSearchBefore();
  /**
   * <pre>
   * pagination previous page
   * </pre>
   *
   * <code>optional string search_before = 9 [json_name = "searchBefore"];</code>
   * @return The searchBefore.
   */
  java.lang.String getSearchBefore();
  /**
   * <pre>
   * pagination previous page
   * </pre>
   *
   * <code>optional string search_before = 9 [json_name = "searchBefore"];</code>
   * @return The bytes for searchBefore.
   */
  com.google.protobuf.ByteString
      getSearchBeforeBytes();

  /**
   * <pre>
   * 頁數 1開始，0表示未填，改為1
   * </pre>
   *
   * <code>int64 page = 10 [json_name = "page"];</code>
   * @return The page.
   */
  long getPage();

  /**
   * <pre>
   * 每頁筆數
   * </pre>
   *
   * <code>int64 page_size = 11 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  long getPageSize();
}
