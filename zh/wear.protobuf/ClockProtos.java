package com.zh.wear.protobuf;

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
import com.noisefit.DataBinderMapperImpl;
import com.zh.wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ClockProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_ClockIdList_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClockIdList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ClockInfo_Data_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClockInfo_Data_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ClockInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClockInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ClockInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClockInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Clock_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Clock_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WorldClockIdList_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorldClockIdList_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.ClockProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase;

        static {
            int[] iArr = new int[Clock.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase = iArr;
            try {
                iArr[Clock.PayloadCase.CLOCK_INFO_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.CLOCK_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.CLOCK_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.CLOCK_ID_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.ENABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.CLOCK_HOLIDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.CLOCK_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.WORLD_CLOCK_ID_LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.WORLD_CLOCK_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.WORLD_CLOCK_RESULT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[Clock.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static final class Clock extends GeneratedMessageV3 implements ClockOrBuilder {
        public static final int CLOCK_DATA_FIELD_NUMBER = 2;
        public static final int CLOCK_ERROR_FIELD_NUMBER = 8;
        public static final int CLOCK_HOLIDAY_FIELD_NUMBER = 7;
        public static final int CLOCK_ID_LIST_FIELD_NUMBER = 5;
        public static final int CLOCK_INFO_FIELD_NUMBER = 3;
        public static final int CLOCK_INFO_LIST_FIELD_NUMBER = 1;
        public static final int ENABLE_FIELD_NUMBER = 6;
        public static final int ID_FIELD_NUMBER = 4;
        public static final int WORLD_CLOCK_ID_FIELD_NUMBER = 12;
        public static final int WORLD_CLOCK_ID_LIST_FIELD_NUMBER = 11;
        public static final int WORLD_CLOCK_RESULT_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Clock DEFAULT_INSTANCE = new Clock();

        @Deprecated
        public static final Parser<Clock> PARSER = new AbstractParser<Clock>() { // from class: com.zh.wear.protobuf.ClockProtos.Clock.1
            @Override // com.google.protobuf.Parser
            public Clock parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Clock(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClockOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> clockDataBuilder_;
            private SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> clockHolidayBuilder_;
            private SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> clockIdListBuilder_;
            private SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> clockInfoBuilder_;
            private SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> clockInfoListBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> worldClockIdListBuilder_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> getClockDataFieldBuilder() {
                if (this.clockDataBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = ClockInfo.Data.getDefaultInstance();
                    }
                    this.clockDataBuilder_ = new SingleFieldBuilderV3<>((ClockInfo.Data) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.clockDataBuilder_;
            }

            private SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> getClockHolidayFieldBuilder() {
                if (this.clockHolidayBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = CommonProtos.ClockHoliday.getDefaultInstance();
                    }
                    this.clockHolidayBuilder_ = new SingleFieldBuilderV3<>((CommonProtos.ClockHoliday) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.clockHolidayBuilder_;
            }

            private SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> getClockIdListFieldBuilder() {
                if (this.clockIdListBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = ClockIdList.getDefaultInstance();
                    }
                    this.clockIdListBuilder_ = new SingleFieldBuilderV3<>((ClockIdList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.clockIdListBuilder_;
            }

            private SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> getClockInfoFieldBuilder() {
                if (this.clockInfoBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = ClockInfo.getDefaultInstance();
                    }
                    this.clockInfoBuilder_ = new SingleFieldBuilderV3<>((ClockInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.clockInfoBuilder_;
            }

            private SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> getClockInfoListFieldBuilder() {
                if (this.clockInfoListBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = ClockInfo.List.getDefaultInstance();
                    }
                    this.clockInfoListBuilder_ = new SingleFieldBuilderV3<>((ClockInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.clockInfoListBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ClockProtos.internal_static_Clock_descriptor;
            }

            private SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> getWorldClockIdListFieldBuilder() {
                if (this.worldClockIdListBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = WorldClockIdList.getDefaultInstance();
                    }
                    this.worldClockIdListBuilder_ = new SingleFieldBuilderV3<>((WorldClockIdList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.worldClockIdListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearClockData() {
                SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> singleFieldBuilderV3 = this.clockDataBuilder_;
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

            public Builder clearClockError() {
                if (this.payloadCase_ == 8) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearClockHoliday() {
                SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> singleFieldBuilderV3 = this.clockHolidayBuilder_;
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

            public Builder clearClockIdList() {
                SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> singleFieldBuilderV3 = this.clockIdListBuilder_;
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

            public Builder clearClockInfo() {
                SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> singleFieldBuilderV3 = this.clockInfoBuilder_;
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

            public Builder clearClockInfoList() {
                SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> singleFieldBuilderV3 = this.clockInfoListBuilder_;
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

            public Builder clearEnable() {
                if (this.payloadCase_ == 6) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearId() {
                if (this.payloadCase_ == 4) {
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

            public Builder clearWorldClockId() {
                if (this.payloadCase_ == 12) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearWorldClockIdList() {
                SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> singleFieldBuilderV3 = this.worldClockIdListBuilder_;
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

            public Builder clearWorldClockResult() {
                if (this.payloadCase_ == 13) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockInfo.Data getClockData() {
                Object message;
                SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> singleFieldBuilderV3 = this.clockDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return ClockInfo.Data.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return ClockInfo.Data.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ClockInfo.Data) message;
            }

            public ClockInfo.Data.Builder getClockDataBuilder() {
                return (ClockInfo.Data.Builder) getClockDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockInfo.DataOrBuilder getClockDataOrBuilder() {
                SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.clockDataBuilder_) == null) ? i7 == 2 ? (ClockInfo.Data) this.payload_ : ClockInfo.Data.getDefaultInstance() : (ClockInfo.DataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockError getClockError() {
                ClockError clockErrorValueOf;
                return (this.payloadCase_ != 8 || (clockErrorValueOf = ClockError.valueOf(((Integer) this.payload_).intValue())) == null) ? ClockError.EXCEED_LIMIT : clockErrorValueOf;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public CommonProtos.ClockHoliday getClockHoliday() {
                Object message;
                SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> singleFieldBuilderV3 = this.clockHolidayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 7) {
                        return CommonProtos.ClockHoliday.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 7) {
                        return CommonProtos.ClockHoliday.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CommonProtos.ClockHoliday) message;
            }

            public CommonProtos.ClockHoliday.Builder getClockHolidayBuilder() {
                return (CommonProtos.ClockHoliday.Builder) getClockHolidayFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public CommonProtos.ClockHolidayOrBuilder getClockHolidayOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilderV3 = this.clockHolidayBuilder_) == null) ? i7 == 7 ? (CommonProtos.ClockHoliday) this.payload_ : CommonProtos.ClockHoliday.getDefaultInstance() : (CommonProtos.ClockHolidayOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockIdList getClockIdList() {
                Object message;
                SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> singleFieldBuilderV3 = this.clockIdListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 5) {
                        return ClockIdList.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 5) {
                        return ClockIdList.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ClockIdList) message;
            }

            public ClockIdList.Builder getClockIdListBuilder() {
                return (ClockIdList.Builder) getClockIdListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockIdListOrBuilder getClockIdListOrBuilder() {
                SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilderV3 = this.clockIdListBuilder_) == null) ? i7 == 5 ? (ClockIdList) this.payload_ : ClockIdList.getDefaultInstance() : (ClockIdListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockInfo getClockInfo() {
                Object message;
                SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> singleFieldBuilderV3 = this.clockInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return ClockInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return ClockInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ClockInfo) message;
            }

            public ClockInfo.Builder getClockInfoBuilder() {
                return (ClockInfo.Builder) getClockInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockInfo.List getClockInfoList() {
                Object message;
                SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> singleFieldBuilderV3 = this.clockInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return ClockInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return ClockInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ClockInfo.List) message;
            }

            public ClockInfo.List.Builder getClockInfoListBuilder() {
                return (ClockInfo.List.Builder) getClockInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockInfo.ListOrBuilder getClockInfoListOrBuilder() {
                SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.clockInfoListBuilder_) == null) ? i7 == 1 ? (ClockInfo.List) this.payload_ : ClockInfo.List.getDefaultInstance() : (ClockInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ClockInfoOrBuilder getClockInfoOrBuilder() {
                SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.clockInfoBuilder_) == null) ? i7 == 3 ? (ClockInfo) this.payload_ : ClockInfo.getDefaultInstance() : (ClockInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ClockProtos.internal_static_Clock_descriptor;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean getEnable() {
                if (this.payloadCase_ == 6) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public int getId() {
                if (this.payloadCase_ == 4) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public String getWorldClockId() {
                String str = this.payloadCase_ == 12 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 12 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public ByteString getWorldClockIdBytes() {
                String str = this.payloadCase_ == 12 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 12) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public WorldClockIdList getWorldClockIdList() {
                Object message;
                SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> singleFieldBuilderV3 = this.worldClockIdListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 11) {
                        return WorldClockIdList.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 11) {
                        return WorldClockIdList.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WorldClockIdList) message;
            }

            public WorldClockIdList.Builder getWorldClockIdListBuilder() {
                return (WorldClockIdList.Builder) getWorldClockIdListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public WorldClockIdListOrBuilder getWorldClockIdListOrBuilder() {
                SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilderV3 = this.worldClockIdListBuilder_) == null) ? i7 == 11 ? (WorldClockIdList) this.payload_ : WorldClockIdList.getDefaultInstance() : (WorldClockIdListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public WorldClockResult getWorldClockResult() {
                WorldClockResult worldClockResultValueOf;
                return (this.payloadCase_ != 13 || (worldClockResultValueOf = WorldClockResult.valueOf(((Integer) this.payload_).intValue())) == null) ? WorldClockResult.OPERATE_SUCCESS : worldClockResultValueOf;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasClockData() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasClockError() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasClockHoliday() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasClockIdList() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasClockInfo() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasClockInfoList() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasEnable() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasId() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasWorldClockId() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasWorldClockIdList() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
            public boolean hasWorldClockResult() {
                return this.payloadCase_ == 13;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ClockProtos.internal_static_Clock_fieldAccessorTable.ensureFieldAccessorsInitialized(Clock.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasClockInfoList() && !getClockInfoList().isInitialized()) {
                    return false;
                }
                if (hasClockData() && !getClockData().isInitialized()) {
                    return false;
                }
                if (!hasClockInfo() || getClockInfo().isInitialized()) {
                    return !hasClockHoliday() || getClockHoliday().isInitialized();
                }
                return false;
            }

            public Builder mergeClockData(ClockInfo.Data data) {
                SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> singleFieldBuilderV3 = this.clockDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != ClockInfo.Data.getDefaultInstance()) {
                        data = ClockInfo.Data.newBuilder((ClockInfo.Data) this.payload_).mergeFrom(data).buildPartial();
                    }
                    this.payload_ = data;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(data);
                    }
                    this.clockDataBuilder_.setMessage(data);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeClockHoliday(CommonProtos.ClockHoliday clockHoliday) {
                SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> singleFieldBuilderV3 = this.clockHolidayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 7 && this.payload_ != CommonProtos.ClockHoliday.getDefaultInstance()) {
                        clockHoliday = CommonProtos.ClockHoliday.newBuilder((CommonProtos.ClockHoliday) this.payload_).mergeFrom(clockHoliday).buildPartial();
                    }
                    this.payload_ = clockHoliday;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 7) {
                        singleFieldBuilderV3.mergeFrom(clockHoliday);
                    }
                    this.clockHolidayBuilder_.setMessage(clockHoliday);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeClockIdList(ClockIdList clockIdList) {
                SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> singleFieldBuilderV3 = this.clockIdListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 5 && this.payload_ != ClockIdList.getDefaultInstance()) {
                        clockIdList = ClockIdList.newBuilder((ClockIdList) this.payload_).mergeFrom(clockIdList).buildPartial();
                    }
                    this.payload_ = clockIdList;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 5) {
                        singleFieldBuilderV3.mergeFrom(clockIdList);
                    }
                    this.clockIdListBuilder_.setMessage(clockIdList);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeClockInfo(ClockInfo clockInfo) {
                SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> singleFieldBuilderV3 = this.clockInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != ClockInfo.getDefaultInstance()) {
                        clockInfo = ClockInfo.newBuilder((ClockInfo) this.payload_).mergeFrom(clockInfo).buildPartial();
                    }
                    this.payload_ = clockInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(clockInfo);
                    }
                    this.clockInfoBuilder_.setMessage(clockInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeClockInfoList(ClockInfo.List list) {
                SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> singleFieldBuilderV3 = this.clockInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != ClockInfo.List.getDefaultInstance()) {
                        list = ClockInfo.List.newBuilder((ClockInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.clockInfoListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeWorldClockIdList(WorldClockIdList worldClockIdList) {
                SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> singleFieldBuilderV3 = this.worldClockIdListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 11 && this.payload_ != WorldClockIdList.getDefaultInstance()) {
                        worldClockIdList = WorldClockIdList.newBuilder((WorldClockIdList) this.payload_).mergeFrom(worldClockIdList).buildPartial();
                    }
                    this.payload_ = worldClockIdList;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 11) {
                        singleFieldBuilderV3.mergeFrom(worldClockIdList);
                    }
                    this.worldClockIdListBuilder_.setMessage(worldClockIdList);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setClockData(ClockInfo.Data.Builder builder) {
                SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> singleFieldBuilderV3 = this.clockDataBuilder_;
                ClockInfo.Data dataBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = dataBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(dataBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setClockError(ClockError clockError) {
                clockError.getClass();
                this.payloadCase_ = 8;
                this.payload_ = Integer.valueOf(clockError.getNumber());
                onChanged();
                return this;
            }

            public Builder setClockHoliday(CommonProtos.ClockHoliday.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> singleFieldBuilderV3 = this.clockHolidayBuilder_;
                CommonProtos.ClockHoliday clockHolidayBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = clockHolidayBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clockHolidayBuild);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setClockIdList(ClockIdList.Builder builder) {
                SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> singleFieldBuilderV3 = this.clockIdListBuilder_;
                ClockIdList clockIdListBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = clockIdListBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clockIdListBuild);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setClockInfo(ClockInfo.Builder builder) {
                SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> singleFieldBuilderV3 = this.clockInfoBuilder_;
                ClockInfo clockInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = clockInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clockInfoBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setClockInfoList(ClockInfo.List.Builder builder) {
                SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> singleFieldBuilderV3 = this.clockInfoListBuilder_;
                ClockInfo.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setEnable(boolean z6) {
                this.payloadCase_ = 6;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setId(int i7) {
                this.payloadCase_ = 4;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setWorldClockId(String str) {
                str.getClass();
                this.payloadCase_ = 12;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setWorldClockIdBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 12;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setWorldClockIdList(WorldClockIdList.Builder builder) {
                SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> singleFieldBuilderV3 = this.worldClockIdListBuilder_;
                WorldClockIdList worldClockIdListBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = worldClockIdListBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(worldClockIdListBuild);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setWorldClockResult(WorldClockResult worldClockResult) {
                worldClockResult.getClass();
                this.payloadCase_ = 13;
                this.payload_ = Integer.valueOf(worldClockResult.getNumber());
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setClockData(ClockInfo.Data data) {
                SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> singleFieldBuilderV3 = this.clockDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    data.getClass();
                    this.payload_ = data;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(data);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setClockHoliday(CommonProtos.ClockHoliday clockHoliday) {
                SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> singleFieldBuilderV3 = this.clockHolidayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    clockHoliday.getClass();
                    this.payload_ = clockHoliday;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clockHoliday);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setClockIdList(ClockIdList clockIdList) {
                SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> singleFieldBuilderV3 = this.clockIdListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    clockIdList.getClass();
                    this.payload_ = clockIdList;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clockIdList);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setClockInfo(ClockInfo clockInfo) {
                SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> singleFieldBuilderV3 = this.clockInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    clockInfo.getClass();
                    this.payload_ = clockInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clockInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setClockInfoList(ClockInfo.List list) {
                SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> singleFieldBuilderV3 = this.clockInfoListBuilder_;
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

            public Builder setWorldClockIdList(WorldClockIdList worldClockIdList) {
                SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> singleFieldBuilderV3 = this.worldClockIdListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    worldClockIdList.getClass();
                    this.payload_ = worldClockIdList;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(worldClockIdList);
                }
                this.payloadCase_ = 11;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Clock build() {
                Clock clockBuildPartial = buildPartial();
                if (clockBuildPartial.isInitialized()) {
                    return clockBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clockBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Clock buildPartial() {
                Clock clock = new Clock(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<ClockInfo.List, ClockInfo.List.Builder, ClockInfo.ListOrBuilder> singleFieldBuilderV3 = this.clockInfoListBuilder_;
                    clock.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<ClockInfo.Data, ClockInfo.Data.Builder, ClockInfo.DataOrBuilder> singleFieldBuilderV32 = this.clockDataBuilder_;
                    clock.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<ClockInfo, ClockInfo.Builder, ClockInfoOrBuilder> singleFieldBuilderV33 = this.clockInfoBuilder_;
                    clock.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                if (this.payloadCase_ == 4) {
                    clock.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 5) {
                    SingleFieldBuilderV3<ClockIdList, ClockIdList.Builder, ClockIdListOrBuilder> singleFieldBuilderV34 = this.clockIdListBuilder_;
                    clock.payload_ = singleFieldBuilderV34 == null ? this.payload_ : singleFieldBuilderV34.build();
                }
                if (this.payloadCase_ == 6) {
                    clock.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 7) {
                    SingleFieldBuilderV3<CommonProtos.ClockHoliday, CommonProtos.ClockHoliday.Builder, CommonProtos.ClockHolidayOrBuilder> singleFieldBuilderV35 = this.clockHolidayBuilder_;
                    clock.payload_ = singleFieldBuilderV35 == null ? this.payload_ : singleFieldBuilderV35.build();
                }
                if (this.payloadCase_ == 8) {
                    clock.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 11) {
                    SingleFieldBuilderV3<WorldClockIdList, WorldClockIdList.Builder, WorldClockIdListOrBuilder> singleFieldBuilderV36 = this.worldClockIdListBuilder_;
                    clock.payload_ = singleFieldBuilderV36 == null ? this.payload_ : singleFieldBuilderV36.build();
                }
                if (this.payloadCase_ == 12) {
                    clock.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 13) {
                    clock.payload_ = this.payload_;
                }
                clock.bitField0_ = 0;
                clock.payloadCase_ = this.payloadCase_;
                onBuilt();
                return clock;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Clock getDefaultInstanceForType() {
                return Clock.getDefaultInstance();
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
            public com.zh.wear.protobuf.ClockProtos.Clock.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.ClockProtos$Clock> r1 = com.zh.wear.protobuf.ClockProtos.Clock.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.ClockProtos$Clock r3 = (com.zh.wear.protobuf.ClockProtos.Clock) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.ClockProtos$Clock r4 = (com.zh.wear.protobuf.ClockProtos.Clock) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.ClockProtos.Clock.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.ClockProtos$Clock$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Clock) {
                    return mergeFrom((Clock) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Clock clock) {
                if (clock == Clock.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$ClockProtos$Clock$PayloadCase[clock.getPayloadCase().ordinal()]) {
                    case 1:
                        mergeClockInfoList(clock.getClockInfoList());
                        break;
                    case 2:
                        mergeClockData(clock.getClockData());
                        break;
                    case 3:
                        mergeClockInfo(clock.getClockInfo());
                        break;
                    case 4:
                        setId(clock.getId());
                        break;
                    case 5:
                        mergeClockIdList(clock.getClockIdList());
                        break;
                    case 6:
                        setEnable(clock.getEnable());
                        break;
                    case 7:
                        mergeClockHoliday(clock.getClockHoliday());
                        break;
                    case 8:
                        setClockError(clock.getClockError());
                        break;
                    case 9:
                        mergeWorldClockIdList(clock.getWorldClockIdList());
                        break;
                    case 10:
                        this.payloadCase_ = 12;
                        this.payload_ = clock.payload_;
                        onChanged();
                        break;
                    case 11:
                        setWorldClockResult(clock.getWorldClockResult());
                        break;
                }
                mergeUnknownFields(((GeneratedMessage) clock).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum ClockID implements ProtocolMessageEnum {
            GET_CLOCK_LIST(0),
            ADD_CLOCK(1),
            UPDATE_CLOCK(2),
            REMOVE_CLOCK(3),
            REMOVE_CLOCKS(4),
            ENABLE_OR_DISABLE_CLOCK(5),
            SYNC_HOLIDAY(6),
            WEAR_REQUEST_HOLIDAY(7),
            GET_WORLD_CLOCK_LIST(10),
            ADD_WORLD_CLOCK(11),
            REMOVE_WORLD_CLOCK(12),
            REMOVE_WORLD_CLOCKS(13);

            public static final int ADD_CLOCK_VALUE = 1;
            public static final int ADD_WORLD_CLOCK_VALUE = 11;
            public static final int ENABLE_OR_DISABLE_CLOCK_VALUE = 5;
            public static final int GET_CLOCK_LIST_VALUE = 0;
            public static final int GET_WORLD_CLOCK_LIST_VALUE = 10;
            public static final int REMOVE_CLOCKS_VALUE = 4;
            public static final int REMOVE_CLOCK_VALUE = 3;
            public static final int REMOVE_WORLD_CLOCKS_VALUE = 13;
            public static final int REMOVE_WORLD_CLOCK_VALUE = 12;
            public static final int SYNC_HOLIDAY_VALUE = 6;
            public static final int UPDATE_CLOCK_VALUE = 2;
            public static final int WEAR_REQUEST_HOLIDAY_VALUE = 7;
            private final int value;
            private static final Internal.EnumLiteMap<ClockID> internalValueMap = new Internal.EnumLiteMap<ClockID>() { // from class: com.zh.wear.protobuf.ClockProtos.Clock.ClockID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ClockID findValueByNumber(int i7) {
                    return ClockID.forNumber(i7);
                }
            };
            private static final ClockID[] VALUES = values();

            ClockID(int i7) {
                this.value = i7;
            }

            public static ClockID forNumber(int i7) {
                switch (i7) {
                    case 0:
                        return GET_CLOCK_LIST;
                    case 1:
                        return ADD_CLOCK;
                    case 2:
                        return UPDATE_CLOCK;
                    case 3:
                        return REMOVE_CLOCK;
                    case 4:
                        return REMOVE_CLOCKS;
                    case 5:
                        return ENABLE_OR_DISABLE_CLOCK;
                    case 6:
                        return SYNC_HOLIDAY;
                    case 7:
                        return WEAR_REQUEST_HOLIDAY;
                    case 8:
                    case 9:
                    default:
                        return null;
                    case 10:
                        return GET_WORLD_CLOCK_LIST;
                    case 11:
                        return ADD_WORLD_CLOCK;
                    case 12:
                        return REMOVE_WORLD_CLOCK;
                    case 13:
                        return REMOVE_WORLD_CLOCKS;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Clock.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ClockID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static ClockID valueOf(int i7) {
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

            public static ClockID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            CLOCK_INFO_LIST(1),
            CLOCK_DATA(2),
            CLOCK_INFO(3),
            ID(4),
            CLOCK_ID_LIST(5),
            ENABLE(6),
            CLOCK_HOLIDAY(7),
            CLOCK_ERROR(8),
            WORLD_CLOCK_ID_LIST(11),
            WORLD_CLOCK_ID(12),
            WORLD_CLOCK_RESULT(13),
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
                        return CLOCK_INFO_LIST;
                    case 2:
                        return CLOCK_DATA;
                    case 3:
                        return CLOCK_INFO;
                    case 4:
                        return ID;
                    case 5:
                        return CLOCK_ID_LIST;
                    case 6:
                        return ENABLE;
                    case 7:
                        return CLOCK_HOLIDAY;
                    case 8:
                        return CLOCK_ERROR;
                    case 9:
                    case 10:
                    default:
                        return null;
                    case 11:
                        return WORLD_CLOCK_ID_LIST;
                    case 12:
                        return WORLD_CLOCK_ID;
                    case 13:
                        return WORLD_CLOCK_RESULT;
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

        private Clock() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Clock getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClockProtos.internal_static_Clock_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Clock parseDelimitedFrom(InputStream inputStream) {
            return (Clock) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Clock parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Clock> parser() {
            return PARSER;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.ClockProtos.Clock.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockInfo.Data getClockData() {
            return this.payloadCase_ == 2 ? (ClockInfo.Data) this.payload_ : ClockInfo.Data.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockInfo.DataOrBuilder getClockDataOrBuilder() {
            return this.payloadCase_ == 2 ? (ClockInfo.Data) this.payload_ : ClockInfo.Data.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockError getClockError() {
            ClockError clockErrorValueOf;
            return (this.payloadCase_ != 8 || (clockErrorValueOf = ClockError.valueOf(((Integer) this.payload_).intValue())) == null) ? ClockError.EXCEED_LIMIT : clockErrorValueOf;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public CommonProtos.ClockHoliday getClockHoliday() {
            return this.payloadCase_ == 7 ? (CommonProtos.ClockHoliday) this.payload_ : CommonProtos.ClockHoliday.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public CommonProtos.ClockHolidayOrBuilder getClockHolidayOrBuilder() {
            return this.payloadCase_ == 7 ? (CommonProtos.ClockHoliday) this.payload_ : CommonProtos.ClockHoliday.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockIdList getClockIdList() {
            return this.payloadCase_ == 5 ? (ClockIdList) this.payload_ : ClockIdList.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockIdListOrBuilder getClockIdListOrBuilder() {
            return this.payloadCase_ == 5 ? (ClockIdList) this.payload_ : ClockIdList.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockInfo getClockInfo() {
            return this.payloadCase_ == 3 ? (ClockInfo) this.payload_ : ClockInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockInfo.List getClockInfoList() {
            return this.payloadCase_ == 1 ? (ClockInfo.List) this.payload_ : ClockInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockInfo.ListOrBuilder getClockInfoListOrBuilder() {
            return this.payloadCase_ == 1 ? (ClockInfo.List) this.payload_ : ClockInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ClockInfoOrBuilder getClockInfoOrBuilder() {
            return this.payloadCase_ == 3 ? (ClockInfo) this.payload_ : ClockInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean getEnable() {
            if (this.payloadCase_ == 6) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public int getId() {
            if (this.payloadCase_ == 4) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Clock> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (ClockInfo.List) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (ClockInfo.Data) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (ClockInfo) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(4, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (ClockIdList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(6, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (CommonProtos.ClockHoliday) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(8, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 11) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, (WorldClockIdList) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(12, this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(13, ((Integer) this.payload_).intValue());
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public String getWorldClockId() {
            String str = this.payloadCase_ == 12 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 12) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public ByteString getWorldClockIdBytes() {
            String str = this.payloadCase_ == 12 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 12) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public WorldClockIdList getWorldClockIdList() {
            return this.payloadCase_ == 11 ? (WorldClockIdList) this.payload_ : WorldClockIdList.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public WorldClockIdListOrBuilder getWorldClockIdListOrBuilder() {
            return this.payloadCase_ == 11 ? (WorldClockIdList) this.payload_ : WorldClockIdList.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public WorldClockResult getWorldClockResult() {
            WorldClockResult worldClockResultValueOf;
            return (this.payloadCase_ != 13 || (worldClockResultValueOf = WorldClockResult.valueOf(((Integer) this.payload_).intValue())) == null) ? WorldClockResult.OPERATE_SUCCESS : worldClockResultValueOf;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasClockData() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasClockError() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasClockHoliday() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasClockIdList() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasClockInfo() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasClockInfoList() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasEnable() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasId() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasWorldClockId() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasWorldClockIdList() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockOrBuilder
        public boolean hasWorldClockResult() {
            return this.payloadCase_ == 13;
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
                    iHashCode = getClockInfoList().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getClockData().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getClockInfo().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getId();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getClockIdList().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = Internal.hashBoolean(getEnable());
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getClockHoliday().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getClockError().getNumber();
                    break;
                case 9:
                case 10:
                default:
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                case 11:
                    i7 = ((iHashCode2 * 37) + 11) * 53;
                    iHashCode = getWorldClockIdList().hashCode();
                    break;
                case 12:
                    i7 = ((iHashCode2 * 37) + 12) * 53;
                    iHashCode = getWorldClockId().hashCode();
                    break;
                case 13:
                    i7 = ((iHashCode2 * 37) + 13) * 53;
                    iHashCode = getWorldClockResult().getNumber();
                    break;
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClockProtos.internal_static_Clock_fieldAccessorTable.ensureFieldAccessorsInitialized(Clock.class, Builder.class);
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
            if (hasClockInfoList() && !getClockInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasClockData() && !getClockData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasClockInfo() && !getClockInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasClockHoliday() || getClockHoliday().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (ClockInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (ClockInfo.Data) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (ClockInfo) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeUInt32(4, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (ClockIdList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeBool(6, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (CommonProtos.ClockHoliday) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeEnum(8, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (WorldClockIdList) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                GeneratedMessage.writeString(codedOutputStream, 12, this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeEnum(13, ((Integer) this.payload_).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Clock(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            int uInt32;
            Object objValueOf;
            int i7;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        int i8 = 1;
                        switch (tag) {
                            case 0:
                                z6 = true;
                                break;
                            case 10:
                                ClockInfo.List.Builder builder = this.payloadCase_ == 1 ? ((ClockInfo.List) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(ClockInfo.List.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((ClockInfo.List) message);
                                    this.payload_ = builder.buildPartial();
                                }
                                this.payloadCase_ = i8;
                                break;
                            case 18:
                                i8 = 2;
                                ClockInfo.Data.Builder builder2 = this.payloadCase_ == 2 ? ((ClockInfo.Data) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(ClockInfo.Data.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((ClockInfo.Data) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                                this.payloadCase_ = i8;
                                break;
                            case 26:
                                i8 = 3;
                                ClockInfo.Builder builder3 = this.payloadCase_ == 3 ? ((ClockInfo) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(ClockInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((ClockInfo) message3);
                                    this.payload_ = builder3.buildPartial();
                                }
                                this.payloadCase_ = i8;
                                break;
                            case 32:
                                this.payloadCase_ = 4;
                                uInt32 = codedInputStream.readUInt32();
                                objValueOf = Integer.valueOf(uInt32);
                                this.payload_ = objValueOf;
                                break;
                            case 42:
                                i8 = 5;
                                ClockIdList.Builder builder4 = this.payloadCase_ == 5 ? ((ClockIdList) this.payload_).toBuilder() : null;
                                MessageLite message4 = codedInputStream.readMessage(ClockIdList.PARSER, extensionRegistryLite);
                                this.payload_ = message4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((ClockIdList) message4);
                                    this.payload_ = builder4.buildPartial();
                                }
                                this.payloadCase_ = i8;
                                break;
                            case 48:
                                this.payloadCase_ = 6;
                                objValueOf = Boolean.valueOf(codedInputStream.readBool());
                                this.payload_ = objValueOf;
                                break;
                            case 58:
                                i8 = 7;
                                CommonProtos.ClockHoliday.Builder builder5 = this.payloadCase_ == 7 ? ((CommonProtos.ClockHoliday) this.payload_).toBuilder() : null;
                                MessageLite message5 = codedInputStream.readMessage(CommonProtos.ClockHoliday.PARSER, extensionRegistryLite);
                                this.payload_ = message5;
                                if (builder5 != null) {
                                    builder5.mergeFrom((CommonProtos.ClockHoliday) message5);
                                    this.payload_ = builder5.buildPartial();
                                }
                                this.payloadCase_ = i8;
                                break;
                            case 64:
                                uInt32 = codedInputStream.readEnum();
                                i7 = 8;
                                if (ClockError.valueOf(uInt32) != null) {
                                    this.payloadCase_ = 8;
                                    objValueOf = Integer.valueOf(uInt32);
                                    this.payload_ = objValueOf;
                                } else {
                                    builderNewBuilder.mergeVarintField(i7, uInt32);
                                }
                                break;
                            case 90:
                                i8 = 11;
                                WorldClockIdList.Builder builder6 = this.payloadCase_ == 11 ? ((WorldClockIdList) this.payload_).toBuilder() : null;
                                MessageLite message6 = codedInputStream.readMessage(WorldClockIdList.PARSER, extensionRegistryLite);
                                this.payload_ = message6;
                                if (builder6 != null) {
                                    builder6.mergeFrom((WorldClockIdList) message6);
                                    this.payload_ = builder6.buildPartial();
                                }
                                this.payloadCase_ = i8;
                                break;
                            case 98:
                                objValueOf = codedInputStream.readBytes();
                                this.payloadCase_ = 12;
                                this.payload_ = objValueOf;
                                break;
                            case 104:
                                uInt32 = codedInputStream.readEnum();
                                i7 = 13;
                                if (WorldClockResult.valueOf(uInt32) != null) {
                                    this.payloadCase_ = 13;
                                    objValueOf = Integer.valueOf(uInt32);
                                    this.payload_ = objValueOf;
                                } else {
                                    builderNewBuilder.mergeVarintField(i7, uInt32);
                                }
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

        public static Builder newBuilder(Clock clock) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clock);
        }

        public static Clock parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Clock) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Clock parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Clock parseFrom(CodedInputStream codedInputStream) {
            return (Clock) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Clock getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Clock(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Clock parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Clock) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Clock parseFrom(InputStream inputStream) {
            return (Clock) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Clock parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Clock) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Clock parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Clock parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Clock parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Clock parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public enum ClockError implements ProtocolMessageEnum {
        EXCEED_LIMIT(1),
        INVALID_ID(2),
        INVALID_DATA(3),
        NOT_SUPPORT_HOLIDAY(4);

        public static final int EXCEED_LIMIT_VALUE = 1;
        public static final int INVALID_DATA_VALUE = 3;
        public static final int INVALID_ID_VALUE = 2;
        public static final int NOT_SUPPORT_HOLIDAY_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<ClockError> internalValueMap = new Internal.EnumLiteMap<ClockError>() { // from class: com.zh.wear.protobuf.ClockProtos.ClockError.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ClockError findValueByNumber(int i7) {
                return ClockError.forNumber(i7);
            }
        };
        private static final ClockError[] VALUES = values();

        ClockError(int i7) {
            this.value = i7;
        }

        public static ClockError forNumber(int i7) {
            if (i7 == 1) {
                return EXCEED_LIMIT;
            }
            if (i7 == 2) {
                return INVALID_ID;
            }
            if (i7 == 3) {
                return INVALID_DATA;
            }
            if (i7 != 4) {
                return null;
            }
            return NOT_SUPPORT_HOLIDAY;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ClockProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ClockError> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static ClockError valueOf(int i7) {
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

        public static ClockError valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class ClockIdList extends GeneratedMessageV3 implements ClockIdListOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Integer> id_;
        private byte memoizedIsInitialized;
        private static final ClockIdList DEFAULT_INSTANCE = new ClockIdList();

        @Deprecated
        public static final Parser<ClockIdList> PARSER = new AbstractParser<ClockIdList>() { // from class: com.zh.wear.protobuf.ClockProtos.ClockIdList.1
            @Override // com.google.protobuf.Parser
            public ClockIdList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ClockIdList(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClockIdListOrBuilder {
            private int bitField0_;
            private List<Integer> id_;

            private Builder() {
                this.id_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureIdIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.id_ = new ArrayList(this.id_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ClockProtos.internal_static_ClockIdList_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllId(Iterable<? extends Integer> iterable) {
                ensureIdIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.id_);
                onChanged();
                return this;
            }

            public Builder addId(int i7) {
                ensureIdIsMutable();
                this.id_.add(Integer.valueOf(i7));
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ClockProtos.internal_static_ClockIdList_descriptor;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockIdListOrBuilder
            public int getId(int i7) {
                return this.id_.get(i7).intValue();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockIdListOrBuilder
            public int getIdCount() {
                return this.id_.size();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockIdListOrBuilder
            public List<Integer> getIdList() {
                return Collections.unmodifiableList(this.id_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ClockProtos.internal_static_ClockIdList_fieldAccessorTable.ensureFieldAccessorsInitialized(ClockIdList.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setId(int i7, int i8) {
                ensureIdIsMutable();
                this.id_.set(i7, Integer.valueOf(i8));
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClockIdList build() {
                ClockIdList clockIdListBuildPartial = buildPartial();
                if (clockIdListBuildPartial.isInitialized()) {
                    return clockIdListBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clockIdListBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClockIdList buildPartial() {
                ClockIdList clockIdList = new ClockIdList(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.id_ = Collections.unmodifiableList(this.id_);
                    this.bitField0_ &= -2;
                }
                clockIdList.id_ = this.id_;
                onBuilt();
                return clockIdList;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ClockIdList getDefaultInstanceForType() {
                return ClockIdList.getDefaultInstance();
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
                this.id_ = Collections.EMPTY_LIST;
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
            public com.zh.wear.protobuf.ClockProtos.ClockIdList.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.ClockProtos$ClockIdList> r1 = com.zh.wear.protobuf.ClockProtos.ClockIdList.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.ClockProtos$ClockIdList r3 = (com.zh.wear.protobuf.ClockProtos.ClockIdList) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.ClockProtos$ClockIdList r4 = (com.zh.wear.protobuf.ClockProtos.ClockIdList) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.ClockProtos.ClockIdList.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.ClockProtos$ClockIdList$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ClockIdList) {
                    return mergeFrom((ClockIdList) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClockIdList clockIdList) {
                if (clockIdList == ClockIdList.getDefaultInstance()) {
                    return this;
                }
                if (!clockIdList.id_.isEmpty()) {
                    if (this.id_.isEmpty()) {
                        this.id_ = clockIdList.id_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureIdIsMutable();
                        this.id_.addAll(clockIdList.id_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) clockIdList).unknownFields);
                onChanged();
                return this;
            }
        }

        private ClockIdList() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = Collections.EMPTY_LIST;
        }

        public static ClockIdList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClockProtos.internal_static_ClockIdList_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ClockIdList parseDelimitedFrom(InputStream inputStream) {
            return (ClockIdList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClockIdList parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ClockIdList> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClockIdList)) {
                return super.equals(obj);
            }
            ClockIdList clockIdList = (ClockIdList) obj;
            return getIdList().equals(clockIdList.getIdList()) && this.unknownFields.equals(clockIdList.unknownFields);
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockIdListOrBuilder
        public int getId(int i7) {
            return this.id_.get(i7).intValue();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockIdListOrBuilder
        public int getIdCount() {
            return this.id_.size();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockIdListOrBuilder
        public List<Integer> getIdList() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ClockIdList> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32SizeNoTag = 0;
            for (int i8 = 0; i8 < this.id_.size(); i8++) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(this.id_.get(i8).intValue());
            }
            int size = iComputeUInt32SizeNoTag + getIdList().size() + this.unknownFields.getSerializedSize();
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
            if (getIdCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getIdList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClockProtos.internal_static_ClockIdList_fieldAccessorTable.ensureFieldAccessorsInitialized(ClockIdList.class, Builder.class);
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
            for (int i7 = 0; i7 < this.id_.size(); i7++) {
                codedOutputStream.writeUInt32(1, this.id_.get(i7).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ClockIdList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                if (!z7) {
                                    this.id_ = new ArrayList();
                                    z7 = true;
                                }
                                this.id_.add(Integer.valueOf(codedInputStream.readUInt32()));
                            } else if (tag == 10) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!z7 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.id_ = new ArrayList();
                                    z7 = true;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.id_.add(Integer.valueOf(codedInputStream.readUInt32()));
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
                        this.id_ = Collections.unmodifiableList(this.id_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z7) {
                this.id_ = Collections.unmodifiableList(this.id_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(ClockIdList clockIdList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clockIdList);
        }

        public static ClockIdList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockIdList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClockIdList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClockIdList parseFrom(CodedInputStream codedInputStream) {
            return (ClockIdList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClockIdList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ClockIdList(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClockIdList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockIdList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ClockIdList parseFrom(InputStream inputStream) {
            return (ClockIdList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ClockIdList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockIdList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClockIdList parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ClockIdList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ClockIdList parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ClockIdList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ClockIdListOrBuilder extends MessageOrBuilder {
        int getId(int i7);

        int getIdCount();

        List<Integer> getIdList();
    }

    public static final class ClockInfo extends GeneratedMessageV3 implements ClockInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Data data_;
        private int id_;
        private byte memoizedIsInitialized;
        private static final ClockInfo DEFAULT_INSTANCE = new ClockInfo();

        @Deprecated
        public static final Parser<ClockInfo> PARSER = new AbstractParser<ClockInfo>() { // from class: com.zh.wear.protobuf.ClockProtos.ClockInfo.1
            @Override // com.google.protobuf.Parser
            public ClockInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ClockInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClockInfoOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> dataBuilder_;
            private Data data_;
            private int id_;

            private Builder() {
                this.data_ = null;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new SingleFieldBuilderV3<>(getData(), getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ClockProtos.internal_static_ClockInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder clearData() {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.data_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
            public Data getData() {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Data) singleFieldBuilderV3.getMessage();
                }
                Data data = this.data_;
                return data == null ? Data.getDefaultInstance() : data;
            }

            public Data.Builder getDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Data.Builder) getDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
            public DataOrBuilder getDataOrBuilder() {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Data data = this.data_;
                return data == null ? Data.getDefaultInstance() : data;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ClockProtos.internal_static_ClockInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ClockProtos.internal_static_ClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ClockInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasData() && getData().isInitialized();
            }

            public Builder mergeData(Data data) {
                Data data2;
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) == 2 && (data2 = this.data_) != null && data2 != Data.getDefaultInstance()) {
                        data = Data.newBuilder(this.data_).mergeFrom(data).buildPartial();
                    }
                    this.data_ = data;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(data);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setData(Data.Builder builder) {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                Data dataBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.data_ = dataBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(dataBuild);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setId(int i7) {
                this.bitField0_ |= 1;
                this.id_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setData(Data data) {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    data.getClass();
                    this.data_ = data;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(data);
                }
                this.bitField0_ |= 2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClockInfo build() {
                ClockInfo clockInfoBuildPartial = buildPartial();
                if (clockInfoBuildPartial.isInitialized()) {
                    return clockInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clockInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClockInfo buildPartial() {
                ClockInfo clockInfo = new ClockInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                clockInfo.id_ = this.id_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                clockInfo.data_ = singleFieldBuilderV3 == null ? this.data_ : (Data) singleFieldBuilderV3.build();
                clockInfo.bitField0_ = i8;
                onBuilt();
                return clockInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ClockInfo getDefaultInstanceForType() {
                return ClockInfo.getDefaultInstance();
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
                this.id_ = 0;
                this.bitField0_ &= -2;
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.data_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
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
            public com.zh.wear.protobuf.ClockProtos.ClockInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.ClockProtos$ClockInfo> r1 = com.zh.wear.protobuf.ClockProtos.ClockInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.ClockProtos$ClockInfo r3 = (com.zh.wear.protobuf.ClockProtos.ClockInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.ClockProtos$ClockInfo r4 = (com.zh.wear.protobuf.ClockProtos.ClockInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.ClockProtos.ClockInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.ClockProtos$ClockInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ClockInfo) {
                    return mergeFrom((ClockInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClockInfo clockInfo) {
                if (clockInfo == ClockInfo.getDefaultInstance()) {
                    return this;
                }
                if (clockInfo.hasId()) {
                    setId(clockInfo.getId());
                }
                if (clockInfo.hasData()) {
                    mergeData(clockInfo.getData());
                }
                mergeUnknownFields(((GeneratedMessage) clockInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class Data extends GeneratedMessageV3 implements DataOrBuilder {
            public static final int CLOCK_MODE_FIELD_NUMBER = 3;
            public static final int ENABLE_FIELD_NUMBER = 5;
            public static final int LABEL_FIELD_NUMBER = 6;
            public static final int TIME_FIELD_NUMBER = 2;
            public static final int WEEK_DAYS_FIELD_NUMBER = 4;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int clockMode_;
            private boolean enable_;
            private volatile Object label_;
            private byte memoizedIsInitialized;
            private CommonProtos.Time time_;
            private int weekDays_;
            private static final Data DEFAULT_INSTANCE = new Data();

            @Deprecated
            public static final Parser<Data> PARSER = new AbstractParser<Data>() { // from class: com.zh.wear.protobuf.ClockProtos.ClockInfo.Data.1
                @Override // com.google.protobuf.Parser
                public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Data(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataOrBuilder {
                private int bitField0_;
                private int clockMode_;
                private boolean enable_;
                private Object label_;
                private SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> timeBuilder_;
                private CommonProtos.Time time_;
                private int weekDays_;

                private Builder() {
                    this.time_ = null;
                    this.clockMode_ = 0;
                    this.label_ = "";
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return ClockProtos.internal_static_ClockInfo_Data_descriptor;
                }

                private SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> getTimeFieldBuilder() {
                    if (this.timeBuilder_ == null) {
                        this.timeBuilder_ = new SingleFieldBuilderV3<>(getTime(), getParentForChildren(), isClean());
                        this.time_ = null;
                    }
                    return this.timeBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getTimeFieldBuilder();
                    }
                }

                public Builder clearClockMode() {
                    this.bitField0_ &= -3;
                    this.clockMode_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearEnable() {
                    this.bitField0_ &= -9;
                    this.enable_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearLabel() {
                    this.bitField0_ &= -17;
                    this.label_ = Data.getDefaultInstance().getLabel();
                    onChanged();
                    return this;
                }

                public Builder clearTime() {
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.time_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder clearWeekDays() {
                    this.bitField0_ &= -5;
                    this.weekDays_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public CommonProtos.ClockMode getClockMode() {
                    CommonProtos.ClockMode clockModeValueOf = CommonProtos.ClockMode.valueOf(this.clockMode_);
                    return clockModeValueOf == null ? CommonProtos.ClockMode.CLOCK_ONCE : clockModeValueOf;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return ClockProtos.internal_static_ClockInfo_Data_descriptor;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public boolean getEnable() {
                    return this.enable_;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public String getLabel() {
                    Object obj = this.label_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.label_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public ByteString getLabelBytes() {
                    Object obj = this.label_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.label_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public CommonProtos.Time getTime() {
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.Time) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.Time time = this.time_;
                    return time == null ? CommonProtos.Time.getDefaultInstance() : time;
                }

                public CommonProtos.Time.Builder getTimeBuilder() {
                    this.bitField0_ |= 1;
                    onChanged();
                    return (CommonProtos.Time.Builder) getTimeFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public CommonProtos.TimeOrBuilder getTimeOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.TimeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.Time time = this.time_;
                    return time == null ? CommonProtos.Time.getDefaultInstance() : time;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public int getWeekDays() {
                    return this.weekDays_;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public boolean hasClockMode() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public boolean hasEnable() {
                    return (this.bitField0_ & 8) == 8;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public boolean hasLabel() {
                    return (this.bitField0_ & 16) == 16;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public boolean hasTime() {
                    return (this.bitField0_ & 1) == 1;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
                public boolean hasWeekDays() {
                    return (this.bitField0_ & 4) == 4;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ClockProtos.internal_static_ClockInfo_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasTime() && hasClockMode() && hasEnable() && getTime().isInitialized();
                }

                public Builder mergeTime(CommonProtos.Time time) {
                    CommonProtos.Time time2;
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) == 1 && (time2 = this.time_) != null && time2 != CommonProtos.Time.getDefaultInstance()) {
                            time = CommonProtos.Time.newBuilder(this.time_).mergeFrom(time).buildPartial();
                        }
                        this.time_ = time;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(time);
                    }
                    this.bitField0_ |= 1;
                    return this;
                }

                public Builder setClockMode(CommonProtos.ClockMode clockMode) {
                    clockMode.getClass();
                    this.bitField0_ |= 2;
                    this.clockMode_ = clockMode.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setEnable(boolean z6) {
                    this.bitField0_ |= 8;
                    this.enable_ = z6;
                    onChanged();
                    return this;
                }

                public Builder setLabel(String str) {
                    str.getClass();
                    this.bitField0_ |= 16;
                    this.label_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLabelBytes(ByteString byteString) {
                    byteString.getClass();
                    this.bitField0_ |= 16;
                    this.label_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTime(CommonProtos.Time.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    CommonProtos.Time timeBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.time_ = timeBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(timeBuild);
                    }
                    this.bitField0_ |= 1;
                    return this;
                }

                public Builder setWeekDays(int i7) {
                    this.bitField0_ |= 4;
                    this.weekDays_ = i7;
                    onChanged();
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.time_ = null;
                    this.clockMode_ = 0;
                    this.label_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder setTime(CommonProtos.Time time) {
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        time.getClass();
                        this.time_ = time;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(time);
                    }
                    this.bitField0_ |= 1;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Data build() {
                    Data dataBuildPartial = buildPartial();
                    if (dataBuildPartial.isInitialized()) {
                        return dataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Data buildPartial() {
                    Data data = new Data(this);
                    int i7 = this.bitField0_;
                    int i8 = (i7 & 1) != 1 ? 0 : 1;
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    data.time_ = singleFieldBuilderV3 == null ? this.time_ : (CommonProtos.Time) singleFieldBuilderV3.build();
                    if ((i7 & 2) == 2) {
                        i8 |= 2;
                    }
                    data.clockMode_ = this.clockMode_;
                    if ((i7 & 4) == 4) {
                        i8 |= 4;
                    }
                    data.weekDays_ = this.weekDays_;
                    if ((i7 & 8) == 8) {
                        i8 |= 8;
                    }
                    data.enable_ = this.enable_;
                    if ((i7 & 16) == 16) {
                        i8 |= 16;
                    }
                    data.label_ = this.label_;
                    data.bitField0_ = i8;
                    onBuilt();
                    return data;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Data getDefaultInstanceForType() {
                    return Data.getDefaultInstance();
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
                    SingleFieldBuilderV3<CommonProtos.Time, CommonProtos.Time.Builder, CommonProtos.TimeOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.time_ = null;
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    int i7 = this.bitField0_;
                    this.clockMode_ = 0;
                    this.weekDays_ = 0;
                    this.enable_ = false;
                    this.label_ = "";
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
                public com.zh.wear.protobuf.ClockProtos.ClockInfo.Data.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.ClockProtos$ClockInfo$Data> r1 = com.zh.wear.protobuf.ClockProtos.ClockInfo.Data.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.ClockProtos$ClockInfo$Data r3 = (com.zh.wear.protobuf.ClockProtos.ClockInfo.Data) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.ClockProtos$ClockInfo$Data r4 = (com.zh.wear.protobuf.ClockProtos.ClockInfo.Data) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.ClockProtos.ClockInfo.Data.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.ClockProtos$ClockInfo$Data$Builder");
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Data) {
                        return mergeFrom((Data) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Data data) {
                    if (data == Data.getDefaultInstance()) {
                        return this;
                    }
                    if (data.hasTime()) {
                        mergeTime(data.getTime());
                    }
                    if (data.hasClockMode()) {
                        setClockMode(data.getClockMode());
                    }
                    if (data.hasWeekDays()) {
                        setWeekDays(data.getWeekDays());
                    }
                    if (data.hasEnable()) {
                        setEnable(data.getEnable());
                    }
                    if (data.hasLabel()) {
                        this.bitField0_ |= 16;
                        this.label_ = data.label_;
                        onChanged();
                    }
                    mergeUnknownFields(((GeneratedMessage) data).unknownFields);
                    onChanged();
                    return this;
                }
            }

            private Data() {
                this.memoizedIsInitialized = (byte) -1;
                this.clockMode_ = 0;
                this.weekDays_ = 0;
                this.enable_ = false;
                this.label_ = "";
            }

            public static Data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ClockProtos.internal_static_ClockInfo_Data_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Data parseDelimitedFrom(InputStream inputStream) {
                return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Data parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Parser<Data> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return super.equals(obj);
                }
                Data data = (Data) obj;
                boolean z6 = hasTime() == data.hasTime();
                if (hasTime()) {
                    z6 = z6 && getTime().equals(data.getTime());
                }
                boolean z7 = z6 && hasClockMode() == data.hasClockMode();
                if (hasClockMode()) {
                    z7 = z7 && this.clockMode_ == data.clockMode_;
                }
                boolean z8 = z7 && hasWeekDays() == data.hasWeekDays();
                if (hasWeekDays()) {
                    z8 = z8 && getWeekDays() == data.getWeekDays();
                }
                boolean z9 = z8 && hasEnable() == data.hasEnable();
                if (hasEnable()) {
                    z9 = z9 && getEnable() == data.getEnable();
                }
                boolean z10 = z9 && hasLabel() == data.hasLabel();
                if (hasLabel()) {
                    z10 = z10 && getLabel().equals(data.getLabel());
                }
                return z10 && this.unknownFields.equals(data.unknownFields);
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public CommonProtos.ClockMode getClockMode() {
                CommonProtos.ClockMode clockModeValueOf = CommonProtos.ClockMode.valueOf(this.clockMode_);
                return clockModeValueOf == null ? CommonProtos.ClockMode.CLOCK_ONCE : clockModeValueOf;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public String getLabel() {
                Object obj = this.label_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.label_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public ByteString getLabelBytes() {
                Object obj = this.label_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.label_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Data> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(2, getTime()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeMessageSize += CodedOutputStream.computeEnumSize(3, this.clockMode_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iComputeMessageSize += CodedOutputStream.computeUInt32Size(4, this.weekDays_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    iComputeMessageSize += CodedOutputStream.computeBoolSize(5, this.enable_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    iComputeMessageSize += GeneratedMessage.computeStringSize(6, this.label_);
                }
                int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public CommonProtos.Time getTime() {
                CommonProtos.Time time = this.time_;
                return time == null ? CommonProtos.Time.getDefaultInstance() : time;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public CommonProtos.TimeOrBuilder getTimeOrBuilder() {
                CommonProtos.Time time = this.time_;
                return time == null ? CommonProtos.Time.getDefaultInstance() : time;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public int getWeekDays() {
                return this.weekDays_;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public boolean hasClockMode() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public boolean hasLabel() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public boolean hasTime() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.DataOrBuilder
            public boolean hasWeekDays() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasTime()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getTime().hashCode();
                }
                if (hasClockMode()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + this.clockMode_;
                }
                if (hasWeekDays()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getWeekDays();
                }
                if (hasEnable()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getEnable());
                }
                if (hasLabel()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getLabel().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ClockProtos.internal_static_ClockInfo_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
                if (!hasTime()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasClockMode()) {
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
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeMessage(2, getTime());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeEnum(3, this.clockMode_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeUInt32(4, this.weekDays_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.writeBool(5, this.enable_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    GeneratedMessage.writeString(codedOutputStream, 6, this.label_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            private Data(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 18) {
                                    CommonProtos.Time.Builder builder = (this.bitField0_ & 1) == 1 ? this.time_.toBuilder() : null;
                                    CommonProtos.Time time = (CommonProtos.Time) codedInputStream.readMessage(CommonProtos.Time.PARSER, extensionRegistryLite);
                                    this.time_ = time;
                                    if (builder != null) {
                                        builder.mergeFrom(time);
                                        this.time_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (tag == 24) {
                                    int i7 = codedInputStream.readEnum();
                                    if (CommonProtos.ClockMode.valueOf(i7) == null) {
                                        builderNewBuilder.mergeVarintField(3, i7);
                                    } else {
                                        this.bitField0_ |= 2;
                                        this.clockMode_ = i7;
                                    }
                                } else if (tag == 32) {
                                    this.bitField0_ |= 4;
                                    this.weekDays_ = codedInputStream.readUInt32();
                                } else if (tag == 40) {
                                    this.bitField0_ |= 8;
                                    this.enable_ = codedInputStream.readBool();
                                } else if (tag == 50) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    this.label_ = bytes;
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

            public static Builder newBuilder(Data data) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
            }

            public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Data parseFrom(CodedInputStream codedInputStream) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private Data(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Data parseFrom(InputStream inputStream) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Data parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Data parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }
        }

        public interface DataOrBuilder extends MessageOrBuilder {
            CommonProtos.ClockMode getClockMode();

            boolean getEnable();

            String getLabel();

            ByteString getLabelBytes();

            CommonProtos.Time getTime();

            CommonProtos.TimeOrBuilder getTimeOrBuilder();

            int getWeekDays();

            boolean hasClockMode();

            boolean hasEnable();

            boolean hasLabel();

            boolean hasTime();

            boolean hasWeekDays();
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            public static final int SUPPORT_MAX_CLOCKS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private java.util.List<ClockInfo> list_;
            private byte memoizedIsInitialized;
            private int supportMaxClocks_;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.ClockProtos.ClockInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> listBuilder_;
                private java.util.List<ClockInfo> list_;
                private int supportMaxClocks_;

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
                    return ClockProtos.internal_static_ClockInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends ClockInfo> iterable) {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(ClockInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
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
                    return ClockProtos.internal_static_ClockInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
                public ClockInfo getList(int i7) {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (ClockInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
                public java.util.List<ClockInfo> getListList() {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
                public ClockInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (ClockInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
                public java.util.List<? extends ClockInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
                public int getSupportMaxClocks() {
                    return this.supportMaxClocks_;
                }

                @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
                public boolean hasSupportMaxClocks() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ClockProtos.internal_static_ClockInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, builder.build());
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.set(i7, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setSupportMaxClocks(int i7) {
                    this.bitField0_ |= 2;
                    this.supportMaxClocks_ = i7;
                    onChanged();
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addList(int i7, ClockInfo clockInfo) {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, clockInfo);
                        return this;
                    }
                    clockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, clockInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, ClockInfo.getDefaultInstance());
                }

                public Builder setList(int i7, ClockInfo clockInfo) {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, clockInfo);
                        return this;
                    }
                    clockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, clockInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    list.supportMaxClocks_ = this.supportMaxClocks_;
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

                public Builder addList(ClockInfo clockInfo) {
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(clockInfo);
                        return this;
                    }
                    clockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(clockInfo);
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
                    RepeatedFieldBuilderV3<ClockInfo, Builder, ClockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.list_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    this.supportMaxClocks_ = 0;
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
                public com.zh.wear.protobuf.ClockProtos.ClockInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.ClockProtos$ClockInfo$List> r1 = com.zh.wear.protobuf.ClockProtos.ClockInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.ClockProtos$ClockInfo$List r3 = (com.zh.wear.protobuf.ClockProtos.ClockInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.ClockProtos$ClockInfo$List r4 = (com.zh.wear.protobuf.ClockProtos.ClockInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.ClockProtos.ClockInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.ClockProtos$ClockInfo$List$Builder");
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
                    if (list.hasSupportMaxClocks()) {
                        setSupportMaxClocks(list.getSupportMaxClocks());
                    }
                    mergeUnknownFields(((GeneratedMessage) list).unknownFields);
                    onChanged();
                    return this;
                }
            }

            private List() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
                this.supportMaxClocks_ = 0;
            }

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ClockProtos.internal_static_ClockInfo_List_descriptor;
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
                boolean z6 = getListList().equals(list.getListList()) && hasSupportMaxClocks() == list.hasSupportMaxClocks();
                if (hasSupportMaxClocks()) {
                    z6 = z6 && getSupportMaxClocks() == list.getSupportMaxClocks();
                }
                return z6 && this.unknownFields.equals(list.unknownFields);
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
            public ClockInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
            public java.util.List<ClockInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
            public ClockInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
            public java.util.List<? extends ClockInfoOrBuilder> getListOrBuilderList() {
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
                int iComputeUInt32Size = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeUInt32Size += CodedOutputStream.computeMessageSize(1, this.list_.get(i8));
                }
                if ((this.bitField0_ & 1) == 1) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.supportMaxClocks_);
                }
                int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
            public int getSupportMaxClocks() {
                return this.supportMaxClocks_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.ClockInfo.ListOrBuilder
            public boolean hasSupportMaxClocks() {
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
                if (hasSupportMaxClocks()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSupportMaxClocks();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ClockProtos.internal_static_ClockInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    codedOutputStream.writeUInt32(2, this.supportMaxClocks_);
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
                                    this.list_.add((ClockInfo) codedInputStream.readMessage(ClockInfo.PARSER, extensionRegistryLite));
                                } else if (tag == 16) {
                                    this.bitField0_ |= 1;
                                    this.supportMaxClocks_ = codedInputStream.readUInt32();
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
            ClockInfo getList(int i7);

            int getListCount();

            java.util.List<ClockInfo> getListList();

            ClockInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends ClockInfoOrBuilder> getListOrBuilderList();

            int getSupportMaxClocks();

            boolean hasSupportMaxClocks();
        }

        private ClockInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = 0;
        }

        public static ClockInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClockProtos.internal_static_ClockInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ClockInfo parseDelimitedFrom(InputStream inputStream) {
            return (ClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClockInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ClockInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClockInfo)) {
                return super.equals(obj);
            }
            ClockInfo clockInfo = (ClockInfo) obj;
            boolean z6 = hasId() == clockInfo.hasId();
            if (hasId()) {
                z6 = z6 && getId() == clockInfo.getId();
            }
            boolean z7 = z6 && hasData() == clockInfo.hasData();
            if (hasData()) {
                z7 = z7 && getData().equals(clockInfo.getData());
            }
            return z7 && this.unknownFields.equals(clockInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
        public Data getData() {
            Data data = this.data_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
        public DataOrBuilder getDataOrBuilder() {
            Data data = this.data_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ClockInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getData());
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.ClockProtos.ClockInfoOrBuilder
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
                iHashCode = (((iHashCode * 37) + 1) * 53) + getId();
            }
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClockProtos.internal_static_ClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ClockInfo.class, Builder.class);
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
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, getData());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ClockInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.id_ = codedInputStream.readUInt32();
                            } else if (tag == 18) {
                                Data.Builder builder = (this.bitField0_ & 2) == 2 ? this.data_.toBuilder() : null;
                                Data data = (Data) codedInputStream.readMessage(Data.PARSER, extensionRegistryLite);
                                this.data_ = data;
                                if (builder != null) {
                                    builder.mergeFrom(data);
                                    this.data_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
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

        public static Builder newBuilder(ClockInfo clockInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clockInfo);
        }

        public static ClockInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClockInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClockInfo parseFrom(CodedInputStream codedInputStream) {
            return (ClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClockInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ClockInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClockInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ClockInfo parseFrom(InputStream inputStream) {
            return (ClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ClockInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClockInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ClockInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ClockInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ClockInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ClockInfoOrBuilder extends MessageOrBuilder {
        ClockInfo.Data getData();

        ClockInfo.DataOrBuilder getDataOrBuilder();

        int getId();

        boolean hasData();

        boolean hasId();
    }

    public interface ClockOrBuilder extends MessageOrBuilder {
        ClockInfo.Data getClockData();

        ClockInfo.DataOrBuilder getClockDataOrBuilder();

        ClockError getClockError();

        CommonProtos.ClockHoliday getClockHoliday();

        CommonProtos.ClockHolidayOrBuilder getClockHolidayOrBuilder();

        ClockIdList getClockIdList();

        ClockIdListOrBuilder getClockIdListOrBuilder();

        ClockInfo getClockInfo();

        ClockInfo.List getClockInfoList();

        ClockInfo.ListOrBuilder getClockInfoListOrBuilder();

        ClockInfoOrBuilder getClockInfoOrBuilder();

        boolean getEnable();

        int getId();

        Clock.PayloadCase getPayloadCase();

        String getWorldClockId();

        ByteString getWorldClockIdBytes();

        WorldClockIdList getWorldClockIdList();

        WorldClockIdListOrBuilder getWorldClockIdListOrBuilder();

        WorldClockResult getWorldClockResult();

        boolean hasClockData();

        boolean hasClockError();

        boolean hasClockHoliday();

        boolean hasClockIdList();

        boolean hasClockInfo();

        boolean hasClockInfoList();

        boolean hasEnable();

        boolean hasId();

        boolean hasWorldClockId();

        boolean hasWorldClockIdList();

        boolean hasWorldClockResult();
    }

    public static final class WorldClockIdList extends GeneratedMessageV3 implements WorldClockIdListOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private LazyStringList id_;
        private byte memoizedIsInitialized;
        private static final WorldClockIdList DEFAULT_INSTANCE = new WorldClockIdList();

        @Deprecated
        public static final Parser<WorldClockIdList> PARSER = new AbstractParser<WorldClockIdList>() { // from class: com.zh.wear.protobuf.ClockProtos.WorldClockIdList.1
            @Override // com.google.protobuf.Parser
            public WorldClockIdList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WorldClockIdList(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorldClockIdListOrBuilder {
            private int bitField0_;
            private LazyStringList id_;

            private Builder() {
                this.id_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void ensureIdIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.id_ = new LazyStringArrayList(this.id_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ClockProtos.internal_static_WorldClockIdList_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder addAllId(Iterable<String> iterable) {
                ensureIdIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.id_);
                onChanged();
                return this;
            }

            public Builder addId(String str) {
                str.getClass();
                ensureIdIsMutable();
                this.id_.add(str);
                onChanged();
                return this;
            }

            public Builder addIdBytes(ByteString byteString) {
                byteString.getClass();
                ensureIdIsMutable();
                this.id_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ClockProtos.internal_static_WorldClockIdList_descriptor;
            }

            @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
            public String getId(int i7) {
                return this.id_.get(i7);
            }

            @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
            public ByteString getIdBytes(int i7) {
                return this.id_.getByteString(i7);
            }

            @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
            public int getIdCount() {
                return this.id_.size();
            }

            @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
            public ProtocolStringList getIdList() {
                return this.id_.getUnmodifiableView();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ClockProtos.internal_static_WorldClockIdList_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldClockIdList.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setId(int i7, String str) {
                str.getClass();
                ensureIdIsMutable();
                this.id_.set(i7, str);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WorldClockIdList build() {
                WorldClockIdList worldClockIdListBuildPartial = buildPartial();
                if (worldClockIdListBuildPartial.isInitialized()) {
                    return worldClockIdListBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) worldClockIdListBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WorldClockIdList buildPartial() {
                WorldClockIdList worldClockIdList = new WorldClockIdList(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.id_ = this.id_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                worldClockIdList.id_ = this.id_;
                onBuilt();
                return worldClockIdList;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WorldClockIdList getDefaultInstanceForType() {
                return WorldClockIdList.getDefaultInstance();
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
                this.id_ = LazyStringArrayList.EMPTY;
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
            public com.zh.wear.protobuf.ClockProtos.WorldClockIdList.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.ClockProtos$WorldClockIdList> r1 = com.zh.wear.protobuf.ClockProtos.WorldClockIdList.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.ClockProtos$WorldClockIdList r3 = (com.zh.wear.protobuf.ClockProtos.WorldClockIdList) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.ClockProtos$WorldClockIdList r4 = (com.zh.wear.protobuf.ClockProtos.WorldClockIdList) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.ClockProtos.WorldClockIdList.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.ClockProtos$WorldClockIdList$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WorldClockIdList) {
                    return mergeFrom((WorldClockIdList) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WorldClockIdList worldClockIdList) {
                if (worldClockIdList == WorldClockIdList.getDefaultInstance()) {
                    return this;
                }
                if (!worldClockIdList.id_.isEmpty()) {
                    if (this.id_.isEmpty()) {
                        this.id_ = worldClockIdList.id_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureIdIsMutable();
                        this.id_.addAll(worldClockIdList.id_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) worldClockIdList).unknownFields);
                onChanged();
                return this;
            }
        }

        private WorldClockIdList() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = LazyStringArrayList.EMPTY;
        }

        public static WorldClockIdList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClockProtos.internal_static_WorldClockIdList_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WorldClockIdList parseDelimitedFrom(InputStream inputStream) {
            return (WorldClockIdList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WorldClockIdList parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WorldClockIdList> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorldClockIdList)) {
                return super.equals(obj);
            }
            WorldClockIdList worldClockIdList = (WorldClockIdList) obj;
            return getIdList().equals(worldClockIdList.getIdList()) && this.unknownFields.equals(worldClockIdList.unknownFields);
        }

        @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
        public String getId(int i7) {
            return this.id_.get(i7);
        }

        @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
        public ByteString getIdBytes(int i7) {
            return this.id_.getByteString(i7);
        }

        @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
        public int getIdCount() {
            return this.id_.size();
        }

        @Override // com.zh.wear.protobuf.ClockProtos.WorldClockIdListOrBuilder
        public ProtocolStringList getIdList() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WorldClockIdList> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSizeNoTag = 0;
            for (int i8 = 0; i8 < this.id_.size(); i8++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.id_.getRaw(i8));
            }
            int size = iComputeStringSizeNoTag + getIdList().size() + this.unknownFields.getSerializedSize();
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
            if (getIdCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getIdList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClockProtos.internal_static_WorldClockIdList_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldClockIdList.class, Builder.class);
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
            for (int i7 = 0; i7 < this.id_.size(); i7++) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.id_.getRaw(i7));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WorldClockIdList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    ByteString bytes = codedInputStream.readBytes();
                                    if (!z7) {
                                        this.id_ = new LazyStringArrayList();
                                        z7 = true;
                                    }
                                    this.id_.add(bytes);
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
                        this.id_ = this.id_.getUnmodifiableView();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z7) {
                this.id_ = this.id_.getUnmodifiableView();
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(WorldClockIdList worldClockIdList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(worldClockIdList);
        }

        public static WorldClockIdList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorldClockIdList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WorldClockIdList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WorldClockIdList parseFrom(CodedInputStream codedInputStream) {
            return (WorldClockIdList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WorldClockIdList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WorldClockIdList(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WorldClockIdList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorldClockIdList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WorldClockIdList parseFrom(InputStream inputStream) {
            return (WorldClockIdList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WorldClockIdList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorldClockIdList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WorldClockIdList parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WorldClockIdList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WorldClockIdList parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WorldClockIdList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WorldClockIdListOrBuilder extends MessageOrBuilder {
        String getId(int i7);

        ByteString getIdBytes(int i7);

        int getIdCount();

        List<String> getIdList();
    }

    public enum WorldClockResult implements ProtocolMessageEnum {
        OPERATE_SUCCESS(0),
        ID_NOT_SUPPORT(1);

        public static final int ID_NOT_SUPPORT_VALUE = 1;
        public static final int OPERATE_SUCCESS_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WorldClockResult> internalValueMap = new Internal.EnumLiteMap<WorldClockResult>() { // from class: com.zh.wear.protobuf.ClockProtos.WorldClockResult.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WorldClockResult findValueByNumber(int i7) {
                return WorldClockResult.forNumber(i7);
            }
        };
        private static final WorldClockResult[] VALUES = values();

        WorldClockResult(int i7) {
            this.value = i7;
        }

        public static WorldClockResult forNumber(int i7) {
            if (i7 == 0) {
                return OPERATE_SUCCESS;
            }
            if (i7 != 1) {
                return null;
            }
            return ID_NOT_SUPPORT;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ClockProtos.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<WorldClockResult> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static WorldClockResult valueOf(int i7) {
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

        public static WorldClockResult valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010wear_clock.proto\u001a\fnanopb.proto\u001a\u0011wear_common.proto\"\u00ad\u0005\n\u0005Clock\u0012*\n\u000fclock_info_list\u0018\u0001 \u0001(\u000b2\u000f.ClockInfo.ListH\u0000\u0012%\n\nclock_data\u0018\u0002 \u0001(\u000b2\u000f.ClockInfo.DataH\u0000\u0012 \n\nclock_info\u0018\u0003 \u0001(\u000b2\n.ClockInfoH\u0000\u0012\f\n\u0002id\u0018\u0004 \u0001(\rH\u0000\u0012%\n\rclock_id_list\u0018\u0005 \u0001(\u000b2\f.ClockIdListH\u0000\u0012\u0010\n\u0006enable\u0018\u0006 \u0001(\bH\u0000\u0012&\n\rclock_holiday\u0018\u0007 \u0001(\u000b2\r.ClockHolidayH\u0000\u0012\"\n\u000bclock_error\u0018\b \u0001(\u000e2\u000b.ClockErrorH\u0000\u00120\n\u0013world_clock_id_list\u0018\u000b \u0001(\u000b2\u0011.WorldClockIdListH\u0000\u0012\u001f\n\u000eworld_clock_id\u0018\f \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012/\n\u0012world_clock_result\u0018\r \u0001(\u000e2\u0011.WorldClockResultH\u0000\"\u008c\u0002\n\u0007ClockID\u0012\u0012\n\u000eGET_CLOCK_LIST\u0010\u0000\u0012\r\n\tADD_CLOCK\u0010\u0001\u0012\u0010\n\fUPDATE_CLOCK\u0010\u0002\u0012\u0010\n\fREMOVE_CLOCK\u0010\u0003\u0012\u0011\n\rREMOVE_CLOCKS\u0010\u0004\u0012\u001b\n\u0017ENABLE_OR_DISABLE_CLOCK\u0010\u0005\u0012\u0010\n\fSYNC_HOLIDAY\u0010\u0006\u0012\u0018\n\u0014WEAR_REQUEST_HOLIDAY\u0010\u0007\u0012\u0018\n\u0014GET_WORLD_CLOCK_LIST\u0010\n\u0012\u0013\n\u000fADD_WORLD_CLOCK\u0010\u000b\u0012\u0016\n\u0012REMOVE_WORLD_CLOCK\u0010\f\u0012\u0017\n\u0013REMOVE_WORLD_CLOCKS\u0010\rB\t\n\u0007payload\"ø\u0001\n\tClockInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\u001d\n\u0004data\u0018\u0002 \u0002(\u000b2\u000f.ClockInfo.Data\u001a{\n\u0004Data\u0012\u0013\n\u0004time\u0018\u0002 \u0002(\u000b2\u0005.Time\u0012\u001e\n\nclock_mode\u0018\u0003 \u0002(\u000e2\n.ClockMode\u0012\u0018\n\tweek_days\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u000e\n\u0006enable\u0018\u0005 \u0002(\b\u0012\u0014\n\u0005label\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u001aC\n\u0004List\u0012\u001f\n\u0004list\u0018\u0001 \u0003(\u000b2\n.ClockInfoB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u0012support_max_clocks\u0018\u0002 \u0001(\r\" \n\u000bClockIdList\u0012\u0011\n\u0002id\u0018\u0001 \u0003(\rB\u0005\u0092?\u0002\u0018\u0004\"%\n\u0010WorldClockIdList\u0012\u0011\n\u0002id\u0018\u0001 \u0003(\tB\u0005\u0092?\u0002\u0018\u0004*Y\n\nClockError\u0012\u0010\n\fEXCEED_LIMIT\u0010\u0001\u0012\u000e\n\nINVALID_ID\u0010\u0002\u0012\u0010\n\fINVALID_DATA\u0010\u0003\u0012\u0017\n\u0013NOT_SUPPORT_HOLIDAY\u0010\u0004*;\n\u0010WorldClockResult\u0012\u0013\n\u000fOPERATE_SUCCESS\u0010\u0000\u0012\u0012\n\u000eID_NOT_SUPPORT\u0010\u0001B#\n\u0014com.zh.wear.protobufB\u000bClockProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.ClockProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = ClockProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Clock_descriptor = descriptor2;
        internal_static_Clock_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ClockInfoList", "ClockData", "ClockInfo", "Id", "ClockIdList", "Enable", "ClockHoliday", "ClockError", "WorldClockIdList", "WorldClockId", "WorldClockResult", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_ClockInfo_descriptor = descriptor3;
        internal_static_ClockInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Id", "Data"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_ClockInfo_Data_descriptor = descriptor4;
        internal_static_ClockInfo_Data_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{UrlTemplate.f27969g, "ClockMode", "WeekDays", "Enable", "Label"});
        Descriptors.Descriptor descriptor5 = descriptor3.getNestedTypes().get(1);
        internal_static_ClockInfo_List_descriptor = descriptor5;
        internal_static_ClockInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{MessageLiteToString.f20028a, "SupportMaxClocks"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(2);
        internal_static_ClockIdList_descriptor = descriptor6;
        internal_static_ClockIdList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Id"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(3);
        internal_static_WorldClockIdList_descriptor = descriptor7;
        internal_static_WorldClockIdList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Id"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
    }

    private ClockProtos() {
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