package com.zh.ble.sa_wear.protobuf;

import com.google.common.net.HttpHeaders;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class CommonProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEBLEConnectParameterConfig_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEBLEConnectParameterConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEKeyValue_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEKeyValue_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SERangeValue_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SERangeValue_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SESettingTime_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SESettingTime_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SETimeDate_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SETimeDate_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SETime_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SETime_fieldAccessorTable;

    public enum ImageFormat implements ProtocolMessageEnum {
        RGB_565(0),
        RGB_565_SWAP(1),
        ARGB_8888_LE(2),
        ARGB_8888(3),
        RGB888(4),
        ARGB_8565_LE(7),
        ARGB_8565(8),
        JPEG(5),
        PNG(6),
        GIF(9),
        VECTOR(10),
        MP4(11),
        EZIP(12);

        public static final int ARGB_8565_LE_VALUE = 7;
        public static final int ARGB_8565_VALUE = 8;
        public static final int ARGB_8888_LE_VALUE = 2;
        public static final int ARGB_8888_VALUE = 3;
        public static final int EZIP_VALUE = 12;
        public static final int GIF_VALUE = 9;
        public static final int JPEG_VALUE = 5;
        public static final int MP4_VALUE = 11;
        public static final int PNG_VALUE = 6;
        public static final int RGB888_VALUE = 4;
        public static final int RGB_565_SWAP_VALUE = 1;
        public static final int RGB_565_VALUE = 0;
        private static final ImageFormat[] VALUES;
        public static final int VECTOR_VALUE = 10;
        private static final Internal.EnumLiteMap<ImageFormat> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$ImageFormat$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<ImageFormat> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ImageFormat findValueByNumber(int i7) {
                return ImageFormat.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ImageFormat");
            internalValueMap = new Internal.EnumLiteMap<ImageFormat>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.ImageFormat.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ImageFormat findValueByNumber(int i7) {
                    return ImageFormat.forNumber(i7);
                }
            };
            VALUES = values();
        }

        ImageFormat(int i7) {
            this.value = i7;
        }

        public static ImageFormat forNumber(int i7) {
            switch (i7) {
                case 0:
                    return RGB_565;
                case 1:
                    return RGB_565_SWAP;
                case 2:
                    return ARGB_8888_LE;
                case 3:
                    return ARGB_8888;
                case 4:
                    return RGB888;
                case 5:
                    return JPEG;
                case 6:
                    return PNG;
                case 7:
                    return ARGB_8565_LE;
                case 8:
                    return ARGB_8565;
                case 9:
                    return GIF;
                case 10:
                    return VECTOR;
                case 11:
                    return MP4;
                case 12:
                    return EZIP;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumType(2);
        }

        public static Internal.EnumLiteMap<ImageFormat> internalGetValueMap() {
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
        public static ImageFormat valueOf(int i7) {
            return forNumber(i7);
        }

        public static ImageFormat valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEBLEConnectParameterConfig extends GeneratedMessage implements SEBLEConnectParameterConfigOrBuilder {
        public static final int CONFIG_CHANGE_MTU_FIELD_NUMBER = 1;
        public static final int CONFIG_OTA_INTERVAL_MAX_FIELD_NUMBER = 3;
        public static final int CONFIG_OTA_INTERVAL_MIN_FIELD_NUMBER = 2;
        private static final SEBLEConnectParameterConfig DEFAULT_INSTANCE;
        private static final Parser<SEBLEConnectParameterConfig> PARSER;
        public static final int PHONE_TYPE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int configChangeMtu_;
        private int configOtaIntervalMax_;
        private int configOtaIntervalMin_;
        private byte memoizedIsInitialized;
        private int phoneType_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SEBLEConnectParameterConfig$1 */
        public class AnonymousClass1 extends AbstractParser<SEBLEConnectParameterConfig> {
            @Override // com.google.protobuf.Parser
            public SEBLEConnectParameterConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEBLEConnectParameterConfig.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBLEConnectParameterConfigOrBuilder {
            private int bitField0_;
            private int configChangeMtu_;
            private int configOtaIntervalMax_;
            private int configOtaIntervalMin_;
            private int phoneType_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEBLEConnectParameterConfig sEBLEConnectParameterConfig) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEBLEConnectParameterConfig.configChangeMtu_ = this.configChangeMtu_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEBLEConnectParameterConfig.configOtaIntervalMin_ = this.configOtaIntervalMin_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEBLEConnectParameterConfig.configOtaIntervalMax_ = this.configOtaIntervalMax_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEBLEConnectParameterConfig.phoneType_ = this.phoneType_;
                    i7 |= 8;
                }
                sEBLEConnectParameterConfig.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_SA_SEBLEConnectParameterConfig_descriptor;
            }

            public Builder clearConfigChangeMtu() {
                this.bitField0_ &= -2;
                this.configChangeMtu_ = 0;
                onChanged();
                return this;
            }

            public Builder clearConfigOtaIntervalMax() {
                this.bitField0_ &= -5;
                this.configOtaIntervalMax_ = 0;
                onChanged();
                return this;
            }

            public Builder clearConfigOtaIntervalMin() {
                this.bitField0_ &= -3;
                this.configOtaIntervalMin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPhoneType() {
                this.bitField0_ &= -9;
                this.phoneType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public int getConfigChangeMtu() {
                return this.configChangeMtu_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public int getConfigOtaIntervalMax() {
                return this.configOtaIntervalMax_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public int getConfigOtaIntervalMin() {
                return this.configOtaIntervalMin_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_SA_SEBLEConnectParameterConfig_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public SEPhoneType getPhoneType() {
                SEPhoneType sEPhoneTypeForNumber = SEPhoneType.forNumber(this.phoneType_);
                return sEPhoneTypeForNumber == null ? SEPhoneType.ANDROID : sEPhoneTypeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public boolean hasConfigChangeMtu() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public boolean hasConfigOtaIntervalMax() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public boolean hasConfigOtaIntervalMin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
            public boolean hasPhoneType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_SA_SEBLEConnectParameterConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBLEConnectParameterConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setConfigChangeMtu(int i7) {
                this.configChangeMtu_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigOtaIntervalMax(int i7) {
                this.configOtaIntervalMax_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigOtaIntervalMin(int i7) {
                this.configOtaIntervalMin_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPhoneType(SEPhoneType sEPhoneType) {
                sEPhoneType.getClass();
                this.bitField0_ |= 8;
                this.phoneType_ = sEPhoneType.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.phoneType_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBLEConnectParameterConfig build() {
                SEBLEConnectParameterConfig sEBLEConnectParameterConfigBuildPartial = buildPartial();
                if (sEBLEConnectParameterConfigBuildPartial.isInitialized()) {
                    return sEBLEConnectParameterConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBLEConnectParameterConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBLEConnectParameterConfig buildPartial() {
                SEBLEConnectParameterConfig sEBLEConnectParameterConfig = new SEBLEConnectParameterConfig(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBLEConnectParameterConfig);
                }
                onBuilt();
                return sEBLEConnectParameterConfig;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBLEConnectParameterConfig getDefaultInstanceForType() {
                return SEBLEConnectParameterConfig.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.phoneType_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.configChangeMtu_ = 0;
                this.configOtaIntervalMin_ = 0;
                this.configOtaIntervalMax_ = 0;
                this.phoneType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBLEConnectParameterConfig) {
                    return mergeFrom((SEBLEConnectParameterConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEBLEConnectParameterConfig sEBLEConnectParameterConfig) {
                if (sEBLEConnectParameterConfig == SEBLEConnectParameterConfig.getDefaultInstance()) {
                    return this;
                }
                if (sEBLEConnectParameterConfig.hasConfigChangeMtu()) {
                    setConfigChangeMtu(sEBLEConnectParameterConfig.getConfigChangeMtu());
                }
                if (sEBLEConnectParameterConfig.hasConfigOtaIntervalMin()) {
                    setConfigOtaIntervalMin(sEBLEConnectParameterConfig.getConfigOtaIntervalMin());
                }
                if (sEBLEConnectParameterConfig.hasConfigOtaIntervalMax()) {
                    setConfigOtaIntervalMax(sEBLEConnectParameterConfig.getConfigOtaIntervalMax());
                }
                if (sEBLEConnectParameterConfig.hasPhoneType()) {
                    setPhoneType(sEBLEConnectParameterConfig.getPhoneType());
                }
                mergeUnknownFields(sEBLEConnectParameterConfig.getUnknownFields());
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
                                    this.configChangeMtu_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.configOtaIntervalMin_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.configOtaIntervalMax_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (SEPhoneType.forNumber(i7) == null) {
                                        mergeUnknownVarintField(4, i7);
                                    } else {
                                        this.phoneType_ = i7;
                                        this.bitField0_ |= 8;
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

        public enum SEPhoneType implements ProtocolMessageEnum {
            ANDROID(0),
            IOS(1);

            public static final int ANDROID_VALUE = 0;
            public static final int IOS_VALUE = 1;
            private static final SEPhoneType[] VALUES;
            private static final Internal.EnumLiteMap<SEPhoneType> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SEBLEConnectParameterConfig$SEPhoneType$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEPhoneType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEPhoneType findValueByNumber(int i7) {
                    return SEPhoneType.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPhoneType");
                internalValueMap = new Internal.EnumLiteMap<SEPhoneType>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfig.SEPhoneType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEPhoneType findValueByNumber(int i7) {
                        return SEPhoneType.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEPhoneType(int i7) {
                this.value = i7;
            }

            public static SEPhoneType forNumber(int i7) {
                if (i7 == 0) {
                    return ANDROID;
                }
                if (i7 != 1) {
                    return null;
                }
                return IOS;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEBLEConnectParameterConfig.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEPhoneType> internalGetValueMap() {
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
            public static SEPhoneType valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEPhoneType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBLEConnectParameterConfig");
            DEFAULT_INSTANCE = new SEBLEConnectParameterConfig();
            PARSER = new AbstractParser<SEBLEConnectParameterConfig>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfig.1
                @Override // com.google.protobuf.Parser
                public SEBLEConnectParameterConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBLEConnectParameterConfig.newBuilder();
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

        public /* synthetic */ SEBLEConnectParameterConfig(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEBLEConnectParameterConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_SA_SEBLEConnectParameterConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBLEConnectParameterConfig parseDelimitedFrom(InputStream inputStream) {
            return (SEBLEConnectParameterConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBLEConnectParameterConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBLEConnectParameterConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBLEConnectParameterConfig)) {
                return super.equals(obj);
            }
            SEBLEConnectParameterConfig sEBLEConnectParameterConfig = (SEBLEConnectParameterConfig) obj;
            if (hasConfigChangeMtu() != sEBLEConnectParameterConfig.hasConfigChangeMtu()) {
                return false;
            }
            if ((hasConfigChangeMtu() && getConfigChangeMtu() != sEBLEConnectParameterConfig.getConfigChangeMtu()) || hasConfigOtaIntervalMin() != sEBLEConnectParameterConfig.hasConfigOtaIntervalMin()) {
                return false;
            }
            if ((hasConfigOtaIntervalMin() && getConfigOtaIntervalMin() != sEBLEConnectParameterConfig.getConfigOtaIntervalMin()) || hasConfigOtaIntervalMax() != sEBLEConnectParameterConfig.hasConfigOtaIntervalMax()) {
                return false;
            }
            if ((!hasConfigOtaIntervalMax() || getConfigOtaIntervalMax() == sEBLEConnectParameterConfig.getConfigOtaIntervalMax()) && hasPhoneType() == sEBLEConnectParameterConfig.hasPhoneType()) {
                return (!hasPhoneType() || this.phoneType_ == sEBLEConnectParameterConfig.phoneType_) && getUnknownFields().equals(sEBLEConnectParameterConfig.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public int getConfigChangeMtu() {
            return this.configChangeMtu_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public int getConfigOtaIntervalMax() {
            return this.configOtaIntervalMax_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public int getConfigOtaIntervalMin() {
            return this.configOtaIntervalMin_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CommonProtos.internal_static_SA_SEBLEConnectParameterConfig_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEBLEConnectParameterConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public SEPhoneType getPhoneType() {
            SEPhoneType sEPhoneTypeForNumber = SEPhoneType.forNumber(this.phoneType_);
            return sEPhoneTypeForNumber == null ? SEPhoneType.ANDROID : sEPhoneTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.configChangeMtu_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.configOtaIntervalMin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.configOtaIntervalMax_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(4, this.phoneType_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public boolean hasConfigChangeMtu() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public boolean hasConfigOtaIntervalMax() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public boolean hasConfigOtaIntervalMin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEBLEConnectParameterConfigOrBuilder
        public boolean hasPhoneType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasConfigChangeMtu()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getConfigChangeMtu();
            }
            if (hasConfigOtaIntervalMin()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getConfigOtaIntervalMin();
            }
            if (hasConfigOtaIntervalMax()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getConfigOtaIntervalMax();
            }
            if (hasPhoneType()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.phoneType_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_SA_SEBLEConnectParameterConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBLEConnectParameterConfig.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.configChangeMtu_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.configOtaIntervalMin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.configOtaIntervalMax_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.phoneType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEBLEConnectParameterConfig(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.configChangeMtu_ = 0;
            this.configOtaIntervalMin_ = 0;
            this.configOtaIntervalMax_ = 0;
            this.phoneType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBLEConnectParameterConfig sEBLEConnectParameterConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBLEConnectParameterConfig);
        }

        public static SEBLEConnectParameterConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBLEConnectParameterConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBLEConnectParameterConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBLEConnectParameterConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBLEConnectParameterConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBLEConnectParameterConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEBLEConnectParameterConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEBLEConnectParameterConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEBLEConnectParameterConfig parseFrom(InputStream inputStream) {
            return (SEBLEConnectParameterConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEBLEConnectParameterConfig() {
            this.configChangeMtu_ = 0;
            this.configOtaIntervalMin_ = 0;
            this.configOtaIntervalMax_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.phoneType_ = 0;
        }

        public static SEBLEConnectParameterConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBLEConnectParameterConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBLEConnectParameterConfig parseFrom(CodedInputStream codedInputStream) {
            return (SEBLEConnectParameterConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEBLEConnectParameterConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBLEConnectParameterConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEBLEConnectParameterConfigOrBuilder extends MessageOrBuilder {
        int getConfigChangeMtu();

        int getConfigOtaIntervalMax();

        int getConfigOtaIntervalMin();

        SEBLEConnectParameterConfig.SEPhoneType getPhoneType();

        boolean hasConfigChangeMtu();

        boolean hasConfigOtaIntervalMax();

        boolean hasConfigOtaIntervalMin();

        boolean hasPhoneType();
    }

    public enum SEErrorCode implements ProtocolMessageEnum {
        NO_ERROR(0),
        NOT_SUPPORT(1),
        DEPENDENCY_NOT_READY(2),
        SET_FAILED(3),
        PARAM_ERROR(4),
        UNKNOWN(255);

        public static final int DEPENDENCY_NOT_READY_VALUE = 2;
        public static final int NOT_SUPPORT_VALUE = 1;
        public static final int NO_ERROR_VALUE = 0;
        public static final int PARAM_ERROR_VALUE = 4;
        public static final int SET_FAILED_VALUE = 3;
        public static final int UNKNOWN_VALUE = 255;
        private static final SEErrorCode[] VALUES;
        private static final Internal.EnumLiteMap<SEErrorCode> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SEErrorCode$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEErrorCode> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEErrorCode findValueByNumber(int i7) {
                return SEErrorCode.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEErrorCode");
            internalValueMap = new Internal.EnumLiteMap<SEErrorCode>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SEErrorCode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEErrorCode findValueByNumber(int i7) {
                    return SEErrorCode.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEErrorCode(int i7) {
            this.value = i7;
        }

        public static SEErrorCode forNumber(int i7) {
            if (i7 == 255) {
                return UNKNOWN;
            }
            if (i7 == 0) {
                return NO_ERROR;
            }
            if (i7 == 1) {
                return NOT_SUPPORT;
            }
            if (i7 == 2) {
                return DEPENDENCY_NOT_READY;
            }
            if (i7 == 3) {
                return SET_FAILED;
            }
            if (i7 != 4) {
                return null;
            }
            return PARAM_ERROR;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEErrorCode> internalGetValueMap() {
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
        public static SEErrorCode valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEErrorCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEKeyValue extends GeneratedMessage implements SEKeyValueOrBuilder {
        private static final SEKeyValue DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static final Parser<SEKeyValue> PARSER;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object key_;
        private byte memoizedIsInitialized;
        private int value_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SEKeyValue$1 */
        public class AnonymousClass1 extends AbstractParser<SEKeyValue> {
            @Override // com.google.protobuf.Parser
            public SEKeyValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEKeyValue.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEKeyValueOrBuilder {
            private int bitField0_;
            private Object key_;
            private int value_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEKeyValue sEKeyValue) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEKeyValue.key_ = this.key_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEKeyValue.value_ = this.value_;
                    i7 |= 2;
                }
                sEKeyValue.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_SA_SEKeyValue_descriptor;
            }

            public Builder clearKey() {
                this.key_ = SEKeyValue.getDefaultInstance().getKey();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= -3;
                this.value_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_SA_SEKeyValue_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
            public int getValue() {
                return this.value_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_SA_SEKeyValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SEKeyValue.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasKey() && hasValue();
            }

            public Builder setKey(String str) {
                str.getClass();
                this.key_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.key_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setValue(int i7) {
                this.value_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.key_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEKeyValue build() {
                SEKeyValue sEKeyValueBuildPartial = buildPartial();
                if (sEKeyValueBuildPartial.isInitialized()) {
                    return sEKeyValueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEKeyValueBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEKeyValue buildPartial() {
                SEKeyValue sEKeyValue = new SEKeyValue(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEKeyValue);
                }
                onBuilt();
                return sEKeyValue;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEKeyValue getDefaultInstanceForType() {
                return SEKeyValue.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.key_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.key_ = "";
                this.value_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEKeyValue) {
                    return mergeFrom((SEKeyValue) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEKeyValue sEKeyValue) {
                if (sEKeyValue == SEKeyValue.getDefaultInstance()) {
                    return this;
                }
                if (sEKeyValue.hasKey()) {
                    this.key_ = sEKeyValue.key_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEKeyValue.hasValue()) {
                    setValue(sEKeyValue.getValue());
                }
                mergeUnknownFields(sEKeyValue.getUnknownFields());
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
                                    this.key_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.value_ = codedInputStream.readSInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEKeyValue");
            DEFAULT_INSTANCE = new SEKeyValue();
            PARSER = new AbstractParser<SEKeyValue>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValue.1
                @Override // com.google.protobuf.Parser
                public SEKeyValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEKeyValue.newBuilder();
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

        public /* synthetic */ SEKeyValue(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEKeyValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_SA_SEKeyValue_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEKeyValue parseDelimitedFrom(InputStream inputStream) {
            return (SEKeyValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEKeyValue parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEKeyValue> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEKeyValue)) {
                return super.equals(obj);
            }
            SEKeyValue sEKeyValue = (SEKeyValue) obj;
            if (hasKey() != sEKeyValue.hasKey()) {
                return false;
            }
            if ((!hasKey() || getKey().equals(sEKeyValue.getKey())) && hasValue() == sEKeyValue.hasValue()) {
                return (!hasValue() || getValue() == sEKeyValue.getValue()) && getUnknownFields().equals(sEKeyValue.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CommonProtos.internal_static_SA_SEKeyValue_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
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
        public Parser<SEKeyValue> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.key_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeSInt32Size(2, this.value_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
        public int getValue() {
            return this.value_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SEKeyValueOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
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
                iHashCode = (((iHashCode * 37) + 2) * 53) + getValue();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_SA_SEKeyValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SEKeyValue.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.key_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeSInt32(2, this.value_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEKeyValue(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.key_ = "";
            this.value_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEKeyValue sEKeyValue) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEKeyValue);
        }

        public static SEKeyValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEKeyValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEKeyValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEKeyValue parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEKeyValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEKeyValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEKeyValue parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEKeyValue() {
            this.key_ = "";
            this.value_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.key_ = "";
        }

        public static SEKeyValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEKeyValue parseFrom(InputStream inputStream) {
            return (SEKeyValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEKeyValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEKeyValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEKeyValue parseFrom(CodedInputStream codedInputStream) {
            return (SEKeyValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEKeyValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEKeyValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEKeyValueOrBuilder extends MessageOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        int getValue();

        boolean hasKey();

        boolean hasValue();
    }

    public enum SEOptionalSwitcher implements ProtocolMessageEnum {
        NO_FEATURE(0),
        ON(1),
        OFF(2);

        public static final int NO_FEATURE_VALUE = 0;
        public static final int OFF_VALUE = 2;
        public static final int ON_VALUE = 1;
        private static final SEOptionalSwitcher[] VALUES;
        private static final Internal.EnumLiteMap<SEOptionalSwitcher> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SEOptionalSwitcher$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEOptionalSwitcher> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEOptionalSwitcher findValueByNumber(int i7) {
                return SEOptionalSwitcher.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEOptionalSwitcher");
            internalValueMap = new Internal.EnumLiteMap<SEOptionalSwitcher>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SEOptionalSwitcher.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEOptionalSwitcher findValueByNumber(int i7) {
                    return SEOptionalSwitcher.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEOptionalSwitcher(int i7) {
            this.value = i7;
        }

        public static SEOptionalSwitcher forNumber(int i7) {
            if (i7 == 0) {
                return NO_FEATURE;
            }
            if (i7 == 1) {
                return ON;
            }
            if (i7 != 2) {
                return null;
            }
            return OFF;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumType(3);
        }

        public static Internal.EnumLiteMap<SEOptionalSwitcher> internalGetValueMap() {
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
        public static SEOptionalSwitcher valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEOptionalSwitcher valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEPrepareStatus implements ProtocolMessageEnum {
        READY(0),
        BUSY(1),
        DUPLICATED(2),
        LOW_STORAGE(3),
        LOW_BATTERY(4),
        DOWNGRADE(5),
        LOW_STORAGE_TO_ASK_DELETE(6);

        public static final int BUSY_VALUE = 1;
        public static final int DOWNGRADE_VALUE = 5;
        public static final int DUPLICATED_VALUE = 2;
        public static final int LOW_BATTERY_VALUE = 4;
        public static final int LOW_STORAGE_TO_ASK_DELETE_VALUE = 6;
        public static final int LOW_STORAGE_VALUE = 3;
        public static final int READY_VALUE = 0;
        private static final SEPrepareStatus[] VALUES;
        private static final Internal.EnumLiteMap<SEPrepareStatus> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SEPrepareStatus$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEPrepareStatus> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEPrepareStatus findValueByNumber(int i7) {
                return SEPrepareStatus.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPrepareStatus");
            internalValueMap = new Internal.EnumLiteMap<SEPrepareStatus>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SEPrepareStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEPrepareStatus findValueByNumber(int i7) {
                    return SEPrepareStatus.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEPrepareStatus(int i7) {
            this.value = i7;
        }

        public static SEPrepareStatus forNumber(int i7) {
            switch (i7) {
                case 0:
                    return READY;
                case 1:
                    return BUSY;
                case 2:
                    return DUPLICATED;
                case 3:
                    return LOW_STORAGE;
                case 4:
                    return LOW_BATTERY;
                case 5:
                    return DOWNGRADE;
                case 6:
                    return LOW_STORAGE_TO_ASK_DELETE;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return CommonProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SEPrepareStatus> internalGetValueMap() {
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
        public static SEPrepareStatus valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEPrepareStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SERangeValue extends GeneratedMessage implements SERangeValueOrBuilder {
        private static final SERangeValue DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static final Parser<SERangeValue> PARSER;
        public static final int TO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int from_;
        private byte memoizedIsInitialized;
        private int to_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SERangeValue$1 */
        public class AnonymousClass1 extends AbstractParser<SERangeValue> {
            @Override // com.google.protobuf.Parser
            public SERangeValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SERangeValue.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SERangeValueOrBuilder {
            private int bitField0_;
            private int from_;
            private int to_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SERangeValue sERangeValue) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sERangeValue.from_ = this.from_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sERangeValue.to_ = this.to_;
                    i7 |= 2;
                }
                sERangeValue.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_SA_SERangeValue_descriptor;
            }

            public Builder clearFrom() {
                this.bitField0_ &= -2;
                this.from_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTo() {
                this.bitField0_ &= -3;
                this.to_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_SA_SERangeValue_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
            public int getFrom() {
                return this.from_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
            public int getTo() {
                return this.to_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
            public boolean hasFrom() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
            public boolean hasTo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_SA_SERangeValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SERangeValue.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFrom() && hasTo();
            }

            public Builder setFrom(int i7) {
                this.from_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTo(int i7) {
                this.to_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SERangeValue build() {
                SERangeValue sERangeValueBuildPartial = buildPartial();
                if (sERangeValueBuildPartial.isInitialized()) {
                    return sERangeValueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sERangeValueBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SERangeValue buildPartial() {
                SERangeValue sERangeValue = new SERangeValue(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sERangeValue);
                }
                onBuilt();
                return sERangeValue;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SERangeValue getDefaultInstanceForType() {
                return SERangeValue.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.from_ = 0;
                this.to_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SERangeValue) {
                    return mergeFrom((SERangeValue) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SERangeValue sERangeValue) {
                if (sERangeValue == SERangeValue.getDefaultInstance()) {
                    return this;
                }
                if (sERangeValue.hasFrom()) {
                    setFrom(sERangeValue.getFrom());
                }
                if (sERangeValue.hasTo()) {
                    setTo(sERangeValue.getTo());
                }
                mergeUnknownFields(sERangeValue.getUnknownFields());
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
                                    this.from_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.to_ = codedInputStream.readSInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SERangeValue");
            DEFAULT_INSTANCE = new SERangeValue();
            PARSER = new AbstractParser<SERangeValue>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValue.1
                @Override // com.google.protobuf.Parser
                public SERangeValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SERangeValue.newBuilder();
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

        public /* synthetic */ SERangeValue(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SERangeValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_SA_SERangeValue_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SERangeValue parseDelimitedFrom(InputStream inputStream) {
            return (SERangeValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SERangeValue parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SERangeValue> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SERangeValue)) {
                return super.equals(obj);
            }
            SERangeValue sERangeValue = (SERangeValue) obj;
            if (hasFrom() != sERangeValue.hasFrom()) {
                return false;
            }
            if ((!hasFrom() || getFrom() == sERangeValue.getFrom()) && hasTo() == sERangeValue.hasTo()) {
                return (!hasTo() || getTo() == sERangeValue.getTo()) && getUnknownFields().equals(sERangeValue.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CommonProtos.internal_static_SA_SERangeValue_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
        public int getFrom() {
            return this.from_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SERangeValue> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeSInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeSInt32Size(1, this.from_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeSInt32Size(2, this.to_);
            }
            int serializedSize = iComputeSInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
        public int getTo() {
            return this.to_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
        public boolean hasFrom() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SERangeValueOrBuilder
        public boolean hasTo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasFrom()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFrom();
            }
            if (hasTo()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTo();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_SA_SERangeValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SERangeValue.class, Builder.class);
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
            if (!hasFrom()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTo()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeSInt32(1, this.from_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeSInt32(2, this.to_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SERangeValue(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.from_ = 0;
            this.to_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SERangeValue sERangeValue) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sERangeValue);
        }

        public static SERangeValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SERangeValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SERangeValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SERangeValue parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SERangeValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SERangeValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SERangeValue parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SERangeValue() {
            this.from_ = 0;
            this.to_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SERangeValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SERangeValue parseFrom(InputStream inputStream) {
            return (SERangeValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SERangeValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SERangeValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SERangeValue parseFrom(CodedInputStream codedInputStream) {
            return (SERangeValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SERangeValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SERangeValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SERangeValueOrBuilder extends MessageOrBuilder {
        int getFrom();

        int getTo();

        boolean hasFrom();

        boolean hasTo();
    }

    public static final class SESettingTime extends GeneratedMessage implements SESettingTimeOrBuilder {
        private static final SESettingTime DEFAULT_INSTANCE;
        public static final int HOUR_FIELD_NUMBER = 1;
        public static final int MILLISECOND_FIELD_NUMBER = 4;
        public static final int MINUTER_FIELD_NUMBER = 2;
        private static final Parser<SESettingTime> PARSER;
        public static final int SECOND_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int hour_;
        private byte memoizedIsInitialized;
        private int millisecond_;
        private int minuter_;
        private int second_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SESettingTime$1 */
        public class AnonymousClass1 extends AbstractParser<SESettingTime> {
            @Override // com.google.protobuf.Parser
            public SESettingTime parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESettingTime.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESettingTimeOrBuilder {
            private int bitField0_;
            private int hour_;
            private int millisecond_;
            private int minuter_;
            private int second_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SESettingTime sESettingTime) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESettingTime.hour_ = this.hour_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESettingTime.minuter_ = this.minuter_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESettingTime.second_ = this.second_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sESettingTime.millisecond_ = this.millisecond_;
                    i7 |= 8;
                }
                sESettingTime.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_SA_SESettingTime_descriptor;
            }

            public Builder clearHour() {
                this.bitField0_ &= -2;
                this.hour_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMillisecond() {
                this.bitField0_ &= -9;
                this.millisecond_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMinuter() {
                this.bitField0_ &= -3;
                this.minuter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSecond() {
                this.bitField0_ &= -5;
                this.second_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_SA_SESettingTime_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public int getHour() {
                return this.hour_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public int getMillisecond() {
                return this.millisecond_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public int getMinuter() {
                return this.minuter_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public int getSecond() {
                return this.second_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public boolean hasHour() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public boolean hasMillisecond() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public boolean hasMinuter() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
            public boolean hasSecond() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_SA_SESettingTime_fieldAccessorTable.ensureFieldAccessorsInitialized(SESettingTime.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasHour() && hasMinuter();
            }

            public Builder setHour(int i7) {
                this.hour_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMillisecond(int i7) {
                this.millisecond_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMinuter(int i7) {
                this.minuter_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSecond(int i7) {
                this.second_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESettingTime build() {
                SESettingTime sESettingTimeBuildPartial = buildPartial();
                if (sESettingTimeBuildPartial.isInitialized()) {
                    return sESettingTimeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESettingTimeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESettingTime buildPartial() {
                SESettingTime sESettingTime = new SESettingTime(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESettingTime);
                }
                onBuilt();
                return sESettingTime;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESettingTime getDefaultInstanceForType() {
                return SESettingTime.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.hour_ = 0;
                this.minuter_ = 0;
                this.second_ = 0;
                this.millisecond_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESettingTime) {
                    return mergeFrom((SESettingTime) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESettingTime sESettingTime) {
                if (sESettingTime == SESettingTime.getDefaultInstance()) {
                    return this;
                }
                if (sESettingTime.hasHour()) {
                    setHour(sESettingTime.getHour());
                }
                if (sESettingTime.hasMinuter()) {
                    setMinuter(sESettingTime.getMinuter());
                }
                if (sESettingTime.hasSecond()) {
                    setSecond(sESettingTime.getSecond());
                }
                if (sESettingTime.hasMillisecond()) {
                    setMillisecond(sESettingTime.getMillisecond());
                }
                mergeUnknownFields(sESettingTime.getUnknownFields());
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
                                    this.hour_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.minuter_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.second_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.millisecond_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESettingTime");
            DEFAULT_INSTANCE = new SESettingTime();
            PARSER = new AbstractParser<SESettingTime>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTime.1
                @Override // com.google.protobuf.Parser
                public SESettingTime parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESettingTime.newBuilder();
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

        public /* synthetic */ SESettingTime(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SESettingTime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_SA_SESettingTime_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESettingTime parseDelimitedFrom(InputStream inputStream) {
            return (SESettingTime) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESettingTime parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESettingTime> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESettingTime)) {
                return super.equals(obj);
            }
            SESettingTime sESettingTime = (SESettingTime) obj;
            if (hasHour() != sESettingTime.hasHour()) {
                return false;
            }
            if ((hasHour() && getHour() != sESettingTime.getHour()) || hasMinuter() != sESettingTime.hasMinuter()) {
                return false;
            }
            if ((hasMinuter() && getMinuter() != sESettingTime.getMinuter()) || hasSecond() != sESettingTime.hasSecond()) {
                return false;
            }
            if ((!hasSecond() || getSecond() == sESettingTime.getSecond()) && hasMillisecond() == sESettingTime.hasMillisecond()) {
                return (!hasMillisecond() || getMillisecond() == sESettingTime.getMillisecond()) && getUnknownFields().equals(sESettingTime.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CommonProtos.internal_static_SA_SESettingTime_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public int getHour() {
            return this.hour_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public int getMillisecond() {
            return this.millisecond_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public int getMinuter() {
            return this.minuter_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESettingTime> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public int getSecond() {
            return this.second_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.hour_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.minuter_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.second_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.millisecond_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public boolean hasHour() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public boolean hasMillisecond() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public boolean hasMinuter() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SESettingTimeOrBuilder
        public boolean hasSecond() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasHour()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getHour();
            }
            if (hasMinuter()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMinuter();
            }
            if (hasSecond()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSecond();
            }
            if (hasMillisecond()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMillisecond();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_SA_SESettingTime_fieldAccessorTable.ensureFieldAccessorsInitialized(SESettingTime.class, Builder.class);
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
            if (!hasHour()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMinuter()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.hour_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.minuter_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.second_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.millisecond_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESettingTime(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.hour_ = 0;
            this.minuter_ = 0;
            this.second_ = 0;
            this.millisecond_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESettingTime sESettingTime) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESettingTime);
        }

        public static SESettingTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESettingTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESettingTime) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESettingTime parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESettingTime getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESettingTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESettingTime parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESettingTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESettingTime parseFrom(InputStream inputStream) {
            return (SESettingTime) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SESettingTime() {
            this.hour_ = 0;
            this.minuter_ = 0;
            this.second_ = 0;
            this.millisecond_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SESettingTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESettingTime) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESettingTime parseFrom(CodedInputStream codedInputStream) {
            return (SESettingTime) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESettingTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESettingTime) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESettingTimeOrBuilder extends MessageOrBuilder {
        int getHour();

        int getMillisecond();

        int getMinuter();

        int getSecond();

        boolean hasHour();

        boolean hasMillisecond();

        boolean hasMinuter();

        boolean hasSecond();
    }

    public static final class SETime extends GeneratedMessage implements SETimeOrBuilder {
        public static final int DAY_FIELD_NUMBER = 3;
        private static final SETime DEFAULT_INSTANCE;
        public static final int HOUR_FIELD_NUMBER = 4;
        public static final int MINUTE_FIELD_NUMBER = 5;
        public static final int MONTH_FIELD_NUMBER = 2;
        private static final Parser<SETime> PARSER;
        public static final int SECOND_FIELD_NUMBER = 6;
        public static final int YEAR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int day_;
        private int hour_;
        private byte memoizedIsInitialized;
        private int minute_;
        private int month_;
        private int second_;
        private int year_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SETime$1 */
        public class AnonymousClass1 extends AbstractParser<SETime> {
            @Override // com.google.protobuf.Parser
            public SETime parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SETime.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SETimeOrBuilder {
            private int bitField0_;
            private int day_;
            private int hour_;
            private int minute_;
            private int month_;
            private int second_;
            private int year_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SETime sETime) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sETime.year_ = this.year_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sETime.month_ = this.month_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sETime.day_ = this.day_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sETime.hour_ = this.hour_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sETime.minute_ = this.minute_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sETime.second_ = this.second_;
                    i7 |= 32;
                }
                sETime.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_SA_SETime_descriptor;
            }

            public Builder clearDay() {
                this.bitField0_ &= -5;
                this.day_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHour() {
                this.bitField0_ &= -9;
                this.hour_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMinute() {
                this.bitField0_ &= -17;
                this.minute_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMonth() {
                this.bitField0_ &= -3;
                this.month_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSecond() {
                this.bitField0_ &= -33;
                this.second_ = 0;
                onChanged();
                return this;
            }

            public Builder clearYear() {
                this.bitField0_ &= -2;
                this.year_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public int getDay() {
                return this.day_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_SA_SETime_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public int getHour() {
                return this.hour_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public int getMinute() {
                return this.minute_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public int getMonth() {
                return this.month_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public int getSecond() {
                return this.second_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public int getYear() {
                return this.year_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public boolean hasDay() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public boolean hasHour() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public boolean hasMinute() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public boolean hasMonth() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public boolean hasSecond() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
            public boolean hasYear() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_SA_SETime_fieldAccessorTable.ensureFieldAccessorsInitialized(SETime.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasYear() && hasMonth() && hasDay() && hasHour() && hasMinute() && hasSecond();
            }

            public Builder setDay(int i7) {
                this.day_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHour(int i7) {
                this.hour_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMinute(int i7) {
                this.minute_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMonth(int i7) {
                this.month_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSecond(int i7) {
                this.second_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setYear(int i7) {
                this.year_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETime build() {
                SETime sETimeBuildPartial = buildPartial();
                if (sETimeBuildPartial.isInitialized()) {
                    return sETimeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sETimeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETime buildPartial() {
                SETime sETime = new SETime(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sETime);
                }
                onBuilt();
                return sETime;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SETime getDefaultInstanceForType() {
                return SETime.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.year_ = 0;
                this.month_ = 0;
                this.day_ = 0;
                this.hour_ = 0;
                this.minute_ = 0;
                this.second_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SETime) {
                    return mergeFrom((SETime) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SETime sETime) {
                if (sETime == SETime.getDefaultInstance()) {
                    return this;
                }
                if (sETime.hasYear()) {
                    setYear(sETime.getYear());
                }
                if (sETime.hasMonth()) {
                    setMonth(sETime.getMonth());
                }
                if (sETime.hasDay()) {
                    setDay(sETime.getDay());
                }
                if (sETime.hasHour()) {
                    setHour(sETime.getHour());
                }
                if (sETime.hasMinute()) {
                    setMinute(sETime.getMinute());
                }
                if (sETime.hasSecond()) {
                    setSecond(sETime.getSecond());
                }
                mergeUnknownFields(sETime.getUnknownFields());
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
                                    this.year_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.month_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.day_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.hour_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.minute_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.second_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETime");
            DEFAULT_INSTANCE = new SETime();
            PARSER = new AbstractParser<SETime>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SETime.1
                @Override // com.google.protobuf.Parser
                public SETime parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SETime.newBuilder();
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

        public /* synthetic */ SETime(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SETime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_SA_SETime_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SETime parseDelimitedFrom(InputStream inputStream) {
            return (SETime) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SETime parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SETime> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SETime)) {
                return super.equals(obj);
            }
            SETime sETime = (SETime) obj;
            if (hasYear() != sETime.hasYear()) {
                return false;
            }
            if ((hasYear() && getYear() != sETime.getYear()) || hasMonth() != sETime.hasMonth()) {
                return false;
            }
            if ((hasMonth() && getMonth() != sETime.getMonth()) || hasDay() != sETime.hasDay()) {
                return false;
            }
            if ((hasDay() && getDay() != sETime.getDay()) || hasHour() != sETime.hasHour()) {
                return false;
            }
            if ((hasHour() && getHour() != sETime.getHour()) || hasMinute() != sETime.hasMinute()) {
                return false;
            }
            if ((!hasMinute() || getMinute() == sETime.getMinute()) && hasSecond() == sETime.hasSecond()) {
                return (!hasSecond() || getSecond() == sETime.getSecond()) && getUnknownFields().equals(sETime.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public int getDay() {
            return this.day_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CommonProtos.internal_static_SA_SETime_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public int getHour() {
            return this.hour_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public int getMinute() {
            return this.minute_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public int getMonth() {
            return this.month_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SETime> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public int getSecond() {
            return this.second_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.year_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.month_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.day_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.hour_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.minute_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.second_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public boolean hasDay() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public boolean hasHour() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public boolean hasMinute() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public boolean hasMonth() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public boolean hasSecond() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeOrBuilder
        public boolean hasYear() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasYear()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getYear();
            }
            if (hasMonth()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMonth();
            }
            if (hasDay()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDay();
            }
            if (hasHour()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getHour();
            }
            if (hasMinute()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getMinute();
            }
            if (hasSecond()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getSecond();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_SA_SETime_fieldAccessorTable.ensureFieldAccessorsInitialized(SETime.class, Builder.class);
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
            if (!hasYear()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMonth()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDay()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHour()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMinute()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSecond()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.year_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.month_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.day_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.hour_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.minute_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.second_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SETime(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.year_ = 0;
            this.month_ = 0;
            this.day_ = 0;
            this.hour_ = 0;
            this.minute_ = 0;
            this.second_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SETime sETime) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sETime);
        }

        public static SETime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SETime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETime) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SETime parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SETime getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SETime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SETime parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SETime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SETime parseFrom(InputStream inputStream) {
            return (SETime) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SETime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETime) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SETime() {
            this.year_ = 0;
            this.month_ = 0;
            this.day_ = 0;
            this.hour_ = 0;
            this.minute_ = 0;
            this.second_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SETime parseFrom(CodedInputStream codedInputStream) {
            return (SETime) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SETime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETime) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SETimeDate extends GeneratedMessage implements SETimeDateOrBuilder {
        public static final int DAY_FIELD_NUMBER = 3;
        private static final SETimeDate DEFAULT_INSTANCE;
        public static final int MONTH_FIELD_NUMBER = 2;
        private static final Parser<SETimeDate> PARSER;
        public static final int YEAR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int day_;
        private byte memoizedIsInitialized;
        private int month_;
        private int year_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.CommonProtos$SETimeDate$1 */
        public class AnonymousClass1 extends AbstractParser<SETimeDate> {
            @Override // com.google.protobuf.Parser
            public SETimeDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SETimeDate.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SETimeDateOrBuilder {
            private int bitField0_;
            private int day_;
            private int month_;
            private int year_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SETimeDate sETimeDate) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sETimeDate.year_ = this.year_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sETimeDate.month_ = this.month_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sETimeDate.day_ = this.day_;
                    i7 |= 4;
                }
                sETimeDate.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CommonProtos.internal_static_SA_SETimeDate_descriptor;
            }

            public Builder clearDay() {
                this.bitField0_ &= -5;
                this.day_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMonth() {
                this.bitField0_ &= -3;
                this.month_ = 0;
                onChanged();
                return this;
            }

            public Builder clearYear() {
                this.bitField0_ &= -2;
                this.year_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
            public int getDay() {
                return this.day_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CommonProtos.internal_static_SA_SETimeDate_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
            public int getMonth() {
                return this.month_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
            public int getYear() {
                return this.year_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
            public boolean hasDay() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
            public boolean hasMonth() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
            public boolean hasYear() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CommonProtos.internal_static_SA_SETimeDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SETimeDate.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasYear() && hasMonth() && hasDay();
            }

            public Builder setDay(int i7) {
                this.day_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMonth(int i7) {
                this.month_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setYear(int i7) {
                this.year_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETimeDate build() {
                SETimeDate sETimeDateBuildPartial = buildPartial();
                if (sETimeDateBuildPartial.isInitialized()) {
                    return sETimeDateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sETimeDateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETimeDate buildPartial() {
                SETimeDate sETimeDate = new SETimeDate(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sETimeDate);
                }
                onBuilt();
                return sETimeDate;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SETimeDate getDefaultInstanceForType() {
                return SETimeDate.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.year_ = 0;
                this.month_ = 0;
                this.day_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SETimeDate) {
                    return mergeFrom((SETimeDate) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SETimeDate sETimeDate) {
                if (sETimeDate == SETimeDate.getDefaultInstance()) {
                    return this;
                }
                if (sETimeDate.hasYear()) {
                    setYear(sETimeDate.getYear());
                }
                if (sETimeDate.hasMonth()) {
                    setMonth(sETimeDate.getMonth());
                }
                if (sETimeDate.hasDay()) {
                    setDay(sETimeDate.getDay());
                }
                mergeUnknownFields(sETimeDate.getUnknownFields());
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
                                    this.year_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.month_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.day_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETimeDate");
            DEFAULT_INSTANCE = new SETimeDate();
            PARSER = new AbstractParser<SETimeDate>() { // from class: com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDate.1
                @Override // com.google.protobuf.Parser
                public SETimeDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SETimeDate.newBuilder();
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

        public /* synthetic */ SETimeDate(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SETimeDate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CommonProtos.internal_static_SA_SETimeDate_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SETimeDate parseDelimitedFrom(InputStream inputStream) {
            return (SETimeDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SETimeDate parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SETimeDate> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SETimeDate)) {
                return super.equals(obj);
            }
            SETimeDate sETimeDate = (SETimeDate) obj;
            if (hasYear() != sETimeDate.hasYear()) {
                return false;
            }
            if ((hasYear() && getYear() != sETimeDate.getYear()) || hasMonth() != sETimeDate.hasMonth()) {
                return false;
            }
            if ((!hasMonth() || getMonth() == sETimeDate.getMonth()) && hasDay() == sETimeDate.hasDay()) {
                return (!hasDay() || getDay() == sETimeDate.getDay()) && getUnknownFields().equals(sETimeDate.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
        public int getDay() {
            return this.day_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CommonProtos.internal_static_SA_SETimeDate_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
        public int getMonth() {
            return this.month_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SETimeDate> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.year_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.month_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.day_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
        public boolean hasDay() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
        public boolean hasMonth() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.CommonProtos.SETimeDateOrBuilder
        public boolean hasYear() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasYear()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getYear();
            }
            if (hasMonth()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMonth();
            }
            if (hasDay()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDay();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProtos.internal_static_SA_SETimeDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SETimeDate.class, Builder.class);
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
            if (!hasYear()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMonth()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDay()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.year_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.month_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.day_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SETimeDate(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.year_ = 0;
            this.month_ = 0;
            this.day_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SETimeDate sETimeDate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sETimeDate);
        }

        public static SETimeDate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SETimeDate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETimeDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SETimeDate parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SETimeDate getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SETimeDate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SETimeDate parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SETimeDate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SETimeDate() {
            this.year_ = 0;
            this.month_ = 0;
            this.day_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SETimeDate parseFrom(InputStream inputStream) {
            return (SETimeDate) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SETimeDate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETimeDate) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SETimeDate parseFrom(CodedInputStream codedInputStream) {
            return (SETimeDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SETimeDate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETimeDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SETimeDateOrBuilder extends MessageOrBuilder {
        int getDay();

        int getMonth();

        int getYear();

        boolean hasDay();

        boolean hasMonth();

        boolean hasYear();
    }

    public interface SETimeOrBuilder extends MessageOrBuilder {
        int getDay();

        int getHour();

        int getMinute();

        int getMonth();

        int getSecond();

        int getYear();

        boolean hasDay();

        boolean hasHour();

        boolean hasMinute();

        boolean hasMonth();

        boolean hasSecond();

        boolean hasYear();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "CommonProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fsa_Common.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\"6\n\nSEKeyValue\u0012\u0012\n\u0003key\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005value\u0018\u0002 \u0002(\u0011B\u0005\u0092?\u00028\u0010\"6\n\fSERangeValue\u0012\u0013\n\u0004from\u0018\u0001 \u0002(\u0011B\u0005\u0092?\u00028\u0010\u0012\u0011\n\u0002to\u0018\u0002 \u0002(\u0011B\u0005\u0092?\u00028\u0010\"õ\u0001\n\u001bSEBLEConnectParameterConfig\u0012 \n\u0011config_change_mtu\u0018\u0001 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012&\n\u0017config_ota_interval_min\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012&\n\u0017config_ota_interval_max\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012?\n\nphone_type\u0018\u0004 \u0001(\u000e2+.SA.SEBLEConnectParameterConfig.SEPhoneType\"#\n\u000bSEPhoneType\u0012\u000b\n\u0007ANDROID\u0010\u0000\u0012\u0007\n\u0003IOS\u0010\u0001\"K\n\nSETimeDate\u0012\u0013\n\u0004year\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0014\n\u0005month\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0012\n\u0003day\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b\"\u008a\u0001\n\u0006SETime\u0012\u0013\n\u0004year\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0014\n\u0005month\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0012\n\u0003day\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0013\n\u0004hour\u0018\u0004 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0015\n\u0006minute\u0018\u0005 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0015\n\u0006second\u0018\u0006 \u0002(\rB\u0005\u0092?\u00028\b\"o\n\rSESettingTime\u0012\u0013\n\u0004hour\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0016\n\u0007minuter\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0015\n\u0006second\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001a\n\u000bmillisecond\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\u0010*u\n\u000bSEErrorCode\u0012\f\n\bNO_ERROR\u0010\u0000\u0012\u000f\n\u000bNOT_SUPPORT\u0010\u0001\u0012\u0018\n\u0014DEPENDENCY_NOT_READY\u0010\u0002\u0012\u000e\n\nSET_FAILED\u0010\u0003\u0012\u000f\n\u000bPARAM_ERROR\u0010\u0004\u0012\f\n\u0007UNKNOWN\u0010ÿ\u0001*\u0086\u0001\n\u000fSEPrepareStatus\u0012\t\n\u0005READY\u0010\u0000\u0012\b\n\u0004BUSY\u0010\u0001\u0012\u000e\n\nDUPLICATED\u0010\u0002\u0012\u000f\n\u000bLOW_STORAGE\u0010\u0003\u0012\u000f\n\u000bLOW_BATTERY\u0010\u0004\u0012\r\n\tDOWNGRADE\u0010\u0005\u0012\u001d\n\u0019LOW_STORAGE_TO_ASK_DELETE\u0010\u0006*µ\u0001\n\u000bImageFormat\u0012\u000b\n\u0007RGB_565\u0010\u0000\u0012\u0010\n\fRGB_565_SWAP\u0010\u0001\u0012\u0010\n\fARGB_8888_LE\u0010\u0002\u0012\r\n\tARGB_8888\u0010\u0003\u0012\n\n\u0006RGB888\u0010\u0004\u0012\u0010\n\fARGB_8565_LE\u0010\u0007\u0012\r\n\tARGB_8565\u0010\b\u0012\b\n\u0004JPEG\u0010\u0005\u0012\u0007\n\u0003PNG\u0010\u0006\u0012\u0007\n\u0003GIF\u0010\t\u0012\n\n\u0006VECTOR\u0010\n\u0012\u0007\n\u0003MP4\u0010\u000b\u0012\b\n\u0004EZIP\u0010\f*5\n\u0012SEOptionalSwitcher\u0012\u000e\n\nNO_FEATURE\u0010\u0000\u0012\u0006\n\u0002ON\u0010\u0001\u0012\u0007\n\u0003OFF\u0010\u0002B2\n\u001bcom.zh.ble.sa_wear.protobufB\fCommonProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEKeyValue_descriptor = messageType;
        internal_static_SA_SEKeyValue_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"Key", "Value"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SERangeValue_descriptor = messageType2;
        internal_static_SA_SERangeValue_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{HttpHeaders.f97153t, "To"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SEBLEConnectParameterConfig_descriptor = messageType3;
        internal_static_SA_SEBLEConnectParameterConfig_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"ConfigChangeMtu", "ConfigOtaIntervalMin", "ConfigOtaIntervalMax", "PhoneType"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SETimeDate_descriptor = messageType4;
        internal_static_SA_SETimeDate_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"Year", "Month", "Day"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SETime_descriptor = messageType5;
        internal_static_SA_SETime_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Year", "Month", "Day", "Hour", "Minute", "Second"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SESettingTime_descriptor = messageType6;
        internal_static_SA_SESettingTime_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Hour", "Minuter", "Second", "Millisecond"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private CommonProtos() {
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