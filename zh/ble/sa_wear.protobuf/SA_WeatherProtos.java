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
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
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

/* JADX INFO: loaded from: classes6.dex */
public final class SA_WeatherProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SAAlerts_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAAlerts_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAAlerts_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAAlerts_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SACityKey_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SACityKey_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SACityKey_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SACityKey_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SASunRiseSet_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SASunRiseSet_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWeatherConfig_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWeatherConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWeatherForecast_Data_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWeatherForecast_Data_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWeatherForecast_Data_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWeatherForecast_Data_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWeatherForecast_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWeatherForecast_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWeatherId_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWeatherId_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAWeatherLatest_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAWeatherLatest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SAweather_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SAweather_fieldAccessorTable;

    public static final class SAAlerts extends GeneratedMessage implements SAAlertsOrBuilder {
        private static final SAAlerts DEFAULT_INSTANCE;
        public static final int DETAIL_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 5;
        public static final int LEVEL_FIELD_NUMBER = 2;
        private static final Parser<SAAlerts> PARSER;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object detail_;
        private volatile Object id_;
        private volatile Object level_;
        private byte memoizedIsInitialized;
        private volatile Object title_;
        private volatile Object type_;

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final long serialVersionUID = 0;
            private java.util.List<SAAlerts> list_;
            private byte memoizedIsInitialized;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                DEFAULT_INSTANCE = new List();
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.List.1
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
                return SA_WeatherProtos.internal_static_SA_SAAlerts_List_descriptor;
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
                return SA_WeatherProtos.internal_static_SA_SAAlerts_List_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
            public SAAlerts getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
            public java.util.List<SAAlerts> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
            public SAAlertsOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
            public java.util.List<? extends SAAlertsOrBuilder> getListOrBuilderList() {
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
                return SA_WeatherProtos.internal_static_SA_SAAlerts_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                private RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> listBuilder_;
                private java.util.List<SAAlerts> list_;

                private void buildPartial0(List list) {
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SA_WeatherProtos.internal_static_SA_SAAlerts_List_descriptor;
                }

                private RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SAAlerts> iterable) {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SAAlerts sAAlerts) {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sAAlerts);
                        return this;
                    }
                    sAAlerts.getClass();
                    ensureListIsMutable();
                    this.list_.add(sAAlerts);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SAAlerts.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SA_WeatherProtos.internal_static_SA_SAAlerts_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
                public SAAlerts getList(int i7) {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SAAlerts) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
                public java.util.List<SAAlerts> getListList() {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
                public SAAlertsOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SAAlertsOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.ListOrBuilder
                public java.util.List<? extends SAAlertsOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WeatherProtos.internal_static_SA_SAAlerts_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SAAlerts sAAlerts) {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sAAlerts);
                        return this;
                    }
                    sAAlerts.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sAAlerts);
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SAAlerts.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SAAlerts sAAlerts) {
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sAAlerts.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sAAlerts);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sAAlerts);
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
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SAAlerts sAAlerts = (SAAlerts) codedInputStream.readMessage(SAAlerts.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SAAlerts, Builder, SAAlertsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sAAlerts);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sAAlerts);
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
            SAAlerts getList(int i7);

            int getListCount();

            java.util.List<SAAlerts> getListList();

            SAAlertsOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SAAlertsOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAAlerts");
            DEFAULT_INSTANCE = new SAAlerts();
            PARSER = new AbstractParser<SAAlerts>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlerts.1
                @Override // com.google.protobuf.Parser
                public SAAlerts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAAlerts.newBuilder();
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

        public static SAAlerts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SAAlerts_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAAlerts parseDelimitedFrom(InputStream inputStream) {
            return (SAAlerts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAAlerts parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAAlerts> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAAlerts)) {
                return super.equals(obj);
            }
            SAAlerts sAAlerts = (SAAlerts) obj;
            if (hasId() != sAAlerts.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAAlerts.getId())) || hasType() != sAAlerts.hasType()) {
                return false;
            }
            if ((hasType() && !getType().equals(sAAlerts.getType())) || hasLevel() != sAAlerts.hasLevel()) {
                return false;
            }
            if ((hasLevel() && !getLevel().equals(sAAlerts.getLevel())) || hasTitle() != sAAlerts.hasTitle()) {
                return false;
            }
            if ((!hasTitle() || getTitle().equals(sAAlerts.getTitle())) && hasDetail() == sAAlerts.hasDetail()) {
                return (!hasDetail() || getDetail().equals(sAAlerts.getDetail())) && getUnknownFields().equals(sAAlerts.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WeatherProtos.internal_static_SA_SAAlerts_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public ByteString getDetailBytes() {
            Object obj = this.detail_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.detail_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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
        public Parser<SAAlerts> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 2) != 0 ? GeneratedMessage.computeStringSize(1, this.type_) : 0;
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.level_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.title_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.detail_);
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.id_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public boolean hasDetail() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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
                iHashCode = (((iHashCode * 37) + 5) * 53) + getId().hashCode();
            }
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
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WeatherProtos.internal_static_SA_SAAlerts_fieldAccessorTable.ensureFieldAccessorsInitialized(SAAlerts.class, Builder.class);
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
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.type_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.level_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.title_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.detail_);
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.id_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAAlertsOrBuilder {
            private int bitField0_;
            private Object detail_;
            private Object id_;
            private Object level_;
            private Object title_;
            private Object type_;

            private void buildPartial0(SAAlerts sAAlerts) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAAlerts.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAAlerts.type_ = this.type_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAAlerts.level_ = this.level_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAAlerts.title_ = this.title_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sAAlerts.detail_ = this.detail_;
                    i7 |= 16;
                }
                sAAlerts.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SAAlerts_descriptor;
            }

            public Builder clearDetail() {
                this.detail_ = SAAlerts.getDefaultInstance().getDetail();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SAAlerts.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearLevel() {
                this.level_ = SAAlerts.getDefaultInstance().getLevel();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = SAAlerts.getDefaultInstance().getTitle();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = SAAlerts.getDefaultInstance().getType();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WeatherProtos.internal_static_SA_SAAlerts_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public ByteString getDetailBytes() {
                Object obj = this.detail_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.detail_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public ByteString getLevelBytes() {
                Object obj = this.level_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.level_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public boolean hasDetail() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public boolean hasLevel() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAAlertsOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SAAlerts_fieldAccessorTable.ensureFieldAccessorsInitialized(SAAlerts.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasType() && hasLevel();
            }

            public Builder setDetail(String str) {
                str.getClass();
                this.detail_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDetailBytes(ByteString byteString) {
                byteString.getClass();
                this.detail_ = byteString;
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

            public Builder setLevel(String str) {
                str.getClass();
                this.level_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLevelBytes(ByteString byteString) {
                byteString.getClass();
                this.level_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                byteString.getClass();
                this.type_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.type_ = "";
                this.level_ = "";
                this.title_ = "";
                this.detail_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAAlerts build() {
                SAAlerts sAAlertsBuildPartial = buildPartial();
                if (sAAlertsBuildPartial.isInitialized()) {
                    return sAAlertsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAAlertsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAAlerts buildPartial() {
                SAAlerts sAAlerts = new SAAlerts(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAAlerts);
                }
                onBuilt();
                return sAAlerts;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAAlerts getDefaultInstanceForType() {
                return SAAlerts.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.type_ = "";
                this.level_ = "";
                this.title_ = "";
                this.detail_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAAlerts) {
                    return mergeFrom((SAAlerts) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.type_ = "";
                this.level_ = "";
                this.title_ = "";
                this.detail_ = "";
            }

            public Builder mergeFrom(SAAlerts sAAlerts) {
                if (sAAlerts == SAAlerts.getDefaultInstance()) {
                    return this;
                }
                if (sAAlerts.hasId()) {
                    this.id_ = sAAlerts.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAAlerts.hasType()) {
                    this.type_ = sAAlerts.type_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sAAlerts.hasLevel()) {
                    this.level_ = sAAlerts.level_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sAAlerts.hasTitle()) {
                    this.title_ = sAAlerts.title_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sAAlerts.hasDetail()) {
                    this.detail_ = sAAlerts.detail_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(sAAlerts.getUnknownFields());
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
                                    this.type_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 18) {
                                    this.level_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 26) {
                                    this.title_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 34) {
                                    this.detail_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag != 42) {
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

        private SAAlerts(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.type_ = "";
            this.level_ = "";
            this.title_ = "";
            this.detail_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAAlerts sAAlerts) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAAlerts);
        }

        public static SAAlerts parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAAlerts parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAAlerts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAAlerts parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAAlerts getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAAlerts parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAAlerts parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAAlerts parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAAlerts parseFrom(InputStream inputStream) {
            return (SAAlerts) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SAAlerts() {
            this.id_ = "";
            this.type_ = "";
            this.level_ = "";
            this.title_ = "";
            this.detail_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.type_ = "";
            this.level_ = "";
            this.title_ = "";
            this.detail_ = "";
        }

        public static SAAlerts parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAAlerts) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAAlerts parseFrom(CodedInputStream codedInputStream) {
            return (SAAlerts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAAlerts parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAAlerts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAAlertsOrBuilder extends MessageOrBuilder {
        String getDetail();

        ByteString getDetailBytes();

        String getId();

        ByteString getIdBytes();

        String getLevel();

        ByteString getLevelBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getType();

        ByteString getTypeBytes();

        boolean hasDetail();

        boolean hasId();

        boolean hasLevel();

        boolean hasTitle();

        boolean hasType();
    }

    public static final class SACityKey extends GeneratedMessage implements SACityKeyOrBuilder {
        public static final int CITY_NAME_FIELD_NUMBER = 2;
        private static final SACityKey DEFAULT_INSTANCE;
        public static final int LOCATION_KEY_FIELD_NUMBER = 1;
        private static final Parser<SACityKey> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object cityName_;
        private volatile Object locationKey_;
        private byte memoizedIsInitialized;

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final long serialVersionUID = 0;
            private java.util.List<SACityKey> list_;
            private byte memoizedIsInitialized;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                DEFAULT_INSTANCE = new List();
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.List.1
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
                return SA_WeatherProtos.internal_static_SA_SACityKey_List_descriptor;
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
                return SA_WeatherProtos.internal_static_SA_SACityKey_List_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
            public SACityKey getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
            public java.util.List<SACityKey> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
            public SACityKeyOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
            public java.util.List<? extends SACityKeyOrBuilder> getListOrBuilderList() {
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
                return SA_WeatherProtos.internal_static_SA_SACityKey_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                private RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> listBuilder_;
                private java.util.List<SACityKey> list_;

                private void buildPartial0(List list) {
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SA_WeatherProtos.internal_static_SA_SACityKey_List_descriptor;
                }

                private RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SACityKey> iterable) {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SACityKey sACityKey) {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sACityKey);
                        return this;
                    }
                    sACityKey.getClass();
                    ensureListIsMutable();
                    this.list_.add(sACityKey);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SACityKey.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SA_WeatherProtos.internal_static_SA_SACityKey_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
                public SACityKey getList(int i7) {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SACityKey) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
                public java.util.List<SACityKey> getListList() {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
                public SACityKeyOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SACityKeyOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.ListOrBuilder
                public java.util.List<? extends SACityKeyOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WeatherProtos.internal_static_SA_SACityKey_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SACityKey sACityKey) {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sACityKey);
                        return this;
                    }
                    sACityKey.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sACityKey);
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SACityKey.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SACityKey sACityKey) {
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sACityKey.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sACityKey);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sACityKey);
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
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SACityKey sACityKey = (SACityKey) codedInputStream.readMessage(SACityKey.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SACityKey, Builder, SACityKeyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sACityKey);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sACityKey);
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
            SACityKey getList(int i7);

            int getListCount();

            java.util.List<SACityKey> getListList();

            SACityKeyOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SACityKeyOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SACityKey");
            DEFAULT_INSTANCE = new SACityKey();
            PARSER = new AbstractParser<SACityKey>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKey.1
                @Override // com.google.protobuf.Parser
                public SACityKey parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SACityKey.newBuilder();
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

        public static SACityKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SACityKey_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SACityKey parseDelimitedFrom(InputStream inputStream) {
            return (SACityKey) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SACityKey parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SACityKey> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SACityKey)) {
                return super.equals(obj);
            }
            SACityKey sACityKey = (SACityKey) obj;
            if (hasLocationKey() != sACityKey.hasLocationKey()) {
                return false;
            }
            if ((!hasLocationKey() || getLocationKey().equals(sACityKey.getLocationKey())) && hasCityName() == sACityKey.hasCityName()) {
                return (!hasCityName() || getCityName().equals(sACityKey.getCityName())) && getUnknownFields().equals(sACityKey.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
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
            return SA_WeatherProtos.internal_static_SA_SACityKey_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
        public String getLocationKey() {
            Object obj = this.locationKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.locationKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
        public ByteString getLocationKeyBytes() {
            Object obj = this.locationKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locationKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SACityKey> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.locationKey_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.cityName_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
        public boolean hasCityName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
        public boolean hasLocationKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasLocationKey()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getLocationKey().hashCode();
            }
            if (hasCityName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCityName().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WeatherProtos.internal_static_SA_SACityKey_fieldAccessorTable.ensureFieldAccessorsInitialized(SACityKey.class, Builder.class);
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
            if (hasLocationKey()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.locationKey_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.cityName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SACityKeyOrBuilder {
            private int bitField0_;
            private Object cityName_;
            private Object locationKey_;

            private void buildPartial0(SACityKey sACityKey) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sACityKey.locationKey_ = this.locationKey_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sACityKey.cityName_ = this.cityName_;
                    i7 |= 2;
                }
                sACityKey.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SACityKey_descriptor;
            }

            public Builder clearCityName() {
                this.cityName_ = SACityKey.getDefaultInstance().getCityName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearLocationKey() {
                this.locationKey_ = SACityKey.getDefaultInstance().getLocationKey();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
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
                return SA_WeatherProtos.internal_static_SA_SACityKey_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
            public String getLocationKey() {
                Object obj = this.locationKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.locationKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
            public ByteString getLocationKeyBytes() {
                Object obj = this.locationKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locationKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
            public boolean hasCityName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SACityKeyOrBuilder
            public boolean hasLocationKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SACityKey_fieldAccessorTable.ensureFieldAccessorsInitialized(SACityKey.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLocationKey();
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

            public Builder setLocationKey(String str) {
                str.getClass();
                this.locationKey_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLocationKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.locationKey_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.locationKey_ = "";
                this.cityName_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SACityKey build() {
                SACityKey sACityKeyBuildPartial = buildPartial();
                if (sACityKeyBuildPartial.isInitialized()) {
                    return sACityKeyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sACityKeyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SACityKey buildPartial() {
                SACityKey sACityKey = new SACityKey(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sACityKey);
                }
                onBuilt();
                return sACityKey;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SACityKey getDefaultInstanceForType() {
                return SACityKey.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.locationKey_ = "";
                this.cityName_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.locationKey_ = "";
                this.cityName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SACityKey) {
                    return mergeFrom((SACityKey) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SACityKey sACityKey) {
                if (sACityKey == SACityKey.getDefaultInstance()) {
                    return this;
                }
                if (sACityKey.hasLocationKey()) {
                    this.locationKey_ = sACityKey.locationKey_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sACityKey.hasCityName()) {
                    this.cityName_ = sACityKey.cityName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sACityKey.getUnknownFields());
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
                                    this.locationKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.cityName_ = codedInputStream.readBytes();
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

        private SACityKey(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.locationKey_ = "";
            this.cityName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SACityKey sACityKey) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sACityKey);
        }

        public static SACityKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SACityKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SACityKey) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SACityKey parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SACityKey getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SACityKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SACityKey parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SACityKey() {
            this.locationKey_ = "";
            this.cityName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.locationKey_ = "";
            this.cityName_ = "";
        }

        public static SACityKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SACityKey parseFrom(InputStream inputStream) {
            return (SACityKey) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SACityKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SACityKey) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SACityKey parseFrom(CodedInputStream codedInputStream) {
            return (SACityKey) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SACityKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SACityKey) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SACityKeyOrBuilder extends MessageOrBuilder {
        String getCityName();

        ByteString getCityNameBytes();

        String getLocationKey();

        ByteString getLocationKeyBytes();

        boolean hasCityName();

        boolean hasLocationKey();
    }

    public static final class SASunRiseSet extends GeneratedMessage implements SASunRiseSetOrBuilder {
        private static final SASunRiseSet DEFAULT_INSTANCE;
        private static final Parser<SASunRiseSet> PARSER;
        public static final int SUN_RISE_FIELD_NUMBER = 1;
        public static final int SUN_SET_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object sunRise_;
        private volatile Object sunSet_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SASunRiseSet");
            DEFAULT_INSTANCE = new SASunRiseSet();
            PARSER = new AbstractParser<SASunRiseSet>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSet.1
                @Override // com.google.protobuf.Parser
                public SASunRiseSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SASunRiseSet.newBuilder();
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

        public static SASunRiseSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SASunRiseSet_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SASunRiseSet parseDelimitedFrom(InputStream inputStream) {
            return (SASunRiseSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SASunRiseSet parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SASunRiseSet> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SASunRiseSet)) {
                return super.equals(obj);
            }
            SASunRiseSet sASunRiseSet = (SASunRiseSet) obj;
            if (hasSunRise() != sASunRiseSet.hasSunRise()) {
                return false;
            }
            if ((!hasSunRise() || getSunRise().equals(sASunRiseSet.getSunRise())) && hasSunSet() == sASunRiseSet.hasSunSet()) {
                return (!hasSunSet() || getSunSet().equals(sASunRiseSet.getSunSet())) && getUnknownFields().equals(sASunRiseSet.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WeatherProtos.internal_static_SA_SASunRiseSet_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SASunRiseSet> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.sunRise_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.sunSet_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
        public ByteString getSunRiseBytes() {
            Object obj = this.sunRise_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sunRise_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
        public ByteString getSunSetBytes() {
            Object obj = this.sunSet_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sunSet_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
        public boolean hasSunRise() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
        public boolean hasSunSet() {
            return (this.bitField0_ & 2) != 0;
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
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WeatherProtos.internal_static_SA_SASunRiseSet_fieldAccessorTable.ensureFieldAccessorsInitialized(SASunRiseSet.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.sunRise_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.sunSet_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SASunRiseSetOrBuilder {
            private int bitField0_;
            private Object sunRise_;
            private Object sunSet_;

            private void buildPartial0(SASunRiseSet sASunRiseSet) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sASunRiseSet.sunRise_ = this.sunRise_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sASunRiseSet.sunSet_ = this.sunSet_;
                    i7 |= 2;
                }
                sASunRiseSet.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SASunRiseSet_descriptor;
            }

            public Builder clearSunRise() {
                this.sunRise_ = SASunRiseSet.getDefaultInstance().getSunRise();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSunSet() {
                this.sunSet_ = SASunRiseSet.getDefaultInstance().getSunSet();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WeatherProtos.internal_static_SA_SASunRiseSet_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
            public ByteString getSunRiseBytes() {
                Object obj = this.sunRise_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sunRise_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
            public ByteString getSunSetBytes() {
                Object obj = this.sunSet_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sunSet_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
            public boolean hasSunRise() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SASunRiseSetOrBuilder
            public boolean hasSunSet() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SASunRiseSet_fieldAccessorTable.ensureFieldAccessorsInitialized(SASunRiseSet.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSunRise() && hasSunSet();
            }

            public Builder setSunRise(String str) {
                str.getClass();
                this.sunRise_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSunRiseBytes(ByteString byteString) {
                byteString.getClass();
                this.sunRise_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSunSet(String str) {
                str.getClass();
                this.sunSet_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSunSetBytes(ByteString byteString) {
                byteString.getClass();
                this.sunSet_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.sunRise_ = "";
                this.sunSet_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SASunRiseSet build() {
                SASunRiseSet sASunRiseSetBuildPartial = buildPartial();
                if (sASunRiseSetBuildPartial.isInitialized()) {
                    return sASunRiseSetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sASunRiseSetBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SASunRiseSet buildPartial() {
                SASunRiseSet sASunRiseSet = new SASunRiseSet(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sASunRiseSet);
                }
                onBuilt();
                return sASunRiseSet;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SASunRiseSet getDefaultInstanceForType() {
                return SASunRiseSet.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sunRise_ = "";
                this.sunSet_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.sunRise_ = "";
                this.sunSet_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SASunRiseSet) {
                    return mergeFrom((SASunRiseSet) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SASunRiseSet sASunRiseSet) {
                if (sASunRiseSet == SASunRiseSet.getDefaultInstance()) {
                    return this;
                }
                if (sASunRiseSet.hasSunRise()) {
                    this.sunRise_ = sASunRiseSet.sunRise_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sASunRiseSet.hasSunSet()) {
                    this.sunSet_ = sASunRiseSet.sunSet_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sASunRiseSet.getUnknownFields());
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
                                    this.sunRise_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.sunSet_ = codedInputStream.readBytes();
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

        private SASunRiseSet(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.sunRise_ = "";
            this.sunSet_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SASunRiseSet sASunRiseSet) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sASunRiseSet);
        }

        public static SASunRiseSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SASunRiseSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SASunRiseSet) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SASunRiseSet parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SASunRiseSet getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SASunRiseSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SASunRiseSet parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SASunRiseSet() {
            this.sunRise_ = "";
            this.sunSet_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.sunRise_ = "";
            this.sunSet_ = "";
        }

        public static SASunRiseSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SASunRiseSet parseFrom(InputStream inputStream) {
            return (SASunRiseSet) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SASunRiseSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SASunRiseSet) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SASunRiseSet parseFrom(CodedInputStream codedInputStream) {
            return (SASunRiseSet) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SASunRiseSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SASunRiseSet) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SASunRiseSetOrBuilder extends MessageOrBuilder {
        String getSunRise();

        ByteString getSunRiseBytes();

        String getSunSet();

        ByteString getSunSetBytes();

        boolean hasSunRise();

        boolean hasSunSet();
    }

    public static final class SAWeatherConfig extends GeneratedMessage implements SAWeatherConfigOrBuilder {
        public static final int ALERT_FIELD_NUMBER = 2;
        private static final SAWeatherConfig DEFAULT_INSTANCE;
        private static final Parser<SAWeatherConfig> PARSER;
        public static final int TEMPERATURE_UNIT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int alert_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int temperatureUnit_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWeatherConfig");
            DEFAULT_INSTANCE = new SAWeatherConfig();
            PARSER = new AbstractParser<SAWeatherConfig>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfig.1
                @Override // com.google.protobuf.Parser
                public SAWeatherConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWeatherConfig.newBuilder();
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

        public static SAWeatherConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWeatherConfig parseDelimitedFrom(InputStream inputStream) {
            return (SAWeatherConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWeatherConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWeatherConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWeatherConfig)) {
                return super.equals(obj);
            }
            SAWeatherConfig sAWeatherConfig = (SAWeatherConfig) obj;
            if (hasTemperatureUnit() != sAWeatherConfig.hasTemperatureUnit()) {
                return false;
            }
            if ((!hasTemperatureUnit() || this.temperatureUnit_ == sAWeatherConfig.temperatureUnit_) && hasAlert() == sAWeatherConfig.hasAlert()) {
                return (!hasAlert() || this.alert_ == sAWeatherConfig.alert_) && getUnknownFields().equals(sAWeatherConfig.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
        public CommonProtos.SEOptionalSwitcher getAlert() {
            CommonProtos.SEOptionalSwitcher sEOptionalSwitcherForNumber = CommonProtos.SEOptionalSwitcher.forNumber(this.alert_);
            return sEOptionalSwitcherForNumber == null ? CommonProtos.SEOptionalSwitcher.NO_FEATURE : sEOptionalSwitcherForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherConfig_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAWeatherConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.temperatureUnit_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.alert_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
        public SETemperatureUnit getTemperatureUnit() {
            SETemperatureUnit sETemperatureUnitForNumber = SETemperatureUnit.forNumber(this.temperatureUnit_);
            return sETemperatureUnitForNumber == null ? SETemperatureUnit.NO_UNIT : sETemperatureUnitForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
        public boolean hasAlert() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
        public boolean hasTemperatureUnit() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTemperatureUnit()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.temperatureUnit_;
            }
            if (hasAlert()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.alert_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherConfig.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.temperatureUnit_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.alert_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWeatherConfigOrBuilder {
            private int alert_;
            private int bitField0_;
            private int temperatureUnit_;

            private void buildPartial0(SAWeatherConfig sAWeatherConfig) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAWeatherConfig.temperatureUnit_ = this.temperatureUnit_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAWeatherConfig.alert_ = this.alert_;
                    i7 |= 2;
                }
                sAWeatherConfig.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherConfig_descriptor;
            }

            public Builder clearAlert() {
                this.bitField0_ &= -3;
                this.alert_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTemperatureUnit() {
                this.bitField0_ &= -2;
                this.temperatureUnit_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
            public CommonProtos.SEOptionalSwitcher getAlert() {
                CommonProtos.SEOptionalSwitcher sEOptionalSwitcherForNumber = CommonProtos.SEOptionalSwitcher.forNumber(this.alert_);
                return sEOptionalSwitcherForNumber == null ? CommonProtos.SEOptionalSwitcher.NO_FEATURE : sEOptionalSwitcherForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherConfig_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
            public SETemperatureUnit getTemperatureUnit() {
                SETemperatureUnit sETemperatureUnitForNumber = SETemperatureUnit.forNumber(this.temperatureUnit_);
                return sETemperatureUnitForNumber == null ? SETemperatureUnit.NO_UNIT : sETemperatureUnitForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
            public boolean hasAlert() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherConfigOrBuilder
            public boolean hasTemperatureUnit() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAlert(CommonProtos.SEOptionalSwitcher sEOptionalSwitcher) {
                sEOptionalSwitcher.getClass();
                this.bitField0_ |= 2;
                this.alert_ = sEOptionalSwitcher.getNumber();
                onChanged();
                return this;
            }

            public Builder setTemperatureUnit(SETemperatureUnit sETemperatureUnit) {
                sETemperatureUnit.getClass();
                this.bitField0_ |= 1;
                this.temperatureUnit_ = sETemperatureUnit.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.temperatureUnit_ = 0;
                this.alert_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherConfig build() {
                SAWeatherConfig sAWeatherConfigBuildPartial = buildPartial();
                if (sAWeatherConfigBuildPartial.isInitialized()) {
                    return sAWeatherConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWeatherConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherConfig buildPartial() {
                SAWeatherConfig sAWeatherConfig = new SAWeatherConfig(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWeatherConfig);
                }
                onBuilt();
                return sAWeatherConfig;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWeatherConfig getDefaultInstanceForType() {
                return SAWeatherConfig.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.temperatureUnit_ = 0;
                this.alert_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.temperatureUnit_ = 0;
                this.alert_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWeatherConfig) {
                    return mergeFrom((SAWeatherConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SAWeatherConfig sAWeatherConfig) {
                if (sAWeatherConfig == SAWeatherConfig.getDefaultInstance()) {
                    return this;
                }
                if (sAWeatherConfig.hasTemperatureUnit()) {
                    setTemperatureUnit(sAWeatherConfig.getTemperatureUnit());
                }
                if (sAWeatherConfig.hasAlert()) {
                    setAlert(sAWeatherConfig.getAlert());
                }
                mergeUnknownFields(sAWeatherConfig.getUnknownFields());
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
                                    if (SETemperatureUnit.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.temperatureUnit_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i8 = codedInputStream.readEnum();
                                    if (CommonProtos.SEOptionalSwitcher.forNumber(i8) == null) {
                                        mergeUnknownVarintField(2, i8);
                                    } else {
                                        this.alert_ = i8;
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

        private SAWeatherConfig(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.temperatureUnit_ = 0;
            this.alert_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWeatherConfig sAWeatherConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWeatherConfig);
        }

        public static SAWeatherConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWeatherConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWeatherConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAWeatherConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAWeatherConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SAWeatherConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.temperatureUnit_ = 0;
            this.alert_ = 0;
        }

        public static SAWeatherConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWeatherConfig parseFrom(InputStream inputStream) {
            return (SAWeatherConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWeatherConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherConfig parseFrom(CodedInputStream codedInputStream) {
            return (SAWeatherConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWeatherConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAWeatherConfigOrBuilder extends MessageOrBuilder {
        CommonProtos.SEOptionalSwitcher getAlert();

        SETemperatureUnit getTemperatureUnit();

        boolean hasAlert();

        boolean hasTemperatureUnit();
    }

    public static final class SAWeatherForecast extends GeneratedMessage implements SAWeatherForecastOrBuilder {
        public static final int DATA_LIST_FIELD_NUMBER = 2;
        private static final SAWeatherForecast DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAWeatherForecast> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Data.List dataList_;
        private SAWeatherId id_;
        private byte memoizedIsInitialized;

        public static final class Data extends GeneratedMessage implements DataOrBuilder {
            public static final int AQI_FIELD_NUMBER = 1;
            private static final Data DEFAULT_INSTANCE;
            private static final Parser<Data> PARSER;
            public static final int SUN_RISE_SET_FIELD_NUMBER = 5;
            public static final int TEMPERATURE_FIELD_NUMBER = 3;
            public static final int TEMPERATURE_UNIT_FIELD_NUMBER = 4;
            public static final int WEATHER_FIELD_NUMBER = 2;
            public static final int WIND_INFO_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private CommonProtos.SEKeyValue aqi_;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private SASunRiseSet sunRiseSet_;
            private volatile Object temperatureUnit_;
            private CommonProtos.SERangeValue temperature_;
            private CommonProtos.SERangeValue weather_;
            private CommonProtos.SEKeyValue windInfo_;

            public static final class List extends GeneratedMessage implements ListOrBuilder {
                private static final List DEFAULT_INSTANCE;
                public static final int LIST_FIELD_NUMBER = 1;
                private static final Parser<List> PARSER;
                private static final long serialVersionUID = 0;
                private java.util.List<Data> list_;
                private byte memoizedIsInitialized;

                static {
                    RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                    DEFAULT_INSTANCE = new List();
                    PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.List.1
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
                    return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_List_descriptor;
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
                    return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                public Data getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                public java.util.List<Data> getListList() {
                    return this.list_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                public DataOrBuilder getListOrBuilder(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
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
                    return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    private RepeatedFieldBuilder<Data, Builder, DataOrBuilder> listBuilder_;
                    private java.util.List<Data> list_;

                    private void buildPartial0(List list) {
                    }

                    private void buildPartialRepeatedFields(List list) {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_List_descriptor;
                    }

                    private RepeatedFieldBuilder<Data, Builder, DataOrBuilder> internalGetListFieldBuilder() {
                        if (this.listBuilder_ == null) {
                            this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.list_ = null;
                        }
                        return this.listBuilder_;
                    }

                    public Builder addAllList(Iterable<? extends Data> iterable) {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.addAllMessages(iterable);
                            return this;
                        }
                        ensureListIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                        onChanged();
                        return this;
                    }

                    public Builder addList(Data data) {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.addMessage(data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.add(data);
                        onChanged();
                        return this;
                    }

                    public Builder addListBuilder() {
                        return (Builder) internalGetListFieldBuilder().addBuilder(Data.getDefaultInstance());
                    }

                    public Builder clearList() {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_List_descriptor;
                    }

                    @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                    public Data getList(int i7) {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.get(i7) : (Data) repeatedFieldBuilder.getMessage(i7);
                    }

                    public Builder getListBuilder(int i7) {
                        return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                    }

                    public java.util.List<Builder> getListBuilderList() {
                        return internalGetListFieldBuilder().getBuilderList();
                    }

                    @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                    public int getListCount() {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                    }

                    @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                    public java.util.List<Data> getListList() {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                    }

                    @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                    public DataOrBuilder getListOrBuilder(int i7) {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder == null ? this.list_.get(i7) : (DataOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                    }

                    @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.ListOrBuilder
                    public java.util.List<? extends DataOrBuilder> getListOrBuilderList() {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                        return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.remove(i7);
                            return this;
                        }
                        ensureListIsMutable();
                        this.list_.remove(i7);
                        onChanged();
                        return this;
                    }

                    public Builder setList(int i7, Data data) {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder != null) {
                            repeatedFieldBuilder.setMessage(i7, data);
                            return this;
                        }
                        data.getClass();
                        ensureListIsMutable();
                        this.list_.set(i7, data);
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
                        return (Builder) internalGetListFieldBuilder().addBuilder(i7, Data.getDefaultInstance());
                    }

                    private Builder(AbstractMessage.BuilderParent builderParent) {
                        super(builderParent);
                        this.list_ = Collections.EMPTY_LIST;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.bitField0_ = 0;
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder == null) {
                            this.list_ = Collections.EMPTY_LIST;
                        } else {
                            this.list_ = null;
                            repeatedFieldBuilder.clear();
                        }
                        this.bitField0_ &= -2;
                        return this;
                    }

                    public Builder addList(int i7, Data data) {
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                        if (repeatedFieldBuilder == null) {
                            data.getClass();
                            ensureListIsMutable();
                            this.list_.add(i7, data);
                            onChanged();
                            return this;
                        }
                        repeatedFieldBuilder.addMessage(i7, data);
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
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                        RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                            Data data = (Data) codedInputStream.readMessage(Data.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilder<Data, Builder, DataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                            if (repeatedFieldBuilder == null) {
                                                ensureListIsMutable();
                                                this.list_.add(data);
                                            } else {
                                                repeatedFieldBuilder.addMessage(data);
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
                Data getList(int i7);

                int getListCount();

                java.util.List<Data> getListList();

                DataOrBuilder getListOrBuilder(int i7);

                java.util.List<? extends DataOrBuilder> getListOrBuilderList();
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Data");
                DEFAULT_INSTANCE = new Data();
                PARSER = new AbstractParser<Data>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.Data.1
                    @Override // com.google.protobuf.Parser
                    public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = Data.newBuilder();
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

            public static Data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Data parseDelimitedFrom(InputStream inputStream) {
                return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Data parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
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
                if (hasAqi() != data.hasAqi()) {
                    return false;
                }
                if ((hasAqi() && !getAqi().equals(data.getAqi())) || hasWeather() != data.hasWeather()) {
                    return false;
                }
                if ((hasWeather() && !getWeather().equals(data.getWeather())) || hasTemperature() != data.hasTemperature()) {
                    return false;
                }
                if ((hasTemperature() && !getTemperature().equals(data.getTemperature())) || hasTemperatureUnit() != data.hasTemperatureUnit()) {
                    return false;
                }
                if ((hasTemperatureUnit() && !getTemperatureUnit().equals(data.getTemperatureUnit())) || hasSunRiseSet() != data.hasSunRiseSet()) {
                    return false;
                }
                if ((!hasSunRiseSet() || getSunRiseSet().equals(data.getSunRiseSet())) && hasWindInfo() == data.hasWindInfo()) {
                    return (!hasWindInfo() || getWindInfo().equals(data.getWindInfo())) && getUnknownFields().equals(data.getUnknownFields());
                }
                return false;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SEKeyValue getAqi() {
                CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SEKeyValueOrBuilder getAqiOrBuilder() {
                CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_descriptor;
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
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAqi()) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getWeather());
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getTemperature());
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeMessageSize += GeneratedMessage.computeStringSize(4, this.temperatureUnit_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSunRiseSet());
                }
                if ((this.bitField0_ & 32) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getWindInfo());
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public SASunRiseSet getSunRiseSet() {
                SASunRiseSet sASunRiseSet = this.sunRiseSet_;
                return sASunRiseSet == null ? SASunRiseSet.getDefaultInstance() : sASunRiseSet;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public SASunRiseSetOrBuilder getSunRiseSetOrBuilder() {
                SASunRiseSet sASunRiseSet = this.sunRiseSet_;
                return sASunRiseSet == null ? SASunRiseSet.getDefaultInstance() : sASunRiseSet;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SERangeValue getTemperature() {
                CommonProtos.SERangeValue sERangeValue = this.temperature_;
                return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SERangeValueOrBuilder getTemperatureOrBuilder() {
                CommonProtos.SERangeValue sERangeValue = this.temperature_;
                return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public ByteString getTemperatureUnitBytes() {
                Object obj = this.temperatureUnit_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.temperatureUnit_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SERangeValue getWeather() {
                CommonProtos.SERangeValue sERangeValue = this.weather_;
                return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SERangeValueOrBuilder getWeatherOrBuilder() {
                CommonProtos.SERangeValue sERangeValue = this.weather_;
                return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SEKeyValue getWindInfo() {
                CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public CommonProtos.SEKeyValueOrBuilder getWindInfoOrBuilder() {
                CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public boolean hasAqi() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public boolean hasSunRiseSet() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public boolean hasTemperature() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public boolean hasTemperatureUnit() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public boolean hasWeather() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
            public boolean hasWindInfo() {
                return (this.bitField0_ & 32) != 0;
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
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWeather().hashCode();
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
                if (hasWindInfo()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getWindInfo().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
                if (!hasAqi()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!getAqi().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasWeather() && !getWeather().isInitialized()) {
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
                if (!hasWindInfo() || getWindInfo().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getAqi());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(2, getWeather());
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeMessage(3, getTemperature());
                }
                if ((this.bitField0_ & 8) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 4, this.temperatureUnit_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeMessage(5, getSunRiseSet());
                }
                if ((this.bitField0_ & 32) != 0) {
                    codedOutputStream.writeMessage(6, getWindInfo());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements DataOrBuilder {
                private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> aqiBuilder_;
                private CommonProtos.SEKeyValue aqi_;
                private int bitField0_;
                private SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> sunRiseSetBuilder_;
                private SASunRiseSet sunRiseSet_;
                private SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> temperatureBuilder_;
                private Object temperatureUnit_;
                private CommonProtos.SERangeValue temperature_;
                private SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> weatherBuilder_;
                private CommonProtos.SERangeValue weather_;
                private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> windInfoBuilder_;
                private CommonProtos.SEKeyValue windInfo_;

                private void buildPartial0(Data data) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                        data.aqi_ = singleFieldBuilder == null ? this.aqi_ : (CommonProtos.SEKeyValue) singleFieldBuilder.build();
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder2 = this.weatherBuilder_;
                        data.weather_ = singleFieldBuilder2 == null ? this.weather_ : (CommonProtos.SERangeValue) singleFieldBuilder2.build();
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder3 = this.temperatureBuilder_;
                        data.temperature_ = singleFieldBuilder3 == null ? this.temperature_ : (CommonProtos.SERangeValue) singleFieldBuilder3.build();
                        i7 |= 4;
                    }
                    if ((i8 & 8) != 0) {
                        data.temperatureUnit_ = this.temperatureUnit_;
                        i7 |= 8;
                    }
                    if ((i8 & 16) != 0) {
                        SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder4 = this.sunRiseSetBuilder_;
                        data.sunRiseSet_ = singleFieldBuilder4 == null ? this.sunRiseSet_ : (SASunRiseSet) singleFieldBuilder4.build();
                        i7 |= 16;
                    }
                    if ((i8 & 32) != 0) {
                        SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder5 = this.windInfoBuilder_;
                        data.windInfo_ = singleFieldBuilder5 == null ? this.windInfo_ : (CommonProtos.SEKeyValue) singleFieldBuilder5.build();
                        i7 |= 32;
                    }
                    data.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_descriptor;
                }

                private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> internalGetAqiFieldBuilder() {
                    if (this.aqiBuilder_ == null) {
                        this.aqiBuilder_ = new SingleFieldBuilder<>(getAqi(), getParentForChildren(), isClean());
                        this.aqi_ = null;
                    }
                    return this.aqiBuilder_;
                }

                private SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> internalGetSunRiseSetFieldBuilder() {
                    if (this.sunRiseSetBuilder_ == null) {
                        this.sunRiseSetBuilder_ = new SingleFieldBuilder<>(getSunRiseSet(), getParentForChildren(), isClean());
                        this.sunRiseSet_ = null;
                    }
                    return this.sunRiseSetBuilder_;
                }

                private SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> internalGetTemperatureFieldBuilder() {
                    if (this.temperatureBuilder_ == null) {
                        this.temperatureBuilder_ = new SingleFieldBuilder<>(getTemperature(), getParentForChildren(), isClean());
                        this.temperature_ = null;
                    }
                    return this.temperatureBuilder_;
                }

                private SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> internalGetWeatherFieldBuilder() {
                    if (this.weatherBuilder_ == null) {
                        this.weatherBuilder_ = new SingleFieldBuilder<>(getWeather(), getParentForChildren(), isClean());
                        this.weather_ = null;
                    }
                    return this.weatherBuilder_;
                }

                private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> internalGetWindInfoFieldBuilder() {
                    if (this.windInfoBuilder_ == null) {
                        this.windInfoBuilder_ = new SingleFieldBuilder<>(getWindInfo(), getParentForChildren(), isClean());
                        this.windInfo_ = null;
                    }
                    return this.windInfoBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        internalGetAqiFieldBuilder();
                        internalGetWeatherFieldBuilder();
                        internalGetTemperatureFieldBuilder();
                        internalGetSunRiseSetFieldBuilder();
                        internalGetWindInfoFieldBuilder();
                    }
                }

                public Builder clearAqi() {
                    this.bitField0_ &= -2;
                    this.aqi_ = null;
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.aqiBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearSunRiseSet() {
                    this.bitField0_ &= -17;
                    this.sunRiseSet_ = null;
                    SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder = this.sunRiseSetBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.sunRiseSetBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearTemperature() {
                    this.bitField0_ &= -5;
                    this.temperature_ = null;
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.temperatureBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearTemperatureUnit() {
                    this.temperatureUnit_ = Data.getDefaultInstance().getTemperatureUnit();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearWeather() {
                    this.bitField0_ &= -3;
                    this.weather_ = null;
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.weatherBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.weatherBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearWindInfo() {
                    this.bitField0_ &= -33;
                    this.windInfo_ = null;
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.windInfoBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SEKeyValue getAqi() {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SEKeyValue) singleFieldBuilder.getMessage();
                    }
                    CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
                    return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
                }

                public CommonProtos.SEKeyValue.Builder getAqiBuilder() {
                    this.bitField0_ |= 1;
                    onChanged();
                    return (CommonProtos.SEKeyValue.Builder) internalGetAqiFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SEKeyValueOrBuilder getAqiOrBuilder() {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SEKeyValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
                    return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public SASunRiseSet getSunRiseSet() {
                    SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder = this.sunRiseSetBuilder_;
                    if (singleFieldBuilder != null) {
                        return (SASunRiseSet) singleFieldBuilder.getMessage();
                    }
                    SASunRiseSet sASunRiseSet = this.sunRiseSet_;
                    return sASunRiseSet == null ? SASunRiseSet.getDefaultInstance() : sASunRiseSet;
                }

                public SASunRiseSet.Builder getSunRiseSetBuilder() {
                    this.bitField0_ |= 16;
                    onChanged();
                    return (SASunRiseSet.Builder) internalGetSunRiseSetFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public SASunRiseSetOrBuilder getSunRiseSetOrBuilder() {
                    SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder = this.sunRiseSetBuilder_;
                    if (singleFieldBuilder != null) {
                        return (SASunRiseSetOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    SASunRiseSet sASunRiseSet = this.sunRiseSet_;
                    return sASunRiseSet == null ? SASunRiseSet.getDefaultInstance() : sASunRiseSet;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SERangeValue getTemperature() {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SERangeValue) singleFieldBuilder.getMessage();
                    }
                    CommonProtos.SERangeValue sERangeValue = this.temperature_;
                    return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
                }

                public CommonProtos.SERangeValue.Builder getTemperatureBuilder() {
                    this.bitField0_ |= 4;
                    onChanged();
                    return (CommonProtos.SERangeValue.Builder) internalGetTemperatureFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SERangeValueOrBuilder getTemperatureOrBuilder() {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SERangeValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    CommonProtos.SERangeValue sERangeValue = this.temperature_;
                    return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
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

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public ByteString getTemperatureUnitBytes() {
                    Object obj = this.temperatureUnit_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.temperatureUnit_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SERangeValue getWeather() {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.weatherBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SERangeValue) singleFieldBuilder.getMessage();
                    }
                    CommonProtos.SERangeValue sERangeValue = this.weather_;
                    return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
                }

                public CommonProtos.SERangeValue.Builder getWeatherBuilder() {
                    this.bitField0_ |= 2;
                    onChanged();
                    return (CommonProtos.SERangeValue.Builder) internalGetWeatherFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SERangeValueOrBuilder getWeatherOrBuilder() {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.weatherBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SERangeValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    CommonProtos.SERangeValue sERangeValue = this.weather_;
                    return sERangeValue == null ? CommonProtos.SERangeValue.getDefaultInstance() : sERangeValue;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SEKeyValue getWindInfo() {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SEKeyValue) singleFieldBuilder.getMessage();
                    }
                    CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
                    return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
                }

                public CommonProtos.SEKeyValue.Builder getWindInfoBuilder() {
                    this.bitField0_ |= 32;
                    onChanged();
                    return (CommonProtos.SEKeyValue.Builder) internalGetWindInfoFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public CommonProtos.SEKeyValueOrBuilder getWindInfoOrBuilder() {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SEKeyValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
                    return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public boolean hasAqi() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public boolean hasSunRiseSet() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public boolean hasTemperature() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public boolean hasTemperatureUnit() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public boolean hasWeather() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.DataOrBuilder
                public boolean hasWindInfo() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (!hasAqi() || !getAqi().isInitialized()) {
                        return false;
                    }
                    if (hasWeather() && !getWeather().isInitialized()) {
                        return false;
                    }
                    if (hasTemperature() && !getTemperature().isInitialized()) {
                        return false;
                    }
                    if (!hasSunRiseSet() || getSunRiseSet().isInitialized()) {
                        return !hasWindInfo() || getWindInfo().isInitialized();
                    }
                    return false;
                }

                public Builder mergeAqi(CommonProtos.SEKeyValue sEKeyValue) {
                    CommonProtos.SEKeyValue sEKeyValue2;
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sEKeyValue);
                    } else if ((this.bitField0_ & 1) == 0 || (sEKeyValue2 = this.aqi_) == null || sEKeyValue2 == CommonProtos.SEKeyValue.getDefaultInstance()) {
                        this.aqi_ = sEKeyValue;
                    } else {
                        getAqiBuilder().mergeFrom(sEKeyValue);
                    }
                    if (this.aqi_ != null) {
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    return this;
                }

                public Builder mergeSunRiseSet(SASunRiseSet sASunRiseSet) {
                    SASunRiseSet sASunRiseSet2;
                    SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder = this.sunRiseSetBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sASunRiseSet);
                    } else if ((this.bitField0_ & 16) == 0 || (sASunRiseSet2 = this.sunRiseSet_) == null || sASunRiseSet2 == SASunRiseSet.getDefaultInstance()) {
                        this.sunRiseSet_ = sASunRiseSet;
                    } else {
                        getSunRiseSetBuilder().mergeFrom(sASunRiseSet);
                    }
                    if (this.sunRiseSet_ != null) {
                        this.bitField0_ |= 16;
                        onChanged();
                    }
                    return this;
                }

                public Builder mergeTemperature(CommonProtos.SERangeValue sERangeValue) {
                    CommonProtos.SERangeValue sERangeValue2;
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sERangeValue);
                    } else if ((this.bitField0_ & 4) == 0 || (sERangeValue2 = this.temperature_) == null || sERangeValue2 == CommonProtos.SERangeValue.getDefaultInstance()) {
                        this.temperature_ = sERangeValue;
                    } else {
                        getTemperatureBuilder().mergeFrom(sERangeValue);
                    }
                    if (this.temperature_ != null) {
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    return this;
                }

                public Builder mergeWeather(CommonProtos.SERangeValue sERangeValue) {
                    CommonProtos.SERangeValue sERangeValue2;
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.weatherBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sERangeValue);
                    } else if ((this.bitField0_ & 2) == 0 || (sERangeValue2 = this.weather_) == null || sERangeValue2 == CommonProtos.SERangeValue.getDefaultInstance()) {
                        this.weather_ = sERangeValue;
                    } else {
                        getWeatherBuilder().mergeFrom(sERangeValue);
                    }
                    if (this.weather_ != null) {
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    return this;
                }

                public Builder mergeWindInfo(CommonProtos.SEKeyValue sEKeyValue) {
                    CommonProtos.SEKeyValue sEKeyValue2;
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sEKeyValue);
                    } else if ((this.bitField0_ & 32) == 0 || (sEKeyValue2 = this.windInfo_) == null || sEKeyValue2 == CommonProtos.SEKeyValue.getDefaultInstance()) {
                        this.windInfo_ = sEKeyValue;
                    } else {
                        getWindInfoBuilder().mergeFrom(sEKeyValue);
                    }
                    if (this.windInfo_ != null) {
                        this.bitField0_ |= 32;
                        onChanged();
                    }
                    return this;
                }

                public Builder setAqi(CommonProtos.SEKeyValue sEKeyValue) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                    if (singleFieldBuilder == null) {
                        sEKeyValue.getClass();
                        this.aqi_ = sEKeyValue;
                    } else {
                        singleFieldBuilder.setMessage(sEKeyValue);
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setSunRiseSet(SASunRiseSet sASunRiseSet) {
                    SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder = this.sunRiseSetBuilder_;
                    if (singleFieldBuilder == null) {
                        sASunRiseSet.getClass();
                        this.sunRiseSet_ = sASunRiseSet;
                    } else {
                        singleFieldBuilder.setMessage(sASunRiseSet);
                    }
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setTemperature(CommonProtos.SERangeValue sERangeValue) {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                    if (singleFieldBuilder == null) {
                        sERangeValue.getClass();
                        this.temperature_ = sERangeValue;
                    } else {
                        singleFieldBuilder.setMessage(sERangeValue);
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setTemperatureUnit(String str) {
                    str.getClass();
                    this.temperatureUnit_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setTemperatureUnitBytes(ByteString byteString) {
                    byteString.getClass();
                    this.temperatureUnit_ = byteString;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setWeather(CommonProtos.SERangeValue sERangeValue) {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.weatherBuilder_;
                    if (singleFieldBuilder == null) {
                        sERangeValue.getClass();
                        this.weather_ = sERangeValue;
                    } else {
                        singleFieldBuilder.setMessage(sERangeValue);
                    }
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setWindInfo(CommonProtos.SEKeyValue sEKeyValue) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                    if (singleFieldBuilder == null) {
                        sEKeyValue.getClass();
                        this.windInfo_ = sEKeyValue;
                    } else {
                        singleFieldBuilder.setMessage(sEKeyValue);
                    }
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.temperatureUnit_ = "";
                    maybeForceBuilderInitialization();
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
                    if (this.bitField0_ != 0) {
                        buildPartial0(data);
                    }
                    onBuilt();
                    return data;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Data getDefaultInstanceForType() {
                    return Data.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.aqi_ = null;
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.aqiBuilder_ = null;
                    }
                    this.weather_ = null;
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder2 = this.weatherBuilder_;
                    if (singleFieldBuilder2 != null) {
                        singleFieldBuilder2.dispose();
                        this.weatherBuilder_ = null;
                    }
                    this.temperature_ = null;
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder3 = this.temperatureBuilder_;
                    if (singleFieldBuilder3 != null) {
                        singleFieldBuilder3.dispose();
                        this.temperatureBuilder_ = null;
                    }
                    this.temperatureUnit_ = "";
                    this.sunRiseSet_ = null;
                    SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder4 = this.sunRiseSetBuilder_;
                    if (singleFieldBuilder4 != null) {
                        singleFieldBuilder4.dispose();
                        this.sunRiseSetBuilder_ = null;
                    }
                    this.windInfo_ = null;
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder5 = this.windInfoBuilder_;
                    if (singleFieldBuilder5 != null) {
                        singleFieldBuilder5.dispose();
                        this.windInfoBuilder_ = null;
                    }
                    return this;
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.temperatureUnit_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Data) {
                        return mergeFrom((Data) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAqi(CommonProtos.SEKeyValue.Builder builder) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                    if (singleFieldBuilder == null) {
                        this.aqi_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setSunRiseSet(SASunRiseSet.Builder builder) {
                    SingleFieldBuilder<SASunRiseSet, SASunRiseSet.Builder, SASunRiseSetOrBuilder> singleFieldBuilder = this.sunRiseSetBuilder_;
                    if (singleFieldBuilder == null) {
                        this.sunRiseSet_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setTemperature(CommonProtos.SERangeValue.Builder builder) {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                    if (singleFieldBuilder == null) {
                        this.temperature_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setWeather(CommonProtos.SERangeValue.Builder builder) {
                    SingleFieldBuilder<CommonProtos.SERangeValue, CommonProtos.SERangeValue.Builder, CommonProtos.SERangeValueOrBuilder> singleFieldBuilder = this.weatherBuilder_;
                    if (singleFieldBuilder == null) {
                        this.weather_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setWindInfo(CommonProtos.SEKeyValue.Builder builder) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                    if (singleFieldBuilder == null) {
                        this.windInfo_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 32;
                    onChanged();
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
                        mergeWeather(data.getWeather());
                    }
                    if (data.hasTemperature()) {
                        mergeTemperature(data.getTemperature());
                    }
                    if (data.hasTemperatureUnit()) {
                        this.temperatureUnit_ = data.temperatureUnit_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    if (data.hasSunRiseSet()) {
                        mergeSunRiseSet(data.getSunRiseSet());
                    }
                    if (data.hasWindInfo()) {
                        mergeWindInfo(data.getWindInfo());
                    }
                    mergeUnknownFields(data.getUnknownFields());
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
                                        codedInputStream.readMessage(internalGetAqiFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(internalGetWeatherFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 2;
                                    } else if (tag == 26) {
                                        codedInputStream.readMessage(internalGetTemperatureFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 4;
                                    } else if (tag == 34) {
                                        this.temperatureUnit_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 8;
                                    } else if (tag == 42) {
                                        codedInputStream.readMessage(internalGetSunRiseSetFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 16;
                                    } else if (tag != 50) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        codedInputStream.readMessage(internalGetWindInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            private Data(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.temperatureUnit_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Data data) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
            }

            public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Data parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Data() {
                this.temperatureUnit_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.temperatureUnit_ = "";
            }

            public static Data parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Data parseFrom(InputStream inputStream) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Data parseFrom(CodedInputStream codedInputStream) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface DataOrBuilder extends MessageOrBuilder {
            CommonProtos.SEKeyValue getAqi();

            CommonProtos.SEKeyValueOrBuilder getAqiOrBuilder();

            SASunRiseSet getSunRiseSet();

            SASunRiseSetOrBuilder getSunRiseSetOrBuilder();

            CommonProtos.SERangeValue getTemperature();

            CommonProtos.SERangeValueOrBuilder getTemperatureOrBuilder();

            String getTemperatureUnit();

            ByteString getTemperatureUnitBytes();

            CommonProtos.SERangeValue getWeather();

            CommonProtos.SERangeValueOrBuilder getWeatherOrBuilder();

            CommonProtos.SEKeyValue getWindInfo();

            CommonProtos.SEKeyValueOrBuilder getWindInfoOrBuilder();

            boolean hasAqi();

            boolean hasSunRiseSet();

            boolean hasTemperature();

            boolean hasTemperatureUnit();

            boolean hasWeather();

            boolean hasWindInfo();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWeatherForecast");
            DEFAULT_INSTANCE = new SAWeatherForecast();
            PARSER = new AbstractParser<SAWeatherForecast>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecast.1
                @Override // com.google.protobuf.Parser
                public SAWeatherForecast parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWeatherForecast.newBuilder();
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

        public static SAWeatherForecast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWeatherForecast parseDelimitedFrom(InputStream inputStream) {
            return (SAWeatherForecast) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWeatherForecast parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWeatherForecast> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWeatherForecast)) {
                return super.equals(obj);
            }
            SAWeatherForecast sAWeatherForecast = (SAWeatherForecast) obj;
            if (hasId() != sAWeatherForecast.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(sAWeatherForecast.getId())) && hasDataList() == sAWeatherForecast.hasDataList()) {
                return (!hasDataList() || getDataList().equals(sAWeatherForecast.getDataList())) && getUnknownFields().equals(sAWeatherForecast.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
        public Data.List getDataList() {
            Data.List list = this.dataList_;
            return list == null ? Data.List.getDefaultInstance() : list;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
        public Data.ListOrBuilder getDataListOrBuilder() {
            Data.List list = this.dataList_;
            return list == null ? Data.List.getDefaultInstance() : list;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
        public SAWeatherId getId() {
            SAWeatherId sAWeatherId = this.id_;
            return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
        public SAWeatherIdOrBuilder getIdOrBuilder() {
            SAWeatherId sAWeatherId = this.id_;
            return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAWeatherForecast> getParserForType() {
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
        public boolean hasDataList() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
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
            return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherForecast.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getId());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDataList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWeatherForecastOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> dataListBuilder_;
            private Data.List dataList_;
            private SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> idBuilder_;
            private SAWeatherId id_;

            private void buildPartial0(SAWeatherForecast sAWeatherForecast) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                    sAWeatherForecast.id_ = singleFieldBuilder == null ? this.id_ : (SAWeatherId) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder2 = this.dataListBuilder_;
                    sAWeatherForecast.dataList_ = singleFieldBuilder2 == null ? this.dataList_ : (Data.List) singleFieldBuilder2.build();
                    i7 |= 2;
                }
                sAWeatherForecast.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_descriptor;
            }

            private SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> internalGetDataListFieldBuilder() {
                if (this.dataListBuilder_ == null) {
                    this.dataListBuilder_ = new SingleFieldBuilder<>(getDataList(), getParentForChildren(), isClean());
                    this.dataList_ = null;
                }
                return this.dataListBuilder_;
            }

            private SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> internalGetIdFieldBuilder() {
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
                SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
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
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
            public Data.List getDataList() {
                SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (Data.List) singleFieldBuilder.getMessage();
                }
                Data.List list = this.dataList_;
                return list == null ? Data.List.getDefaultInstance() : list;
            }

            public Data.List.Builder getDataListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Data.List.Builder) internalGetDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
            public Data.ListOrBuilder getDataListOrBuilder() {
                SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (Data.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                Data.List list = this.dataList_;
                return list == null ? Data.List.getDefaultInstance() : list;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
            public SAWeatherId getId() {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWeatherId) singleFieldBuilder.getMessage();
                }
                SAWeatherId sAWeatherId = this.id_;
                return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
            }

            public SAWeatherId.Builder getIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SAWeatherId.Builder) internalGetIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
            public SAWeatherIdOrBuilder getIdOrBuilder() {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWeatherIdOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SAWeatherId sAWeatherId = this.id_;
                return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
            public boolean hasDataList() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherForecastOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherForecast_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherForecast.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasDataList() && getId().isInitialized() && getDataList().isInitialized();
            }

            public Builder mergeDataList(Data.List list) {
                Data.List list2;
                SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(list);
                } else if ((this.bitField0_ & 2) == 0 || (list2 = this.dataList_) == null || list2 == Data.List.getDefaultInstance()) {
                    this.dataList_ = list;
                } else {
                    getDataListBuilder().mergeFrom(list);
                }
                if (this.dataList_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeId(SAWeatherId sAWeatherId) {
                SAWeatherId sAWeatherId2;
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sAWeatherId);
                } else if ((this.bitField0_ & 1) == 0 || (sAWeatherId2 = this.id_) == null || sAWeatherId2 == SAWeatherId.getDefaultInstance()) {
                    this.id_ = sAWeatherId;
                } else {
                    getIdBuilder().mergeFrom(sAWeatherId);
                }
                if (this.id_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setDataList(Data.List list) {
                SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.dataList_ = list;
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(SAWeatherId sAWeatherId) {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    sAWeatherId.getClass();
                    this.id_ = sAWeatherId;
                } else {
                    singleFieldBuilder.setMessage(sAWeatherId);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherForecast build() {
                SAWeatherForecast sAWeatherForecastBuildPartial = buildPartial();
                if (sAWeatherForecastBuildPartial.isInitialized()) {
                    return sAWeatherForecastBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWeatherForecastBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherForecast buildPartial() {
                SAWeatherForecast sAWeatherForecast = new SAWeatherForecast(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWeatherForecast);
                }
                onBuilt();
                return sAWeatherForecast;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWeatherForecast getDefaultInstanceForType() {
                return SAWeatherForecast.getDefaultInstance();
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
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                this.dataList_ = null;
                SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder2 = this.dataListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.dataListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWeatherForecast) {
                    return mergeFrom((SAWeatherForecast) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDataList(Data.List.Builder builder) {
                SingleFieldBuilder<Data.List, Data.List.Builder, Data.ListOrBuilder> singleFieldBuilder = this.dataListBuilder_;
                if (singleFieldBuilder == null) {
                    this.dataList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(SAWeatherId.Builder builder) {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    this.id_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SAWeatherForecast sAWeatherForecast) {
                if (sAWeatherForecast == SAWeatherForecast.getDefaultInstance()) {
                    return this;
                }
                if (sAWeatherForecast.hasId()) {
                    mergeId(sAWeatherForecast.getId());
                }
                if (sAWeatherForecast.hasDataList()) {
                    mergeDataList(sAWeatherForecast.getDataList());
                }
                mergeUnknownFields(sAWeatherForecast.getUnknownFields());
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

        private SAWeatherForecast(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWeatherForecast sAWeatherForecast) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWeatherForecast);
        }

        public static SAWeatherForecast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWeatherForecast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherForecast) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherForecast parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWeatherForecast getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SAWeatherForecast() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SAWeatherForecast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAWeatherForecast parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAWeatherForecast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWeatherForecast parseFrom(InputStream inputStream) {
            return (SAWeatherForecast) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWeatherForecast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherForecast) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherForecast parseFrom(CodedInputStream codedInputStream) {
            return (SAWeatherForecast) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWeatherForecast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherForecast) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAWeatherForecastOrBuilder extends MessageOrBuilder {
        SAWeatherForecast.Data.List getDataList();

        SAWeatherForecast.Data.ListOrBuilder getDataListOrBuilder();

        SAWeatherId getId();

        SAWeatherIdOrBuilder getIdOrBuilder();

        boolean hasDataList();

        boolean hasId();
    }

    public static final class SAWeatherId extends GeneratedMessage implements SAWeatherIdOrBuilder {
        public static final int CITY_NAME_FIELD_NUMBER = 2;
        private static final SAWeatherId DEFAULT_INSTANCE;
        public static final int IS_CURRENT_LOCATION_FIELD_NUMBER = 5;
        public static final int LOCATION_KEY_FIELD_NUMBER = 4;
        public static final int LOCATION_NAME_FIELD_NUMBER = 3;
        private static final Parser<SAWeatherId> PARSER;
        public static final int PUB_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object cityName_;
        private boolean isCurrentLocation_;
        private volatile Object locationKey_;
        private volatile Object locationName_;
        private byte memoizedIsInitialized;
        private volatile Object pubTime_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWeatherId");
            DEFAULT_INSTANCE = new SAWeatherId();
            PARSER = new AbstractParser<SAWeatherId>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherId.1
                @Override // com.google.protobuf.Parser
                public SAWeatherId parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWeatherId.newBuilder();
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

        public static SAWeatherId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherId_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWeatherId parseDelimitedFrom(InputStream inputStream) {
            return (SAWeatherId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWeatherId parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWeatherId> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWeatherId)) {
                return super.equals(obj);
            }
            SAWeatherId sAWeatherId = (SAWeatherId) obj;
            if (hasPubTime() != sAWeatherId.hasPubTime()) {
                return false;
            }
            if ((hasPubTime() && !getPubTime().equals(sAWeatherId.getPubTime())) || hasCityName() != sAWeatherId.hasCityName()) {
                return false;
            }
            if ((hasCityName() && !getCityName().equals(sAWeatherId.getCityName())) || hasLocationName() != sAWeatherId.hasLocationName()) {
                return false;
            }
            if ((hasLocationName() && !getLocationName().equals(sAWeatherId.getLocationName())) || hasLocationKey() != sAWeatherId.hasLocationKey()) {
                return false;
            }
            if ((!hasLocationKey() || getLocationKey().equals(sAWeatherId.getLocationKey())) && hasIsCurrentLocation() == sAWeatherId.hasIsCurrentLocation()) {
                return (!hasIsCurrentLocation() || getIsCurrentLocation() == sAWeatherId.getIsCurrentLocation()) && getUnknownFields().equals(sAWeatherId.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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
            return SA_WeatherProtos.internal_static_SA_SAWeatherId_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public boolean getIsCurrentLocation() {
            return this.isCurrentLocation_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public String getLocationKey() {
            Object obj = this.locationKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.locationKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public ByteString getLocationKeyBytes() {
            Object obj = this.locationKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locationKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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
        public Parser<SAWeatherId> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public ByteString getPubTimeBytes() {
            Object obj = this.pubTime_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pubTime_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.pubTime_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.cityName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.locationName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.locationKey_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(5, this.isCurrentLocation_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public boolean hasCityName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public boolean hasIsCurrentLocation() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public boolean hasLocationKey() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
        public boolean hasLocationName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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
            if (hasLocationKey()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getLocationKey().hashCode();
            }
            if (hasIsCurrentLocation()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getIsCurrentLocation());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherId_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherId.class, Builder.class);
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
            if (hasLocationName()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.pubTime_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.cityName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.locationName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.locationKey_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.isCurrentLocation_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWeatherIdOrBuilder {
            private int bitField0_;
            private Object cityName_;
            private boolean isCurrentLocation_;
            private Object locationKey_;
            private Object locationName_;
            private Object pubTime_;

            private void buildPartial0(SAWeatherId sAWeatherId) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sAWeatherId.pubTime_ = this.pubTime_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAWeatherId.cityName_ = this.cityName_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sAWeatherId.locationName_ = this.locationName_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sAWeatherId.locationKey_ = this.locationKey_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sAWeatherId.isCurrentLocation_ = this.isCurrentLocation_;
                    i7 |= 16;
                }
                sAWeatherId.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherId_descriptor;
            }

            public Builder clearCityName() {
                this.cityName_ = SAWeatherId.getDefaultInstance().getCityName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearIsCurrentLocation() {
                this.bitField0_ &= -17;
                this.isCurrentLocation_ = false;
                onChanged();
                return this;
            }

            public Builder clearLocationKey() {
                this.locationKey_ = SAWeatherId.getDefaultInstance().getLocationKey();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearLocationName() {
                this.locationName_ = SAWeatherId.getDefaultInstance().getLocationName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPubTime() {
                this.pubTime_ = SAWeatherId.getDefaultInstance().getPubTime();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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
                return SA_WeatherProtos.internal_static_SA_SAWeatherId_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public boolean getIsCurrentLocation() {
                return this.isCurrentLocation_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public String getLocationKey() {
                Object obj = this.locationKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.locationKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public ByteString getLocationKeyBytes() {
                Object obj = this.locationKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locationKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public ByteString getLocationNameBytes() {
                Object obj = this.locationName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locationName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public ByteString getPubTimeBytes() {
                Object obj = this.pubTime_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pubTime_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public boolean hasCityName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public boolean hasIsCurrentLocation() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public boolean hasLocationKey() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public boolean hasLocationName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherIdOrBuilder
            public boolean hasPubTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherId_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherId.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPubTime() && hasCityName() && hasLocationName();
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

            public Builder setIsCurrentLocation(boolean z6) {
                this.isCurrentLocation_ = z6;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLocationKey(String str) {
                str.getClass();
                this.locationKey_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLocationKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.locationKey_ = byteString;
                this.bitField0_ |= 8;
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

            public Builder setPubTime(String str) {
                str.getClass();
                this.pubTime_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPubTimeBytes(ByteString byteString) {
                byteString.getClass();
                this.pubTime_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.pubTime_ = "";
                this.cityName_ = "";
                this.locationName_ = "";
                this.locationKey_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherId build() {
                SAWeatherId sAWeatherIdBuildPartial = buildPartial();
                if (sAWeatherIdBuildPartial.isInitialized()) {
                    return sAWeatherIdBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWeatherIdBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherId buildPartial() {
                SAWeatherId sAWeatherId = new SAWeatherId(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWeatherId);
                }
                onBuilt();
                return sAWeatherId;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWeatherId getDefaultInstanceForType() {
                return SAWeatherId.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.pubTime_ = "";
                this.cityName_ = "";
                this.locationName_ = "";
                this.locationKey_ = "";
                this.isCurrentLocation_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWeatherId) {
                    return mergeFrom((SAWeatherId) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.pubTime_ = "";
                this.cityName_ = "";
                this.locationName_ = "";
                this.locationKey_ = "";
            }

            public Builder mergeFrom(SAWeatherId sAWeatherId) {
                if (sAWeatherId == SAWeatherId.getDefaultInstance()) {
                    return this;
                }
                if (sAWeatherId.hasPubTime()) {
                    this.pubTime_ = sAWeatherId.pubTime_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sAWeatherId.hasCityName()) {
                    this.cityName_ = sAWeatherId.cityName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sAWeatherId.hasLocationName()) {
                    this.locationName_ = sAWeatherId.locationName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sAWeatherId.hasLocationKey()) {
                    this.locationKey_ = sAWeatherId.locationKey_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sAWeatherId.hasIsCurrentLocation()) {
                    setIsCurrentLocation(sAWeatherId.getIsCurrentLocation());
                }
                mergeUnknownFields(sAWeatherId.getUnknownFields());
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
                                    this.pubTime_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.cityName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.locationName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.locationKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.isCurrentLocation_ = codedInputStream.readBool();
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

        private SAWeatherId(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.pubTime_ = "";
            this.cityName_ = "";
            this.locationName_ = "";
            this.locationKey_ = "";
            this.isCurrentLocation_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWeatherId sAWeatherId) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWeatherId);
        }

        public static SAWeatherId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWeatherId parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherId parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWeatherId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAWeatherId parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAWeatherId parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAWeatherId parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWeatherId parseFrom(InputStream inputStream) {
            return (SAWeatherId) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SAWeatherId() {
            this.pubTime_ = "";
            this.cityName_ = "";
            this.locationName_ = "";
            this.locationKey_ = "";
            this.isCurrentLocation_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.pubTime_ = "";
            this.cityName_ = "";
            this.locationName_ = "";
            this.locationKey_ = "";
        }

        public static SAWeatherId parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherId) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherId parseFrom(CodedInputStream codedInputStream) {
            return (SAWeatherId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWeatherId parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAWeatherIdOrBuilder extends MessageOrBuilder {
        String getCityName();

        ByteString getCityNameBytes();

        boolean getIsCurrentLocation();

        String getLocationKey();

        ByteString getLocationKeyBytes();

        String getLocationName();

        ByteString getLocationNameBytes();

        String getPubTime();

        ByteString getPubTimeBytes();

        boolean hasCityName();

        boolean hasIsCurrentLocation();

        boolean hasLocationKey();

        boolean hasLocationName();

        boolean hasPubTime();
    }

    public static final class SAWeatherLatest extends GeneratedMessage implements SAWeatherLatestOrBuilder {
        public static final int ALERTS_LIST_FIELD_NUMBER = 8;
        public static final int AQI_FIELD_NUMBER = 7;
        private static final SAWeatherLatest DEFAULT_INSTANCE;
        public static final int HUMIDITY_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SAWeatherLatest> PARSER;
        public static final int PRESSURE_FIELD_NUMBER = 9;
        public static final int TEMPERATURE_FIELD_NUMBER = 3;
        public static final int UVINDEX_FIELD_NUMBER = 6;
        public static final int WEATHER_FIELD_NUMBER = 2;
        public static final int WIND_INFO_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private SAAlerts.List alertsList_;
        private CommonProtos.SEKeyValue aqi_;
        private int bitField0_;
        private CommonProtos.SEKeyValue humidity_;
        private SAWeatherId id_;
        private byte memoizedIsInitialized;
        private float pressure_;
        private CommonProtos.SEKeyValue temperature_;
        private CommonProtos.SEKeyValue uvindex_;
        private int weather_;
        private CommonProtos.SEKeyValue windInfo_;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAWeatherLatest");
            DEFAULT_INSTANCE = new SAWeatherLatest();
            PARSER = new AbstractParser<SAWeatherLatest>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatest.1
                @Override // com.google.protobuf.Parser
                public SAWeatherLatest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAWeatherLatest.newBuilder();
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

        public static SAWeatherLatest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherLatest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAWeatherLatest parseDelimitedFrom(InputStream inputStream) {
            return (SAWeatherLatest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAWeatherLatest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAWeatherLatest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAWeatherLatest)) {
                return super.equals(obj);
            }
            SAWeatherLatest sAWeatherLatest = (SAWeatherLatest) obj;
            if (hasId() != sAWeatherLatest.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sAWeatherLatest.getId())) || hasWeather() != sAWeatherLatest.hasWeather()) {
                return false;
            }
            if ((hasWeather() && getWeather() != sAWeatherLatest.getWeather()) || hasTemperature() != sAWeatherLatest.hasTemperature()) {
                return false;
            }
            if ((hasTemperature() && !getTemperature().equals(sAWeatherLatest.getTemperature())) || hasHumidity() != sAWeatherLatest.hasHumidity()) {
                return false;
            }
            if ((hasHumidity() && !getHumidity().equals(sAWeatherLatest.getHumidity())) || hasWindInfo() != sAWeatherLatest.hasWindInfo()) {
                return false;
            }
            if ((hasWindInfo() && !getWindInfo().equals(sAWeatherLatest.getWindInfo())) || hasUvindex() != sAWeatherLatest.hasUvindex()) {
                return false;
            }
            if ((hasUvindex() && !getUvindex().equals(sAWeatherLatest.getUvindex())) || hasAqi() != sAWeatherLatest.hasAqi()) {
                return false;
            }
            if ((hasAqi() && !getAqi().equals(sAWeatherLatest.getAqi())) || hasAlertsList() != sAWeatherLatest.hasAlertsList()) {
                return false;
            }
            if ((!hasAlertsList() || getAlertsList().equals(sAWeatherLatest.getAlertsList())) && hasPressure() == sAWeatherLatest.hasPressure()) {
                return (!hasPressure() || Float.floatToIntBits(getPressure()) == Float.floatToIntBits(sAWeatherLatest.getPressure())) && getUnknownFields().equals(sAWeatherLatest.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public SAAlerts.List getAlertsList() {
            SAAlerts.List list = this.alertsList_;
            return list == null ? SAAlerts.List.getDefaultInstance() : list;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public SAAlerts.ListOrBuilder getAlertsListOrBuilder() {
            SAAlerts.List list = this.alertsList_;
            return list == null ? SAAlerts.List.getDefaultInstance() : list;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValue getAqi() {
            CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValueOrBuilder getAqiOrBuilder() {
            CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherLatest_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValue getHumidity() {
            CommonProtos.SEKeyValue sEKeyValue = this.humidity_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValueOrBuilder getHumidityOrBuilder() {
            CommonProtos.SEKeyValue sEKeyValue = this.humidity_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public SAWeatherId getId() {
            SAWeatherId sAWeatherId = this.id_;
            return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public SAWeatherIdOrBuilder getIdOrBuilder() {
            SAWeatherId sAWeatherId = this.id_;
            return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAWeatherLatest> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public float getPressure() {
            return this.pressure_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getId()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.weather_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getTemperature());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getHumidity());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getWindInfo());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getUvindex());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getAqi());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getAlertsList());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(9, this.pressure_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValue getTemperature() {
            CommonProtos.SEKeyValue sEKeyValue = this.temperature_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValueOrBuilder getTemperatureOrBuilder() {
            CommonProtos.SEKeyValue sEKeyValue = this.temperature_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValue getUvindex() {
            CommonProtos.SEKeyValue sEKeyValue = this.uvindex_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValueOrBuilder getUvindexOrBuilder() {
            CommonProtos.SEKeyValue sEKeyValue = this.uvindex_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public int getWeather() {
            return this.weather_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValue getWindInfo() {
            CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public CommonProtos.SEKeyValueOrBuilder getWindInfoOrBuilder() {
            CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
            return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasAlertsList() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasAqi() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasHumidity() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasPressure() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasTemperature() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasUvindex() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasWeather() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
        public boolean hasWindInfo() {
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
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WeatherProtos.internal_static_SA_SAWeatherLatest_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherLatest.class, Builder.class);
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
            if (getAlertsList().isInitialized()) {
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
                codedOutputStream.writeUInt32(2, this.weather_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getTemperature());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getHumidity());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getWindInfo());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getUvindex());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getAqi());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getAlertsList());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.pressure_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAWeatherLatestOrBuilder {
            private SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> alertsListBuilder_;
            private SAAlerts.List alertsList_;
            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> aqiBuilder_;
            private CommonProtos.SEKeyValue aqi_;
            private int bitField0_;
            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> humidityBuilder_;
            private CommonProtos.SEKeyValue humidity_;
            private SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> idBuilder_;
            private SAWeatherId id_;
            private float pressure_;
            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> temperatureBuilder_;
            private CommonProtos.SEKeyValue temperature_;
            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> uvindexBuilder_;
            private CommonProtos.SEKeyValue uvindex_;
            private int weather_;
            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> windInfoBuilder_;
            private CommonProtos.SEKeyValue windInfo_;

            private void buildPartial0(SAWeatherLatest sAWeatherLatest) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                    sAWeatherLatest.id_ = singleFieldBuilder == null ? this.id_ : (SAWeatherId) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sAWeatherLatest.weather_ = this.weather_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder2 = this.temperatureBuilder_;
                    sAWeatherLatest.temperature_ = singleFieldBuilder2 == null ? this.temperature_ : (CommonProtos.SEKeyValue) singleFieldBuilder2.build();
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder3 = this.humidityBuilder_;
                    sAWeatherLatest.humidity_ = singleFieldBuilder3 == null ? this.humidity_ : (CommonProtos.SEKeyValue) singleFieldBuilder3.build();
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder4 = this.windInfoBuilder_;
                    sAWeatherLatest.windInfo_ = singleFieldBuilder4 == null ? this.windInfo_ : (CommonProtos.SEKeyValue) singleFieldBuilder4.build();
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder5 = this.uvindexBuilder_;
                    sAWeatherLatest.uvindex_ = singleFieldBuilder5 == null ? this.uvindex_ : (CommonProtos.SEKeyValue) singleFieldBuilder5.build();
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder6 = this.aqiBuilder_;
                    sAWeatherLatest.aqi_ = singleFieldBuilder6 == null ? this.aqi_ : (CommonProtos.SEKeyValue) singleFieldBuilder6.build();
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder7 = this.alertsListBuilder_;
                    sAWeatherLatest.alertsList_ = singleFieldBuilder7 == null ? this.alertsList_ : (SAAlerts.List) singleFieldBuilder7.build();
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sAWeatherLatest.pressure_ = this.pressure_;
                    i7 |= 256;
                }
                sAWeatherLatest.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherLatest_descriptor;
            }

            private SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> internalGetAlertsListFieldBuilder() {
                if (this.alertsListBuilder_ == null) {
                    this.alertsListBuilder_ = new SingleFieldBuilder<>(getAlertsList(), getParentForChildren(), isClean());
                    this.alertsList_ = null;
                }
                return this.alertsListBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> internalGetAqiFieldBuilder() {
                if (this.aqiBuilder_ == null) {
                    this.aqiBuilder_ = new SingleFieldBuilder<>(getAqi(), getParentForChildren(), isClean());
                    this.aqi_ = null;
                }
                return this.aqiBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> internalGetHumidityFieldBuilder() {
                if (this.humidityBuilder_ == null) {
                    this.humidityBuilder_ = new SingleFieldBuilder<>(getHumidity(), getParentForChildren(), isClean());
                    this.humidity_ = null;
                }
                return this.humidityBuilder_;
            }

            private SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> internalGetIdFieldBuilder() {
                if (this.idBuilder_ == null) {
                    this.idBuilder_ = new SingleFieldBuilder<>(getId(), getParentForChildren(), isClean());
                    this.id_ = null;
                }
                return this.idBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> internalGetTemperatureFieldBuilder() {
                if (this.temperatureBuilder_ == null) {
                    this.temperatureBuilder_ = new SingleFieldBuilder<>(getTemperature(), getParentForChildren(), isClean());
                    this.temperature_ = null;
                }
                return this.temperatureBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> internalGetUvindexFieldBuilder() {
                if (this.uvindexBuilder_ == null) {
                    this.uvindexBuilder_ = new SingleFieldBuilder<>(getUvindex(), getParentForChildren(), isClean());
                    this.uvindex_ = null;
                }
                return this.uvindexBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> internalGetWindInfoFieldBuilder() {
                if (this.windInfoBuilder_ == null) {
                    this.windInfoBuilder_ = new SingleFieldBuilder<>(getWindInfo(), getParentForChildren(), isClean());
                    this.windInfo_ = null;
                }
                return this.windInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetIdFieldBuilder();
                    internalGetTemperatureFieldBuilder();
                    internalGetHumidityFieldBuilder();
                    internalGetWindInfoFieldBuilder();
                    internalGetUvindexFieldBuilder();
                    internalGetAqiFieldBuilder();
                    internalGetAlertsListFieldBuilder();
                }
            }

            public Builder clearAlertsList() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.alertsList_ = null;
                SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder = this.alertsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.alertsListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAqi() {
                this.bitField0_ &= -65;
                this.aqi_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.aqiBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHumidity() {
                this.bitField0_ &= -9;
                this.humidity_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.humidityBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.humidityBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = null;
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPressure() {
                this.bitField0_ &= -257;
                this.pressure_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTemperature() {
                this.bitField0_ &= -5;
                this.temperature_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.temperatureBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUvindex() {
                this.bitField0_ &= -33;
                this.uvindex_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.uvindexBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.uvindexBuilder_ = null;
                }
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
                this.bitField0_ &= -17;
                this.windInfo_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.windInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public SAAlerts.List getAlertsList() {
                SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder = this.alertsListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAAlerts.List) singleFieldBuilder.getMessage();
                }
                SAAlerts.List list = this.alertsList_;
                return list == null ? SAAlerts.List.getDefaultInstance() : list;
            }

            public SAAlerts.List.Builder getAlertsListBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SAAlerts.List.Builder) internalGetAlertsListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public SAAlerts.ListOrBuilder getAlertsListOrBuilder() {
                SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder = this.alertsListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAAlerts.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SAAlerts.List list = this.alertsList_;
                return list == null ? SAAlerts.List.getDefaultInstance() : list;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValue getAqi() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValue) singleFieldBuilder.getMessage();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            public CommonProtos.SEKeyValue.Builder getAqiBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (CommonProtos.SEKeyValue.Builder) internalGetAqiFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValueOrBuilder getAqiOrBuilder() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.aqi_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherLatest_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValue getHumidity() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.humidityBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValue) singleFieldBuilder.getMessage();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.humidity_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            public CommonProtos.SEKeyValue.Builder getHumidityBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CommonProtos.SEKeyValue.Builder) internalGetHumidityFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValueOrBuilder getHumidityOrBuilder() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.humidityBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.humidity_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public SAWeatherId getId() {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWeatherId) singleFieldBuilder.getMessage();
                }
                SAWeatherId sAWeatherId = this.id_;
                return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
            }

            public SAWeatherId.Builder getIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SAWeatherId.Builder) internalGetIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public SAWeatherIdOrBuilder getIdOrBuilder() {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    return (SAWeatherIdOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SAWeatherId sAWeatherId = this.id_;
                return sAWeatherId == null ? SAWeatherId.getDefaultInstance() : sAWeatherId;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public float getPressure() {
                return this.pressure_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValue getTemperature() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValue) singleFieldBuilder.getMessage();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.temperature_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            public CommonProtos.SEKeyValue.Builder getTemperatureBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CommonProtos.SEKeyValue.Builder) internalGetTemperatureFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValueOrBuilder getTemperatureOrBuilder() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.temperature_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValue getUvindex() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.uvindexBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValue) singleFieldBuilder.getMessage();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.uvindex_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            public CommonProtos.SEKeyValue.Builder getUvindexBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (CommonProtos.SEKeyValue.Builder) internalGetUvindexFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValueOrBuilder getUvindexOrBuilder() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.uvindexBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.uvindex_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public int getWeather() {
                return this.weather_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValue getWindInfo() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValue) singleFieldBuilder.getMessage();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            public CommonProtos.SEKeyValue.Builder getWindInfoBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (CommonProtos.SEKeyValue.Builder) internalGetWindInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public CommonProtos.SEKeyValueOrBuilder getWindInfoOrBuilder() {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SEKeyValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SEKeyValue sEKeyValue = this.windInfo_;
                return sEKeyValue == null ? CommonProtos.SEKeyValue.getDefaultInstance() : sEKeyValue;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasAlertsList() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasAqi() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasHumidity() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasPressure() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasTemperature() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasUvindex() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasWeather() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAWeatherLatestOrBuilder
            public boolean hasWindInfo() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SAWeatherLatest_fieldAccessorTable.ensureFieldAccessorsInitialized(SAWeatherLatest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasWeather() && hasTemperature() && hasHumidity() && hasWindInfo() && hasUvindex() && hasAqi() && hasAlertsList() && getId().isInitialized() && getTemperature().isInitialized() && getHumidity().isInitialized() && getWindInfo().isInitialized() && getUvindex().isInitialized() && getAqi().isInitialized() && getAlertsList().isInitialized();
            }

            public Builder mergeAlertsList(SAAlerts.List list) {
                SAAlerts.List list2;
                SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder = this.alertsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(list);
                } else if ((this.bitField0_ & 128) == 0 || (list2 = this.alertsList_) == null || list2 == SAAlerts.List.getDefaultInstance()) {
                    this.alertsList_ = list;
                } else {
                    getAlertsListBuilder().mergeFrom(list);
                }
                if (this.alertsList_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAqi(CommonProtos.SEKeyValue sEKeyValue) {
                CommonProtos.SEKeyValue sEKeyValue2;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEKeyValue);
                } else if ((this.bitField0_ & 64) == 0 || (sEKeyValue2 = this.aqi_) == null || sEKeyValue2 == CommonProtos.SEKeyValue.getDefaultInstance()) {
                    this.aqi_ = sEKeyValue;
                } else {
                    getAqiBuilder().mergeFrom(sEKeyValue);
                }
                if (this.aqi_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHumidity(CommonProtos.SEKeyValue sEKeyValue) {
                CommonProtos.SEKeyValue sEKeyValue2;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.humidityBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEKeyValue);
                } else if ((this.bitField0_ & 8) == 0 || (sEKeyValue2 = this.humidity_) == null || sEKeyValue2 == CommonProtos.SEKeyValue.getDefaultInstance()) {
                    this.humidity_ = sEKeyValue;
                } else {
                    getHumidityBuilder().mergeFrom(sEKeyValue);
                }
                if (this.humidity_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeId(SAWeatherId sAWeatherId) {
                SAWeatherId sAWeatherId2;
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sAWeatherId);
                } else if ((this.bitField0_ & 1) == 0 || (sAWeatherId2 = this.id_) == null || sAWeatherId2 == SAWeatherId.getDefaultInstance()) {
                    this.id_ = sAWeatherId;
                } else {
                    getIdBuilder().mergeFrom(sAWeatherId);
                }
                if (this.id_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTemperature(CommonProtos.SEKeyValue sEKeyValue) {
                CommonProtos.SEKeyValue sEKeyValue2;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEKeyValue);
                } else if ((this.bitField0_ & 4) == 0 || (sEKeyValue2 = this.temperature_) == null || sEKeyValue2 == CommonProtos.SEKeyValue.getDefaultInstance()) {
                    this.temperature_ = sEKeyValue;
                } else {
                    getTemperatureBuilder().mergeFrom(sEKeyValue);
                }
                if (this.temperature_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUvindex(CommonProtos.SEKeyValue sEKeyValue) {
                CommonProtos.SEKeyValue sEKeyValue2;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.uvindexBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEKeyValue);
                } else if ((this.bitField0_ & 32) == 0 || (sEKeyValue2 = this.uvindex_) == null || sEKeyValue2 == CommonProtos.SEKeyValue.getDefaultInstance()) {
                    this.uvindex_ = sEKeyValue;
                } else {
                    getUvindexBuilder().mergeFrom(sEKeyValue);
                }
                if (this.uvindex_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeWindInfo(CommonProtos.SEKeyValue sEKeyValue) {
                CommonProtos.SEKeyValue sEKeyValue2;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEKeyValue);
                } else if ((this.bitField0_ & 16) == 0 || (sEKeyValue2 = this.windInfo_) == null || sEKeyValue2 == CommonProtos.SEKeyValue.getDefaultInstance()) {
                    this.windInfo_ = sEKeyValue;
                } else {
                    getWindInfoBuilder().mergeFrom(sEKeyValue);
                }
                if (this.windInfo_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setAlertsList(SAAlerts.List list) {
                SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder = this.alertsListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.alertsList_ = list;
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAqi(CommonProtos.SEKeyValue sEKeyValue) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                if (singleFieldBuilder == null) {
                    sEKeyValue.getClass();
                    this.aqi_ = sEKeyValue;
                } else {
                    singleFieldBuilder.setMessage(sEKeyValue);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setHumidity(CommonProtos.SEKeyValue sEKeyValue) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.humidityBuilder_;
                if (singleFieldBuilder == null) {
                    sEKeyValue.getClass();
                    this.humidity_ = sEKeyValue;
                } else {
                    singleFieldBuilder.setMessage(sEKeyValue);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setId(SAWeatherId sAWeatherId) {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    sAWeatherId.getClass();
                    this.id_ = sAWeatherId;
                } else {
                    singleFieldBuilder.setMessage(sAWeatherId);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPressure(float f7) {
                this.pressure_ = f7;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTemperature(CommonProtos.SEKeyValue sEKeyValue) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                if (singleFieldBuilder == null) {
                    sEKeyValue.getClass();
                    this.temperature_ = sEKeyValue;
                } else {
                    singleFieldBuilder.setMessage(sEKeyValue);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUvindex(CommonProtos.SEKeyValue sEKeyValue) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.uvindexBuilder_;
                if (singleFieldBuilder == null) {
                    sEKeyValue.getClass();
                    this.uvindex_ = sEKeyValue;
                } else {
                    singleFieldBuilder.setMessage(sEKeyValue);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setWeather(int i7) {
                this.weather_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWindInfo(CommonProtos.SEKeyValue sEKeyValue) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEKeyValue.getClass();
                    this.windInfo_ = sEKeyValue;
                } else {
                    singleFieldBuilder.setMessage(sEKeyValue);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherLatest build() {
                SAWeatherLatest sAWeatherLatestBuildPartial = buildPartial();
                if (sAWeatherLatestBuildPartial.isInitialized()) {
                    return sAWeatherLatestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAWeatherLatestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAWeatherLatest buildPartial() {
                SAWeatherLatest sAWeatherLatest = new SAWeatherLatest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAWeatherLatest);
                }
                onBuilt();
                return sAWeatherLatest;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAWeatherLatest getDefaultInstanceForType() {
                return SAWeatherLatest.getDefaultInstance();
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
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.idBuilder_ = null;
                }
                this.weather_ = 0;
                this.temperature_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder2 = this.temperatureBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.temperatureBuilder_ = null;
                }
                this.humidity_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder3 = this.humidityBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.dispose();
                    this.humidityBuilder_ = null;
                }
                this.windInfo_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder4 = this.windInfoBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.dispose();
                    this.windInfoBuilder_ = null;
                }
                this.uvindex_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder5 = this.uvindexBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.dispose();
                    this.uvindexBuilder_ = null;
                }
                this.aqi_ = null;
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder6 = this.aqiBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.dispose();
                    this.aqiBuilder_ = null;
                }
                this.alertsList_ = null;
                SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder7 = this.alertsListBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.dispose();
                    this.alertsListBuilder_ = null;
                }
                this.pressure_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAWeatherLatest) {
                    return mergeFrom((SAWeatherLatest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAlertsList(SAAlerts.List.Builder builder) {
                SingleFieldBuilder<SAAlerts.List, SAAlerts.List.Builder, SAAlerts.ListOrBuilder> singleFieldBuilder = this.alertsListBuilder_;
                if (singleFieldBuilder == null) {
                    this.alertsList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAqi(CommonProtos.SEKeyValue.Builder builder) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.aqiBuilder_;
                if (singleFieldBuilder == null) {
                    this.aqi_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setHumidity(CommonProtos.SEKeyValue.Builder builder) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.humidityBuilder_;
                if (singleFieldBuilder == null) {
                    this.humidity_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setId(SAWeatherId.Builder builder) {
                SingleFieldBuilder<SAWeatherId, SAWeatherId.Builder, SAWeatherIdOrBuilder> singleFieldBuilder = this.idBuilder_;
                if (singleFieldBuilder == null) {
                    this.id_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTemperature(CommonProtos.SEKeyValue.Builder builder) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.temperatureBuilder_;
                if (singleFieldBuilder == null) {
                    this.temperature_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUvindex(CommonProtos.SEKeyValue.Builder builder) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.uvindexBuilder_;
                if (singleFieldBuilder == null) {
                    this.uvindex_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setWindInfo(CommonProtos.SEKeyValue.Builder builder) {
                SingleFieldBuilder<CommonProtos.SEKeyValue, CommonProtos.SEKeyValue.Builder, CommonProtos.SEKeyValueOrBuilder> singleFieldBuilder = this.windInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.windInfo_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SAWeatherLatest sAWeatherLatest) {
                if (sAWeatherLatest == SAWeatherLatest.getDefaultInstance()) {
                    return this;
                }
                if (sAWeatherLatest.hasId()) {
                    mergeId(sAWeatherLatest.getId());
                }
                if (sAWeatherLatest.hasWeather()) {
                    setWeather(sAWeatherLatest.getWeather());
                }
                if (sAWeatherLatest.hasTemperature()) {
                    mergeTemperature(sAWeatherLatest.getTemperature());
                }
                if (sAWeatherLatest.hasHumidity()) {
                    mergeHumidity(sAWeatherLatest.getHumidity());
                }
                if (sAWeatherLatest.hasWindInfo()) {
                    mergeWindInfo(sAWeatherLatest.getWindInfo());
                }
                if (sAWeatherLatest.hasUvindex()) {
                    mergeUvindex(sAWeatherLatest.getUvindex());
                }
                if (sAWeatherLatest.hasAqi()) {
                    mergeAqi(sAWeatherLatest.getAqi());
                }
                if (sAWeatherLatest.hasAlertsList()) {
                    mergeAlertsList(sAWeatherLatest.getAlertsList());
                }
                if (sAWeatherLatest.hasPressure()) {
                    setPressure(sAWeatherLatest.getPressure());
                }
                mergeUnknownFields(sAWeatherLatest.getUnknownFields());
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
                                } else if (tag == 16) {
                                    this.weather_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetTemperatureFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetHumidityFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetWindInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetUvindexFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(internalGetAqiFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(internalGetAlertsListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                } else if (tag != 77) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.pressure_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
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

        private SAWeatherLatest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.weather_ = 0;
            this.pressure_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAWeatherLatest sAWeatherLatest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAWeatherLatest);
        }

        public static SAWeatherLatest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAWeatherLatest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherLatest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherLatest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAWeatherLatest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAWeatherLatest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SAWeatherLatest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SAWeatherLatest() {
            this.weather_ = 0;
            this.pressure_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SAWeatherLatest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAWeatherLatest parseFrom(InputStream inputStream) {
            return (SAWeatherLatest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAWeatherLatest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherLatest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAWeatherLatest parseFrom(CodedInputStream codedInputStream) {
            return (SAWeatherLatest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAWeatherLatest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAWeatherLatest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAWeatherLatestOrBuilder extends MessageOrBuilder {
        SAAlerts.List getAlertsList();

        SAAlerts.ListOrBuilder getAlertsListOrBuilder();

        CommonProtos.SEKeyValue getAqi();

        CommonProtos.SEKeyValueOrBuilder getAqiOrBuilder();

        CommonProtos.SEKeyValue getHumidity();

        CommonProtos.SEKeyValueOrBuilder getHumidityOrBuilder();

        SAWeatherId getId();

        SAWeatherIdOrBuilder getIdOrBuilder();

        float getPressure();

        CommonProtos.SEKeyValue getTemperature();

        CommonProtos.SEKeyValueOrBuilder getTemperatureOrBuilder();

        CommonProtos.SEKeyValue getUvindex();

        CommonProtos.SEKeyValueOrBuilder getUvindexOrBuilder();

        int getWeather();

        CommonProtos.SEKeyValue getWindInfo();

        CommonProtos.SEKeyValueOrBuilder getWindInfoOrBuilder();

        boolean hasAlertsList();

        boolean hasAqi();

        boolean hasHumidity();

        boolean hasId();

        boolean hasPressure();

        boolean hasTemperature();

        boolean hasUvindex();

        boolean hasWeather();

        boolean hasWindInfo();
    }

    public static final class SAweather extends GeneratedMessage implements SAweatherOrBuilder {
        public static final int CITY_KEY_FIELD_NUMBER = 5;
        public static final int CITY_KEY_LIST_FIELD_NUMBER = 4;
        private static final SAweather DEFAULT_INSTANCE;
        public static final int FORECAST_FIELD_NUMBER = 2;
        public static final int LATEST_FIELD_NUMBER = 1;
        private static final Parser<SAweather> PARSER;
        public static final int PRESSURE_FIELD_NUMBER = 3;
        public static final int WEATHER_CONFIG_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            LATEST(1),
            FORECAST(2),
            PRESSURE(3),
            CITY_KEY_LIST(4),
            CITY_KEY(5),
            WEATHER_CONFIG(6),
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
                        return LATEST;
                    case 2:
                        return FORECAST;
                    case 3:
                        return PRESSURE;
                    case 4:
                        return CITY_KEY_LIST;
                    case 5:
                        return CITY_KEY;
                    case 6:
                        return WEATHER_CONFIG;
                    default:
                        return null;
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

        public enum WeatherID implements ProtocolMessageEnum {
            LATEST_WEATHER(0),
            DAILY_FORECAST(1),
            HOURLY_FORECAST(2),
            WEAR_REQUEST(3),
            SET_PRESSURE(4),
            GET_CITY_KEYS(5),
            UPDATE_CITY_KEYS(6),
            ADD_CITY_KEY(7),
            REMOVE_CITY_KEYS(8),
            GET_CONFIG(9),
            SET_CONFIG(10);

            public static final int ADD_CITY_KEY_VALUE = 7;
            public static final int DAILY_FORECAST_VALUE = 1;
            public static final int GET_CITY_KEYS_VALUE = 5;
            public static final int GET_CONFIG_VALUE = 9;
            public static final int HOURLY_FORECAST_VALUE = 2;
            public static final int LATEST_WEATHER_VALUE = 0;
            public static final int REMOVE_CITY_KEYS_VALUE = 8;
            public static final int SET_CONFIG_VALUE = 10;
            public static final int SET_PRESSURE_VALUE = 4;
            public static final int UPDATE_CITY_KEYS_VALUE = 6;
            private static final WeatherID[] VALUES;
            public static final int WEAR_REQUEST_VALUE = 3;
            private static final Internal.EnumLiteMap<WeatherID> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "WeatherID");
                internalValueMap = new Internal.EnumLiteMap<WeatherID>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweather.WeatherID.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public WeatherID findValueByNumber(int i7) {
                        return WeatherID.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            WeatherID(int i7) {
                this.value = i7;
            }

            public static WeatherID forNumber(int i7) {
                switch (i7) {
                    case 0:
                        return LATEST_WEATHER;
                    case 1:
                        return DAILY_FORECAST;
                    case 2:
                        return HOURLY_FORECAST;
                    case 3:
                        return WEAR_REQUEST;
                    case 4:
                        return SET_PRESSURE;
                    case 5:
                        return GET_CITY_KEYS;
                    case 6:
                        return UPDATE_CITY_KEYS;
                    case 7:
                        return ADD_CITY_KEY;
                    case 8:
                        return REMOVE_CITY_KEYS;
                    case 9:
                        return GET_CONFIG;
                    case 10:
                        return SET_CONFIG;
                    default:
                        return null;
                }
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SAweather.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<WeatherID> internalGetValueMap() {
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
            public static WeatherID valueOf(int i7) {
                return forNumber(i7);
            }

            public static WeatherID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SAweather");
            DEFAULT_INSTANCE = new SAweather();
            PARSER = new AbstractParser<SAweather>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweather.1
                @Override // com.google.protobuf.Parser
                public SAweather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SAweather.newBuilder();
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

        public static SAweather getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_WeatherProtos.internal_static_SA_SAweather_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SAweather parseDelimitedFrom(InputStream inputStream) {
            return (SAweather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SAweather parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SAweather> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SAweather)) {
                return super.equals(obj);
            }
            SAweather sAweather = (SAweather) obj;
            if (!getPayloadCase().equals(sAweather.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getLatest().equals(sAweather.getLatest())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getForecast().equals(sAweather.getForecast())) {
                        return false;
                    }
                    break;
                case 3:
                    if (Float.floatToIntBits(getPressure()) != Float.floatToIntBits(sAweather.getPressure())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getCityKeyList().equals(sAweather.getCityKeyList())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getCityKey().equals(sAweather.getCityKey())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getWeatherConfig().equals(sAweather.getWeatherConfig())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sAweather.getUnknownFields());
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SACityKey getCityKey() {
            return this.payloadCase_ == 5 ? (SACityKey) this.payload_ : SACityKey.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SACityKey.List getCityKeyList() {
            return this.payloadCase_ == 4 ? (SACityKey.List) this.payload_ : SACityKey.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SACityKey.ListOrBuilder getCityKeyListOrBuilder() {
            return this.payloadCase_ == 4 ? (SACityKey.List) this.payload_ : SACityKey.List.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SACityKeyOrBuilder getCityKeyOrBuilder() {
            return this.payloadCase_ == 5 ? (SACityKey) this.payload_ : SACityKey.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_WeatherProtos.internal_static_SA_SAweather_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SAWeatherForecast getForecast() {
            return this.payloadCase_ == 2 ? (SAWeatherForecast) this.payload_ : SAWeatherForecast.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SAWeatherForecastOrBuilder getForecastOrBuilder() {
            return this.payloadCase_ == 2 ? (SAWeatherForecast) this.payload_ : SAWeatherForecast.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SAWeatherLatest getLatest() {
            return this.payloadCase_ == 1 ? (SAWeatherLatest) this.payload_ : SAWeatherLatest.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SAWeatherLatestOrBuilder getLatestOrBuilder() {
            return this.payloadCase_ == 1 ? (SAWeatherLatest) this.payload_ : SAWeatherLatest.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SAweather> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
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
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SAWeatherLatest) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SAWeatherForecast) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(3, ((Float) this.payload_).floatValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (SACityKey.List) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SACityKey) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SAWeatherConfig) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SAWeatherConfig getWeatherConfig() {
            return this.payloadCase_ == 6 ? (SAWeatherConfig) this.payload_ : SAWeatherConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public SAWeatherConfigOrBuilder getWeatherConfigOrBuilder() {
            return this.payloadCase_ == 6 ? (SAWeatherConfig) this.payload_ : SAWeatherConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public boolean hasCityKey() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public boolean hasCityKeyList() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public boolean hasForecast() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public boolean hasLatest() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public boolean hasPressure() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
        public boolean hasWeatherConfig() {
            return this.payloadCase_ == 6;
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
                    iHashCode = getLatest().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getForecast().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = Float.floatToIntBits(getPressure());
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getCityKeyList().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getCityKey().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getWeatherConfig().hashCode();
                    break;
                default:
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_WeatherProtos.internal_static_SA_SAweather_fieldAccessorTable.ensureFieldAccessorsInitialized(SAweather.class, Builder.class);
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
            if (hasLatest() && !getLatest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasForecast() && !getForecast().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCityKeyList() && !getCityKeyList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCityKey() || getCityKey().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SAWeatherLatest) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SAWeatherForecast) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeFloat(3, ((Float) this.payload_).floatValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SACityKey.List) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SACityKey) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SAWeatherConfig) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SAweatherOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> cityKeyBuilder_;
            private SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> cityKeyListBuilder_;
            private SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> forecastBuilder_;
            private SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> latestBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> weatherConfigBuilder_;

            private void buildPartial0(SAweather sAweather) {
            }

            private void buildPartialOneofs(SAweather sAweather) {
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder5;
                int i7 = this.payloadCase_;
                sAweather.payloadCase_ = i7;
                sAweather.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder5 = this.latestBuilder_) != null) {
                    sAweather.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 2 && (singleFieldBuilder4 = this.forecastBuilder_) != null) {
                    sAweather.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder3 = this.cityKeyListBuilder_) != null) {
                    sAweather.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder2 = this.cityKeyBuilder_) != null) {
                    sAweather.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 6 || (singleFieldBuilder = this.weatherConfigBuilder_) == null) {
                    return;
                }
                sAweather.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_WeatherProtos.internal_static_SA_SAweather_descriptor;
            }

            private SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> internalGetCityKeyFieldBuilder() {
                if (this.cityKeyBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SACityKey.getDefaultInstance();
                    }
                    this.cityKeyBuilder_ = new SingleFieldBuilder<>((SACityKey) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.cityKeyBuilder_;
            }

            private SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> internalGetCityKeyListFieldBuilder() {
                if (this.cityKeyListBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SACityKey.List.getDefaultInstance();
                    }
                    this.cityKeyListBuilder_ = new SingleFieldBuilder<>((SACityKey.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.cityKeyListBuilder_;
            }

            private SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> internalGetForecastFieldBuilder() {
                if (this.forecastBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SAWeatherForecast.getDefaultInstance();
                    }
                    this.forecastBuilder_ = new SingleFieldBuilder<>((SAWeatherForecast) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.forecastBuilder_;
            }

            private SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> internalGetLatestFieldBuilder() {
                if (this.latestBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SAWeatherLatest.getDefaultInstance();
                    }
                    this.latestBuilder_ = new SingleFieldBuilder<>((SAWeatherLatest) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.latestBuilder_;
            }

            private SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> internalGetWeatherConfigFieldBuilder() {
                if (this.weatherConfigBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SAWeatherConfig.getDefaultInstance();
                    }
                    this.weatherConfigBuilder_ = new SingleFieldBuilder<>((SAWeatherConfig) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.weatherConfigBuilder_;
            }

            public Builder clearCityKey() {
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder = this.cityKeyBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearCityKeyList() {
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder = this.cityKeyListBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearForecast() {
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder = this.forecastBuilder_;
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

            public Builder clearLatest() {
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder = this.latestBuilder_;
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

            public Builder clearWeatherConfig() {
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder = this.weatherConfigBuilder_;
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

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SACityKey getCityKey() {
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder = this.cityKeyBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SACityKey) this.payload_ : SACityKey.getDefaultInstance() : this.payloadCase_ == 5 ? (SACityKey) singleFieldBuilder.getMessage() : SACityKey.getDefaultInstance();
            }

            public SACityKey.Builder getCityKeyBuilder() {
                return (SACityKey.Builder) internalGetCityKeyFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SACityKey.List getCityKeyList() {
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder = this.cityKeyListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SACityKey.List) this.payload_ : SACityKey.List.getDefaultInstance() : this.payloadCase_ == 4 ? (SACityKey.List) singleFieldBuilder.getMessage() : SACityKey.List.getDefaultInstance();
            }

            public SACityKey.List.Builder getCityKeyListBuilder() {
                return (SACityKey.List.Builder) internalGetCityKeyListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SACityKey.ListOrBuilder getCityKeyListOrBuilder() {
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.cityKeyListBuilder_) == null) ? i7 == 4 ? (SACityKey.List) this.payload_ : SACityKey.List.getDefaultInstance() : (SACityKey.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SACityKeyOrBuilder getCityKeyOrBuilder() {
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.cityKeyBuilder_) == null) ? i7 == 5 ? (SACityKey) this.payload_ : SACityKey.getDefaultInstance() : (SACityKeyOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_WeatherProtos.internal_static_SA_SAweather_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SAWeatherForecast getForecast() {
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder = this.forecastBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SAWeatherForecast) this.payload_ : SAWeatherForecast.getDefaultInstance() : this.payloadCase_ == 2 ? (SAWeatherForecast) singleFieldBuilder.getMessage() : SAWeatherForecast.getDefaultInstance();
            }

            public SAWeatherForecast.Builder getForecastBuilder() {
                return (SAWeatherForecast.Builder) internalGetForecastFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SAWeatherForecastOrBuilder getForecastOrBuilder() {
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.forecastBuilder_) == null) ? i7 == 2 ? (SAWeatherForecast) this.payload_ : SAWeatherForecast.getDefaultInstance() : (SAWeatherForecastOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SAWeatherLatest getLatest() {
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder = this.latestBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SAWeatherLatest) this.payload_ : SAWeatherLatest.getDefaultInstance() : this.payloadCase_ == 1 ? (SAWeatherLatest) singleFieldBuilder.getMessage() : SAWeatherLatest.getDefaultInstance();
            }

            public SAWeatherLatest.Builder getLatestBuilder() {
                return (SAWeatherLatest.Builder) internalGetLatestFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SAWeatherLatestOrBuilder getLatestOrBuilder() {
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.latestBuilder_) == null) ? i7 == 1 ? (SAWeatherLatest) this.payload_ : SAWeatherLatest.getDefaultInstance() : (SAWeatherLatestOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public float getPressure() {
                if (this.payloadCase_ == 3) {
                    return ((Float) this.payload_).floatValue();
                }
                return 0.0f;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SAWeatherConfig getWeatherConfig() {
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder = this.weatherConfigBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SAWeatherConfig) this.payload_ : SAWeatherConfig.getDefaultInstance() : this.payloadCase_ == 6 ? (SAWeatherConfig) singleFieldBuilder.getMessage() : SAWeatherConfig.getDefaultInstance();
            }

            public SAWeatherConfig.Builder getWeatherConfigBuilder() {
                return (SAWeatherConfig.Builder) internalGetWeatherConfigFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public SAWeatherConfigOrBuilder getWeatherConfigOrBuilder() {
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.weatherConfigBuilder_) == null) ? i7 == 6 ? (SAWeatherConfig) this.payload_ : SAWeatherConfig.getDefaultInstance() : (SAWeatherConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public boolean hasCityKey() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public boolean hasCityKeyList() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public boolean hasForecast() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public boolean hasLatest() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public boolean hasPressure() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SAweatherOrBuilder
            public boolean hasWeatherConfig() {
                return this.payloadCase_ == 6;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_WeatherProtos.internal_static_SA_SAweather_fieldAccessorTable.ensureFieldAccessorsInitialized(SAweather.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasLatest() && !getLatest().isInitialized()) {
                    return false;
                }
                if (hasForecast() && !getForecast().isInitialized()) {
                    return false;
                }
                if (!hasCityKeyList() || getCityKeyList().isInitialized()) {
                    return !hasCityKey() || getCityKey().isInitialized();
                }
                return false;
            }

            public Builder mergeCityKey(SACityKey sACityKey) {
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder = this.cityKeyBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SACityKey.getDefaultInstance()) {
                        this.payload_ = sACityKey;
                    } else {
                        this.payload_ = SACityKey.newBuilder((SACityKey) this.payload_).mergeFrom(sACityKey).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sACityKey);
                } else {
                    singleFieldBuilder.setMessage(sACityKey);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeCityKeyList(SACityKey.List list) {
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder = this.cityKeyListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SACityKey.List.getDefaultInstance()) {
                        this.payload_ = list;
                    } else {
                        this.payload_ = SACityKey.List.newBuilder((SACityKey.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(list);
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeForecast(SAWeatherForecast sAWeatherForecast) {
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder = this.forecastBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SAWeatherForecast.getDefaultInstance()) {
                        this.payload_ = sAWeatherForecast;
                    } else {
                        this.payload_ = SAWeatherForecast.newBuilder((SAWeatherForecast) this.payload_).mergeFrom(sAWeatherForecast).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sAWeatherForecast);
                } else {
                    singleFieldBuilder.setMessage(sAWeatherForecast);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeLatest(SAWeatherLatest sAWeatherLatest) {
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder = this.latestBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SAWeatherLatest.getDefaultInstance()) {
                        this.payload_ = sAWeatherLatest;
                    } else {
                        this.payload_ = SAWeatherLatest.newBuilder((SAWeatherLatest) this.payload_).mergeFrom(sAWeatherLatest).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sAWeatherLatest);
                } else {
                    singleFieldBuilder.setMessage(sAWeatherLatest);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeWeatherConfig(SAWeatherConfig sAWeatherConfig) {
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder = this.weatherConfigBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SAWeatherConfig.getDefaultInstance()) {
                        this.payload_ = sAWeatherConfig;
                    } else {
                        this.payload_ = SAWeatherConfig.newBuilder((SAWeatherConfig) this.payload_).mergeFrom(sAWeatherConfig).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sAWeatherConfig);
                } else {
                    singleFieldBuilder.setMessage(sAWeatherConfig);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setCityKey(SACityKey sACityKey) {
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder = this.cityKeyBuilder_;
                if (singleFieldBuilder == null) {
                    sACityKey.getClass();
                    this.payload_ = sACityKey;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sACityKey);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setCityKeyList(SACityKey.List list) {
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder = this.cityKeyListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setForecast(SAWeatherForecast sAWeatherForecast) {
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder = this.forecastBuilder_;
                if (singleFieldBuilder == null) {
                    sAWeatherForecast.getClass();
                    this.payload_ = sAWeatherForecast;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAWeatherForecast);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setLatest(SAWeatherLatest sAWeatherLatest) {
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder = this.latestBuilder_;
                if (singleFieldBuilder == null) {
                    sAWeatherLatest.getClass();
                    this.payload_ = sAWeatherLatest;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAWeatherLatest);
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

            public Builder setWeatherConfig(SAWeatherConfig sAWeatherConfig) {
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder = this.weatherConfigBuilder_;
                if (singleFieldBuilder == null) {
                    sAWeatherConfig.getClass();
                    this.payload_ = sAWeatherConfig;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAWeatherConfig);
                }
                this.payloadCase_ = 6;
                return this;
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAweather build() {
                SAweather sAweatherBuildPartial = buildPartial();
                if (sAweatherBuildPartial.isInitialized()) {
                    return sAweatherBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sAweatherBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SAweather buildPartial() {
                SAweather sAweather = new SAweather(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sAweather);
                }
                buildPartialOneofs(sAweather);
                onBuilt();
                return sAweather;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SAweather getDefaultInstanceForType() {
                return SAweather.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder = this.latestBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder2 = this.forecastBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder3 = this.cityKeyListBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder4 = this.cityKeyBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder5 = this.weatherConfigBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SAweather) {
                    return mergeFrom((SAweather) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setCityKey(SACityKey.Builder builder) {
                SingleFieldBuilder<SACityKey, SACityKey.Builder, SACityKeyOrBuilder> singleFieldBuilder = this.cityKeyBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setCityKeyList(SACityKey.List.Builder builder) {
                SingleFieldBuilder<SACityKey.List, SACityKey.List.Builder, SACityKey.ListOrBuilder> singleFieldBuilder = this.cityKeyListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setForecast(SAWeatherForecast.Builder builder) {
                SingleFieldBuilder<SAWeatherForecast, SAWeatherForecast.Builder, SAWeatherForecastOrBuilder> singleFieldBuilder = this.forecastBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setLatest(SAWeatherLatest.Builder builder) {
                SingleFieldBuilder<SAWeatherLatest, SAWeatherLatest.Builder, SAWeatherLatestOrBuilder> singleFieldBuilder = this.latestBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setWeatherConfig(SAWeatherConfig.Builder builder) {
                SingleFieldBuilder<SAWeatherConfig, SAWeatherConfig.Builder, SAWeatherConfigOrBuilder> singleFieldBuilder = this.weatherConfigBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeFrom(SAweather sAweather) {
                if (sAweather == SAweather.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = sAweather.getPayloadCase().ordinal();
                if (iOrdinal == 0) {
                    mergeLatest(sAweather.getLatest());
                } else if (iOrdinal == 1) {
                    mergeForecast(sAweather.getForecast());
                } else if (iOrdinal == 2) {
                    setPressure(sAweather.getPressure());
                } else if (iOrdinal == 3) {
                    mergeCityKeyList(sAweather.getCityKeyList());
                } else if (iOrdinal == 4) {
                    mergeCityKey(sAweather.getCityKey());
                } else if (iOrdinal == 5) {
                    mergeWeatherConfig(sAweather.getWeatherConfig());
                }
                mergeUnknownFields(sAweather.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetLatestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetForecastFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag == 29) {
                                    this.payload_ = Float.valueOf(codedInputStream.readFloat());
                                    this.payloadCase_ = 3;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetCityKeyListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetCityKeyFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                } else if (tag != 50) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetWeatherConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
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

        private SAweather(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SAweather sAweather) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sAweather);
        }

        public static SAweather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SAweather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAweather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAweather parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SAweather getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SAweather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SAweather() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SAweather parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SAweather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SAweather parseFrom(InputStream inputStream) {
            return (SAweather) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SAweather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAweather) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SAweather parseFrom(CodedInputStream codedInputStream) {
            return (SAweather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SAweather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SAweather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SAweatherOrBuilder extends MessageOrBuilder {
        SACityKey getCityKey();

        SACityKey.List getCityKeyList();

        SACityKey.ListOrBuilder getCityKeyListOrBuilder();

        SACityKeyOrBuilder getCityKeyOrBuilder();

        SAWeatherForecast getForecast();

        SAWeatherForecastOrBuilder getForecastOrBuilder();

        SAWeatherLatest getLatest();

        SAWeatherLatestOrBuilder getLatestOrBuilder();

        SAweather.PayloadCase getPayloadCase();

        float getPressure();

        SAWeatherConfig getWeatherConfig();

        SAWeatherConfigOrBuilder getWeatherConfigOrBuilder();

        boolean hasCityKey();

        boolean hasCityKeyList();

        boolean hasForecast();

        boolean hasLatest();

        boolean hasPressure();

        boolean hasWeatherConfig();
    }

    public enum SETemperatureUnit implements ProtocolMessageEnum {
        NO_UNIT(0),
        WEATHER_CENTIGRADE(1),
        WEATHER_FAHRENHEIT(2);

        public static final int NO_UNIT_VALUE = 0;
        private static final SETemperatureUnit[] VALUES;
        public static final int WEATHER_CENTIGRADE_VALUE = 1;
        public static final int WEATHER_FAHRENHEIT_VALUE = 2;
        private static final Internal.EnumLiteMap<SETemperatureUnit> internalValueMap;
        private final int value;

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETemperatureUnit");
            internalValueMap = new Internal.EnumLiteMap<SETemperatureUnit>() { // from class: com.zh.ble.sa_wear.protobuf.SA_WeatherProtos.SETemperatureUnit.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SETemperatureUnit findValueByNumber(int i7) {
                    return SETemperatureUnit.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SETemperatureUnit(int i7) {
            this.value = i7;
        }

        public static SETemperatureUnit forNumber(int i7) {
            if (i7 == 0) {
                return NO_UNIT;
            }
            if (i7 == 1) {
                return WEATHER_CENTIGRADE;
            }
            if (i7 != 2) {
                return null;
            }
            return WEATHER_FAHRENHEIT;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return SA_WeatherProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SETemperatureUnit> internalGetValueMap() {
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
        public static SETemperatureUnit valueOf(int i7) {
            return forNumber(i7);
        }

        public static SETemperatureUnit valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SA_WeatherProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015sa_wear_weather.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\"Û\u0003\n\tSAweather\u0012%\n\u0006latest\u0018\u0001 \u0001(\u000b2\u0013.SA.SAWeatherLatestH\u0000\u0012)\n\bforecast\u0018\u0002 \u0001(\u000b2\u0015.SA.SAWeatherForecastH\u0000\u0012\u0012\n\bpressure\u0018\u0003 \u0001(\u0002H\u0000\u0012+\n\rcity_key_list\u0018\u0004 \u0001(\u000b2\u0012.SA.SACityKey.ListH\u0000\u0012!\n\bcity_key\u0018\u0005 \u0001(\u000b2\r.SA.SACityKeyH\u0000\u0012-\n\u000eweather_config\u0018\u0006 \u0001(\u000b2\u0013.SA.SAWeatherConfigH\u0000\"Ý\u0001\n\tWeatherID\u0012\u0012\n\u000eLATEST_WEATHER\u0010\u0000\u0012\u0012\n\u000eDAILY_FORECAST\u0010\u0001\u0012\u0013\n\u000fHOURLY_FORECAST\u0010\u0002\u0012\u0010\n\fWEAR_REQUEST\u0010\u0003\u0012\u0010\n\fSET_PRESSURE\u0010\u0004\u0012\u0011\n\rGET_CITY_KEYS\u0010\u0005\u0012\u0014\n\u0010UPDATE_CITY_KEYS\u0010\u0006\u0012\u0010\n\fADD_CITY_KEY\u0010\u0007\u0012\u0014\n\u0010REMOVE_CITY_KEYS\u0010\b\u0012\u000e\n\nGET_CONFIG\u0010\t\u0012\u000e\n\nSET_CONFIG\u0010\nB\t\n\u0007payload\"n\n\tSACityKey\u0012\u001b\n\flocation_key\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tcity_name\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u001a*\n\u0004List\u0012\"\n\u0004list\u0018\u0001 \u0003(\u000b2\r.SA.SACityKeyB\u0005\u0092?\u0002\u0018\u0004\"\u0098\u0001\n\u000bSAWeatherId\u0012\u0017\n\bpub_time\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tcity_name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rlocation_name\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001b\n\flocation_key\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001b\n\u0013is_current_location\u0018\u0005 \u0001(\b\"¨\u0002\n\u000fSAWeatherLatest\u0012\u001b\n\u0002id\u0018\u0001 \u0002(\u000b2\u000f.SA.SAWeatherId\u0012\u0016\n\u0007weather\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012#\n\u000btemperature\u0018\u0003 \u0002(\u000b2\u000e.SA.SEKeyValue\u0012 \n\bhumidity\u0018\u0004 \u0002(\u000b2\u000e.SA.SEKeyValue\u0012!\n\twind_info\u0018\u0005 \u0002(\u000b2\u000e.SA.SEKeyValue\u0012\u001f\n\u0007uvindex\u0018\u0006 \u0002(\u000b2\u000e.SA.SEKeyValue\u0012\u001b\n\u0003aqi\u0018\u0007 \u0002(\u000b2\u000e.SA.SEKeyValue\u0012&\n\u000balerts_list\u0018\b \u0002(\u000b2\u0011.SA.SAAlerts.List\u0012\u0010\n\bpressure\u0018\t \u0001(\u0002\"ù\u0002\n\u0011SAWeatherForecast\u0012\u001b\n\u0002id\u0018\u0001 \u0002(\u000b2\u000f.SA.SAWeatherId\u00122\n\tdata_list\u0018\u0002 \u0002(\u000b2\u001f.SA.SAWeatherForecast.Data.List\u001a\u0092\u0002\n\u0004Data\u0012\u001b\n\u0003aqi\u0018\u0001 \u0002(\u000b2\u000e.SA.SEKeyValue\u0012!\n\u0007weather\u0018\u0002 \u0001(\u000b2\u0010.SA.SERangeValue\u0012%\n\u000btemperature\u0018\u0003 \u0001(\u000b2\u0010.SA.SERangeValue\u0012\u001f\n\u0010temperature_unit\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012&\n\fsun_rise_set\u0018\u0005 \u0001(\u000b2\u0010.SA.SASunRiseSet\u0012!\n\twind_info\u0018\u0006 \u0001(\u000b2\u000e.SA.SEKeyValue\u001a7\n\u0004List\u0012/\n\u0004list\u0018\u0001 \u0003(\u000b2\u001a.SA.SAWeatherForecast.DataB\u0005\u0092?\u0002\u0018\u0004\" \u0001\n\bSAAlerts\u0012\u0011\n\u0002id\u0018\u0005 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004type\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005level\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005title\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\u0006detail\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u001a)\n\u0004List\u0012!\n\u0004list\u0018\u0001 \u0003(\u000b2\f.SA.SAAlertsB\u0005\u0092?\u0002\u0018\u0004\"?\n\fSASunRiseSet\u0012\u0017\n\bsun_rise\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0007sun_set\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"i\n\u000fSAWeatherConfig\u0012/\n\u0010temperature_unit\u0018\u0001 \u0001(\u000e2\u0015.SA.SETemperatureUnit\u0012%\n\u0005alert\u0018\u0002 \u0001(\u000e2\u0016.SA.SEOptionalSwitcher*P\n\u0011SETemperatureUnit\u0012\u000b\n\u0007NO_UNIT\u0010\u0000\u0012\u0016\n\u0012WEATHER_CENTIGRADE\u0010\u0001\u0012\u0016\n\u0012WEATHER_FAHRENHEIT\u0010\u0002B6\n\u001bcom.zh.ble.sa_wear.protobufB\u0010SA_WeatherProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SAweather_descriptor = messageType;
        internal_static_SA_SAweather_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"Latest", "Forecast", "Pressure", "CityKeyList", "CityKey", "WeatherConfig", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SACityKey_descriptor = messageType2;
        internal_static_SA_SACityKey_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"LocationKey", "CityName"});
        Descriptors.Descriptor nestedType = messageType2.getNestedType(0);
        internal_static_SA_SACityKey_List_descriptor = nestedType;
        internal_static_SA_SACityKey_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SAWeatherId_descriptor = messageType3;
        internal_static_SA_SAWeatherId_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"PubTime", "CityName", "LocationName", "LocationKey", "IsCurrentLocation"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SAWeatherLatest_descriptor = messageType4;
        internal_static_SA_SAWeatherLatest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"Id", "Weather", "Temperature", "Humidity", "WindInfo", "Uvindex", "Aqi", "AlertsList", "Pressure"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SAWeatherForecast_descriptor = messageType5;
        internal_static_SA_SAWeatherForecast_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Id", "DataList"});
        Descriptors.Descriptor nestedType2 = messageType5.getNestedType(0);
        internal_static_SA_SAWeatherForecast_Data_descriptor = nestedType2;
        internal_static_SA_SAWeatherForecast_Data_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{"Aqi", "Weather", "Temperature", "TemperatureUnit", "SunRiseSet", "WindInfo"});
        Descriptors.Descriptor nestedType3 = nestedType2.getNestedType(0);
        internal_static_SA_SAWeatherForecast_Data_List_descriptor = nestedType3;
        internal_static_SA_SAWeatherForecast_Data_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SAAlerts_descriptor = messageType6;
        internal_static_SA_SAAlerts_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Id", "Type", "Level", "Title", "Detail"});
        Descriptors.Descriptor nestedType4 = messageType6.getNestedType(0);
        internal_static_SA_SAAlerts_List_descriptor = nestedType4;
        internal_static_SA_SAAlerts_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SA_SASunRiseSet_descriptor = messageType7;
        internal_static_SA_SASunRiseSet_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"SunRise", "SunSet"});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SA_SAWeatherConfig_descriptor = messageType8;
        internal_static_SA_SAWeatherConfig_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"TemperatureUnit", "Alert"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private SA_WeatherProtos() {
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