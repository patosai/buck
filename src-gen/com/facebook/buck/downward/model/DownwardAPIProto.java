// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/downwardapi/resources/proto/downward_api.proto

package com.facebook.buck.downward.model;

@javax.annotation.Generated(value="protoc", comments="annotations:DownwardAPIProto.java.pb.meta")
public final class DownwardAPIProto {
  private DownwardAPIProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_EventTypeMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_EventTypeMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ConsoleEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ConsoleEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_LogEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_LogEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_StepEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_StepEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ChromeTraceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ChromeTraceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_EndEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_EndEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ExternalEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ExternalEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ExternalEvent_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ExternalEvent_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ResultEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ResultEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_PipelineFinishedEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_PipelineFinishedEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDsrc/com/facebook/buck/downwardapi/reso" +
      "urces/proto/downward_api.proto\022\017downward" +
      ".api.v1\032\036google/protobuf/duration.proto\"" +
      "\212\002\n\020EventTypeMessage\022?\n\nevent_type\030\001 \001(\016" +
      "2+.downward.api.v1.EventTypeMessage.Even" +
      "tType\"\264\001\n\tEventType\022\013\n\007UNKNOWN\020\000\022\021\n\rCONS" +
      "OLE_EVENT\020\001\022\r\n\tLOG_EVENT\020\002\022\026\n\022CHROME_TRA" +
      "CE_EVENT\020\003\022\016\n\nSTEP_EVENT\020\004\022\022\n\016EXTERNAL_E" +
      "VENT\020\005\022\020\n\014RESULT_EVENT\020\006\022\033\n\027PIPELINE_FIN" +
      "ISHED_EVENT\020\007\022\r\n\tEND_EVENT\020d\"M\n\014ConsoleE" +
      "vent\022,\n\tlog_level\030\001 \001(\0162\031.downward.api.v" +
      "1.LogLevel\022\017\n\007message\030\002 \001(\t\"^\n\010LogEvent\022" +
      ",\n\tlog_level\030\001 \001(\0162\031.downward.api.v1.Log" +
      "Level\022\017\n\007message\030\002 \001(\t\022\023\n\013logger_name\030\003 " +
      "\001(\t\"\367\001\n\tStepEvent\022\020\n\010event_id\030\001 \001(\005\022:\n\013s" +
      "tep_status\030\002 \001(\0162%.downward.api.v1.StepE" +
      "vent.StepStatus\022\021\n\tstep_type\030\003 \001(\t\022\023\n\013de" +
      "scription\030\004 \001(\t\022+\n\010duration\030\005 \001(\0132\031.goog" +
      "le.protobuf.Duration\022\021\n\taction_id\030\006 \001(\t\"" +
      "4\n\nStepStatus\022\013\n\007UNKNOWN\020\000\022\013\n\007STARTED\020\001\022" +
      "\014\n\010FINISHED\020\002\"\362\002\n\020ChromeTraceEvent\022\020\n\010ev" +
      "ent_id\030\001 \001(\005\022\020\n\010category\030\002 \001(\t\022H\n\006status" +
      "\030\003 \001(\01628.downward.api.v1.ChromeTraceEven" +
      "t.ChromeTraceEventStatus\0229\n\004data\030\004 \003(\0132+" +
      ".downward.api.v1.ChromeTraceEvent.DataEn" +
      "try\022+\n\010duration\030\005 \001(\0132\031.google.protobuf." +
      "Duration\022\r\n\005title\030\006 \001(\t\022\021\n\taction_id\030\007 \001" +
      "(\t\032+\n\tDataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 " +
      "\001(\t:\0028\001\"9\n\026ChromeTraceEventStatus\022\013\n\007UNK" +
      "NOWN\020\000\022\t\n\005BEGIN\020\001\022\007\n\003END\020\002\"\n\n\010EndEvent\"t" +
      "\n\rExternalEvent\0226\n\004data\030\001 \003(\0132(.downward" +
      ".api.v1.ExternalEvent.DataEntry\032+\n\tDataE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"D\n\013" +
      "ResultEvent\022\021\n\taction_id\030\001 \001(\t\022\021\n\texit_c" +
      "ode\030\002 \001(\005\022\017\n\007message\030\003 \001(\t\"*\n\025PipelineFi" +
      "nishedEvent\022\021\n\taction_id\030\001 \003(\t*W\n\010LogLev" +
      "el\022\013\n\007UNKNOWN\020\000\022\t\n\005FATAL\020\001\022\t\n\005ERROR\020\002\022\010\n" +
      "\004WARN\020\003\022\010\n\004INFO\020\004\022\t\n\005DEBUG\020\005\022\t\n\005TRACE\020\006B" +
      "6\n com.facebook.buck.downward.modelB\020Dow" +
      "nwardAPIProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        }, assigner);
    internal_static_downward_api_v1_EventTypeMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_downward_api_v1_EventTypeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_EventTypeMessage_descriptor,
        new java.lang.String[] { "EventType", });
    internal_static_downward_api_v1_ConsoleEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_downward_api_v1_ConsoleEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ConsoleEvent_descriptor,
        new java.lang.String[] { "LogLevel", "Message", });
    internal_static_downward_api_v1_LogEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_downward_api_v1_LogEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_LogEvent_descriptor,
        new java.lang.String[] { "LogLevel", "Message", "LoggerName", });
    internal_static_downward_api_v1_StepEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_downward_api_v1_StepEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_StepEvent_descriptor,
        new java.lang.String[] { "EventId", "StepStatus", "StepType", "Description", "Duration", "ActionId", });
    internal_static_downward_api_v1_ChromeTraceEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_downward_api_v1_ChromeTraceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ChromeTraceEvent_descriptor,
        new java.lang.String[] { "EventId", "Category", "Status", "Data", "Duration", "Title", "ActionId", });
    internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_descriptor =
      internal_static_downward_api_v1_ChromeTraceEvent_descriptor.getNestedTypes().get(0);
    internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_downward_api_v1_EndEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_downward_api_v1_EndEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_EndEvent_descriptor,
        new java.lang.String[] { });
    internal_static_downward_api_v1_ExternalEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_downward_api_v1_ExternalEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ExternalEvent_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_downward_api_v1_ExternalEvent_DataEntry_descriptor =
      internal_static_downward_api_v1_ExternalEvent_descriptor.getNestedTypes().get(0);
    internal_static_downward_api_v1_ExternalEvent_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ExternalEvent_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_downward_api_v1_ResultEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_downward_api_v1_ResultEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ResultEvent_descriptor,
        new java.lang.String[] { "ActionId", "ExitCode", "Message", });
    internal_static_downward_api_v1_PipelineFinishedEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_downward_api_v1_PipelineFinishedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_PipelineFinishedEvent_descriptor,
        new java.lang.String[] { "ActionId", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
