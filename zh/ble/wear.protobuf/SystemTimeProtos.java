package com.zh.ble.wear.protobuf;

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
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SystemTimeProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SESystemTime_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESystemTime_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SETimeSet_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SETimeSet_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWorldClockInfo_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWorldClockInfo_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWorldClockInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWorldClockInfo_fieldAccessorTable;

    public static final class SESystemTime extends GeneratedMessage implements SESystemTimeOrBuilder {
        private static final SESystemTime DEFAULT_INSTANCE;
        private static final Parser<SESystemTime> PARSER;
        public static final int TIME_SET_FIELD_NUMBER = 1;
        public static final int WORLD_CLOCK_INFO_FIELD_NUMBER = 2;
        public static final int WORLD_CLOCK_INFO_LIST_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            TIME_SET(1),
            WORLD_CLOCK_INFO(2),
            WORLD_CLOCK_INFO_LIST(3),
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
                    return TIME_SET;
                }
                if (i7 == 2) {
                    return WORLD_CLOCK_INFO;
                }
                if (i7 != 3) {
                    return null;
                }
                return WORLD_CLOCK_INFO_LIST;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESystemTime");
            DEFAULT_INSTANCE = new SESystemTime();
            PARSER = new AbstractParser<SESystemTime>() { // from class: com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTime.1
                @Override // com.google.protobuf.Parser
                public SESystemTime parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESystemTime.newBuilder();
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

        public static SESystemTime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SystemTimeProtos.internal_static_SESystemTime_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESystemTime parseDelimitedFrom(InputStream inputStream) {
            return (SESystemTime) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESystemTime parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESystemTime> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESystemTime)) {
                return super.equals(obj);
            }
            SESystemTime sESystemTime = (SESystemTime) obj;
            if (!getPayloadCase().equals(sESystemTime.getPayloadCase())) {
                return false;
            }
            int i7 = this.payloadCase_;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3 && !getWorldClockInfoList().equals(sESystemTime.getWorldClockInfoList())) {
                        return false;
                    }
                } else if (!getWorldClockInfo().equals(sESystemTime.getWorldClockInfo())) {
                    return false;
                }
            } else if (!getTimeSet().equals(sESystemTime.getTimeSet())) {
                return false;
            }
            return getUnknownFields().equals(sESystemTime.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SystemTimeProtos.internal_static_SESystemTime_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESystemTime> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SETimeSet) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SEWorldClockInfo) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (SEWorldClockInfo.SEList) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public SETimeSet getTimeSet() {
            return this.payloadCase_ == 1 ? (SETimeSet) this.payload_ : SETimeSet.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public SETimeSetOrBuilder getTimeSetOrBuilder() {
            return this.payloadCase_ == 1 ? (SETimeSet) this.payload_ : SETimeSet.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public SEWorldClockInfo getWorldClockInfo() {
            return this.payloadCase_ == 2 ? (SEWorldClockInfo) this.payload_ : SEWorldClockInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public SEWorldClockInfo.SEList getWorldClockInfoList() {
            return this.payloadCase_ == 3 ? (SEWorldClockInfo.SEList) this.payload_ : SEWorldClockInfo.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public SEWorldClockInfo.SEListOrBuilder getWorldClockInfoListOrBuilder() {
            return this.payloadCase_ == 3 ? (SEWorldClockInfo.SEList) this.payload_ : SEWorldClockInfo.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public SEWorldClockInfoOrBuilder getWorldClockInfoOrBuilder() {
            return this.payloadCase_ == 2 ? (SEWorldClockInfo) this.payload_ : SEWorldClockInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public boolean hasTimeSet() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public boolean hasWorldClockInfo() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
        public boolean hasWorldClockInfoList() {
            return this.payloadCase_ == 3;
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
            if (i9 == 1) {
                i7 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getTimeSet().hashCode();
            } else {
                if (i9 != 2) {
                    if (i9 == 3) {
                        i7 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getWorldClockInfoList().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i7 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getWorldClockInfo().hashCode();
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SystemTimeProtos.internal_static_SESystemTime_fieldAccessorTable.ensureFieldAccessorsInitialized(SESystemTime.class, Builder.class);
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
            if (hasWorldClockInfo() && !getWorldClockInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWorldClockInfoList() || getWorldClockInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SETimeSet) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SEWorldClockInfo) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SEWorldClockInfo.SEList) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESystemTimeOrBuilder {
            private int bitField0_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> timeSetBuilder_;
            private SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> worldClockInfoBuilder_;
            private SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> worldClockInfoListBuilder_;

            private void buildPartial0(SESystemTime sESystemTime) {
            }

            private void buildPartialOneofs(SESystemTime sESystemTime) {
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder3;
                int i7 = this.payloadCase_;
                sESystemTime.payloadCase_ = i7;
                sESystemTime.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder3 = this.timeSetBuilder_) != null) {
                    sESystemTime.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 2 && (singleFieldBuilder2 = this.worldClockInfoBuilder_) != null) {
                    sESystemTime.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 3 || (singleFieldBuilder = this.worldClockInfoListBuilder_) == null) {
                    return;
                }
                sESystemTime.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SystemTimeProtos.internal_static_SESystemTime_descriptor;
            }

            private SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> internalGetTimeSetFieldBuilder() {
                if (this.timeSetBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SETimeSet.getDefaultInstance();
                    }
                    this.timeSetBuilder_ = new SingleFieldBuilder<>((SETimeSet) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.timeSetBuilder_;
            }

            private SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> internalGetWorldClockInfoFieldBuilder() {
                if (this.worldClockInfoBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SEWorldClockInfo.getDefaultInstance();
                    }
                    this.worldClockInfoBuilder_ = new SingleFieldBuilder<>((SEWorldClockInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.worldClockInfoBuilder_;
            }

            private SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> internalGetWorldClockInfoListFieldBuilder() {
                if (this.worldClockInfoListBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SEWorldClockInfo.SEList.getDefaultInstance();
                    }
                    this.worldClockInfoListBuilder_ = new SingleFieldBuilder<>((SEWorldClockInfo.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.worldClockInfoListBuilder_;
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearTimeSet() {
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder = this.timeSetBuilder_;
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

            public Builder clearWorldClockInfo() {
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder = this.worldClockInfoBuilder_;
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

            public Builder clearWorldClockInfoList() {
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder = this.worldClockInfoListBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SystemTimeProtos.internal_static_SESystemTime_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public SETimeSet getTimeSet() {
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder = this.timeSetBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SETimeSet) this.payload_ : SETimeSet.getDefaultInstance() : this.payloadCase_ == 1 ? (SETimeSet) singleFieldBuilder.getMessage() : SETimeSet.getDefaultInstance();
            }

            public SETimeSet.Builder getTimeSetBuilder() {
                return (SETimeSet.Builder) internalGetTimeSetFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public SETimeSetOrBuilder getTimeSetOrBuilder() {
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.timeSetBuilder_) == null) ? i7 == 1 ? (SETimeSet) this.payload_ : SETimeSet.getDefaultInstance() : (SETimeSetOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public SEWorldClockInfo getWorldClockInfo() {
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder = this.worldClockInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SEWorldClockInfo) this.payload_ : SEWorldClockInfo.getDefaultInstance() : this.payloadCase_ == 2 ? (SEWorldClockInfo) singleFieldBuilder.getMessage() : SEWorldClockInfo.getDefaultInstance();
            }

            public SEWorldClockInfo.Builder getWorldClockInfoBuilder() {
                return (SEWorldClockInfo.Builder) internalGetWorldClockInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public SEWorldClockInfo.SEList getWorldClockInfoList() {
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder = this.worldClockInfoListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SEWorldClockInfo.SEList) this.payload_ : SEWorldClockInfo.SEList.getDefaultInstance() : this.payloadCase_ == 3 ? (SEWorldClockInfo.SEList) singleFieldBuilder.getMessage() : SEWorldClockInfo.SEList.getDefaultInstance();
            }

            public SEWorldClockInfo.SEList.Builder getWorldClockInfoListBuilder() {
                return (SEWorldClockInfo.SEList.Builder) internalGetWorldClockInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public SEWorldClockInfo.SEListOrBuilder getWorldClockInfoListOrBuilder() {
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.worldClockInfoListBuilder_) == null) ? i7 == 3 ? (SEWorldClockInfo.SEList) this.payload_ : SEWorldClockInfo.SEList.getDefaultInstance() : (SEWorldClockInfo.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public SEWorldClockInfoOrBuilder getWorldClockInfoOrBuilder() {
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.worldClockInfoBuilder_) == null) ? i7 == 2 ? (SEWorldClockInfo) this.payload_ : SEWorldClockInfo.getDefaultInstance() : (SEWorldClockInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public boolean hasTimeSet() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public boolean hasWorldClockInfo() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SESystemTimeOrBuilder
            public boolean hasWorldClockInfoList() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SystemTimeProtos.internal_static_SESystemTime_fieldAccessorTable.ensureFieldAccessorsInitialized(SESystemTime.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasWorldClockInfo() || getWorldClockInfo().isInitialized()) {
                    return !hasWorldClockInfoList() || getWorldClockInfoList().isInitialized();
                }
                return false;
            }

            public Builder mergeTimeSet(SETimeSet sETimeSet) {
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder = this.timeSetBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SETimeSet.getDefaultInstance()) {
                        this.payload_ = sETimeSet;
                    } else {
                        this.payload_ = SETimeSet.newBuilder((SETimeSet) this.payload_).mergeFrom(sETimeSet).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sETimeSet);
                } else {
                    singleFieldBuilder.setMessage(sETimeSet);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeWorldClockInfo(SEWorldClockInfo sEWorldClockInfo) {
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder = this.worldClockInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SEWorldClockInfo.getDefaultInstance()) {
                        this.payload_ = sEWorldClockInfo;
                    } else {
                        this.payload_ = SEWorldClockInfo.newBuilder((SEWorldClockInfo) this.payload_).mergeFrom(sEWorldClockInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sEWorldClockInfo);
                } else {
                    singleFieldBuilder.setMessage(sEWorldClockInfo);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeWorldClockInfoList(SEWorldClockInfo.SEList sEList) {
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder = this.worldClockInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SEWorldClockInfo.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWorldClockInfo.SEList.newBuilder((SEWorldClockInfo.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setTimeSet(SETimeSet sETimeSet) {
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder = this.timeSetBuilder_;
                if (singleFieldBuilder == null) {
                    sETimeSet.getClass();
                    this.payload_ = sETimeSet;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sETimeSet);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setWorldClockInfo(SEWorldClockInfo sEWorldClockInfo) {
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder = this.worldClockInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEWorldClockInfo.getClass();
                    this.payload_ = sEWorldClockInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEWorldClockInfo);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setWorldClockInfoList(SEWorldClockInfo.SEList sEList) {
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder = this.worldClockInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 3;
                return this;
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESystemTime build() {
                SESystemTime sESystemTimeBuildPartial = buildPartial();
                if (sESystemTimeBuildPartial.isInitialized()) {
                    return sESystemTimeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESystemTimeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESystemTime buildPartial() {
                SESystemTime sESystemTime = new SESystemTime(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESystemTime);
                }
                buildPartialOneofs(sESystemTime);
                onBuilt();
                return sESystemTime;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESystemTime getDefaultInstanceForType() {
                return SESystemTime.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder = this.timeSetBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder2 = this.worldClockInfoBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder3 = this.worldClockInfoListBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESystemTime) {
                    return mergeFrom((SESystemTime) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setTimeSet(SETimeSet.Builder builder) {
                SingleFieldBuilder<SETimeSet, SETimeSet.Builder, SETimeSetOrBuilder> singleFieldBuilder = this.timeSetBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setWorldClockInfo(SEWorldClockInfo.Builder builder) {
                SingleFieldBuilder<SEWorldClockInfo, SEWorldClockInfo.Builder, SEWorldClockInfoOrBuilder> singleFieldBuilder = this.worldClockInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setWorldClockInfoList(SEWorldClockInfo.SEList.Builder builder) {
                SingleFieldBuilder<SEWorldClockInfo.SEList, SEWorldClockInfo.SEList.Builder, SEWorldClockInfo.SEListOrBuilder> singleFieldBuilder = this.worldClockInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeFrom(SESystemTime sESystemTime) {
                if (sESystemTime == SESystemTime.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = sESystemTime.getPayloadCase().ordinal();
                if (iOrdinal == 0) {
                    mergeTimeSet(sESystemTime.getTimeSet());
                } else if (iOrdinal == 1) {
                    mergeWorldClockInfo(sESystemTime.getWorldClockInfo());
                } else if (iOrdinal == 2) {
                    mergeWorldClockInfoList(sESystemTime.getWorldClockInfoList());
                }
                mergeUnknownFields(sESystemTime.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetTimeSetFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetWorldClockInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetWorldClockInfoListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
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

        private SESystemTime(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESystemTime sESystemTime) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESystemTime);
        }

        public static SESystemTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESystemTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESystemTime) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESystemTime parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESystemTime getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESystemTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SESystemTime() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SESystemTime parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESystemTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESystemTime parseFrom(InputStream inputStream) {
            return (SESystemTime) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESystemTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESystemTime) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESystemTime parseFrom(CodedInputStream codedInputStream) {
            return (SESystemTime) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESystemTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESystemTime) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESystemTimeOrBuilder extends MessageOrBuilder {
        SESystemTime.PayloadCase getPayloadCase();

        SETimeSet getTimeSet();

        SETimeSetOrBuilder getTimeSetOrBuilder();

        SEWorldClockInfo getWorldClockInfo();

        SEWorldClockInfo.SEList getWorldClockInfoList();

        SEWorldClockInfo.SEListOrBuilder getWorldClockInfoListOrBuilder();

        SEWorldClockInfoOrBuilder getWorldClockInfoOrBuilder();

        boolean hasTimeSet();

        boolean hasWorldClockInfo();

        boolean hasWorldClockInfoList();
    }

    public static final class SETimeSet extends GeneratedMessage implements SETimeSetOrBuilder {
        private static final SETimeSet DEFAULT_INSTANCE;
        public static final int OFFSET_FIELD_NUMBER = 2;
        private static final Parser<SETimeSet> PARSER;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TIME_FORMAT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int offset_;
        private boolean timeFormat_;
        private int timestamp_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETimeSet");
            DEFAULT_INSTANCE = new SETimeSet();
            PARSER = new AbstractParser<SETimeSet>() { // from class: com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSet.1
                @Override // com.google.protobuf.Parser
                public SETimeSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SETimeSet.newBuilder();
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

        public static SETimeSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SystemTimeProtos.internal_static_SETimeSet_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SETimeSet parseDelimitedFrom(InputStream inputStream) {
            return (SETimeSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SETimeSet parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SETimeSet> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SETimeSet)) {
                return super.equals(obj);
            }
            SETimeSet sETimeSet = (SETimeSet) obj;
            if (hasTimestamp() != sETimeSet.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != sETimeSet.getTimestamp()) || hasOffset() != sETimeSet.hasOffset()) {
                return false;
            }
            if ((!hasOffset() || getOffset() == sETimeSet.getOffset()) && hasTimeFormat() == sETimeSet.hasTimeFormat()) {
                return (!hasTimeFormat() || getTimeFormat() == sETimeSet.getTimeFormat()) && getUnknownFields().equals(sETimeSet.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SystemTimeProtos.internal_static_SETimeSet_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SETimeSet> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.timestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeSInt32Size(2, this.offset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.timeFormat_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
        public boolean getTimeFormat() {
            return this.timeFormat_;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
        public boolean hasOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
        public boolean hasTimeFormat() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTimestamp();
            }
            if (hasOffset()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getOffset();
            }
            if (hasTimeFormat()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getTimeFormat());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SystemTimeProtos.internal_static_SETimeSet_fieldAccessorTable.ensureFieldAccessorsInitialized(SETimeSet.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.timestamp_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeSInt32(2, this.offset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.timeFormat_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SETimeSetOrBuilder {
            private int bitField0_;
            private int offset_;
            private boolean timeFormat_;
            private int timestamp_;

            private void buildPartial0(SETimeSet sETimeSet) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sETimeSet.timestamp_ = this.timestamp_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sETimeSet.offset_ = this.offset_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sETimeSet.timeFormat_ = this.timeFormat_;
                    i7 |= 4;
                }
                sETimeSet.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SystemTimeProtos.internal_static_SETimeSet_descriptor;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -3;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimeFormat() {
                this.bitField0_ &= -5;
                this.timeFormat_ = false;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -2;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SystemTimeProtos.internal_static_SETimeSet_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
            public boolean getTimeFormat() {
                return this.timeFormat_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
            public boolean hasOffset() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
            public boolean hasTimeFormat() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SETimeSetOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SystemTimeProtos.internal_static_SETimeSet_fieldAccessorTable.ensureFieldAccessorsInitialized(SETimeSet.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setOffset(int i7) {
                this.offset_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimeFormat(boolean z6) {
                this.timeFormat_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i7) {
                this.timestamp_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETimeSet build() {
                SETimeSet sETimeSetBuildPartial = buildPartial();
                if (sETimeSetBuildPartial.isInitialized()) {
                    return sETimeSetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sETimeSetBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETimeSet buildPartial() {
                SETimeSet sETimeSet = new SETimeSet(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sETimeSet);
                }
                onBuilt();
                return sETimeSet;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SETimeSet getDefaultInstanceForType() {
                return SETimeSet.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestamp_ = 0;
                this.offset_ = 0;
                this.timeFormat_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SETimeSet) {
                    return mergeFrom((SETimeSet) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SETimeSet sETimeSet) {
                if (sETimeSet == SETimeSet.getDefaultInstance()) {
                    return this;
                }
                if (sETimeSet.hasTimestamp()) {
                    setTimestamp(sETimeSet.getTimestamp());
                }
                if (sETimeSet.hasOffset()) {
                    setOffset(sETimeSet.getOffset());
                }
                if (sETimeSet.hasTimeFormat()) {
                    setTimeFormat(sETimeSet.getTimeFormat());
                }
                mergeUnknownFields(sETimeSet.getUnknownFields());
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
                                    this.timestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.offset_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.timeFormat_ = codedInputStream.readBool();
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

        private SETimeSet(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.timestamp_ = 0;
            this.offset_ = 0;
            this.timeFormat_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SETimeSet sETimeSet) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sETimeSet);
        }

        public static SETimeSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SETimeSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETimeSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SETimeSet parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SETimeSet getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SETimeSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SETimeSet parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SETimeSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SETimeSet() {
            this.timestamp_ = 0;
            this.offset_ = 0;
            this.timeFormat_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SETimeSet parseFrom(InputStream inputStream) {
            return (SETimeSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SETimeSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETimeSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SETimeSet parseFrom(CodedInputStream codedInputStream) {
            return (SETimeSet) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SETimeSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETimeSet) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SETimeSetOrBuilder extends MessageOrBuilder {
        int getOffset();

        boolean getTimeFormat();

        int getTimestamp();

        boolean hasOffset();

        boolean hasTimeFormat();

        boolean hasTimestamp();
    }

    public static final class SEWorldClockInfo extends GeneratedMessage implements SEWorldClockInfoOrBuilder {
        public static final int CITY_ID_FIELD_NUMBER = 5;
        public static final int CITY_NAME_FIELD_NUMBER = 1;
        private static final SEWorldClockInfo DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 2;
        public static final int OFFSET_FIELD_NUMBER = 4;
        private static final Parser<SEWorldClockInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int cityId_;
        private volatile Object cityName_;
        private double latitude_;
        private double longitude_;
        private byte memoizedIsInitialized;
        private int offset_;

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEWorldClockInfo> list_;
            private byte memoizedIsInitialized;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEList.1
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
                return SystemTimeProtos.internal_static_SEWorldClockInfo_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SystemTimeProtos.internal_static_SEWorldClockInfo_SEList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
            public SEWorldClockInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
            public List<SEWorldClockInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
            public SEWorldClockInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
            public List<? extends SEWorldClockInfoOrBuilder> getListOrBuilderList() {
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
                return SystemTimeProtos.internal_static_SEWorldClockInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> listBuilder_;
                private List<SEWorldClockInfo> list_;

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SystemTimeProtos.internal_static_SEWorldClockInfo_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEWorldClockInfo> iterable) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEWorldClockInfo sEWorldClockInfo) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEWorldClockInfo);
                        return this;
                    }
                    sEWorldClockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEWorldClockInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEWorldClockInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SystemTimeProtos.internal_static_SEWorldClockInfo_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
                public SEWorldClockInfo getList(int i7) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWorldClockInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
                public List<SEWorldClockInfo> getListList() {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
                public SEWorldClockInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWorldClockInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.SEListOrBuilder
                public List<? extends SEWorldClockInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SystemTimeProtos.internal_static_SEWorldClockInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEWorldClockInfo sEWorldClockInfo) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEWorldClockInfo);
                        return this;
                    }
                    sEWorldClockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEWorldClockInfo);
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEWorldClockInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEWorldClockInfo sEWorldClockInfo) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEWorldClockInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEWorldClockInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEWorldClockInfo);
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
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEWorldClockInfo sEWorldClockInfo = (SEWorldClockInfo) codedInputStream.readMessage(SEWorldClockInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEWorldClockInfo, Builder, SEWorldClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEWorldClockInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEWorldClockInfo);
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

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
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

            private SEList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
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
            SEWorldClockInfo getList(int i7);

            int getListCount();

            List<SEWorldClockInfo> getListList();

            SEWorldClockInfoOrBuilder getListOrBuilder(int i7);

            List<? extends SEWorldClockInfoOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWorldClockInfo");
            DEFAULT_INSTANCE = new SEWorldClockInfo();
            PARSER = new AbstractParser<SEWorldClockInfo>() { // from class: com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfo.1
                @Override // com.google.protobuf.Parser
                public SEWorldClockInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWorldClockInfo.newBuilder();
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

        public static SEWorldClockInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SystemTimeProtos.internal_static_SEWorldClockInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWorldClockInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEWorldClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWorldClockInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWorldClockInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWorldClockInfo)) {
                return super.equals(obj);
            }
            SEWorldClockInfo sEWorldClockInfo = (SEWorldClockInfo) obj;
            if (hasCityName() != sEWorldClockInfo.hasCityName()) {
                return false;
            }
            if ((hasCityName() && !getCityName().equals(sEWorldClockInfo.getCityName())) || hasLongitude() != sEWorldClockInfo.hasLongitude()) {
                return false;
            }
            if ((hasLongitude() && Double.doubleToLongBits(getLongitude()) != Double.doubleToLongBits(sEWorldClockInfo.getLongitude())) || hasLatitude() != sEWorldClockInfo.hasLatitude()) {
                return false;
            }
            if ((hasLatitude() && Double.doubleToLongBits(getLatitude()) != Double.doubleToLongBits(sEWorldClockInfo.getLatitude())) || hasOffset() != sEWorldClockInfo.hasOffset()) {
                return false;
            }
            if ((!hasOffset() || getOffset() == sEWorldClockInfo.getOffset()) && hasCityId() == sEWorldClockInfo.hasCityId()) {
                return (!hasCityId() || getCityId() == sEWorldClockInfo.getCityId()) && getUnknownFields().equals(sEWorldClockInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public int getCityId() {
            return this.cityId_;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public String getCityName() {
            Object obj = this.cityName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.cityName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public ByteString getCityNameBytes() {
            Object obj = this.cityName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cityName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SystemTimeProtos.internal_static_SEWorldClockInfo_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public double getLatitude() {
            return this.latitude_;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public double getLongitude() {
            return this.longitude_;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWorldClockInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.cityName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeDoubleSize(2, this.longitude_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeDoubleSize(3, this.latitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeSInt32Size(4, this.offset_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.cityId_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public boolean hasCityId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public boolean hasCityName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public boolean hasLatitude() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public boolean hasLongitude() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
        public boolean hasOffset() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasCityName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCityName().hashCode();
            }
            if (hasLongitude()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getLongitude()));
            }
            if (hasLatitude()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getLatitude()));
            }
            if (hasOffset()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getOffset();
            }
            if (hasCityId()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getCityId();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SystemTimeProtos.internal_static_SEWorldClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWorldClockInfo.class, Builder.class);
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
            if (!hasCityName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLongitude()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLatitude()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOffset()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.cityName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeDouble(2, this.longitude_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeDouble(3, this.latitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeSInt32(4, this.offset_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.cityId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWorldClockInfoOrBuilder {
            private int bitField0_;
            private int cityId_;
            private Object cityName_;
            private double latitude_;
            private double longitude_;
            private int offset_;

            private void buildPartial0(SEWorldClockInfo sEWorldClockInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWorldClockInfo.cityName_ = this.cityName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWorldClockInfo.longitude_ = this.longitude_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWorldClockInfo.latitude_ = this.latitude_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEWorldClockInfo.offset_ = this.offset_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEWorldClockInfo.cityId_ = this.cityId_;
                    i7 |= 16;
                }
                sEWorldClockInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SystemTimeProtos.internal_static_SEWorldClockInfo_descriptor;
            }

            public Builder clearCityId() {
                this.bitField0_ &= -17;
                this.cityId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCityName() {
                this.cityName_ = SEWorldClockInfo.getDefaultInstance().getCityName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearLatitude() {
                this.bitField0_ &= -5;
                this.latitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearLongitude() {
                this.bitField0_ &= -3;
                this.longitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -9;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public int getCityId() {
                return this.cityId_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public String getCityName() {
                Object obj = this.cityName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.cityName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public ByteString getCityNameBytes() {
                Object obj = this.cityName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cityName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SystemTimeProtos.internal_static_SEWorldClockInfo_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public double getLatitude() {
                return this.latitude_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public double getLongitude() {
                return this.longitude_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public boolean hasCityId() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public boolean hasCityName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public boolean hasLatitude() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public boolean hasLongitude() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SystemTimeProtos.SEWorldClockInfoOrBuilder
            public boolean hasOffset() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SystemTimeProtos.internal_static_SEWorldClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWorldClockInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCityName() && hasLongitude() && hasLatitude() && hasOffset();
            }

            public Builder setCityId(int i7) {
                this.cityId_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setCityName(String str) {
                str.getClass();
                this.cityName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCityNameBytes(ByteString byteString) {
                byteString.getClass();
                this.cityName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLatitude(double d7) {
                this.latitude_ = d7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLongitude(double d7) {
                this.longitude_ = d7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOffset(int i7) {
                this.offset_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder() {
                this.cityName_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWorldClockInfo build() {
                SEWorldClockInfo sEWorldClockInfoBuildPartial = buildPartial();
                if (sEWorldClockInfoBuildPartial.isInitialized()) {
                    return sEWorldClockInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWorldClockInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWorldClockInfo buildPartial() {
                SEWorldClockInfo sEWorldClockInfo = new SEWorldClockInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWorldClockInfo);
                }
                onBuilt();
                return sEWorldClockInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWorldClockInfo getDefaultInstanceForType() {
                return SEWorldClockInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.cityName_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.cityName_ = "";
                this.longitude_ = 0.0d;
                this.latitude_ = 0.0d;
                this.offset_ = 0;
                this.cityId_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWorldClockInfo) {
                    return mergeFrom((SEWorldClockInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEWorldClockInfo sEWorldClockInfo) {
                if (sEWorldClockInfo == SEWorldClockInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEWorldClockInfo.hasCityName()) {
                    this.cityName_ = sEWorldClockInfo.cityName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEWorldClockInfo.hasLongitude()) {
                    setLongitude(sEWorldClockInfo.getLongitude());
                }
                if (sEWorldClockInfo.hasLatitude()) {
                    setLatitude(sEWorldClockInfo.getLatitude());
                }
                if (sEWorldClockInfo.hasOffset()) {
                    setOffset(sEWorldClockInfo.getOffset());
                }
                if (sEWorldClockInfo.hasCityId()) {
                    setCityId(sEWorldClockInfo.getCityId());
                }
                mergeUnknownFields(sEWorldClockInfo.getUnknownFields());
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
                                    this.cityName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 17) {
                                    this.longitude_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 2;
                                } else if (tag == 25) {
                                    this.latitude_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.offset_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.cityId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
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

        private SEWorldClockInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.cityName_ = "";
            this.longitude_ = 0.0d;
            this.latitude_ = 0.0d;
            this.offset_ = 0;
            this.cityId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWorldClockInfo sEWorldClockInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWorldClockInfo);
        }

        public static SEWorldClockInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWorldClockInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWorldClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWorldClockInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWorldClockInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWorldClockInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWorldClockInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWorldClockInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWorldClockInfo parseFrom(InputStream inputStream) {
            return (SEWorldClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEWorldClockInfo() {
            this.cityName_ = "";
            this.longitude_ = 0.0d;
            this.latitude_ = 0.0d;
            this.offset_ = 0;
            this.cityId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.cityName_ = "";
        }

        public static SEWorldClockInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWorldClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWorldClockInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEWorldClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWorldClockInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWorldClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWorldClockInfoOrBuilder extends MessageOrBuilder {
        int getCityId();

        String getCityName();

        ByteString getCityNameBytes();

        double getLatitude();

        double getLongitude();

        int getOffset();

        boolean hasCityId();

        boolean hasCityName();

        boolean hasLatitude();

        boolean hasLongitude();

        boolean hasOffset();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SystemTimeProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010SystemTime.proto\u001a\fnanopb.proto\"£\u0001\n\fSESystemTime\u0012\u001e\n\btime_set\u0018\u0001 \u0001(\u000b2\n.SETimeSetH\u0000\u0012-\n\u0010world_clock_info\u0018\u0002 \u0001(\u000b2\u0011.SEWorldClockInfoH\u0000\u00129\n\u0015world_clock_info_list\u0018\u0003 \u0001(\u000b2\u0018.SEWorldClockInfo.SEListH\u0000B\t\n\u0007payload\"Q\n\tSETimeSet\u0012\u0018\n\ttimestamp\u0018\u0001 \u0001(\rB\u0005\u0092?\u00028 \u0012\u0015\n\u0006offset\u0018\u0002 \u0001(\u0011B\u0005\u0092?\u00028\b\u0012\u0013\n\u000btime_format\u0018\u0003 \u0001(\b\"²\u0001\n\u0010SEWorldClockInfo\u0012\u0018\n\tcity_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0011\n\tlongitude\u0018\u0002 \u0002(\u0001\u0012\u0010\n\blatitude\u0018\u0003 \u0002(\u0001\u0012\u0015\n\u0006offset\u0018\u0004 \u0002(\u0011B\u0005\u0092?\u00028\b\u0012\u0016\n\u0007city_id\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\u0010\u001a0\n\u0006SEList\u0012&\n\u0004list\u0018\u0001 \u0003(\u000b2\u0011.SEWorldClockInfoB\u0005\u0092?\u0002\u0018\u0004B,\n\u0018com.zh.ble.wear.protobufB\u0010SystemTimeProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SESystemTime_descriptor = messageType;
        internal_static_SESystemTime_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"TimeSet", "WorldClockInfo", "WorldClockInfoList", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SETimeSet_descriptor = messageType2;
        internal_static_SETimeSet_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"Timestamp", "Offset", "TimeFormat"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEWorldClockInfo_descriptor = messageType3;
        internal_static_SEWorldClockInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"CityName", "Longitude", "Latitude", "Offset", "CityId"});
        Descriptors.Descriptor nestedType = messageType3.getNestedType(0);
        internal_static_SEWorldClockInfo_SEList_descriptor = nestedType;
        internal_static_SEWorldClockInfo_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private SystemTimeProtos() {
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