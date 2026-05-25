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
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import com.zh.ble.wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class WeatherProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEForecastWeather_SEData_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEForecastWeather_SEData_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEForecastWeather_SEData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEForecastWeather_SEData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEForecastWeather_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEForecastWeather_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEHourlyWeather_SEData_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEHourlyWeather_SEData_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEHourlyWeather_SEData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEHourlyWeather_SEData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEHourlyWeather_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEHourlyWeather_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWeatherId_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWeatherId_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWeather_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWeather_fieldAccessorTable;

    public static final class SEForecastWeather extends GeneratedMessage implements SEForecastWeatherOrBuilder {
        public static final int DATA_LIST_FIELD_NUMBER = 2;
        private static final SEForecastWeather DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SEForecastWeather> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEData.SEList dataList_;
        private SEWeatherId id_;
        private byte memoizedIsInitialized;

        public static final class SEData extends GeneratedMessage implements SEDataOrBuilder {
            public static final int AQI_FIELD_NUMBER = 5;
            private static final SEData DEFAULT_INSTANCE;
            public static final int HIGH_TEMPERATURE_FIELD_NUMBER = 3;
            public static final int HUMIDITY_FIELD_NUMBER = 4;
            public static final int LOW_TEMPERATURE_FIELD_NUMBER = 2;
            public static final int NOW_TEMPERATURE_FIELD_NUMBER = 1;
            private static final Parser<SEData> PARSER;
            public static final int PM_ULTRAVIOLET_RAYS_FIELD_NUMBER = 14;
            public static final int PROBABILITY_OF_RAINFALL_FIELD_NUMBER = 10;
            public static final int SUN_RISE_FIELD_NUMBER = 11;
            public static final int SUN_SET_FIELD_NUMBER = 12;
            public static final int ULTRAVIOLET_RAYS_FIELD_NUMBER = 13;
            public static final int VISIBILITY_FIELD_NUMBER = 16;
            public static final int WEATHER_ID_FIELD_NUMBER = 6;
            public static final int WEATHER_NAME_FIELD_NUMBER = 7;
            public static final int WIND_INFO_FIELD_NUMBER = 9;
            public static final int WIND_POWER_FIELD_NUMBER = 15;
            public static final int WIND_SPEED_FIELD_NUMBER = 8;
            private static final long serialVersionUID = 0;
            private int aqi_;
            private int bitField0_;
            private int highTemperature_;
            private int humidity_;
            private int lowTemperature_;
            private byte memoizedIsInitialized;
            private int nowTemperature_;
            private int pmUltravioletRays_;
            private int probabilityOfRainfall_;
            private volatile Object sunRise_;
            private volatile Object sunSet_;
            private int ultravioletRays_;
            private int visibility_;
            private int weatherId_;
            private volatile Object weatherName_;
            private int windInfo_;
            private int windPower_;
            private int windSpeed_;

            public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
                private static final SEList DEFAULT_INSTANCE;
                public static final int LIST_FIELD_NUMBER = 1;
                private static final Parser<SEList> PARSER;
                private static final long serialVersionUID = 0;
                private List<SEData> list_;
                private byte memoizedIsInitialized;

                static {
                    RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                    DEFAULT_INSTANCE = new SEList();
                    PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEList.1
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
                    return WeatherProtos.internal_static_SEForecastWeather_SEData_SEList_descriptor;
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
                    return WeatherProtos.internal_static_SEForecastWeather_SEData_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                public SEData getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                public List<SEData> getListList() {
                    return this.list_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                public SEDataOrBuilder getListOrBuilder(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                public List<? extends SEDataOrBuilder> getListOrBuilderList() {
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
                    return WeatherProtos.internal_static_SEForecastWeather_SEData_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                        codedOutputStream.writeMessage(1, this.list_.get(i7));
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEListOrBuilder {
                    private int bitField0_;
                    private RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> listBuilder_;
                    private List<SEData> list_;

                    private void buildPartial0(SEList sEList) {
                    }

                    private void buildPartialRepeatedFields(SEList sEList) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        return WeatherProtos.internal_static_SEForecastWeather_SEData_SEList_descriptor;
                    }

                    private RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> internalGetListFieldBuilder() {
                        if (this.listBuilder_ == null) {
                            this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.list_ = null;
                        }
                        return this.listBuilder_;
                    }

                    public Builder addAllList(Iterable<? extends SEData> iterable) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.addAllMessages(iterable);
                            return this;
                        }
                        ensureListIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                        onChanged();
                        return this;
                    }

                    public Builder addList(SEData sEData) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.addMessage(sEData);
                            return this;
                        }
                        sEData.getClass();
                        ensureListIsMutable();
                        this.list_.add(sEData);
                        onChanged();
                        return this;
                    }

                    public Builder addListBuilder() {
                        return (Builder) internalGetListFieldBuilder().addBuilder(SEData.getDefaultInstance());
                    }

                    public Builder clearList() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        return WeatherProtos.internal_static_SEForecastWeather_SEData_SEList_descriptor;
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                    public SEData getList(int i7) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEData) repeatedFieldBuilder.getMessage(i7);
                    }

                    public Builder getListBuilder(int i7) {
                        return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                    }

                    public List<Builder> getListBuilderList() {
                        return internalGetListFieldBuilder().getBuilderList();
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                    public int getListCount() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                    public List<SEData> getListList() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                    public SEDataOrBuilder getListOrBuilder(int i7) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEDataOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.SEListOrBuilder
                    public List<? extends SEDataOrBuilder> getListOrBuilderList() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                        return WeatherProtos.internal_static_SEForecastWeather_SEData_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder removeList(int i7) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.remove(i7);
                            return this;
                        }
                        ensureListIsMutable();
                        this.list_.remove(i7);
                        onChanged();
                        return this;
                    }

                    public Builder setList(int i7, SEData sEData) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.setMessage(i7, sEData);
                            return this;
                        }
                        sEData.getClass();
                        ensureListIsMutable();
                        this.list_.set(i7, sEData);
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
                        return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEData.getDefaultInstance());
                    }

                    private Builder(AbstractMessage.BuilderParent builderParent) {
                        super(builderParent);
                        this.list_ = Collections.EMPTY_LIST;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.bitField0_ = 0;
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder == null) {
                            this.list_ = Collections.EMPTY_LIST;
                        } else {
                            this.list_ = null;
                            repeatedFieldBuilder.clear();
                        }
                        this.bitField0_ &= -2;
                        return this;
                    }

                    public Builder addList(int i7, SEData sEData) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder == null) {
                            sEData.getClass();
                            ensureListIsMutable();
                            this.list_.add(i7, sEData);
                            onChanged();
                            return this;
                        }
                        repeatedFieldBuilder.addMessage(i7, sEData);
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
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                            SEData sEData = (SEData) codedInputStream.readMessage(SEData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                            if (repeatedFieldBuilder == null) {
                                                ensureListIsMutable();
                                                this.list_.add(sEData);
                                            } else {
                                                repeatedFieldBuilder.addMessage(sEData);
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
                SEData getList(int i7);

                int getListCount();

                List<SEData> getListList();

                SEDataOrBuilder getListOrBuilder(int i7);

                List<? extends SEDataOrBuilder> getListOrBuilderList();
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEData");
                DEFAULT_INSTANCE = new SEData();
                PARSER = new AbstractParser<SEData>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEData.1
                    @Override // com.google.protobuf.Parser
                    public SEData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = SEData.newBuilder();
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

            public static SEData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_SEForecastWeather_SEData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SEData parseDelimitedFrom(InputStream inputStream) {
                return (SEData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SEData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SEData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SEData)) {
                    return super.equals(obj);
                }
                SEData sEData = (SEData) obj;
                if (hasNowTemperature() != sEData.hasNowTemperature()) {
                    return false;
                }
                if ((hasNowTemperature() && getNowTemperature() != sEData.getNowTemperature()) || hasLowTemperature() != sEData.hasLowTemperature()) {
                    return false;
                }
                if ((hasLowTemperature() && getLowTemperature() != sEData.getLowTemperature()) || hasHighTemperature() != sEData.hasHighTemperature()) {
                    return false;
                }
                if ((hasHighTemperature() && getHighTemperature() != sEData.getHighTemperature()) || hasHumidity() != sEData.hasHumidity()) {
                    return false;
                }
                if ((hasHumidity() && getHumidity() != sEData.getHumidity()) || hasAqi() != sEData.hasAqi()) {
                    return false;
                }
                if ((hasAqi() && getAqi() != sEData.getAqi()) || hasWeatherId() != sEData.hasWeatherId()) {
                    return false;
                }
                if ((hasWeatherId() && getWeatherId() != sEData.getWeatherId()) || hasWeatherName() != sEData.hasWeatherName()) {
                    return false;
                }
                if ((hasWeatherName() && !getWeatherName().equals(sEData.getWeatherName())) || hasWindSpeed() != sEData.hasWindSpeed()) {
                    return false;
                }
                if ((hasWindSpeed() && getWindSpeed() != sEData.getWindSpeed()) || hasWindInfo() != sEData.hasWindInfo()) {
                    return false;
                }
                if ((hasWindInfo() && getWindInfo() != sEData.getWindInfo()) || hasProbabilityOfRainfall() != sEData.hasProbabilityOfRainfall()) {
                    return false;
                }
                if ((hasProbabilityOfRainfall() && getProbabilityOfRainfall() != sEData.getProbabilityOfRainfall()) || hasSunRise() != sEData.hasSunRise()) {
                    return false;
                }
                if ((hasSunRise() && !getSunRise().equals(sEData.getSunRise())) || hasSunSet() != sEData.hasSunSet()) {
                    return false;
                }
                if ((hasSunSet() && !getSunSet().equals(sEData.getSunSet())) || hasUltravioletRays() != sEData.hasUltravioletRays()) {
                    return false;
                }
                if ((hasUltravioletRays() && getUltravioletRays() != sEData.getUltravioletRays()) || hasPmUltravioletRays() != sEData.hasPmUltravioletRays()) {
                    return false;
                }
                if ((hasPmUltravioletRays() && getPmUltravioletRays() != sEData.getPmUltravioletRays()) || hasWindPower() != sEData.hasWindPower()) {
                    return false;
                }
                if ((!hasWindPower() || getWindPower() == sEData.getWindPower()) && hasVisibility() == sEData.hasVisibility()) {
                    return (!hasVisibility() || getVisibility() == sEData.getVisibility()) && getUnknownFields().equals(sEData.getUnknownFields());
                }
                return false;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getAqi() {
                return this.aqi_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_SEForecastWeather_SEData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getHighTemperature() {
                return this.highTemperature_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getHumidity() {
                return this.humidity_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getLowTemperature() {
                return this.lowTemperature_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getNowTemperature() {
                return this.nowTemperature_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SEData> getParserForType() {
                return PARSER;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getPmUltravioletRays() {
                return this.pmUltravioletRays_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getProbabilityOfRainfall() {
                return this.probabilityOfRainfall_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.nowTemperature_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.lowTemperature_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(3, this.highTemperature_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(4, this.humidity_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(5, this.aqi_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(6, this.weatherId_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    iComputeInt32Size += GeneratedMessage.computeStringSize(7, this.weatherName_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(8, this.windSpeed_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(9, this.windInfo_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(10, this.probabilityOfRainfall_);
                }
                if ((this.bitField0_ & 1024) != 0) {
                    iComputeInt32Size += GeneratedMessage.computeStringSize(11, this.sunRise_);
                }
                if ((this.bitField0_ & 2048) != 0) {
                    iComputeInt32Size += GeneratedMessage.computeStringSize(12, this.sunSet_);
                }
                if ((this.bitField0_ & 4096) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(13, this.ultravioletRays_);
                }
                if ((this.bitField0_ & 8192) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(14, this.pmUltravioletRays_);
                }
                if ((this.bitField0_ & 16384) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(15, this.windPower_);
                }
                if ((this.bitField0_ & 32768) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(16, this.visibility_);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public ByteString getSunRiseBytes() {
                Object obj = this.sunRise_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sunRise_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public ByteString getSunSetBytes() {
                Object obj = this.sunSet_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sunSet_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getUltravioletRays() {
                return this.ultravioletRays_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getVisibility() {
                return this.visibility_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getWeatherId() {
                return this.weatherId_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public String getWeatherName() {
                Object obj = this.weatherName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.weatherName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public ByteString getWeatherNameBytes() {
                Object obj = this.weatherName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.weatherName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getWindInfo() {
                return this.windInfo_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getWindPower() {
                return this.windPower_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public int getWindSpeed() {
                return this.windSpeed_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasAqi() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasHighTemperature() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasHumidity() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasLowTemperature() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasNowTemperature() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasPmUltravioletRays() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasProbabilityOfRainfall() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasSunRise() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasSunSet() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasUltravioletRays() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasVisibility() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasWeatherId() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasWeatherName() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasWindInfo() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasWindPower() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
            public boolean hasWindSpeed() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasNowTemperature()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getNowTemperature();
                }
                if (hasLowTemperature()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getLowTemperature();
                }
                if (hasHighTemperature()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getHighTemperature();
                }
                if (hasHumidity()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getHumidity();
                }
                if (hasAqi()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getAqi();
                }
                if (hasWeatherId()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getWeatherId();
                }
                if (hasWeatherName()) {
                    iHashCode = (((iHashCode * 37) + 7) * 53) + getWeatherName().hashCode();
                }
                if (hasWindSpeed()) {
                    iHashCode = (((iHashCode * 37) + 8) * 53) + getWindSpeed();
                }
                if (hasWindInfo()) {
                    iHashCode = (((iHashCode * 37) + 9) * 53) + getWindInfo();
                }
                if (hasProbabilityOfRainfall()) {
                    iHashCode = (((iHashCode * 37) + 10) * 53) + getProbabilityOfRainfall();
                }
                if (hasSunRise()) {
                    iHashCode = (((iHashCode * 37) + 11) * 53) + getSunRise().hashCode();
                }
                if (hasSunSet()) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getSunSet().hashCode();
                }
                if (hasUltravioletRays()) {
                    iHashCode = (((iHashCode * 37) + 13) * 53) + getUltravioletRays();
                }
                if (hasPmUltravioletRays()) {
                    iHashCode = (((iHashCode * 37) + 14) * 53) + getPmUltravioletRays();
                }
                if (hasWindPower()) {
                    iHashCode = (((iHashCode * 37) + 15) * 53) + getWindPower();
                }
                if (hasVisibility()) {
                    iHashCode = (((iHashCode * 37) + 16) * 53) + getVisibility();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_SEForecastWeather_SEData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEData.class, Builder.class);
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
                    codedOutputStream.writeInt32(1, this.nowTemperature_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeInt32(2, this.lowTemperature_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeInt32(3, this.highTemperature_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeUInt32(4, this.humidity_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeUInt32(5, this.aqi_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    codedOutputStream.writeUInt32(6, this.weatherId_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 7, this.weatherName_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    codedOutputStream.writeUInt32(8, this.windSpeed_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    codedOutputStream.writeUInt32(9, this.windInfo_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    codedOutputStream.writeUInt32(10, this.probabilityOfRainfall_);
                }
                if ((this.bitField0_ & 1024) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 11, this.sunRise_);
                }
                if ((this.bitField0_ & 2048) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 12, this.sunSet_);
                }
                if ((this.bitField0_ & 4096) != 0) {
                    codedOutputStream.writeUInt32(13, this.ultravioletRays_);
                }
                if ((this.bitField0_ & 8192) != 0) {
                    codedOutputStream.writeUInt32(14, this.pmUltravioletRays_);
                }
                if ((this.bitField0_ & 16384) != 0) {
                    codedOutputStream.writeUInt32(15, this.windPower_);
                }
                if ((this.bitField0_ & 32768) != 0) {
                    codedOutputStream.writeUInt32(16, this.visibility_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDataOrBuilder {
                private int aqi_;
                private int bitField0_;
                private int highTemperature_;
                private int humidity_;
                private int lowTemperature_;
                private int nowTemperature_;
                private int pmUltravioletRays_;
                private int probabilityOfRainfall_;
                private Object sunRise_;
                private Object sunSet_;
                private int ultravioletRays_;
                private int visibility_;
                private int weatherId_;
                private Object weatherName_;
                private int windInfo_;
                private int windPower_;
                private int windSpeed_;

                private void buildPartial0(SEData sEData) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        sEData.nowTemperature_ = this.nowTemperature_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        sEData.lowTemperature_ = this.lowTemperature_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        sEData.highTemperature_ = this.highTemperature_;
                        i7 |= 4;
                    }
                    if ((i8 & 8) != 0) {
                        sEData.humidity_ = this.humidity_;
                        i7 |= 8;
                    }
                    if ((i8 & 16) != 0) {
                        sEData.aqi_ = this.aqi_;
                        i7 |= 16;
                    }
                    if ((i8 & 32) != 0) {
                        sEData.weatherId_ = this.weatherId_;
                        i7 |= 32;
                    }
                    if ((i8 & 64) != 0) {
                        sEData.weatherName_ = this.weatherName_;
                        i7 |= 64;
                    }
                    if ((i8 & 128) != 0) {
                        sEData.windSpeed_ = this.windSpeed_;
                        i7 |= 128;
                    }
                    if ((i8 & 256) != 0) {
                        sEData.windInfo_ = this.windInfo_;
                        i7 |= 256;
                    }
                    if ((i8 & 512) != 0) {
                        sEData.probabilityOfRainfall_ = this.probabilityOfRainfall_;
                        i7 |= 512;
                    }
                    if ((i8 & 1024) != 0) {
                        sEData.sunRise_ = this.sunRise_;
                        i7 |= 1024;
                    }
                    if ((i8 & 2048) != 0) {
                        sEData.sunSet_ = this.sunSet_;
                        i7 |= 2048;
                    }
                    if ((i8 & 4096) != 0) {
                        sEData.ultravioletRays_ = this.ultravioletRays_;
                        i7 |= 4096;
                    }
                    if ((i8 & 8192) != 0) {
                        sEData.pmUltravioletRays_ = this.pmUltravioletRays_;
                        i7 |= 8192;
                    }
                    if ((i8 & 16384) != 0) {
                        sEData.windPower_ = this.windPower_;
                        i7 |= 16384;
                    }
                    if ((i8 & 32768) != 0) {
                        sEData.visibility_ = this.visibility_;
                        i7 |= 32768;
                    }
                    sEData.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProtos.internal_static_SEForecastWeather_SEData_descriptor;
                }

                public Builder clearAqi() {
                    this.bitField0_ &= -17;
                    this.aqi_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearHighTemperature() {
                    this.bitField0_ &= -5;
                    this.highTemperature_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearHumidity() {
                    this.bitField0_ &= -9;
                    this.humidity_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLowTemperature() {
                    this.bitField0_ &= -3;
                    this.lowTemperature_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearNowTemperature() {
                    this.bitField0_ &= -2;
                    this.nowTemperature_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearPmUltravioletRays() {
                    this.bitField0_ &= -8193;
                    this.pmUltravioletRays_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProbabilityOfRainfall() {
                    this.bitField0_ &= -513;
                    this.probabilityOfRainfall_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearSunRise() {
                    this.sunRise_ = SEData.getDefaultInstance().getSunRise();
                    this.bitField0_ &= -1025;
                    onChanged();
                    return this;
                }

                public Builder clearSunSet() {
                    this.sunSet_ = SEData.getDefaultInstance().getSunSet();
                    this.bitField0_ &= -2049;
                    onChanged();
                    return this;
                }

                public Builder clearUltravioletRays() {
                    this.bitField0_ &= -4097;
                    this.ultravioletRays_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearVisibility() {
                    this.bitField0_ &= -32769;
                    this.visibility_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWeatherId() {
                    this.bitField0_ &= -33;
                    this.weatherId_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWeatherName() {
                    this.weatherName_ = SEData.getDefaultInstance().getWeatherName();
                    this.bitField0_ &= -65;
                    onChanged();
                    return this;
                }

                public Builder clearWindInfo() {
                    this.bitField0_ &= -257;
                    this.windInfo_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWindPower() {
                    this.bitField0_ &= -16385;
                    this.windPower_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWindSpeed() {
                    this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                    this.windSpeed_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getAqi() {
                    return this.aqi_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WeatherProtos.internal_static_SEForecastWeather_SEData_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getHighTemperature() {
                    return this.highTemperature_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getHumidity() {
                    return this.humidity_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getLowTemperature() {
                    return this.lowTemperature_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getNowTemperature() {
                    return this.nowTemperature_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getPmUltravioletRays() {
                    return this.pmUltravioletRays_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getProbabilityOfRainfall() {
                    return this.probabilityOfRainfall_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
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

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public ByteString getSunRiseBytes() {
                    Object obj = this.sunRise_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.sunRise_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
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

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public ByteString getSunSetBytes() {
                    Object obj = this.sunSet_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.sunSet_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getUltravioletRays() {
                    return this.ultravioletRays_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getVisibility() {
                    return this.visibility_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getWeatherId() {
                    return this.weatherId_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public String getWeatherName() {
                    Object obj = this.weatherName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.weatherName_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public ByteString getWeatherNameBytes() {
                    Object obj = this.weatherName_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.weatherName_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getWindInfo() {
                    return this.windInfo_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getWindPower() {
                    return this.windPower_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public int getWindSpeed() {
                    return this.windSpeed_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasAqi() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasHighTemperature() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasHumidity() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasLowTemperature() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasNowTemperature() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasPmUltravioletRays() {
                    return (this.bitField0_ & 8192) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasProbabilityOfRainfall() {
                    return (this.bitField0_ & 512) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasSunRise() {
                    return (this.bitField0_ & 1024) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasSunSet() {
                    return (this.bitField0_ & 2048) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasUltravioletRays() {
                    return (this.bitField0_ & 4096) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasVisibility() {
                    return (this.bitField0_ & 32768) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasWeatherId() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasWeatherName() {
                    return (this.bitField0_ & 64) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasWindInfo() {
                    return (this.bitField0_ & 256) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasWindPower() {
                    return (this.bitField0_ & 16384) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.SEDataOrBuilder
                public boolean hasWindSpeed() {
                    return (this.bitField0_ & 128) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProtos.internal_static_SEForecastWeather_SEData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEData.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setAqi(int i7) {
                    this.aqi_ = i7;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setHighTemperature(int i7) {
                    this.highTemperature_ = i7;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setHumidity(int i7) {
                    this.humidity_ = i7;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setLowTemperature(int i7) {
                    this.lowTemperature_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setNowTemperature(int i7) {
                    this.nowTemperature_ = i7;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setPmUltravioletRays(int i7) {
                    this.pmUltravioletRays_ = i7;
                    this.bitField0_ |= 8192;
                    onChanged();
                    return this;
                }

                public Builder setProbabilityOfRainfall(int i7) {
                    this.probabilityOfRainfall_ = i7;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                public Builder setSunRise(String str) {
                    str.getClass();
                    this.sunRise_ = str;
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setSunRiseBytes(ByteString byteString) {
                    byteString.getClass();
                    this.sunRise_ = byteString;
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setSunSet(String str) {
                    str.getClass();
                    this.sunSet_ = str;
                    this.bitField0_ |= 2048;
                    onChanged();
                    return this;
                }

                public Builder setSunSetBytes(ByteString byteString) {
                    byteString.getClass();
                    this.sunSet_ = byteString;
                    this.bitField0_ |= 2048;
                    onChanged();
                    return this;
                }

                public Builder setUltravioletRays(int i7) {
                    this.ultravioletRays_ = i7;
                    this.bitField0_ |= 4096;
                    onChanged();
                    return this;
                }

                public Builder setVisibility(int i7) {
                    this.visibility_ = i7;
                    this.bitField0_ |= 32768;
                    onChanged();
                    return this;
                }

                public Builder setWeatherId(int i7) {
                    this.weatherId_ = i7;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setWeatherName(String str) {
                    str.getClass();
                    this.weatherName_ = str;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setWeatherNameBytes(ByteString byteString) {
                    byteString.getClass();
                    this.weatherName_ = byteString;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setWindInfo(int i7) {
                    this.windInfo_ = i7;
                    this.bitField0_ |= 256;
                    onChanged();
                    return this;
                }

                public Builder setWindPower(int i7) {
                    this.windPower_ = i7;
                    this.bitField0_ |= 16384;
                    onChanged();
                    return this;
                }

                public Builder setWindSpeed(int i7) {
                    this.windSpeed_ = i7;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.weatherName_ = "";
                    this.sunRise_ = "";
                    this.sunSet_ = "";
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEData build() {
                    SEData sEDataBuildPartial = buildPartial();
                    if (sEDataBuildPartial.isInitialized()) {
                        return sEDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEData buildPartial() {
                    SEData sEData = new SEData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sEData);
                    }
                    onBuilt();
                    return sEData;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SEData getDefaultInstanceForType() {
                    return SEData.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.nowTemperature_ = 0;
                    this.lowTemperature_ = 0;
                    this.highTemperature_ = 0;
                    this.humidity_ = 0;
                    this.aqi_ = 0;
                    this.weatherId_ = 0;
                    this.weatherName_ = "";
                    this.windSpeed_ = 0;
                    this.windInfo_ = 0;
                    this.probabilityOfRainfall_ = 0;
                    this.sunRise_ = "";
                    this.sunSet_ = "";
                    this.ultravioletRays_ = 0;
                    this.pmUltravioletRays_ = 0;
                    this.windPower_ = 0;
                    this.visibility_ = 0;
                    return this;
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.weatherName_ = "";
                    this.sunRise_ = "";
                    this.sunSet_ = "";
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SEData) {
                        return mergeFrom((SEData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SEData sEData) {
                    if (sEData == SEData.getDefaultInstance()) {
                        return this;
                    }
                    if (sEData.hasNowTemperature()) {
                        setNowTemperature(sEData.getNowTemperature());
                    }
                    if (sEData.hasLowTemperature()) {
                        setLowTemperature(sEData.getLowTemperature());
                    }
                    if (sEData.hasHighTemperature()) {
                        setHighTemperature(sEData.getHighTemperature());
                    }
                    if (sEData.hasHumidity()) {
                        setHumidity(sEData.getHumidity());
                    }
                    if (sEData.hasAqi()) {
                        setAqi(sEData.getAqi());
                    }
                    if (sEData.hasWeatherId()) {
                        setWeatherId(sEData.getWeatherId());
                    }
                    if (sEData.hasWeatherName()) {
                        this.weatherName_ = sEData.weatherName_;
                        this.bitField0_ |= 64;
                        onChanged();
                    }
                    if (sEData.hasWindSpeed()) {
                        setWindSpeed(sEData.getWindSpeed());
                    }
                    if (sEData.hasWindInfo()) {
                        setWindInfo(sEData.getWindInfo());
                    }
                    if (sEData.hasProbabilityOfRainfall()) {
                        setProbabilityOfRainfall(sEData.getProbabilityOfRainfall());
                    }
                    if (sEData.hasSunRise()) {
                        this.sunRise_ = sEData.sunRise_;
                        this.bitField0_ |= 1024;
                        onChanged();
                    }
                    if (sEData.hasSunSet()) {
                        this.sunSet_ = sEData.sunSet_;
                        this.bitField0_ |= 2048;
                        onChanged();
                    }
                    if (sEData.hasUltravioletRays()) {
                        setUltravioletRays(sEData.getUltravioletRays());
                    }
                    if (sEData.hasPmUltravioletRays()) {
                        setPmUltravioletRays(sEData.getPmUltravioletRays());
                    }
                    if (sEData.hasWindPower()) {
                        setWindPower(sEData.getWindPower());
                    }
                    if (sEData.hasVisibility()) {
                        setVisibility(sEData.getVisibility());
                    }
                    mergeUnknownFields(sEData.getUnknownFields());
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
                                        this.nowTemperature_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                        break;
                                    case 16:
                                        this.lowTemperature_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 2;
                                        break;
                                    case 24:
                                        this.highTemperature_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 4;
                                        break;
                                    case 32:
                                        this.humidity_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 8;
                                        break;
                                    case 40:
                                        this.aqi_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 16;
                                        break;
                                    case 48:
                                        this.weatherId_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 32;
                                        break;
                                    case 58:
                                        this.weatherName_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 64;
                                        break;
                                    case 64:
                                        this.windSpeed_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 128;
                                        break;
                                    case 72:
                                        this.windInfo_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 256;
                                        break;
                                    case 80:
                                        this.probabilityOfRainfall_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 512;
                                        break;
                                    case 90:
                                        this.sunRise_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1024;
                                        break;
                                    case 98:
                                        this.sunSet_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 2048;
                                        break;
                                    case 104:
                                        this.ultravioletRays_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 4096;
                                        break;
                                    case 112:
                                        this.pmUltravioletRays_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 8192;
                                        break;
                                    case 120:
                                        this.windPower_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 16384;
                                        break;
                                    case 128:
                                        this.visibility_ = codedInputStream.readUInt32();
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

            private SEData(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.nowTemperature_ = 0;
                this.lowTemperature_ = 0;
                this.highTemperature_ = 0;
                this.humidity_ = 0;
                this.aqi_ = 0;
                this.weatherId_ = 0;
                this.weatherName_ = "";
                this.windSpeed_ = 0;
                this.windInfo_ = 0;
                this.probabilityOfRainfall_ = 0;
                this.sunRise_ = "";
                this.sunSet_ = "";
                this.ultravioletRays_ = 0;
                this.pmUltravioletRays_ = 0;
                this.windPower_ = 0;
                this.visibility_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEData sEData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEData);
            }

            public static SEData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SEData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SEData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static SEData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static SEData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SEData parseFrom(InputStream inputStream) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static SEData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEData parseFrom(CodedInputStream codedInputStream) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static SEData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private SEData() {
                this.nowTemperature_ = 0;
                this.lowTemperature_ = 0;
                this.highTemperature_ = 0;
                this.humidity_ = 0;
                this.aqi_ = 0;
                this.weatherId_ = 0;
                this.weatherName_ = "";
                this.windSpeed_ = 0;
                this.windInfo_ = 0;
                this.probabilityOfRainfall_ = 0;
                this.sunRise_ = "";
                this.sunSet_ = "";
                this.ultravioletRays_ = 0;
                this.pmUltravioletRays_ = 0;
                this.windPower_ = 0;
                this.visibility_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.weatherName_ = "";
                this.sunRise_ = "";
                this.sunSet_ = "";
            }
        }

        public interface SEDataOrBuilder extends MessageOrBuilder {
            int getAqi();

            int getHighTemperature();

            int getHumidity();

            int getLowTemperature();

            int getNowTemperature();

            int getPmUltravioletRays();

            int getProbabilityOfRainfall();

            String getSunRise();

            ByteString getSunRiseBytes();

            String getSunSet();

            ByteString getSunSetBytes();

            int getUltravioletRays();

            int getVisibility();

            int getWeatherId();

            String getWeatherName();

            ByteString getWeatherNameBytes();

            int getWindInfo();

            int getWindPower();

            int getWindSpeed();

            boolean hasAqi();

            boolean hasHighTemperature();

            boolean hasHumidity();

            boolean hasLowTemperature();

            boolean hasNowTemperature();

            boolean hasPmUltravioletRays();

            boolean hasProbabilityOfRainfall();

            boolean hasSunRise();

            boolean hasSunSet();

            boolean hasUltravioletRays();

            boolean hasVisibility();

            boolean hasWeatherId();

            boolean hasWeatherName();

            boolean hasWindInfo();

            boolean hasWindPower();

            boolean hasWindSpeed();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEForecastWeather");
            DEFAULT_INSTANCE = new SEForecastWeather();
            PARSER = new AbstractParser<SEForecastWeather>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeather.1
                @Override // com.google.protobuf.Parser
                public SEForecastWeather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEForecastWeather.newBuilder();
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

        public static SEForecastWeather getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_SEForecastWeather_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEForecastWeather parseDelimitedFrom(InputStream inputStream) {
            return (SEForecastWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEForecastWeather parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEForecastWeather> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEForecastWeather)) {
                return super.equals(obj);
            }
            SEForecastWeather sEForecastWeather = (SEForecastWeather) obj;
            if (hasId() != sEForecastWeather.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(sEForecastWeather.getId())) && hasDataList() == sEForecastWeather.hasDataList()) {
                return (!hasDataList() || getDataList().equals(sEForecastWeather.getDataList())) && getUnknownFields().equals(sEForecastWeather.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
        public SEData.SEList getDataList() {
            SEData.SEList sEList = this.dataList_;
            return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
        public SEData.SEListOrBuilder getDataListOrBuilder() {
            SEData.SEList sEList = this.dataList_;
            return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WeatherProtos.internal_static_SEForecastWeather_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
        public SEWeatherId getId() {
            SEWeatherId sEWeatherId = this.id_;
            return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
        public SEWeatherIdOrBuilder getIdOrBuilder() {
            SEWeatherId sEWeatherId = this.id_;
            return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEForecastWeather> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getId()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDataList());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
        public boolean hasDataList() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
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
            if (hasDataList()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_SEForecastWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(SEForecastWeather.class, Builder.class);
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
            if (!hasDataList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getId().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getId());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDataList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEForecastWeatherOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> dataListBuilder_;
            private SEData.SEList dataList_;
            private SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> idBuilder_;
            private SEWeatherId id_;

            private void buildPartial0(SEForecastWeather sEForecastWeather) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                    sEForecastWeather.id_ = singleFieldBuilder == null ? this.id_ : (SEWeatherId) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder2 = this.dataListBuilder_;
                    sEForecastWeather.dataList_ = singleFieldBuilder2 == null ? this.dataList_ : (SEData.SEList) singleFieldBuilder2.build();
                    i7 |= 2;
                }
                sEForecastWeather.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_SEForecastWeather_descriptor;
            }

            private SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> internalGetDataListFieldBuilder() {
                if (this.dataListBuilder_ == null) {
                    this.dataListBuilder_ = new SingleFieldBuilder<>(getDataList(), getParentForChildren(), isClean());
                    this.dataList_ = null;
                }
                return this.dataListBuilder_;
            }

            private SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> internalGetIdFieldBuilder() {
                if (this.idBuilder_ == null) {
                    this.idBuilder_ = new SingleFieldBuilder<>(getId(), getParentForChildren(), isClean());
                    this.id_ = null;
                }
                return this.idBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetIdFieldBuilder();
                    internalGetDataListFieldBuilder();
                }
            }

            public Builder clearDataList() {
                this.bitField0_ &= -3;
                this.dataList_ = null;
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.dataListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = null;
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
            public SEData.SEList getDataList() {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEData.SEList) singleFieldBuilder.getMessage();
                }
                SEData.SEList sEList = this.dataList_;
                return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
            }

            public SEData.SEList.Builder getDataListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEData.SEList.Builder) internalGetDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
            public SEData.SEListOrBuilder getDataListOrBuilder() {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEData.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEData.SEList sEList = this.dataList_;
                return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_SEForecastWeather_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
            public SEWeatherId getId() {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWeatherId) singleFieldBuilder.getMessage();
                }
                SEWeatherId sEWeatherId = this.id_;
                return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
            }

            public SEWeatherId.Builder getIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEWeatherId.Builder) internalGetIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
            public SEWeatherIdOrBuilder getIdOrBuilder() {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWeatherIdOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWeatherId sEWeatherId = this.id_;
                return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
            public boolean hasDataList() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEForecastWeatherOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_SEForecastWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(SEForecastWeather.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasDataList() && getId().isInitialized();
            }

            public Builder mergeDataList(SEData.SEList sEList) {
                SEData.SEList sEList2;
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 2) == 0 || (sEList2 = this.dataList_) == null || sEList2 == SEData.SEList.getDefaultInstance()) {
                    this.dataList_ = sEList;
                } else {
                    getDataListBuilder().mergeFrom(sEList);
                }
                if (this.dataList_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeId(SEWeatherId sEWeatherId) {
                SEWeatherId sEWeatherId2;
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWeatherId);
                } else if ((this.bitField0_ & 1) == 0 || (sEWeatherId2 = this.id_) == null || sEWeatherId2 == SEWeatherId.getDefaultInstance()) {
                    this.id_ = sEWeatherId;
                } else {
                    getIdBuilder().mergeFrom(sEWeatherId);
                }
                if (this.id_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setDataList(SEData.SEList sEList) {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.dataList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(SEWeatherId sEWeatherId) {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    sEWeatherId.getClass();
                    this.id_ = sEWeatherId;
                } else {
                    singleFieldBuilder.setMessage(sEWeatherId);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEForecastWeather build() {
                SEForecastWeather sEForecastWeatherBuildPartial = buildPartial();
                if (sEForecastWeatherBuildPartial.isInitialized()) {
                    return sEForecastWeatherBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEForecastWeatherBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEForecastWeather buildPartial() {
                SEForecastWeather sEForecastWeather = new SEForecastWeather(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEForecastWeather);
                }
                onBuilt();
                return sEForecastWeather;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEForecastWeather getDefaultInstanceForType() {
                return SEForecastWeather.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = null;
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                this.dataList_ = null;
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder2 = this.dataListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.dataListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEForecastWeather) {
                    return mergeFrom((SEForecastWeather) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDataList(SEData.SEList.Builder builder) {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder == null) {
                    this.dataList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(SEWeatherId.Builder builder) {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    this.id_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEForecastWeather sEForecastWeather) {
                if (sEForecastWeather == SEForecastWeather.getDefaultInstance()) {
                    return this;
                }
                if (sEForecastWeather.hasId()) {
                    mergeId(sEForecastWeather.getId());
                }
                if (sEForecastWeather.hasDataList()) {
                    mergeDataList(sEForecastWeather.getDataList());
                }
                mergeUnknownFields(sEForecastWeather.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetDataListFieldBuilder().getBuilder(), extensionRegistryLite);
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

        private SEForecastWeather(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEForecastWeather sEForecastWeather) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEForecastWeather);
        }

        public static SEForecastWeather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEForecastWeather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEForecastWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEForecastWeather parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEForecastWeather getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SEForecastWeather() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEForecastWeather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEForecastWeather parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEForecastWeather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEForecastWeather parseFrom(InputStream inputStream) {
            return (SEForecastWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEForecastWeather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEForecastWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEForecastWeather parseFrom(CodedInputStream codedInputStream) {
            return (SEForecastWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEForecastWeather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEForecastWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEForecastWeatherOrBuilder extends MessageOrBuilder {
        SEForecastWeather.SEData.SEList getDataList();

        SEForecastWeather.SEData.SEListOrBuilder getDataListOrBuilder();

        SEWeatherId getId();

        SEWeatherIdOrBuilder getIdOrBuilder();

        boolean hasDataList();

        boolean hasId();
    }

    public static final class SEHourlyWeather extends GeneratedMessage implements SEHourlyWeatherOrBuilder {
        public static final int DATA_LIST_FIELD_NUMBER = 2;
        private static final SEHourlyWeather DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SEHourlyWeather> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEData.SEList dataList_;
        private SEWeatherId id_;
        private byte memoizedIsInitialized;

        public static final class SEData extends GeneratedMessage implements SEDataOrBuilder {
            private static final SEData DEFAULT_INSTANCE;
            public static final int HIGH_TEMPERATURE_FIELD_NUMBER = 3;
            public static final int HUMIDITY_FIELD_NUMBER = 4;
            public static final int LOW_TEMPERATURE_FIELD_NUMBER = 2;
            public static final int NOW_TEMPERATURE_FIELD_NUMBER = 1;
            private static final Parser<SEData> PARSER;
            public static final int PROBABILITY_OF_RAINFALL_FIELD_NUMBER = 9;
            public static final int ULTRAVIOLET_RAYS_FIELD_NUMBER = 10;
            public static final int VISIBILITY_FIELD_NUMBER = 12;
            public static final int WEATHER_ID_FIELD_NUMBER = 5;
            public static final int WEATHER_NAME_FIELD_NUMBER = 6;
            public static final int WIND_INFO_FIELD_NUMBER = 8;
            public static final int WIND_POWER_FIELD_NUMBER = 11;
            public static final int WIND_SPEED_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int highTemperature_;
            private int humidity_;
            private int lowTemperature_;
            private byte memoizedIsInitialized;
            private int nowTemperature_;
            private int probabilityOfRainfall_;
            private int ultravioletRays_;
            private int visibility_;
            private int weatherId_;
            private volatile Object weatherName_;
            private int windInfo_;
            private int windPower_;
            private int windSpeed_;

            public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
                private static final SEList DEFAULT_INSTANCE;
                public static final int LIST_FIELD_NUMBER = 1;
                private static final Parser<SEList> PARSER;
                private static final long serialVersionUID = 0;
                private List<SEData> list_;
                private byte memoizedIsInitialized;

                static {
                    RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                    DEFAULT_INSTANCE = new SEList();
                    PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEList.1
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
                    return WeatherProtos.internal_static_SEHourlyWeather_SEData_SEList_descriptor;
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
                    return WeatherProtos.internal_static_SEHourlyWeather_SEData_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                public SEData getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                public List<SEData> getListList() {
                    return this.list_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                public SEDataOrBuilder getListOrBuilder(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                public List<? extends SEDataOrBuilder> getListOrBuilderList() {
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
                    return WeatherProtos.internal_static_SEHourlyWeather_SEData_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                        codedOutputStream.writeMessage(1, this.list_.get(i7));
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEListOrBuilder {
                    private int bitField0_;
                    private RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> listBuilder_;
                    private List<SEData> list_;

                    private void buildPartial0(SEList sEList) {
                    }

                    private void buildPartialRepeatedFields(SEList sEList) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        return WeatherProtos.internal_static_SEHourlyWeather_SEData_SEList_descriptor;
                    }

                    private RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> internalGetListFieldBuilder() {
                        if (this.listBuilder_ == null) {
                            this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.list_ = null;
                        }
                        return this.listBuilder_;
                    }

                    public Builder addAllList(Iterable<? extends SEData> iterable) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.addAllMessages(iterable);
                            return this;
                        }
                        ensureListIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                        onChanged();
                        return this;
                    }

                    public Builder addList(SEData sEData) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.addMessage(sEData);
                            return this;
                        }
                        sEData.getClass();
                        ensureListIsMutable();
                        this.list_.add(sEData);
                        onChanged();
                        return this;
                    }

                    public Builder addListBuilder() {
                        return (Builder) internalGetListFieldBuilder().addBuilder(SEData.getDefaultInstance());
                    }

                    public Builder clearList() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        return WeatherProtos.internal_static_SEHourlyWeather_SEData_SEList_descriptor;
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                    public SEData getList(int i7) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEData) repeatedFieldBuilder.getMessage(i7);
                    }

                    public Builder getListBuilder(int i7) {
                        return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                    }

                    public List<Builder> getListBuilderList() {
                        return internalGetListFieldBuilder().getBuilderList();
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                    public int getListCount() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                    public List<SEData> getListList() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                    public SEDataOrBuilder getListOrBuilder(int i7) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEDataOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                    }

                    @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.SEListOrBuilder
                    public List<? extends SEDataOrBuilder> getListOrBuilderList() {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                        return WeatherProtos.internal_static_SEHourlyWeather_SEData_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder removeList(int i7) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.remove(i7);
                            return this;
                        }
                        ensureListIsMutable();
                        this.list_.remove(i7);
                        onChanged();
                        return this;
                    }

                    public Builder setList(int i7, SEData sEData) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.setMessage(i7, sEData);
                            return this;
                        }
                        sEData.getClass();
                        ensureListIsMutable();
                        this.list_.set(i7, sEData);
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
                        return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEData.getDefaultInstance());
                    }

                    private Builder(AbstractMessage.BuilderParent builderParent) {
                        super(builderParent);
                        this.list_ = Collections.EMPTY_LIST;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.bitField0_ = 0;
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder == null) {
                            this.list_ = Collections.EMPTY_LIST;
                        } else {
                            this.list_ = null;
                            repeatedFieldBuilder.clear();
                        }
                        this.bitField0_ &= -2;
                        return this;
                    }

                    public Builder addList(int i7, SEData sEData) {
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder == null) {
                            sEData.getClass();
                            ensureListIsMutable();
                            this.list_.add(i7, sEData);
                            onChanged();
                            return this;
                        }
                        repeatedFieldBuilder.addMessage(i7, sEData);
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
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                            SEData sEData = (SEData) codedInputStream.readMessage(SEData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilder<SEData, Builder, SEDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                            if (repeatedFieldBuilder == null) {
                                                ensureListIsMutable();
                                                this.list_.add(sEData);
                                            } else {
                                                repeatedFieldBuilder.addMessage(sEData);
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
                SEData getList(int i7);

                int getListCount();

                List<SEData> getListList();

                SEDataOrBuilder getListOrBuilder(int i7);

                List<? extends SEDataOrBuilder> getListOrBuilderList();
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEData");
                DEFAULT_INSTANCE = new SEData();
                PARSER = new AbstractParser<SEData>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEData.1
                    @Override // com.google.protobuf.Parser
                    public SEData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = SEData.newBuilder();
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

            public static SEData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_SEHourlyWeather_SEData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SEData parseDelimitedFrom(InputStream inputStream) {
                return (SEData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SEData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SEData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SEData)) {
                    return super.equals(obj);
                }
                SEData sEData = (SEData) obj;
                if (hasNowTemperature() != sEData.hasNowTemperature()) {
                    return false;
                }
                if ((hasNowTemperature() && getNowTemperature() != sEData.getNowTemperature()) || hasLowTemperature() != sEData.hasLowTemperature()) {
                    return false;
                }
                if ((hasLowTemperature() && getLowTemperature() != sEData.getLowTemperature()) || hasHighTemperature() != sEData.hasHighTemperature()) {
                    return false;
                }
                if ((hasHighTemperature() && getHighTemperature() != sEData.getHighTemperature()) || hasHumidity() != sEData.hasHumidity()) {
                    return false;
                }
                if ((hasHumidity() && getHumidity() != sEData.getHumidity()) || hasWeatherId() != sEData.hasWeatherId()) {
                    return false;
                }
                if ((hasWeatherId() && getWeatherId() != sEData.getWeatherId()) || hasWeatherName() != sEData.hasWeatherName()) {
                    return false;
                }
                if ((hasWeatherName() && !getWeatherName().equals(sEData.getWeatherName())) || hasWindSpeed() != sEData.hasWindSpeed()) {
                    return false;
                }
                if ((hasWindSpeed() && getWindSpeed() != sEData.getWindSpeed()) || hasWindInfo() != sEData.hasWindInfo()) {
                    return false;
                }
                if ((hasWindInfo() && getWindInfo() != sEData.getWindInfo()) || hasProbabilityOfRainfall() != sEData.hasProbabilityOfRainfall()) {
                    return false;
                }
                if ((hasProbabilityOfRainfall() && getProbabilityOfRainfall() != sEData.getProbabilityOfRainfall()) || hasUltravioletRays() != sEData.hasUltravioletRays()) {
                    return false;
                }
                if ((hasUltravioletRays() && getUltravioletRays() != sEData.getUltravioletRays()) || hasWindPower() != sEData.hasWindPower()) {
                    return false;
                }
                if ((!hasWindPower() || getWindPower() == sEData.getWindPower()) && hasVisibility() == sEData.hasVisibility()) {
                    return (!hasVisibility() || getVisibility() == sEData.getVisibility()) && getUnknownFields().equals(sEData.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_SEHourlyWeather_SEData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getHighTemperature() {
                return this.highTemperature_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getHumidity() {
                return this.humidity_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getLowTemperature() {
                return this.lowTemperature_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getNowTemperature() {
                return this.nowTemperature_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SEData> getParserForType() {
                return PARSER;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getProbabilityOfRainfall() {
                return this.probabilityOfRainfall_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.nowTemperature_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.lowTemperature_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(3, this.highTemperature_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(4, this.humidity_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(5, this.weatherId_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    iComputeInt32Size += GeneratedMessage.computeStringSize(6, this.weatherName_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(7, this.windSpeed_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(8, this.windInfo_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(9, this.probabilityOfRainfall_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(10, this.ultravioletRays_);
                }
                if ((this.bitField0_ & 1024) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(11, this.windPower_);
                }
                if ((this.bitField0_ & 2048) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeUInt32Size(12, this.visibility_);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getUltravioletRays() {
                return this.ultravioletRays_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getVisibility() {
                return this.visibility_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getWeatherId() {
                return this.weatherId_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public String getWeatherName() {
                Object obj = this.weatherName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.weatherName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public ByteString getWeatherNameBytes() {
                Object obj = this.weatherName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.weatherName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getWindInfo() {
                return this.windInfo_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getWindPower() {
                return this.windPower_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public int getWindSpeed() {
                return this.windSpeed_;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasHighTemperature() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasHumidity() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasLowTemperature() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasNowTemperature() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasProbabilityOfRainfall() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasUltravioletRays() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasVisibility() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasWeatherId() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasWeatherName() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasWindInfo() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasWindPower() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
            public boolean hasWindSpeed() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasNowTemperature()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getNowTemperature();
                }
                if (hasLowTemperature()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getLowTemperature();
                }
                if (hasHighTemperature()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getHighTemperature();
                }
                if (hasHumidity()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getHumidity();
                }
                if (hasWeatherId()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getWeatherId();
                }
                if (hasWeatherName()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getWeatherName().hashCode();
                }
                if (hasWindSpeed()) {
                    iHashCode = (((iHashCode * 37) + 7) * 53) + getWindSpeed();
                }
                if (hasWindInfo()) {
                    iHashCode = (((iHashCode * 37) + 8) * 53) + getWindInfo();
                }
                if (hasProbabilityOfRainfall()) {
                    iHashCode = (((iHashCode * 37) + 9) * 53) + getProbabilityOfRainfall();
                }
                if (hasUltravioletRays()) {
                    iHashCode = (((iHashCode * 37) + 10) * 53) + getUltravioletRays();
                }
                if (hasWindPower()) {
                    iHashCode = (((iHashCode * 37) + 11) * 53) + getWindPower();
                }
                if (hasVisibility()) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getVisibility();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_SEHourlyWeather_SEData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEData.class, Builder.class);
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
                    codedOutputStream.writeInt32(1, this.nowTemperature_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeInt32(2, this.lowTemperature_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeInt32(3, this.highTemperature_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeUInt32(4, this.humidity_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeUInt32(5, this.weatherId_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 6, this.weatherName_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    codedOutputStream.writeUInt32(7, this.windSpeed_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    codedOutputStream.writeUInt32(8, this.windInfo_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    codedOutputStream.writeUInt32(9, this.probabilityOfRainfall_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    codedOutputStream.writeUInt32(10, this.ultravioletRays_);
                }
                if ((this.bitField0_ & 1024) != 0) {
                    codedOutputStream.writeUInt32(11, this.windPower_);
                }
                if ((this.bitField0_ & 2048) != 0) {
                    codedOutputStream.writeUInt32(12, this.visibility_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDataOrBuilder {
                private int bitField0_;
                private int highTemperature_;
                private int humidity_;
                private int lowTemperature_;
                private int nowTemperature_;
                private int probabilityOfRainfall_;
                private int ultravioletRays_;
                private int visibility_;
                private int weatherId_;
                private Object weatherName_;
                private int windInfo_;
                private int windPower_;
                private int windSpeed_;

                private void buildPartial0(SEData sEData) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        sEData.nowTemperature_ = this.nowTemperature_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        sEData.lowTemperature_ = this.lowTemperature_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        sEData.highTemperature_ = this.highTemperature_;
                        i7 |= 4;
                    }
                    if ((i8 & 8) != 0) {
                        sEData.humidity_ = this.humidity_;
                        i7 |= 8;
                    }
                    if ((i8 & 16) != 0) {
                        sEData.weatherId_ = this.weatherId_;
                        i7 |= 16;
                    }
                    if ((i8 & 32) != 0) {
                        sEData.weatherName_ = this.weatherName_;
                        i7 |= 32;
                    }
                    if ((i8 & 64) != 0) {
                        sEData.windSpeed_ = this.windSpeed_;
                        i7 |= 64;
                    }
                    if ((i8 & 128) != 0) {
                        sEData.windInfo_ = this.windInfo_;
                        i7 |= 128;
                    }
                    if ((i8 & 256) != 0) {
                        sEData.probabilityOfRainfall_ = this.probabilityOfRainfall_;
                        i7 |= 256;
                    }
                    if ((i8 & 512) != 0) {
                        sEData.ultravioletRays_ = this.ultravioletRays_;
                        i7 |= 512;
                    }
                    if ((i8 & 1024) != 0) {
                        sEData.windPower_ = this.windPower_;
                        i7 |= 1024;
                    }
                    if ((i8 & 2048) != 0) {
                        sEData.visibility_ = this.visibility_;
                        i7 |= 2048;
                    }
                    sEData.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProtos.internal_static_SEHourlyWeather_SEData_descriptor;
                }

                public Builder clearHighTemperature() {
                    this.bitField0_ &= -5;
                    this.highTemperature_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearHumidity() {
                    this.bitField0_ &= -9;
                    this.humidity_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLowTemperature() {
                    this.bitField0_ &= -3;
                    this.lowTemperature_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearNowTemperature() {
                    this.bitField0_ &= -2;
                    this.nowTemperature_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProbabilityOfRainfall() {
                    this.bitField0_ &= -257;
                    this.probabilityOfRainfall_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearUltravioletRays() {
                    this.bitField0_ &= -513;
                    this.ultravioletRays_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearVisibility() {
                    this.bitField0_ &= -2049;
                    this.visibility_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWeatherId() {
                    this.bitField0_ &= -17;
                    this.weatherId_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWeatherName() {
                    this.weatherName_ = SEData.getDefaultInstance().getWeatherName();
                    this.bitField0_ &= -33;
                    onChanged();
                    return this;
                }

                public Builder clearWindInfo() {
                    this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                    this.windInfo_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWindPower() {
                    this.bitField0_ &= -1025;
                    this.windPower_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWindSpeed() {
                    this.bitField0_ &= -65;
                    this.windSpeed_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WeatherProtos.internal_static_SEHourlyWeather_SEData_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getHighTemperature() {
                    return this.highTemperature_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getHumidity() {
                    return this.humidity_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getLowTemperature() {
                    return this.lowTemperature_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getNowTemperature() {
                    return this.nowTemperature_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getProbabilityOfRainfall() {
                    return this.probabilityOfRainfall_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getUltravioletRays() {
                    return this.ultravioletRays_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getVisibility() {
                    return this.visibility_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getWeatherId() {
                    return this.weatherId_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public String getWeatherName() {
                    Object obj = this.weatherName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.weatherName_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public ByteString getWeatherNameBytes() {
                    Object obj = this.weatherName_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.weatherName_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getWindInfo() {
                    return this.windInfo_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getWindPower() {
                    return this.windPower_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public int getWindSpeed() {
                    return this.windSpeed_;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasHighTemperature() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasHumidity() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasLowTemperature() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasNowTemperature() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasProbabilityOfRainfall() {
                    return (this.bitField0_ & 256) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasUltravioletRays() {
                    return (this.bitField0_ & 512) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasVisibility() {
                    return (this.bitField0_ & 2048) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasWeatherId() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasWeatherName() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasWindInfo() {
                    return (this.bitField0_ & 128) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasWindPower() {
                    return (this.bitField0_ & 1024) != 0;
                }

                @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.SEDataOrBuilder
                public boolean hasWindSpeed() {
                    return (this.bitField0_ & 64) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProtos.internal_static_SEHourlyWeather_SEData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEData.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setHighTemperature(int i7) {
                    this.highTemperature_ = i7;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setHumidity(int i7) {
                    this.humidity_ = i7;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setLowTemperature(int i7) {
                    this.lowTemperature_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setNowTemperature(int i7) {
                    this.nowTemperature_ = i7;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setProbabilityOfRainfall(int i7) {
                    this.probabilityOfRainfall_ = i7;
                    this.bitField0_ |= 256;
                    onChanged();
                    return this;
                }

                public Builder setUltravioletRays(int i7) {
                    this.ultravioletRays_ = i7;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                public Builder setVisibility(int i7) {
                    this.visibility_ = i7;
                    this.bitField0_ |= 2048;
                    onChanged();
                    return this;
                }

                public Builder setWeatherId(int i7) {
                    this.weatherId_ = i7;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setWeatherName(String str) {
                    str.getClass();
                    this.weatherName_ = str;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setWeatherNameBytes(ByteString byteString) {
                    byteString.getClass();
                    this.weatherName_ = byteString;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setWindInfo(int i7) {
                    this.windInfo_ = i7;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                public Builder setWindPower(int i7) {
                    this.windPower_ = i7;
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setWindSpeed(int i7) {
                    this.windSpeed_ = i7;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.weatherName_ = "";
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEData build() {
                    SEData sEDataBuildPartial = buildPartial();
                    if (sEDataBuildPartial.isInitialized()) {
                        return sEDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEData buildPartial() {
                    SEData sEData = new SEData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sEData);
                    }
                    onBuilt();
                    return sEData;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SEData getDefaultInstanceForType() {
                    return SEData.getDefaultInstance();
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.weatherName_ = "";
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.nowTemperature_ = 0;
                    this.lowTemperature_ = 0;
                    this.highTemperature_ = 0;
                    this.humidity_ = 0;
                    this.weatherId_ = 0;
                    this.weatherName_ = "";
                    this.windSpeed_ = 0;
                    this.windInfo_ = 0;
                    this.probabilityOfRainfall_ = 0;
                    this.ultravioletRays_ = 0;
                    this.windPower_ = 0;
                    this.visibility_ = 0;
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SEData) {
                        return mergeFrom((SEData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SEData sEData) {
                    if (sEData == SEData.getDefaultInstance()) {
                        return this;
                    }
                    if (sEData.hasNowTemperature()) {
                        setNowTemperature(sEData.getNowTemperature());
                    }
                    if (sEData.hasLowTemperature()) {
                        setLowTemperature(sEData.getLowTemperature());
                    }
                    if (sEData.hasHighTemperature()) {
                        setHighTemperature(sEData.getHighTemperature());
                    }
                    if (sEData.hasHumidity()) {
                        setHumidity(sEData.getHumidity());
                    }
                    if (sEData.hasWeatherId()) {
                        setWeatherId(sEData.getWeatherId());
                    }
                    if (sEData.hasWeatherName()) {
                        this.weatherName_ = sEData.weatherName_;
                        this.bitField0_ |= 32;
                        onChanged();
                    }
                    if (sEData.hasWindSpeed()) {
                        setWindSpeed(sEData.getWindSpeed());
                    }
                    if (sEData.hasWindInfo()) {
                        setWindInfo(sEData.getWindInfo());
                    }
                    if (sEData.hasProbabilityOfRainfall()) {
                        setProbabilityOfRainfall(sEData.getProbabilityOfRainfall());
                    }
                    if (sEData.hasUltravioletRays()) {
                        setUltravioletRays(sEData.getUltravioletRays());
                    }
                    if (sEData.hasWindPower()) {
                        setWindPower(sEData.getWindPower());
                    }
                    if (sEData.hasVisibility()) {
                        setVisibility(sEData.getVisibility());
                    }
                    mergeUnknownFields(sEData.getUnknownFields());
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
                                        this.nowTemperature_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                        break;
                                    case 16:
                                        this.lowTemperature_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 2;
                                        break;
                                    case 24:
                                        this.highTemperature_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 4;
                                        break;
                                    case 32:
                                        this.humidity_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 8;
                                        break;
                                    case 40:
                                        this.weatherId_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 16;
                                        break;
                                    case 50:
                                        this.weatherName_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 32;
                                        break;
                                    case 56:
                                        this.windSpeed_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 64;
                                        break;
                                    case 64:
                                        this.windInfo_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 128;
                                        break;
                                    case 72:
                                        this.probabilityOfRainfall_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 256;
                                        break;
                                    case 80:
                                        this.ultravioletRays_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 512;
                                        break;
                                    case 88:
                                        this.windPower_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 1024;
                                        break;
                                    case 96:
                                        this.visibility_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2048;
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

            private SEData(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.nowTemperature_ = 0;
                this.lowTemperature_ = 0;
                this.highTemperature_ = 0;
                this.humidity_ = 0;
                this.weatherId_ = 0;
                this.weatherName_ = "";
                this.windSpeed_ = 0;
                this.windInfo_ = 0;
                this.probabilityOfRainfall_ = 0;
                this.ultravioletRays_ = 0;
                this.windPower_ = 0;
                this.visibility_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEData sEData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEData);
            }

            public static SEData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SEData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SEData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static SEData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static SEData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SEData parseFrom(InputStream inputStream) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static SEData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEData parseFrom(CodedInputStream codedInputStream) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static SEData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private SEData() {
                this.nowTemperature_ = 0;
                this.lowTemperature_ = 0;
                this.highTemperature_ = 0;
                this.humidity_ = 0;
                this.weatherId_ = 0;
                this.weatherName_ = "";
                this.windSpeed_ = 0;
                this.windInfo_ = 0;
                this.probabilityOfRainfall_ = 0;
                this.ultravioletRays_ = 0;
                this.windPower_ = 0;
                this.visibility_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.weatherName_ = "";
            }
        }

        public interface SEDataOrBuilder extends MessageOrBuilder {
            int getHighTemperature();

            int getHumidity();

            int getLowTemperature();

            int getNowTemperature();

            int getProbabilityOfRainfall();

            int getUltravioletRays();

            int getVisibility();

            int getWeatherId();

            String getWeatherName();

            ByteString getWeatherNameBytes();

            int getWindInfo();

            int getWindPower();

            int getWindSpeed();

            boolean hasHighTemperature();

            boolean hasHumidity();

            boolean hasLowTemperature();

            boolean hasNowTemperature();

            boolean hasProbabilityOfRainfall();

            boolean hasUltravioletRays();

            boolean hasVisibility();

            boolean hasWeatherId();

            boolean hasWeatherName();

            boolean hasWindInfo();

            boolean hasWindPower();

            boolean hasWindSpeed();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEHourlyWeather");
            DEFAULT_INSTANCE = new SEHourlyWeather();
            PARSER = new AbstractParser<SEHourlyWeather>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeather.1
                @Override // com.google.protobuf.Parser
                public SEHourlyWeather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEHourlyWeather.newBuilder();
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

        public static SEHourlyWeather getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_SEHourlyWeather_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEHourlyWeather parseDelimitedFrom(InputStream inputStream) {
            return (SEHourlyWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEHourlyWeather parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEHourlyWeather> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEHourlyWeather)) {
                return super.equals(obj);
            }
            SEHourlyWeather sEHourlyWeather = (SEHourlyWeather) obj;
            if (hasId() != sEHourlyWeather.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(sEHourlyWeather.getId())) && hasDataList() == sEHourlyWeather.hasDataList()) {
                return (!hasDataList() || getDataList().equals(sEHourlyWeather.getDataList())) && getUnknownFields().equals(sEHourlyWeather.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
        public SEData.SEList getDataList() {
            SEData.SEList sEList = this.dataList_;
            return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
        public SEData.SEListOrBuilder getDataListOrBuilder() {
            SEData.SEList sEList = this.dataList_;
            return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WeatherProtos.internal_static_SEHourlyWeather_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
        public SEWeatherId getId() {
            SEWeatherId sEWeatherId = this.id_;
            return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
        public SEWeatherIdOrBuilder getIdOrBuilder() {
            SEWeatherId sEWeatherId = this.id_;
            return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEHourlyWeather> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getId()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDataList());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
        public boolean hasDataList() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
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
            if (hasDataList()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_SEHourlyWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHourlyWeather.class, Builder.class);
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
            if (!hasDataList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getId().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getId());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDataList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEHourlyWeatherOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> dataListBuilder_;
            private SEData.SEList dataList_;
            private SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> idBuilder_;
            private SEWeatherId id_;

            private void buildPartial0(SEHourlyWeather sEHourlyWeather) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                    sEHourlyWeather.id_ = singleFieldBuilder == null ? this.id_ : (SEWeatherId) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder2 = this.dataListBuilder_;
                    sEHourlyWeather.dataList_ = singleFieldBuilder2 == null ? this.dataList_ : (SEData.SEList) singleFieldBuilder2.build();
                    i7 |= 2;
                }
                sEHourlyWeather.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_SEHourlyWeather_descriptor;
            }

            private SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> internalGetDataListFieldBuilder() {
                if (this.dataListBuilder_ == null) {
                    this.dataListBuilder_ = new SingleFieldBuilder<>(getDataList(), getParentForChildren(), isClean());
                    this.dataList_ = null;
                }
                return this.dataListBuilder_;
            }

            private SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> internalGetIdFieldBuilder() {
                if (this.idBuilder_ == null) {
                    this.idBuilder_ = new SingleFieldBuilder<>(getId(), getParentForChildren(), isClean());
                    this.id_ = null;
                }
                return this.idBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetIdFieldBuilder();
                    internalGetDataListFieldBuilder();
                }
            }

            public Builder clearDataList() {
                this.bitField0_ &= -3;
                this.dataList_ = null;
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.dataListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = null;
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
            public SEData.SEList getDataList() {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEData.SEList) singleFieldBuilder.getMessage();
                }
                SEData.SEList sEList = this.dataList_;
                return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
            }

            public SEData.SEList.Builder getDataListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEData.SEList.Builder) internalGetDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
            public SEData.SEListOrBuilder getDataListOrBuilder() {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEData.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEData.SEList sEList = this.dataList_;
                return sEList == null ? SEData.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProtos.internal_static_SEHourlyWeather_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
            public SEWeatherId getId() {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWeatherId) singleFieldBuilder.getMessage();
                }
                SEWeatherId sEWeatherId = this.id_;
                return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
            }

            public SEWeatherId.Builder getIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEWeatherId.Builder) internalGetIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
            public SEWeatherIdOrBuilder getIdOrBuilder() {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWeatherIdOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWeatherId sEWeatherId = this.id_;
                return sEWeatherId == null ? SEWeatherId.getDefaultInstance() : sEWeatherId;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
            public boolean hasDataList() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEHourlyWeatherOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_SEHourlyWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHourlyWeather.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasDataList() && getId().isInitialized();
            }

            public Builder mergeDataList(SEData.SEList sEList) {
                SEData.SEList sEList2;
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 2) == 0 || (sEList2 = this.dataList_) == null || sEList2 == SEData.SEList.getDefaultInstance()) {
                    this.dataList_ = sEList;
                } else {
                    getDataListBuilder().mergeFrom(sEList);
                }
                if (this.dataList_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeId(SEWeatherId sEWeatherId) {
                SEWeatherId sEWeatherId2;
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWeatherId);
                } else if ((this.bitField0_ & 1) == 0 || (sEWeatherId2 = this.id_) == null || sEWeatherId2 == SEWeatherId.getDefaultInstance()) {
                    this.id_ = sEWeatherId;
                } else {
                    getIdBuilder().mergeFrom(sEWeatherId);
                }
                if (this.id_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setDataList(SEData.SEList sEList) {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.dataList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(SEWeatherId sEWeatherId) {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    sEWeatherId.getClass();
                    this.id_ = sEWeatherId;
                } else {
                    singleFieldBuilder.setMessage(sEWeatherId);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHourlyWeather build() {
                SEHourlyWeather sEHourlyWeatherBuildPartial = buildPartial();
                if (sEHourlyWeatherBuildPartial.isInitialized()) {
                    return sEHourlyWeatherBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEHourlyWeatherBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHourlyWeather buildPartial() {
                SEHourlyWeather sEHourlyWeather = new SEHourlyWeather(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEHourlyWeather);
                }
                onBuilt();
                return sEHourlyWeather;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEHourlyWeather getDefaultInstanceForType() {
                return SEHourlyWeather.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = null;
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                this.dataList_ = null;
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder2 = this.dataListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.dataListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEHourlyWeather) {
                    return mergeFrom((SEHourlyWeather) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDataList(SEData.SEList.Builder builder) {
                SingleFieldBuilder<SEData.SEList, SEData.SEList.Builder, SEData.SEListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder == null) {
                    this.dataList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(SEWeatherId.Builder builder) {
                SingleFieldBuilder<SEWeatherId, SEWeatherId.Builder, SEWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    this.id_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEHourlyWeather sEHourlyWeather) {
                if (sEHourlyWeather == SEHourlyWeather.getDefaultInstance()) {
                    return this;
                }
                if (sEHourlyWeather.hasId()) {
                    mergeId(sEHourlyWeather.getId());
                }
                if (sEHourlyWeather.hasDataList()) {
                    mergeDataList(sEHourlyWeather.getDataList());
                }
                mergeUnknownFields(sEHourlyWeather.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetDataListFieldBuilder().getBuilder(), extensionRegistryLite);
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

        private SEHourlyWeather(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEHourlyWeather sEHourlyWeather) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEHourlyWeather);
        }

        public static SEHourlyWeather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEHourlyWeather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHourlyWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHourlyWeather parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEHourlyWeather getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SEHourlyWeather() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEHourlyWeather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEHourlyWeather parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEHourlyWeather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEHourlyWeather parseFrom(InputStream inputStream) {
            return (SEHourlyWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEHourlyWeather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHourlyWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHourlyWeather parseFrom(CodedInputStream codedInputStream) {
            return (SEHourlyWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEHourlyWeather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHourlyWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEHourlyWeatherOrBuilder extends MessageOrBuilder {
        SEHourlyWeather.SEData.SEList getDataList();

        SEHourlyWeather.SEData.SEListOrBuilder getDataListOrBuilder();

        SEWeatherId getId();

        SEWeatherIdOrBuilder getIdOrBuilder();

        boolean hasDataList();

        boolean hasId();
    }

    public static final class SEWeather extends GeneratedMessage implements SEWeatherOrBuilder {
        private static final SEWeather DEFAULT_INSTANCE;
        public static final int FORECAST_WEATHER_FIELD_NUMBER = 2;
        public static final int HOURLY_WEATHER_FIELD_NUMBER = 1;
        private static final Parser<SEWeather> PARSER;
        public static final int PRESSURE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            HOURLY_WEATHER(1),
            FORECAST_WEATHER(2),
            PRESSURE(3),
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
                    return HOURLY_WEATHER;
                }
                if (i7 == 2) {
                    return FORECAST_WEATHER;
                }
                if (i7 != 3) {
                    return null;
                }
                return PRESSURE;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWeather");
            DEFAULT_INSTANCE = new SEWeather();
            PARSER = new AbstractParser<SEWeather>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEWeather.1
                @Override // com.google.protobuf.Parser
                public SEWeather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWeather.newBuilder();
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

        public static SEWeather getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_SEWeather_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWeather parseDelimitedFrom(InputStream inputStream) {
            return (SEWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWeather parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWeather> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWeather)) {
                return super.equals(obj);
            }
            SEWeather sEWeather = (SEWeather) obj;
            if (!getPayloadCase().equals(sEWeather.getPayloadCase())) {
                return false;
            }
            int i7 = this.payloadCase_;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3 && Float.floatToIntBits(getPressure()) != Float.floatToIntBits(sEWeather.getPressure())) {
                        return false;
                    }
                } else if (!getForecastWeather().equals(sEWeather.getForecastWeather())) {
                    return false;
                }
            } else if (!getHourlyWeather().equals(sEWeather.getHourlyWeather())) {
                return false;
            }
            return getUnknownFields().equals(sEWeather.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WeatherProtos.internal_static_SEWeather_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
        public SEForecastWeather getForecastWeather() {
            return this.payloadCase_ == 2 ? (SEForecastWeather) this.payload_ : SEForecastWeather.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
        public SEForecastWeatherOrBuilder getForecastWeatherOrBuilder() {
            return this.payloadCase_ == 2 ? (SEForecastWeather) this.payload_ : SEForecastWeather.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
        public SEHourlyWeather getHourlyWeather() {
            return this.payloadCase_ == 1 ? (SEHourlyWeather) this.payload_ : SEHourlyWeather.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
        public SEHourlyWeatherOrBuilder getHourlyWeatherOrBuilder() {
            return this.payloadCase_ == 1 ? (SEHourlyWeather) this.payload_ : SEHourlyWeather.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWeather> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
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
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEHourlyWeather) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SEForecastWeather) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(3, ((Float) this.payload_).floatValue());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
        public boolean hasForecastWeather() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
        public boolean hasHourlyWeather() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
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
                iHashCode = getHourlyWeather().hashCode();
            } else {
                if (i9 != 2) {
                    if (i9 == 3) {
                        i7 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = Float.floatToIntBits(getPressure());
                    }
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i7 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getForecastWeather().hashCode();
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_SEWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWeather.class, Builder.class);
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
            if (hasHourlyWeather() && !getHourlyWeather().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasForecastWeather() || getForecastWeather().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEHourlyWeather) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SEForecastWeather) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeFloat(3, ((Float) this.payload_).floatValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWeatherOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> forecastWeatherBuilder_;
            private SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> hourlyWeatherBuilder_;
            private int payloadCase_;
            private Object payload_;

            private void buildPartial0(SEWeather sEWeather) {
            }

            private void buildPartialOneofs(SEWeather sEWeather) {
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder2;
                int i7 = this.payloadCase_;
                sEWeather.payloadCase_ = i7;
                sEWeather.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder2 = this.hourlyWeatherBuilder_) != null) {
                    sEWeather.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 2 || (singleFieldBuilder = this.forecastWeatherBuilder_) == null) {
                    return;
                }
                sEWeather.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_SEWeather_descriptor;
            }

            private SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> internalGetForecastWeatherFieldBuilder() {
                if (this.forecastWeatherBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SEForecastWeather.getDefaultInstance();
                    }
                    this.forecastWeatherBuilder_ = new SingleFieldBuilder<>((SEForecastWeather) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.forecastWeatherBuilder_;
            }

            private SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> internalGetHourlyWeatherFieldBuilder() {
                if (this.hourlyWeatherBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEHourlyWeather.getDefaultInstance();
                    }
                    this.hourlyWeatherBuilder_ = new SingleFieldBuilder<>((SEHourlyWeather) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.hourlyWeatherBuilder_;
            }

            public Builder clearForecastWeather() {
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder = this.forecastWeatherBuilder_;
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

            public Builder clearHourlyWeather() {
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder = this.hourlyWeatherBuilder_;
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
                return WeatherProtos.internal_static_SEWeather_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public SEForecastWeather getForecastWeather() {
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder = this.forecastWeatherBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SEForecastWeather) this.payload_ : SEForecastWeather.getDefaultInstance() : this.payloadCase_ == 2 ? (SEForecastWeather) singleFieldBuilder.getMessage() : SEForecastWeather.getDefaultInstance();
            }

            public SEForecastWeather.Builder getForecastWeatherBuilder() {
                return (SEForecastWeather.Builder) internalGetForecastWeatherFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public SEForecastWeatherOrBuilder getForecastWeatherOrBuilder() {
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.forecastWeatherBuilder_) == null) ? i7 == 2 ? (SEForecastWeather) this.payload_ : SEForecastWeather.getDefaultInstance() : (SEForecastWeatherOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public SEHourlyWeather getHourlyWeather() {
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder = this.hourlyWeatherBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEHourlyWeather) this.payload_ : SEHourlyWeather.getDefaultInstance() : this.payloadCase_ == 1 ? (SEHourlyWeather) singleFieldBuilder.getMessage() : SEHourlyWeather.getDefaultInstance();
            }

            public SEHourlyWeather.Builder getHourlyWeatherBuilder() {
                return (SEHourlyWeather.Builder) internalGetHourlyWeatherFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public SEHourlyWeatherOrBuilder getHourlyWeatherOrBuilder() {
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.hourlyWeatherBuilder_) == null) ? i7 == 1 ? (SEHourlyWeather) this.payload_ : SEHourlyWeather.getDefaultInstance() : (SEHourlyWeatherOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public float getPressure() {
                if (this.payloadCase_ == 3) {
                    return ((Float) this.payload_).floatValue();
                }
                return 0.0f;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public boolean hasForecastWeather() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public boolean hasHourlyWeather() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherOrBuilder
            public boolean hasPressure() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_SEWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWeather.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasHourlyWeather() || getHourlyWeather().isInitialized()) {
                    return !hasForecastWeather() || getForecastWeather().isInitialized();
                }
                return false;
            }

            public Builder mergeForecastWeather(SEForecastWeather sEForecastWeather) {
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder = this.forecastWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SEForecastWeather.getDefaultInstance()) {
                        this.payload_ = sEForecastWeather;
                    } else {
                        this.payload_ = SEForecastWeather.newBuilder((SEForecastWeather) this.payload_).mergeFrom(sEForecastWeather).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sEForecastWeather);
                } else {
                    singleFieldBuilder.setMessage(sEForecastWeather);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeHourlyWeather(SEHourlyWeather sEHourlyWeather) {
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder = this.hourlyWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEHourlyWeather.getDefaultInstance()) {
                        this.payload_ = sEHourlyWeather;
                    } else {
                        this.payload_ = SEHourlyWeather.newBuilder((SEHourlyWeather) this.payload_).mergeFrom(sEHourlyWeather).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEHourlyWeather);
                } else {
                    singleFieldBuilder.setMessage(sEHourlyWeather);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setForecastWeather(SEForecastWeather sEForecastWeather) {
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder = this.forecastWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    sEForecastWeather.getClass();
                    this.payload_ = sEForecastWeather;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEForecastWeather);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setHourlyWeather(SEHourlyWeather sEHourlyWeather) {
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder = this.hourlyWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    sEHourlyWeather.getClass();
                    this.payload_ = sEHourlyWeather;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEHourlyWeather);
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

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWeather build() {
                SEWeather sEWeatherBuildPartial = buildPartial();
                if (sEWeatherBuildPartial.isInitialized()) {
                    return sEWeatherBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWeatherBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWeather buildPartial() {
                SEWeather sEWeather = new SEWeather(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWeather);
                }
                buildPartialOneofs(sEWeather);
                onBuilt();
                return sEWeather;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWeather getDefaultInstanceForType() {
                return SEWeather.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder = this.hourlyWeatherBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder2 = this.forecastWeatherBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWeather) {
                    return mergeFrom((SEWeather) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setForecastWeather(SEForecastWeather.Builder builder) {
                SingleFieldBuilder<SEForecastWeather, SEForecastWeather.Builder, SEForecastWeatherOrBuilder> singleFieldBuilder = this.forecastWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setHourlyWeather(SEHourlyWeather.Builder builder) {
                SingleFieldBuilder<SEHourlyWeather, SEHourlyWeather.Builder, SEHourlyWeatherOrBuilder> singleFieldBuilder = this.hourlyWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeFrom(SEWeather sEWeather) {
                if (sEWeather == SEWeather.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = sEWeather.getPayloadCase().ordinal();
                if (iOrdinal == 0) {
                    mergeHourlyWeather(sEWeather.getHourlyWeather());
                } else if (iOrdinal == 1) {
                    mergeForecastWeather(sEWeather.getForecastWeather());
                } else if (iOrdinal == 2) {
                    setPressure(sEWeather.getPressure());
                }
                mergeUnknownFields(sEWeather.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetHourlyWeatherFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetForecastWeatherFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag != 29) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.payload_ = Float.valueOf(codedInputStream.readFloat());
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

        private SEWeather(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWeather sEWeather) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWeather);
        }

        public static SEWeather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWeather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWeather parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWeather getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWeather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEWeather() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEWeather parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWeather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWeather parseFrom(InputStream inputStream) {
            return (SEWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWeather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWeather parseFrom(CodedInputStream codedInputStream) {
            return (SEWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWeather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SEWeatherId extends GeneratedMessage implements SEWeatherIdOrBuilder {
        public static final int CITY_NAME_FIELD_NUMBER = 2;
        private static final SEWeatherId DEFAULT_INSTANCE;
        public static final int LOCATION_NAME_FIELD_NUMBER = 3;
        private static final Parser<SEWeatherId> PARSER;
        public static final int PUB_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object cityName_;
        private volatile Object locationName_;
        private byte memoizedIsInitialized;
        private CommonProtos.SETime pubTime_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWeatherId");
            DEFAULT_INSTANCE = new SEWeatherId();
            PARSER = new AbstractParser<SEWeatherId>() { // from class: com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherId.1
                @Override // com.google.protobuf.Parser
                public SEWeatherId parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWeatherId.newBuilder();
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

        public static SEWeatherId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProtos.internal_static_SEWeatherId_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWeatherId parseDelimitedFrom(InputStream inputStream) {
            return (SEWeatherId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWeatherId parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWeatherId> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWeatherId)) {
                return super.equals(obj);
            }
            SEWeatherId sEWeatherId = (SEWeatherId) obj;
            if (hasPubTime() != sEWeatherId.hasPubTime()) {
                return false;
            }
            if ((hasPubTime() && !getPubTime().equals(sEWeatherId.getPubTime())) || hasCityName() != sEWeatherId.hasCityName()) {
                return false;
            }
            if ((!hasCityName() || getCityName().equals(sEWeatherId.getCityName())) && hasLocationName() == sEWeatherId.hasLocationName()) {
                return (!hasLocationName() || getLocationName().equals(sEWeatherId.getLocationName())) && getUnknownFields().equals(sEWeatherId.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
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
            return WeatherProtos.internal_static_SEWeatherId_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
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
        public Parser<SEWeatherId> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
        public CommonProtos.SETime getPubTime() {
            CommonProtos.SETime sETime = this.pubTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
        public CommonProtos.SETimeOrBuilder getPubTimeOrBuilder() {
            CommonProtos.SETime sETime = this.pubTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPubTime()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.cityName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(3, this.locationName_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
        public boolean hasCityName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
        public boolean hasLocationName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
        public boolean hasPubTime() {
            return (this.bitField0_ & 1) != 0;
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
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProtos.internal_static_SEWeatherId_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWeatherId.class, Builder.class);
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
            if (!hasPubTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCityName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLocationName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getPubTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPubTime());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.cityName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.locationName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWeatherIdOrBuilder {
            private int bitField0_;
            private Object cityName_;
            private Object locationName_;
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> pubTimeBuilder_;
            private CommonProtos.SETime pubTime_;

            private void buildPartial0(SEWeatherId sEWeatherId) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                    sEWeatherId.pubTime_ = singleFieldBuilder == null ? this.pubTime_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWeatherId.cityName_ = this.cityName_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWeatherId.locationName_ = this.locationName_;
                    i7 |= 4;
                }
                sEWeatherId.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProtos.internal_static_SEWeatherId_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetPubTimeFieldBuilder() {
                if (this.pubTimeBuilder_ == null) {
                    this.pubTimeBuilder_ = new SingleFieldBuilder<>(getPubTime(), getParentForChildren(), isClean());
                    this.pubTime_ = null;
                }
                return this.pubTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetPubTimeFieldBuilder();
                }
            }

            public Builder clearCityName() {
                this.cityName_ = SEWeatherId.getDefaultInstance().getCityName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearLocationName() {
                this.locationName_ = SEWeatherId.getDefaultInstance().getLocationName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPubTime() {
                this.bitField0_ &= -2;
                this.pubTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.pubTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
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
                return WeatherProtos.internal_static_SEWeatherId_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
            public ByteString getLocationNameBytes() {
                Object obj = this.locationName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locationName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
            public CommonProtos.SETime getPubTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.pubTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getPubTimeBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetPubTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
            public CommonProtos.SETimeOrBuilder getPubTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.pubTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
            public boolean hasCityName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
            public boolean hasLocationName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WeatherProtos.SEWeatherIdOrBuilder
            public boolean hasPubTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProtos.internal_static_SEWeatherId_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWeatherId.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPubTime() && hasCityName() && hasLocationName() && getPubTime().isInitialized();
            }

            public Builder mergePubTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 1) == 0 || (sETime2 = this.pubTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.pubTime_ = sETime;
                } else {
                    getPubTimeBuilder().mergeFrom(sETime);
                }
                if (this.pubTime_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setCityName(String str) {
                str.getClass();
                this.cityName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCityNameBytes(ByteString byteString) {
                byteString.getClass();
                this.cityName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLocationName(String str) {
                str.getClass();
                this.locationName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLocationNameBytes(ByteString byteString) {
                byteString.getClass();
                this.locationName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPubTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.pubTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.cityName_ = "";
                this.locationName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWeatherId build() {
                SEWeatherId sEWeatherIdBuildPartial = buildPartial();
                if (sEWeatherIdBuildPartial.isInitialized()) {
                    return sEWeatherIdBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWeatherIdBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWeatherId buildPartial() {
                SEWeatherId sEWeatherId = new SEWeatherId(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWeatherId);
                }
                onBuilt();
                return sEWeatherId;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWeatherId getDefaultInstanceForType() {
                return SEWeatherId.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.pubTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.pubTimeBuilder_ = null;
                }
                this.cityName_ = "";
                this.locationName_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.cityName_ = "";
                this.locationName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWeatherId) {
                    return mergeFrom((SEWeatherId) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPubTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.pubTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.pubTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEWeatherId sEWeatherId) {
                if (sEWeatherId == SEWeatherId.getDefaultInstance()) {
                    return this;
                }
                if (sEWeatherId.hasPubTime()) {
                    mergePubTime(sEWeatherId.getPubTime());
                }
                if (sEWeatherId.hasCityName()) {
                    this.cityName_ = sEWeatherId.cityName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEWeatherId.hasLocationName()) {
                    this.locationName_ = sEWeatherId.locationName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(sEWeatherId.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetPubTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.cityName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.locationName_ = codedInputStream.readBytes();
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

        private SEWeatherId(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.cityName_ = "";
            this.locationName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWeatherId sEWeatherId) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWeatherId);
        }

        public static SEWeatherId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWeatherId parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWeatherId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWeatherId parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWeatherId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWeatherId parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWeatherId parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEWeatherId() {
            this.cityName_ = "";
            this.locationName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.cityName_ = "";
            this.locationName_ = "";
        }

        public static SEWeatherId parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWeatherId parseFrom(InputStream inputStream) {
            return (SEWeatherId) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWeatherId parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWeatherId) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWeatherId parseFrom(CodedInputStream codedInputStream) {
            return (SEWeatherId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWeatherId parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWeatherId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWeatherIdOrBuilder extends MessageOrBuilder {
        String getCityName();

        ByteString getCityNameBytes();

        String getLocationName();

        ByteString getLocationNameBytes();

        CommonProtos.SETime getPubTime();

        CommonProtos.SETimeOrBuilder getPubTimeOrBuilder();

        boolean hasCityName();

        boolean hasLocationName();

        boolean hasPubTime();
    }

    public interface SEWeatherOrBuilder extends MessageOrBuilder {
        SEForecastWeather getForecastWeather();

        SEForecastWeatherOrBuilder getForecastWeatherOrBuilder();

        SEHourlyWeather getHourlyWeather();

        SEHourlyWeatherOrBuilder getHourlyWeatherOrBuilder();

        SEWeather.PayloadCase getPayloadCase();

        float getPressure();

        boolean hasForecastWeather();

        boolean hasHourlyWeather();

        boolean hasPressure();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "WeatherProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rWeather.proto\u001a\fnanopb.proto\u001a\fCommon.proto\"\u0086\u0001\n\tSEWeather\u0012*\n\u000ehourly_Weather\u0018\u0001 \u0001(\u000b2\u0010.SEHourlyWeatherH\u0000\u0012.\n\u0010forecast_weather\u0018\u0002 \u0001(\u000b2\u0012.SEForecastWeatherH\u0000\u0012\u0012\n\bpressure\u0018\u0003 \u0001(\u0002H\u0000B\t\n\u0007payload\"`\n\u000bSEWeatherId\u0012\u0019\n\bpub_time\u0018\u0001 \u0002(\u000b2\u0007.SETime\u0012\u0018\n\tcity_name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rlocation_name\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"\u0087\u0004\n\u000fSEHourlyWeather\u0012\u0018\n\u0002id\u0018\u0001 \u0002(\u000b2\f.SEWeatherId\u00121\n\tdata_list\u0018\u0002 \u0002(\u000b2\u001e.SEHourlyWeather.SEData.SEList\u001a¦\u0003\n\u0006SEData\u0012\u001e\n\u000fnow_temperature\u0018\u0001 \u0001(\u0005B\u0005\u0092?\u00028\b\u0012\u001e\n\u000flow_temperature\u0018\u0002 \u0001(\u0005B\u0005\u0092?\u00028\b\u0012\u001f\n\u0010high_temperature\u0018\u0003 \u0001(\u0005B\u0005\u0092?\u00028\b\u0012\u0017\n\bhumidity\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0019\n\nweather_id\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u001b\n\fweather_name\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nWind_speed\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0018\n\twind_info\u0018\b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012&\n\u0017Probability_of_rainfall\u0018\t \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001f\n\u0010ultraviolet_rays\u0018\n \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0019\n\nwind_power\u0018\u000b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0019\n\nvisibility\u0018\f \u0001(\rB\u0005\u0092?\u00028\u0010\u001a6\n\u0006SEList\u0012,\n\u0004list\u0018\u0001 \u0003(\u000b2\u0017.SEHourlyWeather.SEDataB\u0005\u0092?\u0002\u0018\u0004\"ö\u0004\n\u0011SEForecastWeather\u0012\u0018\n\u0002id\u0018\u0001 \u0002(\u000b2\f.SEWeatherId\u00123\n\tdata_list\u0018\u0002 \u0002(\u000b2 .SEForecastWeather.SEData.SEList\u001a\u0091\u0004\n\u0006SEData\u0012\u001e\n\u000fnow_temperature\u0018\u0001 \u0001(\u0005B\u0005\u0092?\u00028\b\u0012\u001e\n\u000flow_temperature\u0018\u0002 \u0001(\u0005B\u0005\u0092?\u00028\b\u0012\u001f\n\u0010high_temperature\u0018\u0003 \u0001(\u0005B\u0005\u0092?\u00028\b\u0012\u0017\n\bhumidity\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0012\n\u0003aqi\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0019\n\nweather_id\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u001b\n\fweather_name\u0018\u0007 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nWind_speed\u0018\b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0018\n\twind_info\u0018\t \u0001(\rB\u0005\u0092?\u00028\u0010\u0012&\n\u0017Probability_of_rainfall\u0018\n \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0017\n\bsun_rise\u0018\u000b \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0007sun_set\u0018\f \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010ultraviolet_rays\u0018\r \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\"\n\u0013pm_ultraviolet_rays\u0018\u000e \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0019\n\nwind_power\u0018\u000f \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0019\n\nvisibility\u0018\u0010 \u0001(\rB\u0005\u0092?\u00028\u0010\u001a8\n\u0006SEList\u0012.\n\u0004list\u0018\u0001 \u0003(\u000b2\u0019.SEForecastWeather.SEDataB\u0005\u0092?\u0002\u0018\u0004B)\n\u0018com.zh.ble.wear.protobufB\rWeatherProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SEWeather_descriptor = messageType;
        internal_static_SEWeather_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"HourlyWeather", "ForecastWeather", "Pressure", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SEWeatherId_descriptor = messageType2;
        internal_static_SEWeatherId_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"PubTime", "CityName", "LocationName"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEHourlyWeather_descriptor = messageType3;
        internal_static_SEHourlyWeather_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"Id", "DataList"});
        Descriptors.Descriptor nestedType = messageType3.getNestedType(0);
        internal_static_SEHourlyWeather_SEData_descriptor = nestedType;
        internal_static_SEHourlyWeather_SEData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{"NowTemperature", "LowTemperature", "HighTemperature", "Humidity", "WeatherId", "WeatherName", "WindSpeed", "WindInfo", "ProbabilityOfRainfall", "UltravioletRays", "WindPower", "Visibility"});
        Descriptors.Descriptor nestedType2 = nestedType.getNestedType(0);
        internal_static_SEHourlyWeather_SEData_SEList_descriptor = nestedType2;
        internal_static_SEHourlyWeather_SEData_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SEForecastWeather_descriptor = messageType4;
        internal_static_SEForecastWeather_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"Id", "DataList"});
        Descriptors.Descriptor nestedType3 = messageType4.getNestedType(0);
        internal_static_SEForecastWeather_SEData_descriptor = nestedType3;
        internal_static_SEForecastWeather_SEData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{"NowTemperature", "LowTemperature", "HighTemperature", "Humidity", "Aqi", "WeatherId", "WeatherName", "WindSpeed", "WindInfo", "ProbabilityOfRainfall", "SunRise", "SunSet", "UltravioletRays", "PmUltravioletRays", "WindPower", "Visibility"});
        Descriptors.Descriptor nestedType4 = nestedType3.getNestedType(0);
        internal_static_SEForecastWeather_SEData_SEList_descriptor = nestedType4;
        internal_static_SEForecastWeather_SEData_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType4, new String[]{MessageLiteToString.f20028a});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private WeatherProtos() {
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