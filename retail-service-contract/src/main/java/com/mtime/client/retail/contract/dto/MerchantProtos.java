// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Merchant.proto

package com.mtime.client.retail.contract.dto;

public final class MerchantProtos {
  private MerchantProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MerchantOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 MerchantID = 1;
    /**
     * <code>optional int32 MerchantID = 1;</code>
     */
    boolean hasMerchantID();
    /**
     * <code>optional int32 MerchantID = 1;</code>
     */
    int getMerchantID();

    // optional string MerchantName = 2;
    /**
     * <code>optional string MerchantName = 2;</code>
     */
    boolean hasMerchantName();
    /**
     * <code>optional string MerchantName = 2;</code>
     */
    java.lang.String getMerchantName();
    /**
     * <code>optional string MerchantName = 2;</code>
     */
    com.google.protobuf.ByteString
        getMerchantNameBytes();
  }
  /**
   * Protobuf type {@code Merchant}
   */
  public static final class Merchant extends
      com.google.protobuf.GeneratedMessage
      implements MerchantOrBuilder {
    // Use Merchant.newBuilder() to construct.
    private Merchant(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Merchant(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Merchant defaultInstance;
    public static Merchant getDefaultInstance() {
      return defaultInstance;
    }

    public Merchant getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Merchant(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              merchantID_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              merchantName_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mtime.client.retail.contract.dto.MerchantProtos.internal_static_Merchant_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mtime.client.retail.contract.dto.MerchantProtos.internal_static_Merchant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mtime.client.retail.contract.dto.MerchantProtos.Merchant.class, com.mtime.client.retail.contract.dto.MerchantProtos.Merchant.Builder.class);
    }

    public static com.google.protobuf.Parser<Merchant> PARSER =
        new com.google.protobuf.AbstractParser<Merchant>() {
      public Merchant parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Merchant(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Merchant> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 MerchantID = 1;
    public static final int MERCHANTID_FIELD_NUMBER = 1;
    private int merchantID_;
    /**
     * <code>optional int32 MerchantID = 1;</code>
     */
    public boolean hasMerchantID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 MerchantID = 1;</code>
     */
    public int getMerchantID() {
      return merchantID_;
    }

    // optional string MerchantName = 2;
    public static final int MERCHANTNAME_FIELD_NUMBER = 2;
    private java.lang.Object merchantName_;
    /**
     * <code>optional string MerchantName = 2;</code>
     */
    public boolean hasMerchantName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string MerchantName = 2;</code>
     */
    public java.lang.String getMerchantName() {
      java.lang.Object ref = merchantName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          merchantName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string MerchantName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMerchantNameBytes() {
      java.lang.Object ref = merchantName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        merchantName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      merchantID_ = 0;
      merchantName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, merchantID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMerchantNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, merchantID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMerchantNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.mtime.client.retail.contract.dto.MerchantProtos.Merchant prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Merchant}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.mtime.client.retail.contract.dto.MerchantProtos.MerchantOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mtime.client.retail.contract.dto.MerchantProtos.internal_static_Merchant_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mtime.client.retail.contract.dto.MerchantProtos.internal_static_Merchant_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mtime.client.retail.contract.dto.MerchantProtos.Merchant.class, com.mtime.client.retail.contract.dto.MerchantProtos.Merchant.Builder.class);
      }

      // Construct using com.mtime.client.retail.contract.dto.MerchantProtos.Merchant.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        merchantID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        merchantName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mtime.client.retail.contract.dto.MerchantProtos.internal_static_Merchant_descriptor;
      }

      public com.mtime.client.retail.contract.dto.MerchantProtos.Merchant getDefaultInstanceForType() {
        return com.mtime.client.retail.contract.dto.MerchantProtos.Merchant.getDefaultInstance();
      }

      public com.mtime.client.retail.contract.dto.MerchantProtos.Merchant build() {
        com.mtime.client.retail.contract.dto.MerchantProtos.Merchant result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.mtime.client.retail.contract.dto.MerchantProtos.Merchant buildPartial() {
        com.mtime.client.retail.contract.dto.MerchantProtos.Merchant result = new com.mtime.client.retail.contract.dto.MerchantProtos.Merchant(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.merchantID_ = merchantID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.merchantName_ = merchantName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mtime.client.retail.contract.dto.MerchantProtos.Merchant) {
          return mergeFrom((com.mtime.client.retail.contract.dto.MerchantProtos.Merchant)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mtime.client.retail.contract.dto.MerchantProtos.Merchant other) {
        if (other == com.mtime.client.retail.contract.dto.MerchantProtos.Merchant.getDefaultInstance()) return this;
        if (other.hasMerchantID()) {
          setMerchantID(other.getMerchantID());
        }
        if (other.hasMerchantName()) {
          bitField0_ |= 0x00000002;
          merchantName_ = other.merchantName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.mtime.client.retail.contract.dto.MerchantProtos.Merchant parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.mtime.client.retail.contract.dto.MerchantProtos.Merchant) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 MerchantID = 1;
      private int merchantID_ ;
      /**
       * <code>optional int32 MerchantID = 1;</code>
       */
      public boolean hasMerchantID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 MerchantID = 1;</code>
       */
      public int getMerchantID() {
        return merchantID_;
      }
      /**
       * <code>optional int32 MerchantID = 1;</code>
       */
      public Builder setMerchantID(int value) {
        bitField0_ |= 0x00000001;
        merchantID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 MerchantID = 1;</code>
       */
      public Builder clearMerchantID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        merchantID_ = 0;
        onChanged();
        return this;
      }

      // optional string MerchantName = 2;
      private java.lang.Object merchantName_ = "";
      /**
       * <code>optional string MerchantName = 2;</code>
       */
      public boolean hasMerchantName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string MerchantName = 2;</code>
       */
      public java.lang.String getMerchantName() {
        java.lang.Object ref = merchantName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          merchantName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string MerchantName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMerchantNameBytes() {
        java.lang.Object ref = merchantName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          merchantName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string MerchantName = 2;</code>
       */
      public Builder setMerchantName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        merchantName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string MerchantName = 2;</code>
       */
      public Builder clearMerchantName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        merchantName_ = getDefaultInstance().getMerchantName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string MerchantName = 2;</code>
       */
      public Builder setMerchantNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        merchantName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Merchant)
    }

    static {
      defaultInstance = new Merchant(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Merchant)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Merchant_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Merchant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Merchant.proto\"4\n\010Merchant\022\022\n\nMerchant" +
      "ID\030\001 \001(\005\022\024\n\014MerchantName\030\002 \001(\tB6\n$com.mt" +
      "ime.client.retail.contract.dtoB\016Merchant" +
      "Protos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Merchant_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Merchant_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Merchant_descriptor,
              new java.lang.String[] { "MerchantID", "MerchantName", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
