// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service01.proto

package grpc.project.Service01;

public interface SecurityProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Service01.SecurityProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string security_level = 1;</code>
   */
  java.lang.String getSecurityLevel();
  /**
   * <code>string security_level = 1;</code>
   */
  com.google.protobuf.ByteString
      getSecurityLevelBytes();

  /**
   * <code>bool secure_flag = 2;</code>
   */
  boolean getSecureFlag();

  /**
   * <code>bool two_factor_auth = 3;</code>
   */
  boolean getTwoFactorAuth();

  /**
   * <code>string employment_type = 4;</code>
   */
  java.lang.String getEmploymentType();
  /**
   * <code>string employment_type = 4;</code>
   */
  com.google.protobuf.ByteString
      getEmploymentTypeBytes();

  /**
   * <code>string access_date = 5;</code>
   */
  java.lang.String getAccessDate();
  /**
   * <code>string access_date = 5;</code>
   */
  com.google.protobuf.ByteString
      getAccessDateBytes();
}
