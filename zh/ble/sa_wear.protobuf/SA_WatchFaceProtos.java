package com.zh.ble.sa_wear.protobuf;

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
import com.google.protobuf.GeneratedFile;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class SA_WatchFaceProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SABgImageResult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SABgImageResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAChange_Watch_Face_Info_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAChange_Watch_Face_Info_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAEditRequest_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAEditRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAEditResponse_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAEditResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAInstallResult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAInstallResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAPrepareInfo_Verification_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAPrepareInfo_Verification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAPrepareInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAPrepareInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAPrepareReply_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAPrepareReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceImage_GroupList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceImage_GroupList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceImage_Group_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceImage_Group_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceImage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceImage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceInfo_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceItem_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceItem_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceItem_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceSlot_Item_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceSlot_Item_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceSlot_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceSlot_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFaceSlot_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFaceSlot_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWatchFace_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWatchFace_fieldAccessorTable;

    public static final class SABgImageResult extends GeneratedMessage implements SABgImageResultOrBuilder {
        public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 3;
        public static final int CODE_FIELD_NUMBER = 1;
        private static final SABgImageResult DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        private static final Parser<SABgImageResult> PARSER;
        private static final long serialVersionUID = 0;
        private volatile Object backgroundImage_;
        private int bitField0_;
        private int code_;
        private volatile Object id_;
        private byte memoizedIsInitialized;

        public enum Code implements ProtocolMessageEnum {
            SUCCESS(0),
            IMAGE_SAVE_FAILED(1),
            IMAGE_RESOLVE_FAILED(2),
            NO_WATCH_FACE_MATCHED(3);

            public static final int IMAGE_RESOLVE_FAILED_VALUE = 2;
            public static final int IMAGE_SAVE_FAILED_VALUE = 1;
            public static final int NO_WATCH_FACE_MATCHED_VALUE = 3;
            public static final int SUCCESS_VALUE = 0;
            private static final Code[] VALUES;
            private static final Internal.EnumLiteMap<Code> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Code");
                internalValueMap = new Internal.EnumLiteMap<Code>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResult.Code.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Code findValueByNumber(int i7) {
                        return Code.forNumber(i7);
                    }
                };
                VALUES = values();
            }

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

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SABgImageResult.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<Code> internalGetValueMap() {
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
            public static Code valueOf(int i7) {
                return forNumber(i7);
            }

            public static Code valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SABgImageResult");
            DEFAULT_INSTANCE = new SABgImageResult();
            PARSER = new AbstractParser<SABgImageResult>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResult.1
                @Override // com.google.protobuf.Parser
                public SABgImageResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SABgImageResult.newBuilder();
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

        public static SABgImageResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SABgImageResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SABgImageResult parseDelimitedFrom(InputStream inputStream) {
            return (SABgImageResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SABgImageResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SABgImageResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SABgImageResult)) {
                return super.equals(obj);
            }
            SABgImageResult sABgImageResult = (SABgImageResult) obj;
            if (hasCode() != sABgImageResult.hasCode()) {
                return false;
            }
            if ((hasCode() && this.code_ != sABgImageResult.code_) || hasId() != sABgImageResult.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(sABgImageResult.getId())) && hasBackgroundImage() == sABgImageResult.hasBackgroundImage()) {
                return (!hasBackgroundImage() || getBackgroundImage().equals(sABgImageResult.getBackgroundImage())) && getUnknownFields().equals(sABgImageResult.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
        public ByteString getBackgroundImageBytes() {
            Object obj = this.backgroundImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundImage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
        public Code getCode() {
            Code codeForNumber = Code.forNumber(this.code_);
            return codeForNumber == null ? Code.SUCCESS : codeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SABgImageResult_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
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
        public Parser<SABgImageResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.code_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.id_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.backgroundImage_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
        public boolean hasBackgroundImage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasBackgroundImage()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getBackgroundImage().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SABgImageResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SABgImageResult.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.code_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.id_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.backgroundImage_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SABgImageResultOrBuilder {
            private Object backgroundImage_;
            private int bitField0_;
            private int code_;
            private Object id_;

            private void buildPartial0(SABgImageResult sABgImageResult) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sABgImageResult.code_ = this.code_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sABgImageResult.id_ = this.id_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sABgImageResult.backgroundImage_ = this.backgroundImage_;
                    i7 |= 4;
                }
                sABgImageResult.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SABgImageResult_descriptor;
            }

            public Builder clearBackgroundImage() {
                this.backgroundImage_ = SABgImageResult.getDefaultInstance().getBackgroundImage();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SABgImageResult.getDefaultInstance().getId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
            public ByteString getBackgroundImageBytes() {
                Object obj = this.backgroundImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundImage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
            public Code getCode() {
                Code codeForNumber = Code.forNumber(this.code_);
                return codeForNumber == null ? Code.SUCCESS : codeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SABgImageResult_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
            public boolean hasBackgroundImage() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SABgImageResultOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SABgImageResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SABgImageResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCode();
            }

            public Builder setBackgroundImage(String str) {
                str.getClass();
                this.backgroundImage_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageBytes(ByteString byteString) {
                byteString.getClass();
                this.backgroundImage_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
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
                this.id_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.code_ = 0;
                this.id_ = "";
                this.backgroundImage_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SABgImageResult build() {
                SABgImageResult sABgImageResultBuildPartial = buildPartial();
                if (sABgImageResultBuildPartial.isInitialized()) {
                    return sABgImageResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sABgImageResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SABgImageResult buildPartial() {
                SABgImageResult sABgImageResult = new SABgImageResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sABgImageResult);
                }
                onBuilt();
                return sABgImageResult;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SABgImageResult getDefaultInstanceForType() {
                return SABgImageResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.code_ = 0;
                this.id_ = "";
                this.backgroundImage_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.code_ = 0;
                this.id_ = "";
                this.backgroundImage_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SABgImageResult) {
                    return mergeFrom((SABgImageResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SABgImageResult sABgImageResult) {
                if (sABgImageResult == SABgImageResult.getDefaultInstance()) {
                    return this;
                }
                if (sABgImageResult.hasCode()) {
                    setCode(sABgImageResult.getCode());
                }
                if (sABgImageResult.hasId()) {
                    this.id_ = sABgImageResult.id_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sABgImageResult.hasBackgroundImage()) {
                    this.backgroundImage_ = sABgImageResult.backgroundImage_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(sABgImageResult.getUnknownFields());
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
                                    if (Code.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.code_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.backgroundImage_ = codedInputStream.readBytes();
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

        private SABgImageResult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.code_ = 0;
            this.id_ = "";
            this.backgroundImage_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SABgImageResult sABgImageResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sABgImageResult);
        }

        public static SABgImageResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SABgImageResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SABgImageResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SABgImageResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SABgImageResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SABgImageResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SABgImageResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SABgImageResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SABgImageResult() {
            this.code_ = 0;
            this.id_ = "";
            this.backgroundImage_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
            this.id_ = "";
            this.backgroundImage_ = "";
        }

        public static SABgImageResult parseFrom(InputStream inputStream) {
            return (SABgImageResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SABgImageResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SABgImageResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SABgImageResult parseFrom(CodedInputStream codedInputStream) {
            return (SABgImageResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SABgImageResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SABgImageResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SABgImageResultOrBuilder extends MessageOrBuilder {
        String getBackgroundImage();

        ByteString getBackgroundImageBytes();

        SABgImageResult.Code getCode();

        String getId();

        ByteString getIdBytes();

        boolean hasBackgroundImage();

        boolean hasCode();

        boolean hasId();
    }

    public static final class SAChange_Watch_Face_Info extends GeneratedMessage implements SAChange_Watch_Face_InfoOrBuilder {
        private static final SAChange_Watch_Face_Info DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAChange_Watch_Face_Info> PARSER;
        public static final int TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int type_;

        public enum Type implements ProtocolMessageEnum {
            REMOVE(0),
            CHANGE_ORDER(1);

            public static final int CHANGE_ORDER_VALUE = 1;
            public static final int REMOVE_VALUE = 0;
            private static final Type[] VALUES;
            private static final Internal.EnumLiteMap<Type> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Type");
                internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_Info.Type.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Type findValueByNumber(int i7) {
                        return Type.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            Type(int i7) {
                this.value = i7;
            }

            public static Type forNumber(int i7) {
                if (i7 == 0) {
                    return REMOVE;
                }
                if (i7 != 1) {
                    return null;
                }
                return CHANGE_ORDER;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SAChange_Watch_Face_Info.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
            public static Type valueOf(int i7) {
                return forNumber(i7);
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAChange_Watch_Face_Info");
            DEFAULT_INSTANCE = new SAChange_Watch_Face_Info();
            PARSER = new AbstractParser<SAChange_Watch_Face_Info>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_Info.1
                @Override // com.google.protobuf.Parser
                public SAChange_Watch_Face_Info parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAChange_Watch_Face_Info.newBuilder();
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

        public static SAChange_Watch_Face_Info getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAChange_Watch_Face_Info_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAChange_Watch_Face_Info parseDelimitedFrom(InputStream inputStream) {
            return (SAChange_Watch_Face_Info) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAChange_Watch_Face_Info parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAChange_Watch_Face_Info> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAChange_Watch_Face_Info)) {
                return super.equals(obj);
            }
            SAChange_Watch_Face_Info sAChange_Watch_Face_Info = (SAChange_Watch_Face_Info) obj;
            if (hasId() != sAChange_Watch_Face_Info.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(sAChange_Watch_Face_Info.getId())) && hasType() == sAChange_Watch_Face_Info.hasType()) {
                return (!hasType() || this.type_ == sAChange_Watch_Face_Info.type_) && getUnknownFields().equals(sAChange_Watch_Face_Info.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAChange_Watch_Face_Info_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
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
        public Parser<SAChange_Watch_Face_Info> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.REMOVE : typeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
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
            if (hasId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getId().hashCode();
            }
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.type_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAChange_Watch_Face_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(SAChange_Watch_Face_Info.class, Builder.class);
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
            if (hasType()) {
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
                codedOutputStream.writeEnum(2, this.type_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAChange_Watch_Face_InfoOrBuilder {
            private int bitField0_;
            private Object id_;
            private int type_;

            private void buildPartial0(SAChange_Watch_Face_Info sAChange_Watch_Face_Info) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAChange_Watch_Face_Info.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAChange_Watch_Face_Info.type_ = this.type_;
                    i7 |= 2;
                }
                sAChange_Watch_Face_Info.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAChange_Watch_Face_Info_descriptor;
            }

            public Builder clearId() {
                this.id_ = SAChange_Watch_Face_Info.getDefaultInstance().getId();
                this.bitField0_ &= -2;
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
                return SA_WatchFaceProtos.internal_static_SA_SAChange_Watch_Face_Info_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.REMOVE : typeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAChange_Watch_Face_InfoOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAChange_Watch_Face_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(SAChange_Watch_Face_Info.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasType();
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

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 2;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.type_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAChange_Watch_Face_Info build() {
                SAChange_Watch_Face_Info sAChange_Watch_Face_InfoBuildPartial = buildPartial();
                if (sAChange_Watch_Face_InfoBuildPartial.isInitialized()) {
                    return sAChange_Watch_Face_InfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAChange_Watch_Face_InfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAChange_Watch_Face_Info buildPartial() {
                SAChange_Watch_Face_Info sAChange_Watch_Face_Info = new SAChange_Watch_Face_Info(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAChange_Watch_Face_Info);
                }
                onBuilt();
                return sAChange_Watch_Face_Info;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAChange_Watch_Face_Info getDefaultInstanceForType() {
                return SAChange_Watch_Face_Info.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.type_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.type_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAChange_Watch_Face_Info) {
                    return mergeFrom((SAChange_Watch_Face_Info) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAChange_Watch_Face_Info sAChange_Watch_Face_Info) {
                if (sAChange_Watch_Face_Info == SAChange_Watch_Face_Info.getDefaultInstance()) {
                    return this;
                }
                if (sAChange_Watch_Face_Info.hasId()) {
                    this.id_ = sAChange_Watch_Face_Info.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAChange_Watch_Face_Info.hasType()) {
                    setType(sAChange_Watch_Face_Info.getType());
                }
                mergeUnknownFields(sAChange_Watch_Face_Info.getUnknownFields());
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
                                    if (Type.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.type_ = i7;
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

        private SAChange_Watch_Face_Info(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.type_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAChange_Watch_Face_Info sAChange_Watch_Face_Info) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAChange_Watch_Face_Info);
        }

        public static SAChange_Watch_Face_Info parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAChange_Watch_Face_Info parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAChange_Watch_Face_Info) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAChange_Watch_Face_Info parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAChange_Watch_Face_Info getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAChange_Watch_Face_Info parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAChange_Watch_Face_Info parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SAChange_Watch_Face_Info() {
            this.id_ = "";
            this.type_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.type_ = 0;
        }

        public static SAChange_Watch_Face_Info parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAChange_Watch_Face_Info parseFrom(InputStream inputStream) {
            return (SAChange_Watch_Face_Info) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAChange_Watch_Face_Info parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAChange_Watch_Face_Info) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAChange_Watch_Face_Info parseFrom(CodedInputStream codedInputStream) {
            return (SAChange_Watch_Face_Info) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAChange_Watch_Face_Info parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAChange_Watch_Face_Info) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAChange_Watch_Face_InfoOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        SAChange_Watch_Face_Info.Type getType();

        boolean hasId();

        boolean hasType();
    }

    public static final class SAEditRequest extends GeneratedMessage implements SAEditRequestOrBuilder {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
        public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 4;
        public static final int BACKGROUND_IMAGE_LIST_FIELD_NUMBER = 8;
        public static final int BACKGROUND_IMAGE_SIZE_FIELD_NUMBER = 5;
        public static final int BACKGROUND_IMAGE_SIZE_LIST_FIELD_NUMBER = 9;
        public static final int DATA_LIST_FIELD_NUMBER = 7;
        private static final SAEditRequest DEFAULT_INSTANCE;
        public static final int DELETE_ALL_IMAGES_FIELD_NUMBER = 11;
        public static final int FOREGROUND_COLOR_FIELD_NUMBER = 13;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IMAGE_GROUP_LIST_FIELD_NUMBER = 15;
        public static final int IMAGE_SWITCH_STYLE_FIELD_NUMBER = 16;
        public static final int ORDER_IMAGE_LIST_FIELD_NUMBER = 10;
        private static final Parser<SAEditRequest> PARSER;
        public static final int SET_CURRENT_FIELD_NUMBER = 2;
        public static final int SLOT_ITEM_LIST_FIELD_NUMBER = 12;
        public static final int STYLE_COLOR_INDEX_FIELD_NUMBER = 14;
        public static final int STYLE_FIELD_NUMBER = 6;
        private static final Internal.IntListAdapter.IntConverter<SAWatchFaceSlot.Data> dataList_converter_;
        private static final long serialVersionUID = 0;
        private volatile Object backgroundColor_;
        private LazyStringArrayList backgroundImageList_;
        private Internal.IntList backgroundImageSizeList_;
        private int backgroundImageSize_;
        private volatile Object backgroundImage_;
        private int bitField0_;
        private Internal.IntList dataList_;
        private boolean deleteAllImages_;
        private ByteString foregroundColor_;
        private volatile Object id_;
        private SAWatchFaceImage.GroupList imageGroupList_;
        private int imageSwitchStyle_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList orderImageList_;
        private boolean setCurrent_;
        private List<SAWatchFaceSlot.Item> slotItemList_;
        private int styleColorIndex_;
        private volatile Object style_;

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAEditRequestOrBuilder {
            private Object backgroundColor_;
            private LazyStringArrayList backgroundImageList_;
            private Internal.IntList backgroundImageSizeList_;
            private int backgroundImageSize_;
            private Object backgroundImage_;
            private int bitField0_;
            private Internal.IntList dataList_;
            private boolean deleteAllImages_;
            private ByteString foregroundColor_;
            private Object id_;
            private SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> imageGroupListBuilder_;
            private SAWatchFaceImage.GroupList imageGroupList_;
            private int imageSwitchStyle_;
            private LazyStringArrayList orderImageList_;
            private boolean setCurrent_;
            private RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> slotItemListBuilder_;
            private List<SAWatchFaceSlot.Item> slotItemList_;
            private int styleColorIndex_;
            private Object style_;

            private void buildPartial0(SAEditRequest sAEditRequest) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAEditRequest.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAEditRequest.setCurrent_ = this.setCurrent_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAEditRequest.backgroundColor_ = this.backgroundColor_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAEditRequest.foregroundColor_ = this.foregroundColor_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sAEditRequest.backgroundImage_ = this.backgroundImage_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sAEditRequest.backgroundImageSize_ = this.backgroundImageSize_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    this.backgroundImageList_.makeImmutable();
                    sAEditRequest.backgroundImageList_ = this.backgroundImageList_;
                }
                if ((i8 & 128) != 0) {
                    this.backgroundImageSizeList_.makeImmutable();
                    sAEditRequest.backgroundImageSizeList_ = this.backgroundImageSizeList_;
                }
                if ((i8 & 256) != 0) {
                    this.orderImageList_.makeImmutable();
                    sAEditRequest.orderImageList_ = this.orderImageList_;
                }
                if ((i8 & 512) != 0) {
                    sAEditRequest.deleteAllImages_ = this.deleteAllImages_;
                    i7 |= 64;
                }
                if ((i8 & 1024) != 0) {
                    SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                    sAEditRequest.imageGroupList_ = singleFieldBuilder == null ? this.imageGroupList_ : (SAWatchFaceImage.GroupList) singleFieldBuilder.build();
                    i7 |= 128;
                }
                if ((i8 & 2048) != 0) {
                    this.dataList_.makeImmutable();
                    sAEditRequest.dataList_ = this.dataList_;
                }
                if ((i8 & 8192) != 0) {
                    sAEditRequest.style_ = this.style_;
                    i7 |= 256;
                }
                if ((i8 & 16384) != 0) {
                    sAEditRequest.styleColorIndex_ = this.styleColorIndex_;
                    i7 |= 512;
                }
                if ((i8 & 32768) != 0) {
                    sAEditRequest.imageSwitchStyle_ = this.imageSwitchStyle_;
                    i7 |= 1024;
                }
                sAEditRequest.bitField0_ |= i7;
            }

            private void buildPartialRepeatedFields(SAEditRequest sAEditRequest) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    sAEditRequest.slotItemList_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 4096) != 0) {
                    this.slotItemList_ = Collections.unmodifiableList(this.slotItemList_);
                    this.bitField0_ &= -4097;
                }
                sAEditRequest.slotItemList_ = this.slotItemList_;
            }

            private void ensureBackgroundImageListIsMutable() {
                if (!this.backgroundImageList_.isModifiable()) {
                    this.backgroundImageList_ = new LazyStringArrayList((LazyStringList) this.backgroundImageList_);
                }
                this.bitField0_ |= 64;
            }

            private void ensureBackgroundImageSizeListIsMutable() {
                if (!this.backgroundImageSizeList_.isModifiable()) {
                    this.backgroundImageSizeList_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.backgroundImageSizeList_);
                }
                this.bitField0_ |= 128;
            }

            private void ensureDataListIsMutable() {
                if (!this.dataList_.isModifiable()) {
                    this.dataList_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.dataList_);
                }
                this.bitField0_ |= 2048;
            }

            private void ensureOrderImageListIsMutable() {
                if (!this.orderImageList_.isModifiable()) {
                    this.orderImageList_ = new LazyStringArrayList((LazyStringList) this.orderImageList_);
                }
                this.bitField0_ |= 256;
            }

            private void ensureSlotItemListIsMutable() {
                if ((this.bitField0_ & 4096) == 0) {
                    this.slotItemList_ = new ArrayList(this.slotItemList_);
                    this.bitField0_ |= 4096;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAEditRequest_descriptor;
            }

            private SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> internalGetImageGroupListFieldBuilder() {
                if (this.imageGroupListBuilder_ == null) {
                    this.imageGroupListBuilder_ = new SingleFieldBuilder<>(getImageGroupList(), getParentForChildren(), isClean());
                    this.imageGroupList_ = null;
                }
                return this.imageGroupListBuilder_;
            }

            private RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> internalGetSlotItemListFieldBuilder() {
                if (this.slotItemListBuilder_ == null) {
                    this.slotItemListBuilder_ = new RepeatedFieldBuilder<>(this.slotItemList_, (this.bitField0_ & 4096) != 0, getParentForChildren(), isClean());
                    this.slotItemList_ = null;
                }
                return this.slotItemListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetImageGroupListFieldBuilder();
                    internalGetSlotItemListFieldBuilder();
                }
            }

            public Builder addAllBackgroundImageList(Iterable<String> iterable) {
                ensureBackgroundImageListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.backgroundImageList_);
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder addAllBackgroundImageSizeList(Iterable<? extends Integer> iterable) {
                ensureBackgroundImageSizeListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.backgroundImageSizeList_);
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder addAllDataList(Iterable<? extends SAWatchFaceSlot.Data> iterable) {
                ensureDataListIsMutable();
                Iterator<? extends SAWatchFaceSlot.Data> it = iterable.iterator();
                while (it.hasNext()) {
                    this.dataList_.addInt(it.next().getNumber());
                }
                onChanged();
                return this;
            }

            public Builder addAllOrderImageList(Iterable<String> iterable) {
                ensureOrderImageListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.orderImageList_);
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder addAllSlotItemList(Iterable<? extends SAWatchFaceSlot.Item> iterable) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.addAllMessages(iterable);
                    return this;
                }
                ensureSlotItemListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.slotItemList_);
                onChanged();
                return this;
            }

            public Builder addBackgroundImageList(String str) {
                str.getClass();
                ensureBackgroundImageListIsMutable();
                this.backgroundImageList_.add(str);
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder addBackgroundImageListBytes(ByteString byteString) {
                byteString.getClass();
                ensureBackgroundImageListIsMutable();
                this.backgroundImageList_.add(byteString);
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder addBackgroundImageSizeList(int i7) {
                ensureBackgroundImageSizeListIsMutable();
                this.backgroundImageSizeList_.addInt(i7);
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder addDataList(SAWatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.addInt(data.getNumber());
                onChanged();
                return this;
            }

            public Builder addOrderImageList(String str) {
                str.getClass();
                ensureOrderImageListIsMutable();
                this.orderImageList_.add(str);
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder addOrderImageListBytes(ByteString byteString) {
                byteString.getClass();
                ensureOrderImageListIsMutable();
                this.orderImageList_.add(byteString);
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder addSlotItemList(SAWatchFaceSlot.Item item) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.addMessage(item);
                    return this;
                }
                item.getClass();
                ensureSlotItemListIsMutable();
                this.slotItemList_.add(item);
                onChanged();
                return this;
            }

            public SAWatchFaceSlot.Item.Builder addSlotItemListBuilder() {
                return (SAWatchFaceSlot.Item.Builder) internalGetSlotItemListFieldBuilder().addBuilder(SAWatchFaceSlot.Item.getDefaultInstance());
            }

            public Builder clearBackgroundColor() {
                this.backgroundColor_ = SAEditRequest.getDefaultInstance().getBackgroundColor();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearBackgroundImage() {
                this.backgroundImage_ = SAEditRequest.getDefaultInstance().getBackgroundImage();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearBackgroundImageList() {
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearBackgroundImageSize() {
                this.bitField0_ &= -33;
                this.backgroundImageSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBackgroundImageSizeList() {
                this.backgroundImageSizeList_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                onChanged();
                return this;
            }

            public Builder clearDataList() {
                this.dataList_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder clearDeleteAllImages() {
                this.bitField0_ &= -513;
                this.deleteAllImages_ = false;
                onChanged();
                return this;
            }

            public Builder clearForegroundColor() {
                this.bitField0_ &= -9;
                this.foregroundColor_ = SAEditRequest.getDefaultInstance().getForegroundColor();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SAEditRequest.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearImageGroupList() {
                this.bitField0_ &= -1025;
                this.imageGroupList_ = null;
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.imageGroupListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearImageSwitchStyle() {
                this.bitField0_ &= -32769;
                this.imageSwitchStyle_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOrderImageList() {
                this.orderImageList_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearSetCurrent() {
                this.bitField0_ &= -3;
                this.setCurrent_ = false;
                onChanged();
                return this;
            }

            public Builder clearSlotItemList() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.clear();
                    return this;
                }
                this.slotItemList_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -4097;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = SAEditRequest.getDefaultInstance().getStyle();
                this.bitField0_ &= -8193;
                onChanged();
                return this;
            }

            public Builder clearStyleColorIndex() {
                this.bitField0_ &= -16385;
                this.styleColorIndex_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ByteString getBackgroundColorBytes() {
                Object obj = this.backgroundColor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundColor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ByteString getBackgroundImageBytes() {
                Object obj = this.backgroundImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundImage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public String getBackgroundImageList(int i7) {
                return this.backgroundImageList_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ByteString getBackgroundImageListBytes(int i7) {
                return this.backgroundImageList_.getByteString(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getBackgroundImageListCount() {
                return this.backgroundImageList_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getBackgroundImageSize() {
                return this.backgroundImageSize_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getBackgroundImageSizeList(int i7) {
                return this.backgroundImageSizeList_.getInt(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getBackgroundImageSizeListCount() {
                return this.backgroundImageSizeList_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public List<Integer> getBackgroundImageSizeListList() {
                this.backgroundImageSizeList_.makeImmutable();
                return this.backgroundImageSizeList_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public SAWatchFaceSlot.Data getDataList(int i7) {
                return (SAWatchFaceSlot.Data) SAEditRequest.dataList_converter_.convert(this.dataList_.getInt(i7));
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getDataListCount() {
                return this.dataList_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public List<SAWatchFaceSlot.Data> getDataListList() {
                return new Internal.IntListAdapter(this.dataList_, SAEditRequest.dataList_converter_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean getDeleteAllImages() {
                return this.deleteAllImages_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAEditRequest_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ByteString getForegroundColor() {
                return this.foregroundColor_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public SAWatchFaceImage.GroupList getImageGroupList() {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWatchFaceImage.GroupList) singleFieldBuilder.getMessage();
                }
                SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
                return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
            }

            public SAWatchFaceImage.GroupList.Builder getImageGroupListBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (SAWatchFaceImage.GroupList.Builder) internalGetImageGroupListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public SAWatchFaceImage.GroupListOrBuilder getImageGroupListOrBuilder() {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWatchFaceImage.GroupListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
                return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getImageSwitchStyle() {
                return this.imageSwitchStyle_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public String getOrderImageList(int i7) {
                return this.orderImageList_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ByteString getOrderImageListBytes(int i7) {
                return this.orderImageList_.getByteString(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getOrderImageListCount() {
                return this.orderImageList_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean getSetCurrent() {
                return this.setCurrent_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public SAWatchFaceSlot.Item getSlotItemList(int i7) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? this.slotItemList_.get(i7) : (SAWatchFaceSlot.Item) repeatedFieldBuilder.getMessage(i7);
            }

            public SAWatchFaceSlot.Item.Builder getSlotItemListBuilder(int i7) {
                return (SAWatchFaceSlot.Item.Builder) internalGetSlotItemListFieldBuilder().getBuilder(i7);
            }

            public List<SAWatchFaceSlot.Item.Builder> getSlotItemListBuilderList() {
                return internalGetSlotItemListFieldBuilder().getBuilderList();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getSlotItemListCount() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? this.slotItemList_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public List<SAWatchFaceSlot.Item> getSlotItemListList() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.slotItemList_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public SAWatchFaceSlot.ItemOrBuilder getSlotItemListOrBuilder(int i7) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? this.slotItemList_.get(i7) : (SAWatchFaceSlot.ItemOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public List<? extends SAWatchFaceSlot.ItemOrBuilder> getSlotItemListOrBuilderList() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.slotItemList_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public int getStyleColorIndex() {
                return this.styleColorIndex_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasBackgroundColor() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasBackgroundImage() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasBackgroundImageSize() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasDeleteAllImages() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasForegroundColor() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasImageGroupList() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasImageSwitchStyle() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasSetCurrent() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasStyle() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public boolean hasStyleColorIndex() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAEditRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SAEditRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasSetCurrent()) {
                    return false;
                }
                if (hasImageGroupList() && !getImageGroupList().isInitialized()) {
                    return false;
                }
                for (int i7 = 0; i7 < getSlotItemListCount(); i7++) {
                    if (!getSlotItemList(i7).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeImageGroupList(SAWatchFaceImage.GroupList groupList) {
                SAWatchFaceImage.GroupList groupList2;
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(groupList);
                } else if ((this.bitField0_ & 1024) == 0 || (groupList2 = this.imageGroupList_) == null || groupList2 == SAWatchFaceImage.GroupList.getDefaultInstance()) {
                    this.imageGroupList_ = groupList;
                } else {
                    getImageGroupListBuilder().mergeFrom(groupList);
                }
                if (this.imageGroupList_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder removeSlotItemList(int i7) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.remove(i7);
                    return this;
                }
                ensureSlotItemListIsMutable();
                this.slotItemList_.remove(i7);
                onChanged();
                return this;
            }

            public Builder setBackgroundColor(String str) {
                str.getClass();
                this.backgroundColor_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                byteString.getClass();
                this.backgroundColor_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBackgroundImage(String str) {
                str.getClass();
                this.backgroundImage_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageBytes(ByteString byteString) {
                byteString.getClass();
                this.backgroundImage_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageList(int i7, String str) {
                str.getClass();
                ensureBackgroundImageListIsMutable();
                this.backgroundImageList_.set(i7, str);
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageSize(int i7) {
                this.backgroundImageSize_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageSizeList(int i7, int i8) {
                ensureBackgroundImageSizeListIsMutable();
                this.backgroundImageSizeList_.setInt(i7, i8);
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setDataList(int i7, SAWatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.setInt(i7, data.getNumber());
                onChanged();
                return this;
            }

            public Builder setDeleteAllImages(boolean z6) {
                this.deleteAllImages_ = z6;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setForegroundColor(ByteString byteString) {
                byteString.getClass();
                this.foregroundColor_ = byteString;
                this.bitField0_ |= 8;
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

            public Builder setImageGroupList(SAWatchFaceImage.GroupList groupList) {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder == null) {
                    groupList.getClass();
                    this.imageGroupList_ = groupList;
                } else {
                    singleFieldBuilder.setMessage(groupList);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setImageSwitchStyle(int i7) {
                this.imageSwitchStyle_ = i7;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setOrderImageList(int i7, String str) {
                str.getClass();
                ensureOrderImageListIsMutable();
                this.orderImageList_.set(i7, str);
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSetCurrent(boolean z6) {
                this.setCurrent_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSlotItemList(int i7, SAWatchFaceSlot.Item item) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.setMessage(i7, item);
                    return this;
                }
                item.getClass();
                ensureSlotItemListIsMutable();
                this.slotItemList_.set(i7, item);
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.style_ = str;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                this.style_ = byteString;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setStyleColorIndex(int i7) {
                this.styleColorIndex_ = i7;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ProtocolStringList getBackgroundImageListList() {
                this.backgroundImageList_.makeImmutable();
                return this.backgroundImageList_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
            public ProtocolStringList getOrderImageListList() {
                this.orderImageList_.makeImmutable();
                return this.orderImageList_;
            }

            private Builder() {
                this.id_ = "";
                this.backgroundColor_ = "";
                this.foregroundColor_ = ByteString.EMPTY;
                this.backgroundImage_ = "";
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.backgroundImageSizeList_ = GeneratedMessage.emptyIntList();
                this.orderImageList_ = LazyStringArrayList.emptyList();
                this.dataList_ = GeneratedMessage.emptyIntList();
                this.slotItemList_ = Collections.EMPTY_LIST;
                this.style_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAEditRequest build() {
                SAEditRequest sAEditRequestBuildPartial = buildPartial();
                if (sAEditRequestBuildPartial.isInitialized()) {
                    return sAEditRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAEditRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAEditRequest buildPartial() {
                SAEditRequest sAEditRequest = new SAEditRequest(this);
                buildPartialRepeatedFields(sAEditRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAEditRequest);
                }
                onBuilt();
                return sAEditRequest;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAEditRequest getDefaultInstanceForType() {
                return SAEditRequest.getDefaultInstance();
            }

            public SAWatchFaceSlot.Item.Builder addSlotItemListBuilder(int i7) {
                return (SAWatchFaceSlot.Item.Builder) internalGetSlotItemListFieldBuilder().addBuilder(i7, SAWatchFaceSlot.Item.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.setCurrent_ = false;
                this.backgroundColor_ = "";
                this.foregroundColor_ = ByteString.EMPTY;
                this.backgroundImage_ = "";
                this.backgroundImageSize_ = 0;
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.backgroundImageSizeList_ = GeneratedMessage.emptyIntList();
                this.orderImageList_ = LazyStringArrayList.emptyList();
                this.deleteAllImages_ = false;
                this.imageGroupList_ = null;
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.imageGroupListBuilder_ = null;
                }
                this.dataList_ = GeneratedMessage.emptyIntList();
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.slotItemList_ = Collections.EMPTY_LIST;
                } else {
                    this.slotItemList_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -4097;
                this.style_ = "";
                this.styleColorIndex_ = 0;
                this.imageSwitchStyle_ = 0;
                return this;
            }

            public Builder addSlotItemList(int i7, SAWatchFaceSlot.Item item) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    item.getClass();
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.add(i7, item);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilder.addMessage(i7, item);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAEditRequest) {
                    return mergeFrom((SAEditRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setImageGroupList(SAWatchFaceImage.GroupList.Builder builder) {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder == null) {
                    this.imageGroupList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setSlotItemList(int i7, SAWatchFaceSlot.Item.Builder builder) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.set(i7, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilder.setMessage(i7, builder.build());
                return this;
            }

            public Builder mergeFrom(SAEditRequest sAEditRequest) {
                if (sAEditRequest == SAEditRequest.getDefaultInstance()) {
                    return this;
                }
                if (sAEditRequest.hasId()) {
                    this.id_ = sAEditRequest.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAEditRequest.hasSetCurrent()) {
                    setSetCurrent(sAEditRequest.getSetCurrent());
                }
                if (sAEditRequest.hasBackgroundColor()) {
                    this.backgroundColor_ = sAEditRequest.backgroundColor_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sAEditRequest.hasForegroundColor()) {
                    setForegroundColor(sAEditRequest.getForegroundColor());
                }
                if (sAEditRequest.hasBackgroundImage()) {
                    this.backgroundImage_ = sAEditRequest.backgroundImage_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (sAEditRequest.hasBackgroundImageSize()) {
                    setBackgroundImageSize(sAEditRequest.getBackgroundImageSize());
                }
                if (!sAEditRequest.backgroundImageList_.isEmpty()) {
                    if (this.backgroundImageList_.isEmpty()) {
                        this.backgroundImageList_ = sAEditRequest.backgroundImageList_;
                        this.bitField0_ |= 64;
                    } else {
                        ensureBackgroundImageListIsMutable();
                        this.backgroundImageList_.addAll(sAEditRequest.backgroundImageList_);
                    }
                    onChanged();
                }
                if (!sAEditRequest.backgroundImageSizeList_.isEmpty()) {
                    if (this.backgroundImageSizeList_.isEmpty()) {
                        Internal.IntList intList = sAEditRequest.backgroundImageSizeList_;
                        this.backgroundImageSizeList_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 128;
                    } else {
                        ensureBackgroundImageSizeListIsMutable();
                        this.backgroundImageSizeList_.addAll(sAEditRequest.backgroundImageSizeList_);
                    }
                    onChanged();
                }
                if (!sAEditRequest.orderImageList_.isEmpty()) {
                    if (this.orderImageList_.isEmpty()) {
                        this.orderImageList_ = sAEditRequest.orderImageList_;
                        this.bitField0_ |= 256;
                    } else {
                        ensureOrderImageListIsMutable();
                        this.orderImageList_.addAll(sAEditRequest.orderImageList_);
                    }
                    onChanged();
                }
                if (sAEditRequest.hasDeleteAllImages()) {
                    setDeleteAllImages(sAEditRequest.getDeleteAllImages());
                }
                if (sAEditRequest.hasImageGroupList()) {
                    mergeImageGroupList(sAEditRequest.getImageGroupList());
                }
                if (!sAEditRequest.dataList_.isEmpty()) {
                    if (this.dataList_.isEmpty()) {
                        Internal.IntList intList2 = sAEditRequest.dataList_;
                        this.dataList_ = intList2;
                        intList2.makeImmutable();
                        this.bitField0_ |= 2048;
                    } else {
                        ensureDataListIsMutable();
                        this.dataList_.addAll(sAEditRequest.dataList_);
                    }
                    onChanged();
                }
                if (this.slotItemListBuilder_ == null) {
                    if (!sAEditRequest.slotItemList_.isEmpty()) {
                        if (this.slotItemList_.isEmpty()) {
                            this.slotItemList_ = sAEditRequest.slotItemList_;
                            this.bitField0_ &= -4097;
                        } else {
                            ensureSlotItemListIsMutable();
                            this.slotItemList_.addAll(sAEditRequest.slotItemList_);
                        }
                        onChanged();
                    }
                } else if (!sAEditRequest.slotItemList_.isEmpty()) {
                    if (this.slotItemListBuilder_.isEmpty()) {
                        this.slotItemListBuilder_.dispose();
                        this.slotItemListBuilder_ = null;
                        this.slotItemList_ = sAEditRequest.slotItemList_;
                        this.bitField0_ &= -4097;
                        this.slotItemListBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetSlotItemListFieldBuilder() : null;
                    } else {
                        this.slotItemListBuilder_.addAllMessages(sAEditRequest.slotItemList_);
                    }
                }
                if (sAEditRequest.hasStyle()) {
                    this.style_ = sAEditRequest.style_;
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                if (sAEditRequest.hasStyleColorIndex()) {
                    setStyleColorIndex(sAEditRequest.getStyleColorIndex());
                }
                if (sAEditRequest.hasImageSwitchStyle()) {
                    setImageSwitchStyle(sAEditRequest.getImageSwitchStyle());
                }
                mergeUnknownFields(sAEditRequest.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addSlotItemList(SAWatchFaceSlot.Item.Builder builder) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilder.addMessage(builder.build());
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.backgroundColor_ = "";
                this.foregroundColor_ = ByteString.EMPTY;
                this.backgroundImage_ = "";
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.backgroundImageSizeList_ = GeneratedMessage.emptyIntList();
                this.orderImageList_ = LazyStringArrayList.emptyList();
                this.dataList_ = GeneratedMessage.emptyIntList();
                this.slotItemList_ = Collections.EMPTY_LIST;
                this.style_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addSlotItemList(int i7, SAWatchFaceSlot.Item.Builder builder) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.add(i7, builder.build());
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
                            switch (tag) {
                                case 0:
                                    z6 = true;
                                    break;
                                case 10:
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    break;
                                case 16:
                                    this.setCurrent_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.backgroundColor_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    this.backgroundImage_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    break;
                                case 40:
                                    this.backgroundImageSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    break;
                                case 50:
                                    this.style_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 56:
                                    int i7 = codedInputStream.readEnum();
                                    if (SAWatchFaceSlot.Data.forNumber(i7) == null) {
                                        mergeUnknownVarintField(7, i7);
                                    } else {
                                        ensureDataListIsMutable();
                                        this.dataList_.addInt(i7);
                                    }
                                    break;
                                case 58:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureDataListIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i8 = codedInputStream.readEnum();
                                        if (SAWatchFaceSlot.Data.forNumber(i8) == null) {
                                            mergeUnknownVarintField(7, i8);
                                        } else {
                                            this.dataList_.addInt(i8);
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    break;
                                case 66:
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureBackgroundImageListIsMutable();
                                    this.backgroundImageList_.add(bytes);
                                    break;
                                case 72:
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureBackgroundImageSizeListIsMutable();
                                    this.backgroundImageSizeList_.addInt(uInt32);
                                    break;
                                case 74:
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureBackgroundImageSizeListIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.backgroundImageSizeList_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                    break;
                                case 82:
                                    ByteString bytes2 = codedInputStream.readBytes();
                                    ensureOrderImageListIsMutable();
                                    this.orderImageList_.add(bytes2);
                                    break;
                                case 88:
                                    this.deleteAllImages_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
                                    break;
                                case 98:
                                    SAWatchFaceSlot.Item item = (SAWatchFaceSlot.Item) codedInputStream.readMessage(SAWatchFaceSlot.Item.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureSlotItemListIsMutable();
                                        this.slotItemList_.add(item);
                                    } else {
                                        repeatedFieldBuilder.addMessage(item);
                                    }
                                    break;
                                case 106:
                                    this.foregroundColor_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                    break;
                                case 112:
                                    this.styleColorIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 122:
                                    codedInputStream.readMessage(internalGetImageGroupListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    break;
                                case 128:
                                    this.imageSwitchStyle_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32768;
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAEditRequest");
            dataList_converter_ = new Internal.IntListAdapter.IntConverter<SAWatchFaceSlot.Data>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequest.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.IntListAdapter.IntConverter
                public SAWatchFaceSlot.Data convert(int i7) {
                    SAWatchFaceSlot.Data dataForNumber = SAWatchFaceSlot.Data.forNumber(i7);
                    return dataForNumber == null ? SAWatchFaceSlot.Data.EMPTY : dataForNumber;
                }
            };
            DEFAULT_INSTANCE = new SAEditRequest();
            PARSER = new AbstractParser<SAEditRequest>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequest.2
                @Override // com.google.protobuf.Parser
                public SAEditRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAEditRequest.newBuilder();
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

        public static SAEditRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAEditRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAEditRequest parseDelimitedFrom(InputStream inputStream) {
            return (SAEditRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAEditRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAEditRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAEditRequest)) {
                return super.equals(obj);
            }
            SAEditRequest sAEditRequest = (SAEditRequest) obj;
            if (hasId() != sAEditRequest.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAEditRequest.getId())) || hasSetCurrent() != sAEditRequest.hasSetCurrent()) {
                return false;
            }
            if ((hasSetCurrent() && getSetCurrent() != sAEditRequest.getSetCurrent()) || hasBackgroundColor() != sAEditRequest.hasBackgroundColor()) {
                return false;
            }
            if ((hasBackgroundColor() && !getBackgroundColor().equals(sAEditRequest.getBackgroundColor())) || hasForegroundColor() != sAEditRequest.hasForegroundColor()) {
                return false;
            }
            if ((hasForegroundColor() && !getForegroundColor().equals(sAEditRequest.getForegroundColor())) || hasBackgroundImage() != sAEditRequest.hasBackgroundImage()) {
                return false;
            }
            if ((hasBackgroundImage() && !getBackgroundImage().equals(sAEditRequest.getBackgroundImage())) || hasBackgroundImageSize() != sAEditRequest.hasBackgroundImageSize()) {
                return false;
            }
            if ((hasBackgroundImageSize() && getBackgroundImageSize() != sAEditRequest.getBackgroundImageSize()) || !getBackgroundImageListList().equals(sAEditRequest.getBackgroundImageListList()) || !getBackgroundImageSizeListList().equals(sAEditRequest.getBackgroundImageSizeListList()) || !getOrderImageListList().equals(sAEditRequest.getOrderImageListList()) || hasDeleteAllImages() != sAEditRequest.hasDeleteAllImages()) {
                return false;
            }
            if ((hasDeleteAllImages() && getDeleteAllImages() != sAEditRequest.getDeleteAllImages()) || hasImageGroupList() != sAEditRequest.hasImageGroupList()) {
                return false;
            }
            if ((hasImageGroupList() && !getImageGroupList().equals(sAEditRequest.getImageGroupList())) || !this.dataList_.equals(sAEditRequest.dataList_) || !getSlotItemListList().equals(sAEditRequest.getSlotItemListList()) || hasStyle() != sAEditRequest.hasStyle()) {
                return false;
            }
            if ((hasStyle() && !getStyle().equals(sAEditRequest.getStyle())) || hasStyleColorIndex() != sAEditRequest.hasStyleColorIndex()) {
                return false;
            }
            if ((!hasStyleColorIndex() || getStyleColorIndex() == sAEditRequest.getStyleColorIndex()) && hasImageSwitchStyle() == sAEditRequest.hasImageSwitchStyle()) {
                return (!hasImageSwitchStyle() || getImageSwitchStyle() == sAEditRequest.getImageSwitchStyle()) && getUnknownFields().equals(sAEditRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ByteString getBackgroundColorBytes() {
            Object obj = this.backgroundColor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundColor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ByteString getBackgroundImageBytes() {
            Object obj = this.backgroundImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundImage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public String getBackgroundImageList(int i7) {
            return this.backgroundImageList_.get(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ByteString getBackgroundImageListBytes(int i7) {
            return this.backgroundImageList_.getByteString(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getBackgroundImageListCount() {
            return this.backgroundImageList_.size();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getBackgroundImageSize() {
            return this.backgroundImageSize_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getBackgroundImageSizeList(int i7) {
            return this.backgroundImageSizeList_.getInt(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getBackgroundImageSizeListCount() {
            return this.backgroundImageSizeList_.size();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public List<Integer> getBackgroundImageSizeListList() {
            return this.backgroundImageSizeList_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public SAWatchFaceSlot.Data getDataList(int i7) {
            return dataList_converter_.convert(this.dataList_.getInt(i7));
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getDataListCount() {
            return this.dataList_.size();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public List<SAWatchFaceSlot.Data> getDataListList() {
            return new Internal.IntListAdapter(this.dataList_, dataList_converter_);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean getDeleteAllImages() {
            return this.deleteAllImages_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAEditRequest_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ByteString getForegroundColor() {
            return this.foregroundColor_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public SAWatchFaceImage.GroupList getImageGroupList() {
            SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
            return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public SAWatchFaceImage.GroupListOrBuilder getImageGroupListOrBuilder() {
            SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
            return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getImageSwitchStyle() {
            return this.imageSwitchStyle_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public String getOrderImageList(int i7) {
            return this.orderImageList_.get(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ByteString getOrderImageListBytes(int i7) {
            return this.orderImageList_.getByteString(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getOrderImageListCount() {
            return this.orderImageList_.size();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAEditRequest> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeBoolSize(2, this.setCurrent_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.backgroundColor_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.backgroundImage_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.backgroundImageSize_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(6, this.style_);
            }
            int iComputeEnumSizeNoTag = 0;
            for (int i8 = 0; i8 < this.dataList_.size(); i8++) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.dataList_.getInt(i8));
            }
            int size = iComputeStringSize + iComputeEnumSizeNoTag + this.dataList_.size();
            int iComputeStringSizeNoTag = 0;
            for (int i9 = 0; i9 < this.backgroundImageList_.size(); i9++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.backgroundImageList_.getRaw(i9));
            }
            int size2 = size + iComputeStringSizeNoTag + getBackgroundImageListList().size();
            int iComputeUInt32SizeNoTag = 0;
            for (int i10 = 0; i10 < this.backgroundImageSizeList_.size(); i10++) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(this.backgroundImageSizeList_.getInt(i10));
            }
            int size3 = size2 + iComputeUInt32SizeNoTag + getBackgroundImageSizeListList().size();
            int iComputeStringSizeNoTag2 = 0;
            for (int i11 = 0; i11 < this.orderImageList_.size(); i11++) {
                iComputeStringSizeNoTag2 += GeneratedMessage.computeStringSizeNoTag(this.orderImageList_.getRaw(i11));
            }
            int size4 = size3 + iComputeStringSizeNoTag2 + getOrderImageListList().size();
            if ((this.bitField0_ & 64) != 0) {
                size4 += CodedOutputStream.computeBoolSize(11, this.deleteAllImages_);
            }
            int size5 = this.slotItemList_.size();
            for (int i12 = 0; i12 < size5; i12++) {
                size4 += CodedOutputStream.computeMessageSizeNoTag(this.slotItemList_.get(i12));
            }
            int iComputeUInt32Size = size4 + size5;
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(13, this.foregroundColor_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(14, this.styleColorIndex_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(15, getImageGroupList());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(16, this.imageSwitchStyle_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean getSetCurrent() {
            return this.setCurrent_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public SAWatchFaceSlot.Item getSlotItemList(int i7) {
            return this.slotItemList_.get(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getSlotItemListCount() {
            return this.slotItemList_.size();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public List<SAWatchFaceSlot.Item> getSlotItemListList() {
            return this.slotItemList_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public SAWatchFaceSlot.ItemOrBuilder getSlotItemListOrBuilder(int i7) {
            return this.slotItemList_.get(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public List<? extends SAWatchFaceSlot.ItemOrBuilder> getSlotItemListOrBuilderList() {
            return this.slotItemList_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public int getStyleColorIndex() {
            return this.styleColorIndex_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasBackgroundColor() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasBackgroundImage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasBackgroundImageSize() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasDeleteAllImages() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasForegroundColor() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasImageGroupList() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasImageSwitchStyle() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasSetCurrent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasStyle() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public boolean hasStyleColorIndex() {
            return (this.bitField0_ & 512) != 0;
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
            if (hasForegroundColor()) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + getForegroundColor().hashCode();
            }
            if (hasBackgroundImage()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getBackgroundImage().hashCode();
            }
            if (hasBackgroundImageSize()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getBackgroundImageSize();
            }
            if (getBackgroundImageListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getBackgroundImageListList().hashCode();
            }
            if (getBackgroundImageSizeListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getBackgroundImageSizeListList().hashCode();
            }
            if (getOrderImageListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getOrderImageListList().hashCode();
            }
            if (hasDeleteAllImages()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + Internal.hashBoolean(getDeleteAllImages());
            }
            if (hasImageGroupList()) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + getImageGroupList().hashCode();
            }
            if (getDataListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + this.dataList_.hashCode();
            }
            if (getSlotItemListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getSlotItemListList().hashCode();
            }
            if (hasStyle()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getStyle().hashCode();
            }
            if (hasStyleColorIndex()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + getStyleColorIndex();
            }
            if (hasImageSwitchStyle()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + getImageSwitchStyle();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAEditRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SAEditRequest.class, Builder.class);
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
            if (!hasSetCurrent()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasImageGroupList() && !getImageGroupList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i7 = 0; i7 < getSlotItemListCount(); i7++) {
                if (!getSlotItemList(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.setCurrent_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.backgroundColor_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.backgroundImage_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(5, this.backgroundImageSize_);
            }
            if ((this.bitField0_ & 256) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.style_);
            }
            for (int i7 = 0; i7 < this.dataList_.size(); i7++) {
                codedOutputStream.writeEnum(7, this.dataList_.getInt(i7));
            }
            for (int i8 = 0; i8 < this.backgroundImageList_.size(); i8++) {
                GeneratedMessage.writeString(codedOutputStream, 8, this.backgroundImageList_.getRaw(i8));
            }
            for (int i9 = 0; i9 < this.backgroundImageSizeList_.size(); i9++) {
                codedOutputStream.writeUInt32(9, this.backgroundImageSizeList_.getInt(i9));
            }
            for (int i10 = 0; i10 < this.orderImageList_.size(); i10++) {
                GeneratedMessage.writeString(codedOutputStream, 10, this.orderImageList_.getRaw(i10));
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(11, this.deleteAllImages_);
            }
            for (int i11 = 0; i11 < this.slotItemList_.size(); i11++) {
                codedOutputStream.writeMessage(12, this.slotItemList_.get(i11));
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBytes(13, this.foregroundColor_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(14, this.styleColorIndex_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(15, getImageGroupList());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(16, this.imageSwitchStyle_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SAEditRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.setCurrent_ = false;
            this.backgroundColor_ = "";
            this.foregroundColor_ = ByteString.EMPTY;
            this.backgroundImage_ = "";
            this.backgroundImageSize_ = 0;
            this.backgroundImageList_ = LazyStringArrayList.emptyList();
            this.backgroundImageSizeList_ = GeneratedMessage.emptyIntList();
            this.orderImageList_ = LazyStringArrayList.emptyList();
            this.deleteAllImages_ = false;
            this.dataList_ = GeneratedMessage.emptyIntList();
            this.style_ = "";
            this.styleColorIndex_ = 0;
            this.imageSwitchStyle_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAEditRequest sAEditRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAEditRequest);
        }

        public static SAEditRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ProtocolStringList getBackgroundImageListList() {
            return this.backgroundImageList_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditRequestOrBuilder
        public ProtocolStringList getOrderImageListList() {
            return this.orderImageList_;
        }

        public static SAEditRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAEditRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAEditRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAEditRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAEditRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAEditRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAEditRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAEditRequest parseFrom(InputStream inputStream) {
            return (SAEditRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAEditRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAEditRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAEditRequest parseFrom(CodedInputStream codedInputStream) {
            return (SAEditRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAEditRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAEditRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SAEditRequest() {
            this.id_ = "";
            this.setCurrent_ = false;
            this.backgroundColor_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.foregroundColor_ = byteString;
            this.backgroundImage_ = "";
            this.backgroundImageSize_ = 0;
            this.backgroundImageList_ = LazyStringArrayList.emptyList();
            this.backgroundImageSizeList_ = GeneratedMessage.emptyIntList();
            this.orderImageList_ = LazyStringArrayList.emptyList();
            this.deleteAllImages_ = false;
            this.dataList_ = GeneratedMessage.emptyIntList();
            this.style_ = "";
            this.styleColorIndex_ = 0;
            this.imageSwitchStyle_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.backgroundColor_ = "";
            this.foregroundColor_ = byteString;
            this.backgroundImage_ = "";
            this.backgroundImageList_ = LazyStringArrayList.emptyList();
            this.backgroundImageSizeList_ = GeneratedMessage.emptyIntList();
            this.orderImageList_ = LazyStringArrayList.emptyList();
            this.dataList_ = GeneratedMessage.emptyIntList();
            this.slotItemList_ = Collections.EMPTY_LIST;
            this.style_ = "";
        }
    }

    public interface SAEditRequestOrBuilder extends MessageOrBuilder {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        String getBackgroundImage();

        ByteString getBackgroundImageBytes();

        String getBackgroundImageList(int i7);

        ByteString getBackgroundImageListBytes(int i7);

        int getBackgroundImageListCount();

        List<String> getBackgroundImageListList();

        int getBackgroundImageSize();

        int getBackgroundImageSizeList(int i7);

        int getBackgroundImageSizeListCount();

        List<Integer> getBackgroundImageSizeListList();

        SAWatchFaceSlot.Data getDataList(int i7);

        int getDataListCount();

        List<SAWatchFaceSlot.Data> getDataListList();

        boolean getDeleteAllImages();

        ByteString getForegroundColor();

        String getId();

        ByteString getIdBytes();

        SAWatchFaceImage.GroupList getImageGroupList();

        SAWatchFaceImage.GroupListOrBuilder getImageGroupListOrBuilder();

        int getImageSwitchStyle();

        String getOrderImageList(int i7);

        ByteString getOrderImageListBytes(int i7);

        int getOrderImageListCount();

        List<String> getOrderImageListList();

        boolean getSetCurrent();

        SAWatchFaceSlot.Item getSlotItemList(int i7);

        int getSlotItemListCount();

        List<SAWatchFaceSlot.Item> getSlotItemListList();

        SAWatchFaceSlot.ItemOrBuilder getSlotItemListOrBuilder(int i7);

        List<? extends SAWatchFaceSlot.ItemOrBuilder> getSlotItemListOrBuilderList();

        String getStyle();

        ByteString getStyleBytes();

        int getStyleColorIndex();

        boolean hasBackgroundColor();

        boolean hasBackgroundImage();

        boolean hasBackgroundImageSize();

        boolean hasDeleteAllImages();

        boolean hasForegroundColor();

        boolean hasId();

        boolean hasImageGroupList();

        boolean hasImageSwitchStyle();

        boolean hasSetCurrent();

        boolean hasStyle();

        boolean hasStyleColorIndex();
    }

    public static final class SAEditResponse extends GeneratedMessage implements SAEditResponseOrBuilder {
        public static final int CAN_ACCEPT_IMAGE_COUNT_FIELD_NUMBER = 3;
        public static final int CODE_FIELD_NUMBER = 2;
        private static final SAEditResponse DEFAULT_INSTANCE;
        public static final int EXPECTED_SLICE_LENGTH_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAEditResponse> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int canAcceptImageCount_;
        private int code_;
        private int expectedSliceLength_;
        private volatile Object id_;
        private byte memoizedIsInitialized;

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
            private static final Code[] VALUES;
            private static final Internal.EnumLiteMap<Code> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Code");
                internalValueMap = new Internal.EnumLiteMap<Code>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponse.Code.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Code findValueByNumber(int i7) {
                        return Code.forNumber(i7);
                    }
                };
                VALUES = values();
            }

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

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SAEditResponse.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<Code> internalGetValueMap() {
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
            public static Code valueOf(int i7) {
                return forNumber(i7);
            }

            public static Code valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAEditResponse");
            DEFAULT_INSTANCE = new SAEditResponse();
            PARSER = new AbstractParser<SAEditResponse>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponse.1
                @Override // com.google.protobuf.Parser
                public SAEditResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAEditResponse.newBuilder();
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

        public static SAEditResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAEditResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAEditResponse parseDelimitedFrom(InputStream inputStream) {
            return (SAEditResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAEditResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAEditResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAEditResponse)) {
                return super.equals(obj);
            }
            SAEditResponse sAEditResponse = (SAEditResponse) obj;
            if (hasId() != sAEditResponse.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAEditResponse.getId())) || hasCode() != sAEditResponse.hasCode()) {
                return false;
            }
            if ((hasCode() && this.code_ != sAEditResponse.code_) || hasCanAcceptImageCount() != sAEditResponse.hasCanAcceptImageCount()) {
                return false;
            }
            if ((!hasCanAcceptImageCount() || getCanAcceptImageCount() == sAEditResponse.getCanAcceptImageCount()) && hasExpectedSliceLength() == sAEditResponse.hasExpectedSliceLength()) {
                return (!hasExpectedSliceLength() || getExpectedSliceLength() == sAEditResponse.getExpectedSliceLength()) && getUnknownFields().equals(sAEditResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
        public int getCanAcceptImageCount() {
            return this.canAcceptImageCount_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
        public Code getCode() {
            Code codeForNumber = Code.forNumber(this.code_);
            return codeForNumber == null ? Code.SUCCESS : codeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAEditResponse_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
        public int getExpectedSliceLength() {
            return this.expectedSliceLength_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
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
        public Parser<SAEditResponse> getParserForType() {
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
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.canAcceptImageCount_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.expectedSliceLength_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
        public boolean hasCanAcceptImageCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
        public boolean hasExpectedSliceLength() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
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
            if (hasCanAcceptImageCount()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getCanAcceptImageCount();
            }
            if (hasExpectedSliceLength()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getExpectedSliceLength();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAEditResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SAEditResponse.class, Builder.class);
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
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.canAcceptImageCount_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.expectedSliceLength_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAEditResponseOrBuilder {
            private int bitField0_;
            private int canAcceptImageCount_;
            private int code_;
            private int expectedSliceLength_;
            private Object id_;

            private void buildPartial0(SAEditResponse sAEditResponse) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAEditResponse.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAEditResponse.code_ = this.code_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAEditResponse.canAcceptImageCount_ = this.canAcceptImageCount_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAEditResponse.expectedSliceLength_ = this.expectedSliceLength_;
                    i7 |= 8;
                }
                sAEditResponse.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAEditResponse_descriptor;
            }

            public Builder clearCanAcceptImageCount() {
                this.bitField0_ &= -5;
                this.canAcceptImageCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -3;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExpectedSliceLength() {
                this.bitField0_ &= -9;
                this.expectedSliceLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SAEditResponse.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public int getCanAcceptImageCount() {
                return this.canAcceptImageCount_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public Code getCode() {
                Code codeForNumber = Code.forNumber(this.code_);
                return codeForNumber == null ? Code.SUCCESS : codeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAEditResponse_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public int getExpectedSliceLength() {
                return this.expectedSliceLength_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public boolean hasCanAcceptImageCount() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public boolean hasExpectedSliceLength() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAEditResponseOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAEditResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SAEditResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasCode();
            }

            public Builder setCanAcceptImageCount(int i7) {
                this.canAcceptImageCount_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCode(Code code) {
                code.getClass();
                this.bitField0_ |= 2;
                this.code_ = code.getNumber();
                onChanged();
                return this;
            }

            public Builder setExpectedSliceLength(int i7) {
                this.expectedSliceLength_ = i7;
                this.bitField0_ |= 8;
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
            public SAEditResponse build() {
                SAEditResponse sAEditResponseBuildPartial = buildPartial();
                if (sAEditResponseBuildPartial.isInitialized()) {
                    return sAEditResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAEditResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAEditResponse buildPartial() {
                SAEditResponse sAEditResponse = new SAEditResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAEditResponse);
                }
                onBuilt();
                return sAEditResponse;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAEditResponse getDefaultInstanceForType() {
                return SAEditResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.code_ = 0;
                this.canAcceptImageCount_ = 0;
                this.expectedSliceLength_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.code_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAEditResponse) {
                    return mergeFrom((SAEditResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAEditResponse sAEditResponse) {
                if (sAEditResponse == SAEditResponse.getDefaultInstance()) {
                    return this;
                }
                if (sAEditResponse.hasId()) {
                    this.id_ = sAEditResponse.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAEditResponse.hasCode()) {
                    setCode(sAEditResponse.getCode());
                }
                if (sAEditResponse.hasCanAcceptImageCount()) {
                    setCanAcceptImageCount(sAEditResponse.getCanAcceptImageCount());
                }
                if (sAEditResponse.hasExpectedSliceLength()) {
                    setExpectedSliceLength(sAEditResponse.getExpectedSliceLength());
                }
                mergeUnknownFields(sAEditResponse.getUnknownFields());
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
                                    int i7 = codedInputStream.readEnum();
                                    if (Code.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.code_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.canAcceptImageCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.expectedSliceLength_ = codedInputStream.readUInt32();
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

        private SAEditResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.code_ = 0;
            this.canAcceptImageCount_ = 0;
            this.expectedSliceLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAEditResponse sAEditResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAEditResponse);
        }

        public static SAEditResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAEditResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAEditResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAEditResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAEditResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAEditResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAEditResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAEditResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAEditResponse parseFrom(InputStream inputStream) {
            return (SAEditResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SAEditResponse() {
            this.id_ = "";
            this.code_ = 0;
            this.canAcceptImageCount_ = 0;
            this.expectedSliceLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.code_ = 0;
        }

        public static SAEditResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAEditResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAEditResponse parseFrom(CodedInputStream codedInputStream) {
            return (SAEditResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAEditResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAEditResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAEditResponseOrBuilder extends MessageOrBuilder {
        int getCanAcceptImageCount();

        SAEditResponse.Code getCode();

        int getExpectedSliceLength();

        String getId();

        ByteString getIdBytes();

        boolean hasCanAcceptImageCount();

        boolean hasCode();

        boolean hasExpectedSliceLength();

        boolean hasId();
    }

    public static final class SAInstallResult extends GeneratedMessage implements SAInstallResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final SAInstallResult DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAInstallResult> PARSER;
        public static final int SUPPORT_EDIT_FIELD_NUMBER = 3;
        public static final int SUPPORT_IMAGE_FORMAT_FIELD_NUMBER = 4;
        public static final int SUPPORT_IMAGE_GROUP_FIELD_NUMBER = 6;
        public static final int SUPPORT_MAX_IMAGE_COUNT_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private boolean supportEdit_;
        private int supportImageFormat_;
        private boolean supportImageGroup_;
        private int supportMaxImageCount_;

        public enum Code implements ProtocolMessageEnum {
            VERIFY_FAILED(0),
            INSTALL_FAILED(1),
            INSTALL_SUCCESS(2),
            INSTALL_USED(3);

            public static final int INSTALL_FAILED_VALUE = 1;
            public static final int INSTALL_SUCCESS_VALUE = 2;
            public static final int INSTALL_USED_VALUE = 3;
            private static final Code[] VALUES;
            public static final int VERIFY_FAILED_VALUE = 0;
            private static final Internal.EnumLiteMap<Code> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Code");
                internalValueMap = new Internal.EnumLiteMap<Code>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResult.Code.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Code findValueByNumber(int i7) {
                        return Code.forNumber(i7);
                    }
                };
                VALUES = values();
            }

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

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SAInstallResult.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<Code> internalGetValueMap() {
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
            public static Code valueOf(int i7) {
                return forNumber(i7);
            }

            public static Code valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAInstallResult");
            DEFAULT_INSTANCE = new SAInstallResult();
            PARSER = new AbstractParser<SAInstallResult>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResult.1
                @Override // com.google.protobuf.Parser
                public SAInstallResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAInstallResult.newBuilder();
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

        public static SAInstallResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAInstallResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAInstallResult parseDelimitedFrom(InputStream inputStream) {
            return (SAInstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAInstallResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAInstallResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAInstallResult)) {
                return super.equals(obj);
            }
            SAInstallResult sAInstallResult = (SAInstallResult) obj;
            if (hasId() != sAInstallResult.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAInstallResult.getId())) || hasCode() != sAInstallResult.hasCode()) {
                return false;
            }
            if ((hasCode() && this.code_ != sAInstallResult.code_) || hasSupportEdit() != sAInstallResult.hasSupportEdit()) {
                return false;
            }
            if ((hasSupportEdit() && getSupportEdit() != sAInstallResult.getSupportEdit()) || hasSupportImageFormat() != sAInstallResult.hasSupportImageFormat()) {
                return false;
            }
            if ((hasSupportImageFormat() && this.supportImageFormat_ != sAInstallResult.supportImageFormat_) || hasSupportMaxImageCount() != sAInstallResult.hasSupportMaxImageCount()) {
                return false;
            }
            if ((!hasSupportMaxImageCount() || getSupportMaxImageCount() == sAInstallResult.getSupportMaxImageCount()) && hasSupportImageGroup() == sAInstallResult.hasSupportImageGroup()) {
                return (!hasSupportImageGroup() || getSupportImageGroup() == sAInstallResult.getSupportImageGroup()) && getUnknownFields().equals(sAInstallResult.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public Code getCode() {
            Code codeForNumber = Code.forNumber(this.code_);
            return codeForNumber == null ? Code.VERIFY_FAILED : codeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAInstallResult_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
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
        public Parser<SAInstallResult> getParserForType() {
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
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.supportEdit_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(4, this.supportImageFormat_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.supportMaxImageCount_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(6, this.supportImageGroup_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean getSupportEdit() {
            return this.supportEdit_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public CommonProtos.ImageFormat getSupportImageFormat() {
            CommonProtos.ImageFormat imageFormatForNumber = CommonProtos.ImageFormat.forNumber(this.supportImageFormat_);
            return imageFormatForNumber == null ? CommonProtos.ImageFormat.RGB_565 : imageFormatForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean getSupportImageGroup() {
            return this.supportImageGroup_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public int getSupportMaxImageCount() {
            return this.supportMaxImageCount_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean hasSupportEdit() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean hasSupportImageFormat() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean hasSupportImageGroup() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
        public boolean hasSupportMaxImageCount() {
            return (this.bitField0_ & 16) != 0;
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
            if (hasSupportImageFormat()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.supportImageFormat_;
            }
            if (hasSupportMaxImageCount()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSupportMaxImageCount();
            }
            if (hasSupportImageGroup()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + Internal.hashBoolean(getSupportImageGroup());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAInstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SAInstallResult.class, Builder.class);
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
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.supportEdit_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.supportImageFormat_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.supportMaxImageCount_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.supportImageGroup_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAInstallResultOrBuilder {
            private int bitField0_;
            private int code_;
            private Object id_;
            private boolean supportEdit_;
            private int supportImageFormat_;
            private boolean supportImageGroup_;
            private int supportMaxImageCount_;

            private void buildPartial0(SAInstallResult sAInstallResult) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAInstallResult.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAInstallResult.code_ = this.code_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAInstallResult.supportEdit_ = this.supportEdit_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAInstallResult.supportImageFormat_ = this.supportImageFormat_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sAInstallResult.supportMaxImageCount_ = this.supportMaxImageCount_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sAInstallResult.supportImageGroup_ = this.supportImageGroup_;
                    i7 |= 32;
                }
                sAInstallResult.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAInstallResult_descriptor;
            }

            public Builder clearCode() {
                this.bitField0_ &= -3;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SAInstallResult.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSupportEdit() {
                this.bitField0_ &= -5;
                this.supportEdit_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportImageFormat() {
                this.bitField0_ &= -9;
                this.supportImageFormat_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSupportImageGroup() {
                this.bitField0_ &= -33;
                this.supportImageGroup_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportMaxImageCount() {
                this.bitField0_ &= -17;
                this.supportMaxImageCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public Code getCode() {
                Code codeForNumber = Code.forNumber(this.code_);
                return codeForNumber == null ? Code.VERIFY_FAILED : codeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAInstallResult_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean getSupportEdit() {
                return this.supportEdit_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public CommonProtos.ImageFormat getSupportImageFormat() {
                CommonProtos.ImageFormat imageFormatForNumber = CommonProtos.ImageFormat.forNumber(this.supportImageFormat_);
                return imageFormatForNumber == null ? CommonProtos.ImageFormat.RGB_565 : imageFormatForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean getSupportImageGroup() {
                return this.supportImageGroup_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public int getSupportMaxImageCount() {
                return this.supportMaxImageCount_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean hasSupportEdit() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean hasSupportImageFormat() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean hasSupportImageGroup() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAInstallResultOrBuilder
            public boolean hasSupportMaxImageCount() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAInstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SAInstallResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
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

            public Builder setSupportEdit(boolean z6) {
                this.supportEdit_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSupportImageFormat(CommonProtos.ImageFormat imageFormat) {
                imageFormat.getClass();
                this.bitField0_ |= 8;
                this.supportImageFormat_ = imageFormat.getNumber();
                onChanged();
                return this;
            }

            public Builder setSupportImageGroup(boolean z6) {
                this.supportImageGroup_ = z6;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSupportMaxImageCount(int i7) {
                this.supportMaxImageCount_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.code_ = 0;
                this.supportImageFormat_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAInstallResult build() {
                SAInstallResult sAInstallResultBuildPartial = buildPartial();
                if (sAInstallResultBuildPartial.isInitialized()) {
                    return sAInstallResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAInstallResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAInstallResult buildPartial() {
                SAInstallResult sAInstallResult = new SAInstallResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAInstallResult);
                }
                onBuilt();
                return sAInstallResult;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAInstallResult getDefaultInstanceForType() {
                return SAInstallResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.code_ = 0;
                this.supportEdit_ = false;
                this.supportImageFormat_ = 0;
                this.supportMaxImageCount_ = 0;
                this.supportImageGroup_ = false;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.code_ = 0;
                this.supportImageFormat_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAInstallResult) {
                    return mergeFrom((SAInstallResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAInstallResult sAInstallResult) {
                if (sAInstallResult == SAInstallResult.getDefaultInstance()) {
                    return this;
                }
                if (sAInstallResult.hasId()) {
                    this.id_ = sAInstallResult.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAInstallResult.hasCode()) {
                    setCode(sAInstallResult.getCode());
                }
                if (sAInstallResult.hasSupportEdit()) {
                    setSupportEdit(sAInstallResult.getSupportEdit());
                }
                if (sAInstallResult.hasSupportImageFormat()) {
                    setSupportImageFormat(sAInstallResult.getSupportImageFormat());
                }
                if (sAInstallResult.hasSupportMaxImageCount()) {
                    setSupportMaxImageCount(sAInstallResult.getSupportMaxImageCount());
                }
                if (sAInstallResult.hasSupportImageGroup()) {
                    setSupportImageGroup(sAInstallResult.getSupportImageGroup());
                }
                mergeUnknownFields(sAInstallResult.getUnknownFields());
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
                                    int i7 = codedInputStream.readEnum();
                                    if (Code.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.code_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.supportEdit_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i8 = codedInputStream.readEnum();
                                    if (CommonProtos.ImageFormat.forNumber(i8) == null) {
                                        mergeUnknownVarintField(4, i8);
                                    } else {
                                        this.supportImageFormat_ = i8;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 40) {
                                    this.supportMaxImageCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.supportImageGroup_ = codedInputStream.readBool();
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

        private SAInstallResult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.code_ = 0;
            this.supportEdit_ = false;
            this.supportImageFormat_ = 0;
            this.supportMaxImageCount_ = 0;
            this.supportImageGroup_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAInstallResult sAInstallResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAInstallResult);
        }

        public static SAInstallResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAInstallResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAInstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAInstallResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAInstallResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAInstallResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAInstallResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAInstallResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAInstallResult parseFrom(InputStream inputStream) {
            return (SAInstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAInstallResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAInstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SAInstallResult() {
            this.id_ = "";
            this.code_ = 0;
            this.supportEdit_ = false;
            this.supportImageFormat_ = 0;
            this.supportMaxImageCount_ = 0;
            this.supportImageGroup_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.code_ = 0;
            this.supportImageFormat_ = 0;
        }

        public static SAInstallResult parseFrom(CodedInputStream codedInputStream) {
            return (SAInstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAInstallResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAInstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAInstallResultOrBuilder extends MessageOrBuilder {
        SAInstallResult.Code getCode();

        String getId();

        ByteString getIdBytes();

        boolean getSupportEdit();

        CommonProtos.ImageFormat getSupportImageFormat();

        boolean getSupportImageGroup();

        int getSupportMaxImageCount();

        boolean hasCode();

        boolean hasId();

        boolean hasSupportEdit();

        boolean hasSupportImageFormat();

        boolean hasSupportImageGroup();

        boolean hasSupportMaxImageCount();
    }

    public static final class SAPrepareInfo extends GeneratedMessage implements SAPrepareInfoOrBuilder {
        private static final SAPrepareInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAPrepareInfo> PARSER;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int STYLE_FIELD_NUMBER = 7;
        public static final int SUPPORT_COMPRESS_MODE_FIELD_NUMBER = 5;
        public static final int VERIFICATION_FIELD_NUMBER = 6;
        public static final int VERSION_CODE_FIELD_NUMBER = 4;
        public static final int WATCH_BG_SIZE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int size_;
        private volatile Object style_;
        private int supportCompressMode_;
        private Verification verification_;
        private long versionCode_;
        private int watchBgSize_;

        public static final class Verification extends GeneratedMessage implements VerificationOrBuilder {
            private static final Verification DEFAULT_INSTANCE;
            public static final int INFO_FIELD_NUMBER = 1;
            private static final Parser<Verification> PARSER;
            public static final int SIGN_FIELD_NUMBER = 2;
            public static final int TRIAL_DURATION_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object info_;
            private byte memoizedIsInitialized;
            private volatile Object sign_;
            private int trialDuration_;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Verification");
                DEFAULT_INSTANCE = new Verification();
                PARSER = new AbstractParser<Verification>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.Verification.1
                    @Override // com.google.protobuf.Parser
                    public Verification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = Verification.newBuilder();
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

            public static Verification getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_Verification_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Verification parseDelimitedFrom(InputStream inputStream) {
                return (Verification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Verification parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<Verification> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Verification)) {
                    return super.equals(obj);
                }
                Verification verification = (Verification) obj;
                if (hasInfo() != verification.hasInfo()) {
                    return false;
                }
                if ((hasInfo() && !getInfo().equals(verification.getInfo())) || hasSign() != verification.hasSign()) {
                    return false;
                }
                if ((!hasSign() || getSign().equals(verification.getSign())) && hasTrialDuration() == verification.hasTrialDuration()) {
                    return (!hasTrialDuration() || getTrialDuration() == verification.getTrialDuration()) && getUnknownFields().equals(verification.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_Verification_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public String getInfo() {
                Object obj = this.info_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.info_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public ByteString getInfoBytes() {
                Object obj = this.info_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.info_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Verification> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.info_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessage.computeStringSize(2, this.sign_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.trialDuration_);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public String getSign() {
                Object obj = this.sign_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sign_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public ByteString getSignBytes() {
                Object obj = this.sign_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sign_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public int getTrialDuration() {
                return this.trialDuration_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public boolean hasInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public boolean hasSign() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
            public boolean hasTrialDuration() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasInfo()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getInfo().hashCode();
                }
                if (hasSign()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSign().hashCode();
                }
                if (hasTrialDuration()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getTrialDuration();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_Verification_fieldAccessorTable.ensureFieldAccessorsInitialized(Verification.class, Builder.class);
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
                if (!hasInfo()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasSign()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 1, this.info_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 2, this.sign_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeUInt32(3, this.trialDuration_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements VerificationOrBuilder {
                private int bitField0_;
                private Object info_;
                private Object sign_;
                private int trialDuration_;

                private void buildPartial0(Verification verification) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        verification.info_ = this.info_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        verification.sign_ = this.sign_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        verification.trialDuration_ = this.trialDuration_;
                        i7 |= 4;
                    }
                    verification.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_Verification_descriptor;
                }

                public Builder clearInfo() {
                    this.info_ = Verification.getDefaultInstance().getInfo();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSign() {
                    this.sign_ = Verification.getDefaultInstance().getSign();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearTrialDuration() {
                    this.bitField0_ &= -5;
                    this.trialDuration_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_Verification_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public String getInfo() {
                    Object obj = this.info_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.info_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public ByteString getInfoBytes() {
                    Object obj = this.info_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.info_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public String getSign() {
                    Object obj = this.sign_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.sign_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public ByteString getSignBytes() {
                    Object obj = this.sign_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.sign_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public int getTrialDuration() {
                    return this.trialDuration_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public boolean hasInfo() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public boolean hasSign() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.VerificationOrBuilder
                public boolean hasTrialDuration() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_Verification_fieldAccessorTable.ensureFieldAccessorsInitialized(Verification.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasInfo() && hasSign();
                }

                public Builder setInfo(String str) {
                    str.getClass();
                    this.info_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setInfoBytes(ByteString byteString) {
                    byteString.getClass();
                    this.info_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setSign(String str) {
                    str.getClass();
                    this.sign_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setSignBytes(ByteString byteString) {
                    byteString.getClass();
                    this.sign_ = byteString;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setTrialDuration(int i7) {
                    this.trialDuration_ = i7;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.info_ = "";
                    this.sign_ = "";
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Verification build() {
                    Verification verificationBuildPartial = buildPartial();
                    if (verificationBuildPartial.isInitialized()) {
                        return verificationBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) verificationBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Verification buildPartial() {
                    Verification verification = new Verification(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(verification);
                    }
                    onBuilt();
                    return verification;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Verification getDefaultInstanceForType() {
                    return Verification.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.info_ = "";
                    this.sign_ = "";
                    this.trialDuration_ = 0;
                    return this;
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.info_ = "";
                    this.sign_ = "";
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Verification) {
                        return mergeFrom((Verification) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Verification verification) {
                    if (verification == Verification.getDefaultInstance()) {
                        return this;
                    }
                    if (verification.hasInfo()) {
                        this.info_ = verification.info_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (verification.hasSign()) {
                        this.sign_ = verification.sign_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (verification.hasTrialDuration()) {
                        setTrialDuration(verification.getTrialDuration());
                    }
                    mergeUnknownFields(verification.getUnknownFields());
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
                                        this.info_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.sign_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 2;
                                    } else if (tag != 24) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.trialDuration_ = codedInputStream.readUInt32();
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

            private Verification(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.info_ = "";
                this.sign_ = "";
                this.trialDuration_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Verification verification) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(verification);
            }

            public static Verification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Verification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Verification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Verification parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Verification getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Verification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Verification parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static Verification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private Verification() {
                this.info_ = "";
                this.sign_ = "";
                this.trialDuration_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.info_ = "";
                this.sign_ = "";
            }

            public static Verification parseFrom(InputStream inputStream) {
                return (Verification) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static Verification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Verification) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Verification parseFrom(CodedInputStream codedInputStream) {
                return (Verification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static Verification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Verification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface VerificationOrBuilder extends MessageOrBuilder {
            String getInfo();

            ByteString getInfoBytes();

            String getSign();

            ByteString getSignBytes();

            int getTrialDuration();

            boolean hasInfo();

            boolean hasSign();

            boolean hasTrialDuration();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAPrepareInfo");
            DEFAULT_INSTANCE = new SAPrepareInfo();
            PARSER = new AbstractParser<SAPrepareInfo>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfo.1
                @Override // com.google.protobuf.Parser
                public SAPrepareInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAPrepareInfo.newBuilder();
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

        public static SAPrepareInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAPrepareInfo parseDelimitedFrom(InputStream inputStream) {
            return (SAPrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAPrepareInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAPrepareInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAPrepareInfo)) {
                return super.equals(obj);
            }
            SAPrepareInfo sAPrepareInfo = (SAPrepareInfo) obj;
            if (hasId() != sAPrepareInfo.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAPrepareInfo.getId())) || hasSize() != sAPrepareInfo.hasSize()) {
                return false;
            }
            if ((hasSize() && getSize() != sAPrepareInfo.getSize()) || hasWatchBgSize() != sAPrepareInfo.hasWatchBgSize()) {
                return false;
            }
            if ((hasWatchBgSize() && getWatchBgSize() != sAPrepareInfo.getWatchBgSize()) || hasVersionCode() != sAPrepareInfo.hasVersionCode()) {
                return false;
            }
            if ((hasVersionCode() && getVersionCode() != sAPrepareInfo.getVersionCode()) || hasSupportCompressMode() != sAPrepareInfo.hasSupportCompressMode()) {
                return false;
            }
            if ((hasSupportCompressMode() && getSupportCompressMode() != sAPrepareInfo.getSupportCompressMode()) || hasVerification() != sAPrepareInfo.hasVerification()) {
                return false;
            }
            if ((!hasVerification() || getVerification().equals(sAPrepareInfo.getVerification())) && hasStyle() == sAPrepareInfo.hasStyle()) {
                return (!hasStyle() || getStyle().equals(sAPrepareInfo.getStyle())) && getUnknownFields().equals(sAPrepareInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
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
        public Parser<SAPrepareInfo> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.size_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.watchBgSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(4, this.versionCode_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.supportCompressMode_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, getVerification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(7, this.style_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public int getSupportCompressMode() {
            return this.supportCompressMode_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public Verification getVerification() {
            Verification verification = this.verification_;
            return verification == null ? Verification.getDefaultInstance() : verification;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public VerificationOrBuilder getVerificationOrBuilder() {
            Verification verification = this.verification_;
            return verification == null ? Verification.getDefaultInstance() : verification;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public long getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public int getWatchBgSize() {
            return this.watchBgSize_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public boolean hasSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public boolean hasStyle() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public boolean hasSupportCompressMode() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public boolean hasVerification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public boolean hasVersionCode() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
        public boolean hasWatchBgSize() {
            return (this.bitField0_ & 4) != 0;
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
            if (hasWatchBgSize()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getWatchBgSize();
            }
            if (hasVersionCode()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashLong(getVersionCode());
            }
            if (hasSupportCompressMode()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSupportCompressMode();
            }
            if (hasVerification()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getVerification().hashCode();
            }
            if (hasStyle()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getStyle().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SAPrepareInfo.class, Builder.class);
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
            if (!hasSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWatchBgSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasVerification() || getVerification().isInitialized()) {
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
                codedOutputStream.writeUInt32(2, this.size_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.watchBgSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt64(4, this.versionCode_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.supportCompressMode_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getVerification());
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.style_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAPrepareInfoOrBuilder {
            private int bitField0_;
            private Object id_;
            private int size_;
            private Object style_;
            private int supportCompressMode_;
            private SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> verificationBuilder_;
            private Verification verification_;
            private long versionCode_;
            private int watchBgSize_;

            private void buildPartial0(SAPrepareInfo sAPrepareInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAPrepareInfo.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAPrepareInfo.size_ = this.size_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAPrepareInfo.watchBgSize_ = this.watchBgSize_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAPrepareInfo.versionCode_ = this.versionCode_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sAPrepareInfo.supportCompressMode_ = this.supportCompressMode_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                    sAPrepareInfo.verification_ = singleFieldBuilder == null ? this.verification_ : (Verification) singleFieldBuilder.build();
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sAPrepareInfo.style_ = this.style_;
                    i7 |= 64;
                }
                sAPrepareInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_descriptor;
            }

            private SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> internalGetVerificationFieldBuilder() {
                if (this.verificationBuilder_ == null) {
                    this.verificationBuilder_ = new SingleFieldBuilder<>(getVerification(), getParentForChildren(), isClean());
                    this.verification_ = null;
                }
                return this.verificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetVerificationFieldBuilder();
                }
            }

            public Builder clearId() {
                this.id_ = SAPrepareInfo.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = SAPrepareInfo.getDefaultInstance().getStyle();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearSupportCompressMode() {
                this.bitField0_ &= -17;
                this.supportCompressMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVerification() {
                this.bitField0_ &= -33;
                this.verification_ = null;
                SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.verificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVersionCode() {
                this.bitField0_ &= -9;
                this.versionCode_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearWatchBgSize() {
                this.bitField0_ &= -5;
                this.watchBgSize_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public int getSupportCompressMode() {
                return this.supportCompressMode_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public Verification getVerification() {
                SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                if (singleFieldBuilder != null) {
                    return (Verification) singleFieldBuilder.getMessage();
                }
                Verification verification = this.verification_;
                return verification == null ? Verification.getDefaultInstance() : verification;
            }

            public Verification.Builder getVerificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (Verification.Builder) internalGetVerificationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public VerificationOrBuilder getVerificationOrBuilder() {
                SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                if (singleFieldBuilder != null) {
                    return (VerificationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                Verification verification = this.verification_;
                return verification == null ? Verification.getDefaultInstance() : verification;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public long getVersionCode() {
                return this.versionCode_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public int getWatchBgSize() {
                return this.watchBgSize_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public boolean hasStyle() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public boolean hasSupportCompressMode() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public boolean hasVerification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareInfoOrBuilder
            public boolean hasWatchBgSize() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SAPrepareInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasId() && hasSize() && hasWatchBgSize()) {
                    return !hasVerification() || getVerification().isInitialized();
                }
                return false;
            }

            public Builder mergeVerification(Verification verification) {
                Verification verification2;
                SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(verification);
                } else if ((this.bitField0_ & 32) == 0 || (verification2 = this.verification_) == null || verification2 == Verification.getDefaultInstance()) {
                    this.verification_ = verification;
                } else {
                    getVerificationBuilder().mergeFrom(verification);
                }
                if (this.verification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
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

            public Builder setSize(int i7) {
                this.size_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.style_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                this.style_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSupportCompressMode(int i7) {
                this.supportCompressMode_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVerification(Verification verification) {
                SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                if (singleFieldBuilder == null) {
                    verification.getClass();
                    this.verification_ = verification;
                } else {
                    singleFieldBuilder.setMessage(verification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setVersionCode(long j7) {
                this.versionCode_ = j7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setWatchBgSize(int i7) {
                this.watchBgSize_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.style_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAPrepareInfo build() {
                SAPrepareInfo sAPrepareInfoBuildPartial = buildPartial();
                if (sAPrepareInfoBuildPartial.isInitialized()) {
                    return sAPrepareInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAPrepareInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAPrepareInfo buildPartial() {
                SAPrepareInfo sAPrepareInfo = new SAPrepareInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAPrepareInfo);
                }
                onBuilt();
                return sAPrepareInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAPrepareInfo getDefaultInstanceForType() {
                return SAPrepareInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.size_ = 0;
                this.watchBgSize_ = 0;
                this.versionCode_ = 0L;
                this.supportCompressMode_ = 0;
                this.verification_ = null;
                SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.verificationBuilder_ = null;
                }
                this.style_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.style_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAPrepareInfo) {
                    return mergeFrom((SAPrepareInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setVerification(Verification.Builder builder) {
                SingleFieldBuilder<Verification, Verification.Builder, VerificationOrBuilder> singleFieldBuilder = this.verificationBuilder_;
                if (singleFieldBuilder == null) {
                    this.verification_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SAPrepareInfo sAPrepareInfo) {
                if (sAPrepareInfo == SAPrepareInfo.getDefaultInstance()) {
                    return this;
                }
                if (sAPrepareInfo.hasId()) {
                    this.id_ = sAPrepareInfo.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAPrepareInfo.hasSize()) {
                    setSize(sAPrepareInfo.getSize());
                }
                if (sAPrepareInfo.hasWatchBgSize()) {
                    setWatchBgSize(sAPrepareInfo.getWatchBgSize());
                }
                if (sAPrepareInfo.hasVersionCode()) {
                    setVersionCode(sAPrepareInfo.getVersionCode());
                }
                if (sAPrepareInfo.hasSupportCompressMode()) {
                    setSupportCompressMode(sAPrepareInfo.getSupportCompressMode());
                }
                if (sAPrepareInfo.hasVerification()) {
                    mergeVerification(sAPrepareInfo.getVerification());
                }
                if (sAPrepareInfo.hasStyle()) {
                    this.style_ = sAPrepareInfo.style_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                mergeUnknownFields(sAPrepareInfo.getUnknownFields());
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
                                    this.size_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.watchBgSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.versionCode_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.supportCompressMode_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetVerificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag != 58) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.style_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
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

        private SAPrepareInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.size_ = 0;
            this.watchBgSize_ = 0;
            this.versionCode_ = 0L;
            this.supportCompressMode_ = 0;
            this.style_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAPrepareInfo sAPrepareInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAPrepareInfo);
        }

        public static SAPrepareInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAPrepareInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAPrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAPrepareInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAPrepareInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAPrepareInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAPrepareInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAPrepareInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAPrepareInfo parseFrom(InputStream inputStream) {
            return (SAPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAPrepareInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SAPrepareInfo() {
            this.id_ = "";
            this.size_ = 0;
            this.watchBgSize_ = 0;
            this.versionCode_ = 0L;
            this.supportCompressMode_ = 0;
            this.style_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.style_ = "";
        }

        public static SAPrepareInfo parseFrom(CodedInputStream codedInputStream) {
            return (SAPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAPrepareInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAPrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAPrepareInfoOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        int getSize();

        String getStyle();

        ByteString getStyleBytes();

        int getSupportCompressMode();

        SAPrepareInfo.Verification getVerification();

        SAPrepareInfo.VerificationOrBuilder getVerificationOrBuilder();

        long getVersionCode();

        int getWatchBgSize();

        boolean hasId();

        boolean hasSize();

        boolean hasStyle();

        boolean hasSupportCompressMode();

        boolean hasVerification();

        boolean hasVersionCode();

        boolean hasWatchBgSize();
    }

    public static final class SAPrepareReply extends GeneratedMessage implements SAPrepareReplyOrBuilder {
        public static final int CAN_REPLACE_IF_LOW_STORAGE_FIELD_NUMBER = 5;
        private static final SAPrepareReply DEFAULT_INSTANCE;
        public static final int EXPECTED_SLICE_LENGTH_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAPrepareReply> PARSER;
        public static final int PREPARE_STATUS_FIELD_NUMBER = 2;
        public static final int SCREEN_RADIUS_FIELD_NUMBER = 6;
        public static final int SELECT_COMPRESS_MODE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean canReplaceIfLowStorage_;
        private int expectedSliceLength_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int prepareStatus_;
        private int screenRadius_;
        private int selectCompressMode_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAPrepareReply");
            DEFAULT_INSTANCE = new SAPrepareReply();
            PARSER = new AbstractParser<SAPrepareReply>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReply.1
                @Override // com.google.protobuf.Parser
                public SAPrepareReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAPrepareReply.newBuilder();
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

        public static SAPrepareReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAPrepareReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAPrepareReply parseDelimitedFrom(InputStream inputStream) {
            return (SAPrepareReply) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAPrepareReply parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAPrepareReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAPrepareReply)) {
                return super.equals(obj);
            }
            SAPrepareReply sAPrepareReply = (SAPrepareReply) obj;
            if (hasId() != sAPrepareReply.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAPrepareReply.getId())) || hasPrepareStatus() != sAPrepareReply.hasPrepareStatus()) {
                return false;
            }
            if ((hasPrepareStatus() && this.prepareStatus_ != sAPrepareReply.prepareStatus_) || hasCanReplaceIfLowStorage() != sAPrepareReply.hasCanReplaceIfLowStorage()) {
                return false;
            }
            if ((hasCanReplaceIfLowStorage() && getCanReplaceIfLowStorage() != sAPrepareReply.getCanReplaceIfLowStorage()) || hasSelectCompressMode() != sAPrepareReply.hasSelectCompressMode()) {
                return false;
            }
            if ((hasSelectCompressMode() && getSelectCompressMode() != sAPrepareReply.getSelectCompressMode()) || hasExpectedSliceLength() != sAPrepareReply.hasExpectedSliceLength()) {
                return false;
            }
            if ((!hasExpectedSliceLength() || getExpectedSliceLength() == sAPrepareReply.getExpectedSliceLength()) && hasScreenRadius() == sAPrepareReply.hasScreenRadius()) {
                return (!hasScreenRadius() || getScreenRadius() == sAPrepareReply.getScreenRadius()) && getUnknownFields().equals(sAPrepareReply.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public boolean getCanReplaceIfLowStorage() {
            return this.canReplaceIfLowStorage_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAPrepareReply_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public int getExpectedSliceLength() {
            return this.expectedSliceLength_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
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
        public Parser<SAPrepareReply> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public CommonProtos.SEPrepareStatus getPrepareStatus() {
            CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
            return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public int getScreenRadius() {
            return this.screenRadius_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public int getSelectCompressMode() {
            return this.selectCompressMode_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.prepareStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.selectCompressMode_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.expectedSliceLength_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(5, this.canReplaceIfLowStorage_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(6, this.screenRadius_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public boolean hasCanReplaceIfLowStorage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public boolean hasExpectedSliceLength() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public boolean hasPrepareStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public boolean hasScreenRadius() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
        public boolean hasSelectCompressMode() {
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
            if (hasPrepareStatus()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.prepareStatus_;
            }
            if (hasCanReplaceIfLowStorage()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getCanReplaceIfLowStorage());
            }
            if (hasSelectCompressMode()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSelectCompressMode();
            }
            if (hasExpectedSliceLength()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getExpectedSliceLength();
            }
            if (hasScreenRadius()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getScreenRadius();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAPrepareReply_fieldAccessorTable.ensureFieldAccessorsInitialized(SAPrepareReply.class, Builder.class);
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
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.prepareStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(3, this.selectCompressMode_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(4, this.expectedSliceLength_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(5, this.canReplaceIfLowStorage_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.screenRadius_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAPrepareReplyOrBuilder {
            private int bitField0_;
            private boolean canReplaceIfLowStorage_;
            private int expectedSliceLength_;
            private Object id_;
            private int prepareStatus_;
            private int screenRadius_;
            private int selectCompressMode_;

            private void buildPartial0(SAPrepareReply sAPrepareReply) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAPrepareReply.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAPrepareReply.prepareStatus_ = this.prepareStatus_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAPrepareReply.canReplaceIfLowStorage_ = this.canReplaceIfLowStorage_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAPrepareReply.selectCompressMode_ = this.selectCompressMode_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sAPrepareReply.expectedSliceLength_ = this.expectedSliceLength_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sAPrepareReply.screenRadius_ = this.screenRadius_;
                    i7 |= 32;
                }
                sAPrepareReply.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareReply_descriptor;
            }

            public Builder clearCanReplaceIfLowStorage() {
                this.bitField0_ &= -5;
                this.canReplaceIfLowStorage_ = false;
                onChanged();
                return this;
            }

            public Builder clearExpectedSliceLength() {
                this.bitField0_ &= -17;
                this.expectedSliceLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SAPrepareReply.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearPrepareStatus() {
                this.bitField0_ &= -3;
                this.prepareStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenRadius() {
                this.bitField0_ &= -33;
                this.screenRadius_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSelectCompressMode() {
                this.bitField0_ &= -9;
                this.selectCompressMode_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public boolean getCanReplaceIfLowStorage() {
                return this.canReplaceIfLowStorage_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareReply_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public int getExpectedSliceLength() {
                return this.expectedSliceLength_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public CommonProtos.SEPrepareStatus getPrepareStatus() {
                CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
                return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public int getScreenRadius() {
                return this.screenRadius_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public int getSelectCompressMode() {
                return this.selectCompressMode_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public boolean hasCanReplaceIfLowStorage() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public boolean hasExpectedSliceLength() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public boolean hasPrepareStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public boolean hasScreenRadius() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAPrepareReplyOrBuilder
            public boolean hasSelectCompressMode() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAPrepareReply_fieldAccessorTable.ensureFieldAccessorsInitialized(SAPrepareReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasPrepareStatus();
            }

            public Builder setCanReplaceIfLowStorage(boolean z6) {
                this.canReplaceIfLowStorage_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setExpectedSliceLength(int i7) {
                this.expectedSliceLength_ = i7;
                this.bitField0_ |= 16;
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

            public Builder setPrepareStatus(CommonProtos.SEPrepareStatus sEPrepareStatus) {
                sEPrepareStatus.getClass();
                this.bitField0_ |= 2;
                this.prepareStatus_ = sEPrepareStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setScreenRadius(int i7) {
                this.screenRadius_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSelectCompressMode(int i7) {
                this.selectCompressMode_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAPrepareReply build() {
                SAPrepareReply sAPrepareReplyBuildPartial = buildPartial();
                if (sAPrepareReplyBuildPartial.isInitialized()) {
                    return sAPrepareReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAPrepareReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAPrepareReply buildPartial() {
                SAPrepareReply sAPrepareReply = new SAPrepareReply(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAPrepareReply);
                }
                onBuilt();
                return sAPrepareReply;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAPrepareReply getDefaultInstanceForType() {
                return SAPrepareReply.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.prepareStatus_ = 0;
                this.canReplaceIfLowStorage_ = false;
                this.selectCompressMode_ = 0;
                this.expectedSliceLength_ = 0;
                this.screenRadius_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAPrepareReply) {
                    return mergeFrom((SAPrepareReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAPrepareReply sAPrepareReply) {
                if (sAPrepareReply == SAPrepareReply.getDefaultInstance()) {
                    return this;
                }
                if (sAPrepareReply.hasId()) {
                    this.id_ = sAPrepareReply.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAPrepareReply.hasPrepareStatus()) {
                    setPrepareStatus(sAPrepareReply.getPrepareStatus());
                }
                if (sAPrepareReply.hasCanReplaceIfLowStorage()) {
                    setCanReplaceIfLowStorage(sAPrepareReply.getCanReplaceIfLowStorage());
                }
                if (sAPrepareReply.hasSelectCompressMode()) {
                    setSelectCompressMode(sAPrepareReply.getSelectCompressMode());
                }
                if (sAPrepareReply.hasExpectedSliceLength()) {
                    setExpectedSliceLength(sAPrepareReply.getExpectedSliceLength());
                }
                if (sAPrepareReply.hasScreenRadius()) {
                    setScreenRadius(sAPrepareReply.getScreenRadius());
                }
                mergeUnknownFields(sAPrepareReply.getUnknownFields());
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
                                    int i7 = codedInputStream.readEnum();
                                    if (CommonProtos.SEPrepareStatus.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.prepareStatus_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.selectCompressMode_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 32) {
                                    this.expectedSliceLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 40) {
                                    this.canReplaceIfLowStorage_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.screenRadius_ = codedInputStream.readUInt32();
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

        private SAPrepareReply(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.prepareStatus_ = 0;
            this.canReplaceIfLowStorage_ = false;
            this.selectCompressMode_ = 0;
            this.expectedSliceLength_ = 0;
            this.screenRadius_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAPrepareReply sAPrepareReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAPrepareReply);
        }

        public static SAPrepareReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAPrepareReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAPrepareReply) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAPrepareReply parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAPrepareReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAPrepareReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAPrepareReply parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAPrepareReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAPrepareReply parseFrom(InputStream inputStream) {
            return (SAPrepareReply) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAPrepareReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAPrepareReply) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SAPrepareReply() {
            this.id_ = "";
            this.prepareStatus_ = 0;
            this.canReplaceIfLowStorage_ = false;
            this.selectCompressMode_ = 0;
            this.expectedSliceLength_ = 0;
            this.screenRadius_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.prepareStatus_ = 0;
        }

        public static SAPrepareReply parseFrom(CodedInputStream codedInputStream) {
            return (SAPrepareReply) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAPrepareReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAPrepareReply) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAPrepareReplyOrBuilder extends MessageOrBuilder {
        boolean getCanReplaceIfLowStorage();

        int getExpectedSliceLength();

        String getId();

        ByteString getIdBytes();

        CommonProtos.SEPrepareStatus getPrepareStatus();

        int getScreenRadius();

        int getSelectCompressMode();

        boolean hasCanReplaceIfLowStorage();

        boolean hasExpectedSliceLength();

        boolean hasId();

        boolean hasPrepareStatus();

        boolean hasScreenRadius();

        boolean hasSelectCompressMode();
    }

    public static final class SAWatchFace extends GeneratedMessage implements SAWatchFaceOrBuilder {
        public static final int BG_IMAGE_RESULT_FIELD_NUMBER = 14;
        public static final int CHANGE_WATCH_FACE_INFO_FIELD_NUMBER = 15;
        private static final SAWatchFace DEFAULT_INSTANCE;
        public static final int EDIT_REQUEST_FIELD_NUMBER = 12;
        public static final int EDIT_RESPONSE_FIELD_NUMBER = 13;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int INFO_LIST_FIELD_NUMBER = 8;
        public static final int INSTALL_RESULT_FIELD_NUMBER = 7;
        private static final Parser<SAWatchFace> PARSER;
        public static final int PATH_FIELD_NUMBER = 3;
        public static final int PREPARE_INFO_FIELD_NUMBER = 6;
        public static final int PREPARE_REPLY_FIELD_NUMBER = 9;
        public static final int PREPARE_STATUS_FIELD_NUMBER = 5;
        public static final int SUCCESS_FIELD_NUMBER = 4;
        public static final int SUPPORT_DATA_LIST_FIELD_NUMBER = 11;
        public static final int WATCH_FACE_LIST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            WATCH_FACE_LIST(1),
            ID(2),
            PATH(3),
            SUCCESS(4),
            PREPARE_STATUS(5),
            PREPARE_INFO(6),
            INSTALL_RESULT(7),
            INFO_LIST(8),
            PREPARE_REPLY(9),
            SUPPORT_DATA_LIST(11),
            EDIT_REQUEST(12),
            EDIT_RESPONSE(13),
            BG_IMAGE_RESULT(14),
            CHANGE_WATCH_FACE_INFO(15),
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
                        return PREPARE_REPLY;
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
                    case 15:
                        return CHANGE_WATCH_FACE_INFO;
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
            BG_IMAGE_RESULT(12),
            WATCH_INITIATIVE_CHANGE_WATCH_FACE(13);

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
            private static final WatchFaceID[] VALUES;
            public static final int WATCH_INITIATIVE_CHANGE_WATCH_FACE_VALUE = 13;
            private static final Internal.EnumLiteMap<WatchFaceID> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "WatchFaceID");
                internalValueMap = new Internal.EnumLiteMap<WatchFaceID>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFace.WatchFaceID.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public WatchFaceID findValueByNumber(int i7) {
                        return WatchFaceID.forNumber(i7);
                    }
                };
                VALUES = values();
            }

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
                    case 13:
                        return WATCH_INITIATIVE_CHANGE_WATCH_FACE;
                }
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SAWatchFace.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<WatchFaceID> internalGetValueMap() {
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
            public static WatchFaceID valueOf(int i7) {
                return forNumber(i7);
            }

            public static WatchFaceID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWatchFace");
            DEFAULT_INSTANCE = new SAWatchFace();
            PARSER = new AbstractParser<SAWatchFace>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFace.1
                @Override // com.google.protobuf.Parser
                public SAWatchFace parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWatchFace.newBuilder();
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

        public static SAWatchFace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFace_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWatchFace parseDelimitedFrom(InputStream inputStream) {
            return (SAWatchFace) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWatchFace parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWatchFace> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWatchFace)) {
                return super.equals(obj);
            }
            SAWatchFace sAWatchFace = (SAWatchFace) obj;
            if (!getPayloadCase().equals(sAWatchFace.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getWatchFaceList().equals(sAWatchFace.getWatchFaceList())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getId().equals(sAWatchFace.getId())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getPath().equals(sAWatchFace.getPath())) {
                        return false;
                    }
                    break;
                case 4:
                    if (getSuccess() != sAWatchFace.getSuccess()) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getPrepareStatus().equals(sAWatchFace.getPrepareStatus())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getPrepareInfo().equals(sAWatchFace.getPrepareInfo())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getInstallResult().equals(sAWatchFace.getInstallResult())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getInfoList().equals(sAWatchFace.getInfoList())) {
                        return false;
                    }
                    break;
                case 9:
                    if (!getPrepareReply().equals(sAWatchFace.getPrepareReply())) {
                        return false;
                    }
                    break;
                case 11:
                    if (!getSupportDataList().equals(sAWatchFace.getSupportDataList())) {
                        return false;
                    }
                    break;
                case 12:
                    if (!getEditRequest().equals(sAWatchFace.getEditRequest())) {
                        return false;
                    }
                    break;
                case 13:
                    if (!getEditResponse().equals(sAWatchFace.getEditResponse())) {
                        return false;
                    }
                    break;
                case 14:
                    if (!getBgImageResult().equals(sAWatchFace.getBgImageResult())) {
                        return false;
                    }
                    break;
                case 15:
                    if (!getChangeWatchFaceInfo().equals(sAWatchFace.getChangeWatchFaceInfo())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sAWatchFace.getUnknownFields());
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SABgImageResult getBgImageResult() {
            return this.payloadCase_ == 14 ? (SABgImageResult) this.payload_ : SABgImageResult.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SABgImageResultOrBuilder getBgImageResultOrBuilder() {
            return this.payloadCase_ == 14 ? (SABgImageResult) this.payload_ : SABgImageResult.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAChange_Watch_Face_Info getChangeWatchFaceInfo() {
            return this.payloadCase_ == 15 ? (SAChange_Watch_Face_Info) this.payload_ : SAChange_Watch_Face_Info.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAChange_Watch_Face_InfoOrBuilder getChangeWatchFaceInfoOrBuilder() {
            return this.payloadCase_ == 15 ? (SAChange_Watch_Face_Info) this.payload_ : SAChange_Watch_Face_Info.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFace_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAEditRequest getEditRequest() {
            return this.payloadCase_ == 12 ? (SAEditRequest) this.payload_ : SAEditRequest.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAEditRequestOrBuilder getEditRequestOrBuilder() {
            return this.payloadCase_ == 12 ? (SAEditRequest) this.payload_ : SAEditRequest.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAEditResponse getEditResponse() {
            return this.payloadCase_ == 13 ? (SAEditResponse) this.payload_ : SAEditResponse.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAEditResponseOrBuilder getEditResponseOrBuilder() {
            return this.payloadCase_ == 13 ? (SAEditResponse) this.payload_ : SAEditResponse.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public String getId() {
            if (this.payloadCase_ != 2) {
                return "";
            }
            Object obj = this.payload_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public ByteString getIdBytes() {
            if (this.payloadCase_ != 2) {
                return ByteString.copyFromUtf8("");
            }
            Object obj = this.payload_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.payload_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAWatchFaceInfo.List getInfoList() {
            return this.payloadCase_ == 8 ? (SAWatchFaceInfo.List) this.payload_ : SAWatchFaceInfo.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAWatchFaceInfo.ListOrBuilder getInfoListOrBuilder() {
            return this.payloadCase_ == 8 ? (SAWatchFaceInfo.List) this.payload_ : SAWatchFaceInfo.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAInstallResult getInstallResult() {
            return this.payloadCase_ == 7 ? (SAInstallResult) this.payload_ : SAInstallResult.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAInstallResultOrBuilder getInstallResultOrBuilder() {
            return this.payloadCase_ == 7 ? (SAInstallResult) this.payload_ : SAInstallResult.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAWatchFace> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public String getPath() {
            if (this.payloadCase_ != 3) {
                return "";
            }
            Object obj = this.payload_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public ByteString getPathBytes() {
            if (this.payloadCase_ != 3) {
                return ByteString.copyFromUtf8("");
            }
            Object obj = this.payload_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.payload_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAPrepareInfo getPrepareInfo() {
            return this.payloadCase_ == 6 ? (SAPrepareInfo) this.payload_ : SAPrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAPrepareInfoOrBuilder getPrepareInfoOrBuilder() {
            return this.payloadCase_ == 6 ? (SAPrepareInfo) this.payload_ : SAPrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAPrepareReply getPrepareReply() {
            return this.payloadCase_ == 9 ? (SAPrepareReply) this.payload_ : SAPrepareReply.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAPrepareReplyOrBuilder getPrepareReplyOrBuilder() {
            return this.payloadCase_ == 9 ? (SAPrepareReply) this.payload_ : SAPrepareReply.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public CommonProtos.SEPrepareStatus getPrepareStatus() {
            CommonProtos.SEPrepareStatus sEPrepareStatusForNumber;
            return (this.payloadCase_ != 5 || (sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(((Integer) this.payload_).intValue())) == null) ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SAWatchFaceItem.List) this.payload_) : 0;
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
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SAPrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (SAInstallResult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (SAWatchFaceInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, (SAPrepareReply) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, (SAWatchFaceSlot.List) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, (SAEditRequest) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, (SAEditResponse) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, (SABgImageResult) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, (SAChange_Watch_Face_Info) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean getSuccess() {
            if (this.payloadCase_ == 4) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAWatchFaceSlot.List getSupportDataList() {
            return this.payloadCase_ == 11 ? (SAWatchFaceSlot.List) this.payload_ : SAWatchFaceSlot.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAWatchFaceSlot.ListOrBuilder getSupportDataListOrBuilder() {
            return this.payloadCase_ == 11 ? (SAWatchFaceSlot.List) this.payload_ : SAWatchFaceSlot.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAWatchFaceItem.List getWatchFaceList() {
            return this.payloadCase_ == 1 ? (SAWatchFaceItem.List) this.payload_ : SAWatchFaceItem.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public SAWatchFaceItem.ListOrBuilder getWatchFaceListOrBuilder() {
            return this.payloadCase_ == 1 ? (SAWatchFaceItem.List) this.payload_ : SAWatchFaceItem.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasBgImageResult() {
            return this.payloadCase_ == 14;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasChangeWatchFaceInfo() {
            return this.payloadCase_ == 15;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasEditRequest() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasEditResponse() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasId() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasInfoList() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasInstallResult() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasPath() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasPrepareInfo() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasPrepareReply() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasPrepareStatus() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasSuccess() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasSupportDataList() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
        public boolean hasWatchFaceList() {
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
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode2 * 37) + 1) * 53;
                    iHashCode = getWatchFaceList().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getId().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getPath().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = Internal.hashBoolean(getSuccess());
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getPrepareStatus().getNumber();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getPrepareInfo().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getInstallResult().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getInfoList().hashCode();
                    break;
                case 9:
                    i7 = ((iHashCode2 * 37) + 9) * 53;
                    iHashCode = getPrepareReply().hashCode();
                    break;
                case 10:
                default:
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                case 11:
                    i7 = ((iHashCode2 * 37) + 11) * 53;
                    iHashCode = getSupportDataList().hashCode();
                    break;
                case 12:
                    i7 = ((iHashCode2 * 37) + 12) * 53;
                    iHashCode = getEditRequest().hashCode();
                    break;
                case 13:
                    i7 = ((iHashCode2 * 37) + 13) * 53;
                    iHashCode = getEditResponse().hashCode();
                    break;
                case 14:
                    i7 = ((iHashCode2 * 37) + 14) * 53;
                    iHashCode = getBgImageResult().hashCode();
                    break;
                case 15:
                    i7 = ((iHashCode2 * 37) + 15) * 53;
                    iHashCode = getChangeWatchFaceInfo().hashCode();
                    break;
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFace_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFace.class, Builder.class);
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
            if (hasPrepareReply() && !getPrepareReply().isInitialized()) {
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
            if (hasBgImageResult() && !getBgImageResult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasChangeWatchFaceInfo() || getChangeWatchFaceInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SAWatchFaceItem.List) this.payload_);
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
                codedOutputStream.writeMessage(6, (SAPrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SAInstallResult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SAWatchFaceInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (SAPrepareReply) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (SAWatchFaceSlot.List) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (SAEditRequest) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (SAEditResponse) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                codedOutputStream.writeMessage(14, (SABgImageResult) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                codedOutputStream.writeMessage(15, (SAChange_Watch_Face_Info) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWatchFaceOrBuilder {
            private SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> bgImageResultBuilder_;
            private int bitField0_;
            private SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> changeWatchFaceInfoBuilder_;
            private SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> editRequestBuilder_;
            private SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> editResponseBuilder_;
            private SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> infoListBuilder_;
            private SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> installResultBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> prepareInfoBuilder_;
            private SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> prepareReplyBuilder_;
            private SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> supportDataListBuilder_;
            private SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> watchFaceListBuilder_;

            private void buildPartial0(SAWatchFace sAWatchFace) {
            }

            private void buildPartialOneofs(SAWatchFace sAWatchFace) {
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder9;
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder10;
                int i7 = this.payloadCase_;
                sAWatchFace.payloadCase_ = i7;
                sAWatchFace.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder10 = this.watchFaceListBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder10.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder9 = this.prepareInfoBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder8 = this.installResultBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder7 = this.infoListBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 9 && (singleFieldBuilder6 = this.prepareReplyBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 11 && (singleFieldBuilder5 = this.supportDataListBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 12 && (singleFieldBuilder4 = this.editRequestBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 13 && (singleFieldBuilder3 = this.editResponseBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 14 && (singleFieldBuilder2 = this.bgImageResultBuilder_) != null) {
                    sAWatchFace.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 15 || (singleFieldBuilder = this.changeWatchFaceInfoBuilder_) == null) {
                    return;
                }
                sAWatchFace.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFace_descriptor;
            }

            private SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> internalGetBgImageResultFieldBuilder() {
                if (this.bgImageResultBuilder_ == null) {
                    if (this.payloadCase_ != 14) {
                        this.payload_ = SABgImageResult.getDefaultInstance();
                    }
                    this.bgImageResultBuilder_ = new SingleFieldBuilder<>((SABgImageResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 14;
                onChanged();
                return this.bgImageResultBuilder_;
            }

            private SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> internalGetChangeWatchFaceInfoFieldBuilder() {
                if (this.changeWatchFaceInfoBuilder_ == null) {
                    if (this.payloadCase_ != 15) {
                        this.payload_ = SAChange_Watch_Face_Info.getDefaultInstance();
                    }
                    this.changeWatchFaceInfoBuilder_ = new SingleFieldBuilder<>((SAChange_Watch_Face_Info) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 15;
                onChanged();
                return this.changeWatchFaceInfoBuilder_;
            }

            private SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> internalGetEditRequestFieldBuilder() {
                if (this.editRequestBuilder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = SAEditRequest.getDefaultInstance();
                    }
                    this.editRequestBuilder_ = new SingleFieldBuilder<>((SAEditRequest) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.editRequestBuilder_;
            }

            private SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> internalGetEditResponseFieldBuilder() {
                if (this.editResponseBuilder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = SAEditResponse.getDefaultInstance();
                    }
                    this.editResponseBuilder_ = new SingleFieldBuilder<>((SAEditResponse) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.editResponseBuilder_;
            }

            private SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> internalGetInfoListFieldBuilder() {
                if (this.infoListBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SAWatchFaceInfo.List.getDefaultInstance();
                    }
                    this.infoListBuilder_ = new SingleFieldBuilder<>((SAWatchFaceInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.infoListBuilder_;
            }

            private SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> internalGetInstallResultFieldBuilder() {
                if (this.installResultBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SAInstallResult.getDefaultInstance();
                    }
                    this.installResultBuilder_ = new SingleFieldBuilder<>((SAInstallResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.installResultBuilder_;
            }

            private SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> internalGetPrepareInfoFieldBuilder() {
                if (this.prepareInfoBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SAPrepareInfo.getDefaultInstance();
                    }
                    this.prepareInfoBuilder_ = new SingleFieldBuilder<>((SAPrepareInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.prepareInfoBuilder_;
            }

            private SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> internalGetPrepareReplyFieldBuilder() {
                if (this.prepareReplyBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = SAPrepareReply.getDefaultInstance();
                    }
                    this.prepareReplyBuilder_ = new SingleFieldBuilder<>((SAPrepareReply) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.prepareReplyBuilder_;
            }

            private SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> internalGetSupportDataListFieldBuilder() {
                if (this.supportDataListBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = SAWatchFaceSlot.List.getDefaultInstance();
                    }
                    this.supportDataListBuilder_ = new SingleFieldBuilder<>((SAWatchFaceSlot.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.supportDataListBuilder_;
            }

            private SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> internalGetWatchFaceListFieldBuilder() {
                if (this.watchFaceListBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SAWatchFaceItem.List.getDefaultInstance();
                    }
                    this.watchFaceListBuilder_ = new SingleFieldBuilder<>((SAWatchFaceItem.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.watchFaceListBuilder_;
            }

            public Builder clearBgImageResult() {
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder = this.bgImageResultBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearChangeWatchFaceInfo() {
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder = this.changeWatchFaceInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 15) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 15) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearEditRequest() {
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder = this.editRequestBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearEditResponse() {
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder = this.editResponseBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
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
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
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

            public Builder clearInstallResult() {
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
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
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder = this.prepareInfoBuilder_;
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

            public Builder clearPrepareReply() {
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder = this.prepareReplyBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
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
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder = this.supportDataListBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearWatchFaceList() {
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SABgImageResult getBgImageResult() {
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder = this.bgImageResultBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 14 ? (SABgImageResult) this.payload_ : SABgImageResult.getDefaultInstance() : this.payloadCase_ == 14 ? (SABgImageResult) singleFieldBuilder.getMessage() : SABgImageResult.getDefaultInstance();
            }

            public SABgImageResult.Builder getBgImageResultBuilder() {
                return (SABgImageResult.Builder) internalGetBgImageResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SABgImageResultOrBuilder getBgImageResultOrBuilder() {
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 14 || (singleFieldBuilder = this.bgImageResultBuilder_) == null) ? i7 == 14 ? (SABgImageResult) this.payload_ : SABgImageResult.getDefaultInstance() : (SABgImageResultOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAChange_Watch_Face_Info getChangeWatchFaceInfo() {
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder = this.changeWatchFaceInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 15 ? (SAChange_Watch_Face_Info) this.payload_ : SAChange_Watch_Face_Info.getDefaultInstance() : this.payloadCase_ == 15 ? (SAChange_Watch_Face_Info) singleFieldBuilder.getMessage() : SAChange_Watch_Face_Info.getDefaultInstance();
            }

            public SAChange_Watch_Face_Info.Builder getChangeWatchFaceInfoBuilder() {
                return (SAChange_Watch_Face_Info.Builder) internalGetChangeWatchFaceInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAChange_Watch_Face_InfoOrBuilder getChangeWatchFaceInfoOrBuilder() {
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 15 || (singleFieldBuilder = this.changeWatchFaceInfoBuilder_) == null) ? i7 == 15 ? (SAChange_Watch_Face_Info) this.payload_ : SAChange_Watch_Face_Info.getDefaultInstance() : (SAChange_Watch_Face_InfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFace_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAEditRequest getEditRequest() {
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder = this.editRequestBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 12 ? (SAEditRequest) this.payload_ : SAEditRequest.getDefaultInstance() : this.payloadCase_ == 12 ? (SAEditRequest) singleFieldBuilder.getMessage() : SAEditRequest.getDefaultInstance();
            }

            public SAEditRequest.Builder getEditRequestBuilder() {
                return (SAEditRequest.Builder) internalGetEditRequestFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAEditRequestOrBuilder getEditRequestOrBuilder() {
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilder = this.editRequestBuilder_) == null) ? i7 == 12 ? (SAEditRequest) this.payload_ : SAEditRequest.getDefaultInstance() : (SAEditRequestOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAEditResponse getEditResponse() {
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder = this.editResponseBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 13 ? (SAEditResponse) this.payload_ : SAEditResponse.getDefaultInstance() : this.payloadCase_ == 13 ? (SAEditResponse) singleFieldBuilder.getMessage() : SAEditResponse.getDefaultInstance();
            }

            public SAEditResponse.Builder getEditResponseBuilder() {
                return (SAEditResponse.Builder) internalGetEditResponseFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAEditResponseOrBuilder getEditResponseOrBuilder() {
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilder = this.editResponseBuilder_) == null) ? i7 == 13 ? (SAEditResponse) this.payload_ : SAEditResponse.getDefaultInstance() : (SAEditResponseOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public String getId() {
                if (this.payloadCase_ != 2) {
                    return "";
                }
                Object obj = this.payload_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public ByteString getIdBytes() {
                if (this.payloadCase_ != 2) {
                    return ByteString.copyFromUtf8("");
                }
                Object obj = this.payload_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.payload_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAWatchFaceInfo.List getInfoList() {
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SAWatchFaceInfo.List) this.payload_ : SAWatchFaceInfo.List.getDefaultInstance() : this.payloadCase_ == 8 ? (SAWatchFaceInfo.List) singleFieldBuilder.getMessage() : SAWatchFaceInfo.List.getDefaultInstance();
            }

            public SAWatchFaceInfo.List.Builder getInfoListBuilder() {
                return (SAWatchFaceInfo.List.Builder) internalGetInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAWatchFaceInfo.ListOrBuilder getInfoListOrBuilder() {
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.infoListBuilder_) == null) ? i7 == 8 ? (SAWatchFaceInfo.List) this.payload_ : SAWatchFaceInfo.List.getDefaultInstance() : (SAWatchFaceInfo.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAInstallResult getInstallResult() {
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SAInstallResult) this.payload_ : SAInstallResult.getDefaultInstance() : this.payloadCase_ == 7 ? (SAInstallResult) singleFieldBuilder.getMessage() : SAInstallResult.getDefaultInstance();
            }

            public SAInstallResult.Builder getInstallResultBuilder() {
                return (SAInstallResult.Builder) internalGetInstallResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAInstallResultOrBuilder getInstallResultOrBuilder() {
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.installResultBuilder_) == null) ? i7 == 7 ? (SAInstallResult) this.payload_ : SAInstallResult.getDefaultInstance() : (SAInstallResultOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public String getPath() {
                if (this.payloadCase_ != 3) {
                    return "";
                }
                Object obj = this.payload_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public ByteString getPathBytes() {
                if (this.payloadCase_ != 3) {
                    return ByteString.copyFromUtf8("");
                }
                Object obj = this.payload_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.payload_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAPrepareInfo getPrepareInfo() {
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder = this.prepareInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SAPrepareInfo) this.payload_ : SAPrepareInfo.getDefaultInstance() : this.payloadCase_ == 6 ? (SAPrepareInfo) singleFieldBuilder.getMessage() : SAPrepareInfo.getDefaultInstance();
            }

            public SAPrepareInfo.Builder getPrepareInfoBuilder() {
                return (SAPrepareInfo.Builder) internalGetPrepareInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAPrepareInfoOrBuilder getPrepareInfoOrBuilder() {
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.prepareInfoBuilder_) == null) ? i7 == 6 ? (SAPrepareInfo) this.payload_ : SAPrepareInfo.getDefaultInstance() : (SAPrepareInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAPrepareReply getPrepareReply() {
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder = this.prepareReplyBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (SAPrepareReply) this.payload_ : SAPrepareReply.getDefaultInstance() : this.payloadCase_ == 9 ? (SAPrepareReply) singleFieldBuilder.getMessage() : SAPrepareReply.getDefaultInstance();
            }

            public SAPrepareReply.Builder getPrepareReplyBuilder() {
                return (SAPrepareReply.Builder) internalGetPrepareReplyFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAPrepareReplyOrBuilder getPrepareReplyOrBuilder() {
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.prepareReplyBuilder_) == null) ? i7 == 9 ? (SAPrepareReply) this.payload_ : SAPrepareReply.getDefaultInstance() : (SAPrepareReplyOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public CommonProtos.SEPrepareStatus getPrepareStatus() {
                CommonProtos.SEPrepareStatus sEPrepareStatusForNumber;
                return (this.payloadCase_ != 5 || (sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(((Integer) this.payload_).intValue())) == null) ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean getSuccess() {
                if (this.payloadCase_ == 4) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAWatchFaceSlot.List getSupportDataList() {
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder = this.supportDataListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 11 ? (SAWatchFaceSlot.List) this.payload_ : SAWatchFaceSlot.List.getDefaultInstance() : this.payloadCase_ == 11 ? (SAWatchFaceSlot.List) singleFieldBuilder.getMessage() : SAWatchFaceSlot.List.getDefaultInstance();
            }

            public SAWatchFaceSlot.List.Builder getSupportDataListBuilder() {
                return (SAWatchFaceSlot.List.Builder) internalGetSupportDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAWatchFaceSlot.ListOrBuilder getSupportDataListOrBuilder() {
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilder = this.supportDataListBuilder_) == null) ? i7 == 11 ? (SAWatchFaceSlot.List) this.payload_ : SAWatchFaceSlot.List.getDefaultInstance() : (SAWatchFaceSlot.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAWatchFaceItem.List getWatchFaceList() {
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SAWatchFaceItem.List) this.payload_ : SAWatchFaceItem.List.getDefaultInstance() : this.payloadCase_ == 1 ? (SAWatchFaceItem.List) singleFieldBuilder.getMessage() : SAWatchFaceItem.List.getDefaultInstance();
            }

            public SAWatchFaceItem.List.Builder getWatchFaceListBuilder() {
                return (SAWatchFaceItem.List.Builder) internalGetWatchFaceListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public SAWatchFaceItem.ListOrBuilder getWatchFaceListOrBuilder() {
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.watchFaceListBuilder_) == null) ? i7 == 1 ? (SAWatchFaceItem.List) this.payload_ : SAWatchFaceItem.List.getDefaultInstance() : (SAWatchFaceItem.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasBgImageResult() {
                return this.payloadCase_ == 14;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasChangeWatchFaceInfo() {
                return this.payloadCase_ == 15;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasEditRequest() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasEditResponse() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasId() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasInfoList() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasInstallResult() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasPath() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasPrepareInfo() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasPrepareReply() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasPrepareStatus() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasSuccess() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasSupportDataList() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceOrBuilder
            public boolean hasWatchFaceList() {
                return this.payloadCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFace_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFace.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
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
                if (hasPrepareReply() && !getPrepareReply().isInitialized()) {
                    return false;
                }
                if (hasEditRequest() && !getEditRequest().isInitialized()) {
                    return false;
                }
                if (hasEditResponse() && !getEditResponse().isInitialized()) {
                    return false;
                }
                if (!hasBgImageResult() || getBgImageResult().isInitialized()) {
                    return !hasChangeWatchFaceInfo() || getChangeWatchFaceInfo().isInitialized();
                }
                return false;
            }

            public Builder mergeBgImageResult(SABgImageResult sABgImageResult) {
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder = this.bgImageResultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 14 || this.payload_ == SABgImageResult.getDefaultInstance()) {
                        this.payload_ = sABgImageResult;
                    } else {
                        this.payload_ = SABgImageResult.newBuilder((SABgImageResult) this.payload_).mergeFrom(sABgImageResult).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 14) {
                    singleFieldBuilder.mergeFrom(sABgImageResult);
                } else {
                    singleFieldBuilder.setMessage(sABgImageResult);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder mergeChangeWatchFaceInfo(SAChange_Watch_Face_Info sAChange_Watch_Face_Info) {
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder = this.changeWatchFaceInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 15 || this.payload_ == SAChange_Watch_Face_Info.getDefaultInstance()) {
                        this.payload_ = sAChange_Watch_Face_Info;
                    } else {
                        this.payload_ = SAChange_Watch_Face_Info.newBuilder((SAChange_Watch_Face_Info) this.payload_).mergeFrom(sAChange_Watch_Face_Info).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 15) {
                    singleFieldBuilder.mergeFrom(sAChange_Watch_Face_Info);
                } else {
                    singleFieldBuilder.setMessage(sAChange_Watch_Face_Info);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder mergeEditRequest(SAEditRequest sAEditRequest) {
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder = this.editRequestBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 12 || this.payload_ == SAEditRequest.getDefaultInstance()) {
                        this.payload_ = sAEditRequest;
                    } else {
                        this.payload_ = SAEditRequest.newBuilder((SAEditRequest) this.payload_).mergeFrom(sAEditRequest).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 12) {
                    singleFieldBuilder.mergeFrom(sAEditRequest);
                } else {
                    singleFieldBuilder.setMessage(sAEditRequest);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder mergeEditResponse(SAEditResponse sAEditResponse) {
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder = this.editResponseBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 13 || this.payload_ == SAEditResponse.getDefaultInstance()) {
                        this.payload_ = sAEditResponse;
                    } else {
                        this.payload_ = SAEditResponse.newBuilder((SAEditResponse) this.payload_).mergeFrom(sAEditResponse).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 13) {
                    singleFieldBuilder.mergeFrom(sAEditResponse);
                } else {
                    singleFieldBuilder.setMessage(sAEditResponse);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeInfoList(SAWatchFaceInfo.List list) {
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SAWatchFaceInfo.List.getDefaultInstance()) {
                        this.payload_ = list;
                    } else {
                        this.payload_ = SAWatchFaceInfo.List.newBuilder((SAWatchFaceInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(list);
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeInstallResult(SAInstallResult sAInstallResult) {
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SAInstallResult.getDefaultInstance()) {
                        this.payload_ = sAInstallResult;
                    } else {
                        this.payload_ = SAInstallResult.newBuilder((SAInstallResult) this.payload_).mergeFrom(sAInstallResult).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sAInstallResult);
                } else {
                    singleFieldBuilder.setMessage(sAInstallResult);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergePrepareInfo(SAPrepareInfo sAPrepareInfo) {
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder = this.prepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SAPrepareInfo.getDefaultInstance()) {
                        this.payload_ = sAPrepareInfo;
                    } else {
                        this.payload_ = SAPrepareInfo.newBuilder((SAPrepareInfo) this.payload_).mergeFrom(sAPrepareInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sAPrepareInfo);
                } else {
                    singleFieldBuilder.setMessage(sAPrepareInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergePrepareReply(SAPrepareReply sAPrepareReply) {
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder = this.prepareReplyBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 9 || this.payload_ == SAPrepareReply.getDefaultInstance()) {
                        this.payload_ = sAPrepareReply;
                    } else {
                        this.payload_ = SAPrepareReply.newBuilder((SAPrepareReply) this.payload_).mergeFrom(sAPrepareReply).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 9) {
                    singleFieldBuilder.mergeFrom(sAPrepareReply);
                } else {
                    singleFieldBuilder.setMessage(sAPrepareReply);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder mergeSupportDataList(SAWatchFaceSlot.List list) {
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder = this.supportDataListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 11 || this.payload_ == SAWatchFaceSlot.List.getDefaultInstance()) {
                        this.payload_ = list;
                    } else {
                        this.payload_ = SAWatchFaceSlot.List.newBuilder((SAWatchFaceSlot.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 11) {
                    singleFieldBuilder.mergeFrom(list);
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeWatchFaceList(SAWatchFaceItem.List list) {
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SAWatchFaceItem.List.getDefaultInstance()) {
                        this.payload_ = list;
                    } else {
                        this.payload_ = SAWatchFaceItem.List.newBuilder((SAWatchFaceItem.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(list);
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setBgImageResult(SABgImageResult sABgImageResult) {
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder = this.bgImageResultBuilder_;
                if (singleFieldBuilder == null) {
                    sABgImageResult.getClass();
                    this.payload_ = sABgImageResult;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sABgImageResult);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setChangeWatchFaceInfo(SAChange_Watch_Face_Info sAChange_Watch_Face_Info) {
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder = this.changeWatchFaceInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sAChange_Watch_Face_Info.getClass();
                    this.payload_ = sAChange_Watch_Face_Info;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAChange_Watch_Face_Info);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setEditRequest(SAEditRequest sAEditRequest) {
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder = this.editRequestBuilder_;
                if (singleFieldBuilder == null) {
                    sAEditRequest.getClass();
                    this.payload_ = sAEditRequest;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAEditRequest);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setEditResponse(SAEditResponse sAEditResponse) {
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder = this.editResponseBuilder_;
                if (singleFieldBuilder == null) {
                    sAEditResponse.getClass();
                    this.payload_ = sAEditResponse;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAEditResponse);
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

            public Builder setInfoList(SAWatchFaceInfo.List list) {
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setInstallResult(SAInstallResult sAInstallResult) {
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    sAInstallResult.getClass();
                    this.payload_ = sAInstallResult;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAInstallResult);
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

            public Builder setPrepareInfo(SAPrepareInfo sAPrepareInfo) {
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder = this.prepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sAPrepareInfo.getClass();
                    this.payload_ = sAPrepareInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAPrepareInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setPrepareReply(SAPrepareReply sAPrepareReply) {
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder = this.prepareReplyBuilder_;
                if (singleFieldBuilder == null) {
                    sAPrepareReply.getClass();
                    this.payload_ = sAPrepareReply;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAPrepareReply);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setPrepareStatus(CommonProtos.SEPrepareStatus sEPrepareStatus) {
                sEPrepareStatus.getClass();
                this.payloadCase_ = 5;
                this.payload_ = Integer.valueOf(sEPrepareStatus.getNumber());
                onChanged();
                return this;
            }

            public Builder setSuccess(boolean z6) {
                this.payloadCase_ = 4;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setSupportDataList(SAWatchFaceSlot.List list) {
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder = this.supportDataListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setWatchFaceList(SAWatchFaceItem.List list) {
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 1;
                return this;
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFace build() {
                SAWatchFace sAWatchFaceBuildPartial = buildPartial();
                if (sAWatchFaceBuildPartial.isInitialized()) {
                    return sAWatchFaceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWatchFaceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFace buildPartial() {
                SAWatchFace sAWatchFace = new SAWatchFace(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWatchFace);
                }
                buildPartialOneofs(sAWatchFace);
                onBuilt();
                return sAWatchFace;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWatchFace getDefaultInstanceForType() {
                return SAWatchFace.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder2 = this.prepareInfoBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder3 = this.installResultBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder4 = this.infoListBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder5 = this.prepareReplyBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder6 = this.supportDataListBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder7 = this.editRequestBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder8 = this.editResponseBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder9 = this.bgImageResultBuilder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder10 = this.changeWatchFaceInfoBuilder_;
                if (singleFieldBuilder10 != null) {
                    singleFieldBuilder10.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWatchFace) {
                    return mergeFrom((SAWatchFace) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBgImageResult(SABgImageResult.Builder builder) {
                SingleFieldBuilder<SABgImageResult, SABgImageResult.Builder, SABgImageResultOrBuilder> singleFieldBuilder = this.bgImageResultBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setChangeWatchFaceInfo(SAChange_Watch_Face_Info.Builder builder) {
                SingleFieldBuilder<SAChange_Watch_Face_Info, SAChange_Watch_Face_Info.Builder, SAChange_Watch_Face_InfoOrBuilder> singleFieldBuilder = this.changeWatchFaceInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setEditRequest(SAEditRequest.Builder builder) {
                SingleFieldBuilder<SAEditRequest, SAEditRequest.Builder, SAEditRequestOrBuilder> singleFieldBuilder = this.editRequestBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setEditResponse(SAEditResponse.Builder builder) {
                SingleFieldBuilder<SAEditResponse, SAEditResponse.Builder, SAEditResponseOrBuilder> singleFieldBuilder = this.editResponseBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setInfoList(SAWatchFaceInfo.List.Builder builder) {
                SingleFieldBuilder<SAWatchFaceInfo.List, SAWatchFaceInfo.List.Builder, SAWatchFaceInfo.ListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setInstallResult(SAInstallResult.Builder builder) {
                SingleFieldBuilder<SAInstallResult, SAInstallResult.Builder, SAInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setPrepareInfo(SAPrepareInfo.Builder builder) {
                SingleFieldBuilder<SAPrepareInfo, SAPrepareInfo.Builder, SAPrepareInfoOrBuilder> singleFieldBuilder = this.prepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setPrepareReply(SAPrepareReply.Builder builder) {
                SingleFieldBuilder<SAPrepareReply, SAPrepareReply.Builder, SAPrepareReplyOrBuilder> singleFieldBuilder = this.prepareReplyBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setSupportDataList(SAWatchFaceSlot.List.Builder builder) {
                SingleFieldBuilder<SAWatchFaceSlot.List, SAWatchFaceSlot.List.Builder, SAWatchFaceSlot.ListOrBuilder> singleFieldBuilder = this.supportDataListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setWatchFaceList(SAWatchFaceItem.List.Builder builder) {
                SingleFieldBuilder<SAWatchFaceItem.List, SAWatchFaceItem.List.Builder, SAWatchFaceItem.ListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeFrom(SAWatchFace sAWatchFace) {
                if (sAWatchFace == SAWatchFace.getDefaultInstance()) {
                    return this;
                }
                switch (sAWatchFace.getPayloadCase()) {
                    case WATCH_FACE_LIST:
                        mergeWatchFaceList(sAWatchFace.getWatchFaceList());
                        break;
                    case ID:
                        this.payloadCase_ = 2;
                        this.payload_ = sAWatchFace.payload_;
                        onChanged();
                        break;
                    case PATH:
                        this.payloadCase_ = 3;
                        this.payload_ = sAWatchFace.payload_;
                        onChanged();
                        break;
                    case SUCCESS:
                        setSuccess(sAWatchFace.getSuccess());
                        break;
                    case PREPARE_STATUS:
                        setPrepareStatus(sAWatchFace.getPrepareStatus());
                        break;
                    case PREPARE_INFO:
                        mergePrepareInfo(sAWatchFace.getPrepareInfo());
                        break;
                    case INSTALL_RESULT:
                        mergeInstallResult(sAWatchFace.getInstallResult());
                        break;
                    case INFO_LIST:
                        mergeInfoList(sAWatchFace.getInfoList());
                        break;
                    case PREPARE_REPLY:
                        mergePrepareReply(sAWatchFace.getPrepareReply());
                        break;
                    case SUPPORT_DATA_LIST:
                        mergeSupportDataList(sAWatchFace.getSupportDataList());
                        break;
                    case EDIT_REQUEST:
                        mergeEditRequest(sAWatchFace.getEditRequest());
                        break;
                    case EDIT_RESPONSE:
                        mergeEditResponse(sAWatchFace.getEditResponse());
                        break;
                    case BG_IMAGE_RESULT:
                        mergeBgImageResult(sAWatchFace.getBgImageResult());
                        break;
                    case CHANGE_WATCH_FACE_INFO:
                        mergeChangeWatchFaceInfo(sAWatchFace.getChangeWatchFaceInfo());
                        break;
                }
                mergeUnknownFields(sAWatchFace.getUnknownFields());
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
                                case 10:
                                    codedInputStream.readMessage(internalGetWatchFaceListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                    break;
                                case 18:
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.payloadCase_ = 2;
                                    this.payload_ = bytes;
                                    break;
                                case 26:
                                    ByteString bytes2 = codedInputStream.readBytes();
                                    this.payloadCase_ = 3;
                                    this.payload_ = bytes2;
                                    break;
                                case 32:
                                    this.payload_ = Boolean.valueOf(codedInputStream.readBool());
                                    this.payloadCase_ = 4;
                                    break;
                                case 40:
                                    int i7 = codedInputStream.readEnum();
                                    if (CommonProtos.SEPrepareStatus.forNumber(i7) == null) {
                                        mergeUnknownVarintField(5, i7);
                                    } else {
                                        this.payloadCase_ = 5;
                                        this.payload_ = Integer.valueOf(i7);
                                    }
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetPrepareInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetInstallResultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                    break;
                                case 66:
                                    codedInputStream.readMessage(internalGetInfoListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(internalGetPrepareReplyFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 9;
                                    break;
                                case 90:
                                    codedInputStream.readMessage(internalGetSupportDataListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 11;
                                    break;
                                case 98:
                                    codedInputStream.readMessage(internalGetEditRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 12;
                                    break;
                                case 106:
                                    codedInputStream.readMessage(internalGetEditResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 13;
                                    break;
                                case 114:
                                    codedInputStream.readMessage(internalGetBgImageResultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 14;
                                    break;
                                case 122:
                                    codedInputStream.readMessage(internalGetChangeWatchFaceInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 15;
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

        private SAWatchFace(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWatchFace sAWatchFace) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWatchFace);
        }

        public static SAWatchFace parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWatchFace parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFace) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFace parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWatchFace getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAWatchFace parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SAWatchFace() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SAWatchFace parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAWatchFace parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWatchFace parseFrom(InputStream inputStream) {
            return (SAWatchFace) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWatchFace parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFace) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFace parseFrom(CodedInputStream codedInputStream) {
            return (SAWatchFace) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWatchFace parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFace) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SAWatchFaceImage extends GeneratedMessage implements SAWatchFaceImageOrBuilder {
        private static final SAWatchFaceImage DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAWatchFaceImage> PARSER;
        public static final int SIZE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int size_;

        public static final class Group extends GeneratedMessage implements GroupOrBuilder {
            public static final int BG_IMAGE_FIELD_NUMBER = 3;
            public static final int CONTENT_POS_INDEX_FIELD_NUMBER = 2;
            private static final Group DEFAULT_INSTANCE;
            public static final int FG_IMAGE_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            private static final Parser<Group> PARSER;
            private static final long serialVersionUID = 0;
            private SAWatchFaceImage bgImage_;
            private int bitField0_;
            private int contentPosIndex_;
            private SAWatchFaceImage fgImage_;
            private volatile Object id_;
            private byte memoizedIsInitialized;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Group");
                DEFAULT_INSTANCE = new Group();
                PARSER = new AbstractParser<Group>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.Group.1
                    @Override // com.google.protobuf.Parser
                    public Group parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = Group.newBuilder();
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

            public static Group getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_Group_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Group parseDelimitedFrom(InputStream inputStream) {
                return (Group) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Group parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<Group> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Group)) {
                    return super.equals(obj);
                }
                Group group = (Group) obj;
                if (hasId() != group.hasId()) {
                    return false;
                }
                if ((hasId() && !getId().equals(group.getId())) || hasContentPosIndex() != group.hasContentPosIndex()) {
                    return false;
                }
                if ((hasContentPosIndex() && getContentPosIndex() != group.getContentPosIndex()) || hasBgImage() != group.hasBgImage()) {
                    return false;
                }
                if ((!hasBgImage() || getBgImage().equals(group.getBgImage())) && hasFgImage() == group.hasFgImage()) {
                    return (!hasFgImage() || getFgImage().equals(group.getFgImage())) && getUnknownFields().equals(group.getUnknownFields());
                }
                return false;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public SAWatchFaceImage getBgImage() {
                SAWatchFaceImage sAWatchFaceImage = this.bgImage_;
                return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public SAWatchFaceImageOrBuilder getBgImageOrBuilder() {
                SAWatchFaceImage sAWatchFaceImage = this.bgImage_;
                return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public int getContentPosIndex() {
                return this.contentPosIndex_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_Group_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public SAWatchFaceImage getFgImage() {
                SAWatchFaceImage sAWatchFaceImage = this.fgImage_;
                return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public SAWatchFaceImageOrBuilder getFgImageOrBuilder() {
                SAWatchFaceImage sAWatchFaceImage = this.fgImage_;
                return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
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
            public Parser<Group> getParserForType() {
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
                    iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.contentPosIndex_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(3, getBgImage());
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(4, getFgImage());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public boolean hasBgImage() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public boolean hasContentPosIndex() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
            public boolean hasFgImage() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
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
                if (hasContentPosIndex()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getContentPosIndex();
                }
                if (hasBgImage()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getBgImage().hashCode();
                }
                if (hasFgImage()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getFgImage().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_Group_fieldAccessorTable.ensureFieldAccessorsInitialized(Group.class, Builder.class);
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
                if (!hasContentPosIndex()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasBgImage()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!getBgImage().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasFgImage() || getFgImage().isInitialized()) {
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
                    codedOutputStream.writeUInt32(2, this.contentPosIndex_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeMessage(3, getBgImage());
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeMessage(4, getFgImage());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements GroupOrBuilder {
                private SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> bgImageBuilder_;
                private SAWatchFaceImage bgImage_;
                private int bitField0_;
                private int contentPosIndex_;
                private SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> fgImageBuilder_;
                private SAWatchFaceImage fgImage_;
                private Object id_;

                private void buildPartial0(Group group) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        group.id_ = this.id_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        group.contentPosIndex_ = this.contentPosIndex_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                        group.bgImage_ = singleFieldBuilder == null ? this.bgImage_ : (SAWatchFaceImage) singleFieldBuilder.build();
                        i7 |= 4;
                    }
                    if ((i8 & 8) != 0) {
                        SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder2 = this.fgImageBuilder_;
                        group.fgImage_ = singleFieldBuilder2 == null ? this.fgImage_ : (SAWatchFaceImage) singleFieldBuilder2.build();
                        i7 |= 8;
                    }
                    group.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_Group_descriptor;
                }

                private SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> internalGetBgImageFieldBuilder() {
                    if (this.bgImageBuilder_ == null) {
                        this.bgImageBuilder_ = new SingleFieldBuilder<>(getBgImage(), getParentForChildren(), isClean());
                        this.bgImage_ = null;
                    }
                    return this.bgImageBuilder_;
                }

                private SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> internalGetFgImageFieldBuilder() {
                    if (this.fgImageBuilder_ == null) {
                        this.fgImageBuilder_ = new SingleFieldBuilder<>(getFgImage(), getParentForChildren(), isClean());
                        this.fgImage_ = null;
                    }
                    return this.fgImageBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        internalGetBgImageFieldBuilder();
                        internalGetFgImageFieldBuilder();
                    }
                }

                public Builder clearBgImage() {
                    this.bitField0_ &= -5;
                    this.bgImage_ = null;
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.bgImageBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearContentPosIndex() {
                    this.bitField0_ &= -3;
                    this.contentPosIndex_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearFgImage() {
                    this.bitField0_ &= -9;
                    this.fgImage_ = null;
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.fgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.fgImageBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Group.getDefaultInstance().getId();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public SAWatchFaceImage getBgImage() {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        return (SAWatchFaceImage) singleFieldBuilder.getMessage();
                    }
                    SAWatchFaceImage sAWatchFaceImage = this.bgImage_;
                    return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
                }

                public Builder getBgImageBuilder() {
                    this.bitField0_ |= 4;
                    onChanged();
                    return (Builder) internalGetBgImageFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public SAWatchFaceImageOrBuilder getBgImageOrBuilder() {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        return (SAWatchFaceImageOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    SAWatchFaceImage sAWatchFaceImage = this.bgImage_;
                    return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public int getContentPosIndex() {
                    return this.contentPosIndex_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_Group_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public SAWatchFaceImage getFgImage() {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.fgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        return (SAWatchFaceImage) singleFieldBuilder.getMessage();
                    }
                    SAWatchFaceImage sAWatchFaceImage = this.fgImage_;
                    return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
                }

                public Builder getFgImageBuilder() {
                    this.bitField0_ |= 8;
                    onChanged();
                    return (Builder) internalGetFgImageFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public SAWatchFaceImageOrBuilder getFgImageOrBuilder() {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.fgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        return (SAWatchFaceImageOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    SAWatchFaceImage sAWatchFaceImage = this.fgImage_;
                    return sAWatchFaceImage == null ? SAWatchFaceImage.getDefaultInstance() : sAWatchFaceImage;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
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

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public boolean hasBgImage() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public boolean hasContentPosIndex() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public boolean hasFgImage() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupOrBuilder
                public boolean hasId() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_Group_fieldAccessorTable.ensureFieldAccessorsInitialized(Group.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (hasId() && hasContentPosIndex() && hasBgImage() && getBgImage().isInitialized()) {
                        return !hasFgImage() || getFgImage().isInitialized();
                    }
                    return false;
                }

                public Builder mergeBgImage(SAWatchFaceImage sAWatchFaceImage) {
                    SAWatchFaceImage sAWatchFaceImage2;
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sAWatchFaceImage);
                    } else if ((this.bitField0_ & 4) == 0 || (sAWatchFaceImage2 = this.bgImage_) == null || sAWatchFaceImage2 == SAWatchFaceImage.getDefaultInstance()) {
                        this.bgImage_ = sAWatchFaceImage;
                    } else {
                        getBgImageBuilder().mergeFrom(sAWatchFaceImage);
                    }
                    if (this.bgImage_ != null) {
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    return this;
                }

                public Builder mergeFgImage(SAWatchFaceImage sAWatchFaceImage) {
                    SAWatchFaceImage sAWatchFaceImage2;
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.fgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sAWatchFaceImage);
                    } else if ((this.bitField0_ & 8) == 0 || (sAWatchFaceImage2 = this.fgImage_) == null || sAWatchFaceImage2 == SAWatchFaceImage.getDefaultInstance()) {
                        this.fgImage_ = sAWatchFaceImage;
                    } else {
                        getFgImageBuilder().mergeFrom(sAWatchFaceImage);
                    }
                    if (this.fgImage_ != null) {
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    return this;
                }

                public Builder setBgImage(SAWatchFaceImage sAWatchFaceImage) {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                    if (singleFieldBuilder == null) {
                        sAWatchFaceImage.getClass();
                        this.bgImage_ = sAWatchFaceImage;
                    } else {
                        singleFieldBuilder.setMessage(sAWatchFaceImage);
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setContentPosIndex(int i7) {
                    this.contentPosIndex_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setFgImage(SAWatchFaceImage sAWatchFaceImage) {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.fgImageBuilder_;
                    if (singleFieldBuilder == null) {
                        sAWatchFaceImage.getClass();
                        this.fgImage_ = sAWatchFaceImage;
                    } else {
                        singleFieldBuilder.setMessage(sAWatchFaceImage);
                    }
                    this.bitField0_ |= 8;
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
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Group build() {
                    Group groupBuildPartial = buildPartial();
                    if (groupBuildPartial.isInitialized()) {
                        return groupBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Group buildPartial() {
                    Group group = new Group(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(group);
                    }
                    onBuilt();
                    return group;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Group getDefaultInstanceForType() {
                    return Group.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.id_ = "";
                    this.contentPosIndex_ = 0;
                    this.bgImage_ = null;
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.bgImageBuilder_ = null;
                    }
                    this.fgImage_ = null;
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder2 = this.fgImageBuilder_;
                    if (singleFieldBuilder2 != null) {
                        singleFieldBuilder2.dispose();
                        this.fgImageBuilder_ = null;
                    }
                    return this;
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.id_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Group) {
                        return mergeFrom((Group) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setBgImage(Builder builder) {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.bgImageBuilder_;
                    if (singleFieldBuilder == null) {
                        this.bgImage_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setFgImage(Builder builder) {
                    SingleFieldBuilder<SAWatchFaceImage, Builder, SAWatchFaceImageOrBuilder> singleFieldBuilder = this.fgImageBuilder_;
                    if (singleFieldBuilder == null) {
                        this.fgImage_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(Group group) {
                    if (group == Group.getDefaultInstance()) {
                        return this;
                    }
                    if (group.hasId()) {
                        this.id_ = group.id_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (group.hasContentPosIndex()) {
                        setContentPosIndex(group.getContentPosIndex());
                    }
                    if (group.hasBgImage()) {
                        mergeBgImage(group.getBgImage());
                    }
                    if (group.hasFgImage()) {
                        mergeFgImage(group.getFgImage());
                    }
                    mergeUnknownFields(group.getUnknownFields());
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
                                        this.contentPosIndex_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 26) {
                                        codedInputStream.readMessage(internalGetBgImageFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 4;
                                    } else if (tag != 34) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        codedInputStream.readMessage(internalGetFgImageFieldBuilder().getBuilder(), extensionRegistryLite);
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

            private Group(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.id_ = "";
                this.contentPosIndex_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Group group) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(group);
            }

            public static Group parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Group parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Group) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Group parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Group getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Group parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Group parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            private Group() {
                this.id_ = "";
                this.contentPosIndex_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
            }

            public static Group parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Group parseFrom(InputStream inputStream) {
                return (Group) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static Group parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Group) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Group parseFrom(CodedInputStream codedInputStream) {
                return (Group) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static Group parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Group) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class GroupList extends GeneratedMessage implements GroupListOrBuilder {
            private static final GroupList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<GroupList> PARSER;
            public static final int SUPPORT_MAX_COUNT_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private List<Group> list_;
            private byte memoizedIsInitialized;
            private int supportMaxCount_;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "GroupList");
                DEFAULT_INSTANCE = new GroupList();
                PARSER = new AbstractParser<GroupList>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupList.1
                    @Override // com.google.protobuf.Parser
                    public GroupList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = GroupList.newBuilder();
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

            public static GroupList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_GroupList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GroupList parseDelimitedFrom(InputStream inputStream) {
                return (GroupList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static GroupList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<GroupList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GroupList)) {
                    return super.equals(obj);
                }
                GroupList groupList = (GroupList) obj;
                if (getListList().equals(groupList.getListList()) && hasSupportMaxCount() == groupList.hasSupportMaxCount()) {
                    return (!hasSupportMaxCount() || getSupportMaxCount() == groupList.getSupportMaxCount()) && getUnknownFields().equals(groupList.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_GroupList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
            public Group getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
            public List<Group> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
            public GroupOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
            public List<? extends GroupOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<GroupList> getParserForType() {
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
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.supportMaxCount_);
                }
                int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
            public int getSupportMaxCount() {
                return this.supportMaxCount_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
            public boolean hasSupportMaxCount() {
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
                if (hasSupportMaxCount()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSupportMaxCount();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_GroupList_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupList.class, Builder.class);
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
                    codedOutputStream.writeUInt32(2, this.supportMaxCount_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements GroupListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> listBuilder_;
                private List<Group> list_;
                private int supportMaxCount_;

                private void buildPartial0(GroupList groupList) {
                    int i7;
                    if ((this.bitField0_ & 2) != 0) {
                        groupList.supportMaxCount_ = this.supportMaxCount_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    groupList.bitField0_ = i7 | groupList.bitField0_;
                }

                private void buildPartialRepeatedFields(GroupList groupList) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        groupList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    groupList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_GroupList_descriptor;
                }

                private RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends Group> iterable) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(Group group) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(group);
                        return this;
                    }
                    group.getClass();
                    ensureListIsMutable();
                    this.list_.add(group);
                    onChanged();
                    return this;
                }

                public Group.Builder addListBuilder() {
                    return (Group.Builder) internalGetListFieldBuilder().addBuilder(Group.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSupportMaxCount() {
                    this.bitField0_ &= -3;
                    this.supportMaxCount_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_GroupList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
                public Group getList(int i7) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (Group) repeatedFieldBuilder.getMessage(i7);
                }

                public Group.Builder getListBuilder(int i7) {
                    return (Group.Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Group.Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
                public List<Group> getListList() {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
                public GroupOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (GroupOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
                public List<? extends GroupOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
                public int getSupportMaxCount() {
                    return this.supportMaxCount_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.GroupListOrBuilder
                public boolean hasSupportMaxCount() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_GroupList_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupList.class, Builder.class);
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
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, Group group) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, group);
                        return this;
                    }
                    group.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, group);
                    onChanged();
                    return this;
                }

                public Builder setSupportMaxCount(int i7) {
                    this.supportMaxCount_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public GroupList build() {
                    GroupList groupListBuildPartial = buildPartial();
                    if (groupListBuildPartial.isInitialized()) {
                        return groupListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public GroupList buildPartial() {
                    GroupList groupList = new GroupList(this);
                    buildPartialRepeatedFields(groupList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(groupList);
                    }
                    onBuilt();
                    return groupList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public GroupList getDefaultInstanceForType() {
                    return GroupList.getDefaultInstance();
                }

                public Group.Builder addListBuilder(int i7) {
                    return (Group.Builder) internalGetListFieldBuilder().addBuilder(i7, Group.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    this.supportMaxCount_ = 0;
                    return this;
                }

                public Builder addList(int i7, Group group) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        group.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, group);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, group);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof GroupList) {
                        return mergeFrom((GroupList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Group.Builder builder) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(GroupList groupList) {
                    if (groupList == GroupList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!groupList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = groupList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(groupList.list_);
                            }
                            onChanged();
                        }
                    } else if (!groupList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = groupList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(groupList.list_);
                        }
                    }
                    if (groupList.hasSupportMaxCount()) {
                        setSupportMaxCount(groupList.getSupportMaxCount());
                    }
                    mergeUnknownFields(groupList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Group.Builder builder) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Group.Builder builder) {
                    RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        Group group = (Group) codedInputStream.readMessage(Group.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<Group, Group.Builder, GroupOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(group);
                                        } else {
                                            repeatedFieldBuilder.addMessage(group);
                                        }
                                    } else if (tag != 16) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.supportMaxCount_ = codedInputStream.readUInt32();
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

            private GroupList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.supportMaxCount_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(GroupList groupList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(groupList);
            }

            public static GroupList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static GroupList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GroupList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static GroupList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GroupList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static GroupList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private GroupList() {
                this.supportMaxCount_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static GroupList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static GroupList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static GroupList parseFrom(InputStream inputStream) {
                return (GroupList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static GroupList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GroupList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static GroupList parseFrom(CodedInputStream codedInputStream) {
                return (GroupList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static GroupList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GroupList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface GroupListOrBuilder extends MessageOrBuilder {
            Group getList(int i7);

            int getListCount();

            List<Group> getListList();

            GroupOrBuilder getListOrBuilder(int i7);

            List<? extends GroupOrBuilder> getListOrBuilderList();

            int getSupportMaxCount();

            boolean hasSupportMaxCount();
        }

        public interface GroupOrBuilder extends MessageOrBuilder {
            SAWatchFaceImage getBgImage();

            SAWatchFaceImageOrBuilder getBgImageOrBuilder();

            int getContentPosIndex();

            SAWatchFaceImage getFgImage();

            SAWatchFaceImageOrBuilder getFgImageOrBuilder();

            String getId();

            ByteString getIdBytes();

            boolean hasBgImage();

            boolean hasContentPosIndex();

            boolean hasFgImage();

            boolean hasId();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWatchFaceImage");
            DEFAULT_INSTANCE = new SAWatchFaceImage();
            PARSER = new AbstractParser<SAWatchFaceImage>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImage.1
                @Override // com.google.protobuf.Parser
                public SAWatchFaceImage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWatchFaceImage.newBuilder();
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

        public static SAWatchFaceImage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWatchFaceImage parseDelimitedFrom(InputStream inputStream) {
            return (SAWatchFaceImage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceImage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWatchFaceImage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWatchFaceImage)) {
                return super.equals(obj);
            }
            SAWatchFaceImage sAWatchFaceImage = (SAWatchFaceImage) obj;
            if (hasId() != sAWatchFaceImage.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(sAWatchFaceImage.getId())) && hasSize() == sAWatchFaceImage.hasSize()) {
                return (!hasSize() || getSize() == sAWatchFaceImage.getSize()) && getUnknownFields().equals(sAWatchFaceImage.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
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
        public Parser<SAWatchFaceImage> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.size_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
        public boolean hasSize() {
            return (this.bitField0_ & 2) != 0;
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
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceImage.class, Builder.class);
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
            if (hasId()) {
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
                codedOutputStream.writeUInt32(2, this.size_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWatchFaceImageOrBuilder {
            private int bitField0_;
            private Object id_;
            private int size_;

            private void buildPartial0(SAWatchFaceImage sAWatchFaceImage) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAWatchFaceImage.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAWatchFaceImage.size_ = this.size_;
                    i7 |= 2;
                }
                sAWatchFaceImage.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_descriptor;
            }

            public Builder clearId() {
                this.id_ = SAWatchFaceImage.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceImageOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceImage_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceImage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId();
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

            public Builder setSize(int i7) {
                this.size_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceImage build() {
                SAWatchFaceImage sAWatchFaceImageBuildPartial = buildPartial();
                if (sAWatchFaceImageBuildPartial.isInitialized()) {
                    return sAWatchFaceImageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWatchFaceImageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceImage buildPartial() {
                SAWatchFaceImage sAWatchFaceImage = new SAWatchFaceImage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWatchFaceImage);
                }
                onBuilt();
                return sAWatchFaceImage;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWatchFaceImage getDefaultInstanceForType() {
                return SAWatchFaceImage.getDefaultInstance();
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
                this.size_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWatchFaceImage) {
                    return mergeFrom((SAWatchFaceImage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAWatchFaceImage sAWatchFaceImage) {
                if (sAWatchFaceImage == SAWatchFaceImage.getDefaultInstance()) {
                    return this;
                }
                if (sAWatchFaceImage.hasId()) {
                    this.id_ = sAWatchFaceImage.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAWatchFaceImage.hasSize()) {
                    setSize(sAWatchFaceImage.getSize());
                }
                mergeUnknownFields(sAWatchFaceImage.getUnknownFields());
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
                                    this.size_ = codedInputStream.readUInt32();
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

        private SAWatchFaceImage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWatchFaceImage sAWatchFaceImage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWatchFaceImage);
        }

        public static SAWatchFaceImage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWatchFaceImage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceImage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceImage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWatchFaceImage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAWatchFaceImage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAWatchFaceImage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SAWatchFaceImage() {
            this.id_ = "";
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static SAWatchFaceImage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWatchFaceImage parseFrom(InputStream inputStream) {
            return (SAWatchFaceImage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceImage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceImage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceImage parseFrom(CodedInputStream codedInputStream) {
            return (SAWatchFaceImage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWatchFaceImage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceImage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAWatchFaceImageOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        int getSize();

        boolean hasId();

        boolean hasSize();
    }

    public static final class SAWatchFaceInfo extends GeneratedMessage implements SAWatchFaceInfoOrBuilder {
        private static final SAWatchFaceInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAWatchFaceInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final long serialVersionUID = 0;
            private java.util.List<SAWatchFaceInfo> list_;
            private byte memoizedIsInitialized;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                DEFAULT_INSTANCE = new List();
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.List.1
                    @Override // com.google.protobuf.Parser
                    public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = List.newBuilder();
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

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_List_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static List parseDelimitedFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
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
                return getListList().equals(list.getListList()) && getUnknownFields().equals(list.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_List_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
            public SAWatchFaceInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
            public java.util.List<SAWatchFaceInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
            public SAWatchFaceInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
            public java.util.List<? extends SAWatchFaceInfoOrBuilder> getListOrBuilderList() {
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
                int size = this.list_.size();
                int iComputeMessageSizeNoTag = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    iComputeMessageSizeNoTag += CodedOutputStream.computeMessageSizeNoTag(this.list_.get(i8));
                }
                int serializedSize = iComputeMessageSizeNoTag + size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
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
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> listBuilder_;
                private java.util.List<SAWatchFaceInfo> list_;

                private void buildPartial0(List list) {
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        list.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    list.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_List_descriptor;
                }

                private RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SAWatchFaceInfo> iterable) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SAWatchFaceInfo sAWatchFaceInfo) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sAWatchFaceInfo);
                        return this;
                    }
                    sAWatchFaceInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sAWatchFaceInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SAWatchFaceInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
                public SAWatchFaceInfo getList(int i7) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SAWatchFaceInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
                public java.util.List<SAWatchFaceInfo> getListList() {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
                public SAWatchFaceInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SAWatchFaceInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.ListOrBuilder
                public java.util.List<? extends SAWatchFaceInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SAWatchFaceInfo sAWatchFaceInfo) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sAWatchFaceInfo);
                        return this;
                    }
                    sAWatchFaceInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sAWatchFaceInfo);
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    buildPartialRepeatedFields(list);
                    if (this.bitField0_ != 0) {
                        buildPartial0(list);
                    }
                    onBuilt();
                    return list;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public List getDefaultInstanceForType() {
                    return List.getDefaultInstance();
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SAWatchFaceInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SAWatchFaceInfo sAWatchFaceInfo) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sAWatchFaceInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sAWatchFaceInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sAWatchFaceInfo);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof List) {
                        return mergeFrom((List) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
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
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(list.list_);
                        }
                    }
                    mergeUnknownFields(list.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                    if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        SAWatchFaceInfo sAWatchFaceInfo = (SAWatchFaceInfo) codedInputStream.readMessage(SAWatchFaceInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SAWatchFaceInfo, Builder, SAWatchFaceInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sAWatchFaceInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sAWatchFaceInfo);
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

            private List(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(List list) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(list);
            }

            public static List parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static List parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public List getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private List() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static List parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static List parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static List parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static List parseFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(CodedInputStream codedInputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static List parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ListOrBuilder extends MessageOrBuilder {
            SAWatchFaceInfo getList(int i7);

            int getListCount();

            java.util.List<SAWatchFaceInfo> getListList();

            SAWatchFaceInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SAWatchFaceInfoOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWatchFaceInfo");
            DEFAULT_INSTANCE = new SAWatchFaceInfo();
            PARSER = new AbstractParser<SAWatchFaceInfo>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfo.1
                @Override // com.google.protobuf.Parser
                public SAWatchFaceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWatchFaceInfo.newBuilder();
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

        public static SAWatchFaceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWatchFaceInfo parseDelimitedFrom(InputStream inputStream) {
            return (SAWatchFaceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWatchFaceInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWatchFaceInfo)) {
                return super.equals(obj);
            }
            SAWatchFaceInfo sAWatchFaceInfo = (SAWatchFaceInfo) obj;
            if (hasId() != sAWatchFaceInfo.hasId()) {
                return false;
            }
            return (!hasId() || getId().equals(sAWatchFaceInfo.getId())) && getUnknownFields().equals(sAWatchFaceInfo.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfoOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfoOrBuilder
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
        public Parser<SAWatchFaceInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = ((this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.id_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfoOrBuilder
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
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceInfo.class, Builder.class);
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
            if (hasId()) {
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWatchFaceInfoOrBuilder {
            private int bitField0_;
            private Object id_;

            private void buildPartial0(SAWatchFaceInfo sAWatchFaceInfo) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sAWatchFaceInfo.id_ = this.id_;
                } else {
                    i7 = 0;
                }
                sAWatchFaceInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_descriptor;
            }

            public Builder clearId() {
                this.id_ = SAWatchFaceInfo.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfoOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId();
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
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceInfo build() {
                SAWatchFaceInfo sAWatchFaceInfoBuildPartial = buildPartial();
                if (sAWatchFaceInfoBuildPartial.isInitialized()) {
                    return sAWatchFaceInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWatchFaceInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceInfo buildPartial() {
                SAWatchFaceInfo sAWatchFaceInfo = new SAWatchFaceInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWatchFaceInfo);
                }
                onBuilt();
                return sAWatchFaceInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWatchFaceInfo getDefaultInstanceForType() {
                return SAWatchFaceInfo.getDefaultInstance();
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
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWatchFaceInfo) {
                    return mergeFrom((SAWatchFaceInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAWatchFaceInfo sAWatchFaceInfo) {
                if (sAWatchFaceInfo == SAWatchFaceInfo.getDefaultInstance()) {
                    return this;
                }
                if (sAWatchFaceInfo.hasId()) {
                    this.id_ = sAWatchFaceInfo.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(sAWatchFaceInfo.getUnknownFields());
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
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
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

        private SAWatchFaceInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWatchFaceInfo sAWatchFaceInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWatchFaceInfo);
        }

        public static SAWatchFaceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWatchFaceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWatchFaceInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAWatchFaceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SAWatchFaceInfo() {
            this.id_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static SAWatchFaceInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAWatchFaceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWatchFaceInfo parseFrom(InputStream inputStream) {
            return (SAWatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceInfo parseFrom(CodedInputStream codedInputStream) {
            return (SAWatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWatchFaceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAWatchFaceInfoOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        boolean hasId();
    }

    public static final class SAWatchFaceItem extends GeneratedMessage implements SAWatchFaceItemOrBuilder {
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 7;
        public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 8;
        public static final int BACKGROUND_IMAGE_LIST_FIELD_NUMBER = 12;
        public static final int CAN_EDIT_FIELD_NUMBER = 6;
        public static final int CAN_REMOVE_FIELD_NUMBER = 4;
        public static final int DATA_LIST_FIELD_NUMBER = 10;
        private static final SAWatchFaceItem DEFAULT_INSTANCE;
        public static final int FOREGROUND_COLOR_FIELD_NUMBER = 14;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IMAGE_GROUP_LIST_FIELD_NUMBER = 17;
        public static final int IS_CURRENT_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int ON_TRIAL_FIELD_NUMBER = 18;
        private static final Parser<SAWatchFaceItem> PARSER;
        public static final int SLOT_ITEM_LIST_FIELD_NUMBER = 13;
        public static final int STYLE_COLOR_INDEX_FIELD_NUMBER = 15;
        public static final int STYLE_FIELD_NUMBER = 9;
        public static final int SUPPORT_IMAGE_FORMAT_FIELD_NUMBER = 11;
        public static final int SUPPORT_IMAGE_GROUP_FIELD_NUMBER = 16;
        public static final int VERSION_CODE_FIELD_NUMBER = 5;
        private static final Internal.IntListAdapter.IntConverter<SAWatchFaceSlot.Data> dataList_converter_;
        private static final long serialVersionUID = 0;
        private volatile Object backgroundColor_;
        private LazyStringArrayList backgroundImageList_;
        private volatile Object backgroundImage_;
        private int bitField0_;
        private boolean canEdit_;
        private boolean canRemove_;
        private Internal.IntList dataList_;
        private ByteString foregroundColor_;
        private volatile Object id_;
        private SAWatchFaceImage.GroupList imageGroupList_;
        private boolean isCurrent_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private boolean onTrial_;
        private java.util.List<SAWatchFaceSlot.Item> slotItemList_;
        private int styleColorIndex_;
        private volatile Object style_;
        private int supportImageFormat_;
        private boolean supportImageGroup_;
        private long versionCode_;

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWatchFaceItemOrBuilder {
            private Object backgroundColor_;
            private LazyStringArrayList backgroundImageList_;
            private Object backgroundImage_;
            private int bitField0_;
            private boolean canEdit_;
            private boolean canRemove_;
            private Internal.IntList dataList_;
            private ByteString foregroundColor_;
            private Object id_;
            private SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> imageGroupListBuilder_;
            private SAWatchFaceImage.GroupList imageGroupList_;
            private boolean isCurrent_;
            private Object name_;
            private boolean onTrial_;
            private RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> slotItemListBuilder_;
            private java.util.List<SAWatchFaceSlot.Item> slotItemList_;
            private int styleColorIndex_;
            private Object style_;
            private int supportImageFormat_;
            private boolean supportImageGroup_;
            private long versionCode_;

            private void buildPartial0(SAWatchFaceItem sAWatchFaceItem) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAWatchFaceItem.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAWatchFaceItem.name_ = this.name_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAWatchFaceItem.isCurrent_ = this.isCurrent_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAWatchFaceItem.canRemove_ = this.canRemove_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sAWatchFaceItem.versionCode_ = this.versionCode_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sAWatchFaceItem.canEdit_ = this.canEdit_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sAWatchFaceItem.backgroundColor_ = this.backgroundColor_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sAWatchFaceItem.foregroundColor_ = this.foregroundColor_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sAWatchFaceItem.supportImageFormat_ = this.supportImageFormat_;
                    i7 |= 256;
                }
                if ((i8 & 512) != 0) {
                    sAWatchFaceItem.backgroundImage_ = this.backgroundImage_;
                    i7 |= 512;
                }
                if ((i8 & 1024) != 0) {
                    this.backgroundImageList_.makeImmutable();
                    sAWatchFaceItem.backgroundImageList_ = this.backgroundImageList_;
                }
                if ((i8 & 2048) != 0) {
                    sAWatchFaceItem.supportImageGroup_ = this.supportImageGroup_;
                    i7 |= 1024;
                }
                if ((i8 & 4096) != 0) {
                    SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                    sAWatchFaceItem.imageGroupList_ = singleFieldBuilder == null ? this.imageGroupList_ : (SAWatchFaceImage.GroupList) singleFieldBuilder.build();
                    i7 |= 2048;
                }
                if ((i8 & 8192) != 0) {
                    this.dataList_.makeImmutable();
                    sAWatchFaceItem.dataList_ = this.dataList_;
                }
                if ((32768 & i8) != 0) {
                    sAWatchFaceItem.style_ = this.style_;
                    i7 |= 4096;
                }
                if ((65536 & i8) != 0) {
                    sAWatchFaceItem.styleColorIndex_ = this.styleColorIndex_;
                    i7 |= 8192;
                }
                if ((i8 & 131072) != 0) {
                    sAWatchFaceItem.onTrial_ = this.onTrial_;
                    i7 |= 16384;
                }
                sAWatchFaceItem.bitField0_ |= i7;
            }

            private void buildPartialRepeatedFields(SAWatchFaceItem sAWatchFaceItem) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    sAWatchFaceItem.slotItemList_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 16384) != 0) {
                    this.slotItemList_ = Collections.unmodifiableList(this.slotItemList_);
                    this.bitField0_ &= -16385;
                }
                sAWatchFaceItem.slotItemList_ = this.slotItemList_;
            }

            private void ensureBackgroundImageListIsMutable() {
                if (!this.backgroundImageList_.isModifiable()) {
                    this.backgroundImageList_ = new LazyStringArrayList((LazyStringList) this.backgroundImageList_);
                }
                this.bitField0_ |= 1024;
            }

            private void ensureDataListIsMutable() {
                if (!this.dataList_.isModifiable()) {
                    this.dataList_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.dataList_);
                }
                this.bitField0_ |= 8192;
            }

            private void ensureSlotItemListIsMutable() {
                if ((this.bitField0_ & 16384) == 0) {
                    this.slotItemList_ = new ArrayList(this.slotItemList_);
                    this.bitField0_ |= 16384;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_descriptor;
            }

            private SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> internalGetImageGroupListFieldBuilder() {
                if (this.imageGroupListBuilder_ == null) {
                    this.imageGroupListBuilder_ = new SingleFieldBuilder<>(getImageGroupList(), getParentForChildren(), isClean());
                    this.imageGroupList_ = null;
                }
                return this.imageGroupListBuilder_;
            }

            private RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> internalGetSlotItemListFieldBuilder() {
                if (this.slotItemListBuilder_ == null) {
                    this.slotItemListBuilder_ = new RepeatedFieldBuilder<>(this.slotItemList_, (this.bitField0_ & 16384) != 0, getParentForChildren(), isClean());
                    this.slotItemList_ = null;
                }
                return this.slotItemListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetImageGroupListFieldBuilder();
                    internalGetSlotItemListFieldBuilder();
                }
            }

            public Builder addAllBackgroundImageList(Iterable<String> iterable) {
                ensureBackgroundImageListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.backgroundImageList_);
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder addAllDataList(Iterable<? extends SAWatchFaceSlot.Data> iterable) {
                ensureDataListIsMutable();
                Iterator<? extends SAWatchFaceSlot.Data> it = iterable.iterator();
                while (it.hasNext()) {
                    this.dataList_.addInt(it.next().getNumber());
                }
                onChanged();
                return this;
            }

            public Builder addAllSlotItemList(Iterable<? extends SAWatchFaceSlot.Item> iterable) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.addAllMessages(iterable);
                    return this;
                }
                ensureSlotItemListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.slotItemList_);
                onChanged();
                return this;
            }

            public Builder addBackgroundImageList(String str) {
                str.getClass();
                ensureBackgroundImageListIsMutable();
                this.backgroundImageList_.add(str);
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder addBackgroundImageListBytes(ByteString byteString) {
                byteString.getClass();
                ensureBackgroundImageListIsMutable();
                this.backgroundImageList_.add(byteString);
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder addDataList(SAWatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.addInt(data.getNumber());
                onChanged();
                return this;
            }

            public Builder addSlotItemList(SAWatchFaceSlot.Item item) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.addMessage(item);
                    return this;
                }
                item.getClass();
                ensureSlotItemListIsMutable();
                this.slotItemList_.add(item);
                onChanged();
                return this;
            }

            public SAWatchFaceSlot.Item.Builder addSlotItemListBuilder() {
                return (SAWatchFaceSlot.Item.Builder) internalGetSlotItemListFieldBuilder().addBuilder(SAWatchFaceSlot.Item.getDefaultInstance());
            }

            public Builder clearBackgroundColor() {
                this.backgroundColor_ = SAWatchFaceItem.getDefaultInstance().getBackgroundColor();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearBackgroundImage() {
                this.backgroundImage_ = SAWatchFaceItem.getDefaultInstance().getBackgroundImage();
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public Builder clearBackgroundImageList() {
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -1025;
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
                this.dataList_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -8193;
                onChanged();
                return this;
            }

            public Builder clearForegroundColor() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.foregroundColor_ = SAWatchFaceItem.getDefaultInstance().getForegroundColor();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SAWatchFaceItem.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearImageGroupList() {
                this.bitField0_ &= -4097;
                this.imageGroupList_ = null;
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.imageGroupListBuilder_ = null;
                }
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
                this.name_ = SAWatchFaceItem.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearOnTrial() {
                this.bitField0_ &= -131073;
                this.onTrial_ = false;
                onChanged();
                return this;
            }

            public Builder clearSlotItemList() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.clear();
                    return this;
                }
                this.slotItemList_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -16385;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = SAWatchFaceItem.getDefaultInstance().getStyle();
                this.bitField0_ &= -32769;
                onChanged();
                return this;
            }

            public Builder clearStyleColorIndex() {
                this.bitField0_ &= -65537;
                this.styleColorIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSupportImageFormat() {
                this.bitField0_ &= -257;
                this.supportImageFormat_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSupportImageGroup() {
                this.bitField0_ &= -2049;
                this.supportImageGroup_ = false;
                onChanged();
                return this;
            }

            public Builder clearVersionCode() {
                this.bitField0_ &= -17;
                this.versionCode_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ByteString getBackgroundColorBytes() {
                Object obj = this.backgroundColor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundColor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ByteString getBackgroundImageBytes() {
                Object obj = this.backgroundImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundImage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public String getBackgroundImageList(int i7) {
                return this.backgroundImageList_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ByteString getBackgroundImageListBytes(int i7) {
                return this.backgroundImageList_.getByteString(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public int getBackgroundImageListCount() {
                return this.backgroundImageList_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean getCanEdit() {
                return this.canEdit_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean getCanRemove() {
                return this.canRemove_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public SAWatchFaceSlot.Data getDataList(int i7) {
                return (SAWatchFaceSlot.Data) SAWatchFaceItem.dataList_converter_.convert(this.dataList_.getInt(i7));
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public int getDataListCount() {
                return this.dataList_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public java.util.List<SAWatchFaceSlot.Data> getDataListList() {
                return new Internal.IntListAdapter(this.dataList_, SAWatchFaceItem.dataList_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ByteString getForegroundColor() {
                return this.foregroundColor_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public SAWatchFaceImage.GroupList getImageGroupList() {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWatchFaceImage.GroupList) singleFieldBuilder.getMessage();
                }
                SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
                return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
            }

            public SAWatchFaceImage.GroupList.Builder getImageGroupListBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (SAWatchFaceImage.GroupList.Builder) internalGetImageGroupListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public SAWatchFaceImage.GroupListOrBuilder getImageGroupListOrBuilder() {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWatchFaceImage.GroupListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
                return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean getIsCurrent() {
                return this.isCurrent_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean getOnTrial() {
                return this.onTrial_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public SAWatchFaceSlot.Item getSlotItemList(int i7) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? this.slotItemList_.get(i7) : (SAWatchFaceSlot.Item) repeatedFieldBuilder.getMessage(i7);
            }

            public SAWatchFaceSlot.Item.Builder getSlotItemListBuilder(int i7) {
                return (SAWatchFaceSlot.Item.Builder) internalGetSlotItemListFieldBuilder().getBuilder(i7);
            }

            public java.util.List<SAWatchFaceSlot.Item.Builder> getSlotItemListBuilderList() {
                return internalGetSlotItemListFieldBuilder().getBuilderList();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public int getSlotItemListCount() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? this.slotItemList_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public java.util.List<SAWatchFaceSlot.Item> getSlotItemListList() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.slotItemList_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public SAWatchFaceSlot.ItemOrBuilder getSlotItemListOrBuilder(int i7) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder == null ? this.slotItemList_.get(i7) : (SAWatchFaceSlot.ItemOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public java.util.List<? extends SAWatchFaceSlot.ItemOrBuilder> getSlotItemListOrBuilderList() {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.slotItemList_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public int getStyleColorIndex() {
                return this.styleColorIndex_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public CommonProtos.ImageFormat getSupportImageFormat() {
                CommonProtos.ImageFormat imageFormatForNumber = CommonProtos.ImageFormat.forNumber(this.supportImageFormat_);
                return imageFormatForNumber == null ? CommonProtos.ImageFormat.RGB_565 : imageFormatForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean getSupportImageGroup() {
                return this.supportImageGroup_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public long getVersionCode() {
                return this.versionCode_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasBackgroundColor() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasBackgroundImage() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasCanEdit() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasCanRemove() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasForegroundColor() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasImageGroupList() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasIsCurrent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasOnTrial() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasStyle() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasStyleColorIndex() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasSupportImageFormat() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasSupportImageGroup() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName() || !hasIsCurrent()) {
                    return false;
                }
                if (hasImageGroupList() && !getImageGroupList().isInitialized()) {
                    return false;
                }
                for (int i7 = 0; i7 < getSlotItemListCount(); i7++) {
                    if (!getSlotItemList(i7).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeImageGroupList(SAWatchFaceImage.GroupList groupList) {
                SAWatchFaceImage.GroupList groupList2;
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(groupList);
                } else if ((this.bitField0_ & 4096) == 0 || (groupList2 = this.imageGroupList_) == null || groupList2 == SAWatchFaceImage.GroupList.getDefaultInstance()) {
                    this.imageGroupList_ = groupList;
                } else {
                    getImageGroupListBuilder().mergeFrom(groupList);
                }
                if (this.imageGroupList_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder removeSlotItemList(int i7) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.remove(i7);
                    return this;
                }
                ensureSlotItemListIsMutable();
                this.slotItemList_.remove(i7);
                onChanged();
                return this;
            }

            public Builder setBackgroundColor(String str) {
                str.getClass();
                this.backgroundColor_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                byteString.getClass();
                this.backgroundColor_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setBackgroundImage(String str) {
                str.getClass();
                this.backgroundImage_ = str;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageBytes(ByteString byteString) {
                byteString.getClass();
                this.backgroundImage_ = byteString;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setBackgroundImageList(int i7, String str) {
                str.getClass();
                ensureBackgroundImageListIsMutable();
                this.backgroundImageList_.set(i7, str);
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setCanEdit(boolean z6) {
                this.canEdit_ = z6;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCanRemove(boolean z6) {
                this.canRemove_ = z6;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDataList(int i7, SAWatchFaceSlot.Data data) {
                data.getClass();
                ensureDataListIsMutable();
                this.dataList_.setInt(i7, data.getNumber());
                onChanged();
                return this;
            }

            public Builder setForegroundColor(ByteString byteString) {
                byteString.getClass();
                this.foregroundColor_ = byteString;
                this.bitField0_ |= 128;
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

            public Builder setImageGroupList(SAWatchFaceImage.GroupList groupList) {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder == null) {
                    groupList.getClass();
                    this.imageGroupList_ = groupList;
                } else {
                    singleFieldBuilder.setMessage(groupList);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setIsCurrent(boolean z6) {
                this.isCurrent_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOnTrial(boolean z6) {
                this.onTrial_ = z6;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setSlotItemList(int i7, SAWatchFaceSlot.Item item) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder != null) {
                    repeatedFieldBuilder.setMessage(i7, item);
                    return this;
                }
                item.getClass();
                ensureSlotItemListIsMutable();
                this.slotItemList_.set(i7, item);
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.style_ = str;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                this.style_ = byteString;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setStyleColorIndex(int i7) {
                this.styleColorIndex_ = i7;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setSupportImageFormat(CommonProtos.ImageFormat imageFormat) {
                imageFormat.getClass();
                this.bitField0_ |= 256;
                this.supportImageFormat_ = imageFormat.getNumber();
                onChanged();
                return this;
            }

            public Builder setSupportImageGroup(boolean z6) {
                this.supportImageGroup_ = z6;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setVersionCode(long j7) {
                this.versionCode_ = j7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
            public ProtocolStringList getBackgroundImageListList() {
                this.backgroundImageList_.makeImmutable();
                return this.backgroundImageList_;
            }

            private Builder() {
                this.id_ = "";
                this.name_ = "";
                this.backgroundColor_ = "";
                this.foregroundColor_ = ByteString.EMPTY;
                this.supportImageFormat_ = 0;
                this.backgroundImage_ = "";
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.dataList_ = GeneratedMessage.emptyIntList();
                this.slotItemList_ = Collections.EMPTY_LIST;
                this.style_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceItem build() {
                SAWatchFaceItem sAWatchFaceItemBuildPartial = buildPartial();
                if (sAWatchFaceItemBuildPartial.isInitialized()) {
                    return sAWatchFaceItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWatchFaceItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceItem buildPartial() {
                SAWatchFaceItem sAWatchFaceItem = new SAWatchFaceItem(this);
                buildPartialRepeatedFields(sAWatchFaceItem);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWatchFaceItem);
                }
                onBuilt();
                return sAWatchFaceItem;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWatchFaceItem getDefaultInstanceForType() {
                return SAWatchFaceItem.getDefaultInstance();
            }

            public SAWatchFaceSlot.Item.Builder addSlotItemListBuilder(int i7) {
                return (SAWatchFaceSlot.Item.Builder) internalGetSlotItemListFieldBuilder().addBuilder(i7, SAWatchFaceSlot.Item.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.name_ = "";
                this.isCurrent_ = false;
                this.canRemove_ = false;
                this.versionCode_ = 0L;
                this.canEdit_ = false;
                this.backgroundColor_ = "";
                this.foregroundColor_ = ByteString.EMPTY;
                this.supportImageFormat_ = 0;
                this.backgroundImage_ = "";
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.supportImageGroup_ = false;
                this.imageGroupList_ = null;
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.imageGroupListBuilder_ = null;
                }
                this.dataList_ = GeneratedMessage.emptyIntList();
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.slotItemList_ = Collections.EMPTY_LIST;
                } else {
                    this.slotItemList_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -16385;
                this.style_ = "";
                this.styleColorIndex_ = 0;
                this.onTrial_ = false;
                return this;
            }

            public Builder addSlotItemList(int i7, SAWatchFaceSlot.Item item) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    item.getClass();
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.add(i7, item);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilder.addMessage(i7, item);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWatchFaceItem) {
                    return mergeFrom((SAWatchFaceItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setImageGroupList(SAWatchFaceImage.GroupList.Builder builder) {
                SingleFieldBuilder<SAWatchFaceImage.GroupList, SAWatchFaceImage.GroupList.Builder, SAWatchFaceImage.GroupListOrBuilder> singleFieldBuilder = this.imageGroupListBuilder_;
                if (singleFieldBuilder == null) {
                    this.imageGroupList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setSlotItemList(int i7, SAWatchFaceSlot.Item.Builder builder) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.set(i7, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilder.setMessage(i7, builder.build());
                return this;
            }

            public Builder mergeFrom(SAWatchFaceItem sAWatchFaceItem) {
                if (sAWatchFaceItem == SAWatchFaceItem.getDefaultInstance()) {
                    return this;
                }
                if (sAWatchFaceItem.hasId()) {
                    this.id_ = sAWatchFaceItem.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAWatchFaceItem.hasName()) {
                    this.name_ = sAWatchFaceItem.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sAWatchFaceItem.hasIsCurrent()) {
                    setIsCurrent(sAWatchFaceItem.getIsCurrent());
                }
                if (sAWatchFaceItem.hasCanRemove()) {
                    setCanRemove(sAWatchFaceItem.getCanRemove());
                }
                if (sAWatchFaceItem.hasVersionCode()) {
                    setVersionCode(sAWatchFaceItem.getVersionCode());
                }
                if (sAWatchFaceItem.hasCanEdit()) {
                    setCanEdit(sAWatchFaceItem.getCanEdit());
                }
                if (sAWatchFaceItem.hasBackgroundColor()) {
                    this.backgroundColor_ = sAWatchFaceItem.backgroundColor_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (sAWatchFaceItem.hasForegroundColor()) {
                    setForegroundColor(sAWatchFaceItem.getForegroundColor());
                }
                if (sAWatchFaceItem.hasSupportImageFormat()) {
                    setSupportImageFormat(sAWatchFaceItem.getSupportImageFormat());
                }
                if (sAWatchFaceItem.hasBackgroundImage()) {
                    this.backgroundImage_ = sAWatchFaceItem.backgroundImage_;
                    this.bitField0_ |= 512;
                    onChanged();
                }
                if (!sAWatchFaceItem.backgroundImageList_.isEmpty()) {
                    if (this.backgroundImageList_.isEmpty()) {
                        this.backgroundImageList_ = sAWatchFaceItem.backgroundImageList_;
                        this.bitField0_ |= 1024;
                    } else {
                        ensureBackgroundImageListIsMutable();
                        this.backgroundImageList_.addAll(sAWatchFaceItem.backgroundImageList_);
                    }
                    onChanged();
                }
                if (sAWatchFaceItem.hasSupportImageGroup()) {
                    setSupportImageGroup(sAWatchFaceItem.getSupportImageGroup());
                }
                if (sAWatchFaceItem.hasImageGroupList()) {
                    mergeImageGroupList(sAWatchFaceItem.getImageGroupList());
                }
                if (!sAWatchFaceItem.dataList_.isEmpty()) {
                    if (this.dataList_.isEmpty()) {
                        Internal.IntList intList = sAWatchFaceItem.dataList_;
                        this.dataList_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 8192;
                    } else {
                        ensureDataListIsMutable();
                        this.dataList_.addAll(sAWatchFaceItem.dataList_);
                    }
                    onChanged();
                }
                if (this.slotItemListBuilder_ == null) {
                    if (!sAWatchFaceItem.slotItemList_.isEmpty()) {
                        if (this.slotItemList_.isEmpty()) {
                            this.slotItemList_ = sAWatchFaceItem.slotItemList_;
                            this.bitField0_ &= -16385;
                        } else {
                            ensureSlotItemListIsMutable();
                            this.slotItemList_.addAll(sAWatchFaceItem.slotItemList_);
                        }
                        onChanged();
                    }
                } else if (!sAWatchFaceItem.slotItemList_.isEmpty()) {
                    if (this.slotItemListBuilder_.isEmpty()) {
                        this.slotItemListBuilder_.dispose();
                        this.slotItemListBuilder_ = null;
                        this.slotItemList_ = sAWatchFaceItem.slotItemList_;
                        this.bitField0_ &= -16385;
                        this.slotItemListBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetSlotItemListFieldBuilder() : null;
                    } else {
                        this.slotItemListBuilder_.addAllMessages(sAWatchFaceItem.slotItemList_);
                    }
                }
                if (sAWatchFaceItem.hasStyle()) {
                    this.style_ = sAWatchFaceItem.style_;
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                if (sAWatchFaceItem.hasStyleColorIndex()) {
                    setStyleColorIndex(sAWatchFaceItem.getStyleColorIndex());
                }
                if (sAWatchFaceItem.hasOnTrial()) {
                    setOnTrial(sAWatchFaceItem.getOnTrial());
                }
                mergeUnknownFields(sAWatchFaceItem.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addSlotItemList(SAWatchFaceSlot.Item.Builder builder) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.add(builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilder.addMessage(builder.build());
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.name_ = "";
                this.backgroundColor_ = "";
                this.foregroundColor_ = ByteString.EMPTY;
                this.supportImageFormat_ = 0;
                this.backgroundImage_ = "";
                this.backgroundImageList_ = LazyStringArrayList.emptyList();
                this.dataList_ = GeneratedMessage.emptyIntList();
                this.slotItemList_ = Collections.EMPTY_LIST;
                this.style_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addSlotItemList(int i7, SAWatchFaceSlot.Item.Builder builder) {
                RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSlotItemListIsMutable();
                    this.slotItemList_.add(i7, builder.build());
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
                            switch (tag) {
                                case 0:
                                    z6 = true;
                                    break;
                                case 10:
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    break;
                                case 24:
                                    this.isCurrent_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    break;
                                case 32:
                                    this.canRemove_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    break;
                                case 40:
                                    this.versionCode_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.canEdit_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.backgroundColor_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                    break;
                                case 66:
                                    this.backgroundImage_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 512;
                                    break;
                                case 74:
                                    this.style_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 80:
                                    int i7 = codedInputStream.readEnum();
                                    if (SAWatchFaceSlot.Data.forNumber(i7) == null) {
                                        mergeUnknownVarintField(10, i7);
                                    } else {
                                        ensureDataListIsMutable();
                                        this.dataList_.addInt(i7);
                                    }
                                    break;
                                case 82:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureDataListIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i8 = codedInputStream.readEnum();
                                        if (SAWatchFaceSlot.Data.forNumber(i8) == null) {
                                            mergeUnknownVarintField(10, i8);
                                        } else {
                                            this.dataList_.addInt(i8);
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    break;
                                case 88:
                                    int i9 = codedInputStream.readEnum();
                                    if (CommonProtos.ImageFormat.forNumber(i9) == null) {
                                        mergeUnknownVarintField(11, i9);
                                    } else {
                                        this.supportImageFormat_ = i9;
                                        this.bitField0_ |= 256;
                                    }
                                    break;
                                case 98:
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureBackgroundImageListIsMutable();
                                    this.backgroundImageList_.add(bytes);
                                    break;
                                case 106:
                                    SAWatchFaceSlot.Item item = (SAWatchFaceSlot.Item) codedInputStream.readMessage(SAWatchFaceSlot.Item.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<SAWatchFaceSlot.Item, SAWatchFaceSlot.Item.Builder, SAWatchFaceSlot.ItemOrBuilder> repeatedFieldBuilder = this.slotItemListBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureSlotItemListIsMutable();
                                        this.slotItemList_.add(item);
                                    } else {
                                        repeatedFieldBuilder.addMessage(item);
                                    }
                                    break;
                                case 114:
                                    this.foregroundColor_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 128;
                                    break;
                                case 120:
                                    this.styleColorIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 65536;
                                    break;
                                case 128:
                                    this.supportImageGroup_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 138:
                                    codedInputStream.readMessage(internalGetImageGroupListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    break;
                                case 144:
                                    this.onTrial_ = codedInputStream.readBool();
                                    this.bitField0_ |= 131072;
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

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final long serialVersionUID = 0;
            private java.util.List<SAWatchFaceItem> list_;
            private byte memoizedIsInitialized;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                DEFAULT_INSTANCE = new List();
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.List.1
                    @Override // com.google.protobuf.Parser
                    public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = List.newBuilder();
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

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_List_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static List parseDelimitedFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
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
                return getListList().equals(list.getListList()) && getUnknownFields().equals(list.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_List_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
            public SAWatchFaceItem getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
            public java.util.List<SAWatchFaceItem> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
            public SAWatchFaceItemOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
            public java.util.List<? extends SAWatchFaceItemOrBuilder> getListOrBuilderList() {
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
                int size = this.list_.size();
                int iComputeMessageSizeNoTag = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    iComputeMessageSizeNoTag += CodedOutputStream.computeMessageSizeNoTag(this.list_.get(i8));
                }
                int serializedSize = iComputeMessageSizeNoTag + size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
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
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> listBuilder_;
                private java.util.List<SAWatchFaceItem> list_;

                private void buildPartial0(List list) {
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        list.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    list.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_List_descriptor;
                }

                private RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SAWatchFaceItem> iterable) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SAWatchFaceItem sAWatchFaceItem) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sAWatchFaceItem);
                        return this;
                    }
                    sAWatchFaceItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(sAWatchFaceItem);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SAWatchFaceItem.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
                public SAWatchFaceItem getList(int i7) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SAWatchFaceItem) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
                public java.util.List<SAWatchFaceItem> getListList() {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
                public SAWatchFaceItemOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SAWatchFaceItemOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.ListOrBuilder
                public java.util.List<? extends SAWatchFaceItemOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SAWatchFaceItem sAWatchFaceItem) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sAWatchFaceItem);
                        return this;
                    }
                    sAWatchFaceItem.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sAWatchFaceItem);
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    buildPartialRepeatedFields(list);
                    if (this.bitField0_ != 0) {
                        buildPartial0(list);
                    }
                    onBuilt();
                    return list;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public List getDefaultInstanceForType() {
                    return List.getDefaultInstance();
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SAWatchFaceItem.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SAWatchFaceItem sAWatchFaceItem) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sAWatchFaceItem.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sAWatchFaceItem);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sAWatchFaceItem);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof List) {
                        return mergeFrom((List) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
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
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(list.list_);
                        }
                    }
                    mergeUnknownFields(list.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                    if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        SAWatchFaceItem sAWatchFaceItem = (SAWatchFaceItem) codedInputStream.readMessage(SAWatchFaceItem.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SAWatchFaceItem, Builder, SAWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sAWatchFaceItem);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sAWatchFaceItem);
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

            private List(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(List list) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(list);
            }

            public static List parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static List parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public List getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private List() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static List parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static List parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static List parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static List parseFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(CodedInputStream codedInputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static List parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ListOrBuilder extends MessageOrBuilder {
            SAWatchFaceItem getList(int i7);

            int getListCount();

            java.util.List<SAWatchFaceItem> getListList();

            SAWatchFaceItemOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SAWatchFaceItemOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWatchFaceItem");
            dataList_converter_ = new Internal.IntListAdapter.IntConverter<SAWatchFaceSlot.Data>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.IntListAdapter.IntConverter
                public SAWatchFaceSlot.Data convert(int i7) {
                    SAWatchFaceSlot.Data dataForNumber = SAWatchFaceSlot.Data.forNumber(i7);
                    return dataForNumber == null ? SAWatchFaceSlot.Data.EMPTY : dataForNumber;
                }
            };
            DEFAULT_INSTANCE = new SAWatchFaceItem();
            PARSER = new AbstractParser<SAWatchFaceItem>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItem.2
                @Override // com.google.protobuf.Parser
                public SAWatchFaceItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWatchFaceItem.newBuilder();
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

        public static SAWatchFaceItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWatchFaceItem parseDelimitedFrom(InputStream inputStream) {
            return (SAWatchFaceItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWatchFaceItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWatchFaceItem)) {
                return super.equals(obj);
            }
            SAWatchFaceItem sAWatchFaceItem = (SAWatchFaceItem) obj;
            if (hasId() != sAWatchFaceItem.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAWatchFaceItem.getId())) || hasName() != sAWatchFaceItem.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(sAWatchFaceItem.getName())) || hasIsCurrent() != sAWatchFaceItem.hasIsCurrent()) {
                return false;
            }
            if ((hasIsCurrent() && getIsCurrent() != sAWatchFaceItem.getIsCurrent()) || hasCanRemove() != sAWatchFaceItem.hasCanRemove()) {
                return false;
            }
            if ((hasCanRemove() && getCanRemove() != sAWatchFaceItem.getCanRemove()) || hasVersionCode() != sAWatchFaceItem.hasVersionCode()) {
                return false;
            }
            if ((hasVersionCode() && getVersionCode() != sAWatchFaceItem.getVersionCode()) || hasCanEdit() != sAWatchFaceItem.hasCanEdit()) {
                return false;
            }
            if ((hasCanEdit() && getCanEdit() != sAWatchFaceItem.getCanEdit()) || hasBackgroundColor() != sAWatchFaceItem.hasBackgroundColor()) {
                return false;
            }
            if ((hasBackgroundColor() && !getBackgroundColor().equals(sAWatchFaceItem.getBackgroundColor())) || hasForegroundColor() != sAWatchFaceItem.hasForegroundColor()) {
                return false;
            }
            if ((hasForegroundColor() && !getForegroundColor().equals(sAWatchFaceItem.getForegroundColor())) || hasSupportImageFormat() != sAWatchFaceItem.hasSupportImageFormat()) {
                return false;
            }
            if ((hasSupportImageFormat() && this.supportImageFormat_ != sAWatchFaceItem.supportImageFormat_) || hasBackgroundImage() != sAWatchFaceItem.hasBackgroundImage()) {
                return false;
            }
            if ((hasBackgroundImage() && !getBackgroundImage().equals(sAWatchFaceItem.getBackgroundImage())) || !getBackgroundImageListList().equals(sAWatchFaceItem.getBackgroundImageListList()) || hasSupportImageGroup() != sAWatchFaceItem.hasSupportImageGroup()) {
                return false;
            }
            if ((hasSupportImageGroup() && getSupportImageGroup() != sAWatchFaceItem.getSupportImageGroup()) || hasImageGroupList() != sAWatchFaceItem.hasImageGroupList()) {
                return false;
            }
            if ((hasImageGroupList() && !getImageGroupList().equals(sAWatchFaceItem.getImageGroupList())) || !this.dataList_.equals(sAWatchFaceItem.dataList_) || !getSlotItemListList().equals(sAWatchFaceItem.getSlotItemListList()) || hasStyle() != sAWatchFaceItem.hasStyle()) {
                return false;
            }
            if ((hasStyle() && !getStyle().equals(sAWatchFaceItem.getStyle())) || hasStyleColorIndex() != sAWatchFaceItem.hasStyleColorIndex()) {
                return false;
            }
            if ((!hasStyleColorIndex() || getStyleColorIndex() == sAWatchFaceItem.getStyleColorIndex()) && hasOnTrial() == sAWatchFaceItem.hasOnTrial()) {
                return (!hasOnTrial() || getOnTrial() == sAWatchFaceItem.getOnTrial()) && getUnknownFields().equals(sAWatchFaceItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ByteString getBackgroundColorBytes() {
            Object obj = this.backgroundColor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundColor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ByteString getBackgroundImageBytes() {
            Object obj = this.backgroundImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundImage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public String getBackgroundImageList(int i7) {
            return this.backgroundImageList_.get(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ByteString getBackgroundImageListBytes(int i7) {
            return this.backgroundImageList_.getByteString(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public int getBackgroundImageListCount() {
            return this.backgroundImageList_.size();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean getCanEdit() {
            return this.canEdit_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean getCanRemove() {
            return this.canRemove_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public SAWatchFaceSlot.Data getDataList(int i7) {
            return dataList_converter_.convert(this.dataList_.getInt(i7));
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public int getDataListCount() {
            return this.dataList_.size();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public java.util.List<SAWatchFaceSlot.Data> getDataListList() {
            return new Internal.IntListAdapter(this.dataList_, dataList_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ByteString getForegroundColor() {
            return this.foregroundColor_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public SAWatchFaceImage.GroupList getImageGroupList() {
            SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
            return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public SAWatchFaceImage.GroupListOrBuilder getImageGroupListOrBuilder() {
            SAWatchFaceImage.GroupList groupList = this.imageGroupList_;
            return groupList == null ? SAWatchFaceImage.GroupList.getDefaultInstance() : groupList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean getIsCurrent() {
            return this.isCurrent_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean getOnTrial() {
            return this.onTrial_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAWatchFaceItem> getParserForType() {
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
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.isCurrent_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(4, this.canRemove_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(5, this.versionCode_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(6, this.canEdit_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(7, this.backgroundColor_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(8, this.backgroundImage_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(9, this.style_);
            }
            int iComputeEnumSizeNoTag = 0;
            for (int i8 = 0; i8 < this.dataList_.size(); i8++) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.dataList_.getInt(i8));
            }
            int size = iComputeStringSize + iComputeEnumSizeNoTag + this.dataList_.size();
            if ((this.bitField0_ & 256) != 0) {
                size += CodedOutputStream.computeEnumSize(11, this.supportImageFormat_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i9 = 0; i9 < this.backgroundImageList_.size(); i9++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.backgroundImageList_.getRaw(i9));
            }
            int size2 = size + iComputeStringSizeNoTag + getBackgroundImageListList().size();
            int size3 = this.slotItemList_.size();
            for (int i10 = 0; i10 < size3; i10++) {
                size2 += CodedOutputStream.computeMessageSizeNoTag(this.slotItemList_.get(i10));
            }
            int iComputeBoolSize = size2 + size3;
            if ((this.bitField0_ & 128) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBytesSize(14, this.foregroundColor_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(15, this.styleColorIndex_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(16, this.supportImageGroup_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(17, getImageGroupList());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(18, this.onTrial_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public SAWatchFaceSlot.Item getSlotItemList(int i7) {
            return this.slotItemList_.get(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public int getSlotItemListCount() {
            return this.slotItemList_.size();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public java.util.List<SAWatchFaceSlot.Item> getSlotItemListList() {
            return this.slotItemList_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public SAWatchFaceSlot.ItemOrBuilder getSlotItemListOrBuilder(int i7) {
            return this.slotItemList_.get(i7);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public java.util.List<? extends SAWatchFaceSlot.ItemOrBuilder> getSlotItemListOrBuilderList() {
            return this.slotItemList_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public int getStyleColorIndex() {
            return this.styleColorIndex_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public CommonProtos.ImageFormat getSupportImageFormat() {
            CommonProtos.ImageFormat imageFormatForNumber = CommonProtos.ImageFormat.forNumber(this.supportImageFormat_);
            return imageFormatForNumber == null ? CommonProtos.ImageFormat.RGB_565 : imageFormatForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean getSupportImageGroup() {
            return this.supportImageGroup_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public long getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasBackgroundColor() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasBackgroundImage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasCanEdit() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasCanRemove() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasForegroundColor() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasImageGroupList() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasIsCurrent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasOnTrial() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasStyle() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasStyleColorIndex() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasSupportImageFormat() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasSupportImageGroup() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public boolean hasVersionCode() {
            return (this.bitField0_ & 16) != 0;
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
            if (hasForegroundColor()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + getForegroundColor().hashCode();
            }
            if (hasSupportImageFormat()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + this.supportImageFormat_;
            }
            if (hasBackgroundImage()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getBackgroundImage().hashCode();
            }
            if (getBackgroundImageListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getBackgroundImageListList().hashCode();
            }
            if (hasSupportImageGroup()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + Internal.hashBoolean(getSupportImageGroup());
            }
            if (hasImageGroupList()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + getImageGroupList().hashCode();
            }
            if (getDataListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + this.dataList_.hashCode();
            }
            if (getSlotItemListCount() > 0) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + getSlotItemListList().hashCode();
            }
            if (hasStyle()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getStyle().hashCode();
            }
            if (hasStyleColorIndex()) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + getStyleColorIndex();
            }
            if (hasOnTrial()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + Internal.hashBoolean(getOnTrial());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceItem.class, Builder.class);
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
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIsCurrent()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasImageGroupList() && !getImageGroupList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i7 = 0; i7 < getSlotItemListCount(); i7++) {
                if (!getSlotItemList(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.isCurrent_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.canRemove_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt64(5, this.versionCode_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.canEdit_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.backgroundColor_);
            }
            if ((this.bitField0_ & 512) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 8, this.backgroundImage_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 9, this.style_);
            }
            for (int i7 = 0; i7 < this.dataList_.size(); i7++) {
                codedOutputStream.writeEnum(10, this.dataList_.getInt(i7));
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeEnum(11, this.supportImageFormat_);
            }
            for (int i8 = 0; i8 < this.backgroundImageList_.size(); i8++) {
                GeneratedMessage.writeString(codedOutputStream, 12, this.backgroundImageList_.getRaw(i8));
            }
            for (int i9 = 0; i9 < this.slotItemList_.size(); i9++) {
                codedOutputStream.writeMessage(13, this.slotItemList_.get(i9));
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBytes(14, this.foregroundColor_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeUInt32(15, this.styleColorIndex_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeBool(16, this.supportImageGroup_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(17, getImageGroupList());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeBool(18, this.onTrial_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SAWatchFaceItem(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.name_ = "";
            this.isCurrent_ = false;
            this.canRemove_ = false;
            this.versionCode_ = 0L;
            this.canEdit_ = false;
            this.backgroundColor_ = "";
            this.foregroundColor_ = ByteString.EMPTY;
            this.supportImageFormat_ = 0;
            this.backgroundImage_ = "";
            this.backgroundImageList_ = LazyStringArrayList.emptyList();
            this.supportImageGroup_ = false;
            this.dataList_ = GeneratedMessage.emptyIntList();
            this.style_ = "";
            this.styleColorIndex_ = 0;
            this.onTrial_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWatchFaceItem sAWatchFaceItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWatchFaceItem);
        }

        public static SAWatchFaceItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceItemOrBuilder
        public ProtocolStringList getBackgroundImageListList() {
            return this.backgroundImageList_;
        }

        public static SAWatchFaceItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWatchFaceItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAWatchFaceItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAWatchFaceItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAWatchFaceItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWatchFaceItem parseFrom(InputStream inputStream) {
            return (SAWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceItem parseFrom(CodedInputStream codedInputStream) {
            return (SAWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWatchFaceItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SAWatchFaceItem() {
            this.id_ = "";
            this.name_ = "";
            this.isCurrent_ = false;
            this.canRemove_ = false;
            this.versionCode_ = 0L;
            this.canEdit_ = false;
            this.backgroundColor_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.foregroundColor_ = byteString;
            this.supportImageFormat_ = 0;
            this.backgroundImage_ = "";
            this.backgroundImageList_ = LazyStringArrayList.emptyList();
            this.supportImageGroup_ = false;
            this.dataList_ = GeneratedMessage.emptyIntList();
            this.style_ = "";
            this.styleColorIndex_ = 0;
            this.onTrial_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            this.backgroundColor_ = "";
            this.foregroundColor_ = byteString;
            this.supportImageFormat_ = 0;
            this.backgroundImage_ = "";
            this.backgroundImageList_ = LazyStringArrayList.emptyList();
            this.dataList_ = GeneratedMessage.emptyIntList();
            this.slotItemList_ = Collections.EMPTY_LIST;
            this.style_ = "";
        }
    }

    public interface SAWatchFaceItemOrBuilder extends MessageOrBuilder {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        String getBackgroundImage();

        ByteString getBackgroundImageBytes();

        String getBackgroundImageList(int i7);

        ByteString getBackgroundImageListBytes(int i7);

        int getBackgroundImageListCount();

        List<String> getBackgroundImageListList();

        boolean getCanEdit();

        boolean getCanRemove();

        SAWatchFaceSlot.Data getDataList(int i7);

        int getDataListCount();

        List<SAWatchFaceSlot.Data> getDataListList();

        ByteString getForegroundColor();

        String getId();

        ByteString getIdBytes();

        SAWatchFaceImage.GroupList getImageGroupList();

        SAWatchFaceImage.GroupListOrBuilder getImageGroupListOrBuilder();

        boolean getIsCurrent();

        String getName();

        ByteString getNameBytes();

        boolean getOnTrial();

        SAWatchFaceSlot.Item getSlotItemList(int i7);

        int getSlotItemListCount();

        List<SAWatchFaceSlot.Item> getSlotItemListList();

        SAWatchFaceSlot.ItemOrBuilder getSlotItemListOrBuilder(int i7);

        List<? extends SAWatchFaceSlot.ItemOrBuilder> getSlotItemListOrBuilderList();

        String getStyle();

        ByteString getStyleBytes();

        int getStyleColorIndex();

        CommonProtos.ImageFormat getSupportImageFormat();

        boolean getSupportImageGroup();

        long getVersionCode();

        boolean hasBackgroundColor();

        boolean hasBackgroundImage();

        boolean hasCanEdit();

        boolean hasCanRemove();

        boolean hasForegroundColor();

        boolean hasId();

        boolean hasImageGroupList();

        boolean hasIsCurrent();

        boolean hasName();

        boolean hasOnTrial();

        boolean hasStyle();

        boolean hasStyleColorIndex();

        boolean hasSupportImageFormat();

        boolean hasSupportImageGroup();

        boolean hasVersionCode();
    }

    public interface SAWatchFaceOrBuilder extends MessageOrBuilder {
        SABgImageResult getBgImageResult();

        SABgImageResultOrBuilder getBgImageResultOrBuilder();

        SAChange_Watch_Face_Info getChangeWatchFaceInfo();

        SAChange_Watch_Face_InfoOrBuilder getChangeWatchFaceInfoOrBuilder();

        SAEditRequest getEditRequest();

        SAEditRequestOrBuilder getEditRequestOrBuilder();

        SAEditResponse getEditResponse();

        SAEditResponseOrBuilder getEditResponseOrBuilder();

        String getId();

        ByteString getIdBytes();

        SAWatchFaceInfo.List getInfoList();

        SAWatchFaceInfo.ListOrBuilder getInfoListOrBuilder();

        SAInstallResult getInstallResult();

        SAInstallResultOrBuilder getInstallResultOrBuilder();

        String getPath();

        ByteString getPathBytes();

        SAWatchFace.PayloadCase getPayloadCase();

        SAPrepareInfo getPrepareInfo();

        SAPrepareInfoOrBuilder getPrepareInfoOrBuilder();

        SAPrepareReply getPrepareReply();

        SAPrepareReplyOrBuilder getPrepareReplyOrBuilder();

        CommonProtos.SEPrepareStatus getPrepareStatus();

        boolean getSuccess();

        SAWatchFaceSlot.List getSupportDataList();

        SAWatchFaceSlot.ListOrBuilder getSupportDataListOrBuilder();

        SAWatchFaceItem.List getWatchFaceList();

        SAWatchFaceItem.ListOrBuilder getWatchFaceListOrBuilder();

        boolean hasBgImageResult();

        boolean hasChangeWatchFaceInfo();

        boolean hasEditRequest();

        boolean hasEditResponse();

        boolean hasId();

        boolean hasInfoList();

        boolean hasInstallResult();

        boolean hasPath();

        boolean hasPrepareInfo();

        boolean hasPrepareReply();

        boolean hasPrepareStatus();

        boolean hasSuccess();

        boolean hasSupportDataList();

        boolean hasWatchFaceList();
    }

    public static final class SAWatchFaceSlot extends GeneratedMessage implements SAWatchFaceSlotOrBuilder {
        private static final SAWatchFaceSlot DEFAULT_INSTANCE;
        private static final Parser<SAWatchFaceSlot> PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

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
            private static final Data[] VALUES;
            public static final int WEATHER_VALUE = 10;
            public static final int WIND_DIRECTION_VALUE = 20;
            private static final Internal.EnumLiteMap<Data> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Data");
                internalValueMap = new Internal.EnumLiteMap<Data>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.Data.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Data findValueByNumber(int i7) {
                        return Data.forNumber(i7);
                    }
                };
                VALUES = values();
            }

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

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SAWatchFaceSlot.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<Data> internalGetValueMap() {
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
            public static Data valueOf(int i7) {
                return forNumber(i7);
            }

            public static Data valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static final class Item extends GeneratedMessage implements ItemOrBuilder {
            private static final Item DEFAULT_INSTANCE;
            private static final Parser<Item> PARSER;
            public static final int POS_INDEX_FIELD_NUMBER = 3;
            public static final int SLOT_ID_FIELD_NUMBER = 1;
            public static final int WIDGET_ID_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int posIndex_;
            private volatile Object slotId_;
            private volatile Object widgetId_;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Item");
                DEFAULT_INSTANCE = new Item();
                PARSER = new AbstractParser<Item>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.Item.1
                    @Override // com.google.protobuf.Parser
                    public Item parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = Item.newBuilder();
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

            public static Item getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_Item_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Item parseDelimitedFrom(InputStream inputStream) {
                return (Item) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Item parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<Item> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return super.equals(obj);
                }
                Item item = (Item) obj;
                if (hasSlotId() != item.hasSlotId()) {
                    return false;
                }
                if ((hasSlotId() && !getSlotId().equals(item.getSlotId())) || hasWidgetId() != item.hasWidgetId()) {
                    return false;
                }
                if ((!hasWidgetId() || getWidgetId().equals(item.getWidgetId())) && hasPosIndex() == item.hasPosIndex()) {
                    return (!hasPosIndex() || getPosIndex() == item.getPosIndex()) && getUnknownFields().equals(item.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_Item_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Item> getParserForType() {
                return PARSER;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public int getPosIndex() {
                return this.posIndex_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.slotId_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessage.computeStringSize(2, this.widgetId_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.posIndex_);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public String getSlotId() {
                Object obj = this.slotId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.slotId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public ByteString getSlotIdBytes() {
                Object obj = this.slotId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.slotId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public String getWidgetId() {
                Object obj = this.widgetId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.widgetId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public ByteString getWidgetIdBytes() {
                Object obj = this.widgetId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.widgetId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public boolean hasPosIndex() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public boolean hasSlotId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
            public boolean hasWidgetId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasSlotId()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getSlotId().hashCode();
                }
                if (hasWidgetId()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWidgetId().hashCode();
                }
                if (hasPosIndex()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getPosIndex();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
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
                if (!hasSlotId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasWidgetId()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 1, this.slotId_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 2, this.widgetId_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeUInt32(3, this.posIndex_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOrBuilder {
                private int bitField0_;
                private int posIndex_;
                private Object slotId_;
                private Object widgetId_;

                private void buildPartial0(Item item) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        item.slotId_ = this.slotId_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        item.widgetId_ = this.widgetId_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        item.posIndex_ = this.posIndex_;
                        i7 |= 4;
                    }
                    item.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_Item_descriptor;
                }

                public Builder clearPosIndex() {
                    this.bitField0_ &= -5;
                    this.posIndex_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearSlotId() {
                    this.slotId_ = Item.getDefaultInstance().getSlotId();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearWidgetId() {
                    this.widgetId_ = Item.getDefaultInstance().getWidgetId();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_Item_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public int getPosIndex() {
                    return this.posIndex_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public String getSlotId() {
                    Object obj = this.slotId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.slotId_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public ByteString getSlotIdBytes() {
                    Object obj = this.slotId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.slotId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public String getWidgetId() {
                    Object obj = this.widgetId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.widgetId_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public ByteString getWidgetIdBytes() {
                    Object obj = this.widgetId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.widgetId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public boolean hasPosIndex() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public boolean hasSlotId() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ItemOrBuilder
                public boolean hasWidgetId() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasSlotId() && hasWidgetId();
                }

                public Builder setPosIndex(int i7) {
                    this.posIndex_ = i7;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setSlotId(String str) {
                    str.getClass();
                    this.slotId_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setSlotIdBytes(ByteString byteString) {
                    byteString.getClass();
                    this.slotId_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setWidgetId(String str) {
                    str.getClass();
                    this.widgetId_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setWidgetIdBytes(ByteString byteString) {
                    byteString.getClass();
                    this.widgetId_ = byteString;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.slotId_ = "";
                    this.widgetId_ = "";
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Item build() {
                    Item itemBuildPartial = buildPartial();
                    if (itemBuildPartial.isInitialized()) {
                        return itemBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Item buildPartial() {
                    Item item = new Item(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(item);
                    }
                    onBuilt();
                    return item;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Item getDefaultInstanceForType() {
                    return Item.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.slotId_ = "";
                    this.widgetId_ = "";
                    this.posIndex_ = 0;
                    return this;
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.slotId_ = "";
                    this.widgetId_ = "";
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Item) {
                        return mergeFrom((Item) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Item item) {
                    if (item == Item.getDefaultInstance()) {
                        return this;
                    }
                    if (item.hasSlotId()) {
                        this.slotId_ = item.slotId_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (item.hasWidgetId()) {
                        this.widgetId_ = item.widgetId_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (item.hasPosIndex()) {
                        setPosIndex(item.getPosIndex());
                    }
                    mergeUnknownFields(item.getUnknownFields());
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
                                        this.slotId_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.widgetId_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 2;
                                    } else if (tag != 24) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.posIndex_ = codedInputStream.readUInt32();
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

            private Item(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.slotId_ = "";
                this.widgetId_ = "";
                this.posIndex_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Item item) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(item);
            }

            public static Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Item) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Item parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Item getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Item parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private Item() {
                this.slotId_ = "";
                this.widgetId_ = "";
                this.posIndex_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.slotId_ = "";
                this.widgetId_ = "";
            }

            public static Item parseFrom(InputStream inputStream) {
                return (Item) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Item) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Item parseFrom(CodedInputStream codedInputStream) {
                return (Item) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Item) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ItemOrBuilder extends MessageOrBuilder {
            int getPosIndex();

            String getSlotId();

            ByteString getSlotIdBytes();

            String getWidgetId();

            ByteString getWidgetIdBytes();

            boolean hasPosIndex();

            boolean hasSlotId();

            boolean hasWidgetId();
        }

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final Internal.IntListAdapter.IntConverter<Data> list_converter_;
            private static final long serialVersionUID = 0;
            private Internal.IntList list_;
            private byte memoizedIsInitialized;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                list_converter_ = new Internal.IntListAdapter.IntConverter<Data>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.List.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.protobuf.Internal.IntListAdapter.IntConverter
                    public Data convert(int i7) {
                        Data dataForNumber = Data.forNumber(i7);
                        return dataForNumber == null ? Data.EMPTY : dataForNumber;
                    }
                };
                DEFAULT_INSTANCE = new List();
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.List.2
                    @Override // com.google.protobuf.Parser
                    public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = List.newBuilder();
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

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_List_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static List parseDelimitedFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
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
                return this.list_.equals(list.list_) && getUnknownFields().equals(list.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_List_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ListOrBuilder
            public Data getList(int i7) {
                return list_converter_.convert(this.list_.getInt(i7));
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ListOrBuilder
            public java.util.List<Data> getListList() {
                return new Internal.IntListAdapter(this.list_, list_converter_);
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
                    iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.list_.getInt(i8));
                }
                int size = iComputeEnumSizeNoTag + this.list_.size() + getUnknownFields().getSerializedSize();
                this.memoizedSize = size;
                return size;
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
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i7 = 0; i7 < this.list_.size(); i7++) {
                    codedOutputStream.writeEnum(1, this.list_.getInt(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private Internal.IntList list_;

                private void buildPartial0(List list) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_.makeImmutable();
                        list.list_ = this.list_;
                    }
                }

                private void ensureListIsMutable() {
                    if (!this.list_.isModifiable()) {
                        this.list_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_List_descriptor;
                }

                public Builder addAllList(Iterable<? extends Data> iterable) {
                    ensureListIsMutable();
                    Iterator<? extends Data> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.list_.addInt(it.next().getNumber());
                    }
                    onChanged();
                    return this;
                }

                public Builder addList(Data data) {
                    data.getClass();
                    ensureListIsMutable();
                    this.list_.addInt(data.getNumber());
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = GeneratedMessage.emptyIntList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ListOrBuilder
                public Data getList(int i7) {
                    return (Data) List.list_converter_.convert(this.list_.getInt(i7));
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.ListOrBuilder
                public java.util.List<Data> getListList() {
                    return new Internal.IntListAdapter(this.list_, List.list_converter_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, Data data) {
                    data.getClass();
                    ensureListIsMutable();
                    this.list_.setInt(i7, data.getNumber());
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.list_ = GeneratedMessage.emptyIntList();
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
                    if (this.bitField0_ != 0) {
                        buildPartial0(list);
                    }
                    onBuilt();
                    return list;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public List getDefaultInstanceForType() {
                    return List.getDefaultInstance();
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = GeneratedMessage.emptyIntList();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.list_ = GeneratedMessage.emptyIntList();
                    return this;
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
                            Internal.IntList intList = list.list_;
                            this.list_ = intList;
                            intList.makeImmutable();
                            this.bitField0_ |= 1;
                        } else {
                            ensureListIsMutable();
                            this.list_.addAll(list.list_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(list.getUnknownFields());
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
                                        if (Data.forNumber(i7) == null) {
                                            mergeUnknownVarintField(1, i7);
                                        } else {
                                            ensureListIsMutable();
                                            this.list_.addInt(i7);
                                        }
                                    } else if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        ensureListIsMutable();
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            int i8 = codedInputStream.readEnum();
                                            if (Data.forNumber(i8) == null) {
                                                mergeUnknownVarintField(1, i8);
                                            } else {
                                                this.list_.addInt(i8);
                                            }
                                        }
                                        codedInputStream.popLimit(iPushLimit);
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

            private List(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(List list) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(list);
            }

            public static List parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static List parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public List getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static List parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private List() {
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = GeneratedMessage.emptyIntList();
            }

            public static List parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static List parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static List parseFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(CodedInputStream codedInputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static List parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ListOrBuilder extends MessageOrBuilder {
            Data getList(int i7);

            int getListCount();

            java.util.List<Data> getListList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWatchFaceSlot");
            DEFAULT_INSTANCE = new SAWatchFaceSlot();
            PARSER = new AbstractParser<SAWatchFaceSlot>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos.SAWatchFaceSlot.1
                @Override // com.google.protobuf.Parser
                public SAWatchFaceSlot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWatchFaceSlot.newBuilder();
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

        public static SAWatchFaceSlot getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWatchFaceSlot parseDelimitedFrom(InputStream inputStream) {
            return (SAWatchFaceSlot) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceSlot parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWatchFaceSlot> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof SAWatchFaceSlot) ? super.equals(obj) : getUnknownFields().equals(((SAWatchFaceSlot) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAWatchFaceSlot> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = ((getDescriptor().hashCode() + DataBinderMapperImpl.Yd) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceSlot.class, Builder.class);
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWatchFaceSlotOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WatchFaceProtos.internal_static_SA_SAWatchFaceSlot_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWatchFaceSlot.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceSlot build() {
                SAWatchFaceSlot sAWatchFaceSlotBuildPartial = buildPartial();
                if (sAWatchFaceSlotBuildPartial.isInitialized()) {
                    return sAWatchFaceSlotBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWatchFaceSlotBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWatchFaceSlot buildPartial() {
                SAWatchFaceSlot sAWatchFaceSlot = new SAWatchFaceSlot(this);
                onBuilt();
                return sAWatchFaceSlot;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWatchFaceSlot getDefaultInstanceForType() {
                return SAWatchFaceSlot.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWatchFaceSlot) {
                    return mergeFrom((SAWatchFaceSlot) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAWatchFaceSlot sAWatchFaceSlot) {
                if (sAWatchFaceSlot == SAWatchFaceSlot.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(sAWatchFaceSlot.getUnknownFields());
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
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z6 = true;
                            }
                        } catch (InvalidProtocolBufferException e7) {
                            throw e7.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }
        }

        private SAWatchFaceSlot(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWatchFaceSlot sAWatchFaceSlot) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWatchFaceSlot);
        }

        public static SAWatchFaceSlot parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWatchFaceSlot parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceSlot) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceSlot parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWatchFaceSlot getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SAWatchFaceSlot() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SAWatchFaceSlot parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAWatchFaceSlot parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAWatchFaceSlot parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWatchFaceSlot parseFrom(InputStream inputStream) {
            return (SAWatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWatchFaceSlot parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWatchFaceSlot parseFrom(CodedInputStream codedInputStream) {
            return (SAWatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWatchFaceSlot parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWatchFaceSlot) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAWatchFaceSlotOrBuilder extends MessageOrBuilder {
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SA_WatchFaceProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018sa_wear_watch_face.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\" \u0007\n\u000bSAWatchFace\u00123\n\u000fwatch_face_list\u0018\u0001 \u0001(\u000b2\u0018.SA.SAWatchFaceItem.ListH\u0000\u0012\u0013\n\u0002id\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\u0015\n\u0004path\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\u0011\n\u0007success\u0018\u0004 \u0001(\bH\u0000\u0012-\n\u000eprepare_status\u0018\u0005 \u0001(\u000e2\u0013.SA.SEPrepareStatusH\u0000\u0012)\n\fprepare_info\u0018\u0006 \u0001(\u000b2\u0011.SA.SAPrepareInfoH\u0000\u0012-\n\u000einstall_result\u0018\u0007 \u0001(\u000b2\u0013.SA.SAInstallResultH\u0000\u0012-\n\tinfo_list\u0018\b \u0001(\u000b2\u0018.SA.SAWatchFaceInfo.ListH\u0000\u0012+\n\rprepare_reply\u0018\t \u0001(\u000b2\u0012.SA.SAPrepareReplyH\u0000\u00125\n\u0011support_data_list\u0018\u000b \u0001(\u000b2\u0018.SA.SAWatchFaceSlot.ListH\u0000\u0012)\n\fedit_request\u0018\f \u0001(\u000b2\u0011.SA.SAEditRequestH\u0000\u0012+\n\redit_response\u0018\r \u0001(\u000b2\u0012.SA.SAEditResponseH\u0000\u0012.\n\u000fbg_image_result\u0018\u000e \u0001(\u000b2\u0013.SA.SABgImageResultH\u0000\u0012>\n\u0016Change_watch_face_info\u0018\u000f \u0001(\u000b2\u001c.SA.SAChange_Watch_Face_InfoH\u0000\"\u00ad\u0002\n\u000bWatchFaceID\u0012\u0016\n\u0012GET_INSTALLED_LIST\u0010\u0000\u0012\u0012\n\u000eSET_WATCH_FACE\u0010\u0001\u0012\u0015\n\u0011REMOVE_WATCH_FACE\u0010\u0002\u0012\u001b\n\u0017REMOVE_WATCH_FACE_PHOTO\u0010\u0003\u0012\u001e\n\u001aPREPARE_INSTALL_WATCH_FACE\u0010\u0004\u0012\u0019\n\u0015REPORT_INSTALL_RESULT\u0010\u0005\u0012\u001b\n\u0017REMOVE_MULTI_WATCH_FACE\u0010\u0006\u0012\u0014\n\u0010GET_SUPPORT_DATA\u0010\n\u0012\u0013\n\u000fEDIT_WATCH_FACE\u0010\u000b\u0012\u0013\n\u000fBG_IMAGE_RESULT\u0010\f\u0012&\n\"WATCH_INITIATIVE_CHANGE_WATCH_FACE\u0010\rB\t\n\u0007payload\"¿\u0003\n\u000fSAWatchFaceSlot\u001a5\n\u0004List\u0012-\n\u0004list\u0018\u0001 \u0003(\u000e2\u0018.SA.SAWatchFaceSlot.DataB\u0005\u0092?\u0002\u0018\u0004\u001aR\n\u0004Item\u0012\u0016\n\u0007slot_id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\twidget_id\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tpos_index\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\" \u0002\n\u0004Data\u0012\t\n\u0005EMPTY\u0010\u0000\u0012\u000e\n\nHEART_RATE\u0010\u0001\u0012\f\n\bPRESSURE\u0010\u0002\u0012\t\n\u0005SLEEP\u0010\u0003\u0012\n\n\u0006ENERGY\u0010\u0004\u0012\b\n\u0004STEP\u0010\u0005\u0012\u000b\n\u0007CALORIE\u0010\u0006\u0012\u000f\n\u000bVALID_STAND\u0010\u0007\u0012\u000b\n\u0007BATTERY\u0010\b\u0012\b\n\u0004DATE\u0010\t\u0012\u000b\n\u0007WEATHER\u0010\n\u0012\u0010\n\fAIR_PRESSURE\u0010\u000b\u0012\f\n\bALTITUDE\u0010\f\u0012\t\n\u0005TIMER\u0010\r\u0012\t\n\u0005CLOCK\u0010\u000e\u0012\u0007\n\u0003AQI\u0010\u000f\u0012\f\n\bHUMIDITY\u0010\u0010\u0012\u000e\n\nSPORT_MODE\u0010\u0011\u0012\u0007\n\u0003UVI\u0010\u0012\u0012\u0012\n\u000eSUNRISE_SUNSET\u0010\u0013\u0012\u0012\n\u000eWIND_DIRECTION\u0010\u0014\"¢\u0002\n\u0010SAWatchFaceImage\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\f\n\u0004size\u0018\u0002 \u0001(\r\u001a\u008c\u0001\n\u0005Group\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0011content_pos_index\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012&\n\bbg_image\u0018\u0003 \u0002(\u000b2\u0014.SA.SAWatchFaceImage\u0012&\n\bfg_image\u0018\u0004 \u0001(\u000b2\u0014.SA.SAWatchFaceImage\u001a^\n\tGroupList\u0012/\n\u0004list\u0018\u0001 \u0003(\u000b2\u001a.SA.SAWatchFaceImage.GroupB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0011support_max_count\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\"\u0083\u0005\n\u000fSAWatchFaceItem\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\nis_current\u0018\u0003 \u0002(\b\u0012\u0012\n\ncan_remove\u0018\u0004 \u0001(\b\u0012\u0014\n\fversion_code\u0018\u0005 \u0001(\u0004\u0012\u0010\n\bcan_edit\u0018\u0006 \u0001(\b\u0012\u001f\n\u0010background_color\u0018\u0007 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012!\n\u0010foreground_color\u0018\u000e \u0001(\fB\u0007\u0092?\u0004\b\u0004x\u0001\u0012-\n\u0014support_image_format\u0018\u000b \u0001(\u000e2\u000f.SA.ImageFormat\u0012\u001f\n\u0010background_image\u0018\b \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012$\n\u0015background_image_list\u0018\f \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001b\n\u0013support_image_group\u0018\u0010 \u0001(\b\u00128\n\u0010image_group_list\u0018\u0011 \u0001(\u000b2\u001e.SA.SAWatchFaceImage.GroupList\u00122\n\tdata_list\u0018\n \u0003(\u000e2\u0018.SA.SAWatchFaceSlot.DataB\u0005\u0092?\u0002\u0018\u0004\u00127\n\u000eslot_item_list\u0018\r \u0003(\u000b2\u0018.SA.SAWatchFaceSlot.ItemB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005style\u0018\t \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0011style_color_index\u0018\u000f \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0010\n\bon_trial\u0018\u0012 \u0001(\b\u001a0\n\u0004List\u0012(\n\u0004list\u0018\u0001 \u0003(\u000b2\u0013.SA.SAWatchFaceItemB\u0005\u0092?\u0002\u0018\u0004\"V\n\u000fSAWatchFaceInfo\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001a0\n\u0004List\u0012(\n\u0004list\u0018\u0001 \u0003(\u000b2\u0013.SA.SAWatchFaceInfoB\u0005\u0092?\u0002\u0018\u0004\"¨\u0002\n\rSAPrepareInfo\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\f\n\u0004size\u0018\u0002 \u0002(\r\u0012\u0015\n\rwatch_bg_size\u0018\u0003 \u0002(\r\u0012\u0014\n\fversion_code\u0018\u0004 \u0001(\u0004\u0012$\n\u0015support_compress_mode\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u00124\n\fverification\u0018\u0006 \u0001(\u000b2\u001e.SA.SAPrepareInfo.Verification\u0012\u0014\n\u0005style\u0018\u0007 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u001aW\n\fVerification\u0012\u0013\n\u0004info\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004sign\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001d\n\u000etrial_duration\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\u0010\"Ï\u0001\n\u000eSAPrepareReply\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012+\n\u000eprepare_status\u0018\u0002 \u0002(\u000e2\u0013.SA.SEPrepareStatus\u0012\"\n\u001acan_replace_if_low_storage\u0018\u0005 \u0001(\b\u0012#\n\u0014select_compress_mode\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001d\n\u0015expected_slice_length\u0018\u0004 \u0001(\r\u0012\u0015\n\rscreen_radius\u0018\u0006 \u0001(\r\"¬\u0002\n\u000fSAInstallResult\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012&\n\u0004code\u0018\u0002 \u0002(\u000e2\u0018.SA.SAInstallResult.Code\u0012\u0014\n\fsupport_edit\u0018\u0003 \u0001(\b\u0012-\n\u0014support_image_format\u0018\u0004 \u0001(\u000e2\u000f.SA.ImageFormat\u0012&\n\u0017support_max_image_count\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001b\n\u0013support_image_group\u0018\u0006 \u0001(\b\"T\n\u0004Code\u0012\u0011\n\rVERIFY_FAILED\u0010\u0000\u0012\u0012\n\u000eINSTALL_FAILED\u0010\u0001\u0012\u0013\n\u000fINSTALL_SUCCESS\u0010\u0002\u0012\u0010\n\fINSTALL_USED\u0010\u0003\"Ê\u0004\n\rSAEditRequest\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u000bset_current\u0018\u0002 \u0002(\b\u0012\u001f\n\u0010background_color\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012!\n\u0010foreground_color\u0018\r \u0001(\fB\u0007\u0092?\u0004\b\u0004x\u0001\u0012\u001f\n\u0010background_image\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001d\n\u0015background_image_size\u0018\u0005 \u0001(\r\u0012$\n\u0015background_image_list\u0018\b \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\u0012)\n\u001abackground_image_size_list\u0018\t \u0003(\rB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010order_image_list\u0018\n \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\u0011delete_all_images\u0018\u000b \u0001(\b\u00128\n\u0010image_group_list\u0018\u000f \u0001(\u000b2\u001e.SA.SAWatchFaceImage.GroupList\u00122\n\tdata_list\u0018\u0007 \u0003(\u000e2\u0018.SA.SAWatchFaceSlot.DataB\u0005\u0092?\u0002\u0018\u0004\u00127\n\u000eslot_item_list\u0018\f \u0003(\u000b2\u0018.SA.SAWatchFaceSlot.ItemB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005style\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0011style_color_index\u0018\u000e \u0001(\rB\u0005\u0092?\u00028\b\u0012!\n\u0012image_switch_style\u0018\u0010 \u0001(\rB\u0005\u0092?\u00028\b\"\u0082\u0002\n\u000eSAEditResponse\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012%\n\u0004code\u0018\u0002 \u0002(\u000e2\u0017.SA.SAEditResponse.Code\u0012%\n\u0016can_accept_image_count\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001d\n\u0015expected_slice_length\u0018\u0004 \u0001(\r\"p\n\u0004Code\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u001b\n\u0017SUCCESS_BUT_LOW_STORAGE\u0010\u0001\u0012\u0018\n\u0014FAIL_FOR_LOW_STORAGE\u0010\u0002\u0012\u001a\n\u0016FAIL_FOR_INVALID_PARAM\u0010\u0003\u0012\b\n\u0004FAIL\u0010\u0004\"Î\u0001\n\u000fSABgImageResult\u0012&\n\u0004code\u0018\u0001 \u0002(\u000e2\u0018.SA.SABgImageResult.Code\u0012\u0011\n\u0002id\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010background_image\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"_\n\u0004Code\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0015\n\u0011IMAGE_SAVE_FAILED\u0010\u0001\u0012\u0018\n\u0014IMAGE_RESOLVE_FAILED\u0010\u0002\u0012\u0019\n\u0015NO_WATCH_FACE_MATCHED\u0010\u0003\"\u0084\u0001\n\u0018SAChange_Watch_Face_Info\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012/\n\u0004type\u0018\u0002 \u0002(\u000e2!.SA.SAChange_Watch_Face_Info.Type\"$\n\u0004Type\u0012\n\n\u0006REMOVE\u0010\u0000\u0012\u0010\n\fCHANGE_ORDER\u0010\u0001B8\n\u001bcom.zh.ble.sa_wear.protobufB\u0012SA_WatchFaceProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SAWatchFace_descriptor = messageType;
        internal_static_SA_SAWatchFace_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"WatchFaceList", "Id", "Path", "Success", "PrepareStatus", "PrepareInfo", "InstallResult", "InfoList", "PrepareReply", "SupportDataList", "EditRequest", "EditResponse", "BgImageResult", "ChangeWatchFaceInfo", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SAWatchFaceSlot_descriptor = messageType2;
        internal_static_SA_SAWatchFaceSlot_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[0]);
        Descriptors.Descriptor nestedType = messageType2.getNestedType(0);
        internal_static_SA_SAWatchFaceSlot_List_descriptor = nestedType;
        internal_static_SA_SAWatchFaceSlot_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor nestedType2 = messageType2.getNestedType(1);
        internal_static_SA_SAWatchFaceSlot_Item_descriptor = nestedType2;
        internal_static_SA_SAWatchFaceSlot_Item_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{"SlotId", "WidgetId", "PosIndex"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SAWatchFaceImage_descriptor = messageType3;
        internal_static_SA_SAWatchFaceImage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"Id", "Size"});
        Descriptors.Descriptor nestedType3 = messageType3.getNestedType(0);
        internal_static_SA_SAWatchFaceImage_Group_descriptor = nestedType3;
        internal_static_SA_SAWatchFaceImage_Group_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{"Id", "ContentPosIndex", "BgImage", "FgImage"});
        Descriptors.Descriptor nestedType4 = messageType3.getNestedType(1);
        internal_static_SA_SAWatchFaceImage_GroupList_descriptor = nestedType4;
        internal_static_SA_SAWatchFaceImage_GroupList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType4, new String[]{MessageLiteToString.f20028a, "SupportMaxCount"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SAWatchFaceItem_descriptor = messageType4;
        internal_static_SA_SAWatchFaceItem_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"Id", "Name", "IsCurrent", "CanRemove", "VersionCode", "CanEdit", "BackgroundColor", "ForegroundColor", "SupportImageFormat", "BackgroundImage", "BackgroundImageList", "SupportImageGroup", "ImageGroupList", "DataList", "SlotItemList", "Style", "StyleColorIndex", "OnTrial"});
        Descriptors.Descriptor nestedType5 = messageType4.getNestedType(0);
        internal_static_SA_SAWatchFaceItem_List_descriptor = nestedType5;
        internal_static_SA_SAWatchFaceItem_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType5, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SAWatchFaceInfo_descriptor = messageType5;
        internal_static_SA_SAWatchFaceInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Id"});
        Descriptors.Descriptor nestedType6 = messageType5.getNestedType(0);
        internal_static_SA_SAWatchFaceInfo_List_descriptor = nestedType6;
        internal_static_SA_SAWatchFaceInfo_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType6, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SAPrepareInfo_descriptor = messageType6;
        internal_static_SA_SAPrepareInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Id", "Size", "WatchBgSize", "VersionCode", "SupportCompressMode", "Verification", "Style"});
        Descriptors.Descriptor nestedType7 = messageType6.getNestedType(0);
        internal_static_SA_SAPrepareInfo_Verification_descriptor = nestedType7;
        internal_static_SA_SAPrepareInfo_Verification_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType7, new String[]{"Info", "Sign", "TrialDuration"});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SA_SAPrepareReply_descriptor = messageType7;
        internal_static_SA_SAPrepareReply_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"Id", "PrepareStatus", "CanReplaceIfLowStorage", "SelectCompressMode", "ExpectedSliceLength", "ScreenRadius"});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SA_SAInstallResult_descriptor = messageType8;
        internal_static_SA_SAInstallResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"Id", "Code", "SupportEdit", "SupportImageFormat", "SupportMaxImageCount", "SupportImageGroup"});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SA_SAEditRequest_descriptor = messageType9;
        internal_static_SA_SAEditRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{"Id", "SetCurrent", "BackgroundColor", "ForegroundColor", "BackgroundImage", "BackgroundImageSize", "BackgroundImageList", "BackgroundImageSizeList", "OrderImageList", "DeleteAllImages", "ImageGroupList", "DataList", "SlotItemList", "Style", "StyleColorIndex", "ImageSwitchStyle"});
        Descriptors.Descriptor messageType10 = getDescriptor().getMessageType(9);
        internal_static_SA_SAEditResponse_descriptor = messageType10;
        internal_static_SA_SAEditResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType10, new String[]{"Id", "Code", "CanAcceptImageCount", "ExpectedSliceLength"});
        Descriptors.Descriptor messageType11 = getDescriptor().getMessageType(10);
        internal_static_SA_SABgImageResult_descriptor = messageType11;
        internal_static_SA_SABgImageResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType11, new String[]{"Code", "Id", "BackgroundImage"});
        Descriptors.Descriptor messageType12 = getDescriptor().getMessageType(11);
        internal_static_SA_SAChange_Watch_Face_Info_descriptor = messageType12;
        internal_static_SA_SAChange_Watch_Face_Info_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType12, new String[]{"Id", "Type"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private SA_WatchFaceProtos() {
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