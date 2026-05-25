package com.zh.ble.wear.protobuf;

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
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class FactoryProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEBluetoothNameSetting_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEBluetoothNameSetting_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEBuriedFiles_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEBuriedFiles_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEDevelopeMode_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEDevelopeMode_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEDevelopeSwitch_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEDevelopeSwitch_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEFactory_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEFactory_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEFileInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEFileInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEGsensorGeomagneticRawDate_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEGsensorGeomagneticRawDate_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEHeartRateLeakageRawDate_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEHeartRateLeakageRawDate_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEHeartRateLeakage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEHeartRateLeakage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SETriaxialRawDate_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SETriaxialRawDate_fieldAccessorTable;

    public static final class SEBluetoothNameSetting extends GeneratedMessage implements SEBluetoothNameSettingOrBuilder {
        public static final int BLUETOOTH_NAME_CRC_FIELD_NUMBER = 2;
        public static final int BLUETOOTH_NAME_FIELD_NUMBER = 1;
        private static final SEBluetoothNameSetting DEFAULT_INSTANCE;
        private static final Parser<SEBluetoothNameSetting> PARSER;
        public static final int SETTING_REQUEST_TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int bluetoothNameCrc_;
        private volatile Object bluetoothName_;
        private byte memoizedIsInitialized;
        private int settingRequestType_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEBluetoothNameSetting$1 */
        public class AnonymousClass1 extends AbstractParser<SEBluetoothNameSetting> {
            @Override // com.google.protobuf.Parser
            public SEBluetoothNameSetting parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEBluetoothNameSetting.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBluetoothNameSettingOrBuilder {
            private int bitField0_;
            private int bluetoothNameCrc_;
            private Object bluetoothName_;
            private int settingRequestType_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEBluetoothNameSetting sEBluetoothNameSetting) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEBluetoothNameSetting.bluetoothName_ = this.bluetoothName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEBluetoothNameSetting.bluetoothNameCrc_ = this.bluetoothNameCrc_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEBluetoothNameSetting.settingRequestType_ = this.settingRequestType_;
                    i7 |= 4;
                }
                sEBluetoothNameSetting.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEBluetoothNameSetting_descriptor;
            }

            public Builder clearBluetoothName() {
                this.bluetoothName_ = SEBluetoothNameSetting.getDefaultInstance().getBluetoothName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearBluetoothNameCrc() {
                this.bitField0_ &= -3;
                this.bluetoothNameCrc_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSettingRequestType() {
                this.bitField0_ &= -5;
                this.settingRequestType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
            public String getBluetoothName() {
                Object obj = this.bluetoothName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bluetoothName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
            public ByteString getBluetoothNameBytes() {
                Object obj = this.bluetoothName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bluetoothName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
            public int getBluetoothNameCrc() {
                return this.bluetoothNameCrc_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEBluetoothNameSetting_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
            public SESeetingRequestType getSettingRequestType() {
                SESeetingRequestType sESeetingRequestTypeForNumber = SESeetingRequestType.forNumber(this.settingRequestType_);
                return sESeetingRequestTypeForNumber == null ? SESeetingRequestType.SEETING_SUCCESS : sESeetingRequestTypeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
            public boolean hasBluetoothName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
            public boolean hasBluetoothNameCrc() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
            public boolean hasSettingRequestType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEBluetoothNameSetting_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBluetoothNameSetting.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasBluetoothName() && hasBluetoothNameCrc();
            }

            public Builder setBluetoothName(String str) {
                str.getClass();
                this.bluetoothName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setBluetoothNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bluetoothName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setBluetoothNameCrc(int i7) {
                this.bluetoothNameCrc_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSettingRequestType(SESeetingRequestType sESeetingRequestType) {
                sESeetingRequestType.getClass();
                this.bitField0_ |= 4;
                this.settingRequestType_ = sESeetingRequestType.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.bluetoothName_ = "";
                this.settingRequestType_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBluetoothNameSetting build() {
                SEBluetoothNameSetting sEBluetoothNameSettingBuildPartial = buildPartial();
                if (sEBluetoothNameSettingBuildPartial.isInitialized()) {
                    return sEBluetoothNameSettingBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBluetoothNameSettingBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBluetoothNameSetting buildPartial() {
                SEBluetoothNameSetting sEBluetoothNameSetting = new SEBluetoothNameSetting(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBluetoothNameSetting);
                }
                onBuilt();
                return sEBluetoothNameSetting;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBluetoothNameSetting getDefaultInstanceForType() {
                return SEBluetoothNameSetting.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.bluetoothName_ = "";
                this.bluetoothNameCrc_ = 0;
                this.settingRequestType_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.bluetoothName_ = "";
                this.settingRequestType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBluetoothNameSetting) {
                    return mergeFrom((SEBluetoothNameSetting) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEBluetoothNameSetting sEBluetoothNameSetting) {
                if (sEBluetoothNameSetting == SEBluetoothNameSetting.getDefaultInstance()) {
                    return this;
                }
                if (sEBluetoothNameSetting.hasBluetoothName()) {
                    this.bluetoothName_ = sEBluetoothNameSetting.bluetoothName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEBluetoothNameSetting.hasBluetoothNameCrc()) {
                    setBluetoothNameCrc(sEBluetoothNameSetting.getBluetoothNameCrc());
                }
                if (sEBluetoothNameSetting.hasSettingRequestType()) {
                    setSettingRequestType(sEBluetoothNameSetting.getSettingRequestType());
                }
                mergeUnknownFields(sEBluetoothNameSetting.getUnknownFields());
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
                                    this.bluetoothName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.bluetoothNameCrc_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (SESeetingRequestType.forNumber(i7) == null) {
                                        mergeUnknownVarintField(3, i7);
                                    } else {
                                        this.settingRequestType_ = i7;
                                        this.bitField0_ |= 4;
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

        public enum SESeetingRequestType implements ProtocolMessageEnum {
            SEETING_SUCCESS(0),
            SEETING_FAIL(1),
            SEETING_CRC_ERROR(2),
            SEETING_NAME_TOO_LONG(3),
            SEETING_NAME_CHARACTER_NON_COMPLIANCE(4),
            SEETING_NAME_NO_PERMISSION(5);

            public static final int SEETING_CRC_ERROR_VALUE = 2;
            public static final int SEETING_FAIL_VALUE = 1;
            public static final int SEETING_NAME_CHARACTER_NON_COMPLIANCE_VALUE = 4;
            public static final int SEETING_NAME_NO_PERMISSION_VALUE = 5;
            public static final int SEETING_NAME_TOO_LONG_VALUE = 3;
            public static final int SEETING_SUCCESS_VALUE = 0;
            private static final SESeetingRequestType[] VALUES;
            private static final Internal.EnumLiteMap<SESeetingRequestType> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEBluetoothNameSetting$SESeetingRequestType$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SESeetingRequestType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESeetingRequestType findValueByNumber(int i7) {
                    return SESeetingRequestType.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESeetingRequestType");
                internalValueMap = new Internal.EnumLiteMap<SESeetingRequestType>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSetting.SESeetingRequestType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SESeetingRequestType findValueByNumber(int i7) {
                        return SESeetingRequestType.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SESeetingRequestType(int i7) {
                this.value = i7;
            }

            public static SESeetingRequestType forNumber(int i7) {
                if (i7 == 0) {
                    return SEETING_SUCCESS;
                }
                if (i7 == 1) {
                    return SEETING_FAIL;
                }
                if (i7 == 2) {
                    return SEETING_CRC_ERROR;
                }
                if (i7 == 3) {
                    return SEETING_NAME_TOO_LONG;
                }
                if (i7 == 4) {
                    return SEETING_NAME_CHARACTER_NON_COMPLIANCE;
                }
                if (i7 != 5) {
                    return null;
                }
                return SEETING_NAME_NO_PERMISSION;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEBluetoothNameSetting.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SESeetingRequestType> internalGetValueMap() {
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
            public static SESeetingRequestType valueOf(int i7) {
                return forNumber(i7);
            }

            public static SESeetingRequestType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBluetoothNameSetting");
            DEFAULT_INSTANCE = new SEBluetoothNameSetting();
            PARSER = new AbstractParser<SEBluetoothNameSetting>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSetting.1
                @Override // com.google.protobuf.Parser
                public SEBluetoothNameSetting parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBluetoothNameSetting.newBuilder();
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

        public /* synthetic */ SEBluetoothNameSetting(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEBluetoothNameSetting getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEBluetoothNameSetting_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBluetoothNameSetting parseDelimitedFrom(InputStream inputStream) {
            return (SEBluetoothNameSetting) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBluetoothNameSetting parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBluetoothNameSetting> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBluetoothNameSetting)) {
                return super.equals(obj);
            }
            SEBluetoothNameSetting sEBluetoothNameSetting = (SEBluetoothNameSetting) obj;
            if (hasBluetoothName() != sEBluetoothNameSetting.hasBluetoothName()) {
                return false;
            }
            if ((hasBluetoothName() && !getBluetoothName().equals(sEBluetoothNameSetting.getBluetoothName())) || hasBluetoothNameCrc() != sEBluetoothNameSetting.hasBluetoothNameCrc()) {
                return false;
            }
            if ((!hasBluetoothNameCrc() || getBluetoothNameCrc() == sEBluetoothNameSetting.getBluetoothNameCrc()) && hasSettingRequestType() == sEBluetoothNameSetting.hasSettingRequestType()) {
                return (!hasSettingRequestType() || this.settingRequestType_ == sEBluetoothNameSetting.settingRequestType_) && getUnknownFields().equals(sEBluetoothNameSetting.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
        public String getBluetoothName() {
            Object obj = this.bluetoothName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bluetoothName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
        public ByteString getBluetoothNameBytes() {
            Object obj = this.bluetoothName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bluetoothName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
        public int getBluetoothNameCrc() {
            return this.bluetoothNameCrc_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEBluetoothNameSetting_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEBluetoothNameSetting> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.bluetoothName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.bluetoothNameCrc_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.settingRequestType_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
        public SESeetingRequestType getSettingRequestType() {
            SESeetingRequestType sESeetingRequestTypeForNumber = SESeetingRequestType.forNumber(this.settingRequestType_);
            return sESeetingRequestTypeForNumber == null ? SESeetingRequestType.SEETING_SUCCESS : sESeetingRequestTypeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
        public boolean hasBluetoothName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
        public boolean hasBluetoothNameCrc() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBluetoothNameSettingOrBuilder
        public boolean hasSettingRequestType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasBluetoothName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBluetoothName().hashCode();
            }
            if (hasBluetoothNameCrc()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBluetoothNameCrc();
            }
            if (hasSettingRequestType()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.settingRequestType_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEBluetoothNameSetting_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBluetoothNameSetting.class, Builder.class);
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
            if (!hasBluetoothName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBluetoothNameCrc()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.bluetoothName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.bluetoothNameCrc_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.settingRequestType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEBluetoothNameSetting(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.bluetoothName_ = "";
            this.bluetoothNameCrc_ = 0;
            this.settingRequestType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBluetoothNameSetting sEBluetoothNameSetting) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBluetoothNameSetting);
        }

        public static SEBluetoothNameSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBluetoothNameSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBluetoothNameSetting) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBluetoothNameSetting parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBluetoothNameSetting getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBluetoothNameSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEBluetoothNameSetting parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEBluetoothNameSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEBluetoothNameSetting() {
            this.bluetoothName_ = "";
            this.bluetoothNameCrc_ = 0;
            this.settingRequestType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.bluetoothName_ = "";
            this.settingRequestType_ = 0;
        }

        public static SEBluetoothNameSetting parseFrom(InputStream inputStream) {
            return (SEBluetoothNameSetting) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEBluetoothNameSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBluetoothNameSetting) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBluetoothNameSetting parseFrom(CodedInputStream codedInputStream) {
            return (SEBluetoothNameSetting) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEBluetoothNameSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBluetoothNameSetting) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEBluetoothNameSettingOrBuilder extends MessageOrBuilder {
        String getBluetoothName();

        ByteString getBluetoothNameBytes();

        int getBluetoothNameCrc();

        SEBluetoothNameSetting.SESeetingRequestType getSettingRequestType();

        boolean hasBluetoothName();

        boolean hasBluetoothNameCrc();

        boolean hasSettingRequestType();
    }

    public static final class SEBuriedFiles extends GeneratedMessage implements SEBuriedFilesOrBuilder {
        public static final int BURIED_FILES_IDS_FIELD_NUMBER = 2;
        private static final SEBuriedFiles DEFAULT_INSTANCE;
        public static final int FILE_NAME_FIELD_NUMBER = 1;
        private static final Parser<SEBuriedFiles> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString buriedFilesIds_;
        private volatile Object fileName_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEBuriedFiles$1 */
        public class AnonymousClass1 extends AbstractParser<SEBuriedFiles> {
            @Override // com.google.protobuf.Parser
            public SEBuriedFiles parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEBuriedFiles.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBuriedFilesOrBuilder {
            private int bitField0_;
            private ByteString buriedFilesIds_;
            private Object fileName_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEBuriedFiles sEBuriedFiles) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEBuriedFiles.fileName_ = this.fileName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEBuriedFiles.buriedFilesIds_ = this.buriedFilesIds_;
                    i7 |= 2;
                }
                sEBuriedFiles.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEBuriedFiles_descriptor;
            }

            public Builder clearBuriedFilesIds() {
                this.bitField0_ &= -3;
                this.buriedFilesIds_ = SEBuriedFiles.getDefaultInstance().getBuriedFilesIds();
                onChanged();
                return this;
            }

            public Builder clearFileName() {
                this.fileName_ = SEBuriedFiles.getDefaultInstance().getFileName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
            public ByteString getBuriedFilesIds() {
                return this.buriedFilesIds_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEBuriedFiles_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fileName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
            public boolean hasBuriedFilesIds() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
            public boolean hasFileName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEBuriedFiles_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBuriedFiles.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFileName() && hasBuriedFilesIds();
            }

            public Builder setBuriedFilesIds(ByteString byteString) {
                byteString.getClass();
                this.buriedFilesIds_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFileName(String str) {
                str.getClass();
                this.fileName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) {
                byteString.getClass();
                this.fileName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.fileName_ = "";
                this.buriedFilesIds_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBuriedFiles build() {
                SEBuriedFiles sEBuriedFilesBuildPartial = buildPartial();
                if (sEBuriedFilesBuildPartial.isInitialized()) {
                    return sEBuriedFilesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBuriedFilesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBuriedFiles buildPartial() {
                SEBuriedFiles sEBuriedFiles = new SEBuriedFiles(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBuriedFiles);
                }
                onBuilt();
                return sEBuriedFiles;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBuriedFiles getDefaultInstanceForType() {
                return SEBuriedFiles.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.fileName_ = "";
                this.buriedFilesIds_ = ByteString.EMPTY;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.fileName_ = "";
                this.buriedFilesIds_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBuriedFiles) {
                    return mergeFrom((SEBuriedFiles) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEBuriedFiles sEBuriedFiles) {
                if (sEBuriedFiles == SEBuriedFiles.getDefaultInstance()) {
                    return this;
                }
                if (sEBuriedFiles.hasFileName()) {
                    this.fileName_ = sEBuriedFiles.fileName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEBuriedFiles.hasBuriedFilesIds()) {
                    setBuriedFilesIds(sEBuriedFiles.getBuriedFilesIds());
                }
                mergeUnknownFields(sEBuriedFiles.getUnknownFields());
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
                                    this.fileName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.buriedFilesIds_ = codedInputStream.readBytes();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBuriedFiles");
            DEFAULT_INSTANCE = new SEBuriedFiles();
            PARSER = new AbstractParser<SEBuriedFiles>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFiles.1
                @Override // com.google.protobuf.Parser
                public SEBuriedFiles parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBuriedFiles.newBuilder();
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

        public /* synthetic */ SEBuriedFiles(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEBuriedFiles getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEBuriedFiles_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBuriedFiles parseDelimitedFrom(InputStream inputStream) {
            return (SEBuriedFiles) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBuriedFiles parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBuriedFiles> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBuriedFiles)) {
                return super.equals(obj);
            }
            SEBuriedFiles sEBuriedFiles = (SEBuriedFiles) obj;
            if (hasFileName() != sEBuriedFiles.hasFileName()) {
                return false;
            }
            if ((!hasFileName() || getFileName().equals(sEBuriedFiles.getFileName())) && hasBuriedFilesIds() == sEBuriedFiles.hasBuriedFilesIds()) {
                return (!hasBuriedFilesIds() || getBuriedFilesIds().equals(sEBuriedFiles.getBuriedFilesIds())) && getUnknownFields().equals(sEBuriedFiles.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
        public ByteString getBuriedFilesIds() {
            return this.buriedFilesIds_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEBuriedFiles_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fileName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEBuriedFiles> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.fileName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.buriedFilesIds_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
        public boolean hasBuriedFilesIds() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEBuriedFilesOrBuilder
        public boolean hasFileName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasFileName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFileName().hashCode();
            }
            if (hasBuriedFilesIds()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBuriedFilesIds().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEBuriedFiles_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBuriedFiles.class, Builder.class);
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
            if (!hasFileName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBuriedFilesIds()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.fileName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.buriedFilesIds_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEBuriedFiles(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.fileName_ = "";
            this.buriedFilesIds_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBuriedFiles sEBuriedFiles) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBuriedFiles);
        }

        public static SEBuriedFiles parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBuriedFiles parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBuriedFiles) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBuriedFiles parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBuriedFiles getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBuriedFiles parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEBuriedFiles parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEBuriedFiles() {
            this.fileName_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.buriedFilesIds_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.fileName_ = "";
            this.buriedFilesIds_ = byteString;
        }

        public static SEBuriedFiles parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEBuriedFiles parseFrom(InputStream inputStream) {
            return (SEBuriedFiles) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEBuriedFiles parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBuriedFiles) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBuriedFiles parseFrom(CodedInputStream codedInputStream) {
            return (SEBuriedFiles) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEBuriedFiles parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBuriedFiles) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEBuriedFilesOrBuilder extends MessageOrBuilder {
        ByteString getBuriedFilesIds();

        String getFileName();

        ByteString getFileNameBytes();

        boolean hasBuriedFilesIds();

        boolean hasFileName();
    }

    public static final class SEDevelopeMode extends GeneratedMessage implements SEDevelopeModeOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final SEDevelopeMode DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static final Parser<SEDevelopeMode> PARSER;
        public static final int SEND_STATUS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private int index_;
        private byte memoizedIsInitialized;
        private int sendStatus_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEDevelopeMode$1 */
        public class AnonymousClass1 extends AbstractParser<SEDevelopeMode> {
            @Override // com.google.protobuf.Parser
            public SEDevelopeMode parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEDevelopeMode.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDevelopeModeOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private int index_;
            private int sendStatus_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEDevelopeMode sEDevelopeMode) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEDevelopeMode.index_ = this.index_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEDevelopeMode.data_ = this.data_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEDevelopeMode.sendStatus_ = this.sendStatus_;
                    i7 |= 4;
                }
                sEDevelopeMode.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEDevelopeMode_descriptor;
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = SEDevelopeMode.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            public Builder clearIndex() {
                this.bitField0_ &= -2;
                this.index_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSendStatus() {
                this.bitField0_ &= -5;
                this.sendStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEDevelopeMode_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
            public int getIndex() {
                return this.index_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
            public int getSendStatus() {
                return this.sendStatus_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
            public boolean hasIndex() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
            public boolean hasSendStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEDevelopeMode_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDevelopeMode.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasIndex() && hasData() && hasSendStatus();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIndex(int i7) {
                this.index_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSendStatus(int i7) {
                this.sendStatus_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDevelopeMode build() {
                SEDevelopeMode sEDevelopeModeBuildPartial = buildPartial();
                if (sEDevelopeModeBuildPartial.isInitialized()) {
                    return sEDevelopeModeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDevelopeModeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDevelopeMode buildPartial() {
                SEDevelopeMode sEDevelopeMode = new SEDevelopeMode(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEDevelopeMode);
                }
                onBuilt();
                return sEDevelopeMode;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEDevelopeMode getDefaultInstanceForType() {
                return SEDevelopeMode.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.index_ = 0;
                this.data_ = ByteString.EMPTY;
                this.sendStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEDevelopeMode) {
                    return mergeFrom((SEDevelopeMode) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEDevelopeMode sEDevelopeMode) {
                if (sEDevelopeMode == SEDevelopeMode.getDefaultInstance()) {
                    return this;
                }
                if (sEDevelopeMode.hasIndex()) {
                    setIndex(sEDevelopeMode.getIndex());
                }
                if (sEDevelopeMode.hasData()) {
                    setData(sEDevelopeMode.getData());
                }
                if (sEDevelopeMode.hasSendStatus()) {
                    setSendStatus(sEDevelopeMode.getSendStatus());
                }
                mergeUnknownFields(sEDevelopeMode.getUnknownFields());
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
                                    this.index_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.sendStatus_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDevelopeMode");
            DEFAULT_INSTANCE = new SEDevelopeMode();
            PARSER = new AbstractParser<SEDevelopeMode>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeMode.1
                @Override // com.google.protobuf.Parser
                public SEDevelopeMode parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEDevelopeMode.newBuilder();
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

        public /* synthetic */ SEDevelopeMode(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEDevelopeMode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEDevelopeMode_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEDevelopeMode parseDelimitedFrom(InputStream inputStream) {
            return (SEDevelopeMode) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEDevelopeMode parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEDevelopeMode> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEDevelopeMode)) {
                return super.equals(obj);
            }
            SEDevelopeMode sEDevelopeMode = (SEDevelopeMode) obj;
            if (hasIndex() != sEDevelopeMode.hasIndex()) {
                return false;
            }
            if ((hasIndex() && getIndex() != sEDevelopeMode.getIndex()) || hasData() != sEDevelopeMode.hasData()) {
                return false;
            }
            if ((!hasData() || getData().equals(sEDevelopeMode.getData())) && hasSendStatus() == sEDevelopeMode.hasSendStatus()) {
                return (!hasSendStatus() || getSendStatus() == sEDevelopeMode.getSendStatus()) && getUnknownFields().equals(sEDevelopeMode.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEDevelopeMode_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEDevelopeMode> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
        public int getSendStatus() {
            return this.sendStatus_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.index_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(2, this.data_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.sendStatus_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
        public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeModeOrBuilder
        public boolean hasSendStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasIndex()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getIndex();
            }
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getData().hashCode();
            }
            if (hasSendStatus()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSendStatus();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEDevelopeMode_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDevelopeMode.class, Builder.class);
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
            if (!hasIndex()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasData()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSendStatus()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.index_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.data_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.sendStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEDevelopeMode(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.index_ = 0;
            this.data_ = ByteString.EMPTY;
            this.sendStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEDevelopeMode sEDevelopeMode) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEDevelopeMode);
        }

        public static SEDevelopeMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEDevelopeMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevelopeMode) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDevelopeMode parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEDevelopeMode getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEDevelopeMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEDevelopeMode parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEDevelopeMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEDevelopeMode() {
            this.index_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.sendStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static SEDevelopeMode parseFrom(InputStream inputStream) {
            return (SEDevelopeMode) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEDevelopeMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevelopeMode) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDevelopeMode parseFrom(CodedInputStream codedInputStream) {
            return (SEDevelopeMode) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEDevelopeMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevelopeMode) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEDevelopeModeOrBuilder extends MessageOrBuilder {
        ByteString getData();

        int getIndex();

        int getSendStatus();

        boolean hasData();

        boolean hasIndex();

        boolean hasSendStatus();
    }

    public static final class SEDevelopeSwitch extends GeneratedMessage implements SEDevelopeSwitchOrBuilder {
        private static final SEDevelopeSwitch DEFAULT_INSTANCE;
        public static final int MODE_FIELD_NUMBER = 2;
        private static final Parser<SEDevelopeSwitch> PARSER;
        public static final int SWITCHSTATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private int switchstate_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEDevelopeSwitch$1 */
        public class AnonymousClass1 extends AbstractParser<SEDevelopeSwitch> {
            @Override // com.google.protobuf.Parser
            public SEDevelopeSwitch parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEDevelopeSwitch.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDevelopeSwitchOrBuilder {
            private int bitField0_;
            private int mode_;
            private int switchstate_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEDevelopeSwitch sEDevelopeSwitch) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEDevelopeSwitch.switchstate_ = this.switchstate_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEDevelopeSwitch.mode_ = this.mode_;
                    i7 |= 2;
                }
                sEDevelopeSwitch.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEDevelopeSwitch_descriptor;
            }

            public Builder clearMode() {
                this.bitField0_ &= -3;
                this.mode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSwitchstate() {
                this.bitField0_ &= -2;
                this.switchstate_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEDevelopeSwitch_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
            public int getMode() {
                return this.mode_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
            public int getSwitchstate() {
                return this.switchstate_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
            public boolean hasSwitchstate() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEDevelopeSwitch_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDevelopeSwitch.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSwitchstate() && hasMode();
            }

            public Builder setMode(int i7) {
                this.mode_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSwitchstate(int i7) {
                this.switchstate_ = i7;
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
            public SEDevelopeSwitch build() {
                SEDevelopeSwitch sEDevelopeSwitchBuildPartial = buildPartial();
                if (sEDevelopeSwitchBuildPartial.isInitialized()) {
                    return sEDevelopeSwitchBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDevelopeSwitchBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDevelopeSwitch buildPartial() {
                SEDevelopeSwitch sEDevelopeSwitch = new SEDevelopeSwitch(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEDevelopeSwitch);
                }
                onBuilt();
                return sEDevelopeSwitch;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEDevelopeSwitch getDefaultInstanceForType() {
                return SEDevelopeSwitch.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.switchstate_ = 0;
                this.mode_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEDevelopeSwitch) {
                    return mergeFrom((SEDevelopeSwitch) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEDevelopeSwitch sEDevelopeSwitch) {
                if (sEDevelopeSwitch == SEDevelopeSwitch.getDefaultInstance()) {
                    return this;
                }
                if (sEDevelopeSwitch.hasSwitchstate()) {
                    setSwitchstate(sEDevelopeSwitch.getSwitchstate());
                }
                if (sEDevelopeSwitch.hasMode()) {
                    setMode(sEDevelopeSwitch.getMode());
                }
                mergeUnknownFields(sEDevelopeSwitch.getUnknownFields());
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
                                    this.switchstate_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.mode_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDevelopeSwitch");
            DEFAULT_INSTANCE = new SEDevelopeSwitch();
            PARSER = new AbstractParser<SEDevelopeSwitch>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitch.1
                @Override // com.google.protobuf.Parser
                public SEDevelopeSwitch parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEDevelopeSwitch.newBuilder();
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

        public /* synthetic */ SEDevelopeSwitch(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEDevelopeSwitch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEDevelopeSwitch_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEDevelopeSwitch parseDelimitedFrom(InputStream inputStream) {
            return (SEDevelopeSwitch) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEDevelopeSwitch parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEDevelopeSwitch> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEDevelopeSwitch)) {
                return super.equals(obj);
            }
            SEDevelopeSwitch sEDevelopeSwitch = (SEDevelopeSwitch) obj;
            if (hasSwitchstate() != sEDevelopeSwitch.hasSwitchstate()) {
                return false;
            }
            if ((!hasSwitchstate() || getSwitchstate() == sEDevelopeSwitch.getSwitchstate()) && hasMode() == sEDevelopeSwitch.hasMode()) {
                return (!hasMode() || getMode() == sEDevelopeSwitch.getMode()) && getUnknownFields().equals(sEDevelopeSwitch.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEDevelopeSwitch_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
        public int getMode() {
            return this.mode_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEDevelopeSwitch> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.switchstate_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.mode_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
        public int getSwitchstate() {
            return this.switchstate_;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEDevelopeSwitchOrBuilder
        public boolean hasSwitchstate() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSwitchstate()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSwitchstate();
            }
            if (hasMode()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEDevelopeSwitch_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDevelopeSwitch.class, Builder.class);
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
            if (!hasSwitchstate()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMode()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.switchstate_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.mode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEDevelopeSwitch(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.switchstate_ = 0;
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEDevelopeSwitch sEDevelopeSwitch) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEDevelopeSwitch);
        }

        public static SEDevelopeSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEDevelopeSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevelopeSwitch) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDevelopeSwitch parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEDevelopeSwitch getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEDevelopeSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEDevelopeSwitch parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEDevelopeSwitch() {
            this.switchstate_ = 0;
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEDevelopeSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEDevelopeSwitch parseFrom(InputStream inputStream) {
            return (SEDevelopeSwitch) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEDevelopeSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevelopeSwitch) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDevelopeSwitch parseFrom(CodedInputStream codedInputStream) {
            return (SEDevelopeSwitch) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEDevelopeSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevelopeSwitch) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEDevelopeSwitchOrBuilder extends MessageOrBuilder {
        int getMode();

        int getSwitchstate();

        boolean hasMode();

        boolean hasSwitchstate();
    }

    public static final class SEFactory extends GeneratedMessage implements SEFactoryOrBuilder {
        public static final int BLUETOOTH_NAME_SETTING_FIELD_NUMBER = 6;
        public static final int BURIED_FILE_FIELD_NUMBER = 11;
        private static final SEFactory DEFAULT_INSTANCE;
        public static final int DEVELOPE_MODE_FIELD_NUMBER = 13;
        public static final int DEVELOPE_SWITCH_FIELD_NUMBER = 12;
        public static final int FILE_FIELD_NUMBER = 1;
        public static final int GSENSOR_GEOMAGNETIC_RAW_DATE_FIELD_NUMBER = 8;
        public static final int GSENSOR_GEOMAGNETIC_SWITCH_FIELD_NUMBER = 7;
        public static final int HEART_RATE_LEAKAGE_FIELD_NUMBER = 3;
        public static final int HEART_RATE_LEAKAGE_RAW_DATE_FIELD_NUMBER = 4;
        public static final int HEART_RATE_SWITCH_FIELD_NUMBER = 2;
        public static final int LOG_RESPOND_FIELD_NUMBER = 5;
        private static final Parser<SEFactory> PARSER;
        public static final int TRIAXIAL_RAW_DATE_FIELD_NUMBER = 10;
        public static final int TRIAXIAL_SWITCH_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEFactory$1 */
        public class AnonymousClass1 extends AbstractParser<SEFactory> {
            @Override // com.google.protobuf.Parser
            public SEFactory parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEFactory.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEFactoryOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> bluetoothNameSettingBuilder_;
            private SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> buriedFileBuilder_;
            private SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> developeModeBuilder_;
            private SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> developeSwitchBuilder_;
            private SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> fileBuilder_;
            private SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> gsensorGeomagneticRawDateBuilder_;
            private SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> heartRateLeakageBuilder_;
            private SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> heartRateLeakageRawDateBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> triaxialRawDateBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEFactory sEFactory) {
            }

            private void buildPartialOneofs(SEFactory sEFactory) {
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder9;
                int i7 = this.payloadCase_;
                sEFactory.payloadCase_ = i7;
                sEFactory.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder9 = this.fileBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 3 && (singleFieldBuilder8 = this.heartRateLeakageBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder7 = this.heartRateLeakageRawDateBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder6 = this.bluetoothNameSettingBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder5 = this.gsensorGeomagneticRawDateBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 10 && (singleFieldBuilder4 = this.triaxialRawDateBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 11 && (singleFieldBuilder3 = this.buriedFileBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 12 && (singleFieldBuilder2 = this.developeSwitchBuilder_) != null) {
                    sEFactory.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 13 || (singleFieldBuilder = this.developeModeBuilder_) == null) {
                    return;
                }
                sEFactory.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEFactory_descriptor;
            }

            private SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> internalGetBluetoothNameSettingFieldBuilder() {
                if (this.bluetoothNameSettingBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEBluetoothNameSetting.getDefaultInstance();
                    }
                    this.bluetoothNameSettingBuilder_ = new SingleFieldBuilder<>((SEBluetoothNameSetting) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.bluetoothNameSettingBuilder_;
            }

            private SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> internalGetBuriedFileFieldBuilder() {
                if (this.buriedFileBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = SEBuriedFiles.getDefaultInstance();
                    }
                    this.buriedFileBuilder_ = new SingleFieldBuilder<>((SEBuriedFiles) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.buriedFileBuilder_;
            }

            private SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> internalGetDevelopeModeFieldBuilder() {
                if (this.developeModeBuilder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = SEDevelopeMode.getDefaultInstance();
                    }
                    this.developeModeBuilder_ = new SingleFieldBuilder<>((SEDevelopeMode) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.developeModeBuilder_;
            }

            private SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> internalGetDevelopeSwitchFieldBuilder() {
                if (this.developeSwitchBuilder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = SEDevelopeSwitch.getDefaultInstance();
                    }
                    this.developeSwitchBuilder_ = new SingleFieldBuilder<>((SEDevelopeSwitch) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.developeSwitchBuilder_;
            }

            private SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> internalGetFileFieldBuilder() {
                if (this.fileBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEFileInfo.getDefaultInstance();
                    }
                    this.fileBuilder_ = new SingleFieldBuilder<>((SEFileInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.fileBuilder_;
            }

            private SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> internalGetGsensorGeomagneticRawDateFieldBuilder() {
                if (this.gsensorGeomagneticRawDateBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SEGsensorGeomagneticRawDate.getDefaultInstance();
                    }
                    this.gsensorGeomagneticRawDateBuilder_ = new SingleFieldBuilder<>((SEGsensorGeomagneticRawDate) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.gsensorGeomagneticRawDateBuilder_;
            }

            private SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> internalGetHeartRateLeakageFieldBuilder() {
                if (this.heartRateLeakageBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SEHeartRateLeakage.getDefaultInstance();
                    }
                    this.heartRateLeakageBuilder_ = new SingleFieldBuilder<>((SEHeartRateLeakage) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.heartRateLeakageBuilder_;
            }

            private SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> internalGetHeartRateLeakageRawDateFieldBuilder() {
                if (this.heartRateLeakageRawDateBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SEHeartRateLeakageRawDate.getDefaultInstance();
                    }
                    this.heartRateLeakageRawDateBuilder_ = new SingleFieldBuilder<>((SEHeartRateLeakageRawDate) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.heartRateLeakageRawDateBuilder_;
            }

            private SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> internalGetTriaxialRawDateFieldBuilder() {
                if (this.triaxialRawDateBuilder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = SETriaxialRawDate.getDefaultInstance();
                    }
                    this.triaxialRawDateBuilder_ = new SingleFieldBuilder<>((SETriaxialRawDate) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.triaxialRawDateBuilder_;
            }

            public Builder clearBluetoothNameSetting() {
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder = this.bluetoothNameSettingBuilder_;
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

            public Builder clearBuriedFile() {
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder = this.buriedFileBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 11) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 11) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearDevelopeMode() {
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder = this.developeModeBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 13) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 13) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearDevelopeSwitch() {
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder = this.developeSwitchBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 12) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 12) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearFile() {
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder = this.fileBuilder_;
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

            public Builder clearGsensorGeomagneticRawDate() {
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder = this.gsensorGeomagneticRawDateBuilder_;
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

            public Builder clearGsensorGeomagneticSwitch() {
                if (this.payloadCase_ == 7) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearHeartRateLeakage() {
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder = this.heartRateLeakageBuilder_;
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

            public Builder clearHeartRateLeakageRawDate() {
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder = this.heartRateLeakageRawDateBuilder_;
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

            public Builder clearHeartRateSwitch() {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLogRespond() {
                if (this.payloadCase_ == 5) {
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

            public Builder clearTriaxialRawDate() {
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder = this.triaxialRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 10) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 10) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearTriaxialSwitch() {
                if (this.payloadCase_ == 9) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEBluetoothNameSetting getBluetoothNameSetting() {
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder = this.bluetoothNameSettingBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEBluetoothNameSetting) this.payload_ : SEBluetoothNameSetting.getDefaultInstance() : this.payloadCase_ == 6 ? (SEBluetoothNameSetting) singleFieldBuilder.getMessage() : SEBluetoothNameSetting.getDefaultInstance();
            }

            public SEBluetoothNameSetting.Builder getBluetoothNameSettingBuilder() {
                return (SEBluetoothNameSetting.Builder) internalGetBluetoothNameSettingFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEBluetoothNameSettingOrBuilder getBluetoothNameSettingOrBuilder() {
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.bluetoothNameSettingBuilder_) == null) ? i7 == 6 ? (SEBluetoothNameSetting) this.payload_ : SEBluetoothNameSetting.getDefaultInstance() : (SEBluetoothNameSettingOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEBuriedFiles getBuriedFile() {
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder = this.buriedFileBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 11 ? (SEBuriedFiles) this.payload_ : SEBuriedFiles.getDefaultInstance() : this.payloadCase_ == 11 ? (SEBuriedFiles) singleFieldBuilder.getMessage() : SEBuriedFiles.getDefaultInstance();
            }

            public SEBuriedFiles.Builder getBuriedFileBuilder() {
                return (SEBuriedFiles.Builder) internalGetBuriedFileFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEBuriedFilesOrBuilder getBuriedFileOrBuilder() {
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilder = this.buriedFileBuilder_) == null) ? i7 == 11 ? (SEBuriedFiles) this.payload_ : SEBuriedFiles.getDefaultInstance() : (SEBuriedFilesOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEFactory_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEDevelopeMode getDevelopeMode() {
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder = this.developeModeBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 13 ? (SEDevelopeMode) this.payload_ : SEDevelopeMode.getDefaultInstance() : this.payloadCase_ == 13 ? (SEDevelopeMode) singleFieldBuilder.getMessage() : SEDevelopeMode.getDefaultInstance();
            }

            public SEDevelopeMode.Builder getDevelopeModeBuilder() {
                return (SEDevelopeMode.Builder) internalGetDevelopeModeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEDevelopeModeOrBuilder getDevelopeModeOrBuilder() {
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilder = this.developeModeBuilder_) == null) ? i7 == 13 ? (SEDevelopeMode) this.payload_ : SEDevelopeMode.getDefaultInstance() : (SEDevelopeModeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEDevelopeSwitch getDevelopeSwitch() {
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder = this.developeSwitchBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 12 ? (SEDevelopeSwitch) this.payload_ : SEDevelopeSwitch.getDefaultInstance() : this.payloadCase_ == 12 ? (SEDevelopeSwitch) singleFieldBuilder.getMessage() : SEDevelopeSwitch.getDefaultInstance();
            }

            public SEDevelopeSwitch.Builder getDevelopeSwitchBuilder() {
                return (SEDevelopeSwitch.Builder) internalGetDevelopeSwitchFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEDevelopeSwitchOrBuilder getDevelopeSwitchOrBuilder() {
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilder = this.developeSwitchBuilder_) == null) ? i7 == 12 ? (SEDevelopeSwitch) this.payload_ : SEDevelopeSwitch.getDefaultInstance() : (SEDevelopeSwitchOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEFileInfo getFile() {
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder = this.fileBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEFileInfo) this.payload_ : SEFileInfo.getDefaultInstance() : this.payloadCase_ == 1 ? (SEFileInfo) singleFieldBuilder.getMessage() : SEFileInfo.getDefaultInstance();
            }

            public SEFileInfo.Builder getFileBuilder() {
                return (SEFileInfo.Builder) internalGetFileFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEFileInfoOrBuilder getFileOrBuilder() {
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.fileBuilder_) == null) ? i7 == 1 ? (SEFileInfo) this.payload_ : SEFileInfo.getDefaultInstance() : (SEFileInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEGsensorGeomagneticRawDate getGsensorGeomagneticRawDate() {
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder = this.gsensorGeomagneticRawDateBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SEGsensorGeomagneticRawDate) this.payload_ : SEGsensorGeomagneticRawDate.getDefaultInstance() : this.payloadCase_ == 8 ? (SEGsensorGeomagneticRawDate) singleFieldBuilder.getMessage() : SEGsensorGeomagneticRawDate.getDefaultInstance();
            }

            public SEGsensorGeomagneticRawDate.Builder getGsensorGeomagneticRawDateBuilder() {
                return (SEGsensorGeomagneticRawDate.Builder) internalGetGsensorGeomagneticRawDateFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEGsensorGeomagneticRawDateOrBuilder getGsensorGeomagneticRawDateOrBuilder() {
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.gsensorGeomagneticRawDateBuilder_) == null) ? i7 == 8 ? (SEGsensorGeomagneticRawDate) this.payload_ : SEGsensorGeomagneticRawDate.getDefaultInstance() : (SEGsensorGeomagneticRawDateOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEGsensorGeomagneticSwitch getGsensorGeomagneticSwitch() {
                SEGsensorGeomagneticSwitch sEGsensorGeomagneticSwitchForNumber;
                return (this.payloadCase_ != 7 || (sEGsensorGeomagneticSwitchForNumber = SEGsensorGeomagneticSwitch.forNumber(((Integer) this.payload_).intValue())) == null) ? SEGsensorGeomagneticSwitch.GSENSOR_GEOMAGNETIC_START : sEGsensorGeomagneticSwitchForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEHeartRateLeakage getHeartRateLeakage() {
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder = this.heartRateLeakageBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SEHeartRateLeakage) this.payload_ : SEHeartRateLeakage.getDefaultInstance() : this.payloadCase_ == 3 ? (SEHeartRateLeakage) singleFieldBuilder.getMessage() : SEHeartRateLeakage.getDefaultInstance();
            }

            public SEHeartRateLeakage.Builder getHeartRateLeakageBuilder() {
                return (SEHeartRateLeakage.Builder) internalGetHeartRateLeakageFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEHeartRateLeakageOrBuilder getHeartRateLeakageOrBuilder() {
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.heartRateLeakageBuilder_) == null) ? i7 == 3 ? (SEHeartRateLeakage) this.payload_ : SEHeartRateLeakage.getDefaultInstance() : (SEHeartRateLeakageOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEHeartRateLeakageRawDate getHeartRateLeakageRawDate() {
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder = this.heartRateLeakageRawDateBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SEHeartRateLeakageRawDate) this.payload_ : SEHeartRateLeakageRawDate.getDefaultInstance() : this.payloadCase_ == 4 ? (SEHeartRateLeakageRawDate) singleFieldBuilder.getMessage() : SEHeartRateLeakageRawDate.getDefaultInstance();
            }

            public SEHeartRateLeakageRawDate.Builder getHeartRateLeakageRawDateBuilder() {
                return (SEHeartRateLeakageRawDate.Builder) internalGetHeartRateLeakageRawDateFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEHeartRateLeakageRawDateOrBuilder getHeartRateLeakageRawDateOrBuilder() {
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.heartRateLeakageRawDateBuilder_) == null) ? i7 == 4 ? (SEHeartRateLeakageRawDate) this.payload_ : SEHeartRateLeakageRawDate.getDefaultInstance() : (SEHeartRateLeakageRawDateOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SEHeartRateSwitch getHeartRateSwitch() {
                SEHeartRateSwitch sEHeartRateSwitchForNumber;
                return (this.payloadCase_ != 2 || (sEHeartRateSwitchForNumber = SEHeartRateSwitch.forNumber(((Integer) this.payload_).intValue())) == null) ? SEHeartRateSwitch.HEART_RATE_START : sEHeartRateSwitchForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SELogRespond getLogRespond() {
                SELogRespond sELogRespondForNumber;
                return (this.payloadCase_ != 5 || (sELogRespondForNumber = SELogRespond.forNumber(((Integer) this.payload_).intValue())) == null) ? SELogRespond.START_LOG_UPDATE : sELogRespondForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SETriaxialRawDate getTriaxialRawDate() {
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder = this.triaxialRawDateBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 10 ? (SETriaxialRawDate) this.payload_ : SETriaxialRawDate.getDefaultInstance() : this.payloadCase_ == 10 ? (SETriaxialRawDate) singleFieldBuilder.getMessage() : SETriaxialRawDate.getDefaultInstance();
            }

            public SETriaxialRawDate.Builder getTriaxialRawDateBuilder() {
                return (SETriaxialRawDate.Builder) internalGetTriaxialRawDateFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SETriaxialRawDateOrBuilder getTriaxialRawDateOrBuilder() {
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilder = this.triaxialRawDateBuilder_) == null) ? i7 == 10 ? (SETriaxialRawDate) this.payload_ : SETriaxialRawDate.getDefaultInstance() : (SETriaxialRawDateOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public SETriaxialSwitch getTriaxialSwitch() {
                SETriaxialSwitch sETriaxialSwitchForNumber;
                return (this.payloadCase_ != 9 || (sETriaxialSwitchForNumber = SETriaxialSwitch.forNumber(((Integer) this.payload_).intValue())) == null) ? SETriaxialSwitch.TRIAXIAL_START : sETriaxialSwitchForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasBluetoothNameSetting() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasBuriedFile() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasDevelopeMode() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasDevelopeSwitch() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasFile() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasGsensorGeomagneticRawDate() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasGsensorGeomagneticSwitch() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasHeartRateLeakage() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasHeartRateLeakageRawDate() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasHeartRateSwitch() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasLogRespond() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasTriaxialRawDate() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
            public boolean hasTriaxialSwitch() {
                return this.payloadCase_ == 9;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEFactory_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFactory.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasFile() && !getFile().isInitialized()) {
                    return false;
                }
                if (hasHeartRateLeakage() && !getHeartRateLeakage().isInitialized()) {
                    return false;
                }
                if (hasHeartRateLeakageRawDate() && !getHeartRateLeakageRawDate().isInitialized()) {
                    return false;
                }
                if (hasBluetoothNameSetting() && !getBluetoothNameSetting().isInitialized()) {
                    return false;
                }
                if (hasGsensorGeomagneticRawDate() && !getGsensorGeomagneticRawDate().isInitialized()) {
                    return false;
                }
                if (hasTriaxialRawDate() && !getTriaxialRawDate().isInitialized()) {
                    return false;
                }
                if (hasBuriedFile() && !getBuriedFile().isInitialized()) {
                    return false;
                }
                if (!hasDevelopeSwitch() || getDevelopeSwitch().isInitialized()) {
                    return !hasDevelopeMode() || getDevelopeMode().isInitialized();
                }
                return false;
            }

            public Builder mergeBluetoothNameSetting(SEBluetoothNameSetting sEBluetoothNameSetting) {
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder = this.bluetoothNameSettingBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEBluetoothNameSetting.getDefaultInstance()) {
                        this.payload_ = sEBluetoothNameSetting;
                    } else {
                        this.payload_ = SEBluetoothNameSetting.newBuilder((SEBluetoothNameSetting) this.payload_).mergeFrom(sEBluetoothNameSetting).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEBluetoothNameSetting);
                } else {
                    singleFieldBuilder.setMessage(sEBluetoothNameSetting);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeBuriedFile(SEBuriedFiles sEBuriedFiles) {
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder = this.buriedFileBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 11 || this.payload_ == SEBuriedFiles.getDefaultInstance()) {
                        this.payload_ = sEBuriedFiles;
                    } else {
                        this.payload_ = SEBuriedFiles.newBuilder((SEBuriedFiles) this.payload_).mergeFrom(sEBuriedFiles).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 11) {
                    singleFieldBuilder.mergeFrom(sEBuriedFiles);
                } else {
                    singleFieldBuilder.setMessage(sEBuriedFiles);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeDevelopeMode(SEDevelopeMode sEDevelopeMode) {
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder = this.developeModeBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 13 || this.payload_ == SEDevelopeMode.getDefaultInstance()) {
                        this.payload_ = sEDevelopeMode;
                    } else {
                        this.payload_ = SEDevelopeMode.newBuilder((SEDevelopeMode) this.payload_).mergeFrom(sEDevelopeMode).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 13) {
                    singleFieldBuilder.mergeFrom(sEDevelopeMode);
                } else {
                    singleFieldBuilder.setMessage(sEDevelopeMode);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeDevelopeSwitch(SEDevelopeSwitch sEDevelopeSwitch) {
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder = this.developeSwitchBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 12 || this.payload_ == SEDevelopeSwitch.getDefaultInstance()) {
                        this.payload_ = sEDevelopeSwitch;
                    } else {
                        this.payload_ = SEDevelopeSwitch.newBuilder((SEDevelopeSwitch) this.payload_).mergeFrom(sEDevelopeSwitch).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 12) {
                    singleFieldBuilder.mergeFrom(sEDevelopeSwitch);
                } else {
                    singleFieldBuilder.setMessage(sEDevelopeSwitch);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder mergeFile(SEFileInfo sEFileInfo) {
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder = this.fileBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEFileInfo.getDefaultInstance()) {
                        this.payload_ = sEFileInfo;
                    } else {
                        this.payload_ = SEFileInfo.newBuilder((SEFileInfo) this.payload_).mergeFrom(sEFileInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEFileInfo);
                } else {
                    singleFieldBuilder.setMessage(sEFileInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeGsensorGeomagneticRawDate(SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDate) {
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder = this.gsensorGeomagneticRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SEGsensorGeomagneticRawDate.getDefaultInstance()) {
                        this.payload_ = sEGsensorGeomagneticRawDate;
                    } else {
                        this.payload_ = SEGsensorGeomagneticRawDate.newBuilder((SEGsensorGeomagneticRawDate) this.payload_).mergeFrom(sEGsensorGeomagneticRawDate).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sEGsensorGeomagneticRawDate);
                } else {
                    singleFieldBuilder.setMessage(sEGsensorGeomagneticRawDate);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeHeartRateLeakage(SEHeartRateLeakage sEHeartRateLeakage) {
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder = this.heartRateLeakageBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SEHeartRateLeakage.getDefaultInstance()) {
                        this.payload_ = sEHeartRateLeakage;
                    } else {
                        this.payload_ = SEHeartRateLeakage.newBuilder((SEHeartRateLeakage) this.payload_).mergeFrom(sEHeartRateLeakage).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEHeartRateLeakage);
                } else {
                    singleFieldBuilder.setMessage(sEHeartRateLeakage);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeHeartRateLeakageRawDate(SEHeartRateLeakageRawDate sEHeartRateLeakageRawDate) {
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder = this.heartRateLeakageRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SEHeartRateLeakageRawDate.getDefaultInstance()) {
                        this.payload_ = sEHeartRateLeakageRawDate;
                    } else {
                        this.payload_ = SEHeartRateLeakageRawDate.newBuilder((SEHeartRateLeakageRawDate) this.payload_).mergeFrom(sEHeartRateLeakageRawDate).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEHeartRateLeakageRawDate);
                } else {
                    singleFieldBuilder.setMessage(sEHeartRateLeakageRawDate);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeTriaxialRawDate(SETriaxialRawDate sETriaxialRawDate) {
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder = this.triaxialRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 10 || this.payload_ == SETriaxialRawDate.getDefaultInstance()) {
                        this.payload_ = sETriaxialRawDate;
                    } else {
                        this.payload_ = SETriaxialRawDate.newBuilder((SETriaxialRawDate) this.payload_).mergeFrom(sETriaxialRawDate).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 10) {
                    singleFieldBuilder.mergeFrom(sETriaxialRawDate);
                } else {
                    singleFieldBuilder.setMessage(sETriaxialRawDate);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setBluetoothNameSetting(SEBluetoothNameSetting sEBluetoothNameSetting) {
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder = this.bluetoothNameSettingBuilder_;
                if (singleFieldBuilder == null) {
                    sEBluetoothNameSetting.getClass();
                    this.payload_ = sEBluetoothNameSetting;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBluetoothNameSetting);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setBuriedFile(SEBuriedFiles sEBuriedFiles) {
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder = this.buriedFileBuilder_;
                if (singleFieldBuilder == null) {
                    sEBuriedFiles.getClass();
                    this.payload_ = sEBuriedFiles;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBuriedFiles);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setDevelopeMode(SEDevelopeMode sEDevelopeMode) {
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder = this.developeModeBuilder_;
                if (singleFieldBuilder == null) {
                    sEDevelopeMode.getClass();
                    this.payload_ = sEDevelopeMode;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEDevelopeMode);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setDevelopeSwitch(SEDevelopeSwitch sEDevelopeSwitch) {
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder = this.developeSwitchBuilder_;
                if (singleFieldBuilder == null) {
                    sEDevelopeSwitch.getClass();
                    this.payload_ = sEDevelopeSwitch;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEDevelopeSwitch);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setFile(SEFileInfo sEFileInfo) {
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder = this.fileBuilder_;
                if (singleFieldBuilder == null) {
                    sEFileInfo.getClass();
                    this.payload_ = sEFileInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEFileInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setGsensorGeomagneticRawDate(SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDate) {
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder = this.gsensorGeomagneticRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    sEGsensorGeomagneticRawDate.getClass();
                    this.payload_ = sEGsensorGeomagneticRawDate;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEGsensorGeomagneticRawDate);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setGsensorGeomagneticSwitch(SEGsensorGeomagneticSwitch sEGsensorGeomagneticSwitch) {
                sEGsensorGeomagneticSwitch.getClass();
                this.payloadCase_ = 7;
                this.payload_ = Integer.valueOf(sEGsensorGeomagneticSwitch.getNumber());
                onChanged();
                return this;
            }

            public Builder setHeartRateLeakage(SEHeartRateLeakage sEHeartRateLeakage) {
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder = this.heartRateLeakageBuilder_;
                if (singleFieldBuilder == null) {
                    sEHeartRateLeakage.getClass();
                    this.payload_ = sEHeartRateLeakage;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEHeartRateLeakage);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setHeartRateLeakageRawDate(SEHeartRateLeakageRawDate sEHeartRateLeakageRawDate) {
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder = this.heartRateLeakageRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    sEHeartRateLeakageRawDate.getClass();
                    this.payload_ = sEHeartRateLeakageRawDate;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEHeartRateLeakageRawDate);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setHeartRateSwitch(SEHeartRateSwitch sEHeartRateSwitch) {
                sEHeartRateSwitch.getClass();
                this.payloadCase_ = 2;
                this.payload_ = Integer.valueOf(sEHeartRateSwitch.getNumber());
                onChanged();
                return this;
            }

            public Builder setLogRespond(SELogRespond sELogRespond) {
                sELogRespond.getClass();
                this.payloadCase_ = 5;
                this.payload_ = Integer.valueOf(sELogRespond.getNumber());
                onChanged();
                return this;
            }

            public Builder setTriaxialRawDate(SETriaxialRawDate sETriaxialRawDate) {
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder = this.triaxialRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    sETriaxialRawDate.getClass();
                    this.payload_ = sETriaxialRawDate;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sETriaxialRawDate);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setTriaxialSwitch(SETriaxialSwitch sETriaxialSwitch) {
                sETriaxialSwitch.getClass();
                this.payloadCase_ = 9;
                this.payload_ = Integer.valueOf(sETriaxialSwitch.getNumber());
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFactory build() {
                SEFactory sEFactoryBuildPartial = buildPartial();
                if (sEFactoryBuildPartial.isInitialized()) {
                    return sEFactoryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEFactoryBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFactory buildPartial() {
                SEFactory sEFactory = new SEFactory(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEFactory);
                }
                buildPartialOneofs(sEFactory);
                onBuilt();
                return sEFactory;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEFactory getDefaultInstanceForType() {
                return SEFactory.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder = this.fileBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder2 = this.heartRateLeakageBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder3 = this.heartRateLeakageRawDateBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder4 = this.bluetoothNameSettingBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder5 = this.gsensorGeomagneticRawDateBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder6 = this.triaxialRawDateBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder7 = this.buriedFileBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder8 = this.developeSwitchBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder9 = this.developeModeBuilder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEFactory) {
                    return mergeFrom((SEFactory) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBluetoothNameSetting(SEBluetoothNameSetting.Builder builder) {
                SingleFieldBuilder<SEBluetoothNameSetting, SEBluetoothNameSetting.Builder, SEBluetoothNameSettingOrBuilder> singleFieldBuilder = this.bluetoothNameSettingBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setBuriedFile(SEBuriedFiles.Builder builder) {
                SingleFieldBuilder<SEBuriedFiles, SEBuriedFiles.Builder, SEBuriedFilesOrBuilder> singleFieldBuilder = this.buriedFileBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setDevelopeMode(SEDevelopeMode.Builder builder) {
                SingleFieldBuilder<SEDevelopeMode, SEDevelopeMode.Builder, SEDevelopeModeOrBuilder> singleFieldBuilder = this.developeModeBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setDevelopeSwitch(SEDevelopeSwitch.Builder builder) {
                SingleFieldBuilder<SEDevelopeSwitch, SEDevelopeSwitch.Builder, SEDevelopeSwitchOrBuilder> singleFieldBuilder = this.developeSwitchBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setFile(SEFileInfo.Builder builder) {
                SingleFieldBuilder<SEFileInfo, SEFileInfo.Builder, SEFileInfoOrBuilder> singleFieldBuilder = this.fileBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setGsensorGeomagneticRawDate(SEGsensorGeomagneticRawDate.Builder builder) {
                SingleFieldBuilder<SEGsensorGeomagneticRawDate, SEGsensorGeomagneticRawDate.Builder, SEGsensorGeomagneticRawDateOrBuilder> singleFieldBuilder = this.gsensorGeomagneticRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setHeartRateLeakage(SEHeartRateLeakage.Builder builder) {
                SingleFieldBuilder<SEHeartRateLeakage, SEHeartRateLeakage.Builder, SEHeartRateLeakageOrBuilder> singleFieldBuilder = this.heartRateLeakageBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setHeartRateLeakageRawDate(SEHeartRateLeakageRawDate.Builder builder) {
                SingleFieldBuilder<SEHeartRateLeakageRawDate, SEHeartRateLeakageRawDate.Builder, SEHeartRateLeakageRawDateOrBuilder> singleFieldBuilder = this.heartRateLeakageRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setTriaxialRawDate(SETriaxialRawDate.Builder builder) {
                SingleFieldBuilder<SETriaxialRawDate, SETriaxialRawDate.Builder, SETriaxialRawDateOrBuilder> singleFieldBuilder = this.triaxialRawDateBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeFrom(SEFactory sEFactory) {
                if (sEFactory == SEFactory.getDefaultInstance()) {
                    return this;
                }
                switch (sEFactory.getPayloadCase()) {
                    case FILE:
                        mergeFile(sEFactory.getFile());
                        break;
                    case HEART_RATE_SWITCH:
                        setHeartRateSwitch(sEFactory.getHeartRateSwitch());
                        break;
                    case HEART_RATE_LEAKAGE:
                        mergeHeartRateLeakage(sEFactory.getHeartRateLeakage());
                        break;
                    case HEART_RATE_LEAKAGE_RAW_DATE:
                        mergeHeartRateLeakageRawDate(sEFactory.getHeartRateLeakageRawDate());
                        break;
                    case LOG_RESPOND:
                        setLogRespond(sEFactory.getLogRespond());
                        break;
                    case BLUETOOTH_NAME_SETTING:
                        mergeBluetoothNameSetting(sEFactory.getBluetoothNameSetting());
                        break;
                    case GSENSOR_GEOMAGNETIC_SWITCH:
                        setGsensorGeomagneticSwitch(sEFactory.getGsensorGeomagneticSwitch());
                        break;
                    case GSENSOR_GEOMAGNETIC_RAW_DATE:
                        mergeGsensorGeomagneticRawDate(sEFactory.getGsensorGeomagneticRawDate());
                        break;
                    case TRIAXIAL_SWITCH:
                        setTriaxialSwitch(sEFactory.getTriaxialSwitch());
                        break;
                    case TRIAXIAL_RAW_DATE:
                        mergeTriaxialRawDate(sEFactory.getTriaxialRawDate());
                        break;
                    case BURIED_FILE:
                        mergeBuriedFile(sEFactory.getBuriedFile());
                        break;
                    case DEVELOPE_SWITCH:
                        mergeDevelopeSwitch(sEFactory.getDevelopeSwitch());
                        break;
                    case DEVELOPE_MODE:
                        mergeDevelopeMode(sEFactory.getDevelopeMode());
                        break;
                }
                mergeUnknownFields(sEFactory.getUnknownFields());
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
                                case 10:
                                    codedInputStream.readMessage(internalGetFileFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                    break;
                                case 16:
                                    int i7 = codedInputStream.readEnum();
                                    if (SEHeartRateSwitch.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.payloadCase_ = 2;
                                        this.payload_ = Integer.valueOf(i7);
                                    }
                                    break;
                                case 26:
                                    codedInputStream.readMessage(internalGetHeartRateLeakageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                    break;
                                case 34:
                                    codedInputStream.readMessage(internalGetHeartRateLeakageRawDateFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                    break;
                                case 40:
                                    int i8 = codedInputStream.readEnum();
                                    if (SELogRespond.forNumber(i8) == null) {
                                        mergeUnknownVarintField(5, i8);
                                    } else {
                                        this.payloadCase_ = 5;
                                        this.payload_ = Integer.valueOf(i8);
                                    }
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetBluetoothNameSettingFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 56:
                                    int i9 = codedInputStream.readEnum();
                                    if (SEGsensorGeomagneticSwitch.forNumber(i9) == null) {
                                        mergeUnknownVarintField(7, i9);
                                    } else {
                                        this.payloadCase_ = 7;
                                        this.payload_ = Integer.valueOf(i9);
                                    }
                                    break;
                                case 66:
                                    codedInputStream.readMessage(internalGetGsensorGeomagneticRawDateFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                    break;
                                case 72:
                                    int i10 = codedInputStream.readEnum();
                                    if (SETriaxialSwitch.forNumber(i10) == null) {
                                        mergeUnknownVarintField(9, i10);
                                    } else {
                                        this.payloadCase_ = 9;
                                        this.payload_ = Integer.valueOf(i10);
                                    }
                                    break;
                                case 82:
                                    codedInputStream.readMessage(internalGetTriaxialRawDateFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 10;
                                    break;
                                case 90:
                                    codedInputStream.readMessage(internalGetBuriedFileFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 11;
                                    break;
                                case 98:
                                    codedInputStream.readMessage(internalGetDevelopeSwitchFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 12;
                                    break;
                                case 106:
                                    codedInputStream.readMessage(internalGetDevelopeModeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 13;
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

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            FILE(1),
            HEART_RATE_SWITCH(2),
            HEART_RATE_LEAKAGE(3),
            HEART_RATE_LEAKAGE_RAW_DATE(4),
            LOG_RESPOND(5),
            BLUETOOTH_NAME_SETTING(6),
            GSENSOR_GEOMAGNETIC_SWITCH(7),
            GSENSOR_GEOMAGNETIC_RAW_DATE(8),
            TRIAXIAL_SWITCH(9),
            TRIAXIAL_RAW_DATE(10),
            BURIED_FILE(11),
            DEVELOPE_SWITCH(12),
            DEVELOPE_MODE(13),
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
                        return FILE;
                    case 2:
                        return HEART_RATE_SWITCH;
                    case 3:
                        return HEART_RATE_LEAKAGE;
                    case 4:
                        return HEART_RATE_LEAKAGE_RAW_DATE;
                    case 5:
                        return LOG_RESPOND;
                    case 6:
                        return BLUETOOTH_NAME_SETTING;
                    case 7:
                        return GSENSOR_GEOMAGNETIC_SWITCH;
                    case 8:
                        return GSENSOR_GEOMAGNETIC_RAW_DATE;
                    case 9:
                        return TRIAXIAL_SWITCH;
                    case 10:
                        return TRIAXIAL_RAW_DATE;
                    case 11:
                        return BURIED_FILE;
                    case 12:
                        return DEVELOPE_SWITCH;
                    case 13:
                        return DEVELOPE_MODE;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFactory");
            DEFAULT_INSTANCE = new SEFactory();
            PARSER = new AbstractParser<SEFactory>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEFactory.1
                @Override // com.google.protobuf.Parser
                public SEFactory parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEFactory.newBuilder();
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

        public /* synthetic */ SEFactory(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEFactory getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEFactory_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEFactory parseDelimitedFrom(InputStream inputStream) {
            return (SEFactory) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEFactory parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEFactory> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEFactory)) {
                return super.equals(obj);
            }
            SEFactory sEFactory = (SEFactory) obj;
            if (!getPayloadCase().equals(sEFactory.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getFile().equals(sEFactory.getFile())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getHeartRateSwitch().equals(sEFactory.getHeartRateSwitch())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getHeartRateLeakage().equals(sEFactory.getHeartRateLeakage())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getHeartRateLeakageRawDate().equals(sEFactory.getHeartRateLeakageRawDate())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getLogRespond().equals(sEFactory.getLogRespond())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getBluetoothNameSetting().equals(sEFactory.getBluetoothNameSetting())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getGsensorGeomagneticSwitch().equals(sEFactory.getGsensorGeomagneticSwitch())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getGsensorGeomagneticRawDate().equals(sEFactory.getGsensorGeomagneticRawDate())) {
                        return false;
                    }
                    break;
                case 9:
                    if (!getTriaxialSwitch().equals(sEFactory.getTriaxialSwitch())) {
                        return false;
                    }
                    break;
                case 10:
                    if (!getTriaxialRawDate().equals(sEFactory.getTriaxialRawDate())) {
                        return false;
                    }
                    break;
                case 11:
                    if (!getBuriedFile().equals(sEFactory.getBuriedFile())) {
                        return false;
                    }
                    break;
                case 12:
                    if (!getDevelopeSwitch().equals(sEFactory.getDevelopeSwitch())) {
                        return false;
                    }
                    break;
                case 13:
                    if (!getDevelopeMode().equals(sEFactory.getDevelopeMode())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEFactory.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEBluetoothNameSetting getBluetoothNameSetting() {
            return this.payloadCase_ == 6 ? (SEBluetoothNameSetting) this.payload_ : SEBluetoothNameSetting.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEBluetoothNameSettingOrBuilder getBluetoothNameSettingOrBuilder() {
            return this.payloadCase_ == 6 ? (SEBluetoothNameSetting) this.payload_ : SEBluetoothNameSetting.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEBuriedFiles getBuriedFile() {
            return this.payloadCase_ == 11 ? (SEBuriedFiles) this.payload_ : SEBuriedFiles.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEBuriedFilesOrBuilder getBuriedFileOrBuilder() {
            return this.payloadCase_ == 11 ? (SEBuriedFiles) this.payload_ : SEBuriedFiles.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEFactory_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEDevelopeMode getDevelopeMode() {
            return this.payloadCase_ == 13 ? (SEDevelopeMode) this.payload_ : SEDevelopeMode.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEDevelopeModeOrBuilder getDevelopeModeOrBuilder() {
            return this.payloadCase_ == 13 ? (SEDevelopeMode) this.payload_ : SEDevelopeMode.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEDevelopeSwitch getDevelopeSwitch() {
            return this.payloadCase_ == 12 ? (SEDevelopeSwitch) this.payload_ : SEDevelopeSwitch.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEDevelopeSwitchOrBuilder getDevelopeSwitchOrBuilder() {
            return this.payloadCase_ == 12 ? (SEDevelopeSwitch) this.payload_ : SEDevelopeSwitch.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEFileInfo getFile() {
            return this.payloadCase_ == 1 ? (SEFileInfo) this.payload_ : SEFileInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEFileInfoOrBuilder getFileOrBuilder() {
            return this.payloadCase_ == 1 ? (SEFileInfo) this.payload_ : SEFileInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEGsensorGeomagneticRawDate getGsensorGeomagneticRawDate() {
            return this.payloadCase_ == 8 ? (SEGsensorGeomagneticRawDate) this.payload_ : SEGsensorGeomagneticRawDate.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEGsensorGeomagneticRawDateOrBuilder getGsensorGeomagneticRawDateOrBuilder() {
            return this.payloadCase_ == 8 ? (SEGsensorGeomagneticRawDate) this.payload_ : SEGsensorGeomagneticRawDate.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEGsensorGeomagneticSwitch getGsensorGeomagneticSwitch() {
            SEGsensorGeomagneticSwitch sEGsensorGeomagneticSwitchForNumber;
            return (this.payloadCase_ != 7 || (sEGsensorGeomagneticSwitchForNumber = SEGsensorGeomagneticSwitch.forNumber(((Integer) this.payload_).intValue())) == null) ? SEGsensorGeomagneticSwitch.GSENSOR_GEOMAGNETIC_START : sEGsensorGeomagneticSwitchForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEHeartRateLeakage getHeartRateLeakage() {
            return this.payloadCase_ == 3 ? (SEHeartRateLeakage) this.payload_ : SEHeartRateLeakage.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEHeartRateLeakageOrBuilder getHeartRateLeakageOrBuilder() {
            return this.payloadCase_ == 3 ? (SEHeartRateLeakage) this.payload_ : SEHeartRateLeakage.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEHeartRateLeakageRawDate getHeartRateLeakageRawDate() {
            return this.payloadCase_ == 4 ? (SEHeartRateLeakageRawDate) this.payload_ : SEHeartRateLeakageRawDate.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEHeartRateLeakageRawDateOrBuilder getHeartRateLeakageRawDateOrBuilder() {
            return this.payloadCase_ == 4 ? (SEHeartRateLeakageRawDate) this.payload_ : SEHeartRateLeakageRawDate.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SEHeartRateSwitch getHeartRateSwitch() {
            SEHeartRateSwitch sEHeartRateSwitchForNumber;
            return (this.payloadCase_ != 2 || (sEHeartRateSwitchForNumber = SEHeartRateSwitch.forNumber(((Integer) this.payload_).intValue())) == null) ? SEHeartRateSwitch.HEART_RATE_START : sEHeartRateSwitchForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SELogRespond getLogRespond() {
            SELogRespond sELogRespondForNumber;
            return (this.payloadCase_ != 5 || (sELogRespondForNumber = SELogRespond.forNumber(((Integer) this.payload_).intValue())) == null) ? SELogRespond.START_LOG_UPDATE : sELogRespondForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEFactory> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEFileInfo) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (SEHeartRateLeakage) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (SEHeartRateLeakageRawDate) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(5, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SEBluetoothNameSetting) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(7, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (SEGsensorGeomagneticRawDate) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(9, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 10) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, (SETriaxialRawDate) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, (SEBuriedFiles) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, (SEDevelopeSwitch) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, (SEDevelopeMode) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SETriaxialRawDate getTriaxialRawDate() {
            return this.payloadCase_ == 10 ? (SETriaxialRawDate) this.payload_ : SETriaxialRawDate.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SETriaxialRawDateOrBuilder getTriaxialRawDateOrBuilder() {
            return this.payloadCase_ == 10 ? (SETriaxialRawDate) this.payload_ : SETriaxialRawDate.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public SETriaxialSwitch getTriaxialSwitch() {
            SETriaxialSwitch sETriaxialSwitchForNumber;
            return (this.payloadCase_ != 9 || (sETriaxialSwitchForNumber = SETriaxialSwitch.forNumber(((Integer) this.payload_).intValue())) == null) ? SETriaxialSwitch.TRIAXIAL_START : sETriaxialSwitchForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasBluetoothNameSetting() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasBuriedFile() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasDevelopeMode() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasDevelopeSwitch() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasFile() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasGsensorGeomagneticRawDate() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasGsensorGeomagneticSwitch() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasHeartRateLeakage() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasHeartRateLeakageRawDate() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasHeartRateSwitch() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasLogRespond() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasTriaxialRawDate() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFactoryOrBuilder
        public boolean hasTriaxialSwitch() {
            return this.payloadCase_ == 9;
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
                    iHashCode = getFile().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getHeartRateSwitch().getNumber();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getHeartRateLeakage().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getHeartRateLeakageRawDate().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getLogRespond().getNumber();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getBluetoothNameSetting().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getGsensorGeomagneticSwitch().getNumber();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getGsensorGeomagneticRawDate().hashCode();
                    break;
                case 9:
                    i7 = ((iHashCode2 * 37) + 9) * 53;
                    iHashCode = getTriaxialSwitch().getNumber();
                    break;
                case 10:
                    i7 = ((iHashCode2 * 37) + 10) * 53;
                    iHashCode = getTriaxialRawDate().hashCode();
                    break;
                case 11:
                    i7 = ((iHashCode2 * 37) + 11) * 53;
                    iHashCode = getBuriedFile().hashCode();
                    break;
                case 12:
                    i7 = ((iHashCode2 * 37) + 12) * 53;
                    iHashCode = getDevelopeSwitch().hashCode();
                    break;
                case 13:
                    i7 = ((iHashCode2 * 37) + 13) * 53;
                    iHashCode = getDevelopeMode().hashCode();
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
            return FactoryProtos.internal_static_SEFactory_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFactory.class, Builder.class);
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
            if (hasFile() && !getFile().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHeartRateLeakage() && !getHeartRateLeakage().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHeartRateLeakageRawDate() && !getHeartRateLeakageRawDate().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBluetoothNameSetting() && !getBluetoothNameSetting().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGsensorGeomagneticRawDate() && !getGsensorGeomagneticRawDate().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTriaxialRawDate() && !getTriaxialRawDate().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBuriedFile() && !getBuriedFile().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDevelopeSwitch() && !getDevelopeSwitch().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDevelopeMode() || getDevelopeMode().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEFileInfo) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeEnum(2, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SEHeartRateLeakage) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SEHeartRateLeakageRawDate) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeEnum(5, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEBluetoothNameSetting) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeEnum(7, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SEGsensorGeomagneticRawDate) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeEnum(9, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (SETriaxialRawDate) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (SEBuriedFiles) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (SEDevelopeSwitch) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (SEDevelopeMode) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEFactory(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEFactory sEFactory) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEFactory);
        }

        public static SEFactory parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEFactory parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFactory) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFactory parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEFactory getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEFactory parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEFactory() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEFactory parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEFactory parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEFactory parseFrom(InputStream inputStream) {
            return (SEFactory) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEFactory parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFactory) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFactory parseFrom(CodedInputStream codedInputStream) {
            return (SEFactory) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEFactory parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFactory) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEFactoryOrBuilder extends MessageOrBuilder {
        SEBluetoothNameSetting getBluetoothNameSetting();

        SEBluetoothNameSettingOrBuilder getBluetoothNameSettingOrBuilder();

        SEBuriedFiles getBuriedFile();

        SEBuriedFilesOrBuilder getBuriedFileOrBuilder();

        SEDevelopeMode getDevelopeMode();

        SEDevelopeModeOrBuilder getDevelopeModeOrBuilder();

        SEDevelopeSwitch getDevelopeSwitch();

        SEDevelopeSwitchOrBuilder getDevelopeSwitchOrBuilder();

        SEFileInfo getFile();

        SEFileInfoOrBuilder getFileOrBuilder();

        SEGsensorGeomagneticRawDate getGsensorGeomagneticRawDate();

        SEGsensorGeomagneticRawDateOrBuilder getGsensorGeomagneticRawDateOrBuilder();

        SEGsensorGeomagneticSwitch getGsensorGeomagneticSwitch();

        SEHeartRateLeakage getHeartRateLeakage();

        SEHeartRateLeakageOrBuilder getHeartRateLeakageOrBuilder();

        SEHeartRateLeakageRawDate getHeartRateLeakageRawDate();

        SEHeartRateLeakageRawDateOrBuilder getHeartRateLeakageRawDateOrBuilder();

        SEHeartRateSwitch getHeartRateSwitch();

        SELogRespond getLogRespond();

        SEFactory.PayloadCase getPayloadCase();

        SETriaxialRawDate getTriaxialRawDate();

        SETriaxialRawDateOrBuilder getTriaxialRawDateOrBuilder();

        SETriaxialSwitch getTriaxialSwitch();

        boolean hasBluetoothNameSetting();

        boolean hasBuriedFile();

        boolean hasDevelopeMode();

        boolean hasDevelopeSwitch();

        boolean hasFile();

        boolean hasGsensorGeomagneticRawDate();

        boolean hasGsensorGeomagneticSwitch();

        boolean hasHeartRateLeakage();

        boolean hasHeartRateLeakageRawDate();

        boolean hasHeartRateSwitch();

        boolean hasLogRespond();

        boolean hasTriaxialRawDate();

        boolean hasTriaxialSwitch();
    }

    public static final class SEFileInfo extends GeneratedMessage implements SEFileInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final SEFileInfo DEFAULT_INSTANCE;
        public static final int FILE_NAME_FIELD_NUMBER = 1;
        public static final int FILE_STATE_FIELD_NUMBER = 3;
        private static final Parser<SEFileInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private volatile Object fileName_;
        private int fileState_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEFileInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEFileInfo> {
            @Override // com.google.protobuf.Parser
            public SEFileInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEFileInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEFileInfoOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private Object fileName_;
            private int fileState_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEFileInfo sEFileInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEFileInfo.fileName_ = this.fileName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEFileInfo.data_ = this.data_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEFileInfo.fileState_ = this.fileState_;
                    i7 |= 4;
                }
                sEFileInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEFileInfo_descriptor;
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = SEFileInfo.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            public Builder clearFileName() {
                this.fileName_ = SEFileInfo.getDefaultInstance().getFileName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearFileState() {
                this.bitField0_ &= -5;
                this.fileState_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEFileInfo_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fileName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
            public int getFileState() {
                return this.fileState_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
            public boolean hasFileName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
            public boolean hasFileState() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEFileInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFileInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFileName() && hasData();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFileName(String str) {
                str.getClass();
                this.fileName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) {
                byteString.getClass();
                this.fileName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFileState(int i7) {
                this.fileState_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.fileName_ = "";
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFileInfo build() {
                SEFileInfo sEFileInfoBuildPartial = buildPartial();
                if (sEFileInfoBuildPartial.isInitialized()) {
                    return sEFileInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEFileInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEFileInfo buildPartial() {
                SEFileInfo sEFileInfo = new SEFileInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEFileInfo);
                }
                onBuilt();
                return sEFileInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEFileInfo getDefaultInstanceForType() {
                return SEFileInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.fileName_ = "";
                this.data_ = ByteString.EMPTY;
                this.fileState_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.fileName_ = "";
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEFileInfo) {
                    return mergeFrom((SEFileInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEFileInfo sEFileInfo) {
                if (sEFileInfo == SEFileInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEFileInfo.hasFileName()) {
                    this.fileName_ = sEFileInfo.fileName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEFileInfo.hasData()) {
                    setData(sEFileInfo.getData());
                }
                if (sEFileInfo.hasFileState()) {
                    setFileState(sEFileInfo.getFileState());
                }
                mergeUnknownFields(sEFileInfo.getUnknownFields());
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
                                    this.fileName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.fileState_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFileInfo");
            DEFAULT_INSTANCE = new SEFileInfo();
            PARSER = new AbstractParser<SEFileInfo>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfo.1
                @Override // com.google.protobuf.Parser
                public SEFileInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEFileInfo.newBuilder();
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

        public /* synthetic */ SEFileInfo(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEFileInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEFileInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEFileInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEFileInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEFileInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEFileInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEFileInfo)) {
                return super.equals(obj);
            }
            SEFileInfo sEFileInfo = (SEFileInfo) obj;
            if (hasFileName() != sEFileInfo.hasFileName()) {
                return false;
            }
            if ((hasFileName() && !getFileName().equals(sEFileInfo.getFileName())) || hasData() != sEFileInfo.hasData()) {
                return false;
            }
            if ((!hasData() || getData().equals(sEFileInfo.getData())) && hasFileState() == sEFileInfo.hasFileState()) {
                return (!hasFileState() || getFileState() == sEFileInfo.getFileState()) && getUnknownFields().equals(sEFileInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEFileInfo_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fileName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
        public int getFileState() {
            return this.fileState_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEFileInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.fileName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.data_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.fileState_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
        public boolean hasFileName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEFileInfoOrBuilder
        public boolean hasFileState() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasFileName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFileName().hashCode();
            }
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getData().hashCode();
            }
            if (hasFileState()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getFileState();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEFileInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEFileInfo.class, Builder.class);
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
            if (!hasFileName()) {
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
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.fileName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.data_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.fileState_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEFileInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.fileName_ = "";
            this.data_ = ByteString.EMPTY;
            this.fileState_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEFileInfo sEFileInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEFileInfo);
        }

        public static SEFileInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEFileInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFileInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFileInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEFileInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEFileInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEFileInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEFileInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEFileInfo() {
            this.fileName_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.data_ = byteString;
            this.fileState_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.fileName_ = "";
            this.data_ = byteString;
        }

        public static SEFileInfo parseFrom(InputStream inputStream) {
            return (SEFileInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEFileInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFileInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEFileInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEFileInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEFileInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEFileInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEFileInfoOrBuilder extends MessageOrBuilder {
        ByteString getData();

        String getFileName();

        ByteString getFileNameBytes();

        int getFileState();

        boolean hasData();

        boolean hasFileName();

        boolean hasFileState();
    }

    public static final class SEGsensorGeomagneticRawDate extends GeneratedMessage implements SEGsensorGeomagneticRawDateOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final SEGsensorGeomagneticRawDate DEFAULT_INSTANCE;
        private static final Parser<SEGsensorGeomagneticRawDate> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEGsensorGeomagneticRawDate$1 */
        public class AnonymousClass1 extends AbstractParser<SEGsensorGeomagneticRawDate> {
            @Override // com.google.protobuf.Parser
            public SEGsensorGeomagneticRawDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEGsensorGeomagneticRawDate.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEGsensorGeomagneticRawDateOrBuilder {
            private int bitField0_;
            private ByteString data_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDate) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sEGsensorGeomagneticRawDate.data_ = this.data_;
                } else {
                    i7 = 0;
                }
                sEGsensorGeomagneticRawDate.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEGsensorGeomagneticRawDate_descriptor;
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = SEGsensorGeomagneticRawDate.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEGsensorGeomagneticRawDateOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEGsensorGeomagneticRawDate_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEGsensorGeomagneticRawDateOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEGsensorGeomagneticRawDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGsensorGeomagneticRawDate.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasData();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGsensorGeomagneticRawDate build() {
                SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDateBuildPartial = buildPartial();
                if (sEGsensorGeomagneticRawDateBuildPartial.isInitialized()) {
                    return sEGsensorGeomagneticRawDateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEGsensorGeomagneticRawDateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGsensorGeomagneticRawDate buildPartial() {
                SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDate = new SEGsensorGeomagneticRawDate(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEGsensorGeomagneticRawDate);
                }
                onBuilt();
                return sEGsensorGeomagneticRawDate;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEGsensorGeomagneticRawDate getDefaultInstanceForType() {
                return SEGsensorGeomagneticRawDate.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEGsensorGeomagneticRawDate) {
                    return mergeFrom((SEGsensorGeomagneticRawDate) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDate) {
                if (sEGsensorGeomagneticRawDate == SEGsensorGeomagneticRawDate.getDefaultInstance()) {
                    return this;
                }
                if (sEGsensorGeomagneticRawDate.hasData()) {
                    setData(sEGsensorGeomagneticRawDate.getData());
                }
                mergeUnknownFields(sEGsensorGeomagneticRawDate.getUnknownFields());
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
                                    this.data_ = codedInputStream.readBytes();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGsensorGeomagneticRawDate");
            DEFAULT_INSTANCE = new SEGsensorGeomagneticRawDate();
            PARSER = new AbstractParser<SEGsensorGeomagneticRawDate>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEGsensorGeomagneticRawDate.1
                @Override // com.google.protobuf.Parser
                public SEGsensorGeomagneticRawDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEGsensorGeomagneticRawDate.newBuilder();
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

        public /* synthetic */ SEGsensorGeomagneticRawDate(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEGsensorGeomagneticRawDate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEGsensorGeomagneticRawDate_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEGsensorGeomagneticRawDate parseDelimitedFrom(InputStream inputStream) {
            return (SEGsensorGeomagneticRawDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEGsensorGeomagneticRawDate> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEGsensorGeomagneticRawDate)) {
                return super.equals(obj);
            }
            SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDate = (SEGsensorGeomagneticRawDate) obj;
            if (hasData() != sEGsensorGeomagneticRawDate.hasData()) {
                return false;
            }
            return (!hasData() || getData().equals(sEGsensorGeomagneticRawDate.getData())) && getUnknownFields().equals(sEGsensorGeomagneticRawDate.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEGsensorGeomagneticRawDateOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEGsensorGeomagneticRawDate_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEGsensorGeomagneticRawDate> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.data_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeBytesSize;
            return iComputeBytesSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEGsensorGeomagneticRawDateOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEGsensorGeomagneticRawDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGsensorGeomagneticRawDate.class, Builder.class);
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
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEGsensorGeomagneticRawDate(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEGsensorGeomagneticRawDate sEGsensorGeomagneticRawDate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEGsensorGeomagneticRawDate);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEGsensorGeomagneticRawDate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGsensorGeomagneticRawDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEGsensorGeomagneticRawDate getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEGsensorGeomagneticRawDate() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static SEGsensorGeomagneticRawDate parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(InputStream inputStream) {
            return (SEGsensorGeomagneticRawDate) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGsensorGeomagneticRawDate) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(CodedInputStream codedInputStream) {
            return (SEGsensorGeomagneticRawDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEGsensorGeomagneticRawDate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGsensorGeomagneticRawDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEGsensorGeomagneticRawDateOrBuilder extends MessageOrBuilder {
        ByteString getData();

        boolean hasData();
    }

    public enum SEGsensorGeomagneticSwitch implements ProtocolMessageEnum {
        GSENSOR_GEOMAGNETIC_START(0),
        GSENSOR_GEOMAGNETIC_STOP(1);

        public static final int GSENSOR_GEOMAGNETIC_START_VALUE = 0;
        public static final int GSENSOR_GEOMAGNETIC_STOP_VALUE = 1;
        private static final SEGsensorGeomagneticSwitch[] VALUES;
        private static final Internal.EnumLiteMap<SEGsensorGeomagneticSwitch> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEGsensorGeomagneticSwitch$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEGsensorGeomagneticSwitch> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEGsensorGeomagneticSwitch findValueByNumber(int i7) {
                return SEGsensorGeomagneticSwitch.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGsensorGeomagneticSwitch");
            internalValueMap = new Internal.EnumLiteMap<SEGsensorGeomagneticSwitch>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEGsensorGeomagneticSwitch.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEGsensorGeomagneticSwitch findValueByNumber(int i7) {
                    return SEGsensorGeomagneticSwitch.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEGsensorGeomagneticSwitch(int i7) {
            this.value = i7;
        }

        public static SEGsensorGeomagneticSwitch forNumber(int i7) {
            if (i7 == 0) {
                return GSENSOR_GEOMAGNETIC_START;
            }
            if (i7 != 1) {
                return null;
            }
            return GSENSOR_GEOMAGNETIC_STOP;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return FactoryProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SEGsensorGeomagneticSwitch> internalGetValueMap() {
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
        public static SEGsensorGeomagneticSwitch valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEGsensorGeomagneticSwitch valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEHeartRateLeakage extends GeneratedMessage implements SEHeartRateLeakageOrBuilder {
        public static final int AMBIENT_LIGHT_FIELD_NUMBER = 5;
        private static final SEHeartRateLeakage DEFAULT_INSTANCE;
        public static final int GREEN_LIGHT_FIELD_NUMBER = 2;
        public static final int INFRARED_FIELD_NUMBER = 3;
        public static final int LEAKAGE_TYPE_FIELD_NUMBER = 1;
        private static final Parser<SEHeartRateLeakage> PARSER;
        public static final int RED_LIGHT_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int ambientLight_;
        private int bitField0_;
        private int greenLight_;
        private int infrared_;
        private int leakageType_;
        private byte memoizedIsInitialized;
        private int redLight_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEHeartRateLeakage$1 */
        public class AnonymousClass1 extends AbstractParser<SEHeartRateLeakage> {
            @Override // com.google.protobuf.Parser
            public SEHeartRateLeakage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEHeartRateLeakage.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEHeartRateLeakageOrBuilder {
            private int ambientLight_;
            private int bitField0_;
            private int greenLight_;
            private int infrared_;
            private int leakageType_;
            private int redLight_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEHeartRateLeakage sEHeartRateLeakage) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEHeartRateLeakage.leakageType_ = this.leakageType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEHeartRateLeakage.greenLight_ = this.greenLight_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEHeartRateLeakage.infrared_ = this.infrared_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEHeartRateLeakage.redLight_ = this.redLight_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEHeartRateLeakage.ambientLight_ = this.ambientLight_;
                    i7 |= 16;
                }
                sEHeartRateLeakage.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEHeartRateLeakage_descriptor;
            }

            public Builder clearAmbientLight() {
                this.bitField0_ &= -17;
                this.ambientLight_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGreenLight() {
                this.bitField0_ &= -3;
                this.greenLight_ = 0;
                onChanged();
                return this;
            }

            public Builder clearInfrared() {
                this.bitField0_ &= -5;
                this.infrared_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLeakageType() {
                this.bitField0_ &= -2;
                this.leakageType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRedLight() {
                this.bitField0_ &= -9;
                this.redLight_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public int getAmbientLight() {
                return this.ambientLight_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEHeartRateLeakage_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public int getGreenLight() {
                return this.greenLight_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public int getInfrared() {
                return this.infrared_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public int getLeakageType() {
                return this.leakageType_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public int getRedLight() {
                return this.redLight_;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public boolean hasAmbientLight() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public boolean hasGreenLight() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public boolean hasInfrared() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public boolean hasLeakageType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
            public boolean hasRedLight() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEHeartRateLeakage_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHeartRateLeakage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLeakageType() && hasGreenLight() && hasInfrared() && hasRedLight() && hasAmbientLight();
            }

            public Builder setAmbientLight(int i7) {
                this.ambientLight_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setGreenLight(int i7) {
                this.greenLight_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setInfrared(int i7) {
                this.infrared_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLeakageType(int i7) {
                this.leakageType_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRedLight(int i7) {
                this.redLight_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHeartRateLeakage build() {
                SEHeartRateLeakage sEHeartRateLeakageBuildPartial = buildPartial();
                if (sEHeartRateLeakageBuildPartial.isInitialized()) {
                    return sEHeartRateLeakageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEHeartRateLeakageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHeartRateLeakage buildPartial() {
                SEHeartRateLeakage sEHeartRateLeakage = new SEHeartRateLeakage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEHeartRateLeakage);
                }
                onBuilt();
                return sEHeartRateLeakage;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEHeartRateLeakage getDefaultInstanceForType() {
                return SEHeartRateLeakage.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.leakageType_ = 0;
                this.greenLight_ = 0;
                this.infrared_ = 0;
                this.redLight_ = 0;
                this.ambientLight_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEHeartRateLeakage) {
                    return mergeFrom((SEHeartRateLeakage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEHeartRateLeakage sEHeartRateLeakage) {
                if (sEHeartRateLeakage == SEHeartRateLeakage.getDefaultInstance()) {
                    return this;
                }
                if (sEHeartRateLeakage.hasLeakageType()) {
                    setLeakageType(sEHeartRateLeakage.getLeakageType());
                }
                if (sEHeartRateLeakage.hasGreenLight()) {
                    setGreenLight(sEHeartRateLeakage.getGreenLight());
                }
                if (sEHeartRateLeakage.hasInfrared()) {
                    setInfrared(sEHeartRateLeakage.getInfrared());
                }
                if (sEHeartRateLeakage.hasRedLight()) {
                    setRedLight(sEHeartRateLeakage.getRedLight());
                }
                if (sEHeartRateLeakage.hasAmbientLight()) {
                    setAmbientLight(sEHeartRateLeakage.getAmbientLight());
                }
                mergeUnknownFields(sEHeartRateLeakage.getUnknownFields());
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
                                    this.leakageType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.greenLight_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.infrared_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.redLight_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.ambientLight_ = codedInputStream.readUInt32();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEHeartRateLeakage");
            DEFAULT_INSTANCE = new SEHeartRateLeakage();
            PARSER = new AbstractParser<SEHeartRateLeakage>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakage.1
                @Override // com.google.protobuf.Parser
                public SEHeartRateLeakage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEHeartRateLeakage.newBuilder();
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

        public /* synthetic */ SEHeartRateLeakage(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEHeartRateLeakage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEHeartRateLeakage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEHeartRateLeakage parseDelimitedFrom(InputStream inputStream) {
            return (SEHeartRateLeakage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEHeartRateLeakage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEHeartRateLeakage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEHeartRateLeakage)) {
                return super.equals(obj);
            }
            SEHeartRateLeakage sEHeartRateLeakage = (SEHeartRateLeakage) obj;
            if (hasLeakageType() != sEHeartRateLeakage.hasLeakageType()) {
                return false;
            }
            if ((hasLeakageType() && getLeakageType() != sEHeartRateLeakage.getLeakageType()) || hasGreenLight() != sEHeartRateLeakage.hasGreenLight()) {
                return false;
            }
            if ((hasGreenLight() && getGreenLight() != sEHeartRateLeakage.getGreenLight()) || hasInfrared() != sEHeartRateLeakage.hasInfrared()) {
                return false;
            }
            if ((hasInfrared() && getInfrared() != sEHeartRateLeakage.getInfrared()) || hasRedLight() != sEHeartRateLeakage.hasRedLight()) {
                return false;
            }
            if ((!hasRedLight() || getRedLight() == sEHeartRateLeakage.getRedLight()) && hasAmbientLight() == sEHeartRateLeakage.hasAmbientLight()) {
                return (!hasAmbientLight() || getAmbientLight() == sEHeartRateLeakage.getAmbientLight()) && getUnknownFields().equals(sEHeartRateLeakage.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public int getAmbientLight() {
            return this.ambientLight_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEHeartRateLeakage_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public int getGreenLight() {
            return this.greenLight_;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public int getInfrared() {
            return this.infrared_;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public int getLeakageType() {
            return this.leakageType_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEHeartRateLeakage> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public int getRedLight() {
            return this.redLight_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.leakageType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.greenLight_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.infrared_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.redLight_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.ambientLight_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public boolean hasAmbientLight() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public boolean hasGreenLight() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public boolean hasInfrared() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public boolean hasLeakageType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageOrBuilder
        public boolean hasRedLight() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasLeakageType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getLeakageType();
            }
            if (hasGreenLight()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getGreenLight();
            }
            if (hasInfrared()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getInfrared();
            }
            if (hasRedLight()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getRedLight();
            }
            if (hasAmbientLight()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAmbientLight();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEHeartRateLeakage_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHeartRateLeakage.class, Builder.class);
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
            if (!hasLeakageType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasGreenLight()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasInfrared()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasRedLight()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAmbientLight()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.leakageType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.greenLight_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.infrared_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.redLight_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.ambientLight_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEHeartRateLeakage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.leakageType_ = 0;
            this.greenLight_ = 0;
            this.infrared_ = 0;
            this.redLight_ = 0;
            this.ambientLight_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEHeartRateLeakage sEHeartRateLeakage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEHeartRateLeakage);
        }

        public static SEHeartRateLeakage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEHeartRateLeakage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHeartRateLeakage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHeartRateLeakage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEHeartRateLeakage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEHeartRateLeakage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEHeartRateLeakage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEHeartRateLeakage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEHeartRateLeakage parseFrom(InputStream inputStream) {
            return (SEHeartRateLeakage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEHeartRateLeakage() {
            this.leakageType_ = 0;
            this.greenLight_ = 0;
            this.infrared_ = 0;
            this.redLight_ = 0;
            this.ambientLight_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEHeartRateLeakage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHeartRateLeakage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHeartRateLeakage parseFrom(CodedInputStream codedInputStream) {
            return (SEHeartRateLeakage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEHeartRateLeakage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHeartRateLeakage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEHeartRateLeakageOrBuilder extends MessageOrBuilder {
        int getAmbientLight();

        int getGreenLight();

        int getInfrared();

        int getLeakageType();

        int getRedLight();

        boolean hasAmbientLight();

        boolean hasGreenLight();

        boolean hasInfrared();

        boolean hasLeakageType();

        boolean hasRedLight();
    }

    public static final class SEHeartRateLeakageRawDate extends GeneratedMessage implements SEHeartRateLeakageRawDateOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final SEHeartRateLeakageRawDate DEFAULT_INSTANCE;
        private static final Parser<SEHeartRateLeakageRawDate> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEHeartRateLeakageRawDate$1 */
        public class AnonymousClass1 extends AbstractParser<SEHeartRateLeakageRawDate> {
            @Override // com.google.protobuf.Parser
            public SEHeartRateLeakageRawDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEHeartRateLeakageRawDate.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEHeartRateLeakageRawDateOrBuilder {
            private int bitField0_;
            private ByteString data_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SEHeartRateLeakageRawDate sEHeartRateLeakageRawDate) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sEHeartRateLeakageRawDate.data_ = this.data_;
                } else {
                    i7 = 0;
                }
                sEHeartRateLeakageRawDate.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SEHeartRateLeakageRawDate_descriptor;
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = SEHeartRateLeakageRawDate.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageRawDateOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SEHeartRateLeakageRawDate_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageRawDateOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SEHeartRateLeakageRawDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHeartRateLeakageRawDate.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasData();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHeartRateLeakageRawDate build() {
                SEHeartRateLeakageRawDate sEHeartRateLeakageRawDateBuildPartial = buildPartial();
                if (sEHeartRateLeakageRawDateBuildPartial.isInitialized()) {
                    return sEHeartRateLeakageRawDateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEHeartRateLeakageRawDateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHeartRateLeakageRawDate buildPartial() {
                SEHeartRateLeakageRawDate sEHeartRateLeakageRawDate = new SEHeartRateLeakageRawDate(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEHeartRateLeakageRawDate);
                }
                onBuilt();
                return sEHeartRateLeakageRawDate;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEHeartRateLeakageRawDate getDefaultInstanceForType() {
                return SEHeartRateLeakageRawDate.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEHeartRateLeakageRawDate) {
                    return mergeFrom((SEHeartRateLeakageRawDate) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEHeartRateLeakageRawDate sEHeartRateLeakageRawDate) {
                if (sEHeartRateLeakageRawDate == SEHeartRateLeakageRawDate.getDefaultInstance()) {
                    return this;
                }
                if (sEHeartRateLeakageRawDate.hasData()) {
                    setData(sEHeartRateLeakageRawDate.getData());
                }
                mergeUnknownFields(sEHeartRateLeakageRawDate.getUnknownFields());
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
                                    this.data_ = codedInputStream.readBytes();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEHeartRateLeakageRawDate");
            DEFAULT_INSTANCE = new SEHeartRateLeakageRawDate();
            PARSER = new AbstractParser<SEHeartRateLeakageRawDate>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageRawDate.1
                @Override // com.google.protobuf.Parser
                public SEHeartRateLeakageRawDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEHeartRateLeakageRawDate.newBuilder();
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

        public /* synthetic */ SEHeartRateLeakageRawDate(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SEHeartRateLeakageRawDate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SEHeartRateLeakageRawDate_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEHeartRateLeakageRawDate parseDelimitedFrom(InputStream inputStream) {
            return (SEHeartRateLeakageRawDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEHeartRateLeakageRawDate parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEHeartRateLeakageRawDate> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEHeartRateLeakageRawDate)) {
                return super.equals(obj);
            }
            SEHeartRateLeakageRawDate sEHeartRateLeakageRawDate = (SEHeartRateLeakageRawDate) obj;
            if (hasData() != sEHeartRateLeakageRawDate.hasData()) {
                return false;
            }
            return (!hasData() || getData().equals(sEHeartRateLeakageRawDate.getData())) && getUnknownFields().equals(sEHeartRateLeakageRawDate.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageRawDateOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SEHeartRateLeakageRawDate_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEHeartRateLeakageRawDate> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.data_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeBytesSize;
            return iComputeBytesSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateLeakageRawDateOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SEHeartRateLeakageRawDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHeartRateLeakageRawDate.class, Builder.class);
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
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEHeartRateLeakageRawDate(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEHeartRateLeakageRawDate sEHeartRateLeakageRawDate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEHeartRateLeakageRawDate);
        }

        public static SEHeartRateLeakageRawDate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEHeartRateLeakageRawDate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHeartRateLeakageRawDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHeartRateLeakageRawDate parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEHeartRateLeakageRawDate getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEHeartRateLeakageRawDate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEHeartRateLeakageRawDate() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static SEHeartRateLeakageRawDate parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEHeartRateLeakageRawDate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEHeartRateLeakageRawDate parseFrom(InputStream inputStream) {
            return (SEHeartRateLeakageRawDate) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEHeartRateLeakageRawDate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHeartRateLeakageRawDate) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHeartRateLeakageRawDate parseFrom(CodedInputStream codedInputStream) {
            return (SEHeartRateLeakageRawDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEHeartRateLeakageRawDate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHeartRateLeakageRawDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEHeartRateLeakageRawDateOrBuilder extends MessageOrBuilder {
        ByteString getData();

        boolean hasData();
    }

    public enum SEHeartRateSwitch implements ProtocolMessageEnum {
        HEART_RATE_START(0),
        HEART_RATE_STOP(1);

        public static final int HEART_RATE_START_VALUE = 0;
        public static final int HEART_RATE_STOP_VALUE = 1;
        private static final SEHeartRateSwitch[] VALUES;
        private static final Internal.EnumLiteMap<SEHeartRateSwitch> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SEHeartRateSwitch$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEHeartRateSwitch> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEHeartRateSwitch findValueByNumber(int i7) {
                return SEHeartRateSwitch.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEHeartRateSwitch");
            internalValueMap = new Internal.EnumLiteMap<SEHeartRateSwitch>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SEHeartRateSwitch.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEHeartRateSwitch findValueByNumber(int i7) {
                    return SEHeartRateSwitch.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEHeartRateSwitch(int i7) {
            this.value = i7;
        }

        public static SEHeartRateSwitch forNumber(int i7) {
            if (i7 == 0) {
                return HEART_RATE_START;
            }
            if (i7 != 1) {
                return null;
            }
            return HEART_RATE_STOP;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return FactoryProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEHeartRateSwitch> internalGetValueMap() {
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
        public static SEHeartRateSwitch valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEHeartRateSwitch valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SELogRespond implements ProtocolMessageEnum {
        START_LOG_UPDATE(0),
        STOP_LOG_UPDATE(1),
        NO_LOG(2);

        public static final int NO_LOG_VALUE = 2;
        public static final int START_LOG_UPDATE_VALUE = 0;
        public static final int STOP_LOG_UPDATE_VALUE = 1;
        private static final SELogRespond[] VALUES;
        private static final Internal.EnumLiteMap<SELogRespond> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SELogRespond$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SELogRespond> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SELogRespond findValueByNumber(int i7) {
                return SELogRespond.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SELogRespond");
            internalValueMap = new Internal.EnumLiteMap<SELogRespond>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SELogRespond.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SELogRespond findValueByNumber(int i7) {
                    return SELogRespond.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SELogRespond(int i7) {
            this.value = i7;
        }

        public static SELogRespond forNumber(int i7) {
            if (i7 == 0) {
                return START_LOG_UPDATE;
            }
            if (i7 == 1) {
                return STOP_LOG_UPDATE;
            }
            if (i7 != 2) {
                return null;
            }
            return NO_LOG;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return FactoryProtos.getDescriptor().getEnumType(3);
        }

        public static Internal.EnumLiteMap<SELogRespond> internalGetValueMap() {
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
        public static SELogRespond valueOf(int i7) {
            return forNumber(i7);
        }

        public static SELogRespond valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SETriaxialRawDate extends GeneratedMessage implements SETriaxialRawDateOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final SETriaxialRawDate DEFAULT_INSTANCE;
        private static final Parser<SETriaxialRawDate> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SETriaxialRawDate$1 */
        public class AnonymousClass1 extends AbstractParser<SETriaxialRawDate> {
            @Override // com.google.protobuf.Parser
            public SETriaxialRawDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SETriaxialRawDate.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SETriaxialRawDateOrBuilder {
            private int bitField0_;
            private ByteString data_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, e eVar) {
                this(builderParent);
            }

            private void buildPartial0(SETriaxialRawDate sETriaxialRawDate) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sETriaxialRawDate.data_ = this.data_;
                } else {
                    i7 = 0;
                }
                sETriaxialRawDate.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FactoryProtos.internal_static_SETriaxialRawDate_descriptor;
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = SETriaxialRawDate.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SETriaxialRawDateOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FactoryProtos.internal_static_SETriaxialRawDate_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.FactoryProtos.SETriaxialRawDateOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FactoryProtos.internal_static_SETriaxialRawDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SETriaxialRawDate.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasData();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(e eVar) {
                this();
            }

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETriaxialRawDate build() {
                SETriaxialRawDate sETriaxialRawDateBuildPartial = buildPartial();
                if (sETriaxialRawDateBuildPartial.isInitialized()) {
                    return sETriaxialRawDateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sETriaxialRawDateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SETriaxialRawDate buildPartial() {
                SETriaxialRawDate sETriaxialRawDate = new SETriaxialRawDate(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sETriaxialRawDate);
                }
                onBuilt();
                return sETriaxialRawDate;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SETriaxialRawDate getDefaultInstanceForType() {
                return SETriaxialRawDate.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SETriaxialRawDate) {
                    return mergeFrom((SETriaxialRawDate) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SETriaxialRawDate sETriaxialRawDate) {
                if (sETriaxialRawDate == SETriaxialRawDate.getDefaultInstance()) {
                    return this;
                }
                if (sETriaxialRawDate.hasData()) {
                    setData(sETriaxialRawDate.getData());
                }
                mergeUnknownFields(sETriaxialRawDate.getUnknownFields());
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
                                    this.data_ = codedInputStream.readBytes();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETriaxialRawDate");
            DEFAULT_INSTANCE = new SETriaxialRawDate();
            PARSER = new AbstractParser<SETriaxialRawDate>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SETriaxialRawDate.1
                @Override // com.google.protobuf.Parser
                public SETriaxialRawDate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SETriaxialRawDate.newBuilder();
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

        public /* synthetic */ SETriaxialRawDate(GeneratedMessage.Builder builder, e eVar) {
            this(builder);
        }

        public static SETriaxialRawDate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FactoryProtos.internal_static_SETriaxialRawDate_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SETriaxialRawDate parseDelimitedFrom(InputStream inputStream) {
            return (SETriaxialRawDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SETriaxialRawDate parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SETriaxialRawDate> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SETriaxialRawDate)) {
                return super.equals(obj);
            }
            SETriaxialRawDate sETriaxialRawDate = (SETriaxialRawDate) obj;
            if (hasData() != sETriaxialRawDate.hasData()) {
                return false;
            }
            return (!hasData() || getData().equals(sETriaxialRawDate.getData())) && getUnknownFields().equals(sETriaxialRawDate.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SETriaxialRawDateOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FactoryProtos.internal_static_SETriaxialRawDate_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SETriaxialRawDate> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.data_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeBytesSize;
            return iComputeBytesSize;
        }

        @Override // com.zh.ble.wear.protobuf.FactoryProtos.SETriaxialRawDateOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FactoryProtos.internal_static_SETriaxialRawDate_fieldAccessorTable.ensureFieldAccessorsInitialized(SETriaxialRawDate.class, Builder.class);
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
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SETriaxialRawDate(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SETriaxialRawDate sETriaxialRawDate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sETriaxialRawDate);
        }

        public static SETriaxialRawDate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SETriaxialRawDate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETriaxialRawDate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SETriaxialRawDate parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SETriaxialRawDate getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SETriaxialRawDate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SETriaxialRawDate() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static SETriaxialRawDate parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SETriaxialRawDate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SETriaxialRawDate parseFrom(InputStream inputStream) {
            return (SETriaxialRawDate) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SETriaxialRawDate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETriaxialRawDate) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SETriaxialRawDate parseFrom(CodedInputStream codedInputStream) {
            return (SETriaxialRawDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SETriaxialRawDate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SETriaxialRawDate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SETriaxialRawDateOrBuilder extends MessageOrBuilder {
        ByteString getData();

        boolean hasData();
    }

    public enum SETriaxialSwitch implements ProtocolMessageEnum {
        TRIAXIAL_START(0),
        TRIAXIAL_STOP(1);

        public static final int TRIAXIAL_START_VALUE = 0;
        public static final int TRIAXIAL_STOP_VALUE = 1;
        private static final SETriaxialSwitch[] VALUES;
        private static final Internal.EnumLiteMap<SETriaxialSwitch> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.FactoryProtos$SETriaxialSwitch$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SETriaxialSwitch> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SETriaxialSwitch findValueByNumber(int i7) {
                return SETriaxialSwitch.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETriaxialSwitch");
            internalValueMap = new Internal.EnumLiteMap<SETriaxialSwitch>() { // from class: com.zh.ble.wear.protobuf.FactoryProtos.SETriaxialSwitch.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SETriaxialSwitch findValueByNumber(int i7) {
                    return SETriaxialSwitch.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SETriaxialSwitch(int i7) {
            this.value = i7;
        }

        public static SETriaxialSwitch forNumber(int i7) {
            if (i7 == 0) {
                return TRIAXIAL_START;
            }
            if (i7 != 1) {
                return null;
            }
            return TRIAXIAL_STOP;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return FactoryProtos.getDescriptor().getEnumType(2);
        }

        public static Internal.EnumLiteMap<SETriaxialSwitch> internalGetValueMap() {
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
        public static SETriaxialSwitch valueOf(int i7) {
            return forNumber(i7);
        }

        public static SETriaxialSwitch valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "FactoryProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rFactory.proto\u001a\fnanopb.proto\u001a\fCommon.proto\"¢\u0005\n\tSEFactory\u0012\u001b\n\u0004file\u0018\u0001 \u0001(\u000b2\u000b.SEFileInfoH\u0000\u0012/\n\u0011heart_rate_switch\u0018\u0002 \u0001(\u000e2\u0012.SEHeartRateSwitchH\u0000\u00121\n\u0012heart_rate_leakage\u0018\u0003 \u0001(\u000b2\u0013.SEHeartRateLeakageH\u0000\u0012A\n\u001bheart_rate_leakage_raw_date\u0018\u0004 \u0001(\u000b2\u001a.SEHeartRateLeakageRawDateH\u0000\u0012$\n\u000blog_respond\u0018\u0005 \u0001(\u000e2\r.SELogRespondH\u0000\u00129\n\u0016bluetooth_name_setting\u0018\u0006 \u0001(\u000b2\u0017.SEBluetoothNameSettingH\u0000\u0012A\n\u001agsensor_geomagnetic_switch\u0018\u0007 \u0001(\u000e2\u001b.SEGsensorGeomagneticSwitchH\u0000\u0012D\n\u001cgsensor_geomagnetic_raw_date\u0018\b \u0001(\u000b2\u001c.SEGsensorGeomagneticRawDateH\u0000\u0012,\n\u000ftriaxial_switch\u0018\t \u0001(\u000e2\u0011.SETriaxialSwitchH\u0000\u0012/\n\u0011triaxial_raw_date\u0018\n \u0001(\u000b2\u0012.SETriaxialRawDateH\u0000\u0012%\n\u000bburied_file\u0018\u000b \u0001(\u000b2\u000e.SEBuriedFilesH\u0000\u0012,\n\u000fdevelope_switch\u0018\f \u0001(\u000b2\u0011.SEDevelopeSwitchH\u0000\u0012(\n\rdevelope_mode\u0018\r \u0001(\u000b2\u000f.SEDevelopeModeH\u0000B\t\n\u0007payload\"V\n\nSEFileInfo\u0012\u0018\n\tfile_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004data\u0018\u0002 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nfile_state\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\"\u009e\u0001\n\u0012SEHeartRateLeakage\u0012\u001b\n\fleakage_type\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001a\n\u000bgreen_light\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028 \u0012\u0017\n\binfrared\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028 \u0012\u0018\n\tred_light\u0018\u0004 \u0002(\rB\u0005\u0092?\u00028 \u0012\u001c\n\rambient_light\u0018\u0005 \u0002(\rB\u0005\u0092?\u00028 \"0\n\u0019SEHeartRateLeakageRawDate\u0012\u0013\n\u0004data\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"2\n\u001bSEGsensorGeomagneticRawDate\u0012\u0013\n\u0004data\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"(\n\u0011SETriaxialRawDate\u0012\u0013\n\u0004data\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"ã\u0002\n\u0016SEBluetoothNameSetting\u0012\u001d\n\u000ebluetooth_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012!\n\u0012bluetooth_name_crc\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028 \u0012J\n\u0014setting_request_type\u0018\u0003 \u0001(\u000e2,.SEBluetoothNameSetting.SESeetingRequestType\"º\u0001\n\u0014SESeetingRequestType\u0012\u0013\n\u000fSEETING_SUCCESS\u0010\u0000\u0012\u0010\n\fSEETING_FAIL\u0010\u0001\u0012\u0015\n\u0011SEETING_CRC_ERROR\u0010\u0002\u0012\u0019\n\u0015SEETING_NAME_TOO_LONG\u0010\u0003\u0012)\n%SEETING_NAME_CHARACTER_NON_COMPLIANCE\u0010\u0004\u0012\u001e\n\u001aSEETING_NAME_NO_PERMISSION\u0010\u0005\"J\n\rSEBuriedFiles\u0012\u0018\n\tfile_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010buried_files_ids\u0018\u0002 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"C\n\u0010SEDevelopeSwitch\u0012\u001a\n\u000bswitchstate\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0013\n\u0004mode\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\"W\n\u000eSEDevelopeMode\u0012\u0014\n\u0005index\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0013\n\u0004data\u0018\u0002 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bsend_status\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b*>\n\u0011SEHeartRateSwitch\u0012\u0014\n\u0010HEART_RATE_START\u0010\u0000\u0012\u0013\n\u000fHEART_RATE_STOP\u0010\u0001*Y\n\u001aSEGsensorGeomagneticSwitch\u0012\u001d\n\u0019GSENSOR_GEOMAGNETIC_START\u0010\u0000\u0012\u001c\n\u0018GSENSOR_GEOMAGNETIC_STOP\u0010\u0001*9\n\u0010SETriaxialSwitch\u0012\u0012\n\u000eTRIAXIAL_START\u0010\u0000\u0012\u0011\n\rTRIAXIAL_STOP\u0010\u0001*E\n\fSELogRespond\u0012\u0014\n\u0010START_LOG_UPDATE\u0010\u0000\u0012\u0013\n\u000fSTOP_LOG_UPDATE\u0010\u0001\u0012\n\n\u0006NO_LOG\u0010\u0002B)\n\u0018com.zh.ble.wear.protobufB\rFactoryProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SEFactory_descriptor = messageType;
        internal_static_SEFactory_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"File", "HeartRateSwitch", "HeartRateLeakage", "HeartRateLeakageRawDate", "LogRespond", "BluetoothNameSetting", "GsensorGeomagneticSwitch", "GsensorGeomagneticRawDate", "TriaxialSwitch", "TriaxialRawDate", "BuriedFile", "DevelopeSwitch", "DevelopeMode", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SEFileInfo_descriptor = messageType2;
        internal_static_SEFileInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"FileName", "Data", "FileState"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEHeartRateLeakage_descriptor = messageType3;
        internal_static_SEHeartRateLeakage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"LeakageType", "GreenLight", "Infrared", "RedLight", "AmbientLight"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SEHeartRateLeakageRawDate_descriptor = messageType4;
        internal_static_SEHeartRateLeakageRawDate_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"Data"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SEGsensorGeomagneticRawDate_descriptor = messageType5;
        internal_static_SEGsensorGeomagneticRawDate_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Data"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SETriaxialRawDate_descriptor = messageType6;
        internal_static_SETriaxialRawDate_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Data"});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SEBluetoothNameSetting_descriptor = messageType7;
        internal_static_SEBluetoothNameSetting_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"BluetoothName", "BluetoothNameCrc", "SettingRequestType"});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SEBuriedFiles_descriptor = messageType8;
        internal_static_SEBuriedFiles_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"FileName", "BuriedFilesIds"});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SEDevelopeSwitch_descriptor = messageType9;
        internal_static_SEDevelopeSwitch_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{"Switchstate", "Mode"});
        Descriptors.Descriptor messageType10 = getDescriptor().getMessageType(9);
        internal_static_SEDevelopeMode_descriptor = messageType10;
        internal_static_SEDevelopeMode_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType10, new String[]{"Index", "Data", "SendStatus"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private FactoryProtos() {
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