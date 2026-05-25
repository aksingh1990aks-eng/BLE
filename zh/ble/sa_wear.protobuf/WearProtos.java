package com.zh.ble.sa_wear.protobuf;

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
import com.topstep.wearkit.base.utils.media.MusicController;
import com.zh.ble.sa_wear.protobuf.AIFunctionProtos;
import com.zh.ble.sa_wear.protobuf.AlexaProtos;
import com.zh.ble.sa_wear.protobuf.BindAccountProtos;
import com.zh.ble.sa_wear.protobuf.ChildrenProtos;
import com.zh.ble.sa_wear.protobuf.CommonProtos;
import com.zh.ble.sa_wear.protobuf.DeviceProtos;
import com.zh.ble.sa_wear.protobuf.FactoryProtos;
import com.zh.ble.sa_wear.protobuf.FitnessProtos;
import com.zh.ble.sa_wear.protobuf.MicroFunctionProtos;
import com.zh.ble.sa_wear.protobuf.MusicProtos;
import com.zh.ble.sa_wear.protobuf.NotificationProtos;
import com.zh.ble.sa_wear.protobuf.SA_WatchFaceProtos;
import com.zh.ble.sa_wear.protobuf.SA_WeatherProtos;
import com.zh.ble.sa_wear.protobuf.SettingMenuProtos;
import com.zh.ble.sa_wear.protobuf.SportingProtos;
import com.zh.ble.sa_wear.protobuf.SystemTimeProtos;
import com.zh.ble.sa_wear.protobuf.UserProfilesProtos;
import com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class WearProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEWear_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEWear_fieldAccessorTable;

    public static final class SEWear extends GeneratedMessage implements SEWearOrBuilder {
        public static final int AI_FUNCTION_FIELD_NUMBER = 20;
        public static final int ALEAX_FIELD_NUMBER = 16;
        public static final int BIND_ACCOUNT_FIELD_NUMBER = 4;
        public static final int BLE_CONNECT_PARMETER_CONFIG_FIELD_NUMBER = 99;
        public static final int CHANGE_MTU_FIELD_NUMBER = 3;
        public static final int CHILDREN_FIELD_NUMBER = 19;
        private static final SEWear DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 5;
        public static final int ERROR_CODE_FIELD_NUMBER = 100;
        public static final int FACTORY_FIELD_NUMBER = 15;
        public static final int FITNESS_FIELD_NUMBER = 9;
        public static final int GNSS_FIELD_NUMBER = 10;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int MICRO_FUNCTION_FIELD_NUMBER = 11;
        public static final int MUSIC_FIELD_NUMBER = 13;
        public static final int NEW_WATCHFACE_FIELD_NUMBER = 17;
        public static final int NEW_WEATHER_FIELD_NUMBER = 18;
        public static final int NOTIFICATION_FIELD_NUMBER = 12;
        private static final Parser<SEWear> PARSER;
        public static final int SETTING_MENU_FIELD_NUMBER = 14;
        public static final int SPORTING_FIELD_NUMBER = 8;
        public static final int SYSTEM_TIME_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int USER_SETTINGS_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private int type_;

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            CHANGE_MTU(3),
            BIND_ACCOUNT(4),
            DEVICE(5),
            SYSTEM_TIME(6),
            USER_SETTINGS(7),
            SPORTING(8),
            FITNESS(9),
            GNSS(10),
            MICRO_FUNCTION(11),
            NOTIFICATION(12),
            MUSIC(13),
            SETTING_MENU(14),
            FACTORY(15),
            ALEAX(16),
            NEW_WATCHFACE(17),
            NEW_WEATHER(18),
            CHILDREN(19),
            AI_FUNCTION(20),
            BLE_CONNECT_PARMETER_CONFIG(99),
            ERROR_CODE(100),
            PAYLOAD_NOT_SET(0);

            private final int value;

            PayloadCase(int i7) {
                this.value = i7;
            }

            public static PayloadCase forNumber(int i7) {
                if (i7 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i7 == 99) {
                    return BLE_CONNECT_PARMETER_CONFIG;
                }
                if (i7 == 100) {
                    return ERROR_CODE;
                }
                switch (i7) {
                    case 3:
                        return CHANGE_MTU;
                    case 4:
                        return BIND_ACCOUNT;
                    case 5:
                        return DEVICE;
                    case 6:
                        return SYSTEM_TIME;
                    case 7:
                        return USER_SETTINGS;
                    case 8:
                        return SPORTING;
                    case 9:
                        return FITNESS;
                    case 10:
                        return GNSS;
                    case 11:
                        return MICRO_FUNCTION;
                    case 12:
                        return NOTIFICATION;
                    case 13:
                        return MUSIC;
                    case 14:
                        return SETTING_MENU;
                    case 15:
                        return FACTORY;
                    case 16:
                        return ALEAX;
                    case 17:
                        return NEW_WATCHFACE;
                    case 18:
                        return NEW_WEATHER;
                    case 19:
                        return CHILDREN;
                    case 20:
                        return AI_FUNCTION;
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

        public enum Type implements ProtocolMessageEnum {
            OTHER(0),
            ACCOUNT(1),
            DEVICE(2),
            SYSTEM_TIME(3),
            USER_SETTINGS(4),
            SPORTING(5),
            FITNESS(6),
            GNSS(7),
            MICRO_FUNCTION(8),
            NOTIFICATION(9),
            MUSIC(10),
            SETTING_MENU(11),
            FACTORY(12),
            ALEAX(13),
            NEW_WATCH_FACE(14),
            NEW_WEATHER(15),
            CHILDREN(16),
            AIFUNCTION(17);

            public static final int ACCOUNT_VALUE = 1;
            public static final int AIFUNCTION_VALUE = 17;
            public static final int ALEAX_VALUE = 13;
            public static final int CHILDREN_VALUE = 16;
            public static final int DEVICE_VALUE = 2;
            public static final int FACTORY_VALUE = 12;
            public static final int FITNESS_VALUE = 6;
            public static final int GNSS_VALUE = 7;
            public static final int MICRO_FUNCTION_VALUE = 8;
            public static final int MUSIC_VALUE = 10;
            public static final int NEW_WATCH_FACE_VALUE = 14;
            public static final int NEW_WEATHER_VALUE = 15;
            public static final int NOTIFICATION_VALUE = 9;
            public static final int OTHER_VALUE = 0;
            public static final int SETTING_MENU_VALUE = 11;
            public static final int SPORTING_VALUE = 5;
            public static final int SYSTEM_TIME_VALUE = 3;
            public static final int USER_SETTINGS_VALUE = 4;
            private static final Type[] VALUES;
            private static final Internal.EnumLiteMap<Type> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Type");
                internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.zh.ble.sa_wear.protobuf.WearProtos.SEWear.Type.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Type findValueByNumber(int i7) {
                        return Type.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            Type(int i7) {
                this.value = i7;
            }

            public static Type forNumber(int i7) {
                switch (i7) {
                    case 0:
                        return OTHER;
                    case 1:
                        return ACCOUNT;
                    case 2:
                        return DEVICE;
                    case 3:
                        return SYSTEM_TIME;
                    case 4:
                        return USER_SETTINGS;
                    case 5:
                        return SPORTING;
                    case 6:
                        return FITNESS;
                    case 7:
                        return GNSS;
                    case 8:
                        return MICRO_FUNCTION;
                    case 9:
                        return NOTIFICATION;
                    case 10:
                        return MUSIC;
                    case 11:
                        return SETTING_MENU;
                    case 12:
                        return FACTORY;
                    case 13:
                        return ALEAX;
                    case 14:
                        return NEW_WATCH_FACE;
                    case 15:
                        return NEW_WEATHER;
                    case 16:
                        return CHILDREN;
                    case 17:
                        return AIFUNCTION;
                    default:
                        return null;
                }
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEWear.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
            public static Type valueOf(int i7) {
                return forNumber(i7);
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWear");
            DEFAULT_INSTANCE = new SEWear();
            PARSER = new AbstractParser<SEWear>() { // from class: com.zh.ble.sa_wear.protobuf.WearProtos.SEWear.1
                @Override // com.google.protobuf.Parser
                public SEWear parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWear.newBuilder();
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

        public static SEWear getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WearProtos.internal_static_SA_SEWear_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWear parseDelimitedFrom(InputStream inputStream) {
            return (SEWear) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWear parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWear> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWear)) {
                return super.equals(obj);
            }
            SEWear sEWear = (SEWear) obj;
            if (hasType() != sEWear.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != sEWear.type_) || hasId() != sEWear.hasId()) {
                return false;
            }
            if ((hasId() && getId() != sEWear.getId()) || !getPayloadCase().equals(sEWear.getPayloadCase())) {
                return false;
            }
            int i7 = this.payloadCase_;
            if (i7 != 99) {
                if (i7 != 100) {
                    switch (i7) {
                        case 3:
                            if (getChangeMtu() != sEWear.getChangeMtu()) {
                                return false;
                            }
                            break;
                        case 4:
                            if (!getBindAccount().equals(sEWear.getBindAccount())) {
                                return false;
                            }
                            break;
                        case 5:
                            if (!getDevice().equals(sEWear.getDevice())) {
                                return false;
                            }
                            break;
                        case 6:
                            if (!getSystemTime().equals(sEWear.getSystemTime())) {
                                return false;
                            }
                            break;
                        case 7:
                            if (!getUserSettings().equals(sEWear.getUserSettings())) {
                                return false;
                            }
                            break;
                        case 8:
                            if (!getSporting().equals(sEWear.getSporting())) {
                                return false;
                            }
                            break;
                        case 9:
                            if (!getFitness().equals(sEWear.getFitness())) {
                                return false;
                            }
                            break;
                        case 10:
                            if (!getGnss().equals(sEWear.getGnss())) {
                                return false;
                            }
                            break;
                        case 11:
                            if (!getMicroFunction().equals(sEWear.getMicroFunction())) {
                                return false;
                            }
                            break;
                        case 12:
                            if (!getNotification().equals(sEWear.getNotification())) {
                                return false;
                            }
                            break;
                        case 13:
                            if (!getMusic().equals(sEWear.getMusic())) {
                                return false;
                            }
                            break;
                        case 14:
                            if (!getSettingMenu().equals(sEWear.getSettingMenu())) {
                                return false;
                            }
                            break;
                        case 15:
                            if (!getFactory().equals(sEWear.getFactory())) {
                                return false;
                            }
                            break;
                        case 16:
                            if (!getAleax().equals(sEWear.getAleax())) {
                                return false;
                            }
                            break;
                        case 17:
                            if (!getNewWatchFace().equals(sEWear.getNewWatchFace())) {
                                return false;
                            }
                            break;
                        case 18:
                            if (!getNewWeather().equals(sEWear.getNewWeather())) {
                                return false;
                            }
                            break;
                        case 19:
                            if (!getChildren().equals(sEWear.getChildren())) {
                                return false;
                            }
                            break;
                        case 20:
                            if (!getAiFunction().equals(sEWear.getAiFunction())) {
                                return false;
                            }
                            break;
                    }
                } else if (!getErrorCode().equals(sEWear.getErrorCode())) {
                    return false;
                }
            } else if (!getBleConnectParmeterConfig().equals(sEWear.getBleConnectParmeterConfig())) {
                return false;
            }
            return getUnknownFields().equals(sEWear.getUnknownFields());
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public AIFunctionProtos.SEAIFunction getAiFunction() {
            return this.payloadCase_ == 20 ? (AIFunctionProtos.SEAIFunction) this.payload_ : AIFunctionProtos.SEAIFunction.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public AIFunctionProtos.SEAIFunctionOrBuilder getAiFunctionOrBuilder() {
            return this.payloadCase_ == 20 ? (AIFunctionProtos.SEAIFunction) this.payload_ : AIFunctionProtos.SEAIFunction.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public AlexaProtos.SEAleax getAleax() {
            return this.payloadCase_ == 16 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public AlexaProtos.SEAleaxOrBuilder getAleaxOrBuilder() {
            return this.payloadCase_ == 16 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public BindAccountProtos.SEBindAccount getBindAccount() {
            return this.payloadCase_ == 4 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public BindAccountProtos.SEBindAccountOrBuilder getBindAccountOrBuilder() {
            return this.payloadCase_ == 4 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public CommonProtos.SEBLEConnectParameterConfig getBleConnectParmeterConfig() {
            return this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public CommonProtos.SEBLEConnectParameterConfigOrBuilder getBleConnectParmeterConfigOrBuilder() {
            return this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public int getChangeMtu() {
            if (this.payloadCase_ == 3) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public ChildrenProtos.SEChildren getChildren() {
            return this.payloadCase_ == 19 ? (ChildrenProtos.SEChildren) this.payload_ : ChildrenProtos.SEChildren.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public ChildrenProtos.SEChildrenOrBuilder getChildrenOrBuilder() {
            return this.payloadCase_ == 19 ? (ChildrenProtos.SEChildren) this.payload_ : ChildrenProtos.SEChildren.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WearProtos.internal_static_SA_SEWear_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public DeviceProtos.SEDevice getDevice() {
            return this.payloadCase_ == 5 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public DeviceProtos.SEDeviceOrBuilder getDeviceOrBuilder() {
            return this.payloadCase_ == 5 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public CommonProtos.SEErrorCode getErrorCode() {
            CommonProtos.SEErrorCode sEErrorCodeForNumber;
            return (this.payloadCase_ != 100 || (sEErrorCodeForNumber = CommonProtos.SEErrorCode.forNumber(((Integer) this.payload_).intValue())) == null) ? CommonProtos.SEErrorCode.NO_ERROR : sEErrorCodeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public FactoryProtos.SEFactory getFactory() {
            return this.payloadCase_ == 15 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public FactoryProtos.SEFactoryOrBuilder getFactoryOrBuilder() {
            return this.payloadCase_ == 15 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public FitnessProtos.SEFitness getFitness() {
            return this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public FitnessProtos.SEFitnessOrBuilder getFitnessOrBuilder() {
            return this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SA_GnssProtos.SEGnss getGnss() {
            return this.payloadCase_ == 10 ? (SA_GnssProtos.SEGnss) this.payload_ : SA_GnssProtos.SEGnss.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SA_GnssProtos.SEGnssOrBuilder getGnssOrBuilder() {
            return this.payloadCase_ == 10 ? (SA_GnssProtos.SEGnss) this.payload_ : SA_GnssProtos.SEGnss.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public MicroFunctionProtos.SEMicroFunction getMicroFunction() {
            return this.payloadCase_ == 11 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public MicroFunctionProtos.SEMicroFunctionOrBuilder getMicroFunctionOrBuilder() {
            return this.payloadCase_ == 11 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public MusicProtos.SEMusic getMusic() {
            return this.payloadCase_ == 13 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public MusicProtos.SEMusicOrBuilder getMusicOrBuilder() {
            return this.payloadCase_ == 13 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SA_WatchFaceProtos.SAWatchFace getNewWatchFace() {
            return this.payloadCase_ == 17 ? (SA_WatchFaceProtos.SAWatchFace) this.payload_ : SA_WatchFaceProtos.SAWatchFace.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SA_WatchFaceProtos.SAWatchFaceOrBuilder getNewWatchFaceOrBuilder() {
            return this.payloadCase_ == 17 ? (SA_WatchFaceProtos.SAWatchFace) this.payload_ : SA_WatchFaceProtos.SAWatchFace.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SA_WeatherProtos.SAweather getNewWeather() {
            return this.payloadCase_ == 18 ? (SA_WeatherProtos.SAweather) this.payload_ : SA_WeatherProtos.SAweather.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SA_WeatherProtos.SAweatherOrBuilder getNewWeatherOrBuilder() {
            return this.payloadCase_ == 18 ? (SA_WeatherProtos.SAweather) this.payload_ : SA_WeatherProtos.SAweather.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public NotificationProtos.SENotification getNotification() {
            return this.payloadCase_ == 12 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public NotificationProtos.SENotificationOrBuilder getNotificationOrBuilder() {
            return this.payloadCase_ == 12 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWear> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.id_);
            }
            if (this.payloadCase_ == 3) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, (BindAccountProtos.SEBindAccount) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, (DeviceProtos.SEDevice) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(6, (SystemTimeProtos.SESystemTime) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(7, (UserProfilesProtos.SEUserSettings) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(8, (SportingProtos.SESporting) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(9, (FitnessProtos.SEFitness) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(10, (SA_GnssProtos.SEGnss) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(11, (MicroFunctionProtos.SEMicroFunction) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(12, (NotificationProtos.SENotification) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(13, (MusicProtos.SEMusic) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(14, (SettingMenuProtos.SESettingMenu) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(15, (FactoryProtos.SEFactory) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(16, (AlexaProtos.SEAleax) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(17, (SA_WatchFaceProtos.SAWatchFace) this.payload_);
            }
            if (this.payloadCase_ == 18) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(18, (SA_WeatherProtos.SAweather) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(19, (ChildrenProtos.SEChildren) this.payload_);
            }
            if (this.payloadCase_ == 20) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(20, (AIFunctionProtos.SEAIFunction) this.payload_);
            }
            if (this.payloadCase_ == 99) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(99, (CommonProtos.SEBLEConnectParameterConfig) this.payload_);
            }
            if (this.payloadCase_ == 100) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(100, ((Integer) this.payload_).intValue());
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SettingMenuProtos.SESettingMenu getSettingMenu() {
            return this.payloadCase_ == 14 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SettingMenuProtos.SESettingMenuOrBuilder getSettingMenuOrBuilder() {
            return this.payloadCase_ == 14 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SportingProtos.SESporting getSporting() {
            return this.payloadCase_ == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SportingProtos.SESportingOrBuilder getSportingOrBuilder() {
            return this.payloadCase_ == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SystemTimeProtos.SESystemTime getSystemTime() {
            return this.payloadCase_ == 6 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public SystemTimeProtos.SESystemTimeOrBuilder getSystemTimeOrBuilder() {
            return this.payloadCase_ == 6 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.OTHER : typeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public UserProfilesProtos.SEUserSettings getUserSettings() {
            return this.payloadCase_ == 7 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public UserProfilesProtos.SEUserSettingsOrBuilder getUserSettingsOrBuilder() {
            return this.payloadCase_ == 7 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasAiFunction() {
            return this.payloadCase_ == 20;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasAleax() {
            return this.payloadCase_ == 16;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasBindAccount() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasBleConnectParmeterConfig() {
            return this.payloadCase_ == 99;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasChangeMtu() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasChildren() {
            return this.payloadCase_ == 19;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasDevice() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasErrorCode() {
            return this.payloadCase_ == 100;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasFactory() {
            return this.payloadCase_ == 15;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasFitness() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasGnss() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasMicroFunction() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasMusic() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasNewWatchFace() {
            return this.payloadCase_ == 17;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasNewWeather() {
            return this.payloadCase_ == 18;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasNotification() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasSettingMenu() {
            return this.payloadCase_ == 14;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasSporting() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasSystemTime() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasUserSettings() {
            return this.payloadCase_ == 7;
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
            if (hasType()) {
                iHashCode2 = (((iHashCode2 * 37) + 1) * 53) + this.type_;
            }
            if (hasId()) {
                iHashCode2 = (((iHashCode2 * 37) + 2) * 53) + getId();
            }
            int i9 = this.payloadCase_;
            if (i9 == 99) {
                i7 = ((iHashCode2 * 37) + 99) * 53;
                iHashCode = getBleConnectParmeterConfig().hashCode();
            } else if (i9 != 100) {
                switch (i9) {
                    case 3:
                        i7 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getChangeMtu();
                        break;
                    case 4:
                        i7 = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = getBindAccount().hashCode();
                        break;
                    case 5:
                        i7 = ((iHashCode2 * 37) + 5) * 53;
                        iHashCode = getDevice().hashCode();
                        break;
                    case 6:
                        i7 = ((iHashCode2 * 37) + 6) * 53;
                        iHashCode = getSystemTime().hashCode();
                        break;
                    case 7:
                        i7 = ((iHashCode2 * 37) + 7) * 53;
                        iHashCode = getUserSettings().hashCode();
                        break;
                    case 8:
                        i7 = ((iHashCode2 * 37) + 8) * 53;
                        iHashCode = getSporting().hashCode();
                        break;
                    case 9:
                        i7 = ((iHashCode2 * 37) + 9) * 53;
                        iHashCode = getFitness().hashCode();
                        break;
                    case 10:
                        i7 = ((iHashCode2 * 37) + 10) * 53;
                        iHashCode = getGnss().hashCode();
                        break;
                    case 11:
                        i7 = ((iHashCode2 * 37) + 11) * 53;
                        iHashCode = getMicroFunction().hashCode();
                        break;
                    case 12:
                        i7 = ((iHashCode2 * 37) + 12) * 53;
                        iHashCode = getNotification().hashCode();
                        break;
                    case 13:
                        i7 = ((iHashCode2 * 37) + 13) * 53;
                        iHashCode = getMusic().hashCode();
                        break;
                    case 14:
                        i7 = ((iHashCode2 * 37) + 14) * 53;
                        iHashCode = getSettingMenu().hashCode();
                        break;
                    case 15:
                        i7 = ((iHashCode2 * 37) + 15) * 53;
                        iHashCode = getFactory().hashCode();
                        break;
                    case 16:
                        i7 = ((iHashCode2 * 37) + 16) * 53;
                        iHashCode = getAleax().hashCode();
                        break;
                    case 17:
                        i7 = ((iHashCode2 * 37) + 17) * 53;
                        iHashCode = getNewWatchFace().hashCode();
                        break;
                    case 18:
                        i7 = ((iHashCode2 * 37) + 18) * 53;
                        iHashCode = getNewWeather().hashCode();
                        break;
                    case 19:
                        i7 = ((iHashCode2 * 37) + 19) * 53;
                        iHashCode = getChildren().hashCode();
                        break;
                    case 20:
                        i7 = ((iHashCode2 * 37) + 20) * 53;
                        iHashCode = getAiFunction().hashCode();
                        break;
                }
            } else {
                i7 = ((iHashCode2 * 37) + 100) * 53;
                iHashCode = getErrorCode().getNumber();
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return WearProtos.internal_static_SA_SEWear_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWear.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindAccount() && !getBindAccount().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDevice() && !getDevice().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSystemTime() && !getSystemTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUserSettings() && !getUserSettings().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSporting() && !getSporting().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitness() && !getFitness().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGnss() && !getGnss().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMicroFunction() && !getMicroFunction().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasNotification() && !getNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMusic() && !getMusic().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSettingMenu() && !getSettingMenu().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFactory() && !getFactory().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAleax() && !getAleax().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasNewWatchFace() && !getNewWatchFace().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasNewWeather() && !getNewWeather().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasChildren() && !getChildren().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAiFunction() || getAiFunction().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.id_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeUInt32(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (BindAccountProtos.SEBindAccount) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (DeviceProtos.SEDevice) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SystemTimeProtos.SESystemTime) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (UserProfilesProtos.SEUserSettings) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SportingProtos.SESporting) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (FitnessProtos.SEFitness) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (SA_GnssProtos.SEGnss) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (MicroFunctionProtos.SEMicroFunction) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (NotificationProtos.SENotification) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (MusicProtos.SEMusic) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                codedOutputStream.writeMessage(14, (SettingMenuProtos.SESettingMenu) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                codedOutputStream.writeMessage(15, (FactoryProtos.SEFactory) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                codedOutputStream.writeMessage(16, (AlexaProtos.SEAleax) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                codedOutputStream.writeMessage(17, (SA_WatchFaceProtos.SAWatchFace) this.payload_);
            }
            if (this.payloadCase_ == 18) {
                codedOutputStream.writeMessage(18, (SA_WeatherProtos.SAweather) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                codedOutputStream.writeMessage(19, (ChildrenProtos.SEChildren) this.payload_);
            }
            if (this.payloadCase_ == 20) {
                codedOutputStream.writeMessage(20, (AIFunctionProtos.SEAIFunction) this.payload_);
            }
            if (this.payloadCase_ == 99) {
                codedOutputStream.writeMessage(99, (CommonProtos.SEBLEConnectParameterConfig) this.payload_);
            }
            if (this.payloadCase_ == 100) {
                codedOutputStream.writeEnum(100, ((Integer) this.payload_).intValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWearOrBuilder {
            private SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> aiFunctionBuilder_;
            private SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> aleaxBuilder_;
            private SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> bindAccountBuilder_;
            private int bitField0_;
            private SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> bleConnectParmeterConfigBuilder_;
            private SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> childrenBuilder_;
            private SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> deviceBuilder_;
            private SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> factoryBuilder_;
            private SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> fitnessBuilder_;
            private SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> gnssBuilder_;
            private int id_;
            private SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> microFunctionBuilder_;
            private SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> musicBuilder_;
            private SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> newWatchFaceBuilder_;
            private SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> newWeatherBuilder_;
            private SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> notificationBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> settingMenuBuilder_;
            private SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> sportingBuilder_;
            private SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> systemTimeBuilder_;
            private int type_;
            private SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> userSettingsBuilder_;

            private void buildPartial0(SEWear sEWear) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWear.type_ = this.type_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWear.id_ = this.id_;
                    i7 |= 2;
                }
                sEWear.bitField0_ |= i7;
            }

            private void buildPartialOneofs(SEWear sEWear) {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder9;
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder10;
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder11;
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder12;
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder13;
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder14;
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder15;
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder16;
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder17;
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder18;
                int i7 = this.payloadCase_;
                sEWear.payloadCase_ = i7;
                sEWear.payload_ = this.payload_;
                if (i7 == 4 && (singleFieldBuilder18 = this.bindAccountBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder18.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder17 = this.deviceBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder17.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder16 = this.systemTimeBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder16.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder15 = this.userSettingsBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder15.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder14 = this.sportingBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder14.build();
                }
                if (this.payloadCase_ == 9 && (singleFieldBuilder13 = this.fitnessBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder13.build();
                }
                if (this.payloadCase_ == 10 && (singleFieldBuilder12 = this.gnssBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder12.build();
                }
                if (this.payloadCase_ == 11 && (singleFieldBuilder11 = this.microFunctionBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder11.build();
                }
                if (this.payloadCase_ == 12 && (singleFieldBuilder10 = this.notificationBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder10.build();
                }
                if (this.payloadCase_ == 13 && (singleFieldBuilder9 = this.musicBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 14 && (singleFieldBuilder8 = this.settingMenuBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 15 && (singleFieldBuilder7 = this.factoryBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 16 && (singleFieldBuilder6 = this.aleaxBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 17 && (singleFieldBuilder5 = this.newWatchFaceBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 18 && (singleFieldBuilder4 = this.newWeatherBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 19 && (singleFieldBuilder3 = this.childrenBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 20 && (singleFieldBuilder2 = this.aiFunctionBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 99 || (singleFieldBuilder = this.bleConnectParmeterConfigBuilder_) == null) {
                    return;
                }
                sEWear.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WearProtos.internal_static_SA_SEWear_descriptor;
            }

            private SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> internalGetAiFunctionFieldBuilder() {
                if (this.aiFunctionBuilder_ == null) {
                    if (this.payloadCase_ != 20) {
                        this.payload_ = AIFunctionProtos.SEAIFunction.getDefaultInstance();
                    }
                    this.aiFunctionBuilder_ = new SingleFieldBuilder<>((AIFunctionProtos.SEAIFunction) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 20;
                onChanged();
                return this.aiFunctionBuilder_;
            }

            private SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> internalGetAleaxFieldBuilder() {
                if (this.aleaxBuilder_ == null) {
                    if (this.payloadCase_ != 16) {
                        this.payload_ = AlexaProtos.SEAleax.getDefaultInstance();
                    }
                    this.aleaxBuilder_ = new SingleFieldBuilder<>((AlexaProtos.SEAleax) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 16;
                onChanged();
                return this.aleaxBuilder_;
            }

            private SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> internalGetBindAccountFieldBuilder() {
                if (this.bindAccountBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = BindAccountProtos.SEBindAccount.getDefaultInstance();
                    }
                    this.bindAccountBuilder_ = new SingleFieldBuilder<>((BindAccountProtos.SEBindAccount) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.bindAccountBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> internalGetBleConnectParmeterConfigFieldBuilder() {
                if (this.bleConnectParmeterConfigBuilder_ == null) {
                    if (this.payloadCase_ != 99) {
                        this.payload_ = CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance();
                    }
                    this.bleConnectParmeterConfigBuilder_ = new SingleFieldBuilder<>((CommonProtos.SEBLEConnectParameterConfig) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 99;
                onChanged();
                return this.bleConnectParmeterConfigBuilder_;
            }

            private SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> internalGetChildrenFieldBuilder() {
                if (this.childrenBuilder_ == null) {
                    if (this.payloadCase_ != 19) {
                        this.payload_ = ChildrenProtos.SEChildren.getDefaultInstance();
                    }
                    this.childrenBuilder_ = new SingleFieldBuilder<>((ChildrenProtos.SEChildren) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 19;
                onChanged();
                return this.childrenBuilder_;
            }

            private SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> internalGetDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = DeviceProtos.SEDevice.getDefaultInstance();
                    }
                    this.deviceBuilder_ = new SingleFieldBuilder<>((DeviceProtos.SEDevice) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.deviceBuilder_;
            }

            private SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> internalGetFactoryFieldBuilder() {
                if (this.factoryBuilder_ == null) {
                    if (this.payloadCase_ != 15) {
                        this.payload_ = FactoryProtos.SEFactory.getDefaultInstance();
                    }
                    this.factoryBuilder_ = new SingleFieldBuilder<>((FactoryProtos.SEFactory) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 15;
                onChanged();
                return this.factoryBuilder_;
            }

            private SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> internalGetFitnessFieldBuilder() {
                if (this.fitnessBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = FitnessProtos.SEFitness.getDefaultInstance();
                    }
                    this.fitnessBuilder_ = new SingleFieldBuilder<>((FitnessProtos.SEFitness) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.fitnessBuilder_;
            }

            private SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> internalGetGnssFieldBuilder() {
                if (this.gnssBuilder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = SA_GnssProtos.SEGnss.getDefaultInstance();
                    }
                    this.gnssBuilder_ = new SingleFieldBuilder<>((SA_GnssProtos.SEGnss) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.gnssBuilder_;
            }

            private SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> internalGetMicroFunctionFieldBuilder() {
                if (this.microFunctionBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
                    }
                    this.microFunctionBuilder_ = new SingleFieldBuilder<>((MicroFunctionProtos.SEMicroFunction) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.microFunctionBuilder_;
            }

            private SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> internalGetMusicFieldBuilder() {
                if (this.musicBuilder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = MusicProtos.SEMusic.getDefaultInstance();
                    }
                    this.musicBuilder_ = new SingleFieldBuilder<>((MusicProtos.SEMusic) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.musicBuilder_;
            }

            private SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> internalGetNewWatchFaceFieldBuilder() {
                if (this.newWatchFaceBuilder_ == null) {
                    if (this.payloadCase_ != 17) {
                        this.payload_ = SA_WatchFaceProtos.SAWatchFace.getDefaultInstance();
                    }
                    this.newWatchFaceBuilder_ = new SingleFieldBuilder<>((SA_WatchFaceProtos.SAWatchFace) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 17;
                onChanged();
                return this.newWatchFaceBuilder_;
            }

            private SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> internalGetNewWeatherFieldBuilder() {
                if (this.newWeatherBuilder_ == null) {
                    if (this.payloadCase_ != 18) {
                        this.payload_ = SA_WeatherProtos.SAweather.getDefaultInstance();
                    }
                    this.newWeatherBuilder_ = new SingleFieldBuilder<>((SA_WeatherProtos.SAweather) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 18;
                onChanged();
                return this.newWeatherBuilder_;
            }

            private SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> internalGetNotificationFieldBuilder() {
                if (this.notificationBuilder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = NotificationProtos.SENotification.getDefaultInstance();
                    }
                    this.notificationBuilder_ = new SingleFieldBuilder<>((NotificationProtos.SENotification) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.notificationBuilder_;
            }

            private SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> internalGetSettingMenuFieldBuilder() {
                if (this.settingMenuBuilder_ == null) {
                    if (this.payloadCase_ != 14) {
                        this.payload_ = SettingMenuProtos.SESettingMenu.getDefaultInstance();
                    }
                    this.settingMenuBuilder_ = new SingleFieldBuilder<>((SettingMenuProtos.SESettingMenu) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 14;
                onChanged();
                return this.settingMenuBuilder_;
            }

            private SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> internalGetSportingFieldBuilder() {
                if (this.sportingBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SportingProtos.SESporting.getDefaultInstance();
                    }
                    this.sportingBuilder_ = new SingleFieldBuilder<>((SportingProtos.SESporting) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.sportingBuilder_;
            }

            private SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> internalGetSystemTimeFieldBuilder() {
                if (this.systemTimeBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SystemTimeProtos.SESystemTime.getDefaultInstance();
                    }
                    this.systemTimeBuilder_ = new SingleFieldBuilder<>((SystemTimeProtos.SESystemTime) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.systemTimeBuilder_;
            }

            private SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> internalGetUserSettingsFieldBuilder() {
                if (this.userSettingsBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = UserProfilesProtos.SEUserSettings.getDefaultInstance();
                    }
                    this.userSettingsBuilder_ = new SingleFieldBuilder<>((UserProfilesProtos.SEUserSettings) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.userSettingsBuilder_;
            }

            public Builder clearAiFunction() {
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder = this.aiFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 20) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 20) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearAleax() {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 16) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 16) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearBindAccount() {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
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

            public Builder clearBleConnectParmeterConfig() {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder = this.bleConnectParmeterConfigBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 99) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 99) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearChangeMtu() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearChildren() {
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder = this.childrenBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 19) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 19) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearDevice() {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
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

            public Builder clearErrorCode() {
                if (this.payloadCase_ == 100) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearFactory() {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder = this.factoryBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 15) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 15) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearFitness() {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder = this.fitnessBuilder_;
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

            public Builder clearGnss() {
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder = this.gnssBuilder_;
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

            public Builder clearId() {
                this.bitField0_ &= -3;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMicroFunction() {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
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

            public Builder clearMusic() {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
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

            public Builder clearNewWatchFace() {
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder = this.newWatchFaceBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 17) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 17) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearNewWeather() {
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder = this.newWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 18) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 18) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearNotification() {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearSettingMenu() {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ == 14) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 14) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearSporting() {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder = this.sportingBuilder_;
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

            public Builder clearSystemTime() {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder = this.systemTimeBuilder_;
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

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserSettings() {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
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

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public AIFunctionProtos.SEAIFunction getAiFunction() {
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder = this.aiFunctionBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 20 ? (AIFunctionProtos.SEAIFunction) this.payload_ : AIFunctionProtos.SEAIFunction.getDefaultInstance() : this.payloadCase_ == 20 ? (AIFunctionProtos.SEAIFunction) singleFieldBuilder.getMessage() : AIFunctionProtos.SEAIFunction.getDefaultInstance();
            }

            public AIFunctionProtos.SEAIFunction.Builder getAiFunctionBuilder() {
                return (AIFunctionProtos.SEAIFunction.Builder) internalGetAiFunctionFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public AIFunctionProtos.SEAIFunctionOrBuilder getAiFunctionOrBuilder() {
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 20 || (singleFieldBuilder = this.aiFunctionBuilder_) == null) ? i7 == 20 ? (AIFunctionProtos.SEAIFunction) this.payload_ : AIFunctionProtos.SEAIFunction.getDefaultInstance() : (AIFunctionProtos.SEAIFunctionOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public AlexaProtos.SEAleax getAleax() {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 16 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance() : this.payloadCase_ == 16 ? (AlexaProtos.SEAleax) singleFieldBuilder.getMessage() : AlexaProtos.SEAleax.getDefaultInstance();
            }

            public AlexaProtos.SEAleax.Builder getAleaxBuilder() {
                return (AlexaProtos.SEAleax.Builder) internalGetAleaxFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public AlexaProtos.SEAleaxOrBuilder getAleaxOrBuilder() {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 16 || (singleFieldBuilder = this.aleaxBuilder_) == null) ? i7 == 16 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance() : (AlexaProtos.SEAleaxOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public BindAccountProtos.SEBindAccount getBindAccount() {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance() : this.payloadCase_ == 4 ? (BindAccountProtos.SEBindAccount) singleFieldBuilder.getMessage() : BindAccountProtos.SEBindAccount.getDefaultInstance();
            }

            public BindAccountProtos.SEBindAccount.Builder getBindAccountBuilder() {
                return (BindAccountProtos.SEBindAccount.Builder) internalGetBindAccountFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public BindAccountProtos.SEBindAccountOrBuilder getBindAccountOrBuilder() {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.bindAccountBuilder_) == null) ? i7 == 4 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance() : (BindAccountProtos.SEBindAccountOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public CommonProtos.SEBLEConnectParameterConfig getBleConnectParmeterConfig() {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder = this.bleConnectParmeterConfigBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance() : this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) singleFieldBuilder.getMessage() : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance();
            }

            public CommonProtos.SEBLEConnectParameterConfig.Builder getBleConnectParmeterConfigBuilder() {
                return (CommonProtos.SEBLEConnectParameterConfig.Builder) internalGetBleConnectParmeterConfigFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public CommonProtos.SEBLEConnectParameterConfigOrBuilder getBleConnectParmeterConfigOrBuilder() {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 99 || (singleFieldBuilder = this.bleConnectParmeterConfigBuilder_) == null) ? i7 == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance() : (CommonProtos.SEBLEConnectParameterConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public int getChangeMtu() {
                if (this.payloadCase_ == 3) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public ChildrenProtos.SEChildren getChildren() {
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder = this.childrenBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 19 ? (ChildrenProtos.SEChildren) this.payload_ : ChildrenProtos.SEChildren.getDefaultInstance() : this.payloadCase_ == 19 ? (ChildrenProtos.SEChildren) singleFieldBuilder.getMessage() : ChildrenProtos.SEChildren.getDefaultInstance();
            }

            public ChildrenProtos.SEChildren.Builder getChildrenBuilder() {
                return (ChildrenProtos.SEChildren.Builder) internalGetChildrenFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public ChildrenProtos.SEChildrenOrBuilder getChildrenOrBuilder() {
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 19 || (singleFieldBuilder = this.childrenBuilder_) == null) ? i7 == 19 ? (ChildrenProtos.SEChildren) this.payload_ : ChildrenProtos.SEChildren.getDefaultInstance() : (ChildrenProtos.SEChildrenOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WearProtos.internal_static_SA_SEWear_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public DeviceProtos.SEDevice getDevice() {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance() : this.payloadCase_ == 5 ? (DeviceProtos.SEDevice) singleFieldBuilder.getMessage() : DeviceProtos.SEDevice.getDefaultInstance();
            }

            public DeviceProtos.SEDevice.Builder getDeviceBuilder() {
                return (DeviceProtos.SEDevice.Builder) internalGetDeviceFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public DeviceProtos.SEDeviceOrBuilder getDeviceOrBuilder() {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.deviceBuilder_) == null) ? i7 == 5 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance() : (DeviceProtos.SEDeviceOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public CommonProtos.SEErrorCode getErrorCode() {
                CommonProtos.SEErrorCode sEErrorCodeForNumber;
                return (this.payloadCase_ != 100 || (sEErrorCodeForNumber = CommonProtos.SEErrorCode.forNumber(((Integer) this.payload_).intValue())) == null) ? CommonProtos.SEErrorCode.NO_ERROR : sEErrorCodeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public FactoryProtos.SEFactory getFactory() {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder = this.factoryBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 15 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance() : this.payloadCase_ == 15 ? (FactoryProtos.SEFactory) singleFieldBuilder.getMessage() : FactoryProtos.SEFactory.getDefaultInstance();
            }

            public FactoryProtos.SEFactory.Builder getFactoryBuilder() {
                return (FactoryProtos.SEFactory.Builder) internalGetFactoryFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public FactoryProtos.SEFactoryOrBuilder getFactoryOrBuilder() {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 15 || (singleFieldBuilder = this.factoryBuilder_) == null) ? i7 == 15 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance() : (FactoryProtos.SEFactoryOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public FitnessProtos.SEFitness getFitness() {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder = this.fitnessBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance() : this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) singleFieldBuilder.getMessage() : FitnessProtos.SEFitness.getDefaultInstance();
            }

            public FitnessProtos.SEFitness.Builder getFitnessBuilder() {
                return (FitnessProtos.SEFitness.Builder) internalGetFitnessFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public FitnessProtos.SEFitnessOrBuilder getFitnessOrBuilder() {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.fitnessBuilder_) == null) ? i7 == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance() : (FitnessProtos.SEFitnessOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SA_GnssProtos.SEGnss getGnss() {
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder = this.gnssBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 10 ? (SA_GnssProtos.SEGnss) this.payload_ : SA_GnssProtos.SEGnss.getDefaultInstance() : this.payloadCase_ == 10 ? (SA_GnssProtos.SEGnss) singleFieldBuilder.getMessage() : SA_GnssProtos.SEGnss.getDefaultInstance();
            }

            public SA_GnssProtos.SEGnss.Builder getGnssBuilder() {
                return (SA_GnssProtos.SEGnss.Builder) internalGetGnssFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SA_GnssProtos.SEGnssOrBuilder getGnssOrBuilder() {
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilder = this.gnssBuilder_) == null) ? i7 == 10 ? (SA_GnssProtos.SEGnss) this.payload_ : SA_GnssProtos.SEGnss.getDefaultInstance() : (SA_GnssProtos.SEGnssOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public MicroFunctionProtos.SEMicroFunction getMicroFunction() {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 11 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance() : this.payloadCase_ == 11 ? (MicroFunctionProtos.SEMicroFunction) singleFieldBuilder.getMessage() : MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
            }

            public MicroFunctionProtos.SEMicroFunction.Builder getMicroFunctionBuilder() {
                return (MicroFunctionProtos.SEMicroFunction.Builder) internalGetMicroFunctionFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public MicroFunctionProtos.SEMicroFunctionOrBuilder getMicroFunctionOrBuilder() {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilder = this.microFunctionBuilder_) == null) ? i7 == 11 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance() : (MicroFunctionProtos.SEMicroFunctionOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public MusicProtos.SEMusic getMusic() {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 13 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance() : this.payloadCase_ == 13 ? (MusicProtos.SEMusic) singleFieldBuilder.getMessage() : MusicProtos.SEMusic.getDefaultInstance();
            }

            public MusicProtos.SEMusic.Builder getMusicBuilder() {
                return (MusicProtos.SEMusic.Builder) internalGetMusicFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public MusicProtos.SEMusicOrBuilder getMusicOrBuilder() {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilder = this.musicBuilder_) == null) ? i7 == 13 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance() : (MusicProtos.SEMusicOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SA_WatchFaceProtos.SAWatchFace getNewWatchFace() {
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder = this.newWatchFaceBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 17 ? (SA_WatchFaceProtos.SAWatchFace) this.payload_ : SA_WatchFaceProtos.SAWatchFace.getDefaultInstance() : this.payloadCase_ == 17 ? (SA_WatchFaceProtos.SAWatchFace) singleFieldBuilder.getMessage() : SA_WatchFaceProtos.SAWatchFace.getDefaultInstance();
            }

            public SA_WatchFaceProtos.SAWatchFace.Builder getNewWatchFaceBuilder() {
                return (SA_WatchFaceProtos.SAWatchFace.Builder) internalGetNewWatchFaceFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SA_WatchFaceProtos.SAWatchFaceOrBuilder getNewWatchFaceOrBuilder() {
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 17 || (singleFieldBuilder = this.newWatchFaceBuilder_) == null) ? i7 == 17 ? (SA_WatchFaceProtos.SAWatchFace) this.payload_ : SA_WatchFaceProtos.SAWatchFace.getDefaultInstance() : (SA_WatchFaceProtos.SAWatchFaceOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SA_WeatherProtos.SAweather getNewWeather() {
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder = this.newWeatherBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 18 ? (SA_WeatherProtos.SAweather) this.payload_ : SA_WeatherProtos.SAweather.getDefaultInstance() : this.payloadCase_ == 18 ? (SA_WeatherProtos.SAweather) singleFieldBuilder.getMessage() : SA_WeatherProtos.SAweather.getDefaultInstance();
            }

            public SA_WeatherProtos.SAweather.Builder getNewWeatherBuilder() {
                return (SA_WeatherProtos.SAweather.Builder) internalGetNewWeatherFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SA_WeatherProtos.SAweatherOrBuilder getNewWeatherOrBuilder() {
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 18 || (singleFieldBuilder = this.newWeatherBuilder_) == null) ? i7 == 18 ? (SA_WeatherProtos.SAweather) this.payload_ : SA_WeatherProtos.SAweather.getDefaultInstance() : (SA_WeatherProtos.SAweatherOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public NotificationProtos.SENotification getNotification() {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 12 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance() : this.payloadCase_ == 12 ? (NotificationProtos.SENotification) singleFieldBuilder.getMessage() : NotificationProtos.SENotification.getDefaultInstance();
            }

            public NotificationProtos.SENotification.Builder getNotificationBuilder() {
                return (NotificationProtos.SENotification.Builder) internalGetNotificationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public NotificationProtos.SENotificationOrBuilder getNotificationOrBuilder() {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilder = this.notificationBuilder_) == null) ? i7 == 12 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance() : (NotificationProtos.SENotificationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SettingMenuProtos.SESettingMenu getSettingMenu() {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 14 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance() : this.payloadCase_ == 14 ? (SettingMenuProtos.SESettingMenu) singleFieldBuilder.getMessage() : SettingMenuProtos.SESettingMenu.getDefaultInstance();
            }

            public SettingMenuProtos.SESettingMenu.Builder getSettingMenuBuilder() {
                return (SettingMenuProtos.SESettingMenu.Builder) internalGetSettingMenuFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SettingMenuProtos.SESettingMenuOrBuilder getSettingMenuOrBuilder() {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 14 || (singleFieldBuilder = this.settingMenuBuilder_) == null) ? i7 == 14 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance() : (SettingMenuProtos.SESettingMenuOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SportingProtos.SESporting getSporting() {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder = this.sportingBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance() : this.payloadCase_ == 8 ? (SportingProtos.SESporting) singleFieldBuilder.getMessage() : SportingProtos.SESporting.getDefaultInstance();
            }

            public SportingProtos.SESporting.Builder getSportingBuilder() {
                return (SportingProtos.SESporting.Builder) internalGetSportingFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SportingProtos.SESportingOrBuilder getSportingOrBuilder() {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.sportingBuilder_) == null) ? i7 == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance() : (SportingProtos.SESportingOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SystemTimeProtos.SESystemTime getSystemTime() {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder = this.systemTimeBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance() : this.payloadCase_ == 6 ? (SystemTimeProtos.SESystemTime) singleFieldBuilder.getMessage() : SystemTimeProtos.SESystemTime.getDefaultInstance();
            }

            public SystemTimeProtos.SESystemTime.Builder getSystemTimeBuilder() {
                return (SystemTimeProtos.SESystemTime.Builder) internalGetSystemTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public SystemTimeProtos.SESystemTimeOrBuilder getSystemTimeOrBuilder() {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.systemTimeBuilder_) == null) ? i7 == 6 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance() : (SystemTimeProtos.SESystemTimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.OTHER : typeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public UserProfilesProtos.SEUserSettings getUserSettings() {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance() : this.payloadCase_ == 7 ? (UserProfilesProtos.SEUserSettings) singleFieldBuilder.getMessage() : UserProfilesProtos.SEUserSettings.getDefaultInstance();
            }

            public UserProfilesProtos.SEUserSettings.Builder getUserSettingsBuilder() {
                return (UserProfilesProtos.SEUserSettings.Builder) internalGetUserSettingsFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public UserProfilesProtos.SEUserSettingsOrBuilder getUserSettingsOrBuilder() {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.userSettingsBuilder_) == null) ? i7 == 7 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance() : (UserProfilesProtos.SEUserSettingsOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasAiFunction() {
                return this.payloadCase_ == 20;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasAleax() {
                return this.payloadCase_ == 16;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasBindAccount() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasBleConnectParmeterConfig() {
                return this.payloadCase_ == 99;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasChangeMtu() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasChildren() {
                return this.payloadCase_ == 19;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasDevice() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasErrorCode() {
                return this.payloadCase_ == 100;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasFactory() {
                return this.payloadCase_ == 15;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasFitness() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasGnss() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasMicroFunction() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasMusic() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasNewWatchFace() {
                return this.payloadCase_ == 17;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasNewWeather() {
                return this.payloadCase_ == 18;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasNotification() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasSettingMenu() {
                return this.payloadCase_ == 14;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasSporting() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasSystemTime() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasUserSettings() {
                return this.payloadCase_ == 7;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WearProtos.internal_static_SA_SEWear_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWear.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasType() || !hasId()) {
                    return false;
                }
                if (hasBindAccount() && !getBindAccount().isInitialized()) {
                    return false;
                }
                if (hasDevice() && !getDevice().isInitialized()) {
                    return false;
                }
                if (hasSystemTime() && !getSystemTime().isInitialized()) {
                    return false;
                }
                if (hasUserSettings() && !getUserSettings().isInitialized()) {
                    return false;
                }
                if (hasSporting() && !getSporting().isInitialized()) {
                    return false;
                }
                if (hasFitness() && !getFitness().isInitialized()) {
                    return false;
                }
                if (hasGnss() && !getGnss().isInitialized()) {
                    return false;
                }
                if (hasMicroFunction() && !getMicroFunction().isInitialized()) {
                    return false;
                }
                if (hasNotification() && !getNotification().isInitialized()) {
                    return false;
                }
                if (hasMusic() && !getMusic().isInitialized()) {
                    return false;
                }
                if (hasSettingMenu() && !getSettingMenu().isInitialized()) {
                    return false;
                }
                if (hasFactory() && !getFactory().isInitialized()) {
                    return false;
                }
                if (hasAleax() && !getAleax().isInitialized()) {
                    return false;
                }
                if (hasNewWatchFace() && !getNewWatchFace().isInitialized()) {
                    return false;
                }
                if (hasNewWeather() && !getNewWeather().isInitialized()) {
                    return false;
                }
                if (!hasChildren() || getChildren().isInitialized()) {
                    return !hasAiFunction() || getAiFunction().isInitialized();
                }
                return false;
            }

            public Builder mergeAiFunction(AIFunctionProtos.SEAIFunction sEAIFunction) {
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder = this.aiFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 20 || this.payload_ == AIFunctionProtos.SEAIFunction.getDefaultInstance()) {
                        this.payload_ = sEAIFunction;
                    } else {
                        this.payload_ = AIFunctionProtos.SEAIFunction.newBuilder((AIFunctionProtos.SEAIFunction) this.payload_).mergeFrom(sEAIFunction).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 20) {
                    singleFieldBuilder.mergeFrom(sEAIFunction);
                } else {
                    singleFieldBuilder.setMessage(sEAIFunction);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder mergeAleax(AlexaProtos.SEAleax sEAleax) {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 16 || this.payload_ == AlexaProtos.SEAleax.getDefaultInstance()) {
                        this.payload_ = sEAleax;
                    } else {
                        this.payload_ = AlexaProtos.SEAleax.newBuilder((AlexaProtos.SEAleax) this.payload_).mergeFrom(sEAleax).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 16) {
                    singleFieldBuilder.mergeFrom(sEAleax);
                } else {
                    singleFieldBuilder.setMessage(sEAleax);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder mergeBindAccount(BindAccountProtos.SEBindAccount sEBindAccount) {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == BindAccountProtos.SEBindAccount.getDefaultInstance()) {
                        this.payload_ = sEBindAccount;
                    } else {
                        this.payload_ = BindAccountProtos.SEBindAccount.newBuilder((BindAccountProtos.SEBindAccount) this.payload_).mergeFrom(sEBindAccount).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEBindAccount);
                } else {
                    singleFieldBuilder.setMessage(sEBindAccount);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeBleConnectParmeterConfig(CommonProtos.SEBLEConnectParameterConfig sEBLEConnectParameterConfig) {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder = this.bleConnectParmeterConfigBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 99 || this.payload_ == CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance()) {
                        this.payload_ = sEBLEConnectParameterConfig;
                    } else {
                        this.payload_ = CommonProtos.SEBLEConnectParameterConfig.newBuilder((CommonProtos.SEBLEConnectParameterConfig) this.payload_).mergeFrom(sEBLEConnectParameterConfig).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 99) {
                    singleFieldBuilder.mergeFrom(sEBLEConnectParameterConfig);
                } else {
                    singleFieldBuilder.setMessage(sEBLEConnectParameterConfig);
                }
                this.payloadCase_ = 99;
                return this;
            }

            public Builder mergeChildren(ChildrenProtos.SEChildren sEChildren) {
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder = this.childrenBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 19 || this.payload_ == ChildrenProtos.SEChildren.getDefaultInstance()) {
                        this.payload_ = sEChildren;
                    } else {
                        this.payload_ = ChildrenProtos.SEChildren.newBuilder((ChildrenProtos.SEChildren) this.payload_).mergeFrom(sEChildren).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 19) {
                    singleFieldBuilder.mergeFrom(sEChildren);
                } else {
                    singleFieldBuilder.setMessage(sEChildren);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder mergeDevice(DeviceProtos.SEDevice sEDevice) {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == DeviceProtos.SEDevice.getDefaultInstance()) {
                        this.payload_ = sEDevice;
                    } else {
                        this.payload_ = DeviceProtos.SEDevice.newBuilder((DeviceProtos.SEDevice) this.payload_).mergeFrom(sEDevice).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEDevice);
                } else {
                    singleFieldBuilder.setMessage(sEDevice);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeFactory(FactoryProtos.SEFactory sEFactory) {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder = this.factoryBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 15 || this.payload_ == FactoryProtos.SEFactory.getDefaultInstance()) {
                        this.payload_ = sEFactory;
                    } else {
                        this.payload_ = FactoryProtos.SEFactory.newBuilder((FactoryProtos.SEFactory) this.payload_).mergeFrom(sEFactory).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 15) {
                    singleFieldBuilder.mergeFrom(sEFactory);
                } else {
                    singleFieldBuilder.setMessage(sEFactory);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder mergeFitness(FitnessProtos.SEFitness sEFitness) {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder = this.fitnessBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 9 || this.payload_ == FitnessProtos.SEFitness.getDefaultInstance()) {
                        this.payload_ = sEFitness;
                    } else {
                        this.payload_ = FitnessProtos.SEFitness.newBuilder((FitnessProtos.SEFitness) this.payload_).mergeFrom(sEFitness).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 9) {
                    singleFieldBuilder.mergeFrom(sEFitness);
                } else {
                    singleFieldBuilder.setMessage(sEFitness);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder mergeGnss(SA_GnssProtos.SEGnss sEGnss) {
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder = this.gnssBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 10 || this.payload_ == SA_GnssProtos.SEGnss.getDefaultInstance()) {
                        this.payload_ = sEGnss;
                    } else {
                        this.payload_ = SA_GnssProtos.SEGnss.newBuilder((SA_GnssProtos.SEGnss) this.payload_).mergeFrom(sEGnss).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 10) {
                    singleFieldBuilder.mergeFrom(sEGnss);
                } else {
                    singleFieldBuilder.setMessage(sEGnss);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeMicroFunction(MicroFunctionProtos.SEMicroFunction sEMicroFunction) {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 11 || this.payload_ == MicroFunctionProtos.SEMicroFunction.getDefaultInstance()) {
                        this.payload_ = sEMicroFunction;
                    } else {
                        this.payload_ = MicroFunctionProtos.SEMicroFunction.newBuilder((MicroFunctionProtos.SEMicroFunction) this.payload_).mergeFrom(sEMicroFunction).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 11) {
                    singleFieldBuilder.mergeFrom(sEMicroFunction);
                } else {
                    singleFieldBuilder.setMessage(sEMicroFunction);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeMusic(MusicProtos.SEMusic sEMusic) {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 13 || this.payload_ == MusicProtos.SEMusic.getDefaultInstance()) {
                        this.payload_ = sEMusic;
                    } else {
                        this.payload_ = MusicProtos.SEMusic.newBuilder((MusicProtos.SEMusic) this.payload_).mergeFrom(sEMusic).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 13) {
                    singleFieldBuilder.mergeFrom(sEMusic);
                } else {
                    singleFieldBuilder.setMessage(sEMusic);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeNewWatchFace(SA_WatchFaceProtos.SAWatchFace sAWatchFace) {
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder = this.newWatchFaceBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 17 || this.payload_ == SA_WatchFaceProtos.SAWatchFace.getDefaultInstance()) {
                        this.payload_ = sAWatchFace;
                    } else {
                        this.payload_ = SA_WatchFaceProtos.SAWatchFace.newBuilder((SA_WatchFaceProtos.SAWatchFace) this.payload_).mergeFrom(sAWatchFace).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 17) {
                    singleFieldBuilder.mergeFrom(sAWatchFace);
                } else {
                    singleFieldBuilder.setMessage(sAWatchFace);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder mergeNewWeather(SA_WeatherProtos.SAweather sAweather) {
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder = this.newWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 18 || this.payload_ == SA_WeatherProtos.SAweather.getDefaultInstance()) {
                        this.payload_ = sAweather;
                    } else {
                        this.payload_ = SA_WeatherProtos.SAweather.newBuilder((SA_WeatherProtos.SAweather) this.payload_).mergeFrom(sAweather).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 18) {
                    singleFieldBuilder.mergeFrom(sAweather);
                } else {
                    singleFieldBuilder.setMessage(sAweather);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder mergeNotification(NotificationProtos.SENotification sENotification) {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 12 || this.payload_ == NotificationProtos.SENotification.getDefaultInstance()) {
                        this.payload_ = sENotification;
                    } else {
                        this.payload_ = NotificationProtos.SENotification.newBuilder((NotificationProtos.SENotification) this.payload_).mergeFrom(sENotification).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 12) {
                    singleFieldBuilder.mergeFrom(sENotification);
                } else {
                    singleFieldBuilder.setMessage(sENotification);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder mergeSettingMenu(SettingMenuProtos.SESettingMenu sESettingMenu) {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 14 || this.payload_ == SettingMenuProtos.SESettingMenu.getDefaultInstance()) {
                        this.payload_ = sESettingMenu;
                    } else {
                        this.payload_ = SettingMenuProtos.SESettingMenu.newBuilder((SettingMenuProtos.SESettingMenu) this.payload_).mergeFrom(sESettingMenu).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 14) {
                    singleFieldBuilder.mergeFrom(sESettingMenu);
                } else {
                    singleFieldBuilder.setMessage(sESettingMenu);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder mergeSporting(SportingProtos.SESporting sESporting) {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder = this.sportingBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SportingProtos.SESporting.getDefaultInstance()) {
                        this.payload_ = sESporting;
                    } else {
                        this.payload_ = SportingProtos.SESporting.newBuilder((SportingProtos.SESporting) this.payload_).mergeFrom(sESporting).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sESporting);
                } else {
                    singleFieldBuilder.setMessage(sESporting);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeSystemTime(SystemTimeProtos.SESystemTime sESystemTime) {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder = this.systemTimeBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SystemTimeProtos.SESystemTime.getDefaultInstance()) {
                        this.payload_ = sESystemTime;
                    } else {
                        this.payload_ = SystemTimeProtos.SESystemTime.newBuilder((SystemTimeProtos.SESystemTime) this.payload_).mergeFrom(sESystemTime).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sESystemTime);
                } else {
                    singleFieldBuilder.setMessage(sESystemTime);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeUserSettings(UserProfilesProtos.SEUserSettings sEUserSettings) {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == UserProfilesProtos.SEUserSettings.getDefaultInstance()) {
                        this.payload_ = sEUserSettings;
                    } else {
                        this.payload_ = UserProfilesProtos.SEUserSettings.newBuilder((UserProfilesProtos.SEUserSettings) this.payload_).mergeFrom(sEUserSettings).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEUserSettings);
                } else {
                    singleFieldBuilder.setMessage(sEUserSettings);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setAiFunction(AIFunctionProtos.SEAIFunction sEAIFunction) {
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder = this.aiFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    sEAIFunction.getClass();
                    this.payload_ = sEAIFunction;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEAIFunction);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder setAleax(AlexaProtos.SEAleax sEAleax) {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
                if (singleFieldBuilder == null) {
                    sEAleax.getClass();
                    this.payload_ = sEAleax;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEAleax);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder setBindAccount(BindAccountProtos.SEBindAccount sEBindAccount) {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
                if (singleFieldBuilder == null) {
                    sEBindAccount.getClass();
                    this.payload_ = sEBindAccount;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBindAccount);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setBleConnectParmeterConfig(CommonProtos.SEBLEConnectParameterConfig sEBLEConnectParameterConfig) {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder = this.bleConnectParmeterConfigBuilder_;
                if (singleFieldBuilder == null) {
                    sEBLEConnectParameterConfig.getClass();
                    this.payload_ = sEBLEConnectParameterConfig;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBLEConnectParameterConfig);
                }
                this.payloadCase_ = 99;
                return this;
            }

            public Builder setChangeMtu(int i7) {
                this.payloadCase_ = 3;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setChildren(ChildrenProtos.SEChildren sEChildren) {
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder = this.childrenBuilder_;
                if (singleFieldBuilder == null) {
                    sEChildren.getClass();
                    this.payload_ = sEChildren;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEChildren);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setDevice(DeviceProtos.SEDevice sEDevice) {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
                if (singleFieldBuilder == null) {
                    sEDevice.getClass();
                    this.payload_ = sEDevice;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEDevice);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setErrorCode(CommonProtos.SEErrorCode sEErrorCode) {
                sEErrorCode.getClass();
                this.payloadCase_ = 100;
                this.payload_ = Integer.valueOf(sEErrorCode.getNumber());
                onChanged();
                return this;
            }

            public Builder setFactory(FactoryProtos.SEFactory sEFactory) {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder = this.factoryBuilder_;
                if (singleFieldBuilder == null) {
                    sEFactory.getClass();
                    this.payload_ = sEFactory;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEFactory);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setFitness(FitnessProtos.SEFitness sEFitness) {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder = this.fitnessBuilder_;
                if (singleFieldBuilder == null) {
                    sEFitness.getClass();
                    this.payload_ = sEFitness;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEFitness);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setGnss(SA_GnssProtos.SEGnss sEGnss) {
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder = this.gnssBuilder_;
                if (singleFieldBuilder == null) {
                    sEGnss.getClass();
                    this.payload_ = sEGnss;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEGnss);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setId(int i7) {
                this.id_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMicroFunction(MicroFunctionProtos.SEMicroFunction sEMicroFunction) {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    sEMicroFunction.getClass();
                    this.payload_ = sEMicroFunction;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEMicroFunction);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setMusic(MusicProtos.SEMusic sEMusic) {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
                if (singleFieldBuilder == null) {
                    sEMusic.getClass();
                    this.payload_ = sEMusic;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEMusic);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setNewWatchFace(SA_WatchFaceProtos.SAWatchFace sAWatchFace) {
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder = this.newWatchFaceBuilder_;
                if (singleFieldBuilder == null) {
                    sAWatchFace.getClass();
                    this.payload_ = sAWatchFace;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAWatchFace);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder setNewWeather(SA_WeatherProtos.SAweather sAweather) {
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder = this.newWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    sAweather.getClass();
                    this.payload_ = sAweather;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sAweather);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setNotification(NotificationProtos.SENotification sENotification) {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
                if (singleFieldBuilder == null) {
                    sENotification.getClass();
                    this.payload_ = sENotification;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sENotification);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setSettingMenu(SettingMenuProtos.SESettingMenu sESettingMenu) {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
                if (singleFieldBuilder == null) {
                    sESettingMenu.getClass();
                    this.payload_ = sESettingMenu;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESettingMenu);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setSporting(SportingProtos.SESporting sESporting) {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder = this.sportingBuilder_;
                if (singleFieldBuilder == null) {
                    sESporting.getClass();
                    this.payload_ = sESporting;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESporting);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setSystemTime(SystemTimeProtos.SESystemTime sESystemTime) {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder = this.systemTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sESystemTime.getClass();
                    this.payload_ = sESystemTime;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESystemTime);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 1;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            public Builder setUserSettings(UserProfilesProtos.SEUserSettings sEUserSettings) {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
                if (singleFieldBuilder == null) {
                    sEUserSettings.getClass();
                    this.payload_ = sEUserSettings;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEUserSettings);
                }
                this.payloadCase_ = 7;
                return this;
            }

            private Builder() {
                this.payloadCase_ = 0;
                this.type_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWear build() {
                SEWear sEWearBuildPartial = buildPartial();
                if (sEWearBuildPartial.isInitialized()) {
                    return sEWearBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWearBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWear buildPartial() {
                SEWear sEWear = new SEWear(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWear);
                }
                buildPartialOneofs(sEWear);
                onBuilt();
                return sEWear;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWear getDefaultInstanceForType() {
                return SEWear.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.id_ = 0;
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder2 = this.deviceBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder3 = this.systemTimeBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder4 = this.userSettingsBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder5 = this.sportingBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder6 = this.fitnessBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder7 = this.gnssBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder8 = this.microFunctionBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder9 = this.notificationBuilder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder10 = this.musicBuilder_;
                if (singleFieldBuilder10 != null) {
                    singleFieldBuilder10.clear();
                }
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder11 = this.settingMenuBuilder_;
                if (singleFieldBuilder11 != null) {
                    singleFieldBuilder11.clear();
                }
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder12 = this.factoryBuilder_;
                if (singleFieldBuilder12 != null) {
                    singleFieldBuilder12.clear();
                }
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder13 = this.aleaxBuilder_;
                if (singleFieldBuilder13 != null) {
                    singleFieldBuilder13.clear();
                }
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder14 = this.newWatchFaceBuilder_;
                if (singleFieldBuilder14 != null) {
                    singleFieldBuilder14.clear();
                }
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder15 = this.newWeatherBuilder_;
                if (singleFieldBuilder15 != null) {
                    singleFieldBuilder15.clear();
                }
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder16 = this.childrenBuilder_;
                if (singleFieldBuilder16 != null) {
                    singleFieldBuilder16.clear();
                }
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder17 = this.aiFunctionBuilder_;
                if (singleFieldBuilder17 != null) {
                    singleFieldBuilder17.clear();
                }
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder18 = this.bleConnectParmeterConfigBuilder_;
                if (singleFieldBuilder18 != null) {
                    singleFieldBuilder18.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                this.type_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWear) {
                    return mergeFrom((SEWear) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAiFunction(AIFunctionProtos.SEAIFunction.Builder builder) {
                SingleFieldBuilder<AIFunctionProtos.SEAIFunction, AIFunctionProtos.SEAIFunction.Builder, AIFunctionProtos.SEAIFunctionOrBuilder> singleFieldBuilder = this.aiFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder setAleax(AlexaProtos.SEAleax.Builder builder) {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder setBindAccount(BindAccountProtos.SEBindAccount.Builder builder) {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setBleConnectParmeterConfig(CommonProtos.SEBLEConnectParameterConfig.Builder builder) {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder = this.bleConnectParmeterConfigBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 99;
                return this;
            }

            public Builder setChildren(ChildrenProtos.SEChildren.Builder builder) {
                SingleFieldBuilder<ChildrenProtos.SEChildren, ChildrenProtos.SEChildren.Builder, ChildrenProtos.SEChildrenOrBuilder> singleFieldBuilder = this.childrenBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setDevice(DeviceProtos.SEDevice.Builder builder) {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setFactory(FactoryProtos.SEFactory.Builder builder) {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder = this.factoryBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setFitness(FitnessProtos.SEFitness.Builder builder) {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder = this.fitnessBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setGnss(SA_GnssProtos.SEGnss.Builder builder) {
                SingleFieldBuilder<SA_GnssProtos.SEGnss, SA_GnssProtos.SEGnss.Builder, SA_GnssProtos.SEGnssOrBuilder> singleFieldBuilder = this.gnssBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setMicroFunction(MicroFunctionProtos.SEMicroFunction.Builder builder) {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setMusic(MusicProtos.SEMusic.Builder builder) {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setNewWatchFace(SA_WatchFaceProtos.SAWatchFace.Builder builder) {
                SingleFieldBuilder<SA_WatchFaceProtos.SAWatchFace, SA_WatchFaceProtos.SAWatchFace.Builder, SA_WatchFaceProtos.SAWatchFaceOrBuilder> singleFieldBuilder = this.newWatchFaceBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder setNewWeather(SA_WeatherProtos.SAweather.Builder builder) {
                SingleFieldBuilder<SA_WeatherProtos.SAweather, SA_WeatherProtos.SAweather.Builder, SA_WeatherProtos.SAweatherOrBuilder> singleFieldBuilder = this.newWeatherBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setNotification(NotificationProtos.SENotification.Builder builder) {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setSettingMenu(SettingMenuProtos.SESettingMenu.Builder builder) {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setSporting(SportingProtos.SESporting.Builder builder) {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder = this.sportingBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setSystemTime(SystemTimeProtos.SESystemTime.Builder builder) {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder = this.systemTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setUserSettings(UserProfilesProtos.SEUserSettings.Builder builder) {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeFrom(SEWear sEWear) {
                if (sEWear == SEWear.getDefaultInstance()) {
                    return this;
                }
                if (sEWear.hasType()) {
                    setType(sEWear.getType());
                }
                if (sEWear.hasId()) {
                    setId(sEWear.getId());
                }
                switch (sEWear.getPayloadCase()) {
                    case CHANGE_MTU:
                        setChangeMtu(sEWear.getChangeMtu());
                        break;
                    case BIND_ACCOUNT:
                        mergeBindAccount(sEWear.getBindAccount());
                        break;
                    case DEVICE:
                        mergeDevice(sEWear.getDevice());
                        break;
                    case SYSTEM_TIME:
                        mergeSystemTime(sEWear.getSystemTime());
                        break;
                    case USER_SETTINGS:
                        mergeUserSettings(sEWear.getUserSettings());
                        break;
                    case SPORTING:
                        mergeSporting(sEWear.getSporting());
                        break;
                    case FITNESS:
                        mergeFitness(sEWear.getFitness());
                        break;
                    case GNSS:
                        mergeGnss(sEWear.getGnss());
                        break;
                    case MICRO_FUNCTION:
                        mergeMicroFunction(sEWear.getMicroFunction());
                        break;
                    case NOTIFICATION:
                        mergeNotification(sEWear.getNotification());
                        break;
                    case MUSIC:
                        mergeMusic(sEWear.getMusic());
                        break;
                    case SETTING_MENU:
                        mergeSettingMenu(sEWear.getSettingMenu());
                        break;
                    case FACTORY:
                        mergeFactory(sEWear.getFactory());
                        break;
                    case ALEAX:
                        mergeAleax(sEWear.getAleax());
                        break;
                    case NEW_WATCHFACE:
                        mergeNewWatchFace(sEWear.getNewWatchFace());
                        break;
                    case NEW_WEATHER:
                        mergeNewWeather(sEWear.getNewWeather());
                        break;
                    case CHILDREN:
                        mergeChildren(sEWear.getChildren());
                        break;
                    case AI_FUNCTION:
                        mergeAiFunction(sEWear.getAiFunction());
                        break;
                    case BLE_CONNECT_PARMETER_CONFIG:
                        mergeBleConnectParmeterConfig(sEWear.getBleConnectParmeterConfig());
                        break;
                    case ERROR_CODE:
                        setErrorCode(sEWear.getErrorCode());
                        break;
                }
                mergeUnknownFields(sEWear.getUnknownFields());
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
                                    int i7 = codedInputStream.readEnum();
                                    if (Type.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.type_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                    break;
                                case 16:
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    break;
                                case 24:
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 3;
                                    break;
                                case 34:
                                    codedInputStream.readMessage(internalGetBindAccountFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                    break;
                                case 42:
                                    codedInputStream.readMessage(internalGetDeviceFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetSystemTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetUserSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                    break;
                                case 66:
                                    codedInputStream.readMessage(internalGetSportingFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(internalGetFitnessFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 9;
                                    break;
                                case 82:
                                    codedInputStream.readMessage(internalGetGnssFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 10;
                                    break;
                                case 90:
                                    codedInputStream.readMessage(internalGetMicroFunctionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 11;
                                    break;
                                case 98:
                                    codedInputStream.readMessage(internalGetNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 12;
                                    break;
                                case 106:
                                    codedInputStream.readMessage(internalGetMusicFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 13;
                                    break;
                                case 114:
                                    codedInputStream.readMessage(internalGetSettingMenuFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 14;
                                    break;
                                case 122:
                                    codedInputStream.readMessage(internalGetFactoryFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 15;
                                    break;
                                case 130:
                                    codedInputStream.readMessage(internalGetAleaxFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 16;
                                    break;
                                case 138:
                                    codedInputStream.readMessage(internalGetNewWatchFaceFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 17;
                                    break;
                                case 146:
                                    codedInputStream.readMessage(internalGetNewWeatherFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 18;
                                    break;
                                case 154:
                                    codedInputStream.readMessage(internalGetChildrenFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 19;
                                    break;
                                case 162:
                                    codedInputStream.readMessage(internalGetAiFunctionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 20;
                                    break;
                                case DataBinderMapperImpl.ne /* 794 */:
                                    codedInputStream.readMessage(internalGetBleConnectParmeterConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 99;
                                    break;
                                case 800:
                                    int i8 = codedInputStream.readEnum();
                                    if (CommonProtos.SEErrorCode.forNumber(i8) == null) {
                                        mergeUnknownVarintField(100, i8);
                                    } else {
                                        this.payloadCase_ = 100;
                                        this.payload_ = Integer.valueOf(i8);
                                    }
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

        private SEWear(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.type_ = 0;
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWear sEWear) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWear);
        }

        public static SEWear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWear) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWear parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWear getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWear parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWear parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEWear() {
            this.payloadCase_ = 0;
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static SEWear parseFrom(InputStream inputStream) {
            return (SEWear) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWear) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWear parseFrom(CodedInputStream codedInputStream) {
            return (SEWear) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWear) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWearOrBuilder extends MessageOrBuilder {
        AIFunctionProtos.SEAIFunction getAiFunction();

        AIFunctionProtos.SEAIFunctionOrBuilder getAiFunctionOrBuilder();

        AlexaProtos.SEAleax getAleax();

        AlexaProtos.SEAleaxOrBuilder getAleaxOrBuilder();

        BindAccountProtos.SEBindAccount getBindAccount();

        BindAccountProtos.SEBindAccountOrBuilder getBindAccountOrBuilder();

        CommonProtos.SEBLEConnectParameterConfig getBleConnectParmeterConfig();

        CommonProtos.SEBLEConnectParameterConfigOrBuilder getBleConnectParmeterConfigOrBuilder();

        int getChangeMtu();

        ChildrenProtos.SEChildren getChildren();

        ChildrenProtos.SEChildrenOrBuilder getChildrenOrBuilder();

        DeviceProtos.SEDevice getDevice();

        DeviceProtos.SEDeviceOrBuilder getDeviceOrBuilder();

        CommonProtos.SEErrorCode getErrorCode();

        FactoryProtos.SEFactory getFactory();

        FactoryProtos.SEFactoryOrBuilder getFactoryOrBuilder();

        FitnessProtos.SEFitness getFitness();

        FitnessProtos.SEFitnessOrBuilder getFitnessOrBuilder();

        SA_GnssProtos.SEGnss getGnss();

        SA_GnssProtos.SEGnssOrBuilder getGnssOrBuilder();

        int getId();

        MicroFunctionProtos.SEMicroFunction getMicroFunction();

        MicroFunctionProtos.SEMicroFunctionOrBuilder getMicroFunctionOrBuilder();

        MusicProtos.SEMusic getMusic();

        MusicProtos.SEMusicOrBuilder getMusicOrBuilder();

        SA_WatchFaceProtos.SAWatchFace getNewWatchFace();

        SA_WatchFaceProtos.SAWatchFaceOrBuilder getNewWatchFaceOrBuilder();

        SA_WeatherProtos.SAweather getNewWeather();

        SA_WeatherProtos.SAweatherOrBuilder getNewWeatherOrBuilder();

        NotificationProtos.SENotification getNotification();

        NotificationProtos.SENotificationOrBuilder getNotificationOrBuilder();

        SEWear.PayloadCase getPayloadCase();

        SettingMenuProtos.SESettingMenu getSettingMenu();

        SettingMenuProtos.SESettingMenuOrBuilder getSettingMenuOrBuilder();

        SportingProtos.SESporting getSporting();

        SportingProtos.SESportingOrBuilder getSportingOrBuilder();

        SystemTimeProtos.SESystemTime getSystemTime();

        SystemTimeProtos.SESystemTimeOrBuilder getSystemTimeOrBuilder();

        SEWear.Type getType();

        UserProfilesProtos.SEUserSettings getUserSettings();

        UserProfilesProtos.SEUserSettingsOrBuilder getUserSettingsOrBuilder();

        boolean hasAiFunction();

        boolean hasAleax();

        boolean hasBindAccount();

        boolean hasBleConnectParmeterConfig();

        boolean hasChangeMtu();

        boolean hasChildren();

        boolean hasDevice();

        boolean hasErrorCode();

        boolean hasFactory();

        boolean hasFitness();

        boolean hasGnss();

        boolean hasId();

        boolean hasMicroFunction();

        boolean hasMusic();

        boolean hasNewWatchFace();

        boolean hasNewWeather();

        boolean hasNotification();

        boolean hasSettingMenu();

        boolean hasSporting();

        boolean hasSystemTime();

        boolean hasType();

        boolean hasUserSettings();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "WearProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rsa_Wear.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\u001a\u0014sa_BindAccount.proto\u001a\u000fsa_Device.proto\u001a\u0010sa_Fitness.proto\u001a\u0012sa_wear_gnss.proto\u001a\u0016sa_MicroFunction.proto\u001a\u0014sa_SettingMenu.proto\u001a\u000esa_Music.proto\u001a\u0015sa_Notification.proto\u001a\u0011sa_Sporting.proto\u001a\u0013sa_SystemTime.proto\u001a\u0015sa_UserSettings.proto\u001a\u0010sa_Factory.proto\u001a\u000esa_Alexa.proto\u001a\u0018sa_wear_watch_face.proto\u001a\u0015sa_wear_weather.proto\u001a\u0011sa_Children.proto\u001a\u0013sa_AIFunction.proto\"é\b\n\u0006SEWear\u0012\u001d\n\u0004type\u0018\u0001 \u0002(\u000e2\u000f.SA.SEWear.Type\u0012\u0011\n\u0002id\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u001b\n\nchange_mtu\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\u0010H\u0000\u0012)\n\fbind_account\u0018\u0004 \u0001(\u000b2\u0011.SA.SEBindAccountH\u0000\u0012\u001e\n\u0006device\u0018\u0005 \u0001(\u000b2\f.SA.SEDeviceH\u0000\u0012'\n\u000bsystem_time\u0018\u0006 \u0001(\u000b2\u0010.SA.SESystemTimeH\u0000\u0012+\n\ruser_settings\u0018\u0007 \u0001(\u000b2\u0012.SA.SEUserSettingsH\u0000\u0012\"\n\bsporting\u0018\b \u0001(\u000b2\u000e.SA.SESportingH\u0000\u0012 \n\u0007fitness\u0018\t \u0001(\u000b2\r.SA.SEFitnessH\u0000\u0012\u001a\n\u0004gnss\u0018\n \u0001(\u000b2\n.SA.SEGnssH\u0000\u0012-\n\u000emicro_function\u0018\u000b \u0001(\u000b2\u0013.SA.SEMicroFunctionH\u0000\u0012*\n\fnotification\u0018\f \u0001(\u000b2\u0012.SA.SENotificationH\u0000\u0012\u001c\n\u0005music\u0018\r \u0001(\u000b2\u000b.SA.SEMusicH\u0000\u0012)\n\fsetting_menu\u0018\u000e \u0001(\u000b2\u0011.SA.SESettingMenuH\u0000\u0012 \n\u0007factory\u0018\u000f \u0001(\u000b2\r.SA.SEFactoryH\u0000\u0012\u001c\n\u0005aleax\u0018\u0010 \u0001(\u000b2\u000b.SA.SEAleaxH\u0000\u0012(\n\rnew_WatchFace\u0018\u0011 \u0001(\u000b2\u000f.SA.SAWatchFaceH\u0000\u0012$\n\u000bnew_Weather\u0018\u0012 \u0001(\u000b2\r.SA.SAweatherH\u0000\u0012\"\n\bchildren\u0018\u0013 \u0001(\u000b2\u000e.SA.SEChildrenH\u0000\u0012'\n\u000bai_function\u0018\u0014 \u0001(\u000b2\u0010.SA.SEAIFunctionH\u0000\u0012F\n\u001bble_connect_parmeter_config\u0018c \u0001(\u000b2\u001f.SA.SEBLEConnectParameterConfigH\u0000\u0012%\n\nerror_code\u0018d \u0001(\u000e2\u000f.SA.SEErrorCodeH\u0000\"\u0091\u0002\n\u0004Type\u0012\t\n\u0005OTHER\u0010\u0000\u0012\u000b\n\u0007ACCOUNT\u0010\u0001\u0012\n\n\u0006DEVICE\u0010\u0002\u0012\u000f\n\u000bSYSTEM_TIME\u0010\u0003\u0012\u0011\n\rUSER_SETTINGS\u0010\u0004\u0012\f\n\bSPORTING\u0010\u0005\u0012\u000b\n\u0007FITNESS\u0010\u0006\u0012\b\n\u0004GNSS\u0010\u0007\u0012\u0012\n\u000eMICRO_FUNCTION\u0010\b\u0012\u0010\n\fNOTIFICATION\u0010\t\u0012\t\n\u0005MUSIC\u0010\n\u0012\u0010\n\fSETTING_MENU\u0010\u000b\u0012\u000b\n\u0007FACTORY\u0010\f\u0012\t\n\u0005ALEAX\u0010\r\u0012\u0012\n\u000eNEW_WATCH_FACE\u0010\u000e\u0012\u000f\n\u000bNEW_WEATHER\u0010\u000f\u0012\f\n\bCHILDREN\u0010\u0010\u0012\u000e\n\nAIFUNCTION\u0010\u0011B\t\n\u0007payloadB0\n\u001bcom.zh.ble.sa_wear.protobufB\nWearProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor(), BindAccountProtos.getDescriptor(), DeviceProtos.getDescriptor(), FitnessProtos.getDescriptor(), SA_GnssProtos.getDescriptor(), MicroFunctionProtos.getDescriptor(), SettingMenuProtos.getDescriptor(), MusicProtos.getDescriptor(), NotificationProtos.getDescriptor(), SportingProtos.getDescriptor(), SystemTimeProtos.getDescriptor(), UserProfilesProtos.getDescriptor(), FactoryProtos.getDescriptor(), AlexaProtos.getDescriptor(), SA_WatchFaceProtos.getDescriptor(), SA_WeatherProtos.getDescriptor(), ChildrenProtos.getDescriptor(), AIFunctionProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEWear_descriptor = messageType;
        internal_static_SA_SEWear_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"Type", "Id", "ChangeMtu", "BindAccount", "Device", "SystemTime", "UserSettings", "Sporting", "Fitness", "Gnss", "MicroFunction", "Notification", MusicController.f193292j, "SettingMenu", "Factory", "Aleax", "NewWatchFace", "NewWeather", "Children", "AiFunction", "BleConnectParmeterConfig", "ErrorCode", "Payload"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        BindAccountProtos.getDescriptor();
        DeviceProtos.getDescriptor();
        FitnessProtos.getDescriptor();
        SA_GnssProtos.getDescriptor();
        MicroFunctionProtos.getDescriptor();
        SettingMenuProtos.getDescriptor();
        MusicProtos.getDescriptor();
        NotificationProtos.getDescriptor();
        SportingProtos.getDescriptor();
        SystemTimeProtos.getDescriptor();
        UserProfilesProtos.getDescriptor();
        FactoryProtos.getDescriptor();
        AlexaProtos.getDescriptor();
        SA_WatchFaceProtos.getDescriptor();
        SA_WeatherProtos.getDescriptor();
        ChildrenProtos.getDescriptor();
        AIFunctionProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private WearProtos() {
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