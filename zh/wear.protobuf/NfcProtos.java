package com.zh.wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class NfcProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_BalanceInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BalanceInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CardData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CardData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CardInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CardInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CardInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CardInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CommandInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CommandInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CommandInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CommandInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_IssueCard_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_IssueCard_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Nfc_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Nfc_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.NfcProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase;

        static {
            int[] iArr = new int[Nfc.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase = iArr;
            try {
                iArr[Nfc.PayloadCase.COMMAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.ISSUE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.CARD_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.CARD_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.CARD_INFO_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.AID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.BALANCE_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.CONFIG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.COMMAND_INFO_LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.CAPABILITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[Nfc.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static final class BalanceInfo extends GeneratedMessageV3 implements BalanceInfoOrBuilder {
        public static final int AID_FIELD_NUMBER = 1;
        public static final int BALANCE_FIELD_NUMBER = 2;
        private static final BalanceInfo DEFAULT_INSTANCE = new BalanceInfo();

        @Deprecated
        public static final Parser<BalanceInfo> PARSER = new AbstractParser<BalanceInfo>() { // from class: com.zh.wear.protobuf.NfcProtos.BalanceInfo.1
            @Override // com.google.protobuf.Parser
            public BalanceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BalanceInfo(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object aid_;
        private int balance_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BalanceInfoOrBuilder {
            private Object aid_;
            private int balance_;
            private int bitField0_;

            private Builder() {
                this.aid_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_BalanceInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAid() {
                this.bitField0_ &= -2;
                this.aid_ = BalanceInfo.getDefaultInstance().getAid();
                onChanged();
                return this;
            }

            public Builder clearBalance() {
                this.bitField0_ &= -3;
                this.balance_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
            public String getAid() {
                Object obj = this.aid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.aid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
            public ByteString getAidBytes() {
                Object obj = this.aid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.aid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
            public int getBalance() {
                return this.balance_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NfcProtos.internal_static_BalanceInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
            public boolean hasAid() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
            public boolean hasBalance() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_BalanceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BalanceInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAid() && hasBalance();
            }

            public Builder setAid(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.aid_ = str;
                onChanged();
                return this;
            }

            public Builder setAidBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.aid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBalance(int i7) {
                this.bitField0_ |= 2;
                this.balance_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.aid_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BalanceInfo build() {
                BalanceInfo balanceInfoBuildPartial = buildPartial();
                if (balanceInfoBuildPartial.isInitialized()) {
                    return balanceInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) balanceInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BalanceInfo buildPartial() {
                BalanceInfo balanceInfo = new BalanceInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                balanceInfo.aid_ = this.aid_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                balanceInfo.balance_ = this.balance_;
                balanceInfo.bitField0_ = i8;
                onBuilt();
                return balanceInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BalanceInfo getDefaultInstanceForType() {
                return BalanceInfo.getDefaultInstance();
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
                this.aid_ = "";
                int i7 = this.bitField0_;
                this.balance_ = 0;
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
            public com.zh.wear.protobuf.NfcProtos.BalanceInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$BalanceInfo> r1 = com.zh.wear.protobuf.NfcProtos.BalanceInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NfcProtos$BalanceInfo r3 = (com.zh.wear.protobuf.NfcProtos.BalanceInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NfcProtos$BalanceInfo r4 = (com.zh.wear.protobuf.NfcProtos.BalanceInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.BalanceInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$BalanceInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BalanceInfo) {
                    return mergeFrom((BalanceInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BalanceInfo balanceInfo) {
                if (balanceInfo == BalanceInfo.getDefaultInstance()) {
                    return this;
                }
                if (balanceInfo.hasAid()) {
                    this.bitField0_ |= 1;
                    this.aid_ = balanceInfo.aid_;
                    onChanged();
                }
                if (balanceInfo.hasBalance()) {
                    setBalance(balanceInfo.getBalance());
                }
                mergeUnknownFields(((GeneratedMessage) balanceInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        private BalanceInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.aid_ = "";
            this.balance_ = 0;
        }

        public static BalanceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NfcProtos.internal_static_BalanceInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BalanceInfo parseDelimitedFrom(InputStream inputStream) {
            return (BalanceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BalanceInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BalanceInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BalanceInfo)) {
                return super.equals(obj);
            }
            BalanceInfo balanceInfo = (BalanceInfo) obj;
            boolean z6 = hasAid() == balanceInfo.hasAid();
            if (hasAid()) {
                z6 = z6 && getAid().equals(balanceInfo.getAid());
            }
            boolean z7 = z6 && hasBalance() == balanceInfo.hasBalance();
            if (hasBalance()) {
                z7 = z7 && getBalance() == balanceInfo.getBalance();
            }
            return z7 && this.unknownFields.equals(balanceInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
        public String getAid() {
            Object obj = this.aid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
        public ByteString getAidBytes() {
            Object obj = this.aid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
        public int getBalance() {
            return this.balance_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BalanceInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.aid_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.balance_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
        public boolean hasAid() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.BalanceInfoOrBuilder
        public boolean hasBalance() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAid()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAid().hashCode();
            }
            if (hasBalance()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBalance();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NfcProtos.internal_static_BalanceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BalanceInfo.class, Builder.class);
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
            if (!hasAid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBalance()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.aid_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.balance_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BalanceInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.aid_ = bytes;
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.balance_ = codedInputStream.readUInt32();
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

        public static Builder newBuilder(BalanceInfo balanceInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(balanceInfo);
        }

        public static BalanceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BalanceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BalanceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BalanceInfo parseFrom(CodedInputStream codedInputStream) {
            return (BalanceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BalanceInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BalanceInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BalanceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BalanceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BalanceInfo parseFrom(InputStream inputStream) {
            return (BalanceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BalanceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BalanceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BalanceInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BalanceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BalanceInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BalanceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BalanceInfoOrBuilder extends MessageOrBuilder {
        String getAid();

        ByteString getAidBytes();

        int getBalance();

        boolean hasAid();

        boolean hasBalance();
    }

    public static final class CardData extends GeneratedMessageV3 implements CardDataOrBuilder {
        public static final int ATQA_FIELD_NUMBER = 3;
        public static final int CONTENT_FIELD_NUMBER = 5;
        private static final CardData DEFAULT_INSTANCE = new CardData();

        @Deprecated
        public static final Parser<CardData> PARSER = new AbstractParser<CardData>() { // from class: com.zh.wear.protobuf.NfcProtos.CardData.1
            @Override // com.google.protobuf.Parser
            public CardData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new CardData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SAK_FIELD_NUMBER = 2;
        public static final int SIZE_FIELD_NUMBER = 4;
        public static final int UID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private ByteString atqa_;
        private int bitField0_;
        private volatile Object content_;
        private byte memoizedIsInitialized;
        private int sak_;
        private int size_;
        private ByteString uid_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardDataOrBuilder {
            private ByteString atqa_;
            private int bitField0_;
            private Object content_;
            private int sak_;
            private int size_;
            private ByteString uid_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.uid_ = byteString;
                this.atqa_ = byteString;
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_CardData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAtqa() {
                this.bitField0_ &= -5;
                this.atqa_ = CardData.getDefaultInstance().getAtqa();
                onChanged();
                return this;
            }

            public Builder clearContent() {
                this.bitField0_ &= -17;
                this.content_ = CardData.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder clearSak() {
                this.bitField0_ &= -3;
                this.sak_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSize() {
                this.bitField0_ &= -9;
                this.size_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = CardData.getDefaultInstance().getUid();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public ByteString getAtqa() {
                return this.atqa_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NfcProtos.internal_static_CardData_descriptor;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public int getSak() {
                return this.sak_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public ByteString getUid() {
                return this.uid_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public boolean hasAtqa() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public boolean hasContent() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public boolean hasSak() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
            public boolean hasUid() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_CardData_fieldAccessorTable.ensureFieldAccessorsInitialized(CardData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUid() && hasSak() && hasAtqa() && hasSize() && hasContent();
            }

            public Builder setAtqa(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.atqa_ = byteString;
                onChanged();
                return this;
            }

            public Builder setContent(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.content_ = str;
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.content_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSak(int i7) {
                this.bitField0_ |= 2;
                this.sak_ = i7;
                onChanged();
                return this;
            }

            public Builder setSize(int i7) {
                this.bitField0_ |= 8;
                this.size_ = i7;
                onChanged();
                return this;
            }

            public Builder setUid(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.uid_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.uid_ = byteString;
                this.atqa_ = byteString;
                this.content_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardData build() {
                CardData cardDataBuildPartial = buildPartial();
                if (cardDataBuildPartial.isInitialized()) {
                    return cardDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cardDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardData buildPartial() {
                CardData cardData = new CardData(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                cardData.uid_ = this.uid_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                cardData.sak_ = this.sak_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                cardData.atqa_ = this.atqa_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                cardData.size_ = this.size_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                cardData.content_ = this.content_;
                cardData.bitField0_ = i8;
                onBuilt();
                return cardData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CardData getDefaultInstanceForType() {
                return CardData.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.uid_ = byteString;
                int i7 = this.bitField0_;
                this.sak_ = 0;
                this.atqa_ = byteString;
                this.size_ = 0;
                this.content_ = "";
                this.bitField0_ = i7 & (-32);
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
            public com.zh.wear.protobuf.NfcProtos.CardData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$CardData> r1 = com.zh.wear.protobuf.NfcProtos.CardData.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NfcProtos$CardData r3 = (com.zh.wear.protobuf.NfcProtos.CardData) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NfcProtos$CardData r4 = (com.zh.wear.protobuf.NfcProtos.CardData) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.CardData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$CardData$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CardData) {
                    return mergeFrom((CardData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CardData cardData) {
                if (cardData == CardData.getDefaultInstance()) {
                    return this;
                }
                if (cardData.hasUid()) {
                    setUid(cardData.getUid());
                }
                if (cardData.hasSak()) {
                    setSak(cardData.getSak());
                }
                if (cardData.hasAtqa()) {
                    setAtqa(cardData.getAtqa());
                }
                if (cardData.hasSize()) {
                    setSize(cardData.getSize());
                }
                if (cardData.hasContent()) {
                    this.bitField0_ |= 16;
                    this.content_ = cardData.content_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) cardData).unknownFields);
                onChanged();
                return this;
            }
        }

        private CardData() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.uid_ = byteString;
            this.sak_ = 0;
            this.atqa_ = byteString;
            this.size_ = 0;
            this.content_ = "";
        }

        public static CardData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NfcProtos.internal_static_CardData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CardData parseDelimitedFrom(InputStream inputStream) {
            return (CardData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CardData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<CardData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardData)) {
                return super.equals(obj);
            }
            CardData cardData = (CardData) obj;
            boolean z6 = hasUid() == cardData.hasUid();
            if (hasUid()) {
                z6 = z6 && getUid().equals(cardData.getUid());
            }
            boolean z7 = z6 && hasSak() == cardData.hasSak();
            if (hasSak()) {
                z7 = z7 && getSak() == cardData.getSak();
            }
            boolean z8 = z7 && hasAtqa() == cardData.hasAtqa();
            if (hasAtqa()) {
                z8 = z8 && getAtqa().equals(cardData.getAtqa());
            }
            boolean z9 = z8 && hasSize() == cardData.hasSize();
            if (hasSize()) {
                z9 = z9 && getSize() == cardData.getSize();
            }
            boolean z10 = z9 && hasContent() == cardData.hasContent();
            if (hasContent()) {
                z10 = z10 && getContent().equals(cardData.getContent());
            }
            return z10 && this.unknownFields.equals(cardData.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public ByteString getAtqa() {
            return this.atqa_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.content_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CardData> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public int getSak() {
            return this.sak_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.uid_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(2, this.sak_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(3, this.atqa_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(4, this.size_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeBytesSize += GeneratedMessage.computeStringSize(5, this.content_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public ByteString getUid() {
            return this.uid_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public boolean hasAtqa() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public boolean hasContent() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public boolean hasSak() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public boolean hasSize() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardDataOrBuilder
        public boolean hasUid() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasUid()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUid().hashCode();
            }
            if (hasSak()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSak();
            }
            if (hasAtqa()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAtqa().hashCode();
            }
            if (hasSize()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSize();
            }
            if (hasContent()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getContent().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NfcProtos.internal_static_CardData_fieldAccessorTable.ensureFieldAccessorsInitialized(CardData.class, Builder.class);
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
            if (!hasUid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSak()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAtqa()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContent()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.uid_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.sak_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.atqa_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeUInt32(4, this.size_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.content_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private CardData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bitField0_ |= 1;
                                this.uid_ = codedInputStream.readBytes();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.sak_ = codedInputStream.readUInt32();
                            } else if (tag == 26) {
                                this.bitField0_ |= 4;
                                this.atqa_ = codedInputStream.readBytes();
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.size_ = codedInputStream.readUInt32();
                            } else if (tag == 42) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.content_ = bytes;
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

        public static Builder newBuilder(CardData cardData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cardData);
        }

        public static CardData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CardData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CardData parseFrom(CodedInputStream codedInputStream) {
            return (CardData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CardData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private CardData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CardData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CardData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CardData parseFrom(InputStream inputStream) {
            return (CardData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CardData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CardData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CardData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CardData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CardData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface CardDataOrBuilder extends MessageOrBuilder {
        ByteString getAtqa();

        String getContent();

        ByteString getContentBytes();

        int getSak();

        int getSize();

        ByteString getUid();

        boolean hasAtqa();

        boolean hasContent();

        boolean hasSak();

        boolean hasSize();

        boolean hasUid();
    }

    public static final class CardInfo extends GeneratedMessageV3 implements CardInfoOrBuilder {
        public static final int AID_FIELD_NUMBER = 2;
        public static final int BALANCE_COMMAND_FIELD_NUMBER = 12;
        public static final int BALANCE_FIELD_NUMBER = 6;
        public static final int BALANCE_OFFSET_FIELD_NUMBER = 10;
        public static final int ICON_URL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 3;
        public static final int SID_FIELD_NUMBER = 5;
        public static final int SUPPORT_HCI_FIELD_NUMBER = 7;
        public static final int TRADE_LENGTH_FIELD_NUMBER = 8;
        public static final int TRADE_OFFSET_FIELD_NUMBER = 9;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object aid_;
        private LazyStringList balanceCommand_;
        private int balanceOffset_;
        private int balance_;
        private int bitField0_;
        private volatile Object iconUrl_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object sid_;
        private boolean supportHci_;
        private int tradeLength_;
        private int tradeOffset_;
        private int type_;
        private static final CardInfo DEFAULT_INSTANCE = new CardInfo();

        @Deprecated
        public static final Parser<CardInfo> PARSER = new AbstractParser<CardInfo>() { // from class: com.zh.wear.protobuf.NfcProtos.CardInfo.1
            @Override // com.google.protobuf.Parser
            public CardInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new CardInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardInfoOrBuilder {
            private Object aid_;
            private LazyStringList balanceCommand_;
            private int balanceOffset_;
            private int balance_;
            private int bitField0_;
            private Object iconUrl_;
            private Object name_;
            private Object sid_;
            private boolean supportHci_;
            private int tradeLength_;
            private int tradeOffset_;
            private int type_;

            private Builder() {
                this.type_ = 0;
                this.aid_ = "";
                this.name_ = "";
                this.iconUrl_ = "";
                this.sid_ = "";
                this.balanceCommand_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void ensureBalanceCommandIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.balanceCommand_ = new LazyStringArrayList(this.balanceCommand_);
                    this.bitField0_ |= 1024;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_CardInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllBalanceCommand(Iterable<String> iterable) {
                ensureBalanceCommandIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.balanceCommand_);
                onChanged();
                return this;
            }

            public Builder addBalanceCommand(String str) {
                str.getClass();
                ensureBalanceCommandIsMutable();
                this.balanceCommand_.add(str);
                onChanged();
                return this;
            }

            public Builder addBalanceCommandBytes(ByteString byteString) {
                byteString.getClass();
                ensureBalanceCommandIsMutable();
                this.balanceCommand_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearAid() {
                this.bitField0_ &= -3;
                this.aid_ = CardInfo.getDefaultInstance().getAid();
                onChanged();
                return this;
            }

            public Builder clearBalance() {
                this.bitField0_ &= -33;
                this.balance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBalanceCommand() {
                this.balanceCommand_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder clearBalanceOffset() {
                this.bitField0_ &= -513;
                this.balanceOffset_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIconUrl() {
                this.bitField0_ &= -9;
                this.iconUrl_ = CardInfo.getDefaultInstance().getIconUrl();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= -5;
                this.name_ = CardInfo.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearSid() {
                this.bitField0_ &= -17;
                this.sid_ = CardInfo.getDefaultInstance().getSid();
                onChanged();
                return this;
            }

            public Builder clearSupportHci() {
                this.bitField0_ &= -65;
                this.supportHci_ = false;
                onChanged();
                return this;
            }

            public Builder clearTradeLength() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.tradeLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTradeOffset() {
                this.bitField0_ &= -257;
                this.tradeOffset_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public String getAid() {
                Object obj = this.aid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.aid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public ByteString getAidBytes() {
                Object obj = this.aid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.aid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public int getBalance() {
                return this.balance_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public String getBalanceCommand(int i7) {
                return this.balanceCommand_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public ByteString getBalanceCommandBytes(int i7) {
                return this.balanceCommand_.getByteString(i7);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public int getBalanceCommandCount() {
                return this.balanceCommand_.size();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public ProtocolStringList getBalanceCommandList() {
                return this.balanceCommand_.getUnmodifiableView();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public int getBalanceOffset() {
                return this.balanceOffset_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NfcProtos.internal_static_CardInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public String getIconUrl() {
                Object obj = this.iconUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.iconUrl_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public ByteString getIconUrlBytes() {
                Object obj = this.iconUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.iconUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public String getSid() {
                Object obj = this.sid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public ByteString getSidBytes() {
                Object obj = this.sid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean getSupportHci() {
                return this.supportHci_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public int getTradeLength() {
                return this.tradeLength_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public int getTradeOffset() {
                return this.tradeOffset_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public IssueCardType getType() {
                IssueCardType issueCardTypeValueOf = IssueCardType.valueOf(this.type_);
                return issueCardTypeValueOf == null ? IssueCardType.DOOR_CARD : issueCardTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasAid() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasBalance() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasBalanceOffset() {
                return (this.bitField0_ & 512) == 512;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasIconUrl() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasSid() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasSupportHci() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasTradeLength() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasTradeOffset() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_CardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CardInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasType() && hasAid() && hasName();
            }

            public Builder setAid(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.aid_ = str;
                onChanged();
                return this;
            }

            public Builder setAidBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.aid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBalance(int i7) {
                this.bitField0_ |= 32;
                this.balance_ = i7;
                onChanged();
                return this;
            }

            public Builder setBalanceCommand(int i7, String str) {
                str.getClass();
                ensureBalanceCommandIsMutable();
                this.balanceCommand_.set(i7, str);
                onChanged();
                return this;
            }

            public Builder setBalanceOffset(int i7) {
                this.bitField0_ |= 512;
                this.balanceOffset_ = i7;
                onChanged();
                return this;
            }

            public Builder setIconUrl(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.iconUrl_ = str;
                onChanged();
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.iconUrl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSid(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.sid_ = str;
                onChanged();
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.sid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSupportHci(boolean z6) {
                this.bitField0_ |= 64;
                this.supportHci_ = z6;
                onChanged();
                return this;
            }

            public Builder setTradeLength(int i7) {
                this.bitField0_ |= 128;
                this.tradeLength_ = i7;
                onChanged();
                return this;
            }

            public Builder setTradeOffset(int i7) {
                this.bitField0_ |= 256;
                this.tradeOffset_ = i7;
                onChanged();
                return this;
            }

            public Builder setType(IssueCardType issueCardType) {
                issueCardType.getClass();
                this.bitField0_ |= 1;
                this.type_ = issueCardType.getNumber();
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.aid_ = "";
                this.name_ = "";
                this.iconUrl_ = "";
                this.sid_ = "";
                this.balanceCommand_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardInfo build() {
                CardInfo cardInfoBuildPartial = buildPartial();
                if (cardInfoBuildPartial.isInitialized()) {
                    return cardInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cardInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardInfo buildPartial() {
                CardInfo cardInfo = new CardInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                cardInfo.type_ = this.type_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                cardInfo.aid_ = this.aid_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                cardInfo.name_ = this.name_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                cardInfo.iconUrl_ = this.iconUrl_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                cardInfo.sid_ = this.sid_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                cardInfo.balance_ = this.balance_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                cardInfo.supportHci_ = this.supportHci_;
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                cardInfo.tradeLength_ = this.tradeLength_;
                if ((i7 & 256) == 256) {
                    i8 |= 256;
                }
                cardInfo.tradeOffset_ = this.tradeOffset_;
                if ((i7 & 512) == 512) {
                    i8 |= 512;
                }
                cardInfo.balanceOffset_ = this.balanceOffset_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.balanceCommand_ = this.balanceCommand_.getUnmodifiableView();
                    this.bitField0_ &= -1025;
                }
                cardInfo.balanceCommand_ = this.balanceCommand_;
                cardInfo.bitField0_ = i8;
                onBuilt();
                return cardInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CardInfo getDefaultInstanceForType() {
                return CardInfo.getDefaultInstance();
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
                this.type_ = 0;
                int i7 = this.bitField0_;
                this.aid_ = "";
                this.name_ = "";
                this.iconUrl_ = "";
                this.sid_ = "";
                this.balance_ = 0;
                this.supportHci_ = false;
                this.tradeLength_ = 0;
                this.tradeOffset_ = 0;
                this.balanceOffset_ = 0;
                this.bitField0_ = i7 & (-1024);
                this.balanceCommand_ = LazyStringArrayList.EMPTY;
                this.bitField0_ = i7 & (-2048);
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
            public com.zh.wear.protobuf.NfcProtos.CardInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$CardInfo> r1 = com.zh.wear.protobuf.NfcProtos.CardInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NfcProtos$CardInfo r3 = (com.zh.wear.protobuf.NfcProtos.CardInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NfcProtos$CardInfo r4 = (com.zh.wear.protobuf.NfcProtos.CardInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.CardInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$CardInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CardInfo) {
                    return mergeFrom((CardInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CardInfo cardInfo) {
                if (cardInfo == CardInfo.getDefaultInstance()) {
                    return this;
                }
                if (cardInfo.hasType()) {
                    setType(cardInfo.getType());
                }
                if (cardInfo.hasAid()) {
                    this.bitField0_ |= 2;
                    this.aid_ = cardInfo.aid_;
                    onChanged();
                }
                if (cardInfo.hasName()) {
                    this.bitField0_ |= 4;
                    this.name_ = cardInfo.name_;
                    onChanged();
                }
                if (cardInfo.hasIconUrl()) {
                    this.bitField0_ |= 8;
                    this.iconUrl_ = cardInfo.iconUrl_;
                    onChanged();
                }
                if (cardInfo.hasSid()) {
                    this.bitField0_ |= 16;
                    this.sid_ = cardInfo.sid_;
                    onChanged();
                }
                if (cardInfo.hasBalance()) {
                    setBalance(cardInfo.getBalance());
                }
                if (cardInfo.hasSupportHci()) {
                    setSupportHci(cardInfo.getSupportHci());
                }
                if (cardInfo.hasTradeLength()) {
                    setTradeLength(cardInfo.getTradeLength());
                }
                if (cardInfo.hasTradeOffset()) {
                    setTradeOffset(cardInfo.getTradeOffset());
                }
                if (cardInfo.hasBalanceOffset()) {
                    setBalanceOffset(cardInfo.getBalanceOffset());
                }
                if (!cardInfo.balanceCommand_.isEmpty()) {
                    if (this.balanceCommand_.isEmpty()) {
                        this.balanceCommand_ = cardInfo.balanceCommand_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureBalanceCommandIsMutable();
                        this.balanceCommand_.addAll(cardInfo.balanceCommand_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) cardInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int FULL_FIELD_NUMBER = 2;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private boolean full_;
            private java.util.List<CardInfo> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.NfcProtos.CardInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private boolean full_;
                private RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> listBuilder_;
                private java.util.List<CardInfo> list_;

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) != 1) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NfcProtos.internal_static_CardInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> getListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilderV3<>(this.list_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getListFieldBuilder();
                    }
                }

                public Builder addAllList(Iterable<? extends CardInfo> iterable) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, builder.build());
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.add(i7, builder.build());
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) getListFieldBuilder().addBuilder(CardInfo.getDefaultInstance());
                }

                public Builder clearFull() {
                    this.bitField0_ &= -3;
                    this.full_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return NfcProtos.internal_static_CardInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
                public boolean getFull() {
                    return this.full_;
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
                public CardInfo getList(int i7) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (CardInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
                public java.util.List<CardInfo> getListList() {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
                public CardInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (CardInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
                public java.util.List<? extends CardInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
                public boolean hasFull() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NfcProtos.internal_static_CardInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i7 = 0; i7 < getListCount(); i7++) {
                        if (!getList(i7).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setFull(boolean z6) {
                    this.bitField0_ |= 2;
                    this.full_ = z6;
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, builder.build());
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.set(i7, builder.build());
                    onChanged();
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addList(int i7, CardInfo cardInfo) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, cardInfo);
                        return this;
                    }
                    cardInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, cardInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, CardInfo.getDefaultInstance());
                }

                public Builder setList(int i7, CardInfo cardInfo) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, cardInfo);
                        return this;
                    }
                    cardInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, cardInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.add(builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public List build() {
                    List listBuildPartial = buildPartial();
                    if (listBuildPartial.isInitialized()) {
                        return listBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) listBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public List buildPartial() {
                    java.util.List listBuild;
                    List list = new List(this);
                    int i7 = this.bitField0_;
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((i7 & 1) == 1) {
                            this.list_ = Collections.unmodifiableList(this.list_);
                            this.bitField0_ &= -2;
                        }
                        listBuild = this.list_;
                    } else {
                        listBuild = repeatedFieldBuilderV3.build();
                    }
                    list.list_ = listBuild;
                    int i8 = (i7 & 2) != 2 ? 0 : 1;
                    list.full_ = this.full_;
                    list.bitField0_ = i8;
                    onBuilt();
                    return list;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public List getDefaultInstanceForType() {
                    return List.getDefaultInstance();
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

                public Builder addList(CardInfo cardInfo) {
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(cardInfo);
                        return this;
                    }
                    cardInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(cardInfo);
                    onChanged();
                    return this;
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
                    RepeatedFieldBuilderV3<CardInfo, Builder, CardInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.list_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    this.full_ = false;
                    this.bitField0_ &= -3;
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
                public com.zh.wear.protobuf.NfcProtos.CardInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$CardInfo$List> r1 = com.zh.wear.protobuf.NfcProtos.CardInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.NfcProtos$CardInfo$List r3 = (com.zh.wear.protobuf.NfcProtos.CardInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.NfcProtos$CardInfo$List r4 = (com.zh.wear.protobuf.NfcProtos.CardInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.CardInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$CardInfo$List$Builder");
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof List) {
                        return mergeFrom((List) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(List list) {
                    if (list == List.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!list.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = list.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(list.list_);
                            }
                            onChanged();
                        }
                    } else if (!list.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = list.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(list.list_);
                        }
                    }
                    if (list.hasFull()) {
                        setFull(list.getFull());
                    }
                    mergeUnknownFields(((GeneratedMessage) list).unknownFields);
                    onChanged();
                    return this;
                }
            }

            private List() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
                this.full_ = false;
            }

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_CardInfo_List_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static List parseDelimitedFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Parser<List> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof List)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                boolean z6 = getListList().equals(list.getListList()) && hasFull() == list.hasFull();
                if (hasFull()) {
                    z6 = z6 && getFull() == list.getFull();
                }
                return z6 && this.unknownFields.equals(list.unknownFields);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
            public boolean getFull() {
                return this.full_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
            public CardInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
            public java.util.List<CardInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
            public CardInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
            public java.util.List<? extends CardInfoOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<List> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeBoolSize = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeBoolSize += CodedOutputStream.computeMessageSize(1, this.list_.get(i8));
                }
                if ((this.bitField0_ & 1) == 1) {
                    iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.full_);
                }
                int serializedSize = iComputeBoolSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CardInfo.ListOrBuilder
            public boolean hasFull() {
                return (this.bitField0_ & 1) == 1;
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
                if (hasFull()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getFull());
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_CardInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeBool(2, this.full_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            private List(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z6 = false;
                boolean z7 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    if (!z7) {
                                        this.list_ = new ArrayList();
                                        z7 = true;
                                    }
                                    this.list_.add((CardInfo) codedInputStream.readMessage(CardInfo.PARSER, extensionRegistryLite));
                                } else if (tag == 16) {
                                    this.bitField0_ |= 1;
                                    this.full_ = codedInputStream.readBool();
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
                        if (z7) {
                            this.list_ = Collections.unmodifiableList(this.list_);
                        }
                        this.unknownFields = builderNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z7) {
                    this.list_ = Collections.unmodifiableList(this.list_);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Builder newBuilder(List list) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(list);
            }

            public static List parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static List parseFrom(CodedInputStream codedInputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public List getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private List(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static List parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static List parseFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static List parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static List parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static List parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static List parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }
        }

        public interface ListOrBuilder extends MessageOrBuilder {
            boolean getFull();

            CardInfo getList(int i7);

            int getListCount();

            java.util.List<CardInfo> getListList();

            CardInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends CardInfoOrBuilder> getListOrBuilderList();

            boolean hasFull();
        }

        private CardInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.aid_ = "";
            this.name_ = "";
            this.iconUrl_ = "";
            this.sid_ = "";
            this.balance_ = 0;
            this.supportHci_ = false;
            this.tradeLength_ = 0;
            this.tradeOffset_ = 0;
            this.balanceOffset_ = 0;
            this.balanceCommand_ = LazyStringArrayList.EMPTY;
        }

        public static CardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NfcProtos.internal_static_CardInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CardInfo parseDelimitedFrom(InputStream inputStream) {
            return (CardInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CardInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<CardInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardInfo)) {
                return super.equals(obj);
            }
            CardInfo cardInfo = (CardInfo) obj;
            boolean z6 = hasType() == cardInfo.hasType();
            if (hasType()) {
                z6 = z6 && this.type_ == cardInfo.type_;
            }
            boolean z7 = z6 && hasAid() == cardInfo.hasAid();
            if (hasAid()) {
                z7 = z7 && getAid().equals(cardInfo.getAid());
            }
            boolean z8 = z7 && hasName() == cardInfo.hasName();
            if (hasName()) {
                z8 = z8 && getName().equals(cardInfo.getName());
            }
            boolean z9 = z8 && hasIconUrl() == cardInfo.hasIconUrl();
            if (hasIconUrl()) {
                z9 = z9 && getIconUrl().equals(cardInfo.getIconUrl());
            }
            boolean z10 = z9 && hasSid() == cardInfo.hasSid();
            if (hasSid()) {
                z10 = z10 && getSid().equals(cardInfo.getSid());
            }
            boolean z11 = z10 && hasBalance() == cardInfo.hasBalance();
            if (hasBalance()) {
                z11 = z11 && getBalance() == cardInfo.getBalance();
            }
            boolean z12 = z11 && hasSupportHci() == cardInfo.hasSupportHci();
            if (hasSupportHci()) {
                z12 = z12 && getSupportHci() == cardInfo.getSupportHci();
            }
            boolean z13 = z12 && hasTradeLength() == cardInfo.hasTradeLength();
            if (hasTradeLength()) {
                z13 = z13 && getTradeLength() == cardInfo.getTradeLength();
            }
            boolean z14 = z13 && hasTradeOffset() == cardInfo.hasTradeOffset();
            if (hasTradeOffset()) {
                z14 = z14 && getTradeOffset() == cardInfo.getTradeOffset();
            }
            boolean z15 = z14 && hasBalanceOffset() == cardInfo.hasBalanceOffset();
            if (hasBalanceOffset()) {
                z15 = z15 && getBalanceOffset() == cardInfo.getBalanceOffset();
            }
            return (z15 && getBalanceCommandList().equals(cardInfo.getBalanceCommandList())) && this.unknownFields.equals(cardInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public String getAid() {
            Object obj = this.aid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public ByteString getAidBytes() {
            Object obj = this.aid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public int getBalance() {
            return this.balance_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public String getBalanceCommand(int i7) {
            return this.balanceCommand_.get(i7);
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public ByteString getBalanceCommandBytes(int i7) {
            return this.balanceCommand_.getByteString(i7);
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public int getBalanceCommandCount() {
            return this.balanceCommand_.size();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public ProtocolStringList getBalanceCommandList() {
            return this.balanceCommand_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public int getBalanceOffset() {
            return this.balanceOffset_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public String getIconUrl() {
            Object obj = this.iconUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.iconUrl_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public ByteString getIconUrlBytes() {
            Object obj = this.iconUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iconUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CardInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.aid_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(4, this.iconUrl_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(5, this.sid_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.balance_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(7, this.supportHci_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(8, this.tradeLength_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(9, this.tradeOffset_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(10, this.balanceOffset_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i8 = 0; i8 < this.balanceCommand_.size(); i8++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.balanceCommand_.getRaw(i8));
            }
            int size = iComputeEnumSize + iComputeStringSizeNoTag + getBalanceCommandList().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public String getSid() {
            Object obj = this.sid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public ByteString getSidBytes() {
            Object obj = this.sid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean getSupportHci() {
            return this.supportHci_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public int getTradeLength() {
            return this.tradeLength_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public int getTradeOffset() {
            return this.tradeOffset_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public IssueCardType getType() {
            IssueCardType issueCardTypeValueOf = IssueCardType.valueOf(this.type_);
            return issueCardTypeValueOf == null ? IssueCardType.DOOR_CARD : issueCardTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasAid() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasBalance() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasBalanceOffset() {
            return (this.bitField0_ & 512) == 512;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasIconUrl() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasSid() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasSupportHci() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasTradeLength() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasTradeOffset() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CardInfoOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.type_;
            }
            if (hasAid()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAid().hashCode();
            }
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getName().hashCode();
            }
            if (hasIconUrl()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getIconUrl().hashCode();
            }
            if (hasSid()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSid().hashCode();
            }
            if (hasBalance()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getBalance();
            }
            if (hasSupportHci()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + Internal.hashBoolean(getSupportHci());
            }
            if (hasTradeLength()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getTradeLength();
            }
            if (hasTradeOffset()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getTradeOffset();
            }
            if (hasBalanceOffset()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getBalanceOffset();
            }
            if (getBalanceCommandCount() > 0) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getBalanceCommandList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NfcProtos.internal_static_CardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CardInfo.class, Builder.class);
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
            if (!hasType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasName()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.aid_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.iconUrl_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.sid_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeUInt32(6, this.balance_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeBool(7, this.supportHci_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeUInt32(8, this.tradeLength_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeUInt32(9, this.tradeOffset_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeUInt32(10, this.balanceOffset_);
            }
            for (int i7 = 0; i7 < this.balanceCommand_.size(); i7++) {
                GeneratedMessage.writeString(codedOutputStream, 12, this.balanceCommand_.getRaw(i7));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
        private CardInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            char c7 = 0;
            while (true) {
                ?? unknownField = 1024;
                if (z6) {
                    if ((c7 & 1024) == 1024) {
                        this.balanceCommand_ = this.balanceCommand_.getUnmodifiableView();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z6 = true;
                                break;
                            case 8:
                                int i7 = codedInputStream.readEnum();
                                if (IssueCardType.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.type_ = i7;
                                }
                                break;
                            case 18:
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.aid_ = bytes;
                                break;
                            case 26:
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.name_ = bytes2;
                                break;
                            case 34:
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.iconUrl_ = bytes3;
                                break;
                            case 42:
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.sid_ = bytes4;
                                break;
                            case 48:
                                this.bitField0_ |= 32;
                                this.balance_ = codedInputStream.readUInt32();
                                break;
                            case 56:
                                this.bitField0_ |= 64;
                                this.supportHci_ = codedInputStream.readBool();
                                break;
                            case 64:
                                this.bitField0_ |= 128;
                                this.tradeLength_ = codedInputStream.readUInt32();
                                break;
                            case 72:
                                this.bitField0_ |= 256;
                                this.tradeOffset_ = codedInputStream.readUInt32();
                                break;
                            case 80:
                                this.bitField0_ |= 512;
                                this.balanceOffset_ = codedInputStream.readUInt32();
                                break;
                            case 98:
                                ByteString bytes5 = codedInputStream.readBytes();
                                if ((c7 & 1024) != 1024) {
                                    this.balanceCommand_ = new LazyStringArrayList();
                                    c7 = 1024;
                                }
                                this.balanceCommand_.add(bytes5);
                                break;
                            default:
                                unknownField = parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag);
                                if (unknownField == 0) {
                                    z6 = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(this);
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c7 & 1024) == unknownField) {
                        this.balanceCommand_ = this.balanceCommand_.getUnmodifiableView();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
        }

        public static Builder newBuilder(CardInfo cardInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cardInfo);
        }

        public static CardInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CardInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CardInfo parseFrom(CodedInputStream codedInputStream) {
            return (CardInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CardInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private CardInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CardInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CardInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CardInfo parseFrom(InputStream inputStream) {
            return (CardInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CardInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CardInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CardInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CardInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CardInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface CardInfoOrBuilder extends MessageOrBuilder {
        String getAid();

        ByteString getAidBytes();

        int getBalance();

        String getBalanceCommand(int i7);

        ByteString getBalanceCommandBytes(int i7);

        int getBalanceCommandCount();

        List<String> getBalanceCommandList();

        int getBalanceOffset();

        String getIconUrl();

        ByteString getIconUrlBytes();

        String getName();

        ByteString getNameBytes();

        String getSid();

        ByteString getSidBytes();

        boolean getSupportHci();

        int getTradeLength();

        int getTradeOffset();

        IssueCardType getType();

        boolean hasAid();

        boolean hasBalance();

        boolean hasBalanceOffset();

        boolean hasIconUrl();

        boolean hasName();

        boolean hasSid();

        boolean hasSupportHci();

        boolean hasTradeLength();

        boolean hasTradeOffset();

        boolean hasType();
    }

    public static final class CommandInfo extends GeneratedMessageV3 implements CommandInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        public static final int EXPECT_STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private volatile Object expectStatus_;
        private byte memoizedIsInitialized;
        private static final CommandInfo DEFAULT_INSTANCE = new CommandInfo();

        @Deprecated
        public static final Parser<CommandInfo> PARSER = new AbstractParser<CommandInfo>() { // from class: com.zh.wear.protobuf.NfcProtos.CommandInfo.1
            @Override // com.google.protobuf.Parser
            public CommandInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new CommandInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CommandInfoOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private Object expectStatus_;

            private Builder() {
                this.data_ = ByteString.EMPTY;
                this.expectStatus_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_CommandInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = CommandInfo.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            public Builder clearExpectStatus() {
                this.bitField0_ &= -3;
                this.expectStatus_ = CommandInfo.getDefaultInstance().getExpectStatus();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NfcProtos.internal_static_CommandInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
            public String getExpectStatus() {
                Object obj = this.expectStatus_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.expectStatus_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
            public ByteString getExpectStatusBytes() {
                Object obj = this.expectStatus_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.expectStatus_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
            public boolean hasExpectStatus() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_CommandInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CommandInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasData() && hasExpectStatus();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.data_ = byteString;
                onChanged();
                return this;
            }

            public Builder setExpectStatus(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.expectStatus_ = str;
                onChanged();
                return this;
            }

            public Builder setExpectStatusBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.expectStatus_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
                this.expectStatus_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CommandInfo build() {
                CommandInfo commandInfoBuildPartial = buildPartial();
                if (commandInfoBuildPartial.isInitialized()) {
                    return commandInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CommandInfo buildPartial() {
                CommandInfo commandInfo = new CommandInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                commandInfo.data_ = this.data_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                commandInfo.expectStatus_ = this.expectStatus_;
                commandInfo.bitField0_ = i8;
                onBuilt();
                return commandInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CommandInfo getDefaultInstanceForType() {
                return CommandInfo.getDefaultInstance();
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
                this.data_ = ByteString.EMPTY;
                int i7 = this.bitField0_;
                this.expectStatus_ = "";
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
            public com.zh.wear.protobuf.NfcProtos.CommandInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$CommandInfo> r1 = com.zh.wear.protobuf.NfcProtos.CommandInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NfcProtos$CommandInfo r3 = (com.zh.wear.protobuf.NfcProtos.CommandInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NfcProtos$CommandInfo r4 = (com.zh.wear.protobuf.NfcProtos.CommandInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.CommandInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$CommandInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CommandInfo) {
                    return mergeFrom((CommandInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CommandInfo commandInfo) {
                if (commandInfo == CommandInfo.getDefaultInstance()) {
                    return this;
                }
                if (commandInfo.hasData()) {
                    setData(commandInfo.getData());
                }
                if (commandInfo.hasExpectStatus()) {
                    this.bitField0_ |= 2;
                    this.expectStatus_ = commandInfo.expectStatus_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) commandInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<CommandInfo> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.NfcProtos.CommandInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> listBuilder_;
                private java.util.List<CommandInfo> list_;

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) != 1) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NfcProtos.internal_static_CommandInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> getListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilderV3<>(this.list_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getListFieldBuilder();
                    }
                }

                public Builder addAllList(Iterable<? extends CommandInfo> iterable) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, builder.build());
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.add(i7, builder.build());
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) getListFieldBuilder().addBuilder(CommandInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return NfcProtos.internal_static_CommandInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
                public CommandInfo getList(int i7) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (CommandInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
                public java.util.List<CommandInfo> getListList() {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
                public CommandInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (CommandInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
                public java.util.List<? extends CommandInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NfcProtos.internal_static_CommandInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i7 = 0; i7 < getListCount(); i7++) {
                        if (!getList(i7).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, builder.build());
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.set(i7, builder.build());
                    onChanged();
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addList(int i7, CommandInfo commandInfo) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, commandInfo);
                        return this;
                    }
                    commandInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, commandInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, CommandInfo.getDefaultInstance());
                }

                public Builder setList(int i7, CommandInfo commandInfo) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, commandInfo);
                        return this;
                    }
                    commandInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, commandInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.add(builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public List build() {
                    List listBuildPartial = buildPartial();
                    if (listBuildPartial.isInitialized()) {
                        return listBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) listBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public List buildPartial() {
                    java.util.List listBuild;
                    List list = new List(this);
                    int i7 = this.bitField0_;
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((i7 & 1) == 1) {
                            this.list_ = Collections.unmodifiableList(this.list_);
                            this.bitField0_ &= -2;
                        }
                        listBuild = this.list_;
                    } else {
                        listBuild = repeatedFieldBuilderV3.build();
                    }
                    list.list_ = listBuild;
                    onBuilt();
                    return list;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public List getDefaultInstanceForType() {
                    return List.getDefaultInstance();
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

                public Builder addList(CommandInfo commandInfo) {
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(commandInfo);
                        return this;
                    }
                    commandInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(commandInfo);
                    onChanged();
                    return this;
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
                    RepeatedFieldBuilderV3<CommandInfo, Builder, CommandInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
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
                public com.zh.wear.protobuf.NfcProtos.CommandInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$CommandInfo$List> r1 = com.zh.wear.protobuf.NfcProtos.CommandInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.NfcProtos$CommandInfo$List r3 = (com.zh.wear.protobuf.NfcProtos.CommandInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.NfcProtos$CommandInfo$List r4 = (com.zh.wear.protobuf.NfcProtos.CommandInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.CommandInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$CommandInfo$List$Builder");
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof List) {
                        return mergeFrom((List) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(List list) {
                    if (list == List.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!list.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = list.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(list.list_);
                            }
                            onChanged();
                        }
                    } else if (!list.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = list.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(list.list_);
                        }
                    }
                    mergeUnknownFields(((GeneratedMessage) list).unknownFields);
                    onChanged();
                    return this;
                }
            }

            private List() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_CommandInfo_List_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static List parseDelimitedFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Parser<List> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof List)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                return getListList().equals(list.getListList()) && this.unknownFields.equals(list.unknownFields);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
            public CommandInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
            public java.util.List<CommandInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
            public CommandInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.CommandInfo.ListOrBuilder
            public java.util.List<? extends CommandInfoOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<List> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeMessageSize = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.list_.get(i8));
                }
                int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
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
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_CommandInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                this.unknownFields.writeTo(codedOutputStream);
            }

            private List(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z6 = false;
                boolean z7 = false;
                while (!z6) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        if (!z7) {
                                            this.list_ = new ArrayList();
                                            z7 = true;
                                        }
                                        this.list_.add((CommandInfo) codedInputStream.readMessage(CommandInfo.PARSER, extensionRegistryLite));
                                    } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                }
                                z6 = true;
                            } catch (IOException e7) {
                                throw new InvalidProtocolBufferException(e7).setUnfinishedMessage(this);
                            }
                        } catch (InvalidProtocolBufferException e8) {
                            throw e8.setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if (z7) {
                            this.list_ = Collections.unmodifiableList(this.list_);
                        }
                        this.unknownFields = builderNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z7) {
                    this.list_ = Collections.unmodifiableList(this.list_);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Builder newBuilder(List list) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(list);
            }

            public static List parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static List parseFrom(CodedInputStream codedInputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public List getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private List(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static List parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static List parseFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static List parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static List parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static List parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static List parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }
        }

        public interface ListOrBuilder extends MessageOrBuilder {
            CommandInfo getList(int i7);

            int getListCount();

            java.util.List<CommandInfo> getListList();

            CommandInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends CommandInfoOrBuilder> getListOrBuilderList();
        }

        private CommandInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = ByteString.EMPTY;
            this.expectStatus_ = "";
        }

        public static CommandInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NfcProtos.internal_static_CommandInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CommandInfo parseDelimitedFrom(InputStream inputStream) {
            return (CommandInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CommandInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<CommandInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CommandInfo)) {
                return super.equals(obj);
            }
            CommandInfo commandInfo = (CommandInfo) obj;
            boolean z6 = hasData() == commandInfo.hasData();
            if (hasData()) {
                z6 = z6 && getData().equals(commandInfo.getData());
            }
            boolean z7 = z6 && hasExpectStatus() == commandInfo.hasExpectStatus();
            if (hasExpectStatus()) {
                z7 = z7 && getExpectStatus().equals(commandInfo.getExpectStatus());
            }
            return z7 && this.unknownFields.equals(commandInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
        public String getExpectStatus() {
            Object obj = this.expectStatus_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.expectStatus_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
        public ByteString getExpectStatusBytes() {
            Object obj = this.expectStatus_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.expectStatus_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CommandInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.data_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += GeneratedMessage.computeStringSize(2, this.expectStatus_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.CommandInfoOrBuilder
        public boolean hasExpectStatus() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getData().hashCode();
            }
            if (hasExpectStatus()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getExpectStatus().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NfcProtos.internal_static_CommandInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CommandInfo.class, Builder.class);
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
            if (!hasData()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExpectStatus()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.data_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.expectStatus_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private CommandInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bitField0_ |= 1;
                                this.data_ = codedInputStream.readBytes();
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.expectStatus_ = bytes;
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

        public static Builder newBuilder(CommandInfo commandInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(commandInfo);
        }

        public static CommandInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CommandInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CommandInfo parseFrom(CodedInputStream codedInputStream) {
            return (CommandInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CommandInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private CommandInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CommandInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CommandInfo parseFrom(InputStream inputStream) {
            return (CommandInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CommandInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CommandInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CommandInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CommandInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CommandInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface CommandInfoOrBuilder extends MessageOrBuilder {
        ByteString getData();

        String getExpectStatus();

        ByteString getExpectStatusBytes();

        boolean hasData();

        boolean hasExpectStatus();
    }

    public static final class IssueCard extends GeneratedMessageV3 implements IssueCardOrBuilder {
        public static final int ICON_URL_FIELD_NUMBER = 4;
        public static final int NEED_READ_CARD_FIELD_NUMBER = 3;
        public static final int SID_FIELD_NUMBER = 5;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object iconUrl_;
        private byte memoizedIsInitialized;
        private boolean needReadCard_;
        private volatile Object sid_;
        private int status_;
        private int type_;
        private static final IssueCard DEFAULT_INSTANCE = new IssueCard();

        @Deprecated
        public static final Parser<IssueCard> PARSER = new AbstractParser<IssueCard>() { // from class: com.zh.wear.protobuf.NfcProtos.IssueCard.1
            @Override // com.google.protobuf.Parser
            public IssueCard parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new IssueCard(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IssueCardOrBuilder {
            private int bitField0_;
            private Object iconUrl_;
            private boolean needReadCard_;
            private Object sid_;
            private int status_;
            private int type_;

            private Builder() {
                this.status_ = 0;
                this.type_ = 0;
                this.iconUrl_ = "";
                this.sid_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_IssueCard_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearIconUrl() {
                this.bitField0_ &= -9;
                this.iconUrl_ = IssueCard.getDefaultInstance().getIconUrl();
                onChanged();
                return this;
            }

            public Builder clearNeedReadCard() {
                this.bitField0_ &= -5;
                this.needReadCard_ = false;
                onChanged();
                return this;
            }

            public Builder clearSid() {
                this.bitField0_ &= -17;
                this.sid_ = IssueCard.getDefaultInstance().getSid();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
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
                return NfcProtos.internal_static_IssueCard_descriptor;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public String getIconUrl() {
                Object obj = this.iconUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.iconUrl_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public ByteString getIconUrlBytes() {
                Object obj = this.iconUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.iconUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public boolean getNeedReadCard() {
                return this.needReadCard_;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public String getSid() {
                Object obj = this.sid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public ByteString getSidBytes() {
                Object obj = this.sid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public IssueCardStatus getStatus() {
                IssueCardStatus issueCardStatusValueOf = IssueCardStatus.valueOf(this.status_);
                return issueCardStatusValueOf == null ? IssueCardStatus.START : issueCardStatusValueOf;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public IssueCardType getType() {
                IssueCardType issueCardTypeValueOf = IssueCardType.valueOf(this.type_);
                return issueCardTypeValueOf == null ? IssueCardType.DOOR_CARD : issueCardTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public boolean hasIconUrl() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public boolean hasNeedReadCard() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public boolean hasSid() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_IssueCard_fieldAccessorTable.ensureFieldAccessorsInitialized(IssueCard.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
            }

            public Builder setIconUrl(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.iconUrl_ = str;
                onChanged();
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.iconUrl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setNeedReadCard(boolean z6) {
                this.bitField0_ |= 4;
                this.needReadCard_ = z6;
                onChanged();
                return this;
            }

            public Builder setSid(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.sid_ = str;
                onChanged();
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.sid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStatus(IssueCardStatus issueCardStatus) {
                issueCardStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = issueCardStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setType(IssueCardType issueCardType) {
                issueCardType.getClass();
                this.bitField0_ |= 2;
                this.type_ = issueCardType.getNumber();
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
                this.type_ = 0;
                this.iconUrl_ = "";
                this.sid_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IssueCard build() {
                IssueCard issueCardBuildPartial = buildPartial();
                if (issueCardBuildPartial.isInitialized()) {
                    return issueCardBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) issueCardBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IssueCard buildPartial() {
                IssueCard issueCard = new IssueCard(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                issueCard.status_ = this.status_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                issueCard.type_ = this.type_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                issueCard.needReadCard_ = this.needReadCard_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                issueCard.iconUrl_ = this.iconUrl_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                issueCard.sid_ = this.sid_;
                issueCard.bitField0_ = i8;
                onBuilt();
                return issueCard;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public IssueCard getDefaultInstanceForType() {
                return IssueCard.getDefaultInstance();
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
                this.status_ = 0;
                int i7 = this.bitField0_;
                this.type_ = 0;
                this.needReadCard_ = false;
                this.iconUrl_ = "";
                this.sid_ = "";
                this.bitField0_ = i7 & (-32);
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
            public com.zh.wear.protobuf.NfcProtos.IssueCard.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$IssueCard> r1 = com.zh.wear.protobuf.NfcProtos.IssueCard.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NfcProtos$IssueCard r3 = (com.zh.wear.protobuf.NfcProtos.IssueCard) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NfcProtos$IssueCard r4 = (com.zh.wear.protobuf.NfcProtos.IssueCard) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.IssueCard.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$IssueCard$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof IssueCard) {
                    return mergeFrom((IssueCard) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IssueCard issueCard) {
                if (issueCard == IssueCard.getDefaultInstance()) {
                    return this;
                }
                if (issueCard.hasStatus()) {
                    setStatus(issueCard.getStatus());
                }
                if (issueCard.hasType()) {
                    setType(issueCard.getType());
                }
                if (issueCard.hasNeedReadCard()) {
                    setNeedReadCard(issueCard.getNeedReadCard());
                }
                if (issueCard.hasIconUrl()) {
                    this.bitField0_ |= 8;
                    this.iconUrl_ = issueCard.iconUrl_;
                    onChanged();
                }
                if (issueCard.hasSid()) {
                    this.bitField0_ |= 16;
                    this.sid_ = issueCard.sid_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) issueCard).unknownFields);
                onChanged();
                return this;
            }
        }

        private IssueCard() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.type_ = 0;
            this.needReadCard_ = false;
            this.iconUrl_ = "";
            this.sid_ = "";
        }

        public static IssueCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NfcProtos.internal_static_IssueCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IssueCard parseDelimitedFrom(InputStream inputStream) {
            return (IssueCard) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IssueCard parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<IssueCard> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IssueCard)) {
                return super.equals(obj);
            }
            IssueCard issueCard = (IssueCard) obj;
            boolean z6 = hasStatus() == issueCard.hasStatus();
            if (hasStatus()) {
                z6 = z6 && this.status_ == issueCard.status_;
            }
            boolean z7 = z6 && hasType() == issueCard.hasType();
            if (hasType()) {
                z7 = z7 && this.type_ == issueCard.type_;
            }
            boolean z8 = z7 && hasNeedReadCard() == issueCard.hasNeedReadCard();
            if (hasNeedReadCard()) {
                z8 = z8 && getNeedReadCard() == issueCard.getNeedReadCard();
            }
            boolean z9 = z8 && hasIconUrl() == issueCard.hasIconUrl();
            if (hasIconUrl()) {
                z9 = z9 && getIconUrl().equals(issueCard.getIconUrl());
            }
            boolean z10 = z9 && hasSid() == issueCard.hasSid();
            if (hasSid()) {
                z10 = z10 && getSid().equals(issueCard.getSid());
            }
            return z10 && this.unknownFields.equals(issueCard.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public String getIconUrl() {
            Object obj = this.iconUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.iconUrl_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public ByteString getIconUrlBytes() {
            Object obj = this.iconUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iconUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public boolean getNeedReadCard() {
            return this.needReadCard_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IssueCard> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(3, this.needReadCard_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(4, this.iconUrl_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(5, this.sid_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public String getSid() {
            Object obj = this.sid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public ByteString getSidBytes() {
            Object obj = this.sid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public IssueCardStatus getStatus() {
            IssueCardStatus issueCardStatusValueOf = IssueCardStatus.valueOf(this.status_);
            return issueCardStatusValueOf == null ? IssueCardStatus.START : issueCardStatusValueOf;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public IssueCardType getType() {
            IssueCardType issueCardTypeValueOf = IssueCardType.valueOf(this.type_);
            return issueCardTypeValueOf == null ? IssueCardType.DOOR_CARD : issueCardTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public boolean hasIconUrl() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public boolean hasNeedReadCard() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public boolean hasSid() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.IssueCardOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasStatus()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.status_;
            }
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.type_;
            }
            if (hasNeedReadCard()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getNeedReadCard());
            }
            if (hasIconUrl()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getIconUrl().hashCode();
            }
            if (hasSid()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSid().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NfcProtos.internal_static_IssueCard_fieldAccessorTable.ensureFieldAccessorsInitialized(IssueCard.class, Builder.class);
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
            if (hasStatus()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeEnum(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.needReadCard_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.iconUrl_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.sid_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private IssueCard(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                if (IssueCardStatus.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.status_ = i7;
                                }
                            } else if (tag == 16) {
                                int i8 = codedInputStream.readEnum();
                                if (IssueCardType.valueOf(i8) == null) {
                                    builderNewBuilder.mergeVarintField(2, i8);
                                } else {
                                    this.bitField0_ |= 2;
                                    this.type_ = i8;
                                }
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.needReadCard_ = codedInputStream.readBool();
                            } else if (tag == 34) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.iconUrl_ = bytes;
                            } else if (tag == 42) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.sid_ = bytes2;
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

        public static Builder newBuilder(IssueCard issueCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(issueCard);
        }

        public static IssueCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IssueCard) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IssueCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IssueCard parseFrom(CodedInputStream codedInputStream) {
            return (IssueCard) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IssueCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private IssueCard(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IssueCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IssueCard) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static IssueCard parseFrom(InputStream inputStream) {
            return (IssueCard) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static IssueCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IssueCard) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IssueCard parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static IssueCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static IssueCard parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IssueCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface IssueCardOrBuilder extends MessageOrBuilder {
        String getIconUrl();

        ByteString getIconUrlBytes();

        boolean getNeedReadCard();

        String getSid();

        ByteString getSidBytes();

        IssueCardStatus getStatus();

        IssueCardType getType();

        boolean hasIconUrl();

        boolean hasNeedReadCard();

        boolean hasSid();

        boolean hasStatus();

        boolean hasType();
    }

    public enum IssueCardStatus implements ProtocolMessageEnum {
        START(0),
        SUCCESS(1),
        FAILURE(2);

        public static final int FAILURE_VALUE = 2;
        public static final int START_VALUE = 0;
        public static final int SUCCESS_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<IssueCardStatus> internalValueMap = new Internal.EnumLiteMap<IssueCardStatus>() { // from class: com.zh.wear.protobuf.NfcProtos.IssueCardStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public IssueCardStatus findValueByNumber(int i7) {
                return IssueCardStatus.forNumber(i7);
            }
        };
        private static final IssueCardStatus[] VALUES = values();

        IssueCardStatus(int i7) {
            this.value = i7;
        }

        public static IssueCardStatus forNumber(int i7) {
            if (i7 == 0) {
                return START;
            }
            if (i7 == 1) {
                return SUCCESS;
            }
            if (i7 != 2) {
                return null;
            }
            return FAILURE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return NfcProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<IssueCardStatus> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static IssueCardStatus valueOf(int i7) {
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

        public static IssueCardStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum IssueCardType implements ProtocolMessageEnum {
        DOOR_CARD(0),
        BUS_CARD(1),
        BANK_CARD(2),
        CLOUD_CARD(3);

        public static final int BANK_CARD_VALUE = 2;
        public static final int BUS_CARD_VALUE = 1;
        public static final int CLOUD_CARD_VALUE = 3;
        public static final int DOOR_CARD_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<IssueCardType> internalValueMap = new Internal.EnumLiteMap<IssueCardType>() { // from class: com.zh.wear.protobuf.NfcProtos.IssueCardType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public IssueCardType findValueByNumber(int i7) {
                return IssueCardType.forNumber(i7);
            }
        };
        private static final IssueCardType[] VALUES = values();

        IssueCardType(int i7) {
            this.value = i7;
        }

        public static IssueCardType forNumber(int i7) {
            if (i7 == 0) {
                return DOOR_CARD;
            }
            if (i7 == 1) {
                return BUS_CARD;
            }
            if (i7 == 2) {
                return BANK_CARD;
            }
            if (i7 != 3) {
                return null;
            }
            return CLOUD_CARD;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return NfcProtos.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<IssueCardType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static IssueCardType valueOf(int i7) {
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

        public static IssueCardType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Nfc extends GeneratedMessageV3 implements NfcOrBuilder {
        public static final int AID_FIELD_NUMBER = 6;
        public static final int BALANCE_INFO_FIELD_NUMBER = 7;
        public static final int CAPABILITY_FIELD_NUMBER = 10;
        public static final int CARD_DATA_FIELD_NUMBER = 3;
        public static final int CARD_INFO_FIELD_NUMBER = 4;
        public static final int CARD_INFO_LIST_FIELD_NUMBER = 5;
        public static final int COMMAND_FIELD_NUMBER = 1;
        public static final int COMMAND_INFO_LIST_FIELD_NUMBER = 9;
        public static final int CONFIG_FIELD_NUMBER = 8;
        public static final int ISSUE_CARD_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Nfc DEFAULT_INSTANCE = new Nfc();

        @Deprecated
        public static final Parser<Nfc> PARSER = new AbstractParser<Nfc>() { // from class: com.zh.wear.protobuf.NfcProtos.Nfc.1
            @Override // com.google.protobuf.Parser
            public Nfc parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Nfc(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NfcOrBuilder {
            private SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> balanceInfoBuilder_;
            private int bitField0_;
            private SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> cardDataBuilder_;
            private SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> cardInfoBuilder_;
            private SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> cardInfoListBuilder_;
            private SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> commandInfoListBuilder_;
            private SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> issueCardBuilder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> getBalanceInfoFieldBuilder() {
                if (this.balanceInfoBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = BalanceInfo.getDefaultInstance();
                    }
                    this.balanceInfoBuilder_ = new SingleFieldBuilderV3<>((BalanceInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.balanceInfoBuilder_;
            }

            private SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> getCardDataFieldBuilder() {
                if (this.cardDataBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = CardData.getDefaultInstance();
                    }
                    this.cardDataBuilder_ = new SingleFieldBuilderV3<>((CardData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.cardDataBuilder_;
            }

            private SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> getCardInfoFieldBuilder() {
                if (this.cardInfoBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = CardInfo.getDefaultInstance();
                    }
                    this.cardInfoBuilder_ = new SingleFieldBuilderV3<>((CardInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.cardInfoBuilder_;
            }

            private SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> getCardInfoListFieldBuilder() {
                if (this.cardInfoListBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = CardInfo.List.getDefaultInstance();
                    }
                    this.cardInfoListBuilder_ = new SingleFieldBuilderV3<>((CardInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.cardInfoListBuilder_;
            }

            private SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> getCommandInfoListFieldBuilder() {
                if (this.commandInfoListBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = CommandInfo.List.getDefaultInstance();
                    }
                    this.commandInfoListBuilder_ = new SingleFieldBuilderV3<>((CommandInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.commandInfoListBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NfcProtos.internal_static_Nfc_descriptor;
            }

            private SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> getIssueCardFieldBuilder() {
                if (this.issueCardBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = IssueCard.getDefaultInstance();
                    }
                    this.issueCardBuilder_ = new SingleFieldBuilderV3<>((IssueCard) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.issueCardBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAid() {
                if (this.payloadCase_ == 6) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearBalanceInfo() {
                SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> singleFieldBuilderV3 = this.balanceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearCapability() {
                if (this.payloadCase_ == 10) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearCardData() {
                SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> singleFieldBuilderV3 = this.cardDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearCardInfo() {
                SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> singleFieldBuilderV3 = this.cardInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearCardInfoList() {
                SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> singleFieldBuilderV3 = this.cardInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearCommand() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearCommandInfoList() {
                SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> singleFieldBuilderV3 = this.commandInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 9) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 9) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearConfig() {
                if (this.payloadCase_ == 8) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearIssueCard() {
                SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> singleFieldBuilderV3 = this.issueCardBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public String getAid() {
                String str = this.payloadCase_ == 6 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 6 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public ByteString getAidBytes() {
                String str = this.payloadCase_ == 6 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 6) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public BalanceInfo getBalanceInfo() {
                Object message;
                SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> singleFieldBuilderV3 = this.balanceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 7) {
                        return BalanceInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 7) {
                        return BalanceInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BalanceInfo) message;
            }

            public BalanceInfo.Builder getBalanceInfoBuilder() {
                return (BalanceInfo.Builder) getBalanceInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public BalanceInfoOrBuilder getBalanceInfoOrBuilder() {
                SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilderV3 = this.balanceInfoBuilder_) == null) ? i7 == 7 ? (BalanceInfo) this.payload_ : BalanceInfo.getDefaultInstance() : (BalanceInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public int getCapability() {
                if (this.payloadCase_ == 10) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CardData getCardData() {
                Object message;
                SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> singleFieldBuilderV3 = this.cardDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return CardData.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return CardData.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CardData) message;
            }

            public CardData.Builder getCardDataBuilder() {
                return (CardData.Builder) getCardDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CardDataOrBuilder getCardDataOrBuilder() {
                SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.cardDataBuilder_) == null) ? i7 == 3 ? (CardData) this.payload_ : CardData.getDefaultInstance() : (CardDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CardInfo getCardInfo() {
                Object message;
                SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> singleFieldBuilderV3 = this.cardInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 4) {
                        return CardInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 4) {
                        return CardInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CardInfo) message;
            }

            public CardInfo.Builder getCardInfoBuilder() {
                return (CardInfo.Builder) getCardInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CardInfo.List getCardInfoList() {
                Object message;
                SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> singleFieldBuilderV3 = this.cardInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 5) {
                        return CardInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 5) {
                        return CardInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CardInfo.List) message;
            }

            public CardInfo.List.Builder getCardInfoListBuilder() {
                return (CardInfo.List.Builder) getCardInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CardInfo.ListOrBuilder getCardInfoListOrBuilder() {
                SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilderV3 = this.cardInfoListBuilder_) == null) ? i7 == 5 ? (CardInfo.List) this.payload_ : CardInfo.List.getDefaultInstance() : (CardInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CardInfoOrBuilder getCardInfoOrBuilder() {
                SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilderV3 = this.cardInfoBuilder_) == null) ? i7 == 4 ? (CardInfo) this.payload_ : CardInfo.getDefaultInstance() : (CardInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public ByteString getCommand() {
                return this.payloadCase_ == 1 ? (ByteString) this.payload_ : ByteString.EMPTY;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CommandInfo.List getCommandInfoList() {
                Object message;
                SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> singleFieldBuilderV3 = this.commandInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 9) {
                        return CommandInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 9) {
                        return CommandInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CommandInfo.List) message;
            }

            public CommandInfo.List.Builder getCommandInfoListBuilder() {
                return (CommandInfo.List.Builder) getCommandInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public CommandInfo.ListOrBuilder getCommandInfoListOrBuilder() {
                SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilderV3 = this.commandInfoListBuilder_) == null) ? i7 == 9 ? (CommandInfo.List) this.payload_ : CommandInfo.List.getDefaultInstance() : (CommandInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public String getConfig() {
                String str = this.payloadCase_ == 8 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 8 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public ByteString getConfigBytes() {
                String str = this.payloadCase_ == 8 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 8) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NfcProtos.internal_static_Nfc_descriptor;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public IssueCard getIssueCard() {
                Object message;
                SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> singleFieldBuilderV3 = this.issueCardBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return IssueCard.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return IssueCard.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (IssueCard) message;
            }

            public IssueCard.Builder getIssueCardBuilder() {
                return (IssueCard.Builder) getIssueCardFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public IssueCardOrBuilder getIssueCardOrBuilder() {
                SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.issueCardBuilder_) == null) ? i7 == 2 ? (IssueCard) this.payload_ : IssueCard.getDefaultInstance() : (IssueCardOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasAid() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasBalanceInfo() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasCapability() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasCardData() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasCardInfo() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasCardInfoList() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasCommand() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasCommandInfoList() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasConfig() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
            public boolean hasIssueCard() {
                return this.payloadCase_ == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NfcProtos.internal_static_Nfc_fieldAccessorTable.ensureFieldAccessorsInitialized(Nfc.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIssueCard() && !getIssueCard().isInitialized()) {
                    return false;
                }
                if (hasCardData() && !getCardData().isInitialized()) {
                    return false;
                }
                if (hasCardInfo() && !getCardInfo().isInitialized()) {
                    return false;
                }
                if (hasCardInfoList() && !getCardInfoList().isInitialized()) {
                    return false;
                }
                if (!hasBalanceInfo() || getBalanceInfo().isInitialized()) {
                    return !hasCommandInfoList() || getCommandInfoList().isInitialized();
                }
                return false;
            }

            public Builder mergeBalanceInfo(BalanceInfo balanceInfo) {
                SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> singleFieldBuilderV3 = this.balanceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 7 && this.payload_ != BalanceInfo.getDefaultInstance()) {
                        balanceInfo = BalanceInfo.newBuilder((BalanceInfo) this.payload_).mergeFrom(balanceInfo).buildPartial();
                    }
                    this.payload_ = balanceInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 7) {
                        singleFieldBuilderV3.mergeFrom(balanceInfo);
                    }
                    this.balanceInfoBuilder_.setMessage(balanceInfo);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeCardData(CardData cardData) {
                SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> singleFieldBuilderV3 = this.cardDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != CardData.getDefaultInstance()) {
                        cardData = CardData.newBuilder((CardData) this.payload_).mergeFrom(cardData).buildPartial();
                    }
                    this.payload_ = cardData;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(cardData);
                    }
                    this.cardDataBuilder_.setMessage(cardData);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeCardInfo(CardInfo cardInfo) {
                SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> singleFieldBuilderV3 = this.cardInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4 && this.payload_ != CardInfo.getDefaultInstance()) {
                        cardInfo = CardInfo.newBuilder((CardInfo) this.payload_).mergeFrom(cardInfo).buildPartial();
                    }
                    this.payload_ = cardInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(cardInfo);
                    }
                    this.cardInfoBuilder_.setMessage(cardInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeCardInfoList(CardInfo.List list) {
                SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> singleFieldBuilderV3 = this.cardInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 5 && this.payload_ != CardInfo.List.getDefaultInstance()) {
                        list = CardInfo.List.newBuilder((CardInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 5) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.cardInfoListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeCommandInfoList(CommandInfo.List list) {
                SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> singleFieldBuilderV3 = this.commandInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 9 && this.payload_ != CommandInfo.List.getDefaultInstance()) {
                        list = CommandInfo.List.newBuilder((CommandInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 9) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.commandInfoListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder mergeIssueCard(IssueCard issueCard) {
                SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> singleFieldBuilderV3 = this.issueCardBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != IssueCard.getDefaultInstance()) {
                        issueCard = IssueCard.newBuilder((IssueCard) this.payload_).mergeFrom(issueCard).buildPartial();
                    }
                    this.payload_ = issueCard;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(issueCard);
                    }
                    this.issueCardBuilder_.setMessage(issueCard);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setAid(String str) {
                str.getClass();
                this.payloadCase_ = 6;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setAidBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 6;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBalanceInfo(BalanceInfo.Builder builder) {
                SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> singleFieldBuilderV3 = this.balanceInfoBuilder_;
                BalanceInfo balanceInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = balanceInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(balanceInfoBuild);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setCapability(int i7) {
                this.payloadCase_ = 10;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setCardData(CardData.Builder builder) {
                SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> singleFieldBuilderV3 = this.cardDataBuilder_;
                CardData cardDataBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = cardDataBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(cardDataBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setCardInfo(CardInfo.Builder builder) {
                SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> singleFieldBuilderV3 = this.cardInfoBuilder_;
                CardInfo cardInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = cardInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(cardInfoBuild);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setCardInfoList(CardInfo.List.Builder builder) {
                SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> singleFieldBuilderV3 = this.cardInfoListBuilder_;
                CardInfo.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setCommand(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 1;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCommandInfoList(CommandInfo.List.Builder builder) {
                SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> singleFieldBuilderV3 = this.commandInfoListBuilder_;
                CommandInfo.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setConfig(String str) {
                str.getClass();
                this.payloadCase_ = 8;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setConfigBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 8;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIssueCard(IssueCard.Builder builder) {
                SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> singleFieldBuilderV3 = this.issueCardBuilder_;
                IssueCard issueCardBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = issueCardBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(issueCardBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setBalanceInfo(BalanceInfo balanceInfo) {
                SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> singleFieldBuilderV3 = this.balanceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    balanceInfo.getClass();
                    this.payload_ = balanceInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(balanceInfo);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setCardData(CardData cardData) {
                SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> singleFieldBuilderV3 = this.cardDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cardData.getClass();
                    this.payload_ = cardData;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(cardData);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setCardInfo(CardInfo cardInfo) {
                SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> singleFieldBuilderV3 = this.cardInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cardInfo.getClass();
                    this.payload_ = cardInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(cardInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setCardInfoList(CardInfo.List list) {
                SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> singleFieldBuilderV3 = this.cardInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setCommandInfoList(CommandInfo.List list) {
                SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> singleFieldBuilderV3 = this.commandInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setIssueCard(IssueCard issueCard) {
                SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> singleFieldBuilderV3 = this.issueCardBuilder_;
                if (singleFieldBuilderV3 == null) {
                    issueCard.getClass();
                    this.payload_ = issueCard;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(issueCard);
                }
                this.payloadCase_ = 2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Nfc build() {
                Nfc nfcBuildPartial = buildPartial();
                if (nfcBuildPartial.isInitialized()) {
                    return nfcBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) nfcBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Nfc buildPartial() {
                Nfc nfc = new Nfc(this);
                if (this.payloadCase_ == 1) {
                    nfc.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<IssueCard, IssueCard.Builder, IssueCardOrBuilder> singleFieldBuilderV3 = this.issueCardBuilder_;
                    nfc.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<CardData, CardData.Builder, CardDataOrBuilder> singleFieldBuilderV32 = this.cardDataBuilder_;
                    nfc.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 4) {
                    SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> singleFieldBuilderV33 = this.cardInfoBuilder_;
                    nfc.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                if (this.payloadCase_ == 5) {
                    SingleFieldBuilderV3<CardInfo.List, CardInfo.List.Builder, CardInfo.ListOrBuilder> singleFieldBuilderV34 = this.cardInfoListBuilder_;
                    nfc.payload_ = singleFieldBuilderV34 == null ? this.payload_ : singleFieldBuilderV34.build();
                }
                if (this.payloadCase_ == 6) {
                    nfc.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 7) {
                    SingleFieldBuilderV3<BalanceInfo, BalanceInfo.Builder, BalanceInfoOrBuilder> singleFieldBuilderV35 = this.balanceInfoBuilder_;
                    nfc.payload_ = singleFieldBuilderV35 == null ? this.payload_ : singleFieldBuilderV35.build();
                }
                if (this.payloadCase_ == 8) {
                    nfc.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 9) {
                    SingleFieldBuilderV3<CommandInfo.List, CommandInfo.List.Builder, CommandInfo.ListOrBuilder> singleFieldBuilderV36 = this.commandInfoListBuilder_;
                    nfc.payload_ = singleFieldBuilderV36 == null ? this.payload_ : singleFieldBuilderV36.build();
                }
                if (this.payloadCase_ == 10) {
                    nfc.payload_ = this.payload_;
                }
                nfc.bitField0_ = 0;
                nfc.payloadCase_ = this.payloadCase_;
                onBuilt();
                return nfc;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Nfc getDefaultInstanceForType() {
                return Nfc.getDefaultInstance();
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
            public com.zh.wear.protobuf.NfcProtos.Nfc.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NfcProtos$Nfc> r1 = com.zh.wear.protobuf.NfcProtos.Nfc.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NfcProtos$Nfc r3 = (com.zh.wear.protobuf.NfcProtos.Nfc) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NfcProtos$Nfc r4 = (com.zh.wear.protobuf.NfcProtos.Nfc) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.Nfc.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NfcProtos$Nfc$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Nfc) {
                    return mergeFrom((Nfc) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Nfc nfc) {
                int i7;
                if (nfc == Nfc.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$NfcProtos$Nfc$PayloadCase[nfc.getPayloadCase().ordinal()]) {
                    case 1:
                        setCommand(nfc.getCommand());
                        break;
                    case 2:
                        mergeIssueCard(nfc.getIssueCard());
                        break;
                    case 3:
                        mergeCardData(nfc.getCardData());
                        break;
                    case 4:
                        mergeCardInfo(nfc.getCardInfo());
                        break;
                    case 5:
                        mergeCardInfoList(nfc.getCardInfoList());
                        break;
                    case 6:
                        i7 = 6;
                        this.payloadCase_ = i7;
                        this.payload_ = nfc.payload_;
                        onChanged();
                        break;
                    case 7:
                        mergeBalanceInfo(nfc.getBalanceInfo());
                        break;
                    case 8:
                        i7 = 8;
                        this.payloadCase_ = i7;
                        this.payload_ = nfc.payload_;
                        onChanged();
                        break;
                    case 9:
                        mergeCommandInfoList(nfc.getCommandInfoList());
                        break;
                    case 10:
                        setCapability(nfc.getCapability());
                        break;
                }
                mergeUnknownFields(((GeneratedMessage) nfc).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum NfcID implements ProtocolMessageEnum {
            COMMAND(0),
            ISSUE_CARD(1),
            ADD_CARD(2),
            DEL_CARD(3),
            SYNC_CARD_LIST(4),
            SET_DEFAULT_CARD(5),
            GET_DEFAULT_CARD(6),
            SET_BALANCE(7),
            GET_BALANCE(8),
            SET_CONFIG(9),
            CAPABILITY_SET(10),
            COMMAND_BATCH(16);

            public static final int ADD_CARD_VALUE = 2;
            public static final int CAPABILITY_SET_VALUE = 10;
            public static final int COMMAND_BATCH_VALUE = 16;
            public static final int COMMAND_VALUE = 0;
            public static final int DEL_CARD_VALUE = 3;
            public static final int GET_BALANCE_VALUE = 8;
            public static final int GET_DEFAULT_CARD_VALUE = 6;
            public static final int ISSUE_CARD_VALUE = 1;
            public static final int SET_BALANCE_VALUE = 7;
            public static final int SET_CONFIG_VALUE = 9;
            public static final int SET_DEFAULT_CARD_VALUE = 5;
            public static final int SYNC_CARD_LIST_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<NfcID> internalValueMap = new Internal.EnumLiteMap<NfcID>() { // from class: com.zh.wear.protobuf.NfcProtos.Nfc.NfcID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public NfcID findValueByNumber(int i7) {
                    return NfcID.forNumber(i7);
                }
            };
            private static final NfcID[] VALUES = values();

            NfcID(int i7) {
                this.value = i7;
            }

            public static NfcID forNumber(int i7) {
                if (i7 == 16) {
                    return COMMAND_BATCH;
                }
                switch (i7) {
                    case 0:
                        return COMMAND;
                    case 1:
                        return ISSUE_CARD;
                    case 2:
                        return ADD_CARD;
                    case 3:
                        return DEL_CARD;
                    case 4:
                        return SYNC_CARD_LIST;
                    case 5:
                        return SET_DEFAULT_CARD;
                    case 6:
                        return GET_DEFAULT_CARD;
                    case 7:
                        return SET_BALANCE;
                    case 8:
                        return GET_BALANCE;
                    case 9:
                        return SET_CONFIG;
                    case 10:
                        return CAPABILITY_SET;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Nfc.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<NfcID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static NfcID valueOf(int i7) {
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

            public static NfcID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            COMMAND(1),
            ISSUE_CARD(2),
            CARD_DATA(3),
            CARD_INFO(4),
            CARD_INFO_LIST(5),
            AID(6),
            BALANCE_INFO(7),
            CONFIG(8),
            COMMAND_INFO_LIST(9),
            CAPABILITY(10),
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
                        return COMMAND;
                    case 2:
                        return ISSUE_CARD;
                    case 3:
                        return CARD_DATA;
                    case 4:
                        return CARD_INFO;
                    case 5:
                        return CARD_INFO_LIST;
                    case 6:
                        return AID;
                    case 7:
                        return BALANCE_INFO;
                    case 8:
                        return CONFIG;
                    case 9:
                        return COMMAND_INFO_LIST;
                    case 10:
                        return CAPABILITY;
                    default:
                        return null;
                }
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

        private Nfc() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Nfc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NfcProtos.internal_static_Nfc_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Nfc parseDelimitedFrom(InputStream inputStream) {
            return (Nfc) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Nfc parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Nfc> parser() {
            return PARSER;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NfcProtos.Nfc.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public String getAid() {
            String str = this.payloadCase_ == 6 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 6) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public ByteString getAidBytes() {
            String str = this.payloadCase_ == 6 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 6) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public BalanceInfo getBalanceInfo() {
            return this.payloadCase_ == 7 ? (BalanceInfo) this.payload_ : BalanceInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public BalanceInfoOrBuilder getBalanceInfoOrBuilder() {
            return this.payloadCase_ == 7 ? (BalanceInfo) this.payload_ : BalanceInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public int getCapability() {
            if (this.payloadCase_ == 10) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CardData getCardData() {
            return this.payloadCase_ == 3 ? (CardData) this.payload_ : CardData.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CardDataOrBuilder getCardDataOrBuilder() {
            return this.payloadCase_ == 3 ? (CardData) this.payload_ : CardData.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CardInfo getCardInfo() {
            return this.payloadCase_ == 4 ? (CardInfo) this.payload_ : CardInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CardInfo.List getCardInfoList() {
            return this.payloadCase_ == 5 ? (CardInfo.List) this.payload_ : CardInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CardInfo.ListOrBuilder getCardInfoListOrBuilder() {
            return this.payloadCase_ == 5 ? (CardInfo.List) this.payload_ : CardInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CardInfoOrBuilder getCardInfoOrBuilder() {
            return this.payloadCase_ == 4 ? (CardInfo) this.payload_ : CardInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public ByteString getCommand() {
            return this.payloadCase_ == 1 ? (ByteString) this.payload_ : ByteString.EMPTY;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CommandInfo.List getCommandInfoList() {
            return this.payloadCase_ == 9 ? (CommandInfo.List) this.payload_ : CommandInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public CommandInfo.ListOrBuilder getCommandInfoListOrBuilder() {
            return this.payloadCase_ == 9 ? (CommandInfo.List) this.payload_ : CommandInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public String getConfig() {
            String str = this.payloadCase_ == 8 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 8) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public ByteString getConfigBytes() {
            String str = this.payloadCase_ == 8 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 8) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public IssueCard getIssueCard() {
            return this.payloadCase_ == 2 ? (IssueCard) this.payload_ : IssueCard.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public IssueCardOrBuilder getIssueCardOrBuilder() {
            return this.payloadCase_ == 2 ? (IssueCard) this.payload_ : IssueCard.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Nfc> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = this.payloadCase_ == 1 ? CodedOutputStream.computeBytesSize(1, (ByteString) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(2, (IssueCard) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(3, (CardData) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(4, (CardInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(5, (CardInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeBytesSize += GeneratedMessage.computeStringSize(6, this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(7, (BalanceInfo) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeBytesSize += GeneratedMessage.computeStringSize(8, this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(9, (CommandInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(10, ((Integer) this.payload_).intValue());
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasAid() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasBalanceInfo() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasCapability() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasCardData() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasCardInfo() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasCardInfoList() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasCommand() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasCommandInfoList() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasConfig() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.wear.protobuf.NfcProtos.NfcOrBuilder
        public boolean hasIssueCard() {
            return this.payloadCase_ == 2;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            int iHashCode;
            String aid;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode2 = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode2 * 37) + 1) * 53;
                    iHashCode = getCommand().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getIssueCard().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getCardData().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getCardInfo().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getCardInfoList().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    aid = getAid();
                    iHashCode = aid.hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getBalanceInfo().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    aid = getConfig();
                    iHashCode = aid.hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 9:
                    i7 = ((iHashCode2 * 37) + 9) * 53;
                    iHashCode = getCommandInfoList().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 10:
                    i7 = ((iHashCode2 * 37) + 10) * 53;
                    iHashCode = getCapability();
                    iHashCode2 = i7 + iHashCode;
                    break;
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NfcProtos.internal_static_Nfc_fieldAccessorTable.ensureFieldAccessorsInitialized(Nfc.class, Builder.class);
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
            if (hasIssueCard() && !getIssueCard().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCardData() && !getCardData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCardInfo() && !getCardInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCardInfoList() && !getCardInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBalanceInfo() && !getBalanceInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCommandInfoList() || getCommandInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeBytes(1, (ByteString) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (IssueCard) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (CardData) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (CardInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (CardInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (BalanceInfo) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                GeneratedMessage.writeString(codedOutputStream, 8, this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (CommandInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeUInt32(10, ((Integer) this.payload_).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Nfc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Object bytes;
            int i7;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z6 = true;
                                break;
                            case 10:
                                this.payloadCase_ = 1;
                                bytes = codedInputStream.readBytes();
                                this.payload_ = bytes;
                                break;
                            case 18:
                                i7 = 2;
                                IssueCard.Builder builder = this.payloadCase_ == 2 ? ((IssueCard) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(IssueCard.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((IssueCard) message);
                                    this.payload_ = builder.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 26:
                                i7 = 3;
                                CardData.Builder builder2 = this.payloadCase_ == 3 ? ((CardData) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(CardData.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((CardData) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 34:
                                i7 = 4;
                                CardInfo.Builder builder3 = this.payloadCase_ == 4 ? ((CardInfo) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(CardInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((CardInfo) message3);
                                    this.payload_ = builder3.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 42:
                                i7 = 5;
                                CardInfo.List.Builder builder4 = this.payloadCase_ == 5 ? ((CardInfo.List) this.payload_).toBuilder() : null;
                                MessageLite message4 = codedInputStream.readMessage(CardInfo.List.PARSER, extensionRegistryLite);
                                this.payload_ = message4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((CardInfo.List) message4);
                                    this.payload_ = builder4.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 50:
                                bytes = codedInputStream.readBytes();
                                this.payloadCase_ = 6;
                                this.payload_ = bytes;
                                break;
                            case 58:
                                i7 = 7;
                                BalanceInfo.Builder builder5 = this.payloadCase_ == 7 ? ((BalanceInfo) this.payload_).toBuilder() : null;
                                MessageLite message5 = codedInputStream.readMessage(BalanceInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message5;
                                if (builder5 != null) {
                                    builder5.mergeFrom((BalanceInfo) message5);
                                    this.payload_ = builder5.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 66:
                                bytes = codedInputStream.readBytes();
                                this.payloadCase_ = 8;
                                this.payload_ = bytes;
                                break;
                            case 74:
                                i7 = 9;
                                CommandInfo.List.Builder builder6 = this.payloadCase_ == 9 ? ((CommandInfo.List) this.payload_).toBuilder() : null;
                                MessageLite message6 = codedInputStream.readMessage(CommandInfo.List.PARSER, extensionRegistryLite);
                                this.payload_ = message6;
                                if (builder6 != null) {
                                    builder6.mergeFrom((CommandInfo.List) message6);
                                    this.payload_ = builder6.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 80:
                                this.payloadCase_ = 10;
                                bytes = Integer.valueOf(codedInputStream.readUInt32());
                                this.payload_ = bytes;
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    z6 = true;
                                }
                                break;
                        }
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

        public static Builder newBuilder(Nfc nfc) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nfc);
        }

        public static Nfc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Nfc) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Nfc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Nfc parseFrom(CodedInputStream codedInputStream) {
            return (Nfc) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Nfc getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Nfc(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Nfc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Nfc) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Nfc parseFrom(InputStream inputStream) {
            return (Nfc) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Nfc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Nfc) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Nfc parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Nfc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Nfc parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Nfc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface NfcOrBuilder extends MessageOrBuilder {
        String getAid();

        ByteString getAidBytes();

        BalanceInfo getBalanceInfo();

        BalanceInfoOrBuilder getBalanceInfoOrBuilder();

        int getCapability();

        CardData getCardData();

        CardDataOrBuilder getCardDataOrBuilder();

        CardInfo getCardInfo();

        CardInfo.List getCardInfoList();

        CardInfo.ListOrBuilder getCardInfoListOrBuilder();

        CardInfoOrBuilder getCardInfoOrBuilder();

        ByteString getCommand();

        CommandInfo.List getCommandInfoList();

        CommandInfo.ListOrBuilder getCommandInfoListOrBuilder();

        String getConfig();

        ByteString getConfigBytes();

        IssueCard getIssueCard();

        IssueCardOrBuilder getIssueCardOrBuilder();

        Nfc.PayloadCase getPayloadCase();

        boolean hasAid();

        boolean hasBalanceInfo();

        boolean hasCapability();

        boolean hasCardData();

        boolean hasCardInfo();

        boolean hasCardInfoList();

        boolean hasCommand();

        boolean hasCommandInfoList();

        boolean hasConfig();

        boolean hasIssueCard();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000ewear_nfc.proto\u001a\fnanopb.proto\"\u00ad\u0004\n\u0003Nfc\u0012\u0018\n\u0007command\u0018\u0001 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012 \n\nissue_card\u0018\u0002 \u0001(\u000b2\n.IssueCardH\u0000\u0012\u001e\n\tcard_data\u0018\u0003 \u0001(\u000b2\t.CardDataH\u0000\u0012\u001e\n\tcard_info\u0018\u0004 \u0001(\u000b2\t.CardInfoH\u0000\u0012(\n\u000ecard_info_list\u0018\u0005 \u0001(\u000b2\u000e.CardInfo.ListH\u0000\u0012\u0014\n\u0003aid\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012$\n\fbalance_info\u0018\u0007 \u0001(\u000b2\f.BalanceInfoH\u0000\u0012\u0017\n\u0006config\u0018\b \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012.\n\u0011command_info_list\u0018\t \u0001(\u000b2\u0011.CommandInfo.ListH\u0000\u0012\u0014\n\ncapability\u0018\n \u0001(\rH\u0000\"Ù\u0001\n\u0005NfcID\u0012\u000b\n\u0007COMMAND\u0010\u0000\u0012\u000e\n\nISSUE_CARD\u0010\u0001\u0012\f\n\bADD_CARD\u0010\u0002\u0012\f\n\bDEL_CARD\u0010\u0003\u0012\u0012\n\u000eSYNC_CARD_LIST\u0010\u0004\u0012\u0014\n\u0010SET_DEFAULT_CARD\u0010\u0005\u0012\u0014\n\u0010GET_DEFAULT_CARD\u0010\u0006\u0012\u000f\n\u000bSET_BALANCE\u0010\u0007\u0012\u000f\n\u000bGET_BALANCE\u0010\b\u0012\u000e\n\nSET_CONFIG\u0010\t\u0012\u0012\n\u000eCAPABILITY_SET\u0010\n\u0012\u0011\n\rCOMMAND_BATCH\u0010\u0010B\t\n\u0007payload\"\u0090\u0001\n\tIssueCard\u0012 \n\u0006status\u0018\u0001 \u0002(\u000e2\u0010.IssueCardStatus\u0012\u001c\n\u0004type\u0018\u0002 \u0001(\u000e2\u000e.IssueCardType\u0012\u0016\n\u000eneed_read_card\u0018\u0003 \u0001(\b\u0012\u0017\n\bicon_url\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003sid\u0018\u0005 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"m\n\bCardData\u0012\u0012\n\u0003uid\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003sak\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0013\n\u0004atqa\u0018\u0003 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\f\n\u0004size\u0018\u0004 \u0002(\r\u0012\u0016\n\u0007content\u0018\u0005 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"¾\u0002\n\bCardInfo\u0012\u001c\n\u0004type\u0018\u0001 \u0002(\u000e2\u000e.IssueCardType\u0012\u0012\n\u0003aid\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004name\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\bicon_url\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003sid\u0018\u0005 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u000f\n\u0007balance\u0018\u0006 \u0001(\r\u0012\u0013\n\u000bsupport_hci\u0018\u0007 \u0001(\b\u0012\u0014\n\ftrade_length\u0018\b \u0001(\r\u0012\u0014\n\ftrade_offset\u0018\t \u0001(\r\u0012\u0016\n\u000ebalance_offset\u0018\n \u0001(\r\u0012\u001e\n\u000fbalance_command\u0018\f \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\u001a4\n\u0004List\u0012\u001e\n\u0004list\u0018\u0001 \u0003(\u000b2\t.CardInfoB\u0005\u0092?\u0002\u0018\u0004\u0012\f\n\u0004full\u0018\u0002 \u0001(\b\"2\n\u000bBalanceInfo\u0012\u0012\n\u0003aid\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u000f\n\u0007balance\u0018\u0002 \u0002(\r\"k\n\u000bCommandInfo\u0012\u0013\n\u0004data\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rexpect_status\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001a)\n\u0004List\u0012!\n\u0004list\u0018\u0001 \u0003(\u000b2\f.CommandInfoB\u0005\u0092?\u0002\u0018\u0004*6\n\u000fIssueCardStatus\u0012\t\n\u0005START\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u000b\n\u0007FAILURE\u0010\u0002*K\n\rIssueCardType\u0012\r\n\tDOOR_CARD\u0010\u0000\u0012\f\n\bBUS_CARD\u0010\u0001\u0012\r\n\tBANK_CARD\u0010\u0002\u0012\u000e\n\nCLOUD_CARD\u0010\u0003B!\n\u0014com.zh.wear.protobufB\tNfcProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.NfcProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = NfcProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Nfc_descriptor = descriptor2;
        internal_static_Nfc_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Command", "IssueCard", "CardData", "CardInfo", "CardInfoList", "Aid", "BalanceInfo", "Config", "CommandInfoList", "Capability", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_IssueCard_descriptor = descriptor3;
        internal_static_IssueCard_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Status", "Type", "NeedReadCard", "IconUrl", "Sid"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_CardData_descriptor = descriptor4;
        internal_static_CardData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Uid", "Sak", "Atqa", "Size", "Content"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_CardInfo_descriptor = descriptor5;
        internal_static_CardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Type", "Aid", "Name", "IconUrl", "Sid", "Balance", "SupportHci", "TradeLength", "TradeOffset", "BalanceOffset", "BalanceCommand"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_CardInfo_List_descriptor = descriptor6;
        internal_static_CardInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{MessageLiteToString.f20028a, "Full"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_BalanceInfo_descriptor = descriptor7;
        internal_static_BalanceInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Aid", "Balance"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(5);
        internal_static_CommandInfo_descriptor = descriptor8;
        internal_static_CommandInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Data", "ExpectStatus"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_CommandInfo_List_descriptor = descriptor9;
        internal_static_CommandInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{MessageLiteToString.f20028a});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private NfcProtos() {
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