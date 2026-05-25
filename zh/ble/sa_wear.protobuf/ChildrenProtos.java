package com.zh.ble.sa_wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.media3.exoplayer.dash.manifest.UrlTemplate;
import com.facebook.appevents.AppEventsConstants;
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
import com.noisefit.DataBinderMapperImpl;
import com.zh.ble.sa_wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ChildrenProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEChallengeDetail_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEChallengeDetail_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEChallengeDetail_StringList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEChallengeDetail_StringList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEChallengeDetail_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEChallengeDetail_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEChallengeInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEChallengeInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEChallengeResoult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEChallengeResoult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEChildren_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEChildren_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEEarningsInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEEarningsInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEEarningsInfo_totalList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEEarningsInfo_totalList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEEarningsInfo_univalenceList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEEarningsInfo_univalenceList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEExchangeInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEExchangeInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEFlashCardThemeInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEFlashCardThemeInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEFlashCardThemeSchedule_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEFlashCardThemeSchedule_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEMedalInfo_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEMedalInfo_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEMedalInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEMedalInfo_fieldAccessorTable;

    public static final class SEChallengeDetail extends GeneratedMessage implements SEChallengeDetailOrBuilder {
        private static final SEChallengeDetail DEFAULT_INSTANCE;
        private static final Parser<SEChallengeDetail> PARSER;
        public static final int STRINGLIST_FIELD_NUMBER = 2;
        public static final int TYPE_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private StringList stringlist_;
        private int typeId_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEChallengeDetail$1 */
        public class AnonymousClass1 extends AbstractParser<SEChallengeDetail> {
            @Override // com.google.protobuf.Parser
            public SEChallengeDetail parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEChallengeDetail.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEChallengeDetailOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> stringlistBuilder_;
            private StringList stringlist_;
            private int typeId_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEChallengeDetail sEChallengeDetail) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEChallengeDetail.typeId_ = this.typeId_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                    sEChallengeDetail.stringlist_ = singleFieldBuilder == null ? this.stringlist_ : (StringList) singleFieldBuilder.build();
                    i7 |= 2;
                }
                sEChallengeDetail.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_descriptor;
            }

            private SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> internalGetStringlistFieldBuilder() {
                if (this.stringlistBuilder_ == null) {
                    this.stringlistBuilder_ = new SingleFieldBuilder<>(getStringlist(), getParentForChildren(), isClean());
                    this.stringlist_ = null;
                }
                return this.stringlistBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetStringlistFieldBuilder();
                }
            }

            public Builder clearStringlist() {
                this.bitField0_ &= -3;
                this.stringlist_ = null;
                SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.stringlistBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTypeId() {
                this.bitField0_ &= -2;
                this.typeId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
            public StringList getStringlist() {
                SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                if (singleFieldBuilder != null) {
                    return (StringList) singleFieldBuilder.getMessage();
                }
                StringList stringList = this.stringlist_;
                return stringList == null ? StringList.getDefaultInstance() : stringList;
            }

            public StringList.Builder getStringlistBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (StringList.Builder) internalGetStringlistFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
            public StringListOrBuilder getStringlistOrBuilder() {
                SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                if (singleFieldBuilder != null) {
                    return (StringListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                StringList stringList = this.stringlist_;
                return stringList == null ? StringList.getDefaultInstance() : stringList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
            public int getTypeId() {
                return this.typeId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
            public boolean hasStringlist() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
            public boolean hasTypeId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChallengeDetail.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTypeId() && hasStringlist();
            }

            public Builder mergeStringlist(StringList stringList) {
                StringList stringList2;
                SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(stringList);
                } else if ((this.bitField0_ & 2) == 0 || (stringList2 = this.stringlist_) == null || stringList2 == StringList.getDefaultInstance()) {
                    this.stringlist_ = stringList;
                } else {
                    getStringlistBuilder().mergeFrom(stringList);
                }
                if (this.stringlist_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setStringlist(StringList stringList) {
                SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                if (singleFieldBuilder == null) {
                    stringList.getClass();
                    this.stringlist_ = stringList;
                } else {
                    singleFieldBuilder.setMessage(stringList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTypeId(int i7) {
                this.typeId_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChallengeDetail build() {
                SEChallengeDetail sEChallengeDetailBuildPartial = buildPartial();
                if (sEChallengeDetailBuildPartial.isInitialized()) {
                    return sEChallengeDetailBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEChallengeDetailBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChallengeDetail buildPartial() {
                SEChallengeDetail sEChallengeDetail = new SEChallengeDetail(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEChallengeDetail);
                }
                onBuilt();
                return sEChallengeDetail;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEChallengeDetail getDefaultInstanceForType() {
                return SEChallengeDetail.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.typeId_ = 0;
                this.stringlist_ = null;
                SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.stringlistBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEChallengeDetail) {
                    return mergeFrom((SEChallengeDetail) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setStringlist(StringList.Builder builder) {
                SingleFieldBuilder<StringList, StringList.Builder, StringListOrBuilder> singleFieldBuilder = this.stringlistBuilder_;
                if (singleFieldBuilder == null) {
                    this.stringlist_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEChallengeDetail sEChallengeDetail) {
                if (sEChallengeDetail == SEChallengeDetail.getDefaultInstance()) {
                    return this;
                }
                if (sEChallengeDetail.hasTypeId()) {
                    setTypeId(sEChallengeDetail.getTypeId());
                }
                if (sEChallengeDetail.hasStringlist()) {
                    mergeStringlist(sEChallengeDetail.getStringlist());
                }
                mergeUnknownFields(sEChallengeDetail.getUnknownFields());
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
                                    this.typeId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetStringlistFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final long serialVersionUID = 0;
            private java.util.List<SEChallengeDetail> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEChallengeDetail$List$1 */
            public class AnonymousClass1 extends AbstractParser<List> {
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
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> listBuilder_;
                private java.util.List<SEChallengeDetail> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(List list) {
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return ChildrenProtos.internal_static_SA_SEChallengeDetail_List_descriptor;
                }

                private RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEChallengeDetail> iterable) {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEChallengeDetail sEChallengeDetail) {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEChallengeDetail);
                        return this;
                    }
                    sEChallengeDetail.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEChallengeDetail);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEChallengeDetail.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return ChildrenProtos.internal_static_SA_SEChallengeDetail_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
                public SEChallengeDetail getList(int i7) {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEChallengeDetail) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
                public java.util.List<SEChallengeDetail> getListList() {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
                public SEChallengeDetailOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEChallengeDetailOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
                public java.util.List<? extends SEChallengeDetailOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChildrenProtos.internal_static_SA_SEChallengeDetail_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEChallengeDetail sEChallengeDetail) {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEChallengeDetail);
                        return this;
                    }
                    sEChallengeDetail.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEChallengeDetail);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(d dVar) {
                    this();
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEChallengeDetail.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEChallengeDetail sEChallengeDetail) {
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEChallengeDetail.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEChallengeDetail);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEChallengeDetail);
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
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEChallengeDetail sEChallengeDetail = (SEChallengeDetail) codedInputStream.readMessage(SEChallengeDetail.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEChallengeDetail, Builder, SEChallengeDetailOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEChallengeDetail);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEChallengeDetail);
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                DEFAULT_INSTANCE = new List();
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.List.1
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

            public /* synthetic */ List(GeneratedMessage.Builder builder, d dVar) {
                this(builder);
            }

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_List_descriptor;
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
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_List_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
            public SEChallengeDetail getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
            public java.util.List<SEChallengeDetail> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
            public SEChallengeDetailOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.ListOrBuilder
            public java.util.List<? extends SEChallengeDetailOrBuilder> getListOrBuilderList() {
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
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
            SEChallengeDetail getList(int i7);

            int getListCount();

            java.util.List<SEChallengeDetail> getListList();

            SEChallengeDetailOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SEChallengeDetailOrBuilder> getListOrBuilderList();
        }

        public static final class StringList extends GeneratedMessage implements StringListOrBuilder {
            private static final StringList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<StringList> PARSER;
            private static final long serialVersionUID = 0;
            private LazyStringArrayList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEChallengeDetail$StringList$1 */
            public class AnonymousClass1 extends AbstractParser<StringList> {
                @Override // com.google.protobuf.Parser
                public StringList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = StringList.newBuilder();
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
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements StringListOrBuilder {
                private int bitField0_;
                private LazyStringArrayList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(StringList stringList) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_.makeImmutable();
                        stringList.list_ = this.list_;
                    }
                }

                private void ensureListIsMutable() {
                    if (!this.list_.isModifiable()) {
                        this.list_ = new LazyStringArrayList((LazyStringList) this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return ChildrenProtos.internal_static_SA_SEChallengeDetail_StringList_descriptor;
                }

                public Builder addAllList(Iterable<String> iterable) {
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addList(String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.add(str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addListBytes(ByteString byteString) {
                    byteString.getClass();
                    ensureListIsMutable();
                    this.list_.add(byteString);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = LazyStringArrayList.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return ChildrenProtos.internal_static_SA_SEChallengeDetail_StringList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
                public String getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
                public ByteString getListBytes(int i7) {
                    return this.list_.getByteString(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChildrenProtos.internal_static_SA_SEChallengeDetail_StringList_fieldAccessorTable.ensureFieldAccessorsInitialized(StringList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(d dVar) {
                    this();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
                public ProtocolStringList getListList() {
                    this.list_.makeImmutable();
                    return this.list_;
                }

                private Builder() {
                    this.list_ = LazyStringArrayList.emptyList();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public StringList build() {
                    StringList stringListBuildPartial = buildPartial();
                    if (stringListBuildPartial.isInitialized()) {
                        return stringListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) stringListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public StringList buildPartial() {
                    StringList stringList = new StringList(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(stringList);
                    }
                    onBuilt();
                    return stringList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public StringList getDefaultInstanceForType() {
                    return StringList.getDefaultInstance();
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = LazyStringArrayList.emptyList();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.list_ = LazyStringArrayList.emptyList();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof StringList) {
                        return mergeFrom((StringList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(StringList stringList) {
                    if (stringList == StringList.getDefaultInstance()) {
                        return this;
                    }
                    if (!stringList.list_.isEmpty()) {
                        if (this.list_.isEmpty()) {
                            this.list_ = stringList.list_;
                            this.bitField0_ |= 1;
                        } else {
                            ensureListIsMutable();
                            this.list_.addAll(stringList.list_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(stringList.getUnknownFields());
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
                                        ByteString bytes = codedInputStream.readBytes();
                                        ensureListIsMutable();
                                        this.list_.add(bytes);
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "StringList");
                DEFAULT_INSTANCE = new StringList();
                PARSER = new AbstractParser<StringList>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringList.1
                    @Override // com.google.protobuf.Parser
                    public StringList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = StringList.newBuilder();
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

            public /* synthetic */ StringList(GeneratedMessage.Builder builder, d dVar) {
                this(builder);
            }

            public static StringList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_StringList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static StringList parseDelimitedFrom(InputStream inputStream) {
                return (StringList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static StringList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<StringList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StringList)) {
                    return super.equals(obj);
                }
                StringList stringList = (StringList) obj;
                return getListList().equals(stringList.getListList()) && getUnknownFields().equals(stringList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_StringList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
            public String getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
            public ByteString getListBytes(int i7) {
                return this.list_.getByteString(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<StringList> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeStringSizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.list_.getRaw(i8));
                }
                int size = iComputeStringSizeNoTag + getListList().size() + getUnknownFields().getSerializedSize();
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
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getListList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEChallengeDetail_StringList_fieldAccessorTable.ensureFieldAccessorsInitialized(StringList.class, Builder.class);
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
                    GeneratedMessage.writeString(codedOutputStream, 1, this.list_.getRaw(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private StringList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(StringList stringList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(stringList);
            }

            public static StringList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.StringListOrBuilder
            public ProtocolStringList getListList() {
                return this.list_;
            }

            public static StringList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StringList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static StringList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StringList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static StringList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private StringList() {
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = LazyStringArrayList.emptyList();
            }

            public static StringList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static StringList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static StringList parseFrom(InputStream inputStream) {
                return (StringList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static StringList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StringList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static StringList parseFrom(CodedInputStream codedInputStream) {
                return (StringList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static StringList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StringList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface StringListOrBuilder extends MessageOrBuilder {
            String getList(int i7);

            ByteString getListBytes(int i7);

            int getListCount();

            java.util.List<String> getListList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEChallengeDetail");
            DEFAULT_INSTANCE = new SEChallengeDetail();
            PARSER = new AbstractParser<SEChallengeDetail>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetail.1
                @Override // com.google.protobuf.Parser
                public SEChallengeDetail parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEChallengeDetail.newBuilder();
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

        public /* synthetic */ SEChallengeDetail(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEChallengeDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEChallengeDetail_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEChallengeDetail parseDelimitedFrom(InputStream inputStream) {
            return (SEChallengeDetail) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEChallengeDetail parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEChallengeDetail> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEChallengeDetail)) {
                return super.equals(obj);
            }
            SEChallengeDetail sEChallengeDetail = (SEChallengeDetail) obj;
            if (hasTypeId() != sEChallengeDetail.hasTypeId()) {
                return false;
            }
            if ((!hasTypeId() || getTypeId() == sEChallengeDetail.getTypeId()) && hasStringlist() == sEChallengeDetail.hasStringlist()) {
                return (!hasStringlist() || getStringlist().equals(sEChallengeDetail.getStringlist())) && getUnknownFields().equals(sEChallengeDetail.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEChallengeDetail_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEChallengeDetail> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.typeId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getStringlist());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
        public StringList getStringlist() {
            StringList stringList = this.stringlist_;
            return stringList == null ? StringList.getDefaultInstance() : stringList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
        public StringListOrBuilder getStringlistOrBuilder() {
            StringList stringList = this.stringlist_;
            return stringList == null ? StringList.getDefaultInstance() : stringList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
        public int getTypeId() {
            return this.typeId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
        public boolean hasStringlist() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeDetailOrBuilder
        public boolean hasTypeId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTypeId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTypeId();
            }
            if (hasStringlist()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getStringlist().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEChallengeDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChallengeDetail.class, Builder.class);
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
            if (!hasTypeId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStringlist()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.typeId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStringlist());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEChallengeDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.typeId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEChallengeDetail sEChallengeDetail) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEChallengeDetail);
        }

        public static SEChallengeDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEChallengeDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeDetail) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChallengeDetail parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEChallengeDetail getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEChallengeDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEChallengeDetail() {
            this.typeId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEChallengeDetail parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEChallengeDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEChallengeDetail parseFrom(InputStream inputStream) {
            return (SEChallengeDetail) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEChallengeDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeDetail) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChallengeDetail parseFrom(CodedInputStream codedInputStream) {
            return (SEChallengeDetail) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEChallengeDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeDetail) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEChallengeDetailOrBuilder extends MessageOrBuilder {
        SEChallengeDetail.StringList getStringlist();

        SEChallengeDetail.StringListOrBuilder getStringlistOrBuilder();

        int getTypeId();

        boolean hasStringlist();

        boolean hasTypeId();
    }

    public static final class SEChallengeInfo extends GeneratedMessage implements SEChallengeInfoOrBuilder {
        private static final SEChallengeInfo DEFAULT_INSTANCE;
        public static final int LIST_FIELD_NUMBER = 3;
        public static final int MAX_STRING_LEN_FIELD_NUMBER = 2;
        public static final int MAX_TYPE_FIELD_NUMBER = 1;
        private static final Parser<SEChallengeInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEChallengeDetail.List list_;
        private int maxStringLen_;
        private int maxType_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEChallengeInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEChallengeInfo> {
            @Override // com.google.protobuf.Parser
            public SEChallengeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEChallengeInfo.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEChallengeInfoOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> listBuilder_;
            private SEChallengeDetail.List list_;
            private int maxStringLen_;
            private int maxType_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEChallengeInfo sEChallengeInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEChallengeInfo.maxType_ = this.maxType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEChallengeInfo.maxStringLen_ = this.maxStringLen_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                    sEChallengeInfo.list_ = singleFieldBuilder == null ? this.list_ : (SEChallengeDetail.List) singleFieldBuilder.build();
                    i7 |= 4;
                }
                sEChallengeInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEChallengeInfo_descriptor;
            }

            private SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> internalGetListFieldBuilder() {
                if (this.listBuilder_ == null) {
                    this.listBuilder_ = new SingleFieldBuilder<>(getList(), getParentForChildren(), isClean());
                    this.list_ = null;
                }
                return this.listBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetListFieldBuilder();
                }
            }

            public Builder clearList() {
                this.bitField0_ &= -5;
                this.list_ = null;
                SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.listBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMaxStringLen() {
                this.bitField0_ &= -3;
                this.maxStringLen_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxType() {
                this.bitField0_ &= -2;
                this.maxType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEChallengeInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
            public SEChallengeDetail.List getList() {
                SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEChallengeDetail.List) singleFieldBuilder.getMessage();
                }
                SEChallengeDetail.List list = this.list_;
                return list == null ? SEChallengeDetail.List.getDefaultInstance() : list;
            }

            public SEChallengeDetail.List.Builder getListBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SEChallengeDetail.List.Builder) internalGetListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
            public SEChallengeDetail.ListOrBuilder getListOrBuilder() {
                SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEChallengeDetail.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEChallengeDetail.List list = this.list_;
                return list == null ? SEChallengeDetail.List.getDefaultInstance() : list;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
            public int getMaxStringLen() {
                return this.maxStringLen_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
            public int getMaxType() {
                return this.maxType_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
            public boolean hasList() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
            public boolean hasMaxStringLen() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
            public boolean hasMaxType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEChallengeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChallengeInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMaxType() && hasMaxStringLen() && hasList() && getList().isInitialized();
            }

            public Builder mergeList(SEChallengeDetail.List list) {
                SEChallengeDetail.List list2;
                SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(list);
                } else if ((this.bitField0_ & 4) == 0 || (list2 = this.list_) == null || list2 == SEChallengeDetail.List.getDefaultInstance()) {
                    this.list_ = list;
                } else {
                    getListBuilder().mergeFrom(list);
                }
                if (this.list_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setList(SEChallengeDetail.List list) {
                SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.list_ = list;
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMaxStringLen(int i7) {
                this.maxStringLen_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMaxType(int i7) {
                this.maxType_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChallengeInfo build() {
                SEChallengeInfo sEChallengeInfoBuildPartial = buildPartial();
                if (sEChallengeInfoBuildPartial.isInitialized()) {
                    return sEChallengeInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEChallengeInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChallengeInfo buildPartial() {
                SEChallengeInfo sEChallengeInfo = new SEChallengeInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEChallengeInfo);
                }
                onBuilt();
                return sEChallengeInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEChallengeInfo getDefaultInstanceForType() {
                return SEChallengeInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.maxType_ = 0;
                this.maxStringLen_ = 0;
                this.list_ = null;
                SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.listBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEChallengeInfo) {
                    return mergeFrom((SEChallengeInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setList(SEChallengeDetail.List.Builder builder) {
                SingleFieldBuilder<SEChallengeDetail.List, SEChallengeDetail.List.Builder, SEChallengeDetail.ListOrBuilder> singleFieldBuilder = this.listBuilder_;
                if (singleFieldBuilder == null) {
                    this.list_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEChallengeInfo sEChallengeInfo) {
                if (sEChallengeInfo == SEChallengeInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEChallengeInfo.hasMaxType()) {
                    setMaxType(sEChallengeInfo.getMaxType());
                }
                if (sEChallengeInfo.hasMaxStringLen()) {
                    setMaxStringLen(sEChallengeInfo.getMaxStringLen());
                }
                if (sEChallengeInfo.hasList()) {
                    mergeList(sEChallengeInfo.getList());
                }
                mergeUnknownFields(sEChallengeInfo.getUnknownFields());
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
                                    this.maxType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.maxStringLen_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetListFieldBuilder().getBuilder(), extensionRegistryLite);
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEChallengeInfo");
            DEFAULT_INSTANCE = new SEChallengeInfo();
            PARSER = new AbstractParser<SEChallengeInfo>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfo.1
                @Override // com.google.protobuf.Parser
                public SEChallengeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEChallengeInfo.newBuilder();
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

        public /* synthetic */ SEChallengeInfo(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEChallengeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEChallengeInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEChallengeInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEChallengeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEChallengeInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEChallengeInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEChallengeInfo)) {
                return super.equals(obj);
            }
            SEChallengeInfo sEChallengeInfo = (SEChallengeInfo) obj;
            if (hasMaxType() != sEChallengeInfo.hasMaxType()) {
                return false;
            }
            if ((hasMaxType() && getMaxType() != sEChallengeInfo.getMaxType()) || hasMaxStringLen() != sEChallengeInfo.hasMaxStringLen()) {
                return false;
            }
            if ((!hasMaxStringLen() || getMaxStringLen() == sEChallengeInfo.getMaxStringLen()) && hasList() == sEChallengeInfo.hasList()) {
                return (!hasList() || getList().equals(sEChallengeInfo.getList())) && getUnknownFields().equals(sEChallengeInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEChallengeInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
        public SEChallengeDetail.List getList() {
            SEChallengeDetail.List list = this.list_;
            return list == null ? SEChallengeDetail.List.getDefaultInstance() : list;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
        public SEChallengeDetail.ListOrBuilder getListOrBuilder() {
            SEChallengeDetail.List list = this.list_;
            return list == null ? SEChallengeDetail.List.getDefaultInstance() : list;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
        public int getMaxStringLen() {
            return this.maxStringLen_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
        public int getMaxType() {
            return this.maxType_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEChallengeInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.maxType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.maxStringLen_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getList());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
        public boolean hasList() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
        public boolean hasMaxStringLen() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeInfoOrBuilder
        public boolean hasMaxType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasMaxType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMaxType();
            }
            if (hasMaxStringLen()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMaxStringLen();
            }
            if (hasList()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEChallengeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChallengeInfo.class, Builder.class);
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
            if (!hasMaxType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMaxStringLen()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.maxType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.maxStringLen_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEChallengeInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.maxType_ = 0;
            this.maxStringLen_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEChallengeInfo sEChallengeInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEChallengeInfo);
        }

        public static SEChallengeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEChallengeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChallengeInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEChallengeInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEChallengeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEChallengeInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEChallengeInfo() {
            this.maxType_ = 0;
            this.maxStringLen_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEChallengeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEChallengeInfo parseFrom(InputStream inputStream) {
            return (SEChallengeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEChallengeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChallengeInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEChallengeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEChallengeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEChallengeInfoOrBuilder extends MessageOrBuilder {
        SEChallengeDetail.List getList();

        SEChallengeDetail.ListOrBuilder getListOrBuilder();

        int getMaxStringLen();

        int getMaxType();

        boolean hasList();

        boolean hasMaxStringLen();

        boolean hasMaxType();
    }

    public static final class SEChallengeResoult extends GeneratedMessage implements SEChallengeResoultOrBuilder {
        public static final int CONTINUE_TIME_FIELD_NUMBER = 6;
        private static final SEChallengeResoult DEFAULT_INSTANCE;
        public static final int DIS_FIELD_NUMBER = 5;
        private static final Parser<SEChallengeResoult> PARSER;
        public static final int RESOULT_FIELD_NUMBER = 7;
        public static final int START_TIME_FIELD_NUMBER = 2;
        public static final int STEP_FIELD_NUMBER = 4;
        public static final int STOP_TIME_FIELD_NUMBER = 3;
        public static final int TYPE_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int continueTime_;
        private int dis_;
        private byte memoizedIsInitialized;
        private boolean resoult_;
        private CommonProtos.SETime startTime_;
        private int step_;
        private CommonProtos.SETime stopTime_;
        private int typeId_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEChallengeResoult$1 */
        public class AnonymousClass1 extends AbstractParser<SEChallengeResoult> {
            @Override // com.google.protobuf.Parser
            public SEChallengeResoult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEChallengeResoult.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEChallengeResoultOrBuilder {
            private int bitField0_;
            private int continueTime_;
            private int dis_;
            private boolean resoult_;
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> startTimeBuilder_;
            private CommonProtos.SETime startTime_;
            private int step_;
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> stopTimeBuilder_;
            private CommonProtos.SETime stopTime_;
            private int typeId_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEChallengeResoult sEChallengeResoult) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEChallengeResoult.typeId_ = this.typeId_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                    sEChallengeResoult.startTime_ = singleFieldBuilder == null ? this.startTime_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder2 = this.stopTimeBuilder_;
                    sEChallengeResoult.stopTime_ = singleFieldBuilder2 == null ? this.stopTime_ : (CommonProtos.SETime) singleFieldBuilder2.build();
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEChallengeResoult.step_ = this.step_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEChallengeResoult.dis_ = this.dis_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEChallengeResoult.continueTime_ = this.continueTime_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEChallengeResoult.resoult_ = this.resoult_;
                    i7 |= 64;
                }
                sEChallengeResoult.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEChallengeResoult_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetStartTimeFieldBuilder() {
                if (this.startTimeBuilder_ == null) {
                    this.startTimeBuilder_ = new SingleFieldBuilder<>(getStartTime(), getParentForChildren(), isClean());
                    this.startTime_ = null;
                }
                return this.startTimeBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetStopTimeFieldBuilder() {
                if (this.stopTimeBuilder_ == null) {
                    this.stopTimeBuilder_ = new SingleFieldBuilder<>(getStopTime(), getParentForChildren(), isClean());
                    this.stopTime_ = null;
                }
                return this.stopTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetStartTimeFieldBuilder();
                    internalGetStopTimeFieldBuilder();
                }
            }

            public Builder clearContinueTime() {
                this.bitField0_ &= -33;
                this.continueTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDis() {
                this.bitField0_ &= -17;
                this.dis_ = 0;
                onChanged();
                return this;
            }

            public Builder clearResoult() {
                this.bitField0_ &= -65;
                this.resoult_ = false;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.bitField0_ &= -3;
                this.startTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.startTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStep() {
                this.bitField0_ &= -9;
                this.step_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStopTime() {
                this.bitField0_ &= -5;
                this.stopTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.stopTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.stopTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTypeId() {
                this.bitField0_ &= -2;
                this.typeId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public int getContinueTime() {
                return this.continueTime_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEChallengeResoult_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public int getDis() {
                return this.dis_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean getResoult() {
                return this.resoult_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public CommonProtos.SETime getStartTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.startTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getStartTimeBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetStartTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public CommonProtos.SETimeOrBuilder getStartTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.startTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public int getStep() {
                return this.step_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public CommonProtos.SETime getStopTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.stopTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.stopTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getStopTimeBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetStopTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public CommonProtos.SETimeOrBuilder getStopTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.stopTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.stopTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public int getTypeId() {
                return this.typeId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean hasContinueTime() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean hasDis() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean hasResoult() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean hasStartTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean hasStep() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean hasStopTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
            public boolean hasTypeId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEChallengeResoult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChallengeResoult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTypeId() && hasStartTime() && hasStopTime() && hasContinueTime() && hasResoult() && getStartTime().isInitialized() && getStopTime().isInitialized();
            }

            public Builder mergeStartTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 2) == 0 || (sETime2 = this.startTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.startTime_ = sETime;
                } else {
                    getStartTimeBuilder().mergeFrom(sETime);
                }
                if (this.startTime_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.stopTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 4) == 0 || (sETime2 = this.stopTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.stopTime_ = sETime;
                } else {
                    getStopTimeBuilder().mergeFrom(sETime);
                }
                if (this.stopTime_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setContinueTime(int i7) {
                this.continueTime_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDis(int i7) {
                this.dis_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setResoult(boolean z6) {
                this.resoult_ = z6;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStartTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.startTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStep(int i7) {
                this.step_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStopTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.stopTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.stopTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTypeId(int i7) {
                this.typeId_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChallengeResoult build() {
                SEChallengeResoult sEChallengeResoultBuildPartial = buildPartial();
                if (sEChallengeResoultBuildPartial.isInitialized()) {
                    return sEChallengeResoultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEChallengeResoultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChallengeResoult buildPartial() {
                SEChallengeResoult sEChallengeResoult = new SEChallengeResoult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEChallengeResoult);
                }
                onBuilt();
                return sEChallengeResoult;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEChallengeResoult getDefaultInstanceForType() {
                return SEChallengeResoult.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.typeId_ = 0;
                this.startTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.startTimeBuilder_ = null;
                }
                this.stopTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder2 = this.stopTimeBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.stopTimeBuilder_ = null;
                }
                this.step_ = 0;
                this.dis_ = 0;
                this.continueTime_ = 0;
                this.resoult_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEChallengeResoult) {
                    return mergeFrom((SEChallengeResoult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setStartTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.startTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.startTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStopTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.stopTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.stopTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEChallengeResoult sEChallengeResoult) {
                if (sEChallengeResoult == SEChallengeResoult.getDefaultInstance()) {
                    return this;
                }
                if (sEChallengeResoult.hasTypeId()) {
                    setTypeId(sEChallengeResoult.getTypeId());
                }
                if (sEChallengeResoult.hasStartTime()) {
                    mergeStartTime(sEChallengeResoult.getStartTime());
                }
                if (sEChallengeResoult.hasStopTime()) {
                    mergeStopTime(sEChallengeResoult.getStopTime());
                }
                if (sEChallengeResoult.hasStep()) {
                    setStep(sEChallengeResoult.getStep());
                }
                if (sEChallengeResoult.hasDis()) {
                    setDis(sEChallengeResoult.getDis());
                }
                if (sEChallengeResoult.hasContinueTime()) {
                    setContinueTime(sEChallengeResoult.getContinueTime());
                }
                if (sEChallengeResoult.hasResoult()) {
                    setResoult(sEChallengeResoult.getResoult());
                }
                mergeUnknownFields(sEChallengeResoult.getUnknownFields());
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
                                    this.typeId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetStartTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetStopTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.step_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.dis_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.continueTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag != 56) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.resoult_ = codedInputStream.readBool();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEChallengeResoult");
            DEFAULT_INSTANCE = new SEChallengeResoult();
            PARSER = new AbstractParser<SEChallengeResoult>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoult.1
                @Override // com.google.protobuf.Parser
                public SEChallengeResoult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEChallengeResoult.newBuilder();
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

        public /* synthetic */ SEChallengeResoult(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEChallengeResoult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEChallengeResoult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEChallengeResoult parseDelimitedFrom(InputStream inputStream) {
            return (SEChallengeResoult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEChallengeResoult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEChallengeResoult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEChallengeResoult)) {
                return super.equals(obj);
            }
            SEChallengeResoult sEChallengeResoult = (SEChallengeResoult) obj;
            if (hasTypeId() != sEChallengeResoult.hasTypeId()) {
                return false;
            }
            if ((hasTypeId() && getTypeId() != sEChallengeResoult.getTypeId()) || hasStartTime() != sEChallengeResoult.hasStartTime()) {
                return false;
            }
            if ((hasStartTime() && !getStartTime().equals(sEChallengeResoult.getStartTime())) || hasStopTime() != sEChallengeResoult.hasStopTime()) {
                return false;
            }
            if ((hasStopTime() && !getStopTime().equals(sEChallengeResoult.getStopTime())) || hasStep() != sEChallengeResoult.hasStep()) {
                return false;
            }
            if ((hasStep() && getStep() != sEChallengeResoult.getStep()) || hasDis() != sEChallengeResoult.hasDis()) {
                return false;
            }
            if ((hasDis() && getDis() != sEChallengeResoult.getDis()) || hasContinueTime() != sEChallengeResoult.hasContinueTime()) {
                return false;
            }
            if ((!hasContinueTime() || getContinueTime() == sEChallengeResoult.getContinueTime()) && hasResoult() == sEChallengeResoult.hasResoult()) {
                return (!hasResoult() || getResoult() == sEChallengeResoult.getResoult()) && getUnknownFields().equals(sEChallengeResoult.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public int getContinueTime() {
            return this.continueTime_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEChallengeResoult_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public int getDis() {
            return this.dis_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEChallengeResoult> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean getResoult() {
            return this.resoult_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.typeId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getStartTime());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getStopTime());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.step_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.dis_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.continueTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(7, this.resoult_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public CommonProtos.SETime getStartTime() {
            CommonProtos.SETime sETime = this.startTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public CommonProtos.SETimeOrBuilder getStartTimeOrBuilder() {
            CommonProtos.SETime sETime = this.startTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public int getStep() {
            return this.step_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public CommonProtos.SETime getStopTime() {
            CommonProtos.SETime sETime = this.stopTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public CommonProtos.SETimeOrBuilder getStopTimeOrBuilder() {
            CommonProtos.SETime sETime = this.stopTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public int getTypeId() {
            return this.typeId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean hasContinueTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean hasDis() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean hasResoult() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean hasStartTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean hasStep() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean hasStopTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChallengeResoultOrBuilder
        public boolean hasTypeId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTypeId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTypeId();
            }
            if (hasStartTime()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getStartTime().hashCode();
            }
            if (hasStopTime()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getStopTime().hashCode();
            }
            if (hasStep()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getStep();
            }
            if (hasDis()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getDis();
            }
            if (hasContinueTime()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getContinueTime();
            }
            if (hasResoult()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + Internal.hashBoolean(getResoult());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEChallengeResoult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChallengeResoult.class, Builder.class);
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
            if (!hasTypeId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasStartTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasStopTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasContinueTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasResoult()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getStartTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getStopTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.typeId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStartTime());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStopTime());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.step_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.dis_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.continueTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.resoult_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEChallengeResoult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.typeId_ = 0;
            this.step_ = 0;
            this.dis_ = 0;
            this.continueTime_ = 0;
            this.resoult_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEChallengeResoult sEChallengeResoult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEChallengeResoult);
        }

        public static SEChallengeResoult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEChallengeResoult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeResoult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChallengeResoult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEChallengeResoult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEChallengeResoult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEChallengeResoult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEChallengeResoult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEChallengeResoult parseFrom(InputStream inputStream) {
            return (SEChallengeResoult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEChallengeResoult() {
            this.typeId_ = 0;
            this.step_ = 0;
            this.dis_ = 0;
            this.continueTime_ = 0;
            this.resoult_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEChallengeResoult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeResoult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChallengeResoult parseFrom(CodedInputStream codedInputStream) {
            return (SEChallengeResoult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEChallengeResoult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChallengeResoult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEChallengeResoultOrBuilder extends MessageOrBuilder {
        int getContinueTime();

        int getDis();

        boolean getResoult();

        CommonProtos.SETime getStartTime();

        CommonProtos.SETimeOrBuilder getStartTimeOrBuilder();

        int getStep();

        CommonProtos.SETime getStopTime();

        CommonProtos.SETimeOrBuilder getStopTimeOrBuilder();

        int getTypeId();

        boolean hasContinueTime();

        boolean hasDis();

        boolean hasResoult();

        boolean hasStartTime();

        boolean hasStep();

        boolean hasStopTime();

        boolean hasTypeId();
    }

    public static final class SEChildren extends GeneratedMessage implements SEChildrenOrBuilder {
        public static final int CHALLENGE_INFO_FIELD_NUMBER = 3;
        private static final SEChildren DEFAULT_INSTANCE;
        public static final int EARNINGS_INFO_FIELD_NUMBER = 4;
        public static final int EXCHANGE_INFO_FIELD_NUMBER = 6;
        public static final int EXCHANGE_RESOULT_FIELD_NUMBER = 7;
        public static final int FLASHCARD_SCHEDULE_FIELD_NUMBER = 8;
        public static final int FLASHCARD_THEME_LIST_FIELD_NUMBER = 1;
        public static final int MEDAL_INFO_FIELD_NUMBER = 9;
        private static final Parser<SEChildren> PARSER;
        public static final int THEME_ID_LIST_FIELD_NUMBER = 2;
        public static final int UNIVALENCE_LIST_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEChildren$1 */
        public class AnonymousClass1 extends AbstractParser<SEChildren> {
            @Override // com.google.protobuf.Parser
            public SEChildren parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEChildren.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEChildrenOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> challengeInfoBuilder_;
            private SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> earningsInfoBuilder_;
            private SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> exchangeInfoBuilder_;
            private SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> exchangeResoultBuilder_;
            private SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> flashcardScheduleBuilder_;
            private SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> flashcardThemeListBuilder_;
            private SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> medalInfoBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> themeIdListBuilder_;
            private SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> univalenceListBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEChildren sEChildren) {
            }

            private void buildPartialOneofs(SEChildren sEChildren) {
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder9;
                int i7 = this.payloadCase_;
                sEChildren.payloadCase_ = i7;
                sEChildren.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder9 = this.flashcardThemeListBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 2 && (singleFieldBuilder8 = this.themeIdListBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 3 && (singleFieldBuilder7 = this.challengeInfoBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder6 = this.earningsInfoBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder5 = this.univalenceListBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder4 = this.exchangeInfoBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder3 = this.exchangeResoultBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder2 = this.flashcardScheduleBuilder_) != null) {
                    sEChildren.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 9 || (singleFieldBuilder = this.medalInfoBuilder_) == null) {
                    return;
                }
                sEChildren.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEChildren_descriptor;
            }

            private SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> internalGetChallengeInfoFieldBuilder() {
                if (this.challengeInfoBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SEChallengeInfo.getDefaultInstance();
                    }
                    this.challengeInfoBuilder_ = new SingleFieldBuilder<>((SEChallengeInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.challengeInfoBuilder_;
            }

            private SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> internalGetEarningsInfoFieldBuilder() {
                if (this.earningsInfoBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SEEarningsInfo.getDefaultInstance();
                    }
                    this.earningsInfoBuilder_ = new SingleFieldBuilder<>((SEEarningsInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.earningsInfoBuilder_;
            }

            private SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> internalGetExchangeInfoFieldBuilder() {
                if (this.exchangeInfoBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEExchangeInfo.getDefaultInstance();
                    }
                    this.exchangeInfoBuilder_ = new SingleFieldBuilder<>((SEExchangeInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.exchangeInfoBuilder_;
            }

            private SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> internalGetExchangeResoultFieldBuilder() {
                if (this.exchangeResoultBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEChallengeResoult.getDefaultInstance();
                    }
                    this.exchangeResoultBuilder_ = new SingleFieldBuilder<>((SEChallengeResoult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.exchangeResoultBuilder_;
            }

            private SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> internalGetFlashcardScheduleFieldBuilder() {
                if (this.flashcardScheduleBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SEFlashCardThemeSchedule.getDefaultInstance();
                    }
                    this.flashcardScheduleBuilder_ = new SingleFieldBuilder<>((SEFlashCardThemeSchedule) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.flashcardScheduleBuilder_;
            }

            private SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> internalGetFlashcardThemeListFieldBuilder() {
                if (this.flashcardThemeListBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEFlashCardThemeInfo.ThemeInfoList.getDefaultInstance();
                    }
                    this.flashcardThemeListBuilder_ = new SingleFieldBuilder<>((SEFlashCardThemeInfo.ThemeInfoList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.flashcardThemeListBuilder_;
            }

            private SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> internalGetMedalInfoFieldBuilder() {
                if (this.medalInfoBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = SEMedalInfo.SEList.getDefaultInstance();
                    }
                    this.medalInfoBuilder_ = new SingleFieldBuilder<>((SEMedalInfo.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.medalInfoBuilder_;
            }

            private SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> internalGetThemeIdListFieldBuilder() {
                if (this.themeIdListBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SEFlashCardThemeInfo.ThemeIDList.getDefaultInstance();
                    }
                    this.themeIdListBuilder_ = new SingleFieldBuilder<>((SEFlashCardThemeInfo.ThemeIDList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.themeIdListBuilder_;
            }

            private SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> internalGetUnivalenceListFieldBuilder() {
                if (this.univalenceListBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEEarningsInfo.univalenceList.getDefaultInstance();
                    }
                    this.univalenceListBuilder_ = new SingleFieldBuilder<>((SEEarningsInfo.univalenceList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.univalenceListBuilder_;
            }

            public Builder clearChallengeInfo() {
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder = this.challengeInfoBuilder_;
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

            public Builder clearEarningsInfo() {
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder = this.earningsInfoBuilder_;
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

            public Builder clearExchangeInfo() {
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder = this.exchangeInfoBuilder_;
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

            public Builder clearExchangeResoult() {
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder = this.exchangeResoultBuilder_;
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

            public Builder clearFlashcardSchedule() {
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder = this.flashcardScheduleBuilder_;
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

            public Builder clearFlashcardThemeList() {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder = this.flashcardThemeListBuilder_;
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

            public Builder clearMedalInfo() {
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder = this.medalInfoBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearThemeIdList() {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder = this.themeIdListBuilder_;
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

            public Builder clearUnivalenceList() {
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder = this.univalenceListBuilder_;
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

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEChallengeInfo getChallengeInfo() {
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder = this.challengeInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SEChallengeInfo) this.payload_ : SEChallengeInfo.getDefaultInstance() : this.payloadCase_ == 3 ? (SEChallengeInfo) singleFieldBuilder.getMessage() : SEChallengeInfo.getDefaultInstance();
            }

            public SEChallengeInfo.Builder getChallengeInfoBuilder() {
                return (SEChallengeInfo.Builder) internalGetChallengeInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEChallengeInfoOrBuilder getChallengeInfoOrBuilder() {
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.challengeInfoBuilder_) == null) ? i7 == 3 ? (SEChallengeInfo) this.payload_ : SEChallengeInfo.getDefaultInstance() : (SEChallengeInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEChildren_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEEarningsInfo getEarningsInfo() {
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder = this.earningsInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SEEarningsInfo) this.payload_ : SEEarningsInfo.getDefaultInstance() : this.payloadCase_ == 4 ? (SEEarningsInfo) singleFieldBuilder.getMessage() : SEEarningsInfo.getDefaultInstance();
            }

            public SEEarningsInfo.Builder getEarningsInfoBuilder() {
                return (SEEarningsInfo.Builder) internalGetEarningsInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEEarningsInfoOrBuilder getEarningsInfoOrBuilder() {
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.earningsInfoBuilder_) == null) ? i7 == 4 ? (SEEarningsInfo) this.payload_ : SEEarningsInfo.getDefaultInstance() : (SEEarningsInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEExchangeInfo getExchangeInfo() {
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder = this.exchangeInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEExchangeInfo) this.payload_ : SEExchangeInfo.getDefaultInstance() : this.payloadCase_ == 6 ? (SEExchangeInfo) singleFieldBuilder.getMessage() : SEExchangeInfo.getDefaultInstance();
            }

            public SEExchangeInfo.Builder getExchangeInfoBuilder() {
                return (SEExchangeInfo.Builder) internalGetExchangeInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEExchangeInfoOrBuilder getExchangeInfoOrBuilder() {
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.exchangeInfoBuilder_) == null) ? i7 == 6 ? (SEExchangeInfo) this.payload_ : SEExchangeInfo.getDefaultInstance() : (SEExchangeInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEChallengeResoult getExchangeResoult() {
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder = this.exchangeResoultBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEChallengeResoult) this.payload_ : SEChallengeResoult.getDefaultInstance() : this.payloadCase_ == 7 ? (SEChallengeResoult) singleFieldBuilder.getMessage() : SEChallengeResoult.getDefaultInstance();
            }

            public SEChallengeResoult.Builder getExchangeResoultBuilder() {
                return (SEChallengeResoult.Builder) internalGetExchangeResoultFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEChallengeResoultOrBuilder getExchangeResoultOrBuilder() {
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.exchangeResoultBuilder_) == null) ? i7 == 7 ? (SEChallengeResoult) this.payload_ : SEChallengeResoult.getDefaultInstance() : (SEChallengeResoultOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEFlashCardThemeSchedule getFlashcardSchedule() {
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder = this.flashcardScheduleBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SEFlashCardThemeSchedule) this.payload_ : SEFlashCardThemeSchedule.getDefaultInstance() : this.payloadCase_ == 8 ? (SEFlashCardThemeSchedule) singleFieldBuilder.getMessage() : SEFlashCardThemeSchedule.getDefaultInstance();
            }

            public SEFlashCardThemeSchedule.Builder getFlashcardScheduleBuilder() {
                return (SEFlashCardThemeSchedule.Builder) internalGetFlashcardScheduleFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEFlashCardThemeScheduleOrBuilder getFlashcardScheduleOrBuilder() {
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.flashcardScheduleBuilder_) == null) ? i7 == 8 ? (SEFlashCardThemeSchedule) this.payload_ : SEFlashCardThemeSchedule.getDefaultInstance() : (SEFlashCardThemeScheduleOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEFlashCardThemeInfo.ThemeInfoList getFlashcardThemeList() {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder = this.flashcardThemeListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEFlashCardThemeInfo.ThemeInfoList) this.payload_ : SEFlashCardThemeInfo.ThemeInfoList.getDefaultInstance() : this.payloadCase_ == 1 ? (SEFlashCardThemeInfo.ThemeInfoList) singleFieldBuilder.getMessage() : SEFlashCardThemeInfo.ThemeInfoList.getDefaultInstance();
            }

            public SEFlashCardThemeInfo.ThemeInfoList.Builder getFlashcardThemeListBuilder() {
                return (SEFlashCardThemeInfo.ThemeInfoList.Builder) internalGetFlashcardThemeListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEFlashCardThemeInfo.ThemeInfoListOrBuilder getFlashcardThemeListOrBuilder() {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.flashcardThemeListBuilder_) == null) ? i7 == 1 ? (SEFlashCardThemeInfo.ThemeInfoList) this.payload_ : SEFlashCardThemeInfo.ThemeInfoList.getDefaultInstance() : (SEFlashCardThemeInfo.ThemeInfoListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEMedalInfo.SEList getMedalInfo() {
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder = this.medalInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (SEMedalInfo.SEList) this.payload_ : SEMedalInfo.SEList.getDefaultInstance() : this.payloadCase_ == 9 ? (SEMedalInfo.SEList) singleFieldBuilder.getMessage() : SEMedalInfo.SEList.getDefaultInstance();
            }

            public SEMedalInfo.SEList.Builder getMedalInfoBuilder() {
                return (SEMedalInfo.SEList.Builder) internalGetMedalInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEMedalInfo.SEListOrBuilder getMedalInfoOrBuilder() {
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.medalInfoBuilder_) == null) ? i7 == 9 ? (SEMedalInfo.SEList) this.payload_ : SEMedalInfo.SEList.getDefaultInstance() : (SEMedalInfo.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEFlashCardThemeInfo.ThemeIDList getThemeIdList() {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder = this.themeIdListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SEFlashCardThemeInfo.ThemeIDList) this.payload_ : SEFlashCardThemeInfo.ThemeIDList.getDefaultInstance() : this.payloadCase_ == 2 ? (SEFlashCardThemeInfo.ThemeIDList) singleFieldBuilder.getMessage() : SEFlashCardThemeInfo.ThemeIDList.getDefaultInstance();
            }

            public SEFlashCardThemeInfo.ThemeIDList.Builder getThemeIdListBuilder() {
                return (SEFlashCardThemeInfo.ThemeIDList.Builder) internalGetThemeIdListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEFlashCardThemeInfo.ThemeIDListOrBuilder getThemeIdListOrBuilder() {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.themeIdListBuilder_) == null) ? i7 == 2 ? (SEFlashCardThemeInfo.ThemeIDList) this.payload_ : SEFlashCardThemeInfo.ThemeIDList.getDefaultInstance() : (SEFlashCardThemeInfo.ThemeIDListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEEarningsInfo.univalenceList getUnivalenceList() {
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder = this.univalenceListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEEarningsInfo.univalenceList) this.payload_ : SEEarningsInfo.univalenceList.getDefaultInstance() : this.payloadCase_ == 5 ? (SEEarningsInfo.univalenceList) singleFieldBuilder.getMessage() : SEEarningsInfo.univalenceList.getDefaultInstance();
            }

            public SEEarningsInfo.univalenceList.Builder getUnivalenceListBuilder() {
                return (SEEarningsInfo.univalenceList.Builder) internalGetUnivalenceListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public SEEarningsInfo.univalenceListOrBuilder getUnivalenceListOrBuilder() {
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.univalenceListBuilder_) == null) ? i7 == 5 ? (SEEarningsInfo.univalenceList) this.payload_ : SEEarningsInfo.univalenceList.getDefaultInstance() : (SEEarningsInfo.univalenceListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasChallengeInfo() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasEarningsInfo() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasExchangeInfo() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasExchangeResoult() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasFlashcardSchedule() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasFlashcardThemeList() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasMedalInfo() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasThemeIdList() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
            public boolean hasUnivalenceList() {
                return this.payloadCase_ == 5;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEChildren_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChildren.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasFlashcardThemeList() && !getFlashcardThemeList().isInitialized()) {
                    return false;
                }
                if (hasThemeIdList() && !getThemeIdList().isInitialized()) {
                    return false;
                }
                if (hasChallengeInfo() && !getChallengeInfo().isInitialized()) {
                    return false;
                }
                if (hasEarningsInfo() && !getEarningsInfo().isInitialized()) {
                    return false;
                }
                if (hasExchangeInfo() && !getExchangeInfo().isInitialized()) {
                    return false;
                }
                if (hasExchangeResoult() && !getExchangeResoult().isInitialized()) {
                    return false;
                }
                if (!hasFlashcardSchedule() || getFlashcardSchedule().isInitialized()) {
                    return !hasMedalInfo() || getMedalInfo().isInitialized();
                }
                return false;
            }

            public Builder mergeChallengeInfo(SEChallengeInfo sEChallengeInfo) {
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder = this.challengeInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SEChallengeInfo.getDefaultInstance()) {
                        this.payload_ = sEChallengeInfo;
                    } else {
                        this.payload_ = SEChallengeInfo.newBuilder((SEChallengeInfo) this.payload_).mergeFrom(sEChallengeInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEChallengeInfo);
                } else {
                    singleFieldBuilder.setMessage(sEChallengeInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeEarningsInfo(SEEarningsInfo sEEarningsInfo) {
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder = this.earningsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SEEarningsInfo.getDefaultInstance()) {
                        this.payload_ = sEEarningsInfo;
                    } else {
                        this.payload_ = SEEarningsInfo.newBuilder((SEEarningsInfo) this.payload_).mergeFrom(sEEarningsInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEEarningsInfo);
                } else {
                    singleFieldBuilder.setMessage(sEEarningsInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeExchangeInfo(SEExchangeInfo sEExchangeInfo) {
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder = this.exchangeInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEExchangeInfo.getDefaultInstance()) {
                        this.payload_ = sEExchangeInfo;
                    } else {
                        this.payload_ = SEExchangeInfo.newBuilder((SEExchangeInfo) this.payload_).mergeFrom(sEExchangeInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEExchangeInfo);
                } else {
                    singleFieldBuilder.setMessage(sEExchangeInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeExchangeResoult(SEChallengeResoult sEChallengeResoult) {
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder = this.exchangeResoultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEChallengeResoult.getDefaultInstance()) {
                        this.payload_ = sEChallengeResoult;
                    } else {
                        this.payload_ = SEChallengeResoult.newBuilder((SEChallengeResoult) this.payload_).mergeFrom(sEChallengeResoult).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEChallengeResoult);
                } else {
                    singleFieldBuilder.setMessage(sEChallengeResoult);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeFlashcardSchedule(SEFlashCardThemeSchedule sEFlashCardThemeSchedule) {
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder = this.flashcardScheduleBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SEFlashCardThemeSchedule.getDefaultInstance()) {
                        this.payload_ = sEFlashCardThemeSchedule;
                    } else {
                        this.payload_ = SEFlashCardThemeSchedule.newBuilder((SEFlashCardThemeSchedule) this.payload_).mergeFrom(sEFlashCardThemeSchedule).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sEFlashCardThemeSchedule);
                } else {
                    singleFieldBuilder.setMessage(sEFlashCardThemeSchedule);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeFlashcardThemeList(SEFlashCardThemeInfo.ThemeInfoList themeInfoList) {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder = this.flashcardThemeListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEFlashCardThemeInfo.ThemeInfoList.getDefaultInstance()) {
                        this.payload_ = themeInfoList;
                    } else {
                        this.payload_ = SEFlashCardThemeInfo.ThemeInfoList.newBuilder((SEFlashCardThemeInfo.ThemeInfoList) this.payload_).mergeFrom(themeInfoList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(themeInfoList);
                } else {
                    singleFieldBuilder.setMessage(themeInfoList);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeMedalInfo(SEMedalInfo.SEList sEList) {
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder = this.medalInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 9 || this.payload_ == SEMedalInfo.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEMedalInfo.SEList.newBuilder((SEMedalInfo.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 9) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder mergeThemeIdList(SEFlashCardThemeInfo.ThemeIDList themeIDList) {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder = this.themeIdListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SEFlashCardThemeInfo.ThemeIDList.getDefaultInstance()) {
                        this.payload_ = themeIDList;
                    } else {
                        this.payload_ = SEFlashCardThemeInfo.ThemeIDList.newBuilder((SEFlashCardThemeInfo.ThemeIDList) this.payload_).mergeFrom(themeIDList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(themeIDList);
                } else {
                    singleFieldBuilder.setMessage(themeIDList);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeUnivalenceList(SEEarningsInfo.univalenceList univalencelist) {
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder = this.univalenceListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEEarningsInfo.univalenceList.getDefaultInstance()) {
                        this.payload_ = univalencelist;
                    } else {
                        this.payload_ = SEEarningsInfo.univalenceList.newBuilder((SEEarningsInfo.univalenceList) this.payload_).mergeFrom(univalencelist).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(univalencelist);
                } else {
                    singleFieldBuilder.setMessage(univalencelist);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setChallengeInfo(SEChallengeInfo sEChallengeInfo) {
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder = this.challengeInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEChallengeInfo.getClass();
                    this.payload_ = sEChallengeInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEChallengeInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setEarningsInfo(SEEarningsInfo sEEarningsInfo) {
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder = this.earningsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEEarningsInfo.getClass();
                    this.payload_ = sEEarningsInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEEarningsInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setExchangeInfo(SEExchangeInfo sEExchangeInfo) {
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder = this.exchangeInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEExchangeInfo.getClass();
                    this.payload_ = sEExchangeInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEExchangeInfo);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setExchangeResoult(SEChallengeResoult sEChallengeResoult) {
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder = this.exchangeResoultBuilder_;
                if (singleFieldBuilder == null) {
                    sEChallengeResoult.getClass();
                    this.payload_ = sEChallengeResoult;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEChallengeResoult);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setFlashcardSchedule(SEFlashCardThemeSchedule sEFlashCardThemeSchedule) {
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder = this.flashcardScheduleBuilder_;
                if (singleFieldBuilder == null) {
                    sEFlashCardThemeSchedule.getClass();
                    this.payload_ = sEFlashCardThemeSchedule;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEFlashCardThemeSchedule);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setFlashcardThemeList(SEFlashCardThemeInfo.ThemeInfoList themeInfoList) {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder = this.flashcardThemeListBuilder_;
                if (singleFieldBuilder == null) {
                    themeInfoList.getClass();
                    this.payload_ = themeInfoList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(themeInfoList);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setMedalInfo(SEMedalInfo.SEList sEList) {
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder = this.medalInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setThemeIdList(SEFlashCardThemeInfo.ThemeIDList themeIDList) {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder = this.themeIdListBuilder_;
                if (singleFieldBuilder == null) {
                    themeIDList.getClass();
                    this.payload_ = themeIDList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(themeIDList);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setUnivalenceList(SEEarningsInfo.univalenceList univalencelist) {
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder = this.univalenceListBuilder_;
                if (singleFieldBuilder == null) {
                    univalencelist.getClass();
                    this.payload_ = univalencelist;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(univalencelist);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChildren build() {
                SEChildren sEChildrenBuildPartial = buildPartial();
                if (sEChildrenBuildPartial.isInitialized()) {
                    return sEChildrenBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEChildrenBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChildren buildPartial() {
                SEChildren sEChildren = new SEChildren(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEChildren);
                }
                buildPartialOneofs(sEChildren);
                onBuilt();
                return sEChildren;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEChildren getDefaultInstanceForType() {
                return SEChildren.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder = this.flashcardThemeListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder2 = this.themeIdListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder3 = this.challengeInfoBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder4 = this.earningsInfoBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder5 = this.univalenceListBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder6 = this.exchangeInfoBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder7 = this.exchangeResoultBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder8 = this.flashcardScheduleBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder9 = this.medalInfoBuilder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEChildren) {
                    return mergeFrom((SEChildren) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setChallengeInfo(SEChallengeInfo.Builder builder) {
                SingleFieldBuilder<SEChallengeInfo, SEChallengeInfo.Builder, SEChallengeInfoOrBuilder> singleFieldBuilder = this.challengeInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setEarningsInfo(SEEarningsInfo.Builder builder) {
                SingleFieldBuilder<SEEarningsInfo, SEEarningsInfo.Builder, SEEarningsInfoOrBuilder> singleFieldBuilder = this.earningsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setExchangeInfo(SEExchangeInfo.Builder builder) {
                SingleFieldBuilder<SEExchangeInfo, SEExchangeInfo.Builder, SEExchangeInfoOrBuilder> singleFieldBuilder = this.exchangeInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setExchangeResoult(SEChallengeResoult.Builder builder) {
                SingleFieldBuilder<SEChallengeResoult, SEChallengeResoult.Builder, SEChallengeResoultOrBuilder> singleFieldBuilder = this.exchangeResoultBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setFlashcardSchedule(SEFlashCardThemeSchedule.Builder builder) {
                SingleFieldBuilder<SEFlashCardThemeSchedule, SEFlashCardThemeSchedule.Builder, SEFlashCardThemeScheduleOrBuilder> singleFieldBuilder = this.flashcardScheduleBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setFlashcardThemeList(SEFlashCardThemeInfo.ThemeInfoList.Builder builder) {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeInfoList, SEFlashCardThemeInfo.ThemeInfoList.Builder, SEFlashCardThemeInfo.ThemeInfoListOrBuilder> singleFieldBuilder = this.flashcardThemeListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setMedalInfo(SEMedalInfo.SEList.Builder builder) {
                SingleFieldBuilder<SEMedalInfo.SEList, SEMedalInfo.SEList.Builder, SEMedalInfo.SEListOrBuilder> singleFieldBuilder = this.medalInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setThemeIdList(SEFlashCardThemeInfo.ThemeIDList.Builder builder) {
                SingleFieldBuilder<SEFlashCardThemeInfo.ThemeIDList, SEFlashCardThemeInfo.ThemeIDList.Builder, SEFlashCardThemeInfo.ThemeIDListOrBuilder> singleFieldBuilder = this.themeIdListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setUnivalenceList(SEEarningsInfo.univalenceList.Builder builder) {
                SingleFieldBuilder<SEEarningsInfo.univalenceList, SEEarningsInfo.univalenceList.Builder, SEEarningsInfo.univalenceListOrBuilder> singleFieldBuilder = this.univalenceListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeFrom(SEChildren sEChildren) {
                if (sEChildren == SEChildren.getDefaultInstance()) {
                    return this;
                }
                switch (sEChildren.getPayloadCase()) {
                    case FLASHCARD_THEME_LIST:
                        mergeFlashcardThemeList(sEChildren.getFlashcardThemeList());
                        break;
                    case THEME_ID_LIST:
                        mergeThemeIdList(sEChildren.getThemeIdList());
                        break;
                    case CHALLENGE_INFO:
                        mergeChallengeInfo(sEChildren.getChallengeInfo());
                        break;
                    case EARNINGS_INFO:
                        mergeEarningsInfo(sEChildren.getEarningsInfo());
                        break;
                    case UNIVALENCE_LIST:
                        mergeUnivalenceList(sEChildren.getUnivalenceList());
                        break;
                    case EXCHANGE_INFO:
                        mergeExchangeInfo(sEChildren.getExchangeInfo());
                        break;
                    case EXCHANGE_RESOULT:
                        mergeExchangeResoult(sEChildren.getExchangeResoult());
                        break;
                    case FLASHCARD_SCHEDULE:
                        mergeFlashcardSchedule(sEChildren.getFlashcardSchedule());
                        break;
                    case MEDAL_INFO:
                        mergeMedalInfo(sEChildren.getMedalInfo());
                        break;
                }
                mergeUnknownFields(sEChildren.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetFlashcardThemeListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetThemeIdListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetChallengeInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetEarningsInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetUnivalenceListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetExchangeInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(internalGetExchangeResoultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(internalGetFlashcardScheduleFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                } else if (tag != 74) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetMedalInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 9;
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

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            FLASHCARD_THEME_LIST(1),
            THEME_ID_LIST(2),
            CHALLENGE_INFO(3),
            EARNINGS_INFO(4),
            UNIVALENCE_LIST(5),
            EXCHANGE_INFO(6),
            EXCHANGE_RESOULT(7),
            FLASHCARD_SCHEDULE(8),
            MEDAL_INFO(9),
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
                        return FLASHCARD_THEME_LIST;
                    case 2:
                        return THEME_ID_LIST;
                    case 3:
                        return CHALLENGE_INFO;
                    case 4:
                        return EARNINGS_INFO;
                    case 5:
                        return UNIVALENCE_LIST;
                    case 6:
                        return EXCHANGE_INFO;
                    case 7:
                        return EXCHANGE_RESOULT;
                    case 8:
                        return FLASHCARD_SCHEDULE;
                    case 9:
                        return MEDAL_INFO;
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEChildren");
            DEFAULT_INSTANCE = new SEChildren();
            PARSER = new AbstractParser<SEChildren>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildren.1
                @Override // com.google.protobuf.Parser
                public SEChildren parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEChildren.newBuilder();
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

        public /* synthetic */ SEChildren(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEChildren getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEChildren_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEChildren parseDelimitedFrom(InputStream inputStream) {
            return (SEChildren) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEChildren parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEChildren> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEChildren)) {
                return super.equals(obj);
            }
            SEChildren sEChildren = (SEChildren) obj;
            if (!getPayloadCase().equals(sEChildren.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getFlashcardThemeList().equals(sEChildren.getFlashcardThemeList())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getThemeIdList().equals(sEChildren.getThemeIdList())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getChallengeInfo().equals(sEChildren.getChallengeInfo())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getEarningsInfo().equals(sEChildren.getEarningsInfo())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getUnivalenceList().equals(sEChildren.getUnivalenceList())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getExchangeInfo().equals(sEChildren.getExchangeInfo())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getExchangeResoult().equals(sEChildren.getExchangeResoult())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getFlashcardSchedule().equals(sEChildren.getFlashcardSchedule())) {
                        return false;
                    }
                    break;
                case 9:
                    if (!getMedalInfo().equals(sEChildren.getMedalInfo())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEChildren.getUnknownFields());
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEChallengeInfo getChallengeInfo() {
            return this.payloadCase_ == 3 ? (SEChallengeInfo) this.payload_ : SEChallengeInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEChallengeInfoOrBuilder getChallengeInfoOrBuilder() {
            return this.payloadCase_ == 3 ? (SEChallengeInfo) this.payload_ : SEChallengeInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEChildren_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEEarningsInfo getEarningsInfo() {
            return this.payloadCase_ == 4 ? (SEEarningsInfo) this.payload_ : SEEarningsInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEEarningsInfoOrBuilder getEarningsInfoOrBuilder() {
            return this.payloadCase_ == 4 ? (SEEarningsInfo) this.payload_ : SEEarningsInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEExchangeInfo getExchangeInfo() {
            return this.payloadCase_ == 6 ? (SEExchangeInfo) this.payload_ : SEExchangeInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEExchangeInfoOrBuilder getExchangeInfoOrBuilder() {
            return this.payloadCase_ == 6 ? (SEExchangeInfo) this.payload_ : SEExchangeInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEChallengeResoult getExchangeResoult() {
            return this.payloadCase_ == 7 ? (SEChallengeResoult) this.payload_ : SEChallengeResoult.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEChallengeResoultOrBuilder getExchangeResoultOrBuilder() {
            return this.payloadCase_ == 7 ? (SEChallengeResoult) this.payload_ : SEChallengeResoult.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEFlashCardThemeSchedule getFlashcardSchedule() {
            return this.payloadCase_ == 8 ? (SEFlashCardThemeSchedule) this.payload_ : SEFlashCardThemeSchedule.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEFlashCardThemeScheduleOrBuilder getFlashcardScheduleOrBuilder() {
            return this.payloadCase_ == 8 ? (SEFlashCardThemeSchedule) this.payload_ : SEFlashCardThemeSchedule.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEFlashCardThemeInfo.ThemeInfoList getFlashcardThemeList() {
            return this.payloadCase_ == 1 ? (SEFlashCardThemeInfo.ThemeInfoList) this.payload_ : SEFlashCardThemeInfo.ThemeInfoList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEFlashCardThemeInfo.ThemeInfoListOrBuilder getFlashcardThemeListOrBuilder() {
            return this.payloadCase_ == 1 ? (SEFlashCardThemeInfo.ThemeInfoList) this.payload_ : SEFlashCardThemeInfo.ThemeInfoList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEMedalInfo.SEList getMedalInfo() {
            return this.payloadCase_ == 9 ? (SEMedalInfo.SEList) this.payload_ : SEMedalInfo.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEMedalInfo.SEListOrBuilder getMedalInfoOrBuilder() {
            return this.payloadCase_ == 9 ? (SEMedalInfo.SEList) this.payload_ : SEMedalInfo.SEList.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEChildren> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEFlashCardThemeInfo.ThemeInfoList) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SEFlashCardThemeInfo.ThemeIDList) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (SEChallengeInfo) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (SEEarningsInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SEEarningsInfo.univalenceList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SEExchangeInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (SEChallengeResoult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (SEFlashCardThemeSchedule) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, (SEMedalInfo.SEList) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEFlashCardThemeInfo.ThemeIDList getThemeIdList() {
            return this.payloadCase_ == 2 ? (SEFlashCardThemeInfo.ThemeIDList) this.payload_ : SEFlashCardThemeInfo.ThemeIDList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEFlashCardThemeInfo.ThemeIDListOrBuilder getThemeIdListOrBuilder() {
            return this.payloadCase_ == 2 ? (SEFlashCardThemeInfo.ThemeIDList) this.payload_ : SEFlashCardThemeInfo.ThemeIDList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEEarningsInfo.univalenceList getUnivalenceList() {
            return this.payloadCase_ == 5 ? (SEEarningsInfo.univalenceList) this.payload_ : SEEarningsInfo.univalenceList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public SEEarningsInfo.univalenceListOrBuilder getUnivalenceListOrBuilder() {
            return this.payloadCase_ == 5 ? (SEEarningsInfo.univalenceList) this.payload_ : SEEarningsInfo.univalenceList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasChallengeInfo() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasEarningsInfo() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasExchangeInfo() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasExchangeResoult() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasFlashcardSchedule() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasFlashcardThemeList() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasMedalInfo() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasThemeIdList() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildrenOrBuilder
        public boolean hasUnivalenceList() {
            return this.payloadCase_ == 5;
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
                    iHashCode = getFlashcardThemeList().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getThemeIdList().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getChallengeInfo().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getEarningsInfo().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getUnivalenceList().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getExchangeInfo().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getExchangeResoult().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getFlashcardSchedule().hashCode();
                    break;
                case 9:
                    i7 = ((iHashCode2 * 37) + 9) * 53;
                    iHashCode = getMedalInfo().hashCode();
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
            return ChildrenProtos.internal_static_SA_SEChildren_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChildren.class, Builder.class);
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
            if (hasFlashcardThemeList() && !getFlashcardThemeList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasThemeIdList() && !getThemeIdList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasChallengeInfo() && !getChallengeInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEarningsInfo() && !getEarningsInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExchangeInfo() && !getExchangeInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExchangeResoult() && !getExchangeResoult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFlashcardSchedule() && !getFlashcardSchedule().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMedalInfo() || getMedalInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEFlashCardThemeInfo.ThemeInfoList) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SEFlashCardThemeInfo.ThemeIDList) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SEChallengeInfo) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SEEarningsInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEEarningsInfo.univalenceList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEExchangeInfo) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEChallengeResoult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SEFlashCardThemeSchedule) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (SEMedalInfo.SEList) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEChildren(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEChildren sEChildren) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEChildren);
        }

        public static SEChildren parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEChildren parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChildren) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChildren parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEChildren getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEChildren parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEChildren() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEChildren parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEChildren parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEChildren parseFrom(InputStream inputStream) {
            return (SEChildren) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEChildren parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChildren) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChildren parseFrom(CodedInputStream codedInputStream) {
            return (SEChildren) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEChildren parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChildren) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEChildrenOrBuilder extends MessageOrBuilder {
        SEChallengeInfo getChallengeInfo();

        SEChallengeInfoOrBuilder getChallengeInfoOrBuilder();

        SEEarningsInfo getEarningsInfo();

        SEEarningsInfoOrBuilder getEarningsInfoOrBuilder();

        SEExchangeInfo getExchangeInfo();

        SEExchangeInfoOrBuilder getExchangeInfoOrBuilder();

        SEChallengeResoult getExchangeResoult();

        SEChallengeResoultOrBuilder getExchangeResoultOrBuilder();

        SEFlashCardThemeSchedule getFlashcardSchedule();

        SEFlashCardThemeScheduleOrBuilder getFlashcardScheduleOrBuilder();

        SEFlashCardThemeInfo.ThemeInfoList getFlashcardThemeList();

        SEFlashCardThemeInfo.ThemeInfoListOrBuilder getFlashcardThemeListOrBuilder();

        SEMedalInfo.SEList getMedalInfo();

        SEMedalInfo.SEListOrBuilder getMedalInfoOrBuilder();

        SEChildren.PayloadCase getPayloadCase();

        SEFlashCardThemeInfo.ThemeIDList getThemeIdList();

        SEFlashCardThemeInfo.ThemeIDListOrBuilder getThemeIdListOrBuilder();

        SEEarningsInfo.univalenceList getUnivalenceList();

        SEEarningsInfo.univalenceListOrBuilder getUnivalenceListOrBuilder();

        boolean hasChallengeInfo();

        boolean hasEarningsInfo();

        boolean hasExchangeInfo();

        boolean hasExchangeResoult();

        boolean hasFlashcardSchedule();

        boolean hasFlashcardThemeList();

        boolean hasMedalInfo();

        boolean hasThemeIdList();

        boolean hasUnivalenceList();
    }

    public enum SEChildren_ChildrenID implements ProtocolMessageEnum {
        GET_FLASH_CARD_THEME_ID(0),
        CHANGE_FLASH_CARD_THEME_ID(1),
        DEL_FLASH_CARD_THEME_ID(2),
        SET_CHALLENGE_INFO_ID(3),
        GET_CHALLENGE_INFO_ID(4),
        SET_EARNINGS_INFO_ID(5),
        GET_EARNINGS_INFO_ID(6),
        GET_CHANGE_POCKET_MONEY_ID(7),
        SEND_CHALLENGE_RESOULT_INFO_ID(8),
        SEND_FLASHCARD_SCHEDULE_ID(9),
        SET_EARNINGS_OBTAINED_ID(10),
        SET_MEDAL_Info_ID(11),
        GET_MEDAL_Info_ID(12);

        public static final int CHANGE_FLASH_CARD_THEME_ID_VALUE = 1;
        public static final int DEL_FLASH_CARD_THEME_ID_VALUE = 2;
        public static final int GET_CHALLENGE_INFO_ID_VALUE = 4;
        public static final int GET_CHANGE_POCKET_MONEY_ID_VALUE = 7;
        public static final int GET_EARNINGS_INFO_ID_VALUE = 6;
        public static final int GET_FLASH_CARD_THEME_ID_VALUE = 0;
        public static final int GET_MEDAL_Info_ID_VALUE = 12;
        public static final int SEND_CHALLENGE_RESOULT_INFO_ID_VALUE = 8;
        public static final int SEND_FLASHCARD_SCHEDULE_ID_VALUE = 9;
        public static final int SET_CHALLENGE_INFO_ID_VALUE = 3;
        public static final int SET_EARNINGS_INFO_ID_VALUE = 5;
        public static final int SET_EARNINGS_OBTAINED_ID_VALUE = 10;
        public static final int SET_MEDAL_Info_ID_VALUE = 11;
        private static final SEChildren_ChildrenID[] VALUES;
        private static final Internal.EnumLiteMap<SEChildren_ChildrenID> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEChildren_ChildrenID$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEChildren_ChildrenID> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEChildren_ChildrenID findValueByNumber(int i7) {
                return SEChildren_ChildrenID.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEChildren_ChildrenID");
            internalValueMap = new Internal.EnumLiteMap<SEChildren_ChildrenID>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEChildren_ChildrenID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEChildren_ChildrenID findValueByNumber(int i7) {
                    return SEChildren_ChildrenID.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEChildren_ChildrenID(int i7) {
            this.value = i7;
        }

        public static SEChildren_ChildrenID forNumber(int i7) {
            switch (i7) {
                case 0:
                    return GET_FLASH_CARD_THEME_ID;
                case 1:
                    return CHANGE_FLASH_CARD_THEME_ID;
                case 2:
                    return DEL_FLASH_CARD_THEME_ID;
                case 3:
                    return SET_CHALLENGE_INFO_ID;
                case 4:
                    return GET_CHALLENGE_INFO_ID;
                case 5:
                    return SET_EARNINGS_INFO_ID;
                case 6:
                    return GET_EARNINGS_INFO_ID;
                case 7:
                    return GET_CHANGE_POCKET_MONEY_ID;
                case 8:
                    return SEND_CHALLENGE_RESOULT_INFO_ID;
                case 9:
                    return SEND_FLASHCARD_SCHEDULE_ID;
                case 10:
                    return SET_EARNINGS_OBTAINED_ID;
                case 11:
                    return SET_MEDAL_Info_ID;
                case 12:
                    return GET_MEDAL_Info_ID;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return ChildrenProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEChildren_ChildrenID> internalGetValueMap() {
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
        public static SEChildren_ChildrenID valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEChildren_ChildrenID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEEarningsInfo extends GeneratedMessage implements SEEarningsInfoOrBuilder {
        private static final SEEarningsInfo DEFAULT_INSTANCE;
        private static final Parser<SEEarningsInfo> PARSER;
        public static final int TODAY_EARNINGS_FIELD_NUMBER = 2;
        public static final int TOTAL_EARNINGS_FIELD_NUMBER = 1;
        public static final int TOTAL_LIST_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int todayEarnings_;
        private int totalEarnings_;
        private totalList totalList_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEEarningsInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEEarningsInfo> {
            @Override // com.google.protobuf.Parser
            public SEEarningsInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEEarningsInfo.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEEarningsInfoOrBuilder {
            private int bitField0_;
            private int todayEarnings_;
            private int totalEarnings_;
            private SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> totalListBuilder_;
            private totalList totalList_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEEarningsInfo sEEarningsInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEEarningsInfo.totalEarnings_ = this.totalEarnings_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEEarningsInfo.todayEarnings_ = this.todayEarnings_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                    sEEarningsInfo.totalList_ = singleFieldBuilder == null ? this.totalList_ : (totalList) singleFieldBuilder.build();
                    i7 |= 4;
                }
                sEEarningsInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_descriptor;
            }

            private SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> internalGetTotalListFieldBuilder() {
                if (this.totalListBuilder_ == null) {
                    this.totalListBuilder_ = new SingleFieldBuilder<>(getTotalList(), getParentForChildren(), isClean());
                    this.totalList_ = null;
                }
                return this.totalListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetTotalListFieldBuilder();
                }
            }

            public Builder clearTodayEarnings() {
                this.bitField0_ &= -3;
                this.todayEarnings_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalEarnings() {
                this.bitField0_ &= -2;
                this.totalEarnings_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalList() {
                this.bitField0_ &= -5;
                this.totalList_ = null;
                SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.totalListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
            public int getTodayEarnings() {
                return this.todayEarnings_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
            public int getTotalEarnings() {
                return this.totalEarnings_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
            public totalList getTotalList() {
                SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                if (singleFieldBuilder != null) {
                    return (totalList) singleFieldBuilder.getMessage();
                }
                totalList totallist = this.totalList_;
                return totallist == null ? totalList.getDefaultInstance() : totallist;
            }

            public totalList.Builder getTotalListBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (totalList.Builder) internalGetTotalListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
            public totalListOrBuilder getTotalListOrBuilder() {
                SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                if (singleFieldBuilder != null) {
                    return (totalListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                totalList totallist = this.totalList_;
                return totallist == null ? totalList.getDefaultInstance() : totallist;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
            public boolean hasTodayEarnings() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
            public boolean hasTotalEarnings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
            public boolean hasTotalList() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEarningsInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTotalEarnings() && hasTodayEarnings() && hasTotalList();
            }

            public Builder mergeTotalList(totalList totallist) {
                totalList totallist2;
                SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(totallist);
                } else if ((this.bitField0_ & 4) == 0 || (totallist2 = this.totalList_) == null || totallist2 == totalList.getDefaultInstance()) {
                    this.totalList_ = totallist;
                } else {
                    getTotalListBuilder().mergeFrom(totallist);
                }
                if (this.totalList_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setTodayEarnings(int i7) {
                this.todayEarnings_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTotalEarnings(int i7) {
                this.totalEarnings_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTotalList(totalList totallist) {
                SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                if (singleFieldBuilder == null) {
                    totallist.getClass();
                    this.totalList_ = totallist;
                } else {
                    singleFieldBuilder.setMessage(totallist);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEarningsInfo build() {
                SEEarningsInfo sEEarningsInfoBuildPartial = buildPartial();
                if (sEEarningsInfoBuildPartial.isInitialized()) {
                    return sEEarningsInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEEarningsInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEarningsInfo buildPartial() {
                SEEarningsInfo sEEarningsInfo = new SEEarningsInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEEarningsInfo);
                }
                onBuilt();
                return sEEarningsInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEEarningsInfo getDefaultInstanceForType() {
                return SEEarningsInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.totalEarnings_ = 0;
                this.todayEarnings_ = 0;
                this.totalList_ = null;
                SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.totalListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEEarningsInfo) {
                    return mergeFrom((SEEarningsInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setTotalList(totalList.Builder builder) {
                SingleFieldBuilder<totalList, totalList.Builder, totalListOrBuilder> singleFieldBuilder = this.totalListBuilder_;
                if (singleFieldBuilder == null) {
                    this.totalList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEEarningsInfo sEEarningsInfo) {
                if (sEEarningsInfo == SEEarningsInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEEarningsInfo.hasTotalEarnings()) {
                    setTotalEarnings(sEEarningsInfo.getTotalEarnings());
                }
                if (sEEarningsInfo.hasTodayEarnings()) {
                    setTodayEarnings(sEEarningsInfo.getTodayEarnings());
                }
                if (sEEarningsInfo.hasTotalList()) {
                    mergeTotalList(sEEarningsInfo.getTotalList());
                }
                mergeUnknownFields(sEEarningsInfo.getUnknownFields());
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
                                    this.totalEarnings_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.todayEarnings_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetTotalListFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public static final class totalList extends GeneratedMessage implements totalListOrBuilder {
            private static final totalList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<totalList> PARSER;
            private static final long serialVersionUID = 0;
            private Internal.IntList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEEarningsInfo$totalList$1 */
            public class AnonymousClass1 extends AbstractParser<totalList> {
                @Override // com.google.protobuf.Parser
                public totalList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = totalList.newBuilder();
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
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements totalListOrBuilder {
                private int bitField0_;
                private Internal.IntList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(totalList totallist) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_.makeImmutable();
                        totallist.list_ = this.list_;
                    }
                }

                private void ensureListIsMutable() {
                    if (!this.list_.isModifiable()) {
                        this.list_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return ChildrenProtos.internal_static_SA_SEEarningsInfo_totalList_descriptor;
                }

                public Builder addAllList(Iterable<? extends Integer> iterable) {
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addList(int i7) {
                    ensureListIsMutable();
                    this.list_.addInt(i7);
                    this.bitField0_ |= 1;
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
                    return ChildrenProtos.internal_static_SA_SEEarningsInfo_totalList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.totalListOrBuilder
                public int getList(int i7) {
                    return this.list_.getInt(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.totalListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.totalListOrBuilder
                public List<Integer> getListList() {
                    this.list_.makeImmutable();
                    return this.list_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChildrenProtos.internal_static_SA_SEEarningsInfo_totalList_fieldAccessorTable.ensureFieldAccessorsInitialized(totalList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, int i8) {
                    ensureListIsMutable();
                    this.list_.setInt(i7, i8);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(d dVar) {
                    this();
                }

                private Builder() {
                    this.list_ = GeneratedMessage.emptyIntList();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public totalList build() {
                    totalList totallistBuildPartial = buildPartial();
                    if (totallistBuildPartial.isInitialized()) {
                        return totallistBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) totallistBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public totalList buildPartial() {
                    totalList totallist = new totalList(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(totallist);
                    }
                    onBuilt();
                    return totallist;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public totalList getDefaultInstanceForType() {
                    return totalList.getDefaultInstance();
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
                    if (message instanceof totalList) {
                        return mergeFrom((totalList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(totalList totallist) {
                    if (totallist == totalList.getDefaultInstance()) {
                        return this;
                    }
                    if (!totallist.list_.isEmpty()) {
                        if (this.list_.isEmpty()) {
                            Internal.IntList intList = totallist.list_;
                            this.list_ = intList;
                            intList.makeImmutable();
                            this.bitField0_ |= 1;
                        } else {
                            ensureListIsMutable();
                            this.list_.addAll(totallist.list_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(totallist.getUnknownFields());
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
                                        int uInt32 = codedInputStream.readUInt32();
                                        ensureListIsMutable();
                                        this.list_.addInt(uInt32);
                                    } else if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        ensureListIsMutable();
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.list_.addInt(codedInputStream.readUInt32());
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "totalList");
                DEFAULT_INSTANCE = new totalList();
                PARSER = new AbstractParser<totalList>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.totalList.1
                    @Override // com.google.protobuf.Parser
                    public totalList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = totalList.newBuilder();
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

            public /* synthetic */ totalList(GeneratedMessage.Builder builder, d dVar) {
                this(builder);
            }

            public static totalList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_totalList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static totalList parseDelimitedFrom(InputStream inputStream) {
                return (totalList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static totalList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<totalList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof totalList)) {
                    return super.equals(obj);
                }
                totalList totallist = (totalList) obj;
                return getListList().equals(totallist.getListList()) && getUnknownFields().equals(totallist.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_totalList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.totalListOrBuilder
            public int getList(int i7) {
                return this.list_.getInt(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.totalListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.totalListOrBuilder
            public List<Integer> getListList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<totalList> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeUInt32SizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(this.list_.getInt(i8));
                }
                int size = iComputeUInt32SizeNoTag + getListList().size() + getUnknownFields().getSerializedSize();
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
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getListList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_totalList_fieldAccessorTable.ensureFieldAccessorsInitialized(totalList.class, Builder.class);
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
                    codedOutputStream.writeUInt32(1, this.list_.getInt(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private totalList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(totalList totallist) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(totallist);
            }

            public static totalList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static totalList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (totalList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static totalList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public totalList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static totalList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private totalList() {
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = GeneratedMessage.emptyIntList();
            }

            public static totalList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static totalList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static totalList parseFrom(InputStream inputStream) {
                return (totalList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static totalList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (totalList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static totalList parseFrom(CodedInputStream codedInputStream) {
                return (totalList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static totalList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (totalList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface totalListOrBuilder extends MessageOrBuilder {
            int getList(int i7);

            int getListCount();

            List<Integer> getListList();
        }

        public static final class univalenceList extends GeneratedMessage implements univalenceListOrBuilder {
            private static final univalenceList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<univalenceList> PARSER;
            private static final long serialVersionUID = 0;
            private Internal.IntList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEEarningsInfo$univalenceList$1 */
            public class AnonymousClass1 extends AbstractParser<univalenceList> {
                @Override // com.google.protobuf.Parser
                public univalenceList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = univalenceList.newBuilder();
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
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements univalenceListOrBuilder {
                private int bitField0_;
                private Internal.IntList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(univalenceList univalencelist) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_.makeImmutable();
                        univalencelist.list_ = this.list_;
                    }
                }

                private void ensureListIsMutable() {
                    if (!this.list_.isModifiable()) {
                        this.list_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return ChildrenProtos.internal_static_SA_SEEarningsInfo_univalenceList_descriptor;
                }

                public Builder addAllList(Iterable<? extends Integer> iterable) {
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addList(int i7) {
                    ensureListIsMutable();
                    this.list_.addInt(i7);
                    this.bitField0_ |= 1;
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
                    return ChildrenProtos.internal_static_SA_SEEarningsInfo_univalenceList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.univalenceListOrBuilder
                public int getList(int i7) {
                    return this.list_.getInt(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.univalenceListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.univalenceListOrBuilder
                public List<Integer> getListList() {
                    this.list_.makeImmutable();
                    return this.list_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChildrenProtos.internal_static_SA_SEEarningsInfo_univalenceList_fieldAccessorTable.ensureFieldAccessorsInitialized(univalenceList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, int i8) {
                    ensureListIsMutable();
                    this.list_.setInt(i7, i8);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(d dVar) {
                    this();
                }

                private Builder() {
                    this.list_ = GeneratedMessage.emptyIntList();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public univalenceList build() {
                    univalenceList univalencelistBuildPartial = buildPartial();
                    if (univalencelistBuildPartial.isInitialized()) {
                        return univalencelistBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) univalencelistBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public univalenceList buildPartial() {
                    univalenceList univalencelist = new univalenceList(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(univalencelist);
                    }
                    onBuilt();
                    return univalencelist;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public univalenceList getDefaultInstanceForType() {
                    return univalenceList.getDefaultInstance();
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
                    if (message instanceof univalenceList) {
                        return mergeFrom((univalenceList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(univalenceList univalencelist) {
                    if (univalencelist == univalenceList.getDefaultInstance()) {
                        return this;
                    }
                    if (!univalencelist.list_.isEmpty()) {
                        if (this.list_.isEmpty()) {
                            Internal.IntList intList = univalencelist.list_;
                            this.list_ = intList;
                            intList.makeImmutable();
                            this.bitField0_ |= 1;
                        } else {
                            ensureListIsMutable();
                            this.list_.addAll(univalencelist.list_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(univalencelist.getUnknownFields());
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
                                        int uInt32 = codedInputStream.readUInt32();
                                        ensureListIsMutable();
                                        this.list_.addInt(uInt32);
                                    } else if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        ensureListIsMutable();
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.list_.addInt(codedInputStream.readUInt32());
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "univalenceList");
                DEFAULT_INSTANCE = new univalenceList();
                PARSER = new AbstractParser<univalenceList>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.univalenceList.1
                    @Override // com.google.protobuf.Parser
                    public univalenceList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = univalenceList.newBuilder();
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

            public /* synthetic */ univalenceList(GeneratedMessage.Builder builder, d dVar) {
                this(builder);
            }

            public static univalenceList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_univalenceList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static univalenceList parseDelimitedFrom(InputStream inputStream) {
                return (univalenceList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static univalenceList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<univalenceList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof univalenceList)) {
                    return super.equals(obj);
                }
                univalenceList univalencelist = (univalenceList) obj;
                return getListList().equals(univalencelist.getListList()) && getUnknownFields().equals(univalencelist.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_univalenceList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.univalenceListOrBuilder
            public int getList(int i7) {
                return this.list_.getInt(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.univalenceListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.univalenceListOrBuilder
            public List<Integer> getListList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<univalenceList> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeUInt32SizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(this.list_.getInt(i8));
                }
                int size = iComputeUInt32SizeNoTag + getListList().size() + getUnknownFields().getSerializedSize();
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
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getListList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEEarningsInfo_univalenceList_fieldAccessorTable.ensureFieldAccessorsInitialized(univalenceList.class, Builder.class);
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
                    codedOutputStream.writeUInt32(1, this.list_.getInt(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private univalenceList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(univalenceList univalencelist) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(univalencelist);
            }

            public static univalenceList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static univalenceList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (univalenceList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static univalenceList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public univalenceList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static univalenceList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private univalenceList() {
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = GeneratedMessage.emptyIntList();
            }

            public static univalenceList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static univalenceList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static univalenceList parseFrom(InputStream inputStream) {
                return (univalenceList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static univalenceList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (univalenceList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static univalenceList parseFrom(CodedInputStream codedInputStream) {
                return (univalenceList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static univalenceList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (univalenceList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface univalenceListOrBuilder extends MessageOrBuilder {
            int getList(int i7);

            int getListCount();

            List<Integer> getListList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEEarningsInfo");
            DEFAULT_INSTANCE = new SEEarningsInfo();
            PARSER = new AbstractParser<SEEarningsInfo>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfo.1
                @Override // com.google.protobuf.Parser
                public SEEarningsInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEEarningsInfo.newBuilder();
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

        public /* synthetic */ SEEarningsInfo(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEEarningsInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEEarningsInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEEarningsInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEEarningsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEEarningsInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEEarningsInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEEarningsInfo)) {
                return super.equals(obj);
            }
            SEEarningsInfo sEEarningsInfo = (SEEarningsInfo) obj;
            if (hasTotalEarnings() != sEEarningsInfo.hasTotalEarnings()) {
                return false;
            }
            if ((hasTotalEarnings() && getTotalEarnings() != sEEarningsInfo.getTotalEarnings()) || hasTodayEarnings() != sEEarningsInfo.hasTodayEarnings()) {
                return false;
            }
            if ((!hasTodayEarnings() || getTodayEarnings() == sEEarningsInfo.getTodayEarnings()) && hasTotalList() == sEEarningsInfo.hasTotalList()) {
                return (!hasTotalList() || getTotalList().equals(sEEarningsInfo.getTotalList())) && getUnknownFields().equals(sEEarningsInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEEarningsInfo_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEEarningsInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.totalEarnings_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.todayEarnings_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getTotalList());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
        public int getTodayEarnings() {
            return this.todayEarnings_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
        public int getTotalEarnings() {
            return this.totalEarnings_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
        public totalList getTotalList() {
            totalList totallist = this.totalList_;
            return totallist == null ? totalList.getDefaultInstance() : totallist;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
        public totalListOrBuilder getTotalListOrBuilder() {
            totalList totallist = this.totalList_;
            return totallist == null ? totalList.getDefaultInstance() : totallist;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
        public boolean hasTodayEarnings() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
        public boolean hasTotalEarnings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEEarningsInfoOrBuilder
        public boolean hasTotalList() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTotalEarnings()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTotalEarnings();
            }
            if (hasTodayEarnings()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTodayEarnings();
            }
            if (hasTotalList()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTotalList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEEarningsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEarningsInfo.class, Builder.class);
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
            if (!hasTotalEarnings()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTodayEarnings()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTotalList()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.totalEarnings_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.todayEarnings_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getTotalList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEEarningsInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.totalEarnings_ = 0;
            this.todayEarnings_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEEarningsInfo sEEarningsInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEEarningsInfo);
        }

        public static SEEarningsInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEEarningsInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEarningsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEEarningsInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEEarningsInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEEarningsInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEEarningsInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEEarningsInfo() {
            this.totalEarnings_ = 0;
            this.todayEarnings_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEEarningsInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEEarningsInfo parseFrom(InputStream inputStream) {
            return (SEEarningsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEEarningsInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEarningsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEEarningsInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEEarningsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEEarningsInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEarningsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEEarningsInfoOrBuilder extends MessageOrBuilder {
        int getTodayEarnings();

        int getTotalEarnings();

        SEEarningsInfo.totalList getTotalList();

        SEEarningsInfo.totalListOrBuilder getTotalListOrBuilder();

        boolean hasTodayEarnings();

        boolean hasTotalEarnings();

        boolean hasTotalList();
    }

    public static final class SEExchangeInfo extends GeneratedMessage implements SEExchangeInfoOrBuilder {
        private static final SEExchangeInfo DEFAULT_INSTANCE;
        public static final int EXCHANGE_EARNINGS_FIELD_NUMBER = 3;
        private static final Parser<SEExchangeInfo> PARSER;
        public static final int TIME_FIELD_NUMBER = 1;
        public static final int TOTAL_EARNINGS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int exchangeEarnings_;
        private byte memoizedIsInitialized;
        private CommonProtos.SETime time_;
        private int totalEarnings_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEExchangeInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEExchangeInfo> {
            @Override // com.google.protobuf.Parser
            public SEExchangeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEExchangeInfo.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEExchangeInfoOrBuilder {
            private int bitField0_;
            private int exchangeEarnings_;
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> timeBuilder_;
            private CommonProtos.SETime time_;
            private int totalEarnings_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEExchangeInfo sEExchangeInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    sEExchangeInfo.time_ = singleFieldBuilder == null ? this.time_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEExchangeInfo.totalEarnings_ = this.totalEarnings_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEExchangeInfo.exchangeEarnings_ = this.exchangeEarnings_;
                    i7 |= 4;
                }
                sEExchangeInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEExchangeInfo_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetTimeFieldBuilder() {
                if (this.timeBuilder_ == null) {
                    this.timeBuilder_ = new SingleFieldBuilder<>(getTime(), getParentForChildren(), isClean());
                    this.time_ = null;
                }
                return this.timeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetTimeFieldBuilder();
                }
            }

            public Builder clearExchangeEarnings() {
                this.bitField0_ &= -5;
                this.exchangeEarnings_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTime() {
                this.bitField0_ &= -2;
                this.time_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.timeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTotalEarnings() {
                this.bitField0_ &= -3;
                this.totalEarnings_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEExchangeInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
            public int getExchangeEarnings() {
                return this.exchangeEarnings_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
            public CommonProtos.SETime getTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.time_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getTimeBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
            public CommonProtos.SETimeOrBuilder getTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.time_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
            public int getTotalEarnings() {
                return this.totalEarnings_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
            public boolean hasExchangeEarnings() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
            public boolean hasTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
            public boolean hasTotalEarnings() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEExchangeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEExchangeInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTime() && hasTotalEarnings() && hasExchangeEarnings() && getTime().isInitialized();
            }

            public Builder mergeTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 1) == 0 || (sETime2 = this.time_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.time_ = sETime;
                } else {
                    getTimeBuilder().mergeFrom(sETime);
                }
                if (this.time_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setExchangeEarnings(int i7) {
                this.exchangeEarnings_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.time_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTotalEarnings(int i7) {
                this.totalEarnings_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEExchangeInfo build() {
                SEExchangeInfo sEExchangeInfoBuildPartial = buildPartial();
                if (sEExchangeInfoBuildPartial.isInitialized()) {
                    return sEExchangeInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEExchangeInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEExchangeInfo buildPartial() {
                SEExchangeInfo sEExchangeInfo = new SEExchangeInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEExchangeInfo);
                }
                onBuilt();
                return sEExchangeInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEExchangeInfo getDefaultInstanceForType() {
                return SEExchangeInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.time_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.timeBuilder_ = null;
                }
                this.totalEarnings_ = 0;
                this.exchangeEarnings_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEExchangeInfo) {
                    return mergeFrom((SEExchangeInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder == null) {
                    this.time_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEExchangeInfo sEExchangeInfo) {
                if (sEExchangeInfo == SEExchangeInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEExchangeInfo.hasTime()) {
                    mergeTime(sEExchangeInfo.getTime());
                }
                if (sEExchangeInfo.hasTotalEarnings()) {
                    setTotalEarnings(sEExchangeInfo.getTotalEarnings());
                }
                if (sEExchangeInfo.hasExchangeEarnings()) {
                    setExchangeEarnings(sEExchangeInfo.getExchangeEarnings());
                }
                mergeUnknownFields(sEExchangeInfo.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.totalEarnings_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.exchangeEarnings_ = codedInputStream.readUInt32();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEExchangeInfo");
            DEFAULT_INSTANCE = new SEExchangeInfo();
            PARSER = new AbstractParser<SEExchangeInfo>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfo.1
                @Override // com.google.protobuf.Parser
                public SEExchangeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEExchangeInfo.newBuilder();
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

        public /* synthetic */ SEExchangeInfo(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEExchangeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEExchangeInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEExchangeInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEExchangeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEExchangeInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEExchangeInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEExchangeInfo)) {
                return super.equals(obj);
            }
            SEExchangeInfo sEExchangeInfo = (SEExchangeInfo) obj;
            if (hasTime() != sEExchangeInfo.hasTime()) {
                return false;
            }
            if ((hasTime() && !getTime().equals(sEExchangeInfo.getTime())) || hasTotalEarnings() != sEExchangeInfo.hasTotalEarnings()) {
                return false;
            }
            if ((!hasTotalEarnings() || getTotalEarnings() == sEExchangeInfo.getTotalEarnings()) && hasExchangeEarnings() == sEExchangeInfo.hasExchangeEarnings()) {
                return (!hasExchangeEarnings() || getExchangeEarnings() == sEExchangeInfo.getExchangeEarnings()) && getUnknownFields().equals(sEExchangeInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEExchangeInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
        public int getExchangeEarnings() {
            return this.exchangeEarnings_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEExchangeInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTime()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.totalEarnings_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.exchangeEarnings_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
        public CommonProtos.SETime getTime() {
            CommonProtos.SETime sETime = this.time_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
        public CommonProtos.SETimeOrBuilder getTimeOrBuilder() {
            CommonProtos.SETime sETime = this.time_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
        public int getTotalEarnings() {
            return this.totalEarnings_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
        public boolean hasExchangeEarnings() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEExchangeInfoOrBuilder
        public boolean hasTotalEarnings() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTime()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTime().hashCode();
            }
            if (hasTotalEarnings()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTotalEarnings();
            }
            if (hasExchangeEarnings()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getExchangeEarnings();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEExchangeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEExchangeInfo.class, Builder.class);
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
            if (!hasTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTotalEarnings()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasExchangeEarnings()) {
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getTime());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.totalEarnings_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.exchangeEarnings_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEExchangeInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.totalEarnings_ = 0;
            this.exchangeEarnings_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEExchangeInfo sEExchangeInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEExchangeInfo);
        }

        public static SEExchangeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEExchangeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEExchangeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEExchangeInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEExchangeInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEExchangeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEExchangeInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEExchangeInfo() {
            this.totalEarnings_ = 0;
            this.exchangeEarnings_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEExchangeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEExchangeInfo parseFrom(InputStream inputStream) {
            return (SEExchangeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEExchangeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEExchangeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEExchangeInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEExchangeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEExchangeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEExchangeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEExchangeInfoOrBuilder extends MessageOrBuilder {
        int getExchangeEarnings();

        CommonProtos.SETime getTime();

        CommonProtos.SETimeOrBuilder getTimeOrBuilder();

        int getTotalEarnings();

        boolean hasExchangeEarnings();

        boolean hasTime();

        boolean hasTotalEarnings();
    }

    public static final class SEFlashCardThemeInfo extends GeneratedMessage implements SEFlashCardThemeInfoOrBuilder {
        private static final SEFlashCardThemeInfo DEFAULT_INSTANCE;
        private static final Parser<SEFlashCardThemeInfo> PARSER;
        public static final int SUBJECT_ID_FIELD_NUMBER = 1;
        public static final int TOPIC_ID_FIELD_NUMBER = 3;
        public static final int TYPE_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int subjectId_;
        private int topicId_;
        private int typeId_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEFlashCardThemeInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEFlashCardThemeInfo> {
            @Override // com.google.protobuf.Parser
            public SEFlashCardThemeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEFlashCardThemeInfo.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEFlashCardThemeInfoOrBuilder {
            private int bitField0_;
            private int subjectId_;
            private int topicId_;
            private int typeId_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEFlashCardThemeInfo.subjectId_ = this.subjectId_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEFlashCardThemeInfo.typeId_ = this.typeId_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEFlashCardThemeInfo.topicId_ = this.topicId_;
                    i7 |= 4;
                }
                sEFlashCardThemeInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_descriptor;
            }

            public Builder clearSubjectId() {
                this.bitField0_ &= -2;
                this.subjectId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTopicId() {
                this.bitField0_ &= -5;
                this.topicId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTypeId() {
                this.bitField0_ &= -3;
                this.typeId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
            public int getSubjectId() {
                return this.subjectId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
            public int getTopicId() {
                return this.topicId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
            public int getTypeId() {
                return this.typeId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
            public boolean hasSubjectId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
            public boolean hasTopicId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
            public boolean hasTypeId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFlashCardThemeInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSubjectId() && hasTypeId() && hasTopicId();
            }

            public Builder setSubjectId(int i7) {
                this.subjectId_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTopicId(int i7) {
                this.topicId_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTypeId(int i7) {
                this.typeId_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFlashCardThemeInfo build() {
                SEFlashCardThemeInfo sEFlashCardThemeInfoBuildPartial = buildPartial();
                if (sEFlashCardThemeInfoBuildPartial.isInitialized()) {
                    return sEFlashCardThemeInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEFlashCardThemeInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFlashCardThemeInfo buildPartial() {
                SEFlashCardThemeInfo sEFlashCardThemeInfo = new SEFlashCardThemeInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEFlashCardThemeInfo);
                }
                onBuilt();
                return sEFlashCardThemeInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEFlashCardThemeInfo getDefaultInstanceForType() {
                return SEFlashCardThemeInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.subjectId_ = 0;
                this.typeId_ = 0;
                this.topicId_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEFlashCardThemeInfo) {
                    return mergeFrom((SEFlashCardThemeInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                if (sEFlashCardThemeInfo == SEFlashCardThemeInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEFlashCardThemeInfo.hasSubjectId()) {
                    setSubjectId(sEFlashCardThemeInfo.getSubjectId());
                }
                if (sEFlashCardThemeInfo.hasTypeId()) {
                    setTypeId(sEFlashCardThemeInfo.getTypeId());
                }
                if (sEFlashCardThemeInfo.hasTopicId()) {
                    setTopicId(sEFlashCardThemeInfo.getTopicId());
                }
                mergeUnknownFields(sEFlashCardThemeInfo.getUnknownFields());
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
                                    this.subjectId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.typeId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.topicId_ = codedInputStream.readUInt32();
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

        public static final class ThemeIDList extends GeneratedMessage implements ThemeIDListOrBuilder {
            private static final ThemeIDList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<ThemeIDList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEFlashCardThemeInfo> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEFlashCardThemeInfo$ThemeIDList$1 */
            public class AnonymousClass1 extends AbstractParser<ThemeIDList> {
                @Override // com.google.protobuf.Parser
                public ThemeIDList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ThemeIDList.newBuilder();
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
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ThemeIDListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> listBuilder_;
                private List<SEFlashCardThemeInfo> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(ThemeIDList themeIDList) {
                }

                private void buildPartialRepeatedFields(ThemeIDList themeIDList) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        themeIDList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    themeIDList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_descriptor;
                }

                private RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEFlashCardThemeInfo> iterable) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEFlashCardThemeInfo);
                        return this;
                    }
                    sEFlashCardThemeInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEFlashCardThemeInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEFlashCardThemeInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
                public SEFlashCardThemeInfo getList(int i7) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEFlashCardThemeInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
                public List<SEFlashCardThemeInfo> getListList() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
                public SEFlashCardThemeInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEFlashCardThemeInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
                public List<? extends SEFlashCardThemeInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_fieldAccessorTable.ensureFieldAccessorsInitialized(ThemeIDList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEFlashCardThemeInfo);
                        return this;
                    }
                    sEFlashCardThemeInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEFlashCardThemeInfo);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(d dVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ThemeIDList build() {
                    ThemeIDList themeIDListBuildPartial = buildPartial();
                    if (themeIDListBuildPartial.isInitialized()) {
                        return themeIDListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) themeIDListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ThemeIDList buildPartial() {
                    ThemeIDList themeIDList = new ThemeIDList(this);
                    buildPartialRepeatedFields(themeIDList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(themeIDList);
                    }
                    onBuilt();
                    return themeIDList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ThemeIDList getDefaultInstanceForType() {
                    return ThemeIDList.getDefaultInstance();
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEFlashCardThemeInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEFlashCardThemeInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEFlashCardThemeInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEFlashCardThemeInfo);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ThemeIDList) {
                        return mergeFrom((ThemeIDList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(ThemeIDList themeIDList) {
                    if (themeIDList == ThemeIDList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!themeIDList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = themeIDList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(themeIDList.list_);
                            }
                            onChanged();
                        }
                    } else if (!themeIDList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = themeIDList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(themeIDList.list_);
                        }
                    }
                    mergeUnknownFields(themeIDList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEFlashCardThemeInfo sEFlashCardThemeInfo = (SEFlashCardThemeInfo) codedInputStream.readMessage(SEFlashCardThemeInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEFlashCardThemeInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEFlashCardThemeInfo);
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ThemeIDList");
                DEFAULT_INSTANCE = new ThemeIDList();
                PARSER = new AbstractParser<ThemeIDList>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDList.1
                    @Override // com.google.protobuf.Parser
                    public ThemeIDList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = ThemeIDList.newBuilder();
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

            public /* synthetic */ ThemeIDList(GeneratedMessage.Builder builder, d dVar) {
                this(builder);
            }

            public static ThemeIDList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ThemeIDList parseDelimitedFrom(InputStream inputStream) {
                return (ThemeIDList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ThemeIDList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<ThemeIDList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ThemeIDList)) {
                    return super.equals(obj);
                }
                ThemeIDList themeIDList = (ThemeIDList) obj;
                return getListList().equals(themeIDList.getListList()) && getUnknownFields().equals(themeIDList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
            public SEFlashCardThemeInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
            public List<SEFlashCardThemeInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
            public SEFlashCardThemeInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeIDListOrBuilder
            public List<? extends SEFlashCardThemeInfoOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ThemeIDList> getParserForType() {
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
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_fieldAccessorTable.ensureFieldAccessorsInitialized(ThemeIDList.class, Builder.class);
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

            private ThemeIDList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(ThemeIDList themeIDList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(themeIDList);
            }

            public static ThemeIDList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static ThemeIDList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ThemeIDList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ThemeIDList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ThemeIDList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private ThemeIDList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static ThemeIDList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static ThemeIDList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static ThemeIDList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ThemeIDList parseFrom(InputStream inputStream) {
                return (ThemeIDList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static ThemeIDList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ThemeIDList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ThemeIDList parseFrom(CodedInputStream codedInputStream) {
                return (ThemeIDList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static ThemeIDList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ThemeIDList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ThemeIDListOrBuilder extends MessageOrBuilder {
            SEFlashCardThemeInfo getList(int i7);

            int getListCount();

            List<SEFlashCardThemeInfo> getListList();

            SEFlashCardThemeInfoOrBuilder getListOrBuilder(int i7);

            List<? extends SEFlashCardThemeInfoOrBuilder> getListOrBuilderList();
        }

        public static final class ThemeInfoList extends GeneratedMessage implements ThemeInfoListOrBuilder {
            private static final ThemeInfoList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            public static final int MAX_COUNT_FIELD_NUMBER = 2;
            private static final Parser<ThemeInfoList> PARSER;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private List<SEFlashCardThemeInfo> list_;
            private int maxCount_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEFlashCardThemeInfo$ThemeInfoList$1 */
            public class AnonymousClass1 extends AbstractParser<ThemeInfoList> {
                @Override // com.google.protobuf.Parser
                public ThemeInfoList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ThemeInfoList.newBuilder();
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
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ThemeInfoListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> listBuilder_;
                private List<SEFlashCardThemeInfo> list_;
                private int maxCount_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(ThemeInfoList themeInfoList) {
                    int i7;
                    if ((this.bitField0_ & 2) != 0) {
                        themeInfoList.maxCount_ = this.maxCount_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    themeInfoList.bitField0_ = i7 | themeInfoList.bitField0_;
                }

                private void buildPartialRepeatedFields(ThemeInfoList themeInfoList) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        themeInfoList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    themeInfoList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_descriptor;
                }

                private RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEFlashCardThemeInfo> iterable) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEFlashCardThemeInfo);
                        return this;
                    }
                    sEFlashCardThemeInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEFlashCardThemeInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEFlashCardThemeInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearMaxCount() {
                    this.bitField0_ &= -3;
                    this.maxCount_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
                public SEFlashCardThemeInfo getList(int i7) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEFlashCardThemeInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
                public List<SEFlashCardThemeInfo> getListList() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
                public SEFlashCardThemeInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEFlashCardThemeInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
                public List<? extends SEFlashCardThemeInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
                public int getMaxCount() {
                    return this.maxCount_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
                public boolean hasMaxCount() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_fieldAccessorTable.ensureFieldAccessorsInitialized(ThemeInfoList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (!hasMaxCount()) {
                        return false;
                    }
                    for (int i7 = 0; i7 < getListCount(); i7++) {
                        if (!getList(i7).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEFlashCardThemeInfo);
                        return this;
                    }
                    sEFlashCardThemeInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEFlashCardThemeInfo);
                    onChanged();
                    return this;
                }

                public Builder setMaxCount(int i7) {
                    this.maxCount_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(d dVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ThemeInfoList build() {
                    ThemeInfoList themeInfoListBuildPartial = buildPartial();
                    if (themeInfoListBuildPartial.isInitialized()) {
                        return themeInfoListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) themeInfoListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ThemeInfoList buildPartial() {
                    ThemeInfoList themeInfoList = new ThemeInfoList(this);
                    buildPartialRepeatedFields(themeInfoList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(themeInfoList);
                    }
                    onBuilt();
                    return themeInfoList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ThemeInfoList getDefaultInstanceForType() {
                    return ThemeInfoList.getDefaultInstance();
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEFlashCardThemeInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    this.maxCount_ = 0;
                    return this;
                }

                public Builder addList(int i7, SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEFlashCardThemeInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEFlashCardThemeInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEFlashCardThemeInfo);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ThemeInfoList) {
                        return mergeFrom((ThemeInfoList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(ThemeInfoList themeInfoList) {
                    if (themeInfoList == ThemeInfoList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!themeInfoList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = themeInfoList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(themeInfoList.list_);
                            }
                            onChanged();
                        }
                    } else if (!themeInfoList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = themeInfoList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(themeInfoList.list_);
                        }
                    }
                    if (themeInfoList.hasMaxCount()) {
                        setMaxCount(themeInfoList.getMaxCount());
                    }
                    mergeUnknownFields(themeInfoList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEFlashCardThemeInfo sEFlashCardThemeInfo = (SEFlashCardThemeInfo) codedInputStream.readMessage(SEFlashCardThemeInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEFlashCardThemeInfo, Builder, SEFlashCardThemeInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEFlashCardThemeInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEFlashCardThemeInfo);
                                        }
                                    } else if (tag != 16) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.maxCount_ = codedInputStream.readUInt32();
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ThemeInfoList");
                DEFAULT_INSTANCE = new ThemeInfoList();
                PARSER = new AbstractParser<ThemeInfoList>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoList.1
                    @Override // com.google.protobuf.Parser
                    public ThemeInfoList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = ThemeInfoList.newBuilder();
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

            public /* synthetic */ ThemeInfoList(GeneratedMessage.Builder builder, d dVar) {
                this(builder);
            }

            public static ThemeInfoList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ThemeInfoList parseDelimitedFrom(InputStream inputStream) {
                return (ThemeInfoList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ThemeInfoList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<ThemeInfoList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ThemeInfoList)) {
                    return super.equals(obj);
                }
                ThemeInfoList themeInfoList = (ThemeInfoList) obj;
                if (getListList().equals(themeInfoList.getListList()) && hasMaxCount() == themeInfoList.hasMaxCount()) {
                    return (!hasMaxCount() || getMaxCount() == themeInfoList.getMaxCount()) && getUnknownFields().equals(themeInfoList.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
            public SEFlashCardThemeInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
            public List<SEFlashCardThemeInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
            public SEFlashCardThemeInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
            public List<? extends SEFlashCardThemeInfoOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
            public int getMaxCount() {
                return this.maxCount_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ThemeInfoList> getParserForType() {
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
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.maxCount_);
                }
                int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.ThemeInfoListOrBuilder
            public boolean hasMaxCount() {
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
                if (hasMaxCount()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getMaxCount();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_fieldAccessorTable.ensureFieldAccessorsInitialized(ThemeInfoList.class, Builder.class);
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
                if (!hasMaxCount()) {
                    this.memoizedIsInitialized = (byte) 0;
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
                    codedOutputStream.writeUInt32(2, this.maxCount_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private ThemeInfoList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.maxCount_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(ThemeInfoList themeInfoList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(themeInfoList);
            }

            public static ThemeInfoList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static ThemeInfoList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ThemeInfoList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ThemeInfoList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ThemeInfoList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static ThemeInfoList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private ThemeInfoList() {
                this.maxCount_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static ThemeInfoList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static ThemeInfoList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ThemeInfoList parseFrom(InputStream inputStream) {
                return (ThemeInfoList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static ThemeInfoList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ThemeInfoList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ThemeInfoList parseFrom(CodedInputStream codedInputStream) {
                return (ThemeInfoList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static ThemeInfoList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ThemeInfoList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ThemeInfoListOrBuilder extends MessageOrBuilder {
            SEFlashCardThemeInfo getList(int i7);

            int getListCount();

            List<SEFlashCardThemeInfo> getListList();

            SEFlashCardThemeInfoOrBuilder getListOrBuilder(int i7);

            List<? extends SEFlashCardThemeInfoOrBuilder> getListOrBuilderList();

            int getMaxCount();

            boolean hasMaxCount();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFlashCardThemeInfo");
            DEFAULT_INSTANCE = new SEFlashCardThemeInfo();
            PARSER = new AbstractParser<SEFlashCardThemeInfo>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfo.1
                @Override // com.google.protobuf.Parser
                public SEFlashCardThemeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEFlashCardThemeInfo.newBuilder();
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

        public /* synthetic */ SEFlashCardThemeInfo(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEFlashCardThemeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEFlashCardThemeInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEFlashCardThemeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEFlashCardThemeInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEFlashCardThemeInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEFlashCardThemeInfo)) {
                return super.equals(obj);
            }
            SEFlashCardThemeInfo sEFlashCardThemeInfo = (SEFlashCardThemeInfo) obj;
            if (hasSubjectId() != sEFlashCardThemeInfo.hasSubjectId()) {
                return false;
            }
            if ((hasSubjectId() && getSubjectId() != sEFlashCardThemeInfo.getSubjectId()) || hasTypeId() != sEFlashCardThemeInfo.hasTypeId()) {
                return false;
            }
            if ((!hasTypeId() || getTypeId() == sEFlashCardThemeInfo.getTypeId()) && hasTopicId() == sEFlashCardThemeInfo.hasTopicId()) {
                return (!hasTopicId() || getTopicId() == sEFlashCardThemeInfo.getTopicId()) && getUnknownFields().equals(sEFlashCardThemeInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEFlashCardThemeInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.subjectId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.typeId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.topicId_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
        public int getSubjectId() {
            return this.subjectId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
        public int getTopicId() {
            return this.topicId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
        public int getTypeId() {
            return this.typeId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
        public boolean hasSubjectId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
        public boolean hasTopicId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeInfoOrBuilder
        public boolean hasTypeId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSubjectId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSubjectId();
            }
            if (hasTypeId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTypeId();
            }
            if (hasTopicId()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTopicId();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEFlashCardThemeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFlashCardThemeInfo.class, Builder.class);
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
            if (!hasSubjectId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTypeId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTopicId()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.subjectId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.typeId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.topicId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEFlashCardThemeInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.subjectId_ = 0;
            this.typeId_ = 0;
            this.topicId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEFlashCardThemeInfo sEFlashCardThemeInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEFlashCardThemeInfo);
        }

        public static SEFlashCardThemeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEFlashCardThemeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFlashCardThemeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFlashCardThemeInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEFlashCardThemeInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEFlashCardThemeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEFlashCardThemeInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEFlashCardThemeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEFlashCardThemeInfo() {
            this.subjectId_ = 0;
            this.typeId_ = 0;
            this.topicId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEFlashCardThemeInfo parseFrom(InputStream inputStream) {
            return (SEFlashCardThemeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEFlashCardThemeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFlashCardThemeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFlashCardThemeInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEFlashCardThemeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEFlashCardThemeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFlashCardThemeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEFlashCardThemeInfoOrBuilder extends MessageOrBuilder {
        int getSubjectId();

        int getTopicId();

        int getTypeId();

        boolean hasSubjectId();

        boolean hasTopicId();

        boolean hasTypeId();
    }

    public static final class SEFlashCardThemeSchedule extends GeneratedMessage implements SEFlashCardThemeScheduleOrBuilder {
        private static final SEFlashCardThemeSchedule DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SEFlashCardThemeSchedule> PARSER;
        public static final int SCHEDULE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEFlashCardThemeInfo iD_;
        private byte memoizedIsInitialized;
        private int schedule_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEFlashCardThemeSchedule$1 */
        public class AnonymousClass1 extends AbstractParser<SEFlashCardThemeSchedule> {
            @Override // com.google.protobuf.Parser
            public SEFlashCardThemeSchedule parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEFlashCardThemeSchedule.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEFlashCardThemeScheduleOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> iDBuilder_;
            private SEFlashCardThemeInfo iD_;
            private int schedule_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEFlashCardThemeSchedule sEFlashCardThemeSchedule) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                    sEFlashCardThemeSchedule.iD_ = singleFieldBuilder == null ? this.iD_ : (SEFlashCardThemeInfo) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEFlashCardThemeSchedule.schedule_ = this.schedule_;
                    i7 |= 2;
                }
                sEFlashCardThemeSchedule.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeSchedule_descriptor;
            }

            private SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> internalGetIDFieldBuilder() {
                if (this.iDBuilder_ == null) {
                    this.iDBuilder_ = new SingleFieldBuilder<>(getID(), getParentForChildren(), isClean());
                    this.iD_ = null;
                }
                return this.iDBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetIDFieldBuilder();
                }
            }

            public Builder clearID() {
                this.bitField0_ &= -2;
                this.iD_ = null;
                SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.iDBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSchedule() {
                this.bitField0_ &= -3;
                this.schedule_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeSchedule_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
            public SEFlashCardThemeInfo getID() {
                SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEFlashCardThemeInfo) singleFieldBuilder.getMessage();
                }
                SEFlashCardThemeInfo sEFlashCardThemeInfo = this.iD_;
                return sEFlashCardThemeInfo == null ? SEFlashCardThemeInfo.getDefaultInstance() : sEFlashCardThemeInfo;
            }

            public SEFlashCardThemeInfo.Builder getIDBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEFlashCardThemeInfo.Builder) internalGetIDFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
            public SEFlashCardThemeInfoOrBuilder getIDOrBuilder() {
                SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEFlashCardThemeInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEFlashCardThemeInfo sEFlashCardThemeInfo = this.iD_;
                return sEFlashCardThemeInfo == null ? SEFlashCardThemeInfo.getDefaultInstance() : sEFlashCardThemeInfo;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
            public int getSchedule() {
                return this.schedule_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
            public boolean hasID() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
            public boolean hasSchedule() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEFlashCardThemeSchedule_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFlashCardThemeSchedule.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasID() && hasSchedule() && getID().isInitialized();
            }

            public Builder mergeID(SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                SEFlashCardThemeInfo sEFlashCardThemeInfo2;
                SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEFlashCardThemeInfo);
                } else if ((this.bitField0_ & 1) == 0 || (sEFlashCardThemeInfo2 = this.iD_) == null || sEFlashCardThemeInfo2 == SEFlashCardThemeInfo.getDefaultInstance()) {
                    this.iD_ = sEFlashCardThemeInfo;
                } else {
                    getIDBuilder().mergeFrom(sEFlashCardThemeInfo);
                }
                if (this.iD_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setID(SEFlashCardThemeInfo sEFlashCardThemeInfo) {
                SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                if (singleFieldBuilder == null) {
                    sEFlashCardThemeInfo.getClass();
                    this.iD_ = sEFlashCardThemeInfo;
                } else {
                    singleFieldBuilder.setMessage(sEFlashCardThemeInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSchedule(int i7) {
                this.schedule_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFlashCardThemeSchedule build() {
                SEFlashCardThemeSchedule sEFlashCardThemeScheduleBuildPartial = buildPartial();
                if (sEFlashCardThemeScheduleBuildPartial.isInitialized()) {
                    return sEFlashCardThemeScheduleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEFlashCardThemeScheduleBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFlashCardThemeSchedule buildPartial() {
                SEFlashCardThemeSchedule sEFlashCardThemeSchedule = new SEFlashCardThemeSchedule(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEFlashCardThemeSchedule);
                }
                onBuilt();
                return sEFlashCardThemeSchedule;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEFlashCardThemeSchedule getDefaultInstanceForType() {
                return SEFlashCardThemeSchedule.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.iD_ = null;
                SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.iDBuilder_ = null;
                }
                this.schedule_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEFlashCardThemeSchedule) {
                    return mergeFrom((SEFlashCardThemeSchedule) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setID(SEFlashCardThemeInfo.Builder builder) {
                SingleFieldBuilder<SEFlashCardThemeInfo, SEFlashCardThemeInfo.Builder, SEFlashCardThemeInfoOrBuilder> singleFieldBuilder = this.iDBuilder_;
                if (singleFieldBuilder == null) {
                    this.iD_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEFlashCardThemeSchedule sEFlashCardThemeSchedule) {
                if (sEFlashCardThemeSchedule == SEFlashCardThemeSchedule.getDefaultInstance()) {
                    return this;
                }
                if (sEFlashCardThemeSchedule.hasID()) {
                    mergeID(sEFlashCardThemeSchedule.getID());
                }
                if (sEFlashCardThemeSchedule.hasSchedule()) {
                    setSchedule(sEFlashCardThemeSchedule.getSchedule());
                }
                mergeUnknownFields(sEFlashCardThemeSchedule.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetIDFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.schedule_ = codedInputStream.readUInt32();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFlashCardThemeSchedule");
            DEFAULT_INSTANCE = new SEFlashCardThemeSchedule();
            PARSER = new AbstractParser<SEFlashCardThemeSchedule>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeSchedule.1
                @Override // com.google.protobuf.Parser
                public SEFlashCardThemeSchedule parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEFlashCardThemeSchedule.newBuilder();
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

        public /* synthetic */ SEFlashCardThemeSchedule(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEFlashCardThemeSchedule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEFlashCardThemeSchedule_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEFlashCardThemeSchedule parseDelimitedFrom(InputStream inputStream) {
            return (SEFlashCardThemeSchedule) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEFlashCardThemeSchedule parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEFlashCardThemeSchedule> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEFlashCardThemeSchedule)) {
                return super.equals(obj);
            }
            SEFlashCardThemeSchedule sEFlashCardThemeSchedule = (SEFlashCardThemeSchedule) obj;
            if (hasID() != sEFlashCardThemeSchedule.hasID()) {
                return false;
            }
            if ((!hasID() || getID().equals(sEFlashCardThemeSchedule.getID())) && hasSchedule() == sEFlashCardThemeSchedule.hasSchedule()) {
                return (!hasSchedule() || getSchedule() == sEFlashCardThemeSchedule.getSchedule()) && getUnknownFields().equals(sEFlashCardThemeSchedule.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEFlashCardThemeSchedule_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
        public SEFlashCardThemeInfo getID() {
            SEFlashCardThemeInfo sEFlashCardThemeInfo = this.iD_;
            return sEFlashCardThemeInfo == null ? SEFlashCardThemeInfo.getDefaultInstance() : sEFlashCardThemeInfo;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
        public SEFlashCardThemeInfoOrBuilder getIDOrBuilder() {
            SEFlashCardThemeInfo sEFlashCardThemeInfo = this.iD_;
            return sEFlashCardThemeInfo == null ? SEFlashCardThemeInfo.getDefaultInstance() : sEFlashCardThemeInfo;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEFlashCardThemeSchedule> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
        public int getSchedule() {
            return this.schedule_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getID()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.schedule_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
        public boolean hasID() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEFlashCardThemeScheduleOrBuilder
        public boolean hasSchedule() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasID()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getID().hashCode();
            }
            if (hasSchedule()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSchedule();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEFlashCardThemeSchedule_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFlashCardThemeSchedule.class, Builder.class);
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
            if (!hasID()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSchedule()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getID().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getID());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.schedule_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEFlashCardThemeSchedule(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.schedule_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEFlashCardThemeSchedule sEFlashCardThemeSchedule) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEFlashCardThemeSchedule);
        }

        public static SEFlashCardThemeSchedule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEFlashCardThemeSchedule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFlashCardThemeSchedule) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFlashCardThemeSchedule parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEFlashCardThemeSchedule getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEFlashCardThemeSchedule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEFlashCardThemeSchedule() {
            this.schedule_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEFlashCardThemeSchedule parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEFlashCardThemeSchedule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEFlashCardThemeSchedule parseFrom(InputStream inputStream) {
            return (SEFlashCardThemeSchedule) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEFlashCardThemeSchedule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFlashCardThemeSchedule) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFlashCardThemeSchedule parseFrom(CodedInputStream codedInputStream) {
            return (SEFlashCardThemeSchedule) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEFlashCardThemeSchedule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFlashCardThemeSchedule) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEFlashCardThemeScheduleOrBuilder extends MessageOrBuilder {
        SEFlashCardThemeInfo getID();

        SEFlashCardThemeInfoOrBuilder getIDOrBuilder();

        int getSchedule();

        boolean hasID();

        boolean hasSchedule();
    }

    public static final class SEMedalInfo extends GeneratedMessage implements SEMedalInfoOrBuilder {
        public static final int COMPLETED_PROGRESS_FIELD_NUMBER = 2;
        private static final SEMedalInfo DEFAULT_INSTANCE;
        public static final int MEDAL_ID_FIELD_NUMBER = 1;
        private static final Parser<SEMedalInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int completedProgress_;
        private int medalId_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEMedalInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEMedalInfo> {
            @Override // com.google.protobuf.Parser
            public SEMedalInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEMedalInfo.newBuilder();
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEMedalInfoOrBuilder {
            private int bitField0_;
            private int completedProgress_;
            private int medalId_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEMedalInfo sEMedalInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEMedalInfo.medalId_ = this.medalId_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEMedalInfo.completedProgress_ = this.completedProgress_;
                    i7 |= 2;
                }
                sEMedalInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEMedalInfo_descriptor;
            }

            public Builder clearCompletedProgress() {
                this.bitField0_ &= -3;
                this.completedProgress_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMedalId() {
                this.bitField0_ &= -2;
                this.medalId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
            public int getCompletedProgress() {
                return this.completedProgress_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildrenProtos.internal_static_SA_SEMedalInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
            public int getMedalId() {
                return this.medalId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
            public boolean hasCompletedProgress() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
            public boolean hasMedalId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildrenProtos.internal_static_SA_SEMedalInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMedalInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMedalId() && hasCompletedProgress();
            }

            public Builder setCompletedProgress(int i7) {
                this.completedProgress_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMedalId(int i7) {
                this.medalId_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEMedalInfo build() {
                SEMedalInfo sEMedalInfoBuildPartial = buildPartial();
                if (sEMedalInfoBuildPartial.isInitialized()) {
                    return sEMedalInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEMedalInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEMedalInfo buildPartial() {
                SEMedalInfo sEMedalInfo = new SEMedalInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEMedalInfo);
                }
                onBuilt();
                return sEMedalInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEMedalInfo getDefaultInstanceForType() {
                return SEMedalInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.medalId_ = 0;
                this.completedProgress_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEMedalInfo) {
                    return mergeFrom((SEMedalInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEMedalInfo sEMedalInfo) {
                if (sEMedalInfo == SEMedalInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEMedalInfo.hasMedalId()) {
                    setMedalId(sEMedalInfo.getMedalId());
                }
                if (sEMedalInfo.hasCompletedProgress()) {
                    setCompletedProgress(sEMedalInfo.getCompletedProgress());
                }
                mergeUnknownFields(sEMedalInfo.getUnknownFields());
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
                                    this.medalId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.completedProgress_ = codedInputStream.readUInt32();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEMedalInfo> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.ChildrenProtos$SEMedalInfo$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> listBuilder_;
                private List<SEMedalInfo> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return ChildrenProtos.internal_static_SA_SEMedalInfo_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEMedalInfo> iterable) {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEMedalInfo sEMedalInfo) {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEMedalInfo);
                        return this;
                    }
                    sEMedalInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEMedalInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEMedalInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return ChildrenProtos.internal_static_SA_SEMedalInfo_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
                public SEMedalInfo getList(int i7) {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEMedalInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
                public List<SEMedalInfo> getListList() {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
                public SEMedalInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEMedalInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
                public List<? extends SEMedalInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChildrenProtos.internal_static_SA_SEMedalInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEMedalInfo sEMedalInfo) {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEMedalInfo);
                        return this;
                    }
                    sEMedalInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEMedalInfo);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(d dVar) {
                    this();
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEMedalInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEMedalInfo sEMedalInfo) {
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEMedalInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEMedalInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEMedalInfo);
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
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEMedalInfo sEMedalInfo = (SEMedalInfo) codedInputStream.readMessage(SEMedalInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEMedalInfo, Builder, SEMedalInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEMedalInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEMedalInfo);
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, d dVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChildrenProtos.internal_static_SA_SEMedalInfo_SEList_descriptor;
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
                return ChildrenProtos.internal_static_SA_SEMedalInfo_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
            public SEMedalInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
            public List<SEMedalInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
            public SEMedalInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.SEListOrBuilder
            public List<? extends SEMedalInfoOrBuilder> getListOrBuilderList() {
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
                return ChildrenProtos.internal_static_SA_SEMedalInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
            SEMedalInfo getList(int i7);

            int getListCount();

            List<SEMedalInfo> getListList();

            SEMedalInfoOrBuilder getListOrBuilder(int i7);

            List<? extends SEMedalInfoOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEMedalInfo");
            DEFAULT_INSTANCE = new SEMedalInfo();
            PARSER = new AbstractParser<SEMedalInfo>() { // from class: com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfo.1
                @Override // com.google.protobuf.Parser
                public SEMedalInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEMedalInfo.newBuilder();
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

        public /* synthetic */ SEMedalInfo(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEMedalInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChildrenProtos.internal_static_SA_SEMedalInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEMedalInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEMedalInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEMedalInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEMedalInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEMedalInfo)) {
                return super.equals(obj);
            }
            SEMedalInfo sEMedalInfo = (SEMedalInfo) obj;
            if (hasMedalId() != sEMedalInfo.hasMedalId()) {
                return false;
            }
            if ((!hasMedalId() || getMedalId() == sEMedalInfo.getMedalId()) && hasCompletedProgress() == sEMedalInfo.hasCompletedProgress()) {
                return (!hasCompletedProgress() || getCompletedProgress() == sEMedalInfo.getCompletedProgress()) && getUnknownFields().equals(sEMedalInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
        public int getCompletedProgress() {
            return this.completedProgress_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ChildrenProtos.internal_static_SA_SEMedalInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
        public int getMedalId() {
            return this.medalId_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEMedalInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.medalId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.completedProgress_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
        public boolean hasCompletedProgress() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.ChildrenProtos.SEMedalInfoOrBuilder
        public boolean hasMedalId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasMedalId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMedalId();
            }
            if (hasCompletedProgress()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCompletedProgress();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildrenProtos.internal_static_SA_SEMedalInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMedalInfo.class, Builder.class);
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
            if (!hasMedalId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCompletedProgress()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.medalId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.completedProgress_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEMedalInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.medalId_ = 0;
            this.completedProgress_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEMedalInfo sEMedalInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEMedalInfo);
        }

        public static SEMedalInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEMedalInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMedalInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMedalInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEMedalInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEMedalInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEMedalInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEMedalInfo() {
            this.medalId_ = 0;
            this.completedProgress_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEMedalInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEMedalInfo parseFrom(InputStream inputStream) {
            return (SEMedalInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEMedalInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMedalInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMedalInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEMedalInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEMedalInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMedalInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEMedalInfoOrBuilder extends MessageOrBuilder {
        int getCompletedProgress();

        int getMedalId();

        boolean hasCompletedProgress();

        boolean hasMedalId();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ChildrenProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011sa_Children.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\"\u0083\u0004\n\nSEChildren\u0012F\n\u0014flashcard_theme_list\u0018\u0001 \u0001(\u000b2&.SA.SEFlashCardThemeInfo.ThemeInfoListH\u0000\u0012=\n\rtheme_id_list\u0018\u0002 \u0001(\u000b2$.SA.SEFlashCardThemeInfo.ThemeIDListH\u0000\u0012-\n\u000echallenge_info\u0018\u0003 \u0001(\u000b2\u0013.SA.SEChallengeInfoH\u0000\u0012+\n\rearnings_info\u0018\u0004 \u0001(\u000b2\u0012.SA.SEEarningsInfoH\u0000\u0012<\n\u000funivalence_list\u0018\u0005 \u0001(\u000b2!.SA.SEEarningsInfo.univalenceListH\u0000\u0012+\n\rexchange_info\u0018\u0006 \u0001(\u000b2\u0012.SA.SEExchangeInfoH\u0000\u00122\n\u0010exchange_resoult\u0018\u0007 \u0001(\u000b2\u0016.SA.SEChallengeResoultH\u0000\u0012:\n\u0012flashcard_schedule\u0018\b \u0001(\u000b2\u001c.SA.SEFlashCardThemeScheduleH\u0000\u0012,\n\nmedal_info\u0018\t \u0001(\u000b2\u0016.SA.SEMedalInfo.SEListH\u0000B\t\n\u0007payload\"å\u0001\n\u0014SEFlashCardThemeInfo\u0012\u0012\n\nsubject_id\u0018\u0001 \u0002(\r\u0012\u000f\n\u0007type_id\u0018\u0002 \u0002(\r\u0012\u0010\n\btopic_id\u0018\u0003 \u0002(\r\u001aX\n\rThemeInfoList\u0012-\n\u0004list\u0018\u0001 \u0003(\u000b2\u0018.SA.SEFlashCardThemeInfoB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tmax_count\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u001a<\n\u000bThemeIDList\u0012-\n\u0004list\u0018\u0001 \u0003(\u000b2\u0018.SA.SEFlashCardThemeInfoB\u0005\u0092?\u0002\u0018\u0004\"Y\n\u0018SEFlashCardThemeSchedule\u0012$\n\u0002ID\u0018\u0001 \u0002(\u000b2\u0018.SA.SEFlashCardThemeInfo\u0012\u0017\n\bSchedule\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\"¸\u0001\n\u0011SEChallengeDetail\u0012\u0016\n\u0007type_id\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u00124\n\nstringlist\u0018\u0002 \u0002(\u000b2 .SA.SEChallengeDetail.StringList\u001a2\n\u0004List\u0012*\n\u0004list\u0018\u0001 \u0003(\u000b2\u0015.SA.SEChallengeDetailB\u0005\u0092?\u0002\u0018\u0004\u001a!\n\nStringList\u0012\u0013\n\u0004list\u0018\u0001 \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\"s\n\u000fSEChallengeInfo\u0012\u0017\n\bmax_type\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001d\n\u000emax_string_len\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012(\n\u0004list\u0018\u0003 \u0002(\u000b2\u001a.SA.SEChallengeDetail.List\"Â\u0001\n\u000eSEEarningsInfo\u0012\u0016\n\u000etotal_earnings\u0018\u0001 \u0002(\r\u0012\u001d\n\u000eToday_earnings\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u00120\n\ntotal_list\u0018\u0003 \u0002(\u000b2\u001c.SA.SEEarningsInfo.totalList\u001a \n\ttotalList\u0012\u0013\n\u0004list\u0018\u0001 \u0003(\rB\u0005\u0092?\u0002\u0018\u0004\u001a%\n\u000eunivalenceList\u0012\u0013\n\u0004list\u0018\u0001 \u0003(\rB\u0005\u0092?\u0002\u0018\u0004\"]\n\u000eSEExchangeInfo\u0012\u0018\n\u0004time\u0018\u0001 \u0002(\u000b2\n.SA.SETime\u0012\u0016\n\u000etotal_earnings\u0018\u0002 \u0002(\r\u0012\u0019\n\u0011Exchange_earnings\u0018\u0003 \u0002(\r\"®\u0001\n\u0012SEChallengeResoult\u0012\u0016\n\u0007type_id\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001e\n\nstart_time\u0018\u0002 \u0002(\u000b2\n.SA.SETime\u0012\u001d\n\tstop_time\u0018\u0003 \u0002(\u000b2\n.SA.SETime\u0012\f\n\u0004step\u0018\u0004 \u0001(\r\u0012\u000b\n\u0003dis\u0018\u0005 \u0001(\r\u0012\u0015\n\rcontinue_time\u0018\u0006 \u0002(\r\u0012\u000f\n\u0007resoult\u0018\u0007 \u0002(\b\"k\n\u000bSEMedalInfo\u0012\u0010\n\bmedal_id\u0018\u0001 \u0002(\r\u0012\u001a\n\u0012completed_progress\u0018\u0002 \u0002(\r\u001a.\n\u0006SEList\u0012$\n\u0004list\u0018\u0001 \u0003(\u000b2\u000f.SA.SEMedalInfoB\u0005\u0092?\u0002\u0018\u0004*\u008b\u0003\n\u0015SEChildren_ChildrenID\u0012\u001b\n\u0017GET_FLASH_CARD_THEME_ID\u0010\u0000\u0012\u001e\n\u001aCHANGE_FLASH_CARD_THEME_ID\u0010\u0001\u0012\u001b\n\u0017DEL_FLASH_CARD_THEME_ID\u0010\u0002\u0012\u0019\n\u0015SET_CHALLENGE_INFO_ID\u0010\u0003\u0012\u0019\n\u0015GET_CHALLENGE_INFO_ID\u0010\u0004\u0012\u0018\n\u0014SET_EARNINGS_INFO_ID\u0010\u0005\u0012\u0018\n\u0014GET_EARNINGS_INFO_ID\u0010\u0006\u0012\u001e\n\u001aGET_CHANGE_POCKET_MONEY_ID\u0010\u0007\u0012\"\n\u001eSEND_CHALLENGE_RESOULT_INFO_ID\u0010\b\u0012\u001e\n\u001aSEND_FLASHCARD_SCHEDULE_ID\u0010\t\u0012\u001c\n\u0018SET_EARNINGS_OBTAINED_ID\u0010\n\u0012\u0015\n\u0011SET_MEDAL_Info_ID\u0010\u000b\u0012\u0015\n\u0011GET_MEDAL_Info_ID\u0010\fB4\n\u001bcom.zh.ble.sa_wear.protobufB\u000eChildrenProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEChildren_descriptor = messageType;
        internal_static_SA_SEChildren_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"FlashcardThemeList", "ThemeIdList", "ChallengeInfo", "EarningsInfo", "UnivalenceList", "ExchangeInfo", "ExchangeResoult", "FlashcardSchedule", "MedalInfo", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SEFlashCardThemeInfo_descriptor = messageType2;
        internal_static_SA_SEFlashCardThemeInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"SubjectId", "TypeId", "TopicId"});
        Descriptors.Descriptor nestedType = messageType2.getNestedType(0);
        internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_descriptor = nestedType;
        internal_static_SA_SEFlashCardThemeInfo_ThemeInfoList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a, "MaxCount"});
        Descriptors.Descriptor nestedType2 = messageType2.getNestedType(1);
        internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_descriptor = nestedType2;
        internal_static_SA_SEFlashCardThemeInfo_ThemeIDList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SEFlashCardThemeSchedule_descriptor = messageType3;
        internal_static_SA_SEFlashCardThemeSchedule_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"ID", AppEventsConstants.f67149x});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SEChallengeDetail_descriptor = messageType4;
        internal_static_SA_SEChallengeDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"TypeId", "Stringlist"});
        Descriptors.Descriptor nestedType3 = messageType4.getNestedType(0);
        internal_static_SA_SEChallengeDetail_List_descriptor = nestedType3;
        internal_static_SA_SEChallengeDetail_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor nestedType4 = messageType4.getNestedType(1);
        internal_static_SA_SEChallengeDetail_StringList_descriptor = nestedType4;
        internal_static_SA_SEChallengeDetail_StringList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SEChallengeInfo_descriptor = messageType5;
        internal_static_SA_SEChallengeInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"MaxType", "MaxStringLen", MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SEEarningsInfo_descriptor = messageType6;
        internal_static_SA_SEEarningsInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"TotalEarnings", "TodayEarnings", "TotalList"});
        Descriptors.Descriptor nestedType5 = messageType6.getNestedType(0);
        internal_static_SA_SEEarningsInfo_totalList_descriptor = nestedType5;
        internal_static_SA_SEEarningsInfo_totalList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType5, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor nestedType6 = messageType6.getNestedType(1);
        internal_static_SA_SEEarningsInfo_univalenceList_descriptor = nestedType6;
        internal_static_SA_SEEarningsInfo_univalenceList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType6, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SA_SEExchangeInfo_descriptor = messageType7;
        internal_static_SA_SEExchangeInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{UrlTemplate.f27969g, "TotalEarnings", "ExchangeEarnings"});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SA_SEChallengeResoult_descriptor = messageType8;
        internal_static_SA_SEChallengeResoult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"TypeId", "StartTime", "StopTime", "Step", "Dis", "ContinueTime", "Resoult"});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SA_SEMedalInfo_descriptor = messageType9;
        internal_static_SA_SEMedalInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{"MedalId", "CompletedProgress"});
        Descriptors.Descriptor nestedType7 = messageType9.getNestedType(0);
        internal_static_SA_SEMedalInfo_SEList_descriptor = nestedType7;
        internal_static_SA_SEMedalInfo_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType7, new String[]{MessageLiteToString.f20028a});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private ChildrenProtos() {
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