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
import com.topstep.wearkit.base.utils.media.MusicController;
import com.zh.ble.wear.protobuf.AlexaProtos;
import com.zh.ble.wear.protobuf.BindAccountProtos;
import com.zh.ble.wear.protobuf.CommonProtos;
import com.zh.ble.wear.protobuf.DeviceProtos;
import com.zh.ble.wear.protobuf.FactoryProtos;
import com.zh.ble.wear.protobuf.FitnessProtos;
import com.zh.ble.wear.protobuf.LargeFileProtos;
import com.zh.ble.wear.protobuf.MicroFunctionProtos;
import com.zh.ble.wear.protobuf.MusicProtos;
import com.zh.ble.wear.protobuf.NotificationProtos;
import com.zh.ble.wear.protobuf.SettingMenuProtos;
import com.zh.ble.wear.protobuf.SportingProtos;
import com.zh.ble.wear.protobuf.SystemTimeProtos;
import com.zh.ble.wear.protobuf.UserProfilesProtos;
import com.zh.ble.wear.protobuf.WatchFaceProtos;
import com.zh.ble.wear.protobuf.WeatherProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class WearProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEWear_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWear_fieldAccessorTable;

    public static final class SEWear extends GeneratedMessage implements SEWearOrBuilder {
        public static final int ALEAX_FIELD_NUMBER = 17;
        public static final int BIND_ACCOUNT_FIELD_NUMBER = 3;
        public static final int BLE_CONNECT_PARMETER_CONFIG_FIELD_NUMBER = 99;
        public static final int CHANGE_MTU_FIELD_NUMBER = 2;
        private static final SEWear DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 4;
        public static final int ERROR_CODE_FIELD_NUMBER = 100;
        public static final int FACTORY_FIELD_NUMBER = 16;
        public static final int FITNESS_FIELD_NUMBER = 9;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LARGE_FILE_FIELD_NUMBER = 11;
        public static final int MICRO_FUNCTION_FIELD_NUMBER = 12;
        public static final int MUSIC_FIELD_NUMBER = 14;
        public static final int NOTIFICATION_FIELD_NUMBER = 13;
        private static final Parser<SEWear> PARSER;
        public static final int SETTING_MENU_FIELD_NUMBER = 15;
        public static final int SPORTING_FIELD_NUMBER = 8;
        public static final int SYSTEM_TIME_FIELD_NUMBER = 5;
        public static final int USER_SETTINGS_FIELD_NUMBER = 6;
        public static final int WATCH_FACE_FIELD_NUMBER = 7;
        public static final int WEASETHER_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WearProtos$SEWear$1 */
        public class AnonymousClass1 extends AbstractParser<SEWear> {
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
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWearOrBuilder {
            private SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> aleaxBuilder_;
            private SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> bindAccountBuilder_;
            private int bitField0_;
            private SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> bleConnectParmeterConfigBuilder_;
            private SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> deviceBuilder_;
            private SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> factoryBuilder_;
            private SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> fitnessBuilder_;
            private int id_;
            private SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> largeFileBuilder_;
            private SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> microFunctionBuilder_;
            private SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> musicBuilder_;
            private SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> notificationBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> settingMenuBuilder_;
            private SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> sportingBuilder_;
            private SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> systemTimeBuilder_;
            private SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> userSettingsBuilder_;
            private SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> watchFaceBuilder_;
            private SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> weasetherBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, q qVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWear sEWear) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sEWear.id_ = this.id_;
                } else {
                    i7 = 0;
                }
                sEWear.bitField0_ |= i7;
            }

            private void buildPartialOneofs(SEWear sEWear) {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder9;
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder10;
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder11;
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder12;
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder13;
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder14;
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder15;
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder16;
                int i7 = this.payloadCase_;
                sEWear.payloadCase_ = i7;
                sEWear.payload_ = this.payload_;
                if (i7 == 3 && (singleFieldBuilder16 = this.bindAccountBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder16.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder15 = this.deviceBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder15.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder14 = this.systemTimeBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder14.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder13 = this.userSettingsBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder13.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder12 = this.watchFaceBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder12.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder11 = this.sportingBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder11.build();
                }
                if (this.payloadCase_ == 9 && (singleFieldBuilder10 = this.fitnessBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder10.build();
                }
                if (this.payloadCase_ == 10 && (singleFieldBuilder9 = this.weasetherBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 11 && (singleFieldBuilder8 = this.largeFileBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 12 && (singleFieldBuilder7 = this.microFunctionBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 13 && (singleFieldBuilder6 = this.notificationBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 14 && (singleFieldBuilder5 = this.musicBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 15 && (singleFieldBuilder4 = this.settingMenuBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 16 && (singleFieldBuilder3 = this.factoryBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 17 && (singleFieldBuilder2 = this.aleaxBuilder_) != null) {
                    sEWear.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 99 || (singleFieldBuilder = this.bleConnectParmeterConfigBuilder_) == null) {
                    return;
                }
                sEWear.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WearProtos.internal_static_SEWear_descriptor;
            }

            private SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> internalGetAleaxFieldBuilder() {
                if (this.aleaxBuilder_ == null) {
                    if (this.payloadCase_ != 17) {
                        this.payload_ = AlexaProtos.SEAleax.getDefaultInstance();
                    }
                    this.aleaxBuilder_ = new SingleFieldBuilder<>((AlexaProtos.SEAleax) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 17;
                onChanged();
                return this.aleaxBuilder_;
            }

            private SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> internalGetBindAccountFieldBuilder() {
                if (this.bindAccountBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = BindAccountProtos.SEBindAccount.getDefaultInstance();
                    }
                    this.bindAccountBuilder_ = new SingleFieldBuilder<>((BindAccountProtos.SEBindAccount) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
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

            private SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> internalGetDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = DeviceProtos.SEDevice.getDefaultInstance();
                    }
                    this.deviceBuilder_ = new SingleFieldBuilder<>((DeviceProtos.SEDevice) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.deviceBuilder_;
            }

            private SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> internalGetFactoryFieldBuilder() {
                if (this.factoryBuilder_ == null) {
                    if (this.payloadCase_ != 16) {
                        this.payload_ = FactoryProtos.SEFactory.getDefaultInstance();
                    }
                    this.factoryBuilder_ = new SingleFieldBuilder<>((FactoryProtos.SEFactory) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 16;
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

            private SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> internalGetLargeFileFieldBuilder() {
                if (this.largeFileBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = LargeFileProtos.SELargeFile.getDefaultInstance();
                    }
                    this.largeFileBuilder_ = new SingleFieldBuilder<>((LargeFileProtos.SELargeFile) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.largeFileBuilder_;
            }

            private SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> internalGetMicroFunctionFieldBuilder() {
                if (this.microFunctionBuilder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
                    }
                    this.microFunctionBuilder_ = new SingleFieldBuilder<>((MicroFunctionProtos.SEMicroFunction) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.microFunctionBuilder_;
            }

            private SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> internalGetMusicFieldBuilder() {
                if (this.musicBuilder_ == null) {
                    if (this.payloadCase_ != 14) {
                        this.payload_ = MusicProtos.SEMusic.getDefaultInstance();
                    }
                    this.musicBuilder_ = new SingleFieldBuilder<>((MusicProtos.SEMusic) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 14;
                onChanged();
                return this.musicBuilder_;
            }

            private SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> internalGetNotificationFieldBuilder() {
                if (this.notificationBuilder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = NotificationProtos.SENotification.getDefaultInstance();
                    }
                    this.notificationBuilder_ = new SingleFieldBuilder<>((NotificationProtos.SENotification) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.notificationBuilder_;
            }

            private SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> internalGetSettingMenuFieldBuilder() {
                if (this.settingMenuBuilder_ == null) {
                    if (this.payloadCase_ != 15) {
                        this.payload_ = SettingMenuProtos.SESettingMenu.getDefaultInstance();
                    }
                    this.settingMenuBuilder_ = new SingleFieldBuilder<>((SettingMenuProtos.SESettingMenu) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 15;
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
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SystemTimeProtos.SESystemTime.getDefaultInstance();
                    }
                    this.systemTimeBuilder_ = new SingleFieldBuilder<>((SystemTimeProtos.SESystemTime) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.systemTimeBuilder_;
            }

            private SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> internalGetUserSettingsFieldBuilder() {
                if (this.userSettingsBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = UserProfilesProtos.SEUserSettings.getDefaultInstance();
                    }
                    this.userSettingsBuilder_ = new SingleFieldBuilder<>((UserProfilesProtos.SEUserSettings) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.userSettingsBuilder_;
            }

            private SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> internalGetWatchFaceFieldBuilder() {
                if (this.watchFaceBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = WatchFaceProtos.SEWatchFace.getDefaultInstance();
                    }
                    this.watchFaceBuilder_ = new SingleFieldBuilder<>((WatchFaceProtos.SEWatchFace) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.watchFaceBuilder_;
            }

            private SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> internalGetWeasetherFieldBuilder() {
                if (this.weasetherBuilder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = WeatherProtos.SEWeather.getDefaultInstance();
                    }
                    this.weasetherBuilder_ = new SingleFieldBuilder<>((WeatherProtos.SEWeather) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.weasetherBuilder_;
            }

            public Builder clearAleax() {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
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

            public Builder clearBindAccount() {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
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
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearDevice() {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
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

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLargeFile() {
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder = this.largeFileBuilder_;
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

            public Builder clearMicroFunction() {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
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

            public Builder clearMusic() {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
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

            public Builder clearNotification() {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearSettingMenu() {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
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

            public Builder clearUserSettings() {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
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

            public Builder clearWatchFace() {
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder = this.watchFaceBuilder_;
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

            public Builder clearWeasether() {
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder = this.weasetherBuilder_;
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

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public AlexaProtos.SEAleax getAleax() {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 17 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance() : this.payloadCase_ == 17 ? (AlexaProtos.SEAleax) singleFieldBuilder.getMessage() : AlexaProtos.SEAleax.getDefaultInstance();
            }

            public AlexaProtos.SEAleax.Builder getAleaxBuilder() {
                return (AlexaProtos.SEAleax.Builder) internalGetAleaxFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public AlexaProtos.SEAleaxOrBuilder getAleaxOrBuilder() {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 17 || (singleFieldBuilder = this.aleaxBuilder_) == null) ? i7 == 17 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance() : (AlexaProtos.SEAleaxOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public BindAccountProtos.SEBindAccount getBindAccount() {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance() : this.payloadCase_ == 3 ? (BindAccountProtos.SEBindAccount) singleFieldBuilder.getMessage() : BindAccountProtos.SEBindAccount.getDefaultInstance();
            }

            public BindAccountProtos.SEBindAccount.Builder getBindAccountBuilder() {
                return (BindAccountProtos.SEBindAccount.Builder) internalGetBindAccountFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public BindAccountProtos.SEBindAccountOrBuilder getBindAccountOrBuilder() {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.bindAccountBuilder_) == null) ? i7 == 3 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance() : (BindAccountProtos.SEBindAccountOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public CommonProtos.SEBLEConnectParameterConfig getBleConnectParmeterConfig() {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder = this.bleConnectParmeterConfigBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance() : this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) singleFieldBuilder.getMessage() : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance();
            }

            public CommonProtos.SEBLEConnectParameterConfig.Builder getBleConnectParmeterConfigBuilder() {
                return (CommonProtos.SEBLEConnectParameterConfig.Builder) internalGetBleConnectParmeterConfigFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public CommonProtos.SEBLEConnectParameterConfigOrBuilder getBleConnectParmeterConfigOrBuilder() {
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 99 || (singleFieldBuilder = this.bleConnectParmeterConfigBuilder_) == null) ? i7 == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance() : (CommonProtos.SEBLEConnectParameterConfigOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public int getChangeMtu() {
                if (this.payloadCase_ == 2) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WearProtos.internal_static_SEWear_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public DeviceProtos.SEDevice getDevice() {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance() : this.payloadCase_ == 4 ? (DeviceProtos.SEDevice) singleFieldBuilder.getMessage() : DeviceProtos.SEDevice.getDefaultInstance();
            }

            public DeviceProtos.SEDevice.Builder getDeviceBuilder() {
                return (DeviceProtos.SEDevice.Builder) internalGetDeviceFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public DeviceProtos.SEDeviceOrBuilder getDeviceOrBuilder() {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.deviceBuilder_) == null) ? i7 == 4 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance() : (DeviceProtos.SEDeviceOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public CommonProtos.SEErrorCode getErrorCode() {
                CommonProtos.SEErrorCode sEErrorCodeForNumber;
                return (this.payloadCase_ != 100 || (sEErrorCodeForNumber = CommonProtos.SEErrorCode.forNumber(((Integer) this.payload_).intValue())) == null) ? CommonProtos.SEErrorCode.NO_ERROR : sEErrorCodeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public FactoryProtos.SEFactory getFactory() {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder = this.factoryBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 16 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance() : this.payloadCase_ == 16 ? (FactoryProtos.SEFactory) singleFieldBuilder.getMessage() : FactoryProtos.SEFactory.getDefaultInstance();
            }

            public FactoryProtos.SEFactory.Builder getFactoryBuilder() {
                return (FactoryProtos.SEFactory.Builder) internalGetFactoryFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public FactoryProtos.SEFactoryOrBuilder getFactoryOrBuilder() {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 16 || (singleFieldBuilder = this.factoryBuilder_) == null) ? i7 == 16 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance() : (FactoryProtos.SEFactoryOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public FitnessProtos.SEFitness getFitness() {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder = this.fitnessBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance() : this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) singleFieldBuilder.getMessage() : FitnessProtos.SEFitness.getDefaultInstance();
            }

            public FitnessProtos.SEFitness.Builder getFitnessBuilder() {
                return (FitnessProtos.SEFitness.Builder) internalGetFitnessFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public FitnessProtos.SEFitnessOrBuilder getFitnessOrBuilder() {
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.fitnessBuilder_) == null) ? i7 == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance() : (FitnessProtos.SEFitnessOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public LargeFileProtos.SELargeFile getLargeFile() {
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder = this.largeFileBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 11 ? (LargeFileProtos.SELargeFile) this.payload_ : LargeFileProtos.SELargeFile.getDefaultInstance() : this.payloadCase_ == 11 ? (LargeFileProtos.SELargeFile) singleFieldBuilder.getMessage() : LargeFileProtos.SELargeFile.getDefaultInstance();
            }

            public LargeFileProtos.SELargeFile.Builder getLargeFileBuilder() {
                return (LargeFileProtos.SELargeFile.Builder) internalGetLargeFileFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public LargeFileProtos.SELargeFileOrBuilder getLargeFileOrBuilder() {
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilder = this.largeFileBuilder_) == null) ? i7 == 11 ? (LargeFileProtos.SELargeFile) this.payload_ : LargeFileProtos.SELargeFile.getDefaultInstance() : (LargeFileProtos.SELargeFileOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public MicroFunctionProtos.SEMicroFunction getMicroFunction() {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 12 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance() : this.payloadCase_ == 12 ? (MicroFunctionProtos.SEMicroFunction) singleFieldBuilder.getMessage() : MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
            }

            public MicroFunctionProtos.SEMicroFunction.Builder getMicroFunctionBuilder() {
                return (MicroFunctionProtos.SEMicroFunction.Builder) internalGetMicroFunctionFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public MicroFunctionProtos.SEMicroFunctionOrBuilder getMicroFunctionOrBuilder() {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilder = this.microFunctionBuilder_) == null) ? i7 == 12 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance() : (MicroFunctionProtos.SEMicroFunctionOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public MusicProtos.SEMusic getMusic() {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 14 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance() : this.payloadCase_ == 14 ? (MusicProtos.SEMusic) singleFieldBuilder.getMessage() : MusicProtos.SEMusic.getDefaultInstance();
            }

            public MusicProtos.SEMusic.Builder getMusicBuilder() {
                return (MusicProtos.SEMusic.Builder) internalGetMusicFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public MusicProtos.SEMusicOrBuilder getMusicOrBuilder() {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 14 || (singleFieldBuilder = this.musicBuilder_) == null) ? i7 == 14 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance() : (MusicProtos.SEMusicOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public NotificationProtos.SENotification getNotification() {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 13 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance() : this.payloadCase_ == 13 ? (NotificationProtos.SENotification) singleFieldBuilder.getMessage() : NotificationProtos.SENotification.getDefaultInstance();
            }

            public NotificationProtos.SENotification.Builder getNotificationBuilder() {
                return (NotificationProtos.SENotification.Builder) internalGetNotificationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public NotificationProtos.SENotificationOrBuilder getNotificationOrBuilder() {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilder = this.notificationBuilder_) == null) ? i7 == 13 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance() : (NotificationProtos.SENotificationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public SettingMenuProtos.SESettingMenu getSettingMenu() {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 15 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance() : this.payloadCase_ == 15 ? (SettingMenuProtos.SESettingMenu) singleFieldBuilder.getMessage() : SettingMenuProtos.SESettingMenu.getDefaultInstance();
            }

            public SettingMenuProtos.SESettingMenu.Builder getSettingMenuBuilder() {
                return (SettingMenuProtos.SESettingMenu.Builder) internalGetSettingMenuFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public SettingMenuProtos.SESettingMenuOrBuilder getSettingMenuOrBuilder() {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 15 || (singleFieldBuilder = this.settingMenuBuilder_) == null) ? i7 == 15 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance() : (SettingMenuProtos.SESettingMenuOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public SportingProtos.SESporting getSporting() {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder = this.sportingBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance() : this.payloadCase_ == 8 ? (SportingProtos.SESporting) singleFieldBuilder.getMessage() : SportingProtos.SESporting.getDefaultInstance();
            }

            public SportingProtos.SESporting.Builder getSportingBuilder() {
                return (SportingProtos.SESporting.Builder) internalGetSportingFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public SportingProtos.SESportingOrBuilder getSportingOrBuilder() {
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.sportingBuilder_) == null) ? i7 == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance() : (SportingProtos.SESportingOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public SystemTimeProtos.SESystemTime getSystemTime() {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder = this.systemTimeBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance() : this.payloadCase_ == 5 ? (SystemTimeProtos.SESystemTime) singleFieldBuilder.getMessage() : SystemTimeProtos.SESystemTime.getDefaultInstance();
            }

            public SystemTimeProtos.SESystemTime.Builder getSystemTimeBuilder() {
                return (SystemTimeProtos.SESystemTime.Builder) internalGetSystemTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public SystemTimeProtos.SESystemTimeOrBuilder getSystemTimeOrBuilder() {
                SingleFieldBuilder<SystemTimeProtos.SESystemTime, SystemTimeProtos.SESystemTime.Builder, SystemTimeProtos.SESystemTimeOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.systemTimeBuilder_) == null) ? i7 == 5 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance() : (SystemTimeProtos.SESystemTimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public UserProfilesProtos.SEUserSettings getUserSettings() {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance() : this.payloadCase_ == 6 ? (UserProfilesProtos.SEUserSettings) singleFieldBuilder.getMessage() : UserProfilesProtos.SEUserSettings.getDefaultInstance();
            }

            public UserProfilesProtos.SEUserSettings.Builder getUserSettingsBuilder() {
                return (UserProfilesProtos.SEUserSettings.Builder) internalGetUserSettingsFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public UserProfilesProtos.SEUserSettingsOrBuilder getUserSettingsOrBuilder() {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.userSettingsBuilder_) == null) ? i7 == 6 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance() : (UserProfilesProtos.SEUserSettingsOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public WatchFaceProtos.SEWatchFace getWatchFace() {
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder = this.watchFaceBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (WatchFaceProtos.SEWatchFace) this.payload_ : WatchFaceProtos.SEWatchFace.getDefaultInstance() : this.payloadCase_ == 7 ? (WatchFaceProtos.SEWatchFace) singleFieldBuilder.getMessage() : WatchFaceProtos.SEWatchFace.getDefaultInstance();
            }

            public WatchFaceProtos.SEWatchFace.Builder getWatchFaceBuilder() {
                return (WatchFaceProtos.SEWatchFace.Builder) internalGetWatchFaceFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public WatchFaceProtos.SEWatchFaceOrBuilder getWatchFaceOrBuilder() {
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.watchFaceBuilder_) == null) ? i7 == 7 ? (WatchFaceProtos.SEWatchFace) this.payload_ : WatchFaceProtos.SEWatchFace.getDefaultInstance() : (WatchFaceProtos.SEWatchFaceOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public WeatherProtos.SEWeather getWeasether() {
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder = this.weasetherBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 10 ? (WeatherProtos.SEWeather) this.payload_ : WeatherProtos.SEWeather.getDefaultInstance() : this.payloadCase_ == 10 ? (WeatherProtos.SEWeather) singleFieldBuilder.getMessage() : WeatherProtos.SEWeather.getDefaultInstance();
            }

            public WeatherProtos.SEWeather.Builder getWeasetherBuilder() {
                return (WeatherProtos.SEWeather.Builder) internalGetWeasetherFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public WeatherProtos.SEWeatherOrBuilder getWeasetherOrBuilder() {
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilder = this.weasetherBuilder_) == null) ? i7 == 10 ? (WeatherProtos.SEWeather) this.payload_ : WeatherProtos.SEWeather.getDefaultInstance() : (WeatherProtos.SEWeatherOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasAleax() {
                return this.payloadCase_ == 17;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasBindAccount() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasBleConnectParmeterConfig() {
                return this.payloadCase_ == 99;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasChangeMtu() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasDevice() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasErrorCode() {
                return this.payloadCase_ == 100;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasFactory() {
                return this.payloadCase_ == 16;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasFitness() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasLargeFile() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasMicroFunction() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasMusic() {
                return this.payloadCase_ == 14;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasNotification() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasSettingMenu() {
                return this.payloadCase_ == 15;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasSporting() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasSystemTime() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasUserSettings() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasWatchFace() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
            public boolean hasWeasether() {
                return this.payloadCase_ == 10;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return WearProtos.internal_static_SEWear_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWear.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
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
                if (hasWatchFace() && !getWatchFace().isInitialized()) {
                    return false;
                }
                if (hasSporting() && !getSporting().isInitialized()) {
                    return false;
                }
                if (hasFitness() && !getFitness().isInitialized()) {
                    return false;
                }
                if (hasWeasether() && !getWeasether().isInitialized()) {
                    return false;
                }
                if (hasLargeFile() && !getLargeFile().isInitialized()) {
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
                if (!hasFactory() || getFactory().isInitialized()) {
                    return !hasAleax() || getAleax().isInitialized();
                }
                return false;
            }

            public Builder mergeAleax(AlexaProtos.SEAleax sEAleax) {
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder = this.aleaxBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 17 || this.payload_ == AlexaProtos.SEAleax.getDefaultInstance()) {
                        this.payload_ = sEAleax;
                    } else {
                        this.payload_ = AlexaProtos.SEAleax.newBuilder((AlexaProtos.SEAleax) this.payload_).mergeFrom(sEAleax).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 17) {
                    singleFieldBuilder.mergeFrom(sEAleax);
                } else {
                    singleFieldBuilder.setMessage(sEAleax);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder mergeBindAccount(BindAccountProtos.SEBindAccount sEBindAccount) {
                SingleFieldBuilder<BindAccountProtos.SEBindAccount, BindAccountProtos.SEBindAccount.Builder, BindAccountProtos.SEBindAccountOrBuilder> singleFieldBuilder = this.bindAccountBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == BindAccountProtos.SEBindAccount.getDefaultInstance()) {
                        this.payload_ = sEBindAccount;
                    } else {
                        this.payload_ = BindAccountProtos.SEBindAccount.newBuilder((BindAccountProtos.SEBindAccount) this.payload_).mergeFrom(sEBindAccount).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEBindAccount);
                } else {
                    singleFieldBuilder.setMessage(sEBindAccount);
                }
                this.payloadCase_ = 3;
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

            public Builder mergeDevice(DeviceProtos.SEDevice sEDevice) {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == DeviceProtos.SEDevice.getDefaultInstance()) {
                        this.payload_ = sEDevice;
                    } else {
                        this.payload_ = DeviceProtos.SEDevice.newBuilder((DeviceProtos.SEDevice) this.payload_).mergeFrom(sEDevice).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEDevice);
                } else {
                    singleFieldBuilder.setMessage(sEDevice);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeFactory(FactoryProtos.SEFactory sEFactory) {
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder = this.factoryBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 16 || this.payload_ == FactoryProtos.SEFactory.getDefaultInstance()) {
                        this.payload_ = sEFactory;
                    } else {
                        this.payload_ = FactoryProtos.SEFactory.newBuilder((FactoryProtos.SEFactory) this.payload_).mergeFrom(sEFactory).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 16) {
                    singleFieldBuilder.mergeFrom(sEFactory);
                } else {
                    singleFieldBuilder.setMessage(sEFactory);
                }
                this.payloadCase_ = 16;
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

            public Builder mergeLargeFile(LargeFileProtos.SELargeFile sELargeFile) {
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder = this.largeFileBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 11 || this.payload_ == LargeFileProtos.SELargeFile.getDefaultInstance()) {
                        this.payload_ = sELargeFile;
                    } else {
                        this.payload_ = LargeFileProtos.SELargeFile.newBuilder((LargeFileProtos.SELargeFile) this.payload_).mergeFrom(sELargeFile).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 11) {
                    singleFieldBuilder.mergeFrom(sELargeFile);
                } else {
                    singleFieldBuilder.setMessage(sELargeFile);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeMicroFunction(MicroFunctionProtos.SEMicroFunction sEMicroFunction) {
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder = this.microFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 12 || this.payload_ == MicroFunctionProtos.SEMicroFunction.getDefaultInstance()) {
                        this.payload_ = sEMicroFunction;
                    } else {
                        this.payload_ = MicroFunctionProtos.SEMicroFunction.newBuilder((MicroFunctionProtos.SEMicroFunction) this.payload_).mergeFrom(sEMicroFunction).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 12) {
                    singleFieldBuilder.mergeFrom(sEMicroFunction);
                } else {
                    singleFieldBuilder.setMessage(sEMicroFunction);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder mergeMusic(MusicProtos.SEMusic sEMusic) {
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder = this.musicBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 14 || this.payload_ == MusicProtos.SEMusic.getDefaultInstance()) {
                        this.payload_ = sEMusic;
                    } else {
                        this.payload_ = MusicProtos.SEMusic.newBuilder((MusicProtos.SEMusic) this.payload_).mergeFrom(sEMusic).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 14) {
                    singleFieldBuilder.mergeFrom(sEMusic);
                } else {
                    singleFieldBuilder.setMessage(sEMusic);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder mergeNotification(NotificationProtos.SENotification sENotification) {
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder = this.notificationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 13 || this.payload_ == NotificationProtos.SENotification.getDefaultInstance()) {
                        this.payload_ = sENotification;
                    } else {
                        this.payload_ = NotificationProtos.SENotification.newBuilder((NotificationProtos.SENotification) this.payload_).mergeFrom(sENotification).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 13) {
                    singleFieldBuilder.mergeFrom(sENotification);
                } else {
                    singleFieldBuilder.setMessage(sENotification);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeSettingMenu(SettingMenuProtos.SESettingMenu sESettingMenu) {
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder = this.settingMenuBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 15 || this.payload_ == SettingMenuProtos.SESettingMenu.getDefaultInstance()) {
                        this.payload_ = sESettingMenu;
                    } else {
                        this.payload_ = SettingMenuProtos.SESettingMenu.newBuilder((SettingMenuProtos.SESettingMenu) this.payload_).mergeFrom(sESettingMenu).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 15) {
                    singleFieldBuilder.mergeFrom(sESettingMenu);
                } else {
                    singleFieldBuilder.setMessage(sESettingMenu);
                }
                this.payloadCase_ = 15;
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
                    if (this.payloadCase_ != 5 || this.payload_ == SystemTimeProtos.SESystemTime.getDefaultInstance()) {
                        this.payload_ = sESystemTime;
                    } else {
                        this.payload_ = SystemTimeProtos.SESystemTime.newBuilder((SystemTimeProtos.SESystemTime) this.payload_).mergeFrom(sESystemTime).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sESystemTime);
                } else {
                    singleFieldBuilder.setMessage(sESystemTime);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeUserSettings(UserProfilesProtos.SEUserSettings sEUserSettings) {
                SingleFieldBuilder<UserProfilesProtos.SEUserSettings, UserProfilesProtos.SEUserSettings.Builder, UserProfilesProtos.SEUserSettingsOrBuilder> singleFieldBuilder = this.userSettingsBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == UserProfilesProtos.SEUserSettings.getDefaultInstance()) {
                        this.payload_ = sEUserSettings;
                    } else {
                        this.payload_ = UserProfilesProtos.SEUserSettings.newBuilder((UserProfilesProtos.SEUserSettings) this.payload_).mergeFrom(sEUserSettings).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEUserSettings);
                } else {
                    singleFieldBuilder.setMessage(sEUserSettings);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeWatchFace(WatchFaceProtos.SEWatchFace sEWatchFace) {
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder = this.watchFaceBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == WatchFaceProtos.SEWatchFace.getDefaultInstance()) {
                        this.payload_ = sEWatchFace;
                    } else {
                        this.payload_ = WatchFaceProtos.SEWatchFace.newBuilder((WatchFaceProtos.SEWatchFace) this.payload_).mergeFrom(sEWatchFace).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEWatchFace);
                } else {
                    singleFieldBuilder.setMessage(sEWatchFace);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeWeasether(WeatherProtos.SEWeather sEWeather) {
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder = this.weasetherBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 10 || this.payload_ == WeatherProtos.SEWeather.getDefaultInstance()) {
                        this.payload_ = sEWeather;
                    } else {
                        this.payload_ = WeatherProtos.SEWeather.newBuilder((WeatherProtos.SEWeather) this.payload_).mergeFrom(sEWeather).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 10) {
                    singleFieldBuilder.mergeFrom(sEWeather);
                } else {
                    singleFieldBuilder.setMessage(sEWeather);
                }
                this.payloadCase_ = 10;
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
                this.payloadCase_ = 17;
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
                this.payloadCase_ = 3;
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
                this.payloadCase_ = 2;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
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
                this.payloadCase_ = 4;
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
                this.payloadCase_ = 16;
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

            public Builder setId(int i7) {
                this.id_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLargeFile(LargeFileProtos.SELargeFile sELargeFile) {
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder = this.largeFileBuilder_;
                if (singleFieldBuilder == null) {
                    sELargeFile.getClass();
                    this.payload_ = sELargeFile;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sELargeFile);
                }
                this.payloadCase_ = 11;
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
                this.payloadCase_ = 12;
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
                this.payloadCase_ = 14;
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
                this.payloadCase_ = 13;
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
                this.payloadCase_ = 15;
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
                this.payloadCase_ = 5;
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
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setWatchFace(WatchFaceProtos.SEWatchFace sEWatchFace) {
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder = this.watchFaceBuilder_;
                if (singleFieldBuilder == null) {
                    sEWatchFace.getClass();
                    this.payload_ = sEWatchFace;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEWatchFace);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setWeasether(WeatherProtos.SEWeather sEWeather) {
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder = this.weasetherBuilder_;
                if (singleFieldBuilder == null) {
                    sEWeather.getClass();
                    this.payload_ = sEWeather;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEWeather);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public /* synthetic */ Builder(q qVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
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

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
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
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder5 = this.watchFaceBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SportingProtos.SESporting, SportingProtos.SESporting.Builder, SportingProtos.SESportingOrBuilder> singleFieldBuilder6 = this.sportingBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<FitnessProtos.SEFitness, FitnessProtos.SEFitness.Builder, FitnessProtos.SEFitnessOrBuilder> singleFieldBuilder7 = this.fitnessBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder8 = this.weasetherBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder9 = this.largeFileBuilder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                SingleFieldBuilder<MicroFunctionProtos.SEMicroFunction, MicroFunctionProtos.SEMicroFunction.Builder, MicroFunctionProtos.SEMicroFunctionOrBuilder> singleFieldBuilder10 = this.microFunctionBuilder_;
                if (singleFieldBuilder10 != null) {
                    singleFieldBuilder10.clear();
                }
                SingleFieldBuilder<NotificationProtos.SENotification, NotificationProtos.SENotification.Builder, NotificationProtos.SENotificationOrBuilder> singleFieldBuilder11 = this.notificationBuilder_;
                if (singleFieldBuilder11 != null) {
                    singleFieldBuilder11.clear();
                }
                SingleFieldBuilder<MusicProtos.SEMusic, MusicProtos.SEMusic.Builder, MusicProtos.SEMusicOrBuilder> singleFieldBuilder12 = this.musicBuilder_;
                if (singleFieldBuilder12 != null) {
                    singleFieldBuilder12.clear();
                }
                SingleFieldBuilder<SettingMenuProtos.SESettingMenu, SettingMenuProtos.SESettingMenu.Builder, SettingMenuProtos.SESettingMenuOrBuilder> singleFieldBuilder13 = this.settingMenuBuilder_;
                if (singleFieldBuilder13 != null) {
                    singleFieldBuilder13.clear();
                }
                SingleFieldBuilder<FactoryProtos.SEFactory, FactoryProtos.SEFactory.Builder, FactoryProtos.SEFactoryOrBuilder> singleFieldBuilder14 = this.factoryBuilder_;
                if (singleFieldBuilder14 != null) {
                    singleFieldBuilder14.clear();
                }
                SingleFieldBuilder<AlexaProtos.SEAleax, AlexaProtos.SEAleax.Builder, AlexaProtos.SEAleaxOrBuilder> singleFieldBuilder15 = this.aleaxBuilder_;
                if (singleFieldBuilder15 != null) {
                    singleFieldBuilder15.clear();
                }
                SingleFieldBuilder<CommonProtos.SEBLEConnectParameterConfig, CommonProtos.SEBLEConnectParameterConfig.Builder, CommonProtos.SEBLEConnectParameterConfigOrBuilder> singleFieldBuilder16 = this.bleConnectParmeterConfigBuilder_;
                if (singleFieldBuilder16 != null) {
                    singleFieldBuilder16.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWear) {
                    return mergeFrom((SEWear) message);
                }
                super.mergeFrom(message);
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
                this.payloadCase_ = 17;
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
                this.payloadCase_ = 3;
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

            public Builder setDevice(DeviceProtos.SEDevice.Builder builder) {
                SingleFieldBuilder<DeviceProtos.SEDevice, DeviceProtos.SEDevice.Builder, DeviceProtos.SEDeviceOrBuilder> singleFieldBuilder = this.deviceBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
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
                this.payloadCase_ = 16;
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

            public Builder setLargeFile(LargeFileProtos.SELargeFile.Builder builder) {
                SingleFieldBuilder<LargeFileProtos.SELargeFile, LargeFileProtos.SELargeFile.Builder, LargeFileProtos.SELargeFileOrBuilder> singleFieldBuilder = this.largeFileBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 11;
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
                this.payloadCase_ = 12;
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
                this.payloadCase_ = 14;
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
                this.payloadCase_ = 13;
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
                this.payloadCase_ = 15;
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
                this.payloadCase_ = 5;
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
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setWatchFace(WatchFaceProtos.SEWatchFace.Builder builder) {
                SingleFieldBuilder<WatchFaceProtos.SEWatchFace, WatchFaceProtos.SEWatchFace.Builder, WatchFaceProtos.SEWatchFaceOrBuilder> singleFieldBuilder = this.watchFaceBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setWeasether(WeatherProtos.SEWeather.Builder builder) {
                SingleFieldBuilder<WeatherProtos.SEWeather, WeatherProtos.SEWeather.Builder, WeatherProtos.SEWeatherOrBuilder> singleFieldBuilder = this.weasetherBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeFrom(SEWear sEWear) {
                if (sEWear == SEWear.getDefaultInstance()) {
                    return this;
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
                    case WATCH_FACE:
                        mergeWatchFace(sEWear.getWatchFace());
                        break;
                    case SPORTING:
                        mergeSporting(sEWear.getSporting());
                        break;
                    case FITNESS:
                        mergeFitness(sEWear.getFitness());
                        break;
                    case WEASETHER:
                        mergeWeasether(sEWear.getWeasether());
                        break;
                    case LARGE_FILE:
                        mergeLargeFile(sEWear.getLargeFile());
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    break;
                                case 16:
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 2;
                                    break;
                                case 26:
                                    codedInputStream.readMessage(internalGetBindAccountFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                    break;
                                case 34:
                                    codedInputStream.readMessage(internalGetDeviceFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                    break;
                                case 42:
                                    codedInputStream.readMessage(internalGetSystemTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetUserSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetWatchFaceFieldBuilder().getBuilder(), extensionRegistryLite);
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
                                    codedInputStream.readMessage(internalGetWeasetherFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 10;
                                    break;
                                case 90:
                                    codedInputStream.readMessage(internalGetLargeFileFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 11;
                                    break;
                                case 98:
                                    codedInputStream.readMessage(internalGetMicroFunctionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 12;
                                    break;
                                case 106:
                                    codedInputStream.readMessage(internalGetNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 13;
                                    break;
                                case 114:
                                    codedInputStream.readMessage(internalGetMusicFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 14;
                                    break;
                                case 122:
                                    codedInputStream.readMessage(internalGetSettingMenuFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 15;
                                    break;
                                case 130:
                                    codedInputStream.readMessage(internalGetFactoryFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 16;
                                    break;
                                case 138:
                                    codedInputStream.readMessage(internalGetAleaxFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 17;
                                    break;
                                case DataBinderMapperImpl.ne /* 794 */:
                                    codedInputStream.readMessage(internalGetBleConnectParmeterConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 99;
                                    break;
                                case 800:
                                    int i7 = codedInputStream.readEnum();
                                    if (CommonProtos.SEErrorCode.forNumber(i7) == null) {
                                        mergeUnknownVarintField(100, i7);
                                    } else {
                                        this.payloadCase_ = 100;
                                        this.payload_ = Integer.valueOf(i7);
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

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            CHANGE_MTU(2),
            BIND_ACCOUNT(3),
            DEVICE(4),
            SYSTEM_TIME(5),
            USER_SETTINGS(6),
            WATCH_FACE(7),
            SPORTING(8),
            FITNESS(9),
            WEASETHER(10),
            LARGE_FILE(11),
            MICRO_FUNCTION(12),
            NOTIFICATION(13),
            MUSIC(14),
            SETTING_MENU(15),
            FACTORY(16),
            ALEAX(17),
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
                    case 2:
                        return CHANGE_MTU;
                    case 3:
                        return BIND_ACCOUNT;
                    case 4:
                        return DEVICE;
                    case 5:
                        return SYSTEM_TIME;
                    case 6:
                        return USER_SETTINGS;
                    case 7:
                        return WATCH_FACE;
                    case 8:
                        return SPORTING;
                    case 9:
                        return FITNESS;
                    case 10:
                        return WEASETHER;
                    case 11:
                        return LARGE_FILE;
                    case 12:
                        return MICRO_FUNCTION;
                    case 13:
                        return NOTIFICATION;
                    case 14:
                        return MUSIC;
                    case 15:
                        return SETTING_MENU;
                    case 16:
                        return FACTORY;
                    case 17:
                        return ALEAX;
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

        public enum SEFunctionId implements ProtocolMessageEnum {
            MTU_REQUEST_CHANGE(0),
            INQUIRY_BINDING_STATUS(16),
            BINDING_CHECK(17),
            BINDING_RESULT(18),
            VERIFY_USER_NUMBER(19),
            INQUIRY_PAIRING_STATUS(20),
            REQUEST_PAIRING(21),
            REQUEST_PAIRING_RESULT(22),
            UNBIND_REQUEST(23),
            DEVICE_RESTART(24),
            INQUIRY_CLASSIC_BLUETOOTH_CONNECT_STATUS(25),
            DEVICE_SHUTDOWN(26),
            REQUEST_CLASSIC_BLUETOOTH_CONNECT_STATUS(27),
            UNBIND_REQUEST_CONFIRM(28),
            GET_DEVICE_INFO(32),
            GET_DEVICE_BATTERY_STATUS(33),
            GET_DEVICE_DISCONNECT_REASON(34),
            GET_MPT_POWER_LOG(35),
            GET_MPT_POWER_LOG_LIST(36),
            DEVICE_BATTERY_VALUE_REQUEST(37),
            GET_CHARGING_CASE_STATUS(38),
            SET_SYSTEM_TIME(48),
            SET_12_24_TIME_TYPE(49),
            GET_WORLD_CLOCK_INFO(50),
            SET_WORLD_CLOCK_INFO(51),
            REQUEST_WORLD_CLOCK_INFO(52),
            SET_LANGUAGE_ID(64),
            GET_LANGUAGE_DETAILED(65),
            SET_UNIT_TYPE(66),
            SET_TEMPERATURE_TYPE(67),
            SET_USER_PROFILE(68),
            SET_USER_INFORMATION(69),
            GET_USER_PROFILE(70),
            SET_GOMORE_ALLDAY_SLEEP_CONFIG(71),
            GET_GOMORE_ALLDAY_SLEEP_CONFIG(72),
            SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG(73),
            GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG(320),
            GET_WATCH_FACE_LIST(80),
            SET_WATCH_FACE(81),
            REMOVE_WATCH_FACE(82),
            PREPARE_INSTALL_WATCH_FACE(83),
            REPORT_INSTALL_WATCH_FACE_RESULT(84),
            REQUEST_DEVICE_WATCH_FACE_CONFIG(85),
            SET_DEVICE_WATCH_FACE_CONFIG(86),
            GET_SPORT_STATUS(96),
            SPORT_REQUEST(97),
            PHONE_SPORT_DATA(98),
            WEAR_SPORT_DATA(99),
            ECG_COMMAND_SET(100),
            ECG_RESPOND(101),
            ECG_DATA_SEND(102),
            GET_ECG_CALIBRATION_DATA(103),
            SET_ECG_CALIBRATION_DATA(104),
            SECONDARY_SCREEN_SPORT_REQUEST(352),
            SECONDARY_SCREEN_PHONE_SPORT_DATA(353),
            SECONDARY_SCREEN_WEAR_SPORT_DATA(354),
            SET_RING_SPORT_STATUS(355),
            GET_RING_SPORT_STATUS(356),
            REQUSET_RING_SPORT_STATUS(357),
            RING_WEAR_SPORT_DATA(363),
            MESSAGE_START_MESSAGE(105),
            MESSAGE_SEND_WEAR_STATUS(106),
            MESSAGE_SEND_MESSAGE_VALUE(107),
            MESSAGE_SEND_MESSAGE_RESULT(108),
            MESSAGE_STOP_MESSAGE(109),
            GET_AUTO_SPORT_DATA_LIST(110),
            REQUSET_GET_AUTO_SPORT_DATA_LIST(111),
            WEAR_START_MESSAGE(358),
            WEAR_SEND_WEAR_STATUS(359),
            WEAR_SEND_MESSAGE_VALUE(360),
            WEAR_SEND_MESSAGE_RESULT(361),
            WEAR_STOP_MESSAGE(362),
            GET_FITNESS_TYPE_ID_LIST(112),
            REQUEST_FITNESS_TYPE_ID(113),
            REQUEST_FITNESS_TYPE_ID_LIST(114),
            CONFIRM_FITNESS_TYPE_ID(115),
            CONFIRM_FITNESS_TYPE_ID_LIST(116),
            GET_FITNESS_SPORT_ID_LIST(117),
            REQUEST_FITNESS_SPORT_ID(118),
            REQUEST_FITNESS_SPORT_ID_LIST(119),
            CONFIRM_FITNESS_SPORT_ID(120),
            CONFIRM_FITNESS_SPORT_ID_LIST(121),
            GET_FITNESS_NO_SLEEP_TYPE_ID_LIST(122),
            FITNESS_DATA_RECEPTION_STATUS(123),
            HOURLY_WEATHER(128),
            FORECAST_WEATHER(129),
            REQUEST_WEATHER(130),
            SET_PRESSURE(131),
            REQUEST_PRESSURE(132),
            PREPARE_OTA(144),
            REQUEST_ONLINE(145),
            REQUEST_OFFLINE(146),
            REQUEST_AGPS_STATE(147),
            REQUEST_BREAKPOINT_CONTINUATION_STATE(148),
            PREPARE_SOUND(149),
            SOUND_INSTALL_RESULT(150),
            WEAR_SEND_FIND_PHONE(160),
            FIND_WEAR(161),
            PHONE_SEND_PHOTOGRAGH_MODE(162),
            WEAR_SEND_PHOTOGRAGH_MODE(163),
            PHONE_SEND_BASIC_DATA_REPORT(164),
            REPORT_BASIC_DATA(165),
            SET_WIDGET_LIST(166),
            GET_WIDGET_LIST(167),
            SET_APPLICATION_LIST(168),
            GET_APPLICATION_LIST(169),
            PHONE_SEND_FIND_PHONE(170),
            SET_QUICK_WIDGET_LIST(171),
            GET_QUICK_WIDGET_LIST(172),
            SET_SPORTS_ICON_LIST(173),
            GET_SPORTS_ICON_LIST(174),
            SET_SPORTS_OTHER_LIST(175),
            GET_SPORTS_OTHER_LIST(416),
            SET_SPORTS_ICON_INFOWEAR_LIST(417),
            GET_SPORTS_ICON_INFOWEAR_LIST(418),
            REQUEST_NFC_SLEEP_ERR(419),
            GET_RING_WEAR_STATUS(420),
            REQUEST_DEVICE_WEAR_STATUS(421),
            GET_SLEEP_STATUS(422),
            GET_RING_SAR_CALIBRATION(423),
            START_SAR_CALIBRATION(424),
            SET_IOS_NOTIFICATION_LIST(176),
            GET_IOS_NOTIFICATION_LIST(177),
            SEND_SYSTEM_NOTIFICATION(178),
            SEND_APP_NOTIFICATION(179),
            SEND_CALL_STATE(180),
            GET_QUICK_REPLY_LIST(181),
            SET_QUICK_REPLY_LIST(182),
            SEND_QUICK_REPLY_MESSAGE(183),
            GET_CONTACTS_LIST(184),
            SET_CONTACTS_LIST(185),
            GET_COLLECTION_CONTACTS_LIST(186),
            SET_COLLECTION_CONTACTS_LIST(187),
            GET_SOS_CONTACTS(188),
            SET_SOS_CONTACTS(189),
            GET_CONTACTS_CY_2_LIST(190),
            SET_CONTACTS_CY_2_LIST(191),
            REQUEST_GET_SOS_CONTACTS(432),
            REQUEST_SOS_CONTACTS_MESSAGE_SEND(433),
            GET_CONTACTS_AVATAR_DATA(434),
            SET_CONTACTS_AVATAR_DATA(435),
            GET_DONT_HAVE_AVATAR_LIST(436),
            GET_GLOD_FRIEND_CONTACTS(437),
            SET_GLOD_FRIEND_CONTACTS(438),
            REQUEST_GLOD_FRIEND_EMOJI(439),
            SEND_GLOD_FRIEND_EMOJI(440),
            SEND_GLOD_FRIEND_EMOJI_REQUEST(441),
            REQUEST_MUSIC_STATE(192),
            SEND_MUSIC_CMD(193),
            QUIT_MUSIC(194),
            SYNC_MUSIC_INFO(195),
            GET_WRIST_SCREEN(208),
            SET_WRIST_SCREEN(209),
            REQUEST_GET_WRIST_SCREEN(210),
            GET_EVENT_INFO_LIST(211),
            SET_EVENT_INFO_LIST(212),
            REQUEST_GET_EVENT_INFO_LIST(213),
            GET_HEART_RATE_MONITOR(214),
            SET_HEART_RATE_MONITOR(215),
            REQUEST_GET_HEART_RATE_MONITOR(216),
            GET_SEDENTARY_REMINDER(217),
            SET_SEDENTARY_REMINDER(218),
            REQUEST_GET_SEDENTARY_REMINDER(219),
            GET_CLOCK_LIST(220),
            SET_CLOCK_LIST(221),
            REQUEST_GET_CLOCK_LIST(222),
            GET_MEDICATION_REMINDER(223),
            SET_MEDICATION_REMINDER(224),
            REQUEST_GET_MEDICATION_REMINDER(225),
            GET_DRINK_WATER_REMINDER(226),
            SET_DRINK_WATER_REMINDER(227),
            REQUEST_GET_DRINK_WATER_REMINDER(228),
            GET_DO_NOT_DISTURB_MODE(229),
            SET_DO_NOT_DISTURB_MODE(230),
            REQUEST_GET_DO_NOT_DISTURB_MODE(231),
            GET_VIBRATION_INTENSITY(232),
            SET_VIBRATION_INTENSITY(233),
            REQUEST_GET_VIBRATION_INTENSITY(234),
            GET_POWER_SAVING(235),
            SET_POWER_SAVING(236),
            REQUEST_POWER_SAVING(237),
            GET_OVERLAY_SCREEN(238),
            SET_OVERLAY_SCREEN(239),
            REQUEST_OVERLAY_SCREEN(240),
            GET_INFORMATION_SCREEN_DISPLAY(241),
            SET_INFORMATION_SCREEN_DISPLAY(242),
            REQUEST_INFORMATION_SCREEN_DISPLAY(243),
            GET_PHYSIOLOGICAL_CYCLE(244),
            SET_PHYSIOLOGICAL_CYCLE(245),
            REQUEST_PHYSIOLOGICAL_CYCLE(246),
            GET_SCREEN_SETTING(247),
            SET_SCREEN_SETTING(248),
            REQUEST_SCREEN_SETTING(249),
            GET_SIMPLE_SETTING_SUMMARY(250),
            GET_RAPID_EYE_MOVEMENT_SETTING(251),
            SET_RAPID_EYE_MOVEMENT_SETTING(252),
            REQUEST_RAPID_EYE_MOVEMENT_SETTING(253),
            GET_AUTOMATIC_MOTION_RECOGNITION_SETTING(254),
            SET_AUTOMATIC_MOTION_RECOGNITION_SETTING(255),
            REQUEST_AUTOMATIC_MOTION_RECOGNITION_SETTING(464),
            SYNC_STOCK_INFO(465),
            SYNC_STOCK_INFO_LIST(466),
            DELETE_STOCK(467),
            SET_STOCK_LIST(468),
            GET_STOCK_LIST(469),
            WEAR_REQUEST(470),
            GET_HAVE_MEALS_REMINDER(471),
            SET_HAVE_MEALS_REMINDER(472),
            REQUEST_GET_HAVE_MEALS_REMINDER(473),
            GET_WASH_HAND_REMINDER(474),
            SET_WASH_HAND_REMINDER(475),
            REQUEST_GET_WASH_HAND_REMINDER(476),
            GET_CONTINUOUS_BODY_TEMPERATURE(477),
            SET_CONTINUOUS_BODY_TEMPERATURE(478),
            REQUEST_GET_CONTINUOUS_BODY_TEMPERATURE(479),
            GET_CLASSIC_BLUETOOTH_STATE(480),
            SET_CLASSIC_BLUETOOTH_STATE(481),
            REQUEST_GET_CLASSIC_BLUETOOTH_STATE(482),
            GET_SCHOOL_MODE(483),
            SET_SCHOOL_MODE(484),
            REQUEST_GET_SCHOOL_MODE(485),
            GET_SCHEDULE_REMINDER(486),
            SET_SCHEDULE_REMINDER(487),
            REQUEST_GET_SCHEDULE_REMINDER(488),
            GET_SLEEP_MODE(489),
            SET_SLEEP_MODE(490),
            REQUEST_GET_SLEEP_MODE(491),
            GET_PRESSURE_MODE(492),
            SET_PRESSURE_MODE(493),
            REQUEST_GET_PRESSURE_MODE(494),
            GET_NOTIFICATION_SETTINGS(495),
            SET_NOTIFICATION_SETTINGS(496),
            REQUEST_GET_NOTIFICATION_SETTINGS(497),
            GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS(498),
            SET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS(499),
            REQUEST_GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS(500),
            GET_FIND_WEAR_SETTINGS(501),
            SET_FIND_WEAR_SETTINGS(502),
            REQUEST_GET_FIND_WEAR_SETTINGS(503),
            GET_EXAM_DATA_SETTINGS(504),
            SET_EXAM_DATA_SETTINGS(505),
            REQUEST_GET_EXAM_DATA_SETTINGS(506),
            GET_CALL_REMINDER_SETTINGS(507),
            SET_CALL_REMINDER_SETTINGS(508),
            REQUEST_GET_CALL_REMINDER_SETTINGS(509),
            GET_SLEEP_REMINDER_SETTINGS(510),
            SET_SLEEP_REMINDER_SETTINGS(511),
            REQUEST_GET_SLEEP_REMINDER_SETTINGS(720),
            GET_SOUND_LIST_SETTINGS(721),
            SET_SOUND_LIST_SETTINGS(722),
            REQUEST_GET_SOUND_LIST_SETTINGS(723),
            GET_CUSTOMIZE_SETTING(724),
            SET_CUSTOMIZE_SETTING(725),
            REQUEST_GET_CUSTOMIZE_SETTING(726),
            GET_VIBRATION_INTENSITY_TIME(727),
            SET_VIBRATION_INTENSITY_TIME(728),
            REQUEST_GET_VIBRATION_INTENSITY_TIME(729),
            GET_REAL_TIME_HEART_RATE_SETTINGS(730),
            SET_REAL_TIME_HEART_RATE_SETTINGS(731),
            REQUEST_GET_REAL_TIME_HEART_RATE_SETTINGS(732),
            REPORT_REAL_TIME_HEART_RATE_DATA(733),
            GET_BREATHING_LIGHT_SETTINGS(734),
            SET_BREATHING_LIGHT_SETTINGS(735),
            REQUEST_GET_BREATHING_LIGHT_SETTINGS(736),
            GET_QR_CODE_SETTINGS(737),
            SET_QR_CODE_SETTINGS(738),
            REQUEST_GET_QR_CODE_SETTINGS(739),
            GET_ESIM_EID_SETTINGS(740),
            SET_ESIM_BIGDATA_SETTINGS(741),
            GET_ESIM_COMMON_DATA_SETTINGS(742),
            SET_ESIM_COMMON_DATA_SETTINGS(743),
            DELETE_ESIM_SETTINGS(744),
            SEND_ESIM_HTTP_DATA(745),
            REQUEST_GET_EV_DATA_INFO(746),
            GET_EV_DATA_INFO(747),
            SET_EV_DATA_INFO(748),
            GET_EV_REMIND_STATUS(749),
            SET_EV_REMIND_STATUS(750),
            SET_RING_AIRPLANEMODE(751),
            GET_SPO2_MONITOR(752),
            SET_SPO2_MONITOR(753),
            REQUEST_SPO2_MONITOR(754),
            GET_HRV_MONITOR(755),
            SET_HRV_MONITOR(756),
            REQUEST_HRV_MONITOR(757),
            GET_BREATHING_RELAXATION_MONITOR(758),
            SET_BREATHING_RELAXATION_MONITOR(759),
            REQUEST_BREATHING_RELAXATION_MONITOR(760),
            DEVICE_REQUEST_BREATHING_RELAXATION_REMINDER(761),
            GET_HEART_RATE_REMINDER(762),
            SET_HEART_RATE_REMINDER(763),
            REQUEST_GET_HEART_RATE_REMINDER(764),
            FILE_INFO_UPDATE(4097),
            PHONE_SEND_HEART_RATE_SWITCH(4098),
            HEART_RATE_LEAKAGE_UPDATE(4099),
            HEART_RATE_LEAKAGE_RAW_DATE_UPDATE(4100),
            PHONE_REQUEST_LOG_UPDATE(4101),
            WEAR_SEND_LOG_STATE(4102),
            PHONE_SEND_BLUETOOTH_NAME_SETTING(4103),
            PHONE_GET_BLUETOOTH_NAME_SETTING(4104),
            PHONE_SEND_GSENSOR_GEOMAGNETIC_SWITCH(4105),
            GSENSOR_GEOMAGNETIC_RAW_DATE_UPDATE(4106),
            PHONE_SEND_TRIAXIAL_SWITCH(4107),
            TRIAXIAL_RAW_DATE_UPDATE(4108),
            PHONE_REQUEST_FILE_INFO_UPDATE(4109),
            PHONE_REQUEST_UPLOAD_BURIED_FILES(4110),
            PHONE_SEND_DEVELOPER_DATA_CMD(4111),
            WEAR_SEND_DEVELOPER_DATA(4112),
            SYNC_INSTRUCTION(SYNC_INSTRUCTION_VALUE);

            public static final int BINDING_CHECK_VALUE = 17;
            public static final int BINDING_RESULT_VALUE = 18;
            public static final int CONFIRM_FITNESS_SPORT_ID_LIST_VALUE = 121;
            public static final int CONFIRM_FITNESS_SPORT_ID_VALUE = 120;
            public static final int CONFIRM_FITNESS_TYPE_ID_LIST_VALUE = 116;
            public static final int CONFIRM_FITNESS_TYPE_ID_VALUE = 115;
            public static final int DELETE_ESIM_SETTINGS_VALUE = 744;
            public static final int DELETE_STOCK_VALUE = 467;
            public static final int DEVICE_BATTERY_VALUE_REQUEST_VALUE = 37;
            public static final int DEVICE_REQUEST_BREATHING_RELAXATION_REMINDER_VALUE = 761;
            public static final int DEVICE_RESTART_VALUE = 24;
            public static final int DEVICE_SHUTDOWN_VALUE = 26;
            public static final int ECG_COMMAND_SET_VALUE = 100;
            public static final int ECG_DATA_SEND_VALUE = 102;
            public static final int ECG_RESPOND_VALUE = 101;
            public static final int FILE_INFO_UPDATE_VALUE = 4097;
            public static final int FIND_WEAR_VALUE = 161;
            public static final int FITNESS_DATA_RECEPTION_STATUS_VALUE = 123;
            public static final int FORECAST_WEATHER_VALUE = 129;
            public static final int GET_APPLICATION_LIST_VALUE = 169;
            public static final int GET_AUTOMATIC_MOTION_RECOGNITION_SETTING_VALUE = 254;
            public static final int GET_AUTO_SPORT_DATA_LIST_VALUE = 110;
            public static final int GET_BREATHING_LIGHT_SETTINGS_VALUE = 734;
            public static final int GET_BREATHING_RELAXATION_MONITOR_VALUE = 758;
            public static final int GET_CALL_REMINDER_SETTINGS_VALUE = 507;
            public static final int GET_CHARGING_CASE_STATUS_VALUE = 38;
            public static final int GET_CLASSIC_BLUETOOTH_STATE_VALUE = 480;
            public static final int GET_CLOCK_LIST_VALUE = 220;
            public static final int GET_COLLECTION_CONTACTS_LIST_VALUE = 186;
            public static final int GET_CONTACTS_AVATAR_DATA_VALUE = 434;
            public static final int GET_CONTACTS_CY_2_LIST_VALUE = 190;
            public static final int GET_CONTACTS_LIST_VALUE = 184;
            public static final int GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS_VALUE = 498;
            public static final int GET_CONTINUOUS_BODY_TEMPERATURE_VALUE = 477;
            public static final int GET_CUSTOMIZE_SETTING_VALUE = 724;
            public static final int GET_DEVICE_BATTERY_STATUS_VALUE = 33;
            public static final int GET_DEVICE_DISCONNECT_REASON_VALUE = 34;
            public static final int GET_DEVICE_INFO_VALUE = 32;
            public static final int GET_DONT_HAVE_AVATAR_LIST_VALUE = 436;
            public static final int GET_DO_NOT_DISTURB_MODE_VALUE = 229;
            public static final int GET_DRINK_WATER_REMINDER_VALUE = 226;
            public static final int GET_ECG_CALIBRATION_DATA_VALUE = 103;
            public static final int GET_ESIM_COMMON_DATA_SETTINGS_VALUE = 742;
            public static final int GET_ESIM_EID_SETTINGS_VALUE = 740;
            public static final int GET_EVENT_INFO_LIST_VALUE = 211;
            public static final int GET_EV_DATA_INFO_VALUE = 747;
            public static final int GET_EV_REMIND_STATUS_VALUE = 749;
            public static final int GET_EXAM_DATA_SETTINGS_VALUE = 504;
            public static final int GET_FIND_WEAR_SETTINGS_VALUE = 501;
            public static final int GET_FITNESS_NO_SLEEP_TYPE_ID_LIST_VALUE = 122;
            public static final int GET_FITNESS_SPORT_ID_LIST_VALUE = 117;
            public static final int GET_FITNESS_TYPE_ID_LIST_VALUE = 112;
            public static final int GET_GLOD_FRIEND_CONTACTS_VALUE = 437;
            public static final int GET_GOMORE_ALLDAY_SLEEP_CONFIG_VALUE = 72;
            public static final int GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG_VALUE = 320;
            public static final int GET_HAVE_MEALS_REMINDER_VALUE = 471;
            public static final int GET_HEART_RATE_MONITOR_VALUE = 214;
            public static final int GET_HEART_RATE_REMINDER_VALUE = 762;
            public static final int GET_HRV_MONITOR_VALUE = 755;
            public static final int GET_INFORMATION_SCREEN_DISPLAY_VALUE = 241;
            public static final int GET_IOS_NOTIFICATION_LIST_VALUE = 177;
            public static final int GET_LANGUAGE_DETAILED_VALUE = 65;
            public static final int GET_MEDICATION_REMINDER_VALUE = 223;
            public static final int GET_MPT_POWER_LOG_LIST_VALUE = 36;
            public static final int GET_MPT_POWER_LOG_VALUE = 35;
            public static final int GET_NOTIFICATION_SETTINGS_VALUE = 495;
            public static final int GET_OVERLAY_SCREEN_VALUE = 238;
            public static final int GET_PHYSIOLOGICAL_CYCLE_VALUE = 244;
            public static final int GET_POWER_SAVING_VALUE = 235;
            public static final int GET_PRESSURE_MODE_VALUE = 492;
            public static final int GET_QR_CODE_SETTINGS_VALUE = 737;
            public static final int GET_QUICK_REPLY_LIST_VALUE = 181;
            public static final int GET_QUICK_WIDGET_LIST_VALUE = 172;
            public static final int GET_RAPID_EYE_MOVEMENT_SETTING_VALUE = 251;
            public static final int GET_REAL_TIME_HEART_RATE_SETTINGS_VALUE = 730;
            public static final int GET_RING_SAR_CALIBRATION_VALUE = 423;
            public static final int GET_RING_SPORT_STATUS_VALUE = 356;
            public static final int GET_RING_WEAR_STATUS_VALUE = 420;
            public static final int GET_SCHEDULE_REMINDER_VALUE = 486;
            public static final int GET_SCHOOL_MODE_VALUE = 483;
            public static final int GET_SCREEN_SETTING_VALUE = 247;
            public static final int GET_SEDENTARY_REMINDER_VALUE = 217;
            public static final int GET_SIMPLE_SETTING_SUMMARY_VALUE = 250;
            public static final int GET_SLEEP_MODE_VALUE = 489;
            public static final int GET_SLEEP_REMINDER_SETTINGS_VALUE = 510;
            public static final int GET_SLEEP_STATUS_VALUE = 422;
            public static final int GET_SOS_CONTACTS_VALUE = 188;
            public static final int GET_SOUND_LIST_SETTINGS_VALUE = 721;
            public static final int GET_SPO2_MONITOR_VALUE = 752;
            public static final int GET_SPORTS_ICON_INFOWEAR_LIST_VALUE = 418;
            public static final int GET_SPORTS_ICON_LIST_VALUE = 174;
            public static final int GET_SPORTS_OTHER_LIST_VALUE = 416;
            public static final int GET_SPORT_STATUS_VALUE = 96;
            public static final int GET_STOCK_LIST_VALUE = 469;
            public static final int GET_USER_PROFILE_VALUE = 70;
            public static final int GET_VIBRATION_INTENSITY_TIME_VALUE = 727;
            public static final int GET_VIBRATION_INTENSITY_VALUE = 232;
            public static final int GET_WASH_HAND_REMINDER_VALUE = 474;
            public static final int GET_WATCH_FACE_LIST_VALUE = 80;
            public static final int GET_WIDGET_LIST_VALUE = 167;
            public static final int GET_WORLD_CLOCK_INFO_VALUE = 50;
            public static final int GET_WRIST_SCREEN_VALUE = 208;
            public static final int GSENSOR_GEOMAGNETIC_RAW_DATE_UPDATE_VALUE = 4106;
            public static final int HEART_RATE_LEAKAGE_RAW_DATE_UPDATE_VALUE = 4100;
            public static final int HEART_RATE_LEAKAGE_UPDATE_VALUE = 4099;
            public static final int HOURLY_WEATHER_VALUE = 128;
            public static final int INQUIRY_BINDING_STATUS_VALUE = 16;
            public static final int INQUIRY_CLASSIC_BLUETOOTH_CONNECT_STATUS_VALUE = 25;
            public static final int INQUIRY_PAIRING_STATUS_VALUE = 20;
            public static final int MESSAGE_SEND_MESSAGE_RESULT_VALUE = 108;
            public static final int MESSAGE_SEND_MESSAGE_VALUE_VALUE = 107;
            public static final int MESSAGE_SEND_WEAR_STATUS_VALUE = 106;
            public static final int MESSAGE_START_MESSAGE_VALUE = 105;
            public static final int MESSAGE_STOP_MESSAGE_VALUE = 109;
            public static final int MTU_REQUEST_CHANGE_VALUE = 0;
            public static final int PHONE_GET_BLUETOOTH_NAME_SETTING_VALUE = 4104;
            public static final int PHONE_REQUEST_FILE_INFO_UPDATE_VALUE = 4109;
            public static final int PHONE_REQUEST_LOG_UPDATE_VALUE = 4101;
            public static final int PHONE_REQUEST_UPLOAD_BURIED_FILES_VALUE = 4110;
            public static final int PHONE_SEND_BASIC_DATA_REPORT_VALUE = 164;
            public static final int PHONE_SEND_BLUETOOTH_NAME_SETTING_VALUE = 4103;
            public static final int PHONE_SEND_DEVELOPER_DATA_CMD_VALUE = 4111;
            public static final int PHONE_SEND_FIND_PHONE_VALUE = 170;
            public static final int PHONE_SEND_GSENSOR_GEOMAGNETIC_SWITCH_VALUE = 4105;
            public static final int PHONE_SEND_HEART_RATE_SWITCH_VALUE = 4098;
            public static final int PHONE_SEND_PHOTOGRAGH_MODE_VALUE = 162;
            public static final int PHONE_SEND_TRIAXIAL_SWITCH_VALUE = 4107;
            public static final int PHONE_SPORT_DATA_VALUE = 98;
            public static final int PREPARE_INSTALL_WATCH_FACE_VALUE = 83;
            public static final int PREPARE_OTA_VALUE = 144;
            public static final int PREPARE_SOUND_VALUE = 149;
            public static final int QUIT_MUSIC_VALUE = 194;
            public static final int REMOVE_WATCH_FACE_VALUE = 82;
            public static final int REPORT_BASIC_DATA_VALUE = 165;
            public static final int REPORT_INSTALL_WATCH_FACE_RESULT_VALUE = 84;
            public static final int REPORT_REAL_TIME_HEART_RATE_DATA_VALUE = 733;
            public static final int REQUEST_AGPS_STATE_VALUE = 147;
            public static final int REQUEST_AUTOMATIC_MOTION_RECOGNITION_SETTING_VALUE = 464;
            public static final int REQUEST_BREAKPOINT_CONTINUATION_STATE_VALUE = 148;
            public static final int REQUEST_BREATHING_RELAXATION_MONITOR_VALUE = 760;
            public static final int REQUEST_CLASSIC_BLUETOOTH_CONNECT_STATUS_VALUE = 27;
            public static final int REQUEST_DEVICE_WATCH_FACE_CONFIG_VALUE = 85;
            public static final int REQUEST_DEVICE_WEAR_STATUS_VALUE = 421;
            public static final int REQUEST_FITNESS_SPORT_ID_LIST_VALUE = 119;
            public static final int REQUEST_FITNESS_SPORT_ID_VALUE = 118;
            public static final int REQUEST_FITNESS_TYPE_ID_LIST_VALUE = 114;
            public static final int REQUEST_FITNESS_TYPE_ID_VALUE = 113;
            public static final int REQUEST_GET_BREATHING_LIGHT_SETTINGS_VALUE = 736;
            public static final int REQUEST_GET_CALL_REMINDER_SETTINGS_VALUE = 509;
            public static final int REQUEST_GET_CLASSIC_BLUETOOTH_STATE_VALUE = 482;
            public static final int REQUEST_GET_CLOCK_LIST_VALUE = 222;
            public static final int REQUEST_GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS_VALUE = 500;
            public static final int REQUEST_GET_CONTINUOUS_BODY_TEMPERATURE_VALUE = 479;
            public static final int REQUEST_GET_CUSTOMIZE_SETTING_VALUE = 726;
            public static final int REQUEST_GET_DO_NOT_DISTURB_MODE_VALUE = 231;
            public static final int REQUEST_GET_DRINK_WATER_REMINDER_VALUE = 228;
            public static final int REQUEST_GET_EVENT_INFO_LIST_VALUE = 213;
            public static final int REQUEST_GET_EV_DATA_INFO_VALUE = 746;
            public static final int REQUEST_GET_EXAM_DATA_SETTINGS_VALUE = 506;
            public static final int REQUEST_GET_FIND_WEAR_SETTINGS_VALUE = 503;
            public static final int REQUEST_GET_HAVE_MEALS_REMINDER_VALUE = 473;
            public static final int REQUEST_GET_HEART_RATE_MONITOR_VALUE = 216;
            public static final int REQUEST_GET_HEART_RATE_REMINDER_VALUE = 764;
            public static final int REQUEST_GET_MEDICATION_REMINDER_VALUE = 225;
            public static final int REQUEST_GET_NOTIFICATION_SETTINGS_VALUE = 497;
            public static final int REQUEST_GET_PRESSURE_MODE_VALUE = 494;
            public static final int REQUEST_GET_QR_CODE_SETTINGS_VALUE = 739;
            public static final int REQUEST_GET_REAL_TIME_HEART_RATE_SETTINGS_VALUE = 732;
            public static final int REQUEST_GET_SCHEDULE_REMINDER_VALUE = 488;
            public static final int REQUEST_GET_SCHOOL_MODE_VALUE = 485;
            public static final int REQUEST_GET_SEDENTARY_REMINDER_VALUE = 219;
            public static final int REQUEST_GET_SLEEP_MODE_VALUE = 491;
            public static final int REQUEST_GET_SLEEP_REMINDER_SETTINGS_VALUE = 720;
            public static final int REQUEST_GET_SOS_CONTACTS_VALUE = 432;
            public static final int REQUEST_GET_SOUND_LIST_SETTINGS_VALUE = 723;
            public static final int REQUEST_GET_VIBRATION_INTENSITY_TIME_VALUE = 729;
            public static final int REQUEST_GET_VIBRATION_INTENSITY_VALUE = 234;
            public static final int REQUEST_GET_WASH_HAND_REMINDER_VALUE = 476;
            public static final int REQUEST_GET_WRIST_SCREEN_VALUE = 210;
            public static final int REQUEST_GLOD_FRIEND_EMOJI_VALUE = 439;
            public static final int REQUEST_HRV_MONITOR_VALUE = 757;
            public static final int REQUEST_INFORMATION_SCREEN_DISPLAY_VALUE = 243;
            public static final int REQUEST_MUSIC_STATE_VALUE = 192;
            public static final int REQUEST_NFC_SLEEP_ERR_VALUE = 419;
            public static final int REQUEST_OFFLINE_VALUE = 146;
            public static final int REQUEST_ONLINE_VALUE = 145;
            public static final int REQUEST_OVERLAY_SCREEN_VALUE = 240;
            public static final int REQUEST_PAIRING_RESULT_VALUE = 22;
            public static final int REQUEST_PAIRING_VALUE = 21;
            public static final int REQUEST_PHYSIOLOGICAL_CYCLE_VALUE = 246;
            public static final int REQUEST_POWER_SAVING_VALUE = 237;
            public static final int REQUEST_PRESSURE_VALUE = 132;
            public static final int REQUEST_RAPID_EYE_MOVEMENT_SETTING_VALUE = 253;
            public static final int REQUEST_SCREEN_SETTING_VALUE = 249;
            public static final int REQUEST_SOS_CONTACTS_MESSAGE_SEND_VALUE = 433;
            public static final int REQUEST_SPO2_MONITOR_VALUE = 754;
            public static final int REQUEST_WEATHER_VALUE = 130;
            public static final int REQUEST_WORLD_CLOCK_INFO_VALUE = 52;
            public static final int REQUSET_GET_AUTO_SPORT_DATA_LIST_VALUE = 111;
            public static final int REQUSET_RING_SPORT_STATUS_VALUE = 357;
            public static final int RING_WEAR_SPORT_DATA_VALUE = 363;
            public static final int SECONDARY_SCREEN_PHONE_SPORT_DATA_VALUE = 353;
            public static final int SECONDARY_SCREEN_SPORT_REQUEST_VALUE = 352;
            public static final int SECONDARY_SCREEN_WEAR_SPORT_DATA_VALUE = 354;
            public static final int SEND_APP_NOTIFICATION_VALUE = 179;
            public static final int SEND_CALL_STATE_VALUE = 180;
            public static final int SEND_ESIM_HTTP_DATA_VALUE = 745;
            public static final int SEND_GLOD_FRIEND_EMOJI_REQUEST_VALUE = 441;
            public static final int SEND_GLOD_FRIEND_EMOJI_VALUE = 440;
            public static final int SEND_MUSIC_CMD_VALUE = 193;
            public static final int SEND_QUICK_REPLY_MESSAGE_VALUE = 183;
            public static final int SEND_SYSTEM_NOTIFICATION_VALUE = 178;
            public static final int SET_12_24_TIME_TYPE_VALUE = 49;
            public static final int SET_APPLICATION_LIST_VALUE = 168;
            public static final int SET_AUTOMATIC_MOTION_RECOGNITION_SETTING_VALUE = 255;
            public static final int SET_BREATHING_LIGHT_SETTINGS_VALUE = 735;
            public static final int SET_BREATHING_RELAXATION_MONITOR_VALUE = 759;
            public static final int SET_CALL_REMINDER_SETTINGS_VALUE = 508;
            public static final int SET_CLASSIC_BLUETOOTH_STATE_VALUE = 481;
            public static final int SET_CLOCK_LIST_VALUE = 221;
            public static final int SET_COLLECTION_CONTACTS_LIST_VALUE = 187;
            public static final int SET_CONTACTS_AVATAR_DATA_VALUE = 435;
            public static final int SET_CONTACTS_CY_2_LIST_VALUE = 191;
            public static final int SET_CONTACTS_LIST_VALUE = 185;
            public static final int SET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS_VALUE = 499;
            public static final int SET_CONTINUOUS_BODY_TEMPERATURE_VALUE = 478;
            public static final int SET_CUSTOMIZE_SETTING_VALUE = 725;
            public static final int SET_DEVICE_WATCH_FACE_CONFIG_VALUE = 86;
            public static final int SET_DO_NOT_DISTURB_MODE_VALUE = 230;
            public static final int SET_DRINK_WATER_REMINDER_VALUE = 227;
            public static final int SET_ECG_CALIBRATION_DATA_VALUE = 104;
            public static final int SET_ESIM_BIGDATA_SETTINGS_VALUE = 741;
            public static final int SET_ESIM_COMMON_DATA_SETTINGS_VALUE = 743;
            public static final int SET_EVENT_INFO_LIST_VALUE = 212;
            public static final int SET_EV_DATA_INFO_VALUE = 748;
            public static final int SET_EV_REMIND_STATUS_VALUE = 750;
            public static final int SET_EXAM_DATA_SETTINGS_VALUE = 505;
            public static final int SET_FIND_WEAR_SETTINGS_VALUE = 502;
            public static final int SET_GLOD_FRIEND_CONTACTS_VALUE = 438;
            public static final int SET_GOMORE_ALLDAY_SLEEP_CONFIG_VALUE = 71;
            public static final int SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG_VALUE = 73;
            public static final int SET_HAVE_MEALS_REMINDER_VALUE = 472;
            public static final int SET_HEART_RATE_MONITOR_VALUE = 215;
            public static final int SET_HEART_RATE_REMINDER_VALUE = 763;
            public static final int SET_HRV_MONITOR_VALUE = 756;
            public static final int SET_INFORMATION_SCREEN_DISPLAY_VALUE = 242;
            public static final int SET_IOS_NOTIFICATION_LIST_VALUE = 176;
            public static final int SET_LANGUAGE_ID_VALUE = 64;
            public static final int SET_MEDICATION_REMINDER_VALUE = 224;
            public static final int SET_NOTIFICATION_SETTINGS_VALUE = 496;
            public static final int SET_OVERLAY_SCREEN_VALUE = 239;
            public static final int SET_PHYSIOLOGICAL_CYCLE_VALUE = 245;
            public static final int SET_POWER_SAVING_VALUE = 236;
            public static final int SET_PRESSURE_MODE_VALUE = 493;
            public static final int SET_PRESSURE_VALUE = 131;
            public static final int SET_QR_CODE_SETTINGS_VALUE = 738;
            public static final int SET_QUICK_REPLY_LIST_VALUE = 182;
            public static final int SET_QUICK_WIDGET_LIST_VALUE = 171;
            public static final int SET_RAPID_EYE_MOVEMENT_SETTING_VALUE = 252;
            public static final int SET_REAL_TIME_HEART_RATE_SETTINGS_VALUE = 731;
            public static final int SET_RING_AIRPLANEMODE_VALUE = 751;
            public static final int SET_RING_SPORT_STATUS_VALUE = 355;
            public static final int SET_SCHEDULE_REMINDER_VALUE = 487;
            public static final int SET_SCHOOL_MODE_VALUE = 484;
            public static final int SET_SCREEN_SETTING_VALUE = 248;
            public static final int SET_SEDENTARY_REMINDER_VALUE = 218;
            public static final int SET_SLEEP_MODE_VALUE = 490;
            public static final int SET_SLEEP_REMINDER_SETTINGS_VALUE = 511;
            public static final int SET_SOS_CONTACTS_VALUE = 189;
            public static final int SET_SOUND_LIST_SETTINGS_VALUE = 722;
            public static final int SET_SPO2_MONITOR_VALUE = 753;
            public static final int SET_SPORTS_ICON_INFOWEAR_LIST_VALUE = 417;
            public static final int SET_SPORTS_ICON_LIST_VALUE = 173;
            public static final int SET_SPORTS_OTHER_LIST_VALUE = 175;
            public static final int SET_STOCK_LIST_VALUE = 468;
            public static final int SET_SYSTEM_TIME_VALUE = 48;
            public static final int SET_TEMPERATURE_TYPE_VALUE = 67;
            public static final int SET_UNIT_TYPE_VALUE = 66;
            public static final int SET_USER_INFORMATION_VALUE = 69;
            public static final int SET_USER_PROFILE_VALUE = 68;
            public static final int SET_VIBRATION_INTENSITY_TIME_VALUE = 728;
            public static final int SET_VIBRATION_INTENSITY_VALUE = 233;
            public static final int SET_WASH_HAND_REMINDER_VALUE = 475;
            public static final int SET_WATCH_FACE_VALUE = 81;
            public static final int SET_WIDGET_LIST_VALUE = 166;
            public static final int SET_WORLD_CLOCK_INFO_VALUE = 51;
            public static final int SET_WRIST_SCREEN_VALUE = 209;
            public static final int SOUND_INSTALL_RESULT_VALUE = 150;
            public static final int SPORT_REQUEST_VALUE = 97;
            public static final int START_SAR_CALIBRATION_VALUE = 424;
            public static final int SYNC_INSTRUCTION_VALUE = 4353;
            public static final int SYNC_MUSIC_INFO_VALUE = 195;
            public static final int SYNC_STOCK_INFO_LIST_VALUE = 466;
            public static final int SYNC_STOCK_INFO_VALUE = 465;
            public static final int TRIAXIAL_RAW_DATE_UPDATE_VALUE = 4108;
            public static final int UNBIND_REQUEST_CONFIRM_VALUE = 28;
            public static final int UNBIND_REQUEST_VALUE = 23;
            private static final SEFunctionId[] VALUES;
            public static final int VERIFY_USER_NUMBER_VALUE = 19;
            public static final int WEAR_REQUEST_VALUE = 470;
            public static final int WEAR_SEND_DEVELOPER_DATA_VALUE = 4112;
            public static final int WEAR_SEND_FIND_PHONE_VALUE = 160;
            public static final int WEAR_SEND_LOG_STATE_VALUE = 4102;
            public static final int WEAR_SEND_MESSAGE_RESULT_VALUE = 361;
            public static final int WEAR_SEND_MESSAGE_VALUE_VALUE = 360;
            public static final int WEAR_SEND_PHOTOGRAGH_MODE_VALUE = 163;
            public static final int WEAR_SEND_WEAR_STATUS_VALUE = 359;
            public static final int WEAR_SPORT_DATA_VALUE = 99;
            public static final int WEAR_START_MESSAGE_VALUE = 358;
            public static final int WEAR_STOP_MESSAGE_VALUE = 362;
            private static final Internal.EnumLiteMap<SEFunctionId> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.WearProtos$SEWear$SEFunctionId$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEFunctionId> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEFunctionId findValueByNumber(int i7) {
                    return SEFunctionId.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFunctionId");
                internalValueMap = new Internal.EnumLiteMap<SEFunctionId>() { // from class: com.zh.ble.wear.protobuf.WearProtos.SEWear.SEFunctionId.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEFunctionId findValueByNumber(int i7) {
                        return SEFunctionId.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEFunctionId(int i7) {
                this.value = i7;
            }

            public static SEFunctionId forNumber(int i7) {
                if (i7 == 0) {
                    return MTU_REQUEST_CHANGE;
                }
                if (i7 == 320) {
                    return GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG;
                }
                if (i7 == 4353) {
                    return SYNC_INSTRUCTION;
                }
                switch (i7) {
                    case 208:
                        return GET_WRIST_SCREEN;
                    case 209:
                        return SET_WRIST_SCREEN;
                    case 210:
                        return REQUEST_GET_WRIST_SCREEN;
                    case 211:
                        return GET_EVENT_INFO_LIST;
                    case 212:
                        return SET_EVENT_INFO_LIST;
                    case 213:
                        return REQUEST_GET_EVENT_INFO_LIST;
                    case 214:
                        return GET_HEART_RATE_MONITOR;
                    case 215:
                        return SET_HEART_RATE_MONITOR;
                    case 216:
                        return REQUEST_GET_HEART_RATE_MONITOR;
                    case 217:
                        return GET_SEDENTARY_REMINDER;
                    case 218:
                        return SET_SEDENTARY_REMINDER;
                    case 219:
                        return REQUEST_GET_SEDENTARY_REMINDER;
                    case 220:
                        return GET_CLOCK_LIST;
                    case 221:
                        return SET_CLOCK_LIST;
                    case 222:
                        return REQUEST_GET_CLOCK_LIST;
                    case 223:
                        return GET_MEDICATION_REMINDER;
                    case 224:
                        return SET_MEDICATION_REMINDER;
                    case 225:
                        return REQUEST_GET_MEDICATION_REMINDER;
                    case 226:
                        return GET_DRINK_WATER_REMINDER;
                    case 227:
                        return SET_DRINK_WATER_REMINDER;
                    case 228:
                        return REQUEST_GET_DRINK_WATER_REMINDER;
                    case 229:
                        return GET_DO_NOT_DISTURB_MODE;
                    case 230:
                        return SET_DO_NOT_DISTURB_MODE;
                    case 231:
                        return REQUEST_GET_DO_NOT_DISTURB_MODE;
                    case 232:
                        return GET_VIBRATION_INTENSITY;
                    case 233:
                        return SET_VIBRATION_INTENSITY;
                    case 234:
                        return REQUEST_GET_VIBRATION_INTENSITY;
                    case 235:
                        return GET_POWER_SAVING;
                    case 236:
                        return SET_POWER_SAVING;
                    case 237:
                        return REQUEST_POWER_SAVING;
                    case 238:
                        return GET_OVERLAY_SCREEN;
                    case 239:
                        return SET_OVERLAY_SCREEN;
                    case 240:
                        return REQUEST_OVERLAY_SCREEN;
                    case 241:
                        return GET_INFORMATION_SCREEN_DISPLAY;
                    case 242:
                        return SET_INFORMATION_SCREEN_DISPLAY;
                    case 243:
                        return REQUEST_INFORMATION_SCREEN_DISPLAY;
                    case 244:
                        return GET_PHYSIOLOGICAL_CYCLE;
                    case 245:
                        return SET_PHYSIOLOGICAL_CYCLE;
                    case 246:
                        return REQUEST_PHYSIOLOGICAL_CYCLE;
                    case 247:
                        return GET_SCREEN_SETTING;
                    case 248:
                        return SET_SCREEN_SETTING;
                    case 249:
                        return REQUEST_SCREEN_SETTING;
                    case 250:
                        return GET_SIMPLE_SETTING_SUMMARY;
                    case 251:
                        return GET_RAPID_EYE_MOVEMENT_SETTING;
                    case 252:
                        return SET_RAPID_EYE_MOVEMENT_SETTING;
                    case 253:
                        return REQUEST_RAPID_EYE_MOVEMENT_SETTING;
                    case 254:
                        return GET_AUTOMATIC_MOTION_RECOGNITION_SETTING;
                    case 255:
                        return SET_AUTOMATIC_MOTION_RECOGNITION_SETTING;
                    default:
                        switch (i7) {
                            case 352:
                                return SECONDARY_SCREEN_SPORT_REQUEST;
                            case 353:
                                return SECONDARY_SCREEN_PHONE_SPORT_DATA;
                            case 354:
                                return SECONDARY_SCREEN_WEAR_SPORT_DATA;
                            case 355:
                                return SET_RING_SPORT_STATUS;
                            case 356:
                                return GET_RING_SPORT_STATUS;
                            case 357:
                                return REQUSET_RING_SPORT_STATUS;
                            case 358:
                                return WEAR_START_MESSAGE;
                            case 359:
                                return WEAR_SEND_WEAR_STATUS;
                            case 360:
                                return WEAR_SEND_MESSAGE_VALUE;
                            case 361:
                                return WEAR_SEND_MESSAGE_RESULT;
                            case 362:
                                return WEAR_STOP_MESSAGE;
                            case 363:
                                return RING_WEAR_SPORT_DATA;
                            default:
                                switch (i7) {
                                    case 416:
                                        return GET_SPORTS_OTHER_LIST;
                                    case 417:
                                        return SET_SPORTS_ICON_INFOWEAR_LIST;
                                    case 418:
                                        return GET_SPORTS_ICON_INFOWEAR_LIST;
                                    case 419:
                                        return REQUEST_NFC_SLEEP_ERR;
                                    case 420:
                                        return GET_RING_WEAR_STATUS;
                                    case 421:
                                        return REQUEST_DEVICE_WEAR_STATUS;
                                    case 422:
                                        return GET_SLEEP_STATUS;
                                    case 423:
                                        return GET_RING_SAR_CALIBRATION;
                                    case 424:
                                        return START_SAR_CALIBRATION;
                                    default:
                                        switch (i7) {
                                            case 432:
                                                return REQUEST_GET_SOS_CONTACTS;
                                            case 433:
                                                return REQUEST_SOS_CONTACTS_MESSAGE_SEND;
                                            case 434:
                                                return GET_CONTACTS_AVATAR_DATA;
                                            case 435:
                                                return SET_CONTACTS_AVATAR_DATA;
                                            case 436:
                                                return GET_DONT_HAVE_AVATAR_LIST;
                                            case 437:
                                                return GET_GLOD_FRIEND_CONTACTS;
                                            case 438:
                                                return SET_GLOD_FRIEND_CONTACTS;
                                            case 439:
                                                return REQUEST_GLOD_FRIEND_EMOJI;
                                            case 440:
                                                return SEND_GLOD_FRIEND_EMOJI;
                                            case 441:
                                                return SEND_GLOD_FRIEND_EMOJI_REQUEST;
                                            default:
                                                switch (i7) {
                                                    case 464:
                                                        return REQUEST_AUTOMATIC_MOTION_RECOGNITION_SETTING;
                                                    case 465:
                                                        return SYNC_STOCK_INFO;
                                                    case 466:
                                                        return SYNC_STOCK_INFO_LIST;
                                                    case 467:
                                                        return DELETE_STOCK;
                                                    case 468:
                                                        return SET_STOCK_LIST;
                                                    case 469:
                                                        return GET_STOCK_LIST;
                                                    case 470:
                                                        return WEAR_REQUEST;
                                                    case 471:
                                                        return GET_HAVE_MEALS_REMINDER;
                                                    case 472:
                                                        return SET_HAVE_MEALS_REMINDER;
                                                    case 473:
                                                        return REQUEST_GET_HAVE_MEALS_REMINDER;
                                                    case 474:
                                                        return GET_WASH_HAND_REMINDER;
                                                    case 475:
                                                        return SET_WASH_HAND_REMINDER;
                                                    case 476:
                                                        return REQUEST_GET_WASH_HAND_REMINDER;
                                                    case 477:
                                                        return GET_CONTINUOUS_BODY_TEMPERATURE;
                                                    case 478:
                                                        return SET_CONTINUOUS_BODY_TEMPERATURE;
                                                    case 479:
                                                        return REQUEST_GET_CONTINUOUS_BODY_TEMPERATURE;
                                                    case 480:
                                                        return GET_CLASSIC_BLUETOOTH_STATE;
                                                    case 481:
                                                        return SET_CLASSIC_BLUETOOTH_STATE;
                                                    case 482:
                                                        return REQUEST_GET_CLASSIC_BLUETOOTH_STATE;
                                                    case 483:
                                                        return GET_SCHOOL_MODE;
                                                    case 484:
                                                        return SET_SCHOOL_MODE;
                                                    case 485:
                                                        return REQUEST_GET_SCHOOL_MODE;
                                                    case 486:
                                                        return GET_SCHEDULE_REMINDER;
                                                    case 487:
                                                        return SET_SCHEDULE_REMINDER;
                                                    case 488:
                                                        return REQUEST_GET_SCHEDULE_REMINDER;
                                                    case 489:
                                                        return GET_SLEEP_MODE;
                                                    case 490:
                                                        return SET_SLEEP_MODE;
                                                    case 491:
                                                        return REQUEST_GET_SLEEP_MODE;
                                                    case 492:
                                                        return GET_PRESSURE_MODE;
                                                    case 493:
                                                        return SET_PRESSURE_MODE;
                                                    case 494:
                                                        return REQUEST_GET_PRESSURE_MODE;
                                                    case 495:
                                                        return GET_NOTIFICATION_SETTINGS;
                                                    case 496:
                                                        return SET_NOTIFICATION_SETTINGS;
                                                    case 497:
                                                        return REQUEST_GET_NOTIFICATION_SETTINGS;
                                                    case 498:
                                                        return GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS;
                                                    case 499:
                                                        return SET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS;
                                                    case 500:
                                                        return REQUEST_GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS;
                                                    case 501:
                                                        return GET_FIND_WEAR_SETTINGS;
                                                    case 502:
                                                        return SET_FIND_WEAR_SETTINGS;
                                                    case 503:
                                                        return REQUEST_GET_FIND_WEAR_SETTINGS;
                                                    case 504:
                                                        return GET_EXAM_DATA_SETTINGS;
                                                    case 505:
                                                        return SET_EXAM_DATA_SETTINGS;
                                                    case 506:
                                                        return REQUEST_GET_EXAM_DATA_SETTINGS;
                                                    case 507:
                                                        return GET_CALL_REMINDER_SETTINGS;
                                                    case 508:
                                                        return SET_CALL_REMINDER_SETTINGS;
                                                    case 509:
                                                        return REQUEST_GET_CALL_REMINDER_SETTINGS;
                                                    case 510:
                                                        return GET_SLEEP_REMINDER_SETTINGS;
                                                    case 511:
                                                        return SET_SLEEP_REMINDER_SETTINGS;
                                                    default:
                                                        switch (i7) {
                                                            case 720:
                                                                return REQUEST_GET_SLEEP_REMINDER_SETTINGS;
                                                            case 721:
                                                                return GET_SOUND_LIST_SETTINGS;
                                                            case 722:
                                                                return SET_SOUND_LIST_SETTINGS;
                                                            case 723:
                                                                return REQUEST_GET_SOUND_LIST_SETTINGS;
                                                            case 724:
                                                                return GET_CUSTOMIZE_SETTING;
                                                            case 725:
                                                                return SET_CUSTOMIZE_SETTING;
                                                            case 726:
                                                                return REQUEST_GET_CUSTOMIZE_SETTING;
                                                            case 727:
                                                                return GET_VIBRATION_INTENSITY_TIME;
                                                            case 728:
                                                                return SET_VIBRATION_INTENSITY_TIME;
                                                            case 729:
                                                                return REQUEST_GET_VIBRATION_INTENSITY_TIME;
                                                            case 730:
                                                                return GET_REAL_TIME_HEART_RATE_SETTINGS;
                                                            case 731:
                                                                return SET_REAL_TIME_HEART_RATE_SETTINGS;
                                                            case 732:
                                                                return REQUEST_GET_REAL_TIME_HEART_RATE_SETTINGS;
                                                            case 733:
                                                                return REPORT_REAL_TIME_HEART_RATE_DATA;
                                                            case 734:
                                                                return GET_BREATHING_LIGHT_SETTINGS;
                                                            case 735:
                                                                return SET_BREATHING_LIGHT_SETTINGS;
                                                            case 736:
                                                                return REQUEST_GET_BREATHING_LIGHT_SETTINGS;
                                                            case 737:
                                                                return GET_QR_CODE_SETTINGS;
                                                            case 738:
                                                                return SET_QR_CODE_SETTINGS;
                                                            case 739:
                                                                return REQUEST_GET_QR_CODE_SETTINGS;
                                                            case 740:
                                                                return GET_ESIM_EID_SETTINGS;
                                                            case 741:
                                                                return SET_ESIM_BIGDATA_SETTINGS;
                                                            case 742:
                                                                return GET_ESIM_COMMON_DATA_SETTINGS;
                                                            case 743:
                                                                return SET_ESIM_COMMON_DATA_SETTINGS;
                                                            case 744:
                                                                return DELETE_ESIM_SETTINGS;
                                                            case 745:
                                                                return SEND_ESIM_HTTP_DATA;
                                                            case 746:
                                                                return REQUEST_GET_EV_DATA_INFO;
                                                            case 747:
                                                                return GET_EV_DATA_INFO;
                                                            case 748:
                                                                return SET_EV_DATA_INFO;
                                                            case 749:
                                                                return GET_EV_REMIND_STATUS;
                                                            case 750:
                                                                return SET_EV_REMIND_STATUS;
                                                            case 751:
                                                                return SET_RING_AIRPLANEMODE;
                                                            case 752:
                                                                return GET_SPO2_MONITOR;
                                                            case 753:
                                                                return SET_SPO2_MONITOR;
                                                            case 754:
                                                                return REQUEST_SPO2_MONITOR;
                                                            case 755:
                                                                return GET_HRV_MONITOR;
                                                            case 756:
                                                                return SET_HRV_MONITOR;
                                                            case 757:
                                                                return REQUEST_HRV_MONITOR;
                                                            case 758:
                                                                return GET_BREATHING_RELAXATION_MONITOR;
                                                            case 759:
                                                                return SET_BREATHING_RELAXATION_MONITOR;
                                                            case 760:
                                                                return REQUEST_BREATHING_RELAXATION_MONITOR;
                                                            case 761:
                                                                return DEVICE_REQUEST_BREATHING_RELAXATION_REMINDER;
                                                            case 762:
                                                                return GET_HEART_RATE_REMINDER;
                                                            case 763:
                                                                return SET_HEART_RATE_REMINDER;
                                                            case 764:
                                                                return REQUEST_GET_HEART_RATE_REMINDER;
                                                            default:
                                                                switch (i7) {
                                                                    case 4097:
                                                                        return FILE_INFO_UPDATE;
                                                                    case 4098:
                                                                        return PHONE_SEND_HEART_RATE_SWITCH;
                                                                    case 4099:
                                                                        return HEART_RATE_LEAKAGE_UPDATE;
                                                                    case 4100:
                                                                        return HEART_RATE_LEAKAGE_RAW_DATE_UPDATE;
                                                                    case 4101:
                                                                        return PHONE_REQUEST_LOG_UPDATE;
                                                                    case 4102:
                                                                        return WEAR_SEND_LOG_STATE;
                                                                    case 4103:
                                                                        return PHONE_SEND_BLUETOOTH_NAME_SETTING;
                                                                    case 4104:
                                                                        return PHONE_GET_BLUETOOTH_NAME_SETTING;
                                                                    case 4105:
                                                                        return PHONE_SEND_GSENSOR_GEOMAGNETIC_SWITCH;
                                                                    case 4106:
                                                                        return GSENSOR_GEOMAGNETIC_RAW_DATE_UPDATE;
                                                                    case 4107:
                                                                        return PHONE_SEND_TRIAXIAL_SWITCH;
                                                                    case 4108:
                                                                        return TRIAXIAL_RAW_DATE_UPDATE;
                                                                    case 4109:
                                                                        return PHONE_REQUEST_FILE_INFO_UPDATE;
                                                                    case 4110:
                                                                        return PHONE_REQUEST_UPLOAD_BURIED_FILES;
                                                                    case 4111:
                                                                        return PHONE_SEND_DEVELOPER_DATA_CMD;
                                                                    case 4112:
                                                                        return WEAR_SEND_DEVELOPER_DATA;
                                                                    default:
                                                                        switch (i7) {
                                                                            case 16:
                                                                                return INQUIRY_BINDING_STATUS;
                                                                            case 17:
                                                                                return BINDING_CHECK;
                                                                            case 18:
                                                                                return BINDING_RESULT;
                                                                            case 19:
                                                                                return VERIFY_USER_NUMBER;
                                                                            case 20:
                                                                                return INQUIRY_PAIRING_STATUS;
                                                                            case 21:
                                                                                return REQUEST_PAIRING;
                                                                            case 22:
                                                                                return REQUEST_PAIRING_RESULT;
                                                                            case 23:
                                                                                return UNBIND_REQUEST;
                                                                            case 24:
                                                                                return DEVICE_RESTART;
                                                                            case 25:
                                                                                return INQUIRY_CLASSIC_BLUETOOTH_CONNECT_STATUS;
                                                                            case 26:
                                                                                return DEVICE_SHUTDOWN;
                                                                            case 27:
                                                                                return REQUEST_CLASSIC_BLUETOOTH_CONNECT_STATUS;
                                                                            case 28:
                                                                                return UNBIND_REQUEST_CONFIRM;
                                                                            default:
                                                                                switch (i7) {
                                                                                    case 32:
                                                                                        return GET_DEVICE_INFO;
                                                                                    case 33:
                                                                                        return GET_DEVICE_BATTERY_STATUS;
                                                                                    case 34:
                                                                                        return GET_DEVICE_DISCONNECT_REASON;
                                                                                    case 35:
                                                                                        return GET_MPT_POWER_LOG;
                                                                                    case 36:
                                                                                        return GET_MPT_POWER_LOG_LIST;
                                                                                    case 37:
                                                                                        return DEVICE_BATTERY_VALUE_REQUEST;
                                                                                    case 38:
                                                                                        return GET_CHARGING_CASE_STATUS;
                                                                                    default:
                                                                                        switch (i7) {
                                                                                            case 48:
                                                                                                return SET_SYSTEM_TIME;
                                                                                            case 49:
                                                                                                return SET_12_24_TIME_TYPE;
                                                                                            case 50:
                                                                                                return GET_WORLD_CLOCK_INFO;
                                                                                            case 51:
                                                                                                return SET_WORLD_CLOCK_INFO;
                                                                                            case 52:
                                                                                                return REQUEST_WORLD_CLOCK_INFO;
                                                                                            default:
                                                                                                switch (i7) {
                                                                                                    case 64:
                                                                                                        return SET_LANGUAGE_ID;
                                                                                                    case 65:
                                                                                                        return GET_LANGUAGE_DETAILED;
                                                                                                    case 66:
                                                                                                        return SET_UNIT_TYPE;
                                                                                                    case 67:
                                                                                                        return SET_TEMPERATURE_TYPE;
                                                                                                    case 68:
                                                                                                        return SET_USER_PROFILE;
                                                                                                    case 69:
                                                                                                        return SET_USER_INFORMATION;
                                                                                                    case 70:
                                                                                                        return GET_USER_PROFILE;
                                                                                                    case 71:
                                                                                                        return SET_GOMORE_ALLDAY_SLEEP_CONFIG;
                                                                                                    case 72:
                                                                                                        return GET_GOMORE_ALLDAY_SLEEP_CONFIG;
                                                                                                    case 73:
                                                                                                        return SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG;
                                                                                                    default:
                                                                                                        switch (i7) {
                                                                                                            case 80:
                                                                                                                return GET_WATCH_FACE_LIST;
                                                                                                            case 81:
                                                                                                                return SET_WATCH_FACE;
                                                                                                            case 82:
                                                                                                                return REMOVE_WATCH_FACE;
                                                                                                            case 83:
                                                                                                                return PREPARE_INSTALL_WATCH_FACE;
                                                                                                            case 84:
                                                                                                                return REPORT_INSTALL_WATCH_FACE_RESULT;
                                                                                                            case 85:
                                                                                                                return REQUEST_DEVICE_WATCH_FACE_CONFIG;
                                                                                                            case 86:
                                                                                                                return SET_DEVICE_WATCH_FACE_CONFIG;
                                                                                                            default:
                                                                                                                switch (i7) {
                                                                                                                    case 96:
                                                                                                                        return GET_SPORT_STATUS;
                                                                                                                    case 97:
                                                                                                                        return SPORT_REQUEST;
                                                                                                                    case 98:
                                                                                                                        return PHONE_SPORT_DATA;
                                                                                                                    case 99:
                                                                                                                        return WEAR_SPORT_DATA;
                                                                                                                    case 100:
                                                                                                                        return ECG_COMMAND_SET;
                                                                                                                    case 101:
                                                                                                                        return ECG_RESPOND;
                                                                                                                    case 102:
                                                                                                                        return ECG_DATA_SEND;
                                                                                                                    case 103:
                                                                                                                        return GET_ECG_CALIBRATION_DATA;
                                                                                                                    case 104:
                                                                                                                        return SET_ECG_CALIBRATION_DATA;
                                                                                                                    case 105:
                                                                                                                        return MESSAGE_START_MESSAGE;
                                                                                                                    case 106:
                                                                                                                        return MESSAGE_SEND_WEAR_STATUS;
                                                                                                                    case 107:
                                                                                                                        return MESSAGE_SEND_MESSAGE_VALUE;
                                                                                                                    case 108:
                                                                                                                        return MESSAGE_SEND_MESSAGE_RESULT;
                                                                                                                    case 109:
                                                                                                                        return MESSAGE_STOP_MESSAGE;
                                                                                                                    case 110:
                                                                                                                        return GET_AUTO_SPORT_DATA_LIST;
                                                                                                                    case 111:
                                                                                                                        return REQUSET_GET_AUTO_SPORT_DATA_LIST;
                                                                                                                    case 112:
                                                                                                                        return GET_FITNESS_TYPE_ID_LIST;
                                                                                                                    case 113:
                                                                                                                        return REQUEST_FITNESS_TYPE_ID;
                                                                                                                    case 114:
                                                                                                                        return REQUEST_FITNESS_TYPE_ID_LIST;
                                                                                                                    case 115:
                                                                                                                        return CONFIRM_FITNESS_TYPE_ID;
                                                                                                                    case 116:
                                                                                                                        return CONFIRM_FITNESS_TYPE_ID_LIST;
                                                                                                                    case 117:
                                                                                                                        return GET_FITNESS_SPORT_ID_LIST;
                                                                                                                    case 118:
                                                                                                                        return REQUEST_FITNESS_SPORT_ID;
                                                                                                                    case 119:
                                                                                                                        return REQUEST_FITNESS_SPORT_ID_LIST;
                                                                                                                    case 120:
                                                                                                                        return CONFIRM_FITNESS_SPORT_ID;
                                                                                                                    case 121:
                                                                                                                        return CONFIRM_FITNESS_SPORT_ID_LIST;
                                                                                                                    case 122:
                                                                                                                        return GET_FITNESS_NO_SLEEP_TYPE_ID_LIST;
                                                                                                                    case 123:
                                                                                                                        return FITNESS_DATA_RECEPTION_STATUS;
                                                                                                                    default:
                                                                                                                        switch (i7) {
                                                                                                                            case 128:
                                                                                                                                return HOURLY_WEATHER;
                                                                                                                            case 129:
                                                                                                                                return FORECAST_WEATHER;
                                                                                                                            case 130:
                                                                                                                                return REQUEST_WEATHER;
                                                                                                                            case 131:
                                                                                                                                return SET_PRESSURE;
                                                                                                                            case 132:
                                                                                                                                return REQUEST_PRESSURE;
                                                                                                                            default:
                                                                                                                                switch (i7) {
                                                                                                                                    case 144:
                                                                                                                                        return PREPARE_OTA;
                                                                                                                                    case 145:
                                                                                                                                        return REQUEST_ONLINE;
                                                                                                                                    case 146:
                                                                                                                                        return REQUEST_OFFLINE;
                                                                                                                                    case 147:
                                                                                                                                        return REQUEST_AGPS_STATE;
                                                                                                                                    case 148:
                                                                                                                                        return REQUEST_BREAKPOINT_CONTINUATION_STATE;
                                                                                                                                    case 149:
                                                                                                                                        return PREPARE_SOUND;
                                                                                                                                    case 150:
                                                                                                                                        return SOUND_INSTALL_RESULT;
                                                                                                                                    default:
                                                                                                                                        switch (i7) {
                                                                                                                                            case 160:
                                                                                                                                                return WEAR_SEND_FIND_PHONE;
                                                                                                                                            case 161:
                                                                                                                                                return FIND_WEAR;
                                                                                                                                            case 162:
                                                                                                                                                return PHONE_SEND_PHOTOGRAGH_MODE;
                                                                                                                                            case 163:
                                                                                                                                                return WEAR_SEND_PHOTOGRAGH_MODE;
                                                                                                                                            case 164:
                                                                                                                                                return PHONE_SEND_BASIC_DATA_REPORT;
                                                                                                                                            case 165:
                                                                                                                                                return REPORT_BASIC_DATA;
                                                                                                                                            case 166:
                                                                                                                                                return SET_WIDGET_LIST;
                                                                                                                                            case 167:
                                                                                                                                                return GET_WIDGET_LIST;
                                                                                                                                            case 168:
                                                                                                                                                return SET_APPLICATION_LIST;
                                                                                                                                            case 169:
                                                                                                                                                return GET_APPLICATION_LIST;
                                                                                                                                            case 170:
                                                                                                                                                return PHONE_SEND_FIND_PHONE;
                                                                                                                                            case 171:
                                                                                                                                                return SET_QUICK_WIDGET_LIST;
                                                                                                                                            case 172:
                                                                                                                                                return GET_QUICK_WIDGET_LIST;
                                                                                                                                            case 173:
                                                                                                                                                return SET_SPORTS_ICON_LIST;
                                                                                                                                            case 174:
                                                                                                                                                return GET_SPORTS_ICON_LIST;
                                                                                                                                            case 175:
                                                                                                                                                return SET_SPORTS_OTHER_LIST;
                                                                                                                                            case 176:
                                                                                                                                                return SET_IOS_NOTIFICATION_LIST;
                                                                                                                                            case 177:
                                                                                                                                                return GET_IOS_NOTIFICATION_LIST;
                                                                                                                                            case 178:
                                                                                                                                                return SEND_SYSTEM_NOTIFICATION;
                                                                                                                                            case 179:
                                                                                                                                                return SEND_APP_NOTIFICATION;
                                                                                                                                            case 180:
                                                                                                                                                return SEND_CALL_STATE;
                                                                                                                                            case 181:
                                                                                                                                                return GET_QUICK_REPLY_LIST;
                                                                                                                                            case 182:
                                                                                                                                                return SET_QUICK_REPLY_LIST;
                                                                                                                                            case 183:
                                                                                                                                                return SEND_QUICK_REPLY_MESSAGE;
                                                                                                                                            case 184:
                                                                                                                                                return GET_CONTACTS_LIST;
                                                                                                                                            case 185:
                                                                                                                                                return SET_CONTACTS_LIST;
                                                                                                                                            case 186:
                                                                                                                                                return GET_COLLECTION_CONTACTS_LIST;
                                                                                                                                            case 187:
                                                                                                                                                return SET_COLLECTION_CONTACTS_LIST;
                                                                                                                                            case 188:
                                                                                                                                                return GET_SOS_CONTACTS;
                                                                                                                                            case 189:
                                                                                                                                                return SET_SOS_CONTACTS;
                                                                                                                                            case 190:
                                                                                                                                                return GET_CONTACTS_CY_2_LIST;
                                                                                                                                            case 191:
                                                                                                                                                return SET_CONTACTS_CY_2_LIST;
                                                                                                                                            case 192:
                                                                                                                                                return REQUEST_MUSIC_STATE;
                                                                                                                                            case 193:
                                                                                                                                                return SEND_MUSIC_CMD;
                                                                                                                                            case 194:
                                                                                                                                                return QUIT_MUSIC;
                                                                                                                                            case 195:
                                                                                                                                                return SYNC_MUSIC_INFO;
                                                                                                                                            default:
                                                                                                                                                return null;
                                                                                                                                        }
                                                                                                                                }
                                                                                                                        }
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEWear.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEFunctionId> internalGetValueMap() {
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
            public static SEFunctionId valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEFunctionId valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWear");
            DEFAULT_INSTANCE = new SEWear();
            PARSER = new AbstractParser<SEWear>() { // from class: com.zh.ble.wear.protobuf.WearProtos.SEWear.1
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

        public /* synthetic */ SEWear(GeneratedMessage.Builder builder, q qVar) {
            this(builder);
        }

        public static SEWear getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WearProtos.internal_static_SEWear_descriptor;
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
            if (hasId() != sEWear.hasId()) {
                return false;
            }
            if ((hasId() && getId() != sEWear.getId()) || !getPayloadCase().equals(sEWear.getPayloadCase())) {
                return false;
            }
            int i7 = this.payloadCase_;
            if (i7 != 99) {
                if (i7 != 100) {
                    switch (i7) {
                        case 2:
                            if (getChangeMtu() != sEWear.getChangeMtu()) {
                                return false;
                            }
                            break;
                        case 3:
                            if (!getBindAccount().equals(sEWear.getBindAccount())) {
                                return false;
                            }
                            break;
                        case 4:
                            if (!getDevice().equals(sEWear.getDevice())) {
                                return false;
                            }
                            break;
                        case 5:
                            if (!getSystemTime().equals(sEWear.getSystemTime())) {
                                return false;
                            }
                            break;
                        case 6:
                            if (!getUserSettings().equals(sEWear.getUserSettings())) {
                                return false;
                            }
                            break;
                        case 7:
                            if (!getWatchFace().equals(sEWear.getWatchFace())) {
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
                            if (!getWeasether().equals(sEWear.getWeasether())) {
                                return false;
                            }
                            break;
                        case 11:
                            if (!getLargeFile().equals(sEWear.getLargeFile())) {
                                return false;
                            }
                            break;
                        case 12:
                            if (!getMicroFunction().equals(sEWear.getMicroFunction())) {
                                return false;
                            }
                            break;
                        case 13:
                            if (!getNotification().equals(sEWear.getNotification())) {
                                return false;
                            }
                            break;
                        case 14:
                            if (!getMusic().equals(sEWear.getMusic())) {
                                return false;
                            }
                            break;
                        case 15:
                            if (!getSettingMenu().equals(sEWear.getSettingMenu())) {
                                return false;
                            }
                            break;
                        case 16:
                            if (!getFactory().equals(sEWear.getFactory())) {
                                return false;
                            }
                            break;
                        case 17:
                            if (!getAleax().equals(sEWear.getAleax())) {
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

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public AlexaProtos.SEAleax getAleax() {
            return this.payloadCase_ == 17 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public AlexaProtos.SEAleaxOrBuilder getAleaxOrBuilder() {
            return this.payloadCase_ == 17 ? (AlexaProtos.SEAleax) this.payload_ : AlexaProtos.SEAleax.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public BindAccountProtos.SEBindAccount getBindAccount() {
            return this.payloadCase_ == 3 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public BindAccountProtos.SEBindAccountOrBuilder getBindAccountOrBuilder() {
            return this.payloadCase_ == 3 ? (BindAccountProtos.SEBindAccount) this.payload_ : BindAccountProtos.SEBindAccount.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public CommonProtos.SEBLEConnectParameterConfig getBleConnectParmeterConfig() {
            return this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public CommonProtos.SEBLEConnectParameterConfigOrBuilder getBleConnectParmeterConfigOrBuilder() {
            return this.payloadCase_ == 99 ? (CommonProtos.SEBLEConnectParameterConfig) this.payload_ : CommonProtos.SEBLEConnectParameterConfig.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public int getChangeMtu() {
            if (this.payloadCase_ == 2) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WearProtos.internal_static_SEWear_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public DeviceProtos.SEDevice getDevice() {
            return this.payloadCase_ == 4 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public DeviceProtos.SEDeviceOrBuilder getDeviceOrBuilder() {
            return this.payloadCase_ == 4 ? (DeviceProtos.SEDevice) this.payload_ : DeviceProtos.SEDevice.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public CommonProtos.SEErrorCode getErrorCode() {
            CommonProtos.SEErrorCode sEErrorCodeForNumber;
            return (this.payloadCase_ != 100 || (sEErrorCodeForNumber = CommonProtos.SEErrorCode.forNumber(((Integer) this.payload_).intValue())) == null) ? CommonProtos.SEErrorCode.NO_ERROR : sEErrorCodeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public FactoryProtos.SEFactory getFactory() {
            return this.payloadCase_ == 16 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public FactoryProtos.SEFactoryOrBuilder getFactoryOrBuilder() {
            return this.payloadCase_ == 16 ? (FactoryProtos.SEFactory) this.payload_ : FactoryProtos.SEFactory.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public FitnessProtos.SEFitness getFitness() {
            return this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public FitnessProtos.SEFitnessOrBuilder getFitnessOrBuilder() {
            return this.payloadCase_ == 9 ? (FitnessProtos.SEFitness) this.payload_ : FitnessProtos.SEFitness.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public LargeFileProtos.SELargeFile getLargeFile() {
            return this.payloadCase_ == 11 ? (LargeFileProtos.SELargeFile) this.payload_ : LargeFileProtos.SELargeFile.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public LargeFileProtos.SELargeFileOrBuilder getLargeFileOrBuilder() {
            return this.payloadCase_ == 11 ? (LargeFileProtos.SELargeFile) this.payload_ : LargeFileProtos.SELargeFile.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public MicroFunctionProtos.SEMicroFunction getMicroFunction() {
            return this.payloadCase_ == 12 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public MicroFunctionProtos.SEMicroFunctionOrBuilder getMicroFunctionOrBuilder() {
            return this.payloadCase_ == 12 ? (MicroFunctionProtos.SEMicroFunction) this.payload_ : MicroFunctionProtos.SEMicroFunction.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public MusicProtos.SEMusic getMusic() {
            return this.payloadCase_ == 14 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public MusicProtos.SEMusicOrBuilder getMusicOrBuilder() {
            return this.payloadCase_ == 14 ? (MusicProtos.SEMusic) this.payload_ : MusicProtos.SEMusic.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public NotificationProtos.SENotification getNotification() {
            return this.payloadCase_ == 13 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public NotificationProtos.SENotificationOrBuilder getNotificationOrBuilder() {
            return this.payloadCase_ == 13 ? (NotificationProtos.SENotification) this.payload_ : NotificationProtos.SENotification.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWear> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 3) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, (BindAccountProtos.SEBindAccount) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, (DeviceProtos.SEDevice) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(5, (SystemTimeProtos.SESystemTime) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(6, (UserProfilesProtos.SEUserSettings) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(7, (WatchFaceProtos.SEWatchFace) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(8, (SportingProtos.SESporting) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(9, (FitnessProtos.SEFitness) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(10, (WeatherProtos.SEWeather) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(11, (LargeFileProtos.SELargeFile) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(12, (MicroFunctionProtos.SEMicroFunction) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(13, (NotificationProtos.SENotification) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(14, (MusicProtos.SEMusic) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(15, (SettingMenuProtos.SESettingMenu) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(16, (FactoryProtos.SEFactory) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(17, (AlexaProtos.SEAleax) this.payload_);
            }
            if (this.payloadCase_ == 99) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(99, (CommonProtos.SEBLEConnectParameterConfig) this.payload_);
            }
            if (this.payloadCase_ == 100) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(100, ((Integer) this.payload_).intValue());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public SettingMenuProtos.SESettingMenu getSettingMenu() {
            return this.payloadCase_ == 15 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public SettingMenuProtos.SESettingMenuOrBuilder getSettingMenuOrBuilder() {
            return this.payloadCase_ == 15 ? (SettingMenuProtos.SESettingMenu) this.payload_ : SettingMenuProtos.SESettingMenu.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public SportingProtos.SESporting getSporting() {
            return this.payloadCase_ == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public SportingProtos.SESportingOrBuilder getSportingOrBuilder() {
            return this.payloadCase_ == 8 ? (SportingProtos.SESporting) this.payload_ : SportingProtos.SESporting.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public SystemTimeProtos.SESystemTime getSystemTime() {
            return this.payloadCase_ == 5 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public SystemTimeProtos.SESystemTimeOrBuilder getSystemTimeOrBuilder() {
            return this.payloadCase_ == 5 ? (SystemTimeProtos.SESystemTime) this.payload_ : SystemTimeProtos.SESystemTime.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public UserProfilesProtos.SEUserSettings getUserSettings() {
            return this.payloadCase_ == 6 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public UserProfilesProtos.SEUserSettingsOrBuilder getUserSettingsOrBuilder() {
            return this.payloadCase_ == 6 ? (UserProfilesProtos.SEUserSettings) this.payload_ : UserProfilesProtos.SEUserSettings.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public WatchFaceProtos.SEWatchFace getWatchFace() {
            return this.payloadCase_ == 7 ? (WatchFaceProtos.SEWatchFace) this.payload_ : WatchFaceProtos.SEWatchFace.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public WatchFaceProtos.SEWatchFaceOrBuilder getWatchFaceOrBuilder() {
            return this.payloadCase_ == 7 ? (WatchFaceProtos.SEWatchFace) this.payload_ : WatchFaceProtos.SEWatchFace.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public WeatherProtos.SEWeather getWeasether() {
            return this.payloadCase_ == 10 ? (WeatherProtos.SEWeather) this.payload_ : WeatherProtos.SEWeather.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public WeatherProtos.SEWeatherOrBuilder getWeasetherOrBuilder() {
            return this.payloadCase_ == 10 ? (WeatherProtos.SEWeather) this.payload_ : WeatherProtos.SEWeather.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasAleax() {
            return this.payloadCase_ == 17;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasBindAccount() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasBleConnectParmeterConfig() {
            return this.payloadCase_ == 99;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasChangeMtu() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasDevice() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasErrorCode() {
            return this.payloadCase_ == 100;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasFactory() {
            return this.payloadCase_ == 16;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasFitness() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasLargeFile() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasMicroFunction() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasMusic() {
            return this.payloadCase_ == 14;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasNotification() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasSettingMenu() {
            return this.payloadCase_ == 15;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasSporting() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasSystemTime() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasUserSettings() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasWatchFace() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.wear.protobuf.WearProtos.SEWearOrBuilder
        public boolean hasWeasether() {
            return this.payloadCase_ == 10;
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
            if (hasId()) {
                iHashCode2 = (((iHashCode2 * 37) + 1) * 53) + getId();
            }
            int i9 = this.payloadCase_;
            if (i9 == 99) {
                i7 = ((iHashCode2 * 37) + 99) * 53;
                iHashCode = getBleConnectParmeterConfig().hashCode();
            } else if (i9 != 100) {
                switch (i9) {
                    case 2:
                        i7 = ((iHashCode2 * 37) + 2) * 53;
                        iHashCode = getChangeMtu();
                        break;
                    case 3:
                        i7 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getBindAccount().hashCode();
                        break;
                    case 4:
                        i7 = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = getDevice().hashCode();
                        break;
                    case 5:
                        i7 = ((iHashCode2 * 37) + 5) * 53;
                        iHashCode = getSystemTime().hashCode();
                        break;
                    case 6:
                        i7 = ((iHashCode2 * 37) + 6) * 53;
                        iHashCode = getUserSettings().hashCode();
                        break;
                    case 7:
                        i7 = ((iHashCode2 * 37) + 7) * 53;
                        iHashCode = getWatchFace().hashCode();
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
                        iHashCode = getWeasether().hashCode();
                        break;
                    case 11:
                        i7 = ((iHashCode2 * 37) + 11) * 53;
                        iHashCode = getLargeFile().hashCode();
                        break;
                    case 12:
                        i7 = ((iHashCode2 * 37) + 12) * 53;
                        iHashCode = getMicroFunction().hashCode();
                        break;
                    case 13:
                        i7 = ((iHashCode2 * 37) + 13) * 53;
                        iHashCode = getNotification().hashCode();
                        break;
                    case 14:
                        i7 = ((iHashCode2 * 37) + 14) * 53;
                        iHashCode = getMusic().hashCode();
                        break;
                    case 15:
                        i7 = ((iHashCode2 * 37) + 15) * 53;
                        iHashCode = getSettingMenu().hashCode();
                        break;
                    case 16:
                        i7 = ((iHashCode2 * 37) + 16) * 53;
                        iHashCode = getFactory().hashCode();
                        break;
                    case 17:
                        i7 = ((iHashCode2 * 37) + 17) * 53;
                        iHashCode = getAleax().hashCode();
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
            return WearProtos.internal_static_SEWear_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWear.class, Builder.class);
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
            if (hasWatchFace() && !getWatchFace().isInitialized()) {
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
            if (hasWeasether() && !getWeasether().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLargeFile() && !getLargeFile().isInitialized()) {
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
            if (!hasAleax() || getAleax().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeUInt32(2, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (BindAccountProtos.SEBindAccount) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (DeviceProtos.SEDevice) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SystemTimeProtos.SESystemTime) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (UserProfilesProtos.SEUserSettings) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (WatchFaceProtos.SEWatchFace) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SportingProtos.SESporting) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (FitnessProtos.SEFitness) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (WeatherProtos.SEWeather) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (LargeFileProtos.SELargeFile) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (MicroFunctionProtos.SEMicroFunction) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (NotificationProtos.SENotification) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                codedOutputStream.writeMessage(14, (MusicProtos.SEMusic) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                codedOutputStream.writeMessage(15, (SettingMenuProtos.SESettingMenu) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                codedOutputStream.writeMessage(16, (FactoryProtos.SEFactory) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                codedOutputStream.writeMessage(17, (AlexaProtos.SEAleax) this.payload_);
            }
            if (this.payloadCase_ == 99) {
                codedOutputStream.writeMessage(99, (CommonProtos.SEBLEConnectParameterConfig) this.payload_);
            }
            if (this.payloadCase_ == 100) {
                codedOutputStream.writeEnum(100, ((Integer) this.payload_).intValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWear(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
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

        private SEWear() {
            this.payloadCase_ = 0;
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEWear parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
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
        AlexaProtos.SEAleax getAleax();

        AlexaProtos.SEAleaxOrBuilder getAleaxOrBuilder();

        BindAccountProtos.SEBindAccount getBindAccount();

        BindAccountProtos.SEBindAccountOrBuilder getBindAccountOrBuilder();

        CommonProtos.SEBLEConnectParameterConfig getBleConnectParmeterConfig();

        CommonProtos.SEBLEConnectParameterConfigOrBuilder getBleConnectParmeterConfigOrBuilder();

        int getChangeMtu();

        DeviceProtos.SEDevice getDevice();

        DeviceProtos.SEDeviceOrBuilder getDeviceOrBuilder();

        CommonProtos.SEErrorCode getErrorCode();

        FactoryProtos.SEFactory getFactory();

        FactoryProtos.SEFactoryOrBuilder getFactoryOrBuilder();

        FitnessProtos.SEFitness getFitness();

        FitnessProtos.SEFitnessOrBuilder getFitnessOrBuilder();

        int getId();

        LargeFileProtos.SELargeFile getLargeFile();

        LargeFileProtos.SELargeFileOrBuilder getLargeFileOrBuilder();

        MicroFunctionProtos.SEMicroFunction getMicroFunction();

        MicroFunctionProtos.SEMicroFunctionOrBuilder getMicroFunctionOrBuilder();

        MusicProtos.SEMusic getMusic();

        MusicProtos.SEMusicOrBuilder getMusicOrBuilder();

        NotificationProtos.SENotification getNotification();

        NotificationProtos.SENotificationOrBuilder getNotificationOrBuilder();

        SEWear.PayloadCase getPayloadCase();

        SettingMenuProtos.SESettingMenu getSettingMenu();

        SettingMenuProtos.SESettingMenuOrBuilder getSettingMenuOrBuilder();

        SportingProtos.SESporting getSporting();

        SportingProtos.SESportingOrBuilder getSportingOrBuilder();

        SystemTimeProtos.SESystemTime getSystemTime();

        SystemTimeProtos.SESystemTimeOrBuilder getSystemTimeOrBuilder();

        UserProfilesProtos.SEUserSettings getUserSettings();

        UserProfilesProtos.SEUserSettingsOrBuilder getUserSettingsOrBuilder();

        WatchFaceProtos.SEWatchFace getWatchFace();

        WatchFaceProtos.SEWatchFaceOrBuilder getWatchFaceOrBuilder();

        WeatherProtos.SEWeather getWeasether();

        WeatherProtos.SEWeatherOrBuilder getWeasetherOrBuilder();

        boolean hasAleax();

        boolean hasBindAccount();

        boolean hasBleConnectParmeterConfig();

        boolean hasChangeMtu();

        boolean hasDevice();

        boolean hasErrorCode();

        boolean hasFactory();

        boolean hasFitness();

        boolean hasId();

        boolean hasLargeFile();

        boolean hasMicroFunction();

        boolean hasMusic();

        boolean hasNotification();

        boolean hasSettingMenu();

        boolean hasSporting();

        boolean hasSystemTime();

        boolean hasUserSettings();

        boolean hasWatchFace();

        boolean hasWeasether();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "WearProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\nWear.proto\u001a\fnanopb.proto\u001a\fCommon.proto\u001a\u0011BindAccount.proto\u001a\fDevice.proto\u001a\rFitness.proto\u001a\u000fLargeFile.proto\u001a\u0013MicroFunction.proto\u001a\u0011SettingMenu.proto\u001a\u000bMusic.proto\u001a\u0012Notification.proto\u001a\u000eSporting.proto\u001a\u0010SystemTime.proto\u001a\u0012UserSettings.proto\u001a\u000fWatchFace.proto\u001a\rWeather.proto\u001a\rFactory.proto\u001a\u000bAlexa.proto\"ÉN\n\u0006SEWear\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u001b\n\nchange_mtu\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\u0010H\u0000\u0012&\n\fbind_account\u0018\u0003 \u0001(\u000b2\u000e.SEBindAccountH\u0000\u0012\u001b\n\u0006device\u0018\u0004 \u0001(\u000b2\t.SEDeviceH\u0000\u0012$\n\u000bsystem_time\u0018\u0005 \u0001(\u000b2\r.SESystemTimeH\u0000\u0012(\n\ruser_settings\u0018\u0006 \u0001(\u000b2\u000f.SEUserSettingsH\u0000\u0012\"\n\nwatch_face\u0018\u0007 \u0001(\u000b2\f.SEWatchFaceH\u0000\u0012\u001f\n\bsporting\u0018\b \u0001(\u000b2\u000b.SESportingH\u0000\u0012\u001d\n\u0007fitness\u0018\t \u0001(\u000b2\n.SEFitnessH\u0000\u0012\u001f\n\tweasether\u0018\n \u0001(\u000b2\n.SEWeatherH\u0000\u0012\"\n\nlarge_file\u0018\u000b \u0001(\u000b2\f.SELargeFileH\u0000\u0012*\n\u000emicro_function\u0018\f \u0001(\u000b2\u0010.SEMicroFunctionH\u0000\u0012'\n\fnotification\u0018\r \u0001(\u000b2\u000f.SENotificationH\u0000\u0012\u0019\n\u0005music\u0018\u000e \u0001(\u000b2\b.SEMusicH\u0000\u0012&\n\fsetting_menu\u0018\u000f \u0001(\u000b2\u000e.SESettingMenuH\u0000\u0012\u001d\n\u0007factory\u0018\u0010 \u0001(\u000b2\n.SEFactoryH\u0000\u0012\u0019\n\u0005aleax\u0018\u0011 \u0001(\u000b2\b.SEAleaxH\u0000\u0012C\n\u001bble_connect_parmeter_config\u0018c \u0001(\u000b2\u001c.SEBLEConnectParameterConfigH\u0000\u0012\"\n\nerror_code\u0018d \u0001(\u000e2\f.SEErrorCodeH\u0000\"\u008aI\n\fSEFunctionId\u0012\u0016\n\u0012MTU_REQUEST_CHANGE\u0010\u0000\u0012\u001a\n\u0016INQUIRY_BINDING_STATUS\u0010\u0010\u0012\u0011\n\rBINDING_CHECK\u0010\u0011\u0012\u0012\n\u000eBINDING_RESULT\u0010\u0012\u0012\u0016\n\u0012VERIFY_USER_NUMBER\u0010\u0013\u0012\u001a\n\u0016INQUIRY_PAIRING_STATUS\u0010\u0014\u0012\u0013\n\u000fREQUEST_PAIRING\u0010\u0015\u0012\u001a\n\u0016REQUEST_PAIRING_RESULT\u0010\u0016\u0012\u0012\n\u000eUNBIND_REQUEST\u0010\u0017\u0012\u0012\n\u000eDEVICE_RESTART\u0010\u0018\u0012,\n(INQUIRY_CLASSIC_BLUETOOTH_CONNECT_STATUS\u0010\u0019\u0012\u0013\n\u000fDEVICE_SHUTDOWN\u0010\u001a\u0012,\n(REQUEST_CLASSIC_BLUETOOTH_CONNECT_STATUS\u0010\u001b\u0012\u001a\n\u0016UNBIND_REQUEST_CONFIRM\u0010\u001c\u0012\u0013\n\u000fGET_DEVICE_INFO\u0010 \u0012\u001d\n\u0019GET_DEVICE_BATTERY_STATUS\u0010!\u0012 \n\u001cGET_DEVICE_DISCONNECT_REASON\u0010\"\u0012\u0015\n\u0011GET_MPT_POWER_LOG\u0010#\u0012\u001a\n\u0016GET_MPT_POWER_LOG_LIST\u0010$\u0012 \n\u001cDEVICE_BATTERY_VALUE_REQUEST\u0010%\u0012\u001c\n\u0018GET_CHARGING_CASE_STATUS\u0010&\u0012\u0013\n\u000fSET_SYSTEM_TIME\u00100\u0012\u0017\n\u0013SET_12_24_TIME_TYPE\u00101\u0012\u0018\n\u0014GET_WORLD_CLOCK_INFO\u00102\u0012\u0018\n\u0014SET_WORLD_CLOCK_INFO\u00103\u0012\u001c\n\u0018REQUEST_WORLD_CLOCK_INFO\u00104\u0012\u0013\n\u000fSET_LANGUAGE_ID\u0010@\u0012\u0019\n\u0015GET_LANGUAGE_DETAILED\u0010A\u0012\u0011\n\rSET_UNIT_TYPE\u0010B\u0012\u0018\n\u0014SET_TEMPERATURE_TYPE\u0010C\u0012\u0014\n\u0010SET_USER_PROFILE\u0010D\u0012\u0018\n\u0014SET_USER_INFORMATION\u0010E\u0012\u0014\n\u0010GET_USER_PROFILE\u0010F\u0012\"\n\u001eSET_GOMORE_ALLDAY_SLEEP_CONFIG\u0010G\u0012\"\n\u001eGET_GOMORE_ALLDAY_SLEEP_CONFIG\u0010H\u0012'\n#SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG\u0010I\u0012(\n#GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG\u0010À\u0002\u0012\u0017\n\u0013GET_WATCH_FACE_LIST\u0010P\u0012\u0012\n\u000eSET_WATCH_FACE\u0010Q\u0012\u0015\n\u0011REMOVE_WATCH_FACE\u0010R\u0012\u001e\n\u001aPREPARE_INSTALL_WATCH_FACE\u0010S\u0012$\n REPORT_INSTALL_WATCH_FACE_RESULT\u0010T\u0012$\n REQUEST_DEVICE_WATCH_FACE_CONFIG\u0010U\u0012 \n\u001cSET_DEVICE_WATCH_FACE_CONFIG\u0010V\u0012\u0014\n\u0010GET_SPORT_STATUS\u0010`\u0012\u0011\n\rSPORT_REQUEST\u0010a\u0012\u0014\n\u0010PHONE_SPORT_DATA\u0010b\u0012\u0013\n\u000fWEAR_SPORT_DATA\u0010c\u0012\u0013\n\u000fECG_COMMAND_SET\u0010d\u0012\u000f\n\u000bECG_RESPOND\u0010e\u0012\u0011\n\rECG_DATA_SEND\u0010f\u0012\u001c\n\u0018GET_ECG_CALIBRATION_DATA\u0010g\u0012\u001c\n\u0018SET_ECG_CALIBRATION_DATA\u0010h\u0012#\n\u001eSECONDARY_SCREEN_SPORT_REQUEST\u0010à\u0002\u0012&\n!SECONDARY_SCREEN_PHONE_SPORT_DATA\u0010á\u0002\u0012%\n SECONDARY_SCREEN_WEAR_SPORT_DATA\u0010â\u0002\u0012\u001a\n\u0015SET_RING_SPORT_STATUS\u0010ã\u0002\u0012\u001a\n\u0015GET_RING_SPORT_STATUS\u0010ä\u0002\u0012\u001e\n\u0019REQUSET_RING_SPORT_STATUS\u0010å\u0002\u0012\u0019\n\u0014RING_WEAR_SPORT_DATA\u0010ë\u0002\u0012\u0019\n\u0015MESSAGE_START_MESSAGE\u0010i\u0012\u001c\n\u0018MESSAGE_SEND_WEAR_STATUS\u0010j\u0012\u001e\n\u001aMESSAGE_SEND_MESSAGE_VALUE\u0010k\u0012\u001f\n\u001bMESSAGE_SEND_MESSAGE_RESULT\u0010l\u0012\u0018\n\u0014MESSAGE_STOP_MESSAGE\u0010m\u0012\u001c\n\u0018GET_AUTO_SPORT_DATA_LIST\u0010n\u0012$\n REQUSET_GET_AUTO_SPORT_DATA_LIST\u0010o\u0012\u0017\n\u0012WEAR_START_MESSAGE\u0010æ\u0002\u0012\u001a\n\u0015WEAR_SEND_WEAR_STATUS\u0010ç\u0002\u0012\u001c\n\u0017WEAR_SEND_MESSAGE_VALUE\u0010è\u0002\u0012\u001d\n\u0018WEAR_SEND_MESSAGE_RESULT\u0010é\u0002\u0012\u0016\n\u0011WEAR_STOP_MESSAGE\u0010ê\u0002\u0012\u001c\n\u0018GET_FITNESS_TYPE_ID_LIST\u0010p\u0012\u001b\n\u0017REQUEST_FITNESS_TYPE_ID\u0010q\u0012 \n\u001cREQUEST_FITNESS_TYPE_ID_LIST\u0010r\u0012\u001b\n\u0017CONFIRM_FITNESS_TYPE_ID\u0010s\u0012 \n\u001cCONFIRM_FITNESS_TYPE_ID_LIST\u0010t\u0012\u001d\n\u0019GET_FITNESS_SPORT_ID_LIST\u0010u\u0012\u001c\n\u0018REQUEST_FITNESS_SPORT_ID\u0010v\u0012!\n\u001dREQUEST_FITNESS_SPORT_ID_LIST\u0010w\u0012\u001c\n\u0018CONFIRM_FITNESS_SPORT_ID\u0010x\u0012!\n\u001dCONFIRM_FITNESS_SPORT_ID_LIST\u0010y\u0012%\n!GET_FITNESS_NO_SLEEP_TYPE_ID_LIST\u0010z\u0012!\n\u001dFITNESS_DATA_RECEPTION_STATUS\u0010{\u0012\u0013\n\u000eHOURLY_WEATHER\u0010\u0080\u0001\u0012\u0015\n\u0010FORECAST_WEATHER\u0010\u0081\u0001\u0012\u0014\n\u000fREQUEST_WEATHER\u0010\u0082\u0001\u0012\u0011\n\fSET_PRESSURE\u0010\u0083\u0001\u0012\u0015\n\u0010REQUEST_PRESSURE\u0010\u0084\u0001\u0012\u0010\n\u000bPREPARE_OTA\u0010\u0090\u0001\u0012\u0013\n\u000eREQUEST_ONLINE\u0010\u0091\u0001\u0012\u0014\n\u000fREQUEST_OFFLINE\u0010\u0092\u0001\u0012\u0017\n\u0012REQUEST_AGPS_STATE\u0010\u0093\u0001\u0012*\n%REQUEST_BREAKPOINT_CONTINUATION_STATE\u0010\u0094\u0001\u0012\u0012\n\rPREPARE_SOUND\u0010\u0095\u0001\u0012\u0019\n\u0014SOUND_INSTALL_RESULT\u0010\u0096\u0001\u0012\u0019\n\u0014WEAR_SEND_FIND_PHONE\u0010 \u0001\u0012\u000e\n\tFIND_WEAR\u0010¡\u0001\u0012\u001f\n\u001aPHONE_SEND_PHOTOGRAGH_MODE\u0010¢\u0001\u0012\u001e\n\u0019WEAR_SEND_PHOTOGRAGH_MODE\u0010£\u0001\u0012!\n\u001cPHONE_SEND_BASIC_DATA_REPORT\u0010¤\u0001\u0012\u0016\n\u0011REPORT_BASIC_DATA\u0010¥\u0001\u0012\u0014\n\u000fSET_WIDGET_LIST\u0010¦\u0001\u0012\u0014\n\u000fGET_WIDGET_LIST\u0010§\u0001\u0012\u0019\n\u0014SET_APPLICATION_LIST\u0010¨\u0001\u0012\u0019\n\u0014GET_APPLICATION_LIST\u0010©\u0001\u0012\u001a\n\u0015PHONE_SEND_FIND_PHONE\u0010ª\u0001\u0012\u001a\n\u0015SET_QUICK_WIDGET_LIST\u0010«\u0001\u0012\u001a\n\u0015GET_QUICK_WIDGET_LIST\u0010¬\u0001\u0012\u0019\n\u0014SET_SPORTS_ICON_LIST\u0010\u00ad\u0001\u0012\u0019\n\u0014GET_SPORTS_ICON_LIST\u0010®\u0001\u0012\u001a\n\u0015SET_SPORTS_OTHER_LIST\u0010¯\u0001\u0012\u001a\n\u0015GET_SPORTS_OTHER_LIST\u0010 \u0003\u0012\"\n\u001dSET_SPORTS_ICON_INFOWEAR_LIST\u0010¡\u0003\u0012\"\n\u001dGET_SPORTS_ICON_INFOWEAR_LIST\u0010¢\u0003\u0012\u001a\n\u0015REQUEST_NFC_SLEEP_ERR\u0010£\u0003\u0012\u0019\n\u0014GET_RING_WEAR_STATUS\u0010¤\u0003\u0012\u001f\n\u001aREQUEST_DEVICE_WEAR_STATUS\u0010¥\u0003\u0012\u0015\n\u0010GET_SLEEP_STATUS\u0010¦\u0003\u0012\u001d\n\u0018GET_RING_SAR_CALIBRATION\u0010§\u0003\u0012\u001a\n\u0015START_SAR_CALIBRATION\u0010¨\u0003\u0012\u001e\n\u0019SET_IOS_NOTIFICATION_LIST\u0010°\u0001\u0012\u001e\n\u0019GET_IOS_NOTIFICATION_LIST\u0010±\u0001\u0012\u001d\n\u0018SEND_SYSTEM_NOTIFICATION\u0010²\u0001\u0012\u001a\n\u0015SEND_APP_NOTIFICATION\u0010³\u0001\u0012\u0014\n\u000fSEND_CALL_STATE\u0010´\u0001\u0012\u0019\n\u0014GET_QUICK_REPLY_LIST\u0010µ\u0001\u0012\u0019\n\u0014SET_QUICK_REPLY_LIST\u0010¶\u0001\u0012\u001d\n\u0018SEND_QUICK_REPLY_MESSAGE\u0010·\u0001\u0012\u0016\n\u0011GET_CONTACTS_LIST\u0010¸\u0001\u0012\u0016\n\u0011SET_CONTACTS_LIST\u0010¹\u0001\u0012!\n\u001cGET_COLLECTION_CONTACTS_LIST\u0010º\u0001\u0012!\n\u001cSET_COLLECTION_CONTACTS_LIST\u0010»\u0001\u0012\u0015\n\u0010GET_SOS_CONTACTS\u0010¼\u0001\u0012\u0015\n\u0010SET_SOS_CONTACTS\u0010½\u0001\u0012\u001b\n\u0016GET_CONTACTS_CY_2_LIST\u0010¾\u0001\u0012\u001b\n\u0016SET_CONTACTS_CY_2_LIST\u0010¿\u0001\u0012\u001d\n\u0018REQUEST_GET_SOS_CONTACTS\u0010°\u0003\u0012&\n!REQUEST_SOS_CONTACTS_MESSAGE_SEND\u0010±\u0003\u0012\u001d\n\u0018GET_CONTACTS_AVATAR_DATA\u0010²\u0003\u0012\u001d\n\u0018SET_CONTACTS_AVATAR_DATA\u0010³\u0003\u0012\u001e\n\u0019GET_DONT_HAVE_AVATAR_LIST\u0010´\u0003\u0012\u001d\n\u0018GET_GLOD_FRIEND_CONTACTS\u0010µ\u0003\u0012\u001d\n\u0018SET_GLOD_FRIEND_CONTACTS\u0010¶\u0003\u0012\u001e\n\u0019REQUEST_GLOD_FRIEND_EMOJI\u0010·\u0003\u0012\u001b\n\u0016SEND_GLOD_FRIEND_EMOJI\u0010¸\u0003\u0012#\n\u001eSEND_GLOD_FRIEND_EMOJI_REQUEST\u0010¹\u0003\u0012\u0018\n\u0013REQUEST_MUSIC_STATE\u0010À\u0001\u0012\u0013\n\u000eSEND_MUSIC_CMD\u0010Á\u0001\u0012\u000f\n\nQUIT_MUSIC\u0010Â\u0001\u0012\u0014\n\u000fSYNC_MUSIC_INFO\u0010Ã\u0001\u0012\u0015\n\u0010GET_WRIST_SCREEN\u0010Ð\u0001\u0012\u0015\n\u0010SET_WRIST_SCREEN\u0010Ñ\u0001\u0012\u001d\n\u0018REQUEST_GET_WRIST_SCREEN\u0010Ò\u0001\u0012\u0018\n\u0013GET_EVENT_INFO_LIST\u0010Ó\u0001\u0012\u0018\n\u0013SET_EVENT_INFO_LIST\u0010Ô\u0001\u0012 \n\u001bREQUEST_GET_EVENT_INFO_LIST\u0010Õ\u0001\u0012\u001b\n\u0016GET_HEART_RATE_MONITOR\u0010Ö\u0001\u0012\u001b\n\u0016SET_HEART_RATE_MONITOR\u0010×\u0001\u0012#\n\u001eREQUEST_GET_HEART_RATE_MONITOR\u0010Ø\u0001\u0012\u001b\n\u0016GET_SEDENTARY_REMINDER\u0010Ù\u0001\u0012\u001b\n\u0016SET_SEDENTARY_REMINDER\u0010Ú\u0001\u0012#\n\u001eREQUEST_GET_SEDENTARY_REMINDER\u0010Û\u0001\u0012\u0013\n\u000eGET_CLOCK_LIST\u0010Ü\u0001\u0012\u0013\n\u000eSET_CLOCK_LIST\u0010Ý\u0001\u0012\u001b\n\u0016REQUEST_GET_CLOCK_LIST\u0010Þ\u0001\u0012\u001c\n\u0017GET_MEDICATION_REMINDER\u0010ß\u0001\u0012\u001c\n\u0017SET_MEDICATION_REMINDER\u0010à\u0001\u0012$\n\u001fREQUEST_GET_MEDICATION_REMINDER\u0010á\u0001\u0012\u001d\n\u0018GET_DRINK_WATER_REMINDER\u0010â\u0001\u0012\u001d\n\u0018SET_DRINK_WATER_REMINDER\u0010ã\u0001\u0012%\n REQUEST_GET_DRINK_WATER_REMINDER\u0010ä\u0001\u0012\u001c\n\u0017GET_DO_NOT_DISTURB_MODE\u0010å\u0001\u0012\u001c\n\u0017SET_DO_NOT_DISTURB_MODE\u0010æ\u0001\u0012$\n\u001fREQUEST_GET_DO_NOT_DISTURB_MODE\u0010ç\u0001\u0012\u001c\n\u0017GET_VIBRATION_INTENSITY\u0010è\u0001\u0012\u001c\n\u0017SET_VIBRATION_INTENSITY\u0010é\u0001\u0012$\n\u001fREQUEST_GET_VIBRATION_INTENSITY\u0010ê\u0001\u0012\u0015\n\u0010GET_POWER_SAVING\u0010ë\u0001\u0012\u0015\n\u0010SET_POWER_SAVING\u0010ì\u0001\u0012\u0019\n\u0014REQUEST_POWER_SAVING\u0010í\u0001\u0012\u0017\n\u0012GET_OVERLAY_SCREEN\u0010î\u0001\u0012\u0017\n\u0012SET_OVERLAY_SCREEN\u0010ï\u0001\u0012\u001b\n\u0016REQUEST_OVERLAY_SCREEN\u0010ð\u0001\u0012#\n\u001eGET_INFORMATION_SCREEN_DISPLAY\u0010ñ\u0001\u0012#\n\u001eSET_INFORMATION_SCREEN_DISPLAY\u0010ò\u0001\u0012'\n\"REQUEST_INFORMATION_SCREEN_DISPLAY\u0010ó\u0001\u0012\u001c\n\u0017GET_PHYSIOLOGICAL_CYCLE\u0010ô\u0001\u0012\u001c\n\u0017SET_PHYSIOLOGICAL_CYCLE\u0010õ\u0001\u0012 \n\u001bREQUEST_PHYSIOLOGICAL_CYCLE\u0010ö\u0001\u0012\u0017\n\u0012GET_SCREEN_SETTING\u0010÷\u0001\u0012\u0017\n\u0012SET_SCREEN_SETTING\u0010ø\u0001\u0012\u001b\n\u0016REQUEST_SCREEN_SETTING\u0010ù\u0001\u0012\u001f\n\u001aGET_SIMPLE_SETTING_SUMMARY\u0010ú\u0001\u0012#\n\u001eGET_RAPID_EYE_MOVEMENT_SETTING\u0010û\u0001\u0012#\n\u001eSET_RAPID_EYE_MOVEMENT_SETTING\u0010ü\u0001\u0012'\n\"REQUEST_RAPID_EYE_MOVEMENT_SETTING\u0010ý\u0001\u0012-\n(GET_AUTOMATIC_MOTION_RECOGNITION_SETTING\u0010þ\u0001\u0012-\n(SET_AUTOMATIC_MOTION_RECOGNITION_SETTING\u0010ÿ\u0001\u00121\n,REQUEST_AUTOMATIC_MOTION_RECOGNITION_SETTING\u0010Ð\u0003\u0012\u0014\n\u000fSYNC_STOCK_INFO\u0010Ñ\u0003\u0012\u0019\n\u0014SYNC_STOCK_INFO_LIST\u0010Ò\u0003\u0012\u0011\n\fDELETE_STOCK\u0010Ó\u0003\u0012\u0013\n\u000eSET_STOCK_LIST\u0010Ô\u0003\u0012\u0013\n\u000eGET_STOCK_LIST\u0010Õ\u0003\u0012\u0011\n\fWEAR_REQUEST\u0010Ö\u0003\u0012\u001c\n\u0017GET_HAVE_MEALS_REMINDER\u0010×\u0003\u0012\u001c\n\u0017SET_HAVE_MEALS_REMINDER\u0010Ø\u0003\u0012$\n\u001fREQUEST_GET_HAVE_MEALS_REMINDER\u0010Ù\u0003\u0012\u001b\n\u0016GET_WASH_HAND_REMINDER\u0010Ú\u0003\u0012\u001b\n\u0016SET_WASH_HAND_REMINDER\u0010Û\u0003\u0012#\n\u001eREQUEST_GET_WASH_HAND_REMINDER\u0010Ü\u0003\u0012$\n\u001fGET_CONTINUOUS_BODY_TEMPERATURE\u0010Ý\u0003\u0012$\n\u001fSET_CONTINUOUS_BODY_TEMPERATURE\u0010Þ\u0003\u0012,\n'REQUEST_GET_CONTINUOUS_BODY_TEMPERATURE\u0010ß\u0003\u0012 \n\u001bGET_CLASSIC_BLUETOOTH_STATE\u0010à\u0003\u0012 \n\u001bSET_CLASSIC_BLUETOOTH_STATE\u0010á\u0003\u0012(\n#REQUEST_GET_CLASSIC_BLUETOOTH_STATE\u0010â\u0003\u0012\u0014\n\u000fGET_SCHOOL_MODE\u0010ã\u0003\u0012\u0014\n\u000fSET_SCHOOL_MODE\u0010ä\u0003\u0012\u001c\n\u0017REQUEST_GET_SCHOOL_MODE\u0010å\u0003\u0012\u001a\n\u0015GET_SCHEDULE_REMINDER\u0010æ\u0003\u0012\u001a\n\u0015SET_SCHEDULE_REMINDER\u0010ç\u0003\u0012\"\n\u001dREQUEST_GET_SCHEDULE_REMINDER\u0010è\u0003\u0012\u0013\n\u000eGET_SLEEP_MODE\u0010é\u0003\u0012\u0013\n\u000eSET_SLEEP_MODE\u0010ê\u0003\u0012\u001b\n\u0016REQUEST_GET_SLEEP_MODE\u0010ë\u0003\u0012\u0016\n\u0011GET_PRESSURE_MODE\u0010ì\u0003\u0012\u0016\n\u0011SET_PRESSURE_MODE\u0010í\u0003\u0012\u001e\n\u0019REQUEST_GET_PRESSURE_MODE\u0010î\u0003\u0012\u001e\n\u0019GET_NOTIFICATION_SETTINGS\u0010ï\u0003\u0012\u001e\n\u0019SET_NOTIFICATION_SETTINGS\u0010ð\u0003\u0012&\n!REQUEST_GET_NOTIFICATION_SETTINGS\u0010ñ\u0003\u0012)\n$GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS\u0010ò\u0003\u0012)\n$SET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS\u0010ó\u0003\u00121\n,REQUEST_GET_CONTINUOUS_BLOOD_OXYGEN_SETTINGS\u0010ô\u0003\u0012\u001b\n\u0016GET_FIND_WEAR_SETTINGS\u0010õ\u0003\u0012\u001b\n\u0016SET_FIND_WEAR_SETTINGS\u0010ö\u0003\u0012#\n\u001eREQUEST_GET_FIND_WEAR_SETTINGS\u0010÷\u0003\u0012\u001b\n\u0016GET_EXAM_DATA_SETTINGS\u0010ø\u0003\u0012\u001b\n\u0016SET_EXAM_DATA_SETTINGS\u0010ù\u0003\u0012#\n\u001eREQUEST_GET_EXAM_DATA_SETTINGS\u0010ú\u0003\u0012\u001f\n\u001aGET_CALL_REMINDER_SETTINGS\u0010û\u0003\u0012\u001f\n\u001aSET_CALL_REMINDER_SETTINGS\u0010ü\u0003\u0012'\n\"REQUEST_GET_CALL_REMINDER_SETTINGS\u0010ý\u0003\u0012 \n\u001bGET_SLEEP_REMINDER_SETTINGS\u0010þ\u0003\u0012 \n\u001bSET_SLEEP_REMINDER_SETTINGS\u0010ÿ\u0003\u0012(\n#REQUEST_GET_SLEEP_REMINDER_SETTINGS\u0010Ð\u0005\u0012\u001c\n\u0017GET_SOUND_LIST_SETTINGS\u0010Ñ\u0005\u0012\u001c\n\u0017SET_SOUND_LIST_SETTINGS\u0010Ò\u0005\u0012$\n\u001fREQUEST_GET_SOUND_LIST_SETTINGS\u0010Ó\u0005\u0012\u001a\n\u0015GET_CUSTOMIZE_SETTING\u0010Ô\u0005\u0012\u001a\n\u0015SET_CUSTOMIZE_SETTING\u0010Õ\u0005\u0012\"\n\u001dREQUEST_GET_CUSTOMIZE_SETTING\u0010Ö\u0005\u0012!\n\u001cGET_VIBRATION_INTENSITY_TIME\u0010×\u0005\u0012!\n\u001cSET_VIBRATION_INTENSITY_TIME\u0010Ø\u0005\u0012)\n$REQUEST_GET_VIBRATION_INTENSITY_TIME\u0010Ù\u0005\u0012&\n!GET_REAL_TIME_HEART_RATE_SETTINGS\u0010Ú\u0005\u0012&\n!SET_REAL_TIME_HEART_RATE_SETTINGS\u0010Û\u0005\u0012.\n)REQUEST_GET_REAL_TIME_HEART_RATE_SETTINGS\u0010Ü\u0005\u0012%\n REPORT_REAL_TIME_HEART_RATE_DATA\u0010Ý\u0005\u0012!\n\u001cGET_BREATHING_LIGHT_SETTINGS\u0010Þ\u0005\u0012!\n\u001cSET_BREATHING_LIGHT_SETTINGS\u0010ß\u0005\u0012)\n$REQUEST_GET_BREATHING_LIGHT_SETTINGS\u0010à\u0005\u0012\u0019\n\u0014GET_QR_CODE_SETTINGS\u0010á\u0005\u0012\u0019\n\u0014SET_QR_CODE_SETTINGS\u0010â\u0005\u0012!\n\u001cREQUEST_GET_QR_CODE_SETTINGS\u0010ã\u0005\u0012\u001a\n\u0015GET_ESIM_EID_SETTINGS\u0010ä\u0005\u0012\u001e\n\u0019SET_ESIM_BIGDATA_SETTINGS\u0010å\u0005\u0012\"\n\u001dGET_ESIM_COMMON_DATA_SETTINGS\u0010æ\u0005\u0012\"\n\u001dSET_ESIM_COMMON_DATA_SETTINGS\u0010ç\u0005\u0012\u0019\n\u0014DELETE_ESIM_SETTINGS\u0010è\u0005\u0012\u0018\n\u0013SEND_ESIM_HTTP_DATA\u0010é\u0005\u0012\u001d\n\u0018REQUEST_GET_EV_DATA_INFO\u0010ê\u0005\u0012\u0015\n\u0010GET_EV_DATA_INFO\u0010ë\u0005\u0012\u0015\n\u0010SET_EV_DATA_INFO\u0010ì\u0005\u0012\u0019\n\u0014GET_EV_REMIND_STATUS\u0010í\u0005\u0012\u0019\n\u0014SET_EV_REMIND_STATUS\u0010î\u0005\u0012\u001a\n\u0015SET_RING_AIRPLANEMODE\u0010ï\u0005\u0012\u0015\n\u0010GET_SPO2_MONITOR\u0010ð\u0005\u0012\u0015\n\u0010SET_SPO2_MONITOR\u0010ñ\u0005\u0012\u0019\n\u0014REQUEST_SPO2_MONITOR\u0010ò\u0005\u0012\u0014\n\u000fGET_HRV_MONITOR\u0010ó\u0005\u0012\u0014\n\u000fSET_HRV_MONITOR\u0010ô\u0005\u0012\u0018\n\u0013REQUEST_HRV_MONITOR\u0010õ\u0005\u0012%\n GET_BREATHING_RELAXATION_MONITOR\u0010ö\u0005\u0012%\n SET_BREATHING_RELAXATION_MONITOR\u0010÷\u0005\u0012)\n$REQUEST_BREATHING_RELAXATION_MONITOR\u0010ø\u0005\u00121\n,DEVICE_REQUEST_BREATHING_RELAXATION_REMINDER\u0010ù\u0005\u0012\u001c\n\u0017GET_HEART_RATE_REMINDER\u0010ú\u0005\u0012\u001c\n\u0017SET_HEART_RATE_REMINDER\u0010û\u0005\u0012$\n\u001fREQUEST_GET_HEART_RATE_REMINDER\u0010ü\u0005\u0012\u0015\n\u0010FILE_INFO_UPDATE\u0010\u0081 \u0012!\n\u001cPHONE_SEND_HEART_RATE_SWITCH\u0010\u0082 \u0012\u001e\n\u0019HEART_RATE_LEAKAGE_UPDATE\u0010\u0083 \u0012'\n\"HEART_RATE_LEAKAGE_RAW_DATE_UPDATE\u0010\u0084 \u0012\u001d\n\u0018PHONE_REQUEST_LOG_UPDATE\u0010\u0085 \u0012\u0018\n\u0013WEAR_SEND_LOG_STATE\u0010\u0086 \u0012&\n!PHONE_SEND_BLUETOOTH_NAME_SETTING\u0010\u0087 \u0012%\n PHONE_GET_BLUETOOTH_NAME_SETTING\u0010\u0088 \u0012*\n%PHONE_SEND_GSENSOR_GEOMAGNETIC_SWITCH\u0010\u0089 \u0012(\n#GSENSOR_GEOMAGNETIC_RAW_DATE_UPDATE\u0010\u008a \u0012\u001f\n\u001aPHONE_SEND_TRIAXIAL_SWITCH\u0010\u008b \u0012\u001d\n\u0018TRIAXIAL_RAW_DATE_UPDATE\u0010\u008c \u0012#\n\u001ePHONE_REQUEST_FILE_INFO_UPDATE\u0010\u008d \u0012&\n!PHONE_REQUEST_UPLOAD_BURIED_FILES\u0010\u008e \u0012\"\n\u001dPHONE_SEND_DEVELOPER_DATA_CMD\u0010\u008f \u0012\u001d\n\u0018WEAR_SEND_DEVELOPER_DATA\u0010\u0090 \u0012\u0015\n\u0010SYNC_INSTRUCTION\u0010\u0081\"B\t\n\u0007payloadB&\n\u0018com.zh.ble.wear.protobufB\nWearProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor(), BindAccountProtos.getDescriptor(), DeviceProtos.getDescriptor(), FitnessProtos.getDescriptor(), LargeFileProtos.getDescriptor(), MicroFunctionProtos.getDescriptor(), SettingMenuProtos.getDescriptor(), MusicProtos.getDescriptor(), NotificationProtos.getDescriptor(), SportingProtos.getDescriptor(), SystemTimeProtos.getDescriptor(), UserProfilesProtos.getDescriptor(), WatchFaceProtos.getDescriptor(), WeatherProtos.getDescriptor(), FactoryProtos.getDescriptor(), AlexaProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SEWear_descriptor = messageType;
        internal_static_SEWear_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"Id", "ChangeMtu", "BindAccount", "Device", "SystemTime", "UserSettings", "WatchFace", "Sporting", "Fitness", "Weasether", "LargeFile", "MicroFunction", "Notification", MusicController.f193292j, "SettingMenu", "Factory", "Aleax", "BleConnectParmeterConfig", "ErrorCode", "Payload"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        BindAccountProtos.getDescriptor();
        DeviceProtos.getDescriptor();
        FitnessProtos.getDescriptor();
        LargeFileProtos.getDescriptor();
        MicroFunctionProtos.getDescriptor();
        SettingMenuProtos.getDescriptor();
        MusicProtos.getDescriptor();
        NotificationProtos.getDescriptor();
        SportingProtos.getDescriptor();
        SystemTimeProtos.getDescriptor();
        UserProfilesProtos.getDescriptor();
        WatchFaceProtos.getDescriptor();
        WeatherProtos.getDescriptor();
        FactoryProtos.getDescriptor();
        AlexaProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
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