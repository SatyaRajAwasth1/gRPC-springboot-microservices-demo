// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user.proto

package com.example.socialmedia.user;

/**
 * Protobuf type {@code org.example.proto.user.AddUserRequest}
 */
public final class AddUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.proto.user.AddUserRequest)
    AddUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddUserRequest.newBuilder() to construct.
  private AddUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddUserRequest() {
    username_ = "";
    email_ = "";
    fullName_ = "";
    profilePictureUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddUserRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.socialmedia.user.UserProto.internal_static_org_example_proto_user_AddUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.socialmedia.user.UserProto.internal_static_org_example_proto_user_AddUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.socialmedia.user.AddUserRequest.class, com.example.socialmedia.user.AddUserRequest.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   * <code>string email = 2;</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 2;</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FULLNAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fullName_ = "";
  /**
   * <code>string fullName = 3;</code>
   * @return The fullName.
   */
  @java.lang.Override
  public java.lang.String getFullName() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullName_ = s;
      return s;
    }
  }
  /**
   * <code>string fullName = 3;</code>
   * @return The bytes for fullName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFullNameBytes() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROFILEPICTUREURL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object profilePictureUrl_ = "";
  /**
   * <code>string profilePictureUrl = 4;</code>
   * @return The profilePictureUrl.
   */
  @java.lang.Override
  public java.lang.String getProfilePictureUrl() {
    java.lang.Object ref = profilePictureUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      profilePictureUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string profilePictureUrl = 4;</code>
   * @return The bytes for profilePictureUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProfilePictureUrlBytes() {
    java.lang.Object ref = profilePictureUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      profilePictureUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fullName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profilePictureUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, profilePictureUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fullName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profilePictureUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, profilePictureUrl_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.socialmedia.user.AddUserRequest)) {
      return super.equals(obj);
    }
    com.example.socialmedia.user.AddUserRequest other = (com.example.socialmedia.user.AddUserRequest) obj;

    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getFullName()
        .equals(other.getFullName())) return false;
    if (!getProfilePictureUrl()
        .equals(other.getProfilePictureUrl())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + FULLNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullName().hashCode();
    hash = (37 * hash) + PROFILEPICTUREURL_FIELD_NUMBER;
    hash = (53 * hash) + getProfilePictureUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.socialmedia.user.AddUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.socialmedia.user.AddUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.socialmedia.user.AddUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.socialmedia.user.AddUserRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.example.proto.user.AddUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.proto.user.AddUserRequest)
      com.example.socialmedia.user.AddUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.socialmedia.user.UserProto.internal_static_org_example_proto_user_AddUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.socialmedia.user.UserProto.internal_static_org_example_proto_user_AddUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.socialmedia.user.AddUserRequest.class, com.example.socialmedia.user.AddUserRequest.Builder.class);
    }

    // Construct using com.example.socialmedia.user.AddUserRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      username_ = "";
      email_ = "";
      fullName_ = "";
      profilePictureUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.socialmedia.user.UserProto.internal_static_org_example_proto_user_AddUserRequest_descriptor;
    }

    @java.lang.Override
    public com.example.socialmedia.user.AddUserRequest getDefaultInstanceForType() {
      return com.example.socialmedia.user.AddUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.socialmedia.user.AddUserRequest build() {
      com.example.socialmedia.user.AddUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.socialmedia.user.AddUserRequest buildPartial() {
      com.example.socialmedia.user.AddUserRequest result = new com.example.socialmedia.user.AddUserRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.socialmedia.user.AddUserRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.username_ = username_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.email_ = email_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fullName_ = fullName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.profilePictureUrl_ = profilePictureUrl_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.socialmedia.user.AddUserRequest) {
        return mergeFrom((com.example.socialmedia.user.AddUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.socialmedia.user.AddUserRequest other) {
      if (other == com.example.socialmedia.user.AddUserRequest.getDefaultInstance()) return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFullName().isEmpty()) {
        fullName_ = other.fullName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getProfilePictureUrl().isEmpty()) {
        profilePictureUrl_ = other.profilePictureUrl_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              username_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              email_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              fullName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              profilePictureUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      username_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 2;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      email_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object fullName_ = "";
    /**
     * <code>string fullName = 3;</code>
     * @return The fullName.
     */
    public java.lang.String getFullName() {
      java.lang.Object ref = fullName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fullName = 3;</code>
     * @return The bytes for fullName.
     */
    public com.google.protobuf.ByteString
        getFullNameBytes() {
      java.lang.Object ref = fullName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fullName = 3;</code>
     * @param value The fullName to set.
     * @return This builder for chaining.
     */
    public Builder setFullName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fullName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string fullName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullName() {
      fullName_ = getDefaultInstance().getFullName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string fullName = 3;</code>
     * @param value The bytes for fullName to set.
     * @return This builder for chaining.
     */
    public Builder setFullNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fullName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object profilePictureUrl_ = "";
    /**
     * <code>string profilePictureUrl = 4;</code>
     * @return The profilePictureUrl.
     */
    public java.lang.String getProfilePictureUrl() {
      java.lang.Object ref = profilePictureUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        profilePictureUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string profilePictureUrl = 4;</code>
     * @return The bytes for profilePictureUrl.
     */
    public com.google.protobuf.ByteString
        getProfilePictureUrlBytes() {
      java.lang.Object ref = profilePictureUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        profilePictureUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string profilePictureUrl = 4;</code>
     * @param value The profilePictureUrl to set.
     * @return This builder for chaining.
     */
    public Builder setProfilePictureUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      profilePictureUrl_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string profilePictureUrl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProfilePictureUrl() {
      profilePictureUrl_ = getDefaultInstance().getProfilePictureUrl();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string profilePictureUrl = 4;</code>
     * @param value The bytes for profilePictureUrl to set.
     * @return This builder for chaining.
     */
    public Builder setProfilePictureUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      profilePictureUrl_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.example.proto.user.AddUserRequest)
  }

  // @@protoc_insertion_point(class_scope:org.example.proto.user.AddUserRequest)
  private static final com.example.socialmedia.user.AddUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.socialmedia.user.AddUserRequest();
  }

  public static com.example.socialmedia.user.AddUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddUserRequest>() {
    @java.lang.Override
    public AddUserRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AddUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.socialmedia.user.AddUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

