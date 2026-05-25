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
import com.google.protobuf.ProtocolMessageEnum;
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
public final class WatchFaceProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEComplexFunctionsConfigType_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEComplexFunctionsConfigType_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEComplexFunctionsConfigType_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEComplexFunctionsConfigType_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEComplexFunctionsConfig_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEComplexFunctionsConfig_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEComplexFunctionsConfig_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEComplexFunctionsConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEInstallResult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEInstallResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFaceConfig_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFaceConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFaceFileConfig_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFaceFileConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFaceFileList_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFaceFileList_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFaceFileList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFaceFileList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFaceItem_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFaceItem_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFaceItem_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFaceItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFacePrepareInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFacePrepareInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFaceResultInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFaceResultInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWatchFace_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWatchFace_fieldAccessorTable;

    public static final class SEComplexFunctionsConfig extends GeneratedMessage implements SEComplexFunctionsConfigOrBuilder {
        public static final int COMPLEX_FUNCTIONS_CONFIG_POSITION_FIELD_NUMBER = 1;
        public static final int COMPLEX_FUNCTIONS_CONFIG_TYPE_CHOOSE_FIELD_NUMBER = 3;
        public static final int COMPLEX_FUNCTIONS_CONFIG_TYPE_LIST_FIELD_NUMBER = 2;
        private static final SEComplexFunctionsConfig DEFAULT_INSTANCE;
        private static final Parser<SEComplexFunctionsConfig> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int complexFunctionsConfigPosition_;
        private int complexFunctionsConfigTypeChoose_;
        private SEComplexFunctionsConfigType.SEList complexFunctionsConfigTypeList_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEComplexFunctionsConfig$1 */
        public class AnonymousClass1 extends AbstractParser<SEComplexFunctionsConfig> {
            @Override // com.google.protobuf.Parser
            public SEComplexFunctionsConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEComplexFunctionsConfig.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEComplexFunctionsConfigOrBuilder {
            private int bitField0_;
            private int complexFunctionsConfigPosition_;
            private int complexFunctionsConfigTypeChoose_;
            private SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> complexFunctionsConfigTypeListBuilder_;
            private SEComplexFunctionsConfigType.SEList complexFunctionsConfigTypeList_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEComplexFunctionsConfig sEComplexFunctionsConfig) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEComplexFunctionsConfig.complexFunctionsConfigPosition_ = this.complexFunctionsConfigPosition_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                    sEComplexFunctionsConfig.complexFunctionsConfigTypeList_ = singleFieldBuilder == null ? this.complexFunctionsConfigTypeList_ : (SEComplexFunctionsConfigType.SEList) singleFieldBuilder.build();
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEComplexFunctionsConfig.complexFunctionsConfigTypeChoose_ = this.complexFunctionsConfigTypeChoose_;
                    i7 |= 4;
                }
                sEComplexFunctionsConfig.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_descriptor;
            }

            private SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> internalGetComplexFunctionsConfigTypeListFieldBuilder() {
                if (this.complexFunctionsConfigTypeListBuilder_ == null) {
                    this.complexFunctionsConfigTypeListBuilder_ = new SingleFieldBuilder<>(getComplexFunctionsConfigTypeList(), getParentForChildren(), isClean());
                    this.complexFunctionsConfigTypeList_ = null;
                }
                return this.complexFunctionsConfigTypeListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetComplexFunctionsConfigTypeListFieldBuilder();
                }
            }

            public Builder clearComplexFunctionsConfigPosition() {
                this.bitField0_ &= -2;
                this.complexFunctionsConfigPosition_ = 0;
                onChanged();
                return this;
            }

            public Builder clearComplexFunctionsConfigTypeChoose() {
                this.bitField0_ &= -5;
                this.complexFunctionsConfigTypeChoose_ = 0;
                onChanged();
                return this;
            }

            public Builder clearComplexFunctionsConfigTypeList() {
                this.bitField0_ &= -3;
                this.complexFunctionsConfigTypeList_ = null;
                SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.complexFunctionsConfigTypeListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
            public int getComplexFunctionsConfigPosition() {
                return this.complexFunctionsConfigPosition_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
            public int getComplexFunctionsConfigTypeChoose() {
                return this.complexFunctionsConfigTypeChoose_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
            public SEComplexFunctionsConfigType.SEList getComplexFunctionsConfigTypeList() {
                SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEComplexFunctionsConfigType.SEList) singleFieldBuilder.getMessage();
                }
                SEComplexFunctionsConfigType.SEList sEList = this.complexFunctionsConfigTypeList_;
                return sEList == null ? SEComplexFunctionsConfigType.SEList.getDefaultInstance() : sEList;
            }

            public SEComplexFunctionsConfigType.SEList.Builder getComplexFunctionsConfigTypeListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEComplexFunctionsConfigType.SEList.Builder) internalGetComplexFunctionsConfigTypeListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
            public SEComplexFunctionsConfigType.SEListOrBuilder getComplexFunctionsConfigTypeListOrBuilder() {
                SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEComplexFunctionsConfigType.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEComplexFunctionsConfigType.SEList sEList = this.complexFunctionsConfigTypeList_;
                return sEList == null ? SEComplexFunctionsConfigType.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
            public boolean hasComplexFunctionsConfigPosition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
            public boolean hasComplexFunctionsConfigTypeChoose() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
            public boolean hasComplexFunctionsConfigTypeList() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEComplexFunctionsConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasComplexFunctionsConfigPosition() && hasComplexFunctionsConfigTypeList() && hasComplexFunctionsConfigTypeChoose() && getComplexFunctionsConfigTypeList().isInitialized();
            }

            public Builder mergeComplexFunctionsConfigTypeList(SEComplexFunctionsConfigType.SEList sEList) {
                SEComplexFunctionsConfigType.SEList sEList2;
                SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 2) == 0 || (sEList2 = this.complexFunctionsConfigTypeList_) == null || sEList2 == SEComplexFunctionsConfigType.SEList.getDefaultInstance()) {
                    this.complexFunctionsConfigTypeList_ = sEList;
                } else {
                    getComplexFunctionsConfigTypeListBuilder().mergeFrom(sEList);
                }
                if (this.complexFunctionsConfigTypeList_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setComplexFunctionsConfigPosition(int i7) {
                this.complexFunctionsConfigPosition_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setComplexFunctionsConfigTypeChoose(int i7) {
                this.complexFunctionsConfigTypeChoose_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setComplexFunctionsConfigTypeList(SEComplexFunctionsConfigType.SEList sEList) {
                SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.complexFunctionsConfigTypeList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEComplexFunctionsConfig build() {
                SEComplexFunctionsConfig sEComplexFunctionsConfigBuildPartial = buildPartial();
                if (sEComplexFunctionsConfigBuildPartial.isInitialized()) {
                    return sEComplexFunctionsConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEComplexFunctionsConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEComplexFunctionsConfig buildPartial() {
                SEComplexFunctionsConfig sEComplexFunctionsConfig = new SEComplexFunctionsConfig(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEComplexFunctionsConfig);
                }
                onBuilt();
                return sEComplexFunctionsConfig;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEComplexFunctionsConfig getDefaultInstanceForType() {
                return SEComplexFunctionsConfig.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.complexFunctionsConfigPosition_ = 0;
                this.complexFunctionsConfigTypeList_ = null;
                SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.complexFunctionsConfigTypeListBuilder_ = null;
                }
                this.complexFunctionsConfigTypeChoose_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEComplexFunctionsConfig) {
                    return mergeFrom((SEComplexFunctionsConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setComplexFunctionsConfigTypeList(SEComplexFunctionsConfigType.SEList.Builder builder) {
                SingleFieldBuilder<SEComplexFunctionsConfigType.SEList, SEComplexFunctionsConfigType.SEList.Builder, SEComplexFunctionsConfigType.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigTypeListBuilder_;
                if (singleFieldBuilder == null) {
                    this.complexFunctionsConfigTypeList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEComplexFunctionsConfig sEComplexFunctionsConfig) {
                if (sEComplexFunctionsConfig == SEComplexFunctionsConfig.getDefaultInstance()) {
                    return this;
                }
                if (sEComplexFunctionsConfig.hasComplexFunctionsConfigPosition()) {
                    setComplexFunctionsConfigPosition(sEComplexFunctionsConfig.getComplexFunctionsConfigPosition());
                }
                if (sEComplexFunctionsConfig.hasComplexFunctionsConfigTypeList()) {
                    mergeComplexFunctionsConfigTypeList(sEComplexFunctionsConfig.getComplexFunctionsConfigTypeList());
                }
                if (sEComplexFunctionsConfig.hasComplexFunctionsConfigTypeChoose()) {
                    setComplexFunctionsConfigTypeChoose(sEComplexFunctionsConfig.getComplexFunctionsConfigTypeChoose());
                }
                mergeUnknownFields(sEComplexFunctionsConfig.getUnknownFields());
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
                                    this.complexFunctionsConfigPosition_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetComplexFunctionsConfigTypeListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.complexFunctionsConfigTypeChoose_ = codedInputStream.readUInt32();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEComplexFunctionsConfig> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEComplexFunctionsConfig$SEList$1 */
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
                private RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> listBuilder_;
                private List<SEComplexFunctionsConfig> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEComplexFunctionsConfig> iterable) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEComplexFunctionsConfig sEComplexFunctionsConfig) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEComplexFunctionsConfig);
                        return this;
                    }
                    sEComplexFunctionsConfig.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEComplexFunctionsConfig);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEComplexFunctionsConfig.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
                public SEComplexFunctionsConfig getList(int i7) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEComplexFunctionsConfig) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
                public List<SEComplexFunctionsConfig> getListList() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
                public SEComplexFunctionsConfigOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEComplexFunctionsConfigOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
                public List<? extends SEComplexFunctionsConfigOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEComplexFunctionsConfig sEComplexFunctionsConfig) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEComplexFunctionsConfig);
                        return this;
                    }
                    sEComplexFunctionsConfig.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEComplexFunctionsConfig);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(p pVar) {
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEComplexFunctionsConfig.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEComplexFunctionsConfig sEComplexFunctionsConfig) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEComplexFunctionsConfig.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEComplexFunctionsConfig);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEComplexFunctionsConfig);
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEComplexFunctionsConfig sEComplexFunctionsConfig = (SEComplexFunctionsConfig) codedInputStream.readMessage(SEComplexFunctionsConfig.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEComplexFunctionsConfig, Builder, SEComplexFunctionsConfigOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEComplexFunctionsConfig);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEComplexFunctionsConfig);
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
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, p pVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_SEList_descriptor;
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
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_SEList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
            public SEComplexFunctionsConfig getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
            public List<SEComplexFunctionsConfig> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
            public SEComplexFunctionsConfigOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.SEListOrBuilder
            public List<? extends SEComplexFunctionsConfigOrBuilder> getListOrBuilderList() {
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
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
            SEComplexFunctionsConfig getList(int i7);

            int getListCount();

            List<SEComplexFunctionsConfig> getListList();

            SEComplexFunctionsConfigOrBuilder getListOrBuilder(int i7);

            List<? extends SEComplexFunctionsConfigOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEComplexFunctionsConfig");
            DEFAULT_INSTANCE = new SEComplexFunctionsConfig();
            PARSER = new AbstractParser<SEComplexFunctionsConfig>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfig.1
                @Override // com.google.protobuf.Parser
                public SEComplexFunctionsConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEComplexFunctionsConfig.newBuilder();
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

        public /* synthetic */ SEComplexFunctionsConfig(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEComplexFunctionsConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEComplexFunctionsConfig parseDelimitedFrom(InputStream inputStream) {
            return (SEComplexFunctionsConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEComplexFunctionsConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEComplexFunctionsConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEComplexFunctionsConfig)) {
                return super.equals(obj);
            }
            SEComplexFunctionsConfig sEComplexFunctionsConfig = (SEComplexFunctionsConfig) obj;
            if (hasComplexFunctionsConfigPosition() != sEComplexFunctionsConfig.hasComplexFunctionsConfigPosition()) {
                return false;
            }
            if ((hasComplexFunctionsConfigPosition() && getComplexFunctionsConfigPosition() != sEComplexFunctionsConfig.getComplexFunctionsConfigPosition()) || hasComplexFunctionsConfigTypeList() != sEComplexFunctionsConfig.hasComplexFunctionsConfigTypeList()) {
                return false;
            }
            if ((!hasComplexFunctionsConfigTypeList() || getComplexFunctionsConfigTypeList().equals(sEComplexFunctionsConfig.getComplexFunctionsConfigTypeList())) && hasComplexFunctionsConfigTypeChoose() == sEComplexFunctionsConfig.hasComplexFunctionsConfigTypeChoose()) {
                return (!hasComplexFunctionsConfigTypeChoose() || getComplexFunctionsConfigTypeChoose() == sEComplexFunctionsConfig.getComplexFunctionsConfigTypeChoose()) && getUnknownFields().equals(sEComplexFunctionsConfig.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
        public int getComplexFunctionsConfigPosition() {
            return this.complexFunctionsConfigPosition_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
        public int getComplexFunctionsConfigTypeChoose() {
            return this.complexFunctionsConfigTypeChoose_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
        public SEComplexFunctionsConfigType.SEList getComplexFunctionsConfigTypeList() {
            SEComplexFunctionsConfigType.SEList sEList = this.complexFunctionsConfigTypeList_;
            return sEList == null ? SEComplexFunctionsConfigType.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
        public SEComplexFunctionsConfigType.SEListOrBuilder getComplexFunctionsConfigTypeListOrBuilder() {
            SEComplexFunctionsConfigType.SEList sEList = this.complexFunctionsConfigTypeList_;
            return sEList == null ? SEComplexFunctionsConfigType.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEComplexFunctionsConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.complexFunctionsConfigPosition_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getComplexFunctionsConfigTypeList());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.complexFunctionsConfigTypeChoose_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
        public boolean hasComplexFunctionsConfigPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
        public boolean hasComplexFunctionsConfigTypeChoose() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigOrBuilder
        public boolean hasComplexFunctionsConfigTypeList() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasComplexFunctionsConfigPosition()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getComplexFunctionsConfigPosition();
            }
            if (hasComplexFunctionsConfigTypeList()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getComplexFunctionsConfigTypeList().hashCode();
            }
            if (hasComplexFunctionsConfigTypeChoose()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getComplexFunctionsConfigTypeChoose();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEComplexFunctionsConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEComplexFunctionsConfig.class, Builder.class);
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
            if (!hasComplexFunctionsConfigPosition()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasComplexFunctionsConfigTypeList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasComplexFunctionsConfigTypeChoose()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getComplexFunctionsConfigTypeList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.complexFunctionsConfigPosition_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getComplexFunctionsConfigTypeList());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.complexFunctionsConfigTypeChoose_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEComplexFunctionsConfig(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.complexFunctionsConfigPosition_ = 0;
            this.complexFunctionsConfigTypeChoose_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEComplexFunctionsConfig sEComplexFunctionsConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEComplexFunctionsConfig);
        }

        public static SEComplexFunctionsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEComplexFunctionsConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEComplexFunctionsConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEComplexFunctionsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEComplexFunctionsConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEComplexFunctionsConfig() {
            this.complexFunctionsConfigPosition_ = 0;
            this.complexFunctionsConfigTypeChoose_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEComplexFunctionsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfig parseFrom(InputStream inputStream) {
            return (SEComplexFunctionsConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEComplexFunctionsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEComplexFunctionsConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfig parseFrom(CodedInputStream codedInputStream) {
            return (SEComplexFunctionsConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEComplexFunctionsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEComplexFunctionsConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEComplexFunctionsConfigOrBuilder extends MessageOrBuilder {
        int getComplexFunctionsConfigPosition();

        int getComplexFunctionsConfigTypeChoose();

        SEComplexFunctionsConfigType.SEList getComplexFunctionsConfigTypeList();

        SEComplexFunctionsConfigType.SEListOrBuilder getComplexFunctionsConfigTypeListOrBuilder();

        boolean hasComplexFunctionsConfigPosition();

        boolean hasComplexFunctionsConfigTypeChoose();

        boolean hasComplexFunctionsConfigTypeList();
    }

    public static final class SEComplexFunctionsConfigType extends GeneratedMessage implements SEComplexFunctionsConfigTypeOrBuilder {
        public static final int COMPLEX_FUNCTIONS_CONFIG_TYPE_FIELD_NUMBER = 1;
        private static final SEComplexFunctionsConfigType DEFAULT_INSTANCE;
        private static final Parser<SEComplexFunctionsConfigType> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int complexFunctionsConfigType_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEComplexFunctionsConfigType$1 */
        public class AnonymousClass1 extends AbstractParser<SEComplexFunctionsConfigType> {
            @Override // com.google.protobuf.Parser
            public SEComplexFunctionsConfigType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEComplexFunctionsConfigType.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEComplexFunctionsConfigTypeOrBuilder {
            private int bitField0_;
            private int complexFunctionsConfigType_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEComplexFunctionsConfigType sEComplexFunctionsConfigType) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sEComplexFunctionsConfigType.complexFunctionsConfigType_ = this.complexFunctionsConfigType_;
                } else {
                    i7 = 0;
                }
                sEComplexFunctionsConfigType.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_descriptor;
            }

            public Builder clearComplexFunctionsConfigType() {
                this.bitField0_ &= -2;
                this.complexFunctionsConfigType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigTypeOrBuilder
            public int getComplexFunctionsConfigType() {
                return this.complexFunctionsConfigType_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigTypeOrBuilder
            public boolean hasComplexFunctionsConfigType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_fieldAccessorTable.ensureFieldAccessorsInitialized(SEComplexFunctionsConfigType.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasComplexFunctionsConfigType();
            }

            public Builder setComplexFunctionsConfigType(int i7) {
                this.complexFunctionsConfigType_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEComplexFunctionsConfigType build() {
                SEComplexFunctionsConfigType sEComplexFunctionsConfigTypeBuildPartial = buildPartial();
                if (sEComplexFunctionsConfigTypeBuildPartial.isInitialized()) {
                    return sEComplexFunctionsConfigTypeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEComplexFunctionsConfigTypeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEComplexFunctionsConfigType buildPartial() {
                SEComplexFunctionsConfigType sEComplexFunctionsConfigType = new SEComplexFunctionsConfigType(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEComplexFunctionsConfigType);
                }
                onBuilt();
                return sEComplexFunctionsConfigType;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEComplexFunctionsConfigType getDefaultInstanceForType() {
                return SEComplexFunctionsConfigType.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.complexFunctionsConfigType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEComplexFunctionsConfigType) {
                    return mergeFrom((SEComplexFunctionsConfigType) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEComplexFunctionsConfigType sEComplexFunctionsConfigType) {
                if (sEComplexFunctionsConfigType == SEComplexFunctionsConfigType.getDefaultInstance()) {
                    return this;
                }
                if (sEComplexFunctionsConfigType.hasComplexFunctionsConfigType()) {
                    setComplexFunctionsConfigType(sEComplexFunctionsConfigType.getComplexFunctionsConfigType());
                }
                mergeUnknownFields(sEComplexFunctionsConfigType.getUnknownFields());
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
                                if (tag != 8) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.complexFunctionsConfigType_ = codedInputStream.readUInt32();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEComplexFunctionsConfigType> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEComplexFunctionsConfigType$SEList$1 */
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
                private RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> listBuilder_;
                private List<SEComplexFunctionsConfigType> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEComplexFunctionsConfigType> iterable) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEComplexFunctionsConfigType sEComplexFunctionsConfigType) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEComplexFunctionsConfigType);
                        return this;
                    }
                    sEComplexFunctionsConfigType.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEComplexFunctionsConfigType);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEComplexFunctionsConfigType.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
                public SEComplexFunctionsConfigType getList(int i7) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEComplexFunctionsConfigType) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
                public List<SEComplexFunctionsConfigType> getListList() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
                public SEComplexFunctionsConfigTypeOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEComplexFunctionsConfigTypeOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
                public List<? extends SEComplexFunctionsConfigTypeOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEComplexFunctionsConfigType sEComplexFunctionsConfigType) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEComplexFunctionsConfigType);
                        return this;
                    }
                    sEComplexFunctionsConfigType.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEComplexFunctionsConfigType);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(p pVar) {
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEComplexFunctionsConfigType.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEComplexFunctionsConfigType sEComplexFunctionsConfigType) {
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEComplexFunctionsConfigType.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEComplexFunctionsConfigType);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEComplexFunctionsConfigType);
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEComplexFunctionsConfigType sEComplexFunctionsConfigType = (SEComplexFunctionsConfigType) codedInputStream.readMessage(SEComplexFunctionsConfigType.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEComplexFunctionsConfigType, Builder, SEComplexFunctionsConfigTypeOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEComplexFunctionsConfigType);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEComplexFunctionsConfigType);
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
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, p pVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_SEList_descriptor;
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
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_SEList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
            public SEComplexFunctionsConfigType getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
            public List<SEComplexFunctionsConfigType> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
            public SEComplexFunctionsConfigTypeOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.SEListOrBuilder
            public List<? extends SEComplexFunctionsConfigTypeOrBuilder> getListOrBuilderList() {
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
                return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
            SEComplexFunctionsConfigType getList(int i7);

            int getListCount();

            List<SEComplexFunctionsConfigType> getListList();

            SEComplexFunctionsConfigTypeOrBuilder getListOrBuilder(int i7);

            List<? extends SEComplexFunctionsConfigTypeOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEComplexFunctionsConfigType");
            DEFAULT_INSTANCE = new SEComplexFunctionsConfigType();
            PARSER = new AbstractParser<SEComplexFunctionsConfigType>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigType.1
                @Override // com.google.protobuf.Parser
                public SEComplexFunctionsConfigType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEComplexFunctionsConfigType.newBuilder();
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

        public /* synthetic */ SEComplexFunctionsConfigType(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEComplexFunctionsConfigType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEComplexFunctionsConfigType parseDelimitedFrom(InputStream inputStream) {
            return (SEComplexFunctionsConfigType) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEComplexFunctionsConfigType parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEComplexFunctionsConfigType> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEComplexFunctionsConfigType)) {
                return super.equals(obj);
            }
            SEComplexFunctionsConfigType sEComplexFunctionsConfigType = (SEComplexFunctionsConfigType) obj;
            if (hasComplexFunctionsConfigType() != sEComplexFunctionsConfigType.hasComplexFunctionsConfigType()) {
                return false;
            }
            return (!hasComplexFunctionsConfigType() || getComplexFunctionsConfigType() == sEComplexFunctionsConfigType.getComplexFunctionsConfigType()) && getUnknownFields().equals(sEComplexFunctionsConfigType.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigTypeOrBuilder
        public int getComplexFunctionsConfigType() {
            return this.complexFunctionsConfigType_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEComplexFunctionsConfigType> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.complexFunctionsConfigType_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeUInt32Size;
            return iComputeUInt32Size;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEComplexFunctionsConfigTypeOrBuilder
        public boolean hasComplexFunctionsConfigType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasComplexFunctionsConfigType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getComplexFunctionsConfigType();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEComplexFunctionsConfigType_fieldAccessorTable.ensureFieldAccessorsInitialized(SEComplexFunctionsConfigType.class, Builder.class);
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
            if (hasComplexFunctionsConfigType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.complexFunctionsConfigType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEComplexFunctionsConfigType(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.complexFunctionsConfigType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEComplexFunctionsConfigType sEComplexFunctionsConfigType) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEComplexFunctionsConfigType);
        }

        public static SEComplexFunctionsConfigType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfigType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEComplexFunctionsConfigType) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfigType parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEComplexFunctionsConfigType getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEComplexFunctionsConfigType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEComplexFunctionsConfigType() {
            this.complexFunctionsConfigType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEComplexFunctionsConfigType parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEComplexFunctionsConfigType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfigType parseFrom(InputStream inputStream) {
            return (SEComplexFunctionsConfigType) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEComplexFunctionsConfigType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEComplexFunctionsConfigType) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEComplexFunctionsConfigType parseFrom(CodedInputStream codedInputStream) {
            return (SEComplexFunctionsConfigType) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEComplexFunctionsConfigType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEComplexFunctionsConfigType) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEComplexFunctionsConfigTypeOrBuilder extends MessageOrBuilder {
        int getComplexFunctionsConfigType();

        boolean hasComplexFunctionsConfigType();
    }

    public static final class SEInstallResult extends GeneratedMessage implements SEInstallResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final SEInstallResult DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SEInstallResult> PARSER;
        public static final int WATCH_FACE_CONFIG_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private SEWatchFaceConfig watchFaceConfig_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEInstallResult$1 */
        public class AnonymousClass1 extends AbstractParser<SEInstallResult> {
            @Override // com.google.protobuf.Parser
            public SEInstallResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEInstallResult.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEInstallResultOrBuilder {
            private int bitField0_;
            private int code_;
            private Object id_;
            private SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> watchFaceConfigBuilder_;
            private SEWatchFaceConfig watchFaceConfig_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEInstallResult sEInstallResult) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEInstallResult.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEInstallResult.code_ = this.code_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                    sEInstallResult.watchFaceConfig_ = singleFieldBuilder == null ? this.watchFaceConfig_ : (SEWatchFaceConfig) singleFieldBuilder.build();
                    i7 |= 4;
                }
                sEInstallResult.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEInstallResult_descriptor;
            }

            private SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> internalGetWatchFaceConfigFieldBuilder() {
                if (this.watchFaceConfigBuilder_ == null) {
                    this.watchFaceConfigBuilder_ = new SingleFieldBuilder<>(getWatchFaceConfig(), getParentForChildren(), isClean());
                    this.watchFaceConfig_ = null;
                }
                return this.watchFaceConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetWatchFaceConfigFieldBuilder();
                }
            }

            public Builder clearCode() {
                this.bitField0_ &= -3;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SEInstallResult.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearWatchFaceConfig() {
                this.bitField0_ &= -5;
                this.watchFaceConfig_ = null;
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.watchFaceConfigBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
            public SECode getCode() {
                SECode sECodeForNumber = SECode.forNumber(this.code_);
                return sECodeForNumber == null ? SECode.VERIFY_FAILED : sECodeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEInstallResult_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
            public SEWatchFaceConfig getWatchFaceConfig() {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceConfig) singleFieldBuilder.getMessage();
                }
                SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
                return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
            }

            public SEWatchFaceConfig.Builder getWatchFaceConfigBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SEWatchFaceConfig.Builder) internalGetWatchFaceConfigFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
            public SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder() {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
                return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
            public boolean hasWatchFaceConfig() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEInstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEInstallResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasId() && hasCode()) {
                    return !hasWatchFaceConfig() || getWatchFaceConfig().isInitialized();
                }
                return false;
            }

            public Builder mergeWatchFaceConfig(SEWatchFaceConfig sEWatchFaceConfig) {
                SEWatchFaceConfig sEWatchFaceConfig2;
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceConfig);
                } else if ((this.bitField0_ & 4) == 0 || (sEWatchFaceConfig2 = this.watchFaceConfig_) == null || sEWatchFaceConfig2 == SEWatchFaceConfig.getDefaultInstance()) {
                    this.watchFaceConfig_ = sEWatchFaceConfig;
                } else {
                    getWatchFaceConfigBuilder().mergeFrom(sEWatchFaceConfig);
                }
                if (this.watchFaceConfig_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setCode(SECode sECode) {
                sECode.getClass();
                this.bitField0_ |= 2;
                this.code_ = sECode.getNumber();
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

            public Builder setWatchFaceConfig(SEWatchFaceConfig sEWatchFaceConfig) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceConfig.getClass();
                    this.watchFaceConfig_ = sEWatchFaceConfig;
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceConfig);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                this.id_ = "";
                this.code_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEInstallResult build() {
                SEInstallResult sEInstallResultBuildPartial = buildPartial();
                if (sEInstallResultBuildPartial.isInitialized()) {
                    return sEInstallResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEInstallResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEInstallResult buildPartial() {
                SEInstallResult sEInstallResult = new SEInstallResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEInstallResult);
                }
                onBuilt();
                return sEInstallResult;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEInstallResult getDefaultInstanceForType() {
                return SEInstallResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.code_ = 0;
                this.watchFaceConfig_ = null;
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.watchFaceConfigBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.code_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEInstallResult) {
                    return mergeFrom((SEInstallResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setWatchFaceConfig(SEWatchFaceConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder == null) {
                    this.watchFaceConfig_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEInstallResult sEInstallResult) {
                if (sEInstallResult == SEInstallResult.getDefaultInstance()) {
                    return this;
                }
                if (sEInstallResult.hasId()) {
                    this.id_ = sEInstallResult.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEInstallResult.hasCode()) {
                    setCode(sEInstallResult.getCode());
                }
                if (sEInstallResult.hasWatchFaceConfig()) {
                    mergeWatchFaceConfig(sEInstallResult.getWatchFaceConfig());
                }
                mergeUnknownFields(sEInstallResult.getUnknownFields());
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
                                    if (SECode.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.code_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetWatchFaceConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public enum SECode implements ProtocolMessageEnum {
            VERIFY_FAILED(0),
            INSTALL_FAILED(1),
            INSTALL_SUCCESS(2);

            public static final int INSTALL_FAILED_VALUE = 1;
            public static final int INSTALL_SUCCESS_VALUE = 2;
            private static final SECode[] VALUES;
            public static final int VERIFY_FAILED_VALUE = 0;
            private static final Internal.EnumLiteMap<SECode> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEInstallResult$SECode$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SECode> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SECode findValueByNumber(int i7) {
                    return SECode.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SECode");
                internalValueMap = new Internal.EnumLiteMap<SECode>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResult.SECode.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SECode findValueByNumber(int i7) {
                        return SECode.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SECode(int i7) {
                this.value = i7;
            }

            public static SECode forNumber(int i7) {
                if (i7 == 0) {
                    return VERIFY_FAILED;
                }
                if (i7 == 1) {
                    return INSTALL_FAILED;
                }
                if (i7 != 2) {
                    return null;
                }
                return INSTALL_SUCCESS;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEInstallResult.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SECode> internalGetValueMap() {
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
            public static SECode valueOf(int i7) {
                return forNumber(i7);
            }

            public static SECode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEInstallResult");
            DEFAULT_INSTANCE = new SEInstallResult();
            PARSER = new AbstractParser<SEInstallResult>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResult.1
                @Override // com.google.protobuf.Parser
                public SEInstallResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEInstallResult.newBuilder();
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

        public /* synthetic */ SEInstallResult(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEInstallResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEInstallResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEInstallResult parseDelimitedFrom(InputStream inputStream) {
            return (SEInstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEInstallResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEInstallResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEInstallResult)) {
                return super.equals(obj);
            }
            SEInstallResult sEInstallResult = (SEInstallResult) obj;
            if (hasId() != sEInstallResult.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sEInstallResult.getId())) || hasCode() != sEInstallResult.hasCode()) {
                return false;
            }
            if ((!hasCode() || this.code_ == sEInstallResult.code_) && hasWatchFaceConfig() == sEInstallResult.hasWatchFaceConfig()) {
                return (!hasWatchFaceConfig() || getWatchFaceConfig().equals(sEInstallResult.getWatchFaceConfig())) && getUnknownFields().equals(sEInstallResult.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
        public SECode getCode() {
            SECode sECodeForNumber = SECode.forNumber(this.code_);
            return sECodeForNumber == null ? SECode.VERIFY_FAILED : sECodeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEInstallResult_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
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
        public Parser<SEInstallResult> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, getWatchFaceConfig());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
        public SEWatchFaceConfig getWatchFaceConfig() {
            SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
            return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
        public SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder() {
            SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
            return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEInstallResultOrBuilder
        public boolean hasWatchFaceConfig() {
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
            if (hasCode()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.code_;
            }
            if (hasWatchFaceConfig()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getWatchFaceConfig().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEInstallResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEInstallResult.class, Builder.class);
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
            if (!hasCode()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWatchFaceConfig() || getWatchFaceConfig().isInitialized()) {
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
                codedOutputStream.writeMessage(3, getWatchFaceConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEInstallResult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEInstallResult sEInstallResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEInstallResult);
        }

        public static SEInstallResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEInstallResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEInstallResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEInstallResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEInstallResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEInstallResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEInstallResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEInstallResult() {
            this.id_ = "";
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.code_ = 0;
        }

        public static SEInstallResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEInstallResult parseFrom(InputStream inputStream) {
            return (SEInstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEInstallResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEInstallResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEInstallResult parseFrom(CodedInputStream codedInputStream) {
            return (SEInstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEInstallResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEInstallResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEInstallResultOrBuilder extends MessageOrBuilder {
        SEInstallResult.SECode getCode();

        String getId();

        ByteString getIdBytes();

        SEWatchFaceConfig getWatchFaceConfig();

        SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder();

        boolean hasCode();

        boolean hasId();

        boolean hasWatchFaceConfig();
    }

    public enum SESettingResult implements ProtocolMessageEnum {
        SUCCESS(0),
        FAIL(1),
        USED_NOW(2);

        public static final int FAIL_VALUE = 1;
        public static final int SUCCESS_VALUE = 0;
        public static final int USED_NOW_VALUE = 2;
        private static final SESettingResult[] VALUES;
        private static final Internal.EnumLiteMap<SESettingResult> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SESettingResult$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SESettingResult> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SESettingResult findValueByNumber(int i7) {
                return SESettingResult.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESettingResult");
            internalValueMap = new Internal.EnumLiteMap<SESettingResult>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SESettingResult.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESettingResult findValueByNumber(int i7) {
                    return SESettingResult.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SESettingResult(int i7) {
            this.value = i7;
        }

        public static SESettingResult forNumber(int i7) {
            if (i7 == 0) {
                return SUCCESS;
            }
            if (i7 == 1) {
                return FAIL;
            }
            if (i7 != 2) {
                return null;
            }
            return USED_NOW;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return WatchFaceProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SESettingResult> internalGetValueMap() {
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
        public static SESettingResult valueOf(int i7) {
            return forNumber(i7);
        }

        public static SESettingResult valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEWatchFace extends GeneratedMessage implements SEWatchFaceOrBuilder {
        private static final SEWatchFace DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int INSTALL_RESULT_FIELD_NUMBER = 6;
        private static final Parser<SEWatchFace> PARSER;
        public static final int SETTING_RESULT_FIELD_NUMBER = 3;
        public static final int WATCHFACE_RESULT_INFO_FIELD_NUMBER = 5;
        public static final int WATCH_FACEPREPARE_INFO_FIELD_NUMBER = 4;
        public static final int WATCH_FACE_CONFIG_FIELD_NUMBER = 7;
        public static final int WATCH_FACE_LIST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFace$1 */
        public class AnonymousClass1 extends AbstractParser<SEWatchFace> {
            @Override // com.google.protobuf.Parser
            public SEWatchFace parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWatchFace.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWatchFaceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> installResultBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> watchFaceConfigBuilder_;
            private SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> watchFaceListBuilder_;
            private SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> watchFacePrepareInfoBuilder_;
            private SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> watchFaceResultInfoBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWatchFace sEWatchFace) {
            }

            private void buildPartialOneofs(SEWatchFace sEWatchFace) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder5;
                int i7 = this.payloadCase_;
                sEWatchFace.payloadCase_ = i7;
                sEWatchFace.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder5 = this.watchFaceListBuilder_) != null) {
                    sEWatchFace.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder4 = this.watchFacePrepareInfoBuilder_) != null) {
                    sEWatchFace.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder3 = this.watchFaceResultInfoBuilder_) != null) {
                    sEWatchFace.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder2 = this.installResultBuilder_) != null) {
                    sEWatchFace.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 7 || (singleFieldBuilder = this.watchFaceConfigBuilder_) == null) {
                    return;
                }
                sEWatchFace.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFace_descriptor;
            }

            private SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> internalGetInstallResultFieldBuilder() {
                if (this.installResultBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEInstallResult.getDefaultInstance();
                    }
                    this.installResultBuilder_ = new SingleFieldBuilder<>((SEInstallResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.installResultBuilder_;
            }

            private SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> internalGetWatchFaceConfigFieldBuilder() {
                if (this.watchFaceConfigBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEWatchFaceConfig.getDefaultInstance();
                    }
                    this.watchFaceConfigBuilder_ = new SingleFieldBuilder<>((SEWatchFaceConfig) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.watchFaceConfigBuilder_;
            }

            private SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> internalGetWatchFaceListFieldBuilder() {
                if (this.watchFaceListBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEWatchFaceItem.SEList.getDefaultInstance();
                    }
                    this.watchFaceListBuilder_ = new SingleFieldBuilder<>((SEWatchFaceItem.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.watchFaceListBuilder_;
            }

            private SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> internalGetWatchFacePrepareInfoFieldBuilder() {
                if (this.watchFacePrepareInfoBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SEWatchFacePrepareInfo.getDefaultInstance();
                    }
                    this.watchFacePrepareInfoBuilder_ = new SingleFieldBuilder<>((SEWatchFacePrepareInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.watchFacePrepareInfoBuilder_;
            }

            private SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> internalGetWatchFaceResultInfoFieldBuilder() {
                if (this.watchFaceResultInfoBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEWatchFaceResultInfo.getDefaultInstance();
                    }
                    this.watchFaceResultInfoBuilder_ = new SingleFieldBuilder<>((SEWatchFaceResultInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.watchFaceResultInfoBuilder_;
            }

            public Builder clearId() {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearInstallResult() {
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearSettingResult() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearWatchFaceConfig() {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
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

            public Builder clearWatchFaceList() {
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
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

            public Builder clearWatchFacePrepareInfo() {
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder = this.watchFacePrepareInfoBuilder_;
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

            public Builder clearWatchFaceResultInfo() {
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder = this.watchFaceResultInfoBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEWatchFace_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEInstallResult getInstallResult() {
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEInstallResult) this.payload_ : SEInstallResult.getDefaultInstance() : this.payloadCase_ == 6 ? (SEInstallResult) singleFieldBuilder.getMessage() : SEInstallResult.getDefaultInstance();
            }

            public SEInstallResult.Builder getInstallResultBuilder() {
                return (SEInstallResult.Builder) internalGetInstallResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEInstallResultOrBuilder getInstallResultOrBuilder() {
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.installResultBuilder_) == null) ? i7 == 6 ? (SEInstallResult) this.payload_ : SEInstallResult.getDefaultInstance() : (SEInstallResultOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SESettingResult getSettingResult() {
                SESettingResult sESettingResultForNumber;
                return (this.payloadCase_ != 3 || (sESettingResultForNumber = SESettingResult.forNumber(((Integer) this.payload_).intValue())) == null) ? SESettingResult.SUCCESS : sESettingResultForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFaceConfig getWatchFaceConfig() {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEWatchFaceConfig) this.payload_ : SEWatchFaceConfig.getDefaultInstance() : this.payloadCase_ == 7 ? (SEWatchFaceConfig) singleFieldBuilder.getMessage() : SEWatchFaceConfig.getDefaultInstance();
            }

            public SEWatchFaceConfig.Builder getWatchFaceConfigBuilder() {
                return (SEWatchFaceConfig.Builder) internalGetWatchFaceConfigFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder() {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.watchFaceConfigBuilder_) == null) ? i7 == 7 ? (SEWatchFaceConfig) this.payload_ : SEWatchFaceConfig.getDefaultInstance() : (SEWatchFaceConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFaceItem.SEList getWatchFaceList() {
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEWatchFaceItem.SEList) this.payload_ : SEWatchFaceItem.SEList.getDefaultInstance() : this.payloadCase_ == 1 ? (SEWatchFaceItem.SEList) singleFieldBuilder.getMessage() : SEWatchFaceItem.SEList.getDefaultInstance();
            }

            public SEWatchFaceItem.SEList.Builder getWatchFaceListBuilder() {
                return (SEWatchFaceItem.SEList.Builder) internalGetWatchFaceListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFaceItem.SEListOrBuilder getWatchFaceListOrBuilder() {
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.watchFaceListBuilder_) == null) ? i7 == 1 ? (SEWatchFaceItem.SEList) this.payload_ : SEWatchFaceItem.SEList.getDefaultInstance() : (SEWatchFaceItem.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFacePrepareInfo getWatchFacePrepareInfo() {
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder = this.watchFacePrepareInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SEWatchFacePrepareInfo) this.payload_ : SEWatchFacePrepareInfo.getDefaultInstance() : this.payloadCase_ == 4 ? (SEWatchFacePrepareInfo) singleFieldBuilder.getMessage() : SEWatchFacePrepareInfo.getDefaultInstance();
            }

            public SEWatchFacePrepareInfo.Builder getWatchFacePrepareInfoBuilder() {
                return (SEWatchFacePrepareInfo.Builder) internalGetWatchFacePrepareInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFacePrepareInfoOrBuilder getWatchFacePrepareInfoOrBuilder() {
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.watchFacePrepareInfoBuilder_) == null) ? i7 == 4 ? (SEWatchFacePrepareInfo) this.payload_ : SEWatchFacePrepareInfo.getDefaultInstance() : (SEWatchFacePrepareInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFaceResultInfo getWatchFaceResultInfo() {
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder = this.watchFaceResultInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEWatchFaceResultInfo) this.payload_ : SEWatchFaceResultInfo.getDefaultInstance() : this.payloadCase_ == 5 ? (SEWatchFaceResultInfo) singleFieldBuilder.getMessage() : SEWatchFaceResultInfo.getDefaultInstance();
            }

            public SEWatchFaceResultInfo.Builder getWatchFaceResultInfoBuilder() {
                return (SEWatchFaceResultInfo.Builder) internalGetWatchFaceResultInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public SEWatchFaceResultInfoOrBuilder getWatchFaceResultInfoOrBuilder() {
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.watchFaceResultInfoBuilder_) == null) ? i7 == 5 ? (SEWatchFaceResultInfo) this.payload_ : SEWatchFaceResultInfo.getDefaultInstance() : (SEWatchFaceResultInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public boolean hasId() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public boolean hasInstallResult() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public boolean hasSettingResult() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public boolean hasWatchFaceConfig() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public boolean hasWatchFaceList() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public boolean hasWatchFacePrepareInfo() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
            public boolean hasWatchFaceResultInfo() {
                return this.payloadCase_ == 5;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEWatchFace_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFace.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasWatchFaceList() && !getWatchFaceList().isInitialized()) {
                    return false;
                }
                if (hasWatchFacePrepareInfo() && !getWatchFacePrepareInfo().isInitialized()) {
                    return false;
                }
                if (hasWatchFaceResultInfo() && !getWatchFaceResultInfo().isInitialized()) {
                    return false;
                }
                if (!hasInstallResult() || getInstallResult().isInitialized()) {
                    return !hasWatchFaceConfig() || getWatchFaceConfig().isInitialized();
                }
                return false;
            }

            public Builder mergeInstallResult(SEInstallResult sEInstallResult) {
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEInstallResult.getDefaultInstance()) {
                        this.payload_ = sEInstallResult;
                    } else {
                        this.payload_ = SEInstallResult.newBuilder((SEInstallResult) this.payload_).mergeFrom(sEInstallResult).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEInstallResult);
                } else {
                    singleFieldBuilder.setMessage(sEInstallResult);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeWatchFaceConfig(SEWatchFaceConfig sEWatchFaceConfig) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEWatchFaceConfig.getDefaultInstance()) {
                        this.payload_ = sEWatchFaceConfig;
                    } else {
                        this.payload_ = SEWatchFaceConfig.newBuilder((SEWatchFaceConfig) this.payload_).mergeFrom(sEWatchFaceConfig).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceConfig);
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceConfig);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeWatchFaceList(SEWatchFaceItem.SEList sEList) {
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEWatchFaceItem.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWatchFaceItem.SEList.newBuilder((SEWatchFaceItem.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeWatchFacePrepareInfo(SEWatchFacePrepareInfo sEWatchFacePrepareInfo) {
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder = this.watchFacePrepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SEWatchFacePrepareInfo.getDefaultInstance()) {
                        this.payload_ = sEWatchFacePrepareInfo;
                    } else {
                        this.payload_ = SEWatchFacePrepareInfo.newBuilder((SEWatchFacePrepareInfo) this.payload_).mergeFrom(sEWatchFacePrepareInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEWatchFacePrepareInfo);
                } else {
                    singleFieldBuilder.setMessage(sEWatchFacePrepareInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeWatchFaceResultInfo(SEWatchFaceResultInfo sEWatchFaceResultInfo) {
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder = this.watchFaceResultInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEWatchFaceResultInfo.getDefaultInstance()) {
                        this.payload_ = sEWatchFaceResultInfo;
                    } else {
                        this.payload_ = SEWatchFaceResultInfo.newBuilder((SEWatchFaceResultInfo) this.payload_).mergeFrom(sEWatchFaceResultInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceResultInfo);
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceResultInfo);
                }
                this.payloadCase_ = 5;
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

            public Builder setInstallResult(SEInstallResult sEInstallResult) {
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    sEInstallResult.getClass();
                    this.payload_ = sEInstallResult;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEInstallResult);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setSettingResult(SESettingResult sESettingResult) {
                sESettingResult.getClass();
                this.payloadCase_ = 3;
                this.payload_ = Integer.valueOf(sESettingResult.getNumber());
                onChanged();
                return this;
            }

            public Builder setWatchFaceConfig(SEWatchFaceConfig sEWatchFaceConfig) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceConfig.getClass();
                    this.payload_ = sEWatchFaceConfig;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceConfig);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setWatchFaceList(SEWatchFaceItem.SEList sEList) {
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setWatchFacePrepareInfo(SEWatchFacePrepareInfo sEWatchFacePrepareInfo) {
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder = this.watchFacePrepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFacePrepareInfo.getClass();
                    this.payload_ = sEWatchFacePrepareInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEWatchFacePrepareInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setWatchFaceResultInfo(SEWatchFaceResultInfo sEWatchFaceResultInfo) {
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder = this.watchFaceResultInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceResultInfo.getClass();
                    this.payload_ = sEWatchFaceResultInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceResultInfo);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFace build() {
                SEWatchFace sEWatchFaceBuildPartial = buildPartial();
                if (sEWatchFaceBuildPartial.isInitialized()) {
                    return sEWatchFaceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWatchFaceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFace buildPartial() {
                SEWatchFace sEWatchFace = new SEWatchFace(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWatchFace);
                }
                buildPartialOneofs(sEWatchFace);
                onBuilt();
                return sEWatchFace;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWatchFace getDefaultInstanceForType() {
                return SEWatchFace.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder2 = this.watchFacePrepareInfoBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder3 = this.watchFaceResultInfoBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder4 = this.installResultBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder5 = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWatchFace) {
                    return mergeFrom((SEWatchFace) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setInstallResult(SEInstallResult.Builder builder) {
                SingleFieldBuilder<SEInstallResult, SEInstallResult.Builder, SEInstallResultOrBuilder> singleFieldBuilder = this.installResultBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setWatchFaceConfig(SEWatchFaceConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setWatchFaceList(SEWatchFaceItem.SEList.Builder builder) {
                SingleFieldBuilder<SEWatchFaceItem.SEList, SEWatchFaceItem.SEList.Builder, SEWatchFaceItem.SEListOrBuilder> singleFieldBuilder = this.watchFaceListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setWatchFacePrepareInfo(SEWatchFacePrepareInfo.Builder builder) {
                SingleFieldBuilder<SEWatchFacePrepareInfo, SEWatchFacePrepareInfo.Builder, SEWatchFacePrepareInfoOrBuilder> singleFieldBuilder = this.watchFacePrepareInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setWatchFaceResultInfo(SEWatchFaceResultInfo.Builder builder) {
                SingleFieldBuilder<SEWatchFaceResultInfo, SEWatchFaceResultInfo.Builder, SEWatchFaceResultInfoOrBuilder> singleFieldBuilder = this.watchFaceResultInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeFrom(SEWatchFace sEWatchFace) {
                if (sEWatchFace == SEWatchFace.getDefaultInstance()) {
                    return this;
                }
                switch (sEWatchFace.getPayloadCase()) {
                    case WATCH_FACE_LIST:
                        mergeWatchFaceList(sEWatchFace.getWatchFaceList());
                        break;
                    case ID:
                        this.payloadCase_ = 2;
                        this.payload_ = sEWatchFace.payload_;
                        onChanged();
                        break;
                    case SETTING_RESULT:
                        setSettingResult(sEWatchFace.getSettingResult());
                        break;
                    case WATCH_FACEPREPARE_INFO:
                        mergeWatchFacePrepareInfo(sEWatchFace.getWatchFacePrepareInfo());
                        break;
                    case WATCHFACE_RESULT_INFO:
                        mergeWatchFaceResultInfo(sEWatchFace.getWatchFaceResultInfo());
                        break;
                    case INSTALL_RESULT:
                        mergeInstallResult(sEWatchFace.getInstallResult());
                        break;
                    case WATCH_FACE_CONFIG:
                        mergeWatchFaceConfig(sEWatchFace.getWatchFaceConfig());
                        break;
                }
                mergeUnknownFields(sEWatchFace.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetWatchFaceListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.payloadCase_ = 2;
                                    this.payload_ = bytes;
                                } else if (tag == 24) {
                                    int i7 = codedInputStream.readEnum();
                                    if (SESettingResult.forNumber(i7) == null) {
                                        mergeUnknownVarintField(3, i7);
                                    } else {
                                        this.payloadCase_ = 3;
                                        this.payload_ = Integer.valueOf(i7);
                                    }
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetWatchFacePrepareInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetWatchFaceResultInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetInstallResultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                } else if (tag != 58) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetWatchFaceConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
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
            WATCH_FACE_LIST(1),
            ID(2),
            SETTING_RESULT(3),
            WATCH_FACEPREPARE_INFO(4),
            WATCHFACE_RESULT_INFO(5),
            INSTALL_RESULT(6),
            WATCH_FACE_CONFIG(7),
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
                        return SETTING_RESULT;
                    case 4:
                        return WATCH_FACEPREPARE_INFO;
                    case 5:
                        return WATCHFACE_RESULT_INFO;
                    case 6:
                        return INSTALL_RESULT;
                    case 7:
                        return WATCH_FACE_CONFIG;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWatchFace");
            DEFAULT_INSTANCE = new SEWatchFace();
            PARSER = new AbstractParser<SEWatchFace>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFace.1
                @Override // com.google.protobuf.Parser
                public SEWatchFace parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWatchFace.newBuilder();
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

        public /* synthetic */ SEWatchFace(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEWatchFace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEWatchFace_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWatchFace parseDelimitedFrom(InputStream inputStream) {
            return (SEWatchFace) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWatchFace parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWatchFace> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWatchFace)) {
                return super.equals(obj);
            }
            SEWatchFace sEWatchFace = (SEWatchFace) obj;
            if (!getPayloadCase().equals(sEWatchFace.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getWatchFaceList().equals(sEWatchFace.getWatchFaceList())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getId().equals(sEWatchFace.getId())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getSettingResult().equals(sEWatchFace.getSettingResult())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getWatchFacePrepareInfo().equals(sEWatchFace.getWatchFacePrepareInfo())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getWatchFaceResultInfo().equals(sEWatchFace.getWatchFaceResultInfo())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getInstallResult().equals(sEWatchFace.getInstallResult())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getWatchFaceConfig().equals(sEWatchFace.getWatchFaceConfig())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEWatchFace.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEWatchFace_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEInstallResult getInstallResult() {
            return this.payloadCase_ == 6 ? (SEInstallResult) this.payload_ : SEInstallResult.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEInstallResultOrBuilder getInstallResultOrBuilder() {
            return this.payloadCase_ == 6 ? (SEInstallResult) this.payload_ : SEInstallResult.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWatchFace> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEWatchFaceItem.SEList) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (SEWatchFacePrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SEWatchFaceResultInfo) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SEInstallResult) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (SEWatchFaceConfig) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SESettingResult getSettingResult() {
            SESettingResult sESettingResultForNumber;
            return (this.payloadCase_ != 3 || (sESettingResultForNumber = SESettingResult.forNumber(((Integer) this.payload_).intValue())) == null) ? SESettingResult.SUCCESS : sESettingResultForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFaceConfig getWatchFaceConfig() {
            return this.payloadCase_ == 7 ? (SEWatchFaceConfig) this.payload_ : SEWatchFaceConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder() {
            return this.payloadCase_ == 7 ? (SEWatchFaceConfig) this.payload_ : SEWatchFaceConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFaceItem.SEList getWatchFaceList() {
            return this.payloadCase_ == 1 ? (SEWatchFaceItem.SEList) this.payload_ : SEWatchFaceItem.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFaceItem.SEListOrBuilder getWatchFaceListOrBuilder() {
            return this.payloadCase_ == 1 ? (SEWatchFaceItem.SEList) this.payload_ : SEWatchFaceItem.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFacePrepareInfo getWatchFacePrepareInfo() {
            return this.payloadCase_ == 4 ? (SEWatchFacePrepareInfo) this.payload_ : SEWatchFacePrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFacePrepareInfoOrBuilder getWatchFacePrepareInfoOrBuilder() {
            return this.payloadCase_ == 4 ? (SEWatchFacePrepareInfo) this.payload_ : SEWatchFacePrepareInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFaceResultInfo getWatchFaceResultInfo() {
            return this.payloadCase_ == 5 ? (SEWatchFaceResultInfo) this.payload_ : SEWatchFaceResultInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public SEWatchFaceResultInfoOrBuilder getWatchFaceResultInfoOrBuilder() {
            return this.payloadCase_ == 5 ? (SEWatchFaceResultInfo) this.payload_ : SEWatchFaceResultInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public boolean hasId() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public boolean hasInstallResult() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public boolean hasSettingResult() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public boolean hasWatchFaceConfig() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public boolean hasWatchFaceList() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public boolean hasWatchFacePrepareInfo() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceOrBuilder
        public boolean hasWatchFaceResultInfo() {
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
                    iHashCode = getWatchFaceList().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getId().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getSettingResult().getNumber();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getWatchFacePrepareInfo().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getWatchFaceResultInfo().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getInstallResult().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getWatchFaceConfig().hashCode();
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
            return WatchFaceProtos.internal_static_SEWatchFace_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFace.class, Builder.class);
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
            if (hasWatchFacePrepareInfo() && !getWatchFacePrepareInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasWatchFaceResultInfo() && !getWatchFaceResultInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasInstallResult() && !getInstallResult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWatchFaceConfig() || getWatchFaceConfig().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEWatchFaceItem.SEList) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeEnum(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SEWatchFacePrepareInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEWatchFaceResultInfo) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEInstallResult) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEWatchFaceConfig) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWatchFace(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWatchFace sEWatchFace) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWatchFace);
        }

        public static SEWatchFace parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWatchFace parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFace) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFace parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWatchFace getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWatchFace parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEWatchFace() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEWatchFace parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWatchFace parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWatchFace parseFrom(InputStream inputStream) {
            return (SEWatchFace) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWatchFace parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFace) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFace parseFrom(CodedInputStream codedInputStream) {
            return (SEWatchFace) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWatchFace parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFace) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SEWatchFaceConfig extends GeneratedMessage implements SEWatchFaceConfigOrBuilder {
        public static final int BACKGROUND_FILE_CONFIG_LIST_FIELD_NUMBER = 5;
        public static final int COMPLEX_FUNCTIONS_CONFIG_LIST_FIELD_NUMBER = 3;
        public static final int COMPLEX_FUNCTIONS_FILE_CONFIG_LIST_FIELD_NUMBER = 4;
        private static final SEWatchFaceConfig DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NUMBER_FILE_CONFIG_LIST_FIELD_NUMBER = 8;
        private static final Parser<SEWatchFaceConfig> PARSER;
        public static final int POINT_FILE_CONFIG_LIST_FIELD_NUMBER = 7;
        public static final int RULE_COUNT_FIELD_NUMBER = 2;
        public static final int THUMBNAIL_FILE_CONFIG_LIST_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private SEWatchFaceFileConfig backgroundFileConfigList_;
        private int bitField0_;
        private SEComplexFunctionsConfig.SEList complexFunctionsConfigList_;
        private SEWatchFaceFileConfig complexFunctionsFileConfigList_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private SEWatchFaceFileConfig numberFileConfigList_;
        private SEWatchFaceFileConfig pointFileConfigList_;
        private int ruleCount_;
        private SEWatchFaceFileConfig thumbnailFileConfigList_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFaceConfig$1 */
        public class AnonymousClass1 extends AbstractParser<SEWatchFaceConfig> {
            @Override // com.google.protobuf.Parser
            public SEWatchFaceConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWatchFaceConfig.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWatchFaceConfigOrBuilder {
            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> backgroundFileConfigListBuilder_;
            private SEWatchFaceFileConfig backgroundFileConfigList_;
            private int bitField0_;
            private SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> complexFunctionsConfigListBuilder_;
            private SEComplexFunctionsConfig.SEList complexFunctionsConfigList_;
            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> complexFunctionsFileConfigListBuilder_;
            private SEWatchFaceFileConfig complexFunctionsFileConfigList_;
            private Object id_;
            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> numberFileConfigListBuilder_;
            private SEWatchFaceFileConfig numberFileConfigList_;
            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> pointFileConfigListBuilder_;
            private SEWatchFaceFileConfig pointFileConfigList_;
            private int ruleCount_;
            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> thumbnailFileConfigListBuilder_;
            private SEWatchFaceFileConfig thumbnailFileConfigList_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWatchFaceConfig sEWatchFaceConfig) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWatchFaceConfig.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWatchFaceConfig.ruleCount_ = this.ruleCount_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                    sEWatchFaceConfig.complexFunctionsConfigList_ = singleFieldBuilder == null ? this.complexFunctionsConfigList_ : (SEComplexFunctionsConfig.SEList) singleFieldBuilder.build();
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder2 = this.complexFunctionsFileConfigListBuilder_;
                    sEWatchFaceConfig.complexFunctionsFileConfigList_ = singleFieldBuilder2 == null ? this.complexFunctionsFileConfigList_ : (SEWatchFaceFileConfig) singleFieldBuilder2.build();
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder3 = this.backgroundFileConfigListBuilder_;
                    sEWatchFaceConfig.backgroundFileConfigList_ = singleFieldBuilder3 == null ? this.backgroundFileConfigList_ : (SEWatchFaceFileConfig) singleFieldBuilder3.build();
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder4 = this.thumbnailFileConfigListBuilder_;
                    sEWatchFaceConfig.thumbnailFileConfigList_ = singleFieldBuilder4 == null ? this.thumbnailFileConfigList_ : (SEWatchFaceFileConfig) singleFieldBuilder4.build();
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder5 = this.pointFileConfigListBuilder_;
                    sEWatchFaceConfig.pointFileConfigList_ = singleFieldBuilder5 == null ? this.pointFileConfigList_ : (SEWatchFaceFileConfig) singleFieldBuilder5.build();
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder6 = this.numberFileConfigListBuilder_;
                    sEWatchFaceConfig.numberFileConfigList_ = singleFieldBuilder6 == null ? this.numberFileConfigList_ : (SEWatchFaceFileConfig) singleFieldBuilder6.build();
                    i7 |= 128;
                }
                sEWatchFaceConfig.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFaceConfig_descriptor;
            }

            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> internalGetBackgroundFileConfigListFieldBuilder() {
                if (this.backgroundFileConfigListBuilder_ == null) {
                    this.backgroundFileConfigListBuilder_ = new SingleFieldBuilder<>(getBackgroundFileConfigList(), getParentForChildren(), isClean());
                    this.backgroundFileConfigList_ = null;
                }
                return this.backgroundFileConfigListBuilder_;
            }

            private SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> internalGetComplexFunctionsConfigListFieldBuilder() {
                if (this.complexFunctionsConfigListBuilder_ == null) {
                    this.complexFunctionsConfigListBuilder_ = new SingleFieldBuilder<>(getComplexFunctionsConfigList(), getParentForChildren(), isClean());
                    this.complexFunctionsConfigList_ = null;
                }
                return this.complexFunctionsConfigListBuilder_;
            }

            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> internalGetComplexFunctionsFileConfigListFieldBuilder() {
                if (this.complexFunctionsFileConfigListBuilder_ == null) {
                    this.complexFunctionsFileConfigListBuilder_ = new SingleFieldBuilder<>(getComplexFunctionsFileConfigList(), getParentForChildren(), isClean());
                    this.complexFunctionsFileConfigList_ = null;
                }
                return this.complexFunctionsFileConfigListBuilder_;
            }

            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> internalGetNumberFileConfigListFieldBuilder() {
                if (this.numberFileConfigListBuilder_ == null) {
                    this.numberFileConfigListBuilder_ = new SingleFieldBuilder<>(getNumberFileConfigList(), getParentForChildren(), isClean());
                    this.numberFileConfigList_ = null;
                }
                return this.numberFileConfigListBuilder_;
            }

            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> internalGetPointFileConfigListFieldBuilder() {
                if (this.pointFileConfigListBuilder_ == null) {
                    this.pointFileConfigListBuilder_ = new SingleFieldBuilder<>(getPointFileConfigList(), getParentForChildren(), isClean());
                    this.pointFileConfigList_ = null;
                }
                return this.pointFileConfigListBuilder_;
            }

            private SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> internalGetThumbnailFileConfigListFieldBuilder() {
                if (this.thumbnailFileConfigListBuilder_ == null) {
                    this.thumbnailFileConfigListBuilder_ = new SingleFieldBuilder<>(getThumbnailFileConfigList(), getParentForChildren(), isClean());
                    this.thumbnailFileConfigList_ = null;
                }
                return this.thumbnailFileConfigListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetComplexFunctionsConfigListFieldBuilder();
                    internalGetComplexFunctionsFileConfigListFieldBuilder();
                    internalGetBackgroundFileConfigListFieldBuilder();
                    internalGetThumbnailFileConfigListFieldBuilder();
                    internalGetPointFileConfigListFieldBuilder();
                    internalGetNumberFileConfigListFieldBuilder();
                }
            }

            public Builder clearBackgroundFileConfigList() {
                this.bitField0_ &= -17;
                this.backgroundFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.backgroundFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.backgroundFileConfigListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearComplexFunctionsConfigList() {
                this.bitField0_ &= -5;
                this.complexFunctionsConfigList_ = null;
                SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.complexFunctionsConfigListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearComplexFunctionsFileConfigList() {
                this.bitField0_ &= -9;
                this.complexFunctionsFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.complexFunctionsFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.complexFunctionsFileConfigListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = SEWatchFaceConfig.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearNumberFileConfigList() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.numberFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.numberFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.numberFileConfigListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPointFileConfigList() {
                this.bitField0_ &= -65;
                this.pointFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.pointFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.pointFileConfigListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRuleCount() {
                this.bitField0_ &= -3;
                this.ruleCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearThumbnailFileConfigList() {
                this.bitField0_ &= -33;
                this.thumbnailFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.thumbnailFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.thumbnailFileConfigListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfig getBackgroundFileConfigList() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.backgroundFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfig) singleFieldBuilder.getMessage();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.backgroundFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            public SEWatchFaceFileConfig.Builder getBackgroundFileConfigListBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SEWatchFaceFileConfig.Builder) internalGetBackgroundFileConfigListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfigOrBuilder getBackgroundFileConfigListOrBuilder() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.backgroundFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.backgroundFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEComplexFunctionsConfig.SEList getComplexFunctionsConfigList() {
                SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEComplexFunctionsConfig.SEList) singleFieldBuilder.getMessage();
                }
                SEComplexFunctionsConfig.SEList sEList = this.complexFunctionsConfigList_;
                return sEList == null ? SEComplexFunctionsConfig.SEList.getDefaultInstance() : sEList;
            }

            public SEComplexFunctionsConfig.SEList.Builder getComplexFunctionsConfigListBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SEComplexFunctionsConfig.SEList.Builder) internalGetComplexFunctionsConfigListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEComplexFunctionsConfig.SEListOrBuilder getComplexFunctionsConfigListOrBuilder() {
                SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEComplexFunctionsConfig.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEComplexFunctionsConfig.SEList sEList = this.complexFunctionsConfigList_;
                return sEList == null ? SEComplexFunctionsConfig.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfig getComplexFunctionsFileConfigList() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.complexFunctionsFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfig) singleFieldBuilder.getMessage();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.complexFunctionsFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            public SEWatchFaceFileConfig.Builder getComplexFunctionsFileConfigListBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SEWatchFaceFileConfig.Builder) internalGetComplexFunctionsFileConfigListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfigOrBuilder getComplexFunctionsFileConfigListOrBuilder() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.complexFunctionsFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.complexFunctionsFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEWatchFaceConfig_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfig getNumberFileConfigList() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.numberFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfig) singleFieldBuilder.getMessage();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.numberFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            public SEWatchFaceFileConfig.Builder getNumberFileConfigListBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SEWatchFaceFileConfig.Builder) internalGetNumberFileConfigListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfigOrBuilder getNumberFileConfigListOrBuilder() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.numberFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.numberFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfig getPointFileConfigList() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.pointFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfig) singleFieldBuilder.getMessage();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.pointFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            public SEWatchFaceFileConfig.Builder getPointFileConfigListBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SEWatchFaceFileConfig.Builder) internalGetPointFileConfigListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfigOrBuilder getPointFileConfigListOrBuilder() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.pointFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.pointFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public int getRuleCount() {
                return this.ruleCount_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfig getThumbnailFileConfigList() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.thumbnailFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfig) singleFieldBuilder.getMessage();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.thumbnailFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            public SEWatchFaceFileConfig.Builder getThumbnailFileConfigListBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (SEWatchFaceFileConfig.Builder) internalGetThumbnailFileConfigListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public SEWatchFaceFileConfigOrBuilder getThumbnailFileConfigListOrBuilder() {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.thumbnailFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceFileConfig sEWatchFaceFileConfig = this.thumbnailFileConfigList_;
                return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasBackgroundFileConfigList() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasComplexFunctionsConfigList() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasComplexFunctionsFileConfigList() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasNumberFileConfigList() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasPointFileConfigList() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasRuleCount() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
            public boolean hasThumbnailFileConfigList() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEWatchFaceConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                if (hasComplexFunctionsConfigList() && !getComplexFunctionsConfigList().isInitialized()) {
                    return false;
                }
                if (hasComplexFunctionsFileConfigList() && !getComplexFunctionsFileConfigList().isInitialized()) {
                    return false;
                }
                if (hasBackgroundFileConfigList() && !getBackgroundFileConfigList().isInitialized()) {
                    return false;
                }
                if (hasThumbnailFileConfigList() && !getThumbnailFileConfigList().isInitialized()) {
                    return false;
                }
                if (!hasPointFileConfigList() || getPointFileConfigList().isInitialized()) {
                    return !hasNumberFileConfigList() || getNumberFileConfigList().isInitialized();
                }
                return false;
            }

            public Builder mergeBackgroundFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SEWatchFaceFileConfig sEWatchFaceFileConfig2;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.backgroundFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceFileConfig);
                } else if ((this.bitField0_ & 16) == 0 || (sEWatchFaceFileConfig2 = this.backgroundFileConfigList_) == null || sEWatchFaceFileConfig2 == SEWatchFaceFileConfig.getDefaultInstance()) {
                    this.backgroundFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    getBackgroundFileConfigListBuilder().mergeFrom(sEWatchFaceFileConfig);
                }
                if (this.backgroundFileConfigList_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeComplexFunctionsConfigList(SEComplexFunctionsConfig.SEList sEList) {
                SEComplexFunctionsConfig.SEList sEList2;
                SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 4) == 0 || (sEList2 = this.complexFunctionsConfigList_) == null || sEList2 == SEComplexFunctionsConfig.SEList.getDefaultInstance()) {
                    this.complexFunctionsConfigList_ = sEList;
                } else {
                    getComplexFunctionsConfigListBuilder().mergeFrom(sEList);
                }
                if (this.complexFunctionsConfigList_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeComplexFunctionsFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SEWatchFaceFileConfig sEWatchFaceFileConfig2;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.complexFunctionsFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceFileConfig);
                } else if ((this.bitField0_ & 8) == 0 || (sEWatchFaceFileConfig2 = this.complexFunctionsFileConfigList_) == null || sEWatchFaceFileConfig2 == SEWatchFaceFileConfig.getDefaultInstance()) {
                    this.complexFunctionsFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    getComplexFunctionsFileConfigListBuilder().mergeFrom(sEWatchFaceFileConfig);
                }
                if (this.complexFunctionsFileConfigList_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeNumberFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SEWatchFaceFileConfig sEWatchFaceFileConfig2;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.numberFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceFileConfig);
                } else if ((this.bitField0_ & 128) == 0 || (sEWatchFaceFileConfig2 = this.numberFileConfigList_) == null || sEWatchFaceFileConfig2 == SEWatchFaceFileConfig.getDefaultInstance()) {
                    this.numberFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    getNumberFileConfigListBuilder().mergeFrom(sEWatchFaceFileConfig);
                }
                if (this.numberFileConfigList_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergePointFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SEWatchFaceFileConfig sEWatchFaceFileConfig2;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.pointFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceFileConfig);
                } else if ((this.bitField0_ & 64) == 0 || (sEWatchFaceFileConfig2 = this.pointFileConfigList_) == null || sEWatchFaceFileConfig2 == SEWatchFaceFileConfig.getDefaultInstance()) {
                    this.pointFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    getPointFileConfigListBuilder().mergeFrom(sEWatchFaceFileConfig);
                }
                if (this.pointFileConfigList_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeThumbnailFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SEWatchFaceFileConfig sEWatchFaceFileConfig2;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.thumbnailFileConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceFileConfig);
                } else if ((this.bitField0_ & 32) == 0 || (sEWatchFaceFileConfig2 = this.thumbnailFileConfigList_) == null || sEWatchFaceFileConfig2 == SEWatchFaceFileConfig.getDefaultInstance()) {
                    this.thumbnailFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    getThumbnailFileConfigListBuilder().mergeFrom(sEWatchFaceFileConfig);
                }
                if (this.thumbnailFileConfigList_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder setBackgroundFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.backgroundFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceFileConfig.getClass();
                    this.backgroundFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceFileConfig);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setComplexFunctionsConfigList(SEComplexFunctionsConfig.SEList sEList) {
                SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.complexFunctionsConfigList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setComplexFunctionsFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.complexFunctionsFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceFileConfig.getClass();
                    this.complexFunctionsFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceFileConfig);
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

            public Builder setNumberFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.numberFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceFileConfig.getClass();
                    this.numberFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceFileConfig);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setPointFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.pointFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceFileConfig.getClass();
                    this.pointFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceFileConfig);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRuleCount(int i7) {
                this.ruleCount_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setThumbnailFileConfigList(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.thumbnailFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceFileConfig.getClass();
                    this.thumbnailFileConfigList_ = sEWatchFaceFileConfig;
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceFileConfig);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceConfig build() {
                SEWatchFaceConfig sEWatchFaceConfigBuildPartial = buildPartial();
                if (sEWatchFaceConfigBuildPartial.isInitialized()) {
                    return sEWatchFaceConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWatchFaceConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceConfig buildPartial() {
                SEWatchFaceConfig sEWatchFaceConfig = new SEWatchFaceConfig(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWatchFaceConfig);
                }
                onBuilt();
                return sEWatchFaceConfig;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWatchFaceConfig getDefaultInstanceForType() {
                return SEWatchFaceConfig.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.ruleCount_ = 0;
                this.complexFunctionsConfigList_ = null;
                SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.complexFunctionsConfigListBuilder_ = null;
                }
                this.complexFunctionsFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder2 = this.complexFunctionsFileConfigListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.complexFunctionsFileConfigListBuilder_ = null;
                }
                this.backgroundFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder3 = this.backgroundFileConfigListBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.dispose();
                    this.backgroundFileConfigListBuilder_ = null;
                }
                this.thumbnailFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder4 = this.thumbnailFileConfigListBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.dispose();
                    this.thumbnailFileConfigListBuilder_ = null;
                }
                this.pointFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder5 = this.pointFileConfigListBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.dispose();
                    this.pointFileConfigListBuilder_ = null;
                }
                this.numberFileConfigList_ = null;
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder6 = this.numberFileConfigListBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.dispose();
                    this.numberFileConfigListBuilder_ = null;
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
                if (message instanceof SEWatchFaceConfig) {
                    return mergeFrom((SEWatchFaceConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBackgroundFileConfigList(SEWatchFaceFileConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.backgroundFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    this.backgroundFileConfigList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setComplexFunctionsConfigList(SEComplexFunctionsConfig.SEList.Builder builder) {
                SingleFieldBuilder<SEComplexFunctionsConfig.SEList, SEComplexFunctionsConfig.SEList.Builder, SEComplexFunctionsConfig.SEListOrBuilder> singleFieldBuilder = this.complexFunctionsConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    this.complexFunctionsConfigList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setComplexFunctionsFileConfigList(SEWatchFaceFileConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.complexFunctionsFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    this.complexFunctionsFileConfigList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNumberFileConfigList(SEWatchFaceFileConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.numberFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    this.numberFileConfigList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setPointFileConfigList(SEWatchFaceFileConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.pointFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    this.pointFileConfigList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setThumbnailFileConfigList(SEWatchFaceFileConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceFileConfig, SEWatchFaceFileConfig.Builder, SEWatchFaceFileConfigOrBuilder> singleFieldBuilder = this.thumbnailFileConfigListBuilder_;
                if (singleFieldBuilder == null) {
                    this.thumbnailFileConfigList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEWatchFaceConfig sEWatchFaceConfig) {
                if (sEWatchFaceConfig == SEWatchFaceConfig.getDefaultInstance()) {
                    return this;
                }
                if (sEWatchFaceConfig.hasId()) {
                    this.id_ = sEWatchFaceConfig.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEWatchFaceConfig.hasRuleCount()) {
                    setRuleCount(sEWatchFaceConfig.getRuleCount());
                }
                if (sEWatchFaceConfig.hasComplexFunctionsConfigList()) {
                    mergeComplexFunctionsConfigList(sEWatchFaceConfig.getComplexFunctionsConfigList());
                }
                if (sEWatchFaceConfig.hasComplexFunctionsFileConfigList()) {
                    mergeComplexFunctionsFileConfigList(sEWatchFaceConfig.getComplexFunctionsFileConfigList());
                }
                if (sEWatchFaceConfig.hasBackgroundFileConfigList()) {
                    mergeBackgroundFileConfigList(sEWatchFaceConfig.getBackgroundFileConfigList());
                }
                if (sEWatchFaceConfig.hasThumbnailFileConfigList()) {
                    mergeThumbnailFileConfigList(sEWatchFaceConfig.getThumbnailFileConfigList());
                }
                if (sEWatchFaceConfig.hasPointFileConfigList()) {
                    mergePointFileConfigList(sEWatchFaceConfig.getPointFileConfigList());
                }
                if (sEWatchFaceConfig.hasNumberFileConfigList()) {
                    mergeNumberFileConfigList(sEWatchFaceConfig.getNumberFileConfigList());
                }
                mergeUnknownFields(sEWatchFaceConfig.getUnknownFields());
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
                                    this.ruleCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetComplexFunctionsConfigListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetComplexFunctionsFileConfigListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetBackgroundFileConfigListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetThumbnailFileConfigListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(internalGetPointFileConfigListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag != 66) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetNumberFileConfigListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWatchFaceConfig");
            DEFAULT_INSTANCE = new SEWatchFaceConfig();
            PARSER = new AbstractParser<SEWatchFaceConfig>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfig.1
                @Override // com.google.protobuf.Parser
                public SEWatchFaceConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWatchFaceConfig.newBuilder();
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

        public /* synthetic */ SEWatchFaceConfig(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEWatchFaceConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEWatchFaceConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWatchFaceConfig parseDelimitedFrom(InputStream inputStream) {
            return (SEWatchFaceConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWatchFaceConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWatchFaceConfig)) {
                return super.equals(obj);
            }
            SEWatchFaceConfig sEWatchFaceConfig = (SEWatchFaceConfig) obj;
            if (hasId() != sEWatchFaceConfig.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sEWatchFaceConfig.getId())) || hasRuleCount() != sEWatchFaceConfig.hasRuleCount()) {
                return false;
            }
            if ((hasRuleCount() && getRuleCount() != sEWatchFaceConfig.getRuleCount()) || hasComplexFunctionsConfigList() != sEWatchFaceConfig.hasComplexFunctionsConfigList()) {
                return false;
            }
            if ((hasComplexFunctionsConfigList() && !getComplexFunctionsConfigList().equals(sEWatchFaceConfig.getComplexFunctionsConfigList())) || hasComplexFunctionsFileConfigList() != sEWatchFaceConfig.hasComplexFunctionsFileConfigList()) {
                return false;
            }
            if ((hasComplexFunctionsFileConfigList() && !getComplexFunctionsFileConfigList().equals(sEWatchFaceConfig.getComplexFunctionsFileConfigList())) || hasBackgroundFileConfigList() != sEWatchFaceConfig.hasBackgroundFileConfigList()) {
                return false;
            }
            if ((hasBackgroundFileConfigList() && !getBackgroundFileConfigList().equals(sEWatchFaceConfig.getBackgroundFileConfigList())) || hasThumbnailFileConfigList() != sEWatchFaceConfig.hasThumbnailFileConfigList()) {
                return false;
            }
            if ((hasThumbnailFileConfigList() && !getThumbnailFileConfigList().equals(sEWatchFaceConfig.getThumbnailFileConfigList())) || hasPointFileConfigList() != sEWatchFaceConfig.hasPointFileConfigList()) {
                return false;
            }
            if ((!hasPointFileConfigList() || getPointFileConfigList().equals(sEWatchFaceConfig.getPointFileConfigList())) && hasNumberFileConfigList() == sEWatchFaceConfig.hasNumberFileConfigList()) {
                return (!hasNumberFileConfigList() || getNumberFileConfigList().equals(sEWatchFaceConfig.getNumberFileConfigList())) && getUnknownFields().equals(sEWatchFaceConfig.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfig getBackgroundFileConfigList() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.backgroundFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfigOrBuilder getBackgroundFileConfigListOrBuilder() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.backgroundFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEComplexFunctionsConfig.SEList getComplexFunctionsConfigList() {
            SEComplexFunctionsConfig.SEList sEList = this.complexFunctionsConfigList_;
            return sEList == null ? SEComplexFunctionsConfig.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEComplexFunctionsConfig.SEListOrBuilder getComplexFunctionsConfigListOrBuilder() {
            SEComplexFunctionsConfig.SEList sEList = this.complexFunctionsConfigList_;
            return sEList == null ? SEComplexFunctionsConfig.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfig getComplexFunctionsFileConfigList() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.complexFunctionsFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfigOrBuilder getComplexFunctionsFileConfigListOrBuilder() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.complexFunctionsFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEWatchFaceConfig_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfig getNumberFileConfigList() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.numberFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfigOrBuilder getNumberFileConfigListOrBuilder() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.numberFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWatchFaceConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfig getPointFileConfigList() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.pointFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfigOrBuilder getPointFileConfigListOrBuilder() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.pointFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public int getRuleCount() {
            return this.ruleCount_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.ruleCount_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, getComplexFunctionsConfigList());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, getComplexFunctionsFileConfigList());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, getBackgroundFileConfigList());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, getThumbnailFileConfigList());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(7, getPointFileConfigList());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(8, getNumberFileConfigList());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfig getThumbnailFileConfigList() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.thumbnailFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public SEWatchFaceFileConfigOrBuilder getThumbnailFileConfigListOrBuilder() {
            SEWatchFaceFileConfig sEWatchFaceFileConfig = this.thumbnailFileConfigList_;
            return sEWatchFaceFileConfig == null ? SEWatchFaceFileConfig.getDefaultInstance() : sEWatchFaceFileConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasBackgroundFileConfigList() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasComplexFunctionsConfigList() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasComplexFunctionsFileConfigList() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasNumberFileConfigList() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasPointFileConfigList() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasRuleCount() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceConfigOrBuilder
        public boolean hasThumbnailFileConfigList() {
            return (this.bitField0_ & 32) != 0;
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
            if (hasRuleCount()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRuleCount();
            }
            if (hasComplexFunctionsConfigList()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getComplexFunctionsConfigList().hashCode();
            }
            if (hasComplexFunctionsFileConfigList()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getComplexFunctionsFileConfigList().hashCode();
            }
            if (hasBackgroundFileConfigList()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getBackgroundFileConfigList().hashCode();
            }
            if (hasThumbnailFileConfigList()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getThumbnailFileConfigList().hashCode();
            }
            if (hasPointFileConfigList()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getPointFileConfigList().hashCode();
            }
            if (hasNumberFileConfigList()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getNumberFileConfigList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEWatchFaceConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceConfig.class, Builder.class);
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
            if (hasComplexFunctionsConfigList() && !getComplexFunctionsConfigList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasComplexFunctionsFileConfigList() && !getComplexFunctionsFileConfigList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBackgroundFileConfigList() && !getBackgroundFileConfigList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasThumbnailFileConfigList() && !getThumbnailFileConfigList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPointFileConfigList() && !getPointFileConfigList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasNumberFileConfigList() || getNumberFileConfigList().isInitialized()) {
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
                codedOutputStream.writeUInt32(2, this.ruleCount_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getComplexFunctionsConfigList());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getComplexFunctionsFileConfigList());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getBackgroundFileConfigList());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getThumbnailFileConfigList());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getPointFileConfigList());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getNumberFileConfigList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWatchFaceConfig(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.ruleCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWatchFaceConfig sEWatchFaceConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWatchFaceConfig);
        }

        public static SEWatchFaceConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWatchFaceConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWatchFaceConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWatchFaceConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWatchFaceConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEWatchFaceConfig() {
            this.id_ = "";
            this.ruleCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static SEWatchFaceConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWatchFaceConfig parseFrom(InputStream inputStream) {
            return (SEWatchFaceConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceConfig parseFrom(CodedInputStream codedInputStream) {
            return (SEWatchFaceConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWatchFaceConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWatchFaceConfigOrBuilder extends MessageOrBuilder {
        SEWatchFaceFileConfig getBackgroundFileConfigList();

        SEWatchFaceFileConfigOrBuilder getBackgroundFileConfigListOrBuilder();

        SEComplexFunctionsConfig.SEList getComplexFunctionsConfigList();

        SEComplexFunctionsConfig.SEListOrBuilder getComplexFunctionsConfigListOrBuilder();

        SEWatchFaceFileConfig getComplexFunctionsFileConfigList();

        SEWatchFaceFileConfigOrBuilder getComplexFunctionsFileConfigListOrBuilder();

        String getId();

        ByteString getIdBytes();

        SEWatchFaceFileConfig getNumberFileConfigList();

        SEWatchFaceFileConfigOrBuilder getNumberFileConfigListOrBuilder();

        SEWatchFaceFileConfig getPointFileConfigList();

        SEWatchFaceFileConfigOrBuilder getPointFileConfigListOrBuilder();

        int getRuleCount();

        SEWatchFaceFileConfig getThumbnailFileConfigList();

        SEWatchFaceFileConfigOrBuilder getThumbnailFileConfigListOrBuilder();

        boolean hasBackgroundFileConfigList();

        boolean hasComplexFunctionsConfigList();

        boolean hasComplexFunctionsFileConfigList();

        boolean hasId();

        boolean hasNumberFileConfigList();

        boolean hasPointFileConfigList();

        boolean hasRuleCount();

        boolean hasThumbnailFileConfigList();
    }

    public static final class SEWatchFaceFileConfig extends GeneratedMessage implements SEWatchFaceFileConfigOrBuilder {
        private static final SEWatchFaceFileConfig DEFAULT_INSTANCE;
        public static final int NOW_USED_FILE_NUMBER_FIELD_NUMBER = 2;
        private static final Parser<SEWatchFaceFileConfig> PARSER;
        public static final int WATCH_FACE_FILE_LIST_FIELD_NUMBER = 3;
        public static final int WATCH_FACE_NUMBER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int nowUsedFileNumber_;
        private SEWatchFaceFileList.SEList watchFaceFileList_;
        private int watchFaceNumber_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFaceFileConfig$1 */
        public class AnonymousClass1 extends AbstractParser<SEWatchFaceFileConfig> {
            @Override // com.google.protobuf.Parser
            public SEWatchFaceFileConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWatchFaceFileConfig.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWatchFaceFileConfigOrBuilder {
            private int bitField0_;
            private int nowUsedFileNumber_;
            private SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> watchFaceFileListBuilder_;
            private SEWatchFaceFileList.SEList watchFaceFileList_;
            private int watchFaceNumber_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWatchFaceFileConfig.watchFaceNumber_ = this.watchFaceNumber_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWatchFaceFileConfig.nowUsedFileNumber_ = this.nowUsedFileNumber_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                    sEWatchFaceFileConfig.watchFaceFileList_ = singleFieldBuilder == null ? this.watchFaceFileList_ : (SEWatchFaceFileList.SEList) singleFieldBuilder.build();
                    i7 |= 4;
                }
                sEWatchFaceFileConfig.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFaceFileConfig_descriptor;
            }

            private SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> internalGetWatchFaceFileListFieldBuilder() {
                if (this.watchFaceFileListBuilder_ == null) {
                    this.watchFaceFileListBuilder_ = new SingleFieldBuilder<>(getWatchFaceFileList(), getParentForChildren(), isClean());
                    this.watchFaceFileList_ = null;
                }
                return this.watchFaceFileListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetWatchFaceFileListFieldBuilder();
                }
            }

            public Builder clearNowUsedFileNumber() {
                this.bitField0_ &= -3;
                this.nowUsedFileNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWatchFaceFileList() {
                this.bitField0_ &= -5;
                this.watchFaceFileList_ = null;
                SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.watchFaceFileListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWatchFaceNumber() {
                this.bitField0_ &= -2;
                this.watchFaceNumber_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEWatchFaceFileConfig_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
            public int getNowUsedFileNumber() {
                return this.nowUsedFileNumber_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
            public SEWatchFaceFileList.SEList getWatchFaceFileList() {
                SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileList.SEList) singleFieldBuilder.getMessage();
                }
                SEWatchFaceFileList.SEList sEList = this.watchFaceFileList_;
                return sEList == null ? SEWatchFaceFileList.SEList.getDefaultInstance() : sEList;
            }

            public SEWatchFaceFileList.SEList.Builder getWatchFaceFileListBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SEWatchFaceFileList.SEList.Builder) internalGetWatchFaceFileListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
            public SEWatchFaceFileList.SEListOrBuilder getWatchFaceFileListOrBuilder() {
                SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceFileList.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceFileList.SEList sEList = this.watchFaceFileList_;
                return sEList == null ? SEWatchFaceFileList.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
            public int getWatchFaceNumber() {
                return this.watchFaceNumber_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
            public boolean hasNowUsedFileNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
            public boolean hasWatchFaceFileList() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
            public boolean hasWatchFaceNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEWatchFaceFileConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceFileConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasWatchFaceNumber()) {
                    return !hasWatchFaceFileList() || getWatchFaceFileList().isInitialized();
                }
                return false;
            }

            public Builder mergeWatchFaceFileList(SEWatchFaceFileList.SEList sEList) {
                SEWatchFaceFileList.SEList sEList2;
                SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 4) == 0 || (sEList2 = this.watchFaceFileList_) == null || sEList2 == SEWatchFaceFileList.SEList.getDefaultInstance()) {
                    this.watchFaceFileList_ = sEList;
                } else {
                    getWatchFaceFileListBuilder().mergeFrom(sEList);
                }
                if (this.watchFaceFileList_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setNowUsedFileNumber(int i7) {
                this.nowUsedFileNumber_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWatchFaceFileList(SEWatchFaceFileList.SEList sEList) {
                SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.watchFaceFileList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWatchFaceNumber(int i7) {
                this.watchFaceNumber_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceFileConfig build() {
                SEWatchFaceFileConfig sEWatchFaceFileConfigBuildPartial = buildPartial();
                if (sEWatchFaceFileConfigBuildPartial.isInitialized()) {
                    return sEWatchFaceFileConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWatchFaceFileConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceFileConfig buildPartial() {
                SEWatchFaceFileConfig sEWatchFaceFileConfig = new SEWatchFaceFileConfig(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWatchFaceFileConfig);
                }
                onBuilt();
                return sEWatchFaceFileConfig;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWatchFaceFileConfig getDefaultInstanceForType() {
                return SEWatchFaceFileConfig.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.watchFaceNumber_ = 0;
                this.nowUsedFileNumber_ = 0;
                this.watchFaceFileList_ = null;
                SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.watchFaceFileListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWatchFaceFileConfig) {
                    return mergeFrom((SEWatchFaceFileConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setWatchFaceFileList(SEWatchFaceFileList.SEList.Builder builder) {
                SingleFieldBuilder<SEWatchFaceFileList.SEList, SEWatchFaceFileList.SEList.Builder, SEWatchFaceFileList.SEListOrBuilder> singleFieldBuilder = this.watchFaceFileListBuilder_;
                if (singleFieldBuilder == null) {
                    this.watchFaceFileList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
                if (sEWatchFaceFileConfig == SEWatchFaceFileConfig.getDefaultInstance()) {
                    return this;
                }
                if (sEWatchFaceFileConfig.hasWatchFaceNumber()) {
                    setWatchFaceNumber(sEWatchFaceFileConfig.getWatchFaceNumber());
                }
                if (sEWatchFaceFileConfig.hasNowUsedFileNumber()) {
                    setNowUsedFileNumber(sEWatchFaceFileConfig.getNowUsedFileNumber());
                }
                if (sEWatchFaceFileConfig.hasWatchFaceFileList()) {
                    mergeWatchFaceFileList(sEWatchFaceFileConfig.getWatchFaceFileList());
                }
                mergeUnknownFields(sEWatchFaceFileConfig.getUnknownFields());
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
                                    this.watchFaceNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.nowUsedFileNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetWatchFaceFileListFieldBuilder().getBuilder(), extensionRegistryLite);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWatchFaceFileConfig");
            DEFAULT_INSTANCE = new SEWatchFaceFileConfig();
            PARSER = new AbstractParser<SEWatchFaceFileConfig>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfig.1
                @Override // com.google.protobuf.Parser
                public SEWatchFaceFileConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWatchFaceFileConfig.newBuilder();
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

        public /* synthetic */ SEWatchFaceFileConfig(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEWatchFaceFileConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEWatchFaceFileConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWatchFaceFileConfig parseDelimitedFrom(InputStream inputStream) {
            return (SEWatchFaceFileConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceFileConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWatchFaceFileConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWatchFaceFileConfig)) {
                return super.equals(obj);
            }
            SEWatchFaceFileConfig sEWatchFaceFileConfig = (SEWatchFaceFileConfig) obj;
            if (hasWatchFaceNumber() != sEWatchFaceFileConfig.hasWatchFaceNumber()) {
                return false;
            }
            if ((hasWatchFaceNumber() && getWatchFaceNumber() != sEWatchFaceFileConfig.getWatchFaceNumber()) || hasNowUsedFileNumber() != sEWatchFaceFileConfig.hasNowUsedFileNumber()) {
                return false;
            }
            if ((!hasNowUsedFileNumber() || getNowUsedFileNumber() == sEWatchFaceFileConfig.getNowUsedFileNumber()) && hasWatchFaceFileList() == sEWatchFaceFileConfig.hasWatchFaceFileList()) {
                return (!hasWatchFaceFileList() || getWatchFaceFileList().equals(sEWatchFaceFileConfig.getWatchFaceFileList())) && getUnknownFields().equals(sEWatchFaceFileConfig.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEWatchFaceFileConfig_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
        public int getNowUsedFileNumber() {
            return this.nowUsedFileNumber_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWatchFaceFileConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.watchFaceNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.nowUsedFileNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getWatchFaceFileList());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
        public SEWatchFaceFileList.SEList getWatchFaceFileList() {
            SEWatchFaceFileList.SEList sEList = this.watchFaceFileList_;
            return sEList == null ? SEWatchFaceFileList.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
        public SEWatchFaceFileList.SEListOrBuilder getWatchFaceFileListOrBuilder() {
            SEWatchFaceFileList.SEList sEList = this.watchFaceFileList_;
            return sEList == null ? SEWatchFaceFileList.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
        public int getWatchFaceNumber() {
            return this.watchFaceNumber_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
        public boolean hasNowUsedFileNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
        public boolean hasWatchFaceFileList() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileConfigOrBuilder
        public boolean hasWatchFaceNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasWatchFaceNumber()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getWatchFaceNumber();
            }
            if (hasNowUsedFileNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getNowUsedFileNumber();
            }
            if (hasWatchFaceFileList()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getWatchFaceFileList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEWatchFaceFileConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceFileConfig.class, Builder.class);
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
            if (!hasWatchFaceNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWatchFaceFileList() || getWatchFaceFileList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.watchFaceNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.nowUsedFileNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getWatchFaceFileList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWatchFaceFileConfig(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.watchFaceNumber_ = 0;
            this.nowUsedFileNumber_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWatchFaceFileConfig sEWatchFaceFileConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWatchFaceFileConfig);
        }

        public static SEWatchFaceFileConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWatchFaceFileConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceFileConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceFileConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWatchFaceFileConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWatchFaceFileConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWatchFaceFileConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEWatchFaceFileConfig() {
            this.watchFaceNumber_ = 0;
            this.nowUsedFileNumber_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEWatchFaceFileConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWatchFaceFileConfig parseFrom(InputStream inputStream) {
            return (SEWatchFaceFileConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceFileConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceFileConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceFileConfig parseFrom(CodedInputStream codedInputStream) {
            return (SEWatchFaceFileConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWatchFaceFileConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceFileConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWatchFaceFileConfigOrBuilder extends MessageOrBuilder {
        int getNowUsedFileNumber();

        SEWatchFaceFileList.SEList getWatchFaceFileList();

        SEWatchFaceFileList.SEListOrBuilder getWatchFaceFileListOrBuilder();

        int getWatchFaceNumber();

        boolean hasNowUsedFileNumber();

        boolean hasWatchFaceFileList();

        boolean hasWatchFaceNumber();
    }

    public static final class SEWatchFaceFileList extends GeneratedMessage implements SEWatchFaceFileListOrBuilder {
        public static final int BACKGROUND_COLOR_HEX_FIELD_NUMBER = 8;
        private static final SEWatchFaceFileList DEFAULT_INSTANCE;
        public static final int DIAL_FILE_MD5_FIELD_NUMBER = 4;
        public static final int FILE_MD5_FIELD_NUMBER = 3;
        public static final int FILE_NUMBER_FIELD_NUMBER = 2;
        public static final int FILE_SIZE_FIELD_NUMBER = 1;
        public static final int NUMBER_COLOR_HEX_FIELD_NUMBER = 7;
        public static final int NUMBER_POSITION_FILE_MD5_FIELD_NUMBER = 6;
        public static final int NUMBER_TYPE_FILE_MD5_FIELD_NUMBER = 5;
        private static final Parser<SEWatchFaceFileList> PARSER;
        private static final long serialVersionUID = 0;
        private int backgroundColorHex_;
        private int bitField0_;
        private volatile Object dialFileMd5_;
        private volatile Object fileMd5_;
        private int fileNumber_;
        private int fileSize_;
        private byte memoizedIsInitialized;
        private int numberColorHex_;
        private volatile Object numberPositionFileMd5_;
        private volatile Object numberTypeFileMd5_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFaceFileList$1 */
        public class AnonymousClass1 extends AbstractParser<SEWatchFaceFileList> {
            @Override // com.google.protobuf.Parser
            public SEWatchFaceFileList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWatchFaceFileList.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWatchFaceFileListOrBuilder {
            private int backgroundColorHex_;
            private int bitField0_;
            private Object dialFileMd5_;
            private Object fileMd5_;
            private int fileNumber_;
            private int fileSize_;
            private int numberColorHex_;
            private Object numberPositionFileMd5_;
            private Object numberTypeFileMd5_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWatchFaceFileList sEWatchFaceFileList) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWatchFaceFileList.fileSize_ = this.fileSize_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWatchFaceFileList.fileNumber_ = this.fileNumber_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWatchFaceFileList.fileMd5_ = this.fileMd5_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEWatchFaceFileList.dialFileMd5_ = this.dialFileMd5_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEWatchFaceFileList.numberTypeFileMd5_ = this.numberTypeFileMd5_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEWatchFaceFileList.numberPositionFileMd5_ = this.numberPositionFileMd5_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEWatchFaceFileList.numberColorHex_ = this.numberColorHex_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEWatchFaceFileList.backgroundColorHex_ = this.backgroundColorHex_;
                    i7 |= 128;
                }
                sEWatchFaceFileList.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFaceFileList_descriptor;
            }

            public Builder clearBackgroundColorHex() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.backgroundColorHex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDialFileMd5() {
                this.dialFileMd5_ = SEWatchFaceFileList.getDefaultInstance().getDialFileMd5();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearFileMd5() {
                this.fileMd5_ = SEWatchFaceFileList.getDefaultInstance().getFileMd5();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearFileNumber() {
                this.bitField0_ &= -3;
                this.fileNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFileSize() {
                this.bitField0_ &= -2;
                this.fileSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNumberColorHex() {
                this.bitField0_ &= -65;
                this.numberColorHex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNumberPositionFileMd5() {
                this.numberPositionFileMd5_ = SEWatchFaceFileList.getDefaultInstance().getNumberPositionFileMd5();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearNumberTypeFileMd5() {
                this.numberTypeFileMd5_ = SEWatchFaceFileList.getDefaultInstance().getNumberTypeFileMd5();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public int getBackgroundColorHex() {
                return this.backgroundColorHex_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEWatchFaceFileList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public String getDialFileMd5() {
                Object obj = this.dialFileMd5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.dialFileMd5_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public ByteString getDialFileMd5Bytes() {
                Object obj = this.dialFileMd5_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.dialFileMd5_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public String getFileMd5() {
                Object obj = this.fileMd5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fileMd5_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public ByteString getFileMd5Bytes() {
                Object obj = this.fileMd5_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileMd5_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public int getFileNumber() {
                return this.fileNumber_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public int getFileSize() {
                return this.fileSize_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public int getNumberColorHex() {
                return this.numberColorHex_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public String getNumberPositionFileMd5() {
                Object obj = this.numberPositionFileMd5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.numberPositionFileMd5_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public ByteString getNumberPositionFileMd5Bytes() {
                Object obj = this.numberPositionFileMd5_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.numberPositionFileMd5_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public String getNumberTypeFileMd5() {
                Object obj = this.numberTypeFileMd5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.numberTypeFileMd5_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public ByteString getNumberTypeFileMd5Bytes() {
                Object obj = this.numberTypeFileMd5_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.numberTypeFileMd5_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasBackgroundColorHex() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasDialFileMd5() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasFileMd5() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasFileNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasFileSize() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasNumberColorHex() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasNumberPositionFileMd5() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
            public boolean hasNumberTypeFileMd5() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEWatchFaceFileList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceFileList.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFileSize() && hasFileNumber() && hasFileMd5();
            }

            public Builder setBackgroundColorHex(int i7) {
                this.backgroundColorHex_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setDialFileMd5(String str) {
                str.getClass();
                this.dialFileMd5_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDialFileMd5Bytes(ByteString byteString) {
                byteString.getClass();
                this.dialFileMd5_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFileMd5(String str) {
                str.getClass();
                this.fileMd5_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFileMd5Bytes(ByteString byteString) {
                byteString.getClass();
                this.fileMd5_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFileNumber(int i7) {
                this.fileNumber_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFileSize(int i7) {
                this.fileSize_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setNumberColorHex(int i7) {
                this.numberColorHex_ = i7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setNumberPositionFileMd5(String str) {
                str.getClass();
                this.numberPositionFileMd5_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setNumberPositionFileMd5Bytes(ByteString byteString) {
                byteString.getClass();
                this.numberPositionFileMd5_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setNumberTypeFileMd5(String str) {
                str.getClass();
                this.numberTypeFileMd5_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setNumberTypeFileMd5Bytes(ByteString byteString) {
                byteString.getClass();
                this.numberTypeFileMd5_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                this.fileMd5_ = "";
                this.dialFileMd5_ = "";
                this.numberTypeFileMd5_ = "";
                this.numberPositionFileMd5_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceFileList build() {
                SEWatchFaceFileList sEWatchFaceFileListBuildPartial = buildPartial();
                if (sEWatchFaceFileListBuildPartial.isInitialized()) {
                    return sEWatchFaceFileListBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWatchFaceFileListBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceFileList buildPartial() {
                SEWatchFaceFileList sEWatchFaceFileList = new SEWatchFaceFileList(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWatchFaceFileList);
                }
                onBuilt();
                return sEWatchFaceFileList;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWatchFaceFileList getDefaultInstanceForType() {
                return SEWatchFaceFileList.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.fileSize_ = 0;
                this.fileNumber_ = 0;
                this.fileMd5_ = "";
                this.dialFileMd5_ = "";
                this.numberTypeFileMd5_ = "";
                this.numberPositionFileMd5_ = "";
                this.numberColorHex_ = 0;
                this.backgroundColorHex_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWatchFaceFileList) {
                    return mergeFrom((SEWatchFaceFileList) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.fileMd5_ = "";
                this.dialFileMd5_ = "";
                this.numberTypeFileMd5_ = "";
                this.numberPositionFileMd5_ = "";
            }

            public Builder mergeFrom(SEWatchFaceFileList sEWatchFaceFileList) {
                if (sEWatchFaceFileList == SEWatchFaceFileList.getDefaultInstance()) {
                    return this;
                }
                if (sEWatchFaceFileList.hasFileSize()) {
                    setFileSize(sEWatchFaceFileList.getFileSize());
                }
                if (sEWatchFaceFileList.hasFileNumber()) {
                    setFileNumber(sEWatchFaceFileList.getFileNumber());
                }
                if (sEWatchFaceFileList.hasFileMd5()) {
                    this.fileMd5_ = sEWatchFaceFileList.fileMd5_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEWatchFaceFileList.hasDialFileMd5()) {
                    this.dialFileMd5_ = sEWatchFaceFileList.dialFileMd5_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEWatchFaceFileList.hasNumberTypeFileMd5()) {
                    this.numberTypeFileMd5_ = sEWatchFaceFileList.numberTypeFileMd5_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (sEWatchFaceFileList.hasNumberPositionFileMd5()) {
                    this.numberPositionFileMd5_ = sEWatchFaceFileList.numberPositionFileMd5_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (sEWatchFaceFileList.hasNumberColorHex()) {
                    setNumberColorHex(sEWatchFaceFileList.getNumberColorHex());
                }
                if (sEWatchFaceFileList.hasBackgroundColorHex()) {
                    setBackgroundColorHex(sEWatchFaceFileList.getBackgroundColorHex());
                }
                mergeUnknownFields(sEWatchFaceFileList.getUnknownFields());
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
                                    this.fileSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.fileNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.fileMd5_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.dialFileMd5_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.numberTypeFileMd5_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.numberPositionFileMd5_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.numberColorHex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag != 64) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.backgroundColorHex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
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
            private List<SEWatchFaceFileList> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFaceFileList$SEList$1 */
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
                private RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> listBuilder_;
                private List<SEWatchFaceFileList> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEWatchFaceFileList_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEWatchFaceFileList> iterable) {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEWatchFaceFileList sEWatchFaceFileList) {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEWatchFaceFileList);
                        return this;
                    }
                    sEWatchFaceFileList.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEWatchFaceFileList);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEWatchFaceFileList.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEWatchFaceFileList_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
                public SEWatchFaceFileList getList(int i7) {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWatchFaceFileList) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
                public List<SEWatchFaceFileList> getListList() {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
                public SEWatchFaceFileListOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWatchFaceFileListOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
                public List<? extends SEWatchFaceFileListOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WatchFaceProtos.internal_static_SEWatchFaceFileList_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEWatchFaceFileList sEWatchFaceFileList) {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEWatchFaceFileList);
                        return this;
                    }
                    sEWatchFaceFileList.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEWatchFaceFileList);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(p pVar) {
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEWatchFaceFileList.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEWatchFaceFileList sEWatchFaceFileList) {
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEWatchFaceFileList.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEWatchFaceFileList);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEWatchFaceFileList);
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
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEWatchFaceFileList sEWatchFaceFileList = (SEWatchFaceFileList) codedInputStream.readMessage(SEWatchFaceFileList.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEWatchFaceFileList, Builder, SEWatchFaceFileListOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEWatchFaceFileList);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEWatchFaceFileList);
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
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, p pVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFaceFileList_SEList_descriptor;
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
                return WatchFaceProtos.internal_static_SEWatchFaceFileList_SEList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
            public SEWatchFaceFileList getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
            public List<SEWatchFaceFileList> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
            public SEWatchFaceFileListOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.SEListOrBuilder
            public List<? extends SEWatchFaceFileListOrBuilder> getListOrBuilderList() {
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
                return WatchFaceProtos.internal_static_SEWatchFaceFileList_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
            SEWatchFaceFileList getList(int i7);

            int getListCount();

            List<SEWatchFaceFileList> getListList();

            SEWatchFaceFileListOrBuilder getListOrBuilder(int i7);

            List<? extends SEWatchFaceFileListOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWatchFaceFileList");
            DEFAULT_INSTANCE = new SEWatchFaceFileList();
            PARSER = new AbstractParser<SEWatchFaceFileList>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileList.1
                @Override // com.google.protobuf.Parser
                public SEWatchFaceFileList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWatchFaceFileList.newBuilder();
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

        public /* synthetic */ SEWatchFaceFileList(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEWatchFaceFileList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEWatchFaceFileList_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWatchFaceFileList parseDelimitedFrom(InputStream inputStream) {
            return (SEWatchFaceFileList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceFileList parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWatchFaceFileList> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWatchFaceFileList)) {
                return super.equals(obj);
            }
            SEWatchFaceFileList sEWatchFaceFileList = (SEWatchFaceFileList) obj;
            if (hasFileSize() != sEWatchFaceFileList.hasFileSize()) {
                return false;
            }
            if ((hasFileSize() && getFileSize() != sEWatchFaceFileList.getFileSize()) || hasFileNumber() != sEWatchFaceFileList.hasFileNumber()) {
                return false;
            }
            if ((hasFileNumber() && getFileNumber() != sEWatchFaceFileList.getFileNumber()) || hasFileMd5() != sEWatchFaceFileList.hasFileMd5()) {
                return false;
            }
            if ((hasFileMd5() && !getFileMd5().equals(sEWatchFaceFileList.getFileMd5())) || hasDialFileMd5() != sEWatchFaceFileList.hasDialFileMd5()) {
                return false;
            }
            if ((hasDialFileMd5() && !getDialFileMd5().equals(sEWatchFaceFileList.getDialFileMd5())) || hasNumberTypeFileMd5() != sEWatchFaceFileList.hasNumberTypeFileMd5()) {
                return false;
            }
            if ((hasNumberTypeFileMd5() && !getNumberTypeFileMd5().equals(sEWatchFaceFileList.getNumberTypeFileMd5())) || hasNumberPositionFileMd5() != sEWatchFaceFileList.hasNumberPositionFileMd5()) {
                return false;
            }
            if ((hasNumberPositionFileMd5() && !getNumberPositionFileMd5().equals(sEWatchFaceFileList.getNumberPositionFileMd5())) || hasNumberColorHex() != sEWatchFaceFileList.hasNumberColorHex()) {
                return false;
            }
            if ((!hasNumberColorHex() || getNumberColorHex() == sEWatchFaceFileList.getNumberColorHex()) && hasBackgroundColorHex() == sEWatchFaceFileList.hasBackgroundColorHex()) {
                return (!hasBackgroundColorHex() || getBackgroundColorHex() == sEWatchFaceFileList.getBackgroundColorHex()) && getUnknownFields().equals(sEWatchFaceFileList.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public int getBackgroundColorHex() {
            return this.backgroundColorHex_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEWatchFaceFileList_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public String getDialFileMd5() {
            Object obj = this.dialFileMd5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.dialFileMd5_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public ByteString getDialFileMd5Bytes() {
            Object obj = this.dialFileMd5_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dialFileMd5_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public String getFileMd5() {
            Object obj = this.fileMd5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fileMd5_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public ByteString getFileMd5Bytes() {
            Object obj = this.fileMd5_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileMd5_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public int getFileNumber() {
            return this.fileNumber_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public int getFileSize() {
            return this.fileSize_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public int getNumberColorHex() {
            return this.numberColorHex_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public String getNumberPositionFileMd5() {
            Object obj = this.numberPositionFileMd5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.numberPositionFileMd5_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public ByteString getNumberPositionFileMd5Bytes() {
            Object obj = this.numberPositionFileMd5_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.numberPositionFileMd5_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public String getNumberTypeFileMd5() {
            Object obj = this.numberTypeFileMd5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.numberTypeFileMd5_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public ByteString getNumberTypeFileMd5Bytes() {
            Object obj = this.numberTypeFileMd5_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.numberTypeFileMd5_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWatchFaceFileList> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.fileSize_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.fileNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(3, this.fileMd5_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(4, this.dialFileMd5_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(5, this.numberTypeFileMd5_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(6, this.numberPositionFileMd5_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.numberColorHex_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.backgroundColorHex_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasBackgroundColorHex() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasDialFileMd5() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasFileMd5() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasFileNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasFileSize() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasNumberColorHex() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasNumberPositionFileMd5() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceFileListOrBuilder
        public boolean hasNumberTypeFileMd5() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasFileSize()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFileSize();
            }
            if (hasFileNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getFileNumber();
            }
            if (hasFileMd5()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getFileMd5().hashCode();
            }
            if (hasDialFileMd5()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDialFileMd5().hashCode();
            }
            if (hasNumberTypeFileMd5()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getNumberTypeFileMd5().hashCode();
            }
            if (hasNumberPositionFileMd5()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getNumberPositionFileMd5().hashCode();
            }
            if (hasNumberColorHex()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getNumberColorHex();
            }
            if (hasBackgroundColorHex()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getBackgroundColorHex();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEWatchFaceFileList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceFileList.class, Builder.class);
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
            if (!hasFileSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFileNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFileMd5()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.fileSize_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.fileNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.fileMd5_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.dialFileMd5_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.numberTypeFileMd5_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.numberPositionFileMd5_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.numberColorHex_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.backgroundColorHex_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWatchFaceFileList(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.fileSize_ = 0;
            this.fileNumber_ = 0;
            this.fileMd5_ = "";
            this.dialFileMd5_ = "";
            this.numberTypeFileMd5_ = "";
            this.numberPositionFileMd5_ = "";
            this.numberColorHex_ = 0;
            this.backgroundColorHex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWatchFaceFileList sEWatchFaceFileList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWatchFaceFileList);
        }

        public static SEWatchFaceFileList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWatchFaceFileList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceFileList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceFileList parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWatchFaceFileList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWatchFaceFileList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWatchFaceFileList parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWatchFaceFileList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWatchFaceFileList parseFrom(InputStream inputStream) {
            return (SEWatchFaceFileList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceFileList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceFileList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceFileList parseFrom(CodedInputStream codedInputStream) {
            return (SEWatchFaceFileList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private SEWatchFaceFileList() {
            this.fileSize_ = 0;
            this.fileNumber_ = 0;
            this.fileMd5_ = "";
            this.dialFileMd5_ = "";
            this.numberTypeFileMd5_ = "";
            this.numberPositionFileMd5_ = "";
            this.numberColorHex_ = 0;
            this.backgroundColorHex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.fileMd5_ = "";
            this.dialFileMd5_ = "";
            this.numberTypeFileMd5_ = "";
            this.numberPositionFileMd5_ = "";
        }

        public static SEWatchFaceFileList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceFileList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWatchFaceFileListOrBuilder extends MessageOrBuilder {
        int getBackgroundColorHex();

        String getDialFileMd5();

        ByteString getDialFileMd5Bytes();

        String getFileMd5();

        ByteString getFileMd5Bytes();

        int getFileNumber();

        int getFileSize();

        int getNumberColorHex();

        String getNumberPositionFileMd5();

        ByteString getNumberPositionFileMd5Bytes();

        String getNumberTypeFileMd5();

        ByteString getNumberTypeFileMd5Bytes();

        boolean hasBackgroundColorHex();

        boolean hasDialFileMd5();

        boolean hasFileMd5();

        boolean hasFileNumber();

        boolean hasFileSize();

        boolean hasNumberColorHex();

        boolean hasNumberPositionFileMd5();

        boolean hasNumberTypeFileMd5();
    }

    public static final class SEWatchFaceItem extends GeneratedMessage implements SEWatchFaceItemOrBuilder {
        private static final SEWatchFaceItem DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IS_CURRENT_FIELD_NUMBER = 2;
        public static final int IS_REMOVE_FIELD_NUMBER = 3;
        private static final Parser<SEWatchFaceItem> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private boolean isCurrent_;
        private boolean isRemove_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFaceItem$1 */
        public class AnonymousClass1 extends AbstractParser<SEWatchFaceItem> {
            @Override // com.google.protobuf.Parser
            public SEWatchFaceItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWatchFaceItem.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWatchFaceItemOrBuilder {
            private int bitField0_;
            private Object id_;
            private boolean isCurrent_;
            private boolean isRemove_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWatchFaceItem sEWatchFaceItem) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWatchFaceItem.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWatchFaceItem.isCurrent_ = this.isCurrent_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWatchFaceItem.isRemove_ = this.isRemove_;
                    i7 |= 4;
                }
                sEWatchFaceItem.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFaceItem_descriptor;
            }

            public Builder clearId() {
                this.id_ = SEWatchFaceItem.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearIsCurrent() {
                this.bitField0_ &= -3;
                this.isCurrent_ = false;
                onChanged();
                return this;
            }

            public Builder clearIsRemove() {
                this.bitField0_ &= -5;
                this.isRemove_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEWatchFaceItem_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
            public boolean getIsCurrent() {
                return this.isCurrent_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
            public boolean getIsRemove() {
                return this.isRemove_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
            public boolean hasIsCurrent() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
            public boolean hasIsRemove() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEWatchFaceItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasIsCurrent();
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

            public Builder setIsCurrent(boolean z6) {
                this.isCurrent_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIsRemove(boolean z6) {
                this.isRemove_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                this.id_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceItem build() {
                SEWatchFaceItem sEWatchFaceItemBuildPartial = buildPartial();
                if (sEWatchFaceItemBuildPartial.isInitialized()) {
                    return sEWatchFaceItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWatchFaceItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceItem buildPartial() {
                SEWatchFaceItem sEWatchFaceItem = new SEWatchFaceItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWatchFaceItem);
                }
                onBuilt();
                return sEWatchFaceItem;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWatchFaceItem getDefaultInstanceForType() {
                return SEWatchFaceItem.getDefaultInstance();
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
                this.isCurrent_ = false;
                this.isRemove_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWatchFaceItem) {
                    return mergeFrom((SEWatchFaceItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEWatchFaceItem sEWatchFaceItem) {
                if (sEWatchFaceItem == SEWatchFaceItem.getDefaultInstance()) {
                    return this;
                }
                if (sEWatchFaceItem.hasId()) {
                    this.id_ = sEWatchFaceItem.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEWatchFaceItem.hasIsCurrent()) {
                    setIsCurrent(sEWatchFaceItem.getIsCurrent());
                }
                if (sEWatchFaceItem.hasIsRemove()) {
                    setIsRemove(sEWatchFaceItem.getIsRemove());
                }
                mergeUnknownFields(sEWatchFaceItem.getUnknownFields());
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
                                    this.isCurrent_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.isRemove_ = codedInputStream.readBool();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEWatchFaceItem> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFaceItem$SEList$1 */
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
                private RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> listBuilder_;
                private List<SEWatchFaceItem> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEWatchFaceItem_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEWatchFaceItem> iterable) {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEWatchFaceItem sEWatchFaceItem) {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEWatchFaceItem);
                        return this;
                    }
                    sEWatchFaceItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEWatchFaceItem);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEWatchFaceItem.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return WatchFaceProtos.internal_static_SEWatchFaceItem_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
                public SEWatchFaceItem getList(int i7) {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWatchFaceItem) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
                public List<SEWatchFaceItem> getListList() {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
                public SEWatchFaceItemOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWatchFaceItemOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
                public List<? extends SEWatchFaceItemOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WatchFaceProtos.internal_static_SEWatchFaceItem_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEWatchFaceItem sEWatchFaceItem) {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEWatchFaceItem);
                        return this;
                    }
                    sEWatchFaceItem.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEWatchFaceItem);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(p pVar) {
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEWatchFaceItem.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEWatchFaceItem sEWatchFaceItem) {
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEWatchFaceItem.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEWatchFaceItem);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEWatchFaceItem);
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
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEWatchFaceItem sEWatchFaceItem = (SEWatchFaceItem) codedInputStream.readMessage(SEWatchFaceItem.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEWatchFaceItem, Builder, SEWatchFaceItemOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEWatchFaceItem);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEWatchFaceItem);
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
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, p pVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFaceItem_SEList_descriptor;
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
                return WatchFaceProtos.internal_static_SEWatchFaceItem_SEList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
            public SEWatchFaceItem getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
            public List<SEWatchFaceItem> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
            public SEWatchFaceItemOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.SEListOrBuilder
            public List<? extends SEWatchFaceItemOrBuilder> getListOrBuilderList() {
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
                return WatchFaceProtos.internal_static_SEWatchFaceItem_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
            SEWatchFaceItem getList(int i7);

            int getListCount();

            List<SEWatchFaceItem> getListList();

            SEWatchFaceItemOrBuilder getListOrBuilder(int i7);

            List<? extends SEWatchFaceItemOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWatchFaceItem");
            DEFAULT_INSTANCE = new SEWatchFaceItem();
            PARSER = new AbstractParser<SEWatchFaceItem>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItem.1
                @Override // com.google.protobuf.Parser
                public SEWatchFaceItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWatchFaceItem.newBuilder();
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

        public /* synthetic */ SEWatchFaceItem(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEWatchFaceItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEWatchFaceItem_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWatchFaceItem parseDelimitedFrom(InputStream inputStream) {
            return (SEWatchFaceItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWatchFaceItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWatchFaceItem)) {
                return super.equals(obj);
            }
            SEWatchFaceItem sEWatchFaceItem = (SEWatchFaceItem) obj;
            if (hasId() != sEWatchFaceItem.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sEWatchFaceItem.getId())) || hasIsCurrent() != sEWatchFaceItem.hasIsCurrent()) {
                return false;
            }
            if ((!hasIsCurrent() || getIsCurrent() == sEWatchFaceItem.getIsCurrent()) && hasIsRemove() == sEWatchFaceItem.hasIsRemove()) {
                return (!hasIsRemove() || getIsRemove() == sEWatchFaceItem.getIsRemove()) && getUnknownFields().equals(sEWatchFaceItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEWatchFaceItem_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
        public boolean getIsCurrent() {
            return this.isCurrent_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
        public boolean getIsRemove() {
            return this.isRemove_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWatchFaceItem> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeBoolSize(2, this.isCurrent_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.isRemove_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
        public boolean hasIsCurrent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceItemOrBuilder
        public boolean hasIsRemove() {
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
            if (hasIsCurrent()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsCurrent());
            }
            if (hasIsRemove()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getIsRemove());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEWatchFaceItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceItem.class, Builder.class);
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
            if (hasIsCurrent()) {
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
                codedOutputStream.writeBool(2, this.isCurrent_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.isRemove_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWatchFaceItem(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.isCurrent_ = false;
            this.isRemove_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWatchFaceItem sEWatchFaceItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWatchFaceItem);
        }

        public static SEWatchFaceItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWatchFaceItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWatchFaceItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWatchFaceItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWatchFaceItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWatchFaceItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEWatchFaceItem() {
            this.id_ = "";
            this.isCurrent_ = false;
            this.isRemove_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static SEWatchFaceItem parseFrom(InputStream inputStream) {
            return (SEWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceItem parseFrom(CodedInputStream codedInputStream) {
            return (SEWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWatchFaceItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWatchFaceItemOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        boolean getIsCurrent();

        boolean getIsRemove();

        boolean hasId();

        boolean hasIsCurrent();

        boolean hasIsRemove();
    }

    public interface SEWatchFaceOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        SEInstallResult getInstallResult();

        SEInstallResultOrBuilder getInstallResultOrBuilder();

        SEWatchFace.PayloadCase getPayloadCase();

        SESettingResult getSettingResult();

        SEWatchFaceConfig getWatchFaceConfig();

        SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder();

        SEWatchFaceItem.SEList getWatchFaceList();

        SEWatchFaceItem.SEListOrBuilder getWatchFaceListOrBuilder();

        SEWatchFacePrepareInfo getWatchFacePrepareInfo();

        SEWatchFacePrepareInfoOrBuilder getWatchFacePrepareInfoOrBuilder();

        SEWatchFaceResultInfo getWatchFaceResultInfo();

        SEWatchFaceResultInfoOrBuilder getWatchFaceResultInfoOrBuilder();

        boolean hasId();

        boolean hasInstallResult();

        boolean hasSettingResult();

        boolean hasWatchFaceConfig();

        boolean hasWatchFaceList();

        boolean hasWatchFacePrepareInfo();

        boolean hasWatchFaceResultInfo();
    }

    public static final class SEWatchFacePrepareInfo extends GeneratedMessage implements SEWatchFacePrepareInfoOrBuilder {
        private static final SEWatchFacePrepareInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IS_REPLACEABLE_FIELD_NUMBER = 4;
        private static final Parser<SEWatchFacePrepareInfo> PARSER;
        public static final int TARGET_FILE_SIZE_FIELD_NUMBER = 2;
        public static final int TRANSFER_FILE_SIZE_FIELD_NUMBER = 3;
        public static final int WATCH_FACE_CONFIG_FIELD_NUMBER = 5;
        public static final int WATCH_FACE_FILE_CONFIG_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private boolean isReplaceable_;
        private byte memoizedIsInitialized;
        private int targetFileSize_;
        private int transferFileSize_;
        private SEWatchFaceConfig watchFaceConfig_;
        private int watchFaceFileConfig_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFacePrepareInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEWatchFacePrepareInfo> {
            @Override // com.google.protobuf.Parser
            public SEWatchFacePrepareInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWatchFacePrepareInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWatchFacePrepareInfoOrBuilder {
            private int bitField0_;
            private Object id_;
            private boolean isReplaceable_;
            private int targetFileSize_;
            private int transferFileSize_;
            private SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> watchFaceConfigBuilder_;
            private SEWatchFaceConfig watchFaceConfig_;
            private int watchFaceFileConfig_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWatchFacePrepareInfo sEWatchFacePrepareInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWatchFacePrepareInfo.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWatchFacePrepareInfo.targetFileSize_ = this.targetFileSize_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWatchFacePrepareInfo.transferFileSize_ = this.transferFileSize_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEWatchFacePrepareInfo.isReplaceable_ = this.isReplaceable_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                    sEWatchFacePrepareInfo.watchFaceConfig_ = singleFieldBuilder == null ? this.watchFaceConfig_ : (SEWatchFaceConfig) singleFieldBuilder.build();
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEWatchFacePrepareInfo.watchFaceFileConfig_ = this.watchFaceFileConfig_;
                    i7 |= 32;
                }
                sEWatchFacePrepareInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFacePrepareInfo_descriptor;
            }

            private SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> internalGetWatchFaceConfigFieldBuilder() {
                if (this.watchFaceConfigBuilder_ == null) {
                    this.watchFaceConfigBuilder_ = new SingleFieldBuilder<>(getWatchFaceConfig(), getParentForChildren(), isClean());
                    this.watchFaceConfig_ = null;
                }
                return this.watchFaceConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetWatchFaceConfigFieldBuilder();
                }
            }

            public Builder clearId() {
                this.id_ = SEWatchFacePrepareInfo.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearIsReplaceable() {
                this.bitField0_ &= -9;
                this.isReplaceable_ = false;
                onChanged();
                return this;
            }

            public Builder clearTargetFileSize() {
                this.bitField0_ &= -3;
                this.targetFileSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTransferFileSize() {
                this.bitField0_ &= -5;
                this.transferFileSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWatchFaceConfig() {
                this.bitField0_ &= -17;
                this.watchFaceConfig_ = null;
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.watchFaceConfigBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWatchFaceFileConfig() {
                this.bitField0_ &= -33;
                this.watchFaceFileConfig_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEWatchFacePrepareInfo_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public boolean getIsReplaceable() {
                return this.isReplaceable_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public int getTargetFileSize() {
                return this.targetFileSize_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public int getTransferFileSize() {
                return this.transferFileSize_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public SEWatchFaceConfig getWatchFaceConfig() {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceConfig) singleFieldBuilder.getMessage();
                }
                SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
                return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
            }

            public SEWatchFaceConfig.Builder getWatchFaceConfigBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SEWatchFaceConfig.Builder) internalGetWatchFaceConfigFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder() {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEWatchFaceConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
                return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public int getWatchFaceFileConfig() {
                return this.watchFaceFileConfig_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public boolean hasIsReplaceable() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public boolean hasTargetFileSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public boolean hasTransferFileSize() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public boolean hasWatchFaceConfig() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
            public boolean hasWatchFaceFileConfig() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEWatchFacePrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFacePrepareInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasId() && hasTargetFileSize() && hasTransferFileSize()) {
                    return !hasWatchFaceConfig() || getWatchFaceConfig().isInitialized();
                }
                return false;
            }

            public Builder mergeWatchFaceConfig(SEWatchFaceConfig sEWatchFaceConfig) {
                SEWatchFaceConfig sEWatchFaceConfig2;
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEWatchFaceConfig);
                } else if ((this.bitField0_ & 16) == 0 || (sEWatchFaceConfig2 = this.watchFaceConfig_) == null || sEWatchFaceConfig2 == SEWatchFaceConfig.getDefaultInstance()) {
                    this.watchFaceConfig_ = sEWatchFaceConfig;
                } else {
                    getWatchFaceConfigBuilder().mergeFrom(sEWatchFaceConfig);
                }
                if (this.watchFaceConfig_ != null) {
                    this.bitField0_ |= 16;
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

            public Builder setIsReplaceable(boolean z6) {
                this.isReplaceable_ = z6;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTargetFileSize(int i7) {
                this.targetFileSize_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTransferFileSize(int i7) {
                this.transferFileSize_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWatchFaceConfig(SEWatchFaceConfig sEWatchFaceConfig) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFaceConfig.getClass();
                    this.watchFaceConfig_ = sEWatchFaceConfig;
                } else {
                    singleFieldBuilder.setMessage(sEWatchFaceConfig);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setWatchFaceFileConfig(int i7) {
                this.watchFaceFileConfig_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFacePrepareInfo build() {
                SEWatchFacePrepareInfo sEWatchFacePrepareInfoBuildPartial = buildPartial();
                if (sEWatchFacePrepareInfoBuildPartial.isInitialized()) {
                    return sEWatchFacePrepareInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWatchFacePrepareInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFacePrepareInfo buildPartial() {
                SEWatchFacePrepareInfo sEWatchFacePrepareInfo = new SEWatchFacePrepareInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWatchFacePrepareInfo);
                }
                onBuilt();
                return sEWatchFacePrepareInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWatchFacePrepareInfo getDefaultInstanceForType() {
                return SEWatchFacePrepareInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.targetFileSize_ = 0;
                this.transferFileSize_ = 0;
                this.isReplaceable_ = false;
                this.watchFaceConfig_ = null;
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.watchFaceConfigBuilder_ = null;
                }
                this.watchFaceFileConfig_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWatchFacePrepareInfo) {
                    return mergeFrom((SEWatchFacePrepareInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setWatchFaceConfig(SEWatchFaceConfig.Builder builder) {
                SingleFieldBuilder<SEWatchFaceConfig, SEWatchFaceConfig.Builder, SEWatchFaceConfigOrBuilder> singleFieldBuilder = this.watchFaceConfigBuilder_;
                if (singleFieldBuilder == null) {
                    this.watchFaceConfig_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEWatchFacePrepareInfo sEWatchFacePrepareInfo) {
                if (sEWatchFacePrepareInfo == SEWatchFacePrepareInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEWatchFacePrepareInfo.hasId()) {
                    this.id_ = sEWatchFacePrepareInfo.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEWatchFacePrepareInfo.hasTargetFileSize()) {
                    setTargetFileSize(sEWatchFacePrepareInfo.getTargetFileSize());
                }
                if (sEWatchFacePrepareInfo.hasTransferFileSize()) {
                    setTransferFileSize(sEWatchFacePrepareInfo.getTransferFileSize());
                }
                if (sEWatchFacePrepareInfo.hasIsReplaceable()) {
                    setIsReplaceable(sEWatchFacePrepareInfo.getIsReplaceable());
                }
                if (sEWatchFacePrepareInfo.hasWatchFaceConfig()) {
                    mergeWatchFaceConfig(sEWatchFacePrepareInfo.getWatchFaceConfig());
                }
                if (sEWatchFacePrepareInfo.hasWatchFaceFileConfig()) {
                    setWatchFaceFileConfig(sEWatchFacePrepareInfo.getWatchFaceFileConfig());
                }
                mergeUnknownFields(sEWatchFacePrepareInfo.getUnknownFields());
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
                                    this.targetFileSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.transferFileSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.isReplaceable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetWatchFaceConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.watchFaceFileConfig_ = codedInputStream.readUInt32();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWatchFacePrepareInfo");
            DEFAULT_INSTANCE = new SEWatchFacePrepareInfo();
            PARSER = new AbstractParser<SEWatchFacePrepareInfo>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfo.1
                @Override // com.google.protobuf.Parser
                public SEWatchFacePrepareInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWatchFacePrepareInfo.newBuilder();
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

        public /* synthetic */ SEWatchFacePrepareInfo(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEWatchFacePrepareInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEWatchFacePrepareInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWatchFacePrepareInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEWatchFacePrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWatchFacePrepareInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWatchFacePrepareInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWatchFacePrepareInfo)) {
                return super.equals(obj);
            }
            SEWatchFacePrepareInfo sEWatchFacePrepareInfo = (SEWatchFacePrepareInfo) obj;
            if (hasId() != sEWatchFacePrepareInfo.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(sEWatchFacePrepareInfo.getId())) || hasTargetFileSize() != sEWatchFacePrepareInfo.hasTargetFileSize()) {
                return false;
            }
            if ((hasTargetFileSize() && getTargetFileSize() != sEWatchFacePrepareInfo.getTargetFileSize()) || hasTransferFileSize() != sEWatchFacePrepareInfo.hasTransferFileSize()) {
                return false;
            }
            if ((hasTransferFileSize() && getTransferFileSize() != sEWatchFacePrepareInfo.getTransferFileSize()) || hasIsReplaceable() != sEWatchFacePrepareInfo.hasIsReplaceable()) {
                return false;
            }
            if ((hasIsReplaceable() && getIsReplaceable() != sEWatchFacePrepareInfo.getIsReplaceable()) || hasWatchFaceConfig() != sEWatchFacePrepareInfo.hasWatchFaceConfig()) {
                return false;
            }
            if ((!hasWatchFaceConfig() || getWatchFaceConfig().equals(sEWatchFacePrepareInfo.getWatchFaceConfig())) && hasWatchFaceFileConfig() == sEWatchFacePrepareInfo.hasWatchFaceFileConfig()) {
                return (!hasWatchFaceFileConfig() || getWatchFaceFileConfig() == sEWatchFacePrepareInfo.getWatchFaceFileConfig()) && getUnknownFields().equals(sEWatchFacePrepareInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEWatchFacePrepareInfo_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public boolean getIsReplaceable() {
            return this.isReplaceable_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWatchFacePrepareInfo> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.targetFileSize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.transferFileSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(4, this.isReplaceable_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, getWatchFaceConfig());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(6, this.watchFaceFileConfig_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public int getTargetFileSize() {
            return this.targetFileSize_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public int getTransferFileSize() {
            return this.transferFileSize_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public SEWatchFaceConfig getWatchFaceConfig() {
            SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
            return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder() {
            SEWatchFaceConfig sEWatchFaceConfig = this.watchFaceConfig_;
            return sEWatchFaceConfig == null ? SEWatchFaceConfig.getDefaultInstance() : sEWatchFaceConfig;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public int getWatchFaceFileConfig() {
            return this.watchFaceFileConfig_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public boolean hasIsReplaceable() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public boolean hasTargetFileSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public boolean hasTransferFileSize() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public boolean hasWatchFaceConfig() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFacePrepareInfoOrBuilder
        public boolean hasWatchFaceFileConfig() {
            return (this.bitField0_ & 32) != 0;
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
            if (hasTargetFileSize()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTargetFileSize();
            }
            if (hasTransferFileSize()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTransferFileSize();
            }
            if (hasIsReplaceable()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashBoolean(getIsReplaceable());
            }
            if (hasWatchFaceConfig()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getWatchFaceConfig().hashCode();
            }
            if (hasWatchFaceFileConfig()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getWatchFaceFileConfig();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEWatchFacePrepareInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFacePrepareInfo.class, Builder.class);
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
            if (!hasTargetFileSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTransferFileSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWatchFaceConfig() || getWatchFaceConfig().isInitialized()) {
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
                codedOutputStream.writeUInt32(2, this.targetFileSize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.transferFileSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.isReplaceable_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getWatchFaceConfig());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.watchFaceFileConfig_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWatchFacePrepareInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.targetFileSize_ = 0;
            this.transferFileSize_ = 0;
            this.isReplaceable_ = false;
            this.watchFaceFileConfig_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWatchFacePrepareInfo sEWatchFacePrepareInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWatchFacePrepareInfo);
        }

        public static SEWatchFacePrepareInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWatchFacePrepareInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFacePrepareInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFacePrepareInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWatchFacePrepareInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWatchFacePrepareInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWatchFacePrepareInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWatchFacePrepareInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWatchFacePrepareInfo parseFrom(InputStream inputStream) {
            return (SEWatchFacePrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEWatchFacePrepareInfo() {
            this.id_ = "";
            this.targetFileSize_ = 0;
            this.transferFileSize_ = 0;
            this.isReplaceable_ = false;
            this.watchFaceFileConfig_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static SEWatchFacePrepareInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFacePrepareInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFacePrepareInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEWatchFacePrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWatchFacePrepareInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFacePrepareInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWatchFacePrepareInfoOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        boolean getIsReplaceable();

        int getTargetFileSize();

        int getTransferFileSize();

        SEWatchFaceConfig getWatchFaceConfig();

        SEWatchFaceConfigOrBuilder getWatchFaceConfigOrBuilder();

        int getWatchFaceFileConfig();

        boolean hasId();

        boolean hasIsReplaceable();

        boolean hasTargetFileSize();

        boolean hasTransferFileSize();

        boolean hasWatchFaceConfig();

        boolean hasWatchFaceFileConfig();
    }

    public static final class SEWatchFaceResultInfo extends GeneratedMessage implements SEWatchFaceResultInfoOrBuilder {
        private static final SEWatchFaceResultInfo DEFAULT_INSTANCE;
        public static final int MEMORY_SIZE_FIELD_NUMBER = 2;
        public static final int MEMORY_SURPLUS_FIELD_NUMBER = 3;
        private static final Parser<SEWatchFaceResultInfo> PARSER;
        public static final int PREPARE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memorySize_;
        private int memorySurplus_;
        private int prepareStatus_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WatchFaceProtos$SEWatchFaceResultInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEWatchFaceResultInfo> {
            @Override // com.google.protobuf.Parser
            public SEWatchFaceResultInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWatchFaceResultInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWatchFaceResultInfoOrBuilder {
            private int bitField0_;
            private int memorySize_;
            private int memorySurplus_;
            private int prepareStatus_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, p pVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWatchFaceResultInfo sEWatchFaceResultInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWatchFaceResultInfo.prepareStatus_ = this.prepareStatus_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWatchFaceResultInfo.memorySize_ = this.memorySize_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWatchFaceResultInfo.memorySurplus_ = this.memorySurplus_;
                    i7 |= 4;
                }
                sEWatchFaceResultInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WatchFaceProtos.internal_static_SEWatchFaceResultInfo_descriptor;
            }

            public Builder clearMemorySize() {
                this.bitField0_ &= -3;
                this.memorySize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMemorySurplus() {
                this.bitField0_ &= -5;
                this.memorySurplus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPrepareStatus() {
                this.bitField0_ &= -2;
                this.prepareStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WatchFaceProtos.internal_static_SEWatchFaceResultInfo_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
            public int getMemorySize() {
                return this.memorySize_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
            public int getMemorySurplus() {
                return this.memorySurplus_;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
            public CommonProtos.SEPrepareStatus getPrepareStatus() {
                CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
                return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
            public boolean hasMemorySize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
            public boolean hasMemorySurplus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
            public boolean hasPrepareStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WatchFaceProtos.internal_static_SEWatchFaceResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceResultInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPrepareStatus();
            }

            public Builder setMemorySize(int i7) {
                this.memorySize_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMemorySurplus(int i7) {
                this.memorySurplus_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPrepareStatus(CommonProtos.SEPrepareStatus sEPrepareStatus) {
                sEPrepareStatus.getClass();
                this.bitField0_ |= 1;
                this.prepareStatus_ = sEPrepareStatus.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(p pVar) {
                this();
            }

            private Builder() {
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceResultInfo build() {
                SEWatchFaceResultInfo sEWatchFaceResultInfoBuildPartial = buildPartial();
                if (sEWatchFaceResultInfoBuildPartial.isInitialized()) {
                    return sEWatchFaceResultInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWatchFaceResultInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWatchFaceResultInfo buildPartial() {
                SEWatchFaceResultInfo sEWatchFaceResultInfo = new SEWatchFaceResultInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWatchFaceResultInfo);
                }
                onBuilt();
                return sEWatchFaceResultInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWatchFaceResultInfo getDefaultInstanceForType() {
                return SEWatchFaceResultInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.prepareStatus_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.prepareStatus_ = 0;
                this.memorySize_ = 0;
                this.memorySurplus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWatchFaceResultInfo) {
                    return mergeFrom((SEWatchFaceResultInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEWatchFaceResultInfo sEWatchFaceResultInfo) {
                if (sEWatchFaceResultInfo == SEWatchFaceResultInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEWatchFaceResultInfo.hasPrepareStatus()) {
                    setPrepareStatus(sEWatchFaceResultInfo.getPrepareStatus());
                }
                if (sEWatchFaceResultInfo.hasMemorySize()) {
                    setMemorySize(sEWatchFaceResultInfo.getMemorySize());
                }
                if (sEWatchFaceResultInfo.hasMemorySurplus()) {
                    setMemorySurplus(sEWatchFaceResultInfo.getMemorySurplus());
                }
                mergeUnknownFields(sEWatchFaceResultInfo.getUnknownFields());
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
                                    if (CommonProtos.SEPrepareStatus.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.prepareStatus_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.memorySize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.memorySurplus_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWatchFaceResultInfo");
            DEFAULT_INSTANCE = new SEWatchFaceResultInfo();
            PARSER = new AbstractParser<SEWatchFaceResultInfo>() { // from class: com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfo.1
                @Override // com.google.protobuf.Parser
                public SEWatchFaceResultInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWatchFaceResultInfo.newBuilder();
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

        public /* synthetic */ SEWatchFaceResultInfo(GeneratedMessage.Builder builder, p pVar) {
            this(builder);
        }

        public static SEWatchFaceResultInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WatchFaceProtos.internal_static_SEWatchFaceResultInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWatchFaceResultInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEWatchFaceResultInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceResultInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWatchFaceResultInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWatchFaceResultInfo)) {
                return super.equals(obj);
            }
            SEWatchFaceResultInfo sEWatchFaceResultInfo = (SEWatchFaceResultInfo) obj;
            if (hasPrepareStatus() != sEWatchFaceResultInfo.hasPrepareStatus()) {
                return false;
            }
            if ((hasPrepareStatus() && this.prepareStatus_ != sEWatchFaceResultInfo.prepareStatus_) || hasMemorySize() != sEWatchFaceResultInfo.hasMemorySize()) {
                return false;
            }
            if ((!hasMemorySize() || getMemorySize() == sEWatchFaceResultInfo.getMemorySize()) && hasMemorySurplus() == sEWatchFaceResultInfo.hasMemorySurplus()) {
                return (!hasMemorySurplus() || getMemorySurplus() == sEWatchFaceResultInfo.getMemorySurplus()) && getUnknownFields().equals(sEWatchFaceResultInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WatchFaceProtos.internal_static_SEWatchFaceResultInfo_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
        public int getMemorySize() {
            return this.memorySize_;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
        public int getMemorySurplus() {
            return this.memorySurplus_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWatchFaceResultInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
        public CommonProtos.SEPrepareStatus getPrepareStatus() {
            CommonProtos.SEPrepareStatus sEPrepareStatusForNumber = CommonProtos.SEPrepareStatus.forNumber(this.prepareStatus_);
            return sEPrepareStatusForNumber == null ? CommonProtos.SEPrepareStatus.READY : sEPrepareStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.prepareStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.memorySize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.memorySurplus_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
        public boolean hasMemorySize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
        public boolean hasMemorySurplus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WatchFaceProtos.SEWatchFaceResultInfoOrBuilder
        public boolean hasPrepareStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPrepareStatus()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.prepareStatus_;
            }
            if (hasMemorySize()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMemorySize();
            }
            if (hasMemorySurplus()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMemorySurplus();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WatchFaceProtos.internal_static_SEWatchFaceResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWatchFaceResultInfo.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.prepareStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.memorySize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.memorySurplus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWatchFaceResultInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.prepareStatus_ = 0;
            this.memorySize_ = 0;
            this.memorySurplus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWatchFaceResultInfo sEWatchFaceResultInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWatchFaceResultInfo);
        }

        public static SEWatchFaceResultInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWatchFaceResultInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceResultInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceResultInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWatchFaceResultInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWatchFaceResultInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWatchFaceResultInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWatchFaceResultInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEWatchFaceResultInfo() {
            this.memorySize_ = 0;
            this.memorySurplus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.prepareStatus_ = 0;
        }

        public static SEWatchFaceResultInfo parseFrom(InputStream inputStream) {
            return (SEWatchFaceResultInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWatchFaceResultInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceResultInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWatchFaceResultInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEWatchFaceResultInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWatchFaceResultInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWatchFaceResultInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWatchFaceResultInfoOrBuilder extends MessageOrBuilder {
        int getMemorySize();

        int getMemorySurplus();

        CommonProtos.SEPrepareStatus getPrepareStatus();

        boolean hasMemorySize();

        boolean hasMemorySurplus();

        boolean hasPrepareStatus();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "WatchFaceProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fWatchFace.proto\u001a\fnanopb.proto\u001a\fCommon.proto\"Þ\u0002\n\u000bSEWatchFace\u00122\n\u000fwatch_face_list\u0018\u0001 \u0001(\u000b2\u0017.SEWatchFaceItem.SEListH\u0000\u0012\u0013\n\u0002id\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012*\n\u000esetting_result\u0018\u0003 \u0001(\u000e2\u0010.SESettingResultH\u0000\u00129\n\u0016watch_facePrepare_info\u0018\u0004 \u0001(\u000b2\u0017.SEWatchFacePrepareInfoH\u0000\u00127\n\u0015watchFace_result_info\u0018\u0005 \u0001(\u000b2\u0016.SEWatchFaceResultInfoH\u0000\u0012*\n\u000einstall_result\u0018\u0006 \u0001(\u000b2\u0010.SEInstallResultH\u0000\u0012/\n\u0011watch_face_config\u0018\u0007 \u0001(\u000b2\u0012.SEWatchFaceConfigH\u0000B\t\n\u0007payload\"|\n\u000fSEWatchFaceItem\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\nis_current\u0018\u0002 \u0002(\b\u0012\u0011\n\tis_remove\u0018\u0003 \u0001(\b\u001a/\n\u0006SEList\u0012%\n\u0004list\u0018\u0001 \u0003(\u000b2\u0010.SEWatchFaceItemB\u0005\u0092?\u0002\u0018\u0004\"Ï\u0001\n\u0016SEWatchFacePrepareInfo\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\u0010target_file_size\u0018\u0002 \u0002(\r\u0012\u001a\n\u0012transfer_file_size\u0018\u0003 \u0002(\r\u0012\u0016\n\u000eis_replaceable\u0018\u0004 \u0001(\b\u0012-\n\u0011watch_face_config\u0018\u0005 \u0001(\u000b2\u0012.SEWatchFaceConfig\u0012%\n\u0016watch_face_file_config\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\b\"n\n\u0015SEWatchFaceResultInfo\u0012(\n\u000eprepare_status\u0018\u0001 \u0002(\u000e2\u0010.SEPrepareStatus\u0012\u0013\n\u000bmemory_size\u0018\u0002 \u0001(\r\u0012\u0016\n\u000ememory_surplus\u0018\u0003 \u0001(\r\"À\u0001\n\u000fSEInstallResult\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012%\n\u0004code\u0018\u0002 \u0002(\u000e2\u0017.SEInstallResult.SECode\u0012-\n\u0011watch_face_config\u0018\u0003 \u0001(\u000b2\u0012.SEWatchFaceConfig\"D\n\u0006SECode\u0012\u0011\n\rVERIFY_FAILED\u0010\u0000\u0012\u0012\n\u000eINSTALL_FAILED\u0010\u0001\u0012\u0013\n\u000fINSTALL_SUCCESS\u0010\u0002\"¸\u0003\n\u0011SEWatchFaceConfig\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nrule_count\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\u0012G\n\u001dcomplex_functions_config_list\u0018\u0003 \u0001(\u000b2 .SEComplexFunctionsConfig.SEList\u0012B\n\"complex_functions_file_config_list\u0018\u0004 \u0001(\u000b2\u0016.SEWatchFaceFileConfig\u0012;\n\u001bbackground_file_config_list\u0018\u0005 \u0001(\u000b2\u0016.SEWatchFaceFileConfig\u0012:\n\u001athumbnail_file_config_list\u0018\u0006 \u0001(\u000b2\u0016.SEWatchFaceFileConfig\u00126\n\u0016point_file_config_list\u0018\u0007 \u0001(\u000b2\u0016.SEWatchFaceFileConfig\u00127\n\u0017number_file_config_list\u0018\b \u0001(\u000b2\u0016.SEWatchFaceFileConfig\"\u008d\u0002\n\u0018SEComplexFunctionsConfig\u00120\n!complex_functions_config_position\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012P\n\"complex_functions_config_type_list\u0018\u0002 \u0002(\u000b2$.SEComplexFunctionsConfigType.SEList\u00123\n$complex_functions_config_type_choose\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b\u001a8\n\u0006SEList\u0012.\n\u0004list\u0018\u0001 \u0003(\u000b2\u0019.SEComplexFunctionsConfigB\u0005\u0092?\u0002\u0018\u0004\"\u008a\u0001\n\u001cSEComplexFunctionsConfigType\u0012,\n\u001dcomplex_functions_config_type\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u001a<\n\u0006SEList\u00122\n\u0004list\u0018\u0001 \u0003(\u000b2\u001d.SEComplexFunctionsConfigTypeB\u0005\u0092?\u0002\u0018\u0004\"Ë\u0002\n\u0013SEWatchFaceFileList\u0012\u0018\n\tfile_size\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028 \u0012\u001a\n\u000bfile_number\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028 \u0012\u0017\n\bfile_md5\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rdial_file_md5\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012#\n\u0014number_type_file_md5\u0018\u0005 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012'\n\u0018number_position_file_md5\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010number_color_hex\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028 \u0012#\n\u0014background_color_hex\u0018\b \u0001(\rB\u0005\u0092?\u00028 \u001a3\n\u0006SEList\u0012)\n\u0004list\u0018\u0001 \u0003(\u000b2\u0014.SEWatchFaceFileListB\u0005\u0092?\u0002\u0018\u0004\"\u0099\u0001\n\u0015SEWatchFaceFileConfig\u0012 \n\u0011watch_face_number\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012#\n\u0014now_used_file_number\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\u00129\n\u0014watch_face_file_list\u0018\u0003 \u0001(\u000b2\u001b.SEWatchFaceFileList.SEList*6\n\u000fSESettingResult\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\b\n\u0004FAIL\u0010\u0001\u0012\f\n\bUSED_NOW\u0010\u0002B+\n\u0018com.zh.ble.wear.protobufB\u000fWatchFaceProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SEWatchFace_descriptor = messageType;
        internal_static_SEWatchFace_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"WatchFaceList", "Id", "SettingResult", "WatchFacePrepareInfo", "WatchFaceResultInfo", "InstallResult", "WatchFaceConfig", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SEWatchFaceItem_descriptor = messageType2;
        internal_static_SEWatchFaceItem_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"Id", "IsCurrent", "IsRemove"});
        Descriptors.Descriptor nestedType = messageType2.getNestedType(0);
        internal_static_SEWatchFaceItem_SEList_descriptor = nestedType;
        internal_static_SEWatchFaceItem_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEWatchFacePrepareInfo_descriptor = messageType3;
        internal_static_SEWatchFacePrepareInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"Id", "TargetFileSize", "TransferFileSize", "IsReplaceable", "WatchFaceConfig", "WatchFaceFileConfig"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SEWatchFaceResultInfo_descriptor = messageType4;
        internal_static_SEWatchFaceResultInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"PrepareStatus", "MemorySize", "MemorySurplus"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SEInstallResult_descriptor = messageType5;
        internal_static_SEInstallResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Id", "Code", "WatchFaceConfig"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SEWatchFaceConfig_descriptor = messageType6;
        internal_static_SEWatchFaceConfig_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Id", "RuleCount", "ComplexFunctionsConfigList", "ComplexFunctionsFileConfigList", "BackgroundFileConfigList", "ThumbnailFileConfigList", "PointFileConfigList", "NumberFileConfigList"});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SEComplexFunctionsConfig_descriptor = messageType7;
        internal_static_SEComplexFunctionsConfig_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"ComplexFunctionsConfigPosition", "ComplexFunctionsConfigTypeList", "ComplexFunctionsConfigTypeChoose"});
        Descriptors.Descriptor nestedType2 = messageType7.getNestedType(0);
        internal_static_SEComplexFunctionsConfig_SEList_descriptor = nestedType2;
        internal_static_SEComplexFunctionsConfig_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SEComplexFunctionsConfigType_descriptor = messageType8;
        internal_static_SEComplexFunctionsConfigType_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"ComplexFunctionsConfigType"});
        Descriptors.Descriptor nestedType3 = messageType8.getNestedType(0);
        internal_static_SEComplexFunctionsConfigType_SEList_descriptor = nestedType3;
        internal_static_SEComplexFunctionsConfigType_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SEWatchFaceFileList_descriptor = messageType9;
        internal_static_SEWatchFaceFileList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{"FileSize", "FileNumber", "FileMd5", "DialFileMd5", "NumberTypeFileMd5", "NumberPositionFileMd5", "NumberColorHex", "BackgroundColorHex"});
        Descriptors.Descriptor nestedType4 = messageType9.getNestedType(0);
        internal_static_SEWatchFaceFileList_SEList_descriptor = nestedType4;
        internal_static_SEWatchFaceFileList_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType10 = getDescriptor().getMessageType(9);
        internal_static_SEWatchFaceFileConfig_descriptor = messageType10;
        internal_static_SEWatchFaceFileConfig_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType10, new String[]{"WatchFaceNumber", "NowUsedFileNumber", "WatchFaceFileList"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private WatchFaceProtos() {
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