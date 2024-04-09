// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface ArticleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.Article)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 標題
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 標題
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 副標
   * </pre>
   *
   * <code>string subtitle = 2 [json_name = "subtitle"];</code>
   * @return The subtitle.
   */
  java.lang.String getSubtitle();
  /**
   * <pre>
   * 副標
   * </pre>
   *
   * <code>string subtitle = 2 [json_name = "subtitle"];</code>
   * @return The bytes for subtitle.
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  /**
   * <pre>
   * 內文
   * </pre>
   *
   * <code>string text = 3 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 內文
   * </pre>
   *
   * <code>string text = 3 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * 附加媒體：key: 媒體資源代碼；value: 媒體內容。
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 4 [json_name = "medias"];</code>
   */
  int getMediasCount();
  /**
   * <pre>
   * 附加媒體：key: 媒體資源代碼；value: 媒體內容。
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 4 [json_name = "medias"];</code>
   */
  boolean containsMedias(
      java.lang.String key);
  /**
   * Use {@link #getMediasMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMedias();
  /**
   * <pre>
   * 附加媒體：key: 媒體資源代碼；value: 媒體內容。
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 4 [json_name = "medias"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMediasMap();
  /**
   * <pre>
   * 附加媒體：key: 媒體資源代碼；value: 媒體內容。
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 4 [json_name = "medias"];</code>
   */
  /* nullable */
java.lang.String getMediasOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * 附加媒體：key: 媒體資源代碼；value: 媒體內容。
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 4 [json_name = "medias"];</code>
   */
  java.lang.String getMediasOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 子文檔
   * </pre>
   *
   * <code>map&lt;string, .recorder.Article&gt; sections = 5 [json_name = "sections"];</code>
   */
  int getSectionsCount();
  /**
   * <pre>
   * 子文檔
   * </pre>
   *
   * <code>map&lt;string, .recorder.Article&gt; sections = 5 [json_name = "sections"];</code>
   */
  boolean containsSections(
      java.lang.String key);
  /**
   * Use {@link #getSectionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.wecasino.proto.recorder.Article>
  getSections();
  /**
   * <pre>
   * 子文檔
   * </pre>
   *
   * <code>map&lt;string, .recorder.Article&gt; sections = 5 [json_name = "sections"];</code>
   */
  java.util.Map<java.lang.String, com.wecasino.proto.recorder.Article>
  getSectionsMap();
  /**
   * <pre>
   * 子文檔
   * </pre>
   *
   * <code>map&lt;string, .recorder.Article&gt; sections = 5 [json_name = "sections"];</code>
   */
  /* nullable */
com.wecasino.proto.recorder.Article getSectionsOrDefault(
      java.lang.String key,
      /* nullable */
com.wecasino.proto.recorder.Article defaultValue);
  /**
   * <pre>
   * 子文檔
   * </pre>
   *
   * <code>map&lt;string, .recorder.Article&gt; sections = 5 [json_name = "sections"];</code>
   */
  com.wecasino.proto.recorder.Article getSectionsOrThrow(
      java.lang.String key);
}