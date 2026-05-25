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
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class FactoryProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_Factory_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Factory_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_FileInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FileInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NfcInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NfcInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_NfcInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NfcInfo_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.FactoryProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$FactoryProtos$Factory$PayloadCase;

        static {
            int[] iArr = new int[Factory.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$FactoryProtos$Factory$PayloadCase = iArr;
            try {
                iArr[Factory.PayloadCase.MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$FactoryProtos$Factory$PayloadCase[Factory.PayloadCase.NFC_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$FactoryProtos$Factory$PayloadCase[Factory.PayloadCase.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$FactoryProtos$Factory$PayloadCase[Factory.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Factory extends GeneratedMessageV3 implements FactoryOrBuilder {
        public static final int FILE_FIELD_NUMBER = 3;
        public static final int MODE_FIELD_NUMBER = 1;
        public static final int NFC_LIST_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Factory DEFAULT_INSTANCE = new Factory();

        @Deprecated
        public static final Parser<Factory> PARSER = new AbstractParser<Factory>() { // from class: com.zh.wear.protobuf.FactoryProtos.Factory.1
            @Override // com.google.protobuf.Parser
            public Factory parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Factory(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FactoryOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> fileBuilder_;
            private SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> nfcListBuilder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_Factory_descriptor;
            }

            private SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> getFileFieldBuilder() {
                if (this.fileBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = FileInfo.getDefaultInstance();
                    }
                    this.fileBuilder_ = new SingleFieldBuilderV3<>((FileInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.fileBuilder_;
            }

            private SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> getNfcListFieldBuilder() {
                if (this.nfcListBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = NfcInfo.List.getDefaultInstance();
                    }
                    this.nfcListBuilder_ = new SingleFieldBuilderV3<>((NfcInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.nfcListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearFile() {
                SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> singleFieldBuilderV3 = this.fileBuilder_;
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

            public Builder clearMode() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearNfcList() {
                SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> singleFieldBuilderV3 = this.nfcListBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_Factory_descriptor;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public FileInfo getFile() {
                Object message;
                SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> singleFieldBuilderV3 = this.fileBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return FileInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return FileInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (FileInfo) message;
            }

            public FileInfo.Builder getFileBuilder() {
                return (FileInfo.Builder) getFileFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public FileInfoOrBuilder getFileOrBuilder() {
                SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.fileBuilder_) == null) ? i7 == 3 ? (FileInfo) this.payload_ : FileInfo.getDefaultInstance() : (FileInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public FactoryMode getMode() {
                FactoryMode factoryModeValueOf;
                return (this.payloadCase_ != 1 || (factoryModeValueOf = FactoryMode.valueOf(((Integer) this.payload_).intValue())) == null) ? FactoryMode.USER : factoryModeValueOf;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public NfcInfo.List getNfcList() {
                Object message;
                SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> singleFieldBuilderV3 = this.nfcListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return NfcInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return NfcInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (NfcInfo.List) message;
            }

            public NfcInfo.List.Builder getNfcListBuilder() {
                return (NfcInfo.List.Builder) getNfcListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public NfcInfo.ListOrBuilder getNfcListOrBuilder() {
                SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.nfcListBuilder_) == null) ? i7 == 2 ? (NfcInfo.List) this.payload_ : NfcInfo.List.getDefaultInstance() : (NfcInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public boolean hasFile() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public boolean hasMode() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
            public boolean hasNfcList() {
                return this.payloadCase_ == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_Factory_fieldAccessorTable.ensureFieldAccessorsInitialized(Factory.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasNfcList() || getNfcList().isInitialized()) {
                    return !hasFile() || getFile().isInitialized();
                }
                return false;
            }

            public Builder mergeFile(FileInfo fileInfo) {
                SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> singleFieldBuilderV3 = this.fileBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != FileInfo.getDefaultInstance()) {
                        fileInfo = FileInfo.newBuilder((FileInfo) this.payload_).mergeFrom(fileInfo).buildPartial();
                    }
                    this.payload_ = fileInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(fileInfo);
                    }
                    this.fileBuilder_.setMessage(fileInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeNfcList(NfcInfo.List list) {
                SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> singleFieldBuilderV3 = this.nfcListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != NfcInfo.List.getDefaultInstance()) {
                        list = NfcInfo.List.newBuilder((NfcInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.nfcListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setFile(FileInfo.Builder builder) {
                SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> singleFieldBuilderV3 = this.fileBuilder_;
                FileInfo fileInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = fileInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(fileInfoBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setMode(FactoryMode factoryMode) {
                factoryMode.getClass();
                this.payloadCase_ = 1;
                this.payload_ = Integer.valueOf(factoryMode.getNumber());
                onChanged();
                return this;
            }

            public Builder setNfcList(NfcInfo.List.Builder builder) {
                SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> singleFieldBuilderV3 = this.nfcListBuilder_;
                NfcInfo.List listBuild = builder.build();
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

            public Builder setFile(FileInfo fileInfo) {
                SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> singleFieldBuilderV3 = this.fileBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileInfo.getClass();
                    this.payload_ = fileInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(fileInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setNfcList(NfcInfo.List list) {
                SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> singleFieldBuilderV3 = this.nfcListBuilder_;
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
            public Factory build() {
                Factory factoryBuildPartial = buildPartial();
                if (factoryBuildPartial.isInitialized()) {
                    return factoryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) factoryBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Factory buildPartial() {
                Factory factory = new Factory(this);
                if (this.payloadCase_ == 1) {
                    factory.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<NfcInfo.List, NfcInfo.List.Builder, NfcInfo.ListOrBuilder> singleFieldBuilderV3 = this.nfcListBuilder_;
                    factory.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<FileInfo, FileInfo.Builder, FileInfoOrBuilder> singleFieldBuilderV32 = this.fileBuilder_;
                    factory.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                factory.bitField0_ = 0;
                factory.payloadCase_ = this.payloadCase_;
                onBuilt();
                return factory;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Factory getDefaultInstanceForType() {
                return Factory.getDefaultInstance();
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
            public com.zh.wear.protobuf.FactoryProtos.Factory.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.FactoryProtos$Factory> r1 = com.zh.wear.protobuf.FactoryProtos.Factory.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.FactoryProtos$Factory r3 = (com.zh.wear.protobuf.FactoryProtos.Factory) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.FactoryProtos$Factory r4 = (com.zh.wear.protobuf.FactoryProtos.Factory) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.FactoryProtos.Factory.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.FactoryProtos$Factory$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Factory) {
                    return mergeFrom((Factory) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Factory factory) {
                if (factory == Factory.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$FactoryProtos$Factory$PayloadCase[factory.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    setMode(factory.getMode());
                } else if (i7 == 2) {
                    mergeNfcList(factory.getNfcList());
                } else if (i7 == 3) {
                    mergeFile(factory.getFile());
                }
                mergeUnknownFields(((GeneratedMessage) factory).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum FactoryID implements ProtocolMessageEnum {
            SET_MODE(0),
            CONFIG_NFC(1),
            DUMP_FILE(2);

            public static final int CONFIG_NFC_VALUE = 1;
            public static final int DUMP_FILE_VALUE = 2;
            public static final int SET_MODE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<FactoryID> internalValueMap = new Internal.EnumLiteMap<FactoryID>() { // from class: com.zh.wear.protobuf.FactoryProtos.Factory.FactoryID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public FactoryID findValueByNumber(int i7) {
                    return FactoryID.forNumber(i7);
                }
            };
            private static final FactoryID[] VALUES = values();

            FactoryID(int i7) {
                this.value = i7;
            }

            public static FactoryID forNumber(int i7) {
                if (i7 == 0) {
                    return SET_MODE;
                }
                if (i7 == 1) {
                    return CONFIG_NFC;
                }
                if (i7 != 2) {
                    return null;
                }
                return DUMP_FILE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Factory.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<FactoryID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static FactoryID valueOf(int i7) {
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

            public static FactoryID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            MODE(1),
            NFC_LIST(2),
            FILE(3),
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
                    return MODE;
                }
                if (i7 == 2) {
                    return NFC_LIST;
                }
                if (i7 != 3) {
                    return null;
                }
                return FILE;
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

        private Factory() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Factory getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_Factory_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Factory parseDelimitedFrom(InputStream inputStream) {
            return (Factory) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Factory parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Factory> parser() {
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.FactoryProtos.Factory
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.FactoryProtos$Factory r6 = (com.zh.wear.protobuf.FactoryProtos.Factory) r6
                com.zh.wear.protobuf.FactoryProtos$Factory$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.FactoryProtos$Factory$PayloadCase r2 = r6.getPayloadCase()
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
                com.zh.wear.protobuf.FactoryProtos$FileInfo r1 = r5.getFile()
                com.zh.wear.protobuf.FactoryProtos$FileInfo r3 = r6.getFile()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5e
                goto L5c
            L3b:
                if (r1 == 0) goto L5e
                com.zh.wear.protobuf.FactoryProtos$NfcInfo$List r1 = r5.getNfcList()
                com.zh.wear.protobuf.FactoryProtos$NfcInfo$List r3 = r6.getNfcList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5e
                goto L5c
            L4c:
                if (r1 == 0) goto L5e
                com.zh.wear.protobuf.FactoryProtos$FactoryMode r1 = r5.getMode()
                com.zh.wear.protobuf.FactoryProtos$FactoryMode r3 = r6.getMode()
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
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.FactoryProtos.Factory.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public FileInfo getFile() {
            return this.payloadCase_ == 3 ? (FileInfo) this.payload_ : FileInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public FileInfoOrBuilder getFileOrBuilder() {
            return this.payloadCase_ == 3 ? (FileInfo) this.payload_ : FileInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public FactoryMode getMode() {
            FactoryMode factoryModeValueOf;
            return (this.payloadCase_ != 1 || (factoryModeValueOf = FactoryMode.valueOf(((Integer) this.payload_).intValue())) == null) ? FactoryMode.USER : factoryModeValueOf;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public NfcInfo.List getNfcList() {
            return this.payloadCase_ == 2 ? (NfcInfo.List) this.payload_ : NfcInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public NfcInfo.ListOrBuilder getNfcListOrBuilder() {
            return this.payloadCase_ == 2 ? (NfcInfo.List) this.payload_ : NfcInfo.List.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Factory> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = this.payloadCase_ == 1 ? CodedOutputStream.computeEnumSize(1, ((Integer) this.payload_).intValue()) : 0;
            if (this.payloadCase_ == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (NfcInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, (FileInfo) this.payload_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public boolean hasFile() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public boolean hasMode() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FactoryOrBuilder
        public boolean hasNfcList() {
            return this.payloadCase_ == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            int number;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            int i9 = this.payloadCase_;
            if (i9 == 1) {
                i7 = ((iHashCode * 37) + 1) * 53;
                number = getMode().getNumber();
            } else {
                if (i9 != 2) {
                    if (i9 == 3) {
                        i7 = ((iHashCode * 37) + 3) * 53;
                        number = getFile().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }
                i7 = ((iHashCode * 37) + 2) * 53;
                number = getNfcList().hashCode();
            }
            iHashCode = i7 + number;
            int iHashCode22 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode22;
            return iHashCode22;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_Factory_fieldAccessorTable.ensureFieldAccessorsInitialized(Factory.class, Builder.class);
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
            if (hasNfcList() && !getNfcList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFile() || getFile().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeEnum(1, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (NfcInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (FileInfo) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Factory(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            if (tag != 0) {
                                if (tag != 8) {
                                    if (tag == 18) {
                                        i7 = 2;
                                        NfcInfo.List.Builder builder = this.payloadCase_ == 2 ? ((NfcInfo.List) this.payload_).toBuilder() : null;
                                        MessageLite message = codedInputStream.readMessage(NfcInfo.List.PARSER, extensionRegistryLite);
                                        this.payload_ = message;
                                        if (builder != null) {
                                            builder.mergeFrom((NfcInfo.List) message);
                                            this.payload_ = builder.buildPartial();
                                        }
                                    } else if (tag == 26) {
                                        i7 = 3;
                                        FileInfo.Builder builder2 = this.payloadCase_ == 3 ? ((FileInfo) this.payload_).toBuilder() : null;
                                        MessageLite message2 = codedInputStream.readMessage(FileInfo.PARSER, extensionRegistryLite);
                                        this.payload_ = message2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom((FileInfo) message2);
                                            this.payload_ = builder2.buildPartial();
                                        }
                                    } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                    this.payloadCase_ = i7;
                                } else {
                                    int i8 = codedInputStream.readEnum();
                                    if (FactoryMode.valueOf(i8) == null) {
                                        builderNewBuilder.mergeVarintField(1, i8);
                                    } else {
                                        this.payloadCase_ = 1;
                                        this.payload_ = Integer.valueOf(i8);
                                    }
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
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Builder newBuilder(Factory factory) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(factory);
        }

        public static Factory parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Factory) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Factory parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Factory parseFrom(CodedInputStream codedInputStream) {
            return (Factory) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Factory getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Factory(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Factory parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Factory) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Factory parseFrom(InputStream inputStream) {
            return (Factory) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Factory parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Factory) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Factory parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Factory parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Factory parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Factory parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public enum FactoryMode implements ProtocolMessageEnum {
        USER(0),
        USERDEBUG(1),
        ENG(2);

        public static final int ENG_VALUE = 2;
        public static final int USERDEBUG_VALUE = 1;
        public static final int USER_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<FactoryMode> internalValueMap = new Internal.EnumLiteMap<FactoryMode>() { // from class: com.zh.wear.protobuf.FactoryProtos.FactoryMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FactoryMode findValueByNumber(int i7) {
                return FactoryMode.forNumber(i7);
            }
        };
        private static final FactoryMode[] VALUES = values();

        FactoryMode(int i7) {
            this.value = i7;
        }

        public static FactoryMode forNumber(int i7) {
            if (i7 == 0) {
                return USER;
            }
            if (i7 == 1) {
                return USERDEBUG;
            }
            if (i7 != 2) {
                return null;
            }
            return ENG;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return FactoryProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<FactoryMode> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static FactoryMode valueOf(int i7) {
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

        public static FactoryMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface FactoryOrBuilder extends MessageOrBuilder {
        FileInfo getFile();

        FileInfoOrBuilder getFileOrBuilder();

        FactoryMode getMode();

        NfcInfo.List getNfcList();

        NfcInfo.ListOrBuilder getNfcListOrBuilder();

        Factory.PayloadCase getPayloadCase();

        boolean hasFile();

        boolean hasMode();

        boolean hasNfcList();
    }

    public static final class FileInfo extends GeneratedMessageV3 implements FileInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        public static final int IS_APPEND_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private boolean isAppend_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private static final FileInfo DEFAULT_INSTANCE = new FileInfo();

        @Deprecated
        public static final Parser<FileInfo> PARSER = new AbstractParser<FileInfo>() { // from class: com.zh.wear.protobuf.FactoryProtos.FileInfo.1
            @Override // com.google.protobuf.Parser
            public FileInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new FileInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileInfoOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private boolean isAppend_;
            private Object name_;

            private Builder() {
                this.name_ = "";
                this.data_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_FileInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearData() {
                this.bitField0_ &= -5;
                this.data_ = FileInfo.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            public Builder clearIsAppend() {
                this.bitField0_ &= -3;
                this.isAppend_ = false;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = FileInfo.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_FileInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
            public boolean getIsAppend() {
                return this.isAppend_;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
            public boolean hasIsAppend() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_FileInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FileInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasName() && hasIsAppend() && hasData();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.data_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIsAppend(boolean z6) {
                this.bitField0_ |= 2;
                this.isAppend_ = z6;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.data_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileInfo build() {
                FileInfo fileInfoBuildPartial = buildPartial();
                if (fileInfoBuildPartial.isInitialized()) {
                    return fileInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileInfo buildPartial() {
                FileInfo fileInfo = new FileInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                fileInfo.name_ = this.name_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                fileInfo.isAppend_ = this.isAppend_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                fileInfo.data_ = this.data_;
                fileInfo.bitField0_ = i8;
                onBuilt();
                return fileInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FileInfo getDefaultInstanceForType() {
                return FileInfo.getDefaultInstance();
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
                this.name_ = "";
                int i7 = this.bitField0_;
                this.isAppend_ = false;
                this.bitField0_ = i7 & (-4);
                this.data_ = ByteString.EMPTY;
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
            public com.zh.wear.protobuf.FactoryProtos.FileInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.FactoryProtos$FileInfo> r1 = com.zh.wear.protobuf.FactoryProtos.FileInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.FactoryProtos$FileInfo r3 = (com.zh.wear.protobuf.FactoryProtos.FileInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.FactoryProtos$FileInfo r4 = (com.zh.wear.protobuf.FactoryProtos.FileInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.FactoryProtos.FileInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.FactoryProtos$FileInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileInfo) {
                    return mergeFrom((FileInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileInfo fileInfo) {
                if (fileInfo == FileInfo.getDefaultInstance()) {
                    return this;
                }
                if (fileInfo.hasName()) {
                    this.bitField0_ |= 1;
                    this.name_ = fileInfo.name_;
                    onChanged();
                }
                if (fileInfo.hasIsAppend()) {
                    setIsAppend(fileInfo.getIsAppend());
                }
                if (fileInfo.hasData()) {
                    setData(fileInfo.getData());
                }
                mergeUnknownFields(((GeneratedMessage) fileInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        private FileInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.isAppend_ = false;
            this.data_ = ByteString.EMPTY;
        }

        public static FileInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_FileInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileInfo parseDelimitedFrom(InputStream inputStream) {
            return (FileInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<FileInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileInfo)) {
                return super.equals(obj);
            }
            FileInfo fileInfo = (FileInfo) obj;
            boolean z6 = hasName() == fileInfo.hasName();
            if (hasName()) {
                z6 = z6 && getName().equals(fileInfo.getName());
            }
            boolean z7 = z6 && hasIsAppend() == fileInfo.hasIsAppend();
            if (hasIsAppend()) {
                z7 = z7 && getIsAppend() == fileInfo.getIsAppend();
            }
            boolean z8 = z7 && hasData() == fileInfo.hasData();
            if (hasData()) {
                z8 = z8 && getData().equals(fileInfo.getData());
            }
            return z8 && this.unknownFields.equals(fileInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
        public boolean getIsAppend() {
            return this.isAppend_;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(2, this.isAppend_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(3, this.data_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
        public boolean hasIsAppend() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.FileInfoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasIsAppend()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsAppend());
            }
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_FileInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FileInfo.class, Builder.class);
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
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIsAppend()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBool(2, this.isAppend_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.data_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private FileInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.name_ = bytes;
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.isAppend_ = codedInputStream.readBool();
                            } else if (tag == 26) {
                                this.bitField0_ |= 4;
                                this.data_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(FileInfo fileInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileInfo);
        }

        public static FileInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileInfo parseFrom(CodedInputStream codedInputStream) {
            return (FileInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private FileInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileInfo parseFrom(InputStream inputStream) {
            return (FileInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static FileInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static FileInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static FileInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FileInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface FileInfoOrBuilder extends MessageOrBuilder {
        ByteString getData();

        boolean getIsAppend();

        String getName();

        ByteString getNameBytes();

        boolean hasData();

        boolean hasIsAppend();

        boolean hasName();
    }

    public static final class NfcInfo extends GeneratedMessageV3 implements NfcInfoOrBuilder {
        public static final int KEY_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object key_;
        private byte memoizedIsInitialized;
        private ByteString value_;
        private static final NfcInfo DEFAULT_INSTANCE = new NfcInfo();

        @Deprecated
        public static final Parser<NfcInfo> PARSER = new AbstractParser<NfcInfo>() { // from class: com.zh.wear.protobuf.FactoryProtos.NfcInfo.1
            @Override // com.google.protobuf.Parser
            public NfcInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NfcInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NfcInfoOrBuilder {
            private int bitField0_;
            private Object key_;
            private ByteString value_;

            private Builder() {
                this.key_ = "";
                this.value_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_NfcInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearKey() {
                this.bitField0_ &= -2;
                this.key_ = NfcInfo.getDefaultInstance().getKey();
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= -3;
                this.value_ = NfcInfo.getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_NfcInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
            public ByteString getValue() {
                return this.value_;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_NfcInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NfcInfo.class, Builder.class);
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

            public Builder setValue(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.value_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.key_ = "";
                this.value_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NfcInfo build() {
                NfcInfo nfcInfoBuildPartial = buildPartial();
                if (nfcInfoBuildPartial.isInitialized()) {
                    return nfcInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) nfcInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NfcInfo buildPartial() {
                NfcInfo nfcInfo = new NfcInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                nfcInfo.key_ = this.key_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                nfcInfo.value_ = this.value_;
                nfcInfo.bitField0_ = i8;
                onBuilt();
                return nfcInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NfcInfo getDefaultInstanceForType() {
                return NfcInfo.getDefaultInstance();
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
                this.bitField0_ = i7 & (-2);
                this.value_ = ByteString.EMPTY;
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
            public com.zh.wear.protobuf.FactoryProtos.NfcInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.FactoryProtos$NfcInfo> r1 = com.zh.wear.protobuf.FactoryProtos.NfcInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.FactoryProtos$NfcInfo r3 = (com.zh.wear.protobuf.FactoryProtos.NfcInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.FactoryProtos$NfcInfo r4 = (com.zh.wear.protobuf.FactoryProtos.NfcInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.FactoryProtos.NfcInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.FactoryProtos$NfcInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NfcInfo) {
                    return mergeFrom((NfcInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NfcInfo nfcInfo) {
                if (nfcInfo == NfcInfo.getDefaultInstance()) {
                    return this;
                }
                if (nfcInfo.hasKey()) {
                    this.bitField0_ |= 1;
                    this.key_ = nfcInfo.key_;
                    onChanged();
                }
                if (nfcInfo.hasValue()) {
                    setValue(nfcInfo.getValue());
                }
                mergeUnknownFields(((GeneratedMessage) nfcInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<NfcInfo> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.FactoryProtos.NfcInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> listBuilder_;
                private java.util.List<NfcInfo> list_;

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
                    return FactoryProtos.internal_static_NfcInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends NfcInfo> iterable) {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(NfcInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return FactoryProtos.internal_static_NfcInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
                public NfcInfo getList(int i7) {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (NfcInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
                public java.util.List<NfcInfo> getListList() {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
                public NfcInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (NfcInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
                public java.util.List<? extends NfcInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return FactoryProtos.internal_static_NfcInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, NfcInfo nfcInfo) {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, nfcInfo);
                        return this;
                    }
                    nfcInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, nfcInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, NfcInfo.getDefaultInstance());
                }

                public Builder setList(int i7, NfcInfo nfcInfo) {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, nfcInfo);
                        return this;
                    }
                    nfcInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, nfcInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(NfcInfo nfcInfo) {
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(nfcInfo);
                        return this;
                    }
                    nfcInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(nfcInfo);
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
                    RepeatedFieldBuilderV3<NfcInfo, Builder, NfcInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.FactoryProtos.NfcInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.FactoryProtos$NfcInfo$List> r1 = com.zh.wear.protobuf.FactoryProtos.NfcInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.FactoryProtos$NfcInfo$List r3 = (com.zh.wear.protobuf.FactoryProtos.NfcInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.FactoryProtos$NfcInfo$List r4 = (com.zh.wear.protobuf.FactoryProtos.NfcInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.FactoryProtos.NfcInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.FactoryProtos$NfcInfo$List$Builder");
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
                return FactoryProtos.internal_static_NfcInfo_List_descriptor;
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

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
            public NfcInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
            public java.util.List<NfcInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
            public NfcInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfo.ListOrBuilder
            public java.util.List<? extends NfcInfoOrBuilder> getListOrBuilderList() {
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
                return FactoryProtos.internal_static_NfcInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((NfcInfo) codedInputStream.readMessage(NfcInfo.PARSER, extensionRegistryLite));
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
            NfcInfo getList(int i7);

            int getListCount();

            java.util.List<NfcInfo> getListList();

            NfcInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends NfcInfoOrBuilder> getListOrBuilderList();
        }

        private NfcInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.key_ = "";
            this.value_ = ByteString.EMPTY;
        }

        public static NfcInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_NfcInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NfcInfo parseDelimitedFrom(InputStream inputStream) {
            return (NfcInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NfcInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<NfcInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NfcInfo)) {
                return super.equals(obj);
            }
            NfcInfo nfcInfo = (NfcInfo) obj;
            boolean z6 = hasKey() == nfcInfo.hasKey();
            if (hasKey()) {
                z6 = z6 && getKey().equals(nfcInfo.getKey());
            }
            boolean z7 = z6 && hasValue() == nfcInfo.hasValue();
            if (hasValue()) {
                z7 = z7 && getValue().equals(nfcInfo.getValue());
            }
            return z7 && this.unknownFields.equals(nfcInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
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
        public Parser<NfcInfo> getParserForType() {
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
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.value_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.FactoryProtos.NfcInfoOrBuilder
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
                iHashCode = (((iHashCode * 37) + 2) * 53) + getValue().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_NfcInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NfcInfo.class, Builder.class);
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
                codedOutputStream.writeBytes(2, this.value_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private NfcInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            } else if (tag == 18) {
                                this.bitField0_ |= 2;
                                this.value_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(NfcInfo nfcInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nfcInfo);
        }

        public static NfcInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NfcInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NfcInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NfcInfo parseFrom(CodedInputStream codedInputStream) {
            return (NfcInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NfcInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private NfcInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NfcInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NfcInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NfcInfo parseFrom(InputStream inputStream) {
            return (NfcInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static NfcInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NfcInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NfcInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static NfcInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static NfcInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NfcInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface NfcInfoOrBuilder extends MessageOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        ByteString getValue();

        boolean hasKey();

        boolean hasValue();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012wear_factory.proto\u001a\fnanopb.proto\"ª\u0001\n\u0007Factory\u0012\u001c\n\u0004mode\u0018\u0001 \u0001(\u000e2\f.FactoryModeH\u0000\u0012!\n\bnfc_list\u0018\u0002 \u0001(\u000b2\r.NfcInfo.ListH\u0000\u0012\u0019\n\u0004file\u0018\u0003 \u0001(\u000b2\t.FileInfoH\u0000\"8\n\tFactoryID\u0012\f\n\bSET_MODE\u0010\u0000\u0012\u000e\n\nCONFIG_NFC\u0010\u0001\u0012\r\n\tDUMP_FILE\u0010\u0002B\t\n\u0007payload\"Z\n\u0007NfcInfo\u0012\u0012\n\u0003key\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005value\u0018\u0002 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u001a%\n\u0004List\u0012\u001d\n\u0004list\u0018\u0001 \u0003(\u000b2\b.NfcInfoB\u0005\u0092?\u0002\u0018\u0004\"G\n\bFileInfo\u0012\u0013\n\u0004name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0011\n\tis_append\u0018\u0002 \u0002(\b\u0012\u0013\n\u0004data\u0018\u0003 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004*/\n\u000bFactoryMode\u0012\b\n\u0004USER\u0010\u0000\u0012\r\n\tUSERDEBUG\u0010\u0001\u0012\u0007\n\u0003ENG\u0010\u0002B%\n\u0014com.zh.wear.protobufB\rFactoryProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.FactoryProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = FactoryProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Factory_descriptor = descriptor2;
        internal_static_Factory_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Mode", "NfcList", "File", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_NfcInfo_descriptor = descriptor3;
        internal_static_NfcInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_NfcInfo_List_descriptor = descriptor4;
        internal_static_NfcInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(2);
        internal_static_FileInfo_descriptor = descriptor5;
        internal_static_FileInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Name", "IsAppend", "Data"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private FactoryProtos() {
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