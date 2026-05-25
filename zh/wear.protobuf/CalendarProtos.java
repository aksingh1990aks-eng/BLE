package com.zh.wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.media3.effect.DebugTraceUtil;
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
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class CalendarProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_CalendarInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CalendarInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CalendarInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CalendarInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Calendar_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Calendar_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.CalendarProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$CalendarProtos$Calendar$PayloadCase;

        static {
            int[] iArr = new int[Calendar.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$CalendarProtos$Calendar$PayloadCase = iArr;
            try {
                iArr[Calendar.PayloadCase.CALENDAR_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$CalendarProtos$Calendar$PayloadCase[Calendar.PayloadCase.CALENDAR_INFO_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$CalendarProtos$Calendar$PayloadCase[Calendar.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Calendar extends GeneratedMessageV3 implements CalendarOrBuilder {
        public static final int CALENDAR_INFO_FIELD_NUMBER = 1;
        public static final int CALENDAR_INFO_LIST_FIELD_NUMBER = 2;
        private static final Calendar DEFAULT_INSTANCE = new Calendar();

        @Deprecated
        public static final Parser<Calendar> PARSER = new AbstractParser<Calendar>() { // from class: com.zh.wear.protobuf.CalendarProtos.Calendar.1
            @Override // com.google.protobuf.Parser
            public Calendar parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Calendar(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> calendarInfoBuilder_;
            private SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> calendarInfoListBuilder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> getCalendarInfoFieldBuilder() {
                if (this.calendarInfoBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = CalendarInfo.getDefaultInstance();
                    }
                    this.calendarInfoBuilder_ = new SingleFieldBuilderV3<>((CalendarInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.calendarInfoBuilder_;
            }

            private SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> getCalendarInfoListFieldBuilder() {
                if (this.calendarInfoListBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = CalendarInfo.List.getDefaultInstance();
                    }
                    this.calendarInfoListBuilder_ = new SingleFieldBuilderV3<>((CalendarInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.calendarInfoListBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CalendarProtos.internal_static_Calendar_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCalendarInfo() {
                SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> singleFieldBuilderV3 = this.calendarInfoBuilder_;
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

            public Builder clearCalendarInfoList() {
                SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> singleFieldBuilderV3 = this.calendarInfoListBuilder_;
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

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
            public CalendarInfo getCalendarInfo() {
                Object message;
                SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> singleFieldBuilderV3 = this.calendarInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return CalendarInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return CalendarInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CalendarInfo) message;
            }

            public CalendarInfo.Builder getCalendarInfoBuilder() {
                return (CalendarInfo.Builder) getCalendarInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
            public CalendarInfo.List getCalendarInfoList() {
                Object message;
                SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> singleFieldBuilderV3 = this.calendarInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return CalendarInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return CalendarInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CalendarInfo.List) message;
            }

            public CalendarInfo.List.Builder getCalendarInfoListBuilder() {
                return (CalendarInfo.List.Builder) getCalendarInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
            public CalendarInfo.ListOrBuilder getCalendarInfoListOrBuilder() {
                SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.calendarInfoListBuilder_) == null) ? i7 == 2 ? (CalendarInfo.List) this.payload_ : CalendarInfo.List.getDefaultInstance() : (CalendarInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
            public CalendarInfoOrBuilder getCalendarInfoOrBuilder() {
                SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.calendarInfoBuilder_) == null) ? i7 == 1 ? (CalendarInfo) this.payload_ : CalendarInfo.getDefaultInstance() : (CalendarInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CalendarProtos.internal_static_Calendar_descriptor;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
            public boolean hasCalendarInfo() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
            public boolean hasCalendarInfoList() {
                return this.payloadCase_ == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CalendarProtos.internal_static_Calendar_fieldAccessorTable.ensureFieldAccessorsInitialized(Calendar.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasCalendarInfo() || getCalendarInfo().isInitialized()) {
                    return !hasCalendarInfoList() || getCalendarInfoList().isInitialized();
                }
                return false;
            }

            public Builder mergeCalendarInfo(CalendarInfo calendarInfo) {
                SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> singleFieldBuilderV3 = this.calendarInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != CalendarInfo.getDefaultInstance()) {
                        calendarInfo = CalendarInfo.newBuilder((CalendarInfo) this.payload_).mergeFrom(calendarInfo).buildPartial();
                    }
                    this.payload_ = calendarInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(calendarInfo);
                    }
                    this.calendarInfoBuilder_.setMessage(calendarInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeCalendarInfoList(CalendarInfo.List list) {
                SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> singleFieldBuilderV3 = this.calendarInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != CalendarInfo.List.getDefaultInstance()) {
                        list = CalendarInfo.List.newBuilder((CalendarInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.calendarInfoListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setCalendarInfo(CalendarInfo.Builder builder) {
                SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> singleFieldBuilderV3 = this.calendarInfoBuilder_;
                CalendarInfo calendarInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = calendarInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(calendarInfoBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setCalendarInfoList(CalendarInfo.List.Builder builder) {
                SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> singleFieldBuilderV3 = this.calendarInfoListBuilder_;
                CalendarInfo.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setCalendarInfo(CalendarInfo calendarInfo) {
                SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> singleFieldBuilderV3 = this.calendarInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calendarInfo.getClass();
                    this.payload_ = calendarInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(calendarInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setCalendarInfoList(CalendarInfo.List list) {
                SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> singleFieldBuilderV3 = this.calendarInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Calendar build() {
                Calendar calendarBuildPartial = buildPartial();
                if (calendarBuildPartial.isInitialized()) {
                    return calendarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Calendar buildPartial() {
                Calendar calendar = new Calendar(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<CalendarInfo, CalendarInfo.Builder, CalendarInfoOrBuilder> singleFieldBuilderV3 = this.calendarInfoBuilder_;
                    calendar.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<CalendarInfo.List, CalendarInfo.List.Builder, CalendarInfo.ListOrBuilder> singleFieldBuilderV32 = this.calendarInfoListBuilder_;
                    calendar.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                calendar.bitField0_ = 0;
                calendar.payloadCase_ = this.payloadCase_;
                onBuilt();
                return calendar;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Calendar getDefaultInstanceForType() {
                return Calendar.getDefaultInstance();
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
            public com.zh.wear.protobuf.CalendarProtos.Calendar.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CalendarProtos$Calendar> r1 = com.zh.wear.protobuf.CalendarProtos.Calendar.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CalendarProtos$Calendar r3 = (com.zh.wear.protobuf.CalendarProtos.Calendar) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CalendarProtos$Calendar r4 = (com.zh.wear.protobuf.CalendarProtos.Calendar) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CalendarProtos.Calendar.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CalendarProtos$Calendar$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Calendar) {
                    return mergeFrom((Calendar) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Calendar calendar) {
                if (calendar == Calendar.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$CalendarProtos$Calendar$PayloadCase[calendar.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    mergeCalendarInfo(calendar.getCalendarInfo());
                } else if (i7 == 2) {
                    mergeCalendarInfoList(calendar.getCalendarInfoList());
                }
                mergeUnknownFields(((GeneratedMessage) calendar).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum CalendarID implements ProtocolMessageEnum {
            SYNC_CALENDAR_INFO(0),
            SYNC_CALENDAR_INFO_LIST(1),
            WEAR_REQUEST(2);

            public static final int SYNC_CALENDAR_INFO_LIST_VALUE = 1;
            public static final int SYNC_CALENDAR_INFO_VALUE = 0;
            public static final int WEAR_REQUEST_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<CalendarID> internalValueMap = new Internal.EnumLiteMap<CalendarID>() { // from class: com.zh.wear.protobuf.CalendarProtos.Calendar.CalendarID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CalendarID findValueByNumber(int i7) {
                    return CalendarID.forNumber(i7);
                }
            };
            private static final CalendarID[] VALUES = values();

            CalendarID(int i7) {
                this.value = i7;
            }

            public static CalendarID forNumber(int i7) {
                if (i7 == 0) {
                    return SYNC_CALENDAR_INFO;
                }
                if (i7 == 1) {
                    return SYNC_CALENDAR_INFO_LIST;
                }
                if (i7 != 2) {
                    return null;
                }
                return WEAR_REQUEST;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Calendar.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<CalendarID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static CalendarID valueOf(int i7) {
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

            public static CalendarID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            CALENDAR_INFO(1),
            CALENDAR_INFO_LIST(2),
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
                    return CALENDAR_INFO;
                }
                if (i7 != 2) {
                    return null;
                }
                return CALENDAR_INFO_LIST;
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

        private Calendar() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Calendar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CalendarProtos.internal_static_Calendar_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Calendar parseDelimitedFrom(InputStream inputStream) {
            return (Calendar) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Calendar parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Calendar> parser() {
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.CalendarProtos.Calendar
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.CalendarProtos$Calendar r6 = (com.zh.wear.protobuf.CalendarProtos.Calendar) r6
                com.zh.wear.protobuf.CalendarProtos$Calendar$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.CalendarProtos$Calendar$PayloadCase r2 = r6.getPayloadCase()
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
                com.zh.wear.protobuf.CalendarProtos$CalendarInfo$List r1 = r5.getCalendarInfoList()
                com.zh.wear.protobuf.CalendarProtos$CalendarInfo$List r3 = r6.getCalendarInfoList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L4a
                goto L48
            L38:
                if (r1 == 0) goto L4a
                com.zh.wear.protobuf.CalendarProtos$CalendarInfo r1 = r5.getCalendarInfo()
                com.zh.wear.protobuf.CalendarProtos$CalendarInfo r3 = r6.getCalendarInfo()
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
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CalendarProtos.Calendar.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
        public CalendarInfo getCalendarInfo() {
            return this.payloadCase_ == 1 ? (CalendarInfo) this.payload_ : CalendarInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
        public CalendarInfo.List getCalendarInfoList() {
            return this.payloadCase_ == 2 ? (CalendarInfo.List) this.payload_ : CalendarInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
        public CalendarInfo.ListOrBuilder getCalendarInfoListOrBuilder() {
            return this.payloadCase_ == 2 ? (CalendarInfo.List) this.payload_ : CalendarInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
        public CalendarInfoOrBuilder getCalendarInfoOrBuilder() {
            return this.payloadCase_ == 1 ? (CalendarInfo) this.payload_ : CalendarInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Calendar> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (CalendarInfo) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (CalendarInfo.List) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
        public boolean hasCalendarInfo() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarOrBuilder
        public boolean hasCalendarInfoList() {
            return this.payloadCase_ == 2;
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
                    iHashCode = getCalendarInfoList().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            i7 = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getCalendarInfo().hashCode();
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CalendarProtos.internal_static_Calendar_fieldAccessorTable.ensureFieldAccessorsInitialized(Calendar.class, Builder.class);
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
            if (hasCalendarInfo() && !getCalendarInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCalendarInfoList() || getCalendarInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (CalendarInfo) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (CalendarInfo.List) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Calendar(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                CalendarInfo.Builder builder = this.payloadCase_ == 1 ? ((CalendarInfo) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(CalendarInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((CalendarInfo) message);
                                    this.payload_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                i7 = 2;
                                CalendarInfo.List.Builder builder2 = this.payloadCase_ == 2 ? ((CalendarInfo.List) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(CalendarInfo.List.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((CalendarInfo.List) message2);
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

        public static Builder newBuilder(Calendar calendar) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendar);
        }

        public static Calendar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Calendar) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Calendar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Calendar parseFrom(CodedInputStream codedInputStream) {
            return (Calendar) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Calendar getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Calendar(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Calendar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Calendar) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Calendar parseFrom(InputStream inputStream) {
            return (Calendar) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Calendar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Calendar) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Calendar parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Calendar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Calendar parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Calendar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public static final class CalendarInfo extends GeneratedMessageV3 implements CalendarInfoOrBuilder {
        public static final int ALL_DAY_FIELD_NUMBER = 6;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int END_FIELD_NUMBER = 5;
        public static final int LOCATION_FIELD_NUMBER = 3;
        public static final int REMINDER_MINUTES_FIELD_NUMBER = 7;
        public static final int START_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private boolean allDay_;
        private int bitField0_;
        private volatile Object description_;
        private int end_;
        private volatile Object location_;
        private byte memoizedIsInitialized;
        private int reminderMinutes_;
        private int start_;
        private volatile Object title_;
        private static final CalendarInfo DEFAULT_INSTANCE = new CalendarInfo();

        @Deprecated
        public static final Parser<CalendarInfo> PARSER = new AbstractParser<CalendarInfo>() { // from class: com.zh.wear.protobuf.CalendarProtos.CalendarInfo.1
            @Override // com.google.protobuf.Parser
            public CalendarInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new CalendarInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarInfoOrBuilder {
            private boolean allDay_;
            private int bitField0_;
            private Object description_;
            private int end_;
            private Object location_;
            private int reminderMinutes_;
            private int start_;
            private Object title_;

            private Builder() {
                this.title_ = "";
                this.description_ = "";
                this.location_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CalendarProtos.internal_static_CalendarInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAllDay() {
                this.bitField0_ &= -33;
                this.allDay_ = false;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.bitField0_ &= -3;
                this.description_ = CalendarInfo.getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            public Builder clearEnd() {
                this.bitField0_ &= -17;
                this.end_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLocation() {
                this.bitField0_ &= -5;
                this.location_ = CalendarInfo.getDefaultInstance().getLocation();
                onChanged();
                return this;
            }

            public Builder clearReminderMinutes() {
                this.bitField0_ &= -65;
                this.reminderMinutes_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStart() {
                this.bitField0_ &= -9;
                this.start_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.bitField0_ &= -2;
                this.title_ = CalendarInfo.getDefaultInstance().getTitle();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean getAllDay() {
                return this.allDay_;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.description_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CalendarProtos.internal_static_CalendarInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public String getLocation() {
                Object obj = this.location_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.location_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public ByteString getLocationBytes() {
                Object obj = this.location_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.location_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public int getReminderMinutes() {
                return this.reminderMinutes_;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.title_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean hasAllDay() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean hasDescription() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean hasReminderMinutes() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean hasStart() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CalendarProtos.internal_static_CalendarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTitle() && hasDescription() && hasLocation() && hasStart() && hasEnd() && hasAllDay() && hasReminderMinutes();
            }

            public Builder setAllDay(boolean z6) {
                this.bitField0_ |= 32;
                this.allDay_ = z6;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.description_ = str;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.description_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEnd(int i7) {
                this.bitField0_ |= 16;
                this.end_ = i7;
                onChanged();
                return this;
            }

            public Builder setLocation(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.location_ = str;
                onChanged();
                return this;
            }

            public Builder setLocationBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.location_ = byteString;
                onChanged();
                return this;
            }

            public Builder setReminderMinutes(int i7) {
                this.bitField0_ |= 64;
                this.reminderMinutes_ = i7;
                onChanged();
                return this;
            }

            public Builder setStart(int i7) {
                this.bitField0_ |= 8;
                this.start_ = i7;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.title_ = str;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.title_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = "";
                this.description_ = "";
                this.location_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarInfo build() {
                CalendarInfo calendarInfoBuildPartial = buildPartial();
                if (calendarInfoBuildPartial.isInitialized()) {
                    return calendarInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarInfo buildPartial() {
                CalendarInfo calendarInfo = new CalendarInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                calendarInfo.title_ = this.title_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                calendarInfo.description_ = this.description_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                calendarInfo.location_ = this.location_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                calendarInfo.start_ = this.start_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                calendarInfo.end_ = this.end_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                calendarInfo.allDay_ = this.allDay_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                calendarInfo.reminderMinutes_ = this.reminderMinutes_;
                calendarInfo.bitField0_ = i8;
                onBuilt();
                return calendarInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarInfo getDefaultInstanceForType() {
                return CalendarInfo.getDefaultInstance();
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
                this.title_ = "";
                int i7 = this.bitField0_;
                this.description_ = "";
                this.location_ = "";
                this.start_ = 0;
                this.end_ = 0;
                this.allDay_ = false;
                this.reminderMinutes_ = 0;
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
            public com.zh.wear.protobuf.CalendarProtos.CalendarInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.CalendarProtos$CalendarInfo> r1 = com.zh.wear.protobuf.CalendarProtos.CalendarInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.CalendarProtos$CalendarInfo r3 = (com.zh.wear.protobuf.CalendarProtos.CalendarInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.CalendarProtos$CalendarInfo r4 = (com.zh.wear.protobuf.CalendarProtos.CalendarInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CalendarProtos.CalendarInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CalendarProtos$CalendarInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarInfo) {
                    return mergeFrom((CalendarInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalendarInfo calendarInfo) {
                if (calendarInfo == CalendarInfo.getDefaultInstance()) {
                    return this;
                }
                if (calendarInfo.hasTitle()) {
                    this.bitField0_ |= 1;
                    this.title_ = calendarInfo.title_;
                    onChanged();
                }
                if (calendarInfo.hasDescription()) {
                    this.bitField0_ |= 2;
                    this.description_ = calendarInfo.description_;
                    onChanged();
                }
                if (calendarInfo.hasLocation()) {
                    this.bitField0_ |= 4;
                    this.location_ = calendarInfo.location_;
                    onChanged();
                }
                if (calendarInfo.hasStart()) {
                    setStart(calendarInfo.getStart());
                }
                if (calendarInfo.hasEnd()) {
                    setEnd(calendarInfo.getEnd());
                }
                if (calendarInfo.hasAllDay()) {
                    setAllDay(calendarInfo.getAllDay());
                }
                if (calendarInfo.hasReminderMinutes()) {
                    setReminderMinutes(calendarInfo.getReminderMinutes());
                }
                mergeUnknownFields(((GeneratedMessage) calendarInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<CalendarInfo> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.CalendarProtos.CalendarInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> listBuilder_;
                private java.util.List<CalendarInfo> list_;

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
                    return CalendarProtos.internal_static_CalendarInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends CalendarInfo> iterable) {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(CalendarInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return CalendarProtos.internal_static_CalendarInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
                public CalendarInfo getList(int i7) {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (CalendarInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
                public java.util.List<CalendarInfo> getListList() {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
                public CalendarInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (CalendarInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
                public java.util.List<? extends CalendarInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return CalendarProtos.internal_static_CalendarInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, CalendarInfo calendarInfo) {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, calendarInfo);
                        return this;
                    }
                    calendarInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, calendarInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, CalendarInfo.getDefaultInstance());
                }

                public Builder setList(int i7, CalendarInfo calendarInfo) {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, calendarInfo);
                        return this;
                    }
                    calendarInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, calendarInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(CalendarInfo calendarInfo) {
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(calendarInfo);
                        return this;
                    }
                    calendarInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(calendarInfo);
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
                    RepeatedFieldBuilderV3<CalendarInfo, Builder, CalendarInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.CalendarProtos.CalendarInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.CalendarProtos$CalendarInfo$List> r1 = com.zh.wear.protobuf.CalendarProtos.CalendarInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.CalendarProtos$CalendarInfo$List r3 = (com.zh.wear.protobuf.CalendarProtos.CalendarInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.CalendarProtos$CalendarInfo$List r4 = (com.zh.wear.protobuf.CalendarProtos.CalendarInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.CalendarProtos.CalendarInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.CalendarProtos$CalendarInfo$List$Builder");
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
                return CalendarProtos.internal_static_CalendarInfo_List_descriptor;
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

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
            public CalendarInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
            public java.util.List<CalendarInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
            public CalendarInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfo.ListOrBuilder
            public java.util.List<? extends CalendarInfoOrBuilder> getListOrBuilderList() {
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
                return CalendarProtos.internal_static_CalendarInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((CalendarInfo) codedInputStream.readMessage(CalendarInfo.PARSER, extensionRegistryLite));
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
            CalendarInfo getList(int i7);

            int getListCount();

            java.util.List<CalendarInfo> getListList();

            CalendarInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends CalendarInfoOrBuilder> getListOrBuilderList();
        }

        private CalendarInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.description_ = "";
            this.location_ = "";
            this.start_ = 0;
            this.end_ = 0;
            this.allDay_ = false;
            this.reminderMinutes_ = 0;
        }

        public static CalendarInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CalendarProtos.internal_static_CalendarInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarInfo parseDelimitedFrom(InputStream inputStream) {
            return (CalendarInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<CalendarInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarInfo)) {
                return super.equals(obj);
            }
            CalendarInfo calendarInfo = (CalendarInfo) obj;
            boolean z6 = hasTitle() == calendarInfo.hasTitle();
            if (hasTitle()) {
                z6 = z6 && getTitle().equals(calendarInfo.getTitle());
            }
            boolean z7 = z6 && hasDescription() == calendarInfo.hasDescription();
            if (hasDescription()) {
                z7 = z7 && getDescription().equals(calendarInfo.getDescription());
            }
            boolean z8 = z7 && hasLocation() == calendarInfo.hasLocation();
            if (hasLocation()) {
                z8 = z8 && getLocation().equals(calendarInfo.getLocation());
            }
            boolean z9 = z8 && hasStart() == calendarInfo.hasStart();
            if (hasStart()) {
                z9 = z9 && getStart() == calendarInfo.getStart();
            }
            boolean z10 = z9 && hasEnd() == calendarInfo.hasEnd();
            if (hasEnd()) {
                z10 = z10 && getEnd() == calendarInfo.getEnd();
            }
            boolean z11 = z10 && hasAllDay() == calendarInfo.hasAllDay();
            if (hasAllDay()) {
                z11 = z11 && getAllDay() == calendarInfo.getAllDay();
            }
            boolean z12 = z11 && hasReminderMinutes() == calendarInfo.hasReminderMinutes();
            if (hasReminderMinutes()) {
                z12 = z12 && getReminderMinutes() == calendarInfo.getReminderMinutes();
            }
            return z12 && this.unknownFields.equals(calendarInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean getAllDay() {
            return this.allDay_;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.description_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public String getLocation() {
            Object obj = this.location_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.location_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public ByteString getLocationBytes() {
            Object obj = this.location_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.location_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public int getReminderMinutes() {
            return this.reminderMinutes_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.title_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.description_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.location_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.start_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.end_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(6, this.allDay_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(7, this.reminderMinutes_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public int getStart() {
            return this.start_;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.title_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean hasAllDay() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean hasDescription() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean hasReminderMinutes() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean hasStart() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.CalendarProtos.CalendarInfoOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) == 1;
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
            if (hasDescription()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDescription().hashCode();
            }
            if (hasLocation()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getLocation().hashCode();
            }
            if (hasStart()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getStart();
            }
            if (hasEnd()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getEnd();
            }
            if (hasAllDay()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + Internal.hashBoolean(getAllDay());
            }
            if (hasReminderMinutes()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getReminderMinutes();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CalendarProtos.internal_static_CalendarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarInfo.class, Builder.class);
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
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDescription()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLocation()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasStart()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasEnd()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAllDay()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReminderMinutes()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.title_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.description_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.location_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeUInt32(4, this.start_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeUInt32(5, this.end_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBool(6, this.allDay_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(7, this.reminderMinutes_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private CalendarInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.title_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.description_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.location_ = bytes3;
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.start_ = codedInputStream.readUInt32();
                            } else if (tag == 40) {
                                this.bitField0_ |= 16;
                                this.end_ = codedInputStream.readUInt32();
                            } else if (tag == 48) {
                                this.bitField0_ |= 32;
                                this.allDay_ = codedInputStream.readBool();
                            } else if (tag == 56) {
                                this.bitField0_ |= 64;
                                this.reminderMinutes_ = codedInputStream.readInt32();
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

        public static Builder newBuilder(CalendarInfo calendarInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarInfo);
        }

        public static CalendarInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarInfo parseFrom(CodedInputStream codedInputStream) {
            return (CalendarInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private CalendarInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalendarInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalendarInfo parseFrom(InputStream inputStream) {
            return (CalendarInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CalendarInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CalendarInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CalendarInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface CalendarInfoOrBuilder extends MessageOrBuilder {
        boolean getAllDay();

        String getDescription();

        ByteString getDescriptionBytes();

        int getEnd();

        String getLocation();

        ByteString getLocationBytes();

        int getReminderMinutes();

        int getStart();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasAllDay();

        boolean hasDescription();

        boolean hasEnd();

        boolean hasLocation();

        boolean hasReminderMinutes();

        boolean hasStart();

        boolean hasTitle();
    }

    public interface CalendarOrBuilder extends MessageOrBuilder {
        CalendarInfo getCalendarInfo();

        CalendarInfo.List getCalendarInfoList();

        CalendarInfo.ListOrBuilder getCalendarInfoListOrBuilder();

        CalendarInfoOrBuilder getCalendarInfoOrBuilder();

        Calendar.PayloadCase getPayloadCase();

        boolean hasCalendarInfo();

        boolean hasCalendarInfoList();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013wear_calendar.proto\u001a\fnanopb.proto\"Ä\u0001\n\bCalendar\u0012&\n\rcalendar_info\u0018\u0001 \u0001(\u000b2\r.CalendarInfoH\u0000\u00120\n\u0012calendar_info_list\u0018\u0002 \u0001(\u000b2\u0012.CalendarInfo.ListH\u0000\"S\n\nCalendarID\u0012\u0016\n\u0012SYNC_CALENDAR_INFO\u0010\u0000\u0012\u001b\n\u0017SYNC_CALENDAR_INFO_LIST\u0010\u0001\u0012\u0010\n\fWEAR_REQUEST\u0010\u0002B\t\n\u0007payload\"Ì\u0001\n\fCalendarInfo\u0012\u0014\n\u0005title\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bdescription\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\blocation\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\r\n\u0005start\u0018\u0004 \u0002(\r\u0012\u000b\n\u0003end\u0018\u0005 \u0002(\r\u0012\u000f\n\u0007all_day\u0018\u0006 \u0002(\b\u0012\u0018\n\u0010reminder_minutes\u0018\u0007 \u0002(\u0005\u001a*\n\u0004List\u0012\"\n\u0004list\u0018\u0001 \u0003(\u000b2\r.CalendarInfoB\u0005\u0092?\u0002\u0018\u0004B&\n\u0014com.zh.wear.protobufB\u000eCalendarProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.CalendarProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = CalendarProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Calendar_descriptor = descriptor2;
        internal_static_Calendar_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CalendarInfo", "CalendarInfoList", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CalendarInfo_descriptor = descriptor3;
        internal_static_CalendarInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Title", "Description", "Location", DebugTraceUtil.f25392b, "End", "AllDay", "ReminderMinutes"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_CalendarInfo_List_descriptor = descriptor4;
        internal_static_CalendarInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{MessageLiteToString.f20028a});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private CalendarProtos() {
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