package com.zh.ble.wear.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedFile;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.noisefit.DataBinderMapperImpl;
import com.zh.ble.wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class LargeFileProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEBreakpointContinuation_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEBreakpointContinuation_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SELargeFile_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SELargeFile_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEPrepareOtaRequest_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEPrepareOtaRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEPrepareOtaResponse_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEPrepareOtaResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESoundInstallResult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESoundInstallResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESoundPrepareInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESoundPrepareInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESoundResultInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESoundResultInfo_fieldAccessorTable;

    public static final class SEBreakpointContinuation extends GeneratedMessage implements SEBreakpointContinuationOrBuilder {
        public static final int BREAKPOINT_CONTINUATION_STATE_FIELD_NUMBER = 2;
        public static final int BREAKPOINT_CONTINUATION_STATE_SN_FIELD_NUMBER = 1;
        public static final int BREAKPOINT_CONTINUATION_SUPPORT_FIELD_NUMBER = 3;
        private static final SEBreakpointContinuation DEFAULT_INSTANCE;
        private static final Parser<SEBreakpointContinuation> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int breakpointContinuationStateSn_;
        private boolean breakpointContinuationState_;
        private boolean breakpointContinuationSupport_;
        private byte memoizedIsInitialized;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBreakpointContinuation");
            DEFAULT_INSTANCE = new SEBreakpointContinuation();
            PARSER = new AbstractParser<SEBreakpointContinuation>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuation.1
                @Override // com.google.protobuf.Parser
                public SEBreakpointContinuation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBreakpointContinuation.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e9) {
                        throw new InvalidProtocolBufferException(e9).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        public static SEBreakpointContinuation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LargeFileProtos.internal_static_SEBreakpointContinuation_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBreakpointContinuation parseDelimitedFrom(InputStream inputStream) {
            return (SEBreakpointContinuation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBreakpointContinuation parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBreakpointContinuation> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBreakpointContinuation)) {
                return super.equals(obj);
            }
            SEBreakpointContinuation sEBreakpointContinuation = (SEBreakpointContinuation) obj;
            if (hasBreakpointContinuationStateSn() != sEBreakpointContinuation.hasBreakpointContinuationStateSn()) {
                return false;
            }
            if ((hasBreakpointContinuationStateSn() && getBreakpointContinuationStateSn() != sEBreakpointContinuation.getBreakpointContinuationStateSn()) || hasBreakpointContinuationState() != sEBreakpointContinuation.hasBreakpointContinuationState()) {
                return false;
            }
            if ((!hasBreakpointContinuationState() || getBreakpointContinuationState() == sEBreakpointContinuation.getBreakpointContinuationState()) && hasBreakpointContinuationSupport() == sEBreakpointContinuation.hasBreakpointContinuationSupport()) {
                return (!hasBreakpointContinuationSupport() || getBreakpointContinuationSupport() == sEBreakpointContinuation.getBreakpointContinuationSupport()) && getUnknownFields().equals(sEBreakpointContinuation.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
        public boolean getBreakpointContinuationState() {
            return this.breakpointContinuationState_;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
        public int getBreakpointContinuationStateSn() {
            return this.breakpointContinuationStateSn_;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
        public boolean getBreakpointContinuationSupport() {
            return this.breakpointContinuationSupport_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LargeFileProtos.internal_static_SEBreakpointContinuation_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEBreakpointContinuation> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.breakpointContinuationStateSn_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.breakpointContinuationState_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.breakpointContinuationSupport_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
        public boolean hasBreakpointContinuationState() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
        public boolean hasBreakpointContinuationStateSn() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
        public boolean hasBreakpointContinuationSupport() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasBreakpointContinuationStateSn()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBreakpointContinuationStateSn();
            }
            if (hasBreakpointContinuationState()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getBreakpointContinuationState());
            }
            if (hasBreakpointContinuationSupport()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getBreakpointContinuationSupport());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return LargeFileProtos.internal_static_SEBreakpointContinuation_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBreakpointContinuation.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (!hasBreakpointContinuationStateSn()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasBreakpointContinuationState()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBreakpointContinuationSupport()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.breakpointContinuationStateSn_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.breakpointContinuationState_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.breakpointContinuationSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBreakpointContinuationOrBuilder {
            private int bitField0_;
            private int breakpointContinuationStateSn_;
            private boolean breakpointContinuationState_;
            private boolean breakpointContinuationSupport_;

            private void buildPartial0(SEBreakpointContinuation sEBreakpointContinuation) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEBreakpointContinuation.breakpointContinuationStateSn_ = this.breakpointContinuationStateSn_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEBreakpointContinuation.breakpointContinuationState_ = this.breakpointContinuationState_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEBreakpointContinuation.breakpointContinuationSupport_ = this.breakpointContinuationSupport_;
                    i7 |= 4;
                }
                sEBreakpointContinuation.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return LargeFileProtos.internal_static_SEBreakpointContinuation_descriptor;
            }

            public Builder clearBreakpointContinuationState() {
                this.bitField0_ &= -3;
                this.breakpointContinuationState_ = false;
                onChanged();
                return this;
            }

            public Builder clearBreakpointContinuationStateSn() {
                this.bitField0_ &= -2;
                this.breakpointContinuationStateSn_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBreakpointContinuationSupport() {
                this.bitField0_ &= -5;
                this.breakpointContinuationSupport_ = false;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
            public boolean getBreakpointContinuationState() {
                return this.breakpointContinuationState_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
            public int getBreakpointContinuationStateSn() {
                return this.breakpointContinuationStateSn_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
            public boolean getBreakpointContinuationSupport() {
                return this.breakpointContinuationSupport_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return LargeFileProtos.internal_static_SEBreakpointContinuation_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
            public boolean hasBreakpointContinuationState() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
            public boolean hasBreakpointContinuationStateSn() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEBreakpointContinuationOrBuilder
            public boolean hasBreakpointContinuationSupport() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return LargeFileProtos.internal_static_SEBreakpointContinuation_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBreakpointContinuation.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasBreakpointContinuationStateSn() && hasBreakpointContinuationState() && hasBreakpointContinuationSupport();
            }

            public Builder setBreakpointContinuationState(boolean z6) {
                this.breakpointContinuationState_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setBreakpointContinuationStateSn(int i7) {
                this.breakpointContinuationStateSn_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setBreakpointContinuationSupport(boolean z6) {
                this.breakpointContinuationSupport_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBreakpointContinuation build() {
                SEBreakpointContinuation sEBreakpointContinuationBuildPartial = buildPartial();
                if (sEBreakpointContinuationBuildPartial.isInitialized()) {
                    return sEBreakpointContinuationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBreakpointContinuationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBreakpointContinuation buildPartial() {
                SEBreakpointContinuation sEBreakpointContinuation = new SEBreakpointContinuation(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBreakpointContinuation);
                }
                onBuilt();
                return sEBreakpointContinuation;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBreakpointContinuation getDefaultInstanceForType() {
                return SEBreakpointContinuation.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.breakpointContinuationStateSn_ = 0;
                this.breakpointContinuationState_ = false;
                this.breakpointContinuationSupport_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBreakpointContinuation) {
                    return mergeFrom((SEBreakpointContinuation) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEBreakpointContinuation sEBreakpointContinuation) {
                if (sEBreakpointContinuation == SEBreakpointContinuation.getDefaultInstance()) {
                    return this;
                }
                if (sEBreakpointContinuation.hasBreakpointContinuationStateSn()) {
                    setBreakpointContinuationStateSn(sEBreakpointContinuation.getBreakpointContinuationStateSn());
                }
                if (sEBreakpointContinuation.hasBreakpointContinuationState()) {
                    setBreakpointContinuationState(sEBreakpointContinuation.getBreakpointContinuationState());
                }
                if (sEBreakpointContinuation.hasBreakpointContinuationSupport()) {
                    setBreakpointContinuationSupport(sEBreakpointContinuation.getBreakpointContinuationSupport());
                }
                mergeUnknownFields(sEBreakpointContinuation.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.breakpointContinuationStateSn_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.breakpointContinuationState_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.breakpointContinuationSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SEBreakpointContinuation(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.breakpointContinuationStateSn_ = 0;
            this.breakpointContinuationState_ = false;
            this.breakpointContinuationSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBreakpointContinuation sEBreakpointContinuation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBreakpointContinuation);
        }

        public static SEBreakpointContinuation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBreakpointContinuation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBreakpointContinuation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBreakpointContinuation parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBreakpointContinuation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBreakpointContinuation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEBreakpointContinuation parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEBreakpointContinuation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEBreakpointContinuation() {
            this.breakpointContinuationStateSn_ = 0;
            this.breakpointContinuationState_ = false;
            this.breakpointContinuationSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEBreakpointContinuation parseFrom(InputStream inputStream) {
            return (SEBreakpointContinuation) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEBreakpointContinuation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBreakpointContinuation) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBreakpointContinuation parseFrom(CodedInputStream codedInputStream) {
            return (SEBreakpointContinuation) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEBreakpointContinuation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBreakpointContinuation) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEBreakpointContinuationOrBuilder extends MessageOrBuilder {
        boolean getBreakpointContinuationState();

        int getBreakpointContinuationStateSn();

        boolean getBreakpointContinuationSupport();

        boolean hasBreakpointContinuationState();

        boolean hasBreakpointContinuationStateSn();

        boolean hasBreakpointContinuationSupport();
    }

    public static final class SELargeFile extends GeneratedMessage implements SELargeFileOrBuilder {
        public static final int AGPS_STATE_FIELD_NUMBER = 4;
        public static final int BREAKPOINT_CONTINUATION_FIELD_NUMBER = 5;
        public static final int DAYS_FIELD_NUMBER = 3;
        private static final SELargeFile DEFAULT_INSTANCE;
        public static final int INSTALL_RESULT_FIELD_NUMBER = 8;
        private static final Parser<SELargeFile> PARSER;
        public static final int PREPARE_OTA_REQUEST_FIELD_NUMBER = 1;
        public static final int PREPARE_OTA_RESPONSE_FIELD_NUMBER = 2;
        public static final int SOUNDPREPARE_INFO_FIELD_NUMBER = 6;
        public static final int SOUND_RESULT_INFO_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            PREPARE_OTA_REQUEST(1),
            PREPARE_OTA_RESPONSE(2),
            DAYS(3),
            AGPS_STATE(4),
            BREAKPOINT_CONTINUATION(5),
            SOUNDPREPARE_INFO(6),
            SOUND_RESULT_INFO(7),
            INSTALL_RESULT(8),
            PAYLOAD_NOT_SET(0);

            private final int value;

            PayloadCase(int i7) {
                this.value = i7;
            }

            public static PayloadCase forNumber(int i7) {
                switch (i7) {
                    case 0:
                        return PAYLOAD_NOT_SET;
                    case 1:
                        return PREPARE_OTA_REQUEST;
                    case 2:
                        return PREPARE_OTA_RESPONSE;
                    case 3:
                        return DAYS;
                    case 4:
                        return AGPS_STATE;
                    case 5:
                        return BREAKPOINT_CONTINUATION;
                    case 6:
                        return SOUNDPREPARE_INFO;
                    case 7:
                        return SOUND_RESULT_INFO;
                    case 8:
                        return INSTALL_RESULT;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PayloadCase valueOf(int i7) {
                return forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SELargeFile");
            DEFAULT_INSTANCE = new SELargeFile();
            PARSER = new AbstractParser<SELargeFile>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFile.1
                @Override // com.google.protobuf.Parser
                public SELargeFile parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SELargeFile.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e9) {
                        throw new InvalidProtocolBufferException(e9).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        public static SELargeFile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LargeFileProtos.internal_static_SELargeFile_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SELargeFile parseDelimitedFrom(InputStream inputStream) {
            return (SELargeFile) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SELargeFile parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SELargeFile> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SELargeFile)) {
                return super.equals(obj);
            }
            SELargeFile sELargeFile = (SELargeFile) obj;
            if (!getPayloadCase().equals(sELargeFile.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getPrepareOtaRequest().equals(sELargeFile.getPrepareOtaRequest())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getPrepareOtaResponse().equals(sELargeFile.getPrepareOtaResponse())) {
                        return false;
                    }
                    break;
                case 3:
                    if (getDays() != sELargeFile.getDays()) {
                        return false;
                    }
                    break;
                case 4:
                    if (getAgpsState() != sELargeFile.getAgpsState()) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getBreakpointContinuation().equals(sELargeFile.getBreakpointContinuation())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getSoundPrepareInfo().equals(sELargeFile.getSoundPrepareInfo())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getSoundResultInfo().equals(sELargeFile.getSoundResultInfo())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getInstallResult().equals(sELargeFile.getInstallResult())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sELargeFile.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean getAgpsState() {
            if (this.payloadCase_ == 4) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SEBreakpointContinuation getBreakpointContinuation() {
            return this.payloadCase_ == 5 ? (SEBreakpointContinuation) this.payload_ : SEBreakpointContinuation.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SEBreakpointContinuationOrBuilder getBreakpointContinuationOrBuilder() {
            return this.payloadCase_ == 5 ? (SEBreakpointContinuation) this.payload_ : SEBreakpointContinuation.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public int getDays() {
            if (this.payloadCase_ == 3) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LargeFileProtos.internal_static_SELargeFile_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SESoundInstallResult getInstallResult() {
            return this.payloadCase_ == 8 ? (SESoundInstallResult) this.payload_ : SESoundInstallResult.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SESoundInstallResultOrBuilder getInstallResultOrBuilder() {
            return this.payloadCase_ == 8 ? (SESoundInstallResult) this.payload_ : SESoundInstallResult.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SELargeFile> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SEPrepareOtaRequest getPrepareOtaRequest() {
            return this.payloadCase_ == 1 ? (SEPrepareOtaRequest) this.payload_ : SEPrepareOtaRequest.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SEPrepareOtaRequestOrBuilder getPrepareOtaRequestOrBuilder() {
            return this.payloadCase_ == 1 ? (SEPrepareOtaRequest) this.payload_ : SEPrepareOtaRequest.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SEPrepareOtaResponse getPrepareOtaResponse() {
            return this.payloadCase_ == 2 ? (SEPrepareOtaResponse) this.payload_ : SEPrepareOtaResponse.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SEPrepareOtaResponseOrBuilder getPrepareOtaResponseOrBuilder() {
            return this.payloadCase_ == 2 ? (SEPrepareOtaResponse) this.payload_ : SEPrepareOtaResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEPrepareOtaRequest) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SEPrepareOtaResponse) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(4, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SEBreakpointContinuation) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SESoundPrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (SESoundResultInfo) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (SESoundInstallResult) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SESoundPrepareInfo getSoundPrepareInfo() {
            return this.payloadCase_ == 6 ? (SESoundPrepareInfo) this.payload_ : SESoundPrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SESoundPrepareInfoOrBuilder getSoundPrepareInfoOrBuilder() {
            return this.payloadCase_ == 6 ? (SESoundPrepareInfo) this.payload_ : SESoundPrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SESoundResultInfo getSoundResultInfo() {
            return this.payloadCase_ == 7 ? (SESoundResultInfo) this.payload_ : SESoundResultInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public SESoundResultInfoOrBuilder getSoundResultInfoOrBuilder() {
            return this.payloadCase_ == 7 ? (SESoundResultInfo) this.payload_ : SESoundResultInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasAgpsState() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasBreakpointContinuation() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasDays() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasInstallResult() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasPrepareOtaRequest() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasPrepareOtaResponse() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasSoundPrepareInfo() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
        public boolean hasSoundResultInfo() {
            return this.payloadCase_ == 7;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            int iHashCode;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode2 = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode2 * 37) + 1) * 53;
                    iHashCode = getPrepareOtaRequest().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getPrepareOtaResponse().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getDays();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = Internal.hashBoolean(getAgpsState());
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getBreakpointContinuation().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getSoundPrepareInfo().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getSoundResultInfo().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getInstallResult().hashCode();
                    break;
                default:
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return LargeFileProtos.internal_static_SELargeFile_fieldAccessorTable.ensureFieldAccessorsInitialized(SELargeFile.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (hasPrepareOtaRequest() && !getPrepareOtaRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPrepareOtaResponse() && !getPrepareOtaResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBreakpointContinuation() && !getBreakpointContinuation().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSoundPrepareInfo() && !getSoundPrepareInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSoundResultInfo() && !getSoundResultInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasInstallResult() || getInstallResult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEPrepareOtaRequest) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SEPrepareOtaResponse) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeUInt32(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeBool(4, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEBreakpointContinuation) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SESoundPrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SESoundResultInfo) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SESoundInstallResult) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SELargeFileOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> breakpointContinuationBuilder_;
            private SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> installResultBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> prepareOtaRequestBuilder_;
            private SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> prepareOtaResponseBuilder_;
            private SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> soundPrepareInfoBuilder_;
            private SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> soundResultInfoBuilder_;

            private void buildPartial0(SELargeFile sELargeFile) {
            }

            private void buildPartialOneofs(SELargeFile sELargeFile) {
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder6;
                int i7 = this.payloadCase_;
                sELargeFile.payloadCase_ = i7;
                sELargeFile.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder6 = this.prepareOtaRequestBuilder_) != null) {
                    sELargeFile.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 2 && (singleFieldBuilder5 = this.prepareOtaResponseBuilder_) != null) {
                    sELargeFile.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder4 = this.breakpointContinuationBuilder_) != null) {
                    sELargeFile.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder3 = this.soundPrepareInfoBuilder_) != null) {
                    sELargeFile.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder2 = this.soundResultInfoBuilder_) != null) {
                    sELargeFile.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 8 || (singleFieldBuilder = this.installResultBuilder_) == null) {
                    return;
                }
                sELargeFile.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return LargeFileProtos.internal_static_SELargeFile_descriptor;
            }

            private SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> internalGetBreakpointContinuationFieldBuilder() {
                if (this.breakpointContinuationBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEBreakpointContinuation.getDefaultInstance();
                    }
                    this.breakpointContinuationBuilder_ = new SingleFieldBuilder<>((SEBreakpointContinuation) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.breakpointContinuationBuilder_;
            }

            private SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> internalGetInstallResultFieldBuilder() {
                if (this.installResultBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SESoundInstallResult.getDefaultInstance();
                    }
                    this.installResultBuilder_ = new SingleFieldBuilder<>((SESoundInstallResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.installResultBuilder_;
            }

            private SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> internalGetPrepareOtaRequestFieldBuilder() {
                if (this.prepareOtaRequestBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEPrepareOtaRequest.getDefaultInstance();
                    }
                    this.prepareOtaRequestBuilder_ = new SingleFieldBuilder<>((SEPrepareOtaRequest) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.prepareOtaRequestBuilder_;
            }

            private SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> internalGetPrepareOtaResponseFieldBuilder() {
                if (this.prepareOtaResponseBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SEPrepareOtaResponse.getDefaultInstance();
                    }
                    this.prepareOtaResponseBuilder_ = new SingleFieldBuilder<>((SEPrepareOtaResponse) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.prepareOtaResponseBuilder_;
            }

            private SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> internalGetSoundPrepareInfoFieldBuilder() {
                if (this.soundPrepareInfoBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SESoundPrepareInfo.getDefaultInstance();
                    }
                    this.soundPrepareInfoBuilder_ = new SingleFieldBuilder<>((SESoundPrepareInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.soundPrepareInfoBuilder_;
            }

            private SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> internalGetSoundResultInfoFieldBuilder() {
                if (this.soundResultInfoBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SESoundResultInfo.getDefaultInstance();
                    }
                    this.soundResultInfoBuilder_ = new SingleFieldBuilder<>((SESoundResultInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.soundResultInfoBuilder_;
            }

            public Builder clearAgpsState() {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearBreakpointContinuation() {
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder = this.breakpointContinuationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 5) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearDays() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearInstallResult() {
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 8) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 8) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearPrepareOtaRequest() {
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder = this.prepareOtaRequestBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 1) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearPrepareOtaResponse() {
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder = this.prepareOtaResponseBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 2) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearSoundPrepareInfo() {
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder = this.soundPrepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 6) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 6) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearSoundResultInfo() {
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder = this.soundResultInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 7) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 7) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean getAgpsState() {
                if (this.payloadCase_ == 4) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SEBreakpointContinuation getBreakpointContinuation() {
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder = this.breakpointContinuationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEBreakpointContinuation) this.payload_ : SEBreakpointContinuation.getDefaultInstance() : this.payloadCase_ == 5 ? (SEBreakpointContinuation) singleFieldBuilder.getMessage() : SEBreakpointContinuation.getDefaultInstance();
            }

            public SEBreakpointContinuation.Builder getBreakpointContinuationBuilder() {
                return (SEBreakpointContinuation.Builder) internalGetBreakpointContinuationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SEBreakpointContinuationOrBuilder getBreakpointContinuationOrBuilder() {
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.breakpointContinuationBuilder_) == null) ? i7 == 5 ? (SEBreakpointContinuation) this.payload_ : SEBreakpointContinuation.getDefaultInstance() : (SEBreakpointContinuationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public int getDays() {
                if (this.payloadCase_ == 3) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return LargeFileProtos.internal_static_SELargeFile_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SESoundInstallResult getInstallResult() {
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SESoundInstallResult) this.payload_ : SESoundInstallResult.getDefaultInstance() : this.payloadCase_ == 8 ? (SESoundInstallResult) singleFieldBuilder.getMessage() : SESoundInstallResult.getDefaultInstance();
            }

            public SESoundInstallResult.Builder getInstallResultBuilder() {
                return (SESoundInstallResult.Builder) internalGetInstallResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SESoundInstallResultOrBuilder getInstallResultOrBuilder() {
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.installResultBuilder_) == null) ? i7 == 8 ? (SESoundInstallResult) this.payload_ : SESoundInstallResult.getDefaultInstance() : (SESoundInstallResultOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SEPrepareOtaRequest getPrepareOtaRequest() {
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder = this.prepareOtaRequestBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEPrepareOtaRequest) this.payload_ : SEPrepareOtaRequest.getDefaultInstance() : this.payloadCase_ == 1 ? (SEPrepareOtaRequest) singleFieldBuilder.getMessage() : SEPrepareOtaRequest.getDefaultInstance();
            }

            public SEPrepareOtaRequest.Builder getPrepareOtaRequestBuilder() {
                return (SEPrepareOtaRequest.Builder) internalGetPrepareOtaRequestFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SEPrepareOtaRequestOrBuilder getPrepareOtaRequestOrBuilder() {
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.prepareOtaRequestBuilder_) == null) ? i7 == 1 ? (SEPrepareOtaRequest) this.payload_ : SEPrepareOtaRequest.getDefaultInstance() : (SEPrepareOtaRequestOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SEPrepareOtaResponse getPrepareOtaResponse() {
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder = this.prepareOtaResponseBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SEPrepareOtaResponse) this.payload_ : SEPrepareOtaResponse.getDefaultInstance() : this.payloadCase_ == 2 ? (SEPrepareOtaResponse) singleFieldBuilder.getMessage() : SEPrepareOtaResponse.getDefaultInstance();
            }

            public SEPrepareOtaResponse.Builder getPrepareOtaResponseBuilder() {
                return (SEPrepareOtaResponse.Builder) internalGetPrepareOtaResponseFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SEPrepareOtaResponseOrBuilder getPrepareOtaResponseOrBuilder() {
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.prepareOtaResponseBuilder_) == null) ? i7 == 2 ? (SEPrepareOtaResponse) this.payload_ : SEPrepareOtaResponse.getDefaultInstance() : (SEPrepareOtaResponseOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SESoundPrepareInfo getSoundPrepareInfo() {
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder = this.soundPrepareInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SESoundPrepareInfo) this.payload_ : SESoundPrepareInfo.getDefaultInstance() : this.payloadCase_ == 6 ? (SESoundPrepareInfo) singleFieldBuilder.getMessage() : SESoundPrepareInfo.getDefaultInstance();
            }

            public SESoundPrepareInfo.Builder getSoundPrepareInfoBuilder() {
                return (SESoundPrepareInfo.Builder) internalGetSoundPrepareInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SESoundPrepareInfoOrBuilder getSoundPrepareInfoOrBuilder() {
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.soundPrepareInfoBuilder_) == null) ? i7 == 6 ? (SESoundPrepareInfo) this.payload_ : SESoundPrepareInfo.getDefaultInstance() : (SESoundPrepareInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SESoundResultInfo getSoundResultInfo() {
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder = this.soundResultInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SESoundResultInfo) this.payload_ : SESoundResultInfo.getDefaultInstance() : this.payloadCase_ == 7 ? (SESoundResultInfo) singleFieldBuilder.getMessage() : SESoundResultInfo.getDefaultInstance();
            }

            public SESoundResultInfo.Builder getSoundResultInfoBuilder() {
                return (SESoundResultInfo.Builder) internalGetSoundResultInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public SESoundResultInfoOrBuilder getSoundResultInfoOrBuilder() {
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.soundResultInfoBuilder_) == null) ? i7 == 7 ? (SESoundResultInfo) this.payload_ : SESoundResultInfo.getDefaultInstance() : (SESoundResultInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasAgpsState() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasBreakpointContinuation() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasDays() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasInstallResult() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasPrepareOtaRequest() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasPrepareOtaResponse() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasSoundPrepareInfo() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SELargeFileOrBuilder
            public boolean hasSoundResultInfo() {
                return this.payloadCase_ == 7;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return LargeFileProtos.internal_static_SELargeFile_fieldAccessorTable.ensureFieldAccessorsInitialized(SELargeFile.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasPrepareOtaRequest() && !getPrepareOtaRequest().isInitialized()) {
                    return false;
                }
                if (hasPrepareOtaResponse() && !getPrepareOtaResponse().isInitialized()) {
                    return false;
                }
                if (hasBreakpointContinuation() && !getBreakpointContinuation().isInitialized()) {
                    return false;
                }
                if (hasSoundPrepareInfo() && !getSoundPrepareInfo().isInitialized()) {
                    return false;
                }
                if (!hasSoundResultInfo() || getSoundResultInfo().isInitialized()) {
                    return !hasInstallResult() || getInstallResult().isInitialized();
                }
                return false;
            }

            public Builder mergeBreakpointContinuation(SEBreakpointContinuation sEBreakpointContinuation) {
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder = this.breakpointContinuationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEBreakpointContinuation.getDefaultInstance()) {
                        this.payload_ = sEBreakpointContinuation;
                    } else {
                        this.payload_ = SEBreakpointContinuation.newBuilder((SEBreakpointContinuation) this.payload_).mergeFrom(sEBreakpointContinuation).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEBreakpointContinuation);
                } else {
                    singleFieldBuilder.setMessage(sEBreakpointContinuation);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeInstallResult(SESoundInstallResult sESoundInstallResult) {
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SESoundInstallResult.getDefaultInstance()) {
                        this.payload_ = sESoundInstallResult;
                    } else {
                        this.payload_ = SESoundInstallResult.newBuilder((SESoundInstallResult) this.payload_).mergeFrom(sESoundInstallResult).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sESoundInstallResult);
                } else {
                    singleFieldBuilder.setMessage(sESoundInstallResult);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergePrepareOtaRequest(SEPrepareOtaRequest sEPrepareOtaRequest) {
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder = this.prepareOtaRequestBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEPrepareOtaRequest.getDefaultInstance()) {
                        this.payload_ = sEPrepareOtaRequest;
                    } else {
                        this.payload_ = SEPrepareOtaRequest.newBuilder((SEPrepareOtaRequest) this.payload_).mergeFrom(sEPrepareOtaRequest).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEPrepareOtaRequest);
                } else {
                    singleFieldBuilder.setMessage(sEPrepareOtaRequest);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergePrepareOtaResponse(SEPrepareOtaResponse sEPrepareOtaResponse) {
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder = this.prepareOtaResponseBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SEPrepareOtaResponse.getDefaultInstance()) {
                        this.payload_ = sEPrepareOtaResponse;
                    } else {
                        this.payload_ = SEPrepareOtaResponse.newBuilder((SEPrepareOtaResponse) this.payload_).mergeFrom(sEPrepareOtaResponse).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sEPrepareOtaResponse);
                } else {
                    singleFieldBuilder.setMessage(sEPrepareOtaResponse);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeSoundPrepareInfo(SESoundPrepareInfo sESoundPrepareInfo) {
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder = this.soundPrepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SESoundPrepareInfo.getDefaultInstance()) {
                        this.payload_ = sESoundPrepareInfo;
                    } else {
                        this.payload_ = SESoundPrepareInfo.newBuilder((SESoundPrepareInfo) this.payload_).mergeFrom(sESoundPrepareInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sESoundPrepareInfo);
                } else {
                    singleFieldBuilder.setMessage(sESoundPrepareInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeSoundResultInfo(SESoundResultInfo sESoundResultInfo) {
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder = this.soundResultInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SESoundResultInfo.getDefaultInstance()) {
                        this.payload_ = sESoundResultInfo;
                    } else {
                        this.payload_ = SESoundResultInfo.newBuilder((SESoundResultInfo) this.payload_).mergeFrom(sESoundResultInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sESoundResultInfo);
                } else {
                    singleFieldBuilder.setMessage(sESoundResultInfo);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setAgpsState(boolean z6) {
                this.payloadCase_ = 4;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setBreakpointContinuation(SEBreakpointContinuation sEBreakpointContinuation) {
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder = this.breakpointContinuationBuilder_;
                if (singleFieldBuilder == null) {
                    sEBreakpointContinuation.getClass();
                    this.payload_ = sEBreakpointContinuation;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBreakpointContinuation);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setDays(int i7) {
                this.payloadCase_ = 3;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setInstallResult(SESoundInstallResult sESoundInstallResult) {
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    sESoundInstallResult.getClass();
                    this.payload_ = sESoundInstallResult;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESoundInstallResult);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setPrepareOtaRequest(SEPrepareOtaRequest sEPrepareOtaRequest) {
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder = this.prepareOtaRequestBuilder_;
                if (singleFieldBuilder == null) {
                    sEPrepareOtaRequest.getClass();
                    this.payload_ = sEPrepareOtaRequest;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEPrepareOtaRequest);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setPrepareOtaResponse(SEPrepareOtaResponse sEPrepareOtaResponse) {
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder = this.prepareOtaResponseBuilder_;
                if (singleFieldBuilder == null) {
                    sEPrepareOtaResponse.getClass();
                    this.payload_ = sEPrepareOtaResponse;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEPrepareOtaResponse);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setSoundPrepareInfo(SESoundPrepareInfo sESoundPrepareInfo) {
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder = this.soundPrepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sESoundPrepareInfo.getClass();
                    this.payload_ = sESoundPrepareInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESoundPrepareInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setSoundResultInfo(SESoundResultInfo sESoundResultInfo) {
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder = this.soundResultInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sESoundResultInfo.getClass();
                    this.payload_ = sESoundResultInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESoundResultInfo);
                }
                this.payloadCase_ = 7;
                return this;
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SELargeFile build() {
                SELargeFile sELargeFileBuildPartial = buildPartial();
                if (sELargeFileBuildPartial.isInitialized()) {
                    return sELargeFileBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sELargeFileBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SELargeFile buildPartial() {
                SELargeFile sELargeFile = new SELargeFile(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sELargeFile);
                }
                buildPartialOneofs(sELargeFile);
                onBuilt();
                return sELargeFile;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SELargeFile getDefaultInstanceForType() {
                return SELargeFile.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder = this.prepareOtaRequestBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder2 = this.prepareOtaResponseBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder3 = this.breakpointContinuationBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder4 = this.soundPrepareInfoBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder5 = this.soundResultInfoBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder6 = this.installResultBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SELargeFile) {
                    return mergeFrom((SELargeFile) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBreakpointContinuation(SEBreakpointContinuation.Builder builder) {
                SingleFieldBuilder<SEBreakpointContinuation, SEBreakpointContinuation.Builder, SEBreakpointContinuationOrBuilder> singleFieldBuilder = this.breakpointContinuationBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setInstallResult(SESoundInstallResult.Builder builder) {
                SingleFieldBuilder<SESoundInstallResult, SESoundInstallResult.Builder, SESoundInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setPrepareOtaRequest(SEPrepareOtaRequest.Builder builder) {
                SingleFieldBuilder<SEPrepareOtaRequest, SEPrepareOtaRequest.Builder, SEPrepareOtaRequestOrBuilder> singleFieldBuilder = this.prepareOtaRequestBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setPrepareOtaResponse(SEPrepareOtaResponse.Builder builder) {
                SingleFieldBuilder<SEPrepareOtaResponse, SEPrepareOtaResponse.Builder, SEPrepareOtaResponseOrBuilder> singleFieldBuilder = this.prepareOtaResponseBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setSoundPrepareInfo(SESoundPrepareInfo.Builder builder) {
                SingleFieldBuilder<SESoundPrepareInfo, SESoundPrepareInfo.Builder, SESoundPrepareInfoOrBuilder> singleFieldBuilder = this.soundPrepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setSoundResultInfo(SESoundResultInfo.Builder builder) {
                SingleFieldBuilder<SESoundResultInfo, SESoundResultInfo.Builder, SESoundResultInfoOrBuilder> singleFieldBuilder = this.soundResultInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeFrom(SELargeFile sELargeFile) {
                if (sELargeFile == SELargeFile.getDefaultInstance()) {
                    return this;
                }
                switch (sELargeFile.getPayloadCase()) {
                    case PREPARE_OTA_REQUEST:
                        mergePrepareOtaRequest(sELargeFile.getPrepareOtaRequest());
                        break;
                    case PREPARE_OTA_RESPONSE:
                        mergePrepareOtaResponse(sELargeFile.getPrepareOtaResponse());
                        break;
                    case DAYS:
                        setDays(sELargeFile.getDays());
                        break;
                    case AGPS_STATE:
                        setAgpsState(sELargeFile.getAgpsState());
                        break;
                    case BREAKPOINT_CONTINUATION:
                        mergeBreakpointContinuation(sELargeFile.getBreakpointContinuation());
                        break;
                    case SOUNDPREPARE_INFO:
                        mergeSoundPrepareInfo(sELargeFile.getSoundPrepareInfo());
                        break;
                    case SOUND_RESULT_INFO:
                        mergeSoundResultInfo(sELargeFile.getSoundResultInfo());
                        break;
                    case INSTALL_RESULT:
                        mergeInstallResult(sELargeFile.getInstallResult());
                        break;
                }
                mergeUnknownFields(sELargeFile.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(internalGetPrepareOtaRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetPrepareOtaResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag == 24) {
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 3;
                                } else if (tag == 32) {
                                    this.payload_ = Boolean.valueOf(codedInputStream.readBool());
                                    this.payloadCase_ = 4;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetBreakpointContinuationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetSoundPrepareInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(internalGetSoundResultInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                } else if (tag != 66) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetInstallResultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SELargeFile(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SELargeFile sELargeFile) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sELargeFile);
        }

        public static SELargeFile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SELargeFile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SELargeFile) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SELargeFile parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SELargeFile getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SELargeFile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SELargeFile() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SELargeFile parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SELargeFile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SELargeFile parseFrom(InputStream inputStream) {
            return (SELargeFile) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SELargeFile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SELargeFile) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SELargeFile parseFrom(CodedInputStream codedInputStream) {
            return (SELargeFile) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SELargeFile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SELargeFile) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SELargeFileOrBuilder extends MessageOrBuilder {
        boolean getAgpsState();

        SEBreakpointContinuation getBreakpointContinuation();

        SEBreakpointContinuationOrBuilder getBreakpointContinuationOrBuilder();

        int getDays();

        SESoundInstallResult getInstallResult();

        SESoundInstallResultOrBuilder getInstallResultOrBuilder();

        SELargeFile.PayloadCase getPayloadCase();

        SEPrepareOtaRequest getPrepareOtaRequest();

        SEPrepareOtaRequestOrBuilder getPrepareOtaRequestOrBuilder();

        SEPrepareOtaResponse getPrepareOtaResponse();

        SEPrepareOtaResponseOrBuilder getPrepareOtaResponseOrBuilder();

        SESoundPrepareInfo getSoundPrepareInfo();

        SESoundPrepareInfoOrBuilder getSoundPrepareInfoOrBuilder();

        SESoundResultInfo getSoundResultInfo();

        SESoundResultInfoOrBuilder getSoundResultInfoOrBuilder();

        boolean hasAgpsState();

        boolean hasBreakpointContinuation();

        boolean hasDays();

        boolean hasInstallResult();

        boolean hasPrepareOtaRequest();

        boolean hasPrepareOtaResponse();

        boolean hasSoundPrepareInfo();

        boolean hasSoundResultInfo();
    }

    public static final class SEPrepareOtaRequest extends GeneratedMessage implements SEPrepareOtaRequestOrBuilder {
        private static final SEPrepareOtaRequest DEFAULT_INSTANCE;
        public static final int FILE_MD5_FIELD_NUMBER = 4;
        public static final int FIRMWARE_VERSION_FIELD_NUMBER = 3;
        public static final int FORCE_FIELD_NUMBER = 1;
        private static final Parser<SEPrepareOtaRequest> PARSER;
        public static final int TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object fileMd5_;
        private volatile Object firmwareVersion_;
        private boolean force_;
        private byte memoizedIsInitialized;
        private int type_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPrepareOtaRequest");
            DEFAULT_INSTANCE = new SEPrepareOtaRequest();
            PARSER = new AbstractParser<SEPrepareOtaRequest>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequest.1
                @Override // com.google.protobuf.Parser
                public SEPrepareOtaRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEPrepareOtaRequest.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e9) {
                        throw new InvalidProtocolBufferException(e9).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        public static SEPrepareOtaRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LargeFileProtos.internal_static_SEPrepareOtaRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEPrepareOtaRequest parseDelimitedFrom(InputStream inputStream) {
            return (SEPrepareOtaRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEPrepareOtaRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEPrepareOtaRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEPrepareOtaRequest)) {
                return super.equals(obj);
            }
            SEPrepareOtaRequest sEPrepareOtaRequest = (SEPrepareOtaRequest) obj;
            if (hasForce() != sEPrepareOtaRequest.hasForce()) {
                return false;
            }
            if ((hasForce() && getForce() != sEPrepareOtaRequest.getForce()) || hasType() != sEPrepareOtaRequest.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != sEPrepareOtaRequest.type_) || hasFirmwareVersion() != sEPrepareOtaRequest.hasFirmwareVersion()) {
                return false;
            }
            if ((!hasFirmwareVersion() || getFirmwareVersion().equals(sEPrepareOtaRequest.getFirmwareVersion())) && hasFileMd5() == sEPrepareOtaRequest.hasFileMd5()) {
                return (!hasFileMd5() || getFileMd5().equals(sEPrepareOtaRequest.getFileMd5())) && getUnknownFields().equals(sEPrepareOtaRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LargeFileProtos.internal_static_SEPrepareOtaRequest_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public String getFileMd5() {
            Object obj = this.fileMd5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fileMd5_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public ByteString getFileMd5Bytes() {
            Object obj = this.fileMd5_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileMd5_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public String getFirmwareVersion() {
            Object obj = this.firmwareVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.firmwareVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public ByteString getFirmwareVersionBytes() {
            Object obj = this.firmwareVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.firmwareVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public boolean getForce() {
            return this.force_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEPrepareOtaRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.force_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(3, this.firmwareVersion_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(4, this.fileMd5_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public SEType getType() {
            SEType sETypeForNumber = SEType.forNumber(this.type_);
            return sETypeForNumber == null ? SEType.ALL : sETypeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public boolean hasFileMd5() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public boolean hasFirmwareVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public boolean hasForce() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasForce()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getForce());
            }
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.type_;
            }
            if (hasFirmwareVersion()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getFirmwareVersion().hashCode();
            }
            if (hasFileMd5()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getFileMd5().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return LargeFileProtos.internal_static_SEPrepareOtaRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPrepareOtaRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (!hasForce()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFirmwareVersion()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.force_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.type_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.firmwareVersion_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.fileMd5_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEPrepareOtaRequestOrBuilder {
            private int bitField0_;
            private Object fileMd5_;
            private Object firmwareVersion_;
            private boolean force_;
            private int type_;

            private void buildPartial0(SEPrepareOtaRequest sEPrepareOtaRequest) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEPrepareOtaRequest.force_ = this.force_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEPrepareOtaRequest.type_ = this.type_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEPrepareOtaRequest.firmwareVersion_ = this.firmwareVersion_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEPrepareOtaRequest.fileMd5_ = this.fileMd5_;
                    i7 |= 8;
                }
                sEPrepareOtaRequest.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return LargeFileProtos.internal_static_SEPrepareOtaRequest_descriptor;
            }

            public Builder clearFileMd5() {
                this.fileMd5_ = SEPrepareOtaRequest.getDefaultInstance().getFileMd5();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearFirmwareVersion() {
                this.firmwareVersion_ = SEPrepareOtaRequest.getDefaultInstance().getFirmwareVersion();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearForce() {
                this.bitField0_ &= -2;
                this.force_ = false;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -3;
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return LargeFileProtos.internal_static_SEPrepareOtaRequest_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public String getFileMd5() {
                Object obj = this.fileMd5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fileMd5_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public ByteString getFileMd5Bytes() {
                Object obj = this.fileMd5_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileMd5_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public String getFirmwareVersion() {
                Object obj = this.firmwareVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.firmwareVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public ByteString getFirmwareVersionBytes() {
                Object obj = this.firmwareVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.firmwareVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public boolean getForce() {
                return this.force_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public SEType getType() {
                SEType sETypeForNumber = SEType.forNumber(this.type_);
                return sETypeForNumber == null ? SEType.ALL : sETypeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public boolean hasFileMd5() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public boolean hasFirmwareVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public boolean hasForce() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaRequestOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return LargeFileProtos.internal_static_SEPrepareOtaRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPrepareOtaRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasForce() && hasType() && hasFirmwareVersion();
            }

            public Builder setFileMd5(String str) {
                str.getClass();
                this.fileMd5_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFileMd5Bytes(ByteString byteString) {
                byteString.getClass();
                this.fileMd5_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersion(String str) {
                str.getClass();
                this.firmwareVersion_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.firmwareVersion_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setForce(boolean z6) {
                this.force_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setType(SEType sEType) {
                sEType.getClass();
                this.bitField0_ |= 2;
                this.type_ = sEType.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 0;
                this.firmwareVersion_ = "";
                this.fileMd5_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPrepareOtaRequest build() {
                SEPrepareOtaRequest sEPrepareOtaRequestBuildPartial = buildPartial();
                if (sEPrepareOtaRequestBuildPartial.isInitialized()) {
                    return sEPrepareOtaRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEPrepareOtaRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPrepareOtaRequest buildPartial() {
                SEPrepareOtaRequest sEPrepareOtaRequest = new SEPrepareOtaRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEPrepareOtaRequest);
                }
                onBuilt();
                return sEPrepareOtaRequest;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEPrepareOtaRequest getDefaultInstanceForType() {
                return SEPrepareOtaRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.force_ = false;
                this.type_ = 0;
                this.firmwareVersion_ = "";
                this.fileMd5_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.firmwareVersion_ = "";
                this.fileMd5_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEPrepareOtaRequest) {
                    return mergeFrom((SEPrepareOtaRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEPrepareOtaRequest sEPrepareOtaRequest) {
                if (sEPrepareOtaRequest == SEPrepareOtaRequest.getDefaultInstance()) {
                    return this;
                }
                if (sEPrepareOtaRequest.hasForce()) {
                    setForce(sEPrepareOtaRequest.getForce());
                }
                if (sEPrepareOtaRequest.hasType()) {
                    setType(sEPrepareOtaRequest.getType());
                }
                if (sEPrepareOtaRequest.hasFirmwareVersion()) {
                    this.firmwareVersion_ = sEPrepareOtaRequest.firmwareVersion_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEPrepareOtaRequest.hasFileMd5()) {
                    this.fileMd5_ = sEPrepareOtaRequest.fileMd5_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(sEPrepareOtaRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.force_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i7 = codedInputStream.readEnum();
                                    if (SEType.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.type_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.firmwareVersion_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.fileMd5_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SEPrepareOtaRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.force_ = false;
            this.type_ = 0;
            this.firmwareVersion_ = "";
            this.fileMd5_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEPrepareOtaRequest sEPrepareOtaRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEPrepareOtaRequest);
        }

        public static SEPrepareOtaRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEPrepareOtaRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPrepareOtaRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPrepareOtaRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEPrepareOtaRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEPrepareOtaRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEPrepareOtaRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEPrepareOtaRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEPrepareOtaRequest parseFrom(InputStream inputStream) {
            return (SEPrepareOtaRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEPrepareOtaRequest() {
            this.force_ = false;
            this.type_ = 0;
            this.firmwareVersion_ = "";
            this.fileMd5_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.firmwareVersion_ = "";
            this.fileMd5_ = "";
        }

        public static SEPrepareOtaRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPrepareOtaRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPrepareOtaRequest parseFrom(CodedInputStream codedInputStream) {
            return (SEPrepareOtaRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEPrepareOtaRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPrepareOtaRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEPrepareOtaRequestOrBuilder extends MessageOrBuilder {
        String getFileMd5();

        ByteString getFileMd5Bytes();

        String getFirmwareVersion();

        ByteString getFirmwareVersionBytes();

        boolean getForce();

        SEType getType();

        boolean hasFileMd5();

        boolean hasFirmwareVersion();

        boolean hasForce();

        boolean hasType();
    }

    public static final class SEPrepareOtaResponse extends GeneratedMessage implements SEPrepareOtaResponseOrBuilder {
        private static final SEPrepareOtaResponse DEFAULT_INSTANCE;
        private static final Parser<SEPrepareOtaResponse> PARSER;
        public static final int PREPARE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int prepareStatus_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPrepareOtaResponse");
            DEFAULT_INSTANCE = new SEPrepareOtaResponse();
            PARSER = new AbstractParser<SEPrepareOtaResponse>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaResponse.1
                @Override // com.google.protobuf.Parser
                public SEPrepareOtaResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEPrepareOtaResponse.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e9) {
                        throw new InvalidProtocolBufferException(e9).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        public static SEPrepareOtaResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LargeFileProtos.internal_static_SEPrepareOtaResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEPrepareOtaResponse parseDelimitedFrom(InputStream inputStream) {
            return (SEPrepareOtaResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEPrepareOtaResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEPrepareOtaResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEPrepareOtaResponse)) {
                return super.equals(obj);
            }
            SEPrepareOtaResponse sEPrepareOtaResponse = (SEPrepareOtaResponse) obj;
            if (hasPrepareStatus() != sEPrepareOtaResponse.hasPrepareStatus()) {
                return false;
            }
            return (!hasPrepareStatus() || this.prepareStatus_ == sEPrepareOtaResponse.prepareStatus_) && getUnknownFields().equals(sEPrepareOtaResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LargeFileProtos.internal_static_SEPrepareOtaResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEPrepareOtaResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaResponseOrBuilder
        public CommonProtos.SEPrepareStatus getPrepareStatus() {
            CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
            return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.prepareStatus_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeEnumSize;
            return iComputeEnumSize;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaResponseOrBuilder
        public boolean hasPrepareStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPrepareStatus()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.prepareStatus_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return LargeFileProtos.internal_static_SEPrepareOtaResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPrepareOtaResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (hasPrepareStatus()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.prepareStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEPrepareOtaResponseOrBuilder {
            private int bitField0_;
            private int prepareStatus_;

            private void buildPartial0(SEPrepareOtaResponse sEPrepareOtaResponse) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sEPrepareOtaResponse.prepareStatus_ = this.prepareStatus_;
                } else {
                    i7 = 0;
                }
                sEPrepareOtaResponse.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return LargeFileProtos.internal_static_SEPrepareOtaResponse_descriptor;
            }

            public Builder clearPrepareStatus() {
                this.bitField0_ &= -2;
                this.prepareStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return LargeFileProtos.internal_static_SEPrepareOtaResponse_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaResponseOrBuilder
            public CommonProtos.SEPrepareStatus getPrepareStatus() {
                CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
                return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SEPrepareOtaResponseOrBuilder
            public boolean hasPrepareStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return LargeFileProtos.internal_static_SEPrepareOtaResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPrepareOtaResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPrepareStatus();
            }

            public Builder setPrepareStatus(CommonProtos.SEPrepareStatus sEPrepareStatus) {
                sEPrepareStatus.getClass();
                this.bitField0_ |= 1;
                this.prepareStatus_ = sEPrepareStatus.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPrepareOtaResponse build() {
                SEPrepareOtaResponse sEPrepareOtaResponseBuildPartial = buildPartial();
                if (sEPrepareOtaResponseBuildPartial.isInitialized()) {
                    return sEPrepareOtaResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEPrepareOtaResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPrepareOtaResponse buildPartial() {
                SEPrepareOtaResponse sEPrepareOtaResponse = new SEPrepareOtaResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEPrepareOtaResponse);
                }
                onBuilt();
                return sEPrepareOtaResponse;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEPrepareOtaResponse getDefaultInstanceForType() {
                return SEPrepareOtaResponse.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.prepareStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEPrepareOtaResponse) {
                    return mergeFrom((SEPrepareOtaResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEPrepareOtaResponse sEPrepareOtaResponse) {
                if (sEPrepareOtaResponse == SEPrepareOtaResponse.getDefaultInstance()) {
                    return this;
                }
                if (sEPrepareOtaResponse.hasPrepareStatus()) {
                    setPrepareStatus(sEPrepareOtaResponse.getPrepareStatus());
                }
                mergeUnknownFields(sEPrepareOtaResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 8) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (CommonProtos.SEPrepareStatus.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.prepareStatus_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SEPrepareOtaResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.prepareStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEPrepareOtaResponse sEPrepareOtaResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEPrepareOtaResponse);
        }

        public static SEPrepareOtaResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEPrepareOtaResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPrepareOtaResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPrepareOtaResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEPrepareOtaResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEPrepareOtaResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEPrepareOtaResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.prepareStatus_ = 0;
        }

        public static SEPrepareOtaResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEPrepareOtaResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEPrepareOtaResponse parseFrom(InputStream inputStream) {
            return (SEPrepareOtaResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEPrepareOtaResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPrepareOtaResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPrepareOtaResponse parseFrom(CodedInputStream codedInputStream) {
            return (SEPrepareOtaResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEPrepareOtaResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPrepareOtaResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEPrepareOtaResponseOrBuilder extends MessageOrBuilder {
        CommonProtos.SEPrepareStatus getPrepareStatus();

        boolean hasPrepareStatus();
    }

    public static final class SESoundInstallResult extends GeneratedMessage implements SESoundInstallResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final SESoundInstallResult DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SESoundInstallResult> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private volatile Object id_;
        private byte memoizedIsInitialized;

        public enum SESoundCode implements ProtocolMessageEnum {
            VERIFY_FAILED(0),
            INSTALL_FAILED(1),
            INSTALL_SUCCESS(2);

            public static final int INSTALL_FAILED_VALUE = 1;
            public static final int INSTALL_SUCCESS_VALUE = 2;
            private static final SESoundCode[] VALUES;
            public static final int VERIFY_FAILED_VALUE = 0;
            private static final Internal.EnumLiteMap<SESoundCode> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESoundCode");
                internalValueMap = new Internal.EnumLiteMap<SESoundCode>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResult.SESoundCode.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SESoundCode findValueByNumber(int i7) {
                        return SESoundCode.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SESoundCode(int i7) {
                this.value = i7;
            }

            public static SESoundCode forNumber(int i7) {
                if (i7 == 0) {
                    return VERIFY_FAILED;
                }
                if (i7 == 1) {
                    return INSTALL_FAILED;
                }
                if (i7 != 2) {
                    return null;
                }
                return INSTALL_SUCCESS;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SESoundInstallResult.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SESoundCode> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValue(ordinal());
            }

            @Deprecated
            public static SESoundCode valueOf(int i7) {
                return forNumber(i7);
            }

            public static SESoundCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESoundInstallResult");
            DEFAULT_INSTANCE = new SESoundInstallResult();
            PARSER = new AbstractParser<SESoundInstallResult>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResult.1
                @Override // com.google.protobuf.Parser
                public SESoundInstallResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESoundInstallResult.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e9) {
                        throw new InvalidProtocolBufferException(e9).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        public static SESoundInstallResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LargeFileProtos.internal_static_SESoundInstallResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESoundInstallResult parseDelimitedFrom(InputStream inputStream) {
            return (SESoundInstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESoundInstallResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESoundInstallResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESoundInstallResult)) {
                return super.equals(obj);
            }
            SESoundInstallResult sESoundInstallResult = (SESoundInstallResult) obj;
            if (hasId() != sESoundInstallResult.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(sESoundInstallResult.getId())) && hasCode() == sESoundInstallResult.hasCode()) {
                return (!hasCode() || this.code_ == sESoundInstallResult.code_) && getUnknownFields().equals(sESoundInstallResult.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
        public SESoundCode getCode() {
            SESoundCode sESoundCodeForNumber = SESoundCode.forNumber(this.code_);
            return sESoundCodeForNumber == null ? SESoundCode.VERIFY_FAILED : sESoundCodeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LargeFileProtos.internal_static_SESoundInstallResult_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.id_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESoundInstallResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.code_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getId().hashCode();
            }
            if (hasCode()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.code_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return LargeFileProtos.internal_static_SESoundInstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SESoundInstallResult.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCode()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.code_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESoundInstallResultOrBuilder {
            private int bitField0_;
            private int code_;
            private Object id_;

            private void buildPartial0(SESoundInstallResult sESoundInstallResult) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESoundInstallResult.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESoundInstallResult.code_ = this.code_;
                    i7 |= 2;
                }
                sESoundInstallResult.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return LargeFileProtos.internal_static_SESoundInstallResult_descriptor;
            }

            public Builder clearCode() {
                this.bitField0_ &= -3;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SESoundInstallResult.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
            public SESoundCode getCode() {
                SESoundCode sESoundCodeForNumber = SESoundCode.forNumber(this.code_);
                return sESoundCodeForNumber == null ? SESoundCode.VERIFY_FAILED : sESoundCodeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return LargeFileProtos.internal_static_SESoundInstallResult_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.id_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundInstallResultOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return LargeFileProtos.internal_static_SESoundInstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SESoundInstallResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasCode();
            }

            public Builder setCode(SESoundCode sESoundCode) {
                sESoundCode.getClass();
                this.bitField0_ |= 2;
                this.code_ = sESoundCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.code_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESoundInstallResult build() {
                SESoundInstallResult sESoundInstallResultBuildPartial = buildPartial();
                if (sESoundInstallResultBuildPartial.isInitialized()) {
                    return sESoundInstallResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESoundInstallResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESoundInstallResult buildPartial() {
                SESoundInstallResult sESoundInstallResult = new SESoundInstallResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESoundInstallResult);
                }
                onBuilt();
                return sESoundInstallResult;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESoundInstallResult getDefaultInstanceForType() {
                return SESoundInstallResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.code_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.code_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESoundInstallResult) {
                    return mergeFrom((SESoundInstallResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESoundInstallResult sESoundInstallResult) {
                if (sESoundInstallResult == SESoundInstallResult.getDefaultInstance()) {
                    return this;
                }
                if (sESoundInstallResult.hasId()) {
                    this.id_ = sESoundInstallResult.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sESoundInstallResult.hasCode()) {
                    setCode(sESoundInstallResult.getCode());
                }
                mergeUnknownFields(sESoundInstallResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (SESoundCode.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.code_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SESoundInstallResult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESoundInstallResult sESoundInstallResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESoundInstallResult);
        }

        public static SESoundInstallResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESoundInstallResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundInstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESoundInstallResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESoundInstallResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESoundInstallResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESoundInstallResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SESoundInstallResult() {
            this.id_ = "";
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.code_ = 0;
        }

        public static SESoundInstallResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESoundInstallResult parseFrom(InputStream inputStream) {
            return (SESoundInstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESoundInstallResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundInstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESoundInstallResult parseFrom(CodedInputStream codedInputStream) {
            return (SESoundInstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESoundInstallResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundInstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESoundInstallResultOrBuilder extends MessageOrBuilder {
        SESoundInstallResult.SESoundCode getCode();

        String getId();

        ByteString getIdBytes();

        boolean hasCode();

        boolean hasId();
    }

    public static final class SESoundPrepareInfo extends GeneratedMessage implements SESoundPrepareInfoOrBuilder {
        private static final SESoundPrepareInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SESoundPrepareInfo> PARSER;
        public static final int SOUND_TYPE_FIELD_NUMBER = 2;
        public static final int TARGET_FILE_SIZE_FIELD_NUMBER = 3;
        public static final int TRANSFER_FILE_SIZE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int soundType_;
        private int targetFileSize_;
        private int transferFileSize_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESoundPrepareInfo");
            DEFAULT_INSTANCE = new SESoundPrepareInfo();
            PARSER = new AbstractParser<SESoundPrepareInfo>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfo.1
                @Override // com.google.protobuf.Parser
                public SESoundPrepareInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESoundPrepareInfo.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e9) {
                        throw new InvalidProtocolBufferException(e9).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        public static SESoundPrepareInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LargeFileProtos.internal_static_SESoundPrepareInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESoundPrepareInfo parseDelimitedFrom(InputStream inputStream) {
            return (SESoundPrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESoundPrepareInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESoundPrepareInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESoundPrepareInfo)) {
                return super.equals(obj);
            }
            SESoundPrepareInfo sESoundPrepareInfo = (SESoundPrepareInfo) obj;
            if (hasId() != sESoundPrepareInfo.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sESoundPrepareInfo.getId())) || hasSoundType() != sESoundPrepareInfo.hasSoundType()) {
                return false;
            }
            if ((hasSoundType() && getSoundType() != sESoundPrepareInfo.getSoundType()) || hasTargetFileSize() != sESoundPrepareInfo.hasTargetFileSize()) {
                return false;
            }
            if ((!hasTargetFileSize() || getTargetFileSize() == sESoundPrepareInfo.getTargetFileSize()) && hasTransferFileSize() == sESoundPrepareInfo.hasTransferFileSize()) {
                return (!hasTransferFileSize() || getTransferFileSize() == sESoundPrepareInfo.getTransferFileSize()) && getUnknownFields().equals(sESoundPrepareInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LargeFileProtos.internal_static_SESoundPrepareInfo_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.id_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESoundPrepareInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.soundType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.targetFileSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.transferFileSize_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public int getSoundType() {
            return this.soundType_;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public int getTargetFileSize() {
            return this.targetFileSize_;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public int getTransferFileSize() {
            return this.transferFileSize_;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public boolean hasSoundType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public boolean hasTargetFileSize() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
        public boolean hasTransferFileSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getId().hashCode();
            }
            if (hasSoundType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSoundType();
            }
            if (hasTargetFileSize()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTargetFileSize();
            }
            if (hasTransferFileSize()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getTransferFileSize();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return LargeFileProtos.internal_static_SESoundPrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SESoundPrepareInfo.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSoundType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTargetFileSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTransferFileSize()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.soundType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.targetFileSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.transferFileSize_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESoundPrepareInfoOrBuilder {
            private int bitField0_;
            private Object id_;
            private int soundType_;
            private int targetFileSize_;
            private int transferFileSize_;

            private void buildPartial0(SESoundPrepareInfo sESoundPrepareInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESoundPrepareInfo.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESoundPrepareInfo.soundType_ = this.soundType_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESoundPrepareInfo.targetFileSize_ = this.targetFileSize_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sESoundPrepareInfo.transferFileSize_ = this.transferFileSize_;
                    i7 |= 8;
                }
                sESoundPrepareInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return LargeFileProtos.internal_static_SESoundPrepareInfo_descriptor;
            }

            public Builder clearId() {
                this.id_ = SESoundPrepareInfo.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSoundType() {
                this.bitField0_ &= -3;
                this.soundType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTargetFileSize() {
                this.bitField0_ &= -5;
                this.targetFileSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTransferFileSize() {
                this.bitField0_ &= -9;
                this.transferFileSize_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return LargeFileProtos.internal_static_SESoundPrepareInfo_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.id_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public int getSoundType() {
                return this.soundType_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public int getTargetFileSize() {
                return this.targetFileSize_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public int getTransferFileSize() {
                return this.transferFileSize_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public boolean hasSoundType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public boolean hasTargetFileSize() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundPrepareInfoOrBuilder
            public boolean hasTransferFileSize() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return LargeFileProtos.internal_static_SESoundPrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SESoundPrepareInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasSoundType() && hasTargetFileSize() && hasTransferFileSize();
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSoundType(int i7) {
                this.soundType_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTargetFileSize(int i7) {
                this.targetFileSize_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTransferFileSize(int i7) {
                this.transferFileSize_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESoundPrepareInfo build() {
                SESoundPrepareInfo sESoundPrepareInfoBuildPartial = buildPartial();
                if (sESoundPrepareInfoBuildPartial.isInitialized()) {
                    return sESoundPrepareInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESoundPrepareInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESoundPrepareInfo buildPartial() {
                SESoundPrepareInfo sESoundPrepareInfo = new SESoundPrepareInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESoundPrepareInfo);
                }
                onBuilt();
                return sESoundPrepareInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESoundPrepareInfo getDefaultInstanceForType() {
                return SESoundPrepareInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.soundType_ = 0;
                this.targetFileSize_ = 0;
                this.transferFileSize_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESoundPrepareInfo) {
                    return mergeFrom((SESoundPrepareInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESoundPrepareInfo sESoundPrepareInfo) {
                if (sESoundPrepareInfo == SESoundPrepareInfo.getDefaultInstance()) {
                    return this;
                }
                if (sESoundPrepareInfo.hasId()) {
                    this.id_ = sESoundPrepareInfo.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sESoundPrepareInfo.hasSoundType()) {
                    setSoundType(sESoundPrepareInfo.getSoundType());
                }
                if (sESoundPrepareInfo.hasTargetFileSize()) {
                    setTargetFileSize(sESoundPrepareInfo.getTargetFileSize());
                }
                if (sESoundPrepareInfo.hasTransferFileSize()) {
                    setTransferFileSize(sESoundPrepareInfo.getTransferFileSize());
                }
                mergeUnknownFields(sESoundPrepareInfo.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.soundType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.targetFileSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.transferFileSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SESoundPrepareInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.soundType_ = 0;
            this.targetFileSize_ = 0;
            this.transferFileSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESoundPrepareInfo sESoundPrepareInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESoundPrepareInfo);
        }

        public static SESoundPrepareInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESoundPrepareInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundPrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESoundPrepareInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESoundPrepareInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESoundPrepareInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESoundPrepareInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESoundPrepareInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESoundPrepareInfo parseFrom(InputStream inputStream) {
            return (SESoundPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SESoundPrepareInfo() {
            this.id_ = "";
            this.soundType_ = 0;
            this.targetFileSize_ = 0;
            this.transferFileSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static SESoundPrepareInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESoundPrepareInfo parseFrom(CodedInputStream codedInputStream) {
            return (SESoundPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESoundPrepareInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESoundPrepareInfoOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        int getSoundType();

        int getTargetFileSize();

        int getTransferFileSize();

        boolean hasId();

        boolean hasSoundType();

        boolean hasTargetFileSize();

        boolean hasTransferFileSize();
    }

    public static final class SESoundResultInfo extends GeneratedMessage implements SESoundResultInfoOrBuilder {
        private static final SESoundResultInfo DEFAULT_INSTANCE;
        public static final int MEMORY_SIZE_FIELD_NUMBER = 2;
        public static final int MEMORY_SURPLUS_FIELD_NUMBER = 3;
        private static final Parser<SESoundResultInfo> PARSER;
        public static final int PREPARE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memorySize_;
        private int memorySurplus_;
        private int prepareStatus_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESoundResultInfo");
            DEFAULT_INSTANCE = new SESoundResultInfo();
            PARSER = new AbstractParser<SESoundResultInfo>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfo.1
                @Override // com.google.protobuf.Parser
                public SESoundResultInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESoundResultInfo.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e9) {
                        throw new InvalidProtocolBufferException(e9).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        public static SESoundResultInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LargeFileProtos.internal_static_SESoundResultInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESoundResultInfo parseDelimitedFrom(InputStream inputStream) {
            return (SESoundResultInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESoundResultInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESoundResultInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESoundResultInfo)) {
                return super.equals(obj);
            }
            SESoundResultInfo sESoundResultInfo = (SESoundResultInfo) obj;
            if (hasPrepareStatus() != sESoundResultInfo.hasPrepareStatus()) {
                return false;
            }
            if ((hasPrepareStatus() && this.prepareStatus_ != sESoundResultInfo.prepareStatus_) || hasMemorySize() != sESoundResultInfo.hasMemorySize()) {
                return false;
            }
            if ((!hasMemorySize() || getMemorySize() == sESoundResultInfo.getMemorySize()) && hasMemorySurplus() == sESoundResultInfo.hasMemorySurplus()) {
                return (!hasMemorySurplus() || getMemorySurplus() == sESoundResultInfo.getMemorySurplus()) && getUnknownFields().equals(sESoundResultInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LargeFileProtos.internal_static_SESoundResultInfo_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
        public int getMemorySize() {
            return this.memorySize_;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
        public int getMemorySurplus() {
            return this.memorySurplus_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESoundResultInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
        public CommonProtos.SEPrepareStatus getPrepareStatus() {
            CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
            return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.prepareStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.memorySize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.memorySurplus_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
        public boolean hasMemorySize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
        public boolean hasMemorySurplus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
        public boolean hasPrepareStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPrepareStatus()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.prepareStatus_;
            }
            if (hasMemorySize()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMemorySize();
            }
            if (hasMemorySurplus()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMemorySurplus();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return LargeFileProtos.internal_static_SESoundResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SESoundResultInfo.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (hasPrepareStatus()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.prepareStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.memorySize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.memorySurplus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESoundResultInfoOrBuilder {
            private int bitField0_;
            private int memorySize_;
            private int memorySurplus_;
            private int prepareStatus_;

            private void buildPartial0(SESoundResultInfo sESoundResultInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESoundResultInfo.prepareStatus_ = this.prepareStatus_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESoundResultInfo.memorySize_ = this.memorySize_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESoundResultInfo.memorySurplus_ = this.memorySurplus_;
                    i7 |= 4;
                }
                sESoundResultInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return LargeFileProtos.internal_static_SESoundResultInfo_descriptor;
            }

            public Builder clearMemorySize() {
                this.bitField0_ &= -3;
                this.memorySize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMemorySurplus() {
                this.bitField0_ &= -5;
                this.memorySurplus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPrepareStatus() {
                this.bitField0_ &= -2;
                this.prepareStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return LargeFileProtos.internal_static_SESoundResultInfo_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
            public int getMemorySize() {
                return this.memorySize_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
            public int getMemorySurplus() {
                return this.memorySurplus_;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
            public CommonProtos.SEPrepareStatus getPrepareStatus() {
                CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
                return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
            public boolean hasMemorySize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
            public boolean hasMemorySurplus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.LargeFileProtos.SESoundResultInfoOrBuilder
            public boolean hasPrepareStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return LargeFileProtos.internal_static_SESoundResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SESoundResultInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPrepareStatus();
            }

            public Builder setMemorySize(int i7) {
                this.memorySize_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMemorySurplus(int i7) {
                this.memorySurplus_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPrepareStatus(CommonProtos.SEPrepareStatus sEPrepareStatus) {
                sEPrepareStatus.getClass();
                this.bitField0_ |= 1;
                this.prepareStatus_ = sEPrepareStatus.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESoundResultInfo build() {
                SESoundResultInfo sESoundResultInfoBuildPartial = buildPartial();
                if (sESoundResultInfoBuildPartial.isInitialized()) {
                    return sESoundResultInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESoundResultInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESoundResultInfo buildPartial() {
                SESoundResultInfo sESoundResultInfo = new SESoundResultInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESoundResultInfo);
                }
                onBuilt();
                return sESoundResultInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESoundResultInfo getDefaultInstanceForType() {
                return SESoundResultInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.prepareStatus_ = 0;
                this.memorySize_ = 0;
                this.memorySurplus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESoundResultInfo) {
                    return mergeFrom((SESoundResultInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESoundResultInfo sESoundResultInfo) {
                if (sESoundResultInfo == SESoundResultInfo.getDefaultInstance()) {
                    return this;
                }
                if (sESoundResultInfo.hasPrepareStatus()) {
                    setPrepareStatus(sESoundResultInfo.getPrepareStatus());
                }
                if (sESoundResultInfo.hasMemorySize()) {
                    setMemorySize(sESoundResultInfo.getMemorySize());
                }
                if (sESoundResultInfo.hasMemorySurplus()) {
                    setMemorySurplus(sESoundResultInfo.getMemorySurplus());
                }
                mergeUnknownFields(sESoundResultInfo.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i7 = codedInputStream.readEnum();
                                    if (CommonProtos.SEPrepareStatus.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.prepareStatus_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.memorySize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.memorySurplus_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SESoundResultInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.prepareStatus_ = 0;
            this.memorySize_ = 0;
            this.memorySurplus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESoundResultInfo sESoundResultInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESoundResultInfo);
        }

        public static SESoundResultInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESoundResultInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundResultInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESoundResultInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESoundResultInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESoundResultInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESoundResultInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESoundResultInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SESoundResultInfo() {
            this.memorySize_ = 0;
            this.memorySurplus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.prepareStatus_ = 0;
        }

        public static SESoundResultInfo parseFrom(InputStream inputStream) {
            return (SESoundResultInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESoundResultInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundResultInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESoundResultInfo parseFrom(CodedInputStream codedInputStream) {
            return (SESoundResultInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESoundResultInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESoundResultInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESoundResultInfoOrBuilder extends MessageOrBuilder {
        int getMemorySize();

        int getMemorySurplus();

        CommonProtos.SEPrepareStatus getPrepareStatus();

        boolean hasMemorySize();

        boolean hasMemorySurplus();

        boolean hasPrepareStatus();
    }

    public enum SEType implements ProtocolMessageEnum {
        ALL(0),
        ROM(1),
        RES(2);

        public static final int ALL_VALUE = 0;
        public static final int RES_VALUE = 2;
        public static final int ROM_VALUE = 1;
        private static final SEType[] VALUES;
        private static final Internal.EnumLiteMap<SEType> internalValueMap;
        private final int value;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEType");
            internalValueMap = new Internal.EnumLiteMap<SEType>() { // from class: com.zh.ble.wear.protobuf.LargeFileProtos.SEType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEType findValueByNumber(int i7) {
                    return SEType.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEType(int i7) {
            this.value = i7;
        }

        public static SEType forNumber(int i7) {
            if (i7 == 0) {
                return ALL;
            }
            if (i7 == 1) {
                return ROM;
            }
            if (i7 != 2) {
                return null;
            }
            return RES;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return LargeFileProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValue(ordinal());
        }

        @Deprecated
        public static SEType valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "LargeFileProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fLargeFile.proto\u001a\fnanopb.proto\u001a\fCommon.proto\"ü\u0002\n\u000bSELargeFile\u00123\n\u0013prepare_ota_request\u0018\u0001 \u0001(\u000b2\u0014.SEPrepareOtaRequestH\u0000\u00125\n\u0014prepare_ota_response\u0018\u0002 \u0001(\u000b2\u0015.SEPrepareOtaResponseH\u0000\u0012\u000e\n\u0004days\u0018\u0003 \u0001(\rH\u0000\u0012\u0014\n\nagps_state\u0018\u0004 \u0001(\bH\u0000\u0012<\n\u0017breakpoint_continuation\u0018\u0005 \u0001(\u000b2\u0019.SEBreakpointContinuationH\u0000\u00120\n\u0011soundPrepare_info\u0018\u0006 \u0001(\u000b2\u0013.SESoundPrepareInfoH\u0000\u0012/\n\u0011sound_result_info\u0018\u0007 \u0001(\u000b2\u0012.SESoundResultInfoH\u0000\u0012/\n\u000einstall_result\u0018\b \u0001(\u000b2\u0015.SESoundInstallResultH\u0000B\t\n\u0007payload\"u\n\u0013SEPrepareOtaRequest\u0012\r\n\u0005force\u0018\u0001 \u0002(\b\u0012\u0015\n\u0004type\u0018\u0002 \u0002(\u000e2\u0007.SEType\u0012\u001f\n\u0010firmware_version\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\bfile_md5\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"@\n\u0014SEPrepareOtaResponse\u0012(\n\u000eprepare_status\u0018\u0001 \u0002(\u000e2\u0010.SEPrepareStatus\"\u009b\u0001\n\u0018SEBreakpointContinuation\u0012/\n breakpoint_continuation_state_sn\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012%\n\u001dbreakpoint_continuation_state\u0018\u0002 \u0002(\b\u0012'\n\u001fbreakpoint_continuation_support\u0018\u0003 \u0002(\b\"\u0086\u0001\n\u0012SESoundPrepareInfo\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nsound_type\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001f\n\u0010target_file_size\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028 \u0012!\n\u0012transfer_file_size\u0018\u0004 \u0002(\rB\u0005\u0092?\u00028 \"x\n\u0011SESoundResultInfo\u0012(\n\u000eprepare_status\u0018\u0001 \u0002(\u000e2\u0010.SEPrepareStatus\u0012\u001a\n\u000bmemory_size\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028 \u0012\u001d\n\u000ememory_surplus\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028 \"¥\u0001\n\u0014SESoundInstallResult\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012/\n\u0004code\u0018\u0002 \u0002(\u000e2!.SESoundInstallResult.SESoundCode\"I\n\u000bSESoundCode\u0012\u0011\n\rVERIFY_FAILED\u0010\u0000\u0012\u0012\n\u000eINSTALL_FAILED\u0010\u0001\u0012\u0013\n\u000fINSTALL_SUCCESS\u0010\u0002*#\n\u0006SEType\u0012\u0007\n\u0003ALL\u0010\u0000\u0012\u0007\n\u0003ROM\u0010\u0001\u0012\u0007\n\u0003RES\u0010\u0002B+\n\u0018com.zh.ble.wear.protobufB\u000fLargeFileProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SELargeFile_descriptor = messageType;
        internal_static_SELargeFile_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"PrepareOtaRequest", "PrepareOtaResponse", "Days", "AgpsState", "BreakpointContinuation", "SoundPrepareInfo", "SoundResultInfo", "InstallResult", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SEPrepareOtaRequest_descriptor = messageType2;
        internal_static_SEPrepareOtaRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"Force", "Type", "FirmwareVersion", "FileMd5"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEPrepareOtaResponse_descriptor = messageType3;
        internal_static_SEPrepareOtaResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"PrepareStatus"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SEBreakpointContinuation_descriptor = messageType4;
        internal_static_SEBreakpointContinuation_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"BreakpointContinuationStateSn", "BreakpointContinuationState", "BreakpointContinuationSupport"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SESoundPrepareInfo_descriptor = messageType5;
        internal_static_SESoundPrepareInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Id", "SoundType", "TargetFileSize", "TransferFileSize"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SESoundResultInfo_descriptor = messageType6;
        internal_static_SESoundResultInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"PrepareStatus", "MemorySize", "MemorySurplus"});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SESoundInstallResult_descriptor = messageType7;
        internal_static_SESoundInstallResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"Id", "Code"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private LargeFileProtos() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}