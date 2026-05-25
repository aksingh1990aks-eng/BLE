package com.zh.wear.protobuf;

import com.google.common.net.HttpHeaders;
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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UnknownFieldSet;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CommonProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_ClockHoliday_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClockHoliday_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Date_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Date_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_KeyValue_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_KeyValue_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_RangeValue_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RangeValue_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Time_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Time_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Timezone_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Timezone_fieldAccessorTable;

    public static final class ClockHoliday extends GeneratedMessageV3 implements ClockHolidayOrBuilder {
        public static final int FREE_DAYS_FIELD_NUMBER = 2;
        public static final int WORK_DAYS_FIELD_NUMBER = 3;
        public static final int YEAR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LazyStringList freeDays_;
        private byte memoizedIsInitialized;
        private LazyStringList workDays_;
        private int year_;
        private static final ClockHoliday DEFAULT_INSTANCE = new ClockHoliday();

        @Deprecated
        public static final Parser<ClockHoliday> PARSER = new AbstractParser<ClockHoliday>() { // from class: com.zh.wear.protobuf.CommonProtos.ClockHoliday.1
            @Override // com.google.protobuf.Parser
            public ClockHoliday parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ClockHoliday(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClockHolidayOrBuilder {
            private int bitField0_;
            private LazyStringList freeDays_;
            private LazyStringList workDays_;
            private int year_;

            private Builder() {
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.freeDays_ = lazyStringList;
                this.workDays_ = lazyStringList;
                maybeForceBuilderInitialization();
            }

            private void ensureFreeDaysIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.freeDays_ = new LazyStringArrayList(this.freeDays_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureWorkDaysIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.workDays_ = new LazyStringArrayList(this.workDays_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_ClockHoliday_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllFreeDays(Iterable<String> iterable) {
                ensureFreeDaysIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.freeDays_);
                onChanged();
                return this;
            }

            public Builder addAllWorkDays(Iterable<String> iterable) {
                ensureWorkDaysIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.workDays_);
                onChanged();
                return this;
            }

            public Builder addFreeDays(String str) {
                str.getClass();
                ensureFreeDaysIsMutable();
                this.freeDays_.add(str);
                onChanged();
                return this;
            }

            public Builder addFreeDaysBytes(ByteString byteString) {
                byteString.getClass();
                ensureFreeDaysIsMutable();
                this.freeDays_.add(byteString);
                onChanged();
                return this;
            }

            public Builder addWorkDays(String str) {
                str.getClass();
                ensureWorkDaysIsMutable();
                this.workDays_.add(str);
                onChanged();
                return this;
            }

            public Builder addWorkDaysBytes(ByteString byteString) {
                byteString.getClass();
                ensureWorkDaysIsMutable();
                this.workDays_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearFreeDays() {
                this.freeDays_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearWorkDays() {
                this.workDays_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearYear() {
                this.bitField0_ &= -2;
                this.year_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_ClockHoliday_descriptor;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public String getFreeDays(int i7) {
                return this.freeDays_.get(i7);
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public ByteString getFreeDaysBytes(int i7) {
                return this.freeDays_.getByteString(i7);
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public int getFreeDaysCount() {
                return this.freeDays_.size();
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public ProtocolStringList getFreeDaysList() {
                return this.freeDays_.getUnmodifiableView();
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public String getWorkDays(int i7) {
                return this.workDays_.get(i7);
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public ByteString getWorkDaysBytes(int i7) {
                return this.workDays_.getByteString(i7);
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public int getWorkDaysCount() {
                return this.workDays_.size();
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public ProtocolStringList getWorkDaysList() {
                return this.workDays_.getUnmodifiableView();
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public int getYear() {
                return this.year_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
            public boolean hasYear() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_ClockHoliday_fieldAccessorTable.ensureFieldAccessorsInitialized(ClockHoliday.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasYear();
            }

            public Builder setFreeDays(int i7, String str) {
                str.getClass();
                ensureFreeDaysIsMutable();
                this.freeDays_.set(i7, str);
                onChanged();
                return this;
            }

            public Builder setWorkDays(int i7, String str) {
                str.getClass();
                ensureWorkDaysIsMutable();
                this.workDays_.set(i7, str);
                onChanged();
                return this;
            }

            public Builder setYear(int i7) {
                this.bitField0_ |= 1;
                this.year_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.freeDays_ = lazyStringList;
                this.workDays_ = lazyStringList;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClockHoliday build() {
                ClockHoliday clockHolidayBuildPartial = buildPartial();
                if (clockHolidayBuildPartial.isInitialized()) {
                    return clockHolidayBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clockHolidayBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClockHoliday buildPartial() {
                ClockHoliday clockHoliday = new ClockHoliday(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                clockHoliday.year_ = this.year_;
                if ((this.bitField0_ & 2) == 2) {
                    this.freeDays_ = this.freeDays_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                clockHoliday.freeDays_ = this.freeDays_;
                if ((this.bitField0_ & 4) == 4) {
                    this.workDays_ = this.workDays_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                clockHoliday.workDays_ = this.workDays_;
                clockHoliday.bitField0_ = i7;
                onBuilt();
                return clockHoliday;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ClockHoliday getDefaultInstanceForType() {
                return ClockHoliday.getDefaultInstance();
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
                this.year_ = 0;
                int i7 = this.bitField0_;
                this.bitField0_ = i7 & (-2);
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.freeDays_ = lazyStringList;
                this.workDays_ = lazyStringList;
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
            public com.zh.wear.protobuf.CommonProtos.ClockHoliday.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CommonProtos$ClockHoliday> r1 = com.zh.wear.protobuf.CommonProtos.ClockHoliday.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CommonProtos$ClockHoliday r3 = (com.zh.wear.protobuf.CommonProtos.ClockHoliday) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CommonProtos$ClockHoliday r4 = (com.zh.wear.protobuf.CommonProtos.ClockHoliday) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CommonProtos.ClockHoliday.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CommonProtos$ClockHoliday$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ClockHoliday) {
                    return mergeFrom((ClockHoliday) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClockHoliday clockHoliday) {
                if (clockHoliday == ClockHoliday.getDefaultInstance()) {
                    return this;
                }
                if (clockHoliday.hasYear()) {
                    setYear(clockHoliday.getYear());
                }
                if (!clockHoliday.freeDays_.isEmpty()) {
                    if (this.freeDays_.isEmpty()) {
                        this.freeDays_ = clockHoliday.freeDays_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureFreeDaysIsMutable();
                        this.freeDays_.addAll(clockHoliday.freeDays_);
                    }
                    onChanged();
                }
                if (!clockHoliday.workDays_.isEmpty()) {
                    if (this.workDays_.isEmpty()) {
                        this.workDays_ = clockHoliday.workDays_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureWorkDaysIsMutable();
                        this.workDays_.addAll(clockHoliday.workDays_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) clockHoliday).unknownFields);
                onChanged();
                return this;
            }
        }

        private ClockHoliday() {
            this.memoizedIsInitialized = (byte) -1;
            this.year_ = 0;
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.freeDays_ = lazyStringList;
            this.workDays_ = lazyStringList;
        }

        public static ClockHoliday getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_ClockHoliday_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ClockHoliday parseDelimitedFrom(InputStream inputStream) {
            return (ClockHoliday) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClockHoliday parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ClockHoliday> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClockHoliday)) {
                return super.equals(obj);
            }
            ClockHoliday clockHoliday = (ClockHoliday) obj;
            boolean z6 = hasYear() == clockHoliday.hasYear();
            if (hasYear()) {
                z6 = z6 && getYear() == clockHoliday.getYear();
            }
            return ((z6 && getFreeDaysList().equals(clockHoliday.getFreeDaysList())) && getWorkDaysList().equals(clockHoliday.getWorkDaysList())) && this.unknownFields.equals(clockHoliday.unknownFields);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public String getFreeDays(int i7) {
            return this.freeDays_.get(i7);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public ByteString getFreeDaysBytes(int i7) {
            return this.freeDays_.getByteString(i7);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public int getFreeDaysCount() {
            return this.freeDays_.size();
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public ProtocolStringList getFreeDaysList() {
            return this.freeDays_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ClockHoliday> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.year_) : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i8 = 0; i8 < this.freeDays_.size(); i8++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.freeDays_.getRaw(i8));
            }
            int size = iComputeUInt32Size + iComputeStringSizeNoTag + getFreeDaysList().size();
            int iComputeStringSizeNoTag2 = 0;
            for (int i9 = 0; i9 < this.workDays_.size(); i9++) {
                iComputeStringSizeNoTag2 += GeneratedMessage.computeStringSizeNoTag(this.workDays_.getRaw(i9));
            }
            int size2 = size + iComputeStringSizeNoTag2 + getWorkDaysList().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size2;
            return size2;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public String getWorkDays(int i7) {
            return this.workDays_.get(i7);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public ByteString getWorkDaysBytes(int i7) {
            return this.workDays_.getByteString(i7);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public int getWorkDaysCount() {
            return this.workDays_.size();
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public ProtocolStringList getWorkDaysList() {
            return this.workDays_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.ClockHolidayOrBuilder
        public boolean hasYear() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasYear()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getYear();
            }
            if (getFreeDaysCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getFreeDaysList().hashCode();
            }
            if (getWorkDaysCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getWorkDaysList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_ClockHoliday_fieldAccessorTable.ensureFieldAccessorsInitialized(ClockHoliday.class, Builder.class);
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
            if (hasYear()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeUInt32(1, this.year_);
            }
            for (int i7 = 0; i7 < this.freeDays_.size(); i7++) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.freeDays_.getRaw(i7));
            }
            for (int i8 = 0; i8 < this.workDays_.size(); i8++) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.workDays_.getRaw(i8));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ClockHoliday(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            ByteString bytes;
            LazyStringList lazyStringList;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            int i7 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (tag == 18) {
                                    bytes = codedInputStream.readBytes();
                                    if ((i7 & 2) != 2) {
                                        this.freeDays_ = new LazyStringArrayList();
                                        i7 |= 2;
                                    }
                                    lazyStringList = this.freeDays_;
                                } else if (tag == 26) {
                                    bytes = codedInputStream.readBytes();
                                    if ((i7 & 4) != 4) {
                                        this.workDays_ = new LazyStringArrayList();
                                        i7 |= 4;
                                    }
                                    lazyStringList = this.workDays_;
                                } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                                lazyStringList.add(bytes);
                            } else {
                                this.bitField0_ |= 1;
                                this.year_ = codedInputStream.readUInt32();
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.setUnfinishedMessage(this);
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i7 & 2) == 2) {
                        this.freeDays_ = this.freeDays_.getUnmodifiableView();
                    }
                    if ((i7 & 4) == 4) {
                        this.workDays_ = this.workDays_.getUnmodifiableView();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i7 & 2) == 2) {
                this.freeDays_ = this.freeDays_.getUnmodifiableView();
            }
            if ((i7 & 4) == 4) {
                this.workDays_ = this.workDays_.getUnmodifiableView();
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(ClockHoliday clockHoliday) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clockHoliday);
        }

        public static ClockHoliday parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockHoliday) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClockHoliday parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClockHoliday parseFrom(CodedInputStream codedInputStream) {
            return (ClockHoliday) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClockHoliday getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ClockHoliday(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClockHoliday parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockHoliday) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ClockHoliday parseFrom(InputStream inputStream) {
            return (ClockHoliday) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ClockHoliday parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockHoliday) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClockHoliday parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ClockHoliday parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ClockHoliday parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ClockHoliday parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ClockHolidayOrBuilder extends MessageOrBuilder {
        String getFreeDays(int i7);

        ByteString getFreeDaysBytes(int i7);

        int getFreeDaysCount();

        List<String> getFreeDaysList();

        String getWorkDays(int i7);

        ByteString getWorkDaysBytes(int i7);

        int getWorkDaysCount();

        List<String> getWorkDaysList();

        int getYear();

        boolean hasYear();
    }

    public enum ClockMode implements ProtocolMessageEnum {
        CLOCK_ONCE(0),
        CLOCK_EVERY_DAY(1),
        CLOCK_WORKDAY(2),
        CLOCK_HOLIDAY(3),
        CLOCK_MONDAY_TO_FRIDAY(4),
        CLOCK_CUSTOM(5);

        public static final int CLOCK_CUSTOM_VALUE = 5;
        public static final int CLOCK_EVERY_DAY_VALUE = 1;
        public static final int CLOCK_HOLIDAY_VALUE = 3;
        public static final int CLOCK_MONDAY_TO_FRIDAY_VALUE = 4;
        public static final int CLOCK_ONCE_VALUE = 0;
        public static final int CLOCK_WORKDAY_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<ClockMode> internalValueMap = new Internal.EnumLiteMap<ClockMode>() { // from class: com.zh.wear.protobuf.CommonProtos.ClockMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ClockMode findValueByNumber(int i7) {
                return ClockMode.forNumber(i7);
            }
        };
        private static final ClockMode[] VALUES = values();

        ClockMode(int i7) {
            this.value = i7;
        }

        public static ClockMode forNumber(int i7) {
            if (i7 == 0) {
                return CLOCK_ONCE;
            }
            if (i7 == 1) {
                return CLOCK_EVERY_DAY;
            }
            if (i7 == 2) {
                return CLOCK_WORKDAY;
            }
            if (i7 == 3) {
                return CLOCK_HOLIDAY;
            }
            if (i7 == 4) {
                return CLOCK_MONDAY_TO_FRIDAY;
            }
            if (i7 != 5) {
                return null;
            }
            return CLOCK_CUSTOM;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<ClockMode> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static ClockMode valueOf(int i7) {
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

        public static ClockMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Date extends GeneratedMessageV3 implements DateOrBuilder {
        public static final int DAY_FIELD_NUMBER = 3;
        public static final int MONTH_FIELD_NUMBER = 2;
        public static final int YEAR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int day_;
        private byte memoizedIsInitialized;
        private int month_;
        private int year_;
        private static final Date DEFAULT_INSTANCE = new Date();

        @Deprecated
        public static final Parser<Date> PARSER = new AbstractParser<Date>() { // from class: com.zh.wear.protobuf.CommonProtos.Date.1
            @Override // com.google.protobuf.Parser
            public Date parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Date(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DateOrBuilder {
            private int bitField0_;
            private int day_;
            private int month_;
            private int year_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_Date_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDay() {
                this.bitField0_ &= -5;
                this.day_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMonth() {
                this.bitField0_ &= -3;
                this.month_ = 0;
                onChanged();
                return this;
            }

            public Builder clearYear() {
                this.bitField0_ &= -2;
                this.year_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
            public int getDay() {
                return this.day_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_Date_descriptor;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
            public int getMonth() {
                return this.month_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
            public int getYear() {
                return this.year_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
            public boolean hasDay() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
            public boolean hasMonth() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
            public boolean hasYear() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_Date_fieldAccessorTable.ensureFieldAccessorsInitialized(Date.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasYear() && hasMonth() && hasDay();
            }

            public Builder setDay(int i7) {
                this.bitField0_ |= 4;
                this.day_ = i7;
                onChanged();
                return this;
            }

            public Builder setMonth(int i7) {
                this.bitField0_ |= 2;
                this.month_ = i7;
                onChanged();
                return this;
            }

            public Builder setYear(int i7) {
                this.bitField0_ |= 1;
                this.year_ = i7;
                onChanged();
                return this;
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
            public Date build() {
                Date dateBuildPartial = buildPartial();
                if (dateBuildPartial.isInitialized()) {
                    return dateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Date buildPartial() {
                Date date = new Date(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                date.year_ = this.year_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                date.month_ = this.month_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                date.day_ = this.day_;
                date.bitField0_ = i8;
                onBuilt();
                return date;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Date getDefaultInstanceForType() {
                return Date.getDefaultInstance();
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
                this.year_ = 0;
                int i7 = this.bitField0_;
                this.month_ = 0;
                this.day_ = 0;
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
            public com.zh.wear.protobuf.CommonProtos.Date.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CommonProtos$Date> r1 = com.zh.wear.protobuf.CommonProtos.Date.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CommonProtos$Date r3 = (com.zh.wear.protobuf.CommonProtos.Date) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CommonProtos$Date r4 = (com.zh.wear.protobuf.CommonProtos.Date) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CommonProtos.Date.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CommonProtos$Date$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Date) {
                    return mergeFrom((Date) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Date date) {
                if (date == Date.getDefaultInstance()) {
                    return this;
                }
                if (date.hasYear()) {
                    setYear(date.getYear());
                }
                if (date.hasMonth()) {
                    setMonth(date.getMonth());
                }
                if (date.hasDay()) {
                    setDay(date.getDay());
                }
                mergeUnknownFields(((GeneratedMessage) date).unknownFields);
                onChanged();
                return this;
            }
        }

        private Date() {
            this.memoizedIsInitialized = (byte) -1;
            this.year_ = 0;
            this.month_ = 0;
            this.day_ = 0;
        }

        public static Date getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_Date_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Date parseDelimitedFrom(InputStream inputStream) {
            return (Date) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Date parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Date> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Date)) {
                return super.equals(obj);
            }
            Date date = (Date) obj;
            boolean z6 = hasYear() == date.hasYear();
            if (hasYear()) {
                z6 = z6 && getYear() == date.getYear();
            }
            boolean z7 = z6 && hasMonth() == date.hasMonth();
            if (hasMonth()) {
                z7 = z7 && getMonth() == date.getMonth();
            }
            boolean z8 = z7 && hasDay() == date.hasDay();
            if (hasDay()) {
                z8 = z8 && getDay() == date.getDay();
            }
            return z8 && this.unknownFields.equals(date.unknownFields);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
        public int getDay() {
            return this.day_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
        public int getMonth() {
            return this.month_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Date> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.year_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.month_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.day_);
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
        public boolean hasDay() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
        public boolean hasMonth() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.DateOrBuilder
        public boolean hasYear() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasYear()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getYear();
            }
            if (hasMonth()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMonth();
            }
            if (hasDay()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDay();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_Date_fieldAccessorTable.ensureFieldAccessorsInitialized(Date.class, Builder.class);
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
            if (!hasYear()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMonth()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDay()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeUInt32(1, this.year_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.month_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeUInt32(3, this.day_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Date(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.year_ = codedInputStream.readUInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.month_ = codedInputStream.readUInt32();
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.day_ = codedInputStream.readUInt32();
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

        public static Builder newBuilder(Date date) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(date);
        }

        public static Date parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Date) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Date parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Date parseFrom(CodedInputStream codedInputStream) {
            return (Date) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Date getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Date(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Date parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Date) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Date parseFrom(InputStream inputStream) {
            return (Date) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Date parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Date) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Date parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Date parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Date parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Date parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface DateOrBuilder extends MessageOrBuilder {
        int getDay();

        int getMonth();

        int getYear();

        boolean hasDay();

        boolean hasMonth();

        boolean hasYear();
    }

    public enum ErrorCode implements ProtocolMessageEnum {
        NO_ERROR(0),
        NOT_SUPPORT(1),
        DEPENDENCY_NOT_READY(2),
        SET_FAILED(3),
        PARAM_ERROR(4),
        UNKNOWN(255);

        public static final int DEPENDENCY_NOT_READY_VALUE = 2;
        public static final int NOT_SUPPORT_VALUE = 1;
        public static final int NO_ERROR_VALUE = 0;
        public static final int PARAM_ERROR_VALUE = 4;
        public static final int SET_FAILED_VALUE = 3;
        public static final int UNKNOWN_VALUE = 255;
        private final int value;
        private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() { // from class: com.zh.wear.protobuf.CommonProtos.ErrorCode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ErrorCode findValueByNumber(int i7) {
                return ErrorCode.forNumber(i7);
            }
        };
        private static final ErrorCode[] VALUES = values();

        ErrorCode(int i7) {
            this.value = i7;
        }

        public static ErrorCode forNumber(int i7) {
            if (i7 == 255) {
                return UNKNOWN;
            }
            if (i7 == 0) {
                return NO_ERROR;
            }
            if (i7 == 1) {
                return NOT_SUPPORT;
            }
            if (i7 == 2) {
                return DEPENDENCY_NOT_READY;
            }
            if (i7 == 3) {
                return SET_FAILED;
            }
            if (i7 != 4) {
                return null;
            }
            return PARAM_ERROR;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static ErrorCode valueOf(int i7) {
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

        public static ErrorCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class KeyValue extends GeneratedMessageV3 implements KeyValueOrBuilder {
        public static final int KEY_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object key_;
        private byte memoizedIsInitialized;
        private int value_;
        private static final KeyValue DEFAULT_INSTANCE = new KeyValue();

        @Deprecated
        public static final Parser<KeyValue> PARSER = new AbstractParser<KeyValue>() { // from class: com.zh.wear.protobuf.CommonProtos.KeyValue.1
            @Override // com.google.protobuf.Parser
            public KeyValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new KeyValue(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements KeyValueOrBuilder {
            private int bitField0_;
            private Object key_;
            private int value_;

            private Builder() {
                this.key_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_KeyValue_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearKey() {
                this.bitField0_ &= -2;
                this.key_ = KeyValue.getDefaultInstance().getKey();
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= -3;
                this.value_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_KeyValue_descriptor;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
            public String getKey() {
                Object obj = this.key_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.key_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
            public int getValue() {
                return this.value_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_KeyValue_fieldAccessorTable.ensureFieldAccessorsInitialized(KeyValue.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasKey() && hasValue();
            }

            public Builder setKey(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.key_ = str;
                onChanged();
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.key_ = byteString;
                onChanged();
                return this;
            }

            public Builder setValue(int i7) {
                this.bitField0_ |= 2;
                this.value_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.key_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KeyValue build() {
                KeyValue keyValueBuildPartial = buildPartial();
                if (keyValueBuildPartial.isInitialized()) {
                    return keyValueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) keyValueBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KeyValue buildPartial() {
                KeyValue keyValue = new KeyValue(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                keyValue.key_ = this.key_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                keyValue.value_ = this.value_;
                keyValue.bitField0_ = i8;
                onBuilt();
                return keyValue;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public KeyValue getDefaultInstanceForType() {
                return KeyValue.getDefaultInstance();
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
                this.key_ = "";
                int i7 = this.bitField0_;
                this.value_ = 0;
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
            public com.zh.wear.protobuf.CommonProtos.KeyValue.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CommonProtos$KeyValue> r1 = com.zh.wear.protobuf.CommonProtos.KeyValue.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CommonProtos$KeyValue r3 = (com.zh.wear.protobuf.CommonProtos.KeyValue) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CommonProtos$KeyValue r4 = (com.zh.wear.protobuf.CommonProtos.KeyValue) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CommonProtos.KeyValue.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CommonProtos$KeyValue$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof KeyValue) {
                    return mergeFrom((KeyValue) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(KeyValue keyValue) {
                if (keyValue == KeyValue.getDefaultInstance()) {
                    return this;
                }
                if (keyValue.hasKey()) {
                    this.bitField0_ |= 1;
                    this.key_ = keyValue.key_;
                    onChanged();
                }
                if (keyValue.hasValue()) {
                    setValue(keyValue.getValue());
                }
                mergeUnknownFields(((GeneratedMessage) keyValue).unknownFields);
                onChanged();
                return this;
            }
        }

        private KeyValue() {
            this.memoizedIsInitialized = (byte) -1;
            this.key_ = "";
            this.value_ = 0;
        }

        public static KeyValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_KeyValue_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static KeyValue parseDelimitedFrom(InputStream inputStream) {
            return (KeyValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static KeyValue parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<KeyValue> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyValue)) {
                return super.equals(obj);
            }
            KeyValue keyValue = (KeyValue) obj;
            boolean z6 = hasKey() == keyValue.hasKey();
            if (hasKey()) {
                z6 = z6 && getKey().equals(keyValue.getKey());
            }
            boolean z7 = z6 && hasValue() == keyValue.hasValue();
            if (hasValue()) {
                z7 = z7 && getValue() == keyValue.getValue();
            }
            return z7 && this.unknownFields.equals(keyValue.unknownFields);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
        public String getKey() {
            Object obj = this.key_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.key_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
        public ByteString getKeyBytes() {
            Object obj = this.key_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.key_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<KeyValue> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.key_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeSInt32Size(2, this.value_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
        public int getValue() {
            return this.value_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.KeyValueOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasKey()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getKey().hashCode();
            }
            if (hasValue()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getValue();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_KeyValue_fieldAccessorTable.ensureFieldAccessorsInitialized(KeyValue.class, Builder.class);
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
            if (!hasKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasValue()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.key_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeSInt32(2, this.value_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private KeyValue(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.key_ = bytes;
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.value_ = codedInputStream.readSInt32();
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

        public static Builder newBuilder(KeyValue keyValue) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(keyValue);
        }

        public static KeyValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KeyValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KeyValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static KeyValue parseFrom(CodedInputStream codedInputStream) {
            return (KeyValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public KeyValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private KeyValue(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static KeyValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KeyValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static KeyValue parseFrom(InputStream inputStream) {
            return (KeyValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static KeyValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KeyValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KeyValue parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static KeyValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static KeyValue parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static KeyValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface KeyValueOrBuilder extends MessageOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        int getValue();

        boolean hasKey();

        boolean hasValue();
    }

    public enum PrepareStatus implements ProtocolMessageEnum {
        READY(0),
        BUSY(1),
        DUPLICATED(2),
        LOW_STORAGE(3),
        LOW_BATTERY(4),
        DOWNGRADE(5);

        public static final int BUSY_VALUE = 1;
        public static final int DOWNGRADE_VALUE = 5;
        public static final int DUPLICATED_VALUE = 2;
        public static final int LOW_BATTERY_VALUE = 4;
        public static final int LOW_STORAGE_VALUE = 3;
        public static final int READY_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<PrepareStatus> internalValueMap = new Internal.EnumLiteMap<PrepareStatus>() { // from class: com.zh.wear.protobuf.CommonProtos.PrepareStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PrepareStatus findValueByNumber(int i7) {
                return PrepareStatus.forNumber(i7);
            }
        };
        private static final PrepareStatus[] VALUES = values();

        PrepareStatus(int i7) {
            this.value = i7;
        }

        public static PrepareStatus forNumber(int i7) {
            if (i7 == 0) {
                return READY;
            }
            if (i7 == 1) {
                return BUSY;
            }
            if (i7 == 2) {
                return DUPLICATED;
            }
            if (i7 == 3) {
                return LOW_STORAGE;
            }
            if (i7 == 4) {
                return LOW_BATTERY;
            }
            if (i7 != 5) {
                return null;
            }
            return DOWNGRADE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<PrepareStatus> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static PrepareStatus valueOf(int i7) {
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

        public static PrepareStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class RangeValue extends GeneratedMessageV3 implements RangeValueOrBuilder {
        public static final int FROM_FIELD_NUMBER = 1;
        public static final int TO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int from_;
        private byte memoizedIsInitialized;
        private int to_;
        private static final RangeValue DEFAULT_INSTANCE = new RangeValue();

        @Deprecated
        public static final Parser<RangeValue> PARSER = new AbstractParser<RangeValue>() { // from class: com.zh.wear.protobuf.CommonProtos.RangeValue.1
            @Override // com.google.protobuf.Parser
            public RangeValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new RangeValue(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RangeValueOrBuilder {
            private int bitField0_;
            private int from_;
            private int to_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_RangeValue_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearFrom() {
                this.bitField0_ &= -2;
                this.from_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTo() {
                this.bitField0_ &= -3;
                this.to_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_RangeValue_descriptor;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
            public int getFrom() {
                return this.from_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
            public int getTo() {
                return this.to_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
            public boolean hasFrom() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
            public boolean hasTo() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_RangeValue_fieldAccessorTable.ensureFieldAccessorsInitialized(RangeValue.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFrom() && hasTo();
            }

            public Builder setFrom(int i7) {
                this.bitField0_ |= 1;
                this.from_ = i7;
                onChanged();
                return this;
            }

            public Builder setTo(int i7) {
                this.bitField0_ |= 2;
                this.to_ = i7;
                onChanged();
                return this;
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
            public RangeValue build() {
                RangeValue rangeValueBuildPartial = buildPartial();
                if (rangeValueBuildPartial.isInitialized()) {
                    return rangeValueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rangeValueBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RangeValue buildPartial() {
                RangeValue rangeValue = new RangeValue(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                rangeValue.from_ = this.from_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                rangeValue.to_ = this.to_;
                rangeValue.bitField0_ = i8;
                onBuilt();
                return rangeValue;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RangeValue getDefaultInstanceForType() {
                return RangeValue.getDefaultInstance();
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
                this.from_ = 0;
                int i7 = this.bitField0_;
                this.to_ = 0;
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
            public com.zh.wear.protobuf.CommonProtos.RangeValue.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CommonProtos$RangeValue> r1 = com.zh.wear.protobuf.CommonProtos.RangeValue.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CommonProtos$RangeValue r3 = (com.zh.wear.protobuf.CommonProtos.RangeValue) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CommonProtos$RangeValue r4 = (com.zh.wear.protobuf.CommonProtos.RangeValue) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CommonProtos.RangeValue.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CommonProtos$RangeValue$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RangeValue) {
                    return mergeFrom((RangeValue) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RangeValue rangeValue) {
                if (rangeValue == RangeValue.getDefaultInstance()) {
                    return this;
                }
                if (rangeValue.hasFrom()) {
                    setFrom(rangeValue.getFrom());
                }
                if (rangeValue.hasTo()) {
                    setTo(rangeValue.getTo());
                }
                mergeUnknownFields(((GeneratedMessage) rangeValue).unknownFields);
                onChanged();
                return this;
            }
        }

        private RangeValue() {
            this.memoizedIsInitialized = (byte) -1;
            this.from_ = 0;
            this.to_ = 0;
        }

        public static RangeValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_RangeValue_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RangeValue parseDelimitedFrom(InputStream inputStream) {
            return (RangeValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RangeValue parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<RangeValue> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RangeValue)) {
                return super.equals(obj);
            }
            RangeValue rangeValue = (RangeValue) obj;
            boolean z6 = hasFrom() == rangeValue.hasFrom();
            if (hasFrom()) {
                z6 = z6 && getFrom() == rangeValue.getFrom();
            }
            boolean z7 = z6 && hasTo() == rangeValue.hasTo();
            if (hasTo()) {
                z7 = z7 && getTo() == rangeValue.getTo();
            }
            return z7 && this.unknownFields.equals(rangeValue.unknownFields);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
        public int getFrom() {
            return this.from_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RangeValue> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeSInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeSInt32Size(1, this.from_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeSInt32Size += CodedOutputStream.computeSInt32Size(2, this.to_);
            }
            int serializedSize = iComputeSInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
        public int getTo() {
            return this.to_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
        public boolean hasFrom() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.RangeValueOrBuilder
        public boolean hasTo() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasFrom()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFrom();
            }
            if (hasTo()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTo();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_RangeValue_fieldAccessorTable.ensureFieldAccessorsInitialized(RangeValue.class, Builder.class);
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
            if (!hasFrom()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTo()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeSInt32(1, this.from_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeSInt32(2, this.to_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private RangeValue(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.from_ = codedInputStream.readSInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.to_ = codedInputStream.readSInt32();
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

        public static Builder newBuilder(RangeValue rangeValue) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rangeValue);
        }

        public static RangeValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RangeValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RangeValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RangeValue parseFrom(CodedInputStream codedInputStream) {
            return (RangeValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RangeValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private RangeValue(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RangeValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RangeValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RangeValue parseFrom(InputStream inputStream) {
            return (RangeValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static RangeValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RangeValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RangeValue parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static RangeValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static RangeValue parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RangeValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface RangeValueOrBuilder extends MessageOrBuilder {
        int getFrom();

        int getTo();

        boolean hasFrom();

        boolean hasTo();
    }

    public enum SportType implements ProtocolMessageEnum {
        NONE(0),
        RUN_OUTDOOR(1),
        WALK_OUTDOOR(2),
        RUN_INDOOR(3),
        CLIMBING(4),
        CROSS_COUNTRY(5),
        RIDE_OUTDOOR(6),
        RIDE_INDOOR(7),
        FREE_TRAINING(8),
        SWIM_INDOOR(9),
        SWIM_OUTDOOR(10),
        ELLIPTICAL_MACHINE(11),
        YOGA(12),
        ROWING_MACHINE(13),
        ROPE_SKIPPING(14),
        HIKING_OUTDOOR(15),
        HIGH_INTERVAL_TRAINING(16),
        TRIATHLON(17),
        SAILBOAT(100),
        PADDLE_BOARD(101),
        WATER_POLO(102),
        AQUATIC_SPORT(103),
        SURFING(104),
        CANOEING(105),
        KAYAK_RAFTING(106),
        ROWING(107),
        MOTORBOAT(108),
        WEB_SWIMMING(109),
        DRIVING(110),
        FANCY_SWIMMING(111),
        SNORKELING(112),
        KITE_SURFING(113),
        ROCK_CLIMBING(200),
        SKATE(201),
        ROLLER_SKATING(202),
        PARKOUR(203),
        ATV(204),
        PARAGLIDER(205),
        CLIMBING_MACHINE(300),
        CLIMB_STAIRS(301),
        STEPPER(302),
        CORE_TRAINING(303),
        FLEXIBILITY_TRAINING(304),
        PILATES(305),
        GYMNASTICS(306),
        STRETCH(307),
        STRENGTH_TRAINING(308),
        CROSS_FIT(309),
        AEROBICS(310),
        PHYSICAL_TRAINING(311),
        WALL_BALL(312),
        DUMBBELL_TRAINING(313),
        BARBELL_TRAINING(314),
        WEIGHTLIFTING(315),
        DEADLIFT(316),
        BOBBY_JUMP(317),
        SIT_UPS(318),
        FUNCTIONAL_TRAINING(319),
        UPPER_LIMB_TRAINING(320),
        LOWER_LIMB_TRAINING(321),
        WAIST_TRAINING(322),
        BACK_TRAINING(323),
        SQUARE_DANCE(400),
        BELLY_DANCE(401),
        BALLET(402),
        STREET_DANCE(403),
        ZUMBA(404),
        NATIONAL_DANCE(405),
        JAZZ(406),
        LATIN_DANCE(407),
        BOXING(500),
        WRESTLING(501),
        MARTIAL_ARTS(502),
        TAICHI(503),
        MUAY_THAI(504),
        JUDO(505),
        TAEKWONDO(506),
        KARATE(507),
        FREE_SPARRING(508),
        SWORDSMANSHIP(509),
        FENCING(510),
        FOOTBALL(600),
        BASKETBALL(601),
        VOLLEYBALL(602),
        BASEBALL(603),
        SOFTBALL(604),
        RUGBY(605),
        HOCKEY(606),
        PINGPONG(607),
        BADMINTON(608),
        TENNIS(609),
        CRICKET(610),
        HANDBALL(611),
        BOWLING(612),
        SQUASH(613),
        BILLIARDS(614),
        SHUTTLECOCK(615),
        BEACH_FOOTBALL(616),
        BEACH_VOLLEYBALL(617),
        SEPAK_TAKRAW(618),
        OUTDOOR_SKATING(700),
        CURLING(701),
        SNOW_SPORTS(702),
        SNOWMOBILE(703),
        PUCK(704),
        SNOW_CAR(705),
        SLED(706),
        ARCHERY(800),
        DARTS(801),
        HORSE_RIDING(802),
        TUG_OF_WAR(803),
        HULA_HOOP(804),
        FLY_KITE(805),
        FISHING(806),
        FRISBEE(807),
        EQUESTTRIAN(10000),
        TRACK_AND_FIELD(10001),
        RACING_CAR(10002);

        public static final int AEROBICS_VALUE = 310;
        public static final int AQUATIC_SPORT_VALUE = 103;
        public static final int ARCHERY_VALUE = 800;
        public static final int ATV_VALUE = 204;
        public static final int BACK_TRAINING_VALUE = 323;
        public static final int BADMINTON_VALUE = 608;
        public static final int BALLET_VALUE = 402;
        public static final int BARBELL_TRAINING_VALUE = 314;
        public static final int BASEBALL_VALUE = 603;
        public static final int BASKETBALL_VALUE = 601;
        public static final int BEACH_FOOTBALL_VALUE = 616;
        public static final int BEACH_VOLLEYBALL_VALUE = 617;
        public static final int BELLY_DANCE_VALUE = 401;
        public static final int BILLIARDS_VALUE = 614;
        public static final int BOBBY_JUMP_VALUE = 317;
        public static final int BOWLING_VALUE = 612;
        public static final int BOXING_VALUE = 500;
        public static final int CANOEING_VALUE = 105;
        public static final int CLIMBING_MACHINE_VALUE = 300;
        public static final int CLIMBING_VALUE = 4;
        public static final int CLIMB_STAIRS_VALUE = 301;
        public static final int CORE_TRAINING_VALUE = 303;
        public static final int CRICKET_VALUE = 610;
        public static final int CROSS_COUNTRY_VALUE = 5;
        public static final int CROSS_FIT_VALUE = 309;
        public static final int CURLING_VALUE = 701;
        public static final int DARTS_VALUE = 801;
        public static final int DEADLIFT_VALUE = 316;
        public static final int DRIVING_VALUE = 110;
        public static final int DUMBBELL_TRAINING_VALUE = 313;
        public static final int ELLIPTICAL_MACHINE_VALUE = 11;
        public static final int EQUESTTRIAN_VALUE = 10000;
        public static final int FANCY_SWIMMING_VALUE = 111;
        public static final int FENCING_VALUE = 510;
        public static final int FISHING_VALUE = 806;
        public static final int FLEXIBILITY_TRAINING_VALUE = 304;
        public static final int FLY_KITE_VALUE = 805;
        public static final int FOOTBALL_VALUE = 600;
        public static final int FREE_SPARRING_VALUE = 508;
        public static final int FREE_TRAINING_VALUE = 8;
        public static final int FRISBEE_VALUE = 807;
        public static final int FUNCTIONAL_TRAINING_VALUE = 319;
        public static final int GYMNASTICS_VALUE = 306;
        public static final int HANDBALL_VALUE = 611;
        public static final int HIGH_INTERVAL_TRAINING_VALUE = 16;
        public static final int HIKING_OUTDOOR_VALUE = 15;
        public static final int HOCKEY_VALUE = 606;
        public static final int HORSE_RIDING_VALUE = 802;
        public static final int HULA_HOOP_VALUE = 804;
        public static final int JAZZ_VALUE = 406;
        public static final int JUDO_VALUE = 505;
        public static final int KARATE_VALUE = 507;
        public static final int KAYAK_RAFTING_VALUE = 106;
        public static final int KITE_SURFING_VALUE = 113;
        public static final int LATIN_DANCE_VALUE = 407;
        public static final int LOWER_LIMB_TRAINING_VALUE = 321;
        public static final int MARTIAL_ARTS_VALUE = 502;
        public static final int MOTORBOAT_VALUE = 108;
        public static final int MUAY_THAI_VALUE = 504;
        public static final int NATIONAL_DANCE_VALUE = 405;
        public static final int NONE_VALUE = 0;
        public static final int OUTDOOR_SKATING_VALUE = 700;
        public static final int PADDLE_BOARD_VALUE = 101;
        public static final int PARAGLIDER_VALUE = 205;
        public static final int PARKOUR_VALUE = 203;
        public static final int PHYSICAL_TRAINING_VALUE = 311;
        public static final int PILATES_VALUE = 305;
        public static final int PINGPONG_VALUE = 607;
        public static final int PUCK_VALUE = 704;
        public static final int RACING_CAR_VALUE = 10002;
        public static final int RIDE_INDOOR_VALUE = 7;
        public static final int RIDE_OUTDOOR_VALUE = 6;
        public static final int ROCK_CLIMBING_VALUE = 200;
        public static final int ROLLER_SKATING_VALUE = 202;
        public static final int ROPE_SKIPPING_VALUE = 14;
        public static final int ROWING_MACHINE_VALUE = 13;
        public static final int ROWING_VALUE = 107;
        public static final int RUGBY_VALUE = 605;
        public static final int RUN_INDOOR_VALUE = 3;
        public static final int RUN_OUTDOOR_VALUE = 1;
        public static final int SAILBOAT_VALUE = 100;
        public static final int SEPAK_TAKRAW_VALUE = 618;
        public static final int SHUTTLECOCK_VALUE = 615;
        public static final int SIT_UPS_VALUE = 318;
        public static final int SKATE_VALUE = 201;
        public static final int SLED_VALUE = 706;
        public static final int SNORKELING_VALUE = 112;
        public static final int SNOWMOBILE_VALUE = 703;
        public static final int SNOW_CAR_VALUE = 705;
        public static final int SNOW_SPORTS_VALUE = 702;
        public static final int SOFTBALL_VALUE = 604;
        public static final int SQUARE_DANCE_VALUE = 400;
        public static final int SQUASH_VALUE = 613;
        public static final int STEPPER_VALUE = 302;
        public static final int STREET_DANCE_VALUE = 403;
        public static final int STRENGTH_TRAINING_VALUE = 308;
        public static final int STRETCH_VALUE = 307;
        public static final int SURFING_VALUE = 104;
        public static final int SWIM_INDOOR_VALUE = 9;
        public static final int SWIM_OUTDOOR_VALUE = 10;
        public static final int SWORDSMANSHIP_VALUE = 509;
        public static final int TAEKWONDO_VALUE = 506;
        public static final int TAICHI_VALUE = 503;
        public static final int TENNIS_VALUE = 609;
        public static final int TRACK_AND_FIELD_VALUE = 10001;
        public static final int TRIATHLON_VALUE = 17;
        public static final int TUG_OF_WAR_VALUE = 803;
        public static final int UPPER_LIMB_TRAINING_VALUE = 320;
        public static final int VOLLEYBALL_VALUE = 602;
        public static final int WAIST_TRAINING_VALUE = 322;
        public static final int WALK_OUTDOOR_VALUE = 2;
        public static final int WALL_BALL_VALUE = 312;
        public static final int WATER_POLO_VALUE = 102;
        public static final int WEB_SWIMMING_VALUE = 109;
        public static final int WEIGHTLIFTING_VALUE = 315;
        public static final int WRESTLING_VALUE = 501;
        public static final int YOGA_VALUE = 12;
        public static final int ZUMBA_VALUE = 404;
        private final int value;
        private static final Internal.EnumLiteMap<SportType> internalValueMap = new Internal.EnumLiteMap<SportType>() { // from class: com.zh.wear.protobuf.CommonProtos.SportType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SportType findValueByNumber(int i7) {
                return SportType.forNumber(i7);
            }
        };
        private static final SportType[] VALUES = values();

        SportType(int i7) {
            this.value = i7;
        }

        public static SportType forNumber(int i7) {
            switch (i7) {
                case 0:
                    return NONE;
                case 1:
                    return RUN_OUTDOOR;
                case 2:
                    return WALK_OUTDOOR;
                case 3:
                    return RUN_INDOOR;
                case 4:
                    return CLIMBING;
                case 5:
                    return CROSS_COUNTRY;
                case 6:
                    return RIDE_OUTDOOR;
                case 7:
                    return RIDE_INDOOR;
                case 8:
                    return FREE_TRAINING;
                case 9:
                    return SWIM_INDOOR;
                case 10:
                    return SWIM_OUTDOOR;
                case 11:
                    return ELLIPTICAL_MACHINE;
                case 12:
                    return YOGA;
                case 13:
                    return ROWING_MACHINE;
                case 14:
                    return ROPE_SKIPPING;
                case 15:
                    return HIKING_OUTDOOR;
                case 16:
                    return HIGH_INTERVAL_TRAINING;
                case 17:
                    return TRIATHLON;
                default:
                    switch (i7) {
                        case 100:
                            return SAILBOAT;
                        case 101:
                            return PADDLE_BOARD;
                        case 102:
                            return WATER_POLO;
                        case 103:
                            return AQUATIC_SPORT;
                        case 104:
                            return SURFING;
                        case 105:
                            return CANOEING;
                        case 106:
                            return KAYAK_RAFTING;
                        case 107:
                            return ROWING;
                        case 108:
                            return MOTORBOAT;
                        case 109:
                            return WEB_SWIMMING;
                        case 110:
                            return DRIVING;
                        case 111:
                            return FANCY_SWIMMING;
                        case 112:
                            return SNORKELING;
                        case 113:
                            return KITE_SURFING;
                        default:
                            switch (i7) {
                                case 200:
                                    return ROCK_CLIMBING;
                                case 201:
                                    return SKATE;
                                case 202:
                                    return ROLLER_SKATING;
                                case 203:
                                    return PARKOUR;
                                case 204:
                                    return ATV;
                                case 205:
                                    return PARAGLIDER;
                                default:
                                    switch (i7) {
                                        case 300:
                                            return CLIMBING_MACHINE;
                                        case 301:
                                            return CLIMB_STAIRS;
                                        case 302:
                                            return STEPPER;
                                        case 303:
                                            return CORE_TRAINING;
                                        case 304:
                                            return FLEXIBILITY_TRAINING;
                                        case 305:
                                            return PILATES;
                                        case 306:
                                            return GYMNASTICS;
                                        case 307:
                                            return STRETCH;
                                        case 308:
                                            return STRENGTH_TRAINING;
                                        case 309:
                                            return CROSS_FIT;
                                        case 310:
                                            return AEROBICS;
                                        case 311:
                                            return PHYSICAL_TRAINING;
                                        case 312:
                                            return WALL_BALL;
                                        case 313:
                                            return DUMBBELL_TRAINING;
                                        case 314:
                                            return BARBELL_TRAINING;
                                        case 315:
                                            return WEIGHTLIFTING;
                                        case 316:
                                            return DEADLIFT;
                                        case 317:
                                            return BOBBY_JUMP;
                                        case 318:
                                            return SIT_UPS;
                                        case 319:
                                            return FUNCTIONAL_TRAINING;
                                        case 320:
                                            return UPPER_LIMB_TRAINING;
                                        case 321:
                                            return LOWER_LIMB_TRAINING;
                                        case 322:
                                            return WAIST_TRAINING;
                                        case 323:
                                            return BACK_TRAINING;
                                        default:
                                            switch (i7) {
                                                case 400:
                                                    return SQUARE_DANCE;
                                                case 401:
                                                    return BELLY_DANCE;
                                                case 402:
                                                    return BALLET;
                                                case 403:
                                                    return STREET_DANCE;
                                                case 404:
                                                    return ZUMBA;
                                                case 405:
                                                    return NATIONAL_DANCE;
                                                case 406:
                                                    return JAZZ;
                                                case 407:
                                                    return LATIN_DANCE;
                                                default:
                                                    switch (i7) {
                                                        case 500:
                                                            return BOXING;
                                                        case 501:
                                                            return WRESTLING;
                                                        case 502:
                                                            return MARTIAL_ARTS;
                                                        case 503:
                                                            return TAICHI;
                                                        case 504:
                                                            return MUAY_THAI;
                                                        case 505:
                                                            return JUDO;
                                                        case 506:
                                                            return TAEKWONDO;
                                                        case 507:
                                                            return KARATE;
                                                        case 508:
                                                            return FREE_SPARRING;
                                                        case 509:
                                                            return SWORDSMANSHIP;
                                                        case 510:
                                                            return FENCING;
                                                        default:
                                                            switch (i7) {
                                                                case 600:
                                                                    return FOOTBALL;
                                                                case 601:
                                                                    return BASKETBALL;
                                                                case 602:
                                                                    return VOLLEYBALL;
                                                                case 603:
                                                                    return BASEBALL;
                                                                case 604:
                                                                    return SOFTBALL;
                                                                case 605:
                                                                    return RUGBY;
                                                                case 606:
                                                                    return HOCKEY;
                                                                case 607:
                                                                    return PINGPONG;
                                                                case 608:
                                                                    return BADMINTON;
                                                                case 609:
                                                                    return TENNIS;
                                                                case 610:
                                                                    return CRICKET;
                                                                case 611:
                                                                    return HANDBALL;
                                                                case 612:
                                                                    return BOWLING;
                                                                case 613:
                                                                    return SQUASH;
                                                                case 614:
                                                                    return BILLIARDS;
                                                                case 615:
                                                                    return SHUTTLECOCK;
                                                                case 616:
                                                                    return BEACH_FOOTBALL;
                                                                case 617:
                                                                    return BEACH_VOLLEYBALL;
                                                                case 618:
                                                                    return SEPAK_TAKRAW;
                                                                default:
                                                                    switch (i7) {
                                                                        case 700:
                                                                            return OUTDOOR_SKATING;
                                                                        case 701:
                                                                            return CURLING;
                                                                        case 702:
                                                                            return SNOW_SPORTS;
                                                                        case 703:
                                                                            return SNOWMOBILE;
                                                                        case 704:
                                                                            return PUCK;
                                                                        case 705:
                                                                            return SNOW_CAR;
                                                                        case 706:
                                                                            return SLED;
                                                                        default:
                                                                            switch (i7) {
                                                                                case 800:
                                                                                    return ARCHERY;
                                                                                case 801:
                                                                                    return DARTS;
                                                                                case 802:
                                                                                    return HORSE_RIDING;
                                                                                case 803:
                                                                                    return TUG_OF_WAR;
                                                                                case 804:
                                                                                    return HULA_HOOP;
                                                                                case 805:
                                                                                    return FLY_KITE;
                                                                                case 806:
                                                                                    return FISHING;
                                                                                case 807:
                                                                                    return FRISBEE;
                                                                                default:
                                                                                    switch (i7) {
                                                                                        case 10000:
                                                                                            return EQUESTTRIAN;
                                                                                        case 10001:
                                                                                            return TRACK_AND_FIELD;
                                                                                        case 10002:
                                                                                            return RACING_CAR;
                                                                                        default:
                                                                                            return null;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<SportType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static SportType valueOf(int i7) {
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

        public static SportType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Time extends GeneratedMessageV3 implements TimeOrBuilder {
        public static final int HOUR_FIELD_NUMBER = 1;
        public static final int MILLISECOND_FIELD_NUMBER = 4;
        public static final int MINUTER_FIELD_NUMBER = 2;
        public static final int SECOND_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int hour_;
        private byte memoizedIsInitialized;
        private int millisecond_;
        private int minuter_;
        private int second_;
        private static final Time DEFAULT_INSTANCE = new Time();

        @Deprecated
        public static final Parser<Time> PARSER = new AbstractParser<Time>() { // from class: com.zh.wear.protobuf.CommonProtos.Time.1
            @Override // com.google.protobuf.Parser
            public Time parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Time(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimeOrBuilder {
            private int bitField0_;
            private int hour_;
            private int millisecond_;
            private int minuter_;
            private int second_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_Time_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearHour() {
                this.bitField0_ &= -2;
                this.hour_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMillisecond() {
                this.bitField0_ &= -9;
                this.millisecond_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMinuter() {
                this.bitField0_ &= -3;
                this.minuter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSecond() {
                this.bitField0_ &= -5;
                this.second_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_Time_descriptor;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public int getHour() {
                return this.hour_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public int getMillisecond() {
                return this.millisecond_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public int getMinuter() {
                return this.minuter_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public int getSecond() {
                return this.second_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public boolean hasHour() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public boolean hasMillisecond() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public boolean hasMinuter() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
            public boolean hasSecond() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_Time_fieldAccessorTable.ensureFieldAccessorsInitialized(Time.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasHour() && hasMinuter();
            }

            public Builder setHour(int i7) {
                this.bitField0_ |= 1;
                this.hour_ = i7;
                onChanged();
                return this;
            }

            public Builder setMillisecond(int i7) {
                this.bitField0_ |= 8;
                this.millisecond_ = i7;
                onChanged();
                return this;
            }

            public Builder setMinuter(int i7) {
                this.bitField0_ |= 2;
                this.minuter_ = i7;
                onChanged();
                return this;
            }

            public Builder setSecond(int i7) {
                this.bitField0_ |= 4;
                this.second_ = i7;
                onChanged();
                return this;
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
            public Time build() {
                Time timeBuildPartial = buildPartial();
                if (timeBuildPartial.isInitialized()) {
                    return timeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) timeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Time buildPartial() {
                Time time = new Time(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                time.hour_ = this.hour_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                time.minuter_ = this.minuter_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                time.second_ = this.second_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                time.millisecond_ = this.millisecond_;
                time.bitField0_ = i8;
                onBuilt();
                return time;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Time getDefaultInstanceForType() {
                return Time.getDefaultInstance();
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
                this.hour_ = 0;
                int i7 = this.bitField0_;
                this.minuter_ = 0;
                this.second_ = 0;
                this.millisecond_ = 0;
                this.bitField0_ = i7 & (-16);
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
            public com.zh.wear.protobuf.CommonProtos.Time.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CommonProtos$Time> r1 = com.zh.wear.protobuf.CommonProtos.Time.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CommonProtos$Time r3 = (com.zh.wear.protobuf.CommonProtos.Time) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CommonProtos$Time r4 = (com.zh.wear.protobuf.CommonProtos.Time) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CommonProtos.Time.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CommonProtos$Time$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Time) {
                    return mergeFrom((Time) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Time time) {
                if (time == Time.getDefaultInstance()) {
                    return this;
                }
                if (time.hasHour()) {
                    setHour(time.getHour());
                }
                if (time.hasMinuter()) {
                    setMinuter(time.getMinuter());
                }
                if (time.hasSecond()) {
                    setSecond(time.getSecond());
                }
                if (time.hasMillisecond()) {
                    setMillisecond(time.getMillisecond());
                }
                mergeUnknownFields(((GeneratedMessage) time).unknownFields);
                onChanged();
                return this;
            }
        }

        private Time() {
            this.memoizedIsInitialized = (byte) -1;
            this.hour_ = 0;
            this.minuter_ = 0;
            this.second_ = 0;
            this.millisecond_ = 0;
        }

        public static Time getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_Time_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Time parseDelimitedFrom(InputStream inputStream) {
            return (Time) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Time parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Time> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Time)) {
                return super.equals(obj);
            }
            Time time = (Time) obj;
            boolean z6 = hasHour() == time.hasHour();
            if (hasHour()) {
                z6 = z6 && getHour() == time.getHour();
            }
            boolean z7 = z6 && hasMinuter() == time.hasMinuter();
            if (hasMinuter()) {
                z7 = z7 && getMinuter() == time.getMinuter();
            }
            boolean z8 = z7 && hasSecond() == time.hasSecond();
            if (hasSecond()) {
                z8 = z8 && getSecond() == time.getSecond();
            }
            boolean z9 = z8 && hasMillisecond() == time.hasMillisecond();
            if (hasMillisecond()) {
                z9 = z9 && getMillisecond() == time.getMillisecond();
            }
            return z9 && this.unknownFields.equals(time.unknownFields);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public int getHour() {
            return this.hour_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public int getMillisecond() {
            return this.millisecond_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public int getMinuter() {
            return this.minuter_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Time> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public int getSecond() {
            return this.second_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.hour_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.minuter_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.second_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.millisecond_);
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public boolean hasHour() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public boolean hasMillisecond() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public boolean hasMinuter() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimeOrBuilder
        public boolean hasSecond() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasHour()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getHour();
            }
            if (hasMinuter()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMinuter();
            }
            if (hasSecond()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSecond();
            }
            if (hasMillisecond()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMillisecond();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_Time_fieldAccessorTable.ensureFieldAccessorsInitialized(Time.class, Builder.class);
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
            if (!hasHour()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMinuter()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeUInt32(1, this.hour_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.minuter_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeUInt32(3, this.second_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeUInt32(4, this.millisecond_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Time(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.hour_ = codedInputStream.readUInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.minuter_ = codedInputStream.readUInt32();
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.second_ = codedInputStream.readUInt32();
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.millisecond_ = codedInputStream.readUInt32();
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

        public static Builder newBuilder(Time time) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(time);
        }

        public static Time parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Time) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Time parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Time parseFrom(CodedInputStream codedInputStream) {
            return (Time) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Time getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Time(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Time parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Time) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Time parseFrom(InputStream inputStream) {
            return (Time) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Time parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Time) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Time parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Time parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Time parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Time parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface TimeOrBuilder extends MessageOrBuilder {
        int getHour();

        int getMillisecond();

        int getMinuter();

        int getSecond();

        boolean hasHour();

        boolean hasMillisecond();

        boolean hasMinuter();

        boolean hasSecond();
    }

    public static final class Timezone extends GeneratedMessageV3 implements TimezoneOrBuilder {
        public static final int DST_SAVING_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 3;
        public static final int OFFSET_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dstSaving_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int offset_;
        private static final Timezone DEFAULT_INSTANCE = new Timezone();

        @Deprecated
        public static final Parser<Timezone> PARSER = new AbstractParser<Timezone>() { // from class: com.zh.wear.protobuf.CommonProtos.Timezone.1
            @Override // com.google.protobuf.Parser
            public Timezone parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Timezone(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimezoneOrBuilder {
            private int bitField0_;
            private int dstSaving_;
            private Object id_;
            private int offset_;

            private Builder() {
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_Timezone_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDstSaving() {
                this.bitField0_ &= -3;
                this.dstSaving_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -5;
                this.id_ = Timezone.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -2;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_Timezone_descriptor;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
            public int getDstSaving() {
                return this.dstSaving_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
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

            @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
            public boolean hasDstSaving() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
            public boolean hasOffset() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_Timezone_fieldAccessorTable.ensureFieldAccessorsInitialized(Timezone.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasOffset();
            }

            public Builder setDstSaving(int i7) {
                this.bitField0_ |= 2;
                this.dstSaving_ = i7;
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOffset(int i7) {
                this.bitField0_ |= 1;
                this.offset_ = i7;
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
            public Timezone build() {
                Timezone timezoneBuildPartial = buildPartial();
                if (timezoneBuildPartial.isInitialized()) {
                    return timezoneBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) timezoneBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Timezone buildPartial() {
                Timezone timezone = new Timezone(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                timezone.offset_ = this.offset_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                timezone.dstSaving_ = this.dstSaving_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                timezone.id_ = this.id_;
                timezone.bitField0_ = i8;
                onBuilt();
                return timezone;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Timezone getDefaultInstanceForType() {
                return Timezone.getDefaultInstance();
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
                this.offset_ = 0;
                int i7 = this.bitField0_;
                this.dstSaving_ = 0;
                this.id_ = "";
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
            public com.zh.wear.protobuf.CommonProtos.Timezone.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CommonProtos$Timezone> r1 = com.zh.wear.protobuf.CommonProtos.Timezone.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CommonProtos$Timezone r3 = (com.zh.wear.protobuf.CommonProtos.Timezone) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CommonProtos$Timezone r4 = (com.zh.wear.protobuf.CommonProtos.Timezone) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CommonProtos.Timezone.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CommonProtos$Timezone$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Timezone) {
                    return mergeFrom((Timezone) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Timezone timezone) {
                if (timezone == Timezone.getDefaultInstance()) {
                    return this;
                }
                if (timezone.hasOffset()) {
                    setOffset(timezone.getOffset());
                }
                if (timezone.hasDstSaving()) {
                    setDstSaving(timezone.getDstSaving());
                }
                if (timezone.hasId()) {
                    this.bitField0_ |= 4;
                    this.id_ = timezone.id_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) timezone).unknownFields);
                onChanged();
                return this;
            }
        }

        private Timezone() {
            this.memoizedIsInitialized = (byte) -1;
            this.offset_ = 0;
            this.dstSaving_ = 0;
            this.id_ = "";
        }

        public static Timezone getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_Timezone_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Timezone parseDelimitedFrom(InputStream inputStream) {
            return (Timezone) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Timezone parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Timezone> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Timezone)) {
                return super.equals(obj);
            }
            Timezone timezone = (Timezone) obj;
            boolean z6 = hasOffset() == timezone.hasOffset();
            if (hasOffset()) {
                z6 = z6 && getOffset() == timezone.getOffset();
            }
            boolean z7 = z6 && hasDstSaving() == timezone.hasDstSaving();
            if (hasDstSaving()) {
                z7 = z7 && getDstSaving() == timezone.getDstSaving();
            }
            boolean z8 = z7 && hasId() == timezone.hasId();
            if (hasId()) {
                z8 = z8 && getId().equals(timezone.getId());
            }
            return z8 && this.unknownFields.equals(timezone.unknownFields);
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
        public int getDstSaving() {
            return this.dstSaving_;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
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

        @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Timezone> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeSInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeSInt32Size(1, this.offset_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeSInt32Size += CodedOutputStream.computeSInt32Size(2, this.dstSaving_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeSInt32Size += GeneratedMessage.computeStringSize(3, this.id_);
            }
            int serializedSize = iComputeSInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
        public boolean hasDstSaving() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.CommonProtos.TimezoneOrBuilder
        public boolean hasOffset() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasOffset()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getOffset();
            }
            if (hasDstSaving()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDstSaving();
            }
            if (hasId()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getId().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_Timezone_fieldAccessorTable.ensureFieldAccessorsInitialized(Timezone.class, Builder.class);
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
            if (hasOffset()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeSInt32(1, this.offset_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeSInt32(2, this.dstSaving_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.id_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Timezone(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.offset_ = codedInputStream.readSInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.dstSaving_ = codedInputStream.readSInt32();
                            } else if (tag == 26) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
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

        public static Builder newBuilder(Timezone timezone) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timezone);
        }

        public static Timezone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Timezone) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Timezone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Timezone parseFrom(CodedInputStream codedInputStream) {
            return (Timezone) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Timezone getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Timezone(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Timezone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Timezone) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Timezone parseFrom(InputStream inputStream) {
            return (Timezone) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Timezone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Timezone) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Timezone parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Timezone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Timezone parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Timezone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface TimezoneOrBuilder extends MessageOrBuilder {
        int getDstSaving();

        String getId();

        ByteString getIdBytes();

        int getOffset();

        boolean hasDstSaving();

        boolean hasId();

        boolean hasOffset();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011wear_common.proto\u001a\fnanopb.proto\"W\n\fClockHoliday\u0012\u0013\n\u0004year\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0018\n\tfree_days\u0018\u0002 \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\twork_days\u0018\u0003 \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\"O\n\bTimezone\u0012\u0015\n\u0006offset\u0018\u0001 \u0002(\u0011B\u0005\u0092?\u00028\b\u0012\u0019\n\ndst_saving\u0018\u0002 \u0001(\u0011B\u0005\u0092?\u00028\b\u0012\u0011\n\u0002id\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"E\n\u0004Date\u0012\u0013\n\u0004year\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0014\n\u0005month\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0012\n\u0003day\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b\"f\n\u0004Time\u0012\u0013\n\u0004hour\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0016\n\u0007minuter\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0015\n\u0006second\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001a\n\u000bmillisecond\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\u0010\"4\n\bKeyValue\u0012\u0012\n\u0003key\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005value\u0018\u0002 \u0002(\u0011B\u0005\u0092?\u00028\u0010\"4\n\nRangeValue\u0012\u0013\n\u0004from\u0018\u0001 \u0002(\u0011B\u0005\u0092?\u00028\u0010\u0012\u0011\n\u0002to\u0018\u0002 \u0002(\u0011B\u0005\u0092?\u00028\u0010*s\n\tErrorCode\u0012\f\n\bNO_ERROR\u0010\u0000\u0012\u000f\n\u000bNOT_SUPPORT\u0010\u0001\u0012\u0018\n\u0014DEPENDENCY_NOT_READY\u0010\u0002\u0012\u000e\n\nSET_FAILED\u0010\u0003\u0012\u000f\n\u000bPARAM_ERROR\u0010\u0004\u0012\f\n\u0007UNKNOWN\u0010ÿ\u0001*e\n\rPrepareStatus\u0012\t\n\u0005READY\u0010\u0000\u0012\b\n\u0004BUSY\u0010\u0001\u0012\u000e\n\nDUPLICATED\u0010\u0002\u0012\u000f\n\u000bLOW_STORAGE\u0010\u0003\u0012\u000f\n\u000bLOW_BATTERY\u0010\u0004\u0012\r\n\tDOWNGRADE\u0010\u0005*Ý\u000f\n\tSportType\u0012\b\n\u0004NONE\u0010\u0000\u0012\u000f\n\u000bRUN_OUTDOOR\u0010\u0001\u0012\u0010\n\fWALK_OUTDOOR\u0010\u0002\u0012\u000e\n\nRUN_INDOOR\u0010\u0003\u0012\f\n\bCLIMBING\u0010\u0004\u0012\u0011\n\rCROSS_COUNTRY\u0010\u0005\u0012\u0010\n\fRIDE_OUTDOOR\u0010\u0006\u0012\u000f\n\u000bRIDE_INDOOR\u0010\u0007\u0012\u0011\n\rFREE_TRAINING\u0010\b\u0012\u000f\n\u000bSWIM_INDOOR\u0010\t\u0012\u0010\n\fSWIM_OUTDOOR\u0010\n\u0012\u0016\n\u0012ELLIPTICAL_MACHINE\u0010\u000b\u0012\b\n\u0004YOGA\u0010\f\u0012\u0012\n\u000eROWING_MACHINE\u0010\r\u0012\u0011\n\rROPE_SKIPPING\u0010\u000e\u0012\u0012\n\u000eHIKING_OUTDOOR\u0010\u000f\u0012\u001a\n\u0016HIGH_INTERVAL_TRAINING\u0010\u0010\u0012\r\n\tTRIATHLON\u0010\u0011\u0012\f\n\bSAILBOAT\u0010d\u0012\u0010\n\fPADDLE_BOARD\u0010e\u0012\u000e\n\nWATER_POLO\u0010f\u0012\u0011\n\rAQUATIC_SPORT\u0010g\u0012\u000b\n\u0007SURFING\u0010h\u0012\f\n\bCANOEING\u0010i\u0012\u0011\n\rKAYAK_RAFTING\u0010j\u0012\n\n\u0006ROWING\u0010k\u0012\r\n\tMOTORBOAT\u0010l\u0012\u0010\n\fWEB_SWIMMING\u0010m\u0012\u000b\n\u0007DRIVING\u0010n\u0012\u0012\n\u000eFANCY_SWIMMING\u0010o\u0012\u000e\n\nSNORKELING\u0010p\u0012\u0010\n\fKITE_SURFING\u0010q\u0012\u0012\n\rROCK_CLIMBING\u0010È\u0001\u0012\n\n\u0005SKATE\u0010É\u0001\u0012\u0013\n\u000eROLLER_SKATING\u0010Ê\u0001\u0012\f\n\u0007PARKOUR\u0010Ë\u0001\u0012\b\n\u0003ATV\u0010Ì\u0001\u0012\u000f\n\nPARAGLIDER\u0010Í\u0001\u0012\u0015\n\u0010CLIMBING_MACHINE\u0010¬\u0002\u0012\u0011\n\fCLIMB_STAIRS\u0010\u00ad\u0002\u0012\f\n\u0007STEPPER\u0010®\u0002\u0012\u0012\n\rCORE_TRAINING\u0010¯\u0002\u0012\u0019\n\u0014FLEXIBILITY_TRAINING\u0010°\u0002\u0012\f\n\u0007PILATES\u0010±\u0002\u0012\u000f\n\nGYMNASTICS\u0010²\u0002\u0012\f\n\u0007STRETCH\u0010³\u0002\u0012\u0016\n\u0011STRENGTH_TRAINING\u0010´\u0002\u0012\u000e\n\tCROSS_FIT\u0010µ\u0002\u0012\r\n\bAEROBICS\u0010¶\u0002\u0012\u0016\n\u0011PHYSICAL_TRAINING\u0010·\u0002\u0012\u000e\n\tWALL_BALL\u0010¸\u0002\u0012\u0016\n\u0011DUMBBELL_TRAINING\u0010¹\u0002\u0012\u0015\n\u0010BARBELL_TRAINING\u0010º\u0002\u0012\u0012\n\rWEIGHTLIFTING\u0010»\u0002\u0012\r\n\bDEADLIFT\u0010¼\u0002\u0012\u000f\n\nBOBBY_JUMP\u0010½\u0002\u0012\f\n\u0007SIT_UPS\u0010¾\u0002\u0012\u0018\n\u0013FUNCTIONAL_TRAINING\u0010¿\u0002\u0012\u0018\n\u0013UPPER_LIMB_TRAINING\u0010À\u0002\u0012\u0018\n\u0013LOWER_LIMB_TRAINING\u0010Á\u0002\u0012\u0013\n\u000eWAIST_TRAINING\u0010Â\u0002\u0012\u0012\n\rBACK_TRAINING\u0010Ã\u0002\u0012\u0011\n\fSQUARE_DANCE\u0010\u0090\u0003\u0012\u0010\n\u000bBELLY_DANCE\u0010\u0091\u0003\u0012\u000b\n\u0006BALLET\u0010\u0092\u0003\u0012\u0011\n\fSTREET_DANCE\u0010\u0093\u0003\u0012\n\n\u0005ZUMBA\u0010\u0094\u0003\u0012\u0013\n\u000eNATIONAL_DANCE\u0010\u0095\u0003\u0012\t\n\u0004JAZZ\u0010\u0096\u0003\u0012\u0010\n\u000bLATIN_DANCE\u0010\u0097\u0003\u0012\u000b\n\u0006BOXING\u0010ô\u0003\u0012\u000e\n\tWRESTLING\u0010õ\u0003\u0012\u0011\n\fMARTIAL_ARTS\u0010ö\u0003\u0012\u000b\n\u0006TAICHI\u0010÷\u0003\u0012\u000e\n\tMUAY_THAI\u0010ø\u0003\u0012\t\n\u0004JUDO\u0010ù\u0003\u0012\u000e\n\tTAEKWONDO\u0010ú\u0003\u0012\u000b\n\u0006KARATE\u0010û\u0003\u0012\u0012\n\rFREE_SPARRING\u0010ü\u0003\u0012\u0012\n\rSWORDSMANSHIP\u0010ý\u0003\u0012\f\n\u0007FENCING\u0010þ\u0003\u0012\r\n\bFOOTBALL\u0010Ø\u0004\u0012\u000f\n\nBASKETBALL\u0010Ù\u0004\u0012\u000f\n\nVOLLEYBALL\u0010Ú\u0004\u0012\r\n\bBASEBALL\u0010Û\u0004\u0012\r\n\bSOFTBALL\u0010Ü\u0004\u0012\n\n\u0005RUGBY\u0010Ý\u0004\u0012\u000b\n\u0006HOCKEY\u0010Þ\u0004\u0012\r\n\bPINGPONG\u0010ß\u0004\u0012\u000e\n\tBADMINTON\u0010à\u0004\u0012\u000b\n\u0006TENNIS\u0010á\u0004\u0012\f\n\u0007CRICKET\u0010â\u0004\u0012\r\n\bHANDBALL\u0010ã\u0004\u0012\f\n\u0007BOWLING\u0010ä\u0004\u0012\u000b\n\u0006SQUASH\u0010å\u0004\u0012\u000e\n\tBILLIARDS\u0010æ\u0004\u0012\u0010\n\u000bSHUTTLECOCK\u0010ç\u0004\u0012\u0013\n\u000eBEACH_FOOTBALL\u0010è\u0004\u0012\u0015\n\u0010BEACH_VOLLEYBALL\u0010é\u0004\u0012\u0011\n\fSEPAK_TAKRAW\u0010ê\u0004\u0012\u0014\n\u000fOUTDOOR_SKATING\u0010¼\u0005\u0012\f\n\u0007CURLING\u0010½\u0005\u0012\u0010\n\u000bSNOW_SPORTS\u0010¾\u0005\u0012\u000f\n\nSNOWMOBILE\u0010¿\u0005\u0012\t\n\u0004PUCK\u0010À\u0005\u0012\r\n\bSNOW_CAR\u0010Á\u0005\u0012\t\n\u0004SLED\u0010Â\u0005\u0012\f\n\u0007ARCHERY\u0010 \u0006\u0012\n\n\u0005DARTS\u0010¡\u0006\u0012\u0011\n\fHORSE_RIDING\u0010¢\u0006\u0012\u000f\n\nTUG_OF_WAR\u0010£\u0006\u0012\u000e\n\tHULA_HOOP\u0010¤\u0006\u0012\r\n\bFLY_KITE\u0010¥\u0006\u0012\f\n\u0007FISHING\u0010¦\u0006\u0012\f\n\u0007FRISBEE\u0010§\u0006\u0012\u0010\n\u000bEQUESTTRIAN\u0010\u0090N\u0012\u0014\n\u000fTRACK_AND_FIELD\u0010\u0091N\u0012\u000f\n\nRACING_CAR\u0010\u0092N*\u0084\u0001\n\tClockMode\u0012\u000e\n\nCLOCK_ONCE\u0010\u0000\u0012\u0013\n\u000fCLOCK_EVERY_DAY\u0010\u0001\u0012\u0011\n\rCLOCK_WORKDAY\u0010\u0002\u0012\u0011\n\rCLOCK_HOLIDAY\u0010\u0003\u0012\u001a\n\u0016CLOCK_MONDAY_TO_FRIDAY\u0010\u0004\u0012\u0010\n\fCLOCK_CUSTOM\u0010\u0005B$\n\u0014com.zh.wear.protobufB\fCommonProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.CommonProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = CommonProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_ClockHoliday_descriptor = descriptor2;
        internal_static_ClockHoliday_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Year", "FreeDays", "WorkDays"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_Timezone_descriptor = descriptor3;
        internal_static_Timezone_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Offset", "DstSaving", "Id"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_Date_descriptor = descriptor4;
        internal_static_Date_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Year", "Month", "Day"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_Time_descriptor = descriptor5;
        internal_static_Time_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Hour", "Minuter", "Second", "Millisecond"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_KeyValue_descriptor = descriptor6;
        internal_static_KeyValue_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_RangeValue_descriptor = descriptor7;
        internal_static_RangeValue_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{HttpHeaders.f97153t, "To"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private CommonProtos() {
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