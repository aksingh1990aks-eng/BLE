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
import com.huawei.hms.hmsscankit.DetailRect;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_ApkInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ApkInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Apk_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Apk_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Apk_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Apk_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_InstallProgress_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_InstallProgress_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Market_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Market_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.MarketProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$MarketProtos$Apk$PayloadCase;
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$MarketProtos$Market$PayloadCase;

        static {
            int[] iArr = new int[Apk.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$MarketProtos$Apk$PayloadCase = iArr;
            try {
                iArr[Apk.PayloadCase.PACKAGE_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MarketProtos$Apk$PayloadCase[Apk.PayloadCase.URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MarketProtos$Apk$PayloadCase[Apk.PayloadCase.APK_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MarketProtos$Apk$PayloadCase[Apk.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Market.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$MarketProtos$Market$PayloadCase = iArr2;
            try {
                iArr2[Market.PayloadCase.APK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MarketProtos$Market$PayloadCase[Market.PayloadCase.APK_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MarketProtos$Market$PayloadCase[Market.PayloadCase.INSTALL_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$MarketProtos$Market$PayloadCase[Market.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class Apk extends GeneratedMessageV3 implements ApkOrBuilder {
        public static final int APK_INFO_FIELD_NUMBER = 4;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private int type_;
        private static final Apk DEFAULT_INSTANCE = new Apk();

        @Deprecated
        public static final Parser<Apk> PARSER = new AbstractParser<Apk>() { // from class: com.zh.wear.protobuf.MarketProtos.Apk.1
            @Override // com.google.protobuf.Parser
            public Apk parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Apk(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ApkOrBuilder {
            private SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> apkInfoBuilder_;
            private int bitField0_;
            private int payloadCase_;
            private Object payload_;
            private int type_;

            private Builder() {
                this.payloadCase_ = 0;
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> getApkInfoFieldBuilder() {
                if (this.apkInfoBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = ApkInfo.getDefaultInstance();
                    }
                    this.apkInfoBuilder_ = new SingleFieldBuilderV3<>((ApkInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.apkInfoBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MarketProtos.internal_static_Apk_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearApkInfo() {
                SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> singleFieldBuilderV3 = this.apkInfoBuilder_;
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

            public Builder clearPackageName() {
                if (this.payloadCase_ == 2) {
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

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public ApkInfo getApkInfo() {
                Object message;
                SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> singleFieldBuilderV3 = this.apkInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 4) {
                        return ApkInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 4) {
                        return ApkInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ApkInfo) message;
            }

            public ApkInfo.Builder getApkInfoBuilder() {
                return (ApkInfo.Builder) getApkInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public ApkInfoOrBuilder getApkInfoOrBuilder() {
                SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilderV3 = this.apkInfoBuilder_) == null) ? i7 == 4 ? (ApkInfo) this.payload_ : ApkInfo.getDefaultInstance() : (ApkInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MarketProtos.internal_static_Apk_descriptor;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public String getPackageName() {
                String str = this.payloadCase_ == 2 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 2 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public ByteString getPackageNameBytes() {
                String str = this.payloadCase_ == 2 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 2) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public ApkType getType() {
                ApkType apkTypeValueOf = ApkType.valueOf(this.type_);
                return apkTypeValueOf == null ? ApkType.APP : apkTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public String getUrl() {
                String str = this.payloadCase_ == 3 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 3 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public ByteString getUrlBytes() {
                String str = this.payloadCase_ == 3 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 3) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public boolean hasApkInfo() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public boolean hasPackageName() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
            public boolean hasUrl() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MarketProtos.internal_static_Apk_fieldAccessorTable.ensureFieldAccessorsInitialized(Apk.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasType()) {
                    return !hasApkInfo() || getApkInfo().isInitialized();
                }
                return false;
            }

            public Builder mergeApkInfo(ApkInfo apkInfo) {
                SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> singleFieldBuilderV3 = this.apkInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4 && this.payload_ != ApkInfo.getDefaultInstance()) {
                        apkInfo = ApkInfo.newBuilder((ApkInfo) this.payload_).mergeFrom(apkInfo).buildPartial();
                    }
                    this.payload_ = apkInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(apkInfo);
                    }
                    this.apkInfoBuilder_.setMessage(apkInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setApkInfo(ApkInfo.Builder builder) {
                SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> singleFieldBuilderV3 = this.apkInfoBuilder_;
                ApkInfo apkInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = apkInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(apkInfoBuild);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setPackageName(String str) {
                str.getClass();
                this.payloadCase_ = 2;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setPackageNameBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 2;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(ApkType apkType) {
                apkType.getClass();
                this.bitField0_ |= 1;
                this.type_ = apkType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.payloadCase_ = 3;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 3;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setApkInfo(ApkInfo apkInfo) {
                SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> singleFieldBuilderV3 = this.apkInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    apkInfo.getClass();
                    this.payload_ = apkInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(apkInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Apk build() {
                Apk apkBuildPartial = buildPartial();
                if (apkBuildPartial.isInitialized()) {
                    return apkBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) apkBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Apk buildPartial() {
                Apk apk = new Apk(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                apk.type_ = this.type_;
                if (this.payloadCase_ == 2) {
                    apk.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 3) {
                    apk.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 4) {
                    SingleFieldBuilderV3<ApkInfo, ApkInfo.Builder, ApkInfoOrBuilder> singleFieldBuilderV3 = this.apkInfoBuilder_;
                    apk.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                apk.bitField0_ = i7;
                apk.payloadCase_ = this.payloadCase_;
                onBuilt();
                return apk;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Apk getDefaultInstanceForType() {
                return Apk.getDefaultInstance();
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
                this.type_ = 0;
                this.bitField0_ &= -2;
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
            public com.zh.wear.protobuf.MarketProtos.Apk.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.MarketProtos$Apk> r1 = com.zh.wear.protobuf.MarketProtos.Apk.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.MarketProtos$Apk r3 = (com.zh.wear.protobuf.MarketProtos.Apk) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.MarketProtos$Apk r4 = (com.zh.wear.protobuf.MarketProtos.Apk) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MarketProtos.Apk.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MarketProtos$Apk$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Apk) {
                    return mergeFrom((Apk) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Apk apk) {
                if (apk == Apk.getDefaultInstance()) {
                    return this;
                }
                if (apk.hasType()) {
                    setType(apk.getType());
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$MarketProtos$Apk$PayloadCase[apk.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    this.payloadCase_ = 2;
                } else {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            mergeApkInfo(apk.getApkInfo());
                        }
                        mergeUnknownFields(((GeneratedMessage) apk).unknownFields);
                        onChanged();
                        return this;
                    }
                    this.payloadCase_ = 3;
                }
                this.payload_ = apk.payload_;
                onChanged();
                mergeUnknownFields(((GeneratedMessage) apk).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<Apk> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.MarketProtos.Apk.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> listBuilder_;
                private java.util.List<Apk> list_;

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
                    return MarketProtos.internal_static_Apk_List_descriptor;
                }

                private RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends Apk> iterable) {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(Apk.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return MarketProtos.internal_static_Apk_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
                public Apk getList(int i7) {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (Apk) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
                public java.util.List<Apk> getListList() {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
                public ApkOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (ApkOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
                public java.util.List<? extends ApkOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return MarketProtos.internal_static_Apk_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, Apk apk) {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, apk);
                        return this;
                    }
                    apk.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, apk);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, Apk.getDefaultInstance());
                }

                public Builder setList(int i7, Apk apk) {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, apk);
                        return this;
                    }
                    apk.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, apk);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(Apk apk) {
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(apk);
                        return this;
                    }
                    apk.getClass();
                    ensureListIsMutable();
                    this.list_.add(apk);
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
                    RepeatedFieldBuilderV3<Apk, Builder, ApkOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.MarketProtos.Apk.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.MarketProtos$Apk$List> r1 = com.zh.wear.protobuf.MarketProtos.Apk.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.MarketProtos$Apk$List r3 = (com.zh.wear.protobuf.MarketProtos.Apk.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.MarketProtos$Apk$List r4 = (com.zh.wear.protobuf.MarketProtos.Apk.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MarketProtos.Apk.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MarketProtos$Apk$List$Builder");
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
                return MarketProtos.internal_static_Apk_List_descriptor;
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

            @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
            public Apk getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
            public java.util.List<Apk> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
            public ApkOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.MarketProtos.Apk.ListOrBuilder
            public java.util.List<? extends ApkOrBuilder> getListOrBuilderList() {
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
                return MarketProtos.internal_static_Apk_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((Apk) codedInputStream.readMessage(Apk.PARSER, extensionRegistryLite));
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
            Apk getList(int i7);

            int getListCount();

            java.util.List<Apk> getListList();

            ApkOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends ApkOrBuilder> getListOrBuilderList();
        }

        public enum PayloadCase implements Internal.EnumLite {
            PACKAGE_NAME(2),
            URL(3),
            APK_INFO(4),
            PAYLOAD_NOT_SET(0);

            private final int value;

            PayloadCase(int i7) {
                this.value = i7;
            }

            public static PayloadCase forNumber(int i7) {
                if (i7 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i7 == 2) {
                    return PACKAGE_NAME;
                }
                if (i7 == 3) {
                    return URL;
                }
                if (i7 != 4) {
                    return null;
                }
                return APK_INFO;
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

        private Apk() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static Apk getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MarketProtos.internal_static_Apk_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Apk parseDelimitedFrom(InputStream inputStream) {
            return (Apk) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Apk parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Apk> parser() {
            return PARSER;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.MarketProtos.Apk
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.MarketProtos$Apk r6 = (com.zh.wear.protobuf.MarketProtos.Apk) r6
                boolean r1 = r5.hasType()
                boolean r2 = r6.hasType()
                r3 = 0
                if (r1 != r2) goto L1c
                r1 = r0
                goto L1d
            L1c:
                r1 = r3
            L1d:
                boolean r2 = r5.hasType()
                if (r2 == 0) goto L2e
                if (r1 == 0) goto L2d
                int r1 = r5.type_
                int r2 = r6.type_
                if (r1 != r2) goto L2d
                r1 = r0
                goto L2e
            L2d:
                r1 = r3
            L2e:
                if (r1 == 0) goto L40
                com.zh.wear.protobuf.MarketProtos$Apk$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.MarketProtos$Apk$PayloadCase r2 = r6.getPayloadCase()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L40
                r1 = r0
                goto L41
            L40:
                r1 = r3
            L41:
                if (r1 != 0) goto L44
                return r3
            L44:
                int r2 = r5.payloadCase_
                r4 = 2
                if (r2 == r4) goto L72
                r4 = 3
                if (r2 == r4) goto L61
                r4 = 4
                if (r2 == r4) goto L50
                goto L85
            L50:
                if (r1 == 0) goto L84
                com.zh.wear.protobuf.MarketProtos$ApkInfo r1 = r5.getApkInfo()
                com.zh.wear.protobuf.MarketProtos$ApkInfo r2 = r6.getApkInfo()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L84
                goto L82
            L61:
                if (r1 == 0) goto L84
                java.lang.String r1 = r5.getUrl()
                java.lang.String r2 = r6.getUrl()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L84
                goto L82
            L72:
                if (r1 == 0) goto L84
                java.lang.String r1 = r5.getPackageName()
                java.lang.String r2 = r6.getPackageName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L84
            L82:
                r1 = r0
                goto L85
            L84:
                r1 = r3
            L85:
                if (r1 == 0) goto L92
                com.google.protobuf.UnknownFieldSet r1 = r5.unknownFields
                com.google.protobuf.UnknownFieldSet r6 = r6.unknownFields
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L92
                return r0
            L92:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MarketProtos.Apk.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public ApkInfo getApkInfo() {
            return this.payloadCase_ == 4 ? (ApkInfo) this.payload_ : ApkInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public ApkInfoOrBuilder getApkInfoOrBuilder() {
            return this.payloadCase_ == 4 ? (ApkInfo) this.payload_ : ApkInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public String getPackageName() {
            String str = this.payloadCase_ == 2 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 2) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public ByteString getPackageNameBytes() {
            String str = this.payloadCase_ == 2 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 2) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Apk> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, (ApkInfo) this.payload_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public ApkType getType() {
            ApkType apkTypeValueOf = ApkType.valueOf(this.type_);
            return apkTypeValueOf == null ? ApkType.APP : apkTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public String getUrl() {
            String str = this.payloadCase_ == 3 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 3) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public ByteString getUrlBytes() {
            String str = this.payloadCase_ == 3 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 3) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public boolean hasApkInfo() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public boolean hasPackageName() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkOrBuilder
        public boolean hasUrl() {
            return this.payloadCase_ == 3;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            String packageName;
            int iHashCode;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode2 = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasType()) {
                iHashCode2 = (((iHashCode2 * 37) + 1) * 53) + this.type_;
            }
            int i9 = this.payloadCase_;
            if (i9 == 2) {
                i7 = ((iHashCode2 * 37) + 2) * 53;
                packageName = getPackageName();
            } else {
                if (i9 != 3) {
                    if (i9 == 4) {
                        i7 = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = getApkInfo().hashCode();
                        iHashCode2 = i7 + iHashCode;
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i7 = ((iHashCode2 * 37) + 3) * 53;
                packageName = getUrl();
            }
            iHashCode = packageName.hashCode();
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MarketProtos.internal_static_Apk_fieldAccessorTable.ensureFieldAccessorsInitialized(Apk.class, Builder.class);
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
            if (!hasApkInfo() || getApkInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (this.payloadCase_ == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (ApkInfo) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Apk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            ByteString bytes;
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
                                    bytes = codedInputStream.readBytes();
                                    this.payloadCase_ = 2;
                                } else if (tag == 26) {
                                    bytes = codedInputStream.readBytes();
                                    this.payloadCase_ = 3;
                                } else if (tag == 34) {
                                    ApkInfo.Builder builder = this.payloadCase_ == 4 ? ((ApkInfo) this.payload_).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(ApkInfo.PARSER, extensionRegistryLite);
                                    this.payload_ = message;
                                    if (builder != null) {
                                        builder.mergeFrom((ApkInfo) message);
                                        this.payload_ = builder.buildPartial();
                                    }
                                    this.payloadCase_ = 4;
                                } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                                this.payload_ = bytes;
                            } else {
                                int i7 = codedInputStream.readEnum();
                                if (ApkType.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.type_ = i7;
                                }
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

        public static Builder newBuilder(Apk apk) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(apk);
        }

        public static Apk parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Apk) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Apk parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Apk parseFrom(CodedInputStream codedInputStream) {
            return (Apk) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Apk getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Apk(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Apk parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Apk) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Apk parseFrom(InputStream inputStream) {
            return (Apk) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Apk parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Apk) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Apk parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Apk parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Apk parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Apk parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public static final class ApkInfo extends GeneratedMessageV3 implements ApkInfoOrBuilder {
        public static final int PACKAGE_HASH_FIELD_NUMBER = 2;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        public static final int VERSION_CODE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object packageHash_;
        private volatile Object packageName_;
        private long versionCode_;
        private static final ApkInfo DEFAULT_INSTANCE = new ApkInfo();

        @Deprecated
        public static final Parser<ApkInfo> PARSER = new AbstractParser<ApkInfo>() { // from class: com.zh.wear.protobuf.MarketProtos.ApkInfo.1
            @Override // com.google.protobuf.Parser
            public ApkInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ApkInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ApkInfoOrBuilder {
            private int bitField0_;
            private Object packageHash_;
            private Object packageName_;
            private long versionCode_;

            private Builder() {
                this.packageName_ = "";
                this.packageHash_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MarketProtos.internal_static_ApkInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearPackageHash() {
                this.bitField0_ &= -3;
                this.packageHash_ = ApkInfo.getDefaultInstance().getPackageHash();
                onChanged();
                return this;
            }

            public Builder clearPackageName() {
                this.bitField0_ &= -2;
                this.packageName_ = ApkInfo.getDefaultInstance().getPackageName();
                onChanged();
                return this;
            }

            public Builder clearVersionCode() {
                this.bitField0_ &= -5;
                this.versionCode_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MarketProtos.internal_static_ApkInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public String getPackageHash() {
                Object obj = this.packageHash_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.packageHash_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public ByteString getPackageHashBytes() {
                Object obj = this.packageHash_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.packageHash_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public String getPackageName() {
                Object obj = this.packageName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.packageName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public ByteString getPackageNameBytes() {
                Object obj = this.packageName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.packageName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public long getVersionCode() {
                return this.versionCode_;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public boolean hasPackageHash() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public boolean hasPackageName() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MarketProtos.internal_static_ApkInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ApkInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPackageName() && hasPackageHash() && hasVersionCode();
            }

            public Builder setPackageHash(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.packageHash_ = str;
                onChanged();
                return this;
            }

            public Builder setPackageHashBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.packageHash_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPackageName(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.packageName_ = str;
                onChanged();
                return this;
            }

            public Builder setPackageNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.packageName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVersionCode(long j7) {
                this.bitField0_ |= 4;
                this.versionCode_ = j7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.packageName_ = "";
                this.packageHash_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApkInfo build() {
                ApkInfo apkInfoBuildPartial = buildPartial();
                if (apkInfoBuildPartial.isInitialized()) {
                    return apkInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) apkInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApkInfo buildPartial() {
                ApkInfo apkInfo = new ApkInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                apkInfo.packageName_ = this.packageName_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                apkInfo.packageHash_ = this.packageHash_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                apkInfo.versionCode_ = this.versionCode_;
                apkInfo.bitField0_ = i8;
                onBuilt();
                return apkInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ApkInfo getDefaultInstanceForType() {
                return ApkInfo.getDefaultInstance();
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
                this.packageName_ = "";
                int i7 = this.bitField0_;
                this.packageHash_ = "";
                this.versionCode_ = 0L;
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
            public com.zh.wear.protobuf.MarketProtos.ApkInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.MarketProtos$ApkInfo> r1 = com.zh.wear.protobuf.MarketProtos.ApkInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.MarketProtos$ApkInfo r3 = (com.zh.wear.protobuf.MarketProtos.ApkInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.MarketProtos$ApkInfo r4 = (com.zh.wear.protobuf.MarketProtos.ApkInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MarketProtos.ApkInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MarketProtos$ApkInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ApkInfo) {
                    return mergeFrom((ApkInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ApkInfo apkInfo) {
                if (apkInfo == ApkInfo.getDefaultInstance()) {
                    return this;
                }
                if (apkInfo.hasPackageName()) {
                    this.bitField0_ |= 1;
                    this.packageName_ = apkInfo.packageName_;
                    onChanged();
                }
                if (apkInfo.hasPackageHash()) {
                    this.bitField0_ |= 2;
                    this.packageHash_ = apkInfo.packageHash_;
                    onChanged();
                }
                if (apkInfo.hasVersionCode()) {
                    setVersionCode(apkInfo.getVersionCode());
                }
                mergeUnknownFields(((GeneratedMessage) apkInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        private ApkInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.packageName_ = "";
            this.packageHash_ = "";
            this.versionCode_ = 0L;
        }

        public static ApkInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MarketProtos.internal_static_ApkInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ApkInfo parseDelimitedFrom(InputStream inputStream) {
            return (ApkInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ApkInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ApkInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ApkInfo)) {
                return super.equals(obj);
            }
            ApkInfo apkInfo = (ApkInfo) obj;
            boolean z6 = hasPackageName() == apkInfo.hasPackageName();
            if (hasPackageName()) {
                z6 = z6 && getPackageName().equals(apkInfo.getPackageName());
            }
            boolean z7 = z6 && hasPackageHash() == apkInfo.hasPackageHash();
            if (hasPackageHash()) {
                z7 = z7 && getPackageHash().equals(apkInfo.getPackageHash());
            }
            boolean z8 = z7 && hasVersionCode() == apkInfo.hasVersionCode();
            if (hasVersionCode()) {
                z8 = z8 && getVersionCode() == apkInfo.getVersionCode();
            }
            return z8 && this.unknownFields.equals(apkInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public String getPackageHash() {
            Object obj = this.packageHash_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.packageHash_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public ByteString getPackageHashBytes() {
            Object obj = this.packageHash_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageHash_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public String getPackageName() {
            Object obj = this.packageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.packageName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public ByteString getPackageNameBytes() {
            Object obj = this.packageName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ApkInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.packageName_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.packageHash_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(3, this.versionCode_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public long getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public boolean hasPackageHash() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public boolean hasPackageName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.ApkInfoOrBuilder
        public boolean hasVersionCode() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPackageName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPackageName().hashCode();
            }
            if (hasPackageHash()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPackageHash().hashCode();
            }
            if (hasVersionCode()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashLong(getVersionCode());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MarketProtos.internal_static_ApkInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ApkInfo.class, Builder.class);
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
            if (!hasPackageName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPackageHash()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVersionCode()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.packageName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.packageHash_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeUInt64(3, this.versionCode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ApkInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.packageName_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.packageHash_ = bytes2;
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.versionCode_ = codedInputStream.readUInt64();
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

        public static Builder newBuilder(ApkInfo apkInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(apkInfo);
        }

        public static ApkInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApkInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApkInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ApkInfo parseFrom(CodedInputStream codedInputStream) {
            return (ApkInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ApkInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ApkInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ApkInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApkInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ApkInfo parseFrom(InputStream inputStream) {
            return (ApkInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ApkInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApkInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApkInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ApkInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ApkInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ApkInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ApkInfoOrBuilder extends MessageOrBuilder {
        String getPackageHash();

        ByteString getPackageHashBytes();

        String getPackageName();

        ByteString getPackageNameBytes();

        long getVersionCode();

        boolean hasPackageHash();

        boolean hasPackageName();

        boolean hasVersionCode();
    }

    public interface ApkOrBuilder extends MessageOrBuilder {
        ApkInfo getApkInfo();

        ApkInfoOrBuilder getApkInfoOrBuilder();

        String getPackageName();

        ByteString getPackageNameBytes();

        Apk.PayloadCase getPayloadCase();

        ApkType getType();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasApkInfo();

        boolean hasPackageName();

        boolean hasType();

        boolean hasUrl();
    }

    public enum ApkType implements ProtocolMessageEnum {
        APP(0),
        WATCH_FACE(1);

        public static final int APP_VALUE = 0;
        public static final int WATCH_FACE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<ApkType> internalValueMap = new Internal.EnumLiteMap<ApkType>() { // from class: com.zh.wear.protobuf.MarketProtos.ApkType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ApkType findValueByNumber(int i7) {
                return ApkType.forNumber(i7);
            }
        };
        private static final ApkType[] VALUES = values();

        ApkType(int i7) {
            this.value = i7;
        }

        public static ApkType forNumber(int i7) {
            if (i7 == 0) {
                return APP;
            }
            if (i7 != 1) {
                return null;
            }
            return WATCH_FACE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MarketProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ApkType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static ApkType valueOf(int i7) {
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

        public static ApkType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum InstallCode implements ProtocolMessageEnum {
        VERSION_DOWNGRADE(0),
        LATEST_VERSION(1),
        APK_NOT_FOUND(2),
        WAITING_DOWNLOAD(3),
        DOWNLOADING(4),
        DOWNLOAD_FAILED(5),
        INSTALLING(6),
        INSTALL_SUCCESS(7),
        INSTALL_FAILED(8),
        CANCELLED(9);

        public static final int APK_NOT_FOUND_VALUE = 2;
        public static final int CANCELLED_VALUE = 9;
        public static final int DOWNLOADING_VALUE = 4;
        public static final int DOWNLOAD_FAILED_VALUE = 5;
        public static final int INSTALLING_VALUE = 6;
        public static final int INSTALL_FAILED_VALUE = 8;
        public static final int INSTALL_SUCCESS_VALUE = 7;
        public static final int LATEST_VERSION_VALUE = 1;
        public static final int VERSION_DOWNGRADE_VALUE = 0;
        public static final int WAITING_DOWNLOAD_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<InstallCode> internalValueMap = new Internal.EnumLiteMap<InstallCode>() { // from class: com.zh.wear.protobuf.MarketProtos.InstallCode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public InstallCode findValueByNumber(int i7) {
                return InstallCode.forNumber(i7);
            }
        };
        private static final InstallCode[] VALUES = values();

        InstallCode(int i7) {
            this.value = i7;
        }

        public static InstallCode forNumber(int i7) {
            switch (i7) {
                case 0:
                    return VERSION_DOWNGRADE;
                case 1:
                    return LATEST_VERSION;
                case 2:
                    return APK_NOT_FOUND;
                case 3:
                    return WAITING_DOWNLOAD;
                case 4:
                    return DOWNLOADING;
                case 5:
                    return DOWNLOAD_FAILED;
                case 6:
                    return INSTALLING;
                case 7:
                    return INSTALL_SUCCESS;
                case 8:
                    return INSTALL_FAILED;
                case 9:
                    return CANCELLED;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MarketProtos.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<InstallCode> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static InstallCode valueOf(int i7) {
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

        public static InstallCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class InstallProgress extends GeneratedMessageV3 implements InstallProgressOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DOWNLOAD_PROGRESS_FIELD_NUMBER = 3;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private int downloadProgress_;
        private byte memoizedIsInitialized;
        private volatile Object packageName_;
        private static final InstallProgress DEFAULT_INSTANCE = new InstallProgress();

        @Deprecated
        public static final Parser<InstallProgress> PARSER = new AbstractParser<InstallProgress>() { // from class: com.zh.wear.protobuf.MarketProtos.InstallProgress.1
            @Override // com.google.protobuf.Parser
            public InstallProgress parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new InstallProgress(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstallProgressOrBuilder {
            private int bitField0_;
            private int code_;
            private int downloadProgress_;
            private Object packageName_;

            private Builder() {
                this.code_ = 0;
                this.packageName_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MarketProtos.internal_static_InstallProgress_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDownloadProgress() {
                this.bitField0_ &= -5;
                this.downloadProgress_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPackageName() {
                this.bitField0_ &= -3;
                this.packageName_ = InstallProgress.getDefaultInstance().getPackageName();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
            public InstallCode getCode() {
                InstallCode installCodeValueOf = InstallCode.valueOf(this.code_);
                return installCodeValueOf == null ? InstallCode.VERSION_DOWNGRADE : installCodeValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MarketProtos.internal_static_InstallProgress_descriptor;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
            public int getDownloadProgress() {
                return this.downloadProgress_;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
            public String getPackageName() {
                Object obj = this.packageName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.packageName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
            public ByteString getPackageNameBytes() {
                Object obj = this.packageName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.packageName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
            public boolean hasDownloadProgress() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
            public boolean hasPackageName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MarketProtos.internal_static_InstallProgress_fieldAccessorTable.ensureFieldAccessorsInitialized(InstallProgress.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCode() && hasPackageName();
            }

            public Builder setCode(InstallCode installCode) {
                installCode.getClass();
                this.bitField0_ |= 1;
                this.code_ = installCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setDownloadProgress(int i7) {
                this.bitField0_ |= 4;
                this.downloadProgress_ = i7;
                onChanged();
                return this;
            }

            public Builder setPackageName(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.packageName_ = str;
                onChanged();
                return this;
            }

            public Builder setPackageNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.packageName_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.code_ = 0;
                this.packageName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstallProgress build() {
                InstallProgress installProgressBuildPartial = buildPartial();
                if (installProgressBuildPartial.isInitialized()) {
                    return installProgressBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) installProgressBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstallProgress buildPartial() {
                InstallProgress installProgress = new InstallProgress(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                installProgress.code_ = this.code_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                installProgress.packageName_ = this.packageName_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                installProgress.downloadProgress_ = this.downloadProgress_;
                installProgress.bitField0_ = i8;
                onBuilt();
                return installProgress;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InstallProgress getDefaultInstanceForType() {
                return InstallProgress.getDefaultInstance();
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
                this.code_ = 0;
                int i7 = this.bitField0_;
                this.packageName_ = "";
                this.downloadProgress_ = 0;
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
            public com.zh.wear.protobuf.MarketProtos.InstallProgress.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.MarketProtos$InstallProgress> r1 = com.zh.wear.protobuf.MarketProtos.InstallProgress.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.MarketProtos$InstallProgress r3 = (com.zh.wear.protobuf.MarketProtos.InstallProgress) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.MarketProtos$InstallProgress r4 = (com.zh.wear.protobuf.MarketProtos.InstallProgress) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MarketProtos.InstallProgress.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MarketProtos$InstallProgress$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstallProgress) {
                    return mergeFrom((InstallProgress) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstallProgress installProgress) {
                if (installProgress == InstallProgress.getDefaultInstance()) {
                    return this;
                }
                if (installProgress.hasCode()) {
                    setCode(installProgress.getCode());
                }
                if (installProgress.hasPackageName()) {
                    this.bitField0_ |= 2;
                    this.packageName_ = installProgress.packageName_;
                    onChanged();
                }
                if (installProgress.hasDownloadProgress()) {
                    setDownloadProgress(installProgress.getDownloadProgress());
                }
                mergeUnknownFields(((GeneratedMessage) installProgress).unknownFields);
                onChanged();
                return this;
            }
        }

        private InstallProgress() {
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
            this.packageName_ = "";
            this.downloadProgress_ = 0;
        }

        public static InstallProgress getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MarketProtos.internal_static_InstallProgress_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstallProgress parseDelimitedFrom(InputStream inputStream) {
            return (InstallProgress) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstallProgress parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<InstallProgress> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstallProgress)) {
                return super.equals(obj);
            }
            InstallProgress installProgress = (InstallProgress) obj;
            boolean z6 = hasCode() == installProgress.hasCode();
            if (hasCode()) {
                z6 = z6 && this.code_ == installProgress.code_;
            }
            boolean z7 = z6 && hasPackageName() == installProgress.hasPackageName();
            if (hasPackageName()) {
                z7 = z7 && getPackageName().equals(installProgress.getPackageName());
            }
            boolean z8 = z7 && hasDownloadProgress() == installProgress.hasDownloadProgress();
            if (hasDownloadProgress()) {
                z8 = z8 && getDownloadProgress() == installProgress.getDownloadProgress();
            }
            return z8 && this.unknownFields.equals(installProgress.unknownFields);
        }

        @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
        public InstallCode getCode() {
            InstallCode installCodeValueOf = InstallCode.valueOf(this.code_);
            return installCodeValueOf == null ? InstallCode.VERSION_DOWNGRADE : installCodeValueOf;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
        public int getDownloadProgress() {
            return this.downloadProgress_;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
        public String getPackageName() {
            Object obj = this.packageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.packageName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
        public ByteString getPackageNameBytes() {
            Object obj = this.packageName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstallProgress> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.code_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.packageName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.downloadProgress_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
        public boolean hasDownloadProgress() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.InstallProgressOrBuilder
        public boolean hasPackageName() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasCode()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.code_;
            }
            if (hasPackageName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPackageName().hashCode();
            }
            if (hasDownloadProgress()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDownloadProgress();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MarketProtos.internal_static_InstallProgress_fieldAccessorTable.ensureFieldAccessorsInitialized(InstallProgress.class, Builder.class);
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
            if (!hasCode()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPackageName()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.code_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.packageName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeUInt32(3, this.downloadProgress_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private InstallProgress(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                int i7 = codedInputStream.readEnum();
                                if (InstallCode.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.code_ = i7;
                                }
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.packageName_ = bytes;
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.downloadProgress_ = codedInputStream.readUInt32();
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

        public static Builder newBuilder(InstallProgress installProgress) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(installProgress);
        }

        public static InstallProgress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstallProgress) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstallProgress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstallProgress parseFrom(CodedInputStream codedInputStream) {
            return (InstallProgress) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstallProgress getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private InstallProgress(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstallProgress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstallProgress) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InstallProgress parseFrom(InputStream inputStream) {
            return (InstallProgress) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static InstallProgress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstallProgress) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstallProgress parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static InstallProgress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static InstallProgress parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstallProgress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface InstallProgressOrBuilder extends MessageOrBuilder {
        InstallCode getCode();

        int getDownloadProgress();

        String getPackageName();

        ByteString getPackageNameBytes();

        boolean hasCode();

        boolean hasDownloadProgress();

        boolean hasPackageName();
    }

    public static final class Market extends GeneratedMessageV3 implements MarketOrBuilder {
        public static final int APK_FIELD_NUMBER = 1;
        public static final int APK_LIST_FIELD_NUMBER = 2;
        public static final int INSTALL_PROGRESS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Market DEFAULT_INSTANCE = new Market();

        @Deprecated
        public static final Parser<Market> PARSER = new AbstractParser<Market>() { // from class: com.zh.wear.protobuf.MarketProtos.Market.1
            @Override // com.google.protobuf.Parser
            public Market parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Market(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MarketOrBuilder {
            private SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> apkBuilder_;
            private SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> apkListBuilder_;
            private int bitField0_;
            private SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> installProgressBuilder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> getApkFieldBuilder() {
                if (this.apkBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = Apk.getDefaultInstance();
                    }
                    this.apkBuilder_ = new SingleFieldBuilderV3<>((Apk) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.apkBuilder_;
            }

            private SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> getApkListFieldBuilder() {
                if (this.apkListBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = Apk.List.getDefaultInstance();
                    }
                    this.apkListBuilder_ = new SingleFieldBuilderV3<>((Apk.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.apkListBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MarketProtos.internal_static_Market_descriptor;
            }

            private SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> getInstallProgressFieldBuilder() {
                if (this.installProgressBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = InstallProgress.getDefaultInstance();
                    }
                    this.installProgressBuilder_ = new SingleFieldBuilderV3<>((InstallProgress) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.installProgressBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearApk() {
                SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> singleFieldBuilderV3 = this.apkBuilder_;
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

            public Builder clearApkList() {
                SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> singleFieldBuilderV3 = this.apkListBuilder_;
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

            public Builder clearInstallProgress() {
                SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> singleFieldBuilderV3 = this.installProgressBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public Apk getApk() {
                Object message;
                SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> singleFieldBuilderV3 = this.apkBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return Apk.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return Apk.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (Apk) message;
            }

            public Apk.Builder getApkBuilder() {
                return (Apk.Builder) getApkFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public Apk.List getApkList() {
                Object message;
                SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> singleFieldBuilderV3 = this.apkListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return Apk.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return Apk.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (Apk.List) message;
            }

            public Apk.List.Builder getApkListBuilder() {
                return (Apk.List.Builder) getApkListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public Apk.ListOrBuilder getApkListOrBuilder() {
                SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.apkListBuilder_) == null) ? i7 == 2 ? (Apk.List) this.payload_ : Apk.List.getDefaultInstance() : (Apk.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public ApkOrBuilder getApkOrBuilder() {
                SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.apkBuilder_) == null) ? i7 == 1 ? (Apk) this.payload_ : Apk.getDefaultInstance() : (ApkOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MarketProtos.internal_static_Market_descriptor;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public InstallProgress getInstallProgress() {
                Object message;
                SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> singleFieldBuilderV3 = this.installProgressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return InstallProgress.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return InstallProgress.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (InstallProgress) message;
            }

            public InstallProgress.Builder getInstallProgressBuilder() {
                return (InstallProgress.Builder) getInstallProgressFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public InstallProgressOrBuilder getInstallProgressOrBuilder() {
                SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.installProgressBuilder_) == null) ? i7 == 3 ? (InstallProgress) this.payload_ : InstallProgress.getDefaultInstance() : (InstallProgressOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public boolean hasApk() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public boolean hasApkList() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
            public boolean hasInstallProgress() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MarketProtos.internal_static_Market_fieldAccessorTable.ensureFieldAccessorsInitialized(Market.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasApk() && !getApk().isInitialized()) {
                    return false;
                }
                if (!hasApkList() || getApkList().isInitialized()) {
                    return !hasInstallProgress() || getInstallProgress().isInitialized();
                }
                return false;
            }

            public Builder mergeApk(Apk apk) {
                SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> singleFieldBuilderV3 = this.apkBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != Apk.getDefaultInstance()) {
                        apk = Apk.newBuilder((Apk) this.payload_).mergeFrom(apk).buildPartial();
                    }
                    this.payload_ = apk;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(apk);
                    }
                    this.apkBuilder_.setMessage(apk);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeApkList(Apk.List list) {
                SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> singleFieldBuilderV3 = this.apkListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != Apk.List.getDefaultInstance()) {
                        list = Apk.List.newBuilder((Apk.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.apkListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeInstallProgress(InstallProgress installProgress) {
                SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> singleFieldBuilderV3 = this.installProgressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != InstallProgress.getDefaultInstance()) {
                        installProgress = InstallProgress.newBuilder((InstallProgress) this.payload_).mergeFrom(installProgress).buildPartial();
                    }
                    this.payload_ = installProgress;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(installProgress);
                    }
                    this.installProgressBuilder_.setMessage(installProgress);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setApk(Apk.Builder builder) {
                SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> singleFieldBuilderV3 = this.apkBuilder_;
                Apk apkBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = apkBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(apkBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setApkList(Apk.List.Builder builder) {
                SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> singleFieldBuilderV3 = this.apkListBuilder_;
                Apk.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setInstallProgress(InstallProgress.Builder builder) {
                SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> singleFieldBuilderV3 = this.installProgressBuilder_;
                InstallProgress installProgressBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = installProgressBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(installProgressBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setApk(Apk apk) {
                SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> singleFieldBuilderV3 = this.apkBuilder_;
                if (singleFieldBuilderV3 == null) {
                    apk.getClass();
                    this.payload_ = apk;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(apk);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setApkList(Apk.List list) {
                SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> singleFieldBuilderV3 = this.apkListBuilder_;
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

            public Builder setInstallProgress(InstallProgress installProgress) {
                SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> singleFieldBuilderV3 = this.installProgressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    installProgress.getClass();
                    this.payload_ = installProgress;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(installProgress);
                }
                this.payloadCase_ = 3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Market build() {
                Market marketBuildPartial = buildPartial();
                if (marketBuildPartial.isInitialized()) {
                    return marketBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) marketBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Market buildPartial() {
                Market market = new Market(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<Apk, Apk.Builder, ApkOrBuilder> singleFieldBuilderV3 = this.apkBuilder_;
                    market.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<Apk.List, Apk.List.Builder, Apk.ListOrBuilder> singleFieldBuilderV32 = this.apkListBuilder_;
                    market.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<InstallProgress, InstallProgress.Builder, InstallProgressOrBuilder> singleFieldBuilderV33 = this.installProgressBuilder_;
                    market.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                market.bitField0_ = 0;
                market.payloadCase_ = this.payloadCase_;
                onBuilt();
                return market;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Market getDefaultInstanceForType() {
                return Market.getDefaultInstance();
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
            public com.zh.wear.protobuf.MarketProtos.Market.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.MarketProtos$Market> r1 = com.zh.wear.protobuf.MarketProtos.Market.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.MarketProtos$Market r3 = (com.zh.wear.protobuf.MarketProtos.Market) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.MarketProtos$Market r4 = (com.zh.wear.protobuf.MarketProtos.Market) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MarketProtos.Market.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.MarketProtos$Market$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Market) {
                    return mergeFrom((Market) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Market market) {
                if (market == Market.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$MarketProtos$Market$PayloadCase[market.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    mergeApk(market.getApk());
                } else if (i7 == 2) {
                    mergeApkList(market.getApkList());
                } else if (i7 == 3) {
                    mergeInstallProgress(market.getInstallProgress());
                }
                mergeUnknownFields(((GeneratedMessage) market).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum MarketID implements ProtocolMessageEnum {
            TRY_INSTALL_APK(0),
            TRY_INSTALL_APKS(1),
            REPORT_INSTALL_PROGRESS(2),
            TRY_INSTALL_APK_NEW(3),
            TRY_INSTALL_APKS_NEW(4);

            public static final int REPORT_INSTALL_PROGRESS_VALUE = 2;
            public static final int TRY_INSTALL_APKS_NEW_VALUE = 4;
            public static final int TRY_INSTALL_APKS_VALUE = 1;
            public static final int TRY_INSTALL_APK_NEW_VALUE = 3;
            public static final int TRY_INSTALL_APK_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<MarketID> internalValueMap = new Internal.EnumLiteMap<MarketID>() { // from class: com.zh.wear.protobuf.MarketProtos.Market.MarketID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public MarketID findValueByNumber(int i7) {
                    return MarketID.forNumber(i7);
                }
            };
            private static final MarketID[] VALUES = values();

            MarketID(int i7) {
                this.value = i7;
            }

            public static MarketID forNumber(int i7) {
                if (i7 == 0) {
                    return TRY_INSTALL_APK;
                }
                if (i7 == 1) {
                    return TRY_INSTALL_APKS;
                }
                if (i7 == 2) {
                    return REPORT_INSTALL_PROGRESS;
                }
                if (i7 == 3) {
                    return TRY_INSTALL_APK_NEW;
                }
                if (i7 != 4) {
                    return null;
                }
                return TRY_INSTALL_APKS_NEW;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Market.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<MarketID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static MarketID valueOf(int i7) {
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

            public static MarketID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            APK(1),
            APK_LIST(2),
            INSTALL_PROGRESS(3),
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
                    return APK;
                }
                if (i7 == 2) {
                    return APK_LIST;
                }
                if (i7 != 3) {
                    return null;
                }
                return INSTALL_PROGRESS;
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

        private Market() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Market getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MarketProtos.internal_static_Market_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Market parseDelimitedFrom(InputStream inputStream) {
            return (Market) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Market parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Market> parser() {
            return PARSER;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.MarketProtos.Market
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.MarketProtos$Market r6 = (com.zh.wear.protobuf.MarketProtos.Market) r6
                com.zh.wear.protobuf.MarketProtos$Market$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.MarketProtos$Market$PayloadCase r2 = r6.getPayloadCase()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 != 0) goto L1f
                return r2
            L1f:
                int r3 = r5.payloadCase_
                if (r3 == r0) goto L4c
                r4 = 2
                if (r3 == r4) goto L3b
                r4 = 3
                if (r3 == r4) goto L2a
                goto L5f
            L2a:
                if (r1 == 0) goto L5e
                com.zh.wear.protobuf.MarketProtos$InstallProgress r1 = r5.getInstallProgress()
                com.zh.wear.protobuf.MarketProtos$InstallProgress r3 = r6.getInstallProgress()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5e
                goto L5c
            L3b:
                if (r1 == 0) goto L5e
                com.zh.wear.protobuf.MarketProtos$Apk$List r1 = r5.getApkList()
                com.zh.wear.protobuf.MarketProtos$Apk$List r3 = r6.getApkList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5e
                goto L5c
            L4c:
                if (r1 == 0) goto L5e
                com.zh.wear.protobuf.MarketProtos$Apk r1 = r5.getApk()
                com.zh.wear.protobuf.MarketProtos$Apk r3 = r6.getApk()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5e
            L5c:
                r1 = r0
                goto L5f
            L5e:
                r1 = r2
            L5f:
                if (r1 == 0) goto L6c
                com.google.protobuf.UnknownFieldSet r1 = r5.unknownFields
                com.google.protobuf.UnknownFieldSet r6 = r6.unknownFields
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L6c
                return r0
            L6c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.MarketProtos.Market.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public Apk getApk() {
            return this.payloadCase_ == 1 ? (Apk) this.payload_ : Apk.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public Apk.List getApkList() {
            return this.payloadCase_ == 2 ? (Apk.List) this.payload_ : Apk.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public Apk.ListOrBuilder getApkListOrBuilder() {
            return this.payloadCase_ == 2 ? (Apk.List) this.payload_ : Apk.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public ApkOrBuilder getApkOrBuilder() {
            return this.payloadCase_ == 1 ? (Apk) this.payload_ : Apk.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public InstallProgress getInstallProgress() {
            return this.payloadCase_ == 3 ? (InstallProgress) this.payload_ : InstallProgress.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public InstallProgressOrBuilder getInstallProgressOrBuilder() {
            return this.payloadCase_ == 3 ? (InstallProgress) this.payload_ : InstallProgress.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Market> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (Apk) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (Apk.List) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (InstallProgress) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public boolean hasApk() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public boolean hasApkList() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.MarketProtos.MarketOrBuilder
        public boolean hasInstallProgress() {
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
                iHashCode = getApk().hashCode();
            } else {
                if (i9 != 2) {
                    if (i9 == 3) {
                        i7 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getInstallProgress().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i7 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getApkList().hashCode();
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MarketProtos.internal_static_Market_fieldAccessorTable.ensureFieldAccessorsInitialized(Market.class, Builder.class);
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
            if (hasApk() && !getApk().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasApkList() && !getApkList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasInstallProgress() || getInstallProgress().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (Apk) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (Apk.List) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (InstallProgress) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Market(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            int i7 = 1;
                            if (tag != 0) {
                                if (tag == 10) {
                                    Apk.Builder builder = this.payloadCase_ == 1 ? ((Apk) this.payload_).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(Apk.PARSER, extensionRegistryLite);
                                    this.payload_ = message;
                                    if (builder != null) {
                                        builder.mergeFrom((Apk) message);
                                        this.payload_ = builder.buildPartial();
                                    }
                                } else if (tag == 18) {
                                    i7 = 2;
                                    Apk.List.Builder builder2 = this.payloadCase_ == 2 ? ((Apk.List) this.payload_).toBuilder() : null;
                                    MessageLite message2 = codedInputStream.readMessage(Apk.List.PARSER, extensionRegistryLite);
                                    this.payload_ = message2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Apk.List) message2);
                                        this.payload_ = builder2.buildPartial();
                                    }
                                } else if (tag == 26) {
                                    i7 = 3;
                                    InstallProgress.Builder builder3 = this.payloadCase_ == 3 ? ((InstallProgress) this.payload_).toBuilder() : null;
                                    MessageLite message3 = codedInputStream.readMessage(InstallProgress.PARSER, extensionRegistryLite);
                                    this.payload_ = message3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((InstallProgress) message3);
                                        this.payload_ = builder3.buildPartial();
                                    }
                                } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                                this.payloadCase_ = i7;
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

        public static Builder newBuilder(Market market) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(market);
        }

        public static Market parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Market) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Market parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Market parseFrom(CodedInputStream codedInputStream) {
            return (Market) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Market getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Market(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Market parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Market) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Market parseFrom(InputStream inputStream) {
            return (Market) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Market parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Market) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Market parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Market parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Market parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Market parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface MarketOrBuilder extends MessageOrBuilder {
        Apk getApk();

        Apk.List getApkList();

        Apk.ListOrBuilder getApkListOrBuilder();

        ApkOrBuilder getApkOrBuilder();

        InstallProgress getInstallProgress();

        InstallProgressOrBuilder getInstallProgressOrBuilder();

        Market.PayloadCase getPayloadCase();

        boolean hasApk();

        boolean hasApkList();

        boolean hasInstallProgress();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011wear_market.proto\u001a\fnanopb.proto\"ý\u0001\n\u0006Market\u0012\u0013\n\u0003apk\u0018\u0001 \u0001(\u000b2\u0004.ApkH\u0000\u0012\u001d\n\bapk_list\u0018\u0002 \u0001(\u000b2\t.Apk.ListH\u0000\u0012,\n\u0010install_progress\u0018\u0003 \u0001(\u000b2\u0010.InstallProgressH\u0000\"\u0085\u0001\n\bMarketID\u0012\u0013\n\u000fTRY_INSTALL_APK\u0010\u0000\u0012\u0014\n\u0010TRY_INSTALL_APKS\u0010\u0001\u0012\u001b\n\u0017REPORT_INSTALL_PROGRESS\u0010\u0002\u0012\u0017\n\u0013TRY_INSTALL_APK_NEW\u0010\u0003\u0012\u0018\n\u0014TRY_INSTALL_APKS_NEW\u0010\u0004B\t\n\u0007payload\"\u009e\u0001\n\u0003Apk\u0012\u0016\n\u0004type\u0018\u0001 \u0002(\u000e2\b.ApkType\u0012\u001d\n\fpackage_name\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\u0014\n\u0003url\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\u001c\n\bapk_info\u0018\u0004 \u0001(\u000b2\b.ApkInfoH\u0000\u001a!\n\u0004List\u0012\u0019\n\u0004list\u0018\u0001 \u0003(\u000b2\u0004.ApkB\u0005\u0092?\u0002\u0018\u0004B\t\n\u0007payload\"Y\n\u0007ApkInfo\u0012\u001b\n\fpackage_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001b\n\fpackage_hash\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\fversion_code\u0018\u0003 \u0002(\u0004\"l\n\u000fInstallProgress\u0012\u001a\n\u0004code\u0018\u0001 \u0002(\u000e2\f.InstallCode\u0012\u001b\n\fpackage_name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0011download_progress\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b*\"\n\u0007ApkType\u0012\u0007\n\u0003APP\u0010\u0000\u0012\u000e\n\nWATCH_FACE\u0010\u0001*Ï\u0001\n\u000bInstallCode\u0012\u0015\n\u0011VERSION_DOWNGRADE\u0010\u0000\u0012\u0012\n\u000eLATEST_VERSION\u0010\u0001\u0012\u0011\n\rAPK_NOT_FOUND\u0010\u0002\u0012\u0014\n\u0010WAITING_DOWNLOAD\u0010\u0003\u0012\u000f\n\u000bDOWNLOADING\u0010\u0004\u0012\u0013\n\u000fDOWNLOAD_FAILED\u0010\u0005\u0012\u000e\n\nINSTALLING\u0010\u0006\u0012\u0013\n\u000fINSTALL_SUCCESS\u0010\u0007\u0012\u0012\n\u000eINSTALL_FAILED\u0010\b\u0012\r\n\tCANCELLED\u0010\tB$\n\u0014com.zh.wear.protobufB\fMarketProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.MarketProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = MarketProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Market_descriptor = descriptor2;
        internal_static_Market_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Apk", "ApkList", "InstallProgress", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_Apk_descriptor = descriptor3;
        internal_static_Apk_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", DetailRect.CP_PACKAGE, "Url", "ApkInfo", "Payload"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_Apk_List_descriptor = descriptor4;
        internal_static_Apk_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(2);
        internal_static_ApkInfo_descriptor = descriptor5;
        internal_static_ApkInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{DetailRect.CP_PACKAGE, "PackageHash", "VersionCode"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(3);
        internal_static_InstallProgress_descriptor = descriptor6;
        internal_static_InstallProgress_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Code", DetailRect.CP_PACKAGE, "DownloadProgress"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private MarketProtos() {
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