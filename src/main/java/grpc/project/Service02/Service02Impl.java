// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service02.proto

package grpc.project.Service02;

public final class Service02Impl {
  private Service02Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Service02_SetSecurityProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Service02_SetSecurityProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Service02_SetSecurityProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Service02_SetSecurityProfileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Service02_VerifyPreApprovalMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Service02_VerifyPreApprovalMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Service02_VerifyPreApprovalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Service02_VerifyPreApprovalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Service02_RequestTwoFAMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Service02_RequestTwoFAMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Service02_RequestTwoFAResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Service02_RequestTwoFAResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Service02.proto\022\tService02\"r\n\031SetSecur" +
      "ityProfileRequest\022\017\n\007user_id\030\001 \001(\t\022\026\n\016se" +
      "curity_level\030\002 \001(\t\022\023\n\013secure_flag\030\003 \001(\010\022" +
      "\027\n\017employment_type\030\004 \001(\t\"p\n\032SetSecurityP" +
      "rofileResponse\022\017\n\007user_id\030\001 \001(\t\022\026\n\016secur" +
      "ity_level\030\002 \001(\t\022\027\n\017two_factor_auth\030\003 \001(\010" +
      "\022\020\n\010date_set\030\004 \001(\t\"\'\n\024VerifyPreApprovalM" +
      "sg\022\017\n\007user_id\030\001 \001(\t\"+\n\031VerifyPreApproval" +
      "Response\022\016\n\006result\030\001 \001(\t\"\"\n\017RequestTwoFA" +
      "Msg\022\017\n\007user_id\030\001 \001(\t\"&\n\024RequestTwoFAResp" +
      "onse\022\016\n\006result\030\001 \001(\t2\243\002\n\rAccessControl\022e" +
      "\n\022SetSecurityProfile\022$.Service02.SetSecu" +
      "rityProfileRequest\032%.Service02.SetSecuri" +
      "tyProfileResponse\"\0000\001\022\\\n\021VerifyPreApprov" +
      "al\022\037.Service02.VerifyPreApprovalMsg\032$.Se" +
      "rvice02.VerifyPreApprovalResponse\"\000\022M\n\014R" +
      "equestTwoFA\022\032.Service02.RequestTwoFAMsg\032" +
      "\037.Service02.RequestTwoFAResponse\"\000B)\n\026gr" +
      "pc.project.Service02B\rService02ImplP\001b\006p" +
      "roto3"
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
        }, assigner);
    internal_static_Service02_SetSecurityProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Service02_SetSecurityProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Service02_SetSecurityProfileRequest_descriptor,
        new java.lang.String[] { "UserId", "SecurityLevel", "SecureFlag", "EmploymentType", });
    internal_static_Service02_SetSecurityProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Service02_SetSecurityProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Service02_SetSecurityProfileResponse_descriptor,
        new java.lang.String[] { "UserId", "SecurityLevel", "TwoFactorAuth", "DateSet", });
    internal_static_Service02_VerifyPreApprovalMsg_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Service02_VerifyPreApprovalMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Service02_VerifyPreApprovalMsg_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_Service02_VerifyPreApprovalResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Service02_VerifyPreApprovalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Service02_VerifyPreApprovalResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_Service02_RequestTwoFAMsg_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Service02_RequestTwoFAMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Service02_RequestTwoFAMsg_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_Service02_RequestTwoFAResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Service02_RequestTwoFAResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Service02_RequestTwoFAResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
