// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * A message and its corresponding acknowledgment ID.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ReceivedMessage}
 */
public final class ReceivedMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ReceivedMessage)
    ReceivedMessageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReceivedMessage.newBuilder() to construct.
  private ReceivedMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReceivedMessage() {
    ackId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReceivedMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              ackId_ = s;
              break;
            }
          case 18:
            {
              com.google.pubsub.v1.PubsubMessage.Builder subBuilder = null;
              if (message_ != null) {
                subBuilder = message_.toBuilder();
              }
              message_ =
                  input.readMessage(com.google.pubsub.v1.PubsubMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(message_);
                message_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              deliveryAttempt_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ReceivedMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ReceivedMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ReceivedMessage.class,
            com.google.pubsub.v1.ReceivedMessage.Builder.class);
  }

  public static final int ACK_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object ackId_;
  /**
   *
   *
   * <pre>
   * This ID can be used to acknowledge the received message.
   * </pre>
   *
   * <code>string ack_id = 1;</code>
   */
  public java.lang.String getAckId() {
    java.lang.Object ref = ackId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ackId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * This ID can be used to acknowledge the received message.
   * </pre>
   *
   * <code>string ack_id = 1;</code>
   */
  public com.google.protobuf.ByteString getAckIdBytes() {
    java.lang.Object ref = ackId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ackId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private com.google.pubsub.v1.PubsubMessage message_;
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  public com.google.pubsub.v1.PubsubMessage getMessage() {
    return message_ == null ? com.google.pubsub.v1.PubsubMessage.getDefaultInstance() : message_;
  }
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  public com.google.pubsub.v1.PubsubMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
  }

  public static final int DELIVERY_ATTEMPT_FIELD_NUMBER = 3;
  private int deliveryAttempt_;
  /**
   *
   *
   * <pre>
   * Delivery attempt counter is 1 + (the sum of number of NACKs and number of
   * ack_deadline exceeds) for this message.
   * A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline
   * exceeds event is whenever a message is not acknowledged within
   * ack_deadline. Note that ack_deadline is initially
   * Subscription.ackDeadlineSeconds, but may get extended automatically by
   * the client library.
   * The first delivery of a given message will have this value as 1. The value
   * is calculated at best effort and is approximate.
   * If a DeadLetterPolicy is not set on the subscription, this will be 0.
   * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
   * API might be changed in backward-incompatible ways and is not recommended
   * for production use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>int32 delivery_attempt = 3;</code>
   */
  public int getDeliveryAttempt() {
    return deliveryAttempt_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getAckIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ackId_);
    }
    if (message_ != null) {
      output.writeMessage(2, getMessage());
    }
    if (deliveryAttempt_ != 0) {
      output.writeInt32(3, deliveryAttempt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAckIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ackId_);
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMessage());
    }
    if (deliveryAttempt_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, deliveryAttempt_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.pubsub.v1.ReceivedMessage)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ReceivedMessage other = (com.google.pubsub.v1.ReceivedMessage) obj;

    if (!getAckId().equals(other.getAckId())) return false;
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage().equals(other.getMessage())) return false;
    }
    if (getDeliveryAttempt() != other.getDeliveryAttempt()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAckId().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (37 * hash) + DELIVERY_ATTEMPT_FIELD_NUMBER;
    hash = (53 * hash) + getDeliveryAttempt();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ReceivedMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.ReceivedMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A message and its corresponding acknowledgment ID.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ReceivedMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ReceivedMessage)
      com.google.pubsub.v1.ReceivedMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ReceivedMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ReceivedMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ReceivedMessage.class,
              com.google.pubsub.v1.ReceivedMessage.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ReceivedMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      ackId_ = "";

      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      deliveryAttempt_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ReceivedMessage_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ReceivedMessage getDefaultInstanceForType() {
      return com.google.pubsub.v1.ReceivedMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ReceivedMessage build() {
      com.google.pubsub.v1.ReceivedMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ReceivedMessage buildPartial() {
      com.google.pubsub.v1.ReceivedMessage result = new com.google.pubsub.v1.ReceivedMessage(this);
      result.ackId_ = ackId_;
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      result.deliveryAttempt_ = deliveryAttempt_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.ReceivedMessage) {
        return mergeFrom((com.google.pubsub.v1.ReceivedMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ReceivedMessage other) {
      if (other == com.google.pubsub.v1.ReceivedMessage.getDefaultInstance()) return this;
      if (!other.getAckId().isEmpty()) {
        ackId_ = other.ackId_;
        onChanged();
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.getDeliveryAttempt() != 0) {
        setDeliveryAttempt(other.getDeliveryAttempt());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.pubsub.v1.ReceivedMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.ReceivedMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ackId_ = "";
    /**
     *
     *
     * <pre>
     * This ID can be used to acknowledge the received message.
     * </pre>
     *
     * <code>string ack_id = 1;</code>
     */
    public java.lang.String getAckId() {
      java.lang.Object ref = ackId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ackId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This ID can be used to acknowledge the received message.
     * </pre>
     *
     * <code>string ack_id = 1;</code>
     */
    public com.google.protobuf.ByteString getAckIdBytes() {
      java.lang.Object ref = ackId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ackId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This ID can be used to acknowledge the received message.
     * </pre>
     *
     * <code>string ack_id = 1;</code>
     */
    public Builder setAckId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ackId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This ID can be used to acknowledge the received message.
     * </pre>
     *
     * <code>string ack_id = 1;</code>
     */
    public Builder clearAckId() {

      ackId_ = getDefaultInstance().getAckId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This ID can be used to acknowledge the received message.
     * </pre>
     *
     * <code>string ack_id = 1;</code>
     */
    public Builder setAckIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      ackId_ = value;
      onChanged();
      return this;
    }

    private com.google.pubsub.v1.PubsubMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.pubsub.v1.PubsubMessage,
            com.google.pubsub.v1.PubsubMessage.Builder,
            com.google.pubsub.v1.PubsubMessageOrBuilder>
        messageBuilder_;
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null
            ? com.google.pubsub.v1.PubsubMessage.getDefaultInstance()
            : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public Builder setMessage(com.google.pubsub.v1.PubsubMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public Builder setMessage(com.google.pubsub.v1.PubsubMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public Builder mergeMessage(com.google.pubsub.v1.PubsubMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
              com.google.pubsub.v1.PubsubMessage.newBuilder(message_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessage.Builder getMessageBuilder() {

      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null
            ? com.google.pubsub.v1.PubsubMessage.getDefaultInstance()
            : message_;
      }
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.pubsub.v1.PubsubMessage,
            com.google.pubsub.v1.PubsubMessage.Builder,
            com.google.pubsub.v1.PubsubMessageOrBuilder>
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.pubsub.v1.PubsubMessage,
                com.google.pubsub.v1.PubsubMessage.Builder,
                com.google.pubsub.v1.PubsubMessageOrBuilder>(
                getMessage(), getParentForChildren(), isClean());
        message_ = null;
      }
      return messageBuilder_;
    }

    private int deliveryAttempt_;
    /**
     *
     *
     * <pre>
     * Delivery attempt counter is 1 + (the sum of number of NACKs and number of
     * ack_deadline exceeds) for this message.
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline
     * exceeds event is whenever a message is not acknowledged within
     * ack_deadline. Note that ack_deadline is initially
     * Subscription.ackDeadlineSeconds, but may get extended automatically by
     * the client library.
     * The first delivery of a given message will have this value as 1. The value
     * is calculated at best effort and is approximate.
     * If a DeadLetterPolicy is not set on the subscription, this will be 0.
     * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
     * API might be changed in backward-incompatible ways and is not recommended
     * for production use. It is not subject to any SLA or deprecation policy.
     * </pre>
     *
     * <code>int32 delivery_attempt = 3;</code>
     */
    public int getDeliveryAttempt() {
      return deliveryAttempt_;
    }
    /**
     *
     *
     * <pre>
     * Delivery attempt counter is 1 + (the sum of number of NACKs and number of
     * ack_deadline exceeds) for this message.
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline
     * exceeds event is whenever a message is not acknowledged within
     * ack_deadline. Note that ack_deadline is initially
     * Subscription.ackDeadlineSeconds, but may get extended automatically by
     * the client library.
     * The first delivery of a given message will have this value as 1. The value
     * is calculated at best effort and is approximate.
     * If a DeadLetterPolicy is not set on the subscription, this will be 0.
     * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
     * API might be changed in backward-incompatible ways and is not recommended
     * for production use. It is not subject to any SLA or deprecation policy.
     * </pre>
     *
     * <code>int32 delivery_attempt = 3;</code>
     */
    public Builder setDeliveryAttempt(int value) {

      deliveryAttempt_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Delivery attempt counter is 1 + (the sum of number of NACKs and number of
     * ack_deadline exceeds) for this message.
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline
     * exceeds event is whenever a message is not acknowledged within
     * ack_deadline. Note that ack_deadline is initially
     * Subscription.ackDeadlineSeconds, but may get extended automatically by
     * the client library.
     * The first delivery of a given message will have this value as 1. The value
     * is calculated at best effort and is approximate.
     * If a DeadLetterPolicy is not set on the subscription, this will be 0.
     * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
     * API might be changed in backward-incompatible ways and is not recommended
     * for production use. It is not subject to any SLA or deprecation policy.
     * </pre>
     *
     * <code>int32 delivery_attempt = 3;</code>
     */
    public Builder clearDeliveryAttempt() {

      deliveryAttempt_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ReceivedMessage)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ReceivedMessage)
  private static final com.google.pubsub.v1.ReceivedMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ReceivedMessage();
  }

  public static com.google.pubsub.v1.ReceivedMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReceivedMessage> PARSER =
      new com.google.protobuf.AbstractParser<ReceivedMessage>() {
        @java.lang.Override
        public ReceivedMessage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReceivedMessage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReceivedMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReceivedMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ReceivedMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
