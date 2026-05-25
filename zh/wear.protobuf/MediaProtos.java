package com.zh.wear.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_Media_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Media_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_PlayerControl_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerControl_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_PlayerInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerInfo_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.MediaProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$MediaProtos$Media$PayloadCase;

        static {
            int[] iArr = new int[Media.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$MediaProtos$Media$PayloadCase = iArr;
            try {
                iArr[Media.PayloadCase.PLAYER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MediaProtos$Media$PayloadCase[Media.PayloadCase.PLAYER_CONTROL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MediaProtos$Media$PayloadCase[Media.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Media extends GeneratedMessageV3 implements MediaOrBuilder {
        private static final Media DEFAULT_INSTANCE = new Media();

        @Deprecated
        public static final Parser<Media> PARSER = new AbstractParser<Media>() { // from class: com.zh.wear.protobuf.MediaProtos.Media.1
            @Override // com.google.protobuf.Parser
            public Media parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Media(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PLAYER_CONTROL_FIELD_NUMBER = 2;
        public static final int PLAYER_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MediaOrBuilder {
            private int bitField0_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> playerControlBuilder_;
            private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> playerInfoBuilder_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MediaProtos.internal_static_Media_descriptor;
            }

            private SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> getPlayerControlFieldBuilder() {
                if (this.playerControlBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = PlayerControl.getDefaultInstance();
                    }
                    this.playerControlBuilder_ = new SingleFieldBuilderV3<>((PlayerControl) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.playerControlBuilder_;
            }

            private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
                if (this.playerInfoBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = PlayerInfo.getDefaultInstance();
                    }
                    this.playerInfoBuilder_ = new SingleFieldBuilderV3<>((PlayerInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.playerInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearPlayerControl() {
                SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> singleFieldBuilderV3 = this.playerControlBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearPlayerInfo() {
                SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> singleFieldBuilderV3 = this.playerInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MediaProtos.internal_static_Media_descriptor;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
            public PlayerControl getPlayerControl() {
                Object message;
                SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> singleFieldBuilderV3 = this.playerControlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return PlayerControl.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return PlayerControl.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (PlayerControl) message;
            }

            public PlayerControl.Builder getPlayerControlBuilder() {
                return (PlayerControl.Builder) getPlayerControlFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
            public PlayerControlOrBuilder getPlayerControlOrBuilder() {
                SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.playerControlBuilder_) == null) ? i7 == 2 ? (PlayerControl) this.payload_ : PlayerControl.getDefaultInstance() : (PlayerControlOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
            public PlayerInfo getPlayerInfo() {
                Object message;
                SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> singleFieldBuilderV3 = this.playerInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return PlayerInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return PlayerInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (PlayerInfo) message;
            }

            public PlayerInfo.Builder getPlayerInfoBuilder() {
                return (PlayerInfo.Builder) getPlayerInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
            public PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
                SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.playerInfoBuilder_) == null) ? i7 == 1 ? (PlayerInfo) this.payload_ : PlayerInfo.getDefaultInstance() : (PlayerInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
            public boolean hasPlayerControl() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
            public boolean hasPlayerInfo() {
                return this.payloadCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MediaProtos.internal_static_Media_fieldAccessorTable.ensureFieldAccessorsInitialized(Media.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasPlayerInfo() || getPlayerInfo().isInitialized()) {
                    return !hasPlayerControl() || getPlayerControl().isInitialized();
                }
                return false;
            }

            public Builder mergePlayerControl(PlayerControl playerControl) {
                SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> singleFieldBuilderV3 = this.playerControlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != PlayerControl.getDefaultInstance()) {
                        playerControl = PlayerControl.newBuilder((PlayerControl) this.payload_).mergeFrom(playerControl).buildPartial();
                    }
                    this.payload_ = playerControl;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(playerControl);
                    }
                    this.playerControlBuilder_.setMessage(playerControl);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergePlayerInfo(PlayerInfo playerInfo) {
                SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> singleFieldBuilderV3 = this.playerInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != PlayerInfo.getDefaultInstance()) {
                        playerInfo = PlayerInfo.newBuilder((PlayerInfo) this.payload_).mergeFrom(playerInfo).buildPartial();
                    }
                    this.payload_ = playerInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(playerInfo);
                    }
                    this.playerInfoBuilder_.setMessage(playerInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setPlayerControl(PlayerControl.Builder builder) {
                SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> singleFieldBuilderV3 = this.playerControlBuilder_;
                PlayerControl playerControlBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = playerControlBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(playerControlBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setPlayerInfo(PlayerInfo.Builder builder) {
                SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> singleFieldBuilderV3 = this.playerInfoBuilder_;
                PlayerInfo playerInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = playerInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(playerInfoBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setPlayerControl(PlayerControl playerControl) {
                SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> singleFieldBuilderV3 = this.playerControlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    playerControl.getClass();
                    this.payload_ = playerControl;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(playerControl);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setPlayerInfo(PlayerInfo playerInfo) {
                SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> singleFieldBuilderV3 = this.playerInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    playerInfo.getClass();
                    this.payload_ = playerInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(playerInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Media build() {
                Media mediaBuildPartial = buildPartial();
                if (mediaBuildPartial.isInitialized()) {
                    return mediaBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) mediaBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Media buildPartial() {
                Media media = new Media(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> singleFieldBuilderV3 = this.playerInfoBuilder_;
                    media.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<PlayerControl, PlayerControl.Builder, PlayerControlOrBuilder> singleFieldBuilderV32 = this.playerControlBuilder_;
                    media.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                media.bitField0_ = 0;
                media.payloadCase_ = this.payloadCase_;
                onBuilt();
                return media;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Media getDefaultInstanceForType() {
                return Media.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i7, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i7, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo7408clone() {
                return (Builder) super.mo7408clone();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.zh.wear.protobuf.MediaProtos.Media.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.MediaProtos$Media> r1 = com.zh.wear.protobuf.MediaProtos.Media.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.MediaProtos$Media r3 = (com.zh.wear.protobuf.MediaProtos.Media) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.zh.wear.protobuf.MediaProtos$Media r4 = (com.zh.wear.protobuf.MediaProtos.Media) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.mergeFrom(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MediaProtos.Media.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MediaProtos$Media$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Media) {
                    return mergeFrom((Media) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Media media) {
                if (media == Media.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$MediaProtos$Media$PayloadCase[media.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    mergePlayerInfo(media.getPlayerInfo());
                } else if (i7 == 2) {
                    mergePlayerControl(media.getPlayerControl());
                }
                mergeUnknownFields(((GeneratedMessage) media).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum MediaID implements ProtocolMessageEnum {
            WEAR_REQUEST(0),
            SYNC_PLAYER_INFO(1),
            CONTROL_PLAYER(2);

            public static final int CONTROL_PLAYER_VALUE = 2;
            public static final int SYNC_PLAYER_INFO_VALUE = 1;
            public static final int WEAR_REQUEST_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<MediaID> internalValueMap = new Internal.EnumLiteMap<MediaID>() { // from class: com.zh.wear.protobuf.MediaProtos.Media.MediaID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public MediaID findValueByNumber(int i7) {
                    return MediaID.forNumber(i7);
                }
            };
            private static final MediaID[] VALUES = values();

            MediaID(int i7) {
                this.value = i7;
            }

            public static MediaID forNumber(int i7) {
                if (i7 == 0) {
                    return WEAR_REQUEST;
                }
                if (i7 == 1) {
                    return SYNC_PLAYER_INFO;
                }
                if (i7 != 2) {
                    return null;
                }
                return CONTROL_PLAYER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Media.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<MediaID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static MediaID valueOf(int i7) {
                return forNumber(i7);
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
                return getDescriptor().getValues().get(ordinal());
            }

            public static MediaID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            PLAYER_INFO(1),
            PLAYER_CONTROL(2),
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
                return PLAYER_CONTROL;
            }

            @Deprecated
            public static PayloadCase valueOf(int i7) {
                return forNumber(i7);
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }
        }

        private Media() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Media getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MediaProtos.internal_static_Media_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Media parseDelimitedFrom(InputStream inputStream) {
            return (Media) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Media parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Media> parser() {
            return PARSER;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r6 != r5) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.zh.wear.protobuf.MediaProtos.Media
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.MediaProtos$Media r6 = (com.zh.wear.protobuf.MediaProtos.Media) r6
                com.zh.wear.protobuf.MediaProtos$Media$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.MediaProtos$Media$PayloadCase r2 = r6.getPayloadCase()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 != 0) goto L1f
                return r2
            L1f:
                int r3 = r5.payloadCase_
                if (r3 == r0) goto L38
                r4 = 2
                if (r3 == r4) goto L27
                goto L4b
            L27:
                if (r1 == 0) goto L4a
                com.zh.wear.protobuf.MediaProtos$PlayerControl r1 = r5.getPlayerControl()
                com.zh.wear.protobuf.MediaProtos$PlayerControl r3 = r6.getPlayerControl()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L4a
                goto L48
            L38:
                if (r1 == 0) goto L4a
                com.zh.wear.protobuf.MediaProtos$PlayerInfo r1 = r5.getPlayerInfo()
                com.zh.wear.protobuf.MediaProtos$PlayerInfo r3 = r6.getPlayerInfo()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L4a
            L48:
                r1 = r0
                goto L4b
            L4a:
                r1 = r2
            L4b:
                if (r1 == 0) goto L58
                com.google.protobuf.UnknownFieldSet r1 = r5.unknownFields
                com.google.protobuf.UnknownFieldSet r6 = r6.unknownFields
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L58
                return r0
            L58:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MediaProtos.Media.equals(java.lang.Object):boolean");
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Media> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
        public PlayerControl getPlayerControl() {
            return this.payloadCase_ == 2 ? (PlayerControl) this.payload_ : PlayerControl.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
        public PlayerControlOrBuilder getPlayerControlOrBuilder() {
            return this.payloadCase_ == 2 ? (PlayerControl) this.payload_ : PlayerControl.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
        public PlayerInfo getPlayerInfo() {
            return this.payloadCase_ == 1 ? (PlayerInfo) this.payload_ : PlayerInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
        public PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
            return this.payloadCase_ == 1 ? (PlayerInfo) this.payload_ : PlayerInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (PlayerInfo) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (PlayerControl) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
        public boolean hasPlayerControl() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.MediaOrBuilder
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
                    iHashCode = getPlayerControl().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            i7 = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getPlayerInfo().hashCode();
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MediaProtos.internal_static_Media_fieldAccessorTable.ensureFieldAccessorsInitialized(Media.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (hasPlayerInfo() && !getPlayerInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPlayerControl() || getPlayerControl().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (PlayerInfo) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (PlayerControl) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Media(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        int i7 = 1;
                        if (tag != 0) {
                            if (tag == 10) {
                                PlayerInfo.Builder builder = this.payloadCase_ == 1 ? ((PlayerInfo) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(PlayerInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((PlayerInfo) message);
                                    this.payload_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                i7 = 2;
                                PlayerControl.Builder builder2 = this.payloadCase_ == 2 ? ((PlayerControl) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(PlayerControl.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((PlayerControl) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                            } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                            this.payloadCase_ = i7;
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(this);
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(Media media) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(media);
        }

        public static Media parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Media) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Media parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Media parseFrom(CodedInputStream codedInputStream) {
            return (Media) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Media getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Media(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Media parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Media) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Media parseFrom(InputStream inputStream) {
            return (Media) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Media parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Media) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Media parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Media parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Media parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Media parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface MediaOrBuilder extends MessageOrBuilder {
        Media.PayloadCase getPayloadCase();

        PlayerControl getPlayerControl();

        PlayerControlOrBuilder getPlayerControlOrBuilder();

        PlayerInfo getPlayerInfo();

        PlayerInfoOrBuilder getPlayerInfoOrBuilder();

        boolean hasPlayerControl();

        boolean hasPlayerInfo();
    }

    public static final class PlayerControl extends GeneratedMessageV3 implements PlayerControlOrBuilder {
        public static final int COMMAND_FIELD_NUMBER = 1;
        private static final PlayerControl DEFAULT_INSTANCE = new PlayerControl();

        @Deprecated
        public static final Parser<PlayerControl> PARSER = new AbstractParser<PlayerControl>() { // from class: com.zh.wear.protobuf.MediaProtos.PlayerControl.1
            @Override // com.google.protobuf.Parser
            public PlayerControl parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PlayerControl(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int VOLUME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int command_;
        private byte memoizedIsInitialized;
        private int volume_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerControlOrBuilder {
            private int bitField0_;
            private int command_;
            private int volume_;

            private Builder() {
                this.command_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MediaProtos.internal_static_PlayerControl_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCommand() {
                this.bitField0_ &= -2;
                this.command_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVolume() {
                this.bitField0_ &= -3;
                this.volume_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
            public Command getCommand() {
                Command commandValueOf = Command.valueOf(this.command_);
                return commandValueOf == null ? Command.PLAY : commandValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MediaProtos.internal_static_PlayerControl_descriptor;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
            public int getVolume() {
                return this.volume_;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
            public boolean hasCommand() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
            public boolean hasVolume() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MediaProtos.internal_static_PlayerControl_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerControl.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCommand();
            }

            public Builder setCommand(Command command) {
                command.getClass();
                this.bitField0_ |= 1;
                this.command_ = command.getNumber();
                onChanged();
                return this;
            }

            public Builder setVolume(int i7) {
                this.bitField0_ |= 2;
                this.volume_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.command_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PlayerControl build() {
                PlayerControl playerControlBuildPartial = buildPartial();
                if (playerControlBuildPartial.isInitialized()) {
                    return playerControlBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) playerControlBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PlayerControl buildPartial() {
                PlayerControl playerControl = new PlayerControl(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                playerControl.command_ = this.command_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                playerControl.volume_ = this.volume_;
                playerControl.bitField0_ = i8;
                onBuilt();
                return playerControl;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PlayerControl getDefaultInstanceForType() {
                return PlayerControl.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i7, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i7, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.command_ = 0;
                int i7 = this.bitField0_;
                this.volume_ = 0;
                this.bitField0_ = i7 & (-4);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo7408clone() {
                return (Builder) super.mo7408clone();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.zh.wear.protobuf.MediaProtos.PlayerControl.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.MediaProtos$PlayerControl> r1 = com.zh.wear.protobuf.MediaProtos.PlayerControl.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.MediaProtos$PlayerControl r3 = (com.zh.wear.protobuf.MediaProtos.PlayerControl) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.zh.wear.protobuf.MediaProtos$PlayerControl r4 = (com.zh.wear.protobuf.MediaProtos.PlayerControl) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.mergeFrom(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MediaProtos.PlayerControl.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MediaProtos$PlayerControl$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PlayerControl) {
                    return mergeFrom((PlayerControl) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PlayerControl playerControl) {
                if (playerControl == PlayerControl.getDefaultInstance()) {
                    return this;
                }
                if (playerControl.hasCommand()) {
                    setCommand(playerControl.getCommand());
                }
                if (playerControl.hasVolume()) {
                    setVolume(playerControl.getVolume());
                }
                mergeUnknownFields(((GeneratedMessage) playerControl).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum Command implements ProtocolMessageEnum {
            PLAY(0),
            PAUSE(1),
            STOP(2),
            PREV(3),
            NEXT(4),
            ADJUST_VOLUME(5);

            public static final int ADJUST_VOLUME_VALUE = 5;
            public static final int NEXT_VALUE = 4;
            public static final int PAUSE_VALUE = 1;
            public static final int PLAY_VALUE = 0;
            public static final int PREV_VALUE = 3;
            public static final int STOP_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Command> internalValueMap = new Internal.EnumLiteMap<Command>() { // from class: com.zh.wear.protobuf.MediaProtos.PlayerControl.Command.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Command findValueByNumber(int i7) {
                    return Command.forNumber(i7);
                }
            };
            private static final Command[] VALUES = values();

            Command(int i7) {
                this.value = i7;
            }

            public static Command forNumber(int i7) {
                if (i7 == 0) {
                    return PLAY;
                }
                if (i7 == 1) {
                    return PAUSE;
                }
                if (i7 == 2) {
                    return STOP;
                }
                if (i7 == 3) {
                    return PREV;
                }
                if (i7 == 4) {
                    return NEXT;
                }
                if (i7 != 5) {
                    return null;
                }
                return ADJUST_VOLUME;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PlayerControl.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Command> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Command valueOf(int i7) {
                return forNumber(i7);
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
                return getDescriptor().getValues().get(ordinal());
            }

            public static Command valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private PlayerControl() {
            this.memoizedIsInitialized = (byte) -1;
            this.command_ = 0;
            this.volume_ = 0;
        }

        public static PlayerControl getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MediaProtos.internal_static_PlayerControl_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PlayerControl parseDelimitedFrom(InputStream inputStream) {
            return (PlayerControl) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PlayerControl parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<PlayerControl> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerControl)) {
                return super.equals(obj);
            }
            PlayerControl playerControl = (PlayerControl) obj;
            boolean z6 = hasCommand() == playerControl.hasCommand();
            if (hasCommand()) {
                z6 = z6 && this.command_ == playerControl.command_;
            }
            boolean z7 = z6 && hasVolume() == playerControl.hasVolume();
            if (hasVolume()) {
                z7 = z7 && getVolume() == playerControl.getVolume();
            }
            return z7 && this.unknownFields.equals(playerControl.unknownFields);
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
        public Command getCommand() {
            Command commandValueOf = Command.valueOf(this.command_);
            return commandValueOf == null ? Command.PLAY : commandValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PlayerControl> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.command_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.volume_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
        public int getVolume() {
            return this.volume_;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
        public boolean hasCommand() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerControlOrBuilder
        public boolean hasVolume() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasCommand()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.command_;
            }
            if (hasVolume()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getVolume();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MediaProtos.internal_static_PlayerControl_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerControl.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b7 = this.memoizedIsInitialized;
            if (b7 == 1) {
                return true;
            }
            if (b7 == 0) {
                return false;
            }
            if (hasCommand()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.command_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.volume_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private PlayerControl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i7 = codedInputStream.readEnum();
                                if (Command.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.command_ = i7;
                                }
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.volume_ = codedInputStream.readUInt32();
                            } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(this);
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(PlayerControl playerControl) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(playerControl);
        }

        public static PlayerControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayerControl) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlayerControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PlayerControl parseFrom(CodedInputStream codedInputStream) {
            return (PlayerControl) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PlayerControl getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private PlayerControl(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PlayerControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayerControl) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PlayerControl parseFrom(InputStream inputStream) {
            return (PlayerControl) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static PlayerControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayerControl) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlayerControl parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static PlayerControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PlayerControl parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PlayerControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface PlayerControlOrBuilder extends MessageOrBuilder {
        PlayerControl.Command getCommand();

        int getVolume();

        boolean hasCommand();

        boolean hasVolume();
    }

    public static final class PlayerInfo extends GeneratedMessageV3 implements PlayerInfoOrBuilder {
        public static final int CURRENT_POSITION_FIELD_NUMBER = 6;
        public static final int DURATION_FIELD_NUMBER = 7;
        public static final int PLAYER_NAME_FIELD_NUMBER = 3;
        public static final int SONG_ARTIST_FIELD_NUMBER = 5;
        public static final int SONG_TITLE_FIELD_NUMBER = 4;
        public static final int STATE_FIELD_NUMBER = 1;
        public static final int VOLUME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int currentPosition_;
        private int duration_;
        private byte memoizedIsInitialized;
        private volatile Object playerName_;
        private volatile Object songArtist_;
        private volatile Object songTitle_;
        private int state_;
        private int volume_;
        private static final PlayerInfo DEFAULT_INSTANCE = new PlayerInfo();

        @Deprecated
        public static final Parser<PlayerInfo> PARSER = new AbstractParser<PlayerInfo>() { // from class: com.zh.wear.protobuf.MediaProtos.PlayerInfo.1
            @Override // com.google.protobuf.Parser
            public PlayerInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PlayerInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerInfoOrBuilder {
            private int bitField0_;
            private int currentPosition_;
            private int duration_;
            private Object playerName_;
            private Object songArtist_;
            private Object songTitle_;
            private int state_;
            private int volume_;

            private Builder() {
                this.state_ = 0;
                this.playerName_ = "";
                this.songTitle_ = "";
                this.songArtist_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MediaProtos.internal_static_PlayerInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCurrentPosition() {
                this.bitField0_ &= -33;
                this.currentPosition_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDuration() {
                this.bitField0_ &= -65;
                this.duration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlayerName() {
                this.bitField0_ &= -5;
                this.playerName_ = PlayerInfo.getDefaultInstance().getPlayerName();
                onChanged();
                return this;
            }

            public Builder clearSongArtist() {
                this.bitField0_ &= -17;
                this.songArtist_ = PlayerInfo.getDefaultInstance().getSongArtist();
                onChanged();
                return this;
            }

            public Builder clearSongTitle() {
                this.bitField0_ &= -9;
                this.songTitle_ = PlayerInfo.getDefaultInstance().getSongTitle();
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVolume() {
                this.bitField0_ &= -3;
                this.volume_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public int getCurrentPosition() {
                return this.currentPosition_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MediaProtos.internal_static_PlayerInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public ByteString getPlayerNameBytes() {
                Object obj = this.playerName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.playerName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public ByteString getSongArtistBytes() {
                Object obj = this.songArtist_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.songArtist_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public ByteString getSongTitleBytes() {
                Object obj = this.songTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.songTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public State getState() {
                State stateValueOf = State.valueOf(this.state_);
                return stateValueOf == null ? State.NONE : stateValueOf;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public int getVolume() {
                return this.volume_;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public boolean hasCurrentPosition() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public boolean hasDuration() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public boolean hasPlayerName() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public boolean hasSongArtist() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public boolean hasSongTitle() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
            public boolean hasVolume() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MediaProtos.internal_static_PlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasState();
            }

            public Builder setCurrentPosition(int i7) {
                this.bitField0_ |= 32;
                this.currentPosition_ = i7;
                onChanged();
                return this;
            }

            public Builder setDuration(int i7) {
                this.bitField0_ |= 64;
                this.duration_ = i7;
                onChanged();
                return this;
            }

            public Builder setPlayerName(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.playerName_ = str;
                onChanged();
                return this;
            }

            public Builder setPlayerNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.playerName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSongArtist(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.songArtist_ = str;
                onChanged();
                return this;
            }

            public Builder setSongArtistBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.songArtist_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSongTitle(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.songTitle_ = str;
                onChanged();
                return this;
            }

            public Builder setSongTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.songTitle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setState(State state) {
                state.getClass();
                this.bitField0_ |= 1;
                this.state_ = state.getNumber();
                onChanged();
                return this;
            }

            public Builder setVolume(int i7) {
                this.bitField0_ |= 2;
                this.volume_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 0;
                this.playerName_ = "";
                this.songTitle_ = "";
                this.songArtist_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PlayerInfo build() {
                PlayerInfo playerInfoBuildPartial = buildPartial();
                if (playerInfoBuildPartial.isInitialized()) {
                    return playerInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) playerInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PlayerInfo buildPartial() {
                PlayerInfo playerInfo = new PlayerInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                playerInfo.state_ = this.state_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                playerInfo.volume_ = this.volume_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                playerInfo.playerName_ = this.playerName_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                playerInfo.songTitle_ = this.songTitle_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                playerInfo.songArtist_ = this.songArtist_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                playerInfo.currentPosition_ = this.currentPosition_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                playerInfo.duration_ = this.duration_;
                playerInfo.bitField0_ = i8;
                onBuilt();
                return playerInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PlayerInfo getDefaultInstanceForType() {
                return PlayerInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i7, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i7, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.state_ = 0;
                int i7 = this.bitField0_;
                this.volume_ = 0;
                this.playerName_ = "";
                this.songTitle_ = "";
                this.songArtist_ = "";
                this.currentPosition_ = 0;
                this.duration_ = 0;
                this.bitField0_ = i7 & (-128);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo7408clone() {
                return (Builder) super.mo7408clone();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.zh.wear.protobuf.MediaProtos.PlayerInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.MediaProtos$PlayerInfo> r1 = com.zh.wear.protobuf.MediaProtos.PlayerInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.MediaProtos$PlayerInfo r3 = (com.zh.wear.protobuf.MediaProtos.PlayerInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.zh.wear.protobuf.MediaProtos$PlayerInfo r4 = (com.zh.wear.protobuf.MediaProtos.PlayerInfo) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.mergeFrom(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MediaProtos.PlayerInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MediaProtos$PlayerInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PlayerInfo) {
                    return mergeFrom((PlayerInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PlayerInfo playerInfo) {
                if (playerInfo == PlayerInfo.getDefaultInstance()) {
                    return this;
                }
                if (playerInfo.hasState()) {
                    setState(playerInfo.getState());
                }
                if (playerInfo.hasVolume()) {
                    setVolume(playerInfo.getVolume());
                }
                if (playerInfo.hasPlayerName()) {
                    this.bitField0_ |= 4;
                    this.playerName_ = playerInfo.playerName_;
                    onChanged();
                }
                if (playerInfo.hasSongTitle()) {
                    this.bitField0_ |= 8;
                    this.songTitle_ = playerInfo.songTitle_;
                    onChanged();
                }
                if (playerInfo.hasSongArtist()) {
                    this.bitField0_ |= 16;
                    this.songArtist_ = playerInfo.songArtist_;
                    onChanged();
                }
                if (playerInfo.hasCurrentPosition()) {
                    setCurrentPosition(playerInfo.getCurrentPosition());
                }
                if (playerInfo.hasDuration()) {
                    setDuration(playerInfo.getDuration());
                }
                mergeUnknownFields(((GeneratedMessage) playerInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum State implements ProtocolMessageEnum {
            NONE(0),
            PLAYING(1),
            PAUSE(2),
            STOP(3);

            public static final int NONE_VALUE = 0;
            public static final int PAUSE_VALUE = 2;
            public static final int PLAYING_VALUE = 1;
            public static final int STOP_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: com.zh.wear.protobuf.MediaProtos.PlayerInfo.State.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i7) {
                    return State.forNumber(i7);
                }
            };
            private static final State[] VALUES = values();

            State(int i7) {
                this.value = i7;
            }

            public static State forNumber(int i7) {
                if (i7 == 0) {
                    return NONE;
                }
                if (i7 == 1) {
                    return PLAYING;
                }
                if (i7 == 2) {
                    return PAUSE;
                }
                if (i7 != 3) {
                    return null;
                }
                return STOP;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PlayerInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static State valueOf(int i7) {
                return forNumber(i7);
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
                return getDescriptor().getValues().get(ordinal());
            }

            public static State valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private PlayerInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
            this.volume_ = 0;
            this.playerName_ = "";
            this.songTitle_ = "";
            this.songArtist_ = "";
            this.currentPosition_ = 0;
            this.duration_ = 0;
        }

        public static PlayerInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MediaProtos.internal_static_PlayerInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PlayerInfo parseDelimitedFrom(InputStream inputStream) {
            return (PlayerInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PlayerInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<PlayerInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerInfo)) {
                return super.equals(obj);
            }
            PlayerInfo playerInfo = (PlayerInfo) obj;
            boolean z6 = hasState() == playerInfo.hasState();
            if (hasState()) {
                z6 = z6 && this.state_ == playerInfo.state_;
            }
            boolean z7 = z6 && hasVolume() == playerInfo.hasVolume();
            if (hasVolume()) {
                z7 = z7 && getVolume() == playerInfo.getVolume();
            }
            boolean z8 = z7 && hasPlayerName() == playerInfo.hasPlayerName();
            if (hasPlayerName()) {
                z8 = z8 && getPlayerName().equals(playerInfo.getPlayerName());
            }
            boolean z9 = z8 && hasSongTitle() == playerInfo.hasSongTitle();
            if (hasSongTitle()) {
                z9 = z9 && getSongTitle().equals(playerInfo.getSongTitle());
            }
            boolean z10 = z9 && hasSongArtist() == playerInfo.hasSongArtist();
            if (hasSongArtist()) {
                z10 = z10 && getSongArtist().equals(playerInfo.getSongArtist());
            }
            boolean z11 = z10 && hasCurrentPosition() == playerInfo.hasCurrentPosition();
            if (hasCurrentPosition()) {
                z11 = z11 && getCurrentPosition() == playerInfo.getCurrentPosition();
            }
            boolean z12 = z11 && hasDuration() == playerInfo.hasDuration();
            if (hasDuration()) {
                z12 = z12 && getDuration() == playerInfo.getDuration();
            }
            return z12 && this.unknownFields.equals(playerInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public int getCurrentPosition() {
            return this.currentPosition_;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PlayerInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
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
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.volume_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.playerName_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(4, this.songTitle_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(5, this.songArtist_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.currentPosition_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(7, this.duration_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public ByteString getSongArtistBytes() {
            Object obj = this.songArtist_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.songArtist_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public ByteString getSongTitleBytes() {
            Object obj = this.songTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.songTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public State getState() {
            State stateValueOf = State.valueOf(this.state_);
            return stateValueOf == null ? State.NONE : stateValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public int getVolume() {
            return this.volume_;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public boolean hasCurrentPosition() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public boolean hasDuration() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public boolean hasPlayerName() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public boolean hasSongArtist() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public boolean hasSongTitle() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.MediaProtos.PlayerInfoOrBuilder
        public boolean hasVolume() {
            return (this.bitField0_ & 2) == 2;
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
            if (hasVolume()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getVolume();
            }
            if (hasPlayerName()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPlayerName().hashCode();
            }
            if (hasSongTitle()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSongTitle().hashCode();
            }
            if (hasSongArtist()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSongArtist().hashCode();
            }
            if (hasCurrentPosition()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getCurrentPosition();
            }
            if (hasDuration()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getDuration();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MediaProtos.internal_static_PlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerInfo.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
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
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.volume_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.playerName_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.songTitle_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.songArtist_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeUInt32(6, this.currentPosition_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeUInt32(7, this.duration_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private PlayerInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i7 = codedInputStream.readEnum();
                                if (State.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.state_ = i7;
                                }
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.volume_ = codedInputStream.readUInt32();
                            } else if (tag == 26) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.playerName_ = bytes;
                            } else if (tag == 34) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.songTitle_ = bytes2;
                            } else if (tag == 42) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.songArtist_ = bytes3;
                            } else if (tag == 48) {
                                this.bitField0_ |= 32;
                                this.currentPosition_ = codedInputStream.readUInt32();
                            } else if (tag == 56) {
                                this.bitField0_ |= 64;
                                this.duration_ = codedInputStream.readUInt32();
                            } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(this);
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(PlayerInfo playerInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(playerInfo);
        }

        public static PlayerInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayerInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlayerInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PlayerInfo parseFrom(CodedInputStream codedInputStream) {
            return (PlayerInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PlayerInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private PlayerInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PlayerInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayerInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PlayerInfo parseFrom(InputStream inputStream) {
            return (PlayerInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static PlayerInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayerInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlayerInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static PlayerInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PlayerInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PlayerInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface PlayerInfoOrBuilder extends MessageOrBuilder {
        int getCurrentPosition();

        int getDuration();

        String getPlayerName();

        ByteString getPlayerNameBytes();

        String getSongArtist();

        ByteString getSongArtistBytes();

        String getSongTitle();

        ByteString getSongTitleBytes();

        PlayerInfo.State getState();

        int getVolume();

        boolean hasCurrentPosition();

        boolean hasDuration();

        boolean hasPlayerName();

        boolean hasSongArtist();

        boolean hasSongTitle();

        boolean hasState();

        boolean hasVolume();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010wear_media.proto\u001a\fnanopb.proto\"§\u0001\n\u0005Media\u0012\"\n\u000bplayer_info\u0018\u0001 \u0001(\u000b2\u000b.PlayerInfoH\u0000\u0012(\n\u000eplayer_control\u0018\u0002 \u0001(\u000b2\u000e.PlayerControlH\u0000\"E\n\u0007MediaID\u0012\u0010\n\fWEAR_REQUEST\u0010\u0000\u0012\u0014\n\u0010SYNC_PLAYER_INFO\u0010\u0001\u0012\u0012\n\u000eCONTROL_PLAYER\u0010\u0002B\t\n\u0007payload\"\u0087\u0002\n\nPlayerInfo\u0012 \n\u0005state\u0018\u0001 \u0002(\u000e2\u0011.PlayerInfo.State\u0012\u0015\n\u0006volume\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001a\n\u000bplayer_name\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nsong_title\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bsong_artist\u0018\u0005 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010current_position\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0017\n\bduration\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028\u0010\"3\n\u0005State\u0012\b\n\u0004NONE\u0010\u0000\u0012\u000b\n\u0007PLAYING\u0010\u0001\u0012\t\n\u0005PAUSE\u0010\u0002\u0012\b\n\u0004STOP\u0010\u0003\" \u0001\n\rPlayerControl\u0012'\n\u0007command\u0018\u0001 \u0002(\u000e2\u0016.PlayerControl.Command\u0012\u0015\n\u0006volume\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\"O\n\u0007Command\u0012\b\n\u0004PLAY\u0010\u0000\u0012\t\n\u0005PAUSE\u0010\u0001\u0012\b\n\u0004STOP\u0010\u0002\u0012\b\n\u0004PREV\u0010\u0003\u0012\b\n\u0004NEXT\u0010\u0004\u0012\u0011\n\rADJUST_VOLUME\u0010\u0005B#\n\u0014com.zh.wear.protobufB\u000bMediaProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.MediaProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = MediaProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Media_descriptor = descriptor2;
        internal_static_Media_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"PlayerInfo", "PlayerControl", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_PlayerInfo_descriptor = descriptor3;
        internal_static_PlayerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"State", "Volume", "PlayerName", "SongTitle", "SongArtist", "CurrentPosition", "Duration"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_PlayerControl_descriptor = descriptor4;
        internal_static_PlayerControl_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Command", "Volume"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private MediaProtos() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}