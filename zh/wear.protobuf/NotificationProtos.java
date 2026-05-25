package com.zh.wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.work.WorkInfo;
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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class NotificationProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_AppInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AppInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AppInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AppInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Notification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Notification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NotifyData_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NotifyData_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NotifyData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NotifyData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NotifyId_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NotifyId_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NotifyId_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NotifyId_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.NotificationProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase;

        static {
            int[] iArr = new int[Notification.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase = iArr;
            try {
                iArr[Notification.PayloadCase.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase[Notification.PayloadCase.ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase[Notification.PayloadCase.DATA_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase[Notification.PayloadCase.ID_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase[Notification.PayloadCase.APP_INFO_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase[Notification.PayloadCase.APP_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase[Notification.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class AppInfo extends GeneratedMessageV3 implements AppInfoOrBuilder {
        public static final int APP_TYPE_FIELD_NUMBER = 1;
        public static final int ENABLE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int appType_;
        private int bitField0_;
        private boolean enable_;
        private byte memoizedIsInitialized;
        private static final AppInfo DEFAULT_INSTANCE = new AppInfo();

        @Deprecated
        public static final Parser<AppInfo> PARSER = new AbstractParser<AppInfo>() { // from class: com.zh.wear.protobuf.NotificationProtos.AppInfo.1
            @Override // com.google.protobuf.Parser
            public AppInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AppInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppInfoOrBuilder {
            private int appType_;
            private int bitField0_;
            private boolean enable_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_AppInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAppType() {
                this.bitField0_ &= -2;
                this.appType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEnable() {
                this.bitField0_ &= -3;
                this.enable_ = false;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
            public int getAppType() {
                return this.appType_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_AppInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_AppInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AppInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppType() && hasEnable();
            }

            public Builder setAppType(int i7) {
                this.bitField0_ |= 1;
                this.appType_ = i7;
                onChanged();
                return this;
            }

            public Builder setEnable(boolean z6) {
                this.bitField0_ |= 2;
                this.enable_ = z6;
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
            public AppInfo build() {
                AppInfo appInfoBuildPartial = buildPartial();
                if (appInfoBuildPartial.isInitialized()) {
                    return appInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppInfo buildPartial() {
                AppInfo appInfo = new AppInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                appInfo.appType_ = this.appType_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                appInfo.enable_ = this.enable_;
                appInfo.bitField0_ = i8;
                onBuilt();
                return appInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AppInfo getDefaultInstanceForType() {
                return AppInfo.getDefaultInstance();
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
                this.appType_ = 0;
                int i7 = this.bitField0_;
                this.enable_ = false;
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
            public com.zh.wear.protobuf.NotificationProtos.AppInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NotificationProtos$AppInfo> r1 = com.zh.wear.protobuf.NotificationProtos.AppInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NotificationProtos$AppInfo r3 = (com.zh.wear.protobuf.NotificationProtos.AppInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NotificationProtos$AppInfo r4 = (com.zh.wear.protobuf.NotificationProtos.AppInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.AppInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NotificationProtos$AppInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AppInfo) {
                    return mergeFrom((AppInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AppInfo appInfo) {
                if (appInfo == AppInfo.getDefaultInstance()) {
                    return this;
                }
                if (appInfo.hasAppType()) {
                    setAppType(appInfo.getAppType());
                }
                if (appInfo.hasEnable()) {
                    setEnable(appInfo.getEnable());
                }
                mergeUnknownFields(((GeneratedMessage) appInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<AppInfo> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.NotificationProtos.AppInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> listBuilder_;
                private java.util.List<AppInfo> list_;

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
                    return NotificationProtos.internal_static_AppInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends AppInfo> iterable) {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(AppInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return NotificationProtos.internal_static_AppInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
                public AppInfo getList(int i7) {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AppInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
                public java.util.List<AppInfo> getListList() {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
                public AppInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AppInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
                public java.util.List<? extends AppInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_AppInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, AppInfo appInfo) {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, appInfo);
                        return this;
                    }
                    appInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, appInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, AppInfo.getDefaultInstance());
                }

                public Builder setList(int i7, AppInfo appInfo) {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, appInfo);
                        return this;
                    }
                    appInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, appInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(AppInfo appInfo) {
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(appInfo);
                        return this;
                    }
                    appInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(appInfo);
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
                    RepeatedFieldBuilderV3<AppInfo, Builder, AppInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.NotificationProtos.AppInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.NotificationProtos$AppInfo$List> r1 = com.zh.wear.protobuf.NotificationProtos.AppInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.NotificationProtos$AppInfo$List r3 = (com.zh.wear.protobuf.NotificationProtos.AppInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.NotificationProtos$AppInfo$List r4 = (com.zh.wear.protobuf.NotificationProtos.AppInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.AppInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NotificationProtos$AppInfo$List$Builder");
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
                return NotificationProtos.internal_static_AppInfo_List_descriptor;
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

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
            public AppInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
            public java.util.List<AppInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
            public AppInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.AppInfo.ListOrBuilder
            public java.util.List<? extends AppInfoOrBuilder> getListOrBuilderList() {
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
                return NotificationProtos.internal_static_AppInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((AppInfo) codedInputStream.readMessage(AppInfo.PARSER, extensionRegistryLite));
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
            AppInfo getList(int i7);

            int getListCount();

            java.util.List<AppInfo> getListList();

            AppInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends AppInfoOrBuilder> getListOrBuilderList();
        }

        public enum Type implements ProtocolMessageEnum {
            NOTIFICATION(0),
            CALL(1),
            WECHAT(2),
            QQ(3),
            ALIPAY(4),
            OTHER(5);

            public static final int ALIPAY_VALUE = 4;
            public static final int CALL_VALUE = 1;
            public static final int NOTIFICATION_VALUE = 0;
            public static final int OTHER_VALUE = 5;
            public static final int QQ_VALUE = 3;
            public static final int WECHAT_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.zh.wear.protobuf.NotificationProtos.AppInfo.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i7) {
                    return Type.forNumber(i7);
                }
            };
            private static final Type[] VALUES = values();

            Type(int i7) {
                this.value = i7;
            }

            public static Type forNumber(int i7) {
                if (i7 == 0) {
                    return NOTIFICATION;
                }
                if (i7 == 1) {
                    return CALL;
                }
                if (i7 == 2) {
                    return WECHAT;
                }
                if (i7 == 3) {
                    return QQ;
                }
                if (i7 == 4) {
                    return ALIPAY;
                }
                if (i7 != 5) {
                    return null;
                }
                return OTHER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AppInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Type valueOf(int i7) {
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

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private AppInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.appType_ = 0;
            this.enable_ = false;
        }

        public static AppInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_AppInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AppInfo parseDelimitedFrom(InputStream inputStream) {
            return (AppInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AppInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppInfo)) {
                return super.equals(obj);
            }
            AppInfo appInfo = (AppInfo) obj;
            boolean z6 = hasAppType() == appInfo.hasAppType();
            if (hasAppType()) {
                z6 = z6 && getAppType() == appInfo.getAppType();
            }
            boolean z7 = z6 && hasEnable() == appInfo.hasEnable();
            if (hasEnable()) {
                z7 = z7 && getEnable() == appInfo.getEnable();
            }
            return z7 && this.unknownFields.equals(appInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
        public int getAppType() {
            return this.appType_;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
        public boolean getEnable() {
            return this.enable_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AppInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.appType_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.enable_);
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
        public boolean hasAppType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.AppInfoOrBuilder
        public boolean hasEnable() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAppType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAppType();
            }
            if (hasEnable()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getEnable());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_AppInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AppInfo.class, Builder.class);
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
            if (!hasAppType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEnable()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeUInt32(1, this.appType_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBool(2, this.enable_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AppInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.appType_ = codedInputStream.readUInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.enable_ = codedInputStream.readBool();
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

        public static Builder newBuilder(AppInfo appInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appInfo);
        }

        public static AppInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppInfo parseFrom(CodedInputStream codedInputStream) {
            return (AppInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AppInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AppInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AppInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AppInfo parseFrom(InputStream inputStream) {
            return (AppInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AppInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AppInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AppInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AppInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AppInfoOrBuilder extends MessageOrBuilder {
        int getAppType();

        boolean getEnable();

        boolean hasAppType();

        boolean hasEnable();
    }

    public enum CallType implements ProtocolMessageEnum {
        NOTHING(0),
        INCOMING_CALL(1),
        MISSED_CALL(2);

        public static final int INCOMING_CALL_VALUE = 1;
        public static final int MISSED_CALL_VALUE = 2;
        public static final int NOTHING_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<CallType> internalValueMap = new Internal.EnumLiteMap<CallType>() { // from class: com.zh.wear.protobuf.NotificationProtos.CallType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CallType findValueByNumber(int i7) {
                return CallType.forNumber(i7);
            }
        };
        private static final CallType[] VALUES = values();

        CallType(int i7) {
            this.value = i7;
        }

        public static CallType forNumber(int i7) {
            if (i7 == 0) {
                return NOTHING;
            }
            if (i7 == 1) {
                return INCOMING_CALL;
            }
            if (i7 != 2) {
                return null;
            }
            return MISSED_CALL;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return NotificationProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<CallType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static CallType valueOf(int i7) {
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

        public static CallType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Notification extends GeneratedMessageV3 implements NotificationOrBuilder {
        public static final int APP_INFO_FIELD_NUMBER = 5;
        public static final int APP_INFO_LIST_FIELD_NUMBER = 6;
        public static final int DATA_FIELD_NUMBER = 1;
        public static final int DATA_LIST_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int ID_LIST_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Notification DEFAULT_INSTANCE = new Notification();

        @Deprecated
        public static final Parser<Notification> PARSER = new AbstractParser<Notification>() { // from class: com.zh.wear.protobuf.NotificationProtos.Notification.1
            @Override // com.google.protobuf.Parser
            public Notification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Notification(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NotificationOrBuilder {
            private SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> appInfoBuilder_;
            private SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> appInfoListBuilder_;
            private int bitField0_;
            private SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> dataBuilder_;
            private SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> dataListBuilder_;
            private SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> idBuilder_;
            private SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> idListBuilder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> getAppInfoFieldBuilder() {
                if (this.appInfoBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = AppInfo.getDefaultInstance();
                    }
                    this.appInfoBuilder_ = new SingleFieldBuilderV3<>((AppInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.appInfoBuilder_;
            }

            private SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> getAppInfoListFieldBuilder() {
                if (this.appInfoListBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = AppInfo.List.getDefaultInstance();
                    }
                    this.appInfoListBuilder_ = new SingleFieldBuilderV3<>((AppInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.appInfoListBuilder_;
            }

            private SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = NotifyData.getDefaultInstance();
                    }
                    this.dataBuilder_ = new SingleFieldBuilderV3<>((NotifyData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.dataBuilder_;
            }

            private SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> getDataListFieldBuilder() {
                if (this.dataListBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = NotifyData.List.getDefaultInstance();
                    }
                    this.dataListBuilder_ = new SingleFieldBuilderV3<>((NotifyData.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.dataListBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_Notification_descriptor;
            }

            private SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> getIdFieldBuilder() {
                if (this.idBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = NotifyId.getDefaultInstance();
                    }
                    this.idBuilder_ = new SingleFieldBuilderV3<>((NotifyId) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.idBuilder_;
            }

            private SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> getIdListFieldBuilder() {
                if (this.idListBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = NotifyId.List.getDefaultInstance();
                    }
                    this.idListBuilder_ = new SingleFieldBuilderV3<>((NotifyId.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.idListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAppInfo() {
                SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> singleFieldBuilderV3 = this.appInfoBuilder_;
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

            public Builder clearAppInfoList() {
                SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> singleFieldBuilderV3 = this.appInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearData() {
                SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
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

            public Builder clearDataList() {
                SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
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

            public Builder clearId() {
                SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
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

            public Builder clearIdList() {
                SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> singleFieldBuilderV3 = this.idListBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public AppInfo getAppInfo() {
                Object message;
                SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> singleFieldBuilderV3 = this.appInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 5) {
                        return AppInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 5) {
                        return AppInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AppInfo) message;
            }

            public AppInfo.Builder getAppInfoBuilder() {
                return (AppInfo.Builder) getAppInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public AppInfo.List getAppInfoList() {
                Object message;
                SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> singleFieldBuilderV3 = this.appInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 6) {
                        return AppInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 6) {
                        return AppInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AppInfo.List) message;
            }

            public AppInfo.List.Builder getAppInfoListBuilder() {
                return (AppInfo.List.Builder) getAppInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public AppInfo.ListOrBuilder getAppInfoListOrBuilder() {
                SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilderV3 = this.appInfoListBuilder_) == null) ? i7 == 6 ? (AppInfo.List) this.payload_ : AppInfo.List.getDefaultInstance() : (AppInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public AppInfoOrBuilder getAppInfoOrBuilder() {
                SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilderV3 = this.appInfoBuilder_) == null) ? i7 == 5 ? (AppInfo) this.payload_ : AppInfo.getDefaultInstance() : (AppInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyData getData() {
                Object message;
                SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return NotifyData.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return NotifyData.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (NotifyData) message;
            }

            public NotifyData.Builder getDataBuilder() {
                return (NotifyData.Builder) getDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyData.List getDataList() {
                Object message;
                SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return NotifyData.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return NotifyData.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (NotifyData.List) message;
            }

            public NotifyData.List.Builder getDataListBuilder() {
                return (NotifyData.List.Builder) getDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyData.ListOrBuilder getDataListOrBuilder() {
                SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.dataListBuilder_) == null) ? i7 == 3 ? (NotifyData.List) this.payload_ : NotifyData.List.getDefaultInstance() : (NotifyData.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyDataOrBuilder getDataOrBuilder() {
                SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.dataBuilder_) == null) ? i7 == 1 ? (NotifyData) this.payload_ : NotifyData.getDefaultInstance() : (NotifyDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_Notification_descriptor;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyId getId() {
                Object message;
                SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return NotifyId.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return NotifyId.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (NotifyId) message;
            }

            public NotifyId.Builder getIdBuilder() {
                return (NotifyId.Builder) getIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyId.List getIdList() {
                Object message;
                SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> singleFieldBuilderV3 = this.idListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 4) {
                        return NotifyId.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 4) {
                        return NotifyId.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (NotifyId.List) message;
            }

            public NotifyId.List.Builder getIdListBuilder() {
                return (NotifyId.List.Builder) getIdListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyId.ListOrBuilder getIdListOrBuilder() {
                SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilderV3 = this.idListBuilder_) == null) ? i7 == 4 ? (NotifyId.List) this.payload_ : NotifyId.List.getDefaultInstance() : (NotifyId.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public NotifyIdOrBuilder getIdOrBuilder() {
                SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.idBuilder_) == null) ? i7 == 2 ? (NotifyId) this.payload_ : NotifyId.getDefaultInstance() : (NotifyIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public boolean hasAppInfo() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public boolean hasAppInfoList() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public boolean hasData() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public boolean hasDataList() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public boolean hasId() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
            public boolean hasIdList() {
                return this.payloadCase_ == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_Notification_fieldAccessorTable.ensureFieldAccessorsInitialized(Notification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasData() && !getData().isInitialized()) {
                    return false;
                }
                if (hasId() && !getId().isInitialized()) {
                    return false;
                }
                if (hasDataList() && !getDataList().isInitialized()) {
                    return false;
                }
                if (hasIdList() && !getIdList().isInitialized()) {
                    return false;
                }
                if (!hasAppInfoList() || getAppInfoList().isInitialized()) {
                    return !hasAppInfo() || getAppInfo().isInitialized();
                }
                return false;
            }

            public Builder mergeAppInfo(AppInfo appInfo) {
                SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> singleFieldBuilderV3 = this.appInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 5 && this.payload_ != AppInfo.getDefaultInstance()) {
                        appInfo = AppInfo.newBuilder((AppInfo) this.payload_).mergeFrom(appInfo).buildPartial();
                    }
                    this.payload_ = appInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 5) {
                        singleFieldBuilderV3.mergeFrom(appInfo);
                    }
                    this.appInfoBuilder_.setMessage(appInfo);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeAppInfoList(AppInfo.List list) {
                SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> singleFieldBuilderV3 = this.appInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 6 && this.payload_ != AppInfo.List.getDefaultInstance()) {
                        list = AppInfo.List.newBuilder((AppInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 6) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.appInfoListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeData(NotifyData notifyData) {
                SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != NotifyData.getDefaultInstance()) {
                        notifyData = NotifyData.newBuilder((NotifyData) this.payload_).mergeFrom(notifyData).buildPartial();
                    }
                    this.payload_ = notifyData;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(notifyData);
                    }
                    this.dataBuilder_.setMessage(notifyData);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeDataList(NotifyData.List list) {
                SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != NotifyData.List.getDefaultInstance()) {
                        list = NotifyData.List.newBuilder((NotifyData.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.dataListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeId(NotifyId notifyId) {
                SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != NotifyId.getDefaultInstance()) {
                        notifyId = NotifyId.newBuilder((NotifyId) this.payload_).mergeFrom(notifyId).buildPartial();
                    }
                    this.payload_ = notifyId;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(notifyId);
                    }
                    this.idBuilder_.setMessage(notifyId);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeIdList(NotifyId.List list) {
                SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> singleFieldBuilderV3 = this.idListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4 && this.payload_ != NotifyId.List.getDefaultInstance()) {
                        list = NotifyId.List.newBuilder((NotifyId.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.idListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setAppInfo(AppInfo.Builder builder) {
                SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> singleFieldBuilderV3 = this.appInfoBuilder_;
                AppInfo appInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = appInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(appInfoBuild);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setAppInfoList(AppInfo.List.Builder builder) {
                SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> singleFieldBuilderV3 = this.appInfoListBuilder_;
                AppInfo.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setData(NotifyData.Builder builder) {
                SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                NotifyData notifyDataBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = notifyDataBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(notifyDataBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setDataList(NotifyData.List.Builder builder) {
                SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                NotifyData.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setId(NotifyId.Builder builder) {
                SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                NotifyId notifyIdBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = notifyIdBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(notifyIdBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setIdList(NotifyId.List.Builder builder) {
                SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> singleFieldBuilderV3 = this.idListBuilder_;
                NotifyId.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 4;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setAppInfo(AppInfo appInfo) {
                SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> singleFieldBuilderV3 = this.appInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    appInfo.getClass();
                    this.payload_ = appInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(appInfo);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setAppInfoList(AppInfo.List list) {
                SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> singleFieldBuilderV3 = this.appInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setData(NotifyData notifyData) {
                SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notifyData.getClass();
                    this.payload_ = notifyData;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(notifyData);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setDataList(NotifyData.List list) {
                SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> singleFieldBuilderV3 = this.dataListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setId(NotifyId notifyId) {
                SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> singleFieldBuilderV3 = this.idBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notifyId.getClass();
                    this.payload_ = notifyId;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(notifyId);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setIdList(NotifyId.List list) {
                SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> singleFieldBuilderV3 = this.idListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Notification build() {
                Notification notificationBuildPartial = buildPartial();
                if (notificationBuildPartial.isInitialized()) {
                    return notificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) notificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Notification buildPartial() {
                Notification notification = new Notification(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<NotifyData, NotifyData.Builder, NotifyDataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                    notification.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<NotifyId, NotifyId.Builder, NotifyIdOrBuilder> singleFieldBuilderV32 = this.idBuilder_;
                    notification.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<NotifyData.List, NotifyData.List.Builder, NotifyData.ListOrBuilder> singleFieldBuilderV33 = this.dataListBuilder_;
                    notification.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                if (this.payloadCase_ == 4) {
                    SingleFieldBuilderV3<NotifyId.List, NotifyId.List.Builder, NotifyId.ListOrBuilder> singleFieldBuilderV34 = this.idListBuilder_;
                    notification.payload_ = singleFieldBuilderV34 == null ? this.payload_ : singleFieldBuilderV34.build();
                }
                if (this.payloadCase_ == 6) {
                    SingleFieldBuilderV3<AppInfo.List, AppInfo.List.Builder, AppInfo.ListOrBuilder> singleFieldBuilderV35 = this.appInfoListBuilder_;
                    notification.payload_ = singleFieldBuilderV35 == null ? this.payload_ : singleFieldBuilderV35.build();
                }
                if (this.payloadCase_ == 5) {
                    SingleFieldBuilderV3<AppInfo, AppInfo.Builder, AppInfoOrBuilder> singleFieldBuilderV36 = this.appInfoBuilder_;
                    notification.payload_ = singleFieldBuilderV36 == null ? this.payload_ : singleFieldBuilderV36.build();
                }
                notification.bitField0_ = 0;
                notification.payloadCase_ = this.payloadCase_;
                onBuilt();
                return notification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Notification getDefaultInstanceForType() {
                return Notification.getDefaultInstance();
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
            public com.zh.wear.protobuf.NotificationProtos.Notification.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NotificationProtos$Notification> r1 = com.zh.wear.protobuf.NotificationProtos.Notification.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NotificationProtos$Notification r3 = (com.zh.wear.protobuf.NotificationProtos.Notification) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NotificationProtos$Notification r4 = (com.zh.wear.protobuf.NotificationProtos.Notification) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.Notification.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NotificationProtos$Notification$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Notification) {
                    return mergeFrom((Notification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Notification notification) {
                if (notification == Notification.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$NotificationProtos$Notification$PayloadCase[notification.getPayloadCase().ordinal()]) {
                    case 1:
                        mergeData(notification.getData());
                        break;
                    case 2:
                        mergeId(notification.getId());
                        break;
                    case 3:
                        mergeDataList(notification.getDataList());
                        break;
                    case 4:
                        mergeIdList(notification.getIdList());
                        break;
                    case 5:
                        mergeAppInfoList(notification.getAppInfoList());
                        break;
                    case 6:
                        mergeAppInfo(notification.getAppInfo());
                        break;
                }
                mergeUnknownFields(((GeneratedMessage) notification).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum NotificationID implements ProtocolMessageEnum {
            ADD_NOTIFY(0),
            REMOVE_NOTIFY(1),
            HANG_UP(2),
            INCOMING_CALL_MUTE(5),
            GET_APP_LIST(3),
            SET_APP(4);

            public static final int ADD_NOTIFY_VALUE = 0;
            public static final int GET_APP_LIST_VALUE = 3;
            public static final int HANG_UP_VALUE = 2;
            public static final int INCOMING_CALL_MUTE_VALUE = 5;
            public static final int REMOVE_NOTIFY_VALUE = 1;
            public static final int SET_APP_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<NotificationID> internalValueMap = new Internal.EnumLiteMap<NotificationID>() { // from class: com.zh.wear.protobuf.NotificationProtos.Notification.NotificationID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public NotificationID findValueByNumber(int i7) {
                    return NotificationID.forNumber(i7);
                }
            };
            private static final NotificationID[] VALUES = values();

            NotificationID(int i7) {
                this.value = i7;
            }

            public static NotificationID forNumber(int i7) {
                if (i7 == 0) {
                    return ADD_NOTIFY;
                }
                if (i7 == 1) {
                    return REMOVE_NOTIFY;
                }
                if (i7 == 2) {
                    return HANG_UP;
                }
                if (i7 == 3) {
                    return GET_APP_LIST;
                }
                if (i7 == 4) {
                    return SET_APP;
                }
                if (i7 != 5) {
                    return null;
                }
                return INCOMING_CALL_MUTE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Notification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<NotificationID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static NotificationID valueOf(int i7) {
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

            public static NotificationID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            DATA(1),
            ID(2),
            DATA_LIST(3),
            ID_LIST(4),
            APP_INFO_LIST(6),
            APP_INFO(5),
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
                        return DATA;
                    case 2:
                        return ID;
                    case 3:
                        return DATA_LIST;
                    case 4:
                        return ID_LIST;
                    case 5:
                        return APP_INFO;
                    case 6:
                        return APP_INFO_LIST;
                    default:
                        return null;
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

        private Notification() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Notification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_Notification_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Notification parseDelimitedFrom(InputStream inputStream) {
            return (Notification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Notification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Notification> parser() {
            return PARSER;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.zh.wear.protobuf.NotificationProtos.Notification
                if (r1 != 0) goto Ld
                boolean r5 = super.equals(r5)
                return r5
            Ld:
                com.zh.wear.protobuf.NotificationProtos$Notification r5 = (com.zh.wear.protobuf.NotificationProtos.Notification) r5
                com.zh.wear.protobuf.NotificationProtos$Notification$PayloadCase r1 = r4.getPayloadCase()
                com.zh.wear.protobuf.NotificationProtos$Notification$PayloadCase r2 = r5.getPayloadCase()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 != 0) goto L1f
                return r2
            L1f:
                int r3 = r4.payloadCase_
                switch(r3) {
                    case 1: goto L7b;
                    case 2: goto L6a;
                    case 3: goto L59;
                    case 4: goto L48;
                    case 5: goto L37;
                    case 6: goto L26;
                    default: goto L24;
                }
            L24:
                goto L8e
            L26:
                if (r1 == 0) goto L8d
                com.zh.wear.protobuf.NotificationProtos$AppInfo$List r1 = r4.getAppInfoList()
                com.zh.wear.protobuf.NotificationProtos$AppInfo$List r3 = r5.getAppInfoList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L8d
                goto L8b
            L37:
                if (r1 == 0) goto L8d
                com.zh.wear.protobuf.NotificationProtos$AppInfo r1 = r4.getAppInfo()
                com.zh.wear.protobuf.NotificationProtos$AppInfo r3 = r5.getAppInfo()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L8d
                goto L8b
            L48:
                if (r1 == 0) goto L8d
                com.zh.wear.protobuf.NotificationProtos$NotifyId$List r1 = r4.getIdList()
                com.zh.wear.protobuf.NotificationProtos$NotifyId$List r3 = r5.getIdList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L8d
                goto L8b
            L59:
                if (r1 == 0) goto L8d
                com.zh.wear.protobuf.NotificationProtos$NotifyData$List r1 = r4.getDataList()
                com.zh.wear.protobuf.NotificationProtos$NotifyData$List r3 = r5.getDataList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L8d
                goto L8b
            L6a:
                if (r1 == 0) goto L8d
                com.zh.wear.protobuf.NotificationProtos$NotifyId r1 = r4.getId()
                com.zh.wear.protobuf.NotificationProtos$NotifyId r3 = r5.getId()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L8d
                goto L8b
            L7b:
                if (r1 == 0) goto L8d
                com.zh.wear.protobuf.NotificationProtos$NotifyData r1 = r4.getData()
                com.zh.wear.protobuf.NotificationProtos$NotifyData r3 = r5.getData()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L8d
            L8b:
                r1 = r0
                goto L8e
            L8d:
                r1 = r2
            L8e:
                if (r1 == 0) goto L9b
                com.google.protobuf.UnknownFieldSet r1 = r4.unknownFields
                com.google.protobuf.UnknownFieldSet r5 = r5.unknownFields
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L9b
                return r0
            L9b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.Notification.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public AppInfo getAppInfo() {
            return this.payloadCase_ == 5 ? (AppInfo) this.payload_ : AppInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public AppInfo.List getAppInfoList() {
            return this.payloadCase_ == 6 ? (AppInfo.List) this.payload_ : AppInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public AppInfo.ListOrBuilder getAppInfoListOrBuilder() {
            return this.payloadCase_ == 6 ? (AppInfo.List) this.payload_ : AppInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public AppInfoOrBuilder getAppInfoOrBuilder() {
            return this.payloadCase_ == 5 ? (AppInfo) this.payload_ : AppInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyData getData() {
            return this.payloadCase_ == 1 ? (NotifyData) this.payload_ : NotifyData.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyData.List getDataList() {
            return this.payloadCase_ == 3 ? (NotifyData.List) this.payload_ : NotifyData.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyData.ListOrBuilder getDataListOrBuilder() {
            return this.payloadCase_ == 3 ? (NotifyData.List) this.payload_ : NotifyData.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyDataOrBuilder getDataOrBuilder() {
            return this.payloadCase_ == 1 ? (NotifyData) this.payload_ : NotifyData.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyId getId() {
            return this.payloadCase_ == 2 ? (NotifyId) this.payload_ : NotifyId.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyId.List getIdList() {
            return this.payloadCase_ == 4 ? (NotifyId.List) this.payload_ : NotifyId.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyId.ListOrBuilder getIdListOrBuilder() {
            return this.payloadCase_ == 4 ? (NotifyId.List) this.payload_ : NotifyId.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public NotifyIdOrBuilder getIdOrBuilder() {
            return this.payloadCase_ == 2 ? (NotifyId) this.payload_ : NotifyId.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Notification> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (NotifyData) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (NotifyId) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (NotifyData.List) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (NotifyId.List) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (AppInfo) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (AppInfo.List) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public boolean hasAppInfo() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public boolean hasAppInfoList() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public boolean hasData() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public boolean hasDataList() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public boolean hasId() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotificationOrBuilder
        public boolean hasIdList() {
            return this.payloadCase_ == 4;
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
                    iHashCode = getData().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getId().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getDataList().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getIdList().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getAppInfo().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getAppInfoList().hashCode();
                    break;
                default:
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_Notification_fieldAccessorTable.ensureFieldAccessorsInitialized(Notification.class, Builder.class);
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
            if (hasData() && !getData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasId() && !getId().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDataList() && !getDataList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIdList() && !getIdList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppInfoList() && !getAppInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAppInfo() || getAppInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (NotifyData) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (NotifyId) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (NotifyData.List) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (NotifyId.List) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (AppInfo) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (AppInfo.List) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Notification(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                NotifyData.Builder builder = this.payloadCase_ == 1 ? ((NotifyData) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(NotifyData.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((NotifyData) message);
                                    this.payload_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                i7 = 2;
                                NotifyId.Builder builder2 = this.payloadCase_ == 2 ? ((NotifyId) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(NotifyId.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((NotifyId) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                            } else if (tag == 26) {
                                i7 = 3;
                                NotifyData.List.Builder builder3 = this.payloadCase_ == 3 ? ((NotifyData.List) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(NotifyData.List.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((NotifyData.List) message3);
                                    this.payload_ = builder3.buildPartial();
                                }
                            } else if (tag == 34) {
                                i7 = 4;
                                NotifyId.List.Builder builder4 = this.payloadCase_ == 4 ? ((NotifyId.List) this.payload_).toBuilder() : null;
                                MessageLite message4 = codedInputStream.readMessage(NotifyId.List.PARSER, extensionRegistryLite);
                                this.payload_ = message4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((NotifyId.List) message4);
                                    this.payload_ = builder4.buildPartial();
                                }
                            } else if (tag == 42) {
                                i7 = 5;
                                AppInfo.Builder builder5 = this.payloadCase_ == 5 ? ((AppInfo) this.payload_).toBuilder() : null;
                                MessageLite message5 = codedInputStream.readMessage(AppInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message5;
                                if (builder5 != null) {
                                    builder5.mergeFrom((AppInfo) message5);
                                    this.payload_ = builder5.buildPartial();
                                }
                            } else if (tag == 50) {
                                i7 = 6;
                                AppInfo.List.Builder builder6 = this.payloadCase_ == 6 ? ((AppInfo.List) this.payload_).toBuilder() : null;
                                MessageLite message6 = codedInputStream.readMessage(AppInfo.List.PARSER, extensionRegistryLite);
                                this.payload_ = message6;
                                if (builder6 != null) {
                                    builder6.mergeFrom((AppInfo.List) message6);
                                    this.payload_ = builder6.buildPartial();
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

        public static Builder newBuilder(Notification notification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(notification);
        }

        public static Notification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Notification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Notification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Notification parseFrom(CodedInputStream codedInputStream) {
            return (Notification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Notification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Notification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Notification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Notification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Notification parseFrom(InputStream inputStream) {
            return (Notification) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Notification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Notification) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Notification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Notification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Notification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Notification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface NotificationOrBuilder extends MessageOrBuilder {
        AppInfo getAppInfo();

        AppInfo.List getAppInfoList();

        AppInfo.ListOrBuilder getAppInfoListOrBuilder();

        AppInfoOrBuilder getAppInfoOrBuilder();

        NotifyData getData();

        NotifyData.List getDataList();

        NotifyData.ListOrBuilder getDataListOrBuilder();

        NotifyDataOrBuilder getDataOrBuilder();

        NotifyId getId();

        NotifyId.List getIdList();

        NotifyId.ListOrBuilder getIdListOrBuilder();

        NotifyIdOrBuilder getIdOrBuilder();

        Notification.PayloadCase getPayloadCase();

        boolean hasAppInfo();

        boolean hasAppInfoList();

        boolean hasData();

        boolean hasDataList();

        boolean hasId();

        boolean hasIdList();
    }

    public static final class NotifyData extends GeneratedMessageV3 implements NotifyDataOrBuilder {
        public static final int APP_GROUP_FIELD_NUMBER = 9;
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int APP_NAME_FIELD_NUMBER = 2;
        public static final int CALL_TYPE_FIELD_NUMBER = 8;
        public static final int DATE_FIELD_NUMBER = 6;
        private static final NotifyData DEFAULT_INSTANCE = new NotifyData();

        @Deprecated
        public static final Parser<NotifyData> PARSER = new AbstractParser<NotifyData>() { // from class: com.zh.wear.protobuf.NotificationProtos.NotifyData.1
            @Override // com.google.protobuf.Parser
            public NotifyData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NotifyData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SUB_TITLE_FIELD_NUMBER = 4;
        public static final int TEXT_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int UID_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private volatile Object appGroup_;
        private volatile Object appId_;
        private volatile Object appName_;
        private int bitField0_;
        private int callType_;
        private volatile Object date_;
        private byte memoizedIsInitialized;
        private volatile Object subTitle_;
        private volatile Object text_;
        private volatile Object title_;
        private int uid_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NotifyDataOrBuilder {
            private Object appGroup_;
            private Object appId_;
            private Object appName_;
            private int bitField0_;
            private int callType_;
            private Object date_;
            private Object subTitle_;
            private Object text_;
            private Object title_;
            private int uid_;

            private Builder() {
                this.appId_ = "";
                this.appName_ = "";
                this.title_ = "";
                this.subTitle_ = "";
                this.text_ = "";
                this.date_ = "";
                this.callType_ = 0;
                this.appGroup_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_NotifyData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAppGroup() {
                this.bitField0_ &= -257;
                this.appGroup_ = NotifyData.getDefaultInstance().getAppGroup();
                onChanged();
                return this;
            }

            public Builder clearAppId() {
                this.bitField0_ &= -2;
                this.appId_ = NotifyData.getDefaultInstance().getAppId();
                onChanged();
                return this;
            }

            public Builder clearAppName() {
                this.bitField0_ &= -3;
                this.appName_ = NotifyData.getDefaultInstance().getAppName();
                onChanged();
                return this;
            }

            public Builder clearCallType() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.callType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDate() {
                this.bitField0_ &= -33;
                this.date_ = NotifyData.getDefaultInstance().getDate();
                onChanged();
                return this;
            }

            public Builder clearSubTitle() {
                this.bitField0_ &= -9;
                this.subTitle_ = NotifyData.getDefaultInstance().getSubTitle();
                onChanged();
                return this;
            }

            public Builder clearText() {
                this.bitField0_ &= -17;
                this.text_ = NotifyData.getDefaultInstance().getText();
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.bitField0_ &= -5;
                this.title_ = NotifyData.getDefaultInstance().getTitle();
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -65;
                this.uid_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public String getAppGroup() {
                Object obj = this.appGroup_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appGroup_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public ByteString getAppGroupBytes() {
                Object obj = this.appGroup_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appGroup_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public String getAppId() {
                Object obj = this.appId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public ByteString getAppIdBytes() {
                Object obj = this.appId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public CallType getCallType() {
                CallType callTypeValueOf = CallType.valueOf(this.callType_);
                return callTypeValueOf == null ? CallType.NOTHING : callTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public String getDate() {
                Object obj = this.date_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.date_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public ByteString getDateBytes() {
                Object obj = this.date_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.date_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_NotifyData_descriptor;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public String getSubTitle() {
                Object obj = this.subTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.subTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public ByteString getSubTitleBytes() {
                Object obj = this.subTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.subTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.text_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
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

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public int getUid() {
                return this.uid_;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasAppGroup() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasAppId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasAppName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasCallType() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasDate() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasSubTitle() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
            public boolean hasUid() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_NotifyData_fieldAccessorTable.ensureFieldAccessorsInitialized(NotifyData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppId() && hasAppName() && hasTitle() && hasSubTitle() && hasText() && hasDate() && hasUid();
            }

            public Builder setAppGroup(String str) {
                str.getClass();
                this.bitField0_ |= 256;
                this.appGroup_ = str;
                onChanged();
                return this;
            }

            public Builder setAppGroupBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 256;
                this.appGroup_ = byteString;
                onChanged();
                return this;
            }

            public Builder setAppId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.appId_ = str;
                onChanged();
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.appId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setAppName(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.appName_ = str;
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.appName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCallType(CallType callType) {
                callType.getClass();
                this.bitField0_ |= 128;
                this.callType_ = callType.getNumber();
                onChanged();
                return this;
            }

            public Builder setDate(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.date_ = str;
                onChanged();
                return this;
            }

            public Builder setDateBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.date_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSubTitle(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.subTitle_ = str;
                onChanged();
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.subTitle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.text_ = str;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.text_ = byteString;
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

            public Builder setUid(int i7) {
                this.bitField0_ |= 64;
                this.uid_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appId_ = "";
                this.appName_ = "";
                this.title_ = "";
                this.subTitle_ = "";
                this.text_ = "";
                this.date_ = "";
                this.callType_ = 0;
                this.appGroup_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotifyData build() {
                NotifyData notifyDataBuildPartial = buildPartial();
                if (notifyDataBuildPartial.isInitialized()) {
                    return notifyDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) notifyDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotifyData buildPartial() {
                NotifyData notifyData = new NotifyData(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                notifyData.appId_ = this.appId_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                notifyData.appName_ = this.appName_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                notifyData.title_ = this.title_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                notifyData.subTitle_ = this.subTitle_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                notifyData.text_ = this.text_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                notifyData.date_ = this.date_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                notifyData.uid_ = this.uid_;
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                notifyData.callType_ = this.callType_;
                if ((i7 & 256) == 256) {
                    i8 |= 256;
                }
                notifyData.appGroup_ = this.appGroup_;
                notifyData.bitField0_ = i8;
                onBuilt();
                return notifyData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NotifyData getDefaultInstanceForType() {
                return NotifyData.getDefaultInstance();
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
                this.appId_ = "";
                int i7 = this.bitField0_;
                this.appName_ = "";
                this.title_ = "";
                this.subTitle_ = "";
                this.text_ = "";
                this.date_ = "";
                this.uid_ = 0;
                this.callType_ = 0;
                this.appGroup_ = "";
                this.bitField0_ = i7 & WorkInfo.f43759p;
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
            public com.zh.wear.protobuf.NotificationProtos.NotifyData.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NotificationProtos$NotifyData> r1 = com.zh.wear.protobuf.NotificationProtos.NotifyData.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NotificationProtos$NotifyData r3 = (com.zh.wear.protobuf.NotificationProtos.NotifyData) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NotificationProtos$NotifyData r4 = (com.zh.wear.protobuf.NotificationProtos.NotifyData) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.NotifyData.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NotificationProtos$NotifyData$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NotifyData) {
                    return mergeFrom((NotifyData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NotifyData notifyData) {
                if (notifyData == NotifyData.getDefaultInstance()) {
                    return this;
                }
                if (notifyData.hasAppId()) {
                    this.bitField0_ |= 1;
                    this.appId_ = notifyData.appId_;
                    onChanged();
                }
                if (notifyData.hasAppName()) {
                    this.bitField0_ |= 2;
                    this.appName_ = notifyData.appName_;
                    onChanged();
                }
                if (notifyData.hasTitle()) {
                    this.bitField0_ |= 4;
                    this.title_ = notifyData.title_;
                    onChanged();
                }
                if (notifyData.hasSubTitle()) {
                    this.bitField0_ |= 8;
                    this.subTitle_ = notifyData.subTitle_;
                    onChanged();
                }
                if (notifyData.hasText()) {
                    this.bitField0_ |= 16;
                    this.text_ = notifyData.text_;
                    onChanged();
                }
                if (notifyData.hasDate()) {
                    this.bitField0_ |= 32;
                    this.date_ = notifyData.date_;
                    onChanged();
                }
                if (notifyData.hasUid()) {
                    setUid(notifyData.getUid());
                }
                if (notifyData.hasCallType()) {
                    setCallType(notifyData.getCallType());
                }
                if (notifyData.hasAppGroup()) {
                    this.bitField0_ |= 256;
                    this.appGroup_ = notifyData.appGroup_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) notifyData).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<NotifyData> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.NotificationProtos.NotifyData.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> listBuilder_;
                private java.util.List<NotifyData> list_;

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
                    return NotificationProtos.internal_static_NotifyData_List_descriptor;
                }

                private RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends NotifyData> iterable) {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(NotifyData.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return NotificationProtos.internal_static_NotifyData_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
                public NotifyData getList(int i7) {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (NotifyData) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
                public java.util.List<NotifyData> getListList() {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
                public NotifyDataOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (NotifyDataOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
                public java.util.List<? extends NotifyDataOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_NotifyData_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, NotifyData notifyData) {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, notifyData);
                        return this;
                    }
                    notifyData.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, notifyData);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, NotifyData.getDefaultInstance());
                }

                public Builder setList(int i7, NotifyData notifyData) {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, notifyData);
                        return this;
                    }
                    notifyData.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, notifyData);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(NotifyData notifyData) {
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(notifyData);
                        return this;
                    }
                    notifyData.getClass();
                    ensureListIsMutable();
                    this.list_.add(notifyData);
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
                    RepeatedFieldBuilderV3<NotifyData, Builder, NotifyDataOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.NotificationProtos.NotifyData.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.NotificationProtos$NotifyData$List> r1 = com.zh.wear.protobuf.NotificationProtos.NotifyData.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.NotificationProtos$NotifyData$List r3 = (com.zh.wear.protobuf.NotificationProtos.NotifyData.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.NotificationProtos$NotifyData$List r4 = (com.zh.wear.protobuf.NotificationProtos.NotifyData.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.NotifyData.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NotificationProtos$NotifyData$List$Builder");
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
                return NotificationProtos.internal_static_NotifyData_List_descriptor;
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

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
            public NotifyData getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
            public java.util.List<NotifyData> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
            public NotifyDataOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyData.ListOrBuilder
            public java.util.List<? extends NotifyDataOrBuilder> getListOrBuilderList() {
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
                return NotificationProtos.internal_static_NotifyData_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((NotifyData) codedInputStream.readMessage(NotifyData.PARSER, extensionRegistryLite));
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
            NotifyData getList(int i7);

            int getListCount();

            java.util.List<NotifyData> getListList();

            NotifyDataOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends NotifyDataOrBuilder> getListOrBuilderList();
        }

        private NotifyData() {
            this.memoizedIsInitialized = (byte) -1;
            this.appId_ = "";
            this.appName_ = "";
            this.title_ = "";
            this.subTitle_ = "";
            this.text_ = "";
            this.date_ = "";
            this.uid_ = 0;
            this.callType_ = 0;
            this.appGroup_ = "";
        }

        public static NotifyData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_NotifyData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NotifyData parseDelimitedFrom(InputStream inputStream) {
            return (NotifyData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NotifyData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<NotifyData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotifyData)) {
                return super.equals(obj);
            }
            NotifyData notifyData = (NotifyData) obj;
            boolean z6 = hasAppId() == notifyData.hasAppId();
            if (hasAppId()) {
                z6 = z6 && getAppId().equals(notifyData.getAppId());
            }
            boolean z7 = z6 && hasAppName() == notifyData.hasAppName();
            if (hasAppName()) {
                z7 = z7 && getAppName().equals(notifyData.getAppName());
            }
            boolean z8 = z7 && hasTitle() == notifyData.hasTitle();
            if (hasTitle()) {
                z8 = z8 && getTitle().equals(notifyData.getTitle());
            }
            boolean z9 = z8 && hasSubTitle() == notifyData.hasSubTitle();
            if (hasSubTitle()) {
                z9 = z9 && getSubTitle().equals(notifyData.getSubTitle());
            }
            boolean z10 = z9 && hasText() == notifyData.hasText();
            if (hasText()) {
                z10 = z10 && getText().equals(notifyData.getText());
            }
            boolean z11 = z10 && hasDate() == notifyData.hasDate();
            if (hasDate()) {
                z11 = z11 && getDate().equals(notifyData.getDate());
            }
            boolean z12 = z11 && hasUid() == notifyData.hasUid();
            if (hasUid()) {
                z12 = z12 && getUid() == notifyData.getUid();
            }
            boolean z13 = z12 && hasCallType() == notifyData.hasCallType();
            if (hasCallType()) {
                z13 = z13 && this.callType_ == notifyData.callType_;
            }
            boolean z14 = z13 && hasAppGroup() == notifyData.hasAppGroup();
            if (hasAppGroup()) {
                z14 = z14 && getAppGroup().equals(notifyData.getAppGroup());
            }
            return z14 && this.unknownFields.equals(notifyData.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public String getAppGroup() {
            Object obj = this.appGroup_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appGroup_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public ByteString getAppGroupBytes() {
            Object obj = this.appGroup_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appGroup_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public String getAppId() {
            Object obj = this.appId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public ByteString getAppIdBytes() {
            Object obj = this.appId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public CallType getCallType() {
            CallType callTypeValueOf = CallType.valueOf(this.callType_);
            return callTypeValueOf == null ? CallType.NOTHING : callTypeValueOf;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public String getDate() {
            Object obj = this.date_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.date_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public ByteString getDateBytes() {
            Object obj = this.date_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.date_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NotifyData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.appId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.appName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.title_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.subTitle_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.text_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeStringSize += GeneratedMessage.computeStringSize(6, this.date_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(7, this.uid_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(8, this.callType_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeStringSize += GeneratedMessage.computeStringSize(9, this.appGroup_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public String getSubTitle() {
            Object obj = this.subTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.subTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public ByteString getSubTitleBytes() {
            Object obj = this.subTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.subTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.text_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
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

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public int getUid() {
            return this.uid_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasAppGroup() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasAppName() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasCallType() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasDate() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasSubTitle() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyDataOrBuilder
        public boolean hasUid() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAppId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAppId().hashCode();
            }
            if (hasAppName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAppName().hashCode();
            }
            if (hasTitle()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTitle().hashCode();
            }
            if (hasSubTitle()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSubTitle().hashCode();
            }
            if (hasText()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getText().hashCode();
            }
            if (hasDate()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getDate().hashCode();
            }
            if (hasUid()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getUid();
            }
            if (hasCallType()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + this.callType_;
            }
            if (hasAppGroup()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getAppGroup().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_NotifyData_fieldAccessorTable.ensureFieldAccessorsInitialized(NotifyData.class, Builder.class);
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
            if (!hasAppId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAppName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSubTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasText()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDate()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUid()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.appId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.appName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.title_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.subTitle_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.text_);
            }
            if ((this.bitField0_ & 32) == 32) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.date_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeUInt32(7, this.uid_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeEnum(8, this.callType_);
            }
            if ((this.bitField0_ & 256) == 256) {
                GeneratedMessage.writeString(codedOutputStream, 9, this.appGroup_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private NotifyData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.appId_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.appName_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.title_ = bytes3;
                            } else if (tag == 34) {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.subTitle_ = bytes4;
                            } else if (tag == 42) {
                                ByteString bytes5 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.text_ = bytes5;
                            } else if (tag == 50) {
                                ByteString bytes6 = codedInputStream.readBytes();
                                this.bitField0_ |= 32;
                                this.date_ = bytes6;
                            } else if (tag == 56) {
                                this.bitField0_ |= 64;
                                this.uid_ = codedInputStream.readUInt32();
                            } else if (tag == 64) {
                                int i7 = codedInputStream.readEnum();
                                if (CallType.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(8, i7);
                                } else {
                                    this.bitField0_ |= 128;
                                    this.callType_ = i7;
                                }
                            } else if (tag == 74) {
                                ByteString bytes7 = codedInputStream.readBytes();
                                this.bitField0_ |= 256;
                                this.appGroup_ = bytes7;
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

        public static Builder newBuilder(NotifyData notifyData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(notifyData);
        }

        public static NotifyData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotifyData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotifyData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NotifyData parseFrom(CodedInputStream codedInputStream) {
            return (NotifyData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NotifyData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private NotifyData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NotifyData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotifyData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NotifyData parseFrom(InputStream inputStream) {
            return (NotifyData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static NotifyData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotifyData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotifyData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static NotifyData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static NotifyData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NotifyData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface NotifyDataOrBuilder extends MessageOrBuilder {
        String getAppGroup();

        ByteString getAppGroupBytes();

        String getAppId();

        ByteString getAppIdBytes();

        String getAppName();

        ByteString getAppNameBytes();

        CallType getCallType();

        String getDate();

        ByteString getDateBytes();

        String getSubTitle();

        ByteString getSubTitleBytes();

        String getText();

        ByteString getTextBytes();

        String getTitle();

        ByteString getTitleBytes();

        int getUid();

        boolean hasAppGroup();

        boolean hasAppId();

        boolean hasAppName();

        boolean hasCallType();

        boolean hasDate();

        boolean hasSubTitle();

        boolean hasText();

        boolean hasTitle();

        boolean hasUid();
    }

    public static final class NotifyId extends GeneratedMessageV3 implements NotifyIdOrBuilder {
        public static final int APP_GROUP_FIELD_NUMBER = 3;
        public static final int APP_ID_FIELD_NUMBER = 2;
        private static final NotifyId DEFAULT_INSTANCE = new NotifyId();

        @Deprecated
        public static final Parser<NotifyId> PARSER = new AbstractParser<NotifyId>() { // from class: com.zh.wear.protobuf.NotificationProtos.NotifyId.1
            @Override // com.google.protobuf.Parser
            public NotifyId parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NotifyId(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int UID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object appGroup_;
        private volatile Object appId_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int uid_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NotifyIdOrBuilder {
            private Object appGroup_;
            private Object appId_;
            private int bitField0_;
            private int uid_;

            private Builder() {
                this.appId_ = "";
                this.appGroup_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_NotifyId_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAppGroup() {
                this.bitField0_ &= -5;
                this.appGroup_ = NotifyId.getDefaultInstance().getAppGroup();
                onChanged();
                return this;
            }

            public Builder clearAppId() {
                this.bitField0_ &= -3;
                this.appId_ = NotifyId.getDefaultInstance().getAppId();
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public String getAppGroup() {
                Object obj = this.appGroup_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appGroup_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public ByteString getAppGroupBytes() {
                Object obj = this.appGroup_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appGroup_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public String getAppId() {
                Object obj = this.appId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public ByteString getAppIdBytes() {
                Object obj = this.appId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_NotifyId_descriptor;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public int getUid() {
                return this.uid_;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public boolean hasAppGroup() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public boolean hasAppId() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
            public boolean hasUid() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_NotifyId_fieldAccessorTable.ensureFieldAccessorsInitialized(NotifyId.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUid();
            }

            public Builder setAppGroup(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.appGroup_ = str;
                onChanged();
                return this;
            }

            public Builder setAppGroupBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.appGroup_ = byteString;
                onChanged();
                return this;
            }

            public Builder setAppId(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.appId_ = str;
                onChanged();
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.appId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setUid(int i7) {
                this.bitField0_ |= 1;
                this.uid_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appId_ = "";
                this.appGroup_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotifyId build() {
                NotifyId notifyIdBuildPartial = buildPartial();
                if (notifyIdBuildPartial.isInitialized()) {
                    return notifyIdBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) notifyIdBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotifyId buildPartial() {
                NotifyId notifyId = new NotifyId(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                notifyId.uid_ = this.uid_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                notifyId.appId_ = this.appId_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                notifyId.appGroup_ = this.appGroup_;
                notifyId.bitField0_ = i8;
                onBuilt();
                return notifyId;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NotifyId getDefaultInstanceForType() {
                return NotifyId.getDefaultInstance();
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
                this.uid_ = 0;
                int i7 = this.bitField0_;
                this.appId_ = "";
                this.appGroup_ = "";
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
            public com.zh.wear.protobuf.NotificationProtos.NotifyId.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.NotificationProtos$NotifyId> r1 = com.zh.wear.protobuf.NotificationProtos.NotifyId.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.NotificationProtos$NotifyId r3 = (com.zh.wear.protobuf.NotificationProtos.NotifyId) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.NotificationProtos$NotifyId r4 = (com.zh.wear.protobuf.NotificationProtos.NotifyId) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.NotifyId.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NotificationProtos$NotifyId$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NotifyId) {
                    return mergeFrom((NotifyId) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NotifyId notifyId) {
                if (notifyId == NotifyId.getDefaultInstance()) {
                    return this;
                }
                if (notifyId.hasUid()) {
                    setUid(notifyId.getUid());
                }
                if (notifyId.hasAppId()) {
                    this.bitField0_ |= 2;
                    this.appId_ = notifyId.appId_;
                    onChanged();
                }
                if (notifyId.hasAppGroup()) {
                    this.bitField0_ |= 4;
                    this.appGroup_ = notifyId.appGroup_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) notifyId).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<NotifyId> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.NotificationProtos.NotifyId.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> listBuilder_;
                private java.util.List<NotifyId> list_;

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
                    return NotificationProtos.internal_static_NotifyId_List_descriptor;
                }

                private RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends NotifyId> iterable) {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(NotifyId.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return NotificationProtos.internal_static_NotifyId_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
                public NotifyId getList(int i7) {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (NotifyId) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
                public java.util.List<NotifyId> getListList() {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
                public NotifyIdOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (NotifyIdOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
                public java.util.List<? extends NotifyIdOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_NotifyId_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, NotifyId notifyId) {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, notifyId);
                        return this;
                    }
                    notifyId.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, notifyId);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, NotifyId.getDefaultInstance());
                }

                public Builder setList(int i7, NotifyId notifyId) {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, notifyId);
                        return this;
                    }
                    notifyId.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, notifyId);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(NotifyId notifyId) {
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(notifyId);
                        return this;
                    }
                    notifyId.getClass();
                    ensureListIsMutable();
                    this.list_.add(notifyId);
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
                    RepeatedFieldBuilderV3<NotifyId, Builder, NotifyIdOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.NotificationProtos.NotifyId.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.NotificationProtos$NotifyId$List> r1 = com.zh.wear.protobuf.NotificationProtos.NotifyId.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.NotificationProtos$NotifyId$List r3 = (com.zh.wear.protobuf.NotificationProtos.NotifyId.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.NotificationProtos$NotifyId$List r4 = (com.zh.wear.protobuf.NotificationProtos.NotifyId.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.NotificationProtos.NotifyId.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.NotificationProtos$NotifyId$List$Builder");
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
                return NotificationProtos.internal_static_NotifyId_List_descriptor;
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

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
            public NotifyId getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
            public java.util.List<NotifyId> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
            public NotifyIdOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.NotificationProtos.NotifyId.ListOrBuilder
            public java.util.List<? extends NotifyIdOrBuilder> getListOrBuilderList() {
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
                return NotificationProtos.internal_static_NotifyId_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((NotifyId) codedInputStream.readMessage(NotifyId.PARSER, extensionRegistryLite));
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
            NotifyId getList(int i7);

            int getListCount();

            java.util.List<NotifyId> getListList();

            NotifyIdOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends NotifyIdOrBuilder> getListOrBuilderList();
        }

        private NotifyId() {
            this.memoizedIsInitialized = (byte) -1;
            this.uid_ = 0;
            this.appId_ = "";
            this.appGroup_ = "";
        }

        public static NotifyId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_NotifyId_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NotifyId parseDelimitedFrom(InputStream inputStream) {
            return (NotifyId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NotifyId parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<NotifyId> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotifyId)) {
                return super.equals(obj);
            }
            NotifyId notifyId = (NotifyId) obj;
            boolean z6 = hasUid() == notifyId.hasUid();
            if (hasUid()) {
                z6 = z6 && getUid() == notifyId.getUid();
            }
            boolean z7 = z6 && hasAppId() == notifyId.hasAppId();
            if (hasAppId()) {
                z7 = z7 && getAppId().equals(notifyId.getAppId());
            }
            boolean z8 = z7 && hasAppGroup() == notifyId.hasAppGroup();
            if (hasAppGroup()) {
                z8 = z8 && getAppGroup().equals(notifyId.getAppGroup());
            }
            return z8 && this.unknownFields.equals(notifyId.unknownFields);
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public String getAppGroup() {
            Object obj = this.appGroup_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appGroup_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public ByteString getAppGroupBytes() {
            Object obj = this.appGroup_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appGroup_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public String getAppId() {
            Object obj = this.appId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public ByteString getAppIdBytes() {
            Object obj = this.appId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NotifyId> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.uid_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(2, this.appId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(3, this.appGroup_);
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public int getUid() {
            return this.uid_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public boolean hasAppGroup() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.NotificationProtos.NotifyIdOrBuilder
        public boolean hasUid() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasUid()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUid();
            }
            if (hasAppId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAppId().hashCode();
            }
            if (hasAppGroup()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAppGroup().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_NotifyId_fieldAccessorTable.ensureFieldAccessorsInitialized(NotifyId.class, Builder.class);
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
            if (hasUid()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeUInt32(1, this.uid_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.appId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.appGroup_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private NotifyId(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.uid_ = codedInputStream.readUInt32();
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.appId_ = bytes;
                            } else if (tag == 26) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.appGroup_ = bytes2;
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

        public static Builder newBuilder(NotifyId notifyId) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(notifyId);
        }

        public static NotifyId parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotifyId) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotifyId parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NotifyId parseFrom(CodedInputStream codedInputStream) {
            return (NotifyId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NotifyId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private NotifyId(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NotifyId parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotifyId) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NotifyId parseFrom(InputStream inputStream) {
            return (NotifyId) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static NotifyId parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotifyId) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotifyId parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static NotifyId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static NotifyId parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NotifyId parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface NotifyIdOrBuilder extends MessageOrBuilder {
        String getAppGroup();

        ByteString getAppGroupBytes();

        String getAppId();

        ByteString getAppIdBytes();

        int getUid();

        boolean hasAppGroup();

        boolean hasAppId();

        boolean hasUid();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017wear_notification.proto\u001a\fnanopb.proto\"Ø\u0002\n\fNotification\u0012\u001b\n\u0004data\u0018\u0001 \u0001(\u000b2\u000b.NotifyDataH\u0000\u0012\u0017\n\u0002id\u0018\u0002 \u0001(\u000b2\t.NotifyIdH\u0000\u0012%\n\tdata_list\u0018\u0003 \u0001(\u000b2\u0010.NotifyData.ListH\u0000\u0012!\n\u0007id_list\u0018\u0004 \u0001(\u000b2\u000e.NotifyId.ListH\u0000\u0012&\n\rapp_info_list\u0018\u0006 \u0001(\u000b2\r.AppInfo.ListH\u0000\u0012\u001c\n\bapp_info\u0018\u0005 \u0001(\u000b2\b.AppInfoH\u0000\"w\n\u000eNotificationID\u0012\u000e\n\nADD_NOTIFY\u0010\u0000\u0012\u0011\n\rREMOVE_NOTIFY\u0010\u0001\u0012\u000b\n\u0007HANG_UP\u0010\u0002\u0012\u0016\n\u0012INCOMING_CALL_MUTE\u0010\u0005\u0012\u0010\n\fGET_APP_LIST\u0010\u0003\u0012\u000b\n\u0007SET_APP\u0010\u0004B\t\n\u0007payload\"\u0085\u0002\n\nNotifyData\u0012\u0015\n\u0006app_id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\bapp_name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005title\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tsub_title\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004text\u0018\u0005 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004date\u0018\u0006 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u000b\n\u0003uid\u0018\u0007 \u0002(\r\u0012\u001c\n\tcall_type\u0018\b \u0001(\u000e2\t.CallType\u0012\u0018\n\tapp_group\u0018\t \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u001a(\n\u0004List\u0012 \n\u0004list\u0018\u0001 \u0003(\u000b2\u000b.NotifyDataB\u0005\u0092?\u0002\u0018\u0004\"p\n\bNotifyId\u0012\u000b\n\u0003uid\u0018\u0001 \u0002(\r\u0012\u0015\n\u0006app_id\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tapp_group\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u001a&\n\u0004List\u0012\u001e\n\u0004list\u0018\u0001 \u0003(\u000b2\t.NotifyIdB\u0005\u0092?\u0002\u0018\u0004\"¨\u0001\n\u0007AppInfo\u0012\u0017\n\bapp_type\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u000e\n\u0006enable\u0018\u0002 \u0002(\b\u001a%\n\u0004List\u0012\u001d\n\u0004list\u0018\u0001 \u0003(\u000b2\b.AppInfoB\u0005\u0092?\u0002\u0018\u0004\"M\n\u0004Type\u0012\u0010\n\fNOTIFICATION\u0010\u0000\u0012\b\n\u0004CALL\u0010\u0001\u0012\n\n\u0006WECHAT\u0010\u0002\u0012\u0006\n\u0002QQ\u0010\u0003\u0012\n\n\u0006ALIPAY\u0010\u0004\u0012\t\n\u0005OTHER\u0010\u0005*;\n\bCallType\u0012\u000b\n\u0007NOTHING\u0010\u0000\u0012\u0011\n\rINCOMING_CALL\u0010\u0001\u0012\u000f\n\u000bMISSED_CALL\u0010\u0002B*\n\u0014com.zh.wear.protobufB\u0012NotificationProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.NotificationProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = NotificationProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Notification_descriptor = descriptor2;
        internal_static_Notification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Data", "Id", "DataList", "IdList", "AppInfoList", "AppInfo", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_NotifyData_descriptor = descriptor3;
        internal_static_NotifyData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AppId", "AppName", "Title", "SubTitle", "Text", HttpHeaders.f97097d, "Uid", "CallType", "AppGroup"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_NotifyData_List_descriptor = descriptor4;
        internal_static_NotifyData_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(2);
        internal_static_NotifyId_descriptor = descriptor5;
        internal_static_NotifyId_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Uid", "AppId", "AppGroup"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_NotifyId_List_descriptor = descriptor6;
        internal_static_NotifyId_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(3);
        internal_static_AppInfo_descriptor = descriptor7;
        internal_static_AppInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AppType", "Enable"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_AppInfo_List_descriptor = descriptor8;
        internal_static_AppInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{MessageLiteToString.f20028a});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private NotificationProtos() {
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