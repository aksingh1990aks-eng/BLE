package com.zh.wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.work.WorkInfo;
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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import com.zh.wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class WatchFaceProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_BgImageResult_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BgImageResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EditRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EditRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_EditResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EditResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_InstallResult_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_InstallResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_PrepareInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PrepareInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WatchFaceInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WatchFaceInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WatchFaceInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WatchFaceInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WatchFaceItem_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WatchFaceItem_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WatchFaceItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WatchFaceItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WatchFaceSlot_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WatchFaceSlot_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WatchFaceSlot_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WatchFaceSlot_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WatchFace_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WatchFace_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.WatchFaceProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase;

        static {
            int[] iArr = new int[WatchFace.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase = iArr;
            try {
                iArr[WatchFace.PayloadCase.WATCH_FACE_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.PATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.PREPARE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.PREPARE_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.INSTALL_RESULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.INFO_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.SUPPORT_DATA_LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.EDIT_REQUEST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.EDIT_RESPONSE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.BG_IMAGE_RESULT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[WatchFace.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static final class BgImageResult extends GeneratedMessageV3 implements BgImageResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private static final BgImageResult DEFAULT_INSTANCE = new BgImageResult();

        @Deprecated
        public static final Parser<BgImageResult> PARSER = new AbstractParser<BgImageResult>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.BgImageResult.1
            @Override // com.google.protobuf.Parser
            public BgImageResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BgImageResult(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BgImageResultOrBuilder {
            private int bitField0_;
            private int code_;
            private Object id_;

            private Builder() {
                this.code_ = 0;
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_BgImageResult_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -3;
                this.id_ = BgImageResult.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
            public Code getCode() {
                Code codeValueOf = Code.valueOf(this.code_);
                return codeValueOf == null ? Code.SUCCESS : codeValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_BgImageResult_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_BgImageResult_fieldAccessorTable.ensureFieldAccessorsInitialized(BgImageResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCode();
            }

            public Builder setCode(Code code) {
                code.getClass();
                this.bitField0_ |= 1;
                this.code_ = code.getNumber();
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.code_ = 0;
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BgImageResult build() {
                BgImageResult bgImageResultBuildPartial = buildPartial();
                if (bgImageResultBuildPartial.isInitialized()) {
                    return bgImageResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bgImageResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BgImageResult buildPartial() {
                BgImageResult bgImageResult = new BgImageResult(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bgImageResult.code_ = this.code_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                bgImageResult.id_ = this.id_;
                bgImageResult.bitField0_ = i8;
                onBuilt();
                return bgImageResult;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BgImageResult getDefaultInstanceForType() {
                return BgImageResult.getDefaultInstance();
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
                this.code_ = 0;
                int i7 = this.bitField0_;
                this.id_ = "";
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
            public com.zh.wear.protobuf.WatchFaceProtos.BgImageResult.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$BgImageResult> r1 = com.zh.wear.protobuf.WatchFaceProtos.BgImageResult.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$BgImageResult r3 = (com.zh.wear.protobuf.WatchFaceProtos.BgImageResult) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$BgImageResult r4 = (com.zh.wear.protobuf.WatchFaceProtos.BgImageResult) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.BgImageResult.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$BgImageResult$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BgImageResult) {
                    return mergeFrom((BgImageResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BgImageResult bgImageResult) {
                if (bgImageResult == BgImageResult.getDefaultInstance()) {
                    return this;
                }
                if (bgImageResult.hasCode()) {
                    setCode(bgImageResult.getCode());
                }
                if (bgImageResult.hasId()) {
                    this.bitField0_ |= 2;
                    this.id_ = bgImageResult.id_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) bgImageResult).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum Code implements ProtocolMessageEnum {
            SUCCESS(0),
            IMAGE_SAVE_FAILED(1),
            IMAGE_RESOLVE_FAILED(2),
            NO_WATCH_FACE_MATCHED(3);

            public static final int IMAGE_RESOLVE_FAILED_VALUE = 2;
            public static final int IMAGE_SAVE_FAILED_VALUE = 1;
            public static final int NO_WATCH_FACE_MATCHED_VALUE = 3;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Code> internalValueMap = new Internal.EnumLiteMap<Code>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.BgImageResult.Code.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Code findValueByNumber(int i7) {
                    return Code.forNumber(i7);
                }
            };
            private static final Code[] VALUES = values();

            Code(int i7) {
                this.value = i7;
            }

            public static Code forNumber(int i7) {
                if (i7 == 0) {
                    return SUCCESS;
                }
                if (i7 == 1) {
                    return IMAGE_SAVE_FAILED;
                }
                if (i7 == 2) {
                    return IMAGE_RESOLVE_FAILED;
                }
                if (i7 != 3) {
                    return null;
                }
                return NO_WATCH_FACE_MATCHED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return BgImageResult.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Code> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Code valueOf(int i7) {
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

            public static Code valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private BgImageResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
            this.id_ = "";
        }

        public static BgImageResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_BgImageResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BgImageResult parseDelimitedFrom(InputStream inputStream) {
            return (BgImageResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BgImageResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BgImageResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BgImageResult)) {
                return super.equals(obj);
            }
            BgImageResult bgImageResult = (BgImageResult) obj;
            boolean z6 = hasCode() == bgImageResult.hasCode();
            if (hasCode()) {
                z6 = z6 && this.code_ == bgImageResult.code_;
            }
            boolean z7 = z6 && hasId() == bgImageResult.hasId();
            if (hasId()) {
                z7 = z7 && getId().equals(bgImageResult.getId());
            }
            return z7 && this.unknownFields.equals(bgImageResult.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
        public Code getCode() {
            Code codeValueOf = Code.valueOf(this.code_);
            return codeValueOf == null ? Code.SUCCESS : codeValueOf;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
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
        public Parser<BgImageResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.code_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.id_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.BgImageResultOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasCode()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.code_;
            }
            if (hasId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getId().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_BgImageResult_fieldAccessorTable.ensureFieldAccessorsInitialized(BgImageResult.class, Builder.class);
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
            if (hasCode()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.code_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.id_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BgImageResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                if (Code.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.code_ = i7;
                                }
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.id_ = bytes;
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

        public static Builder newBuilder(BgImageResult bgImageResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bgImageResult);
        }

        public static BgImageResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BgImageResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BgImageResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BgImageResult parseFrom(CodedInputStream codedInputStream) {
            return (BgImageResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BgImageResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BgImageResult(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BgImageResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BgImageResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BgImageResult parseFrom(InputStream inputStream) {
            return (BgImageResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BgImageResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BgImageResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BgImageResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BgImageResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BgImageResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BgImageResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BgImageResultOrBuilder extends MessageOrBuilder {
        BgImageResult.Code getCode();

        String getId();

        ByteString getIdBytes();

        boolean hasCode();

        boolean hasId();
    }

    public static final class EditRequest extends GeneratedMessageV3 implements EditRequestOrBuilder {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
        public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 4;
        public static final int BACKGROUND_IMAGE_SIZE_FIELD_NUMBER = 5;
        public static final int DATA_LIST_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int SET_CURRENT_FIELD_NUMBER = 2;
        public static final int STYLE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private volatile Object backgroundColor_;
        private int backgroundImageSize_;
        private volatile Object backgroundImage_;
        private int bitField0_;
        private List<Integer> dataList_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private boolean setCurrent_;
        private volatile Object style_;
        private static final Internal.ListAdapter.Converter<Integer, WatchFaceSlot.Data> dataList_converter_ = new Internal.ListAdapter.Converter<Integer, WatchFaceSlot.Data>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.EditRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public WatchFaceSlot.Data convert(Integer num) {
                WatchFaceSlot.Data dataValueOf = WatchFaceSlot.Data.valueOf(num.intValue());
                return dataValueOf == null ? WatchFaceSlot.Data.EMPTY : dataValueOf;
            }
        };
        private static final EditRequest DEFAULT_INSTANCE = new EditRequest();

        @Deprecated
        public static final Parser<EditRequest> PARSER = new AbstractParser<EditRequest>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.EditRequest.2
            @Override // com.google.protobuf.Parser
            public EditRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EditRequest(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EditRequestOrBuilder {
            private Object backgroundColor_;
            private int backgroundImageSize_;
            private Object backgroundImage_;
            private int bitField0_;
            private List<Integer> dataList_;
            private Object id_;
            private boolean setCurrent_;
            private Object style_;

            private Builder() {
                this.id_ = "";
                this.backgroundColor_ = "";
                this.backgroundImage_ = "";
                this.style_ = "";
                this.dataList_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureDataListIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.dataList_ = new ArrayList(this.dataList_);
                    this.bitField0_ |= 64;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_EditRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllDataList(Iterable<? extends WatchFaceSlot.Data> iterable) {
                ensureDataListIsMutable();
                Iterator<? extends WatchFaceSlot.Data> it = iterable.iterator();
                while (it.hasNext()) {
                    this.dataList_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addDataList(WatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.add(Integer.valueOf(data.getNumber()));
                onChanged();
                return this;
            }

            public Builder clearBackgroundColor() {
                this.bitField0_ &= -5;
                this.backgroundColor_ = EditRequest.getDefaultInstance().getBackgroundColor();
                onChanged();
                return this;
            }

            public Builder clearBackgroundImage() {
                this.bitField0_ &= -9;
                this.backgroundImage_ = EditRequest.getDefaultInstance().getBackgroundImage();
                onChanged();
                return this;
            }

            public Builder clearBackgroundImageSize() {
                this.bitField0_ &= -17;
                this.backgroundImageSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDataList() {
                this.dataList_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = EditRequest.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearSetCurrent() {
                this.bitField0_ &= -3;
                this.setCurrent_ = false;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.bitField0_ &= -33;
                this.style_ = EditRequest.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public String getBackgroundColor() {
                Object obj = this.backgroundColor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.backgroundColor_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public ByteString getBackgroundColorBytes() {
                Object obj = this.backgroundColor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundColor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public String getBackgroundImage() {
                Object obj = this.backgroundImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.backgroundImage_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public ByteString getBackgroundImageBytes() {
                Object obj = this.backgroundImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundImage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public int getBackgroundImageSize() {
                return this.backgroundImageSize_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public WatchFaceSlot.Data getDataList(int i7) {
                return (WatchFaceSlot.Data) EditRequest.dataList_converter_.convert(this.dataList_.get(i7));
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public int getDataListCount() {
                return this.dataList_.size();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public List<WatchFaceSlot.Data> getDataListList() {
                return new Internal.ListAdapter(this.dataList_, EditRequest.dataList_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_EditRequest_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public boolean getSetCurrent() {
                return this.setCurrent_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.style_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public boolean hasBackgroundColor() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public boolean hasBackgroundImage() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public boolean hasBackgroundImageSize() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public boolean hasSetCurrent() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
            public boolean hasStyle() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_EditRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EditRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasSetCurrent();
            }

            public Builder setBackgroundColor(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.backgroundColor_ = str;
                onChanged();
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.backgroundColor_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBackgroundImage(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.backgroundImage_ = str;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.backgroundImage_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageSize(int i7) {
                this.bitField0_ |= 16;
                this.backgroundImageSize_ = i7;
                onChanged();
                return this;
            }

            public Builder setDataList(int i7, WatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.set(i7, Integer.valueOf(data.getNumber()));
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSetCurrent(boolean z6) {
                this.bitField0_ |= 2;
                this.setCurrent_ = z6;
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.style_ = str;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.style_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.backgroundColor_ = "";
                this.backgroundImage_ = "";
                this.style_ = "";
                this.dataList_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EditRequest build() {
                EditRequest editRequestBuildPartial = buildPartial();
                if (editRequestBuildPartial.isInitialized()) {
                    return editRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) editRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EditRequest buildPartial() {
                EditRequest editRequest = new EditRequest(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                editRequest.id_ = this.id_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                editRequest.setCurrent_ = this.setCurrent_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                editRequest.backgroundColor_ = this.backgroundColor_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                editRequest.backgroundImage_ = this.backgroundImage_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                editRequest.backgroundImageSize_ = this.backgroundImageSize_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                editRequest.style_ = this.style_;
                if ((this.bitField0_ & 64) == 64) {
                    this.dataList_ = Collections.unmodifiableList(this.dataList_);
                    this.bitField0_ &= -65;
                }
                editRequest.dataList_ = this.dataList_;
                editRequest.bitField0_ = i8;
                onBuilt();
                return editRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EditRequest getDefaultInstanceForType() {
                return EditRequest.getDefaultInstance();
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
                this.id_ = "";
                int i7 = this.bitField0_;
                this.setCurrent_ = false;
                this.backgroundColor_ = "";
                this.backgroundImage_ = "";
                this.backgroundImageSize_ = 0;
                this.style_ = "";
                this.bitField0_ = i7 & (-64);
                this.dataList_ = Collections.EMPTY_LIST;
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
            public com.zh.wear.protobuf.WatchFaceProtos.EditRequest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$EditRequest> r1 = com.zh.wear.protobuf.WatchFaceProtos.EditRequest.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$EditRequest r3 = (com.zh.wear.protobuf.WatchFaceProtos.EditRequest) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$EditRequest r4 = (com.zh.wear.protobuf.WatchFaceProtos.EditRequest) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.EditRequest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$EditRequest$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EditRequest) {
                    return mergeFrom((EditRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EditRequest editRequest) {
                if (editRequest == EditRequest.getDefaultInstance()) {
                    return this;
                }
                if (editRequest.hasId()) {
                    this.bitField0_ |= 1;
                    this.id_ = editRequest.id_;
                    onChanged();
                }
                if (editRequest.hasSetCurrent()) {
                    setSetCurrent(editRequest.getSetCurrent());
                }
                if (editRequest.hasBackgroundColor()) {
                    this.bitField0_ |= 4;
                    this.backgroundColor_ = editRequest.backgroundColor_;
                    onChanged();
                }
                if (editRequest.hasBackgroundImage()) {
                    this.bitField0_ |= 8;
                    this.backgroundImage_ = editRequest.backgroundImage_;
                    onChanged();
                }
                if (editRequest.hasBackgroundImageSize()) {
                    setBackgroundImageSize(editRequest.getBackgroundImageSize());
                }
                if (editRequest.hasStyle()) {
                    this.bitField0_ |= 32;
                    this.style_ = editRequest.style_;
                    onChanged();
                }
                if (!editRequest.dataList_.isEmpty()) {
                    if (this.dataList_.isEmpty()) {
                        this.dataList_ = editRequest.dataList_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureDataListIsMutable();
                        this.dataList_.addAll(editRequest.dataList_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) editRequest).unknownFields);
                onChanged();
                return this;
            }
        }

        private EditRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.setCurrent_ = false;
            this.backgroundColor_ = "";
            this.backgroundImage_ = "";
            this.backgroundImageSize_ = 0;
            this.style_ = "";
            this.dataList_ = Collections.EMPTY_LIST;
        }

        public static EditRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_EditRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EditRequest parseDelimitedFrom(InputStream inputStream) {
            return (EditRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EditRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EditRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EditRequest)) {
                return super.equals(obj);
            }
            EditRequest editRequest = (EditRequest) obj;
            boolean z6 = hasId() == editRequest.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(editRequest.getId());
            }
            boolean z7 = z6 && hasSetCurrent() == editRequest.hasSetCurrent();
            if (hasSetCurrent()) {
                z7 = z7 && getSetCurrent() == editRequest.getSetCurrent();
            }
            boolean z8 = z7 && hasBackgroundColor() == editRequest.hasBackgroundColor();
            if (hasBackgroundColor()) {
                z8 = z8 && getBackgroundColor().equals(editRequest.getBackgroundColor());
            }
            boolean z9 = z8 && hasBackgroundImage() == editRequest.hasBackgroundImage();
            if (hasBackgroundImage()) {
                z9 = z9 && getBackgroundImage().equals(editRequest.getBackgroundImage());
            }
            boolean z10 = z9 && hasBackgroundImageSize() == editRequest.hasBackgroundImageSize();
            if (hasBackgroundImageSize()) {
                z10 = z10 && getBackgroundImageSize() == editRequest.getBackgroundImageSize();
            }
            boolean z11 = z10 && hasStyle() == editRequest.hasStyle();
            if (hasStyle()) {
                z11 = z11 && getStyle().equals(editRequest.getStyle());
            }
            return (z11 && this.dataList_.equals(editRequest.dataList_)) && this.unknownFields.equals(editRequest.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public String getBackgroundColor() {
            Object obj = this.backgroundColor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.backgroundColor_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public ByteString getBackgroundColorBytes() {
            Object obj = this.backgroundColor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundColor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public String getBackgroundImage() {
            Object obj = this.backgroundImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.backgroundImage_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public ByteString getBackgroundImageBytes() {
            Object obj = this.backgroundImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundImage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public int getBackgroundImageSize() {
            return this.backgroundImageSize_;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public WatchFaceSlot.Data getDataList(int i7) {
            return dataList_converter_.convert(this.dataList_.get(i7));
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public int getDataListCount() {
            return this.dataList_.size();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public List<WatchFaceSlot.Data> getDataListList() {
            return new Internal.ListAdapter(this.dataList_, dataList_converter_);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
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
        public Parser<EditRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(2, this.setCurrent_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.backgroundColor_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.backgroundImage_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.backgroundImageSize_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeStringSize += GeneratedMessage.computeStringSize(6, this.style_);
            }
            int iComputeEnumSizeNoTag = 0;
            for (int i8 = 0; i8 < this.dataList_.size(); i8++) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.dataList_.get(i8).intValue());
            }
            int size = iComputeStringSize + iComputeEnumSizeNoTag + this.dataList_.size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public boolean getSetCurrent() {
            return this.setCurrent_;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.style_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public boolean hasBackgroundColor() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public boolean hasBackgroundImage() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public boolean hasBackgroundImageSize() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public boolean hasSetCurrent() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditRequestOrBuilder
        public boolean hasStyle() {
            return (this.bitField0_ & 32) == 32;
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
            if (hasSetCurrent()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getSetCurrent());
            }
            if (hasBackgroundColor()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getBackgroundColor().hashCode();
            }
            if (hasBackgroundImage()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getBackgroundImage().hashCode();
            }
            if (hasBackgroundImageSize()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getBackgroundImageSize();
            }
            if (hasStyle()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getStyle().hashCode();
            }
            if (getDataListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + this.dataList_.hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_EditRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EditRequest.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetCurrent()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBool(2, this.setCurrent_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.backgroundColor_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.backgroundImage_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeUInt32(5, this.backgroundImageSize_);
            }
            if ((this.bitField0_ & 32) == 32) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.style_);
            }
            for (int i7 = 0; i7 < this.dataList_.size(); i7++) {
                codedOutputStream.writeEnum(7, this.dataList_.get(i7).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private EditRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            char c7 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.id_ = bytes;
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.setCurrent_ = codedInputStream.readBool();
                            } else if (tag == 26) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.backgroundColor_ = bytes2;
                            } else if (tag == 34) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.backgroundImage_ = bytes3;
                            } else if (tag == 40) {
                                this.bitField0_ |= 16;
                                this.backgroundImageSize_ = codedInputStream.readUInt32();
                            } else if (tag == 50) {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 32;
                                this.style_ = bytes4;
                            } else if (tag == 56) {
                                int i7 = codedInputStream.readEnum();
                                if (WatchFaceSlot.Data.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(7, i7);
                                } else {
                                    if ((c7 & '@') != 64) {
                                        this.dataList_ = new ArrayList();
                                        c7 = '@';
                                    }
                                    this.dataList_.add(Integer.valueOf(i7));
                                }
                            } else if (tag == 58) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int i8 = codedInputStream.readEnum();
                                    if (WatchFaceSlot.Data.valueOf(i8) == null) {
                                        builderNewBuilder.mergeVarintField(7, i8);
                                    } else {
                                        if ((c7 & '@') != 64) {
                                            this.dataList_ = new ArrayList();
                                            c7 = '@';
                                        }
                                        this.dataList_.add(Integer.valueOf(i8));
                                    }
                                }
                                codedInputStream.popLimit(iPushLimit);
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
                    if ((c7 & '@') == 64) {
                        this.dataList_ = Collections.unmodifiableList(this.dataList_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c7 & '@') == 64) {
                this.dataList_ = Collections.unmodifiableList(this.dataList_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(EditRequest editRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(editRequest);
        }

        public static EditRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EditRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EditRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EditRequest parseFrom(CodedInputStream codedInputStream) {
            return (EditRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EditRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private EditRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EditRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EditRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EditRequest parseFrom(InputStream inputStream) {
            return (EditRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EditRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EditRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EditRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static EditRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static EditRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EditRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface EditRequestOrBuilder extends MessageOrBuilder {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        String getBackgroundImage();

        ByteString getBackgroundImageBytes();

        int getBackgroundImageSize();

        WatchFaceSlot.Data getDataList(int i7);

        int getDataListCount();

        List<WatchFaceSlot.Data> getDataListList();

        String getId();

        ByteString getIdBytes();

        boolean getSetCurrent();

        String getStyle();

        ByteString getStyleBytes();

        boolean hasBackgroundColor();

        boolean hasBackgroundImage();

        boolean hasBackgroundImageSize();

        boolean hasId();

        boolean hasSetCurrent();

        boolean hasStyle();
    }

    public static final class EditResponse extends GeneratedMessageV3 implements EditResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private static final EditResponse DEFAULT_INSTANCE = new EditResponse();

        @Deprecated
        public static final Parser<EditResponse> PARSER = new AbstractParser<EditResponse>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.EditResponse.1
            @Override // com.google.protobuf.Parser
            public EditResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EditResponse(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EditResponseOrBuilder {
            private int bitField0_;
            private int code_;
            private Object id_;

            private Builder() {
                this.id_ = "";
                this.code_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_EditResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.bitField0_ &= -3;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = EditResponse.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
            public Code getCode() {
                Code codeValueOf = Code.valueOf(this.code_);
                return codeValueOf == null ? Code.SUCCESS : codeValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_EditResponse_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_EditResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EditResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasCode();
            }

            public Builder setCode(Code code) {
                code.getClass();
                this.bitField0_ |= 2;
                this.code_ = code.getNumber();
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.code_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EditResponse build() {
                EditResponse editResponseBuildPartial = buildPartial();
                if (editResponseBuildPartial.isInitialized()) {
                    return editResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) editResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EditResponse buildPartial() {
                EditResponse editResponse = new EditResponse(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                editResponse.id_ = this.id_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                editResponse.code_ = this.code_;
                editResponse.bitField0_ = i8;
                onBuilt();
                return editResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EditResponse getDefaultInstanceForType() {
                return EditResponse.getDefaultInstance();
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
                this.id_ = "";
                int i7 = this.bitField0_;
                this.code_ = 0;
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
            public com.zh.wear.protobuf.WatchFaceProtos.EditResponse.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$EditResponse> r1 = com.zh.wear.protobuf.WatchFaceProtos.EditResponse.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$EditResponse r3 = (com.zh.wear.protobuf.WatchFaceProtos.EditResponse) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$EditResponse r4 = (com.zh.wear.protobuf.WatchFaceProtos.EditResponse) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.EditResponse.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$EditResponse$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EditResponse) {
                    return mergeFrom((EditResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EditResponse editResponse) {
                if (editResponse == EditResponse.getDefaultInstance()) {
                    return this;
                }
                if (editResponse.hasId()) {
                    this.bitField0_ |= 1;
                    this.id_ = editResponse.id_;
                    onChanged();
                }
                if (editResponse.hasCode()) {
                    setCode(editResponse.getCode());
                }
                mergeUnknownFields(((GeneratedMessage) editResponse).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum Code implements ProtocolMessageEnum {
            SUCCESS(0),
            SUCCESS_BUT_LOW_STORAGE(1),
            FAIL_FOR_LOW_STORAGE(2),
            FAIL_FOR_INVALID_PARAM(3),
            FAIL(4);

            public static final int FAIL_FOR_INVALID_PARAM_VALUE = 3;
            public static final int FAIL_FOR_LOW_STORAGE_VALUE = 2;
            public static final int FAIL_VALUE = 4;
            public static final int SUCCESS_BUT_LOW_STORAGE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Code> internalValueMap = new Internal.EnumLiteMap<Code>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.EditResponse.Code.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Code findValueByNumber(int i7) {
                    return Code.forNumber(i7);
                }
            };
            private static final Code[] VALUES = values();

            Code(int i7) {
                this.value = i7;
            }

            public static Code forNumber(int i7) {
                if (i7 == 0) {
                    return SUCCESS;
                }
                if (i7 == 1) {
                    return SUCCESS_BUT_LOW_STORAGE;
                }
                if (i7 == 2) {
                    return FAIL_FOR_LOW_STORAGE;
                }
                if (i7 == 3) {
                    return FAIL_FOR_INVALID_PARAM;
                }
                if (i7 != 4) {
                    return null;
                }
                return FAIL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EditResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Code> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Code valueOf(int i7) {
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

            public static Code valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private EditResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.code_ = 0;
        }

        public static EditResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_EditResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EditResponse parseDelimitedFrom(InputStream inputStream) {
            return (EditResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EditResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EditResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EditResponse)) {
                return super.equals(obj);
            }
            EditResponse editResponse = (EditResponse) obj;
            boolean z6 = hasId() == editResponse.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(editResponse.getId());
            }
            boolean z7 = z6 && hasCode() == editResponse.hasCode();
            if (hasCode()) {
                z7 = z7 && this.code_ == editResponse.code_;
            }
            return z7 && this.unknownFields.equals(editResponse.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
        public Code getCode() {
            Code codeValueOf = Code.valueOf(this.code_);
            return codeValueOf == null ? Code.SUCCESS : codeValueOf;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
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
        public Parser<EditResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.code_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.EditResponseOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
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
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_EditResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EditResponse.class, Builder.class);
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
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeEnum(2, this.code_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private EditResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.id_ = bytes;
                            } else if (tag == 16) {
                                int i7 = codedInputStream.readEnum();
                                if (Code.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(2, i7);
                                } else {
                                    this.bitField0_ |= 2;
                                    this.code_ = i7;
                                }
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

        public static Builder newBuilder(EditResponse editResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(editResponse);
        }

        public static EditResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EditResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EditResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EditResponse parseFrom(CodedInputStream codedInputStream) {
            return (EditResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EditResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private EditResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EditResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EditResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EditResponse parseFrom(InputStream inputStream) {
            return (EditResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EditResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EditResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EditResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static EditResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static EditResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EditResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface EditResponseOrBuilder extends MessageOrBuilder {
        EditResponse.Code getCode();

        String getId();

        ByteString getIdBytes();

        boolean hasCode();

        boolean hasId();
    }

    public static final class InstallResult extends GeneratedMessageV3 implements InstallResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int SUPPORT_EDIT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private boolean supportEdit_;
        private static final InstallResult DEFAULT_INSTANCE = new InstallResult();

        @Deprecated
        public static final Parser<InstallResult> PARSER = new AbstractParser<InstallResult>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.InstallResult.1
            @Override // com.google.protobuf.Parser
            public InstallResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new InstallResult(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstallResultOrBuilder {
            private int bitField0_;
            private int code_;
            private Object id_;
            private boolean supportEdit_;

            private Builder() {
                this.id_ = "";
                this.code_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_InstallResult_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.bitField0_ &= -3;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = InstallResult.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearSupportEdit() {
                this.bitField0_ &= -5;
                this.supportEdit_ = false;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
            public Code getCode() {
                Code codeValueOf = Code.valueOf(this.code_);
                return codeValueOf == null ? Code.VERIFY_FAILED : codeValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_InstallResult_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
            public boolean getSupportEdit() {
                return this.supportEdit_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
            public boolean hasSupportEdit() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_InstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(InstallResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasCode();
            }

            public Builder setCode(Code code) {
                code.getClass();
                this.bitField0_ |= 2;
                this.code_ = code.getNumber();
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSupportEdit(boolean z6) {
                this.bitField0_ |= 4;
                this.supportEdit_ = z6;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.code_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstallResult build() {
                InstallResult installResultBuildPartial = buildPartial();
                if (installResultBuildPartial.isInitialized()) {
                    return installResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) installResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstallResult buildPartial() {
                InstallResult installResult = new InstallResult(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                installResult.id_ = this.id_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                installResult.code_ = this.code_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                installResult.supportEdit_ = this.supportEdit_;
                installResult.bitField0_ = i8;
                onBuilt();
                return installResult;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InstallResult getDefaultInstanceForType() {
                return InstallResult.getDefaultInstance();
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
                this.id_ = "";
                int i7 = this.bitField0_;
                this.code_ = 0;
                this.supportEdit_ = false;
                this.bitField0_ = i7 & (-8);
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
            public com.zh.wear.protobuf.WatchFaceProtos.InstallResult.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$InstallResult> r1 = com.zh.wear.protobuf.WatchFaceProtos.InstallResult.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$InstallResult r3 = (com.zh.wear.protobuf.WatchFaceProtos.InstallResult) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$InstallResult r4 = (com.zh.wear.protobuf.WatchFaceProtos.InstallResult) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.InstallResult.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$InstallResult$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstallResult) {
                    return mergeFrom((InstallResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstallResult installResult) {
                if (installResult == InstallResult.getDefaultInstance()) {
                    return this;
                }
                if (installResult.hasId()) {
                    this.bitField0_ |= 1;
                    this.id_ = installResult.id_;
                    onChanged();
                }
                if (installResult.hasCode()) {
                    setCode(installResult.getCode());
                }
                if (installResult.hasSupportEdit()) {
                    setSupportEdit(installResult.getSupportEdit());
                }
                mergeUnknownFields(((GeneratedMessage) installResult).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum Code implements ProtocolMessageEnum {
            VERIFY_FAILED(0),
            INSTALL_FAILED(1),
            INSTALL_SUCCESS(2),
            INSTALL_USED(3);

            public static final int INSTALL_FAILED_VALUE = 1;
            public static final int INSTALL_SUCCESS_VALUE = 2;
            public static final int INSTALL_USED_VALUE = 3;
            public static final int VERIFY_FAILED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Code> internalValueMap = new Internal.EnumLiteMap<Code>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.InstallResult.Code.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Code findValueByNumber(int i7) {
                    return Code.forNumber(i7);
                }
            };
            private static final Code[] VALUES = values();

            Code(int i7) {
                this.value = i7;
            }

            public static Code forNumber(int i7) {
                if (i7 == 0) {
                    return VERIFY_FAILED;
                }
                if (i7 == 1) {
                    return INSTALL_FAILED;
                }
                if (i7 == 2) {
                    return INSTALL_SUCCESS;
                }
                if (i7 != 3) {
                    return null;
                }
                return INSTALL_USED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return InstallResult.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Code> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Code valueOf(int i7) {
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

            public static Code valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private InstallResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.code_ = 0;
            this.supportEdit_ = false;
        }

        public static InstallResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_InstallResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstallResult parseDelimitedFrom(InputStream inputStream) {
            return (InstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstallResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<InstallResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstallResult)) {
                return super.equals(obj);
            }
            InstallResult installResult = (InstallResult) obj;
            boolean z6 = hasId() == installResult.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(installResult.getId());
            }
            boolean z7 = z6 && hasCode() == installResult.hasCode();
            if (hasCode()) {
                z7 = z7 && this.code_ == installResult.code_;
            }
            boolean z8 = z7 && hasSupportEdit() == installResult.hasSupportEdit();
            if (hasSupportEdit()) {
                z8 = z8 && getSupportEdit() == installResult.getSupportEdit();
            }
            return z8 && this.unknownFields.equals(installResult.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
        public Code getCode() {
            Code codeValueOf = Code.valueOf(this.code_);
            return codeValueOf == null ? Code.VERIFY_FAILED : codeValueOf;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
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
        public Parser<InstallResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.code_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.supportEdit_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
        public boolean getSupportEdit() {
            return this.supportEdit_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.InstallResultOrBuilder
        public boolean hasSupportEdit() {
            return (this.bitField0_ & 4) == 4;
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
            if (hasSupportEdit()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getSupportEdit());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_InstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(InstallResult.class, Builder.class);
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
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeEnum(2, this.code_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.supportEdit_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private InstallResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.id_ = bytes;
                            } else if (tag == 16) {
                                int i7 = codedInputStream.readEnum();
                                if (Code.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(2, i7);
                                } else {
                                    this.bitField0_ |= 2;
                                    this.code_ = i7;
                                }
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.supportEdit_ = codedInputStream.readBool();
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

        public static Builder newBuilder(InstallResult installResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(installResult);
        }

        public static InstallResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstallResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstallResult parseFrom(CodedInputStream codedInputStream) {
            return (InstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstallResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private InstallResult(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstallResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InstallResult parseFrom(InputStream inputStream) {
            return (InstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static InstallResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstallResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static InstallResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static InstallResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstallResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface InstallResultOrBuilder extends MessageOrBuilder {
        InstallResult.Code getCode();

        String getId();

        ByteString getIdBytes();

        boolean getSupportEdit();

        boolean hasCode();

        boolean hasId();

        boolean hasSupportEdit();
    }

    public static final class PrepareInfo extends GeneratedMessageV3 implements PrepareInfoOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int VERSION_CODE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int size_;
        private long versionCode_;
        private static final PrepareInfo DEFAULT_INSTANCE = new PrepareInfo();

        @Deprecated
        public static final Parser<PrepareInfo> PARSER = new AbstractParser<PrepareInfo>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.PrepareInfo.1
            @Override // com.google.protobuf.Parser
            public PrepareInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PrepareInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PrepareInfoOrBuilder {
            private int bitField0_;
            private Object id_;
            private int size_;
            private long versionCode_;

            private Builder() {
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_PrepareInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = PrepareInfo.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVersionCode() {
                this.bitField0_ &= -5;
                this.versionCode_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_PrepareInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
            public long getVersionCode() {
                return this.versionCode_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_PrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PrepareInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasSize();
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSize(int i7) {
                this.bitField0_ |= 2;
                this.size_ = i7;
                onChanged();
                return this;
            }

            public Builder setVersionCode(long j7) {
                this.bitField0_ |= 4;
                this.versionCode_ = j7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PrepareInfo build() {
                PrepareInfo prepareInfoBuildPartial = buildPartial();
                if (prepareInfoBuildPartial.isInitialized()) {
                    return prepareInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) prepareInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PrepareInfo buildPartial() {
                PrepareInfo prepareInfo = new PrepareInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                prepareInfo.id_ = this.id_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                prepareInfo.size_ = this.size_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                prepareInfo.versionCode_ = this.versionCode_;
                prepareInfo.bitField0_ = i8;
                onBuilt();
                return prepareInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PrepareInfo getDefaultInstanceForType() {
                return PrepareInfo.getDefaultInstance();
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
                this.id_ = "";
                int i7 = this.bitField0_;
                this.size_ = 0;
                this.versionCode_ = 0L;
                this.bitField0_ = i7 & (-8);
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
            public com.zh.wear.protobuf.WatchFaceProtos.PrepareInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$PrepareInfo> r1 = com.zh.wear.protobuf.WatchFaceProtos.PrepareInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$PrepareInfo r3 = (com.zh.wear.protobuf.WatchFaceProtos.PrepareInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$PrepareInfo r4 = (com.zh.wear.protobuf.WatchFaceProtos.PrepareInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.PrepareInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$PrepareInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PrepareInfo) {
                    return mergeFrom((PrepareInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PrepareInfo prepareInfo) {
                if (prepareInfo == PrepareInfo.getDefaultInstance()) {
                    return this;
                }
                if (prepareInfo.hasId()) {
                    this.bitField0_ |= 1;
                    this.id_ = prepareInfo.id_;
                    onChanged();
                }
                if (prepareInfo.hasSize()) {
                    setSize(prepareInfo.getSize());
                }
                if (prepareInfo.hasVersionCode()) {
                    setVersionCode(prepareInfo.getVersionCode());
                }
                mergeUnknownFields(((GeneratedMessage) prepareInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        private PrepareInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.size_ = 0;
            this.versionCode_ = 0L;
        }

        public static PrepareInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_PrepareInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PrepareInfo parseDelimitedFrom(InputStream inputStream) {
            return (PrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PrepareInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<PrepareInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PrepareInfo)) {
                return super.equals(obj);
            }
            PrepareInfo prepareInfo = (PrepareInfo) obj;
            boolean z6 = hasId() == prepareInfo.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(prepareInfo.getId());
            }
            boolean z7 = z6 && hasSize() == prepareInfo.hasSize();
            if (hasSize()) {
                z7 = z7 && getSize() == prepareInfo.getSize();
            }
            boolean z8 = z7 && hasVersionCode() == prepareInfo.hasVersionCode();
            if (hasVersionCode()) {
                z8 = z8 && getVersionCode() == prepareInfo.getVersionCode();
            }
            return z8 && this.unknownFields.equals(prepareInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
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
        public Parser<PrepareInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.size_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(3, this.versionCode_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
        public long getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
        public boolean hasSize() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.PrepareInfoOrBuilder
        public boolean hasVersionCode() {
            return (this.bitField0_ & 4) == 4;
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
            if (hasSize()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSize();
            }
            if (hasVersionCode()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashLong(getVersionCode());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_PrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PrepareInfo.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSize()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.size_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeUInt64(3, this.versionCode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private PrepareInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.id_ = bytes;
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.size_ = codedInputStream.readUInt32();
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.versionCode_ = codedInputStream.readUInt64();
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

        public static Builder newBuilder(PrepareInfo prepareInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prepareInfo);
        }

        public static PrepareInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PrepareInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PrepareInfo parseFrom(CodedInputStream codedInputStream) {
            return (PrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PrepareInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private PrepareInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PrepareInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PrepareInfo parseFrom(InputStream inputStream) {
            return (PrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static PrepareInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PrepareInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static PrepareInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PrepareInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PrepareInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface PrepareInfoOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        int getSize();

        long getVersionCode();

        boolean hasId();

        boolean hasSize();

        boolean hasVersionCode();
    }

    public static final class WatchFace extends GeneratedMessageV3 implements WatchFaceOrBuilder {
        public static final int BG_IMAGE_RESULT_FIELD_NUMBER = 14;
        public static final int EDIT_REQUEST_FIELD_NUMBER = 12;
        public static final int EDIT_RESPONSE_FIELD_NUMBER = 13;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int INFO_LIST_FIELD_NUMBER = 8;
        public static final int INSTALL_RESULT_FIELD_NUMBER = 7;
        public static final int PATH_FIELD_NUMBER = 3;
        public static final int PREPARE_INFO_FIELD_NUMBER = 6;
        public static final int PREPARE_STATUS_FIELD_NUMBER = 5;
        public static final int SUCCESS_FIELD_NUMBER = 4;
        public static final int SUPPORT_DATA_LIST_FIELD_NUMBER = 11;
        public static final int WATCH_FACE_LIST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final WatchFace DEFAULT_INSTANCE = new WatchFace();

        @Deprecated
        public static final Parser<WatchFace> PARSER = new AbstractParser<WatchFace>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFace.1
            @Override // com.google.protobuf.Parser
            public WatchFace parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WatchFace(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WatchFaceOrBuilder {
            private SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> bgImageResultBuilder_;
            private int bitField0_;
            private SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> editRequestBuilder_;
            private SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> editResponseBuilder_;
            private SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> infoListBuilder_;
            private SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> installResultBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> prepareInfoBuilder_;
            private SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> supportDataListBuilder_;
            private SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> watchFaceListBuilder_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> getBgImageResultFieldBuilder() {
                if (this.bgImageResultBuilder_ == null) {
                    if (this.payloadCase_ != 14) {
                        this.payload_ = BgImageResult.getDefaultInstance();
                    }
                    this.bgImageResultBuilder_ = new SingleFieldBuilderV3<>((BgImageResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 14;
                onChanged();
                return this.bgImageResultBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_WatchFace_descriptor;
            }

            private SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> getEditRequestFieldBuilder() {
                if (this.editRequestBuilder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = EditRequest.getDefaultInstance();
                    }
                    this.editRequestBuilder_ = new SingleFieldBuilderV3<>((EditRequest) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.editRequestBuilder_;
            }

            private SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> getEditResponseFieldBuilder() {
                if (this.editResponseBuilder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = EditResponse.getDefaultInstance();
                    }
                    this.editResponseBuilder_ = new SingleFieldBuilderV3<>((EditResponse) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.editResponseBuilder_;
            }

            private SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> getInfoListFieldBuilder() {
                if (this.infoListBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = WatchFaceInfo.List.getDefaultInstance();
                    }
                    this.infoListBuilder_ = new SingleFieldBuilderV3<>((WatchFaceInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.infoListBuilder_;
            }

            private SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> getInstallResultFieldBuilder() {
                if (this.installResultBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = InstallResult.getDefaultInstance();
                    }
                    this.installResultBuilder_ = new SingleFieldBuilderV3<>((InstallResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.installResultBuilder_;
            }

            private SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> getPrepareInfoFieldBuilder() {
                if (this.prepareInfoBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = PrepareInfo.getDefaultInstance();
                    }
                    this.prepareInfoBuilder_ = new SingleFieldBuilderV3<>((PrepareInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.prepareInfoBuilder_;
            }

            private SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> getSupportDataListFieldBuilder() {
                if (this.supportDataListBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = WatchFaceSlot.List.getDefaultInstance();
                    }
                    this.supportDataListBuilder_ = new SingleFieldBuilderV3<>((WatchFaceSlot.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.supportDataListBuilder_;
            }

            private SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> getWatchFaceListFieldBuilder() {
                if (this.watchFaceListBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = WatchFaceItem.List.getDefaultInstance();
                    }
                    this.watchFaceListBuilder_ = new SingleFieldBuilderV3<>((WatchFaceItem.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.watchFaceListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBgImageResult() {
                SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> singleFieldBuilderV3 = this.bgImageResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 14) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 14) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearEditRequest() {
                SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> singleFieldBuilderV3 = this.editRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 12) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 12) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearEditResponse() {
                SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> singleFieldBuilderV3 = this.editResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 13) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 13) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearId() {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearInfoList() {
                SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> singleFieldBuilderV3 = this.infoListBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearInstallResult() {
                SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> singleFieldBuilderV3 = this.installResultBuilder_;
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

            public Builder clearPath() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearPrepareInfo() {
                SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> singleFieldBuilderV3 = this.prepareInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearPrepareStatus() {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearSuccess() {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearSupportDataList() {
                SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> singleFieldBuilderV3 = this.supportDataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 11) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 11) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearWatchFaceList() {
                SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> singleFieldBuilderV3 = this.watchFaceListBuilder_;
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public BgImageResult getBgImageResult() {
                Object message;
                SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> singleFieldBuilderV3 = this.bgImageResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 14) {
                        return BgImageResult.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 14) {
                        return BgImageResult.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BgImageResult) message;
            }

            public BgImageResult.Builder getBgImageResultBuilder() {
                return (BgImageResult.Builder) getBgImageResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public BgImageResultOrBuilder getBgImageResultOrBuilder() {
                SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 14 || (singleFieldBuilderV3 = this.bgImageResultBuilder_) == null) ? i7 == 14 ? (BgImageResult) this.payload_ : BgImageResult.getDefaultInstance() : (BgImageResultOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_WatchFace_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public EditRequest getEditRequest() {
                Object message;
                SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> singleFieldBuilderV3 = this.editRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 12) {
                        return EditRequest.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 12) {
                        return EditRequest.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (EditRequest) message;
            }

            public EditRequest.Builder getEditRequestBuilder() {
                return (EditRequest.Builder) getEditRequestFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public EditRequestOrBuilder getEditRequestOrBuilder() {
                SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilderV3 = this.editRequestBuilder_) == null) ? i7 == 12 ? (EditRequest) this.payload_ : EditRequest.getDefaultInstance() : (EditRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public EditResponse getEditResponse() {
                Object message;
                SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> singleFieldBuilderV3 = this.editResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 13) {
                        return EditResponse.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 13) {
                        return EditResponse.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (EditResponse) message;
            }

            public EditResponse.Builder getEditResponseBuilder() {
                return (EditResponse.Builder) getEditResponseFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public EditResponseOrBuilder getEditResponseOrBuilder() {
                SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilderV3 = this.editResponseBuilder_) == null) ? i7 == 13 ? (EditResponse) this.payload_ : EditResponse.getDefaultInstance() : (EditResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public String getId() {
                String str = this.payloadCase_ == 2 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 2 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public ByteString getIdBytes() {
                String str = this.payloadCase_ == 2 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 2) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public WatchFaceInfo.List getInfoList() {
                Object message;
                SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> singleFieldBuilderV3 = this.infoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 8) {
                        return WatchFaceInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 8) {
                        return WatchFaceInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WatchFaceInfo.List) message;
            }

            public WatchFaceInfo.List.Builder getInfoListBuilder() {
                return (WatchFaceInfo.List.Builder) getInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public WatchFaceInfo.ListOrBuilder getInfoListOrBuilder() {
                SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilderV3 = this.infoListBuilder_) == null) ? i7 == 8 ? (WatchFaceInfo.List) this.payload_ : WatchFaceInfo.List.getDefaultInstance() : (WatchFaceInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public InstallResult getInstallResult() {
                Object message;
                SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> singleFieldBuilderV3 = this.installResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 7) {
                        return InstallResult.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 7) {
                        return InstallResult.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (InstallResult) message;
            }

            public InstallResult.Builder getInstallResultBuilder() {
                return (InstallResult.Builder) getInstallResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public InstallResultOrBuilder getInstallResultOrBuilder() {
                SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilderV3 = this.installResultBuilder_) == null) ? i7 == 7 ? (InstallResult) this.payload_ : InstallResult.getDefaultInstance() : (InstallResultOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public String getPath() {
                String str = this.payloadCase_ == 3 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 3 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public ByteString getPathBytes() {
                String str = this.payloadCase_ == 3 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 3) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public PrepareInfo getPrepareInfo() {
                Object message;
                SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> singleFieldBuilderV3 = this.prepareInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 6) {
                        return PrepareInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 6) {
                        return PrepareInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (PrepareInfo) message;
            }

            public PrepareInfo.Builder getPrepareInfoBuilder() {
                return (PrepareInfo.Builder) getPrepareInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public PrepareInfoOrBuilder getPrepareInfoOrBuilder() {
                SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilderV3 = this.prepareInfoBuilder_) == null) ? i7 == 6 ? (PrepareInfo) this.payload_ : PrepareInfo.getDefaultInstance() : (PrepareInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public CommonProtos.PrepareStatus getPrepareStatus() {
                CommonProtos.PrepareStatus prepareStatusValueOf;
                return (this.payloadCase_ != 5 || (prepareStatusValueOf = CommonProtos.PrepareStatus.valueOf(((Integer) this.payload_).intValue())) == null) ? CommonProtos.PrepareStatus.READY : prepareStatusValueOf;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean getSuccess() {
                if (this.payloadCase_ == 4) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public WatchFaceSlot.List getSupportDataList() {
                Object message;
                SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> singleFieldBuilderV3 = this.supportDataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 11) {
                        return WatchFaceSlot.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 11) {
                        return WatchFaceSlot.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WatchFaceSlot.List) message;
            }

            public WatchFaceSlot.List.Builder getSupportDataListBuilder() {
                return (WatchFaceSlot.List.Builder) getSupportDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public WatchFaceSlot.ListOrBuilder getSupportDataListOrBuilder() {
                SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilderV3 = this.supportDataListBuilder_) == null) ? i7 == 11 ? (WatchFaceSlot.List) this.payload_ : WatchFaceSlot.List.getDefaultInstance() : (WatchFaceSlot.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public WatchFaceItem.List getWatchFaceList() {
                Object message;
                SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> singleFieldBuilderV3 = this.watchFaceListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return WatchFaceItem.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return WatchFaceItem.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WatchFaceItem.List) message;
            }

            public WatchFaceItem.List.Builder getWatchFaceListBuilder() {
                return (WatchFaceItem.List.Builder) getWatchFaceListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public WatchFaceItem.ListOrBuilder getWatchFaceListOrBuilder() {
                SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.watchFaceListBuilder_) == null) ? i7 == 1 ? (WatchFaceItem.List) this.payload_ : WatchFaceItem.List.getDefaultInstance() : (WatchFaceItem.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasBgImageResult() {
                return this.payloadCase_ == 14;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasEditRequest() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasEditResponse() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasId() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasInfoList() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasInstallResult() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasPath() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasPrepareInfo() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasPrepareStatus() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasSuccess() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasSupportDataList() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
            public boolean hasWatchFaceList() {
                return this.payloadCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_WatchFace_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFace.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasWatchFaceList() && !getWatchFaceList().isInitialized()) {
                    return false;
                }
                if (hasPrepareInfo() && !getPrepareInfo().isInitialized()) {
                    return false;
                }
                if (hasInstallResult() && !getInstallResult().isInitialized()) {
                    return false;
                }
                if (hasInfoList() && !getInfoList().isInitialized()) {
                    return false;
                }
                if (hasEditRequest() && !getEditRequest().isInitialized()) {
                    return false;
                }
                if (!hasEditResponse() || getEditResponse().isInitialized()) {
                    return !hasBgImageResult() || getBgImageResult().isInitialized();
                }
                return false;
            }

            public Builder mergeBgImageResult(BgImageResult bgImageResult) {
                SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> singleFieldBuilderV3 = this.bgImageResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 14 && this.payload_ != BgImageResult.getDefaultInstance()) {
                        bgImageResult = BgImageResult.newBuilder((BgImageResult) this.payload_).mergeFrom(bgImageResult).buildPartial();
                    }
                    this.payload_ = bgImageResult;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 14) {
                        singleFieldBuilderV3.mergeFrom(bgImageResult);
                    }
                    this.bgImageResultBuilder_.setMessage(bgImageResult);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder mergeEditRequest(EditRequest editRequest) {
                SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> singleFieldBuilderV3 = this.editRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 12 && this.payload_ != EditRequest.getDefaultInstance()) {
                        editRequest = EditRequest.newBuilder((EditRequest) this.payload_).mergeFrom(editRequest).buildPartial();
                    }
                    this.payload_ = editRequest;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 12) {
                        singleFieldBuilderV3.mergeFrom(editRequest);
                    }
                    this.editRequestBuilder_.setMessage(editRequest);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder mergeEditResponse(EditResponse editResponse) {
                SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> singleFieldBuilderV3 = this.editResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 13 && this.payload_ != EditResponse.getDefaultInstance()) {
                        editResponse = EditResponse.newBuilder((EditResponse) this.payload_).mergeFrom(editResponse).buildPartial();
                    }
                    this.payload_ = editResponse;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 13) {
                        singleFieldBuilderV3.mergeFrom(editResponse);
                    }
                    this.editResponseBuilder_.setMessage(editResponse);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeInfoList(WatchFaceInfo.List list) {
                SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> singleFieldBuilderV3 = this.infoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 8 && this.payload_ != WatchFaceInfo.List.getDefaultInstance()) {
                        list = WatchFaceInfo.List.newBuilder((WatchFaceInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 8) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.infoListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeInstallResult(InstallResult installResult) {
                SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> singleFieldBuilderV3 = this.installResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 7 && this.payload_ != InstallResult.getDefaultInstance()) {
                        installResult = InstallResult.newBuilder((InstallResult) this.payload_).mergeFrom(installResult).buildPartial();
                    }
                    this.payload_ = installResult;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 7) {
                        singleFieldBuilderV3.mergeFrom(installResult);
                    }
                    this.installResultBuilder_.setMessage(installResult);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergePrepareInfo(PrepareInfo prepareInfo) {
                SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> singleFieldBuilderV3 = this.prepareInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 6 && this.payload_ != PrepareInfo.getDefaultInstance()) {
                        prepareInfo = PrepareInfo.newBuilder((PrepareInfo) this.payload_).mergeFrom(prepareInfo).buildPartial();
                    }
                    this.payload_ = prepareInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 6) {
                        singleFieldBuilderV3.mergeFrom(prepareInfo);
                    }
                    this.prepareInfoBuilder_.setMessage(prepareInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeSupportDataList(WatchFaceSlot.List list) {
                SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> singleFieldBuilderV3 = this.supportDataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 11 && this.payload_ != WatchFaceSlot.List.getDefaultInstance()) {
                        list = WatchFaceSlot.List.newBuilder((WatchFaceSlot.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 11) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.supportDataListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeWatchFaceList(WatchFaceItem.List list) {
                SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> singleFieldBuilderV3 = this.watchFaceListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != WatchFaceItem.List.getDefaultInstance()) {
                        list = WatchFaceItem.List.newBuilder((WatchFaceItem.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.watchFaceListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setBgImageResult(BgImageResult.Builder builder) {
                SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> singleFieldBuilderV3 = this.bgImageResultBuilder_;
                BgImageResult bgImageResultBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bgImageResultBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bgImageResultBuild);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setEditRequest(EditRequest.Builder builder) {
                SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> singleFieldBuilderV3 = this.editRequestBuilder_;
                EditRequest editRequestBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = editRequestBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(editRequestBuild);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setEditResponse(EditResponse.Builder builder) {
                SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> singleFieldBuilderV3 = this.editResponseBuilder_;
                EditResponse editResponseBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = editResponseBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(editResponseBuild);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.payloadCase_ = 2;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 2;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setInfoList(WatchFaceInfo.List.Builder builder) {
                SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> singleFieldBuilderV3 = this.infoListBuilder_;
                WatchFaceInfo.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setInstallResult(InstallResult.Builder builder) {
                SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> singleFieldBuilderV3 = this.installResultBuilder_;
                InstallResult installResultBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = installResultBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(installResultBuild);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setPath(String str) {
                str.getClass();
                this.payloadCase_ = 3;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 3;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPrepareInfo(PrepareInfo.Builder builder) {
                SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> singleFieldBuilderV3 = this.prepareInfoBuilder_;
                PrepareInfo prepareInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = prepareInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(prepareInfoBuild);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setPrepareStatus(CommonProtos.PrepareStatus prepareStatus) {
                prepareStatus.getClass();
                this.payloadCase_ = 5;
                this.payload_ = Integer.valueOf(prepareStatus.getNumber());
                onChanged();
                return this;
            }

            public Builder setSuccess(boolean z6) {
                this.payloadCase_ = 4;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setSupportDataList(WatchFaceSlot.List.Builder builder) {
                SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> singleFieldBuilderV3 = this.supportDataListBuilder_;
                WatchFaceSlot.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setWatchFaceList(WatchFaceItem.List.Builder builder) {
                SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> singleFieldBuilderV3 = this.watchFaceListBuilder_;
                WatchFaceItem.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setBgImageResult(BgImageResult bgImageResult) {
                SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> singleFieldBuilderV3 = this.bgImageResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    bgImageResult.getClass();
                    this.payload_ = bgImageResult;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bgImageResult);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setEditRequest(EditRequest editRequest) {
                SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> singleFieldBuilderV3 = this.editRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    editRequest.getClass();
                    this.payload_ = editRequest;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(editRequest);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setEditResponse(EditResponse editResponse) {
                SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> singleFieldBuilderV3 = this.editResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    editResponse.getClass();
                    this.payload_ = editResponse;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(editResponse);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setInfoList(WatchFaceInfo.List list) {
                SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> singleFieldBuilderV3 = this.infoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setInstallResult(InstallResult installResult) {
                SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> singleFieldBuilderV3 = this.installResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    installResult.getClass();
                    this.payload_ = installResult;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(installResult);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setPrepareInfo(PrepareInfo prepareInfo) {
                SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> singleFieldBuilderV3 = this.prepareInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    prepareInfo.getClass();
                    this.payload_ = prepareInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(prepareInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setSupportDataList(WatchFaceSlot.List list) {
                SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> singleFieldBuilderV3 = this.supportDataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setWatchFaceList(WatchFaceItem.List list) {
                SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> singleFieldBuilderV3 = this.watchFaceListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFace build() {
                WatchFace watchFaceBuildPartial = buildPartial();
                if (watchFaceBuildPartial.isInitialized()) {
                    return watchFaceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) watchFaceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFace buildPartial() {
                WatchFace watchFace = new WatchFace(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<WatchFaceItem.List, WatchFaceItem.List.Builder, WatchFaceItem.ListOrBuilder> singleFieldBuilderV3 = this.watchFaceListBuilder_;
                    watchFace.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    watchFace.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 3) {
                    watchFace.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 4) {
                    watchFace.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 5) {
                    watchFace.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 6) {
                    SingleFieldBuilderV3<PrepareInfo, PrepareInfo.Builder, PrepareInfoOrBuilder> singleFieldBuilderV32 = this.prepareInfoBuilder_;
                    watchFace.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 7) {
                    SingleFieldBuilderV3<InstallResult, InstallResult.Builder, InstallResultOrBuilder> singleFieldBuilderV33 = this.installResultBuilder_;
                    watchFace.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                if (this.payloadCase_ == 8) {
                    SingleFieldBuilderV3<WatchFaceInfo.List, WatchFaceInfo.List.Builder, WatchFaceInfo.ListOrBuilder> singleFieldBuilderV34 = this.infoListBuilder_;
                    watchFace.payload_ = singleFieldBuilderV34 == null ? this.payload_ : singleFieldBuilderV34.build();
                }
                if (this.payloadCase_ == 11) {
                    SingleFieldBuilderV3<WatchFaceSlot.List, WatchFaceSlot.List.Builder, WatchFaceSlot.ListOrBuilder> singleFieldBuilderV35 = this.supportDataListBuilder_;
                    watchFace.payload_ = singleFieldBuilderV35 == null ? this.payload_ : singleFieldBuilderV35.build();
                }
                if (this.payloadCase_ == 12) {
                    SingleFieldBuilderV3<EditRequest, EditRequest.Builder, EditRequestOrBuilder> singleFieldBuilderV36 = this.editRequestBuilder_;
                    watchFace.payload_ = singleFieldBuilderV36 == null ? this.payload_ : singleFieldBuilderV36.build();
                }
                if (this.payloadCase_ == 13) {
                    SingleFieldBuilderV3<EditResponse, EditResponse.Builder, EditResponseOrBuilder> singleFieldBuilderV37 = this.editResponseBuilder_;
                    watchFace.payload_ = singleFieldBuilderV37 == null ? this.payload_ : singleFieldBuilderV37.build();
                }
                if (this.payloadCase_ == 14) {
                    SingleFieldBuilderV3<BgImageResult, BgImageResult.Builder, BgImageResultOrBuilder> singleFieldBuilderV38 = this.bgImageResultBuilder_;
                    watchFace.payload_ = singleFieldBuilderV38 == null ? this.payload_ : singleFieldBuilderV38.build();
                }
                watchFace.bitField0_ = 0;
                watchFace.payloadCase_ = this.payloadCase_;
                onBuilt();
                return watchFace;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WatchFace getDefaultInstanceForType() {
                return WatchFace.getDefaultInstance();
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
            public com.zh.wear.protobuf.WatchFaceProtos.WatchFace.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$WatchFace> r1 = com.zh.wear.protobuf.WatchFaceProtos.WatchFace.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFace r3 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFace) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFace r4 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFace) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFace.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$WatchFace$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WatchFace) {
                    return mergeFrom((WatchFace) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WatchFace watchFace) {
                int i7;
                if (watchFace == WatchFace.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$WatchFaceProtos$WatchFace$PayloadCase[watchFace.getPayloadCase().ordinal()]) {
                    case 1:
                        mergeWatchFaceList(watchFace.getWatchFaceList());
                        break;
                    case 2:
                        i7 = 2;
                        this.payloadCase_ = i7;
                        this.payload_ = watchFace.payload_;
                        onChanged();
                        break;
                    case 3:
                        i7 = 3;
                        this.payloadCase_ = i7;
                        this.payload_ = watchFace.payload_;
                        onChanged();
                        break;
                    case 4:
                        setSuccess(watchFace.getSuccess());
                        break;
                    case 5:
                        setPrepareStatus(watchFace.getPrepareStatus());
                        break;
                    case 6:
                        mergePrepareInfo(watchFace.getPrepareInfo());
                        break;
                    case 7:
                        mergeInstallResult(watchFace.getInstallResult());
                        break;
                    case 8:
                        mergeInfoList(watchFace.getInfoList());
                        break;
                    case 9:
                        mergeSupportDataList(watchFace.getSupportDataList());
                        break;
                    case 10:
                        mergeEditRequest(watchFace.getEditRequest());
                        break;
                    case 11:
                        mergeEditResponse(watchFace.getEditResponse());
                        break;
                    case 12:
                        mergeBgImageResult(watchFace.getBgImageResult());
                        break;
                }
                mergeUnknownFields(((GeneratedMessage) watchFace).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            WATCH_FACE_LIST(1),
            ID(2),
            PATH(3),
            SUCCESS(4),
            PREPARE_STATUS(5),
            PREPARE_INFO(6),
            INSTALL_RESULT(7),
            INFO_LIST(8),
            SUPPORT_DATA_LIST(11),
            EDIT_REQUEST(12),
            EDIT_RESPONSE(13),
            BG_IMAGE_RESULT(14),
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
                        return WATCH_FACE_LIST;
                    case 2:
                        return ID;
                    case 3:
                        return PATH;
                    case 4:
                        return SUCCESS;
                    case 5:
                        return PREPARE_STATUS;
                    case 6:
                        return PREPARE_INFO;
                    case 7:
                        return INSTALL_RESULT;
                    case 8:
                        return INFO_LIST;
                    case 9:
                    case 10:
                    default:
                        return null;
                    case 11:
                        return SUPPORT_DATA_LIST;
                    case 12:
                        return EDIT_REQUEST;
                    case 13:
                        return EDIT_RESPONSE;
                    case 14:
                        return BG_IMAGE_RESULT;
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

        public enum WatchFaceID implements ProtocolMessageEnum {
            GET_INSTALLED_LIST(0),
            SET_WATCH_FACE(1),
            REMOVE_WATCH_FACE(2),
            REMOVE_WATCH_FACE_PHOTO(3),
            PREPARE_INSTALL_WATCH_FACE(4),
            REPORT_INSTALL_RESULT(5),
            REMOVE_MULTI_WATCH_FACE(6),
            GET_SUPPORT_DATA(10),
            EDIT_WATCH_FACE(11),
            BG_IMAGE_RESULT(12);

            public static final int BG_IMAGE_RESULT_VALUE = 12;
            public static final int EDIT_WATCH_FACE_VALUE = 11;
            public static final int GET_INSTALLED_LIST_VALUE = 0;
            public static final int GET_SUPPORT_DATA_VALUE = 10;
            public static final int PREPARE_INSTALL_WATCH_FACE_VALUE = 4;
            public static final int REMOVE_MULTI_WATCH_FACE_VALUE = 6;
            public static final int REMOVE_WATCH_FACE_PHOTO_VALUE = 3;
            public static final int REMOVE_WATCH_FACE_VALUE = 2;
            public static final int REPORT_INSTALL_RESULT_VALUE = 5;
            public static final int SET_WATCH_FACE_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<WatchFaceID> internalValueMap = new Internal.EnumLiteMap<WatchFaceID>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFace.WatchFaceID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public WatchFaceID findValueByNumber(int i7) {
                    return WatchFaceID.forNumber(i7);
                }
            };
            private static final WatchFaceID[] VALUES = values();

            WatchFaceID(int i7) {
                this.value = i7;
            }

            public static WatchFaceID forNumber(int i7) {
                switch (i7) {
                    case 0:
                        return GET_INSTALLED_LIST;
                    case 1:
                        return SET_WATCH_FACE;
                    case 2:
                        return REMOVE_WATCH_FACE;
                    case 3:
                        return REMOVE_WATCH_FACE_PHOTO;
                    case 4:
                        return PREPARE_INSTALL_WATCH_FACE;
                    case 5:
                        return REPORT_INSTALL_RESULT;
                    case 6:
                        return REMOVE_MULTI_WATCH_FACE;
                    case 7:
                    case 8:
                    case 9:
                    default:
                        return null;
                    case 10:
                        return GET_SUPPORT_DATA;
                    case 11:
                        return EDIT_WATCH_FACE;
                    case 12:
                        return BG_IMAGE_RESULT;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return WatchFace.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<WatchFaceID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static WatchFaceID valueOf(int i7) {
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

            public static WatchFaceID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private WatchFace() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WatchFace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_WatchFace_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WatchFace parseDelimitedFrom(InputStream inputStream) {
            return (WatchFace) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WatchFace parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WatchFace> parser() {
            return PARSER;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFace.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public BgImageResult getBgImageResult() {
            return this.payloadCase_ == 14 ? (BgImageResult) this.payload_ : BgImageResult.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public BgImageResultOrBuilder getBgImageResultOrBuilder() {
            return this.payloadCase_ == 14 ? (BgImageResult) this.payload_ : BgImageResult.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public EditRequest getEditRequest() {
            return this.payloadCase_ == 12 ? (EditRequest) this.payload_ : EditRequest.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public EditRequestOrBuilder getEditRequestOrBuilder() {
            return this.payloadCase_ == 12 ? (EditRequest) this.payload_ : EditRequest.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public EditResponse getEditResponse() {
            return this.payloadCase_ == 13 ? (EditResponse) this.payload_ : EditResponse.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public EditResponseOrBuilder getEditResponseOrBuilder() {
            return this.payloadCase_ == 13 ? (EditResponse) this.payload_ : EditResponse.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public String getId() {
            String str = this.payloadCase_ == 2 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 2) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public ByteString getIdBytes() {
            String str = this.payloadCase_ == 2 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 2) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public WatchFaceInfo.List getInfoList() {
            return this.payloadCase_ == 8 ? (WatchFaceInfo.List) this.payload_ : WatchFaceInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public WatchFaceInfo.ListOrBuilder getInfoListOrBuilder() {
            return this.payloadCase_ == 8 ? (WatchFaceInfo.List) this.payload_ : WatchFaceInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public InstallResult getInstallResult() {
            return this.payloadCase_ == 7 ? (InstallResult) this.payload_ : InstallResult.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public InstallResultOrBuilder getInstallResultOrBuilder() {
            return this.payloadCase_ == 7 ? (InstallResult) this.payload_ : InstallResult.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WatchFace> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public String getPath() {
            String str = this.payloadCase_ == 3 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 3) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public ByteString getPathBytes() {
            String str = this.payloadCase_ == 3 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 3) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public PrepareInfo getPrepareInfo() {
            return this.payloadCase_ == 6 ? (PrepareInfo) this.payload_ : PrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public PrepareInfoOrBuilder getPrepareInfoOrBuilder() {
            return this.payloadCase_ == 6 ? (PrepareInfo) this.payload_ : PrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public CommonProtos.PrepareStatus getPrepareStatus() {
            CommonProtos.PrepareStatus prepareStatusValueOf;
            return (this.payloadCase_ != 5 || (prepareStatusValueOf = CommonProtos.PrepareStatus.valueOf(((Integer) this.payload_).intValue())) == null) ? CommonProtos.PrepareStatus.READY : prepareStatusValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (WatchFaceItem.List) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(3, this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(4, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(5, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (PrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (InstallResult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (WatchFaceInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, (WatchFaceSlot.List) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, (EditRequest) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, (EditResponse) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, (BgImageResult) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean getSuccess() {
            if (this.payloadCase_ == 4) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public WatchFaceSlot.List getSupportDataList() {
            return this.payloadCase_ == 11 ? (WatchFaceSlot.List) this.payload_ : WatchFaceSlot.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public WatchFaceSlot.ListOrBuilder getSupportDataListOrBuilder() {
            return this.payloadCase_ == 11 ? (WatchFaceSlot.List) this.payload_ : WatchFaceSlot.List.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public WatchFaceItem.List getWatchFaceList() {
            return this.payloadCase_ == 1 ? (WatchFaceItem.List) this.payload_ : WatchFaceItem.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public WatchFaceItem.ListOrBuilder getWatchFaceListOrBuilder() {
            return this.payloadCase_ == 1 ? (WatchFaceItem.List) this.payload_ : WatchFaceItem.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasBgImageResult() {
            return this.payloadCase_ == 14;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasEditRequest() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasEditResponse() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasId() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasInfoList() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasInstallResult() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasPath() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasPrepareInfo() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasPrepareStatus() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasSuccess() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasSupportDataList() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceOrBuilder
        public boolean hasWatchFaceList() {
            return this.payloadCase_ == 1;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            int iHashCode;
            String id;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode2 = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode2 * 37) + 1) * 53;
                    iHashCode = getWatchFaceList().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    id = getId();
                    iHashCode = id.hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    id = getPath();
                    iHashCode = id.hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = Internal.hashBoolean(getSuccess());
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getPrepareStatus().getNumber();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getPrepareInfo().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getInstallResult().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getInfoList().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 11:
                    i7 = ((iHashCode2 * 37) + 11) * 53;
                    iHashCode = getSupportDataList().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 12:
                    i7 = ((iHashCode2 * 37) + 12) * 53;
                    iHashCode = getEditRequest().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 13:
                    i7 = ((iHashCode2 * 37) + 13) * 53;
                    iHashCode = getEditResponse().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
                case 14:
                    i7 = ((iHashCode2 * 37) + 14) * 53;
                    iHashCode = getBgImageResult().hashCode();
                    iHashCode2 = i7 + iHashCode;
                    break;
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_WatchFace_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFace.class, Builder.class);
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
            if (hasWatchFaceList() && !getWatchFaceList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPrepareInfo() && !getPrepareInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasInstallResult() && !getInstallResult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasInfoList() && !getInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEditRequest() && !getEditRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEditResponse() && !getEditResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasBgImageResult() || getBgImageResult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (WatchFaceItem.List) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeBool(4, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeEnum(5, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (PrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (InstallResult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (WatchFaceInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (WatchFaceSlot.List) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (EditRequest) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (EditResponse) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                codedOutputStream.writeMessage(14, (BgImageResult) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WatchFace(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Object bytes;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        int i7 = 1;
                        switch (tag) {
                            case 0:
                                z6 = true;
                                break;
                            case 10:
                                WatchFaceItem.List.Builder builder = this.payloadCase_ == 1 ? ((WatchFaceItem.List) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(WatchFaceItem.List.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((WatchFaceItem.List) message);
                                    this.payload_ = builder.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 18:
                                bytes = codedInputStream.readBytes();
                                this.payloadCase_ = 2;
                                this.payload_ = bytes;
                                break;
                            case 26:
                                bytes = codedInputStream.readBytes();
                                this.payloadCase_ = 3;
                                this.payload_ = bytes;
                                break;
                            case 32:
                                this.payloadCase_ = 4;
                                bytes = Boolean.valueOf(codedInputStream.readBool());
                                this.payload_ = bytes;
                                break;
                            case 40:
                                int i8 = codedInputStream.readEnum();
                                if (CommonProtos.PrepareStatus.valueOf(i8) != null) {
                                    this.payloadCase_ = 5;
                                    bytes = Integer.valueOf(i8);
                                    this.payload_ = bytes;
                                } else {
                                    builderNewBuilder.mergeVarintField(5, i8);
                                }
                                break;
                            case 50:
                                i7 = 6;
                                PrepareInfo.Builder builder2 = this.payloadCase_ == 6 ? ((PrepareInfo) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(PrepareInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((PrepareInfo) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 58:
                                i7 = 7;
                                InstallResult.Builder builder3 = this.payloadCase_ == 7 ? ((InstallResult) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(InstallResult.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((InstallResult) message3);
                                    this.payload_ = builder3.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 66:
                                i7 = 8;
                                WatchFaceInfo.List.Builder builder4 = this.payloadCase_ == 8 ? ((WatchFaceInfo.List) this.payload_).toBuilder() : null;
                                MessageLite message4 = codedInputStream.readMessage(WatchFaceInfo.List.PARSER, extensionRegistryLite);
                                this.payload_ = message4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((WatchFaceInfo.List) message4);
                                    this.payload_ = builder4.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 90:
                                i7 = 11;
                                WatchFaceSlot.List.Builder builder5 = this.payloadCase_ == 11 ? ((WatchFaceSlot.List) this.payload_).toBuilder() : null;
                                MessageLite message5 = codedInputStream.readMessage(WatchFaceSlot.List.PARSER, extensionRegistryLite);
                                this.payload_ = message5;
                                if (builder5 != null) {
                                    builder5.mergeFrom((WatchFaceSlot.List) message5);
                                    this.payload_ = builder5.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 98:
                                i7 = 12;
                                EditRequest.Builder builder6 = this.payloadCase_ == 12 ? ((EditRequest) this.payload_).toBuilder() : null;
                                MessageLite message6 = codedInputStream.readMessage(EditRequest.PARSER, extensionRegistryLite);
                                this.payload_ = message6;
                                if (builder6 != null) {
                                    builder6.mergeFrom((EditRequest) message6);
                                    this.payload_ = builder6.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 106:
                                i7 = 13;
                                EditResponse.Builder builder7 = this.payloadCase_ == 13 ? ((EditResponse) this.payload_).toBuilder() : null;
                                MessageLite message7 = codedInputStream.readMessage(EditResponse.PARSER, extensionRegistryLite);
                                this.payload_ = message7;
                                if (builder7 != null) {
                                    builder7.mergeFrom((EditResponse) message7);
                                    this.payload_ = builder7.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 114:
                                i7 = 14;
                                BgImageResult.Builder builder8 = this.payloadCase_ == 14 ? ((BgImageResult) this.payload_).toBuilder() : null;
                                MessageLite message8 = codedInputStream.readMessage(BgImageResult.PARSER, extensionRegistryLite);
                                this.payload_ = message8;
                                if (builder8 != null) {
                                    builder8.mergeFrom((BgImageResult) message8);
                                    this.payload_ = builder8.buildPartial();
                                }
                                this.payloadCase_ = i7;
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

        public static Builder newBuilder(WatchFace watchFace) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(watchFace);
        }

        public static WatchFace parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFace) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFace parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WatchFace parseFrom(CodedInputStream codedInputStream) {
            return (WatchFace) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WatchFace getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WatchFace(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WatchFace parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFace) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WatchFace parseFrom(InputStream inputStream) {
            return (WatchFace) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WatchFace parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFace) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFace parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WatchFace parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WatchFace parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WatchFace parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public static final class WatchFaceInfo extends GeneratedMessageV3 implements WatchFaceInfoOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private static final WatchFaceInfo DEFAULT_INSTANCE = new WatchFaceInfo();

        @Deprecated
        public static final Parser<WatchFaceInfo> PARSER = new AbstractParser<WatchFaceInfo>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.1
            @Override // com.google.protobuf.Parser
            public WatchFaceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WatchFaceInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WatchFaceInfoOrBuilder {
            private int bitField0_;
            private Object id_;

            private Builder() {
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_WatchFaceInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = WatchFaceInfo.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_WatchFaceInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_WatchFaceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFaceInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId();
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFaceInfo build() {
                WatchFaceInfo watchFaceInfoBuildPartial = buildPartial();
                if (watchFaceInfoBuildPartial.isInitialized()) {
                    return watchFaceInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) watchFaceInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFaceInfo buildPartial() {
                WatchFaceInfo watchFaceInfo = new WatchFaceInfo(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                watchFaceInfo.id_ = this.id_;
                watchFaceInfo.bitField0_ = i7;
                onBuilt();
                return watchFaceInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WatchFaceInfo getDefaultInstanceForType() {
                return WatchFaceInfo.getDefaultInstance();
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
                this.id_ = "";
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
            public com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo> r1 = com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo r3 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo r4 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WatchFaceInfo) {
                    return mergeFrom((WatchFaceInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WatchFaceInfo watchFaceInfo) {
                if (watchFaceInfo == WatchFaceInfo.getDefaultInstance()) {
                    return this;
                }
                if (watchFaceInfo.hasId()) {
                    this.bitField0_ |= 1;
                    this.id_ = watchFaceInfo.id_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) watchFaceInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<WatchFaceInfo> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> listBuilder_;
                private java.util.List<WatchFaceInfo> list_;

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
                    return WatchFaceProtos.internal_static_WatchFaceInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends WatchFaceInfo> iterable) {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(WatchFaceInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_WatchFaceInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
                public WatchFaceInfo getList(int i7) {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (WatchFaceInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
                public java.util.List<WatchFaceInfo> getListList() {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
                public WatchFaceInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (WatchFaceInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
                public java.util.List<? extends WatchFaceInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WatchFaceProtos.internal_static_WatchFaceInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, WatchFaceInfo watchFaceInfo) {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, watchFaceInfo);
                        return this;
                    }
                    watchFaceInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, watchFaceInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, WatchFaceInfo.getDefaultInstance());
                }

                public Builder setList(int i7, WatchFaceInfo watchFaceInfo) {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, watchFaceInfo);
                        return this;
                    }
                    watchFaceInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, watchFaceInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(WatchFaceInfo watchFaceInfo) {
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(watchFaceInfo);
                        return this;
                    }
                    watchFaceInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(watchFaceInfo);
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
                    RepeatedFieldBuilderV3<WatchFaceInfo, Builder, WatchFaceInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo$List> r1 = com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo$List r3 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo$List r4 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$WatchFaceInfo$List$Builder");
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
                return WatchFaceProtos.internal_static_WatchFaceInfo_List_descriptor;
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
            public WatchFaceInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
            public java.util.List<WatchFaceInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
            public WatchFaceInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfo.ListOrBuilder
            public java.util.List<? extends WatchFaceInfoOrBuilder> getListOrBuilderList() {
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
                return WatchFaceProtos.internal_static_WatchFaceInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((WatchFaceInfo) codedInputStream.readMessage(WatchFaceInfo.PARSER, extensionRegistryLite));
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
            WatchFaceInfo getList(int i7);

            int getListCount();

            java.util.List<WatchFaceInfo> getListList();

            WatchFaceInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends WatchFaceInfoOrBuilder> getListOrBuilderList();
        }

        private WatchFaceInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static WatchFaceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_WatchFaceInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WatchFaceInfo parseDelimitedFrom(InputStream inputStream) {
            return (WatchFaceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WatchFaceInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WatchFaceInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WatchFaceInfo)) {
                return super.equals(obj);
            }
            WatchFaceInfo watchFaceInfo = (WatchFaceInfo) obj;
            boolean z6 = hasId() == watchFaceInfo.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(watchFaceInfo.getId());
            }
            return z6 && this.unknownFields.equals(watchFaceInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfoOrBuilder
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
        public Parser<WatchFaceInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = ((this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.id_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceInfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
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
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_WatchFaceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFaceInfo.class, Builder.class);
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
            if (hasId()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WatchFaceInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.id_ = bytes;
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

        public static Builder newBuilder(WatchFaceInfo watchFaceInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(watchFaceInfo);
        }

        public static WatchFaceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFaceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WatchFaceInfo parseFrom(CodedInputStream codedInputStream) {
            return (WatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WatchFaceInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WatchFaceInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WatchFaceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WatchFaceInfo parseFrom(InputStream inputStream) {
            return (WatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WatchFaceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFaceInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WatchFaceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WatchFaceInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WatchFaceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WatchFaceInfoOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        boolean hasId();
    }

    public static final class WatchFaceItem extends GeneratedMessageV3 implements WatchFaceItemOrBuilder {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 7;
        public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 8;
        public static final int CAN_EDIT_FIELD_NUMBER = 6;
        public static final int CAN_REMOVE_FIELD_NUMBER = 4;
        public static final int DATA_LIST_FIELD_NUMBER = 10;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IS_CURRENT_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int STYLE_FIELD_NUMBER = 9;
        public static final int VERSION_CODE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private volatile Object backgroundColor_;
        private volatile Object backgroundImage_;
        private int bitField0_;
        private boolean canEdit_;
        private boolean canRemove_;
        private java.util.List<Integer> dataList_;
        private volatile Object id_;
        private boolean isCurrent_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object style_;
        private long versionCode_;
        private static final Internal.ListAdapter.Converter<Integer, WatchFaceSlot.Data> dataList_converter_ = new Internal.ListAdapter.Converter<Integer, WatchFaceSlot.Data>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public WatchFaceSlot.Data convert(Integer num) {
                WatchFaceSlot.Data dataValueOf = WatchFaceSlot.Data.valueOf(num.intValue());
                return dataValueOf == null ? WatchFaceSlot.Data.EMPTY : dataValueOf;
            }
        };
        private static final WatchFaceItem DEFAULT_INSTANCE = new WatchFaceItem();

        @Deprecated
        public static final Parser<WatchFaceItem> PARSER = new AbstractParser<WatchFaceItem>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.2
            @Override // com.google.protobuf.Parser
            public WatchFaceItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WatchFaceItem(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WatchFaceItemOrBuilder {
            private Object backgroundColor_;
            private Object backgroundImage_;
            private int bitField0_;
            private boolean canEdit_;
            private boolean canRemove_;
            private java.util.List<Integer> dataList_;
            private Object id_;
            private boolean isCurrent_;
            private Object name_;
            private Object style_;
            private long versionCode_;

            private Builder() {
                this.id_ = "";
                this.name_ = "";
                this.backgroundColor_ = "";
                this.backgroundImage_ = "";
                this.style_ = "";
                this.dataList_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureDataListIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.dataList_ = new ArrayList(this.dataList_);
                    this.bitField0_ |= 512;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_WatchFaceItem_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllDataList(Iterable<? extends WatchFaceSlot.Data> iterable) {
                ensureDataListIsMutable();
                Iterator<? extends WatchFaceSlot.Data> it = iterable.iterator();
                while (it.hasNext()) {
                    this.dataList_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addDataList(WatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.add(Integer.valueOf(data.getNumber()));
                onChanged();
                return this;
            }

            public Builder clearBackgroundColor() {
                this.bitField0_ &= -65;
                this.backgroundColor_ = WatchFaceItem.getDefaultInstance().getBackgroundColor();
                onChanged();
                return this;
            }

            public Builder clearBackgroundImage() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.backgroundImage_ = WatchFaceItem.getDefaultInstance().getBackgroundImage();
                onChanged();
                return this;
            }

            public Builder clearCanEdit() {
                this.bitField0_ &= -33;
                this.canEdit_ = false;
                onChanged();
                return this;
            }

            public Builder clearCanRemove() {
                this.bitField0_ &= -9;
                this.canRemove_ = false;
                onChanged();
                return this;
            }

            public Builder clearDataList() {
                this.dataList_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = WatchFaceItem.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearIsCurrent() {
                this.bitField0_ &= -5;
                this.isCurrent_ = false;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= -3;
                this.name_ = WatchFaceItem.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.bitField0_ &= -257;
                this.style_ = WatchFaceItem.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            public Builder clearVersionCode() {
                this.bitField0_ &= -17;
                this.versionCode_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public String getBackgroundColor() {
                Object obj = this.backgroundColor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.backgroundColor_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public ByteString getBackgroundColorBytes() {
                Object obj = this.backgroundColor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundColor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public String getBackgroundImage() {
                Object obj = this.backgroundImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.backgroundImage_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public ByteString getBackgroundImageBytes() {
                Object obj = this.backgroundImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundImage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean getCanEdit() {
                return this.canEdit_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean getCanRemove() {
                return this.canRemove_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public WatchFaceSlot.Data getDataList(int i7) {
                return (WatchFaceSlot.Data) WatchFaceItem.dataList_converter_.convert(this.dataList_.get(i7));
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public int getDataListCount() {
                return this.dataList_.size();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public java.util.List<WatchFaceSlot.Data> getDataListList() {
                return new Internal.ListAdapter(this.dataList_, WatchFaceItem.dataList_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_WatchFaceItem_descriptor;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean getIsCurrent() {
                return this.isCurrent_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.style_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public long getVersionCode() {
                return this.versionCode_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasBackgroundColor() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasBackgroundImage() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasCanEdit() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasCanRemove() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasIsCurrent() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasStyle() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_WatchFaceItem_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFaceItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasName() && hasIsCurrent();
            }

            public Builder setBackgroundColor(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.backgroundColor_ = str;
                onChanged();
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 64;
                this.backgroundColor_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBackgroundImage(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.backgroundImage_ = str;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 128;
                this.backgroundImage_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCanEdit(boolean z6) {
                this.bitField0_ |= 32;
                this.canEdit_ = z6;
                onChanged();
                return this;
            }

            public Builder setCanRemove(boolean z6) {
                this.bitField0_ |= 8;
                this.canRemove_ = z6;
                onChanged();
                return this;
            }

            public Builder setDataList(int i7, WatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.set(i7, Integer.valueOf(data.getNumber()));
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIsCurrent(boolean z6) {
                this.bitField0_ |= 4;
                this.isCurrent_ = z6;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.bitField0_ |= 256;
                this.style_ = str;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 256;
                this.style_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVersionCode(long j7) {
                this.bitField0_ |= 16;
                this.versionCode_ = j7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.name_ = "";
                this.backgroundColor_ = "";
                this.backgroundImage_ = "";
                this.style_ = "";
                this.dataList_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFaceItem build() {
                WatchFaceItem watchFaceItemBuildPartial = buildPartial();
                if (watchFaceItemBuildPartial.isInitialized()) {
                    return watchFaceItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) watchFaceItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFaceItem buildPartial() {
                WatchFaceItem watchFaceItem = new WatchFaceItem(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                watchFaceItem.id_ = this.id_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                watchFaceItem.name_ = this.name_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                watchFaceItem.isCurrent_ = this.isCurrent_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                watchFaceItem.canRemove_ = this.canRemove_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                watchFaceItem.versionCode_ = this.versionCode_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                watchFaceItem.canEdit_ = this.canEdit_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                watchFaceItem.backgroundColor_ = this.backgroundColor_;
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                watchFaceItem.backgroundImage_ = this.backgroundImage_;
                if ((i7 & 256) == 256) {
                    i8 |= 256;
                }
                watchFaceItem.style_ = this.style_;
                if ((this.bitField0_ & 512) == 512) {
                    this.dataList_ = Collections.unmodifiableList(this.dataList_);
                    this.bitField0_ &= -513;
                }
                watchFaceItem.dataList_ = this.dataList_;
                watchFaceItem.bitField0_ = i8;
                onBuilt();
                return watchFaceItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WatchFaceItem getDefaultInstanceForType() {
                return WatchFaceItem.getDefaultInstance();
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
                this.id_ = "";
                int i7 = this.bitField0_;
                this.name_ = "";
                this.isCurrent_ = false;
                this.canRemove_ = false;
                this.versionCode_ = 0L;
                this.canEdit_ = false;
                this.backgroundColor_ = "";
                this.backgroundImage_ = "";
                this.style_ = "";
                this.bitField0_ = i7 & WorkInfo.f43759p;
                this.dataList_ = Collections.EMPTY_LIST;
                this.bitField0_ = i7 & (-1024);
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
            public com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem> r1 = com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem r3 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem r4 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WatchFaceItem) {
                    return mergeFrom((WatchFaceItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WatchFaceItem watchFaceItem) {
                if (watchFaceItem == WatchFaceItem.getDefaultInstance()) {
                    return this;
                }
                if (watchFaceItem.hasId()) {
                    this.bitField0_ |= 1;
                    this.id_ = watchFaceItem.id_;
                    onChanged();
                }
                if (watchFaceItem.hasName()) {
                    this.bitField0_ |= 2;
                    this.name_ = watchFaceItem.name_;
                    onChanged();
                }
                if (watchFaceItem.hasIsCurrent()) {
                    setIsCurrent(watchFaceItem.getIsCurrent());
                }
                if (watchFaceItem.hasCanRemove()) {
                    setCanRemove(watchFaceItem.getCanRemove());
                }
                if (watchFaceItem.hasVersionCode()) {
                    setVersionCode(watchFaceItem.getVersionCode());
                }
                if (watchFaceItem.hasCanEdit()) {
                    setCanEdit(watchFaceItem.getCanEdit());
                }
                if (watchFaceItem.hasBackgroundColor()) {
                    this.bitField0_ |= 64;
                    this.backgroundColor_ = watchFaceItem.backgroundColor_;
                    onChanged();
                }
                if (watchFaceItem.hasBackgroundImage()) {
                    this.bitField0_ |= 128;
                    this.backgroundImage_ = watchFaceItem.backgroundImage_;
                    onChanged();
                }
                if (watchFaceItem.hasStyle()) {
                    this.bitField0_ |= 256;
                    this.style_ = watchFaceItem.style_;
                    onChanged();
                }
                if (!watchFaceItem.dataList_.isEmpty()) {
                    if (this.dataList_.isEmpty()) {
                        this.dataList_ = watchFaceItem.dataList_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureDataListIsMutable();
                        this.dataList_.addAll(watchFaceItem.dataList_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) watchFaceItem).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<WatchFaceItem> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> listBuilder_;
                private java.util.List<WatchFaceItem> list_;

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
                    return WatchFaceProtos.internal_static_WatchFaceItem_List_descriptor;
                }

                private RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends WatchFaceItem> iterable) {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(WatchFaceItem.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_WatchFaceItem_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
                public WatchFaceItem getList(int i7) {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (WatchFaceItem) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
                public java.util.List<WatchFaceItem> getListList() {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
                public WatchFaceItemOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (WatchFaceItemOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
                public java.util.List<? extends WatchFaceItemOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WatchFaceProtos.internal_static_WatchFaceItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, WatchFaceItem watchFaceItem) {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, watchFaceItem);
                        return this;
                    }
                    watchFaceItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, watchFaceItem);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, WatchFaceItem.getDefaultInstance());
                }

                public Builder setList(int i7, WatchFaceItem watchFaceItem) {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, watchFaceItem);
                        return this;
                    }
                    watchFaceItem.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, watchFaceItem);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(WatchFaceItem watchFaceItem) {
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(watchFaceItem);
                        return this;
                    }
                    watchFaceItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(watchFaceItem);
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
                    RepeatedFieldBuilderV3<WatchFaceItem, Builder, WatchFaceItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem$List> r1 = com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem$List r3 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem$List r4 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$WatchFaceItem$List$Builder");
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
                return WatchFaceProtos.internal_static_WatchFaceItem_List_descriptor;
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

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
            public WatchFaceItem getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
            public java.util.List<WatchFaceItem> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
            public WatchFaceItemOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItem.ListOrBuilder
            public java.util.List<? extends WatchFaceItemOrBuilder> getListOrBuilderList() {
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
                return WatchFaceProtos.internal_static_WatchFaceItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((WatchFaceItem) codedInputStream.readMessage(WatchFaceItem.PARSER, extensionRegistryLite));
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
            WatchFaceItem getList(int i7);

            int getListCount();

            java.util.List<WatchFaceItem> getListList();

            WatchFaceItemOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends WatchFaceItemOrBuilder> getListOrBuilderList();
        }

        private WatchFaceItem() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            this.isCurrent_ = false;
            this.canRemove_ = false;
            this.versionCode_ = 0L;
            this.canEdit_ = false;
            this.backgroundColor_ = "";
            this.backgroundImage_ = "";
            this.style_ = "";
            this.dataList_ = Collections.EMPTY_LIST;
        }

        public static WatchFaceItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_WatchFaceItem_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WatchFaceItem parseDelimitedFrom(InputStream inputStream) {
            return (WatchFaceItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WatchFaceItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WatchFaceItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WatchFaceItem)) {
                return super.equals(obj);
            }
            WatchFaceItem watchFaceItem = (WatchFaceItem) obj;
            boolean z6 = hasId() == watchFaceItem.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(watchFaceItem.getId());
            }
            boolean z7 = z6 && hasName() == watchFaceItem.hasName();
            if (hasName()) {
                z7 = z7 && getName().equals(watchFaceItem.getName());
            }
            boolean z8 = z7 && hasIsCurrent() == watchFaceItem.hasIsCurrent();
            if (hasIsCurrent()) {
                z8 = z8 && getIsCurrent() == watchFaceItem.getIsCurrent();
            }
            boolean z9 = z8 && hasCanRemove() == watchFaceItem.hasCanRemove();
            if (hasCanRemove()) {
                z9 = z9 && getCanRemove() == watchFaceItem.getCanRemove();
            }
            boolean z10 = z9 && hasVersionCode() == watchFaceItem.hasVersionCode();
            if (hasVersionCode()) {
                z10 = z10 && getVersionCode() == watchFaceItem.getVersionCode();
            }
            boolean z11 = z10 && hasCanEdit() == watchFaceItem.hasCanEdit();
            if (hasCanEdit()) {
                z11 = z11 && getCanEdit() == watchFaceItem.getCanEdit();
            }
            boolean z12 = z11 && hasBackgroundColor() == watchFaceItem.hasBackgroundColor();
            if (hasBackgroundColor()) {
                z12 = z12 && getBackgroundColor().equals(watchFaceItem.getBackgroundColor());
            }
            boolean z13 = z12 && hasBackgroundImage() == watchFaceItem.hasBackgroundImage();
            if (hasBackgroundImage()) {
                z13 = z13 && getBackgroundImage().equals(watchFaceItem.getBackgroundImage());
            }
            boolean z14 = z13 && hasStyle() == watchFaceItem.hasStyle();
            if (hasStyle()) {
                z14 = z14 && getStyle().equals(watchFaceItem.getStyle());
            }
            return (z14 && this.dataList_.equals(watchFaceItem.dataList_)) && this.unknownFields.equals(watchFaceItem.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public String getBackgroundColor() {
            Object obj = this.backgroundColor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.backgroundColor_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public ByteString getBackgroundColorBytes() {
            Object obj = this.backgroundColor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundColor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public String getBackgroundImage() {
            Object obj = this.backgroundImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.backgroundImage_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public ByteString getBackgroundImageBytes() {
            Object obj = this.backgroundImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundImage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean getCanEdit() {
            return this.canEdit_;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean getCanRemove() {
            return this.canRemove_;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public WatchFaceSlot.Data getDataList(int i7) {
            return dataList_converter_.convert(this.dataList_.get(i7));
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public int getDataListCount() {
            return this.dataList_.size();
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public java.util.List<WatchFaceSlot.Data> getDataListList() {
            return new Internal.ListAdapter(this.dataList_, dataList_converter_);
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean getIsCurrent() {
            return this.isCurrent_;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
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

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
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
        public Parser<WatchFaceItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.isCurrent_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(4, this.canRemove_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(5, this.versionCode_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(6, this.canEdit_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeStringSize += GeneratedMessage.computeStringSize(7, this.backgroundColor_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeStringSize += GeneratedMessage.computeStringSize(8, this.backgroundImage_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeStringSize += GeneratedMessage.computeStringSize(9, this.style_);
            }
            int iComputeEnumSizeNoTag = 0;
            for (int i8 = 0; i8 < this.dataList_.size(); i8++) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.dataList_.get(i8).intValue());
            }
            int size = iComputeStringSize + iComputeEnumSizeNoTag + this.dataList_.size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.style_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public long getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasBackgroundColor() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasBackgroundImage() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasCanEdit() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasCanRemove() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasIsCurrent() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasStyle() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceItemOrBuilder
        public boolean hasVersionCode() {
            return (this.bitField0_ & 16) == 16;
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
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getName().hashCode();
            }
            if (hasIsCurrent()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getIsCurrent());
            }
            if (hasCanRemove()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashBoolean(getCanRemove());
            }
            if (hasVersionCode()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashLong(getVersionCode());
            }
            if (hasCanEdit()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + Internal.hashBoolean(getCanEdit());
            }
            if (hasBackgroundColor()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getBackgroundColor().hashCode();
            }
            if (hasBackgroundImage()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getBackgroundImage().hashCode();
            }
            if (hasStyle()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getStyle().hashCode();
            }
            if (getDataListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + this.dataList_.hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_WatchFaceItem_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFaceItem.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIsCurrent()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.isCurrent_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBool(4, this.canRemove_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeUInt64(5, this.versionCode_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBool(6, this.canEdit_);
            }
            if ((this.bitField0_ & 64) == 64) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.backgroundColor_);
            }
            if ((this.bitField0_ & 128) == 128) {
                GeneratedMessage.writeString(codedOutputStream, 8, this.backgroundImage_);
            }
            if ((this.bitField0_ & 256) == 256) {
                GeneratedMessage.writeString(codedOutputStream, 9, this.style_);
            }
            for (int i7 = 0; i7 < this.dataList_.size(); i7++) {
                codedOutputStream.writeEnum(10, this.dataList_.get(i7).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
        private WatchFaceItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            char c7 = 0;
            while (true) {
                ?? unknownField = 512;
                if (z6) {
                    if ((c7 & 512) == 512) {
                        this.dataList_ = Collections.unmodifiableList(this.dataList_);
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
                            case 10:
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.id_ = bytes;
                                break;
                            case 18:
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.name_ = bytes2;
                                break;
                            case 24:
                                this.bitField0_ |= 4;
                                this.isCurrent_ = codedInputStream.readBool();
                                break;
                            case 32:
                                this.bitField0_ |= 8;
                                this.canRemove_ = codedInputStream.readBool();
                                break;
                            case 40:
                                this.bitField0_ |= 16;
                                this.versionCode_ = codedInputStream.readUInt64();
                                break;
                            case 48:
                                this.bitField0_ |= 32;
                                this.canEdit_ = codedInputStream.readBool();
                                break;
                            case 58:
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 64;
                                this.backgroundColor_ = bytes3;
                                break;
                            case 66:
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 128;
                                this.backgroundImage_ = bytes4;
                                break;
                            case 74:
                                ByteString bytes5 = codedInputStream.readBytes();
                                this.bitField0_ |= 256;
                                this.style_ = bytes5;
                                break;
                            case 80:
                                int i7 = codedInputStream.readEnum();
                                if (WatchFaceSlot.Data.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(10, i7);
                                } else {
                                    if ((c7 & 512) != 512) {
                                        this.dataList_ = new ArrayList();
                                        c7 = 512;
                                    }
                                    this.dataList_.add(Integer.valueOf(i7));
                                }
                                break;
                            case 82:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int i8 = codedInputStream.readEnum();
                                    if (WatchFaceSlot.Data.valueOf(i8) == null) {
                                        builderNewBuilder.mergeVarintField(10, i8);
                                    } else {
                                        if ((c7 & 512) != 512) {
                                            this.dataList_ = new ArrayList();
                                            c7 = 512;
                                        }
                                        this.dataList_.add(Integer.valueOf(i8));
                                    }
                                }
                                codedInputStream.popLimit(iPushLimit);
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
                    if ((c7 & 512) == unknownField) {
                        this.dataList_ = Collections.unmodifiableList(this.dataList_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
        }

        public static Builder newBuilder(WatchFaceItem watchFaceItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(watchFaceItem);
        }

        public static WatchFaceItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFaceItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WatchFaceItem parseFrom(CodedInputStream codedInputStream) {
            return (WatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WatchFaceItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WatchFaceItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WatchFaceItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WatchFaceItem parseFrom(InputStream inputStream) {
            return (WatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WatchFaceItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFaceItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WatchFaceItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WatchFaceItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WatchFaceItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WatchFaceItemOrBuilder extends MessageOrBuilder {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        String getBackgroundImage();

        ByteString getBackgroundImageBytes();

        boolean getCanEdit();

        boolean getCanRemove();

        WatchFaceSlot.Data getDataList(int i7);

        int getDataListCount();

        List<WatchFaceSlot.Data> getDataListList();

        String getId();

        ByteString getIdBytes();

        boolean getIsCurrent();

        String getName();

        ByteString getNameBytes();

        String getStyle();

        ByteString getStyleBytes();

        long getVersionCode();

        boolean hasBackgroundColor();

        boolean hasBackgroundImage();

        boolean hasCanEdit();

        boolean hasCanRemove();

        boolean hasId();

        boolean hasIsCurrent();

        boolean hasName();

        boolean hasStyle();

        boolean hasVersionCode();
    }

    public interface WatchFaceOrBuilder extends MessageOrBuilder {
        BgImageResult getBgImageResult();

        BgImageResultOrBuilder getBgImageResultOrBuilder();

        EditRequest getEditRequest();

        EditRequestOrBuilder getEditRequestOrBuilder();

        EditResponse getEditResponse();

        EditResponseOrBuilder getEditResponseOrBuilder();

        String getId();

        ByteString getIdBytes();

        WatchFaceInfo.List getInfoList();

        WatchFaceInfo.ListOrBuilder getInfoListOrBuilder();

        InstallResult getInstallResult();

        InstallResultOrBuilder getInstallResultOrBuilder();

        String getPath();

        ByteString getPathBytes();

        WatchFace.PayloadCase getPayloadCase();

        PrepareInfo getPrepareInfo();

        PrepareInfoOrBuilder getPrepareInfoOrBuilder();

        CommonProtos.PrepareStatus getPrepareStatus();

        boolean getSuccess();

        WatchFaceSlot.List getSupportDataList();

        WatchFaceSlot.ListOrBuilder getSupportDataListOrBuilder();

        WatchFaceItem.List getWatchFaceList();

        WatchFaceItem.ListOrBuilder getWatchFaceListOrBuilder();

        boolean hasBgImageResult();

        boolean hasEditRequest();

        boolean hasEditResponse();

        boolean hasId();

        boolean hasInfoList();

        boolean hasInstallResult();

        boolean hasPath();

        boolean hasPrepareInfo();

        boolean hasPrepareStatus();

        boolean hasSuccess();

        boolean hasSupportDataList();

        boolean hasWatchFaceList();
    }

    public static final class WatchFaceSlot extends GeneratedMessageV3 implements WatchFaceSlotOrBuilder {
        private static final WatchFaceSlot DEFAULT_INSTANCE = new WatchFaceSlot();

        @Deprecated
        public static final Parser<WatchFaceSlot> PARSER = new AbstractParser<WatchFaceSlot>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.1
            @Override // com.google.protobuf.Parser
            public WatchFaceSlot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WatchFaceSlot(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WatchFaceSlotOrBuilder {
            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_WatchFaceSlot_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_WatchFaceSlot_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_WatchFaceSlot_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFaceSlot.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFaceSlot build() {
                WatchFaceSlot watchFaceSlotBuildPartial = buildPartial();
                if (watchFaceSlotBuildPartial.isInitialized()) {
                    return watchFaceSlotBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) watchFaceSlotBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WatchFaceSlot buildPartial() {
                WatchFaceSlot watchFaceSlot = new WatchFaceSlot(this);
                onBuilt();
                return watchFaceSlot;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WatchFaceSlot getDefaultInstanceForType() {
                return WatchFaceSlot.getDefaultInstance();
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
            public com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot> r1 = com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot r3 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot r4 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WatchFaceSlot) {
                    return mergeFrom((WatchFaceSlot) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WatchFaceSlot watchFaceSlot) {
                if (watchFaceSlot == WatchFaceSlot.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(((GeneratedMessage) watchFaceSlot).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum Data implements ProtocolMessageEnum {
            EMPTY(0),
            HEART_RATE(1),
            PRESSURE(2),
            SLEEP(3),
            ENERGY(4),
            STEP(5),
            CALORIE(6),
            VALID_STAND(7),
            BATTERY(8),
            DATE(9),
            WEATHER(10),
            AIR_PRESSURE(11),
            ALTITUDE(12),
            TIMER(13),
            CLOCK(14),
            AQI(15),
            HUMIDITY(16),
            SPORT_MODE(17),
            UVI(18),
            SUNRISE_SUNSET(19),
            WIND_DIRECTION(20);

            public static final int AIR_PRESSURE_VALUE = 11;
            public static final int ALTITUDE_VALUE = 12;
            public static final int AQI_VALUE = 15;
            public static final int BATTERY_VALUE = 8;
            public static final int CALORIE_VALUE = 6;
            public static final int CLOCK_VALUE = 14;
            public static final int DATE_VALUE = 9;
            public static final int EMPTY_VALUE = 0;
            public static final int ENERGY_VALUE = 4;
            public static final int HEART_RATE_VALUE = 1;
            public static final int HUMIDITY_VALUE = 16;
            public static final int PRESSURE_VALUE = 2;
            public static final int SLEEP_VALUE = 3;
            public static final int SPORT_MODE_VALUE = 17;
            public static final int STEP_VALUE = 5;
            public static final int SUNRISE_SUNSET_VALUE = 19;
            public static final int TIMER_VALUE = 13;
            public static final int UVI_VALUE = 18;
            public static final int VALID_STAND_VALUE = 7;
            public static final int WEATHER_VALUE = 10;
            public static final int WIND_DIRECTION_VALUE = 20;
            private final int value;
            private static final Internal.EnumLiteMap<Data> internalValueMap = new Internal.EnumLiteMap<Data>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.Data.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Data findValueByNumber(int i7) {
                    return Data.forNumber(i7);
                }
            };
            private static final Data[] VALUES = values();

            Data(int i7) {
                this.value = i7;
            }

            public static Data forNumber(int i7) {
                switch (i7) {
                    case 0:
                        return EMPTY;
                    case 1:
                        return HEART_RATE;
                    case 2:
                        return PRESSURE;
                    case 3:
                        return SLEEP;
                    case 4:
                        return ENERGY;
                    case 5:
                        return STEP;
                    case 6:
                        return CALORIE;
                    case 7:
                        return VALID_STAND;
                    case 8:
                        return BATTERY;
                    case 9:
                        return DATE;
                    case 10:
                        return WEATHER;
                    case 11:
                        return AIR_PRESSURE;
                    case 12:
                        return ALTITUDE;
                    case 13:
                        return TIMER;
                    case 14:
                        return CLOCK;
                    case 15:
                        return AQI;
                    case 16:
                        return HUMIDITY;
                    case 17:
                        return SPORT_MODE;
                    case 18:
                        return UVI;
                    case 19:
                        return SUNRISE_SUNSET;
                    case 20:
                        return WIND_DIRECTION;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return WatchFaceSlot.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Data> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Data valueOf(int i7) {
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

            public static Data valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<Integer> list_;
            private byte memoizedIsInitialized;
            private static final Internal.ListAdapter.Converter<Integer, Data> list_converter_ = new Internal.ListAdapter.Converter<Integer, Data>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.List.1
                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                public Data convert(Integer num) {
                    Data dataValueOf = Data.valueOf(num.intValue());
                    return dataValueOf == null ? Data.EMPTY : dataValueOf;
                }
            };
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.List.2
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private java.util.List<Integer> list_;

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
                    return WatchFaceProtos.internal_static_WatchFaceSlot_List_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
                }

                public Builder addAllList(Iterable<? extends Data> iterable) {
                    ensureListIsMutable();
                    Iterator<? extends Data> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.list_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addList(Data data) {
                    data.getClass();
                    ensureListIsMutable();
                    this.list_.add(Integer.valueOf(data.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WatchFaceProtos.internal_static_WatchFaceSlot_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.ListOrBuilder
                public Data getList(int i7) {
                    return (Data) List.list_converter_.convert(this.list_.get(i7));
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.ListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.ListOrBuilder
                public java.util.List<Data> getListList() {
                    return new Internal.ListAdapter(this.list_, List.list_converter_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WatchFaceProtos.internal_static_WatchFaceSlot_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, Data data) {
                    data.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, Integer.valueOf(data.getNumber()));
                    onChanged();
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
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
                    List list = new List(this);
                    if ((this.bitField0_ & 1) == 1) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    list.list_ = this.list_;
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
                public com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot$List> r1 = com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot$List r3 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot$List r4 = (com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WatchFaceProtos$WatchFaceSlot$List$Builder");
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
                return WatchFaceProtos.internal_static_WatchFaceSlot_List_descriptor;
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
                return this.list_.equals(list.list_) && this.unknownFields.equals(list.unknownFields);
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.ListOrBuilder
            public Data getList(int i7) {
                return list_converter_.convert(this.list_.get(i7));
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.WatchFaceProtos.WatchFaceSlot.ListOrBuilder
            public java.util.List<Data> getListList() {
                return new Internal.ListAdapter(this.list_, list_converter_);
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
                int iComputeEnumSizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.list_.get(i8).intValue());
                }
                int size = iComputeEnumSizeNoTag + this.list_.size() + this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
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
                    iHashCode = (((iHashCode * 37) + 1) * 53) + this.list_.hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_WatchFaceSlot_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i7 = 0; i7 < this.list_.size(); i7++) {
                    codedOutputStream.writeEnum(1, this.list_.get(i7).intValue());
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
                                if (tag == 8) {
                                    int i7 = codedInputStream.readEnum();
                                    if (Data.valueOf(i7) == null) {
                                        builderNewBuilder.mergeVarintField(1, i7);
                                    } else {
                                        if (!z7) {
                                            this.list_ = new ArrayList();
                                            z7 = true;
                                        }
                                        this.list_.add(Integer.valueOf(i7));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i8 = codedInputStream.readEnum();
                                        if (Data.valueOf(i8) == null) {
                                            builderNewBuilder.mergeVarintField(1, i8);
                                        } else {
                                            if (!z7) {
                                                this.list_ = new ArrayList();
                                                z7 = true;
                                            }
                                            this.list_.add(Integer.valueOf(i8));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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
            Data getList(int i7);

            int getListCount();

            java.util.List<Data> getListList();
        }

        private WatchFaceSlot() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WatchFaceSlot getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_WatchFaceSlot_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WatchFaceSlot parseDelimitedFrom(InputStream inputStream) {
            return (WatchFaceSlot) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WatchFaceSlot parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WatchFaceSlot> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof WatchFaceSlot) ? super.equals(obj) : this.unknownFields.equals(((WatchFaceSlot) obj).unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WatchFaceSlot> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int serializedSize = this.unknownFields.getSerializedSize();
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
            int iHashCode = ((getDescriptor().hashCode() + DataBinderMapperImpl.Yd) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_WatchFaceSlot_fieldAccessorTable.ensureFieldAccessorsInitialized(WatchFaceSlot.class, Builder.class);
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WatchFaceSlot(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag == 0 || !parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            z6 = true;
                        }
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(this);
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(this);
                    }
                } finally {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Builder newBuilder(WatchFaceSlot watchFaceSlot) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(watchFaceSlot);
        }

        public static WatchFaceSlot parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceSlot) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFaceSlot parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WatchFaceSlot parseFrom(CodedInputStream codedInputStream) {
            return (WatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WatchFaceSlot getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WatchFaceSlot(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WatchFaceSlot parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WatchFaceSlot parseFrom(InputStream inputStream) {
            return (WatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WatchFaceSlot parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WatchFaceSlot parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WatchFaceSlot parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WatchFaceSlot parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WatchFaceSlot parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WatchFaceSlotOrBuilder extends MessageOrBuilder {
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015wear_watch_face.proto\u001a\fnanopb.proto\u001a\u0011wear_common.proto\"Ü\u0005\n\tWatchFace\u0012.\n\u000fwatch_face_list\u0018\u0001 \u0001(\u000b2\u0013.WatchFaceItem.ListH\u0000\u0012\u0013\n\u0002id\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\u0015\n\u0004path\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\u0011\n\u0007success\u0018\u0004 \u0001(\bH\u0000\u0012(\n\u000eprepare_status\u0018\u0005 \u0001(\u000e2\u000e.PrepareStatusH\u0000\u0012$\n\fprepare_info\u0018\u0006 \u0001(\u000b2\f.PrepareInfoH\u0000\u0012(\n\u000einstall_result\u0018\u0007 \u0001(\u000b2\u000e.InstallResultH\u0000\u0012(\n\tinfo_list\u0018\b \u0001(\u000b2\u0013.WatchFaceInfo.ListH\u0000\u00120\n\u0011support_data_list\u0018\u000b \u0001(\u000b2\u0013.WatchFaceSlot.ListH\u0000\u0012$\n\fedit_request\u0018\f \u0001(\u000b2\f.EditRequestH\u0000\u0012&\n\redit_response\u0018\r \u0001(\u000b2\r.EditResponseH\u0000\u0012)\n\u000fbg_image_result\u0018\u000e \u0001(\u000b2\u000e.BgImageResultH\u0000\"\u0085\u0002\n\u000bWatchFaceID\u0012\u0016\n\u0012GET_INSTALLED_LIST\u0010\u0000\u0012\u0012\n\u000eSET_WATCH_FACE\u0010\u0001\u0012\u0015\n\u0011REMOVE_WATCH_FACE\u0010\u0002\u0012\u001b\n\u0017REMOVE_WATCH_FACE_PHOTO\u0010\u0003\u0012\u001e\n\u001aPREPARE_INSTALL_WATCH_FACE\u0010\u0004\u0012\u0019\n\u0015REPORT_INSTALL_RESULT\u0010\u0005\u0012\u001b\n\u0017REMOVE_MULTI_WATCH_FACE\u0010\u0006\u0012\u0014\n\u0010GET_SUPPORT_DATA\u0010\n\u0012\u0013\n\u000fEDIT_WATCH_FACE\u0010\u000b\u0012\u0013\n\u000fBG_IMAGE_RESULT\u0010\fB\t\n\u0007payload\"ä\u0002\n\rWatchFaceSlot\u001a0\n\u0004List\u0012(\n\u0004list\u0018\u0001 \u0003(\u000e2\u0013.WatchFaceSlot.DataB\u0005\u0092?\u0002\u0018\u0004\" \u0002\n\u0004Data\u0012\t\n\u0005EMPTY\u0010\u0000\u0012\u000e\n\nHEART_RATE\u0010\u0001\u0012\f\n\bPRESSURE\u0010\u0002\u0012\t\n\u0005SLEEP\u0010\u0003\u0012\n\n\u0006ENERGY\u0010\u0004\u0012\b\n\u0004STEP\u0010\u0005\u0012\u000b\n\u0007CALORIE\u0010\u0006\u0012\u000f\n\u000bVALID_STAND\u0010\u0007\u0012\u000b\n\u0007BATTERY\u0010\b\u0012\b\n\u0004DATE\u0010\t\u0012\u000b\n\u0007WEATHER\u0010\n\u0012\u0010\n\fAIR_PRESSURE\u0010\u000b\u0012\f\n\bALTITUDE\u0010\f\u0012\t\n\u0005TIMER\u0010\r\u0012\t\n\u0005CLOCK\u0010\u000e\u0012\u0007\n\u0003AQI\u0010\u000f\u0012\f\n\bHUMIDITY\u0010\u0010\u0012\u000e\n\nSPORT_MODE\u0010\u0011\u0012\u0007\n\u0003UVI\u0010\u0012\u0012\u0012\n\u000eSUNRISE_SUNSET\u0010\u0013\u0012\u0012\n\u000eWIND_DIRECTION\u0010\u0014\"»\u0002\n\rWatchFaceItem\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\nis_current\u0018\u0003 \u0002(\b\u0012\u0012\n\ncan_remove\u0018\u0004 \u0001(\b\u0012\u0014\n\fversion_code\u0018\u0005 \u0001(\u0004\u0012\u0010\n\bcan_edit\u0018\u0006 \u0001(\b\u0012\u001f\n\u0010background_color\u0018\u0007 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010background_image\u0018\b \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005style\u0018\t \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012-\n\tdata_list\u0018\n \u0003(\u000e2\u0013.WatchFaceSlot.DataB\u0005\u0092?\u0002\u0018\u0004\u001a+\n\u0004List\u0012#\n\u0004list\u0018\u0001 \u0003(\u000b2\u000e.WatchFaceItemB\u0005\u0092?\u0002\u0018\u0004\"O\n\rWatchFaceInfo\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001a+\n\u0004List\u0012#\n\u0004list\u0018\u0001 \u0003(\u000b2\u000e.WatchFaceInfoB\u0005\u0092?\u0002\u0018\u0004\"Û\u0001\n\u000bEditRequest\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u000bset_current\u0018\u0002 \u0002(\b\u0012\u001f\n\u0010background_color\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010background_image\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001d\n\u0015background_image_size\u0018\u0005 \u0001(\r\u0012\u0014\n\u0005style\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012-\n\tdata_list\u0018\u0007 \u0003(\u000e2\u0013.WatchFaceSlot.DataB\u0005\u0092?\u0002\u0018\u0004\"µ\u0001\n\fEditResponse\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0004code\u0018\u0002 \u0002(\u000e2\u0012.EditResponse.Code\"p\n\u0004Code\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u001b\n\u0017SUCCESS_BUT_LOW_STORAGE\u0010\u0001\u0012\u0018\n\u0014FAIL_FOR_LOW_STORAGE\u0010\u0002\u0012\u001a\n\u0016FAIL_FOR_INVALID_PARAM\u0010\u0003\u0012\b\n\u0004FAIL\u0010\u0004\"¦\u0001\n\rBgImageResult\u0012!\n\u0004code\u0018\u0001 \u0002(\u000e2\u0013.BgImageResult.Code\u0012\u0011\n\u0002id\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"_\n\u0004Code\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0015\n\u0011IMAGE_SAVE_FAILED\u0010\u0001\u0012\u0018\n\u0014IMAGE_RESOLVE_FAILED\u0010\u0002\u0012\u0019\n\u0015NO_WATCH_FACE_MATCHED\u0010\u0003\"D\n\u000bPrepareInfo\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\f\n\u0004size\u0018\u0002 \u0002(\r\u0012\u0014\n\fversion_code\u0018\u0003 \u0001(\u0004\"±\u0001\n\rInstallResult\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012!\n\u0004code\u0018\u0002 \u0002(\u000e2\u0013.InstallResult.Code\u0012\u0014\n\fsupport_edit\u0018\u0003 \u0001(\b\"T\n\u0004Code\u0012\u0011\n\rVERIFY_FAILED\u0010\u0000\u0012\u0012\n\u000eINSTALL_FAILED\u0010\u0001\u0012\u0013\n\u000fINSTALL_SUCCESS\u0010\u0002\u0012\u0010\n\fINSTALL_USED\u0010\u0003B'\n\u0014com.zh.wear.protobufB\u000fWatchFaceProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.WatchFaceProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = WatchFaceProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_WatchFace_descriptor = descriptor2;
        internal_static_WatchFace_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"WatchFaceList", "Id", "Path", "Success", "PrepareStatus", "PrepareInfo", "InstallResult", "InfoList", "SupportDataList", "EditRequest", "EditResponse", "BgImageResult", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_WatchFaceSlot_descriptor = descriptor3;
        internal_static_WatchFaceSlot_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_WatchFaceSlot_List_descriptor = descriptor4;
        internal_static_WatchFaceSlot_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(2);
        internal_static_WatchFaceItem_descriptor = descriptor5;
        internal_static_WatchFaceItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Id", "Name", "IsCurrent", "CanRemove", "VersionCode", "CanEdit", "BackgroundColor", "BackgroundImage", "Style", "DataList"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_WatchFaceItem_List_descriptor = descriptor6;
        internal_static_WatchFaceItem_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(3);
        internal_static_WatchFaceInfo_descriptor = descriptor7;
        internal_static_WatchFaceInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Id"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_WatchFaceInfo_List_descriptor = descriptor8;
        internal_static_WatchFaceInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(4);
        internal_static_EditRequest_descriptor = descriptor9;
        internal_static_EditRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Id", "SetCurrent", "BackgroundColor", "BackgroundImage", "BackgroundImageSize", "Style", "DataList"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(5);
        internal_static_EditResponse_descriptor = descriptor10;
        internal_static_EditResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Id", "Code"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(6);
        internal_static_BgImageResult_descriptor = descriptor11;
        internal_static_BgImageResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Code", "Id"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(7);
        internal_static_PrepareInfo_descriptor = descriptor12;
        internal_static_PrepareInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Id", "Size", "VersionCode"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(8);
        internal_static_InstallResult_descriptor = descriptor13;
        internal_static_InstallResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Id", "Code", "SupportEdit"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
    }

    private WatchFaceProtos() {
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