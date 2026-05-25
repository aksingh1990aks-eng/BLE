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

/* JADX INFO: loaded from: classes8.dex */
public final class WeatherProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_Alerts_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Alerts_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Alerts_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Alerts_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SunRiseSet_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SunRiseSet_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherForecast_Data_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherForecast_Data_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherForecast_Data_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherForecast_Data_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherForecast_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherForecast_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherHourForecast_Data_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherHourForecast_Data_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherHourForecast_Data_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherHourForecast_Data_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherHourForecast_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherHourForecast_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherId_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherId_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeatherLatest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherLatest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Weather_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Weather_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.WeatherProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$WeatherProtos$Weather$PayloadCase;

        static {
            int[] iArr = new int[Weather.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$WeatherProtos$Weather$PayloadCase = iArr;
            try {
                iArr[Weather.PayloadCase.LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WeatherProtos$Weather$PayloadCase[Weather.PayloadCase.FORECAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WeatherProtos$Weather$PayloadCase[Weather.PayloadCase.PRESSURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WeatherProtos$Weather$PayloadCase[Weather.PayloadCase.HOURFORECAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WeatherProtos$Weather$PayloadCase[Weather.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class Alerts extends GeneratedMessageV3 implements AlertsOrBuilder {
        public static final int DETAIL_FIELD_NUMBER = 4;
        public static final int LEVEL_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object detail_;
        private volatile Object level_;
        private byte memoizedIsInitialized;
        private volatile Object title_;
        private volatile Object type_;
        private static final Alerts DEFAULT_INSTANCE = new Alerts();

        @Deprecated
        public static final Parser<Alerts> PARSER = new AbstractParser<Alerts>() { // from class: com.zh.wear.protobuf.WeatherProtos.Alerts.1
            @Override // com.google.protobuf.Parser
            public Alerts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Alerts(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertsOrBuilder {
            private int bitField0_;
            private Object detail_;
            private Object level_;
            private Object title_;
            private Object type_;

            private Builder() {
                this.type_ = "";
                this.level_ = "";
                this.title_ = "";
                this.detail_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_Alerts_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDetail() {
                this.bitField0_ &= -9;
                this.detail_ = Alerts.getDefaultInstance().getDetail();
                onChanged();
                return this;
            }

            public Builder clearLevel() {
                this.bitField0_ &= -3;
                this.level_ = Alerts.getDefaultInstance().getLevel();
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.bitField0_ &= -5;
                this.title_ = Alerts.getDefaultInstance().getTitle();
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = Alerts.getDefaultInstance().getType();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_Alerts_descriptor;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public String getDetail() {
                Object obj = this.detail_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.detail_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public ByteString getDetailBytes() {
                Object obj = this.detail_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.detail_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public String getLevel() {
                Object obj = this.level_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.level_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public ByteString getLevelBytes() {
                Object obj = this.level_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.level_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
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

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.type_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public boolean hasDetail() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public boolean hasLevel() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_Alerts_fieldAccessorTable.ensureFieldAccessorsInitialized(Alerts.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasType() && hasLevel();
            }

            public Builder setDetail(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.detail_ = str;
                onChanged();
                return this;
            }

            public Builder setDetailBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.detail_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLevel(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.level_ = str;
                onChanged();
                return this;
            }

            public Builder setLevelBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.level_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.title_ = str;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.title_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.type_ = str;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.type_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = "";
                this.level_ = "";
                this.title_ = "";
                this.detail_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Alerts build() {
                Alerts alertsBuildPartial = buildPartial();
                if (alertsBuildPartial.isInitialized()) {
                    return alertsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Alerts buildPartial() {
                Alerts alerts = new Alerts(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alerts.type_ = this.type_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alerts.level_ = this.level_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                alerts.title_ = this.title_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                alerts.detail_ = this.detail_;
                alerts.bitField0_ = i8;
                onBuilt();
                return alerts;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Alerts getDefaultInstanceForType() {
                return Alerts.getDefaultInstance();
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
                this.type_ = "";
                int i7 = this.bitField0_;
                this.level_ = "";
                this.title_ = "";
                this.detail_ = "";
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
            public com.zh.wear.protobuf.WeatherProtos.Alerts.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$Alerts> r1 = com.zh.wear.protobuf.WeatherProtos.Alerts.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WeatherProtos$Alerts r3 = (com.zh.wear.protobuf.WeatherProtos.Alerts) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WeatherProtos$Alerts r4 = (com.zh.wear.protobuf.WeatherProtos.Alerts) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.Alerts.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$Alerts$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Alerts) {
                    return mergeFrom((Alerts) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Alerts alerts) {
                if (alerts == Alerts.getDefaultInstance()) {
                    return this;
                }
                if (alerts.hasType()) {
                    this.bitField0_ |= 1;
                    this.type_ = alerts.type_;
                    onChanged();
                }
                if (alerts.hasLevel()) {
                    this.bitField0_ |= 2;
                    this.level_ = alerts.level_;
                    onChanged();
                }
                if (alerts.hasTitle()) {
                    this.bitField0_ |= 4;
                    this.title_ = alerts.title_;
                    onChanged();
                }
                if (alerts.hasDetail()) {
                    this.bitField0_ |= 8;
                    this.detail_ = alerts.detail_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alerts).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<Alerts> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.WeatherProtos.Alerts.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> listBuilder_;
                private java.util.List<Alerts> list_;

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
                    return WeatherProtos.internal_static_Alerts_List_descriptor;
                }

                private RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends Alerts> iterable) {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(Alerts.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return WeatherProtos.internal_static_Alerts_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
                public Alerts getList(int i7) {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (Alerts) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
                public java.util.List<Alerts> getListList() {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
                public AlertsOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlertsOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
                public java.util.List<? extends AlertsOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProtos.internal_static_Alerts_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, Alerts alerts) {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, alerts);
                        return this;
                    }
                    alerts.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, alerts);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, Alerts.getDefaultInstance());
                }

                public Builder setList(int i7, Alerts alerts) {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, alerts);
                        return this;
                    }
                    alerts.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, alerts);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(Alerts alerts) {
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(alerts);
                        return this;
                    }
                    alerts.getClass();
                    ensureListIsMutable();
                    this.list_.add(alerts);
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
                    RepeatedFieldBuilderV3<Alerts, Builder, AlertsOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.WeatherProtos.Alerts.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$Alerts$List> r1 = com.zh.wear.protobuf.WeatherProtos.Alerts.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.WeatherProtos$Alerts$List r3 = (com.zh.wear.protobuf.WeatherProtos.Alerts.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.WeatherProtos$Alerts$List r4 = (com.zh.wear.protobuf.WeatherProtos.Alerts.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.Alerts.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$Alerts$List$Builder");
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
                return WeatherProtos.internal_static_Alerts_List_descriptor;
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

            @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
            public Alerts getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
            public java.util.List<Alerts> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
            public AlertsOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.Alerts.ListOrBuilder
            public java.util.List<? extends AlertsOrBuilder> getListOrBuilderList() {
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
                return WeatherProtos.internal_static_Alerts_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((Alerts) codedInputStream.readMessage(Alerts.PARSER, extensionRegistryLite));
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
            Alerts getList(int i7);

            int getListCount();

            java.util.List<Alerts> getListList();

            AlertsOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends AlertsOrBuilder> getListOrBuilderList();
        }

        private Alerts() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = "";
            this.level_ = "";
            this.title_ = "";
            this.detail_ = "";
        }

        public static Alerts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_Alerts_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Alerts parseDelimitedFrom(InputStream inputStream) {
            return (Alerts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Alerts parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Alerts> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Alerts)) {
                return super.equals(obj);
            }
            Alerts alerts = (Alerts) obj;
            boolean z6 = hasType() == alerts.hasType();
            if (hasType()) {
                z6 = z6 && getType().equals(alerts.getType());
            }
            boolean z7 = z6 && hasLevel() == alerts.hasLevel();
            if (hasLevel()) {
                z7 = z7 && getLevel().equals(alerts.getLevel());
            }
            boolean z8 = z7 && hasTitle() == alerts.hasTitle();
            if (hasTitle()) {
                z8 = z8 && getTitle().equals(alerts.getTitle());
            }
            boolean z9 = z8 && hasDetail() == alerts.hasDetail();
            if (hasDetail()) {
                z9 = z9 && getDetail().equals(alerts.getDetail());
            }
            return z9 && this.unknownFields.equals(alerts.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public String getDetail() {
            Object obj = this.detail_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.detail_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public ByteString getDetailBytes() {
            Object obj = this.detail_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.detail_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public String getLevel() {
            Object obj = this.level_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.level_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public ByteString getLevelBytes() {
            Object obj = this.level_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.level_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Alerts> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.level_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.title_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.detail_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
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

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.type_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public boolean hasDetail() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public boolean hasLevel() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.AlertsOrBuilder
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
                iHashCode = (((iHashCode * 37) + 1) * 53) + getType().hashCode();
            }
            if (hasLevel()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getLevel().hashCode();
            }
            if (hasTitle()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTitle().hashCode();
            }
            if (hasDetail()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDetail().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_Alerts_fieldAccessorTable.ensureFieldAccessorsInitialized(Alerts.class, Builder.class);
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
            if (hasLevel()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.type_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.level_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.title_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.detail_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Alerts(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.type_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.level_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.title_ = bytes3;
                            } else if (tag == 34) {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.detail_ = bytes4;
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

        public static Builder newBuilder(Alerts alerts) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alerts);
        }

        public static Alerts parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Alerts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Alerts parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Alerts parseFrom(CodedInputStream codedInputStream) {
            return (Alerts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Alerts getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Alerts(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Alerts parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Alerts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Alerts parseFrom(InputStream inputStream) {
            return (Alerts) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Alerts parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Alerts) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Alerts parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Alerts parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Alerts parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Alerts parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlertsOrBuilder extends MessageOrBuilder {
        String getDetail();

        ByteString getDetailBytes();

        String getLevel();

        ByteString getLevelBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getType();

        ByteString getTypeBytes();

        boolean hasDetail();

        boolean hasLevel();

        boolean hasTitle();

        boolean hasType();
    }

    public static final class SunRiseSet extends GeneratedMessageV3 implements SunRiseSetOrBuilder {
        private static final SunRiseSet DEFAULT_INSTANCE = new SunRiseSet();

        @Deprecated
        public static final Parser<SunRiseSet> PARSER = new AbstractParser<SunRiseSet>() { // from class: com.zh.wear.protobuf.WeatherProtos.SunRiseSet.1
            @Override // com.google.protobuf.Parser
            public SunRiseSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new SunRiseSet(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SUN_RISE_FIELD_NUMBER = 1;
        public static final int SUN_SET_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object sunRise_;
        private volatile Object sunSet_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SunRiseSetOrBuilder {
            private int bitField0_;
            private Object sunRise_;
            private Object sunSet_;

            private Builder() {
                this.sunRise_ = "";
                this.sunSet_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_SunRiseSet_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearSunRise() {
                this.bitField0_ &= -2;
                this.sunRise_ = SunRiseSet.getDefaultInstance().getSunRise();
                onChanged();
                return this;
            }

            public Builder clearSunSet() {
                this.bitField0_ &= -3;
                this.sunSet_ = SunRiseSet.getDefaultInstance().getSunSet();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_SunRiseSet_descriptor;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
            public String getSunRise() {
                Object obj = this.sunRise_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sunRise_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
            public ByteString getSunRiseBytes() {
                Object obj = this.sunRise_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sunRise_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
            public String getSunSet() {
                Object obj = this.sunSet_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sunSet_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
            public ByteString getSunSetBytes() {
                Object obj = this.sunSet_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sunSet_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
            public boolean hasSunRise() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
            public boolean hasSunSet() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_SunRiseSet_fieldAccessorTable.ensureFieldAccessorsInitialized(SunRiseSet.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSunRise() && hasSunSet();
            }

            public Builder setSunRise(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.sunRise_ = str;
                onChanged();
                return this;
            }

            public Builder setSunRiseBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.sunRise_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSunSet(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.sunSet_ = str;
                onChanged();
                return this;
            }

            public Builder setSunSetBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.sunSet_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sunRise_ = "";
                this.sunSet_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SunRiseSet build() {
                SunRiseSet sunRiseSetBuildPartial = buildPartial();
                if (sunRiseSetBuildPartial.isInitialized()) {
                    return sunRiseSetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sunRiseSetBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SunRiseSet buildPartial() {
                SunRiseSet sunRiseSet = new SunRiseSet(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                sunRiseSet.sunRise_ = this.sunRise_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                sunRiseSet.sunSet_ = this.sunSet_;
                sunRiseSet.bitField0_ = i8;
                onBuilt();
                return sunRiseSet;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SunRiseSet getDefaultInstanceForType() {
                return SunRiseSet.getDefaultInstance();
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
                this.sunRise_ = "";
                int i7 = this.bitField0_;
                this.sunSet_ = "";
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
            public com.zh.wear.protobuf.WeatherProtos.SunRiseSet.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$SunRiseSet> r1 = com.zh.wear.protobuf.WeatherProtos.SunRiseSet.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WeatherProtos$SunRiseSet r3 = (com.zh.wear.protobuf.WeatherProtos.SunRiseSet) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WeatherProtos$SunRiseSet r4 = (com.zh.wear.protobuf.WeatherProtos.SunRiseSet) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.SunRiseSet.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$SunRiseSet$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SunRiseSet) {
                    return mergeFrom((SunRiseSet) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SunRiseSet sunRiseSet) {
                if (sunRiseSet == SunRiseSet.getDefaultInstance()) {
                    return this;
                }
                if (sunRiseSet.hasSunRise()) {
                    this.bitField0_ |= 1;
                    this.sunRise_ = sunRiseSet.sunRise_;
                    onChanged();
                }
                if (sunRiseSet.hasSunSet()) {
                    this.bitField0_ |= 2;
                    this.sunSet_ = sunRiseSet.sunSet_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) sunRiseSet).unknownFields);
                onChanged();
                return this;
            }
        }

        private SunRiseSet() {
            this.memoizedIsInitialized = (byte) -1;
            this.sunRise_ = "";
            this.sunSet_ = "";
        }

        public static SunRiseSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_SunRiseSet_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SunRiseSet parseDelimitedFrom(InputStream inputStream) {
            return (SunRiseSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SunRiseSet parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<SunRiseSet> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SunRiseSet)) {
                return super.equals(obj);
            }
            SunRiseSet sunRiseSet = (SunRiseSet) obj;
            boolean z6 = hasSunRise() == sunRiseSet.hasSunRise();
            if (hasSunRise()) {
                z6 = z6 && getSunRise().equals(sunRiseSet.getSunRise());
            }
            boolean z7 = z6 && hasSunSet() == sunRiseSet.hasSunSet();
            if (hasSunSet()) {
                z7 = z7 && getSunSet().equals(sunRiseSet.getSunSet());
            }
            return z7 && this.unknownFields.equals(sunRiseSet.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SunRiseSet> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.sunRise_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.sunSet_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
        public String getSunRise() {
            Object obj = this.sunRise_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sunRise_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
        public ByteString getSunRiseBytes() {
            Object obj = this.sunRise_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sunRise_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
        public String getSunSet() {
            Object obj = this.sunSet_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sunSet_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
        public ByteString getSunSetBytes() {
            Object obj = this.sunSet_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sunSet_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
        public boolean hasSunRise() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.SunRiseSetOrBuilder
        public boolean hasSunSet() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSunRise()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSunRise().hashCode();
            }
            if (hasSunSet()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSunSet().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_SunRiseSet_fieldAccessorTable.ensureFieldAccessorsInitialized(SunRiseSet.class, Builder.class);
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
            if (!hasSunRise()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSunSet()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.sunRise_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.sunSet_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private SunRiseSet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.sunRise_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.sunSet_ = bytes2;
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

        public static Builder newBuilder(SunRiseSet sunRiseSet) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sunRiseSet);
        }

        public static SunRiseSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SunRiseSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SunRiseSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SunRiseSet parseFrom(CodedInputStream codedInputStream) {
            return (SunRiseSet) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SunRiseSet getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SunRiseSet(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SunRiseSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SunRiseSet) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SunRiseSet parseFrom(InputStream inputStream) {
            return (SunRiseSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SunRiseSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SunRiseSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SunRiseSet parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static SunRiseSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SunRiseSet parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SunRiseSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface SunRiseSetOrBuilder extends MessageOrBuilder {
        String getSunRise();

        ByteString getSunRiseBytes();

        String getSunSet();

        ByteString getSunSetBytes();

        boolean hasSunRise();

        boolean hasSunSet();
    }

    public static final class Weather extends GeneratedMessageV3 implements WeatherOrBuilder {
        public static final int FORECAST_FIELD_NUMBER = 2;
        public static final int HOURFORECAST_FIELD_NUMBER = 4;
        public static final int LATEST_FIELD_NUMBER = 1;
        public static final int PRESSURE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Weather DEFAULT_INSTANCE = new Weather();

        @Deprecated
        public static final Parser<Weather> PARSER = new AbstractParser<Weather>() { // from class: com.zh.wear.protobuf.WeatherProtos.Weather.1
            @Override // com.google.protobuf.Parser
            public Weather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Weather(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> forecastBuilder_;
            private SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> hourforecastBuilder_;
            private SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> latestBuilder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_Weather_descriptor;
            }

            private SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> getForecastFieldBuilder() {
                if (this.forecastBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = WeatherForecast.getDefaultInstance();
                    }
                    this.forecastBuilder_ = new SingleFieldBuilderV3<>((WeatherForecast) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.forecastBuilder_;
            }

            private SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> getHourforecastFieldBuilder() {
                if (this.hourforecastBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = WeatherHourForecast.getDefaultInstance();
                    }
                    this.hourforecastBuilder_ = new SingleFieldBuilderV3<>((WeatherHourForecast) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.hourforecastBuilder_;
            }

            private SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> getLatestFieldBuilder() {
                if (this.latestBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = WeatherLatest.getDefaultInstance();
                    }
                    this.latestBuilder_ = new SingleFieldBuilderV3<>((WeatherLatest) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.latestBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearForecast() {
                SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
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

            public Builder clearHourforecast() {
                SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> singleFieldBuilderV3 = this.hourforecastBuilder_;
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

            public Builder clearLatest() {
                SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> singleFieldBuilderV3 = this.latestBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearPressure() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_Weather_descriptor;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public WeatherForecast getForecast() {
                Object message;
                SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return WeatherForecast.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return WeatherForecast.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WeatherForecast) message;
            }

            public WeatherForecast.Builder getForecastBuilder() {
                return (WeatherForecast.Builder) getForecastFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public WeatherForecastOrBuilder getForecastOrBuilder() {
                SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.forecastBuilder_) == null) ? i7 == 2 ? (WeatherForecast) this.payload_ : WeatherForecast.getDefaultInstance() : (WeatherForecastOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public WeatherHourForecast getHourforecast() {
                Object message;
                SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> singleFieldBuilderV3 = this.hourforecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 4) {
                        return WeatherHourForecast.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 4) {
                        return WeatherHourForecast.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WeatherHourForecast) message;
            }

            public WeatherHourForecast.Builder getHourforecastBuilder() {
                return (WeatherHourForecast.Builder) getHourforecastFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public WeatherHourForecastOrBuilder getHourforecastOrBuilder() {
                SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilderV3 = this.hourforecastBuilder_) == null) ? i7 == 4 ? (WeatherHourForecast) this.payload_ : WeatherHourForecast.getDefaultInstance() : (WeatherHourForecastOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public WeatherLatest getLatest() {
                Object message;
                SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> singleFieldBuilderV3 = this.latestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return WeatherLatest.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return WeatherLatest.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WeatherLatest) message;
            }

            public WeatherLatest.Builder getLatestBuilder() {
                return (WeatherLatest.Builder) getLatestFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public WeatherLatestOrBuilder getLatestOrBuilder() {
                SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.latestBuilder_) == null) ? i7 == 1 ? (WeatherLatest) this.payload_ : WeatherLatest.getDefaultInstance() : (WeatherLatestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public float getPressure() {
                if (this.payloadCase_ == 3) {
                    return ((Float) this.payload_).floatValue();
                }
                return 0.0f;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public boolean hasForecast() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public boolean hasHourforecast() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public boolean hasLatest() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
            public boolean hasPressure() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_Weather_fieldAccessorTable.ensureFieldAccessorsInitialized(Weather.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasLatest() && !getLatest().isInitialized()) {
                    return false;
                }
                if (!hasForecast() || getForecast().isInitialized()) {
                    return !hasHourforecast() || getHourforecast().isInitialized();
                }
                return false;
            }

            public Builder mergeForecast(WeatherForecast weatherForecast) {
                SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != WeatherForecast.getDefaultInstance()) {
                        weatherForecast = WeatherForecast.newBuilder((WeatherForecast) this.payload_).mergeFrom(weatherForecast).buildPartial();
                    }
                    this.payload_ = weatherForecast;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(weatherForecast);
                    }
                    this.forecastBuilder_.setMessage(weatherForecast);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeHourforecast(WeatherHourForecast weatherHourForecast) {
                SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> singleFieldBuilderV3 = this.hourforecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4 && this.payload_ != WeatherHourForecast.getDefaultInstance()) {
                        weatherHourForecast = WeatherHourForecast.newBuilder((WeatherHourForecast) this.payload_).mergeFrom(weatherHourForecast).buildPartial();
                    }
                    this.payload_ = weatherHourForecast;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(weatherHourForecast);
                    }
                    this.hourforecastBuilder_.setMessage(weatherHourForecast);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeLatest(WeatherLatest weatherLatest) {
                SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> singleFieldBuilderV3 = this.latestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != WeatherLatest.getDefaultInstance()) {
                        weatherLatest = WeatherLatest.newBuilder((WeatherLatest) this.payload_).mergeFrom(weatherLatest).buildPartial();
                    }
                    this.payload_ = weatherLatest;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(weatherLatest);
                    }
                    this.latestBuilder_.setMessage(weatherLatest);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setForecast(WeatherForecast.Builder builder) {
                SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                WeatherForecast weatherForecastBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = weatherForecastBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherForecastBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setHourforecast(WeatherHourForecast.Builder builder) {
                SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> singleFieldBuilderV3 = this.hourforecastBuilder_;
                WeatherHourForecast weatherHourForecastBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = weatherHourForecastBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherHourForecastBuild);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setLatest(WeatherLatest.Builder builder) {
                SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> singleFieldBuilderV3 = this.latestBuilder_;
                WeatherLatest weatherLatestBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = weatherLatestBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherLatestBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setPressure(float f7) {
                this.payloadCase_ = 3;
                this.payload_ = Float.valueOf(f7);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setForecast(WeatherForecast weatherForecast) {
                SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weatherForecast.getClass();
                    this.payload_ = weatherForecast;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherForecast);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setHourforecast(WeatherHourForecast weatherHourForecast) {
                SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> singleFieldBuilderV3 = this.hourforecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weatherHourForecast.getClass();
                    this.payload_ = weatherHourForecast;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherHourForecast);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setLatest(WeatherLatest weatherLatest) {
                SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> singleFieldBuilderV3 = this.latestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weatherLatest.getClass();
                    this.payload_ = weatherLatest;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherLatest);
                }
                this.payloadCase_ = 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Weather build() {
                Weather weatherBuildPartial = buildPartial();
                if (weatherBuildPartial.isInitialized()) {
                    return weatherBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Weather buildPartial() {
                Weather weather = new Weather(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<WeatherLatest, WeatherLatest.Builder, WeatherLatestOrBuilder> singleFieldBuilderV3 = this.latestBuilder_;
                    weather.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<WeatherForecast, WeatherForecast.Builder, WeatherForecastOrBuilder> singleFieldBuilderV32 = this.forecastBuilder_;
                    weather.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 3) {
                    weather.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 4) {
                    SingleFieldBuilderV3<WeatherHourForecast, WeatherHourForecast.Builder, WeatherHourForecastOrBuilder> singleFieldBuilderV33 = this.hourforecastBuilder_;
                    weather.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                weather.bitField0_ = 0;
                weather.payloadCase_ = this.payloadCase_;
                onBuilt();
                return weather;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Weather getDefaultInstanceForType() {
                return Weather.getDefaultInstance();
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
            public com.zh.wear.protobuf.WeatherProtos.Weather.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$Weather> r1 = com.zh.wear.protobuf.WeatherProtos.Weather.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WeatherProtos$Weather r3 = (com.zh.wear.protobuf.WeatherProtos.Weather) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WeatherProtos$Weather r4 = (com.zh.wear.protobuf.WeatherProtos.Weather) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.Weather.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$Weather$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Weather) {
                    return mergeFrom((Weather) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Weather weather) {
                if (weather == Weather.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$WeatherProtos$Weather$PayloadCase[weather.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    mergeLatest(weather.getLatest());
                } else if (i7 == 2) {
                    mergeForecast(weather.getForecast());
                } else if (i7 == 3) {
                    setPressure(weather.getPressure());
                } else if (i7 == 4) {
                    mergeHourforecast(weather.getHourforecast());
                }
                mergeUnknownFields(((GeneratedMessage) weather).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            LATEST(1),
            FORECAST(2),
            PRESSURE(3),
            HOURFORECAST(4),
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
                    return LATEST;
                }
                if (i7 == 2) {
                    return FORECAST;
                }
                if (i7 == 3) {
                    return PRESSURE;
                }
                if (i7 != 4) {
                    return null;
                }
                return HOURFORECAST;
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

        public enum WeatherID implements ProtocolMessageEnum {
            LATEST_WEATHER(0),
            DAILY_FORECAST(1),
            HOURLY_FORECAST(2),
            WEAR_REQUEST(3),
            SET_PRESSURE(4);

            public static final int DAILY_FORECAST_VALUE = 1;
            public static final int HOURLY_FORECAST_VALUE = 2;
            public static final int LATEST_WEATHER_VALUE = 0;
            public static final int SET_PRESSURE_VALUE = 4;
            public static final int WEAR_REQUEST_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<WeatherID> internalValueMap = new Internal.EnumLiteMap<WeatherID>() { // from class: com.zh.wear.protobuf.WeatherProtos.Weather.WeatherID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public WeatherID findValueByNumber(int i7) {
                    return WeatherID.forNumber(i7);
                }
            };
            private static final WeatherID[] VALUES = values();

            WeatherID(int i7) {
                this.value = i7;
            }

            public static WeatherID forNumber(int i7) {
                if (i7 == 0) {
                    return LATEST_WEATHER;
                }
                if (i7 == 1) {
                    return DAILY_FORECAST;
                }
                if (i7 == 2) {
                    return HOURLY_FORECAST;
                }
                if (i7 == 3) {
                    return WEAR_REQUEST;
                }
                if (i7 != 4) {
                    return null;
                }
                return SET_PRESSURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Weather.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<WeatherID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static WeatherID valueOf(int i7) {
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

            public static WeatherID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private Weather() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Weather getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_Weather_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Weather parseDelimitedFrom(InputStream inputStream) {
            return (Weather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Weather parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Weather> parser() {
            return PARSER;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.WeatherProtos.Weather
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.WeatherProtos$Weather r6 = (com.zh.wear.protobuf.WeatherProtos.Weather) r6
                com.zh.wear.protobuf.WeatherProtos$Weather$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.WeatherProtos$Weather$PayloadCase r2 = r6.getPayloadCase()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 != 0) goto L1f
                return r2
            L1f:
                int r3 = r5.payloadCase_
                if (r3 == r0) goto L64
                r4 = 2
                if (r3 == r4) goto L53
                r4 = 3
                if (r3 == r4) goto L3e
                r4 = 4
                if (r3 == r4) goto L2d
                goto L77
            L2d:
                if (r1 == 0) goto L76
                com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast r1 = r5.getHourforecast()
                com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast r3 = r6.getHourforecast()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L76
                goto L74
            L3e:
                if (r1 == 0) goto L76
                float r1 = r5.getPressure()
                int r1 = java.lang.Float.floatToIntBits(r1)
                float r3 = r6.getPressure()
                int r3 = java.lang.Float.floatToIntBits(r3)
                if (r1 != r3) goto L76
                goto L74
            L53:
                if (r1 == 0) goto L76
                com.zh.wear.protobuf.WeatherProtos$WeatherForecast r1 = r5.getForecast()
                com.zh.wear.protobuf.WeatherProtos$WeatherForecast r3 = r6.getForecast()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L76
                goto L74
            L64:
                if (r1 == 0) goto L76
                com.zh.wear.protobuf.WeatherProtos$WeatherLatest r1 = r5.getLatest()
                com.zh.wear.protobuf.WeatherProtos$WeatherLatest r3 = r6.getLatest()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L76
            L74:
                r1 = r0
                goto L77
            L76:
                r1 = r2
            L77:
                if (r1 == 0) goto L84
                com.google.protobuf.UnknownFieldSet r1 = r5.unknownFields
                com.google.protobuf.UnknownFieldSet r6 = r6.unknownFields
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L84
                return r0
            L84:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.Weather.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public WeatherForecast getForecast() {
            return this.payloadCase_ == 2 ? (WeatherForecast) this.payload_ : WeatherForecast.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public WeatherForecastOrBuilder getForecastOrBuilder() {
            return this.payloadCase_ == 2 ? (WeatherForecast) this.payload_ : WeatherForecast.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public WeatherHourForecast getHourforecast() {
            return this.payloadCase_ == 4 ? (WeatherHourForecast) this.payload_ : WeatherHourForecast.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public WeatherHourForecastOrBuilder getHourforecastOrBuilder() {
            return this.payloadCase_ == 4 ? (WeatherHourForecast) this.payload_ : WeatherHourForecast.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public WeatherLatest getLatest() {
            return this.payloadCase_ == 1 ? (WeatherLatest) this.payload_ : WeatherLatest.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public WeatherLatestOrBuilder getLatestOrBuilder() {
            return this.payloadCase_ == 1 ? (WeatherLatest) this.payload_ : WeatherLatest.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Weather> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public float getPressure() {
            if (this.payloadCase_ == 3) {
                return ((Float) this.payload_).floatValue();
            }
            return 0.0f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (WeatherLatest) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (WeatherForecast) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(3, ((Float) this.payload_).floatValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (WeatherHourForecast) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public boolean hasForecast() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public boolean hasHourforecast() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public boolean hasLatest() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherOrBuilder
        public boolean hasPressure() {
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
                iHashCode = getLatest().hashCode();
            } else if (i9 == 2) {
                i7 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getForecast().hashCode();
            } else {
                if (i9 != 3) {
                    if (i9 == 4) {
                        i7 = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = getHourforecast().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i7 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = Float.floatToIntBits(getPressure());
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_Weather_fieldAccessorTable.ensureFieldAccessorsInitialized(Weather.class, Builder.class);
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
            if (hasLatest() && !getLatest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasForecast() && !getForecast().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHourforecast() || getHourforecast().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (WeatherLatest) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (WeatherForecast) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeFloat(3, ((Float) this.payload_).floatValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (WeatherHourForecast) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Weather(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                WeatherLatest.Builder builder = this.payloadCase_ == 1 ? ((WeatherLatest) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(WeatherLatest.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((WeatherLatest) message);
                                    this.payload_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                i7 = 2;
                                WeatherForecast.Builder builder2 = this.payloadCase_ == 2 ? ((WeatherForecast) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(WeatherForecast.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((WeatherForecast) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                            } else if (tag == 29) {
                                this.payloadCase_ = 3;
                                this.payload_ = Float.valueOf(codedInputStream.readFloat());
                            } else if (tag == 34) {
                                i7 = 4;
                                WeatherHourForecast.Builder builder3 = this.payloadCase_ == 4 ? ((WeatherHourForecast) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(WeatherHourForecast.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((WeatherHourForecast) message3);
                                    this.payload_ = builder3.buildPartial();
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

        public static Builder newBuilder(Weather weather) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weather);
        }

        public static Weather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Weather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Weather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Weather parseFrom(CodedInputStream codedInputStream) {
            return (Weather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Weather getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Weather(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Weather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Weather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Weather parseFrom(InputStream inputStream) {
            return (Weather) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Weather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Weather) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Weather parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Weather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Weather parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Weather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public static final class WeatherForecast extends GeneratedMessageV3 implements WeatherForecastOrBuilder {
        public static final int DATA_LIST_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Data.List dataList_;
        private WeatherId id_;
        private byte memoizedIsInitialized;
        private static final WeatherForecast DEFAULT_INSTANCE = new WeatherForecast();

        @Deprecated
        public static final Parser<WeatherForecast> PARSER = new AbstractParser<WeatherForecast>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherForecast.1
            @Override // com.google.protobuf.Parser
            public WeatherForecast parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WeatherForecast(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherForecastOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> dataListBuilder_;
            private Data.List dataList_;
            private SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> idBuilder_;
            private WeatherId id_;

            private Builder() {
                this.id_ = null;
                this.dataList_ = null;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> getDataListFieldBuilder() {
                if (this.dataListBuilder_ == null) {
                    this.dataListBuilder_ = new SingleFieldBuilderV3<>(getDataList(), getParentForChildren(), isClean());
                    this.dataList_ = null;
                }
                return this.dataListBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_WeatherForecast_descriptor;
            }

            private SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> getIdFieldBuilder() {
                if (this.idBuilder_ == null) {
                    this.idBuilder_ = new SingleFieldBuilderV3<>(getId(), getParentForChildren(), isClean());
                    this.id_ = null;
                }
                return this.idBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getIdFieldBuilder();
                    getDataListFieldBuilder();
                }
            }

            public Builder clearDataList() {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataList_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearId() {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.id_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
            public Data.List getDataList() {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Data.List) singleFieldBuilderV3.getMessage();
                }
                Data.List list = this.dataList_;
                return list == null ? Data.List.getDefaultInstance() : list;
            }

            public Data.List.Builder getDataListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Data.List.Builder) getDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
            public Data.ListOrBuilder getDataListOrBuilder() {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Data.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Data.List list = this.dataList_;
                return list == null ? Data.List.getDefaultInstance() : list;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_WeatherForecast_descriptor;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
            public WeatherId getId() {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherId) singleFieldBuilderV3.getMessage();
                }
                WeatherId weatherId = this.id_;
                return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
            }

            public WeatherId.Builder getIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WeatherId.Builder) getIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
            public WeatherIdOrBuilder getIdOrBuilder() {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WeatherId weatherId = this.id_;
                return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
            public boolean hasDataList() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_WeatherForecast_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherForecast.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasDataList() && getId().isInitialized() && getDataList().isInitialized();
            }

            public Builder mergeDataList(Data.List list) {
                Data.List list2;
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) == 2 && (list2 = this.dataList_) != null && list2 != Data.List.getDefaultInstance()) {
                        list = Data.List.newBuilder(this.dataList_).mergeFrom(list).buildPartial();
                    }
                    this.dataList_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(list);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeId(WeatherId weatherId) {
                WeatherId weatherId2;
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 1 && (weatherId2 = this.id_) != null && weatherId2 != WeatherId.getDefaultInstance()) {
                        weatherId = WeatherId.newBuilder(this.id_).mergeFrom(weatherId).buildPartial();
                    }
                    this.id_ = weatherId;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(weatherId);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setDataList(Data.List.Builder builder) {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                Data.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.dataList_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setId(WeatherId.Builder builder) {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                WeatherId weatherIdBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.id_ = weatherIdBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherIdBuild);
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = null;
                this.dataList_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setDataList(Data.List list) {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.dataList_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setId(WeatherId weatherId) {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weatherId.getClass();
                    this.id_ = weatherId;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherId);
                }
                this.bitField0_ |= 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherForecast build() {
                WeatherForecast weatherForecastBuildPartial = buildPartial();
                if (weatherForecastBuildPartial.isInitialized()) {
                    return weatherForecastBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherForecastBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherForecast buildPartial() {
                WeatherForecast weatherForecast = new WeatherForecast(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                weatherForecast.id_ = singleFieldBuilderV3 == null ? this.id_ : (WeatherId) singleFieldBuilderV3.build();
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV32 = this.dataListBuilder_;
                weatherForecast.dataList_ = singleFieldBuilderV32 == null ? this.dataList_ : (Data.List) singleFieldBuilderV32.build();
                weatherForecast.bitField0_ = i8;
                onBuilt();
                return weatherForecast;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WeatherForecast getDefaultInstanceForType() {
                return WeatherForecast.getDefaultInstance();
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
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.id_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV32 = this.dataListBuilder_;
                if (singleFieldBuilderV32 == null) {
                    this.dataList_ = null;
                } else {
                    singleFieldBuilderV32.clear();
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
            public com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherForecast> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherForecast.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WeatherProtos$WeatherForecast r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherForecast) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WeatherProtos$WeatherForecast r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherForecast) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WeatherForecast) {
                    return mergeFrom((WeatherForecast) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WeatherForecast weatherForecast) {
                if (weatherForecast == WeatherForecast.getDefaultInstance()) {
                    return this;
                }
                if (weatherForecast.hasId()) {
                    mergeId(weatherForecast.getId());
                }
                if (weatherForecast.hasDataList()) {
                    mergeDataList(weatherForecast.getDataList());
                }
                mergeUnknownFields(((GeneratedMessage) weatherForecast).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class Data extends GeneratedMessageV3 implements DataOrBuilder {
            public static final int AQI_FIELD_NUMBER = 1;
            public static final int HUMIDITY_FIELD_NUMBER = 6;
            public static final int PROBABILITY_OF_RAINFALL_FIELD_NUMBER = 7;
            public static final int SUN_RISE_SET_FIELD_NUMBER = 5;
            public static final int TEMPERATURE_FIELD_NUMBER = 3;
            public static final int TEMPERATURE_UNIT_FIELD_NUMBER = 4;
            public static final int WEATHER_FIELD_NUMBER = 2;
            public static final int WIND_INFO_FIELD_NUMBER = 8;
            public static final int WIND_SPEED_FIELD_NUMBER = 9;
            private static final long serialVersionUID = 0;
            private CommonProtos.KeyValue aqi_;
            private int bitField0_;
            private CommonProtos.KeyValue humidity_;
            private byte memoizedIsInitialized;
            private CommonProtos.KeyValue probabilityOfRainfall_;
            private SunRiseSet sunRiseSet_;
            private volatile Object temperatureUnit_;
            private CommonProtos.RangeValue temperature_;
            private int weather_;
            private CommonProtos.KeyValue windInfo_;
            private CommonProtos.KeyValue windSpeed_;
            private static final Data DEFAULT_INSTANCE = new Data();

            @Deprecated
            public static final Parser<Data> PARSER = new AbstractParser<Data>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.1
                @Override // com.google.protobuf.Parser
                public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Data(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataOrBuilder {
                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> aqiBuilder_;
                private CommonProtos.KeyValue aqi_;
                private int bitField0_;
                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> humidityBuilder_;
                private CommonProtos.KeyValue humidity_;
                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> probabilityOfRainfallBuilder_;
                private CommonProtos.KeyValue probabilityOfRainfall_;
                private SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> sunRiseSetBuilder_;
                private SunRiseSet sunRiseSet_;
                private SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> temperatureBuilder_;
                private Object temperatureUnit_;
                private CommonProtos.RangeValue temperature_;
                private int weather_;
                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> windInfoBuilder_;
                private CommonProtos.KeyValue windInfo_;
                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> windSpeedBuilder_;
                private CommonProtos.KeyValue windSpeed_;

                private Builder() {
                    this.aqi_ = null;
                    this.temperature_ = null;
                    this.temperatureUnit_ = "";
                    this.sunRiseSet_ = null;
                    this.humidity_ = null;
                    this.probabilityOfRainfall_ = null;
                    this.windInfo_ = null;
                    this.windSpeed_ = null;
                    maybeForceBuilderInitialization();
                }

                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getAqiFieldBuilder() {
                    if (this.aqiBuilder_ == null) {
                        this.aqiBuilder_ = new SingleFieldBuilderV3<>(getAqi(), getParentForChildren(), isClean());
                        this.aqi_ = null;
                    }
                    return this.aqiBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProtos.internal_static_WeatherForecast_Data_descriptor;
                }

                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getHumidityFieldBuilder() {
                    if (this.humidityBuilder_ == null) {
                        this.humidityBuilder_ = new SingleFieldBuilderV3<>(getHumidity(), getParentForChildren(), isClean());
                        this.humidity_ = null;
                    }
                    return this.humidityBuilder_;
                }

                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getProbabilityOfRainfallFieldBuilder() {
                    if (this.probabilityOfRainfallBuilder_ == null) {
                        this.probabilityOfRainfallBuilder_ = new SingleFieldBuilderV3<>(getProbabilityOfRainfall(), getParentForChildren(), isClean());
                        this.probabilityOfRainfall_ = null;
                    }
                    return this.probabilityOfRainfallBuilder_;
                }

                private SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> getSunRiseSetFieldBuilder() {
                    if (this.sunRiseSetBuilder_ == null) {
                        this.sunRiseSetBuilder_ = new SingleFieldBuilderV3<>(getSunRiseSet(), getParentForChildren(), isClean());
                        this.sunRiseSet_ = null;
                    }
                    return this.sunRiseSetBuilder_;
                }

                private SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> getTemperatureFieldBuilder() {
                    if (this.temperatureBuilder_ == null) {
                        this.temperatureBuilder_ = new SingleFieldBuilderV3<>(getTemperature(), getParentForChildren(), isClean());
                        this.temperature_ = null;
                    }
                    return this.temperatureBuilder_;
                }

                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getWindInfoFieldBuilder() {
                    if (this.windInfoBuilder_ == null) {
                        this.windInfoBuilder_ = new SingleFieldBuilderV3<>(getWindInfo(), getParentForChildren(), isClean());
                        this.windInfo_ = null;
                    }
                    return this.windInfoBuilder_;
                }

                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getWindSpeedFieldBuilder() {
                    if (this.windSpeedBuilder_ == null) {
                        this.windSpeedBuilder_ = new SingleFieldBuilderV3<>(getWindSpeed(), getParentForChildren(), isClean());
                        this.windSpeed_ = null;
                    }
                    return this.windSpeedBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getAqiFieldBuilder();
                        getTemperatureFieldBuilder();
                        getSunRiseSetFieldBuilder();
                        getHumidityFieldBuilder();
                        getProbabilityOfRainfallFieldBuilder();
                        getWindInfoFieldBuilder();
                        getWindSpeedFieldBuilder();
                    }
                }

                public Builder clearAqi() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.aqi_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder clearHumidity() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.humidity_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -33;
                    return this;
                }

                public Builder clearProbabilityOfRainfall() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.probabilityOfRainfall_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -65;
                    return this;
                }

                public Builder clearSunRiseSet() {
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV3 = this.sunRiseSetBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.sunRiseSet_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -17;
                    return this;
                }

                public Builder clearTemperature() {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.temperature_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -5;
                    return this;
                }

                public Builder clearTemperatureUnit() {
                    this.bitField0_ &= -9;
                    this.temperatureUnit_ = Data.getDefaultInstance().getTemperatureUnit();
                    onChanged();
                    return this;
                }

                public Builder clearWeather() {
                    this.bitField0_ &= -3;
                    this.weather_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWindInfo() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.windInfo_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                    return this;
                }

                public Builder clearWindSpeed() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.windSpeed_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -257;
                    return this;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValue getAqi() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.KeyValue keyValue = this.aqi_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                public CommonProtos.KeyValue.Builder getAqiBuilder() {
                    this.bitField0_ |= 1;
                    onChanged();
                    return (CommonProtos.KeyValue.Builder) getAqiFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValueOrBuilder getAqiOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.KeyValue keyValue = this.aqi_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WeatherProtos.internal_static_WeatherForecast_Data_descriptor;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValue getHumidity() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.KeyValue keyValue = this.humidity_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                public CommonProtos.KeyValue.Builder getHumidityBuilder() {
                    this.bitField0_ |= 32;
                    onChanged();
                    return (CommonProtos.KeyValue.Builder) getHumidityFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValueOrBuilder getHumidityOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.KeyValue keyValue = this.humidity_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValue getProbabilityOfRainfall() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                public CommonProtos.KeyValue.Builder getProbabilityOfRainfallBuilder() {
                    this.bitField0_ |= 64;
                    onChanged();
                    return (CommonProtos.KeyValue.Builder) getProbabilityOfRainfallFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValueOrBuilder getProbabilityOfRainfallOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public SunRiseSet getSunRiseSet() {
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV3 = this.sunRiseSetBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (SunRiseSet) singleFieldBuilderV3.getMessage();
                    }
                    SunRiseSet sunRiseSet = this.sunRiseSet_;
                    return sunRiseSet == null ? SunRiseSet.getDefaultInstance() : sunRiseSet;
                }

                public SunRiseSet.Builder getSunRiseSetBuilder() {
                    this.bitField0_ |= 16;
                    onChanged();
                    return (SunRiseSet.Builder) getSunRiseSetFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public SunRiseSetOrBuilder getSunRiseSetOrBuilder() {
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV3 = this.sunRiseSetBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (SunRiseSetOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    SunRiseSet sunRiseSet = this.sunRiseSet_;
                    return sunRiseSet == null ? SunRiseSet.getDefaultInstance() : sunRiseSet;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.RangeValue getTemperature() {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.RangeValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.RangeValue rangeValue = this.temperature_;
                    return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
                }

                public CommonProtos.RangeValue.Builder getTemperatureBuilder() {
                    this.bitField0_ |= 4;
                    onChanged();
                    return (CommonProtos.RangeValue.Builder) getTemperatureFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.RangeValueOrBuilder getTemperatureOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.RangeValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.RangeValue rangeValue = this.temperature_;
                    return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public String getTemperatureUnit() {
                    Object obj = this.temperatureUnit_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.temperatureUnit_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public ByteString getTemperatureUnitBytes() {
                    Object obj = this.temperatureUnit_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.temperatureUnit_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public int getWeather() {
                    return this.weather_;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValue getWindInfo() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.KeyValue keyValue = this.windInfo_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                public CommonProtos.KeyValue.Builder getWindInfoBuilder() {
                    this.bitField0_ |= 128;
                    onChanged();
                    return (CommonProtos.KeyValue.Builder) getWindInfoFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValueOrBuilder getWindInfoOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.KeyValue keyValue = this.windInfo_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValue getWindSpeed() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.KeyValue keyValue = this.windSpeed_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                public CommonProtos.KeyValue.Builder getWindSpeedBuilder() {
                    this.bitField0_ |= 256;
                    onChanged();
                    return (CommonProtos.KeyValue.Builder) getWindSpeedFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public CommonProtos.KeyValueOrBuilder getWindSpeedOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.KeyValue keyValue = this.windSpeed_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasAqi() {
                    return (this.bitField0_ & 1) == 1;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasHumidity() {
                    return (this.bitField0_ & 32) == 32;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasProbabilityOfRainfall() {
                    return (this.bitField0_ & 64) == 64;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasSunRiseSet() {
                    return (this.bitField0_ & 16) == 16;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasTemperature() {
                    return (this.bitField0_ & 4) == 4;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasTemperatureUnit() {
                    return (this.bitField0_ & 8) == 8;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasWeather() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasWindInfo() {
                    return (this.bitField0_ & 128) == 128;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
                public boolean hasWindSpeed() {
                    return (this.bitField0_ & 256) == 256;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProtos.internal_static_WeatherForecast_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (hasAqi() && !getAqi().isInitialized()) {
                        return false;
                    }
                    if (hasTemperature() && !getTemperature().isInitialized()) {
                        return false;
                    }
                    if (hasSunRiseSet() && !getSunRiseSet().isInitialized()) {
                        return false;
                    }
                    if (hasHumidity() && !getHumidity().isInitialized()) {
                        return false;
                    }
                    if (hasProbabilityOfRainfall() && !getProbabilityOfRainfall().isInitialized()) {
                        return false;
                    }
                    if (!hasWindInfo() || getWindInfo().isInitialized()) {
                        return !hasWindSpeed() || getWindSpeed().isInitialized();
                    }
                    return false;
                }

                public Builder mergeAqi(CommonProtos.KeyValue keyValue) {
                    CommonProtos.KeyValue keyValue2;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) == 1 && (keyValue2 = this.aqi_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                            keyValue = CommonProtos.KeyValue.newBuilder(this.aqi_).mergeFrom(keyValue).buildPartial();
                        }
                        this.aqi_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(keyValue);
                    }
                    this.bitField0_ |= 1;
                    return this;
                }

                public Builder mergeHumidity(CommonProtos.KeyValue keyValue) {
                    CommonProtos.KeyValue keyValue2;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 32) == 32 && (keyValue2 = this.humidity_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                            keyValue = CommonProtos.KeyValue.newBuilder(this.humidity_).mergeFrom(keyValue).buildPartial();
                        }
                        this.humidity_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(keyValue);
                    }
                    this.bitField0_ |= 32;
                    return this;
                }

                public Builder mergeProbabilityOfRainfall(CommonProtos.KeyValue keyValue) {
                    CommonProtos.KeyValue keyValue2;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 64) == 64 && (keyValue2 = this.probabilityOfRainfall_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                            keyValue = CommonProtos.KeyValue.newBuilder(this.probabilityOfRainfall_).mergeFrom(keyValue).buildPartial();
                        }
                        this.probabilityOfRainfall_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(keyValue);
                    }
                    this.bitField0_ |= 64;
                    return this;
                }

                public Builder mergeSunRiseSet(SunRiseSet sunRiseSet) {
                    SunRiseSet sunRiseSet2;
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV3 = this.sunRiseSetBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 16) == 16 && (sunRiseSet2 = this.sunRiseSet_) != null && sunRiseSet2 != SunRiseSet.getDefaultInstance()) {
                            sunRiseSet = SunRiseSet.newBuilder(this.sunRiseSet_).mergeFrom(sunRiseSet).buildPartial();
                        }
                        this.sunRiseSet_ = sunRiseSet;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(sunRiseSet);
                    }
                    this.bitField0_ |= 16;
                    return this;
                }

                public Builder mergeTemperature(CommonProtos.RangeValue rangeValue) {
                    CommonProtos.RangeValue rangeValue2;
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 4) == 4 && (rangeValue2 = this.temperature_) != null && rangeValue2 != CommonProtos.RangeValue.getDefaultInstance()) {
                            rangeValue = CommonProtos.RangeValue.newBuilder(this.temperature_).mergeFrom(rangeValue).buildPartial();
                        }
                        this.temperature_ = rangeValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(rangeValue);
                    }
                    this.bitField0_ |= 4;
                    return this;
                }

                public Builder mergeWindInfo(CommonProtos.KeyValue keyValue) {
                    CommonProtos.KeyValue keyValue2;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 128) == 128 && (keyValue2 = this.windInfo_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                            keyValue = CommonProtos.KeyValue.newBuilder(this.windInfo_).mergeFrom(keyValue).buildPartial();
                        }
                        this.windInfo_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(keyValue);
                    }
                    this.bitField0_ |= 128;
                    return this;
                }

                public Builder mergeWindSpeed(CommonProtos.KeyValue keyValue) {
                    CommonProtos.KeyValue keyValue2;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 256) == 256 && (keyValue2 = this.windSpeed_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                            keyValue = CommonProtos.KeyValue.newBuilder(this.windSpeed_).mergeFrom(keyValue).buildPartial();
                        }
                        this.windSpeed_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(keyValue);
                    }
                    this.bitField0_ |= 256;
                    return this;
                }

                public Builder setAqi(CommonProtos.KeyValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    CommonProtos.KeyValue keyValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.aqi_ = keyValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValueBuild);
                    }
                    this.bitField0_ |= 1;
                    return this;
                }

                public Builder setHumidity(CommonProtos.KeyValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                    CommonProtos.KeyValue keyValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.humidity_ = keyValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValueBuild);
                    }
                    this.bitField0_ |= 32;
                    return this;
                }

                public Builder setProbabilityOfRainfall(CommonProtos.KeyValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                    CommonProtos.KeyValue keyValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.probabilityOfRainfall_ = keyValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValueBuild);
                    }
                    this.bitField0_ |= 64;
                    return this;
                }

                public Builder setSunRiseSet(SunRiseSet.Builder builder) {
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV3 = this.sunRiseSetBuilder_;
                    SunRiseSet sunRiseSetBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.sunRiseSet_ = sunRiseSetBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(sunRiseSetBuild);
                    }
                    this.bitField0_ |= 16;
                    return this;
                }

                public Builder setTemperature(CommonProtos.RangeValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    CommonProtos.RangeValue rangeValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.temperature_ = rangeValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(rangeValueBuild);
                    }
                    this.bitField0_ |= 4;
                    return this;
                }

                public Builder setTemperatureUnit(String str) {
                    str.getClass();
                    this.bitField0_ |= 8;
                    this.temperatureUnit_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTemperatureUnitBytes(ByteString byteString) {
                    byteString.getClass();
                    this.bitField0_ |= 8;
                    this.temperatureUnit_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setWeather(int i7) {
                    this.bitField0_ |= 2;
                    this.weather_ = i7;
                    onChanged();
                    return this;
                }

                public Builder setWindInfo(CommonProtos.KeyValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                    CommonProtos.KeyValue keyValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.windInfo_ = keyValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValueBuild);
                    }
                    this.bitField0_ |= 128;
                    return this;
                }

                public Builder setWindSpeed(CommonProtos.KeyValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                    CommonProtos.KeyValue keyValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.windSpeed_ = keyValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValueBuild);
                    }
                    this.bitField0_ |= 256;
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.aqi_ = null;
                    this.temperature_ = null;
                    this.temperatureUnit_ = "";
                    this.sunRiseSet_ = null;
                    this.humidity_ = null;
                    this.probabilityOfRainfall_ = null;
                    this.windInfo_ = null;
                    this.windSpeed_ = null;
                    maybeForceBuilderInitialization();
                }

                public Builder setAqi(CommonProtos.KeyValue keyValue) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        keyValue.getClass();
                        this.aqi_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValue);
                    }
                    this.bitField0_ |= 1;
                    return this;
                }

                public Builder setHumidity(CommonProtos.KeyValue keyValue) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        keyValue.getClass();
                        this.humidity_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValue);
                    }
                    this.bitField0_ |= 32;
                    return this;
                }

                public Builder setProbabilityOfRainfall(CommonProtos.KeyValue keyValue) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        keyValue.getClass();
                        this.probabilityOfRainfall_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValue);
                    }
                    this.bitField0_ |= 64;
                    return this;
                }

                public Builder setSunRiseSet(SunRiseSet sunRiseSet) {
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV3 = this.sunRiseSetBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        sunRiseSet.getClass();
                        this.sunRiseSet_ = sunRiseSet;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(sunRiseSet);
                    }
                    this.bitField0_ |= 16;
                    return this;
                }

                public Builder setTemperature(CommonProtos.RangeValue rangeValue) {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        rangeValue.getClass();
                        this.temperature_ = rangeValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(rangeValue);
                    }
                    this.bitField0_ |= 4;
                    return this;
                }

                public Builder setWindInfo(CommonProtos.KeyValue keyValue) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        keyValue.getClass();
                        this.windInfo_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValue);
                    }
                    this.bitField0_ |= 128;
                    return this;
                }

                public Builder setWindSpeed(CommonProtos.KeyValue keyValue) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        keyValue.getClass();
                        this.windSpeed_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValue);
                    }
                    this.bitField0_ |= 256;
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
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    data.aqi_ = singleFieldBuilderV3 == null ? this.aqi_ : (CommonProtos.KeyValue) singleFieldBuilderV3.build();
                    if ((i7 & 2) == 2) {
                        i8 |= 2;
                    }
                    data.weather_ = this.weather_;
                    if ((i7 & 4) == 4) {
                        i8 |= 4;
                    }
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV32 = this.temperatureBuilder_;
                    data.temperature_ = singleFieldBuilderV32 == null ? this.temperature_ : (CommonProtos.RangeValue) singleFieldBuilderV32.build();
                    if ((i7 & 8) == 8) {
                        i8 |= 8;
                    }
                    data.temperatureUnit_ = this.temperatureUnit_;
                    if ((i7 & 16) == 16) {
                        i8 |= 16;
                    }
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV33 = this.sunRiseSetBuilder_;
                    data.sunRiseSet_ = singleFieldBuilderV33 == null ? this.sunRiseSet_ : (SunRiseSet) singleFieldBuilderV33.build();
                    if ((i7 & 32) == 32) {
                        i8 |= 32;
                    }
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV34 = this.humidityBuilder_;
                    data.humidity_ = singleFieldBuilderV34 == null ? this.humidity_ : (CommonProtos.KeyValue) singleFieldBuilderV34.build();
                    if ((i7 & 64) == 64) {
                        i8 |= 64;
                    }
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV35 = this.probabilityOfRainfallBuilder_;
                    data.probabilityOfRainfall_ = singleFieldBuilderV35 == null ? this.probabilityOfRainfall_ : (CommonProtos.KeyValue) singleFieldBuilderV35.build();
                    if ((i7 & 128) == 128) {
                        i8 |= 128;
                    }
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV36 = this.windInfoBuilder_;
                    data.windInfo_ = singleFieldBuilderV36 == null ? this.windInfo_ : (CommonProtos.KeyValue) singleFieldBuilderV36.build();
                    if ((i7 & 256) == 256) {
                        i8 |= 256;
                    }
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV37 = this.windSpeedBuilder_;
                    data.windSpeed_ = singleFieldBuilderV37 == null ? this.windSpeed_ : (CommonProtos.KeyValue) singleFieldBuilderV37.build();
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
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.aqi_ = null;
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    int i7 = this.bitField0_;
                    this.weather_ = 0;
                    this.bitField0_ = i7 & (-4);
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV32 = this.temperatureBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        this.temperature_ = null;
                    } else {
                        singleFieldBuilderV32.clear();
                    }
                    int i8 = this.bitField0_;
                    this.temperatureUnit_ = "";
                    this.bitField0_ = i8 & (-13);
                    SingleFieldBuilderV3<SunRiseSet, SunRiseSet.Builder, SunRiseSetOrBuilder> singleFieldBuilderV33 = this.sunRiseSetBuilder_;
                    if (singleFieldBuilderV33 == null) {
                        this.sunRiseSet_ = null;
                    } else {
                        singleFieldBuilderV33.clear();
                    }
                    this.bitField0_ &= -17;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV34 = this.humidityBuilder_;
                    if (singleFieldBuilderV34 == null) {
                        this.humidity_ = null;
                    } else {
                        singleFieldBuilderV34.clear();
                    }
                    this.bitField0_ &= -33;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV35 = this.probabilityOfRainfallBuilder_;
                    if (singleFieldBuilderV35 == null) {
                        this.probabilityOfRainfall_ = null;
                    } else {
                        singleFieldBuilderV35.clear();
                    }
                    this.bitField0_ &= -65;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV36 = this.windInfoBuilder_;
                    if (singleFieldBuilderV36 == null) {
                        this.windInfo_ = null;
                    } else {
                        singleFieldBuilderV36.clear();
                    }
                    this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV37 = this.windSpeedBuilder_;
                    if (singleFieldBuilderV37 == null) {
                        this.windSpeed_ = null;
                    } else {
                        singleFieldBuilderV37.clear();
                    }
                    this.bitField0_ &= -257;
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
                public com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data$Builder");
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
                    if (data.hasAqi()) {
                        mergeAqi(data.getAqi());
                    }
                    if (data.hasWeather()) {
                        setWeather(data.getWeather());
                    }
                    if (data.hasTemperature()) {
                        mergeTemperature(data.getTemperature());
                    }
                    if (data.hasTemperatureUnit()) {
                        this.bitField0_ |= 8;
                        this.temperatureUnit_ = data.temperatureUnit_;
                        onChanged();
                    }
                    if (data.hasSunRiseSet()) {
                        mergeSunRiseSet(data.getSunRiseSet());
                    }
                    if (data.hasHumidity()) {
                        mergeHumidity(data.getHumidity());
                    }
                    if (data.hasProbabilityOfRainfall()) {
                        mergeProbabilityOfRainfall(data.getProbabilityOfRainfall());
                    }
                    if (data.hasWindInfo()) {
                        mergeWindInfo(data.getWindInfo());
                    }
                    if (data.hasWindSpeed()) {
                        mergeWindSpeed(data.getWindSpeed());
                    }
                    mergeUnknownFields(((GeneratedMessage) data).unknownFields);
                    onChanged();
                    return this;
                }
            }

            public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
                public static final int LIST_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private java.util.List<Data> list_;
                private byte memoizedIsInitialized;
                private static final List DEFAULT_INSTANCE = new List();

                @Deprecated
                public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.List.1
                    @Override // com.google.protobuf.Parser
                    public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new List(codedInputStream, extensionRegistryLite);
                    }
                };

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                    private int bitField0_;
                    private RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> listBuilder_;
                    private java.util.List<Data> list_;

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
                        return WeatherProtos.internal_static_WeatherForecast_Data_List_descriptor;
                    }

                    private RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> getListFieldBuilder() {
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

                    public Builder addAllList(Iterable<? extends Data> iterable) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        return (Builder) getListFieldBuilder().addBuilder(Data.getDefaultInstance());
                    }

                    public Builder clearList() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        return WeatherProtos.internal_static_WeatherForecast_Data_List_descriptor;
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                    public Data getList(int i7) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return (Data) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                    }

                    public Builder getListBuilder(int i7) {
                        return (Builder) getListFieldBuilder().getBuilder(i7);
                    }

                    public java.util.List<Builder> getListBuilderList() {
                        return getListFieldBuilder().getBuilderList();
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                    public int getListCount() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                    public java.util.List<Data> getListList() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                    public DataOrBuilder getListOrBuilder(int i7) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return (DataOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                    public java.util.List<? extends DataOrBuilder> getListOrBuilderList() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return WeatherProtos.internal_static_WeatherForecast_Data_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                    public Builder addList(int i7, Data data) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(i7, data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, data);
                        onChanged();
                        return this;
                    }

                    public Builder addListBuilder(int i7) {
                        return (Builder) getListFieldBuilder().addBuilder(i7, Data.getDefaultInstance());
                    }

                    public Builder setList(int i7, Data data) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.setMessage(i7, data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.set(i7, data);
                        onChanged();
                        return this;
                    }

                    public Builder addList(Builder builder) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                    public Builder addList(Data data) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.add(data);
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    public com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data$List> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                            com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data$List r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                            com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data$List r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.List) r4     // Catch: java.lang.Throwable -> Lf
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
                        throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherForecast$Data$List$Builder");
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
                    return WeatherProtos.internal_static_WeatherForecast_Data_List_descriptor;
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

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                public Data getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                public java.util.List<Data> getListList() {
                    return this.list_;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                public DataOrBuilder getListOrBuilder(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.Data.ListOrBuilder
                public java.util.List<? extends DataOrBuilder> getListOrBuilderList() {
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
                    return WeatherProtos.internal_static_WeatherForecast_Data_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                            this.list_.add((Data) codedInputStream.readMessage(Data.PARSER, extensionRegistryLite));
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
                Data getList(int i7);

                int getListCount();

                java.util.List<Data> getListList();

                DataOrBuilder getListOrBuilder(int i7);

                java.util.List<? extends DataOrBuilder> getListOrBuilderList();
            }

            private Data() {
                this.memoizedIsInitialized = (byte) -1;
                this.weather_ = 0;
                this.temperatureUnit_ = "";
            }

            public static Data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_WeatherForecast_Data_descriptor;
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
                boolean z6 = hasAqi() == data.hasAqi();
                if (hasAqi()) {
                    z6 = z6 && getAqi().equals(data.getAqi());
                }
                boolean z7 = z6 && hasWeather() == data.hasWeather();
                if (hasWeather()) {
                    z7 = z7 && getWeather() == data.getWeather();
                }
                boolean z8 = z7 && hasTemperature() == data.hasTemperature();
                if (hasTemperature()) {
                    z8 = z8 && getTemperature().equals(data.getTemperature());
                }
                boolean z9 = z8 && hasTemperatureUnit() == data.hasTemperatureUnit();
                if (hasTemperatureUnit()) {
                    z9 = z9 && getTemperatureUnit().equals(data.getTemperatureUnit());
                }
                boolean z10 = z9 && hasSunRiseSet() == data.hasSunRiseSet();
                if (hasSunRiseSet()) {
                    z10 = z10 && getSunRiseSet().equals(data.getSunRiseSet());
                }
                boolean z11 = z10 && hasHumidity() == data.hasHumidity();
                if (hasHumidity()) {
                    z11 = z11 && getHumidity().equals(data.getHumidity());
                }
                boolean z12 = z11 && hasProbabilityOfRainfall() == data.hasProbabilityOfRainfall();
                if (hasProbabilityOfRainfall()) {
                    z12 = z12 && getProbabilityOfRainfall().equals(data.getProbabilityOfRainfall());
                }
                boolean z13 = z12 && hasWindInfo() == data.hasWindInfo();
                if (hasWindInfo()) {
                    z13 = z13 && getWindInfo().equals(data.getWindInfo());
                }
                boolean z14 = z13 && hasWindSpeed() == data.hasWindSpeed();
                if (hasWindSpeed()) {
                    z14 = z14 && getWindSpeed().equals(data.getWindSpeed());
                }
                return z14 && this.unknownFields.equals(data.unknownFields);
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValue getAqi() {
                CommonProtos.KeyValue keyValue = this.aqi_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValueOrBuilder getAqiOrBuilder() {
                CommonProtos.KeyValue keyValue = this.aqi_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValue getHumidity() {
                CommonProtos.KeyValue keyValue = this.humidity_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValueOrBuilder getHumidityOrBuilder() {
                CommonProtos.KeyValue keyValue = this.humidity_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Data> getParserForType() {
                return PARSER;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValue getProbabilityOfRainfall() {
                CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValueOrBuilder getProbabilityOfRainfallOrBuilder() {
                CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, getAqi()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.weather_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getTemperature());
                }
                if ((this.bitField0_ & 8) == 8) {
                    iComputeMessageSize += GeneratedMessage.computeStringSize(4, this.temperatureUnit_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSunRiseSet());
                }
                if ((this.bitField0_ & 32) == 32) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getHumidity());
                }
                if ((this.bitField0_ & 64) == 64) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getProbabilityOfRainfall());
                }
                if ((this.bitField0_ & 128) == 128) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getWindInfo());
                }
                if ((this.bitField0_ & 256) == 256) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getWindSpeed());
                }
                int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public SunRiseSet getSunRiseSet() {
                SunRiseSet sunRiseSet = this.sunRiseSet_;
                return sunRiseSet == null ? SunRiseSet.getDefaultInstance() : sunRiseSet;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public SunRiseSetOrBuilder getSunRiseSetOrBuilder() {
                SunRiseSet sunRiseSet = this.sunRiseSet_;
                return sunRiseSet == null ? SunRiseSet.getDefaultInstance() : sunRiseSet;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.RangeValue getTemperature() {
                CommonProtos.RangeValue rangeValue = this.temperature_;
                return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.RangeValueOrBuilder getTemperatureOrBuilder() {
                CommonProtos.RangeValue rangeValue = this.temperature_;
                return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public String getTemperatureUnit() {
                Object obj = this.temperatureUnit_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.temperatureUnit_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public ByteString getTemperatureUnitBytes() {
                Object obj = this.temperatureUnit_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.temperatureUnit_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public int getWeather() {
                return this.weather_;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValue getWindInfo() {
                CommonProtos.KeyValue keyValue = this.windInfo_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValueOrBuilder getWindInfoOrBuilder() {
                CommonProtos.KeyValue keyValue = this.windInfo_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValue getWindSpeed() {
                CommonProtos.KeyValue keyValue = this.windSpeed_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public CommonProtos.KeyValueOrBuilder getWindSpeedOrBuilder() {
                CommonProtos.KeyValue keyValue = this.windSpeed_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasAqi() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasHumidity() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasProbabilityOfRainfall() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasSunRiseSet() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasTemperature() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasTemperatureUnit() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasWeather() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasWindInfo() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecast.DataOrBuilder
            public boolean hasWindSpeed() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasAqi()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getAqi().hashCode();
                }
                if (hasWeather()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWeather();
                }
                if (hasTemperature()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getTemperature().hashCode();
                }
                if (hasTemperatureUnit()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getTemperatureUnit().hashCode();
                }
                if (hasSunRiseSet()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getSunRiseSet().hashCode();
                }
                if (hasHumidity()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getHumidity().hashCode();
                }
                if (hasProbabilityOfRainfall()) {
                    iHashCode = (((iHashCode * 37) + 7) * 53) + getProbabilityOfRainfall().hashCode();
                }
                if (hasWindInfo()) {
                    iHashCode = (((iHashCode * 37) + 8) * 53) + getWindInfo().hashCode();
                }
                if (hasWindSpeed()) {
                    iHashCode = (((iHashCode * 37) + 9) * 53) + getWindSpeed().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_WeatherForecast_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
                if (hasAqi() && !getAqi().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasTemperature() && !getTemperature().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasSunRiseSet() && !getSunRiseSet().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasHumidity() && !getHumidity().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasProbabilityOfRainfall() && !getProbabilityOfRainfall().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasWindInfo() && !getWindInfo().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasWindSpeed() || getWindSpeed().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeMessage(1, getAqi());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeUInt32(2, this.weather_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeMessage(3, getTemperature());
                }
                if ((this.bitField0_ & 8) == 8) {
                    GeneratedMessage.writeString(codedOutputStream, 4, this.temperatureUnit_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    codedOutputStream.writeMessage(5, getSunRiseSet());
                }
                if ((this.bitField0_ & 32) == 32) {
                    codedOutputStream.writeMessage(6, getHumidity());
                }
                if ((this.bitField0_ & 64) == 64) {
                    codedOutputStream.writeMessage(7, getProbabilityOfRainfall());
                }
                if ((this.bitField0_ & 128) == 128) {
                    codedOutputStream.writeMessage(8, getWindInfo());
                }
                if ((this.bitField0_ & 256) == 256) {
                    codedOutputStream.writeMessage(9, getWindSpeed());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            private Data(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                int i7;
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                int i8 = 1;
                                if (tag != 0) {
                                    if (tag == 10) {
                                        CommonProtos.KeyValue.Builder builder = (this.bitField0_ & 1) == 1 ? this.aqi_.toBuilder() : null;
                                        CommonProtos.KeyValue keyValue = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                        this.aqi_ = keyValue;
                                        if (builder != null) {
                                            builder.mergeFrom(keyValue);
                                            this.aqi_ = builder.buildPartial();
                                        }
                                    } else if (tag == 16) {
                                        this.bitField0_ |= 2;
                                        this.weather_ = codedInputStream.readUInt32();
                                    } else if (tag == 26) {
                                        i8 = 4;
                                        CommonProtos.RangeValue.Builder builder2 = (this.bitField0_ & 4) == 4 ? this.temperature_.toBuilder() : null;
                                        CommonProtos.RangeValue rangeValue = (CommonProtos.RangeValue) codedInputStream.readMessage(CommonProtos.RangeValue.PARSER, extensionRegistryLite);
                                        this.temperature_ = rangeValue;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(rangeValue);
                                            this.temperature_ = builder2.buildPartial();
                                        }
                                    } else if (tag == 34) {
                                        ByteString bytes = codedInputStream.readBytes();
                                        this.bitField0_ |= 8;
                                        this.temperatureUnit_ = bytes;
                                    } else if (tag == 42) {
                                        SunRiseSet.Builder builder3 = (this.bitField0_ & 16) == 16 ? this.sunRiseSet_.toBuilder() : null;
                                        SunRiseSet sunRiseSet = (SunRiseSet) codedInputStream.readMessage(SunRiseSet.PARSER, extensionRegistryLite);
                                        this.sunRiseSet_ = sunRiseSet;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(sunRiseSet);
                                            this.sunRiseSet_ = builder3.buildPartial();
                                        }
                                        i7 = this.bitField0_ | 16;
                                        this.bitField0_ = i7;
                                    } else if (tag == 50) {
                                        i8 = 32;
                                        CommonProtos.KeyValue.Builder builder4 = (this.bitField0_ & 32) == 32 ? this.humidity_.toBuilder() : null;
                                        CommonProtos.KeyValue keyValue2 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                        this.humidity_ = keyValue2;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(keyValue2);
                                            this.humidity_ = builder4.buildPartial();
                                        }
                                    } else if (tag == 58) {
                                        i8 = 64;
                                        CommonProtos.KeyValue.Builder builder5 = (this.bitField0_ & 64) == 64 ? this.probabilityOfRainfall_.toBuilder() : null;
                                        CommonProtos.KeyValue keyValue3 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                        this.probabilityOfRainfall_ = keyValue3;
                                        if (builder5 != null) {
                                            builder5.mergeFrom(keyValue3);
                                            this.probabilityOfRainfall_ = builder5.buildPartial();
                                        }
                                    } else if (tag == 66) {
                                        i8 = 128;
                                        CommonProtos.KeyValue.Builder builder6 = (this.bitField0_ & 128) == 128 ? this.windInfo_.toBuilder() : null;
                                        CommonProtos.KeyValue keyValue4 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                        this.windInfo_ = keyValue4;
                                        if (builder6 != null) {
                                            builder6.mergeFrom(keyValue4);
                                            this.windInfo_ = builder6.buildPartial();
                                        }
                                    } else if (tag == 74) {
                                        i8 = 256;
                                        CommonProtos.KeyValue.Builder builder7 = (this.bitField0_ & 256) == 256 ? this.windSpeed_.toBuilder() : null;
                                        CommonProtos.KeyValue keyValue5 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                        this.windSpeed_ = keyValue5;
                                        if (builder7 != null) {
                                            builder7.mergeFrom(keyValue5);
                                            this.windSpeed_ = builder7.buildPartial();
                                        }
                                    } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                    i7 = this.bitField0_ | i8;
                                    this.bitField0_ = i7;
                                }
                                z6 = true;
                            } catch (IOException e7) {
                                throw new InvalidProtocolBufferException(e7).setUnfinishedMessage(this);
                            }
                        } catch (InvalidProtocolBufferException e8) {
                            throw e8.setUnfinishedMessage(this);
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
            CommonProtos.KeyValue getAqi();

            CommonProtos.KeyValueOrBuilder getAqiOrBuilder();

            CommonProtos.KeyValue getHumidity();

            CommonProtos.KeyValueOrBuilder getHumidityOrBuilder();

            CommonProtos.KeyValue getProbabilityOfRainfall();

            CommonProtos.KeyValueOrBuilder getProbabilityOfRainfallOrBuilder();

            SunRiseSet getSunRiseSet();

            SunRiseSetOrBuilder getSunRiseSetOrBuilder();

            CommonProtos.RangeValue getTemperature();

            CommonProtos.RangeValueOrBuilder getTemperatureOrBuilder();

            String getTemperatureUnit();

            ByteString getTemperatureUnitBytes();

            int getWeather();

            CommonProtos.KeyValue getWindInfo();

            CommonProtos.KeyValueOrBuilder getWindInfoOrBuilder();

            CommonProtos.KeyValue getWindSpeed();

            CommonProtos.KeyValueOrBuilder getWindSpeedOrBuilder();

            boolean hasAqi();

            boolean hasHumidity();

            boolean hasProbabilityOfRainfall();

            boolean hasSunRiseSet();

            boolean hasTemperature();

            boolean hasTemperatureUnit();

            boolean hasWeather();

            boolean hasWindInfo();

            boolean hasWindSpeed();
        }

        private WeatherForecast() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherForecast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_WeatherForecast_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WeatherForecast parseDelimitedFrom(InputStream inputStream) {
            return (WeatherForecast) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WeatherForecast parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WeatherForecast> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherForecast)) {
                return super.equals(obj);
            }
            WeatherForecast weatherForecast = (WeatherForecast) obj;
            boolean z6 = hasId() == weatherForecast.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(weatherForecast.getId());
            }
            boolean z7 = z6 && hasDataList() == weatherForecast.hasDataList();
            if (hasDataList()) {
                z7 = z7 && getDataList().equals(weatherForecast.getDataList());
            }
            return z7 && this.unknownFields.equals(weatherForecast.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
        public Data.List getDataList() {
            Data.List list = this.dataList_;
            return list == null ? Data.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
        public Data.ListOrBuilder getDataListOrBuilder() {
            Data.List list = this.dataList_;
            return list == null ? Data.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
        public WeatherId getId() {
            WeatherId weatherId = this.id_;
            return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
        public WeatherIdOrBuilder getIdOrBuilder() {
            WeatherId weatherId = this.id_;
            return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WeatherForecast> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, getId()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDataList());
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
        public boolean hasDataList() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherForecastOrBuilder
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
            if (hasDataList()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_WeatherForecast_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherForecast.class, Builder.class);
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
            if (!hasDataList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getId().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getDataList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getId());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, getDataList());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WeatherForecast(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                WeatherId.Builder builder = (this.bitField0_ & 1) == 1 ? this.id_.toBuilder() : null;
                                WeatherId weatherId = (WeatherId) codedInputStream.readMessage(WeatherId.PARSER, extensionRegistryLite);
                                this.id_ = weatherId;
                                if (builder != null) {
                                    builder.mergeFrom(weatherId);
                                    this.id_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                i7 = 2;
                                Data.List.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.dataList_.toBuilder() : null;
                                Data.List list = (Data.List) codedInputStream.readMessage(Data.List.PARSER, extensionRegistryLite);
                                this.dataList_ = list;
                                if (builder2 != null) {
                                    builder2.mergeFrom(list);
                                    this.dataList_ = builder2.buildPartial();
                                }
                            } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                            this.bitField0_ |= i7;
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

        public static Builder newBuilder(WeatherForecast weatherForecast) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weatherForecast);
        }

        public static WeatherForecast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherForecast) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherForecast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WeatherForecast parseFrom(CodedInputStream codedInputStream) {
            return (WeatherForecast) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WeatherForecast getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WeatherForecast(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherForecast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherForecast) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WeatherForecast parseFrom(InputStream inputStream) {
            return (WeatherForecast) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WeatherForecast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherForecast) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherForecast parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WeatherForecast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WeatherForecast parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WeatherForecast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WeatherForecastOrBuilder extends MessageOrBuilder {
        WeatherForecast.Data.List getDataList();

        WeatherForecast.Data.ListOrBuilder getDataListOrBuilder();

        WeatherId getId();

        WeatherIdOrBuilder getIdOrBuilder();

        boolean hasDataList();

        boolean hasId();
    }

    public static final class WeatherHourForecast extends GeneratedMessageV3 implements WeatherHourForecastOrBuilder {
        public static final int DATA_LIST_FIELD_NUMBER = 1;
        private static final WeatherHourForecast DEFAULT_INSTANCE = new WeatherHourForecast();

        @Deprecated
        public static final Parser<WeatherHourForecast> PARSER = new AbstractParser<WeatherHourForecast>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.1
            @Override // com.google.protobuf.Parser
            public WeatherHourForecast parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WeatherHourForecast(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Data.List dataList_;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherHourForecastOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> dataListBuilder_;
            private Data.List dataList_;

            private Builder() {
                this.dataList_ = null;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> getDataListFieldBuilder() {
                if (this.dataListBuilder_ == null) {
                    this.dataListBuilder_ = new SingleFieldBuilderV3<>(getDataList(), getParentForChildren(), isClean());
                    this.dataList_ = null;
                }
                return this.dataListBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_WeatherHourForecast_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getDataListFieldBuilder();
                }
            }

            public Builder clearDataList() {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataList_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecastOrBuilder
            public Data.List getDataList() {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Data.List) singleFieldBuilderV3.getMessage();
                }
                Data.List list = this.dataList_;
                return list == null ? Data.List.getDefaultInstance() : list;
            }

            public Data.List.Builder getDataListBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Data.List.Builder) getDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecastOrBuilder
            public Data.ListOrBuilder getDataListOrBuilder() {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Data.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Data.List list = this.dataList_;
                return list == null ? Data.List.getDefaultInstance() : list;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_WeatherHourForecast_descriptor;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecastOrBuilder
            public boolean hasDataList() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_WeatherHourForecast_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherHourForecast.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasDataList() && getDataList().isInitialized();
            }

            public Builder mergeDataList(Data.List list) {
                Data.List list2;
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 1 && (list2 = this.dataList_) != null && list2 != Data.List.getDefaultInstance()) {
                        list = Data.List.newBuilder(this.dataList_).mergeFrom(list).buildPartial();
                    }
                    this.dataList_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(list);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setDataList(Data.List.Builder builder) {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                Data.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.dataList_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.dataList_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setDataList(Data.List list) {
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.dataList_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.bitField0_ |= 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherHourForecast build() {
                WeatherHourForecast weatherHourForecastBuildPartial = buildPartial();
                if (weatherHourForecastBuildPartial.isInitialized()) {
                    return weatherHourForecastBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherHourForecastBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherHourForecast buildPartial() {
                WeatherHourForecast weatherHourForecast = new WeatherHourForecast(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                weatherHourForecast.dataList_ = singleFieldBuilderV3 == null ? this.dataList_ : (Data.List) singleFieldBuilderV3.build();
                weatherHourForecast.bitField0_ = i7;
                onBuilt();
                return weatherHourForecast;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WeatherHourForecast getDefaultInstanceForType() {
                return WeatherHourForecast.getDefaultInstance();
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
                SingleFieldBuilderV3<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataList_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
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
            public com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WeatherHourForecast) {
                    return mergeFrom((WeatherHourForecast) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WeatherHourForecast weatherHourForecast) {
                if (weatherHourForecast == WeatherHourForecast.getDefaultInstance()) {
                    return this;
                }
                if (weatherHourForecast.hasDataList()) {
                    mergeDataList(weatherHourForecast.getDataList());
                }
                mergeUnknownFields(((GeneratedMessage) weatherHourForecast).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class Data extends GeneratedMessageV3 implements DataOrBuilder {
            public static final int AQI_FIELD_NUMBER = 4;
            private static final Data DEFAULT_INSTANCE = new Data();

            @Deprecated
            public static final Parser<Data> PARSER = new AbstractParser<Data>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.1
                @Override // com.google.protobuf.Parser
                public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Data(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int TEMPERATURE_FIELD_NUMBER = 2;
            public static final int TEMPERATURE_UNIT_FIELD_NUMBER = 3;
            public static final int WEATHER_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private CommonProtos.KeyValue aqi_;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private volatile Object temperatureUnit_;
            private CommonProtos.RangeValue temperature_;
            private int weather_;

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataOrBuilder {
                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> aqiBuilder_;
                private CommonProtos.KeyValue aqi_;
                private int bitField0_;
                private SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> temperatureBuilder_;
                private Object temperatureUnit_;
                private CommonProtos.RangeValue temperature_;
                private int weather_;

                private Builder() {
                    this.temperature_ = null;
                    this.temperatureUnit_ = "";
                    this.aqi_ = null;
                    maybeForceBuilderInitialization();
                }

                private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getAqiFieldBuilder() {
                    if (this.aqiBuilder_ == null) {
                        this.aqiBuilder_ = new SingleFieldBuilderV3<>(getAqi(), getParentForChildren(), isClean());
                        this.aqi_ = null;
                    }
                    return this.aqiBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProtos.internal_static_WeatherHourForecast_Data_descriptor;
                }

                private SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> getTemperatureFieldBuilder() {
                    if (this.temperatureBuilder_ == null) {
                        this.temperatureBuilder_ = new SingleFieldBuilderV3<>(getTemperature(), getParentForChildren(), isClean());
                        this.temperature_ = null;
                    }
                    return this.temperatureBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getTemperatureFieldBuilder();
                        getAqiFieldBuilder();
                    }
                }

                public Builder clearAqi() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.aqi_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -9;
                    return this;
                }

                public Builder clearTemperature() {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.temperature_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -3;
                    return this;
                }

                public Builder clearTemperatureUnit() {
                    this.bitField0_ &= -5;
                    this.temperatureUnit_ = Data.getDefaultInstance().getTemperatureUnit();
                    onChanged();
                    return this;
                }

                public Builder clearWeather() {
                    this.bitField0_ &= -2;
                    this.weather_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public CommonProtos.KeyValue getAqi() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.KeyValue keyValue = this.aqi_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                public CommonProtos.KeyValue.Builder getAqiBuilder() {
                    this.bitField0_ |= 8;
                    onChanged();
                    return (CommonProtos.KeyValue.Builder) getAqiFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public CommonProtos.KeyValueOrBuilder getAqiOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.KeyValue keyValue = this.aqi_;
                    return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WeatherProtos.internal_static_WeatherHourForecast_Data_descriptor;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public CommonProtos.RangeValue getTemperature() {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.RangeValue) singleFieldBuilderV3.getMessage();
                    }
                    CommonProtos.RangeValue rangeValue = this.temperature_;
                    return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
                }

                public CommonProtos.RangeValue.Builder getTemperatureBuilder() {
                    this.bitField0_ |= 2;
                    onChanged();
                    return (CommonProtos.RangeValue.Builder) getTemperatureFieldBuilder().getBuilder();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public CommonProtos.RangeValueOrBuilder getTemperatureOrBuilder() {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (CommonProtos.RangeValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    CommonProtos.RangeValue rangeValue = this.temperature_;
                    return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public String getTemperatureUnit() {
                    Object obj = this.temperatureUnit_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.temperatureUnit_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public ByteString getTemperatureUnitBytes() {
                    Object obj = this.temperatureUnit_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.temperatureUnit_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public int getWeather() {
                    return this.weather_;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public boolean hasAqi() {
                    return (this.bitField0_ & 8) == 8;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public boolean hasTemperature() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public boolean hasTemperatureUnit() {
                    return (this.bitField0_ & 4) == 4;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
                public boolean hasWeather() {
                    return (this.bitField0_ & 1) == 1;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProtos.internal_static_WeatherHourForecast_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (!hasTemperature() || getTemperature().isInitialized()) {
                        return !hasAqi() || getAqi().isInitialized();
                    }
                    return false;
                }

                public Builder mergeAqi(CommonProtos.KeyValue keyValue) {
                    CommonProtos.KeyValue keyValue2;
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 8) == 8 && (keyValue2 = this.aqi_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                            keyValue = CommonProtos.KeyValue.newBuilder(this.aqi_).mergeFrom(keyValue).buildPartial();
                        }
                        this.aqi_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(keyValue);
                    }
                    this.bitField0_ |= 8;
                    return this;
                }

                public Builder mergeTemperature(CommonProtos.RangeValue rangeValue) {
                    CommonProtos.RangeValue rangeValue2;
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 2) == 2 && (rangeValue2 = this.temperature_) != null && rangeValue2 != CommonProtos.RangeValue.getDefaultInstance()) {
                            rangeValue = CommonProtos.RangeValue.newBuilder(this.temperature_).mergeFrom(rangeValue).buildPartial();
                        }
                        this.temperature_ = rangeValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(rangeValue);
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public Builder setAqi(CommonProtos.KeyValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    CommonProtos.KeyValue keyValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.aqi_ = keyValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValueBuild);
                    }
                    this.bitField0_ |= 8;
                    return this;
                }

                public Builder setTemperature(CommonProtos.RangeValue.Builder builder) {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    CommonProtos.RangeValue rangeValueBuild = builder.build();
                    if (singleFieldBuilderV3 == null) {
                        this.temperature_ = rangeValueBuild;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(rangeValueBuild);
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public Builder setTemperatureUnit(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.temperatureUnit_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTemperatureUnitBytes(ByteString byteString) {
                    byteString.getClass();
                    this.bitField0_ |= 4;
                    this.temperatureUnit_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setWeather(int i7) {
                    this.bitField0_ |= 1;
                    this.weather_ = i7;
                    onChanged();
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.temperature_ = null;
                    this.temperatureUnit_ = "";
                    this.aqi_ = null;
                    maybeForceBuilderInitialization();
                }

                public Builder setAqi(CommonProtos.KeyValue keyValue) {
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        keyValue.getClass();
                        this.aqi_ = keyValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(keyValue);
                    }
                    this.bitField0_ |= 8;
                    return this;
                }

                public Builder setTemperature(CommonProtos.RangeValue rangeValue) {
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        rangeValue.getClass();
                        this.temperature_ = rangeValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(rangeValue);
                    }
                    this.bitField0_ |= 2;
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
                    data.weather_ = this.weather_;
                    if ((i7 & 2) == 2) {
                        i8 |= 2;
                    }
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    data.temperature_ = singleFieldBuilderV3 == null ? this.temperature_ : (CommonProtos.RangeValue) singleFieldBuilderV3.build();
                    if ((i7 & 4) == 4) {
                        i8 |= 4;
                    }
                    data.temperatureUnit_ = this.temperatureUnit_;
                    if ((i7 & 8) == 8) {
                        i8 |= 8;
                    }
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV32 = this.aqiBuilder_;
                    data.aqi_ = singleFieldBuilderV32 == null ? this.aqi_ : (CommonProtos.KeyValue) singleFieldBuilderV32.build();
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
                    this.weather_ = 0;
                    this.bitField0_ &= -2;
                    SingleFieldBuilderV3<CommonProtos.RangeValue, CommonProtos.RangeValue.Builder, CommonProtos.RangeValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.temperature_ = null;
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    int i7 = this.bitField0_;
                    this.temperatureUnit_ = "";
                    this.bitField0_ = i7 & (-7);
                    SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV32 = this.aqiBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        this.aqi_ = null;
                    } else {
                        singleFieldBuilderV32.clear();
                    }
                    this.bitField0_ &= -9;
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
                public com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data$Builder");
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
                    if (data.hasWeather()) {
                        setWeather(data.getWeather());
                    }
                    if (data.hasTemperature()) {
                        mergeTemperature(data.getTemperature());
                    }
                    if (data.hasTemperatureUnit()) {
                        this.bitField0_ |= 4;
                        this.temperatureUnit_ = data.temperatureUnit_;
                        onChanged();
                    }
                    if (data.hasAqi()) {
                        mergeAqi(data.getAqi());
                    }
                    mergeUnknownFields(((GeneratedMessage) data).unknownFields);
                    onChanged();
                    return this;
                }
            }

            public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
                public static final int LIST_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private java.util.List<Data> list_;
                private byte memoizedIsInitialized;
                private static final List DEFAULT_INSTANCE = new List();

                @Deprecated
                public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.List.1
                    @Override // com.google.protobuf.Parser
                    public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new List(codedInputStream, extensionRegistryLite);
                    }
                };

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                    private int bitField0_;
                    private RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> listBuilder_;
                    private java.util.List<Data> list_;

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
                        return WeatherProtos.internal_static_WeatherHourForecast_Data_List_descriptor;
                    }

                    private RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> getListFieldBuilder() {
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

                    public Builder addAllList(Iterable<? extends Data> iterable) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        return (Builder) getListFieldBuilder().addBuilder(Data.getDefaultInstance());
                    }

                    public Builder clearList() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        return WeatherProtos.internal_static_WeatherHourForecast_Data_List_descriptor;
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                    public Data getList(int i7) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return (Data) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                    }

                    public Builder getListBuilder(int i7) {
                        return (Builder) getListFieldBuilder().getBuilder(i7);
                    }

                    public java.util.List<Builder> getListBuilderList() {
                        return getListFieldBuilder().getBuilderList();
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                    public int getListCount() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                    public java.util.List<Data> getListList() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                    public DataOrBuilder getListOrBuilder(int i7) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return (DataOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                    }

                    @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                    public java.util.List<? extends DataOrBuilder> getListOrBuilderList() {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return WeatherProtos.internal_static_WeatherHourForecast_Data_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                    public Builder addList(int i7, Data data) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(i7, data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, data);
                        onChanged();
                        return this;
                    }

                    public Builder addListBuilder(int i7) {
                        return (Builder) getListFieldBuilder().addBuilder(i7, Data.getDefaultInstance());
                    }

                    public Builder setList(int i7, Data data) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.setMessage(i7, data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.set(i7, data);
                        onChanged();
                        return this;
                    }

                    public Builder addList(Builder builder) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                    public Builder addList(Data data) {
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.add(data);
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
                        RepeatedFieldBuilderV3<Data, Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    public com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data$List> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                            com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data$List r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                            com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data$List r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.List) r4     // Catch: java.lang.Throwable -> Lf
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
                        throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherHourForecast$Data$List$Builder");
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
                    return WeatherProtos.internal_static_WeatherHourForecast_Data_List_descriptor;
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

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                public Data getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                public java.util.List<Data> getListList() {
                    return this.list_;
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                public DataOrBuilder getListOrBuilder(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.Data.ListOrBuilder
                public java.util.List<? extends DataOrBuilder> getListOrBuilderList() {
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
                    return WeatherProtos.internal_static_WeatherHourForecast_Data_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                            this.list_.add((Data) codedInputStream.readMessage(Data.PARSER, extensionRegistryLite));
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
                Data getList(int i7);

                int getListCount();

                java.util.List<Data> getListList();

                DataOrBuilder getListOrBuilder(int i7);

                java.util.List<? extends DataOrBuilder> getListOrBuilderList();
            }

            private Data() {
                this.memoizedIsInitialized = (byte) -1;
                this.weather_ = 0;
                this.temperatureUnit_ = "";
            }

            public static Data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_WeatherHourForecast_Data_descriptor;
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
                boolean z6 = hasWeather() == data.hasWeather();
                if (hasWeather()) {
                    z6 = z6 && getWeather() == data.getWeather();
                }
                boolean z7 = z6 && hasTemperature() == data.hasTemperature();
                if (hasTemperature()) {
                    z7 = z7 && getTemperature().equals(data.getTemperature());
                }
                boolean z8 = z7 && hasTemperatureUnit() == data.hasTemperatureUnit();
                if (hasTemperatureUnit()) {
                    z8 = z8 && getTemperatureUnit().equals(data.getTemperatureUnit());
                }
                boolean z9 = z8 && hasAqi() == data.hasAqi();
                if (hasAqi()) {
                    z9 = z9 && getAqi().equals(data.getAqi());
                }
                return z9 && this.unknownFields.equals(data.unknownFields);
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public CommonProtos.KeyValue getAqi() {
                CommonProtos.KeyValue keyValue = this.aqi_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public CommonProtos.KeyValueOrBuilder getAqiOrBuilder() {
                CommonProtos.KeyValue keyValue = this.aqi_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
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
                int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.weather_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getTemperature());
                }
                if ((this.bitField0_ & 4) == 4) {
                    iComputeUInt32Size += GeneratedMessage.computeStringSize(3, this.temperatureUnit_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getAqi());
                }
                int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public CommonProtos.RangeValue getTemperature() {
                CommonProtos.RangeValue rangeValue = this.temperature_;
                return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public CommonProtos.RangeValueOrBuilder getTemperatureOrBuilder() {
                CommonProtos.RangeValue rangeValue = this.temperature_;
                return rangeValue == null ? CommonProtos.RangeValue.getDefaultInstance() : rangeValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public String getTemperatureUnit() {
                Object obj = this.temperatureUnit_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.temperatureUnit_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public ByteString getTemperatureUnitBytes() {
                Object obj = this.temperatureUnit_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.temperatureUnit_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public int getWeather() {
                return this.weather_;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public boolean hasAqi() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public boolean hasTemperature() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public boolean hasTemperatureUnit() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecast.DataOrBuilder
            public boolean hasWeather() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasWeather()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getWeather();
                }
                if (hasTemperature()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getTemperature().hashCode();
                }
                if (hasTemperatureUnit()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getTemperatureUnit().hashCode();
                }
                if (hasAqi()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getAqi().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_WeatherHourForecast_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
                if (hasTemperature() && !getTemperature().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasAqi() || getAqi().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeUInt32(1, this.weather_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, getTemperature());
                }
                if ((this.bitField0_ & 4) == 4) {
                    GeneratedMessage.writeString(codedOutputStream, 3, this.temperatureUnit_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.writeMessage(4, getAqi());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            private Data(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                int i7;
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z6 = false;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 8) {
                                    if (tag == 18) {
                                        CommonProtos.RangeValue.Builder builder = (this.bitField0_ & 2) == 2 ? this.temperature_.toBuilder() : null;
                                        CommonProtos.RangeValue rangeValue = (CommonProtos.RangeValue) codedInputStream.readMessage(CommonProtos.RangeValue.PARSER, extensionRegistryLite);
                                        this.temperature_ = rangeValue;
                                        if (builder != null) {
                                            builder.mergeFrom(rangeValue);
                                            this.temperature_ = builder.buildPartial();
                                        }
                                        i7 = this.bitField0_ | 2;
                                    } else if (tag == 26) {
                                        ByteString bytes = codedInputStream.readBytes();
                                        this.bitField0_ |= 4;
                                        this.temperatureUnit_ = bytes;
                                    } else if (tag == 34) {
                                        CommonProtos.KeyValue.Builder builder2 = (this.bitField0_ & 8) == 8 ? this.aqi_.toBuilder() : null;
                                        CommonProtos.KeyValue keyValue = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                        this.aqi_ = keyValue;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(keyValue);
                                            this.aqi_ = builder2.buildPartial();
                                        }
                                        i7 = this.bitField0_ | 8;
                                    } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                    this.bitField0_ = i7;
                                } else {
                                    this.bitField0_ |= 1;
                                    this.weather_ = codedInputStream.readUInt32();
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
            CommonProtos.KeyValue getAqi();

            CommonProtos.KeyValueOrBuilder getAqiOrBuilder();

            CommonProtos.RangeValue getTemperature();

            CommonProtos.RangeValueOrBuilder getTemperatureOrBuilder();

            String getTemperatureUnit();

            ByteString getTemperatureUnitBytes();

            int getWeather();

            boolean hasAqi();

            boolean hasTemperature();

            boolean hasTemperatureUnit();

            boolean hasWeather();
        }

        private WeatherHourForecast() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherHourForecast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_WeatherHourForecast_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WeatherHourForecast parseDelimitedFrom(InputStream inputStream) {
            return (WeatherHourForecast) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WeatherHourForecast parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WeatherHourForecast> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherHourForecast)) {
                return super.equals(obj);
            }
            WeatherHourForecast weatherHourForecast = (WeatherHourForecast) obj;
            boolean z6 = hasDataList() == weatherHourForecast.hasDataList();
            if (hasDataList()) {
                z6 = z6 && getDataList().equals(weatherHourForecast.getDataList());
            }
            return z6 && this.unknownFields.equals(weatherHourForecast.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecastOrBuilder
        public Data.List getDataList() {
            Data.List list = this.dataList_;
            return list == null ? Data.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecastOrBuilder
        public Data.ListOrBuilder getDataListOrBuilder() {
            Data.List list = this.dataList_;
            return list == null ? Data.List.getDefaultInstance() : list;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WeatherHourForecast> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = ((this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, getDataList()) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherHourForecastOrBuilder
        public boolean hasDataList() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasDataList()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_WeatherHourForecast_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherHourForecast.class, Builder.class);
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
            if (!hasDataList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getDataList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getDataList());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WeatherHourForecast(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                Data.List.Builder builder = (this.bitField0_ & 1) == 1 ? this.dataList_.toBuilder() : null;
                                Data.List list = (Data.List) codedInputStream.readMessage(Data.List.PARSER, extensionRegistryLite);
                                this.dataList_ = list;
                                if (builder != null) {
                                    builder.mergeFrom(list);
                                    this.dataList_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
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

        public static Builder newBuilder(WeatherHourForecast weatherHourForecast) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weatherHourForecast);
        }

        public static WeatherHourForecast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherHourForecast) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherHourForecast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WeatherHourForecast parseFrom(CodedInputStream codedInputStream) {
            return (WeatherHourForecast) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WeatherHourForecast getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WeatherHourForecast(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherHourForecast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherHourForecast) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WeatherHourForecast parseFrom(InputStream inputStream) {
            return (WeatherHourForecast) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WeatherHourForecast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherHourForecast) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherHourForecast parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WeatherHourForecast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WeatherHourForecast parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WeatherHourForecast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WeatherHourForecastOrBuilder extends MessageOrBuilder {
        WeatherHourForecast.Data.List getDataList();

        WeatherHourForecast.Data.ListOrBuilder getDataListOrBuilder();

        boolean hasDataList();
    }

    public static final class WeatherId extends GeneratedMessageV3 implements WeatherIdOrBuilder {
        public static final int CITY_NAME_FIELD_NUMBER = 2;
        public static final int LOCATION_NAME_FIELD_NUMBER = 3;
        public static final int PUB_TIME_FIELD_NUMBER = 1;
        public static final int PUB_TIME_STAMP_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object cityName_;
        private volatile Object locationName_;
        private byte memoizedIsInitialized;
        private int pubTimeStamp_;
        private volatile Object pubTime_;
        private static final WeatherId DEFAULT_INSTANCE = new WeatherId();

        @Deprecated
        public static final Parser<WeatherId> PARSER = new AbstractParser<WeatherId>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherId.1
            @Override // com.google.protobuf.Parser
            public WeatherId parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WeatherId(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherIdOrBuilder {
            private int bitField0_;
            private Object cityName_;
            private Object locationName_;
            private int pubTimeStamp_;
            private Object pubTime_;

            private Builder() {
                this.pubTime_ = "";
                this.cityName_ = "";
                this.locationName_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_WeatherId_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCityName() {
                this.bitField0_ &= -3;
                this.cityName_ = WeatherId.getDefaultInstance().getCityName();
                onChanged();
                return this;
            }

            public Builder clearLocationName() {
                this.bitField0_ &= -5;
                this.locationName_ = WeatherId.getDefaultInstance().getLocationName();
                onChanged();
                return this;
            }

            public Builder clearPubTime() {
                this.bitField0_ &= -2;
                this.pubTime_ = WeatherId.getDefaultInstance().getPubTime();
                onChanged();
                return this;
            }

            public Builder clearPubTimeStamp() {
                this.bitField0_ &= -9;
                this.pubTimeStamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
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

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
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
                return WeatherProtos.internal_static_WeatherId_descriptor;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public String getLocationName() {
                Object obj = this.locationName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.locationName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public ByteString getLocationNameBytes() {
                Object obj = this.locationName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locationName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public String getPubTime() {
                Object obj = this.pubTime_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.pubTime_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public ByteString getPubTimeBytes() {
                Object obj = this.pubTime_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pubTime_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public int getPubTimeStamp() {
                return this.pubTimeStamp_;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public boolean hasCityName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public boolean hasLocationName() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public boolean hasPubTime() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
            public boolean hasPubTimeStamp() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_WeatherId_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherId.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPubTime() && hasCityName() && hasLocationName();
            }

            public Builder setCityName(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.cityName_ = str;
                onChanged();
                return this;
            }

            public Builder setCityNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.cityName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLocationName(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.locationName_ = str;
                onChanged();
                return this;
            }

            public Builder setLocationNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.locationName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPubTime(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.pubTime_ = str;
                onChanged();
                return this;
            }

            public Builder setPubTimeBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.pubTime_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPubTimeStamp(int i7) {
                this.bitField0_ |= 8;
                this.pubTimeStamp_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.pubTime_ = "";
                this.cityName_ = "";
                this.locationName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherId build() {
                WeatherId weatherIdBuildPartial = buildPartial();
                if (weatherIdBuildPartial.isInitialized()) {
                    return weatherIdBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherIdBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherId buildPartial() {
                WeatherId weatherId = new WeatherId(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                weatherId.pubTime_ = this.pubTime_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                weatherId.cityName_ = this.cityName_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                weatherId.locationName_ = this.locationName_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                weatherId.pubTimeStamp_ = this.pubTimeStamp_;
                weatherId.bitField0_ = i8;
                onBuilt();
                return weatherId;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WeatherId getDefaultInstanceForType() {
                return WeatherId.getDefaultInstance();
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
                this.pubTime_ = "";
                int i7 = this.bitField0_;
                this.cityName_ = "";
                this.locationName_ = "";
                this.pubTimeStamp_ = 0;
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
            public com.zh.wear.protobuf.WeatherProtos.WeatherId.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherId> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherId.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WeatherProtos$WeatherId r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherId) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WeatherProtos$WeatherId r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherId) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherId.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherId$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WeatherId) {
                    return mergeFrom((WeatherId) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WeatherId weatherId) {
                if (weatherId == WeatherId.getDefaultInstance()) {
                    return this;
                }
                if (weatherId.hasPubTime()) {
                    this.bitField0_ |= 1;
                    this.pubTime_ = weatherId.pubTime_;
                    onChanged();
                }
                if (weatherId.hasCityName()) {
                    this.bitField0_ |= 2;
                    this.cityName_ = weatherId.cityName_;
                    onChanged();
                }
                if (weatherId.hasLocationName()) {
                    this.bitField0_ |= 4;
                    this.locationName_ = weatherId.locationName_;
                    onChanged();
                }
                if (weatherId.hasPubTimeStamp()) {
                    setPubTimeStamp(weatherId.getPubTimeStamp());
                }
                mergeUnknownFields(((GeneratedMessage) weatherId).unknownFields);
                onChanged();
                return this;
            }
        }

        private WeatherId() {
            this.memoizedIsInitialized = (byte) -1;
            this.pubTime_ = "";
            this.cityName_ = "";
            this.locationName_ = "";
            this.pubTimeStamp_ = 0;
        }

        public static WeatherId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_WeatherId_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WeatherId parseDelimitedFrom(InputStream inputStream) {
            return (WeatherId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WeatherId parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WeatherId> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherId)) {
                return super.equals(obj);
            }
            WeatherId weatherId = (WeatherId) obj;
            boolean z6 = hasPubTime() == weatherId.hasPubTime();
            if (hasPubTime()) {
                z6 = z6 && getPubTime().equals(weatherId.getPubTime());
            }
            boolean z7 = z6 && hasCityName() == weatherId.hasCityName();
            if (hasCityName()) {
                z7 = z7 && getCityName().equals(weatherId.getCityName());
            }
            boolean z8 = z7 && hasLocationName() == weatherId.hasLocationName();
            if (hasLocationName()) {
                z8 = z8 && getLocationName().equals(weatherId.getLocationName());
            }
            boolean z9 = z8 && hasPubTimeStamp() == weatherId.hasPubTimeStamp();
            if (hasPubTimeStamp()) {
                z9 = z9 && getPubTimeStamp() == weatherId.getPubTimeStamp();
            }
            return z9 && this.unknownFields.equals(weatherId.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
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

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public ByteString getCityNameBytes() {
            Object obj = this.cityName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cityName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public String getLocationName() {
            Object obj = this.locationName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.locationName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public ByteString getLocationNameBytes() {
            Object obj = this.locationName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locationName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WeatherId> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public String getPubTime() {
            Object obj = this.pubTime_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.pubTime_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public ByteString getPubTimeBytes() {
            Object obj = this.pubTime_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pubTime_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public int getPubTimeStamp() {
            return this.pubTimeStamp_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.pubTime_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.cityName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.locationName_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.pubTimeStamp_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public boolean hasCityName() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public boolean hasLocationName() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public boolean hasPubTime() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherIdOrBuilder
        public boolean hasPubTimeStamp() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPubTime()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPubTime().hashCode();
            }
            if (hasCityName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCityName().hashCode();
            }
            if (hasLocationName()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getLocationName().hashCode();
            }
            if (hasPubTimeStamp()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getPubTimeStamp();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_WeatherId_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherId.class, Builder.class);
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
            if (!hasPubTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCityName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLocationName()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.pubTime_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.cityName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.locationName_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeUInt32(4, this.pubTimeStamp_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WeatherId(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.pubTime_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.cityName_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.locationName_ = bytes3;
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.pubTimeStamp_ = codedInputStream.readUInt32();
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

        public static Builder newBuilder(WeatherId weatherId) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weatherId);
        }

        public static WeatherId parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherId parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WeatherId parseFrom(CodedInputStream codedInputStream) {
            return (WeatherId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WeatherId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WeatherId(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherId parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WeatherId parseFrom(InputStream inputStream) {
            return (WeatherId) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WeatherId parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherId) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherId parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WeatherId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WeatherId parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WeatherId parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WeatherIdOrBuilder extends MessageOrBuilder {
        String getCityName();

        ByteString getCityNameBytes();

        String getLocationName();

        ByteString getLocationNameBytes();

        String getPubTime();

        ByteString getPubTimeBytes();

        int getPubTimeStamp();

        boolean hasCityName();

        boolean hasLocationName();

        boolean hasPubTime();

        boolean hasPubTimeStamp();
    }

    public static final class WeatherLatest extends GeneratedMessageV3 implements WeatherLatestOrBuilder {
        public static final int ALERTS_LIST_FIELD_NUMBER = 8;
        public static final int AQI_FIELD_NUMBER = 7;
        public static final int HUMIDITY_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PRESSURE_FIELD_NUMBER = 9;
        public static final int PROBABILITY_OF_RAINFALL_FIELD_NUMBER = 11;
        public static final int TEMPERATURE_FIELD_NUMBER = 3;
        public static final int UVINDEX_FIELD_NUMBER = 6;
        public static final int WEATHER_FIELD_NUMBER = 2;
        public static final int WIND_INFO_FIELD_NUMBER = 5;
        public static final int WIND_SPEED_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        private Alerts.List alertsList_;
        private CommonProtos.KeyValue aqi_;
        private int bitField0_;
        private CommonProtos.KeyValue humidity_;
        private WeatherId id_;
        private byte memoizedIsInitialized;
        private float pressure_;
        private CommonProtos.KeyValue probabilityOfRainfall_;
        private CommonProtos.KeyValue temperature_;
        private CommonProtos.KeyValue uvindex_;
        private int weather_;
        private CommonProtos.KeyValue windInfo_;
        private CommonProtos.KeyValue windSpeed_;
        private static final WeatherLatest DEFAULT_INSTANCE = new WeatherLatest();

        @Deprecated
        public static final Parser<WeatherLatest> PARSER = new AbstractParser<WeatherLatest>() { // from class: com.zh.wear.protobuf.WeatherProtos.WeatherLatest.1
            @Override // com.google.protobuf.Parser
            public WeatherLatest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WeatherLatest(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherLatestOrBuilder {
            private SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> alertsListBuilder_;
            private Alerts.List alertsList_;
            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> aqiBuilder_;
            private CommonProtos.KeyValue aqi_;
            private int bitField0_;
            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> humidityBuilder_;
            private CommonProtos.KeyValue humidity_;
            private SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> idBuilder_;
            private WeatherId id_;
            private float pressure_;
            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> probabilityOfRainfallBuilder_;
            private CommonProtos.KeyValue probabilityOfRainfall_;
            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> temperatureBuilder_;
            private CommonProtos.KeyValue temperature_;
            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> uvindexBuilder_;
            private CommonProtos.KeyValue uvindex_;
            private int weather_;
            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> windInfoBuilder_;
            private CommonProtos.KeyValue windInfo_;
            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> windSpeedBuilder_;
            private CommonProtos.KeyValue windSpeed_;

            private Builder() {
                this.id_ = null;
                this.temperature_ = null;
                this.humidity_ = null;
                this.windInfo_ = null;
                this.uvindex_ = null;
                this.aqi_ = null;
                this.alertsList_ = null;
                this.windSpeed_ = null;
                this.probabilityOfRainfall_ = null;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> getAlertsListFieldBuilder() {
                if (this.alertsListBuilder_ == null) {
                    this.alertsListBuilder_ = new SingleFieldBuilderV3<>(getAlertsList(), getParentForChildren(), isClean());
                    this.alertsList_ = null;
                }
                return this.alertsListBuilder_;
            }

            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getAqiFieldBuilder() {
                if (this.aqiBuilder_ == null) {
                    this.aqiBuilder_ = new SingleFieldBuilderV3<>(getAqi(), getParentForChildren(), isClean());
                    this.aqi_ = null;
                }
                return this.aqiBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_WeatherLatest_descriptor;
            }

            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getHumidityFieldBuilder() {
                if (this.humidityBuilder_ == null) {
                    this.humidityBuilder_ = new SingleFieldBuilderV3<>(getHumidity(), getParentForChildren(), isClean());
                    this.humidity_ = null;
                }
                return this.humidityBuilder_;
            }

            private SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> getIdFieldBuilder() {
                if (this.idBuilder_ == null) {
                    this.idBuilder_ = new SingleFieldBuilderV3<>(getId(), getParentForChildren(), isClean());
                    this.id_ = null;
                }
                return this.idBuilder_;
            }

            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getProbabilityOfRainfallFieldBuilder() {
                if (this.probabilityOfRainfallBuilder_ == null) {
                    this.probabilityOfRainfallBuilder_ = new SingleFieldBuilderV3<>(getProbabilityOfRainfall(), getParentForChildren(), isClean());
                    this.probabilityOfRainfall_ = null;
                }
                return this.probabilityOfRainfallBuilder_;
            }

            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getTemperatureFieldBuilder() {
                if (this.temperatureBuilder_ == null) {
                    this.temperatureBuilder_ = new SingleFieldBuilderV3<>(getTemperature(), getParentForChildren(), isClean());
                    this.temperature_ = null;
                }
                return this.temperatureBuilder_;
            }

            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getUvindexFieldBuilder() {
                if (this.uvindexBuilder_ == null) {
                    this.uvindexBuilder_ = new SingleFieldBuilderV3<>(getUvindex(), getParentForChildren(), isClean());
                    this.uvindex_ = null;
                }
                return this.uvindexBuilder_;
            }

            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getWindInfoFieldBuilder() {
                if (this.windInfoBuilder_ == null) {
                    this.windInfoBuilder_ = new SingleFieldBuilderV3<>(getWindInfo(), getParentForChildren(), isClean());
                    this.windInfo_ = null;
                }
                return this.windInfoBuilder_;
            }

            private SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> getWindSpeedFieldBuilder() {
                if (this.windSpeedBuilder_ == null) {
                    this.windSpeedBuilder_ = new SingleFieldBuilderV3<>(getWindSpeed(), getParentForChildren(), isClean());
                    this.windSpeed_ = null;
                }
                return this.windSpeedBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getIdFieldBuilder();
                    getTemperatureFieldBuilder();
                    getHumidityFieldBuilder();
                    getWindInfoFieldBuilder();
                    getUvindexFieldBuilder();
                    getAqiFieldBuilder();
                    getAlertsListFieldBuilder();
                    getWindSpeedFieldBuilder();
                    getProbabilityOfRainfallFieldBuilder();
                }
            }

            public Builder clearAlertsList() {
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV3 = this.alertsListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alertsList_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                return this;
            }

            public Builder clearAqi() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.aqi_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -65;
                return this;
            }

            public Builder clearHumidity() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.humidity_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Builder clearId() {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.id_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearPressure() {
                this.bitField0_ &= -257;
                this.pressure_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearProbabilityOfRainfall() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.probabilityOfRainfall_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -1025;
                return this;
            }

            public Builder clearTemperature() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.temperature_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public Builder clearUvindex() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.uvindexBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uvindex_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -33;
                return this;
            }

            public Builder clearWeather() {
                this.bitField0_ &= -3;
                this.weather_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWindInfo() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.windInfo_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -17;
                return this;
            }

            public Builder clearWindSpeed() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.windSpeed_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -513;
                return this;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public Alerts.List getAlertsList() {
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV3 = this.alertsListBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Alerts.List) singleFieldBuilderV3.getMessage();
                }
                Alerts.List list = this.alertsList_;
                return list == null ? Alerts.List.getDefaultInstance() : list;
            }

            public Alerts.List.Builder getAlertsListBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (Alerts.List.Builder) getAlertsListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public Alerts.ListOrBuilder getAlertsListOrBuilder() {
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV3 = this.alertsListBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Alerts.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Alerts.List list = this.alertsList_;
                return list == null ? Alerts.List.getDefaultInstance() : list;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValue getAqi() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                }
                CommonProtos.KeyValue keyValue = this.aqi_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            public CommonProtos.KeyValue.Builder getAqiBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (CommonProtos.KeyValue.Builder) getAqiFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValueOrBuilder getAqiOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommonProtos.KeyValue keyValue = this.aqi_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_WeatherLatest_descriptor;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValue getHumidity() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                }
                CommonProtos.KeyValue keyValue = this.humidity_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            public CommonProtos.KeyValue.Builder getHumidityBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CommonProtos.KeyValue.Builder) getHumidityFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValueOrBuilder getHumidityOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommonProtos.KeyValue keyValue = this.humidity_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public WeatherId getId() {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherId) singleFieldBuilderV3.getMessage();
                }
                WeatherId weatherId = this.id_;
                return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
            }

            public WeatherId.Builder getIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WeatherId.Builder) getIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public WeatherIdOrBuilder getIdOrBuilder() {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WeatherId weatherId = this.id_;
                return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public float getPressure() {
                return this.pressure_;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValue getProbabilityOfRainfall() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                }
                CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            public CommonProtos.KeyValue.Builder getProbabilityOfRainfallBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (CommonProtos.KeyValue.Builder) getProbabilityOfRainfallFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValueOrBuilder getProbabilityOfRainfallOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValue getTemperature() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                }
                CommonProtos.KeyValue keyValue = this.temperature_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            public CommonProtos.KeyValue.Builder getTemperatureBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CommonProtos.KeyValue.Builder) getTemperatureFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValueOrBuilder getTemperatureOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommonProtos.KeyValue keyValue = this.temperature_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValue getUvindex() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.uvindexBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                }
                CommonProtos.KeyValue keyValue = this.uvindex_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            public CommonProtos.KeyValue.Builder getUvindexBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (CommonProtos.KeyValue.Builder) getUvindexFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValueOrBuilder getUvindexOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.uvindexBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommonProtos.KeyValue keyValue = this.uvindex_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public int getWeather() {
                return this.weather_;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValue getWindInfo() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                }
                CommonProtos.KeyValue keyValue = this.windInfo_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            public CommonProtos.KeyValue.Builder getWindInfoBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (CommonProtos.KeyValue.Builder) getWindInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValueOrBuilder getWindInfoOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommonProtos.KeyValue keyValue = this.windInfo_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValue getWindSpeed() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValue) singleFieldBuilderV3.getMessage();
                }
                CommonProtos.KeyValue keyValue = this.windSpeed_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            public CommonProtos.KeyValue.Builder getWindSpeedBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (CommonProtos.KeyValue.Builder) getWindSpeedFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public CommonProtos.KeyValueOrBuilder getWindSpeedOrBuilder() {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommonProtos.KeyValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommonProtos.KeyValue keyValue = this.windSpeed_;
                return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasAlertsList() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasAqi() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasHumidity() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasPressure() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasProbabilityOfRainfall() {
                return (this.bitField0_ & 1024) == 1024;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasTemperature() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasUvindex() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasWeather() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasWindInfo() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
            public boolean hasWindSpeed() {
                return (this.bitField0_ & 512) == 512;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_WeatherLatest_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherLatest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasWeather() || !hasTemperature() || !hasHumidity() || !hasWindInfo() || !hasUvindex() || !hasAqi() || !hasAlertsList() || !getId().isInitialized() || !getTemperature().isInitialized() || !getHumidity().isInitialized() || !getWindInfo().isInitialized() || !getUvindex().isInitialized() || !getAqi().isInitialized() || !getAlertsList().isInitialized()) {
                    return false;
                }
                if (!hasWindSpeed() || getWindSpeed().isInitialized()) {
                    return !hasProbabilityOfRainfall() || getProbabilityOfRainfall().isInitialized();
                }
                return false;
            }

            public Builder mergeAlertsList(Alerts.List list) {
                Alerts.List list2;
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV3 = this.alertsListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 128) == 128 && (list2 = this.alertsList_) != null && list2 != Alerts.List.getDefaultInstance()) {
                        list = Alerts.List.newBuilder(this.alertsList_).mergeFrom(list).buildPartial();
                    }
                    this.alertsList_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(list);
                }
                this.bitField0_ |= 128;
                return this;
            }

            public Builder mergeAqi(CommonProtos.KeyValue keyValue) {
                CommonProtos.KeyValue keyValue2;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 64) == 64 && (keyValue2 = this.aqi_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                        keyValue = CommonProtos.KeyValue.newBuilder(this.aqi_).mergeFrom(keyValue).buildPartial();
                    }
                    this.aqi_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(keyValue);
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeHumidity(CommonProtos.KeyValue keyValue) {
                CommonProtos.KeyValue keyValue2;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) == 8 && (keyValue2 = this.humidity_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                        keyValue = CommonProtos.KeyValue.newBuilder(this.humidity_).mergeFrom(keyValue).buildPartial();
                    }
                    this.humidity_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(keyValue);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeId(WeatherId weatherId) {
                WeatherId weatherId2;
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 1 && (weatherId2 = this.id_) != null && weatherId2 != WeatherId.getDefaultInstance()) {
                        weatherId = WeatherId.newBuilder(this.id_).mergeFrom(weatherId).buildPartial();
                    }
                    this.id_ = weatherId;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(weatherId);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeProbabilityOfRainfall(CommonProtos.KeyValue keyValue) {
                CommonProtos.KeyValue keyValue2;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1024) == 1024 && (keyValue2 = this.probabilityOfRainfall_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                        keyValue = CommonProtos.KeyValue.newBuilder(this.probabilityOfRainfall_).mergeFrom(keyValue).buildPartial();
                    }
                    this.probabilityOfRainfall_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(keyValue);
                }
                this.bitField0_ |= 1024;
                return this;
            }

            public Builder mergeTemperature(CommonProtos.KeyValue keyValue) {
                CommonProtos.KeyValue keyValue2;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 4 && (keyValue2 = this.temperature_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                        keyValue = CommonProtos.KeyValue.newBuilder(this.temperature_).mergeFrom(keyValue).buildPartial();
                    }
                    this.temperature_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(keyValue);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeUvindex(CommonProtos.KeyValue keyValue) {
                CommonProtos.KeyValue keyValue2;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.uvindexBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 32) == 32 && (keyValue2 = this.uvindex_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                        keyValue = CommonProtos.KeyValue.newBuilder(this.uvindex_).mergeFrom(keyValue).buildPartial();
                    }
                    this.uvindex_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(keyValue);
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder mergeWindInfo(CommonProtos.KeyValue keyValue) {
                CommonProtos.KeyValue keyValue2;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) == 16 && (keyValue2 = this.windInfo_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                        keyValue = CommonProtos.KeyValue.newBuilder(this.windInfo_).mergeFrom(keyValue).buildPartial();
                    }
                    this.windInfo_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(keyValue);
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder mergeWindSpeed(CommonProtos.KeyValue keyValue) {
                CommonProtos.KeyValue keyValue2;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 512) == 512 && (keyValue2 = this.windSpeed_) != null && keyValue2 != CommonProtos.KeyValue.getDefaultInstance()) {
                        keyValue = CommonProtos.KeyValue.newBuilder(this.windSpeed_).mergeFrom(keyValue).buildPartial();
                    }
                    this.windSpeed_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(keyValue);
                }
                this.bitField0_ |= 512;
                return this;
            }

            public Builder setAlertsList(Alerts.List.Builder builder) {
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV3 = this.alertsListBuilder_;
                Alerts.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.alertsList_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.bitField0_ |= 128;
                return this;
            }

            public Builder setAqi(CommonProtos.KeyValue.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                CommonProtos.KeyValue keyValueBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.aqi_ = keyValueBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValueBuild);
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder setHumidity(CommonProtos.KeyValue.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                CommonProtos.KeyValue keyValueBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.humidity_ = keyValueBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValueBuild);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setId(WeatherId.Builder builder) {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                WeatherId weatherIdBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.id_ = weatherIdBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherIdBuild);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setPressure(float f7) {
                this.bitField0_ |= 256;
                this.pressure_ = f7;
                onChanged();
                return this;
            }

            public Builder setProbabilityOfRainfall(CommonProtos.KeyValue.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                CommonProtos.KeyValue keyValueBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.probabilityOfRainfall_ = keyValueBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValueBuild);
                }
                this.bitField0_ |= 1024;
                return this;
            }

            public Builder setTemperature(CommonProtos.KeyValue.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                CommonProtos.KeyValue keyValueBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.temperature_ = keyValueBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValueBuild);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setUvindex(CommonProtos.KeyValue.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.uvindexBuilder_;
                CommonProtos.KeyValue keyValueBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.uvindex_ = keyValueBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValueBuild);
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder setWeather(int i7) {
                this.bitField0_ |= 2;
                this.weather_ = i7;
                onChanged();
                return this;
            }

            public Builder setWindInfo(CommonProtos.KeyValue.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                CommonProtos.KeyValue keyValueBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.windInfo_ = keyValueBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValueBuild);
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder setWindSpeed(CommonProtos.KeyValue.Builder builder) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                CommonProtos.KeyValue keyValueBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.windSpeed_ = keyValueBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValueBuild);
                }
                this.bitField0_ |= 512;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = null;
                this.temperature_ = null;
                this.humidity_ = null;
                this.windInfo_ = null;
                this.uvindex_ = null;
                this.aqi_ = null;
                this.alertsList_ = null;
                this.windSpeed_ = null;
                this.probabilityOfRainfall_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setAlertsList(Alerts.List list) {
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV3 = this.alertsListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.alertsList_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.bitField0_ |= 128;
                return this;
            }

            public Builder setAqi(CommonProtos.KeyValue keyValue) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.aqiBuilder_;
                if (singleFieldBuilderV3 == null) {
                    keyValue.getClass();
                    this.aqi_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValue);
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder setHumidity(CommonProtos.KeyValue keyValue) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.humidityBuilder_;
                if (singleFieldBuilderV3 == null) {
                    keyValue.getClass();
                    this.humidity_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValue);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setId(WeatherId weatherId) {
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weatherId.getClass();
                    this.id_ = weatherId;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherId);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setProbabilityOfRainfall(CommonProtos.KeyValue keyValue) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.probabilityOfRainfallBuilder_;
                if (singleFieldBuilderV3 == null) {
                    keyValue.getClass();
                    this.probabilityOfRainfall_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValue);
                }
                this.bitField0_ |= 1024;
                return this;
            }

            public Builder setTemperature(CommonProtos.KeyValue keyValue) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.temperatureBuilder_;
                if (singleFieldBuilderV3 == null) {
                    keyValue.getClass();
                    this.temperature_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValue);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setUvindex(CommonProtos.KeyValue keyValue) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.uvindexBuilder_;
                if (singleFieldBuilderV3 == null) {
                    keyValue.getClass();
                    this.uvindex_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValue);
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder setWindInfo(CommonProtos.KeyValue keyValue) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    keyValue.getClass();
                    this.windInfo_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValue);
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder setWindSpeed(CommonProtos.KeyValue keyValue) {
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV3 = this.windSpeedBuilder_;
                if (singleFieldBuilderV3 == null) {
                    keyValue.getClass();
                    this.windSpeed_ = keyValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(keyValue);
                }
                this.bitField0_ |= 512;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherLatest build() {
                WeatherLatest weatherLatestBuildPartial = buildPartial();
                if (weatherLatestBuildPartial.isInitialized()) {
                    return weatherLatestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherLatestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherLatest buildPartial() {
                WeatherLatest weatherLatest = new WeatherLatest(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                weatherLatest.id_ = singleFieldBuilderV3 == null ? this.id_ : (WeatherId) singleFieldBuilderV3.build();
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                weatherLatest.weather_ = this.weather_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV32 = this.temperatureBuilder_;
                weatherLatest.temperature_ = singleFieldBuilderV32 == null ? this.temperature_ : (CommonProtos.KeyValue) singleFieldBuilderV32.build();
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV33 = this.humidityBuilder_;
                weatherLatest.humidity_ = singleFieldBuilderV33 == null ? this.humidity_ : (CommonProtos.KeyValue) singleFieldBuilderV33.build();
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV34 = this.windInfoBuilder_;
                weatherLatest.windInfo_ = singleFieldBuilderV34 == null ? this.windInfo_ : (CommonProtos.KeyValue) singleFieldBuilderV34.build();
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV35 = this.uvindexBuilder_;
                weatherLatest.uvindex_ = singleFieldBuilderV35 == null ? this.uvindex_ : (CommonProtos.KeyValue) singleFieldBuilderV35.build();
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV36 = this.aqiBuilder_;
                weatherLatest.aqi_ = singleFieldBuilderV36 == null ? this.aqi_ : (CommonProtos.KeyValue) singleFieldBuilderV36.build();
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV37 = this.alertsListBuilder_;
                weatherLatest.alertsList_ = singleFieldBuilderV37 == null ? this.alertsList_ : (Alerts.List) singleFieldBuilderV37.build();
                if ((i7 & 256) == 256) {
                    i8 |= 256;
                }
                weatherLatest.pressure_ = this.pressure_;
                if ((i7 & 512) == 512) {
                    i8 |= 512;
                }
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV38 = this.windSpeedBuilder_;
                weatherLatest.windSpeed_ = singleFieldBuilderV38 == null ? this.windSpeed_ : (CommonProtos.KeyValue) singleFieldBuilderV38.build();
                if ((i7 & 1024) == 1024) {
                    i8 |= 1024;
                }
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV39 = this.probabilityOfRainfallBuilder_;
                weatherLatest.probabilityOfRainfall_ = singleFieldBuilderV39 == null ? this.probabilityOfRainfall_ : (CommonProtos.KeyValue) singleFieldBuilderV39.build();
                weatherLatest.bitField0_ = i8;
                onBuilt();
                return weatherLatest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WeatherLatest getDefaultInstanceForType() {
                return WeatherLatest.getDefaultInstance();
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
                SingleFieldBuilderV3<WeatherId, WeatherId.Builder, WeatherIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.id_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                int i7 = this.bitField0_;
                this.weather_ = 0;
                this.bitField0_ = i7 & (-4);
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV32 = this.temperatureBuilder_;
                if (singleFieldBuilderV32 == null) {
                    this.temperature_ = null;
                } else {
                    singleFieldBuilderV32.clear();
                }
                this.bitField0_ &= -5;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV33 = this.humidityBuilder_;
                if (singleFieldBuilderV33 == null) {
                    this.humidity_ = null;
                } else {
                    singleFieldBuilderV33.clear();
                }
                this.bitField0_ &= -9;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV34 = this.windInfoBuilder_;
                if (singleFieldBuilderV34 == null) {
                    this.windInfo_ = null;
                } else {
                    singleFieldBuilderV34.clear();
                }
                this.bitField0_ &= -17;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV35 = this.uvindexBuilder_;
                if (singleFieldBuilderV35 == null) {
                    this.uvindex_ = null;
                } else {
                    singleFieldBuilderV35.clear();
                }
                this.bitField0_ &= -33;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV36 = this.aqiBuilder_;
                if (singleFieldBuilderV36 == null) {
                    this.aqi_ = null;
                } else {
                    singleFieldBuilderV36.clear();
                }
                this.bitField0_ &= -65;
                SingleFieldBuilderV3<Alerts.List, Alerts.List.Builder, Alerts.ListOrBuilder> singleFieldBuilderV37 = this.alertsListBuilder_;
                if (singleFieldBuilderV37 == null) {
                    this.alertsList_ = null;
                } else {
                    singleFieldBuilderV37.clear();
                }
                int i8 = this.bitField0_;
                this.pressure_ = 0.0f;
                this.bitField0_ = i8 & (-385);
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV38 = this.windSpeedBuilder_;
                if (singleFieldBuilderV38 == null) {
                    this.windSpeed_ = null;
                } else {
                    singleFieldBuilderV38.clear();
                }
                this.bitField0_ &= -513;
                SingleFieldBuilderV3<CommonProtos.KeyValue, CommonProtos.KeyValue.Builder, CommonProtos.KeyValueOrBuilder> singleFieldBuilderV39 = this.probabilityOfRainfallBuilder_;
                if (singleFieldBuilderV39 == null) {
                    this.probabilityOfRainfall_ = null;
                } else {
                    singleFieldBuilderV39.clear();
                }
                this.bitField0_ &= -1025;
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
            public com.zh.wear.protobuf.WeatherProtos.WeatherLatest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WeatherProtos$WeatherLatest> r1 = com.zh.wear.protobuf.WeatherProtos.WeatherLatest.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WeatherProtos$WeatherLatest r3 = (com.zh.wear.protobuf.WeatherProtos.WeatherLatest) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WeatherProtos$WeatherLatest r4 = (com.zh.wear.protobuf.WeatherProtos.WeatherLatest) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WeatherProtos.WeatherLatest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WeatherProtos$WeatherLatest$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WeatherLatest) {
                    return mergeFrom((WeatherLatest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WeatherLatest weatherLatest) {
                if (weatherLatest == WeatherLatest.getDefaultInstance()) {
                    return this;
                }
                if (weatherLatest.hasId()) {
                    mergeId(weatherLatest.getId());
                }
                if (weatherLatest.hasWeather()) {
                    setWeather(weatherLatest.getWeather());
                }
                if (weatherLatest.hasTemperature()) {
                    mergeTemperature(weatherLatest.getTemperature());
                }
                if (weatherLatest.hasHumidity()) {
                    mergeHumidity(weatherLatest.getHumidity());
                }
                if (weatherLatest.hasWindInfo()) {
                    mergeWindInfo(weatherLatest.getWindInfo());
                }
                if (weatherLatest.hasUvindex()) {
                    mergeUvindex(weatherLatest.getUvindex());
                }
                if (weatherLatest.hasAqi()) {
                    mergeAqi(weatherLatest.getAqi());
                }
                if (weatherLatest.hasAlertsList()) {
                    mergeAlertsList(weatherLatest.getAlertsList());
                }
                if (weatherLatest.hasPressure()) {
                    setPressure(weatherLatest.getPressure());
                }
                if (weatherLatest.hasWindSpeed()) {
                    mergeWindSpeed(weatherLatest.getWindSpeed());
                }
                if (weatherLatest.hasProbabilityOfRainfall()) {
                    mergeProbabilityOfRainfall(weatherLatest.getProbabilityOfRainfall());
                }
                mergeUnknownFields(((GeneratedMessage) weatherLatest).unknownFields);
                onChanged();
                return this;
            }
        }

        private WeatherLatest() {
            this.memoizedIsInitialized = (byte) -1;
            this.weather_ = 0;
            this.pressure_ = 0.0f;
        }

        public static WeatherLatest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_WeatherLatest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WeatherLatest parseDelimitedFrom(InputStream inputStream) {
            return (WeatherLatest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WeatherLatest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WeatherLatest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherLatest)) {
                return super.equals(obj);
            }
            WeatherLatest weatherLatest = (WeatherLatest) obj;
            boolean z6 = hasId() == weatherLatest.hasId();
            if (hasId()) {
                z6 = z6 && getId().equals(weatherLatest.getId());
            }
            boolean z7 = z6 && hasWeather() == weatherLatest.hasWeather();
            if (hasWeather()) {
                z7 = z7 && getWeather() == weatherLatest.getWeather();
            }
            boolean z8 = z7 && hasTemperature() == weatherLatest.hasTemperature();
            if (hasTemperature()) {
                z8 = z8 && getTemperature().equals(weatherLatest.getTemperature());
            }
            boolean z9 = z8 && hasHumidity() == weatherLatest.hasHumidity();
            if (hasHumidity()) {
                z9 = z9 && getHumidity().equals(weatherLatest.getHumidity());
            }
            boolean z10 = z9 && hasWindInfo() == weatherLatest.hasWindInfo();
            if (hasWindInfo()) {
                z10 = z10 && getWindInfo().equals(weatherLatest.getWindInfo());
            }
            boolean z11 = z10 && hasUvindex() == weatherLatest.hasUvindex();
            if (hasUvindex()) {
                z11 = z11 && getUvindex().equals(weatherLatest.getUvindex());
            }
            boolean z12 = z11 && hasAqi() == weatherLatest.hasAqi();
            if (hasAqi()) {
                z12 = z12 && getAqi().equals(weatherLatest.getAqi());
            }
            boolean z13 = z12 && hasAlertsList() == weatherLatest.hasAlertsList();
            if (hasAlertsList()) {
                z13 = z13 && getAlertsList().equals(weatherLatest.getAlertsList());
            }
            boolean z14 = z13 && hasPressure() == weatherLatest.hasPressure();
            if (hasPressure()) {
                z14 = z14 && Float.floatToIntBits(getPressure()) == Float.floatToIntBits(weatherLatest.getPressure());
            }
            boolean z15 = z14 && hasWindSpeed() == weatherLatest.hasWindSpeed();
            if (hasWindSpeed()) {
                z15 = z15 && getWindSpeed().equals(weatherLatest.getWindSpeed());
            }
            boolean z16 = z15 && hasProbabilityOfRainfall() == weatherLatest.hasProbabilityOfRainfall();
            if (hasProbabilityOfRainfall()) {
                z16 = z16 && getProbabilityOfRainfall().equals(weatherLatest.getProbabilityOfRainfall());
            }
            return z16 && this.unknownFields.equals(weatherLatest.unknownFields);
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public Alerts.List getAlertsList() {
            Alerts.List list = this.alertsList_;
            return list == null ? Alerts.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public Alerts.ListOrBuilder getAlertsListOrBuilder() {
            Alerts.List list = this.alertsList_;
            return list == null ? Alerts.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValue getAqi() {
            CommonProtos.KeyValue keyValue = this.aqi_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValueOrBuilder getAqiOrBuilder() {
            CommonProtos.KeyValue keyValue = this.aqi_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValue getHumidity() {
            CommonProtos.KeyValue keyValue = this.humidity_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValueOrBuilder getHumidityOrBuilder() {
            CommonProtos.KeyValue keyValue = this.humidity_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public WeatherId getId() {
            WeatherId weatherId = this.id_;
            return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public WeatherIdOrBuilder getIdOrBuilder() {
            WeatherId weatherId = this.id_;
            return weatherId == null ? WeatherId.getDefaultInstance() : weatherId;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WeatherLatest> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public float getPressure() {
            return this.pressure_;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValue getProbabilityOfRainfall() {
            CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValueOrBuilder getProbabilityOfRainfallOrBuilder() {
            CommonProtos.KeyValue keyValue = this.probabilityOfRainfall_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, getId()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.weather_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getTemperature());
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getHumidity());
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getWindInfo());
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getUvindex());
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getAqi());
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getAlertsList());
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(9, this.pressure_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getWindSpeed());
            }
            if ((this.bitField0_ & 1024) == 1024) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getProbabilityOfRainfall());
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValue getTemperature() {
            CommonProtos.KeyValue keyValue = this.temperature_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValueOrBuilder getTemperatureOrBuilder() {
            CommonProtos.KeyValue keyValue = this.temperature_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValue getUvindex() {
            CommonProtos.KeyValue keyValue = this.uvindex_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValueOrBuilder getUvindexOrBuilder() {
            CommonProtos.KeyValue keyValue = this.uvindex_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public int getWeather() {
            return this.weather_;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValue getWindInfo() {
            CommonProtos.KeyValue keyValue = this.windInfo_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValueOrBuilder getWindInfoOrBuilder() {
            CommonProtos.KeyValue keyValue = this.windInfo_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValue getWindSpeed() {
            CommonProtos.KeyValue keyValue = this.windSpeed_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public CommonProtos.KeyValueOrBuilder getWindSpeedOrBuilder() {
            CommonProtos.KeyValue keyValue = this.windSpeed_;
            return keyValue == null ? CommonProtos.KeyValue.getDefaultInstance() : keyValue;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasAlertsList() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasAqi() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasHumidity() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasPressure() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasProbabilityOfRainfall() {
            return (this.bitField0_ & 1024) == 1024;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasTemperature() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasUvindex() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasWeather() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasWindInfo() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.WeatherProtos.WeatherLatestOrBuilder
        public boolean hasWindSpeed() {
            return (this.bitField0_ & 512) == 512;
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
            if (hasWeather()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getWeather();
            }
            if (hasTemperature()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTemperature().hashCode();
            }
            if (hasHumidity()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getHumidity().hashCode();
            }
            if (hasWindInfo()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getWindInfo().hashCode();
            }
            if (hasUvindex()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getUvindex().hashCode();
            }
            if (hasAqi()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getAqi().hashCode();
            }
            if (hasAlertsList()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getAlertsList().hashCode();
            }
            if (hasPressure()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + Float.floatToIntBits(getPressure());
            }
            if (hasWindSpeed()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getWindSpeed().hashCode();
            }
            if (hasProbabilityOfRainfall()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getProbabilityOfRainfall().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_WeatherLatest_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherLatest.class, Builder.class);
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
            if (!hasWeather()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTemperature()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHumidity()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWindInfo()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasUvindex()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAqi()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlertsList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getId().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getTemperature().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getHumidity().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getWindInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getUvindex().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getAqi().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getAlertsList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasWindSpeed() && !getWindSpeed().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasProbabilityOfRainfall() || getProbabilityOfRainfall().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getId());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeUInt32(2, this.weather_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, getTemperature());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, getHumidity());
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(5, getWindInfo());
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(6, getUvindex());
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeMessage(7, getAqi());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(8, getAlertsList());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeFloat(9, this.pressure_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeMessage(10, getWindSpeed());
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeMessage(11, getProbabilityOfRainfall());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WeatherLatest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                WeatherId.Builder builder = (this.bitField0_ & 1) == 1 ? this.id_.toBuilder() : null;
                                WeatherId weatherId = (WeatherId) codedInputStream.readMessage(WeatherId.PARSER, extensionRegistryLite);
                                this.id_ = weatherId;
                                if (builder != null) {
                                    builder.mergeFrom(weatherId);
                                    this.id_ = builder.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 16:
                                this.bitField0_ |= 2;
                                this.weather_ = codedInputStream.readUInt32();
                                break;
                            case 26:
                                i7 = 4;
                                CommonProtos.KeyValue.Builder builder2 = (this.bitField0_ & 4) == 4 ? this.temperature_.toBuilder() : null;
                                CommonProtos.KeyValue keyValue = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                this.temperature_ = keyValue;
                                if (builder2 != null) {
                                    builder2.mergeFrom(keyValue);
                                    this.temperature_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 34:
                                i7 = 8;
                                CommonProtos.KeyValue.Builder builder3 = (this.bitField0_ & 8) == 8 ? this.humidity_.toBuilder() : null;
                                CommonProtos.KeyValue keyValue2 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                this.humidity_ = keyValue2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(keyValue2);
                                    this.humidity_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 42:
                                i7 = 16;
                                CommonProtos.KeyValue.Builder builder4 = (this.bitField0_ & 16) == 16 ? this.windInfo_.toBuilder() : null;
                                CommonProtos.KeyValue keyValue3 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                this.windInfo_ = keyValue3;
                                if (builder4 != null) {
                                    builder4.mergeFrom(keyValue3);
                                    this.windInfo_ = builder4.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 50:
                                i7 = 32;
                                CommonProtos.KeyValue.Builder builder5 = (this.bitField0_ & 32) == 32 ? this.uvindex_.toBuilder() : null;
                                CommonProtos.KeyValue keyValue4 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                this.uvindex_ = keyValue4;
                                if (builder5 != null) {
                                    builder5.mergeFrom(keyValue4);
                                    this.uvindex_ = builder5.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 58:
                                i7 = 64;
                                CommonProtos.KeyValue.Builder builder6 = (this.bitField0_ & 64) == 64 ? this.aqi_.toBuilder() : null;
                                CommonProtos.KeyValue keyValue5 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                this.aqi_ = keyValue5;
                                if (builder6 != null) {
                                    builder6.mergeFrom(keyValue5);
                                    this.aqi_ = builder6.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 66:
                                i7 = 128;
                                Alerts.List.Builder builder7 = (this.bitField0_ & 128) == 128 ? this.alertsList_.toBuilder() : null;
                                Alerts.List list = (Alerts.List) codedInputStream.readMessage(Alerts.List.PARSER, extensionRegistryLite);
                                this.alertsList_ = list;
                                if (builder7 != null) {
                                    builder7.mergeFrom(list);
                                    this.alertsList_ = builder7.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 77:
                                this.bitField0_ |= 256;
                                this.pressure_ = codedInputStream.readFloat();
                                break;
                            case 82:
                                i7 = 512;
                                CommonProtos.KeyValue.Builder builder8 = (this.bitField0_ & 512) == 512 ? this.windSpeed_.toBuilder() : null;
                                CommonProtos.KeyValue keyValue6 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                this.windSpeed_ = keyValue6;
                                if (builder8 != null) {
                                    builder8.mergeFrom(keyValue6);
                                    this.windSpeed_ = builder8.buildPartial();
                                }
                                this.bitField0_ |= i7;
                                break;
                            case 90:
                                i7 = 1024;
                                CommonProtos.KeyValue.Builder builder9 = (this.bitField0_ & 1024) == 1024 ? this.probabilityOfRainfall_.toBuilder() : null;
                                CommonProtos.KeyValue keyValue7 = (CommonProtos.KeyValue) codedInputStream.readMessage(CommonProtos.KeyValue.PARSER, extensionRegistryLite);
                                this.probabilityOfRainfall_ = keyValue7;
                                if (builder9 != null) {
                                    builder9.mergeFrom(keyValue7);
                                    this.probabilityOfRainfall_ = builder9.buildPartial();
                                }
                                this.bitField0_ |= i7;
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

        public static Builder newBuilder(WeatherLatest weatherLatest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weatherLatest);
        }

        public static WeatherLatest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherLatest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherLatest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WeatherLatest parseFrom(CodedInputStream codedInputStream) {
            return (WeatherLatest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WeatherLatest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WeatherLatest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherLatest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherLatest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WeatherLatest parseFrom(InputStream inputStream) {
            return (WeatherLatest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WeatherLatest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherLatest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherLatest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WeatherLatest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WeatherLatest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WeatherLatest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WeatherLatestOrBuilder extends MessageOrBuilder {
        Alerts.List getAlertsList();

        Alerts.ListOrBuilder getAlertsListOrBuilder();

        CommonProtos.KeyValue getAqi();

        CommonProtos.KeyValueOrBuilder getAqiOrBuilder();

        CommonProtos.KeyValue getHumidity();

        CommonProtos.KeyValueOrBuilder getHumidityOrBuilder();

        WeatherId getId();

        WeatherIdOrBuilder getIdOrBuilder();

        float getPressure();

        CommonProtos.KeyValue getProbabilityOfRainfall();

        CommonProtos.KeyValueOrBuilder getProbabilityOfRainfallOrBuilder();

        CommonProtos.KeyValue getTemperature();

        CommonProtos.KeyValueOrBuilder getTemperatureOrBuilder();

        CommonProtos.KeyValue getUvindex();

        CommonProtos.KeyValueOrBuilder getUvindexOrBuilder();

        int getWeather();

        CommonProtos.KeyValue getWindInfo();

        CommonProtos.KeyValueOrBuilder getWindInfoOrBuilder();

        CommonProtos.KeyValue getWindSpeed();

        CommonProtos.KeyValueOrBuilder getWindSpeedOrBuilder();

        boolean hasAlertsList();

        boolean hasAqi();

        boolean hasHumidity();

        boolean hasId();

        boolean hasPressure();

        boolean hasProbabilityOfRainfall();

        boolean hasTemperature();

        boolean hasUvindex();

        boolean hasWeather();

        boolean hasWindInfo();

        boolean hasWindSpeed();
    }

    public interface WeatherOrBuilder extends MessageOrBuilder {
        WeatherForecast getForecast();

        WeatherForecastOrBuilder getForecastOrBuilder();

        WeatherHourForecast getHourforecast();

        WeatherHourForecastOrBuilder getHourforecastOrBuilder();

        WeatherLatest getLatest();

        WeatherLatestOrBuilder getLatestOrBuilder();

        Weather.PayloadCase getPayloadCase();

        float getPressure();

        boolean hasForecast();

        boolean hasHourforecast();

        boolean hasLatest();

        boolean hasPressure();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012wear_weather.proto\u001a\fnanopb.proto\u001a\u0011wear_common.proto\"\u008c\u0002\n\u0007Weather\u0012 \n\u0006latest\u0018\u0001 \u0001(\u000b2\u000e.WeatherLatestH\u0000\u0012$\n\bforecast\u0018\u0002 \u0001(\u000b2\u0010.WeatherForecastH\u0000\u0012\u0012\n\bpressure\u0018\u0003 \u0001(\u0002H\u0000\u0012,\n\fhourforecast\u0018\u0004 \u0001(\u000b2\u0014.WeatherHourForecastH\u0000\"l\n\tWeatherID\u0012\u0012\n\u000eLATEST_WEATHER\u0010\u0000\u0012\u0012\n\u000eDAILY_FORECAST\u0010\u0001\u0012\u0013\n\u000fHOURLY_FORECAST\u0010\u0002\u0012\u0010\n\fWEAR_REQUEST\u0010\u0003\u0012\u0010\n\fSET_PRESSURE\u0010\u0004B\t\n\u0007payload\"Î\u0002\n\rWeatherLatest\u0012\u0016\n\u0002id\u0018\u0001 \u0002(\u000b2\n.WeatherId\u0012\u0016\n\u0007weather\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u001e\n\u000btemperature\u0018\u0003 \u0002(\u000b2\t.KeyValue\u0012\u001b\n\bhumidity\u0018\u0004 \u0002(\u000b2\t.KeyValue\u0012\u001c\n\twind_info\u0018\u0005 \u0002(\u000b2\t.KeyValue\u0012\u001a\n\u0007uvindex\u0018\u0006 \u0002(\u000b2\t.KeyValue\u0012\u0016\n\u0003aqi\u0018\u0007 \u0002(\u000b2\t.KeyValue\u0012!\n\u000balerts_list\u0018\b \u0002(\u000b2\f.Alerts.List\u0012\u0010\n\bpressure\u0018\t \u0001(\u0002\u0012\u001d\n\nWind_speed\u0018\n \u0001(\u000b2\t.KeyValue\u0012*\n\u0017Probability_of_rainfall\u0018\u000b \u0001(\u000b2\t.KeyValue\"ª\u0003\n\u000fWeatherForecast\u0012\u0016\n\u0002id\u0018\u0001 \u0002(\u000b2\n.WeatherId\u0012-\n\tdata_list\u0018\u0002 \u0002(\u000b2\u001a.WeatherForecast.Data.List\u001aÏ\u0002\n\u0004Data\u0012\u0016\n\u0003aqi\u0018\u0001 \u0001(\u000b2\t.KeyValue\u0012\u000f\n\u0007weather\u0018\u0002 \u0001(\r\u0012 \n\u000btemperature\u0018\u0003 \u0001(\u000b2\u000b.RangeValue\u0012\u001f\n\u0010temperature_unit\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012!\n\fsun_rise_set\u0018\u0005 \u0001(\u000b2\u000b.SunRiseSet\u0012\u001b\n\bhumidity\u0018\u0006 \u0001(\u000b2\t.KeyValue\u0012*\n\u0017Probability_of_rainfall\u0018\u0007 \u0001(\u000b2\t.KeyValue\u0012\u001c\n\twind_info\u0018\b \u0001(\u000b2\t.KeyValue\u0012\u001d\n\nWind_speed\u0018\t \u0001(\u000b2\t.KeyValue\u001a2\n\u0004List\u0012*\n\u0004list\u0018\u0001 \u0003(\u000b2\u0015.WeatherForecast.DataB\u0005\u0092?\u0002\u0018\u0004\"ü\u0001\n\u0013WeatherHourForecast\u00121\n\tdata_list\u0018\u0001 \u0002(\u000b2\u001e.WeatherHourForecast.Data.List\u001a±\u0001\n\u0004Data\u0012\u0016\n\u0007weather\u0018\u0001 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012 \n\u000btemperature\u0018\u0002 \u0001(\u000b2\u000b.RangeValue\u0012\u001f\n\u0010temperature_unit\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0003aqi\u0018\u0004 \u0001(\u000b2\t.KeyValue\u001a6\n\u0004List\u0012.\n\u0004list\u0018\u0001 \u0003(\u000b2\u0019.WeatherHourForecast.DataB\u0005\u0092?\u0002\u0018\u0004\"t\n\tWeatherId\u0012\u0017\n\bpub_time\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tcity_name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rlocation_name\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u000epub_time_stamp\u0018\u0004 \u0001(\r\"\u0086\u0001\n\u0006Alerts\u0012\u0013\n\u0004type\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005level\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005title\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\u0006detail\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u001a$\n\u0004List\u0012\u001c\n\u0004list\u0018\u0001 \u0003(\u000b2\u0007.AlertsB\u0005\u0092?\u0002\u0018\u0004\"=\n\nSunRiseSet\u0012\u0017\n\bsun_rise\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0007sun_set\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004B%\n\u0014com.zh.wear.protobufB\rWeatherProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.WeatherProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = WeatherProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Weather_descriptor = descriptor2;
        internal_static_Weather_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Latest", "Forecast", "Pressure", "Hourforecast", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_WeatherLatest_descriptor = descriptor3;
        internal_static_WeatherLatest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Id", "Weather", "Temperature", "Humidity", "WindInfo", "Uvindex", "Aqi", "AlertsList", "Pressure", "WindSpeed", "ProbabilityOfRainfall"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_WeatherForecast_descriptor = descriptor4;
        internal_static_WeatherForecast_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Id", "DataList"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_WeatherForecast_Data_descriptor = descriptor5;
        internal_static_WeatherForecast_Data_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Aqi", "Weather", "Temperature", "TemperatureUnit", "SunRiseSet", "Humidity", "ProbabilityOfRainfall", "WindInfo", "WindSpeed"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_WeatherForecast_Data_List_descriptor = descriptor6;
        internal_static_WeatherForecast_Data_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(3);
        internal_static_WeatherHourForecast_descriptor = descriptor7;
        internal_static_WeatherHourForecast_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"DataList"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_WeatherHourForecast_Data_descriptor = descriptor8;
        internal_static_WeatherHourForecast_Data_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Weather", "Temperature", "TemperatureUnit", "Aqi"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_WeatherHourForecast_Data_List_descriptor = descriptor9;
        internal_static_WeatherHourForecast_Data_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(4);
        internal_static_WeatherId_descriptor = descriptor10;
        internal_static_WeatherId_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"PubTime", "CityName", "LocationName", "PubTimeStamp"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(5);
        internal_static_Alerts_descriptor = descriptor11;
        internal_static_Alerts_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Type", "Level", "Title", "Detail"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_Alerts_List_descriptor = descriptor12;
        internal_static_Alerts_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(6);
        internal_static_SunRiseSet_descriptor = descriptor13;
        internal_static_SunRiseSet_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"SunRise", "SunSet"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
    }

    private WeatherProtos() {
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