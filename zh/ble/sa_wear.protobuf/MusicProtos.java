package com.zh.ble.sa_wear.protobuf;

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
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class MusicProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEMusic_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEMusic_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEPlayerInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEPlayerInfo_fieldAccessorTable;

    public static final class SEMusic extends GeneratedMessage implements SEMusicOrBuilder {
        private static final SEMusic DEFAULT_INSTANCE;
        private static final Parser<SEMusic> PARSER;
        public static final int PLAYER_CONTROL_COMMAND_FIELD_NUMBER = 2;
        public static final int PLAYER_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            PLAYER_INFO(1),
            PLAYER_CONTROL_COMMAND(2),
            PAYLOAD_NOT_SET(0);

            private final int value;

            PayloadCase(int i7) {
                this.value = i7;
            }

            public static PayloadCase forNumber(int i7) {
                if (i7 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i7 == 1) {
                    return PLAYER_INFO;
                }
                if (i7 != 2) {
                    return null;
                }
                return PLAYER_CONTROL_COMMAND;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEMusic");
            DEFAULT_INSTANCE = new SEMusic();
            PARSER = new AbstractParser<SEMusic>() { // from class: com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusic.1
                @Override // com.google.protobuf.Parser
                public SEMusic parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEMusic.newBuilder();
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

        public static SEMusic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MusicProtos.internal_static_SA_SEMusic_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEMusic parseDelimitedFrom(InputStream inputStream) {
            return (SEMusic) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEMusic parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEMusic> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEMusic)) {
                return super.equals(obj);
            }
            SEMusic sEMusic = (SEMusic) obj;
            if (!getPayloadCase().equals(sEMusic.getPayloadCase())) {
                return false;
            }
            int i7 = this.payloadCase_;
            if (i7 != 1) {
                if (i7 == 2 && !getPlayerControlCommand().equals(sEMusic.getPlayerControlCommand())) {
                    return false;
                }
            } else if (!getPlayerInfo().equals(sEMusic.getPlayerInfo())) {
                return false;
            }
            return getUnknownFields().equals(sEMusic.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MusicProtos.internal_static_SA_SEMusic_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEMusic> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
        public SEPlayerControlCommand getPlayerControlCommand() {
            SEPlayerControlCommand sEPlayerControlCommandForNumber;
            return (this.payloadCase_ != 2 || (sEPlayerControlCommandForNumber = SEPlayerControlCommand.forNumber(((Integer) this.payload_).intValue())) == null) ? SEPlayerControlCommand.PLAYING : sEPlayerControlCommandForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
        public SEPlayerInfo getPlayerInfo() {
            return this.payloadCase_ == 1 ? (SEPlayerInfo) this.payload_ : SEPlayerInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
        public SEPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
            return this.payloadCase_ == 1 ? (SEPlayerInfo) this.payload_ : SEPlayerInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEPlayerInfo) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, ((Integer) this.payload_).intValue());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
        public boolean hasPlayerControlCommand() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
        public boolean hasPlayerInfo() {
            return this.payloadCase_ == 1;
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
            int i9 = this.payloadCase_;
            if (i9 != 1) {
                if (i9 == 2) {
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getPlayerControlCommand().getNumber();
                }
                int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            i7 = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getPlayerInfo().hashCode();
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicProtos.internal_static_SA_SEMusic_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMusic.class, Builder.class);
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
            if (!hasPlayerInfo() || getPlayerInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEPlayerInfo) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeEnum(2, ((Integer) this.payload_).intValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEMusicOrBuilder {
            private int bitField0_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> playerInfoBuilder_;

            private void buildPartial0(SEMusic sEMusic) {
            }

            private void buildPartialOneofs(SEMusic sEMusic) {
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                sEMusic.payloadCase_ = i7;
                sEMusic.payload_ = this.payload_;
                if (i7 != 1 || (singleFieldBuilder = this.playerInfoBuilder_) == null) {
                    return;
                }
                sEMusic.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MusicProtos.internal_static_SA_SEMusic_descriptor;
            }

            private SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> internalGetPlayerInfoFieldBuilder() {
                if (this.playerInfoBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEPlayerInfo.getDefaultInstance();
                    }
                    this.playerInfoBuilder_ = new SingleFieldBuilder<>((SEPlayerInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.playerInfoBuilder_;
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearPlayerControlCommand() {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearPlayerInfo() {
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder = this.playerInfoBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicProtos.internal_static_SA_SEMusic_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
            public SEPlayerControlCommand getPlayerControlCommand() {
                SEPlayerControlCommand sEPlayerControlCommandForNumber;
                return (this.payloadCase_ != 2 || (sEPlayerControlCommandForNumber = SEPlayerControlCommand.forNumber(((Integer) this.payload_).intValue())) == null) ? SEPlayerControlCommand.PLAYING : sEPlayerControlCommandForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
            public SEPlayerInfo getPlayerInfo() {
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder = this.playerInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEPlayerInfo) this.payload_ : SEPlayerInfo.getDefaultInstance() : this.payloadCase_ == 1 ? (SEPlayerInfo) singleFieldBuilder.getMessage() : SEPlayerInfo.getDefaultInstance();
            }

            public SEPlayerInfo.Builder getPlayerInfoBuilder() {
                return (SEPlayerInfo.Builder) internalGetPlayerInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
            public SEPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.playerInfoBuilder_) == null) ? i7 == 1 ? (SEPlayerInfo) this.payload_ : SEPlayerInfo.getDefaultInstance() : (SEPlayerInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
            public boolean hasPlayerControlCommand() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusicOrBuilder
            public boolean hasPlayerInfo() {
                return this.payloadCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicProtos.internal_static_SA_SEMusic_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMusic.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasPlayerInfo() || getPlayerInfo().isInitialized();
            }

            public Builder mergePlayerInfo(SEPlayerInfo sEPlayerInfo) {
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder = this.playerInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEPlayerInfo.getDefaultInstance()) {
                        this.payload_ = sEPlayerInfo;
                    } else {
                        this.payload_ = SEPlayerInfo.newBuilder((SEPlayerInfo) this.payload_).mergeFrom(sEPlayerInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEPlayerInfo);
                } else {
                    singleFieldBuilder.setMessage(sEPlayerInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setPlayerControlCommand(SEPlayerControlCommand sEPlayerControlCommand) {
                sEPlayerControlCommand.getClass();
                this.payloadCase_ = 2;
                this.payload_ = Integer.valueOf(sEPlayerControlCommand.getNumber());
                onChanged();
                return this;
            }

            public Builder setPlayerInfo(SEPlayerInfo sEPlayerInfo) {
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder = this.playerInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEPlayerInfo.getClass();
                    this.payload_ = sEPlayerInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEPlayerInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEMusic build() {
                SEMusic sEMusicBuildPartial = buildPartial();
                if (sEMusicBuildPartial.isInitialized()) {
                    return sEMusicBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEMusicBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEMusic buildPartial() {
                SEMusic sEMusic = new SEMusic(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEMusic);
                }
                buildPartialOneofs(sEMusic);
                onBuilt();
                return sEMusic;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEMusic getDefaultInstanceForType() {
                return SEMusic.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder = this.playerInfoBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEMusic) {
                    return mergeFrom((SEMusic) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPlayerInfo(SEPlayerInfo.Builder builder) {
                SingleFieldBuilder<SEPlayerInfo, SEPlayerInfo.Builder, SEPlayerInfoOrBuilder> singleFieldBuilder = this.playerInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeFrom(SEMusic sEMusic) {
                if (sEMusic == SEMusic.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = sEMusic.getPayloadCase().ordinal();
                if (iOrdinal == 0) {
                    mergePlayerInfo(sEMusic.getPlayerInfo());
                } else if (iOrdinal == 1) {
                    setPlayerControlCommand(sEMusic.getPlayerControlCommand());
                }
                mergeUnknownFields(sEMusic.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetPlayerInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (SEPlayerControlCommand.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.payloadCase_ = 2;
                                        this.payload_ = Integer.valueOf(i7);
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

        private SEMusic(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEMusic sEMusic) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEMusic);
        }

        public static SEMusic parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEMusic parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMusic) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMusic parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEMusic getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEMusic parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEMusic() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEMusic parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEMusic parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEMusic parseFrom(InputStream inputStream) {
            return (SEMusic) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEMusic parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMusic) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMusic parseFrom(CodedInputStream codedInputStream) {
            return (SEMusic) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEMusic parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMusic) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEMusicOrBuilder extends MessageOrBuilder {
        SEMusic.PayloadCase getPayloadCase();

        SEPlayerControlCommand getPlayerControlCommand();

        SEPlayerInfo getPlayerInfo();

        SEPlayerInfoOrBuilder getPlayerInfoOrBuilder();

        boolean hasPlayerControlCommand();

        boolean hasPlayerInfo();
    }

    public enum SEMusic_MusicID implements ProtocolMessageEnum {
        REQUEST_MUSIC_STATE(0),
        SEND_MUSIC_CMD(1),
        QUIT_MUSIC(2),
        SYNC_MUSIC_INFO(3);

        public static final int QUIT_MUSIC_VALUE = 2;
        public static final int REQUEST_MUSIC_STATE_VALUE = 0;
        public static final int SEND_MUSIC_CMD_VALUE = 1;
        public static final int SYNC_MUSIC_INFO_VALUE = 3;
        private static final SEMusic_MusicID[] VALUES;
        private static final Internal.EnumLiteMap<SEMusic_MusicID> internalValueMap;
        private final int value;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEMusic_MusicID");
            internalValueMap = new Internal.EnumLiteMap<SEMusic_MusicID>() { // from class: com.zh.ble.sa_wear.protobuf.MusicProtos.SEMusic_MusicID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEMusic_MusicID findValueByNumber(int i7) {
                    return SEMusic_MusicID.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEMusic_MusicID(int i7) {
            this.value = i7;
        }

        public static SEMusic_MusicID forNumber(int i7) {
            if (i7 == 0) {
                return REQUEST_MUSIC_STATE;
            }
            if (i7 == 1) {
                return SEND_MUSIC_CMD;
            }
            if (i7 == 2) {
                return QUIT_MUSIC;
            }
            if (i7 != 3) {
                return null;
            }
            return SYNC_MUSIC_INFO;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MusicProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEMusic_MusicID> internalGetValueMap() {
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
        public static SEMusic_MusicID valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEMusic_MusicID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEPlayerControlCommand implements ProtocolMessageEnum {
        PLAYING(1),
        PAUSE(2),
        PREV(3),
        NEXT(4),
        ADJUST_VOLUME_UP(5),
        ADJUST_VOLUME_DOWN(6);

        public static final int ADJUST_VOLUME_DOWN_VALUE = 6;
        public static final int ADJUST_VOLUME_UP_VALUE = 5;
        public static final int NEXT_VALUE = 4;
        public static final int PAUSE_VALUE = 2;
        public static final int PLAYING_VALUE = 1;
        public static final int PREV_VALUE = 3;
        private static final SEPlayerControlCommand[] VALUES;
        private static final Internal.EnumLiteMap<SEPlayerControlCommand> internalValueMap;
        private final int value;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPlayerControlCommand");
            internalValueMap = new Internal.EnumLiteMap<SEPlayerControlCommand>() { // from class: com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerControlCommand.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEPlayerControlCommand findValueByNumber(int i7) {
                    return SEPlayerControlCommand.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEPlayerControlCommand(int i7) {
            this.value = i7;
        }

        public static SEPlayerControlCommand forNumber(int i7) {
            switch (i7) {
                case 1:
                    return PLAYING;
                case 2:
                    return PAUSE;
                case 3:
                    return PREV;
                case 4:
                    return NEXT;
                case 5:
                    return ADJUST_VOLUME_UP;
                case 6:
                    return ADJUST_VOLUME_DOWN;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MusicProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SEPlayerControlCommand> internalGetValueMap() {
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
        public static SEPlayerControlCommand valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEPlayerControlCommand valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEPlayerInfo extends GeneratedMessage implements SEPlayerInfoOrBuilder {
        public static final int CURRENT_PROGRESS_FIELD_NUMBER = 8;
        public static final int CURRENT_VOLUME_FIELD_NUMBER = 5;
        private static final SEPlayerInfo DEFAULT_INSTANCE;
        public static final int ICON_IMG_FIELD_NUMBER = 9;
        public static final int NOSIC_FIT_PERMISSION_TYPE_FIELD_NUMBER = 10;
        private static final Parser<SEPlayerInfo> PARSER;
        public static final int PLAYER_NAME_FIELD_NUMBER = 3;
        public static final int SONG_ARTIST_FIELD_NUMBER = 4;
        public static final int SONG_TITLE_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 1;
        public static final int TOTAL_PROGRESS_FIELD_NUMBER = 7;
        public static final int TOTAL_VOLUME_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int currentProgress_;
        private int currentVolume_;
        private ByteString iconImg_;
        private byte memoizedIsInitialized;
        private int nosicFitPermissionType_;
        private volatile Object playerName_;
        private volatile Object songArtist_;
        private volatile Object songTitle_;
        private int state_;
        private int totalProgress_;
        private int totalVolume_;

        public enum SEState implements ProtocolMessageEnum {
            NONE(0),
            NO_PERMISSION(1),
            PLAYING(2),
            PAUSE(3),
            STOP(4),
            NO_MUSIC_PLAYING(5);

            public static final int NONE_VALUE = 0;
            public static final int NO_MUSIC_PLAYING_VALUE = 5;
            public static final int NO_PERMISSION_VALUE = 1;
            public static final int PAUSE_VALUE = 3;
            public static final int PLAYING_VALUE = 2;
            public static final int STOP_VALUE = 4;
            private static final SEState[] VALUES;
            private static final Internal.EnumLiteMap<SEState> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEState");
                internalValueMap = new Internal.EnumLiteMap<SEState>() { // from class: com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfo.SEState.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEState findValueByNumber(int i7) {
                        return SEState.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEState(int i7) {
                this.value = i7;
            }

            public static SEState forNumber(int i7) {
                if (i7 == 0) {
                    return NONE;
                }
                if (i7 == 1) {
                    return NO_PERMISSION;
                }
                if (i7 == 2) {
                    return PLAYING;
                }
                if (i7 == 3) {
                    return PAUSE;
                }
                if (i7 == 4) {
                    return STOP;
                }
                if (i7 != 5) {
                    return null;
                }
                return NO_MUSIC_PLAYING;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEPlayerInfo.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEState> internalGetValueMap() {
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
            public static SEState valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPlayerInfo");
            DEFAULT_INSTANCE = new SEPlayerInfo();
            PARSER = new AbstractParser<SEPlayerInfo>() { // from class: com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfo.1
                @Override // com.google.protobuf.Parser
                public SEPlayerInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEPlayerInfo.newBuilder();
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

        public static SEPlayerInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MusicProtos.internal_static_SA_SEPlayerInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEPlayerInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEPlayerInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEPlayerInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEPlayerInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEPlayerInfo)) {
                return super.equals(obj);
            }
            SEPlayerInfo sEPlayerInfo = (SEPlayerInfo) obj;
            if (hasState() != sEPlayerInfo.hasState()) {
                return false;
            }
            if ((hasState() && this.state_ != sEPlayerInfo.state_) || hasSongTitle() != sEPlayerInfo.hasSongTitle()) {
                return false;
            }
            if ((hasSongTitle() && !getSongTitle().equals(sEPlayerInfo.getSongTitle())) || hasPlayerName() != sEPlayerInfo.hasPlayerName()) {
                return false;
            }
            if ((hasPlayerName() && !getPlayerName().equals(sEPlayerInfo.getPlayerName())) || hasSongArtist() != sEPlayerInfo.hasSongArtist()) {
                return false;
            }
            if ((hasSongArtist() && !getSongArtist().equals(sEPlayerInfo.getSongArtist())) || hasCurrentVolume() != sEPlayerInfo.hasCurrentVolume()) {
                return false;
            }
            if ((hasCurrentVolume() && getCurrentVolume() != sEPlayerInfo.getCurrentVolume()) || hasTotalVolume() != sEPlayerInfo.hasTotalVolume()) {
                return false;
            }
            if ((hasTotalVolume() && getTotalVolume() != sEPlayerInfo.getTotalVolume()) || hasTotalProgress() != sEPlayerInfo.hasTotalProgress()) {
                return false;
            }
            if ((hasTotalProgress() && getTotalProgress() != sEPlayerInfo.getTotalProgress()) || hasCurrentProgress() != sEPlayerInfo.hasCurrentProgress()) {
                return false;
            }
            if ((hasCurrentProgress() && getCurrentProgress() != sEPlayerInfo.getCurrentProgress()) || hasIconImg() != sEPlayerInfo.hasIconImg()) {
                return false;
            }
            if ((!hasIconImg() || getIconImg().equals(sEPlayerInfo.getIconImg())) && hasNosicFitPermissionType() == sEPlayerInfo.hasNosicFitPermissionType()) {
                return (!hasNosicFitPermissionType() || getNosicFitPermissionType() == sEPlayerInfo.getNosicFitPermissionType()) && getUnknownFields().equals(sEPlayerInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public int getCurrentProgress() {
            return this.currentProgress_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public int getCurrentVolume() {
            return this.currentVolume_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MusicProtos.internal_static_SA_SEPlayerInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public ByteString getIconImg() {
            return this.iconImg_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public int getNosicFitPermissionType() {
            return this.nosicFitPermissionType_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEPlayerInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public String getPlayerName() {
            Object obj = this.playerName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.playerName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public ByteString getPlayerNameBytes() {
            Object obj = this.playerName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.playerName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.songTitle_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.playerName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(4, this.songArtist_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(5, this.currentVolume_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.totalVolume_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(7, this.totalProgress_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(8, this.currentProgress_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(9, this.iconImg_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(10, this.nosicFitPermissionType_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public String getSongArtist() {
            Object obj = this.songArtist_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.songArtist_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public ByteString getSongArtistBytes() {
            Object obj = this.songArtist_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.songArtist_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public String getSongTitle() {
            Object obj = this.songTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.songTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public ByteString getSongTitleBytes() {
            Object obj = this.songTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.songTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public SEState getState() {
            SEState sEStateForNumber = SEState.forNumber(this.state_);
            return sEStateForNumber == null ? SEState.NONE : sEStateForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public int getTotalProgress() {
            return this.totalProgress_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public int getTotalVolume() {
            return this.totalVolume_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasCurrentProgress() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasCurrentVolume() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasIconImg() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasNosicFitPermissionType() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasSongArtist() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasSongTitle() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasTotalProgress() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
        public boolean hasTotalVolume() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasState()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.state_;
            }
            if (hasSongTitle()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSongTitle().hashCode();
            }
            if (hasPlayerName()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPlayerName().hashCode();
            }
            if (hasSongArtist()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSongArtist().hashCode();
            }
            if (hasCurrentVolume()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getCurrentVolume();
            }
            if (hasTotalVolume()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getTotalVolume();
            }
            if (hasTotalProgress()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getTotalProgress();
            }
            if (hasCurrentProgress()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getCurrentProgress();
            }
            if (hasIconImg()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getIconImg().hashCode();
            }
            if (hasNosicFitPermissionType()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getNosicFitPermissionType();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicProtos.internal_static_SA_SEPlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPlayerInfo.class, Builder.class);
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
            if (hasState()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.songTitle_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.playerName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.songArtist_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.currentVolume_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.totalVolume_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.totalProgress_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.currentProgress_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeBytes(9, this.iconImg_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.nosicFitPermissionType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEPlayerInfoOrBuilder {
            private int bitField0_;
            private int currentProgress_;
            private int currentVolume_;
            private ByteString iconImg_;
            private int nosicFitPermissionType_;
            private Object playerName_;
            private Object songArtist_;
            private Object songTitle_;
            private int state_;
            private int totalProgress_;
            private int totalVolume_;

            private void buildPartial0(SEPlayerInfo sEPlayerInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEPlayerInfo.state_ = this.state_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEPlayerInfo.songTitle_ = this.songTitle_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEPlayerInfo.playerName_ = this.playerName_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEPlayerInfo.songArtist_ = this.songArtist_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEPlayerInfo.currentVolume_ = this.currentVolume_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEPlayerInfo.totalVolume_ = this.totalVolume_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEPlayerInfo.totalProgress_ = this.totalProgress_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEPlayerInfo.currentProgress_ = this.currentProgress_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sEPlayerInfo.iconImg_ = this.iconImg_;
                    i7 |= 256;
                }
                if ((i8 & 512) != 0) {
                    sEPlayerInfo.nosicFitPermissionType_ = this.nosicFitPermissionType_;
                    i7 |= 512;
                }
                sEPlayerInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MusicProtos.internal_static_SA_SEPlayerInfo_descriptor;
            }

            public Builder clearCurrentProgress() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.currentProgress_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentVolume() {
                this.bitField0_ &= -17;
                this.currentVolume_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIconImg() {
                this.bitField0_ &= -257;
                this.iconImg_ = SEPlayerInfo.getDefaultInstance().getIconImg();
                onChanged();
                return this;
            }

            public Builder clearNosicFitPermissionType() {
                this.bitField0_ &= -513;
                this.nosicFitPermissionType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlayerName() {
                this.playerName_ = SEPlayerInfo.getDefaultInstance().getPlayerName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearSongArtist() {
                this.songArtist_ = SEPlayerInfo.getDefaultInstance().getSongArtist();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearSongTitle() {
                this.songTitle_ = SEPlayerInfo.getDefaultInstance().getSongTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalProgress() {
                this.bitField0_ &= -65;
                this.totalProgress_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalVolume() {
                this.bitField0_ &= -33;
                this.totalVolume_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public int getCurrentProgress() {
                return this.currentProgress_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public int getCurrentVolume() {
                return this.currentVolume_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicProtos.internal_static_SA_SEPlayerInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public ByteString getIconImg() {
                return this.iconImg_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public int getNosicFitPermissionType() {
                return this.nosicFitPermissionType_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public String getPlayerName() {
                Object obj = this.playerName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.playerName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public ByteString getPlayerNameBytes() {
                Object obj = this.playerName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.playerName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public String getSongArtist() {
                Object obj = this.songArtist_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.songArtist_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public ByteString getSongArtistBytes() {
                Object obj = this.songArtist_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.songArtist_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public String getSongTitle() {
                Object obj = this.songTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.songTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public ByteString getSongTitleBytes() {
                Object obj = this.songTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.songTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public SEState getState() {
                SEState sEStateForNumber = SEState.forNumber(this.state_);
                return sEStateForNumber == null ? SEState.NONE : sEStateForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public int getTotalProgress() {
                return this.totalProgress_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public int getTotalVolume() {
                return this.totalVolume_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasCurrentProgress() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasCurrentVolume() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasIconImg() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasNosicFitPermissionType() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasPlayerName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasSongArtist() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasSongTitle() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasTotalProgress() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.MusicProtos.SEPlayerInfoOrBuilder
            public boolean hasTotalVolume() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicProtos.internal_static_SA_SEPlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPlayerInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasState();
            }

            public Builder setCurrentProgress(int i7) {
                this.currentProgress_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setCurrentVolume(int i7) {
                this.currentVolume_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setIconImg(ByteString byteString) {
                byteString.getClass();
                this.iconImg_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setNosicFitPermissionType(int i7) {
                this.nosicFitPermissionType_ = i7;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPlayerName(String str) {
                str.getClass();
                this.playerName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPlayerNameBytes(ByteString byteString) {
                byteString.getClass();
                this.playerName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSongArtist(String str) {
                str.getClass();
                this.songArtist_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSongArtistBytes(ByteString byteString) {
                byteString.getClass();
                this.songArtist_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSongTitle(String str) {
                str.getClass();
                this.songTitle_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSongTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.songTitle_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setState(SEState sEState) {
                sEState.getClass();
                this.bitField0_ |= 1;
                this.state_ = sEState.getNumber();
                onChanged();
                return this;
            }

            public Builder setTotalProgress(int i7) {
                this.totalProgress_ = i7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setTotalVolume(int i7) {
                this.totalVolume_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            private Builder() {
                this.state_ = 0;
                this.songTitle_ = "";
                this.playerName_ = "";
                this.songArtist_ = "";
                this.iconImg_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPlayerInfo build() {
                SEPlayerInfo sEPlayerInfoBuildPartial = buildPartial();
                if (sEPlayerInfoBuildPartial.isInitialized()) {
                    return sEPlayerInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEPlayerInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPlayerInfo buildPartial() {
                SEPlayerInfo sEPlayerInfo = new SEPlayerInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEPlayerInfo);
                }
                onBuilt();
                return sEPlayerInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEPlayerInfo getDefaultInstanceForType() {
                return SEPlayerInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
                this.songTitle_ = "";
                this.playerName_ = "";
                this.songArtist_ = "";
                this.currentVolume_ = 0;
                this.totalVolume_ = 0;
                this.totalProgress_ = 0;
                this.currentProgress_ = 0;
                this.iconImg_ = ByteString.EMPTY;
                this.nosicFitPermissionType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEPlayerInfo) {
                    return mergeFrom((SEPlayerInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 0;
                this.songTitle_ = "";
                this.playerName_ = "";
                this.songArtist_ = "";
                this.iconImg_ = ByteString.EMPTY;
            }

            public Builder mergeFrom(SEPlayerInfo sEPlayerInfo) {
                if (sEPlayerInfo == SEPlayerInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEPlayerInfo.hasState()) {
                    setState(sEPlayerInfo.getState());
                }
                if (sEPlayerInfo.hasSongTitle()) {
                    this.songTitle_ = sEPlayerInfo.songTitle_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEPlayerInfo.hasPlayerName()) {
                    this.playerName_ = sEPlayerInfo.playerName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEPlayerInfo.hasSongArtist()) {
                    this.songArtist_ = sEPlayerInfo.songArtist_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEPlayerInfo.hasCurrentVolume()) {
                    setCurrentVolume(sEPlayerInfo.getCurrentVolume());
                }
                if (sEPlayerInfo.hasTotalVolume()) {
                    setTotalVolume(sEPlayerInfo.getTotalVolume());
                }
                if (sEPlayerInfo.hasTotalProgress()) {
                    setTotalProgress(sEPlayerInfo.getTotalProgress());
                }
                if (sEPlayerInfo.hasCurrentProgress()) {
                    setCurrentProgress(sEPlayerInfo.getCurrentProgress());
                }
                if (sEPlayerInfo.hasIconImg()) {
                    setIconImg(sEPlayerInfo.getIconImg());
                }
                if (sEPlayerInfo.hasNosicFitPermissionType()) {
                    setNosicFitPermissionType(sEPlayerInfo.getNosicFitPermissionType());
                }
                mergeUnknownFields(sEPlayerInfo.getUnknownFields());
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
                            switch (tag) {
                                case 0:
                                    z6 = true;
                                    break;
                                case 8:
                                    int i7 = codedInputStream.readEnum();
                                    if (SEState.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.state_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                    break;
                                case 18:
                                    this.songTitle_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.playerName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    this.songArtist_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                    break;
                                case 40:
                                    this.currentVolume_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.totalVolume_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    break;
                                case 56:
                                    this.totalProgress_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.currentProgress_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    this.iconImg_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.nosicFitPermissionType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    break;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        z6 = true;
                                    }
                                    break;
                            }
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

        private SEPlayerInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.songTitle_ = "";
            this.playerName_ = "";
            this.songArtist_ = "";
            this.currentVolume_ = 0;
            this.totalVolume_ = 0;
            this.totalProgress_ = 0;
            this.currentProgress_ = 0;
            this.iconImg_ = ByteString.EMPTY;
            this.nosicFitPermissionType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEPlayerInfo sEPlayerInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEPlayerInfo);
        }

        public static SEPlayerInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEPlayerInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPlayerInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPlayerInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEPlayerInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEPlayerInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEPlayerInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEPlayerInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEPlayerInfo parseFrom(InputStream inputStream) {
            return (SEPlayerInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEPlayerInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPlayerInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPlayerInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEPlayerInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEPlayerInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPlayerInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SEPlayerInfo() {
            this.state_ = 0;
            this.songTitle_ = "";
            this.playerName_ = "";
            this.songArtist_ = "";
            this.currentVolume_ = 0;
            this.totalVolume_ = 0;
            this.totalProgress_ = 0;
            this.currentProgress_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.iconImg_ = byteString;
            this.nosicFitPermissionType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
            this.songTitle_ = "";
            this.playerName_ = "";
            this.songArtist_ = "";
            this.iconImg_ = byteString;
        }
    }

    public interface SEPlayerInfoOrBuilder extends MessageOrBuilder {
        int getCurrentProgress();

        int getCurrentVolume();

        ByteString getIconImg();

        int getNosicFitPermissionType();

        String getPlayerName();

        ByteString getPlayerNameBytes();

        String getSongArtist();

        ByteString getSongArtistBytes();

        String getSongTitle();

        ByteString getSongTitleBytes();

        SEPlayerInfo.SEState getState();

        int getTotalProgress();

        int getTotalVolume();

        boolean hasCurrentProgress();

        boolean hasCurrentVolume();

        boolean hasIconImg();

        boolean hasNosicFitPermissionType();

        boolean hasPlayerName();

        boolean hasSongArtist();

        boolean hasSongTitle();

        boolean hasState();

        boolean hasTotalProgress();

        boolean hasTotalVolume();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "MusicProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000esa_Music.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\"{\n\u0007SEMusic\u0012'\n\u000bplayer_info\u0018\u0001 \u0001(\u000b2\u0010.SA.SEPlayerInfoH\u0000\u0012<\n\u0016player_control_command\u0018\u0002 \u0001(\u000e2\u001a.SA.SEPlayerControlCommandH\u0000B\t\n\u0007payload\"©\u0003\n\fSEPlayerInfo\u0012'\n\u0005state\u0018\u0001 \u0002(\u000e2\u0018.SA.SEPlayerInfo.SEState\u0012\u0019\n\nsong_title\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bplayer_name\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bsong_artist\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001d\n\u000ecurrent_volume\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001b\n\ftotal_volume\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001d\n\u000etotal_progress\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u001f\n\u0010current_progress\u0018\b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0017\n\bicon_img\u0018\t \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u0012(\n\u0019nosic_fit_permission_type\u0018\n \u0001(\rB\u0005\u0092?\u00028\b\"^\n\u0007SEState\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0011\n\rNO_PERMISSION\u0010\u0001\u0012\u000b\n\u0007PLAYING\u0010\u0002\u0012\t\n\u0005PAUSE\u0010\u0003\u0012\b\n\u0004STOP\u0010\u0004\u0012\u0014\n\u0010NO_MUSIC_PLAYING\u0010\u0005*c\n\u000fSEMusic_MusicID\u0012\u0017\n\u0013REQUEST_MUSIC_STATE\u0010\u0000\u0012\u0012\n\u000eSEND_MUSIC_CMD\u0010\u0001\u0012\u000e\n\nQUIT_MUSIC\u0010\u0002\u0012\u0013\n\u000fSYNC_MUSIC_INFO\u0010\u0003*r\n\u0016SEPlayerControlCommand\u0012\u000b\n\u0007PLAYING\u0010\u0001\u0012\t\n\u0005PAUSE\u0010\u0002\u0012\b\n\u0004PREV\u0010\u0003\u0012\b\n\u0004NEXT\u0010\u0004\u0012\u0014\n\u0010ADJUST_VOLUME_UP\u0010\u0005\u0012\u0016\n\u0012ADJUST_VOLUME_DOWN\u0010\u0006B1\n\u001bcom.zh.ble.sa_wear.protobufB\u000bMusicProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEMusic_descriptor = messageType;
        internal_static_SA_SEMusic_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"PlayerInfo", "PlayerControlCommand", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SEPlayerInfo_descriptor = messageType2;
        internal_static_SA_SEPlayerInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"State", "SongTitle", "PlayerName", "SongArtist", "CurrentVolume", "TotalVolume", "TotalProgress", "CurrentProgress", "IconImg", "NosicFitPermissionType"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private MusicProtos() {
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