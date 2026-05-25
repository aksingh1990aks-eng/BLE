package com.zh.ble.sa_wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.media3.exoplayer.dash.manifest.UrlTemplate;
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
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import com.zh.ble.sa_wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class AlexaProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEAleax_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAleax_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaAlertData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaAlertData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaClockInfo_SEData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaClockInfo_SEData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaClockInfo_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaClockInfo_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaClockInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaClockInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaEventRemind_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaEventRemind_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaEventRemind_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaEventRemind_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaInstruction_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaInstruction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaTemplateGeneral_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaTemplateGeneral_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAlexaTitle_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAlexaTitle_fieldAccessorTable;

    public enum SEALEXA_ALEXAID implements ProtocolMessageEnum {
        SYNC_INSTRUCTION(0);

        public static final int SYNC_INSTRUCTION_VALUE = 0;
        private static final SEALEXA_ALEXAID[] VALUES;
        private static final Internal.EnumLiteMap<SEALEXA_ALEXAID> internalValueMap;
        private final int value;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEALEXA_ALEXAID");
            internalValueMap = new Internal.EnumLiteMap<SEALEXA_ALEXAID>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEALEXA_ALEXAID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEALEXA_ALEXAID findValueByNumber(int i7) {
                    return SEALEXA_ALEXAID.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEALEXA_ALEXAID(int i7) {
            this.value = i7;
        }

        public static SEALEXA_ALEXAID forNumber(int i7) {
            if (i7 != 0) {
                return null;
            }
            return SYNC_INSTRUCTION;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return AlexaProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEALEXA_ALEXAID> internalGetValueMap() {
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
        public static SEALEXA_ALEXAID valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEALEXA_ALEXAID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEAleax extends GeneratedMessage implements SEAleaxOrBuilder {
        private static final SEAleax DEFAULT_INSTANCE;
        public static final int INSTRUCTION_FIELD_NUMBER = 1;
        private static final Parser<SEAleax> PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            INSTRUCTION(1),
            PAYLOAD_NOT_SET(0);

            private final int value;

            PayloadCase(int i7) {
                this.value = i7;
            }

            public static PayloadCase forNumber(int i7) {
                if (i7 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i7 != 1) {
                    return null;
                }
                return INSTRUCTION;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAleax");
            DEFAULT_INSTANCE = new SEAleax();
            PARSER = new AbstractParser<SEAleax>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleax.1
                @Override // com.google.protobuf.Parser
                public SEAleax parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAleax.newBuilder();
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

        public static SEAleax getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_SA_SEAleax_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAleax parseDelimitedFrom(InputStream inputStream) {
            return (SEAleax) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAleax parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAleax> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAleax)) {
                return super.equals(obj);
            }
            SEAleax sEAleax = (SEAleax) obj;
            if (getPayloadCase().equals(sEAleax.getPayloadCase())) {
                return (this.payloadCase_ != 1 || getInstruction().equals(sEAleax.getInstruction())) && getUnknownFields().equals(sEAleax.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AlexaProtos.internal_static_SA_SEAleax_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
        public SEAlexaInstruction getInstruction() {
            return this.payloadCase_ == 1 ? (SEAlexaInstruction) this.payload_ : SEAlexaInstruction.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
        public SEAlexaInstructionOrBuilder getInstructionOrBuilder() {
            return this.payloadCase_ == 1 ? (SEAlexaInstruction) this.payload_ : SEAlexaInstruction.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAleax> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEAlexaInstruction) this.payload_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
        public boolean hasInstruction() {
            return this.payloadCase_ == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (this.payloadCase_ == 1) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getInstruction().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_SA_SEAleax_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAleax.class, Builder.class);
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
            if (!hasInstruction() || getInstruction().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEAlexaInstruction) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAleaxOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> instructionBuilder_;
            private int payloadCase_;
            private Object payload_;

            private void buildPartial0(SEAleax sEAleax) {
            }

            private void buildPartialOneofs(SEAleax sEAleax) {
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                sEAleax.payloadCase_ = i7;
                sEAleax.payload_ = this.payload_;
                if (i7 != 1 || (singleFieldBuilder = this.instructionBuilder_) == null) {
                    return;
                }
                sEAleax.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAleax_descriptor;
            }

            private SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> internalGetInstructionFieldBuilder() {
                if (this.instructionBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEAlexaInstruction.getDefaultInstance();
                    }
                    this.instructionBuilder_ = new SingleFieldBuilder<>((SEAlexaInstruction) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.instructionBuilder_;
            }

            public Builder clearInstruction() {
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder = this.instructionBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAleax_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
            public SEAlexaInstruction getInstruction() {
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder = this.instructionBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEAlexaInstruction) this.payload_ : SEAlexaInstruction.getDefaultInstance() : this.payloadCase_ == 1 ? (SEAlexaInstruction) singleFieldBuilder.getMessage() : SEAlexaInstruction.getDefaultInstance();
            }

            public SEAlexaInstruction.Builder getInstructionBuilder() {
                return (SEAlexaInstruction.Builder) internalGetInstructionFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
            public SEAlexaInstructionOrBuilder getInstructionOrBuilder() {
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.instructionBuilder_) == null) ? i7 == 1 ? (SEAlexaInstruction) this.payload_ : SEAlexaInstruction.getDefaultInstance() : (SEAlexaInstructionOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAleaxOrBuilder
            public boolean hasInstruction() {
                return this.payloadCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAleax_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAleax.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasInstruction() || getInstruction().isInitialized();
            }

            public Builder mergeInstruction(SEAlexaInstruction sEAlexaInstruction) {
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder = this.instructionBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEAlexaInstruction.getDefaultInstance()) {
                        this.payload_ = sEAlexaInstruction;
                    } else {
                        this.payload_ = SEAlexaInstruction.newBuilder((SEAlexaInstruction) this.payload_).mergeFrom(sEAlexaInstruction).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEAlexaInstruction);
                } else {
                    singleFieldBuilder.setMessage(sEAlexaInstruction);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setInstruction(SEAlexaInstruction sEAlexaInstruction) {
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder = this.instructionBuilder_;
                if (singleFieldBuilder == null) {
                    sEAlexaInstruction.getClass();
                    this.payload_ = sEAlexaInstruction;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEAlexaInstruction);
                }
                this.payloadCase_ = 1;
                return this;
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAleax build() {
                SEAleax sEAleaxBuildPartial = buildPartial();
                if (sEAleaxBuildPartial.isInitialized()) {
                    return sEAleaxBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAleaxBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAleax buildPartial() {
                SEAleax sEAleax = new SEAleax(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAleax);
                }
                buildPartialOneofs(sEAleax);
                onBuilt();
                return sEAleax;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAleax getDefaultInstanceForType() {
                return SEAleax.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder = this.instructionBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAleax) {
                    return mergeFrom((SEAleax) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setInstruction(SEAlexaInstruction.Builder builder) {
                SingleFieldBuilder<SEAlexaInstruction, SEAlexaInstruction.Builder, SEAlexaInstructionOrBuilder> singleFieldBuilder = this.instructionBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeFrom(SEAleax sEAleax) {
                if (sEAleax == SEAleax.getDefaultInstance()) {
                    return this;
                }
                if (sEAleax.getPayloadCase().ordinal() == 0) {
                    mergeInstruction(sEAleax.getInstruction());
                }
                mergeUnknownFields(sEAleax.getUnknownFields());
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetInstructionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
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

        private SEAleax(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAleax sEAleax) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAleax);
        }

        public static SEAleax parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAleax parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAleax) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAleax parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAleax getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAleax parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEAleax() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAleax parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAleax parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAleax parseFrom(InputStream inputStream) {
            return (SEAleax) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAleax parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAleax) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAleax parseFrom(CodedInputStream codedInputStream) {
            return (SEAleax) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAleax parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAleax) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAleaxOrBuilder extends MessageOrBuilder {
        SEAlexaInstruction getInstruction();

        SEAlexaInstructionOrBuilder getInstructionOrBuilder();

        SEAleax.PayloadCase getPayloadCase();

        boolean hasInstruction();
    }

    public static final class SEAlexaAlertData extends GeneratedMessage implements SEAlexaAlertDataOrBuilder {
        public static final int ALEXA_DARA_TYPE_FIELD_NUMBER = 6;
        public static final int ALEXA_HOUR_FIELD_NUMBER = 1;
        public static final int ALEXA_MIN_FIELD_NUMBER = 2;
        public static final int ALEXA_TOKEN_FIELD_NUMBER = 4;
        public static final int ALEXA_TYPE_FIELD_NUMBER = 5;
        public static final int ALEXA_WEEK_FIELD_NUMBER = 3;
        private static final SEAlexaAlertData DEFAULT_INSTANCE;
        private static final Parser<SEAlexaAlertData> PARSER;
        private static final long serialVersionUID = 0;
        private int alexaDaraType_;
        private int alexaHour_;
        private int alexaMin_;
        private volatile Object alexaToken_;
        private int alexaType_;
        private int alexaWeek_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAlexaAlertData");
            DEFAULT_INSTANCE = new SEAlexaAlertData();
            PARSER = new AbstractParser<SEAlexaAlertData>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertData.1
                @Override // com.google.protobuf.Parser
                public SEAlexaAlertData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAlexaAlertData.newBuilder();
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

        public static SEAlexaAlertData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_SA_SEAlexaAlertData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAlexaAlertData parseDelimitedFrom(InputStream inputStream) {
            return (SEAlexaAlertData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAlexaAlertData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAlexaAlertData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAlexaAlertData)) {
                return super.equals(obj);
            }
            SEAlexaAlertData sEAlexaAlertData = (SEAlexaAlertData) obj;
            if (hasAlexaHour() != sEAlexaAlertData.hasAlexaHour()) {
                return false;
            }
            if ((hasAlexaHour() && getAlexaHour() != sEAlexaAlertData.getAlexaHour()) || hasAlexaMin() != sEAlexaAlertData.hasAlexaMin()) {
                return false;
            }
            if ((hasAlexaMin() && getAlexaMin() != sEAlexaAlertData.getAlexaMin()) || hasAlexaWeek() != sEAlexaAlertData.hasAlexaWeek()) {
                return false;
            }
            if ((hasAlexaWeek() && getAlexaWeek() != sEAlexaAlertData.getAlexaWeek()) || hasAlexaToken() != sEAlexaAlertData.hasAlexaToken()) {
                return false;
            }
            if ((hasAlexaToken() && !getAlexaToken().equals(sEAlexaAlertData.getAlexaToken())) || hasAlexaType() != sEAlexaAlertData.hasAlexaType()) {
                return false;
            }
            if ((!hasAlexaType() || getAlexaType() == sEAlexaAlertData.getAlexaType()) && hasAlexaDaraType() == sEAlexaAlertData.hasAlexaDaraType()) {
                return (!hasAlexaDaraType() || getAlexaDaraType() == sEAlexaAlertData.getAlexaDaraType()) && getUnknownFields().equals(sEAlexaAlertData.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public int getAlexaDaraType() {
            return this.alexaDaraType_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public int getAlexaHour() {
            return this.alexaHour_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public int getAlexaMin() {
            return this.alexaMin_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public String getAlexaToken() {
            Object obj = this.alexaToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.alexaToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public ByteString getAlexaTokenBytes() {
            Object obj = this.alexaToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.alexaToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public int getAlexaType() {
            return this.alexaType_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public int getAlexaWeek() {
            return this.alexaWeek_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AlexaProtos.internal_static_SA_SEAlexaAlertData_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAlexaAlertData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.alexaHour_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.alexaMin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.alexaWeek_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(4, this.alexaToken_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.alexaType_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.alexaDaraType_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public boolean hasAlexaDaraType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public boolean hasAlexaHour() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public boolean hasAlexaMin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public boolean hasAlexaToken() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public boolean hasAlexaType() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
        public boolean hasAlexaWeek() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAlexaHour()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAlexaHour();
            }
            if (hasAlexaMin()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAlexaMin();
            }
            if (hasAlexaWeek()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAlexaWeek();
            }
            if (hasAlexaToken()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getAlexaToken().hashCode();
            }
            if (hasAlexaType()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAlexaType();
            }
            if (hasAlexaDaraType()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getAlexaDaraType();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_SA_SEAlexaAlertData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaAlertData.class, Builder.class);
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
            if (!hasAlexaHour()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlexaMin()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlexaWeek()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlexaToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlexaType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAlexaDaraType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.alexaHour_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.alexaMin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.alexaWeek_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.alexaToken_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.alexaType_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.alexaDaraType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAlexaAlertDataOrBuilder {
            private int alexaDaraType_;
            private int alexaHour_;
            private int alexaMin_;
            private Object alexaToken_;
            private int alexaType_;
            private int alexaWeek_;
            private int bitField0_;

            private void buildPartial0(SEAlexaAlertData sEAlexaAlertData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAlexaAlertData.alexaHour_ = this.alexaHour_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAlexaAlertData.alexaMin_ = this.alexaMin_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEAlexaAlertData.alexaWeek_ = this.alexaWeek_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEAlexaAlertData.alexaToken_ = this.alexaToken_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEAlexaAlertData.alexaType_ = this.alexaType_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEAlexaAlertData.alexaDaraType_ = this.alexaDaraType_;
                    i7 |= 32;
                }
                sEAlexaAlertData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaAlertData_descriptor;
            }

            public Builder clearAlexaDaraType() {
                this.bitField0_ &= -33;
                this.alexaDaraType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAlexaHour() {
                this.bitField0_ &= -2;
                this.alexaHour_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAlexaMin() {
                this.bitField0_ &= -3;
                this.alexaMin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAlexaToken() {
                this.alexaToken_ = SEAlexaAlertData.getDefaultInstance().getAlexaToken();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearAlexaType() {
                this.bitField0_ &= -17;
                this.alexaType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAlexaWeek() {
                this.bitField0_ &= -5;
                this.alexaWeek_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public int getAlexaDaraType() {
                return this.alexaDaraType_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public int getAlexaHour() {
                return this.alexaHour_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public int getAlexaMin() {
                return this.alexaMin_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public String getAlexaToken() {
                Object obj = this.alexaToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.alexaToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public ByteString getAlexaTokenBytes() {
                Object obj = this.alexaToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.alexaToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public int getAlexaType() {
                return this.alexaType_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public int getAlexaWeek() {
                return this.alexaWeek_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaAlertData_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public boolean hasAlexaDaraType() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public boolean hasAlexaHour() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public boolean hasAlexaMin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public boolean hasAlexaToken() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public boolean hasAlexaType() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaAlertDataOrBuilder
            public boolean hasAlexaWeek() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaAlertData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaAlertData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAlexaHour() && hasAlexaMin() && hasAlexaWeek() && hasAlexaToken() && hasAlexaType() && hasAlexaDaraType();
            }

            public Builder setAlexaDaraType(int i7) {
                this.alexaDaraType_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setAlexaHour(int i7) {
                this.alexaHour_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAlexaMin(int i7) {
                this.alexaMin_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAlexaToken(String str) {
                str.getClass();
                this.alexaToken_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAlexaTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.alexaToken_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAlexaType(int i7) {
                this.alexaType_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAlexaWeek(int i7) {
                this.alexaWeek_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder() {
                this.alexaToken_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaAlertData build() {
                SEAlexaAlertData sEAlexaAlertDataBuildPartial = buildPartial();
                if (sEAlexaAlertDataBuildPartial.isInitialized()) {
                    return sEAlexaAlertDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAlexaAlertDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaAlertData buildPartial() {
                SEAlexaAlertData sEAlexaAlertData = new SEAlexaAlertData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAlexaAlertData);
                }
                onBuilt();
                return sEAlexaAlertData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAlexaAlertData getDefaultInstanceForType() {
                return SEAlexaAlertData.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.alexaToken_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.alexaHour_ = 0;
                this.alexaMin_ = 0;
                this.alexaWeek_ = 0;
                this.alexaToken_ = "";
                this.alexaType_ = 0;
                this.alexaDaraType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAlexaAlertData) {
                    return mergeFrom((SEAlexaAlertData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEAlexaAlertData sEAlexaAlertData) {
                if (sEAlexaAlertData == SEAlexaAlertData.getDefaultInstance()) {
                    return this;
                }
                if (sEAlexaAlertData.hasAlexaHour()) {
                    setAlexaHour(sEAlexaAlertData.getAlexaHour());
                }
                if (sEAlexaAlertData.hasAlexaMin()) {
                    setAlexaMin(sEAlexaAlertData.getAlexaMin());
                }
                if (sEAlexaAlertData.hasAlexaWeek()) {
                    setAlexaWeek(sEAlexaAlertData.getAlexaWeek());
                }
                if (sEAlexaAlertData.hasAlexaToken()) {
                    this.alexaToken_ = sEAlexaAlertData.alexaToken_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEAlexaAlertData.hasAlexaType()) {
                    setAlexaType(sEAlexaAlertData.getAlexaType());
                }
                if (sEAlexaAlertData.hasAlexaDaraType()) {
                    setAlexaDaraType(sEAlexaAlertData.getAlexaDaraType());
                }
                mergeUnknownFields(sEAlexaAlertData.getUnknownFields());
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
                                    this.alexaHour_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.alexaMin_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.alexaWeek_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.alexaToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.alexaType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.alexaDaraType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
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

        private SEAlexaAlertData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.alexaHour_ = 0;
            this.alexaMin_ = 0;
            this.alexaWeek_ = 0;
            this.alexaToken_ = "";
            this.alexaType_ = 0;
            this.alexaDaraType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAlexaAlertData sEAlexaAlertData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAlexaAlertData);
        }

        public static SEAlexaAlertData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAlexaAlertData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaAlertData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaAlertData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAlexaAlertData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAlexaAlertData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAlexaAlertData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAlexaAlertData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAlexaAlertData parseFrom(InputStream inputStream) {
            return (SEAlexaAlertData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAlexaAlertData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaAlertData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SEAlexaAlertData() {
            this.alexaHour_ = 0;
            this.alexaMin_ = 0;
            this.alexaWeek_ = 0;
            this.alexaToken_ = "";
            this.alexaType_ = 0;
            this.alexaDaraType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.alexaToken_ = "";
        }

        public static SEAlexaAlertData parseFrom(CodedInputStream codedInputStream) {
            return (SEAlexaAlertData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAlexaAlertData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaAlertData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAlexaAlertDataOrBuilder extends MessageOrBuilder {
        int getAlexaDaraType();

        int getAlexaHour();

        int getAlexaMin();

        String getAlexaToken();

        ByteString getAlexaTokenBytes();

        int getAlexaType();

        int getAlexaWeek();

        boolean hasAlexaDaraType();

        boolean hasAlexaHour();

        boolean hasAlexaMin();

        boolean hasAlexaToken();

        boolean hasAlexaType();

        boolean hasAlexaWeek();
    }

    public static final class SEAlexaClockInfo extends GeneratedMessage implements SEAlexaClockInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final SEAlexaClockInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SEAlexaClockInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEData data_;
        private int id_;
        private byte memoizedIsInitialized;

        public static final class SEData extends GeneratedMessage implements SEDataOrBuilder {
            private static final SEData DEFAULT_INSTANCE;
            public static final int ENABLE_FIELD_NUMBER = 3;
            private static final Parser<SEData> PARSER;
            public static final int TIME_FIELD_NUMBER = 1;
            public static final int WEEK_DAYS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private boolean enable_;
            private byte memoizedIsInitialized;
            private CommonProtos.SESettingTime time_;
            private int weekDays_;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEData");
                DEFAULT_INSTANCE = new SEData();
                PARSER = new AbstractParser<SEData>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEData.1
                    @Override // com.google.protobuf.Parser
                    public SEData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = SEData.newBuilder();
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

            public static SEData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SEData parseDelimitedFrom(InputStream inputStream) {
                return (SEData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SEData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SEData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SEData)) {
                    return super.equals(obj);
                }
                SEData sEData = (SEData) obj;
                if (hasTime() != sEData.hasTime()) {
                    return false;
                }
                if ((hasTime() && !getTime().equals(sEData.getTime())) || hasWeekDays() != sEData.hasWeekDays()) {
                    return false;
                }
                if ((!hasWeekDays() || getWeekDays() == sEData.getWeekDays()) && hasEnable() == sEData.hasEnable()) {
                    return (!hasEnable() || getEnable() == sEData.getEnable()) && getUnknownFields().equals(sEData.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEData_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SEData> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTime()) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.weekDays_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeBoolSize(3, this.enable_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
            public CommonProtos.SESettingTime getTime() {
                CommonProtos.SESettingTime sESettingTime = this.time_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
            public CommonProtos.SESettingTimeOrBuilder getTimeOrBuilder() {
                CommonProtos.SESettingTime sESettingTime = this.time_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
            public int getWeekDays() {
                return this.weekDays_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
            public boolean hasTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
            public boolean hasWeekDays() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasTime()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTime().hashCode();
                }
                if (hasWeekDays()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWeekDays();
                }
                if (hasEnable()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getEnable());
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEData.class, Builder.class);
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
                if (!hasTime()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasEnable()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (getTime().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getTime());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt32(2, this.weekDays_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeBool(3, this.enable_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDataOrBuilder {
                private int bitField0_;
                private boolean enable_;
                private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> timeBuilder_;
                private CommonProtos.SESettingTime time_;
                private int weekDays_;

                private void buildPartial0(SEData sEData) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                        sEData.time_ = singleFieldBuilder == null ? this.time_ : (CommonProtos.SESettingTime) singleFieldBuilder.build();
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        sEData.weekDays_ = this.weekDays_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        sEData.enable_ = this.enable_;
                        i7 |= 4;
                    }
                    sEData.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEData_descriptor;
                }

                private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> internalGetTimeFieldBuilder() {
                    if (this.timeBuilder_ == null) {
                        this.timeBuilder_ = new SingleFieldBuilder<>(getTime(), getParentForChildren(), isClean());
                        this.time_ = null;
                    }
                    return this.timeBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        internalGetTimeFieldBuilder();
                    }
                }

                public Builder clearEnable() {
                    this.bitField0_ &= -5;
                    this.enable_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearTime() {
                    this.bitField0_ &= -2;
                    this.time_ = null;
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.timeBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearWeekDays() {
                    this.bitField0_ &= -3;
                    this.weekDays_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEData_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
                public boolean getEnable() {
                    return this.enable_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
                public CommonProtos.SESettingTime getTime() {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SESettingTime) singleFieldBuilder.getMessage();
                    }
                    CommonProtos.SESettingTime sESettingTime = this.time_;
                    return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
                }

                public CommonProtos.SESettingTime.Builder getTimeBuilder() {
                    this.bitField0_ |= 1;
                    onChanged();
                    return (CommonProtos.SESettingTime.Builder) internalGetTimeFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
                public CommonProtos.SESettingTimeOrBuilder getTimeOrBuilder() {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SESettingTimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    CommonProtos.SESettingTime sESettingTime = this.time_;
                    return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
                public int getWeekDays() {
                    return this.weekDays_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
                public boolean hasEnable() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
                public boolean hasTime() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEDataOrBuilder
                public boolean hasWeekDays() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEData.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasTime() && hasEnable() && getTime().isInitialized();
                }

                public Builder mergeTime(CommonProtos.SESettingTime sESettingTime) {
                    CommonProtos.SESettingTime sESettingTime2;
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sESettingTime);
                    } else if ((this.bitField0_ & 1) == 0 || (sESettingTime2 = this.time_) == null || sESettingTime2 == CommonProtos.SESettingTime.getDefaultInstance()) {
                        this.time_ = sESettingTime;
                    } else {
                        getTimeBuilder().mergeFrom(sESettingTime);
                    }
                    if (this.time_ != null) {
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    return this;
                }

                public Builder setEnable(boolean z6) {
                    this.enable_ = z6;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setTime(CommonProtos.SESettingTime sESettingTime) {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder == null) {
                        sESettingTime.getClass();
                        this.time_ = sESettingTime;
                    } else {
                        singleFieldBuilder.setMessage(sESettingTime);
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setWeekDays(int i7) {
                    this.weekDays_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEData build() {
                    SEData sEDataBuildPartial = buildPartial();
                    if (sEDataBuildPartial.isInitialized()) {
                        return sEDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEData buildPartial() {
                    SEData sEData = new SEData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sEData);
                    }
                    onBuilt();
                    return sEData;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SEData getDefaultInstanceForType() {
                    return SEData.getDefaultInstance();
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.time_ = null;
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.timeBuilder_ = null;
                    }
                    this.weekDays_ = 0;
                    this.enable_ = false;
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SEData) {
                        return mergeFrom((SEData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setTime(CommonProtos.SESettingTime.Builder builder) {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder == null) {
                        this.time_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(SEData sEData) {
                    if (sEData == SEData.getDefaultInstance()) {
                        return this;
                    }
                    if (sEData.hasTime()) {
                        mergeTime(sEData.getTime());
                    }
                    if (sEData.hasWeekDays()) {
                        setWeekDays(sEData.getWeekDays());
                    }
                    if (sEData.hasEnable()) {
                        setEnable(sEData.getEnable());
                    }
                    mergeUnknownFields(sEData.getUnknownFields());
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
                                        codedInputStream.readMessage(internalGetTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        this.weekDays_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag != 24) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.enable_ = codedInputStream.readBool();
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

            private SEData(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.weekDays_ = 0;
                this.enable_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEData sEData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEData);
            }

            public static SEData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SEData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SEData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static SEData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            private SEData() {
                this.weekDays_ = 0;
                this.enable_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static SEData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SEData parseFrom(InputStream inputStream) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static SEData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEData parseFrom(CodedInputStream codedInputStream) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static SEData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface SEDataOrBuilder extends MessageOrBuilder {
            boolean getEnable();

            CommonProtos.SESettingTime getTime();

            CommonProtos.SESettingTimeOrBuilder getTimeOrBuilder();

            int getWeekDays();

            boolean hasEnable();

            boolean hasTime();

            boolean hasWeekDays();
        }

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            public static final int SUPPORT_MAX_CLOCKS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private List<SEAlexaClockInfo> list_;
            private byte memoizedIsInitialized;
            private int supportMaxClocks_;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEList.1
                    @Override // com.google.protobuf.Parser
                    public SEList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = SEList.newBuilder();
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

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SEList parseDelimitedFrom(InputStream inputStream) {
                return (SEList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SEList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SEList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SEList)) {
                    return super.equals(obj);
                }
                SEList sEList = (SEList) obj;
                if (getListList().equals(sEList.getListList()) && hasSupportMaxClocks() == sEList.hasSupportMaxClocks()) {
                    return (!hasSupportMaxClocks() || getSupportMaxClocks() == sEList.getSupportMaxClocks()) && getUnknownFields().equals(sEList.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
            public SEAlexaClockInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
            public List<SEAlexaClockInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
            public SEAlexaClockInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
            public List<? extends SEAlexaClockInfoOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SEList> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int size = this.list_.size();
                int iComputeMessageSizeNoTag = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    iComputeMessageSizeNoTag += CodedOutputStream.computeMessageSizeNoTag(this.list_.get(i8));
                }
                int iComputeUInt32Size = iComputeMessageSizeNoTag + size;
                if ((this.bitField0_ & 1) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.supportMaxClocks_);
                }
                int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
            public int getSupportMaxClocks() {
                return this.supportMaxClocks_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
            public boolean hasSupportMaxClocks() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (getListCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getListList().hashCode();
                }
                if (hasSupportMaxClocks()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSupportMaxClocks();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                for (int i7 = 0; i7 < getListCount(); i7++) {
                    if (!getList(i7).isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i7 = 0; i7 < this.list_.size(); i7++) {
                    codedOutputStream.writeMessage(1, this.list_.get(i7));
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeUInt32(2, this.supportMaxClocks_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> listBuilder_;
                private List<SEAlexaClockInfo> list_;
                private int supportMaxClocks_;

                private void buildPartial0(SEList sEList) {
                    int i7;
                    if ((this.bitField0_ & 2) != 0) {
                        sEList.supportMaxClocks_ = this.supportMaxClocks_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    sEList.bitField0_ = i7 | sEList.bitField0_;
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        sEList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    sEList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEAlexaClockInfo> iterable) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEAlexaClockInfo sEAlexaClockInfo) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEAlexaClockInfo);
                        return this;
                    }
                    sEAlexaClockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEAlexaClockInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEAlexaClockInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSupportMaxClocks() {
                    this.bitField0_ &= -3;
                    this.supportMaxClocks_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
                public SEAlexaClockInfo getList(int i7) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAlexaClockInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
                public List<SEAlexaClockInfo> getListList() {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
                public SEAlexaClockInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAlexaClockInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
                public List<? extends SEAlexaClockInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
                public int getSupportMaxClocks() {
                    return this.supportMaxClocks_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.SEListOrBuilder
                public boolean hasSupportMaxClocks() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AlexaProtos.internal_static_SA_SEAlexaClockInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i7 = 0; i7 < getListCount(); i7++) {
                        if (!getList(i7).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEAlexaClockInfo sEAlexaClockInfo) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEAlexaClockInfo);
                        return this;
                    }
                    sEAlexaClockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEAlexaClockInfo);
                    onChanged();
                    return this;
                }

                public Builder setSupportMaxClocks(int i7) {
                    this.supportMaxClocks_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEList build() {
                    SEList sEListBuildPartial = buildPartial();
                    if (sEListBuildPartial.isInitialized()) {
                        return sEListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEList buildPartial() {
                    SEList sEList = new SEList(this);
                    buildPartialRepeatedFields(sEList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sEList);
                    }
                    onBuilt();
                    return sEList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SEList getDefaultInstanceForType() {
                    return SEList.getDefaultInstance();
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEAlexaClockInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    this.supportMaxClocks_ = 0;
                    return this;
                }

                public Builder addList(int i7, SEAlexaClockInfo sEAlexaClockInfo) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEAlexaClockInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEAlexaClockInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEAlexaClockInfo);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SEList) {
                        return mergeFrom((SEList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!sEList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = sEList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(sEList.list_);
                            }
                            onChanged();
                        }
                    } else if (!sEList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = sEList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(sEList.list_);
                        }
                    }
                    if (sEList.hasSupportMaxClocks()) {
                        setSupportMaxClocks(sEList.getSupportMaxClocks());
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, builder.build());
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
                                        SEAlexaClockInfo sEAlexaClockInfo = (SEAlexaClockInfo) codedInputStream.readMessage(SEAlexaClockInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEAlexaClockInfo, Builder, SEAlexaClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEAlexaClockInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEAlexaClockInfo);
                                        }
                                    } else if (tag != 16) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.supportMaxClocks_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
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

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.supportMaxClocks_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEList sEList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEList);
            }

            public static SEList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SEList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private SEList() {
                this.supportMaxClocks_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static SEList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SEList parseFrom(InputStream inputStream) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static SEList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEList parseFrom(CodedInputStream codedInputStream) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static SEList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface SEListOrBuilder extends MessageOrBuilder {
            SEAlexaClockInfo getList(int i7);

            int getListCount();

            List<SEAlexaClockInfo> getListList();

            SEAlexaClockInfoOrBuilder getListOrBuilder(int i7);

            List<? extends SEAlexaClockInfoOrBuilder> getListOrBuilderList();

            int getSupportMaxClocks();

            boolean hasSupportMaxClocks();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAlexaClockInfo");
            DEFAULT_INSTANCE = new SEAlexaClockInfo();
            PARSER = new AbstractParser<SEAlexaClockInfo>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfo.1
                @Override // com.google.protobuf.Parser
                public SEAlexaClockInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAlexaClockInfo.newBuilder();
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

        public static SEAlexaClockInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_SA_SEAlexaClockInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAlexaClockInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEAlexaClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAlexaClockInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAlexaClockInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAlexaClockInfo)) {
                return super.equals(obj);
            }
            SEAlexaClockInfo sEAlexaClockInfo = (SEAlexaClockInfo) obj;
            if (hasId() != sEAlexaClockInfo.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == sEAlexaClockInfo.getId()) && hasData() == sEAlexaClockInfo.hasData()) {
                return (!hasData() || getData().equals(sEAlexaClockInfo.getData())) && getUnknownFields().equals(sEAlexaClockInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
        public SEData getData() {
            SEData sEData = this.data_;
            return sEData == null ? SEData.getDefaultInstance() : sEData;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
        public SEDataOrBuilder getDataOrBuilder() {
            SEData sEData = this.data_;
            return sEData == null ? SEData.getDefaultInstance() : sEData;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AlexaProtos.internal_static_SA_SEAlexaClockInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAlexaClockInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getData());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
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
                iHashCode = (((iHashCode * 37) + 1) * 53) + getId();
            }
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_SA_SEAlexaClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaClockInfo.class, Builder.class);
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
            if (!hasData()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAlexaClockInfoOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> dataBuilder_;
            private SEData data_;
            private int id_;

            private void buildPartial0(SEAlexaClockInfo sEAlexaClockInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAlexaClockInfo.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                    sEAlexaClockInfo.data_ = singleFieldBuilder == null ? this.data_ : (SEData) singleFieldBuilder.build();
                    i7 |= 2;
                }
                sEAlexaClockInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_descriptor;
            }

            private SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> internalGetDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new SingleFieldBuilder<>(getData(), getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetDataFieldBuilder();
                }
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = null;
                SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.dataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
            public SEData getData() {
                SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEData) singleFieldBuilder.getMessage();
                }
                SEData sEData = this.data_;
                return sEData == null ? SEData.getDefaultInstance() : sEData;
            }

            public SEData.Builder getDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEData.Builder) internalGetDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
            public SEDataOrBuilder getDataOrBuilder() {
                SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEData sEData = this.data_;
                return sEData == null ? SEData.getDefaultInstance() : sEData;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaClockInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaClockInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasData() && getData().isInitialized();
            }

            public Builder mergeData(SEData sEData) {
                SEData sEData2;
                SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEData);
                } else if ((this.bitField0_ & 2) == 0 || (sEData2 = this.data_) == null || sEData2 == SEData.getDefaultInstance()) {
                    this.data_ = sEData;
                } else {
                    getDataBuilder().mergeFrom(sEData);
                }
                if (this.data_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setData(SEData sEData) {
                SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder == null) {
                    sEData.getClass();
                    this.data_ = sEData;
                } else {
                    singleFieldBuilder.setMessage(sEData);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(int i7) {
                this.id_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaClockInfo build() {
                SEAlexaClockInfo sEAlexaClockInfoBuildPartial = buildPartial();
                if (sEAlexaClockInfoBuildPartial.isInitialized()) {
                    return sEAlexaClockInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAlexaClockInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaClockInfo buildPartial() {
                SEAlexaClockInfo sEAlexaClockInfo = new SEAlexaClockInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAlexaClockInfo);
                }
                onBuilt();
                return sEAlexaClockInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAlexaClockInfo getDefaultInstanceForType() {
                return SEAlexaClockInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.data_ = null;
                SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.dataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAlexaClockInfo) {
                    return mergeFrom((SEAlexaClockInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(SEData.Builder builder) {
                SingleFieldBuilder<SEData, SEData.Builder, SEDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder == null) {
                    this.data_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAlexaClockInfo sEAlexaClockInfo) {
                if (sEAlexaClockInfo == SEAlexaClockInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEAlexaClockInfo.hasId()) {
                    setId(sEAlexaClockInfo.getId());
                }
                if (sEAlexaClockInfo.hasData()) {
                    mergeData(sEAlexaClockInfo.getData());
                }
                mergeUnknownFields(sEAlexaClockInfo.getUnknownFields());
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
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

        private SEAlexaClockInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAlexaClockInfo sEAlexaClockInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAlexaClockInfo);
        }

        public static SEAlexaClockInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAlexaClockInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaClockInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAlexaClockInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAlexaClockInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEAlexaClockInfo() {
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAlexaClockInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAlexaClockInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAlexaClockInfo parseFrom(InputStream inputStream) {
            return (SEAlexaClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAlexaClockInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaClockInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEAlexaClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAlexaClockInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAlexaClockInfoOrBuilder extends MessageOrBuilder {
        SEAlexaClockInfo.SEData getData();

        SEAlexaClockInfo.SEDataOrBuilder getDataOrBuilder();

        int getId();

        boolean hasData();

        boolean hasId();
    }

    public static final class SEAlexaEventRemind extends GeneratedMessage implements SEAlexaEventRemindOrBuilder {
        public static final int ALEXA_EVENT_REMIND_LABLE_FIELD_NUMBER = 2;
        public static final int ALEXA_EVENT_REMIND_TIME_FIELD_NUMBER = 1;
        private static final SEAlexaEventRemind DEFAULT_INSTANCE;
        private static final Parser<SEAlexaEventRemind> PARSER;
        private static final long serialVersionUID = 0;
        private volatile Object alexaEventRemindLable_;
        private CommonProtos.SETime alexaEventRemindTime_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            public static final int SUPPORT_MAX_EVENT_REMIND_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private List<SEAlexaEventRemind> list_;
            private byte memoizedIsInitialized;
            private int supportMaxEventRemind_;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEList.1
                    @Override // com.google.protobuf.Parser
                    public SEList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = SEList.newBuilder();
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

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaEventRemind_SEList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SEList parseDelimitedFrom(InputStream inputStream) {
                return (SEList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SEList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SEList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SEList)) {
                    return super.equals(obj);
                }
                SEList sEList = (SEList) obj;
                if (getListList().equals(sEList.getListList()) && hasSupportMaxEventRemind() == sEList.hasSupportMaxEventRemind()) {
                    return (!hasSupportMaxEventRemind() || getSupportMaxEventRemind() == sEList.getSupportMaxEventRemind()) && getUnknownFields().equals(sEList.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaEventRemind_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
            public SEAlexaEventRemind getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
            public List<SEAlexaEventRemind> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
            public SEAlexaEventRemindOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
            public List<? extends SEAlexaEventRemindOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SEList> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int size = this.list_.size();
                int iComputeMessageSizeNoTag = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    iComputeMessageSizeNoTag += CodedOutputStream.computeMessageSizeNoTag(this.list_.get(i8));
                }
                int iComputeUInt32Size = iComputeMessageSizeNoTag + size;
                if ((this.bitField0_ & 1) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.supportMaxEventRemind_);
                }
                int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
            public int getSupportMaxEventRemind() {
                return this.supportMaxEventRemind_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
            public boolean hasSupportMaxEventRemind() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (getListCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getListList().hashCode();
                }
                if (hasSupportMaxEventRemind()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSupportMaxEventRemind();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaEventRemind_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                for (int i7 = 0; i7 < getListCount(); i7++) {
                    if (!getList(i7).isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i7 = 0; i7 < this.list_.size(); i7++) {
                    codedOutputStream.writeMessage(1, this.list_.get(i7));
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeUInt32(2, this.supportMaxEventRemind_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> listBuilder_;
                private List<SEAlexaEventRemind> list_;
                private int supportMaxEventRemind_;

                private void buildPartial0(SEList sEList) {
                    int i7;
                    if ((this.bitField0_ & 2) != 0) {
                        sEList.supportMaxEventRemind_ = this.supportMaxEventRemind_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    sEList.bitField0_ = i7 | sEList.bitField0_;
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        sEList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    sEList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AlexaProtos.internal_static_SA_SEAlexaEventRemind_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEAlexaEventRemind> iterable) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEAlexaEventRemind sEAlexaEventRemind) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEAlexaEventRemind);
                        return this;
                    }
                    sEAlexaEventRemind.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEAlexaEventRemind);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEAlexaEventRemind.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSupportMaxEventRemind() {
                    this.bitField0_ &= -3;
                    this.supportMaxEventRemind_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AlexaProtos.internal_static_SA_SEAlexaEventRemind_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
                public SEAlexaEventRemind getList(int i7) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAlexaEventRemind) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
                public List<SEAlexaEventRemind> getListList() {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
                public SEAlexaEventRemindOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAlexaEventRemindOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
                public List<? extends SEAlexaEventRemindOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
                public int getSupportMaxEventRemind() {
                    return this.supportMaxEventRemind_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.SEListOrBuilder
                public boolean hasSupportMaxEventRemind() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AlexaProtos.internal_static_SA_SEAlexaEventRemind_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i7 = 0; i7 < getListCount(); i7++) {
                        if (!getList(i7).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEAlexaEventRemind sEAlexaEventRemind) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEAlexaEventRemind);
                        return this;
                    }
                    sEAlexaEventRemind.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEAlexaEventRemind);
                    onChanged();
                    return this;
                }

                public Builder setSupportMaxEventRemind(int i7) {
                    this.supportMaxEventRemind_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEList build() {
                    SEList sEListBuildPartial = buildPartial();
                    if (sEListBuildPartial.isInitialized()) {
                        return sEListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEList buildPartial() {
                    SEList sEList = new SEList(this);
                    buildPartialRepeatedFields(sEList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sEList);
                    }
                    onBuilt();
                    return sEList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SEList getDefaultInstanceForType() {
                    return SEList.getDefaultInstance();
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEAlexaEventRemind.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    this.supportMaxEventRemind_ = 0;
                    return this;
                }

                public Builder addList(int i7, SEAlexaEventRemind sEAlexaEventRemind) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEAlexaEventRemind.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEAlexaEventRemind);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEAlexaEventRemind);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SEList) {
                        return mergeFrom((SEList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!sEList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = sEList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(sEList.list_);
                            }
                            onChanged();
                        }
                    } else if (!sEList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = sEList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(sEList.list_);
                        }
                    }
                    if (sEList.hasSupportMaxEventRemind()) {
                        setSupportMaxEventRemind(sEList.getSupportMaxEventRemind());
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, builder.build());
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
                                        SEAlexaEventRemind sEAlexaEventRemind = (SEAlexaEventRemind) codedInputStream.readMessage(SEAlexaEventRemind.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEAlexaEventRemind, Builder, SEAlexaEventRemindOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEAlexaEventRemind);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEAlexaEventRemind);
                                        }
                                    } else if (tag != 16) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.supportMaxEventRemind_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
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

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.supportMaxEventRemind_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEList sEList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEList);
            }

            public static SEList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SEList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private SEList() {
                this.supportMaxEventRemind_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static SEList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SEList parseFrom(InputStream inputStream) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static SEList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEList parseFrom(CodedInputStream codedInputStream) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static SEList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface SEListOrBuilder extends MessageOrBuilder {
            SEAlexaEventRemind getList(int i7);

            int getListCount();

            List<SEAlexaEventRemind> getListList();

            SEAlexaEventRemindOrBuilder getListOrBuilder(int i7);

            List<? extends SEAlexaEventRemindOrBuilder> getListOrBuilderList();

            int getSupportMaxEventRemind();

            boolean hasSupportMaxEventRemind();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAlexaEventRemind");
            DEFAULT_INSTANCE = new SEAlexaEventRemind();
            PARSER = new AbstractParser<SEAlexaEventRemind>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemind.1
                @Override // com.google.protobuf.Parser
                public SEAlexaEventRemind parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAlexaEventRemind.newBuilder();
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

        public static SEAlexaEventRemind getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_SA_SEAlexaEventRemind_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAlexaEventRemind parseDelimitedFrom(InputStream inputStream) {
            return (SEAlexaEventRemind) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAlexaEventRemind parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAlexaEventRemind> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAlexaEventRemind)) {
                return super.equals(obj);
            }
            SEAlexaEventRemind sEAlexaEventRemind = (SEAlexaEventRemind) obj;
            if (hasAlexaEventRemindTime() != sEAlexaEventRemind.hasAlexaEventRemindTime()) {
                return false;
            }
            if ((!hasAlexaEventRemindTime() || getAlexaEventRemindTime().equals(sEAlexaEventRemind.getAlexaEventRemindTime())) && hasAlexaEventRemindLable() == sEAlexaEventRemind.hasAlexaEventRemindLable()) {
                return (!hasAlexaEventRemindLable() || getAlexaEventRemindLable().equals(sEAlexaEventRemind.getAlexaEventRemindLable())) && getUnknownFields().equals(sEAlexaEventRemind.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
        public String getAlexaEventRemindLable() {
            Object obj = this.alexaEventRemindLable_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.alexaEventRemindLable_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
        public ByteString getAlexaEventRemindLableBytes() {
            Object obj = this.alexaEventRemindLable_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.alexaEventRemindLable_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
        public CommonProtos.SETime getAlexaEventRemindTime() {
            CommonProtos.SETime sETime = this.alexaEventRemindTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
        public CommonProtos.SETimeOrBuilder getAlexaEventRemindTimeOrBuilder() {
            CommonProtos.SETime sETime = this.alexaEventRemindTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AlexaProtos.internal_static_SA_SEAlexaEventRemind_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAlexaEventRemind> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAlexaEventRemindTime()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.alexaEventRemindLable_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
        public boolean hasAlexaEventRemindLable() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
        public boolean hasAlexaEventRemindTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAlexaEventRemindTime()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAlexaEventRemindTime().hashCode();
            }
            if (hasAlexaEventRemindLable()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAlexaEventRemindLable().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_SA_SEAlexaEventRemind_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaEventRemind.class, Builder.class);
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
            if (!hasAlexaEventRemindTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlexaEventRemindLable()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getAlexaEventRemindTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getAlexaEventRemindTime());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.alexaEventRemindLable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAlexaEventRemindOrBuilder {
            private Object alexaEventRemindLable_;
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> alexaEventRemindTimeBuilder_;
            private CommonProtos.SETime alexaEventRemindTime_;
            private int bitField0_;

            private void buildPartial0(SEAlexaEventRemind sEAlexaEventRemind) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                    sEAlexaEventRemind.alexaEventRemindTime_ = singleFieldBuilder == null ? this.alexaEventRemindTime_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAlexaEventRemind.alexaEventRemindLable_ = this.alexaEventRemindLable_;
                    i7 |= 2;
                }
                sEAlexaEventRemind.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaEventRemind_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetAlexaEventRemindTimeFieldBuilder() {
                if (this.alexaEventRemindTimeBuilder_ == null) {
                    this.alexaEventRemindTimeBuilder_ = new SingleFieldBuilder<>(getAlexaEventRemindTime(), getParentForChildren(), isClean());
                    this.alexaEventRemindTime_ = null;
                }
                return this.alexaEventRemindTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetAlexaEventRemindTimeFieldBuilder();
                }
            }

            public Builder clearAlexaEventRemindLable() {
                this.alexaEventRemindLable_ = SEAlexaEventRemind.getDefaultInstance().getAlexaEventRemindLable();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearAlexaEventRemindTime() {
                this.bitField0_ &= -2;
                this.alexaEventRemindTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.alexaEventRemindTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
            public String getAlexaEventRemindLable() {
                Object obj = this.alexaEventRemindLable_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.alexaEventRemindLable_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
            public ByteString getAlexaEventRemindLableBytes() {
                Object obj = this.alexaEventRemindLable_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.alexaEventRemindLable_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
            public CommonProtos.SETime getAlexaEventRemindTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.alexaEventRemindTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getAlexaEventRemindTimeBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetAlexaEventRemindTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
            public CommonProtos.SETimeOrBuilder getAlexaEventRemindTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.alexaEventRemindTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaEventRemind_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
            public boolean hasAlexaEventRemindLable() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaEventRemindOrBuilder
            public boolean hasAlexaEventRemindTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaEventRemind_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaEventRemind.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAlexaEventRemindTime() && hasAlexaEventRemindLable() && getAlexaEventRemindTime().isInitialized();
            }

            public Builder mergeAlexaEventRemindTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 1) == 0 || (sETime2 = this.alexaEventRemindTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.alexaEventRemindTime_ = sETime;
                } else {
                    getAlexaEventRemindTimeBuilder().mergeFrom(sETime);
                }
                if (this.alexaEventRemindTime_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setAlexaEventRemindLable(String str) {
                str.getClass();
                this.alexaEventRemindLable_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAlexaEventRemindLableBytes(ByteString byteString) {
                byteString.getClass();
                this.alexaEventRemindLable_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAlexaEventRemindTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.alexaEventRemindTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.alexaEventRemindLable_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaEventRemind build() {
                SEAlexaEventRemind sEAlexaEventRemindBuildPartial = buildPartial();
                if (sEAlexaEventRemindBuildPartial.isInitialized()) {
                    return sEAlexaEventRemindBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAlexaEventRemindBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaEventRemind buildPartial() {
                SEAlexaEventRemind sEAlexaEventRemind = new SEAlexaEventRemind(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAlexaEventRemind);
                }
                onBuilt();
                return sEAlexaEventRemind;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAlexaEventRemind getDefaultInstanceForType() {
                return SEAlexaEventRemind.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.alexaEventRemindTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.alexaEventRemindTimeBuilder_ = null;
                }
                this.alexaEventRemindLable_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.alexaEventRemindLable_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAlexaEventRemind) {
                    return mergeFrom((SEAlexaEventRemind) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAlexaEventRemindTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.alexaEventRemindTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.alexaEventRemindTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAlexaEventRemind sEAlexaEventRemind) {
                if (sEAlexaEventRemind == SEAlexaEventRemind.getDefaultInstance()) {
                    return this;
                }
                if (sEAlexaEventRemind.hasAlexaEventRemindTime()) {
                    mergeAlexaEventRemindTime(sEAlexaEventRemind.getAlexaEventRemindTime());
                }
                if (sEAlexaEventRemind.hasAlexaEventRemindLable()) {
                    this.alexaEventRemindLable_ = sEAlexaEventRemind.alexaEventRemindLable_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sEAlexaEventRemind.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetAlexaEventRemindTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.alexaEventRemindLable_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
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

        private SEAlexaEventRemind(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.alexaEventRemindLable_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAlexaEventRemind sEAlexaEventRemind) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAlexaEventRemind);
        }

        public static SEAlexaEventRemind parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAlexaEventRemind parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaEventRemind) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaEventRemind parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAlexaEventRemind getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAlexaEventRemind parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEAlexaEventRemind() {
            this.alexaEventRemindLable_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.alexaEventRemindLable_ = "";
        }

        public static SEAlexaEventRemind parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAlexaEventRemind parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAlexaEventRemind parseFrom(InputStream inputStream) {
            return (SEAlexaEventRemind) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAlexaEventRemind parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaEventRemind) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaEventRemind parseFrom(CodedInputStream codedInputStream) {
            return (SEAlexaEventRemind) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAlexaEventRemind parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaEventRemind) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAlexaEventRemindOrBuilder extends MessageOrBuilder {
        String getAlexaEventRemindLable();

        ByteString getAlexaEventRemindLableBytes();

        CommonProtos.SETime getAlexaEventRemindTime();

        CommonProtos.SETimeOrBuilder getAlexaEventRemindTimeOrBuilder();

        boolean hasAlexaEventRemindLable();

        boolean hasAlexaEventRemindTime();
    }

    public static final class SEAlexaInstruction extends GeneratedMessage implements SEAlexaInstructionOrBuilder {
        public static final int ALERT_DATA_FIELD_NUMBER = 4;
        public static final int ALEXA_CLOCK_INFO_LIST_FIELD_NUMBER = 7;
        public static final int ALEXA_DIALOG_ID_FIELD_NUMBER = 5;
        public static final int ALEXA_ERROR_CODE_FIELD_NUMBER = 3;
        public static final int ALEXA_EVENT_REMIND_INFO_LIST_FIELD_NUMBER = 9;
        public static final int COUNTDOWN_TIME_FIELD_NUMBER = 6;
        private static final SEAlexaInstruction DEFAULT_INSTANCE;
        private static final Parser<SEAlexaInstruction> PARSER;
        public static final int RESULT_TYPE_FIELD_NUMBER = 1;
        public static final int SPORTS_TYPE_FIELD_NUMBER = 8;
        public static final int TEMPLATE_GENERAL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private SEAlexaAlertData alertData_;
        private SEAlexaClockInfo.SEList alexaClockInfoList_;
        private int alexaDialogId_;
        private int alexaErrorCode_;
        private SEAlexaEventRemind.SEList alexaEventRemindInfoList_;
        private int bitField0_;
        private int countdownTime_;
        private byte memoizedIsInitialized;
        private int resultType_;
        private int sportsType_;
        private SEAlexaTemplateGeneral templateGeneral_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAlexaInstruction");
            DEFAULT_INSTANCE = new SEAlexaInstruction();
            PARSER = new AbstractParser<SEAlexaInstruction>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstruction.1
                @Override // com.google.protobuf.Parser
                public SEAlexaInstruction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAlexaInstruction.newBuilder();
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

        public static SEAlexaInstruction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_SA_SEAlexaInstruction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAlexaInstruction parseDelimitedFrom(InputStream inputStream) {
            return (SEAlexaInstruction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAlexaInstruction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAlexaInstruction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAlexaInstruction)) {
                return super.equals(obj);
            }
            SEAlexaInstruction sEAlexaInstruction = (SEAlexaInstruction) obj;
            if (hasResultType() != sEAlexaInstruction.hasResultType()) {
                return false;
            }
            if ((hasResultType() && this.resultType_ != sEAlexaInstruction.resultType_) || hasTemplateGeneral() != sEAlexaInstruction.hasTemplateGeneral()) {
                return false;
            }
            if ((hasTemplateGeneral() && !getTemplateGeneral().equals(sEAlexaInstruction.getTemplateGeneral())) || hasAlexaErrorCode() != sEAlexaInstruction.hasAlexaErrorCode()) {
                return false;
            }
            if ((hasAlexaErrorCode() && getAlexaErrorCode() != sEAlexaInstruction.getAlexaErrorCode()) || hasAlertData() != sEAlexaInstruction.hasAlertData()) {
                return false;
            }
            if ((hasAlertData() && !getAlertData().equals(sEAlexaInstruction.getAlertData())) || hasAlexaDialogId() != sEAlexaInstruction.hasAlexaDialogId()) {
                return false;
            }
            if ((hasAlexaDialogId() && getAlexaDialogId() != sEAlexaInstruction.getAlexaDialogId()) || hasCountdownTime() != sEAlexaInstruction.hasCountdownTime()) {
                return false;
            }
            if ((hasCountdownTime() && getCountdownTime() != sEAlexaInstruction.getCountdownTime()) || hasAlexaClockInfoList() != sEAlexaInstruction.hasAlexaClockInfoList()) {
                return false;
            }
            if ((hasAlexaClockInfoList() && !getAlexaClockInfoList().equals(sEAlexaInstruction.getAlexaClockInfoList())) || hasSportsType() != sEAlexaInstruction.hasSportsType()) {
                return false;
            }
            if ((!hasSportsType() || getSportsType() == sEAlexaInstruction.getSportsType()) && hasAlexaEventRemindInfoList() == sEAlexaInstruction.hasAlexaEventRemindInfoList()) {
                return (!hasAlexaEventRemindInfoList() || getAlexaEventRemindInfoList().equals(sEAlexaInstruction.getAlexaEventRemindInfoList())) && getUnknownFields().equals(sEAlexaInstruction.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaAlertData getAlertData() {
            SEAlexaAlertData sEAlexaAlertData = this.alertData_;
            return sEAlexaAlertData == null ? SEAlexaAlertData.getDefaultInstance() : sEAlexaAlertData;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaAlertDataOrBuilder getAlertDataOrBuilder() {
            SEAlexaAlertData sEAlexaAlertData = this.alertData_;
            return sEAlexaAlertData == null ? SEAlexaAlertData.getDefaultInstance() : sEAlexaAlertData;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaClockInfo.SEList getAlexaClockInfoList() {
            SEAlexaClockInfo.SEList sEList = this.alexaClockInfoList_;
            return sEList == null ? SEAlexaClockInfo.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaClockInfo.SEListOrBuilder getAlexaClockInfoListOrBuilder() {
            SEAlexaClockInfo.SEList sEList = this.alexaClockInfoList_;
            return sEList == null ? SEAlexaClockInfo.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public int getAlexaDialogId() {
            return this.alexaDialogId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public int getAlexaErrorCode() {
            return this.alexaErrorCode_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaEventRemind.SEList getAlexaEventRemindInfoList() {
            SEAlexaEventRemind.SEList sEList = this.alexaEventRemindInfoList_;
            return sEList == null ? SEAlexaEventRemind.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaEventRemind.SEListOrBuilder getAlexaEventRemindInfoListOrBuilder() {
            SEAlexaEventRemind.SEList sEList = this.alexaEventRemindInfoList_;
            return sEList == null ? SEAlexaEventRemind.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public int getCountdownTime() {
            return this.countdownTime_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AlexaProtos.internal_static_SA_SEAlexaInstruction_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAlexaInstruction> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaResultType getResultType() {
            SEAlexaResultType sEAlexaResultTypeForNumber = SEAlexaResultType.forNumber(this.resultType_);
            return sEAlexaResultTypeForNumber == null ? SEAlexaResultType.ALEXA_START_LISTENING : sEAlexaResultTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.resultType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getTemplateGeneral());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.alexaErrorCode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, getAlertData());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(5, this.alexaDialogId_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.countdownTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(7, getAlexaClockInfoList());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(8, this.sportsType_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(9, getAlexaEventRemindInfoList());
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public int getSportsType() {
            return this.sportsType_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaTemplateGeneral getTemplateGeneral() {
            SEAlexaTemplateGeneral sEAlexaTemplateGeneral = this.templateGeneral_;
            return sEAlexaTemplateGeneral == null ? SEAlexaTemplateGeneral.getDefaultInstance() : sEAlexaTemplateGeneral;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public SEAlexaTemplateGeneralOrBuilder getTemplateGeneralOrBuilder() {
            SEAlexaTemplateGeneral sEAlexaTemplateGeneral = this.templateGeneral_;
            return sEAlexaTemplateGeneral == null ? SEAlexaTemplateGeneral.getDefaultInstance() : sEAlexaTemplateGeneral;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasAlertData() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasAlexaClockInfoList() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasAlexaDialogId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasAlexaErrorCode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasAlexaEventRemindInfoList() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasCountdownTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasResultType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasSportsType() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
        public boolean hasTemplateGeneral() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasResultType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.resultType_;
            }
            if (hasTemplateGeneral()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTemplateGeneral().hashCode();
            }
            if (hasAlexaErrorCode()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAlexaErrorCode();
            }
            if (hasAlertData()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getAlertData().hashCode();
            }
            if (hasAlexaDialogId()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAlexaDialogId();
            }
            if (hasCountdownTime()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getCountdownTime();
            }
            if (hasAlexaClockInfoList()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getAlexaClockInfoList().hashCode();
            }
            if (hasSportsType()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getSportsType();
            }
            if (hasAlexaEventRemindInfoList()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getAlexaEventRemindInfoList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_SA_SEAlexaInstruction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaInstruction.class, Builder.class);
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
            if (!hasResultType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTemplateGeneral() && !getTemplateGeneral().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAlertData() && !getAlertData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAlexaClockInfoList() && !getAlexaClockInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlexaEventRemindInfoList() || getAlexaEventRemindInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.resultType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTemplateGeneral());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.alexaErrorCode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getAlertData());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.alexaDialogId_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.countdownTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getAlexaClockInfoList());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.sportsType_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getAlexaEventRemindInfoList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAlexaInstructionOrBuilder {
            private SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> alertDataBuilder_;
            private SEAlexaAlertData alertData_;
            private SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> alexaClockInfoListBuilder_;
            private SEAlexaClockInfo.SEList alexaClockInfoList_;
            private int alexaDialogId_;
            private int alexaErrorCode_;
            private SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> alexaEventRemindInfoListBuilder_;
            private SEAlexaEventRemind.SEList alexaEventRemindInfoList_;
            private int bitField0_;
            private int countdownTime_;
            private int resultType_;
            private int sportsType_;
            private SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> templateGeneralBuilder_;
            private SEAlexaTemplateGeneral templateGeneral_;

            private void buildPartial0(SEAlexaInstruction sEAlexaInstruction) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAlexaInstruction.resultType_ = this.resultType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                    sEAlexaInstruction.templateGeneral_ = singleFieldBuilder == null ? this.templateGeneral_ : (SEAlexaTemplateGeneral) singleFieldBuilder.build();
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEAlexaInstruction.alexaErrorCode_ = this.alexaErrorCode_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder2 = this.alertDataBuilder_;
                    sEAlexaInstruction.alertData_ = singleFieldBuilder2 == null ? this.alertData_ : (SEAlexaAlertData) singleFieldBuilder2.build();
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEAlexaInstruction.alexaDialogId_ = this.alexaDialogId_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEAlexaInstruction.countdownTime_ = this.countdownTime_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder3 = this.alexaClockInfoListBuilder_;
                    sEAlexaInstruction.alexaClockInfoList_ = singleFieldBuilder3 == null ? this.alexaClockInfoList_ : (SEAlexaClockInfo.SEList) singleFieldBuilder3.build();
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEAlexaInstruction.sportsType_ = this.sportsType_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder4 = this.alexaEventRemindInfoListBuilder_;
                    sEAlexaInstruction.alexaEventRemindInfoList_ = singleFieldBuilder4 == null ? this.alexaEventRemindInfoList_ : (SEAlexaEventRemind.SEList) singleFieldBuilder4.build();
                    i7 |= 256;
                }
                sEAlexaInstruction.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaInstruction_descriptor;
            }

            private SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> internalGetAlertDataFieldBuilder() {
                if (this.alertDataBuilder_ == null) {
                    this.alertDataBuilder_ = new SingleFieldBuilder<>(getAlertData(), getParentForChildren(), isClean());
                    this.alertData_ = null;
                }
                return this.alertDataBuilder_;
            }

            private SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> internalGetAlexaClockInfoListFieldBuilder() {
                if (this.alexaClockInfoListBuilder_ == null) {
                    this.alexaClockInfoListBuilder_ = new SingleFieldBuilder<>(getAlexaClockInfoList(), getParentForChildren(), isClean());
                    this.alexaClockInfoList_ = null;
                }
                return this.alexaClockInfoListBuilder_;
            }

            private SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> internalGetAlexaEventRemindInfoListFieldBuilder() {
                if (this.alexaEventRemindInfoListBuilder_ == null) {
                    this.alexaEventRemindInfoListBuilder_ = new SingleFieldBuilder<>(getAlexaEventRemindInfoList(), getParentForChildren(), isClean());
                    this.alexaEventRemindInfoList_ = null;
                }
                return this.alexaEventRemindInfoListBuilder_;
            }

            private SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> internalGetTemplateGeneralFieldBuilder() {
                if (this.templateGeneralBuilder_ == null) {
                    this.templateGeneralBuilder_ = new SingleFieldBuilder<>(getTemplateGeneral(), getParentForChildren(), isClean());
                    this.templateGeneral_ = null;
                }
                return this.templateGeneralBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetTemplateGeneralFieldBuilder();
                    internalGetAlertDataFieldBuilder();
                    internalGetAlexaClockInfoListFieldBuilder();
                    internalGetAlexaEventRemindInfoListFieldBuilder();
                }
            }

            public Builder clearAlertData() {
                this.bitField0_ &= -9;
                this.alertData_ = null;
                SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder = this.alertDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.alertDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAlexaClockInfoList() {
                this.bitField0_ &= -65;
                this.alexaClockInfoList_ = null;
                SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder = this.alexaClockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.alexaClockInfoListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAlexaDialogId() {
                this.bitField0_ &= -17;
                this.alexaDialogId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAlexaErrorCode() {
                this.bitField0_ &= -5;
                this.alexaErrorCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAlexaEventRemindInfoList() {
                this.bitField0_ &= -257;
                this.alexaEventRemindInfoList_ = null;
                SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder = this.alexaEventRemindInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.alexaEventRemindInfoListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCountdownTime() {
                this.bitField0_ &= -33;
                this.countdownTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearResultType() {
                this.bitField0_ &= -2;
                this.resultType_ = 1;
                onChanged();
                return this;
            }

            public Builder clearSportsType() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.sportsType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTemplateGeneral() {
                this.bitField0_ &= -3;
                this.templateGeneral_ = null;
                SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.templateGeneralBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaAlertData getAlertData() {
                SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder = this.alertDataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaAlertData) singleFieldBuilder.getMessage();
                }
                SEAlexaAlertData sEAlexaAlertData = this.alertData_;
                return sEAlexaAlertData == null ? SEAlexaAlertData.getDefaultInstance() : sEAlexaAlertData;
            }

            public SEAlexaAlertData.Builder getAlertDataBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SEAlexaAlertData.Builder) internalGetAlertDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaAlertDataOrBuilder getAlertDataOrBuilder() {
                SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder = this.alertDataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaAlertDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAlexaAlertData sEAlexaAlertData = this.alertData_;
                return sEAlexaAlertData == null ? SEAlexaAlertData.getDefaultInstance() : sEAlexaAlertData;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaClockInfo.SEList getAlexaClockInfoList() {
                SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder = this.alexaClockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaClockInfo.SEList) singleFieldBuilder.getMessage();
                }
                SEAlexaClockInfo.SEList sEList = this.alexaClockInfoList_;
                return sEList == null ? SEAlexaClockInfo.SEList.getDefaultInstance() : sEList;
            }

            public SEAlexaClockInfo.SEList.Builder getAlexaClockInfoListBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SEAlexaClockInfo.SEList.Builder) internalGetAlexaClockInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaClockInfo.SEListOrBuilder getAlexaClockInfoListOrBuilder() {
                SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder = this.alexaClockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaClockInfo.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAlexaClockInfo.SEList sEList = this.alexaClockInfoList_;
                return sEList == null ? SEAlexaClockInfo.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public int getAlexaDialogId() {
                return this.alexaDialogId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public int getAlexaErrorCode() {
                return this.alexaErrorCode_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaEventRemind.SEList getAlexaEventRemindInfoList() {
                SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder = this.alexaEventRemindInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaEventRemind.SEList) singleFieldBuilder.getMessage();
                }
                SEAlexaEventRemind.SEList sEList = this.alexaEventRemindInfoList_;
                return sEList == null ? SEAlexaEventRemind.SEList.getDefaultInstance() : sEList;
            }

            public SEAlexaEventRemind.SEList.Builder getAlexaEventRemindInfoListBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (SEAlexaEventRemind.SEList.Builder) internalGetAlexaEventRemindInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaEventRemind.SEListOrBuilder getAlexaEventRemindInfoListOrBuilder() {
                SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder = this.alexaEventRemindInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaEventRemind.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAlexaEventRemind.SEList sEList = this.alexaEventRemindInfoList_;
                return sEList == null ? SEAlexaEventRemind.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public int getCountdownTime() {
                return this.countdownTime_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaInstruction_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaResultType getResultType() {
                SEAlexaResultType sEAlexaResultTypeForNumber = SEAlexaResultType.forNumber(this.resultType_);
                return sEAlexaResultTypeForNumber == null ? SEAlexaResultType.ALEXA_START_LISTENING : sEAlexaResultTypeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public int getSportsType() {
                return this.sportsType_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaTemplateGeneral getTemplateGeneral() {
                SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaTemplateGeneral) singleFieldBuilder.getMessage();
                }
                SEAlexaTemplateGeneral sEAlexaTemplateGeneral = this.templateGeneral_;
                return sEAlexaTemplateGeneral == null ? SEAlexaTemplateGeneral.getDefaultInstance() : sEAlexaTemplateGeneral;
            }

            public SEAlexaTemplateGeneral.Builder getTemplateGeneralBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEAlexaTemplateGeneral.Builder) internalGetTemplateGeneralFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public SEAlexaTemplateGeneralOrBuilder getTemplateGeneralOrBuilder() {
                SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaTemplateGeneralOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAlexaTemplateGeneral sEAlexaTemplateGeneral = this.templateGeneral_;
                return sEAlexaTemplateGeneral == null ? SEAlexaTemplateGeneral.getDefaultInstance() : sEAlexaTemplateGeneral;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasAlertData() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasAlexaClockInfoList() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasAlexaDialogId() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasAlexaErrorCode() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasAlexaEventRemindInfoList() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasCountdownTime() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasResultType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasSportsType() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaInstructionOrBuilder
            public boolean hasTemplateGeneral() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaInstruction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaInstruction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasResultType()) {
                    return false;
                }
                if (hasTemplateGeneral() && !getTemplateGeneral().isInitialized()) {
                    return false;
                }
                if (hasAlertData() && !getAlertData().isInitialized()) {
                    return false;
                }
                if (!hasAlexaClockInfoList() || getAlexaClockInfoList().isInitialized()) {
                    return !hasAlexaEventRemindInfoList() || getAlexaEventRemindInfoList().isInitialized();
                }
                return false;
            }

            public Builder mergeAlertData(SEAlexaAlertData sEAlexaAlertData) {
                SEAlexaAlertData sEAlexaAlertData2;
                SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder = this.alertDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEAlexaAlertData);
                } else if ((this.bitField0_ & 8) == 0 || (sEAlexaAlertData2 = this.alertData_) == null || sEAlexaAlertData2 == SEAlexaAlertData.getDefaultInstance()) {
                    this.alertData_ = sEAlexaAlertData;
                } else {
                    getAlertDataBuilder().mergeFrom(sEAlexaAlertData);
                }
                if (this.alertData_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAlexaClockInfoList(SEAlexaClockInfo.SEList sEList) {
                SEAlexaClockInfo.SEList sEList2;
                SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder = this.alexaClockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 64) == 0 || (sEList2 = this.alexaClockInfoList_) == null || sEList2 == SEAlexaClockInfo.SEList.getDefaultInstance()) {
                    this.alexaClockInfoList_ = sEList;
                } else {
                    getAlexaClockInfoListBuilder().mergeFrom(sEList);
                }
                if (this.alexaClockInfoList_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAlexaEventRemindInfoList(SEAlexaEventRemind.SEList sEList) {
                SEAlexaEventRemind.SEList sEList2;
                SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder = this.alexaEventRemindInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 256) == 0 || (sEList2 = this.alexaEventRemindInfoList_) == null || sEList2 == SEAlexaEventRemind.SEList.getDefaultInstance()) {
                    this.alexaEventRemindInfoList_ = sEList;
                } else {
                    getAlexaEventRemindInfoListBuilder().mergeFrom(sEList);
                }
                if (this.alexaEventRemindInfoList_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTemplateGeneral(SEAlexaTemplateGeneral sEAlexaTemplateGeneral) {
                SEAlexaTemplateGeneral sEAlexaTemplateGeneral2;
                SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEAlexaTemplateGeneral);
                } else if ((this.bitField0_ & 2) == 0 || (sEAlexaTemplateGeneral2 = this.templateGeneral_) == null || sEAlexaTemplateGeneral2 == SEAlexaTemplateGeneral.getDefaultInstance()) {
                    this.templateGeneral_ = sEAlexaTemplateGeneral;
                } else {
                    getTemplateGeneralBuilder().mergeFrom(sEAlexaTemplateGeneral);
                }
                if (this.templateGeneral_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setAlertData(SEAlexaAlertData sEAlexaAlertData) {
                SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder = this.alertDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEAlexaAlertData.getClass();
                    this.alertData_ = sEAlexaAlertData;
                } else {
                    singleFieldBuilder.setMessage(sEAlexaAlertData);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAlexaClockInfoList(SEAlexaClockInfo.SEList sEList) {
                SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder = this.alexaClockInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.alexaClockInfoList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setAlexaDialogId(int i7) {
                this.alexaDialogId_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAlexaErrorCode(int i7) {
                this.alexaErrorCode_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAlexaEventRemindInfoList(SEAlexaEventRemind.SEList sEList) {
                SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder = this.alexaEventRemindInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.alexaEventRemindInfoList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setCountdownTime(int i7) {
                this.countdownTime_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setResultType(SEAlexaResultType sEAlexaResultType) {
                sEAlexaResultType.getClass();
                this.bitField0_ |= 1;
                this.resultType_ = sEAlexaResultType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSportsType(int i7) {
                this.sportsType_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setTemplateGeneral(SEAlexaTemplateGeneral sEAlexaTemplateGeneral) {
                SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                if (singleFieldBuilder == null) {
                    sEAlexaTemplateGeneral.getClass();
                    this.templateGeneral_ = sEAlexaTemplateGeneral;
                } else {
                    singleFieldBuilder.setMessage(sEAlexaTemplateGeneral);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.resultType_ = 1;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaInstruction build() {
                SEAlexaInstruction sEAlexaInstructionBuildPartial = buildPartial();
                if (sEAlexaInstructionBuildPartial.isInitialized()) {
                    return sEAlexaInstructionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAlexaInstructionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaInstruction buildPartial() {
                SEAlexaInstruction sEAlexaInstruction = new SEAlexaInstruction(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAlexaInstruction);
                }
                onBuilt();
                return sEAlexaInstruction;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAlexaInstruction getDefaultInstanceForType() {
                return SEAlexaInstruction.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.resultType_ = 1;
                this.templateGeneral_ = null;
                SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.templateGeneralBuilder_ = null;
                }
                this.alexaErrorCode_ = 0;
                this.alertData_ = null;
                SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder2 = this.alertDataBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.alertDataBuilder_ = null;
                }
                this.alexaDialogId_ = 0;
                this.countdownTime_ = 0;
                this.alexaClockInfoList_ = null;
                SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder3 = this.alexaClockInfoListBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.dispose();
                    this.alexaClockInfoListBuilder_ = null;
                }
                this.sportsType_ = 0;
                this.alexaEventRemindInfoList_ = null;
                SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder4 = this.alexaEventRemindInfoListBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.dispose();
                    this.alexaEventRemindInfoListBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.resultType_ = 1;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAlexaInstruction) {
                    return mergeFrom((SEAlexaInstruction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAlertData(SEAlexaAlertData.Builder builder) {
                SingleFieldBuilder<SEAlexaAlertData, SEAlexaAlertData.Builder, SEAlexaAlertDataOrBuilder> singleFieldBuilder = this.alertDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.alertData_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAlexaClockInfoList(SEAlexaClockInfo.SEList.Builder builder) {
                SingleFieldBuilder<SEAlexaClockInfo.SEList, SEAlexaClockInfo.SEList.Builder, SEAlexaClockInfo.SEListOrBuilder> singleFieldBuilder = this.alexaClockInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    this.alexaClockInfoList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setAlexaEventRemindInfoList(SEAlexaEventRemind.SEList.Builder builder) {
                SingleFieldBuilder<SEAlexaEventRemind.SEList, SEAlexaEventRemind.SEList.Builder, SEAlexaEventRemind.SEListOrBuilder> singleFieldBuilder = this.alexaEventRemindInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    this.alexaEventRemindInfoList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTemplateGeneral(SEAlexaTemplateGeneral.Builder builder) {
                SingleFieldBuilder<SEAlexaTemplateGeneral, SEAlexaTemplateGeneral.Builder, SEAlexaTemplateGeneralOrBuilder> singleFieldBuilder = this.templateGeneralBuilder_;
                if (singleFieldBuilder == null) {
                    this.templateGeneral_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAlexaInstruction sEAlexaInstruction) {
                if (sEAlexaInstruction == SEAlexaInstruction.getDefaultInstance()) {
                    return this;
                }
                if (sEAlexaInstruction.hasResultType()) {
                    setResultType(sEAlexaInstruction.getResultType());
                }
                if (sEAlexaInstruction.hasTemplateGeneral()) {
                    mergeTemplateGeneral(sEAlexaInstruction.getTemplateGeneral());
                }
                if (sEAlexaInstruction.hasAlexaErrorCode()) {
                    setAlexaErrorCode(sEAlexaInstruction.getAlexaErrorCode());
                }
                if (sEAlexaInstruction.hasAlertData()) {
                    mergeAlertData(sEAlexaInstruction.getAlertData());
                }
                if (sEAlexaInstruction.hasAlexaDialogId()) {
                    setAlexaDialogId(sEAlexaInstruction.getAlexaDialogId());
                }
                if (sEAlexaInstruction.hasCountdownTime()) {
                    setCountdownTime(sEAlexaInstruction.getCountdownTime());
                }
                if (sEAlexaInstruction.hasAlexaClockInfoList()) {
                    mergeAlexaClockInfoList(sEAlexaInstruction.getAlexaClockInfoList());
                }
                if (sEAlexaInstruction.hasSportsType()) {
                    setSportsType(sEAlexaInstruction.getSportsType());
                }
                if (sEAlexaInstruction.hasAlexaEventRemindInfoList()) {
                    mergeAlexaEventRemindInfoList(sEAlexaInstruction.getAlexaEventRemindInfoList());
                }
                mergeUnknownFields(sEAlexaInstruction.getUnknownFields());
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
                                    if (SEAlexaResultType.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.resultType_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetTemplateGeneralFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.alexaErrorCode_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetAlertDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.alexaDialogId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.countdownTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(internalGetAlexaClockInfoListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    this.sportsType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                } else if (tag != 74) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetAlexaEventRemindInfoListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
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

        private SEAlexaInstruction(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.resultType_ = 1;
            this.alexaErrorCode_ = 0;
            this.alexaDialogId_ = 0;
            this.countdownTime_ = 0;
            this.sportsType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAlexaInstruction sEAlexaInstruction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAlexaInstruction);
        }

        public static SEAlexaInstruction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAlexaInstruction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaInstruction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaInstruction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAlexaInstruction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAlexaInstruction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAlexaInstruction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAlexaInstruction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAlexaInstruction parseFrom(InputStream inputStream) {
            return (SEAlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEAlexaInstruction() {
            this.alexaErrorCode_ = 0;
            this.alexaDialogId_ = 0;
            this.countdownTime_ = 0;
            this.sportsType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.resultType_ = 1;
        }

        public static SEAlexaInstruction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaInstruction parseFrom(CodedInputStream codedInputStream) {
            return (SEAlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAlexaInstruction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAlexaInstructionOrBuilder extends MessageOrBuilder {
        SEAlexaAlertData getAlertData();

        SEAlexaAlertDataOrBuilder getAlertDataOrBuilder();

        SEAlexaClockInfo.SEList getAlexaClockInfoList();

        SEAlexaClockInfo.SEListOrBuilder getAlexaClockInfoListOrBuilder();

        int getAlexaDialogId();

        int getAlexaErrorCode();

        SEAlexaEventRemind.SEList getAlexaEventRemindInfoList();

        SEAlexaEventRemind.SEListOrBuilder getAlexaEventRemindInfoListOrBuilder();

        int getCountdownTime();

        SEAlexaResultType getResultType();

        int getSportsType();

        SEAlexaTemplateGeneral getTemplateGeneral();

        SEAlexaTemplateGeneralOrBuilder getTemplateGeneralOrBuilder();

        boolean hasAlertData();

        boolean hasAlexaClockInfoList();

        boolean hasAlexaDialogId();

        boolean hasAlexaErrorCode();

        boolean hasAlexaEventRemindInfoList();

        boolean hasCountdownTime();

        boolean hasResultType();

        boolean hasSportsType();

        boolean hasTemplateGeneral();
    }

    public enum SEAlexaResultType implements ProtocolMessageEnum {
        ALEXA_START_LISTENING(1),
        ALEXA_END_LISTENING(2),
        ALEXA_AUTH_STATUS(3),
        ALEXA_ERROR_AUTH(4),
        ALEXA_ERROR_UNSUPPORTED_AREA(5),
        ALEXA_TEMPLATE_GENERAL(6),
        ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH(7),
        ALEXA_ALERT_AVS(8),
        ALEXA_COUNTDOWN_SET(9),
        ALEXA_ALERTS_SETALERT_LIST(10),
        ALEXA_SPORTS_SET(11),
        ALEXA_HEART_RATE_SET(12),
        ALEXA_PRESSURE_SET(13),
        ALEXA_BLOOD_OXYGEN_SET(14),
        ALEXA_FIND_PHONE_SET(15),
        ALEXA_EVENT_REMIND(16);

        public static final int ALEXA_ALERTS_SETALERT_LIST_VALUE = 10;
        public static final int ALEXA_ALERT_AVS_VALUE = 8;
        public static final int ALEXA_AUTH_STATUS_VALUE = 3;
        public static final int ALEXA_BLOOD_OXYGEN_SET_VALUE = 14;
        public static final int ALEXA_COUNTDOWN_SET_VALUE = 9;
        public static final int ALEXA_END_LISTENING_VALUE = 2;
        public static final int ALEXA_ERROR_AUTH_VALUE = 4;
        public static final int ALEXA_ERROR_UNSUPPORTED_AREA_VALUE = 5;
        public static final int ALEXA_EVENT_REMIND_VALUE = 16;
        public static final int ALEXA_FIND_PHONE_SET_VALUE = 15;
        public static final int ALEXA_HEART_RATE_SET_VALUE = 12;
        public static final int ALEXA_PRESSURE_SET_VALUE = 13;
        public static final int ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH_VALUE = 7;
        public static final int ALEXA_SPORTS_SET_VALUE = 11;
        public static final int ALEXA_START_LISTENING_VALUE = 1;
        public static final int ALEXA_TEMPLATE_GENERAL_VALUE = 6;
        private static final SEAlexaResultType[] VALUES;
        private static final Internal.EnumLiteMap<SEAlexaResultType> internalValueMap;
        private final int value;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAlexaResultType");
            internalValueMap = new Internal.EnumLiteMap<SEAlexaResultType>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaResultType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEAlexaResultType findValueByNumber(int i7) {
                    return SEAlexaResultType.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEAlexaResultType(int i7) {
            this.value = i7;
        }

        public static SEAlexaResultType forNumber(int i7) {
            switch (i7) {
                case 1:
                    return ALEXA_START_LISTENING;
                case 2:
                    return ALEXA_END_LISTENING;
                case 3:
                    return ALEXA_AUTH_STATUS;
                case 4:
                    return ALEXA_ERROR_AUTH;
                case 5:
                    return ALEXA_ERROR_UNSUPPORTED_AREA;
                case 6:
                    return ALEXA_TEMPLATE_GENERAL;
                case 7:
                    return ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH;
                case 8:
                    return ALEXA_ALERT_AVS;
                case 9:
                    return ALEXA_COUNTDOWN_SET;
                case 10:
                    return ALEXA_ALERTS_SETALERT_LIST;
                case 11:
                    return ALEXA_SPORTS_SET;
                case 12:
                    return ALEXA_HEART_RATE_SET;
                case 13:
                    return ALEXA_PRESSURE_SET;
                case 14:
                    return ALEXA_BLOOD_OXYGEN_SET;
                case 15:
                    return ALEXA_FIND_PHONE_SET;
                case 16:
                    return ALEXA_EVENT_REMIND;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return AlexaProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SEAlexaResultType> internalGetValueMap() {
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
        public static SEAlexaResultType valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEAlexaResultType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEAlexaTemplateGeneral extends GeneratedMessage implements SEAlexaTemplateGeneralOrBuilder {
        private static final SEAlexaTemplateGeneral DEFAULT_INSTANCE;
        private static final Parser<SEAlexaTemplateGeneral> PARSER;
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object text_;
        private SEAlexaTitle title_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAlexaTemplateGeneral");
            DEFAULT_INSTANCE = new SEAlexaTemplateGeneral();
            PARSER = new AbstractParser<SEAlexaTemplateGeneral>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneral.1
                @Override // com.google.protobuf.Parser
                public SEAlexaTemplateGeneral parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAlexaTemplateGeneral.newBuilder();
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

        public static SEAlexaTemplateGeneral getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_SA_SEAlexaTemplateGeneral_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAlexaTemplateGeneral parseDelimitedFrom(InputStream inputStream) {
            return (SEAlexaTemplateGeneral) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAlexaTemplateGeneral parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAlexaTemplateGeneral> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAlexaTemplateGeneral)) {
                return super.equals(obj);
            }
            SEAlexaTemplateGeneral sEAlexaTemplateGeneral = (SEAlexaTemplateGeneral) obj;
            if (hasTitle() != sEAlexaTemplateGeneral.hasTitle()) {
                return false;
            }
            if ((!hasTitle() || getTitle().equals(sEAlexaTemplateGeneral.getTitle())) && hasText() == sEAlexaTemplateGeneral.hasText()) {
                return (!hasText() || getText().equals(sEAlexaTemplateGeneral.getText())) && getUnknownFields().equals(sEAlexaTemplateGeneral.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AlexaProtos.internal_static_SA_SEAlexaTemplateGeneral_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAlexaTemplateGeneral> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTitle()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.text_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.text_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
        public SEAlexaTitle getTitle() {
            SEAlexaTitle sEAlexaTitle = this.title_;
            return sEAlexaTitle == null ? SEAlexaTitle.getDefaultInstance() : sEAlexaTitle;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
        public SEAlexaTitleOrBuilder getTitleOrBuilder() {
            SEAlexaTitle sEAlexaTitle = this.title_;
            return sEAlexaTitle == null ? SEAlexaTitle.getDefaultInstance() : sEAlexaTitle;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTitle()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTitle().hashCode();
            }
            if (hasText()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getText().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_SA_SEAlexaTemplateGeneral_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaTemplateGeneral.class, Builder.class);
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
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasText()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getTitle().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getTitle());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.text_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAlexaTemplateGeneralOrBuilder {
            private int bitField0_;
            private Object text_;
            private SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> titleBuilder_;
            private SEAlexaTitle title_;

            private void buildPartial0(SEAlexaTemplateGeneral sEAlexaTemplateGeneral) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                    sEAlexaTemplateGeneral.title_ = singleFieldBuilder == null ? this.title_ : (SEAlexaTitle) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAlexaTemplateGeneral.text_ = this.text_;
                    i7 |= 2;
                }
                sEAlexaTemplateGeneral.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaTemplateGeneral_descriptor;
            }

            private SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> internalGetTitleFieldBuilder() {
                if (this.titleBuilder_ == null) {
                    this.titleBuilder_ = new SingleFieldBuilder<>(getTitle(), getParentForChildren(), isClean());
                    this.title_ = null;
                }
                return this.titleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetTitleFieldBuilder();
                }
            }

            public Builder clearText() {
                this.text_ = SEAlexaTemplateGeneral.getDefaultInstance().getText();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.bitField0_ &= -2;
                this.title_ = null;
                SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.titleBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaTemplateGeneral_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.text_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
            public SEAlexaTitle getTitle() {
                SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaTitle) singleFieldBuilder.getMessage();
                }
                SEAlexaTitle sEAlexaTitle = this.title_;
                return sEAlexaTitle == null ? SEAlexaTitle.getDefaultInstance() : sEAlexaTitle;
            }

            public SEAlexaTitle.Builder getTitleBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEAlexaTitle.Builder) internalGetTitleFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
            public SEAlexaTitleOrBuilder getTitleOrBuilder() {
                SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAlexaTitleOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAlexaTitle sEAlexaTitle = this.title_;
                return sEAlexaTitle == null ? SEAlexaTitle.getDefaultInstance() : sEAlexaTitle;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTemplateGeneralOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaTemplateGeneral_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaTemplateGeneral.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTitle() && hasText() && getTitle().isInitialized();
            }

            public Builder mergeTitle(SEAlexaTitle sEAlexaTitle) {
                SEAlexaTitle sEAlexaTitle2;
                SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEAlexaTitle);
                } else if ((this.bitField0_ & 1) == 0 || (sEAlexaTitle2 = this.title_) == null || sEAlexaTitle2 == SEAlexaTitle.getDefaultInstance()) {
                    this.title_ = sEAlexaTitle;
                } else {
                    getTitleBuilder().mergeFrom(sEAlexaTitle);
                }
                if (this.title_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.text_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.text_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitle(SEAlexaTitle sEAlexaTitle) {
                SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                if (singleFieldBuilder == null) {
                    sEAlexaTitle.getClass();
                    this.title_ = sEAlexaTitle;
                } else {
                    singleFieldBuilder.setMessage(sEAlexaTitle);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaTemplateGeneral build() {
                SEAlexaTemplateGeneral sEAlexaTemplateGeneralBuildPartial = buildPartial();
                if (sEAlexaTemplateGeneralBuildPartial.isInitialized()) {
                    return sEAlexaTemplateGeneralBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAlexaTemplateGeneralBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaTemplateGeneral buildPartial() {
                SEAlexaTemplateGeneral sEAlexaTemplateGeneral = new SEAlexaTemplateGeneral(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAlexaTemplateGeneral);
                }
                onBuilt();
                return sEAlexaTemplateGeneral;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAlexaTemplateGeneral getDefaultInstanceForType() {
                return SEAlexaTemplateGeneral.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.title_ = null;
                SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.titleBuilder_ = null;
                }
                this.text_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAlexaTemplateGeneral) {
                    return mergeFrom((SEAlexaTemplateGeneral) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setTitle(SEAlexaTitle.Builder builder) {
                SingleFieldBuilder<SEAlexaTitle, SEAlexaTitle.Builder, SEAlexaTitleOrBuilder> singleFieldBuilder = this.titleBuilder_;
                if (singleFieldBuilder == null) {
                    this.title_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAlexaTemplateGeneral sEAlexaTemplateGeneral) {
                if (sEAlexaTemplateGeneral == SEAlexaTemplateGeneral.getDefaultInstance()) {
                    return this;
                }
                if (sEAlexaTemplateGeneral.hasTitle()) {
                    mergeTitle(sEAlexaTemplateGeneral.getTitle());
                }
                if (sEAlexaTemplateGeneral.hasText()) {
                    this.text_ = sEAlexaTemplateGeneral.text_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sEAlexaTemplateGeneral.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetTitleFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.text_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
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

        private SEAlexaTemplateGeneral(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAlexaTemplateGeneral sEAlexaTemplateGeneral) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAlexaTemplateGeneral);
        }

        public static SEAlexaTemplateGeneral parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAlexaTemplateGeneral parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaTemplateGeneral) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaTemplateGeneral parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAlexaTemplateGeneral getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAlexaTemplateGeneral parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEAlexaTemplateGeneral() {
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.text_ = "";
        }

        public static SEAlexaTemplateGeneral parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAlexaTemplateGeneral parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAlexaTemplateGeneral parseFrom(InputStream inputStream) {
            return (SEAlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAlexaTemplateGeneral parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaTemplateGeneral parseFrom(CodedInputStream codedInputStream) {
            return (SEAlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAlexaTemplateGeneral parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAlexaTemplateGeneralOrBuilder extends MessageOrBuilder {
        String getText();

        ByteString getTextBytes();

        SEAlexaTitle getTitle();

        SEAlexaTitleOrBuilder getTitleOrBuilder();

        boolean hasText();

        boolean hasTitle();
    }

    public static final class SEAlexaTitle extends GeneratedMessage implements SEAlexaTitleOrBuilder {
        private static final SEAlexaTitle DEFAULT_INSTANCE;
        public static final int MAIN_TITLE_FIELD_NUMBER = 1;
        private static final Parser<SEAlexaTitle> PARSER;
        public static final int SUB_TITLE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object mainTitle_;
        private byte memoizedIsInitialized;
        private volatile Object subTitle_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAlexaTitle");
            DEFAULT_INSTANCE = new SEAlexaTitle();
            PARSER = new AbstractParser<SEAlexaTitle>() { // from class: com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitle.1
                @Override // com.google.protobuf.Parser
                public SEAlexaTitle parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAlexaTitle.newBuilder();
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

        public static SEAlexaTitle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_SA_SEAlexaTitle_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAlexaTitle parseDelimitedFrom(InputStream inputStream) {
            return (SEAlexaTitle) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAlexaTitle parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAlexaTitle> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAlexaTitle)) {
                return super.equals(obj);
            }
            SEAlexaTitle sEAlexaTitle = (SEAlexaTitle) obj;
            if (hasMainTitle() != sEAlexaTitle.hasMainTitle()) {
                return false;
            }
            if ((!hasMainTitle() || getMainTitle().equals(sEAlexaTitle.getMainTitle())) && hasSubTitle() == sEAlexaTitle.hasSubTitle()) {
                return (!hasSubTitle() || getSubTitle().equals(sEAlexaTitle.getSubTitle())) && getUnknownFields().equals(sEAlexaTitle.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AlexaProtos.internal_static_SA_SEAlexaTitle_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
        public String getMainTitle() {
            Object obj = this.mainTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.mainTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
        public ByteString getMainTitleBytes() {
            Object obj = this.mainTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mainTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAlexaTitle> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.mainTitle_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.subTitle_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
        public String getSubTitle() {
            Object obj = this.subTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.subTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
        public ByteString getSubTitleBytes() {
            Object obj = this.subTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.subTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
        public boolean hasMainTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
        public boolean hasSubTitle() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasMainTitle()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMainTitle().hashCode();
            }
            if (hasSubTitle()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSubTitle().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_SA_SEAlexaTitle_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaTitle.class, Builder.class);
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
            if (!hasMainTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSubTitle()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.mainTitle_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.subTitle_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAlexaTitleOrBuilder {
            private int bitField0_;
            private Object mainTitle_;
            private Object subTitle_;

            private void buildPartial0(SEAlexaTitle sEAlexaTitle) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAlexaTitle.mainTitle_ = this.mainTitle_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAlexaTitle.subTitle_ = this.subTitle_;
                    i7 |= 2;
                }
                sEAlexaTitle.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_SA_SEAlexaTitle_descriptor;
            }

            public Builder clearMainTitle() {
                this.mainTitle_ = SEAlexaTitle.getDefaultInstance().getMainTitle();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSubTitle() {
                this.subTitle_ = SEAlexaTitle.getDefaultInstance().getSubTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_SA_SEAlexaTitle_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
            public String getMainTitle() {
                Object obj = this.mainTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.mainTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
            public ByteString getMainTitleBytes() {
                Object obj = this.mainTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mainTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
            public String getSubTitle() {
                Object obj = this.subTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.subTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
            public ByteString getSubTitleBytes() {
                Object obj = this.subTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.subTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
            public boolean hasMainTitle() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AlexaProtos.SEAlexaTitleOrBuilder
            public boolean hasSubTitle() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_SA_SEAlexaTitle_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAlexaTitle.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMainTitle() && hasSubTitle();
            }

            public Builder setMainTitle(String str) {
                str.getClass();
                this.mainTitle_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMainTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.mainTitle_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSubTitle(String str) {
                str.getClass();
                this.subTitle_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.subTitle_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.mainTitle_ = "";
                this.subTitle_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaTitle build() {
                SEAlexaTitle sEAlexaTitleBuildPartial = buildPartial();
                if (sEAlexaTitleBuildPartial.isInitialized()) {
                    return sEAlexaTitleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAlexaTitleBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAlexaTitle buildPartial() {
                SEAlexaTitle sEAlexaTitle = new SEAlexaTitle(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAlexaTitle);
                }
                onBuilt();
                return sEAlexaTitle;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAlexaTitle getDefaultInstanceForType() {
                return SEAlexaTitle.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mainTitle_ = "";
                this.subTitle_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.mainTitle_ = "";
                this.subTitle_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAlexaTitle) {
                    return mergeFrom((SEAlexaTitle) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEAlexaTitle sEAlexaTitle) {
                if (sEAlexaTitle == SEAlexaTitle.getDefaultInstance()) {
                    return this;
                }
                if (sEAlexaTitle.hasMainTitle()) {
                    this.mainTitle_ = sEAlexaTitle.mainTitle_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEAlexaTitle.hasSubTitle()) {
                    this.subTitle_ = sEAlexaTitle.subTitle_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sEAlexaTitle.getUnknownFields());
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
                                    this.mainTitle_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.subTitle_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
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

        private SEAlexaTitle(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.mainTitle_ = "";
            this.subTitle_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAlexaTitle sEAlexaTitle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAlexaTitle);
        }

        public static SEAlexaTitle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAlexaTitle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaTitle) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaTitle parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAlexaTitle getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAlexaTitle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAlexaTitle parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEAlexaTitle() {
            this.mainTitle_ = "";
            this.subTitle_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.mainTitle_ = "";
            this.subTitle_ = "";
        }

        public static SEAlexaTitle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAlexaTitle parseFrom(InputStream inputStream) {
            return (SEAlexaTitle) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAlexaTitle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaTitle) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAlexaTitle parseFrom(CodedInputStream codedInputStream) {
            return (SEAlexaTitle) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAlexaTitle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAlexaTitle) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAlexaTitleOrBuilder extends MessageOrBuilder {
        String getMainTitle();

        ByteString getMainTitleBytes();

        String getSubTitle();

        ByteString getSubTitleBytes();

        boolean hasMainTitle();

        boolean hasSubTitle();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "AlexaProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000esa_Alexa.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\"C\n\u0007SEAleax\u0012-\n\u000binstruction\u0018\u0001 \u0001(\u000b2\u0016.SA.SEAlexaInstructionH\u0000B\t\n\u0007payload\"\u009d\u0003\n\u0012SEAlexaInstruction\u0012*\n\u000bresult_type\u0018\u0001 \u0002(\u000e2\u0015.SA.SEAlexaResultType\u00124\n\u0010template_general\u0018\u0002 \u0001(\u000b2\u001a.SA.SEAlexaTemplateGeneral\u0012\u001f\n\u0010alexa_error_code\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012(\n\nalert_data\u0018\u0004 \u0001(\u000b2\u0014.SA.SEAlexaAlertData\u0012\u001e\n\u000falexa_dialog_id\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028 \u0012\u001d\n\u000ecountdown_time\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012:\n\u0015alexa_clock_info_list\u0018\u0007 \u0001(\u000b2\u001b.SA.SEAlexaClockInfo.SEList\u0012\u001a\n\u000bsports_type\u0018\b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012C\n\u001calexa_event_remind_info_list\u0018\t \u0001(\u000b2\u001d.SA.SEAlexaEventRemind.SEList\"N\n\u0016SEAlexaTemplateGeneral\u0012\u001f\n\u0005title\u0018\u0001 \u0002(\u000b2\u0010.SA.SEAlexaTitle\u0012\u0013\n\u0004text\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"C\n\fSEAlexaTitle\u0012\u0019\n\nmain_title\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tsub_title\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"¹\u0001\n\u0010SEAlexaAlertData\u0012\u0019\n\nalexa_hour\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0018\n\talexa_min\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0019\n\nalexa_week\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u001a\n\u000balexa_token\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nalexa_type\u0018\u0005 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001e\n\u000falexa_dara_type\u0018\u0006 \u0002(\rB\u0005\u0092?\u00028\b\"ï\u0001\n\u0010SEAlexaClockInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012)\n\u0004data\u0018\u0002 \u0002(\u000b2\u001b.SA.SEAlexaClockInfo.SEData\u001aS\n\u0006SEData\u0012\u001f\n\u0004time\u0018\u0001 \u0002(\u000b2\u0011.SA.SESettingTime\u0012\u0018\n\tweek_days\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u000e\n\u0006enable\u0018\u0003 \u0002(\b\u001aO\n\u0006SEList\u0012)\n\u0004list\u0018\u0001 \u0003(\u000b2\u0014.SA.SEAlexaClockInfoB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u0012support_max_clocks\u0018\u0002 \u0001(\r\"Ã\u0001\n\u0012SEAlexaEventRemind\u0012+\n\u0017alexa_event_remind_time\u0018\u0001 \u0002(\u000b2\n.SA.SETime\u0012'\n\u0018alexa_event_remind_lable\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001aW\n\u0006SEList\u0012+\n\u0004list\u0018\u0001 \u0003(\u000b2\u0016.SA.SEAlexaEventRemindB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0018support_max_event_remind\u0018\u0002 \u0001(\r*'\n\u000fSEALEXA_ALEXAID\u0012\u0014\n\u0010SYNC_INSTRUCTION\u0010\u0000*¿\u0003\n\u0011SEAlexaResultType\u0012\u0019\n\u0015ALEXA_START_LISTENING\u0010\u0001\u0012\u0017\n\u0013ALEXA_END_LISTENING\u0010\u0002\u0012\u0015\n\u0011ALEXA_AUTH_STATUS\u0010\u0003\u0012\u0014\n\u0010ALEXA_ERROR_AUTH\u0010\u0004\u0012 \n\u001cALEXA_ERROR_UNSUPPORTED_AREA\u0010\u0005\u0012\u001a\n\u0016ALEXA_TEMPLATE_GENERAL\u0010\u0006\u0012'\n#ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH\u0010\u0007\u0012\u0013\n\u000fALEXA_ALERT_AVS\u0010\b\u0012\u0017\n\u0013ALEXA_COUNTDOWN_SET\u0010\t\u0012\u001e\n\u001aALEXA_ALERTS_SETALERT_LIST\u0010\n\u0012\u0014\n\u0010ALEXA_SPORTS_SET\u0010\u000b\u0012\u0018\n\u0014ALEXA_HEART_RATE_SET\u0010\f\u0012\u0016\n\u0012ALEXA_PRESSURE_SET\u0010\r\u0012\u001a\n\u0016ALEXA_BLOOD_OXYGEN_SET\u0010\u000e\u0012\u0018\n\u0014ALEXA_FIND_PHONE_SET\u0010\u000f\u0012\u0016\n\u0012ALEXA_EVENT_REMIND\u0010\u0010B1\n\u001bcom.zh.ble.sa_wear.protobufB\u000bAlexaProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEAleax_descriptor = messageType;
        internal_static_SA_SEAleax_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"Instruction", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SEAlexaInstruction_descriptor = messageType2;
        internal_static_SA_SEAlexaInstruction_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"ResultType", "TemplateGeneral", "AlexaErrorCode", "AlertData", "AlexaDialogId", "CountdownTime", "AlexaClockInfoList", "SportsType", "AlexaEventRemindInfoList"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SEAlexaTemplateGeneral_descriptor = messageType3;
        internal_static_SA_SEAlexaTemplateGeneral_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"Title", "Text"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SEAlexaTitle_descriptor = messageType4;
        internal_static_SA_SEAlexaTitle_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"MainTitle", "SubTitle"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SEAlexaAlertData_descriptor = messageType5;
        internal_static_SA_SEAlexaAlertData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"AlexaHour", "AlexaMin", "AlexaWeek", "AlexaToken", "AlexaType", "AlexaDaraType"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SEAlexaClockInfo_descriptor = messageType6;
        internal_static_SA_SEAlexaClockInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Id", "Data"});
        Descriptors.Descriptor nestedType = messageType6.getNestedType(0);
        internal_static_SA_SEAlexaClockInfo_SEData_descriptor = nestedType;
        internal_static_SA_SEAlexaClockInfo_SEData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{UrlTemplate.f27969g, "WeekDays", "Enable"});
        Descriptors.Descriptor nestedType2 = messageType6.getNestedType(1);
        internal_static_SA_SEAlexaClockInfo_SEList_descriptor = nestedType2;
        internal_static_SA_SEAlexaClockInfo_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{MessageLiteToString.f20028a, "SupportMaxClocks"});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SA_SEAlexaEventRemind_descriptor = messageType7;
        internal_static_SA_SEAlexaEventRemind_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"AlexaEventRemindTime", "AlexaEventRemindLable"});
        Descriptors.Descriptor nestedType3 = messageType7.getNestedType(0);
        internal_static_SA_SEAlexaEventRemind_SEList_descriptor = nestedType3;
        internal_static_SA_SEAlexaEventRemind_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{MessageLiteToString.f20028a, "SupportMaxEventRemind"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private AlexaProtos() {
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